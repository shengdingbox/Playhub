package com.tvbox.web.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 网盘凭据、扫码登录、本人盘浏览与播放服务。
 *
 * <p>协议来源为 Win-box：夸克/UC 共用 CAS 扫码流程，百度走 Passport；
 * 本人盘浏览使用网页版 API，播放返回上游原始签名 URL 以及取流所需请求头。
 * 115 当前支持手动绑定/解绑，扫码、浏览与播放会明确返回 {@code UNSUPPORTED}。
 *
 * <p>凭据持久化在 SQLite {@code drive_tokens}；扫码会话仅保存在内存，10 分钟过期。
 * 日志不记录 token、Cookie、二维码会话参数或签名播放地址。
 */
@Service
public class DriveService {

    private static final Logger log = LoggerFactory.getLogger(DriveService.class);

    private static final List<String> PROVIDERS = List.of("quark", "uc", "baidu", "115");
    private static final Map<String, String> LABELS = Map.of(
            "quark", "夸克网盘", "uc", "UC 网盘", "baidu", "百度网盘", "115", "115 网盘");
    private static final long QR_TTL_MS = 10 * 60_000L;
    private static final int MAX_QR_SESSIONS = 128;
    private static final int MAX_TOKEN_LENGTH = 32_768;
    private static final MediaType JSON_MEDIA_TYPE = MediaType.get("application/json; charset=utf-8");

