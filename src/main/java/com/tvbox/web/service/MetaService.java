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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 豆瓣元数据服务（Win-box 移植，参考 {@code src/main/meta/doubanProvider.ts / doubanExtra.ts / domesticDiscover.ts}）。
 *
 * <p>端点口径（实测，勿凭印象改）：
 * <ul>
 *   <li>条目 id：{@code https://movie.douban.com/j/subject_suggest?q=<片名>} —— 未登录可用，
 *       裸数组 [{id,title,year,type,img,sub_title}]。rexxar 的 /search 现已 403 need_login，不能用它取 id。</li>
 *   <li>详情：{@code m.douban.com/rexxar/api/v2/{movie|tv}/{id}?for_mobile=1}（intro 梗概/演员/类型/封面）。</li>
 *   <li>相关推荐：{@code {movie|tv}/{id}/recommendations?start=0&count=12&for_mobile=1}，裸数组。</li>
 *   <li>影评：{@code {movie|tv}/{id}/reviews?start=0&count=6&order=hot&for_mobile=1}。</li>
 *   <li>榜单：{@code subject_collection/{section}/items?start=0&count=20}。</li>
 * </ul>
 *
 * <p>豆瓣有风控：<b>连续 3 次 403/429 → 熔断 10 分钟</b>，熔断期内不发请求直接返回空数据。
 * 所有方法口径一致：<b>失败/熔断/未命中一律返回 null 或空列表，绝不抛错</b>。
 *
 * <p>封面统一包装为本机 {@code /proxy?url=…} 中继地址（豆瓣图床有防盗链/部分地区 DNS 污染，
 * 浏览器直连易图裂；中继带 Referer: https://m.douban.com/）。
 */
@Service
public class MetaService {

    private static final Logger log = LoggerFactory.getLogger(MetaService.class);

    private static final String SUGGEST_API = "https://movie.douban.com/j/subject_suggest";
    private static final String REX = "https://m.douban.com/rexxar/api/v2";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) "
            + "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0 Safari/537.36";
    private static final String REFERER = "https://m.douban.com/";

    private static final int BREAKER_THRESHOLD = 3;
    private static final long BREAKER_COOLDOWN_MS = 10 * 60 * 1000L;
    private static final long CACHE_TTL_MS = 6 * 3600 * 1000L;

    /** 相关推荐条数上限 / 影评条数上限（详情页下方列表，取少而精）。 */
    private static final int MAX_RECS = 8;
    private static final int MAX_REVIEWS = 6;
    /** 单条梗概截断长度（一行式）。 */
    private static final int OVERVIEW_MAX = 120;
    private static final int ABSTRACT_MAX = 220;
    private static final int PAGE_SIZE = 20;

    /** 发现页榜单分区（豆瓣公开榜单；编号即 subject_collection id）。 */
    private static final List<String[]> SECTIONS = List.of(
            new String[]{"movie_hot_gaia", "豆瓣热门电影", "movie"},
            new String[]{"movie_showing", "正在上映", "movie"},
            new String[]{"movie_top250", "豆瓣高分电影", "movie"},
            new String[]{"tv_hot", "豆瓣热门剧集", "tv"},
            new String[]{"tv_chinese_best_weekly", "华语剧集口碑榜", "tv"}
    );

    private final ObjectMapper objectMapper;
    private final OkHttpClient client = HttpClientFactory.createOkHttp(8, 15);
    private final ExecutorService pool = Executors.newCachedThreadPool(r -> {
        Thread t = new Thread(r, "meta-io");
        t.setDaemon(true);
        return t;
    });

    public MetaService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @PreDestroy
    void shutdown() {
        pool.shutdownNow();
    }

    // ---------------------------------------------------------------- meta/search：按片名搜索

    /**
     * 豆瓣搜索（标题匹配）→ MetaHit {title, year, poster, overview, type}。
     * 命中策略（先严后宽）：同名+同年 → 仅同名 → 互含。失败/未命中返回 null。
     */
    public Map<String, Object> search(String name, String year) {
        String n = name == null ? "" : name.trim();
        if (n.isEmpty() || breakerOpen()) {
            return null;
        }
        SubjectRow row = pickSubject(n, year);
        if (row == null) {
            return null;
        }
        Map<String, Object> hit = new LinkedHashMap<>();
        hit.put("title", row.title());
        hit.put("year", parseYear(row.year()));
        hit.put("poster", relayImg(row.img()));
        hit.put("overview", row.subTitle());
        hit.put("type", row.mediaType());
        hit.put("doubanId", row.id());
        return hit;
    }

    // ---------------------------------------------------------------- meta/extra：详情补充（演员/简介/封面）

    /**
     * 详情补充 → {cast, genres, recommendations, directors, overview, poster, rating, ...}。
     * 数据来自 rexxar 条目详情 + 相关推荐；失败返回 null（内存缓存 6h）。
     */
    public Map<String, Object> extra(String name, String year) {
        String n = name == null ? "" : name.trim();
        if (n.isEmpty()) {
            return null;
        }
        String cacheKey = "extra|" + n + "|" + (year == null ? "" : year);
        Map<String, Object> cached = getCache(extraCache, cacheKey);
        if (cached != null || extraCache.containsKey(cacheKey)) {
            return cached;
        }
        Map<String, Object> result = loadExtra(n, year);
        putCache(extraCache, cacheKey, result);
        return result;
    }

    private Map<String, Object> loadExtra(String name, String year) {
        if (breakerOpen()) {
            return null;
        }
        SubjectRow ref = pickSubject(name, year);
        if (ref == null) {
            return null;
        }
        JsonNode detail = rexxarJson(ref.mediaType() + "/" + ref.id() + "?for_mobile=1");
        if (detail == null) {
            return null;
        }
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("id", ref.id());
        out.put("doubanId", ref.id());
        out.put("mediaType", ref.mediaType());
        out.put("title", text(detail, "title", ref.title()));
        out.put("year", parseYear(text(detail, "year", ref.year())));
        out.put("overview", text(detail, "intro", ""));
        out.put("poster", relayImg(nested(detail, "pic", "large", "normal")));
        double rating = detail.path("rating").path("value").asDouble(0);
        if (rating > 0) {
            out.put("rating", rating);
        }
        out.put("subtitle", text(detail, "card_subtitle", ""));
        out.put("cast", parseNames(detail.get("actors"), detail.get("celebrities"), true));
        out.put("directors", parseNames(detail.get("directors"), null, false));
        out.put("genres", parseGenres(detail.get("genres")));
        // 相关推荐（尽力而为；失败即空数组）
        JsonNode recsJson = rexxarJson(ref.mediaType() + "/" + ref.id() + "/recommendations?start=0&count=12&for_mobile=1");
        List<Map<String, Object>> recs = new ArrayList<>();
        for (Map<String, Object> item : parseRecommendations(recsJson)) {
            if (recs.size() >= MAX_RECS) {
                break;
            }
            Map<String, Object> r = new LinkedHashMap<>();
            r.put("title", item.get("title"));
            r.put("year", item.get("year"));
            r.put("poster", item.get("poster"));
            r.put("mediaType", item.get("mediaType"));
            r.put("doubanId", item.get("id"));
            recs.add(r);
        }
        out.put("recommendations", recs);
        log.info("[meta] extra「{}」→ cast={} recs={} (id={})", name,
                ((List<?>) out.get("cast")).size(), recs.size(), ref.id());
        return out;
    }

    // ---------------------------------------------------------------- meta/doubanExtra：相关推荐 + 豆瓣影评

    /**
     * 详情页「相关推荐 / 豆瓣影评」区块 → {id, recommendations, reviews}。
     * 推荐条目逐条补 intro 梗概（并发 4，失败即空串，UI 退用 subtitle）。失败返回 null（内存缓存 6h）。
     */
    public Map<String, Object> doubanExtra(String name, String year) {
        String n = name == null ? "" : name.trim();
        if (n.isEmpty()) {
            return null;
        }
        String cacheKey = "dbx|" + n + "|" + (year == null ? "" : year);
        Map<String, Object> cached = getCache(doubanExtraCache, cacheKey);
        if (cached != null || doubanExtraCache.containsKey(cacheKey)) {
            return cached;
        }
        Map<String, Object> result = loadDoubanExtra(n, year);
        putCache(doubanExtraCache, cacheKey, result);
        return result;
    }

    private Map<String, Object> loadDoubanExtra(String name, String year) {
        if (breakerOpen()) {
            return null;
        }
        SubjectRow ref = pickSubject(name, year);
        if (ref == null) {
            return null;
        }
        String base = ref.mediaType() + "/" + ref.id();
        // 推荐与影评并行取
        CompletableFuture<JsonNode> recFuture = CompletableFuture.supplyAsync(
                () -> rexxarJson(base + "/recommendations?start=0&count=12&for_mobile=1"), pool);
        CompletableFuture<JsonNode> reviewFuture = CompletableFuture.supplyAsync(
                () -> rexxarJson(base + "/reviews?start=0&count=" + MAX_REVIEWS + "&order=hot&for_mobile=1"), pool);
        JsonNode recJson = recFuture.join();
        JsonNode reviewJson = reviewFuture.join();

        List<Map<String, Object>> recommendations = parseRecommendations(recJson);
        if (recommendations.size() > MAX_RECS) {
            recommendations = new ArrayList<>(recommendations.subList(0, MAX_RECS));
        }
        List<Map<String, Object>> reviews = parseReviews(reviewJson);
        if (reviews.size() > MAX_REVIEWS) {
            reviews = new ArrayList<>(reviews.subList(0, MAX_REVIEWS));
        }
        // 推荐条目无 intro ⇒ 逐条取（并发 4；取不到留空，UI 用 subtitle 兜底）
        List<Map<String, Object>> recs = recommendations;
        List<CompletableFuture<Void>> introJobs = new ArrayList<>();
        Semaphore4 permits = new Semaphore4();
        for (Map<String, Object> item : recs) {
            introJobs.add(CompletableFuture.runAsync(() -> {
                permits.acquire();
                try {
                    JsonNode j = rexxarJson(item.get("mediaType") + "/" + item.get("id") + "?for_mobile=1");
                    item.put("overview", j == null ? "" : oneLine(text(j, "intro", ""), OVERVIEW_MAX));
                } finally {
                    permits.release();
                }
            }, pool));
        }
        for (CompletableFuture<Void> job : introJobs) {
            try {
                job.join();
            } catch (Exception ignore) {
                // 单条梗概失败不影响其它
            }
        }
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("id", ref.id());
        data.put("recommendations", recs);
        data.put("reviews", reviews);
        log.info("[meta] 豆瓣增强「{}」→ 推荐 {} 条 / 影评 {} 条（id={}）", name, recs.size(), reviews.size(), ref.id());
        return data;
    }

    /** 极简信号量（并发 4 取梗概用；java.util.concurrent.Semaphore 的 checked 异常在这里太啰嗦）。 */
    private static final class Semaphore4 {
        private int permits = 4;

        synchronized void acquire() {
            while (permits <= 0) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            permits--;
        }

        synchronized void release() {
            permits++;
            notifyAll();
        }
    }

    // ---------------------------------------------------------------- meta/discover：发现页榜单

    /**
     * 发现页榜单。{@code section} 为空 → 全部分区；否则只取该分区。
     * 内存缓存 6h（refresh=true 绕过）；单区失败跳过该分区，整体返回非空分区的列表（可能为空列表）。
     * 未知分区 id 抛 {@link IllegalArgumentException}（由 Controller 转成 ok:false）。
     */
    public List<Map<String, Object>> discover(String section, boolean refresh) {
        List<String[]> targets = new ArrayList<>();
        if (section != null && !section.isBlank()) {
            String wanted = section.trim();
            boolean known = false;
            for (String[] s : SECTIONS) {
                if (s[0].equals(wanted)) {
                    targets.add(s);
                    known = true;
                    break;
                }
            }
            if (!known) {
                throw new IllegalArgumentException("未知的榜单分区: " + wanted);
            }
        } else {
            targets.addAll(SECTIONS);
        }
        List<Map<String, Object>> out = new ArrayList<>();
        // 豆瓣分区串行取（并发冲击同一站点易触发风控）
        for (String[] s : targets) {
            List<Map<String, Object>> items = discoverSection(s[0], s[2], refresh);
            if (!items.isEmpty()) {
                Map<String, Object> sec = new LinkedHashMap<>();
                sec.put("id", s[0]);
                sec.put("title", s[1]);
                sec.put("items", items);
                out.add(sec);
            }
        }
        return out;
    }

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> discoverSection(String id, String mediaType, boolean refresh) {
        String cacheKey = "sec|" + id;
        if (!refresh) {
            Map<String, Object> cached = getCache(discoverCache, cacheKey);
            if (cached != null) {
                return (List<Map<String, Object>>) cached.get("items");
            }
        }
        JsonNode json = rexxarJson("subject_collection/" + id + "/items?start=0&count=" + PAGE_SIZE);
        List<Map<String, Object>> items = json == null ? List.of() : parseCollectionItems(json, mediaType);
        if (!items.isEmpty()) {
            Map<String, Object> holder = new LinkedHashMap<>();
            holder.put("items", items);
            putCache(discoverCache, cacheKey, holder);
            return items;
        }
        // 本次取失败：有旧缓存用旧的（ stale 兜底）
        Map<String, Object> stale = getCache(discoverCache, cacheKey);
        if (stale != null) {
            return (List<Map<String, Object>>) stale.get("items");
        }
        return List.of();
    }

    /** 解析 subject_collection 响应；丢弃 chart/ad 等条目，避免把「科幻榜」当成影片。 */
    private List<Map<String, Object>> parseCollectionItems(JsonNode json, String mediaType) {
        JsonNode list = json.has("subject_collection_items") ? json.get("subject_collection_items") : json.get("items");
        List<Map<String, Object>> out = new ArrayList<>();
        if (list == null || !list.isArray()) {
            return out;
        }
        Set<String> seen = new HashSet<>();
        for (JsonNode item : list) {
            String type = item.path("type").asText("");
            if (!type.isEmpty() && !type.equals(mediaType)) {
                continue;
            }
            String title = item.path("title").asText("").trim();
            String id = item.path("id").asText("").trim();
            if (title.isEmpty() || !seen.add(id.isEmpty() ? title : id)) {
                continue;
            }
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("title", title);
            m.put("year", parseYear(item.path("year").asText("")));
            String raw = nested(item, "pic", "large", "normal");
            if (raw.isEmpty()) {
                raw = nested(item, "cover", "url");
            }
            if (raw.isEmpty()) {
                raw = item.path("cover_url").asText("");
            }
            m.put("poster", relayImg(raw));
            m.put("mediaType", mediaType);
            if (id.matches("\\d+")) {
                m.put("doubanId", id);
            }
            out.add(m);
        }
        return out;
    }

    // ---------------------------------------------------------------- 豆瓣条目挑选（移植 pickDoubanSubject）

    private record SubjectRow(String id, String mediaType, String title, String year, String img, String subTitle) {
    }

    /**
     * subject_suggest → 当前片对应条目。分层（先严后宽）：① 同名+同年 → ② 仅同名 → ③ 互含
     * （源片名常带「第一季」「（2023）」等后缀）。第②层刻意忽略年份（豆瓣年份与源标注常差一年）。
     * 只接受 type=movie|tv 且 id 为纯数字的行。
     */
    private SubjectRow pickSubject(String name, String year) {
        HttpText resp = doubanGet(SUGGEST_API + "?q=" + URLEncoder.encode(name, StandardCharsets.UTF_8));
        if (resp.status() != 200) {
            if (resp.status() != 0) {
                log.debug("[meta] 豆瓣 suggest 失败 status={}", resp.status());
            }
            return null;
        }
        JsonNode rows = readJsonQuiet(resp.text());
        if (rows == null || !rows.isArray()) {
            return null;
        }
        List<SubjectRow> usable = new ArrayList<>();
        for (JsonNode r : rows) {
            String type = r.path("type").asText("");
            String id = r.path("id").asText("").trim();
            if ((!"movie".equals(type) && !"tv".equals(type)) || !id.matches("\\d{5,}")) {
                continue;
            }
            usable.add(new SubjectRow(id, type, r.path("title").asText("").trim(),
                    r.path("year").asText("").trim(), r.path("img").asText("").trim(),
                    r.path("sub_title").asText("").trim()));
        }
        if (usable.isEmpty()) {
            return null;
        }
        String want = normalizeTitle(name);
        String wantYear = year != null && year.matches("\\d{4}") ? year : "";
        if (!wantYear.isEmpty()) {
            for (SubjectRow r : usable) {
                if (normalizeTitle(r.title()).equals(want) && wantYear.equals(r.year())) {
                    return r;
                }
            }
        }
        for (SubjectRow r : usable) {
            if (normalizeTitle(r.title()).equals(want)) {
                return r;
            }
        }
        for (SubjectRow r : usable) {
            String t = normalizeTitle(r.title());
            if (!t.isEmpty() && (t.contains(want) || want.contains(t))) {
                return r;
            }
        }
        return null;
    }

    // ---------------------------------------------------------------- 响应解析（移植 doubanExtra.ts 纯函数）

    /** 相关推荐响应（裸数组或 {recommendations:[…]}）→ DoubanExtraItem 列表。 */
    private List<Map<String, Object>> parseRecommendations(JsonNode json) {
        JsonNode rows = json != null && json.isArray() ? json : (json != null ? json.get("recommendations") : null);
        List<Map<String, Object>> out = new ArrayList<>();
        if (rows == null || !rows.isArray()) {
            return out;
        }
        Set<String> seen = new HashSet<>();
        for (JsonNode raw : rows) {
            String id = raw.path("id").asText("").trim();
            String title = raw.path("title").asText("").trim();
            if (!id.matches("\\d{5,}") || title.isEmpty() || !seen.add(id)) {
                continue;
            }
            String subtitle = raw.path("card_subtitle").asText("").trim();
            double rating = raw.path("rating").path("value").asDouble(0);
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("id", id);
            m.put("title", title);
            m.put("year", parseYear(subtitle));
            m.put("poster", relayImg(nested(raw, "pic", "large", "normal")));
            m.put("overview", "");
            m.put("subtitle", subtitle);
            if (rating > 0) {
                m.put("rating", rating);
            }
            m.put("mediaType", "tv".equals(raw.path("type").asText("")) ? "tv" : "movie");
            m.put("url", raw.path("url").asText(raw.path("sharing_url").asText("")).trim());
            out.add(m);
        }
        return out;
    }

    /** 影评响应 {reviews:[…]} → DoubanReviewItem 列表。 */
    private List<Map<String, Object>> parseReviews(JsonNode json) {
        JsonNode rows = json == null ? null : json.get("reviews");
        List<Map<String, Object>> out = new ArrayList<>();
        if (rows == null || !rows.isArray()) {
            return out;
        }
        Set<String> seen = new HashSet<>();
        for (JsonNode raw : rows) {
            String id = raw.path("id").asText("").trim();
            String title = raw.path("title").asText("").trim();
            if (id.isEmpty() || title.isEmpty() || !seen.add(id)) {
                continue;
            }
            double rating = raw.path("rating").path("value").asDouble(0);
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("id", id);
            m.put("title", title);
            m.put("abstract", oneLine(raw.path("abstract").asText(""), ABSTRACT_MAX));
            if (rating > 0) {
                m.put("rating", rating);
            }
            m.put("useful", raw.path("useful_count").asInt(0));
            m.put("comments", raw.path("comments_count").asInt(0));
            String author = raw.path("user").path("name").asText("");
            if (author.isEmpty()) {
                author = raw.path("author").path("name").asText("");
            }
            m.put("author", author.trim());
            m.put("date", raw.path("create_time").asText("").trim());
            m.put("url", raw.path("url").asText(raw.path("sharing_url").asText("")).trim());
            out.add(m);
        }
        return out;
    }

    /** 演员/导演名解析：数组元素可能是 {name} 对象或纯字符串；cast 顺带带 character。 */
    private List<Map<String, Object>> parseNames(JsonNode primary, JsonNode fallback, boolean withCharacter) {
        JsonNode arr = primary != null && primary.isArray() && !primary.isEmpty() ? primary : fallback;
        List<Map<String, Object>> out = new ArrayList<>();
        if (arr == null || !arr.isArray()) {
            return out;
        }
        for (JsonNode n : arr) {
            String name = n.isTextual() ? n.asText("") : n.path("name").asText("");
            name = name.trim();
            if (name.isEmpty()) {
                continue;
            }
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("name", name);
            if (withCharacter && n.isObject()) {
                String character = n.path("character").asText("").trim();
                if (!character.isEmpty()) {
                    m.put("character", character);
                }
            }
            out.add(m);
            if (out.size() >= 12) {
                break;
            }
        }
        return out;
    }

    /** directors 只要名字串。 */
    private List<String> parseGenres(JsonNode genres) {
        List<String> out = new ArrayList<>();
        if (genres == null || !genres.isArray()) {
            return out;
        }
        for (JsonNode g : genres) {
            String name = g.isTextual() ? g.asText("") : g.path("name").asText("");
            name = name.trim();
            if (!name.isEmpty()) {
                out.add(name);
            }
        }
        return out;
    }

    // ---------------------------------------------------------------- rexxar / suggest HTTP + 熔断

    private record HttpText(int status, String text) {
    }

    /** 豆瓣通用 GET（UA/Referer 伪装）。网络异常返回 status=0，不抛错。 */
    private HttpText doubanGet(String url) {
        Request req = new Request.Builder().url(url)
                .header("accept", "application/json")
                .header("User-Agent", UA)
                .header("Referer", REFERER)
                .get().build();
        try (Response resp = client.newCall(req).execute()) {
            ResponseBody body = resp.body();
            return new HttpText(resp.code(), body == null ? "" : body.string());
        } catch (Exception ex) {
            return new HttpText(0, ex.getMessage() == null ? "network failed" : ex.getMessage());
        }
    }

    /** rexxar GET + 熔断计次（推荐/影评/详情/榜单共用）。非 200 / 解析失败返回 null。 */
    private JsonNode rexxarJson(String path) {
        HttpText resp = doubanGet(REX + "/" + path);
        if (resp.status() != 200) {
            if (resp.status() != 0 && noteStatus(resp.status())) {
                log.warn("[meta] 豆瓣 {} 连续风控(status={})，暂停豆瓣请求 {} 分钟",
                        path.split("\\?")[0], resp.status(), BREAKER_COOLDOWN_MS / 60000);
            }
            return null;
        }
        noteStatus(200);
        return readJsonQuiet(resp.text());
    }

    // ---- 熔断：连续 3 次 403/429 → 暂停 10 分钟；200 复位

    private final AtomicInteger consecutiveBlocked = new AtomicInteger();
    private volatile long breakerUntil = 0;

    private boolean breakerOpen() {
        return System.currentTimeMillis() < breakerUntil;
    }

    /** 记录一次响应状态：403/429 累加，200 复位。返回「本次是否刚触发熔断」。 */
    private boolean noteStatus(int status) {
        if (status == 200) {
            consecutiveBlocked.set(0);
            breakerUntil = 0;
            return false;
        }
        if (status == 403 || status == 429) {
            if (consecutiveBlocked.incrementAndGet() >= BREAKER_THRESHOLD) {
                breakerUntil = System.currentTimeMillis() + BREAKER_COOLDOWN_MS;
                return true;
            }
        }
        return false;
    }

    // ---------------------------------------------------------------- 内存缓存（6h；详情页来回进出不重复打豆瓣）

    private record CacheEntry(long at, Map<String, Object> data) {
    }

    private final Map<String, CacheEntry> extraCache = new ConcurrentHashMap<>();
    private final Map<String, CacheEntry> doubanExtraCache = new ConcurrentHashMap<>();
    private final Map<String, CacheEntry> discoverCache = new ConcurrentHashMap<>();

    private Map<String, Object> getCache(Map<String, CacheEntry> cache, String key) {
        CacheEntry e = cache.get(key);
        if (e == null) {
            return null;
        }
        if (System.currentTimeMillis() - e.at() >= CACHE_TTL_MS) {
            cache.remove(key);
            return null;
        }
        return e.data();
    }

    /** data 为 null 也缓存（缓存 miss，避免反复打豆瓣）；缓存表超过 500 条整体清空。 */
    private void putCache(Map<String, CacheEntry> cache, String key, Map<String, Object> data) {
        if (cache.size() > 500) {
            cache.clear();
        }
        cache.put(key, new CacheEntry(System.currentTimeMillis(), data));
    }

    // ---------------------------------------------------------------- 小工具

    private JsonNode readJsonQuiet(String body) {
        try {
            return objectMapper.readTree(body);
        } catch (Exception ex) {
            return null;
        }
    }

    private static String text(JsonNode node, String field, String fallback) {
        String v = node == null ? "" : node.path(field).asText("").trim();
        return v.isEmpty() ? fallback : v;
    }

    /** 取嵌套字段里第一个非空字符串，如 nested(item, "pic", "large", "normal")。 */
    private static String nested(JsonNode node, String... path) {
        JsonNode cur = node;
        for (String p : path) {
            if (cur == null) {
                return "";
            }
            JsonNode next = cur.get(p);
            if (next != null && next.isTextual() && !next.asText().trim().isEmpty()) {
                return next.asText().trim();
            }
            cur = next;
        }
        return "";
    }

    private static final Pattern TITLE_STRIP =
            Pattern.compile("[\\s\\p{P}\\p{S}]+", Pattern.UNICODE_CHARACTER_CLASS);

    /** 片名归一：NFKC + 小写 + 去空白/标点。 */
    private static String normalizeTitle(String value) {
        return TITLE_STRIP.matcher(Normalizer.normalize(value == null ? "" : value, Normalizer.Form.NFKC)
                .toLowerCase(Locale.ROOT)).replaceAll("");
    }

    private static final Pattern YEAR_RE = Pattern.compile("(19|20)\\d{2}");

    /** 年份字段统一成 int 或 ""（前端类型 number | ''）；也用于从 card_subtitle（「2023 / 美国 / 剧情」）提年。 */
    private static Object parseYear(String s) {
        if (s == null) {
            return "";
        }
        Matcher m = YEAR_RE.matcher(s);
        return m.find() ? Integer.valueOf(m.group()) : "";
    }

    /** 一行式截断（梗概/摘要共用）。 */
    private static String oneLine(String text, int max) {
        String s = (text == null ? "" : text).replaceAll("\\s+", " ").trim();
        return s.length() > max ? s.substring(0, max) + "…" : s;
    }

    /**
     * 封面统一包装为本机 /proxy 中继地址（带 Referer: https://m.douban.com/ 头，
     * 防豆瓣图床防盗链与 DNS 污染导致的图裂）。空/非 http 地址返回空串。
     */
    private static String relayImg(String url) {
        String u = url == null ? "" : url.trim();
        if (!u.startsWith("http")) {
            return "";
        }
        String headers = Base64.getEncoder()
                .encodeToString(("Referer: " + REFERER).getBytes(StandardCharsets.UTF_8));
        return "/proxy?url=" + URLEncoder.encode(u, StandardCharsets.UTF_8)
                + "&headers=" + URLEncoder.encode(headers, StandardCharsets.UTF_8);
    }
}
