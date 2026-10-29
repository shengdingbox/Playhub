package com.tvbox.web.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PreDestroy;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 弹幕服务：代理公开的弹弹play 协议弹幕接口（LogVar / 御坂 / 炊烟袅袅 等自建服务）。
 *
 * <p>协议（参考 Win-box {@code src/main/danmaku/logvarProvider.ts}，地址含 token 路径，路由固定）：
 * <pre>
 *   搜索候选 {base}/api/v2/search/anime?keyword=&lt;kw&gt;
 *   剧集列表 {base}/api/v2/bangumi/{bangumiId}
 *   弹幕数据 {base}/api/v2/comment/{episodeId}?format=xml（B 站 XML 或新版 JSON，按首字符探测）
 * </pre>
 *
 * <p>公开接口死链/401 很常见 → 每次失败记<b>会话级冷却</b>（首次 2 分钟、重复 10 分钟），
 * 冷却期内直接跳过该源，避免反复白等死链拖慢搜索；成功后清零。
 */
@Service
public class DanmakuService {

    private static final Logger log = LoggerFactory.getLogger(DanmakuService.class);

    /** 弹幕源接口。默认启用前三个（炊烟袅袅/LogVar/御坂），其余保留作自定义扩展参考。 */
    public record DanmakuEndpoint(String name, String url, boolean enabled) {
    }

    private static final List<DanmakuEndpoint> ENDPOINTS = List.of(
            new DanmakuEndpoint("炊烟袅袅", "https://danmu.cynn.top/cynnsq", true),
            new DanmakuEndpoint("LogVar", "https://dm.abai.ccwu.cc/abai", true),
            new DanmakuEndpoint("御坂", "https://dmk.abai.ccwu.cc/api/v1/abaibai", true),
            new DanmakuEndpoint("Lily", "https://danmu.lily.lat/lilyemby", false),
            new DanmakuEndpoint("墨云阁", "https://danmu.wangziyang.top/020116", false),
            new DanmakuEndpoint("稳健", "https://dandan.wenjian.de/wenjian", false),
            new DanmakuEndpoint("鸢尾 Iris", "https://justdanmu.irisnb.com/iris-danmu", false),
            new DanmakuEndpoint("夏天", "https://dm.wodenas.xin/xiatianemby", false)
    );

    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Win-Box/0.98";
    private static final long FIRST_COOLDOWN_MS = 2 * 60_000L;
    private static final long REPEAT_COOLDOWN_MS = 10 * 60_000L;

    private final ObjectMapper objectMapper;
    /** 搜索/剧集：8s 级；弹幕：实测聚合源首取要回源，正常集 6~24s，给 40s（参考 Win-box LOGVAR_COMMENT_TIMEOUT_MS）。 */
    private final OkHttpClient fastClient = HttpClientFactory.createOkHttp(5, 8);
    private final OkHttpClient slowClient = HttpClientFactory.createOkHttp(8, 40);

    private final ExecutorService pool = Executors.newCachedThreadPool(r -> {
        Thread t = new Thread(r, "danmaku-io");
        t.setDaemon(true);
        return t;
    });

    public DanmakuService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @PreDestroy
    void shutdown() {
        pool.shutdownNow();
    }

    // ---------------------------------------------------------------- 搜索番剧

    /**
     * 按名称并行搜索所有启用且未冷却的弹幕源，候选经过去重 + 相关度排序。
     * 全部源失败时返回空列表（不抛错，前端显示「无弹幕候选」即可）。
     */
    public List<Map<String, Object>> search(String name, Integer season) {
        String keyword = name == null ? "" : name.trim();
        if (keyword.isEmpty()) {
            return List.of();
        }
        long now = System.currentTimeMillis();
        List<DanmakuEndpoint> active = new ArrayList<>();
        for (DanmakuEndpoint e : ENDPOINTS) {
            if (e.enabled() && !isCooling(e.url(), now)) {
                active.add(e);
            }
        }
        if (active.isEmpty()) {
            log.info("[danmaku] 所有弹幕源均在冷却期，本次搜索返回空");
            return List.of();
        }
        List<CompletableFuture<List<AnimeHit>>> futures = new ArrayList<>();
        for (DanmakuEndpoint ep : active) {
            futures.add(CompletableFuture.supplyAsync(() -> {
                try {
                    return searchEndpoint(ep, keyword);
                } catch (Exception ex) {
                    markFail(ep.url());
                    log.debug("[danmaku] 搜索失败（{}）: {}", ep.name(), ex.getMessage());
                    return List.<AnimeHit>of();
                }
            }, pool));
        }
        List<AnimeHit> all = new ArrayList<>();
        for (CompletableFuture<List<AnimeHit>> f : futures) {
            try {
                all.addAll(f.join());
            } catch (Exception ignore) {
                // 单个源异常已被上面捕获，这里只是兜底
            }
        }
        return rankAndMap(all, keyword, season);
    }

