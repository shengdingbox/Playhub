package com.tvbox.web.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 站点的明文 ext 覆盖表。
 *
 * <p><b>为什么需要它</b>：这类配置里的 {@code csp_*Guard} 站点，其 ext 是加密的，
 * 解密链为 {@code C0049.m2191 → Rc.KJ → InitOrigin.i.decrypt → DexNative.decrypt}，
 * 而 {@code DexNative.decrypt} 是 native 方法，实现在 {@code ftyguard_v7.so}(ARM32) /
 * {@code ftyguard_v8.so}(AARCH64) 中（动态注册，无导出符号，带环境校验）。
 * 纯 ARM 指令集在 Windows x64 JVM 上无法加载执行，因此桌面端无法解密这些 ext。
 *
 * <p><b>解决办法</b>：ext 解密后的内容就是站点自己的配置（App99 为例是一个含
 * {@code host / appkey / token} 等字段的 JSON）。只要拿到明文 ext，就能让爬虫正常工作。
 * 明文 ext 可在手机上用 TVBox 加载同一份配置后从抓包或日志中获得。
 *
 * <p>把明文写进 {@code <cache-dir>/ext-overrides.json}，格式为 {@code {"api": "明文ext"}}，
 * 本服务会在 spider 初始化时用明文替换掉加密的 ext。
 *
 * <p>示例：
 * <pre>
 * {
 *   "csp_App99Guard": "{\"host\":\"https://api.example.com\",\"appkey\":\"xxx\"}",
 *   "csp_AppSxGuard": "{\"host\":\"https://api.example.org\",\"token\":\"yyy\"}"
 * }
 * </pre>
 */
@Service
public class ExtOverrideService {

    private static final Logger log = LoggerFactory.getLogger(ExtOverrideService.class);
    private static final String FILE_NAME = "ext-overrides.json";

    private final ObjectMapper mapper = new ObjectMapper();
    private final Path path;

    private volatile Map<String, String> cache = Map.of();
    private volatile long loadedStamp = -1L;

    public ExtOverrideService(@Value("${app.cache-dir:.cache/tvbox}") String cacheDir) {
        this.path = Paths.get(cacheDir).resolve(FILE_NAME);
    }

    /** 返回该 api 的明文 ext；未配置则返回 null。 */
    public String resolve(String api, String originalExt) {
        if (api == null || api.isBlank()) {
            return null;
        }
        Map<String, String> table = load();
        String value = table.get(api);
        if (value == null || value.isBlank()) {
            if (isEncryptedLooking(originalExt)) {
                DiagLog.step(log, "ext 未覆盖（加密不可解）: " + api);
            }
            return null;
        }
        DiagLog.step(log, "ext 使用本地明文覆盖: " + api);
        return value;
    }

    /** ext 看起来像加密串（非空、不是 JSON、也不是 http 地址）。 */
    public static boolean isEncryptedLooking(String ext) {
        if (ext == null || ext.isBlank()) {
            return false;
        }
        String t = ext.trim();
        return !(t.startsWith("{") || t.startsWith("[") || t.startsWith("http"));
    }

    /** 明文 ext 文件的路径，便于对外展示/生成模板。 */
    public Path getPath() {
        return path;
    }

    private Map<String, String> load() {
        try {
            if (!Files.isRegularFile(path)) {
                return Map.of();
            }
            long stamp = Files.getLastModifiedTime(path).toMillis();
            if (stamp == loadedStamp) {
                return cache;
            }
            String text = Files.readString(path, StandardCharsets.UTF_8);
            JsonNode node = mapper.readTree(text);
            Map<String, String> map = new LinkedHashMap<>();
            node.fields().forEachRemaining(entry -> {
                JsonNode v = entry.getValue();
                if (v == null || v.isNull()) {
                    return;
                }
                // 允许写字符串，也允许直接写对象（自动序列化）
                map.put(entry.getKey(), v.isTextual() ? v.asText() : v.toString());
            });
            cache = Map.copyOf(map);
            loadedStamp = stamp;
            log.info("[Ext] 已加载 {} 条明文 ext 覆盖: {}", map.size(), path);
            return cache;
        } catch (IOException | RuntimeException ex) {
            log.warn("[Ext] 读取 {} 失败: {}", path, ex.getMessage());
            return cache;
        }
    }
}
