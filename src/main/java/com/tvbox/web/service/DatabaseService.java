package com.tvbox.web.service;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 嵌入式 SQLite 数据库：负责建库建表与提供连接。
 *
 * <p>数据库文件放在 {@code <app.cache-dir>/playhub.db}，随应用一起自成一体，
 * 不需要外部数据库服务。
 *
 * <p>表结构要点：
 * <ul>
 *   <li>{@code users}：账号表，密码只存 BCrypt 哈希。</li>
 *   <li>{@code play_records}：播放记录，<b>一行代表一条播放线路</b>
 *       （同一视频在不同站点/不同线路各占一行），
 *       唯一键 {@code (user_id, source_uid, vod_id, flag_name)} 让进度可原地更新。</li>
 * </ul>
 *
 * <p>SQLite 是单写者模型，这里启用 WAL 并把写操作串行化（见 {@link #writeLock()}），
 * 避免并发写出现 {@code database is locked}。
 */
@Service
public class DatabaseService {

    private static final Logger log = LoggerFactory.getLogger(DatabaseService.class);

    private final Path dbFile;
    private final String jdbcUrl;
    private final Object writeLock = new Object();

    public DatabaseService(@Value("${app.cache-dir:.cache/tvbox}") String cacheDir) {
        Path dir = Paths.get(cacheDir == null || cacheDir.isBlank() ? ".cache/tvbox" : cacheDir);
        this.dbFile = dir.resolve("playhub.db").toAbsolutePath();
        this.jdbcUrl = "jdbc:sqlite:" + dbFile;
    }

    @PostConstruct
    public void init() throws IOException, SQLException {
        Files.createDirectories(dbFile.getParent());
        try (Connection conn = open(); Statement st = conn.createStatement()) {
            // WAL 让读写可以并行，显著降低「锁表」概率
            st.execute("PRAGMA journal_mode=WAL");
            st.execute("PRAGMA foreign_keys=ON");
            st.execute("""
                    CREATE TABLE IF NOT EXISTS users (
                        id            INTEGER PRIMARY KEY AUTOINCREMENT,
                        username      TEXT    NOT NULL UNIQUE,
                        password_hash TEXT    NOT NULL,
                        role          TEXT    NOT NULL DEFAULT 'user',
                        created_at    INTEGER NOT NULL
                    )
                    """);
            // 兼容早期版本的库：没有 role 列时补上
            ensureColumn(st, "users", "role", "TEXT NOT NULL DEFAULT 'user'");
            // 一行 = 一条线路；同一视频同一条线路只保留一行，进度原地更新
            st.execute("""
                    CREATE TABLE IF NOT EXISTS play_records (
                        id            INTEGER PRIMARY KEY AUTOINCREMENT,
                        user_id       INTEGER NOT NULL,
                        source_uid    TEXT    NOT NULL,
                        vod_id        TEXT    NOT NULL,
                        title         TEXT,
                        poster        TEXT,
                        flag_name     TEXT    NOT NULL,
                        episode_index INTEGER NOT NULL DEFAULT 0,
                        episode_name  TEXT,
                        url           TEXT,
                        position      INTEGER NOT NULL DEFAULT 0,
                        duration      INTEGER NOT NULL DEFAULT 0,
                        updated_at    INTEGER NOT NULL,
                        UNIQUE (user_id, source_uid, vod_id, flag_name)
                    )
                    """);
            st.execute("CREATE INDEX IF NOT EXISTS idx_records_user_time "
                    + "ON play_records(user_id, updated_at DESC)");
            st.execute("CREATE INDEX IF NOT EXISTS idx_records_user_vod "
                    + "ON play_records(user_id, source_uid, vod_id)");

            // 片源库：一条 = 一个片源（TVBox 配置里的一个 site），全局共享
            st.execute("""
                    CREATE TABLE IF NOT EXISTS sources (
                        id            INTEGER PRIMARY KEY AUTOINCREMENT,
                        uid           TEXT    NOT NULL UNIQUE,
                        api           TEXT    NOT NULL,
                        name          TEXT,
                        type          INTEGER NOT NULL DEFAULT 3,
                        ext           TEXT,
                        jar           TEXT,
                        source_key    TEXT,
                        play_url      TEXT,
                        categories    TEXT,
                        searchable    INTEGER NOT NULL DEFAULT 1,
                        quick_search  INTEGER NOT NULL DEFAULT 1,
                        filterable    INTEGER NOT NULL DEFAULT 1,
                        enabled       INTEGER NOT NULL DEFAULT 1,
                        sort_order    INTEGER NOT NULL DEFAULT 0,
                        created_at    INTEGER NOT NULL,
                        updated_at    INTEGER NOT NULL
                    )
                    """);
            st.execute("CREATE INDEX IF NOT EXISTS idx_sources_enabled "
                    + "ON sources(enabled, sort_order)");

            // 用户勾选了哪些片源；没有记录时视为「全部启用」
            st.execute("""
                    CREATE TABLE IF NOT EXISTS user_source_choice (
                        user_id   INTEGER NOT NULL,
                        source_id INTEGER NOT NULL,
                        PRIMARY KEY (user_id, source_id)
                    )
                    """);
        }
        log.info("[DB] SQLite 就绪: {}", dbFile);
    }

    /** 新建一个连接（SQLite 打开开销极小）。 */
    public Connection open() throws SQLException {
        Connection conn = DriverManager.getConnection(jdbcUrl);
        try (Statement st = conn.createStatement()) {
            st.execute("PRAGMA busy_timeout=5000");
        }
        return conn;
    }

    /** 表里没有该列时补上（SQLite 没有 ADD COLUMN IF NOT EXISTS）。 */
    private void ensureColumn(Statement st, String table, String column, String definition)
            throws SQLException {
        boolean exists = false;
        try (var rs = st.executeQuery("PRAGMA table_info(" + table + ")")) {
            while (rs.next()) {
                if (column.equalsIgnoreCase(rs.getString("name"))) {
                    exists = true;
                    break;
                }
            }
        }
        if (!exists) {
            st.execute("ALTER TABLE " + table + " ADD COLUMN " + column + " " + definition);
            log.info("[DB] 已为 {} 补充列 {}", table, column);
        }
    }

    /** 写操作串行化令牌，所有写事务必须持有它。 */
    public Object writeLock() {
        return writeLock;
    }

    public Path getDbFile() {
        return dbFile;
    }
}
