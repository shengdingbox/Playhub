package com.tvbox.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 播放记录服务。
 *
 * <p><b>数据模型的要点：一行 = 一条线路。</b>
 * 同一个视频（source_uid + vod_id）在不同线路（flag_name）下各占一行，
 * 由唯一键 {@code (user_id, source_uid, vod_id, flag_name)} 保证不重复，
 * 播放进度原地更新。因此不再把整条 detail（含所有线路）塞进一条记录里。
 */
@Service
public class PlayRecordService {

    private static final Logger log = LoggerFactory.getLogger(PlayRecordService.class);

    private final DatabaseService db;

    public PlayRecordService(DatabaseService db) {
        this.db = db;
    }

    /**
     * 一条线路级播放记录。
     *
     * @param flagName     线路名（如「量子资源」），与视频一起构成记录的唯一标识
     * @param episodeIndex 该线路下已播到的集数下标
     * @param position     播放进度（秒），0 表示未开始
     * @param duration     总时长（秒），0 表示未知
     */
    public record Record(
            Long id,
            String sourceUid,
            String vodId,
            String title,
            String poster,
            String flagName,
            int episodeIndex,
            String episodeName,
            String url,
            int position,
            int duration,
            long updatedAt
    ) {
    }

    /** 列出该用户的全部线路级记录，最近播放的在前。 */
    public List<Record> list(long userId, int limit) throws SQLException {
        int cap = Math.max(1, Math.min(limit, 2000));
        String sql = """
                SELECT id, source_uid, vod_id, title, poster, flag_name,
                       episode_index, episode_name, url, position, duration, updated_at
                  FROM play_records
                 WHERE user_id = ?
                 ORDER BY updated_at DESC
                 LIMIT ?
                """;
        List<Record> out = new ArrayList<>();
        try (Connection conn = db.open(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, userId);
            ps.setInt(2, cap);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    out.add(new Record(
                            rs.getLong("id"),
                            rs.getString("source_uid"),
                            rs.getString("vod_id"),
                            rs.getString("title"),
                            rs.getString("poster"),
                            rs.getString("flag_name"),
                            rs.getInt("episode_index"),
                            rs.getString("episode_name"),
                            rs.getString("url"),
                            rs.getInt("position"),
                            rs.getInt("duration"),
                            rs.getLong("updated_at")));
                }
            }
        }
        return out;
    }

    /** 新增或更新一条线路记录（同一视频同一线路只占一行）。 */
    public void upsert(long userId, Record r) throws SQLException {
        requireText(r.sourceUid(), "sourceUid");
        requireText(r.vodId(), "vodId");
        requireText(r.flagName(), "flagName");

        String sql = """
                INSERT INTO play_records
                    (user_id, source_uid, vod_id, title, poster, flag_name,
                     episode_index, episode_name, url, position, duration, updated_at)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                ON CONFLICT(user_id, source_uid, vod_id, flag_name) DO UPDATE SET
                    title         = excluded.title,
                    poster        = excluded.poster,
                    episode_index = excluded.episode_index,
                    episode_name  = excluded.episode_name,
                    url           = excluded.url,
                    position      = excluded.position,
                    duration      = excluded.duration,
                    updated_at    = excluded.updated_at
                """;
        synchronized (db.writeLock()) {
            try (Connection conn = db.open(); PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setLong(1, userId);
                ps.setString(2, r.sourceUid());
                ps.setString(3, r.vodId());
                ps.setString(4, r.title());
                ps.setString(5, r.poster());
                ps.setString(6, r.flagName());
                ps.setInt(7, Math.max(0, r.episodeIndex()));
                ps.setString(8, r.episodeName());
                ps.setString(9, r.url());
                ps.setInt(10, Math.max(0, r.position()));
                ps.setInt(11, Math.max(0, r.duration()));
                ps.setLong(12, r.updatedAt() > 0 ? r.updatedAt() : System.currentTimeMillis());
                ps.executeUpdate();
            }
        }
    }

    /**
     * 批量导入（用于把浏览器 localStorage 里的旧历史一次性迁进账号）。
     * 返回实际写入的条数；单条失败不影响其它条。
     */
    public int importBatch(long userId, List<Record> records) {
        if (records == null || records.isEmpty()) {
            return 0;
        }
        int ok = 0;
        for (Record r : records) {
            try {
                upsert(userId, r);
                ok++;
            } catch (Exception ex) {
                log.debug("[Record] 跳过无效记录: {}", ex.getMessage());
            }
        }
        log.info("[Record] 批量导入完成: 成功 {} / 共 {}", ok, records.size());
        return ok;
    }

    public boolean delete(long userId, long id) throws SQLException {
        synchronized (db.writeLock()) {
            try (Connection conn = db.open();
                 PreparedStatement ps = conn.prepareStatement(
                         "DELETE FROM play_records WHERE user_id = ? AND id = ?")) {
                ps.setLong(1, userId);
                ps.setLong(2, id);
                return ps.executeUpdate() > 0;
            }
        }
    }

    /** 按视频删除（某部剧的所有线路一起清掉）。 */
    public int deleteByVideo(long userId, String sourceUid, String vodId) throws SQLException {
        synchronized (db.writeLock()) {
            try (Connection conn = db.open();
                 PreparedStatement ps = conn.prepareStatement(
                         "DELETE FROM play_records WHERE user_id = ? AND source_uid = ? AND vod_id = ?")) {
                ps.setLong(1, userId);
                ps.setString(2, sourceUid);
                ps.setString(3, vodId);
                return ps.executeUpdate();
            }
        }
    }

    public int clear(long userId) throws SQLException {
        synchronized (db.writeLock()) {
            try (Connection conn = db.open();
                 PreparedStatement ps = conn.prepareStatement(
                         "DELETE FROM play_records WHERE user_id = ?")) {
                ps.setLong(1, userId);
                return ps.executeUpdate();
            }
        }
    }

    private static void requireText(String value, String field) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(field + " 不能为空");
        }
    }
}