    /** 单源搜索；失败抛错由调用方记冷却。 */
    private List<AnimeHit> searchEndpoint(DanmakuEndpoint ep, String keyword) throws IOException {
        String url = ep.url() + "/api/v2/search/anime?keyword="
                + URLEncoder.encode(keyword, StandardCharsets.UTF_8);
        String body = get(url, fastClient);
        JsonNode root = readJson(body);
        JsonNode arr = root.isArray() ? root : root.get("animes");
        if (arr == null || !arr.isArray()) {
            throw new IOException("响应结构异常");
        }
        List<AnimeHit> out = new ArrayList<>();
        for (JsonNode a : arr) {
            JsonNode idNode = a.get("animeId");
            long animeId = idNode == null ? Long.MIN_VALUE : idNode.asLong(Long.MIN_VALUE);
            if (animeId == Long.MIN_VALUE) {
                continue;
            }
            JsonNode bgNode = a.get("bangumiId");
            long bangumiId = bgNode == null ? animeId : bgNode.asLong(animeId);
            String title = firstText(a, "animeTitle", "title");
            if (title.isEmpty()) {
                continue;
            }
            String kind = a.path("type").asText("").trim();
            int episodeCount = a.path("episodeCount").asInt(0);
            out.add(new AnimeHit(animeId, bangumiId, title, kind, episodeCount, ep.url(), ep.name()));
        }
        markOk(ep.url());
        return out;
    }

    /**
     * 候选排序 + 去重（同来源同名的只留首个，参考 Win-box rankDanmakuAnimes）：
     * 档 0 = 净化后完全同名；档 1 = 一方包含另一方；档 2 = 其它。
     * 给了期望季号时同季排前面；同档同季内按集数多者优先（真季集 vs 花絮条目）。
     */
    private List<Map<String, Object>> rankAndMap(List<AnimeHit> list, String keyword, Integer season) {
        String k = cleanTitle(keyword);
        Set<String> seen = new HashSet<>();
        List<AnimeHit> uniq = new ArrayList<>();
        for (AnimeHit a : list) {
            if (seen.add(a.source() + "::" + a.title())) {
                uniq.add(a);
            }
        }
        record Scored(AnimeHit a, int rank, int seasonRank, int idx) {
        }
        List<Scored> scored = new ArrayList<>();
        for (int i = 0; i < uniq.size(); i++) {
            AnimeHit a = uniq.get(i);
            String t = cleanTitle(a.title());
            int rank = k.isEmpty() || t.isEmpty() ? 2
                    : t.equals(k) ? 0
                    : (t.contains(k) || k.contains(t)) ? 1 : 2;
            scored.add(new Scored(a, rank, seasonRankOf(a.title(), season), i));
        }
        scored.sort((x, y) -> {
            if (x.rank() != y.rank()) {
                return Integer.compare(x.rank(), y.rank());
            }
            if (x.seasonRank() != y.seasonRank()) {
                return Integer.compare(x.seasonRank(), y.seasonRank());
            }
            if (season != null && x.a().episodeCount() != y.a().episodeCount()) {
                return Integer.compare(y.a().episodeCount(), x.a().episodeCount());
            }
            return Integer.compare(x.idx(), y.idx());
        });
        List<Map<String, Object>> out = new ArrayList<>();
        for (Scored s : scored) {
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("animeId", s.a().animeId());
            m.put("bangumiId", s.a().bangumiId());
            m.put("title", s.a().title());
            if (!s.a().kind().isEmpty()) {
                m.put("kind", s.a().kind());
            }
            if (s.a().episodeCount() > 0) {
                m.put("episodeCount", s.a().episodeCount());
            }
            m.put("source", s.a().source());
            m.put("sourceName", s.a().sourceName());
            out.add(m);
        }
        return out;
    }

    // ---------------------------------------------------------------- 剧集列表

