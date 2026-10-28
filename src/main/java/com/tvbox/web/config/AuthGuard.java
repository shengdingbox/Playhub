package com.tvbox.web.config;

import com.tvbox.web.service.AuthService;
import jakarta.servlet.http.HttpSession;

/**
 * 从会话里取当前身份的小工具。
 *
 * <p>会话里的 role 在登录/注册时写入；管理员改了某人角色后，
 * 该用户需要重新登录才能拿到新角色（对单机场景足够）。
 */
public final class AuthGuard {

    private AuthGuard() {
    }

    public static Long userId(HttpSession session) {
        if (session == null) {
            return null;
        }
        Object value = session.getAttribute(AuthService.SESSION_USER_ID);
        return value instanceof Long id ? id : null;
    }

    public static String role(HttpSession session) {
        if (session == null) {
            return null;
        }
        Object value = session.getAttribute(AuthService.SESSION_ROLE);
        return value instanceof String r ? r : null;
    }

    public static boolean isAdmin(HttpSession session) {
        return AuthService.ROLE_ADMIN.equalsIgnoreCase(role(session));
    }
}