    private static final String CAS_UA = "Mozilla/5.0 (Windows NT 10.0; WOW64) "
            + "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.81 Safari/537.36 SE 2.X MetaSr 1.0";
    private static final String QUARK_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) "
            + "AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/2.5.20 "
            + "Chrome/100.0.4896.160 Electron/18.3.5.4-b478491100 Safari/537.36 Channel/pckk_other_ch";
    private static final String UC_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) "
            + "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.6478.61 Safari/537.36";
    private static final String BAIDU_UA = UC_UA;
    /** 百度 dlink 按 UA 防盗链，浏览器 UA 会返回 403/31326。 */
    private static final String BAIDU_DOWNLOAD_UA = "netdisk;P2SP;3.0.0;windows;;;";

    private static final String QUARK_BASE = "https://drive-pc.quark.cn/1/clouddrive";
    private static final String UC_BASE = "https://pc-api.uc.cn/1/clouddrive";
    private static final String QUARK_REFERER = "https://pan.quark.cn/";
    private static final String UC_REFERER = "https://drive.uc.cn/";
    private static final String BAIDU_REFERER = "https://pan.baidu.com/";

    private final DatabaseService db;
    private final ObjectMapper objectMapper;
    private final OkHttpClient client;
    private final OkHttpClient noRedirectClient;
    private final Map<String, QrSession> qrSessions = new ConcurrentHashMap<>();

    public DriveService(DatabaseService db, ObjectMapper objectMapper) {
        this.db = db;
        this.objectMapper = objectMapper;
        this.client = HttpClientFactory.createOkHttp(8, 20);
        this.noRedirectClient = this.client.newBuilder()
                .followRedirects(false)
                .followSslRedirects(false)
                .build();
    }

    // ---------------------------------------------------------------- 凭据持久化

    /** 与 Win-box drives.get 一致：返回 provider -> 明文凭据，供现有绑定面板判断及注入播放请求。 */
    public Map<String, String> list() {
        Map<String, String> found = new LinkedHashMap<>();
        try (Connection conn = db.open();
             PreparedStatement ps = conn.prepareStatement("SELECT provider, token FROM drive_tokens");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String provider = rs.getString("provider");
                String token = rs.getString("token");
                if (PROVIDERS.contains(provider) && token != null && !token.isBlank()) {
                    found.put(provider, token);
                }
            }
        } catch (SQLException ex) {
            throw storageError(ex);
        }
        Map<String, String> ordered = new LinkedHashMap<>();
        for (String provider : PROVIDERS) {
            if (found.containsKey(provider)) {
                ordered.put(provider, found.get(provider));
            }
        }
        return ordered;
    }

    public void set(String provider, String token) {
        String p = normalizeProvider(provider);
        String value = normalizeToken(token);
        String sql = """
                INSERT INTO drive_tokens(provider, token, updated_at) VALUES (?, ?, ?)
                ON CONFLICT(provider) DO UPDATE SET token = excluded.token, updated_at = excluded.updated_at
                """;
        synchronized (db.writeLock()) {
            try (Connection conn = db.open(); PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, p);
                ps.setString(2, value);
                ps.setLong(3, System.currentTimeMillis());
                ps.executeUpdate();
            } catch (SQLException ex) {
                throw storageError(ex);
            }
        }
    }

    public void remove(String provider) {
        String p = normalizeProvider(provider);
        synchronized (db.writeLock()) {
            try (Connection conn = db.open();
                 PreparedStatement ps = conn.prepareStatement("DELETE FROM drive_tokens WHERE provider = ?")) {
                ps.setString(1, p);
                ps.executeUpdate();
            } catch (SQLException ex) {
                throw storageError(ex);
            }
        }
    }

    private String requireToken(String provider) {
        String p = normalizeProvider(provider);
        try (Connection conn = db.open();
             PreparedStatement ps = conn.prepareStatement("SELECT token FROM drive_tokens WHERE provider = ?")) {
            ps.setString(1, p);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String token = rs.getString(1);
                    if (token != null && !token.isBlank()) {
                        return token;
                    }
                }
            }
        } catch (SQLException ex) {
            throw storageError(ex);
        }
        throw new DriveException("NOT_BOUND", LABELS.get(p) + "尚未绑定，请先保存 Cookie 或扫码登录");
    }

    // ---------------------------------------------------------------- 扫码登录

    public Map<String, Object> qrCreate(String provider) {
        String p = provider == null || provider.isBlank() ? "quark" : normalizeProvider(provider);
        return switch (p) {
            case "quark" -> casQrCreate(CasConfig.QUARK);
            case "uc" -> casQrCreate(CasConfig.UC);
            case "baidu" -> baiduQrCreate();
            case "115" -> throw new DriveException("QR_UNSUPPORTED", "115 扫码登录暂未接入，请使用手动 Cookie 绑定");
            default -> throw new IllegalArgumentException("不支持的网盘 provider: " + p);
        };
    }

    public Map<String, Object> qrPoll(String provider, String sid) {
        String p = normalizeProvider(provider);
        if (sid == null || sid.isBlank()) {
            throw new IllegalArgumentException("缺少参数 sid");
        }
        QrSession session = qrSessions.get(sid.trim());
        if (session == null || !session.provider().equals(p)) {
            return qrExpired("二维码会话不存在或已过期，请重新生成");
        }
        if (System.currentTimeMillis() - session.createdAt() > QR_TTL_MS) {
            qrSessions.remove(sid.trim());
            return qrExpired("二维码已过期，请重新生成");
        }
        return switch (p) {
            case "quark" -> casQrPoll(CasConfig.QUARK, sid.trim(), session);
            case "uc" -> casQrPoll(CasConfig.UC, sid.trim(), session);
            case "baidu" -> baiduQrPoll(sid.trim(), session);
            case "115" -> throw new DriveException("QR_UNSUPPORTED", "115 扫码登录暂未接入，请使用手动 Cookie 绑定");
            default -> throw new IllegalArgumentException("不支持的网盘 provider: " + p);
        };
    }

    private Map<String, Object> casQrCreate(CasConfig cfg) {
        String url = url(cfg.casBase() + "/getTokenForQrcodeLogin",
                params("client_id", cfg.clientId(), "v", cfg.version()));
        HttpResult response = execute(request(url, cfg.userAgent(), cfg.referer(), "").get().build());
        JsonNode root = json(response);
        String token = text(root.at("/data/members/token"));
        if (token.isEmpty()) {
            throw new DriveException("UPSTREAM", LABELS.get(cfg.provider()) + "二维码生成失败：CAS 未返回 token");
        }
        String content = cfg.qrTemplate()
                .replace("{token}", encode(token))
                .replace("{clientId}", encode(cfg.clientId()));
        String cookie = mergeCookies("", response.setCookies());
        QrSession session = new QrSession(cfg.provider(), token, "", "", cookie, System.currentTimeMillis());
        String sid = saveSession(session);
        Map<String, Object> result = qrCreateResult(cfg.provider(), content, sid);
        log.info("[drive] {} 扫码会话已创建", cfg.provider());
        return result;
    }

    private Map<String, Object> casQrPoll(CasConfig cfg, String sid, QrSession session) {
        String url = url(cfg.casBase() + "/getServiceTicketByQrcodeToken",
                params("client_id", cfg.clientId(), "v", cfg.version(), "token", session.token()));
        HttpResult response = execute(request(url, cfg.userAgent(), cfg.referer(), session.cookie()).get().build());
        JsonNode root = json(response);
        long status = root.path("status").asLong(0);
        if (status == 50_004_002L) {
            qrSessions.remove(sid);
            return qrExpired("二维码已过期，请刷新");
        }
        if (status != 2_000_000L) {
            return qrPending(0, "等待扫码");
        }
        String ticket = text(root.at("/data/members/service_ticket"));
        if (ticket.isEmpty()) {
            return qrError("登录成功但未取到票据，请重试");
        }
        String cookie = fetchCasCookie(cfg, ticket, session.cookie());
        if (cookie.isBlank()) {
            return qrError("登录成功但未获取到 Cookie，请重试");
        }
        return qrSuccess(cfg.provider(), sid, cookie);
    }

    /** service_ticket → account/info → 云盘 API，逐步累积 Set-Cookie。 */
    private String fetchCasCookie(CasConfig cfg, String ticket, String initialCookie) {
        String accountUrl = url(cfg.accountInfo(), params("st", ticket, "fr", "pc", "platform", "pc"));
        HttpResult account = execute(request(accountUrl, cfg.userAgent(), cfg.referer(), initialCookie).get().build());
        json(account);
        String cookie = mergeCookies(initialCookie, account.setCookies());

        String cloudUrl = url(cfg.cloudApi(), cfg.cloudQuery());
        Request.Builder builder = request(cloudUrl, cfg.userAgent(), cfg.referer(), cookie);
        if (cfg.cloudPost()) {
            builder.post(RequestBody.create("{}", JSON_MEDIA_TYPE));
        } else {
            builder.get();
        }
        HttpResult cloud = execute(builder.build());
        json(cloud);
        return mergeCookies(cookie, cloud.setCookies());
    }

    private Map<String, Object> baiduQrCreate() {
        String gid = UUID.randomUUID().toString().toUpperCase(Locale.ROOT);
        long now = System.currentTimeMillis();
        String url = url("https://passport.baidu.com/v2/api/getqrcode", params(
                "lp", "pc", "qrloginfrom", "pc", "gid", gid, "apiver", "v3",
                "tt", String.valueOf(now), "tpl", "netdisk", "loginVersion", "v5",
                "qrcode", "1", "return_type", "5", "u", BAIDU_REFERER + "disk/main#/index?category=all"));
        HttpResult response = execute(request(url, BAIDU_UA, BAIDU_REFERER, "").get().build());
        JsonNode root = jsonp(response);
        String sign = text(root.get("sign"));
        String image = text(root.get("imgurl"));
        if (root.path("errno").asInt(-1) != 0 || sign.isEmpty() || image.isEmpty()) {
            throw new DriveException("UPSTREAM", "百度二维码生成失败：Passport 返回异常");
        }
        String imageUrl = image.replaceFirst("^https?://", "").replaceFirst("^//", "");
        imageUrl = "https://" + imageUrl;
        String imageDataUrl = fetchBaiduQrImage(imageUrl);

        QrSession session = new QrSession("baidu", "", sign, gid, "", System.currentTimeMillis());
        String sid = saveSession(session);
        Map<String, Object> result = qrCreateResult("baidu", imageUrl, sid);
        result.put("imageDataUrl", imageDataUrl);
        log.info("[drive] baidu 扫码会话已创建");
        return result;
    }

    private String fetchBaiduQrImage(String imageUrl) {
        Request req = request(imageUrl, BAIDU_UA, BAIDU_REFERER, "").get().build();
        try (Response response = client.newCall(req).execute()) {
            if (!response.isSuccessful()) {
                throw new DriveException("UPSTREAM", "百度二维码图片获取失败（HTTP " + response.code() + "）");
            }
            ResponseBody body = response.body();
            byte[] bytes = body == null ? new byte[0] : body.bytes();
            if (bytes.length == 0 || bytes.length > 2 * 1024 * 1024) {
                throw new DriveException("UPSTREAM", "百度二维码图片为空或大小异常");
            }
            return "data:image/png;base64," + Base64.getEncoder().encodeToString(bytes);
        } catch (IOException ex) {
            throw upstreamError(ex);
        }
    }

    private Map<String, Object> baiduQrPoll(String sid, QrSession session) {
        long now = System.currentTimeMillis();
        String url = url("https://passport.baidu.com/channel/unicast", params(
                "channel_id", session.sign(), "gid", session.gid(), "tpl", "netdisk",
                "apiver", "v3", "tt", String.valueOf(now), "_", String.valueOf(now)));
        HttpResult response = execute(request(url, BAIDU_UA, BAIDU_REFERER, "").get().build());
        JsonNode root = jsonp(response);
        int errno = root.path("errno").asInt(-1);
        if (errno == 1) {
            return qrPending(0, "等待扫码");
        }
        if (errno == 2) {
            qrSessions.remove(sid);
            return qrExpired("二维码已失效，请刷新");
        }
        if (errno != 0) {
            return qrPending(0, "等待百度登录状态更新");
        }
        JsonNode channel = root.get("channel_v");
        if (channel != null && channel.isTextual()) {
            channel = readJsonpQuiet(channel.asText());
        }
        if (channel == null || !channel.isObject()) {
            return qrPending(0, "等待扫码");
        }
        String ticket = text(channel.get("v"));
        if (ticket.isEmpty()) {
            return qrPending(0, "等待扫码");
        }
        if (channel.path("status").asInt(-1) != 0) {
            return qrPending(10, "扫描成功，请在手机上确认登录");
        }
        String cookie = fetchBaiduCookie(ticket);
        if (cookie.isBlank()) {
            return qrError("登录成功但未获取到 Cookie，请重试");
        }
        return qrSuccess("baidu", sid, cookie);
    }

    /** 此请求必须保留 302 响应的 Set-Cookie，不能跟随重定向。 */
    private String fetchBaiduCookie(String ticket) {
        long now = System.currentTimeMillis();
        String url = url("https://passport.baidu.com/v3/login/main/qrbdusslogin", params(
                "v", String.valueOf(now), "bduss", ticket,
                "u", BAIDU_REFERER + "disk/main#/index?category=all",
                "loginVersion", "v5", "qrcode", "1", "tpl", "netdisk", "apiver", "v3",
                "tt", String.valueOf(now), "time", String.valueOf(now / 1000), "alg", "v3",
                "elapsed", "0", "shaOne", "", "sig", "", "rinfo", "{}"));
        HttpResult response = execute(noRedirectClient,
                request(url, BAIDU_UA, BAIDU_REFERER, "").get().build());
        if (response.status() < 200 || response.status() >= 400) {
            throw new DriveException("UPSTREAM", "百度登录票据兑换失败（HTTP " + response.status() + "）");
        }
        return mergeCookies("", response.setCookies());
    }

    private String saveSession(QrSession session) {
        long now = System.currentTimeMillis();
        qrSessions.entrySet().removeIf(e -> now - e.getValue().createdAt() > QR_TTL_MS);
        if (qrSessions.size() >= MAX_QR_SESSIONS) {
            qrSessions.entrySet().stream()
                    .min(Comparator.comparingLong(e -> e.getValue().createdAt()))
                    .ifPresent(e -> qrSessions.remove(e.getKey()));
        }
        String sid = UUID.randomUUID().toString();
        qrSessions.put(sid, session);
        return sid;
    }

    private Map<String, Object> qrCreateResult(String provider, String content, String sid) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("provider", provider);
        result.put("content", content);
        result.put("url", content);
        result.put("sid", sid);
        return result;
    }

    private Map<String, Object> qrSuccess(String provider, String sid, String token) {
        set(provider, token);
        qrSessions.remove(sid);
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("state", 20);
        result.put("status", "success");
        result.put("token", token);
        result.put("tokenKind", "cookie");
        log.info("[drive] {} 扫码登录成功，凭据已保存", provider);
        return result;
    }

    private static Map<String, Object> qrPending(int state, String hint) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("state", state);
        result.put("status", "pending");
        result.put("hint", hint);
        return result;
    }

    private static Map<String, Object> qrExpired(String hint) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("state", 30);
        result.put("status", "expired");
        result.put("hint", hint);
        return result;
    }

    private static Map<String, Object> qrError(String hint) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("state", -1);
        result.put("status", "error");
        result.put("hint", hint);
        return result;
    }

    // ---------------------------------------------------------------- 目录浏览

    public Map<String, Object> browse(String provider, String path, Integer page, Integer size) {
        String p = normalizeProvider(provider);
        int pageNumber = page == null ? 1 : page;
        int pageSize = size == null ? 50 : size;
        if (pageNumber < 1 || pageSize < 1 || pageSize > 200) {
            throw new IllegalArgumentException("page 需 >= 1，size 需在 1~200 之间");
        }
        String token = requireToken(p);
        return switch (p) {
            case "quark", "uc" -> browseQuarkUc(p, token, path, pageNumber, pageSize);
            case "baidu" -> browseBaidu(token, path, pageNumber, pageSize);
            case "115" -> throw new DriveException("UNSUPPORTED", "115 目录浏览暂未接入，当前仅支持凭据绑定");
            default -> throw new IllegalArgumentException("不支持的网盘 provider: " + p);
        };
    }

    private Map<String, Object> browseQuarkUc(String provider, String cookie, String path, int page, int size) {
        boolean quark = "quark".equals(provider);
        String base = quark ? QUARK_BASE : UC_BASE;
        String fid = normalizeFid(path);
        Map<String, String> query = quark
                ? params("pr", "ucpro", "fr", "pc", "uc_param_str", "", "pdir_fid", fid)
                : params("pr", "UCBrowser", "fr", "pc", "pdir_fid", fid);
        query.put("_page", String.valueOf(page));
        query.put("_size", String.valueOf(size));
        query.put("_fetch_total", "1");
        query.put("_fetch_sub_dirs", "0");
        query.put("_sort", "file_type:asc,file_name:asc");

        String ua = quark ? QUARK_UA : UC_UA;
        String referer = quark ? QUARK_REFERER : UC_REFERER;
        HttpResult response = execute(request(url(base + "/file/sort", query), ua, referer, cookie).get().build());
        JsonNode root = json(response);
        JsonNode list = root.at("/data/list");
        if (!list.isArray()) {
            throw upstreamResponse("目录浏览", root);
        }
        List<Map<String, Object>> entries = new ArrayList<>();
        for (JsonNode file : list) {
            String fileId = firstText(file, "fid", "file_id", "id");
            if (fileId.isEmpty()) {
                continue;
            }
            boolean directory = isQuarkUcDirectory(file);
            Map<String, Object> entry = new LinkedHashMap<>();
            entry.put("fileId", fileId);
            entry.put("id", fileId);
            entry.put("name", firstText(file, "file_name", "name"));
            entry.put("path", fileId);
            entry.put("isDir", directory);
            entry.put("type", directory ? "folder" : "file");
            entry.put("size", file.path("size").asLong(0));
            putNumberIfPositive(entry, "updatedAt", file, "updated_at");
            putTextIfPresent(entry, "formatType", file, "format_type");
            putTextIfPresent(entry, "thumbnail", file, "thumbnail");
            entries.add(entry);
        }
        long total = root.at("/metadata/_total").asLong(-1);
        Map<String, Object> result = browseResult(provider, fid, entries, page, size);
        if (total >= 0) {
            result.put("total", total);
            result.put("hasMore", (long) page * size < total);
        } else {
            result.put("hasMore", list.size() >= size);
        }
        return result;
    }

    private Map<String, Object> browseBaidu(String cookie, String path, int page, int size) {
        String normalizedPath = normalizeBaiduPath(path);
        JsonNode root = baiduList(cookie, normalizedPath, page, size);
        List<Map<String, Object>> entries = baiduEntries(root);
        JsonNode list = root.path("list");
        Map<String, Object> result = browseResult("baidu", normalizedPath, entries, page, size);
        result.put("hasMore", list.isArray() && list.size() >= size);
        return result;
    }

    private JsonNode baiduList(String cookie, String path, int page, int size) {
        String url = url("https://pan.baidu.com/api/list", params(
                "clienttype", "0", "app_id", "250528", "web", "1", "channel", "chunlei",
                "dir", path, "order", "name", "desc", "0", "showempty", "0",
                "num", String.valueOf(size), "page", String.valueOf(page)));
        HttpResult response = execute(request(url, BAIDU_UA, BAIDU_REFERER + "disk/main", cookie).get().build());
        JsonNode root = json(response);
        int errno = root.path("errno").asInt(0);
        if (errno == -6) {
            throw new DriveException("AUTH_EXPIRED", "百度网盘登录态已失效，请重新绑定");
        }
        if (errno != 0) {
            throw upstreamResponse("目录浏览", root);
        }
        return root;
    }

    private List<Map<String, Object>> baiduEntries(JsonNode root) {
        List<Map<String, Object>> entries = new ArrayList<>();
        JsonNode list = root.path("list");
        if (!list.isArray()) {
            return entries;
        }
        for (JsonNode file : list) {
            String fsid = firstText(file, "fs_id", "fsid");
            if (fsid.isEmpty()) {
                continue;
            }
            boolean directory = file.path("isdir").asInt(0) == 1;
            Map<String, Object> entry = new LinkedHashMap<>();
            entry.put("fileId", fsid);
            entry.put("id", fsid);
            entry.put("name", firstText(file, "server_filename", "name"));
            entry.put("path", text(file.get("path")));
            entry.put("isDir", directory);
            entry.put("type", directory ? "folder" : "file");
            entry.put("size", file.path("size").asLong(0));
            putNumberIfPositive(entry, "modifiedAt", file, "server_mtime");
            putTextIfPresent(entry, "md5", file, "md5");
            entries.add(entry);
        }
        return entries;
    }

    private static Map<String, Object> browseResult(String provider, String path,
                                                      List<Map<String, Object>> entries, int page, int size) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("provider", provider);
        result.put("path", path);
        result.put("entries", entries);
        result.put("page", page);
        result.put("size", size);
        return result;
    }

    // ---------------------------------------------------------------- 播放地址

    public Map<String, Object> playUrl(String provider, String path, String fileId) {
        String p = normalizeProvider(provider);
        String cookie = requireToken(p);
        return switch (p) {
            case "quark", "uc" -> quarkUcPlayUrl(p, cookie, path, fileId);
            case "baidu" -> baiduPlayUrl(cookie, path, fileId);
            case "115" -> throw new DriveException("UNSUPPORTED", "115 播放地址暂未接入，当前仅支持凭据绑定");
            default -> throw new IllegalArgumentException("不支持的网盘 provider: " + p);
        };
    }

    private Map<String, Object> quarkUcPlayUrl(String provider, String cookie, String path, String fileId) {
        String fid = fileId == null || fileId.isBlank() ? path : fileId;
        fid = fid == null ? "" : fid.trim();
        if (fid.isEmpty() || "/".equals(fid) || "0".equals(fid)) {
            throw new IllegalArgumentException("播放文件需提供一个非根目录的 path 或 fileId");
        }
        if (fid.length() > 512 || fid.indexOf('\0') >= 0) {
            throw new IllegalArgumentException("fileId 格式无效");
        }
        boolean quark = "quark".equals(provider);
        String base = quark ? QUARK_BASE : UC_BASE;
        String ua = quark ? QUARK_UA : UC_UA;
        String referer = quark ? QUARK_REFERER : UC_REFERER;
        Map<String, String> query = quark
                ? params("pr", "ucpro", "fr", "pc", "uc_param_str", "")
                : params("pr", "UCBrowser", "fr", "pc", "uc_param_str", "");
        String downloadUrl = url(base + "/file/download", query);
        HttpResult response = execute(postJson(downloadUrl, ua, referer, cookie, Map.of("fids", List.of(fid))));
        JsonNode root = json(response);
        String playCookie = mergeCookies(cookie, response.setCookies());
        persistRefreshedCookie(provider, cookie, playCookie);

        String playUrl = "";
        JsonNode data = root.path("data");
        if (data.isArray()) {
            for (JsonNode item : data) {
                playUrl = firstText(item, "download_url", "url");
                if (isHttpUrl(playUrl)) {
                    break;
                }
                playUrl = "";
            }
        }
        // 部分账号/文件只允许转码播放，下载接口没有直链时尝试网页转码协议。
        if (playUrl.isEmpty()) {
            playUrl = quarkUcTranscodeUrl(base, query, ua, referer, playCookie, fid);
        }
        if (!isHttpUrl(playUrl)) {
            throw upstreamResponse("获取播放地址", root);
        }
        return playResult(provider, fid, playUrl, playCookie, ua, referer);
    }

    private String quarkUcTranscodeUrl(String base, Map<String, String> query, String ua,
                                       String referer, String cookie, String fid) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("fid", fid);
        body.put("resolutions", "low,normal,high,super,2k,4k");
        body.put("supports", "fmp4,m3u8,mp3,dolby_vision");
        try {
            HttpResult response = execute(postJson(url(base + "/file/v2/play/project", query),
                    ua, referer, cookie, body));
            JsonNode root = json(response);
            JsonNode videos = root.at("/data/video_list");
            if (videos.isArray()) {
                for (JsonNode video : videos) {
                    String candidate = text(video.at("/video_info/url"));
                    if (isHttpUrl(candidate)) {
                        return candidate;
                    }
                }
            }
        } catch (DriveException ex) {
            log.debug("[drive] 转码播放地址不可用: {}", ex.getMessage());
        }
        return "";
    }

    private Map<String, Object> baiduPlayUrl(String cookie, String path, String fileId) {
        String fsid = fileId == null ? "" : fileId.trim();
        String requestedPath = path == null ? "" : path.trim();
        if (fsid.isEmpty()) {
            if (requestedPath.isEmpty()) {
                throw new IllegalArgumentException("播放文件需提供 path 或 fileId");
            }
            fsid = resolveBaiduFsid(cookie, normalizeBaiduPath(requestedPath));
        }
        if (!fsid.matches("\\d+")) {
            throw new IllegalArgumentException("百度 fileId 必须是纯数字 fs_id");
        }
        String bdstoken = fetchBdstoken(cookie);
        String url = url("https://pan.baidu.com/api/filemetas", params(
                "dlink", "1", "fsids", "[" + fsid + "]", "thumb", "0", "web", "1",
                "app_id", "250528", "channel", "chunlei", "clienttype", "0", "bdstoken", bdstoken));
        HttpResult response = execute(request(url, BAIDU_UA, BAIDU_REFERER + "disk/main", cookie).get().build());
        JsonNode root = json(response);
        if (root.path("errno").asInt(0) == -6) {
            throw new DriveException("AUTH_EXPIRED", "百度网盘登录态已失效，请重新绑定");
        }
        String playUrl = text(root.at("/info/0/dlink"));
        if (!isHttpUrl(playUrl)) {
            throw upstreamResponse("获取播放地址", root);
        }
        return playResult("baidu", fsid, playUrl, cookie, BAIDU_DOWNLOAD_UA, BAIDU_REFERER);
    }

    private String fetchBdstoken(String cookie) {
        String url = url("https://pan.baidu.com/api/gettemplatevariable", params(
                "clienttype", "0", "app_id", "250528", "web", "1", "fields", "[\"bdstoken\"]"));
        HttpResult response = execute(request(url, BAIDU_UA, BAIDU_REFERER, cookie).get().build());
        JsonNode root = json(response);
        String token = text(root.at("/result/bdstoken"));
        if (token.isEmpty()) {
            throw new DriveException("AUTH_EXPIRED", "未取到百度 bdstoken，登录态可能已失效，请重新绑定");
        }
        return token;
    }

    /** 按本人盘完整路径定位文件；只接受精确 path 且非目录的条目，绝不盲选同名文件。 */
    private String resolveBaiduFsid(String cookie, String path) {
        int slash = path.lastIndexOf('/');
        String parent = slash <= 0 ? "/" : path.substring(0, slash);
        for (int page = 1; page <= 10; page++) {
            JsonNode root = baiduList(cookie, parent, page, 100);
            for (Map<String, Object> entry : baiduEntries(root)) {
                if (path.equals(entry.get("path")) && !Boolean.TRUE.equals(entry.get("isDir"))) {
                    return String.valueOf(entry.get("fileId"));
                }
            }
            JsonNode list = root.path("list");
            if (!list.isArray() || list.size() < 100) {
                break;
            }
        }
        throw new DriveException("NOT_FOUND", "百度网盘中未找到该文件，或文件位于目录的第 1000 项之后");
    }

    private static Map<String, Object> playResult(String provider, String fileId, String url,
                                                   String cookie, String ua, String referer) {
        Map<String, String> header = new LinkedHashMap<>();
        header.put("User-Agent", ua);
        header.put("Referer", referer);
        header.put("Cookie", cookie);
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("provider", provider);
        result.put("fileId", fileId);
        result.put("url", url);
        result.put("header", header);
        return result;
    }

    // ---------------------------------------------------------------- HTTP / JSON / 参数工具

    private HttpResult execute(Request request) {
        return execute(client, request);
    }

    private HttpResult execute(OkHttpClient http, Request request) {
        try (Response response = http.newCall(request).execute()) {
            ResponseBody body = response.body();
            String text = body == null ? "" : body.string();
            return new HttpResult(response.code(), text, List.copyOf(response.headers("Set-Cookie")));
        } catch (IOException ex) {
            throw upstreamError(ex);
        }
    }

    private JsonNode json(HttpResult response) {
        requireSuccessful(response);
        try {
            JsonNode root = objectMapper.readTree(response.body());
            if (root == null) {
                throw new IOException("empty JSON");
            }
            return root;
        } catch (Exception ex) {
            throw new DriveException("UPSTREAM", "网盘服务返回了无法解析的响应");
        }
    }

    private JsonNode jsonp(HttpResult response) {
        requireSuccessful(response);
        JsonNode root = readJsonpQuiet(response.body());
        if (root == null) {
            throw new DriveException("UPSTREAM", "网盘服务返回了无法解析的 JSONP 响应");
        }
        return root;
    }

    private JsonNode readJsonpQuiet(String text) {
        if (text == null) {
            return null;
        }
        String value = text.trim();
        int open = value.indexOf('(');
        int close = value.lastIndexOf(')');
        if (open > 0 && close > open) {
            value = value.substring(open + 1, close);
        }
        try {
            return objectMapper.readTree(value);
        } catch (Exception ex) {
            return null;
        }
    }

    private static void requireSuccessful(HttpResult response) {
        if (response.status() >= 200 && response.status() < 300) {
            return;
        }
        if (response.status() == 401 || response.status() == 403) {
            throw new DriveException("AUTH_EXPIRED", "网盘服务拒绝了请求，请检查或重新绑定登录凭据");
        }
        throw new DriveException("UPSTREAM", "网盘服务请求失败（HTTP " + response.status() + "）");
    }

    private Request.Builder request(String url, String ua, String referer, String cookie) {
        Request.Builder builder = new Request.Builder()
                .url(url)
                .header("User-Agent", ua)
                .header("Accept", "application/json, text/plain, */*");
        if (referer != null && !referer.isBlank()) {
            builder.header("Referer", referer);
            // 夸克/UC 网页 API 需要 Origin；Origin 只能含 scheme + host，不能带 /disk/main 等路径。
            // 百度 Passport/API 按 Win-box 原实现只带 Referer，避免额外的跨域头触发风控。
            HttpUrl target = HttpUrl.parse(url);
            HttpUrl ref = HttpUrl.parse(referer);
            if (target != null && ref != null
                    && (target.host().endsWith("quark.cn") || target.host().endsWith("uc.cn"))) {
                builder.header("Origin", ref.scheme() + "://" + ref.host());
            }
        }
        if (cookie != null && !cookie.isBlank()) {
            builder.header("Cookie", cookie);
        }
        return builder;
    }

    private Request postJson(String url, String ua, String referer, String cookie, Object body) {
        final String json;
        try {
            json = objectMapper.writeValueAsString(body);
        } catch (Exception ex) {
            throw new DriveException("DRIVE_ERROR", "无法构造网盘请求");
        }
        return request(url, ua, referer, cookie)
                .header("Content-Type", "application/json")
                .post(RequestBody.create(json, JSON_MEDIA_TYPE))
                .build();
    }

    private static String url(String base, Map<String, String> query) {
        HttpUrl parsed = HttpUrl.parse(base);
        if (parsed == null) {
            throw new DriveException("DRIVE_ERROR", "网盘接口地址配置无效");
        }
        HttpUrl.Builder builder = parsed.newBuilder();
        query.forEach(builder::addQueryParameter);
        return builder.build().toString();
    }

    private static Map<String, String> params(String... keyValues) {
        Map<String, String> result = new LinkedHashMap<>();
        for (int i = 0; i + 1 < keyValues.length; i += 2) {
            result.put(keyValues[i], keyValues[i + 1]);
        }
        return result;
    }

    private static String normalizeProvider(String provider) {
        String p = provider == null ? "" : provider.trim().toLowerCase(Locale.ROOT);
        if (!PROVIDERS.contains(p)) {
            throw new IllegalArgumentException("provider 需为 quark / uc / baidu / 115");
        }
        return p;
    }

    private static String normalizeToken(String token) {
        String value = token == null ? "" : token.trim();
        if (value.isEmpty()) {
            throw new IllegalArgumentException("token 不能为空");
        }
        if (value.length() > MAX_TOKEN_LENGTH || value.indexOf('\0') >= 0
                || value.indexOf('\r') >= 0 || value.indexOf('\n') >= 0) {
            throw new IllegalArgumentException("token 格式无效或过长");
        }
        return value;
    }

    /** 夸克/UC 网页接口用 fid 寻址；空串、/、0 都表示根目录。 */
    private static String normalizeFid(String path) {
        String value = path == null ? "" : path.trim();
        if (value.isEmpty() || "/".equals(value)) {
            return "0";
        }
        if (value.length() > 512 || value.indexOf('\0') >= 0) {
            throw new IllegalArgumentException("目录 fid 格式无效");
        }
        return value;
    }

    private static String normalizeBaiduPath(String path) {
        String value = path == null ? "" : path.trim().replace('\\', '/');
        if (value.isEmpty() || "/".equals(value)) {
            return "/";
        }
        if (!value.startsWith("/")) {
            value = "/" + value;
        }
        while (value.length() > 1 && value.endsWith("/")) {
            value = value.substring(0, value.length() - 1);
        }
        if (value.length() > 4096 || value.indexOf('\0') >= 0
                || value.indexOf('\r') >= 0 || value.indexOf('\n') >= 0) {
            throw new IllegalArgumentException("百度网盘路径格式无效");
        }
        return value;
    }

    private static boolean isQuarkUcDirectory(JsonNode file) {
        if (file.has("dir")) {
            return file.path("dir").asBoolean(false);
        }
        if (file.has("file_type")) {
            int type = file.path("file_type").asInt(-1);
            return type == 0 || type == 2;
        }
        if (file.has("format_type")) {
            return false;
        }
        return !file.has("size") || file.path("size").asLong(0) == 0;
    }

    private static String mergeCookies(String initial, List<String> setCookies) {
        Map<String, String> jar = new LinkedHashMap<>();
        if (initial != null && !initial.isBlank()) {
            for (String pair : initial.split(";")) {
                addCookie(jar, pair);
            }
        }
        if (setCookies != null) {
            for (String header : setCookies) {
                int semicolon = header.indexOf(';');
                addCookie(jar, semicolon >= 0 ? header.substring(0, semicolon) : header);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : jar.entrySet()) {
            if (result.length() > 0) {
                result.append("; ");
            }
            result.append(entry.getKey()).append('=').append(entry.getValue());
        }
        return result.toString();
    }

    private static void addCookie(Map<String, String> jar, String pair) {
        if (pair == null) {
            return;
        }
        String value = pair.trim();
        int equals = value.indexOf('=');
        if (equals <= 0) {
            return;
        }
        String name = value.substring(0, equals).trim();
        String cookieValue = value.substring(equals + 1).trim();
        if (!name.isEmpty()) {
            if (cookieValue.isEmpty()) {
                jar.remove(name);
            } else {
                jar.put(name, cookieValue);
            }
        }
    }

    private void persistRefreshedCookie(String provider, String previous, String refreshed) {
        if (refreshed.isBlank() || refreshed.equals(previous)) {
            return;
        }
        try {
            set(provider, refreshed);
        } catch (DriveException ex) {
            log.warn("[drive] {} 的新会话 Cookie 未能持久化: {}", provider, ex.getMessage());
        }
    }

    private static boolean isHttpUrl(String value) {
        if (value == null || value.isBlank()) {
            return false;
        }
        HttpUrl url = HttpUrl.parse(value.trim());
        return url != null && ("http".equals(url.scheme()) || "https".equals(url.scheme()));
    }

    private static DriveException upstreamResponse(String action, JsonNode root) {
        String code = firstText(root, "code", "errno", "status");
        String message = firstText(root, "message", "msg", "errmsg");
        StringBuilder text = new StringBuilder(action).append("失败");
        if (!code.isEmpty()) {
            text.append("（上游状态 ").append(code).append('）');
        }
        if (!message.isEmpty()) {
            String clean = message.replaceAll("[\\r\\n\\t]+", " ").trim();
            if (clean.length() > 120) {
                clean = clean.substring(0, 120);
            }
            text.append("：").append(clean);
        }
        return new DriveException("UPSTREAM", text.toString());
    }

    private static DriveException upstreamError(IOException ex) {
        String message = ex.getMessage() == null ? "网络连接失败" : ex.getMessage();
        if (message.length() > 120) {
            message = message.substring(0, 120);
        }
        return new DriveException("UPSTREAM", "网盘服务网络请求失败: " + message);
    }

    private static DriveException storageError(SQLException ex) {
        return new DriveException("STORAGE_ERROR", "网盘凭据存储不可用: " + ex.getMessage());
    }

    private static String text(JsonNode node) {
        return node == null || node.isNull() ? "" : node.asText("").trim();
    }

    private static String firstText(JsonNode node, String... fields) {
        if (node == null) {
            return "";
        }
        for (String field : fields) {
            String value = text(node.get(field));
            if (!value.isEmpty()) {
                return value;
            }
        }
        return "";
    }

    private static void putTextIfPresent(Map<String, Object> target, String targetName,
                                         JsonNode source, String sourceName) {
        String value = text(source.get(sourceName));
        if (!value.isEmpty()) {
            target.put(targetName, value);
        }
    }

    private static void putNumberIfPositive(Map<String, Object> target, String targetName,
                                            JsonNode source, String sourceName) {
        long value = source.path(sourceName).asLong(0);
        if (value > 0) {
            target.put(targetName, value);
        }
    }

    private static String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    private record HttpResult(int status, String body, List<String> setCookies) {
    }

    private record QrSession(String provider, String token, String sign, String gid,
                             String cookie, long createdAt) {
    }

    private record CasConfig(String provider, String casBase, String clientId, String version,
                             String qrTemplate, String referer, String userAgent, String accountInfo,
                             String cloudApi, boolean cloudPost, Map<String, String> cloudQuery) {
        static final CasConfig QUARK = new CasConfig(
                "quark", "https://uop.quark.cn/cas/ajax", "532", "1.2",
                "https://su.quark.cn/4_eMHBJ?token={token}&client_id={clientId}&ssb=weblogin",
                "https://pan.quark.cn", CAS_UA, "https://pan.quark.cn/account/info",
                "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/dir", false,
                params("pr", "ucpro", "fr", "pc", "uc_param_str", "", "aver", "1"));
        static final CasConfig UC = new CasConfig(
                "uc", "https://api.open.uc.cn/cas/ajax", "381", "1.2",
                "https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt"
                        + "&token={token}&client_id={clientId}&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix",
                "https://drive.uc.cn", CAS_UA, "https://drive.uc.cn/account/info",
                "https://pc-api.uc.cn/1/clouddrive/transfer/upload/pdir", true,
                params("pr", "UCBrowser", "fr", "pc"));
    }

    /** 带错误码的服务异常，由 Controller 转为统一 IpcResult。 */
    public static final class DriveException extends RuntimeException {
        private final String code;

        public DriveException(String code, String message) {
            super(message);
            this.code = code;
        }

        public String code() {
            return code;
        }
    }
}