    /**
     * 番剧的剧集列表。{@code source} 为搜索候选里的来源地址（episodeId 是源内 id，必须回同源取）；
     * 缺省用第一个启用且未冷却的源。失败抛 {@link IllegalStateException}（HTTP 层错误/结构异常）。
     */
    public List<Map<String, Object>> episodes(long bangumiId, String animeTitle, String source) {
        DanmakuEndpoint ep = resolveEndpoint(source);
        String body;
        try {
            body = get(ep.url() + "/api/v2/bangumi/" + bangumiId, fastClient);
        } catch (IOException ex) {
            markFail(ep.url());
            throw new IllegalStateException("弹幕源「" + ep.name() + "」请求失败: " + ex.getMessage(), ex);
        }
        JsonNode root = readJsonQuiet(body);
        JsonNode bangumi = root == null ? null : root.get("bangumi");
        JsonNode eps = bangumi == null ? null : bangumi.get("episodes");
        if (eps == null || !eps.isArray()) {
            markFail(ep.url());
            throw new IllegalStateException("弹幕源「" + ep.name() + "」剧集响应结构异常");
        }
        markOk(ep.url());
        String title = animeTitle != null && !animeTitle.isBlank()
                ? animeTitle.trim()
                : firstText(bangumi, "animeTitle");
        List<Map<String, Object>> out = new ArrayList<>();
        for (JsonNode e : eps) {
            JsonNode idNode = e.get("episodeId");
            long episodeId = idNode == null ? Long.MIN_VALUE : idNode.asLong(Long.MIN_VALUE);
            if (episodeId == Long.MIN_VALUE) {
                continue;
            }
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("episodeId", episodeId);
            if (!title.isEmpty()) {
                m.put("title", title);
            }
            String epTitle = e.path("episodeTitle").asText("").trim();
            if (!epTitle.isEmpty()) {
                m.put("episodeTitle", epTitle);
            }
            // 接口给的集号字段（数字或数字串）——部分来源标题不提集号，只能靠它排序/匹配
            JsonNode numNode = e.hasNonNull("episodeNumber") ? e.get("episodeNumber") : e.get("episode_number");
            String epNum = numNode == null ? "" : numNode.asText("").trim();
            if (epNum.matches("\\d{1,4}")) {
                m.put("episodeNumber", epNum);
            }
            m.put("source", ep.url());
            m.put("sourceName", ep.name());
            out.add(m);
        }
        return out;
    }

    // ---------------------------------------------------------------- 弹幕内容

    /**
     * 按 episodeId 拉取弹幕并解析成统一格式 [{time, mode, text, size, color}]。
     * 失败抛 {@link IllegalStateException}；源返回空弹幕（合法空 XML）返回空列表。
     */
    public List<Map<String, Object>> fetch(long episodeId, String source) {
        DanmakuEndpoint ep = resolveEndpoint(source);
        String body;
        try {
            body = get(ep.url() + "/api/v2/comment/" + episodeId + "?format=xml", slowClient);
        } catch (IOException ex) {
            markFail(ep.url());
            throw new IllegalStateException("弹幕拉取失败（" + ep.name() + "）: " + ex.getMessage(), ex);
        }
        markOk(ep.url());
        return parseDanmaku(body);
    }

    /**
     * 便捷流程：按名称 + 集号（1 起）直接拉弹幕。
     * 搜索 → 取排序后第一个番剧 → 剧集列表 → 优先按 episodeNumber 精确匹配，
     * 否则按位置取第 episodeIndex 集。任一环节无结果抛 {@link IllegalStateException}。
     */
    public List<Map<String, Object>> fetchByName(String name, int episodeIndex, Integer season) {
        List<Map<String, Object>> animes = search(name, season);
        if (animes.isEmpty()) {
            throw new IllegalStateException("未找到匹配的弹幕番剧: " + name);
        }
        Map<String, Object> anime = animes.get(0);
        long bangumiId = ((Number) anime.get("bangumiId")).longValue();
        String source = (String) anime.get("source");
        List<Map<String, Object>> eps = episodes(bangumiId, (String) anime.get("title"), source);
        if (eps.isEmpty()) {
            throw new IllegalStateException("番剧「" + anime.get("title") + "」没有剧集弹幕");
        }
        Map<String, Object> target = null;
        for (Map<String, Object> e : eps) {
            Object num = e.get("episodeNumber");
            if (num instanceof String s && !s.isEmpty() && Integer.parseInt(s) == episodeIndex) {
                target = e;
                break;
            }
        }
        if (target == null && episodeIndex >= 1 && episodeIndex <= eps.size()) {
            target = eps.get(episodeIndex - 1);
        }
        if (target == null) {
            throw new IllegalStateException("未找到第 " + episodeIndex + " 集的弹幕");
        }
        return fetch(((Number) target.get("episodeId")).longValue(), (String) target.get("source"));
    }

