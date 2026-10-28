package com.tvbox.web.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tvbox.web.model.ConfigPayload;
import com.tvbox.web.model.SiteDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 片源库服务。
 *
 * <p>一条记录 = 一个片源（TVBox 配置里的一个 site），全局共享：
 * 由管理员导入维护，普通用户从中勾选自己要用哪些。
 *
 * <p>导入支持两种方式：直接粘贴 TVBox 配置 JSON，或给一个配置 URL 由后端拉取。
 * 重复导入同一片源不会产生重复行 —— uid 由 {@code api + name} 稳定派生。
 */
@Service
public class SourceService {

    private static final Logger log = LoggerFactory.getLogger(SourceService.class);

    private final DatabaseService db;
    private final ObjectMapper mapper = new ObjectMapper();

    public SourceService(DatabaseService db) {
        this.db = db;
    }

    /** 片源库中的一行。 */
    public record SourceRow(
            long id,
            String uid,
            String api,
            String name,
            int type,
            String ext,
            String jar,
            String sourceKey,
            String playUrl,
            String categories,
            int searchable,
            int quickSearch,
            int filterable,
            boolean enabled,
            int sortOrder,
            long updatedAt
    ) {
    }

    /** 导入结果统计。 */
    public record ImportResult(int total, int inserted, int updated, int skipped) {
    }

    // ── 导入 ────────────────────────────────────────────────

    /** 从 TVBox 配置 JSON 文本导入。 */
    public ImportResult importFromJson(String json) throws Exception {
        if (!StringUtils.hasText(json)) {
            throw new IllegalArgumentException("JSON 内容为空");
        }
        ConfigPayload payload = mapper.readValue(json, ConfigPayload.class);
        List<SiteDefinition> sites = payload.getSites();
        if (sites == null || sites.isEmpty()) {
            throw new IllegalArgumentException("该 JSON 里没有找到 sites 片源列表");
        }
        return saveSites(sites);
    }

    /** 从配置 URL 导入（后端负责下载并解析）。 */
    public ImportResult importFromUrl(String url, ConfigService configService) throws Exception {
        if (!StringUtils.hasText(url)) {
            throw new IllegalArgumentException("URL 不能为空");
        }
        // 用一个临时会话装载，避免污染真实用户的配置状态
        ConfigPayload payload = configService.loadConfig("__import__" + System.nanoTime(), url.trim());
        List<SiteDefinition> sites = payload == null ? null : payload.getSites();
        if (sites == null || sites.isEmpty()) {
            throw new IllegalArgumentException("该地址返回的配置里没有 sites 片源列表");
        }
        return saveSites(sites);
    }

    private ImportResult saveSites(List<SiteDefinition> sites) throws SQLException {
        int inserted = 0;
        int updated = 0;
        int skipped = 0;
        long now = System.currentTimeMillis();

        synchronized (db.writeLock()) {
            try (Connection conn = db.open()) {
                int order = 0;
                for (SiteDefinition site : sites) {
                    String api = site.getApi();
                    String name = site.getName() == null ? "" : site.getName();
                    if (!StringUtils.hasText(api)) {
                        // 没有 api 的条目（如纯 JS 直播源占位）无法执行，直接跳过
                        skipped++;
                        continue;
                    }
                    String uid = stableUid(api, name);
                    boolean exists = existsByUid(conn, uid);
                    upsert(conn, uid, site, order++, now, exists);
                    if (exists) {
                        updated++;
                    } else {
                        inserted++;
                    }
                }
            }
        }
        log.info("[Source] 导入完成: 新增 {} 更新 {} 跳过 {} / 共 {}",
                inserted, updated, skipped, sites.size());
        return new ImportResult(sites.size(), inserted, updated, skipped);
    }

