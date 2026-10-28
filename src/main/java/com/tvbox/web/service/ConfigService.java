package com.tvbox.web.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tvbox.web.model.ConfigPayload;
import com.tvbox.web.model.SiteDefinition;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ConfigService {

    private static final Logger log = LoggerFactory.getLogger(ConfigService.class);
    private static final Pattern WRAPPED_BASE64_PATTERN = Pattern.compile("[A-Za-z0-9]{8}\\*\\*");
    private static final String PK_SEPARATOR = ";pk;";
    private static final String CLAN_PREFIX = "clan://";
    private static final String GLOBAL_SESSION_KEY = "__global__";
    /** 配置磁盘缓存目录（相对 cacheDir），用于新会话秒开。 */
    private static final String CONFIG_CACHE_DIR = "config-cache";

    private final ObjectMapper objectMapper;
    private final HttpClient httpClient;
    private final okhttp3.OkHttpClient okHttpClient;
    private final AppPathsService appPathsService;
    /** 片源库：数据库里的片源是新的主数据源，用于替代 / 补充 configUrl。 */
    private final SourceService sourceService;
    private final BoundedCache<String, ConfigSessionState> sessionStateMap = new BoundedCache<>(128);
    private volatile String lastConfigUrl;

    private volatile Path cacheDir;

    @Value("${app.cache-dir:.cache/tvbox}")
    private String cacheDirConfig;

    public ConfigService(ObjectMapper objectMapper, AppPathsService appPathsService,
                         SourceService sourceService) {
        this.objectMapper = objectMapper;
        this.appPathsService = appPathsService;
        this.sourceService = sourceService;
        this.httpClient = HttpClientFactory.create(35);
        this.okHttpClient = HttpClientFactory.createOkHttp(35, 60);
    }

    /**
     * 准备缓存目录。
     *
     * <p><b>不让异常冒出去</b>：容器里挂载 volume 后目录可能不存在/不可写
     * （宿主机目录属主是 root，进程以非 root 运行），
     * 而 {@code @PostConstruct} 抛异常会让 Spring 判定 Bean 创建失败、整个应用起不来。
     * 这里改为「回退到临时目录 + 明确报错」，保证应用仍能启动、日志能看懂问题。
     */
    @PostConstruct
    public void init() {
        try {
            Path configured = Paths.get(cacheDirConfig);
            Path dir = configured.isAbsolute()
                    ? configured.normalize()
                    : appPathsService.resolveFromBase(cacheDirConfig);
            Files.createDirectories(dir);
            this.cacheDir = dir;
            log.info("[CONFIG] 缓存目录: {}", dir);
        } catch (Exception ex) {
            Path fallback = Paths.get(System.getProperty("java.io.tmpdir"), "playhub-cache")
                    .toAbsolutePath();
            log.error("[CONFIG] 缓存目录 {} 不可用: {}；回退到 {}（重启后缓存/片源选择会丢失，"
                    + "请检查挂载目录的属主与权限）", cacheDirConfig, ex.getMessage(), fallback);
            try {
                Files.createDirectories(fallback);
            } catch (IOException ignore) {
                // 临时目录也失败时保持 fallback 路径，后续写入会继续报错但不影响启动
            }
            this.cacheDir = fallback;
        }
    }

    public synchronized ConfigPayload loadConfig(String rawUrl) {
        return loadConfig(null, rawUrl);
    }

    public synchronized ConfigPayload loadConfig(String sessionId, String rawUrl) {
        long t0 = System.currentTimeMillis();
        DiagLog.step(log, "CFG loadConfig 开始  url=" + rawUrl);
        lastConfigUrl = rawUrl;
        ResolvedConfigTarget target = resolveConfigTarget(rawUrl);

        // 1) 磁盘缓存快速路径：有缓存立即返回（秒开），同时后台异步刷新，
        //    避免每次新会话都要等配置站点响应（部分源站要十几秒甚至偶发超时）。
        String cachedText = readDiskCache(rawUrl);
        if (StringUtils.hasText(cachedText)) {
            try {
                ConfigPayload parsed = parseAndStore(sessionId, cachedText, target);
                DiagLog.step(log, "CFG 命中磁盘缓存  sites="
                        + (parsed.getSites() != null ? parsed.getSites().size() : 0), t0);
                refreshDiskCacheAsync(target, rawUrl);
                return parsed;
            } catch (Exception cacheError) {
                log.warn("[CONFIG] 磁盘缓存不可用，改为联网拉取: {}", cacheError.getMessage());
                deleteDiskCache(rawUrl);
            }
        }

        // 2) 无缓存（或缓存损坏）：联网拉取
        DiagLog.step(log, "CFG resolveConfigTarget 完成  fetchUrl=" + target.fetchUrl(), t0);
        String text = fetchText(target.fetchUrl());
        DiagLog.step(log, "CFG fetchText 返回  textLen=" + (text != null ? text.length() : 0), t0);
        text = decodeWrappedIfNeeded(text, target.configKey());
        DiagLog.step(log, "CFG decodeWrappedIfNeeded 完成  textLen=" + (text != null ? text.length() : 0), t0);
        text = fixContentPath(target.fetchUrl(), text);
        DiagLog.step(log, "CFG fixContentPath 完成", t0);
        writeDiskCache(rawUrl, text);
        DiagLog.step(log, "CFG 已写入磁盘缓存", t0);
        return parseAndStore(sessionId, text, target);
    }

    /** 解析配置文本并写入该会话状态（站点 uid 分配 + 多键索引）。 */
    private ConfigPayload parseAndStore(String sessionId, String text, ResolvedConfigTarget target) {
        long t0 = System.currentTimeMillis();
        try {
            DiagLog.step(log, "CFG 开始 objectMapper.readValue 解析JSON...");
            ConfigPayload parsed = objectMapper.readValue(text, ConfigPayload.class);
            DiagLog.step(log, "CFG JSON解析完成  sites=" + (parsed.getSites() != null ? parsed.getSites().size() : 0)
                    + " parses=" + (parsed.getParses() != null ? parsed.getParses().size() : 0)
                    + " lives=" + (parsed.getLives() != null ? parsed.getLives().size() : 0), t0);
            ConfigSessionState state = stateFor(sessionId);
            applySites(state, parsed.getSites(), true);
            state.payload = parsed;
            state.configUrl = target.originalUrl();
            DiagLog.step(log, "CFG loadConfig 完成 siteMapSize=" + state.siteMap.size(), t0);
            return parsed;
        } catch (Exception ex) {
            throw new IllegalStateException("配置解析失败: " + ex.getMessage(), ex);
        }
    }

    // ---------------------------------------------------------------- 磁盘缓存

    private Path diskCachePath(String rawUrl) {
        return cacheDir.resolve(CONFIG_CACHE_DIR).resolve(md5Hex(rawUrl) + ".json");
    }

    private String readDiskCache(String rawUrl) {
        try {
            Path path = diskCachePath(rawUrl);
            if (Files.exists(path) && Files.size(path) > 0) {
                return Files.readString(path, StandardCharsets.UTF_8);
            }
        } catch (Exception ex) {
            log.debug("[CONFIG] 读取配置缓存失败: {}", ex.getMessage());
        }
        return null;
    }

    private void writeDiskCache(String rawUrl, String text) {
        if (!StringUtils.hasText(text)) {
            return;
        }
        try {
            Path path = diskCachePath(rawUrl);
            Files.createDirectories(path.getParent());
            Path temp = Files.createTempFile(path.getParent(), "cfg-", ".json");
            Files.writeString(temp, text, StandardCharsets.UTF_8);
            Files.move(temp, path, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception ex) {
            log.debug("[CONFIG] 写入配置缓存失败: {}", ex.getMessage());
        }
    }

    private void deleteDiskCache(String rawUrl) {
        try {
            Files.deleteIfExists(diskCachePath(rawUrl));
        } catch (Exception ignore) {
        }
    }

    /**
     * 后台刷新磁盘缓存：只更新缓存文件，不改动当前会话状态，
     * 这样用户正在浏览的站点列表不会被中途替换，下次加载即用最新配置。
     */
    private void refreshDiskCacheAsync(ResolvedConfigTarget target, String rawUrl) {
        java.util.concurrent.CompletableFuture.runAsync(() -> {
            try {
                String fresh = fetchText(target.fetchUrl());
                fresh = decodeWrappedIfNeeded(fresh, target.configKey());
                fresh = fixContentPath(target.fetchUrl(), fresh);
                String cached = readDiskCache(rawUrl);
                if (!fresh.equals(cached)) {
                    writeDiskCache(rawUrl, fresh);
                    log.info("[CONFIG] 后台刷新配置缓存成功 url={}", rawUrl);
                }
            } catch (Exception ex) {
                log.debug("[CONFIG] 后台刷新配置缓存失败: {}", ex.getMessage());
            }
        });
    }

    private String md5Hex(String text) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hash = digest.digest((text == null ? "" : text).getBytes(StandardCharsets.UTF_8));
            StringBuilder builder = new StringBuilder(hash.length * 2);
            for (byte b : hash) {
                builder.append(Character.forDigit((b >>> 4) & 0xF, 16));
                builder.append(Character.forDigit(b & 0xF, 16));
            }
            return builder.toString();
        } catch (Exception ex) {
            return Integer.toHexString(String.valueOf(text).hashCode());
        }
    }

    /**
     * 把站点列表装进会话状态，并建立 uid / key / api / name 四套索引。
     *
     * @param assignIndexUid true 表示按顺序重排 uid（s0、s1…，来自 configUrl）；
     *                       false 表示沿用片源库里稳定的 uid（重复导入 / 重启都不变）
     */
    private void applySites(ConfigSessionState state, List<SiteDefinition> sites, boolean assignIndexUid) {
        state.siteMap.clear();
        if (sites == null) {
            return;
        }
        int index = 0;
        for (SiteDefinition site : sites) {
            if (assignIndexUid) {
                site.setUid("s" + index);
            }
            index++;
            String uid = site.getUid();
            if (uid == null || uid.isBlank()) {
                continue;
            }
            state.siteMap.put(uid, site);
            if (StringUtils.hasText(site.getKey()) && !state.siteMap.containsKey(site.getKey())) {
                state.siteMap.put(site.getKey(), site);
            }
            if (StringUtils.hasText(site.getApi()) && !state.siteMap.containsKey(site.getApi())) {
                state.siteMap.put(site.getApi(), site);
            }
            if (StringUtils.hasText(site.getName()) && !state.siteMap.containsKey(site.getName())) {
                state.siteMap.put(site.getName(), site);
            }
        }
    }

    /**
     * 用数据库片源库构建配置。
     *
     * <p>片源库是新的主数据源：只要管理员导入过片源，就不再需要 configUrl。
     * 构建失败或无片源时返回 null，由调用方回退到原来的 URL 加载方式。
     */
    private ConfigPayload loadFromSources(String sessionId) {
        if (sourceService == null) {
            return null;
        }
        try {
            List<SiteDefinition> sites = sourceService.buildSites();
            if (sites.isEmpty()) {
                return null;
            }
            ConfigPayload payload = new ConfigPayload();
            payload.setSites(sites);
            ConfigSessionState state = stateFor(sessionId);
            applySites(state, sites, false);
            state.payload = payload;
            state.configUrl = "db://sources";
            DiagLog.step(log, "CFG 已从片源库构建配置 sites=" + sites.size());
            return payload;
        } catch (Exception ex) {
            log.warn("[CONFIG] 从片源库构建配置失败: {}", ex.getMessage());
            return null;
        }
    }

    public ConfigPayload getPayload() {
        return getPayload(null);
    }

    public ConfigPayload getPayload(String sessionId) {
        ConfigPayload payload = stateFor(sessionId).payload;
        if (payload == null) {
            // 优先用数据库片源库（管理员导入的全局片源）
            payload = loadFromSources(sessionId);
        }
        if (payload == null && lastConfigUrl != null) {
            log.info("[CONFIG] Auto-reloading config for session {} from {}", sessionId, lastConfigUrl);
            try {
                payload = loadConfig(sessionId, lastConfigUrl);
            } catch (Exception e) {
                log.warn("[CONFIG] Auto-reload failed: {}", e.getMessage());
            }
        }
        return payload;
    }

    public String getConfigUrl() {
        return getConfigUrl(null);
    }

    public String getConfigUrl(String sessionId) {
        return stateFor(sessionId).configUrl;
    }

    public Optional<SiteDefinition> getSite(String key) {
        return getSite(null, key);
    }

    public Optional<SiteDefinition> getSite(String sessionId, String key) {
        return Optional.ofNullable(stateFor(sessionId).siteMap.get(key));
    }

    /** 片源库变更后清掉所有会话缓存的配置，让新片源立即生效。 */
    public void invalidateAllSessionPayloads() {
        try {
            sessionStateMap.clear();
            log.info("[CONFIG] 已清理全部会话的配置缓存（片源库变更）");
        } catch (Exception ex) {
            log.warn("[CONFIG] 清理配置缓存失败: {}", ex.getMessage());
        }
    }

    public Path getCacheDir() {
        return cacheDir;
    }

    public Map<String, Object> summary() {
        return summary(null);
    }

    public Map<String, Object> summary(String sessionId) {
        ConfigSessionState current = stateFor(sessionId);
        Map<String, Object> res = new LinkedHashMap<>();
        res.put("loaded", current.payload != null);
        res.put("url", current.configUrl);
        if (current.payload == null) {
            res.put("sites", 0);
            res.put("parses", 0);
            res.put("flags", 0);
            return res;
        }
        res.put("sites", current.payload.getSites() == null ? 0 : current.payload.getSites().size());
        res.put("parses", current.payload.getParses() == null ? 0 : current.payload.getParses().size());
        res.put("flags", current.payload.getFlags() == null ? 0 : current.payload.getFlags().size());
        return res;
    }

    private ConfigSessionState stateFor(String sessionId) {
        return sessionStateMap.computeIfAbsent(normalizeSessionId(sessionId), key -> new ConfigSessionState());
    }

    private String normalizeSessionId(String sessionId) {
        return StringUtils.hasText(sessionId) ? sessionId.trim() : GLOBAL_SESSION_KEY;
    }

    private String fetchText(String url) {
        // 部分免费配置站点响应很慢，且其前置的 Cloudflare 会拒绝 JDK 原生
        // HttpClient 的 TLS 握手。这里优先用 OkHttp，失败再回退 HttpClient，
        // 并对瞬时失败重试一次。
        Exception lastError = null;
        for (int attempt = 1; attempt <= 2; attempt++) {
            try {
                String body = fetchWithOkHttp(url);
                if (body != null && !body.isEmpty()) {
                    return body;
                }
            } catch (IllegalStateException statusError) {
                throw statusError;
            } catch (Exception okHttpError) {
                lastError = okHttpError;
                DiagLog.step(log, "CFG OkHttp 第 " + attempt + " 次失败: " + okHttpError.getMessage());
            }
            try {
                HttpRequest request = HttpRequest.newBuilder(URI.create(url))
                        .header("User-Agent", "okhttp/3.15")
                        .header("Accept", "application/json,text/plain,*/*")
                        .timeout(Duration.ofSeconds(60))
                        .GET()
                        .build();
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
                if (response.statusCode() >= 200 && response.statusCode() < 300) {
                    return response.body();
                }
                throw new IllegalStateException("拉取配置失败: status=" + response.statusCode());
            } catch (IllegalStateException statusError) {
                throw statusError;
            } catch (Exception ex) {
                lastError = ex;
                DiagLog.step(log, "CFG HttpClient 第 " + attempt + " 次失败: " + ex.getMessage());
            }
            if (attempt < 2) {
                try {
                    Thread.sleep(800);
                } catch (InterruptedException interrupted) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
        throw new IllegalStateException("拉取配置失败: " + (lastError == null ? "unknown" : lastError.getMessage()), lastError);
    }

    /** 用 OkHttp 拉取文本；非 2xx 抛 IllegalStateException（不重试）。 */
    private String fetchWithOkHttp(String url) throws Exception {
        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(url)
                .header("User-Agent", "okhttp/3.15")
                .header("Accept", "application/json,text/plain,*/*")
                .build();
        try (okhttp3.Response response = okHttpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IllegalStateException("拉取配置失败: status=" + response.code());
            }
            return response.body() == null ? "" : response.body().string();
        }
    }

    private ResolvedConfigTarget resolveConfigTarget(String rawUrl) {
        if (!StringUtils.hasText(rawUrl)) {
            throw new IllegalArgumentException("配置地址不能为空");
        }
        String original = rawUrl.trim();
        String configUrl = original;
        String configKey = null;

        if (configUrl.contains(PK_SEPARATOR)) {
            String[] parts = configUrl.split(Pattern.quote(PK_SEPARATOR), 2);
            configUrl = parts[0];
            configKey = parts.length > 1 ? parts[1].trim() : null;
        }

        String fetchUrl = normalizeHttpLikeUrl(configUrl);
        if (fetchUrl.startsWith(CLAN_PREFIX)) {
            fetchUrl = clanToAddress(fetchUrl);
        }
        return new ResolvedConfigTarget(original, fetchUrl, configKey);
    }

    private String normalizeHttpLikeUrl(String rawUrl) {
        String url = rawUrl.trim();
        if (url.startsWith("http://") || url.startsWith("https://") || url.startsWith(CLAN_PREFIX)) {
            return url;
        }
        return "http://" + url;
    }

    private String decodeWrappedIfNeeded(String content, String configKey) {
        if (content == null) {
            return "";
        }
        String trimmed = content.trim();
        if (isJson(trimmed)) {
            return trimmed;
        }

        Matcher matcher = WRAPPED_BASE64_PATTERN.matcher(trimmed);
        if (matcher.find()) {
            String encoded = trimmed.substring(trimmed.indexOf(matcher.group()) + 10);
            try {
                String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
                if (isJson(decoded)) {
                    return decoded;
                }
                trimmed = decoded.trim();
            } catch (Exception ignore) {
                return trimmed;
            }
        }

        try {
            if (trimmed.startsWith("2423")) {
                String data = trimmed.substring(trimmed.indexOf("2324") + 4, trimmed.length() - 26);
                String lowerHex = new String(toBytes(trimmed), StandardCharsets.UTF_8).toLowerCase();
                String key = rightPad(extractBetween(lowerHex, "$#", "#$"), '0', 16);
                String iv = rightPad(lowerHex.substring(Math.max(0, lowerHex.length() - 13)), '0', 16);
                String decoded = decrypt("AES/CBC/PKCS5Padding", data, key, iv);
                if (isJson(decoded)) {
                    return decoded;
                }
            } else if (StringUtils.hasText(configKey)) {
                String decoded = decrypt("AES/ECB/PKCS5Padding", trimmed, rightPad(configKey, '0', 16), null);
                if (isJson(decoded)) {
                    return decoded;
                }
            }
        } catch (Exception ignore) {
        }

        return trimmed;
    }

    private String fixContentPath(String url, String content) {
        if (content == null) {
            return "";
        }
        if (url.startsWith(CLAN_PREFIX)) {
            content = clanContentFix(clanToAddress(url), content);
        }
        if (!content.contains("\"./")) {
            return content;
        }
        String base = url.substring(0, url.lastIndexOf('/') + 1);
        return content.replace("./", base);
    }

    private String clanToAddress(String clanUrl) {
        if (clanUrl.startsWith("clan://localhost/")) {
            return clanUrl.replace("clan://localhost/", "http://127.0.0.1:9978/file/");
        }
        String link = clanUrl.substring(CLAN_PREFIX.length());
        int end = link.indexOf('/');
        if (end < 0) {
            throw new IllegalArgumentException("无效的 clan 配置地址: " + clanUrl);
        }
        return "http://" + link.substring(0, end) + "/file/" + link.substring(end + 1);
    }

    private String clanContentFix(String resolvedClanUrl, String content) {
        int fileIndex = resolvedClanUrl.indexOf("/file/");
        if (fileIndex < 0) {
            return content;
        }
        String prefix = resolvedClanUrl.substring(0, fileIndex + 6);
        return content.replace(CLAN_PREFIX, prefix);
    }

    private boolean isJson(String value) {
        if (!StringUtils.hasText(value)) {
            return false;
        }
        try {
            objectMapper.readTree(value);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    private String extractBetween(String content, String left, String right) {
        int leftIndex = content.indexOf(left);
        int rightIndex = content.indexOf(right);
        if (leftIndex < 0 || rightIndex < 0 || rightIndex <= leftIndex + left.length()) {
            return "";
        }
        return content.substring(leftIndex + left.length(), rightIndex);
    }

    private String rightPad(String text, char ch, int length) {
        String value = text == null ? "" : text.trim();
        if (value.length() >= length) {
            return value.substring(0, length);
        }
        StringBuilder builder = new StringBuilder(value);
        while (builder.length() < length) {
            builder.append(ch);
        }
        return builder.toString();
    }

    private byte[] toBytes(String src) {
        int len = src.length() / 2;
        byte[] out = new byte[len];
        for (int i = 0; i < len; i++) {
            out[i] = (byte) Integer.parseInt(src.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }

    private String decrypt(String transformation, String data, String key, String iv) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance(transformation);
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES");
        if (iv == null) {
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
        } else {
            cipher.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8)));
        }
        return new String(cipher.doFinal(toBytes(data)), StandardCharsets.UTF_8);
    }

    private record ResolvedConfigTarget(String originalUrl, String fetchUrl, String configKey) {
    }

    private static final class ConfigSessionState {
        private final Map<String, SiteDefinition> siteMap = new ConcurrentHashMap<>();
        private volatile ConfigPayload payload;
        private volatile String configUrl;
    }
}