    // ---------------------------------------------------------------- 弹幕解析（移植 Win-box parseDanmakuXml.ts）

    private static final Pattern SELF_CLOSING_D = Pattern.compile("<d\\b([^>]*?)/>");
    private static final Pattern D_TAG = Pattern.compile("<d\\b([^>]*)>([\\s\\S]*?)</d>");
    private static final Pattern P_ATTR = Pattern.compile("(?:^|\\s)p\\s*=\\s*(?:\"([^\"]*)\"|'([^']*)')");
    private static final Pattern CDATA = Pattern.compile("<!\\[CDATA\\[([\\s\\S]*?)\\]\\]>");

    /** 按内容首字符探测：以 '&lt;' 开头按 XML，否则按 JSON；空返回 []。 */
    List<Map<String, Object>> parseDanmaku(String text) {
        String t = text == null ? "" : text.trim();
        if (t.isEmpty()) {
            return List.of();
        }
        return t.startsWith("<") ? parseDanmakuXml(t) : parseDanmakuJson(t);
    }

    /** B 站弹幕 XML：{@code <d p="时间,模式,字号,颜色,...">内容</d>}。非 <d> 内容忽略。 */
    private List<Map<String, Object>> parseDanmakuXml(String xml) {
        List<Map<String, Object>> out = new ArrayList<>();
        String normalized = normalizeSelfClosing(xml);
        Matcher m = D_TAG.matcher(normalized);
        while (m.find()) {
            Matcher pm = P_ATTR.matcher(m.group(1));
            if (!pm.find()) {
                continue;
            }
            String p = pm.group(1) != null ? pm.group(1) : (pm.group(2) != null ? pm.group(2) : "");
            String[] parts = p.split(",", -1);
            double time;
            try {
                time = Double.parseDouble(parts[0].trim());
            } catch (Exception ex) {
                continue;
            }
            String mode = toMode(parts.length > 1 ? parseLongOr(parts[1], 0).intValue() : 0);
            if (mode == null) {
                continue; // 7/8/9（脚本/高级）不支持，丢弃
            }
            int size = clamp(parts.length > 2 ? parseLongOr(parts[2], 25).intValue() : 25, 12, 40);
            String color = toHexColor(parts.length > 3 ? parseLongOr(parts[3], 0) : 0);
            String text = unescapeXml(stripCdata(m.group(2))).replace("\r", "");
            if (text.trim().isEmpty()) {
                continue;
            }
            out.add(danmakuItem(time, mode, text, size, color));
        }
        return out;
    }

    /**
     * B 站新版 JSON 弹幕（聚合接口实测返回）：
     * {@code { "count": N, "comments": [ { "p": "时间,模式,颜色,弹幕id", "m": "内容" } ] }}。
     * 注意 p 字段顺序与 XML 不同（无字号位），字号统一默认 25。
     */
    private List<Map<String, Object>> parseDanmakuJson(String text) {
        JsonNode root = readJsonQuiet(text);
        JsonNode arr = root != null && root.isArray() ? root : (root != null ? root.get("comments") : null);
        if (arr == null || !arr.isArray()) {
            return List.of();
        }
        List<Map<String, Object>> out = new ArrayList<>();
        for (JsonNode c : arr) {
            String p = c.path("p").asText("");
            if (p.isEmpty()) {
                continue;
            }
            String[] attrs = p.split(",", -1);
            double time;
            try {
                time = Double.parseDouble(attrs[0].trim());
            } catch (Exception ex) {
                continue;
            }
            String mode = toMode(attrs.length > 1 ? parseLongOr(attrs[1], 0).intValue() : 0);
            if (mode == null) {
                continue;
            }
            long colorInt = attrs.length > 2 ? parseLongOr(attrs[2], 16777215) : 16777215;
            String content = c.path("m").asText("");
            if (content.trim().isEmpty()) {
                continue;
            }
            out.add(danmakuItem(time, mode, content, 25, toHexColor(colorInt)));
        }
        return out;
    }