    private void upsert(Connection conn, String uid, SiteDefinition site, int order,
                        long now, boolean exists) throws SQLException {
        String categories = null;
        try {
            if (site.getCategories() != null && !site.getCategories().isEmpty()) {
                categories = mapper.writeValueAsString(site.getCategories());
            }
        } catch (Exception ignore) {
            // 分类序列化失败不影响导入
        }
        String ext = site.getExtText();

        if (exists) {
            String sql = """
                    UPDATE sources SET api=?, name=?, type=?, ext=?, jar=?, source_key=?,
                        play_url=?, categories=?, searchable=?, quick_search=?, filterable=?,
                        sort_order=?, updated_at=?
                     WHERE uid=?
                    """;
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                bindSite(ps, site, ext, categories, order, now);
                ps.setString(13, uid);
                ps.executeUpdate();
            }
        } else {
            String sql = """
                    INSERT INTO sources
                        (uid, api, name, type, ext, jar, source_key, play_url, categories,
                         searchable, quick_search, filterable, sort_order, created_at, updated_at)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                    """;
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, uid);
                ps.setString(2, site.getApi());
                ps.setString(3, site.getName());
                ps.setInt(4, site.getType());
                ps.setString(5, ext);
                ps.setString(6, site.getJar());
                ps.setString(7, site.getKey());
                ps.setString(8, site.getPlayUrl());
                ps.setString(9, categories);
                ps.setInt(10, site.getSearchable());
                ps.setInt(11, site.getQuickSearch());
                ps.setInt(12, site.getFilterable());
                ps.setInt(13, order);
                ps.setLong(14, now);
                ps.setLong(15, now);
                ps.executeUpdate();
            }
        }
    }

    private void bindSite(PreparedStatement ps, SiteDefinition site, String ext,
                          String categories, int order, long now) throws SQLException {
        ps.setString(1, site.getApi());
        ps.setString(2, site.getName());
        ps.setInt(3, site.getType());
        ps.setString(4, ext);
        ps.setString(5, site.getJar());
        ps.setString(6, site.getKey());
        ps.setString(7, site.getPlayUrl());
        ps.setString(8, categories);
        ps.setInt(9, site.getSearchable());
        ps.setInt(10, site.getQuickSearch());
        ps.setInt(11, site.getFilterable());
        ps.setInt(12, order);
        ps.setLong(13, now);
    }

    // ── 查询 ────────────────────────────────────────────────

    public List<SourceRow> list(boolean includeDisabled) throws SQLException {
        String sql = """
                SELECT id, uid, api, name, type, ext, jar, source_key, play_url, categories,
                       searchable, quick_search, filterable, enabled, sort_order, updated_at
                  FROM sources
                """
                + (includeDisabled ? "" : " WHERE enabled = 1")
                + " ORDER BY sort_order ASC, id ASC";
        List<SourceRow> out = new ArrayList<>();
        try (Connection conn = db.open(); PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                out.add(new SourceRow(
                        rs.getLong("id"), rs.getString("uid"), rs.getString("api"),
                        rs.getString("name"), rs.getInt("type"), rs.getString("ext"),
                        rs.getString("jar"), rs.getString("source_key"), rs.getString("play_url"),
                        rs.getString("categories"), rs.getInt("searchable"),
                        rs.getInt("quick_search"), rs.getInt("filterable"),
                        rs.getInt("enabled") != 0, rs.getInt("sort_order"),
                        rs.getLong("updated_at")));
            }
        }
        return out;
    }

    public int count(boolean onlyEnabled) throws SQLException {
        String sql = "SELECT COUNT(*) FROM sources" + (onlyEnabled ? " WHERE enabled = 1" : "");
        try (Connection conn = db.open(); PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getInt(1) : 0;
        }
    }

    // ── 维护（仅管理员）─────────────────────────────────────

    public boolean delete(long id) throws SQLException {
        synchronized (db.writeLock()) {
            try (Connection conn = db.open()) {
                try (PreparedStatement ps = conn.prepareStatement(
                        "DELETE FROM user_source_choice WHERE source_id = ?")) {
                    ps.setLong(1, id);
                    ps.executeUpdate();
                }
                try (PreparedStatement ps = conn.prepareStatement("DELETE FROM sources WHERE id = ?")) {
                    ps.setLong(1, id);
                    return ps.executeUpdate() > 0;
                }
            }
        }
    }

    public boolean setEnabled(long id, boolean enabled) throws SQLException {
        synchronized (db.writeLock()) {
            try (Connection conn = db.open();
                 PreparedStatement ps = conn.prepareStatement(
                         "UPDATE sources SET enabled = ?, updated_at = ? WHERE id = ?")) {
                ps.setInt(1, enabled ? 1 : 0);
                ps.setLong(2, System.currentTimeMillis());
                ps.setLong(3, id);
                return ps.executeUpdate() > 0;
            }
        }
    }

    public int clearAll() throws SQLException {
        synchronized (db.writeLock()) {
            try (Connection conn = db.open()) {
                try (PreparedStatement ps = conn.prepareStatement("DELETE FROM user_source_choice")) {
                    ps.executeUpdate();
                }
                try (PreparedStatement ps = conn.prepareStatement("DELETE FROM sources")) {
                    return ps.executeUpdate();
                }
            }
        }
    }

    // ── 用户勾选 ────────────────────────────────────────────

    /** 该用户勾选的片源 id；返回空集合表示「未选择，等同于全部启用」。 */
    public Set<Long> getChoices(long userId) throws SQLException {
        Set<Long> out = new LinkedHashSet<>();
        try (Connection conn = db.open();
             PreparedStatement ps = conn.prepareStatement(
                     "SELECT source_id FROM user_source_choice WHERE user_id = ?")) {
            ps.setLong(1, userId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    out.add(rs.getLong(1));
                }
            }
        }
        return out;
    }

    /** 覆盖式保存用户勾选；传空列表表示恢复「全部启用」的默认行为。 */
    public void setChoices(long userId, List<Long> sourceIds) throws SQLException {
        synchronized (db.writeLock()) {
            try (Connection conn = db.open()) {
                try (PreparedStatement del = conn.prepareStatement(
                        "DELETE FROM user_source_choice WHERE user_id = ?")) {
                    del.setLong(1, userId);
                    del.executeUpdate();
                }
                if (sourceIds == null || sourceIds.isEmpty()) {
                    return;
                }
                String sql = "INSERT OR IGNORE INTO user_source_choice (user_id, source_id) VALUES (?, ?)";
                try (PreparedStatement ins = conn.prepareStatement(sql)) {
                    for (Long id : sourceIds) {
                        if (id == null) {
                            continue;
                        }
                        ins.setLong(1, userId);
                        ins.setLong(2, id);
                        ins.addBatch();
                    }
                    ins.executeBatch();
                }
            }
        }
    }

    // ── 给配置服务用 ────────────────────────────────────────

    /** 把片源库（启用中的）转成 SiteDefinition 列表，供 ConfigService 构建 payload。 */
    public List<SiteDefinition> buildSites() throws SQLException {
        List<SiteDefinition> sites = new ArrayList<>();
        for (SourceRow row : list(false)) {
            SiteDefinition site = new SiteDefinition();
            site.setUid(row.uid());
            site.setApi(row.api());
            site.setName(row.name() == null ? "" : row.name());
            site.setType(row.type());
            site.setJar(row.jar() == null ? "" : row.jar());
            site.setKey(row.sourceKey() == null ? "" : row.sourceKey());
            site.setPlayUrl(row.playUrl() == null ? "" : row.playUrl());
            site.setSearchable(row.searchable());
            site.setQuickSearch(row.quickSearch());
            site.setFilterable(row.filterable());
            if (StringUtils.hasText(row.ext())) {
                try {
                    site.setExt(mapper.readTree(row.ext()));
                } catch (Exception e) {
                    // ext 不是合法 JSON 时按纯文本放入
                    site.setExt(mapper.getNodeFactory().textNode(row.ext()));
                }
            }
            sites.add(site);
        }
        return sites;
    }

    /** 片源对外展示用的精简结构（不含 ext 这类敏感/冗长字段）。 */
    public Map<String, Object> toPublicMap(SourceRow row) {
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("id", row.id());
        m.put("uid", row.uid());
        m.put("api", row.api());
        m.put("name", row.name());
        m.put("type", row.type());
        m.put("enabled", row.enabled());
        m.put("searchable", row.searchable());
        m.put("quickSearch", row.quickSearch());
        m.put("filterable", row.filterable());
        m.put("hasExt", StringUtils.hasText(row.ext()));
        m.put("updatedAt", row.updatedAt());
        return m;
    }

    /** uid 由 api + name 稳定派生，重复导入同一片源只会更新。 */
    private static String stableUid(String api, String name) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest((api + "|" + name).getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder("db");
            for (int i = 0; i < 8; i++) {
                sb.append(String.format("%02x", digest[i]));
            }
            return sb.toString();
        } catch (Exception e) {
            return "db" + Math.abs((api + "|" + name).hashCode());
        }
    }

    private static boolean existsByUid(Connection conn, String uid) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement("SELECT 1 FROM sources WHERE uid = ?")) {
            ps.setString(1, uid);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    /** 把任意 JSON 片段压缩成单行文本（仅用于日志/调试）。 */
    static String compact(JsonNode node) {
        return node == null ? "" : node.toString();
    }
}
