package com.tvbox.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 账号服务：注册与校验。
 *
 * <p>密码只保存 BCrypt 哈希（自带随机盐），任何地方都不落明文。
 */
@Service
public class AuthService {

    private static final Logger log = LoggerFactory.getLogger(AuthService.class);

    /** Session 中保存当前登录用户 id 的键。 */
    public static final String SESSION_USER_ID = "playhub.userId";
    public static final String SESSION_USERNAME = "playhub.username";
    public static final String SESSION_ROLE = "playhub.role";

    public static final String ROLE_ADMIN = "admin";
    public static final String ROLE_USER = "user";

    private final DatabaseService db;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AuthService(DatabaseService db) {
        this.db = db;
    }

    /** 已认证的用户信息。 */
    public record AuthUser(long id, String username, String role) {
        public boolean isAdmin() {
            return ROLE_ADMIN.equalsIgnoreCase(role);
        }
    }

    /**
     * 确保存在一个管理员账号。
     *
     * <p>只在<b>该用户名不存在</b>时创建，已存在则不覆盖密码
     * （避免每次启动把管理员改过的密码重置回默认值）。
     *
     * @return true 表示本次新建了账号
     */
    public boolean ensureAdmin(String username, String password) throws SQLException {
        String name = normalizeUsername(username);
        synchronized (db.writeLock()) {
            try (Connection conn = db.open()) {
                Long existing = findIdByUsername(conn, name);
                if (existing != null) {
                    // 已存在：确保角色仍是 admin，但不动密码
                    try (PreparedStatement ps = conn.prepareStatement(
                            "UPDATE users SET role = ? WHERE id = ? AND role <> ?")) {
                        ps.setString(1, ROLE_ADMIN);
                        ps.setLong(2, existing);
                        ps.setString(3, ROLE_ADMIN);
                        ps.executeUpdate();
                    }
                    return false;
                }
                String sql = "INSERT INTO users (username, password_hash, role, created_at) "
                        + "VALUES (?, ?, ?, ?)";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, name);
                    ps.setString(2, encoder.encode(password));
                    ps.setString(3, ROLE_ADMIN);
                    ps.setLong(4, System.currentTimeMillis());
                    ps.executeUpdate();
                }
                log.info("[Auth] 已初始化管理员账号: {}", name);
                return true;
            }
        }
    }

    /** 按 id 查用户（含角色），供 /api/auth/me 使用。 */
    public AuthUser findById(long userId) throws SQLException {
        try (Connection conn = db.open();
             PreparedStatement ps = conn.prepareStatement(
                     "SELECT id, username, role FROM users WHERE id = ?")) {
            ps.setLong(1, userId);
            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.next()) {
                    return null;
                }
                return new AuthUser(rs.getLong("id"), rs.getString("username"), rs.getString("role"));
            }
        }
    }

    /** 注册结果：成功返回用户（role=user），失败抛出带用户可读信息的异常。 */
    public AuthUser register(String username, String password) throws SQLException {
        String name = normalizeUsername(username);
        validatePassword(password);
        String hash = encoder.encode(password);

        synchronized (db.writeLock()) {
            try (Connection conn = db.open()) {
                if (findIdByUsername(conn, name) != null) {
                    throw new IllegalArgumentException("用户名已被占用");
                }
                String sql = "INSERT INTO users (username, password_hash, role, created_at) "
                        + "VALUES (?, ?, ?, ?)";
                try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                    ps.setString(1, name);
                    ps.setString(2, hash);
                    ps.setString(3, ROLE_USER);
                    ps.setLong(4, System.currentTimeMillis());
                    ps.executeUpdate();
                    try (ResultSet keys = ps.getGeneratedKeys()) {
                        if (keys.next()) {
                            long id = keys.getLong(1);
                            log.info("[Auth] 新用户注册: {} (id={})", name, id);
                            return new AuthUser(id, name, ROLE_USER);
                        }
                    }
                }
                throw new IllegalStateException("注册失败");
            }
        }
    }

    /** 校验账号密码，成功返回用户信息，失败返回 null。 */
    public AuthUser authenticate(String username, String password) throws SQLException {
        String name = normalizeUsername(username);
        if (password == null || password.isEmpty()) {
            return null;
        }
        try (Connection conn = db.open();
             PreparedStatement ps = conn.prepareStatement(
                     "SELECT id, username, role, password_hash FROM users WHERE username = ?")) {
            ps.setString(1, name);
            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.next()) {
                    return null;
                }
                String hash = rs.getString("password_hash");
                if (hash == null || !encoder.matches(password, hash)) {
                    return null;
                }
                return new AuthUser(rs.getLong("id"), rs.getString("username"), rs.getString("role"));
            }
        }
    }

    /** 修改密码（要求原密码正确）。 */
    public boolean changePassword(long userId, String oldPassword, String newPassword) throws SQLException {
        validatePassword(newPassword);
        synchronized (db.writeLock()) {
            try (Connection conn = db.open();
                 PreparedStatement sel = conn.prepareStatement(
                         "SELECT password_hash FROM users WHERE id = ?")) {
                sel.setLong(1, userId);
                String hash;
                try (ResultSet rs = sel.executeQuery()) {
                    if (!rs.next()) {
                        return false;
                    }
                    hash = rs.getString("password_hash");
                }
                if (hash == null || !encoder.matches(oldPassword, hash)) {
                    return false;
                }
                try (PreparedStatement upd = conn.prepareStatement(
                        "UPDATE users SET password_hash = ? WHERE id = ?")) {
                    upd.setString(1, encoder.encode(newPassword));
                    upd.setLong(2, userId);
                    return upd.executeUpdate() > 0;
                }
            }
        }
    }

    private Long findIdByUsername(Connection conn, String name) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement("SELECT id FROM users WHERE username = ?")) {
            ps.setString(1, name);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? rs.getLong("id") : null;
            }
        }
    }

    private static String normalizeUsername(String username) {
        String name = username == null ? "" : username.trim();
        if (name.length() < 2 || name.length() > 32) {
            throw new IllegalArgumentException("用户名需 2–32 个字符");
        }
        if (!name.matches("[A-Za-z0-9_\\u4e00-\\u9fa5.-]+")) {
            throw new IllegalArgumentException("用户名只能包含字母、数字、下划线、点、连字符或中文");
        }
        return name;
    }

    private static void validatePassword(String password) {
        if (password == null || password.length() < 6 || password.length() > 64) {
            throw new IllegalArgumentException("密码需 6–64 个字符");
        }
    }
}