    private static Map<String, Object> danmakuItem(double time, String mode, String text, int size, String color) {
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("time", time);
        m.put("mode", mode);
        m.put("text", text);
        m.put("size", size);
        m.put("color", color);
        return m;
    }

    /** B 站弹幕模式 → 类型；1/6 滚动、4 底部、5 顶部，其余不支持返回 null。 */
    private static String toMode(int mode) {
        return switch (mode) {
            case 1, 6 -> "scroll";
            case 4 -> "bottom";
            case 5 -> "top";
            default -> null;
        };
    }

    /** 十进制颜色 int → #rrggbb（取低 24 位）。 */
    private static String toHexColor(long n) {
        return String.format("#%06x", n & 0xFFFFFF);
    }

    private static int clamp(int v, int min, int max) {
        return Math.min(max, Math.max(min, v));
    }

    private static Long parseLongOr(String s, long fallback) {
        try {
            return Long.parseLong(s.trim());
        } catch (Exception ex) {
            return fallback;
        }
    }

    /** XML 实体反转义。顺序重要：先其它后 amp，避免二次转义。 */
    private static String unescapeXml(String s) {
        return s.replace("&lt;", "<")
                .replace("&gt;", ">")
                .replace("&quot;", "\"")
                .replace("&apos;", "'")
                .replace("&amp;", "&");
    }

    /** 自闭合 {@code <d …/>} 统一成空对（内容空会被丢弃，避免正则吞后续弹幕）。 */
    private static String normalizeSelfClosing(String xml) {
        Matcher m = SELF_CLOSING_D.matcher(xml);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, Matcher.quoteReplacement("<d" + m.group(1) + "></d>"));
        }
        m.appendTail(sb);
        return sb.toString();
    }

    /** 剥 CDATA 标记保留内容。 */
    private static String stripCdata(String s) {
        Matcher m = CDATA.matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, Matcher.quoteReplacement(m.group(1)));
        }
        m.appendTail(sb);
        return sb.toString();
    }

    // ---------------------------------------------------------------- 标题净化 / 季号（移植 Win-box endpoints.ts）

    private static final Pattern NON_ALNUM = Pattern.compile("[^\\p{L}\\p{N}]+");
    private static final Pattern CN_SEASON = Pattern.compile("第\\s*(\\d{1,2}|[一二三四五六七八九十]{1,3})\\s*季");
    private static final Pattern EN_SEASON =
            Pattern.compile("(?:^|[^a-z0-9])s(?:eason)?\\s*0?(\\d{1,2})(?![0-9])", Pattern.CASE_INSENSITIVE);

    /** 标题净化：全角转半角 + 去所有非字母数字（用于匹配度打分）。 */
    private static String cleanTitle(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 0xFF01 && c <= 0xFF5E) {
                sb.append((char) (c - 0xFEE0));
            } else if (c == 0x3000) {
                sb.append(' ');
            } else {
                sb.append(c);
            }
        }
        return NON_ALNUM.matcher(sb.toString().toLowerCase()).replaceAll("");
    }

    private static final Map<String, Integer> CN_NUM = new HashMap<>(Map.of(
            "一", 1, "二", 2, "三", 3, "四", 4, "五", 5, "六", 6, "七", 7, "八", 8, "九", 9, "十", 10));
    private static final Pattern CN_TEN_PREFIX = Pattern.compile("^十([一二三四五六七八九])$");
    private static final Pattern CN_TEN_SUFFIX = Pattern.compile("^([一二三四五六七八九])十([一二三四五六七八九])?$");

    /** 中文数字（一~十/十一…）→ 数字；非汉字数字直接 Number。取不到返回 null。 */
    private static Integer cnNum(String s) {
        String t = s == null ? "" : s.trim();
        if (t.matches("\\d{1,2}")) {
            return Integer.valueOf(t);
        }
        Integer direct = CN_NUM.get(t);
        if (direct != null) {
            return direct;
        }
        Matcher m = CN_TEN_PREFIX.matcher(t);
        if (m.find()) {
            return 10 + CN_NUM.getOrDefault(m.group(1), 0);
        }
        Matcher m2 = CN_TEN_SUFFIX.matcher(t);
        if (m2.find()) {
            return CN_NUM.getOrDefault(m2.group(1), 0) * 10
                    + (m2.group(2) != null ? CN_NUM.getOrDefault(m2.group(2), 0) : 0);
        }
        return null;
    }

    /** 从资源名/剧名提取季号：「第2季」「S01」「Season 2」→ 1/2；取不到返回 null。 */
    private static Integer seasonOf(String name) {
        if (name == null) {
            return null;
        }
        Matcher cn = CN_SEASON.matcher(name);
        if (cn.find()) {
            Integer n = cnNum(cn.group(1));
            if (n != null && n >= 1 && n <= 99) {
                return n;
            }
        }
        Matcher en = EN_SEASON.matcher(name);
        if (en.find()) {
            int n = Integer.parseInt(en.group(1));
            if (n >= 1 && n <= 99) {
                return n;
            }
        }
        return null;
    }

    /** 标题季号与期望季的契合度：0 = 同季 / 1 = 无季信息 / 2 = 不同季。 */
    private static int seasonRankOf(String title, Integer season) {
        Integer t = seasonOf(title);
        if (t == null || season == null) {
            return 1;
        }
        return t.equals(season) ? 0 : 2;
    }

    // ---------------------------------------------------------------- HTTP / 冷却 / 工具

    private String get(String url, OkHttpClient client) throws IOException {
        Request req = new Request.Builder().url(url)
                .header("User-Agent", UA)
                .header("Accept", "*/*")
                .get().build();
        try (Response resp = client.newCall(req).execute()) {
            if (!resp.isSuccessful()) {
                throw new IOException("HTTP " + resp.code());
            }
            ResponseBody body = resp.body();
            return body == null ? "" : body.string();
        }
    }

    private JsonNode readJson(String body) throws IOException {
        try {
            return objectMapper.readTree(body);
        } catch (Exception ex) {
            throw new IOException("响应不是 JSON");
        }
    }

    private JsonNode readJsonQuiet(String body) {
        try {
            return objectMapper.readTree(body);
        } catch (Exception ex) {
            return null;
        }
    }

    private static String firstText(JsonNode node, String... fields) {
        if (node == null) {
            return "";
        }
        for (String f : fields) {
            JsonNode v = node.get(f);
            if (v != null && !v.isNull()) {
                String s = v.asText("").trim();
                if (!s.isEmpty()) {
                    return s;
                }
            }
        }
        return "";
    }

    /** 按 source 地址解析弹幕源：匹配内置清单；不在清单里按自定义地址用；缺省取第一个启用且未冷却的源。 */
    private DanmakuEndpoint resolveEndpoint(String source) {
        String s = normalizeBase(source);
        if (!s.isEmpty()) {
            for (DanmakuEndpoint e : ENDPOINTS) {
                if (e.url().equalsIgnoreCase(s)) {
                    return e;
                }
            }
            return new DanmakuEndpoint(hostLabel(s), s, true);
        }
        long now = System.currentTimeMillis();
        for (DanmakuEndpoint e : ENDPOINTS) {
            if (e.enabled() && !isCooling(e.url(), now)) {
                return e;
            }
        }
        for (DanmakuEndpoint e : ENDPOINTS) {
            if (e.enabled()) {
                return e;
            }
        }
        return ENDPOINTS.get(0);
    }

    private static String normalizeBase(String url) {
        String s = url == null ? "" : url.trim();
        while (s.endsWith("/")) {
            s = s.substring(0, s.length() - 1);
        }
        return s;
    }

    /** 自定义源的显示名兜底：host（去 www. 前缀）。 */
    private static String hostLabel(String base) {
        try {
            String host = java.net.URI.create(base).getHost();
            if (host != null) {
                return host.replaceFirst("(?i)^www\\.", "");
            }
        } catch (Exception ignore) {
            // 地址异常时退回原文
        }
        return base;
    }

    // ---- 会话级冷却（进程重启即重置）：失败 → 冷却跳过，避免每次搜索都白等死链超时

    private record FailState(int n, long until) {
    }

    private final Map<String, FailState> fails = new ConcurrentHashMap<>();

    private boolean isCooling(String url, long now) {
        FailState f = fails.get(url);
        return f != null && f.until() > now;
    }

    private void markFail(String url) {
        fails.compute(url, (k, old) -> {
            int n = old == null ? 1 : old.n() + 1;
            return new FailState(n, System.currentTimeMillis() + (n <= 1 ? FIRST_COOLDOWN_MS : REPEAT_COOLDOWN_MS));
        });
    }

    private void markOk(String url) {
        fails.remove(url);
    }

    /** 搜索候选项（内部用）。 */
    private record AnimeHit(long animeId, long bangumiId, String title, String kind,
                            int episodeCount, String source, String sourceName) {
    }
}
