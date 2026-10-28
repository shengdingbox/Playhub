package com.tvbox.web.config;

import com.tvbox.web.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

import java.nio.charset.StandardCharsets;
import java.util.Set;

/**
 * 登录校验拦截器。
 *
 * <p>只拦 {@code /api/**}：未登录一律返回 401，前端收到 401 后跳转登录页。
 * <ul>
 *   <li>放行登录/注册/登出/当前用户/健康检查，否则前端无法完成登录本身。</li>
 *   <li>{@code /proxy/**} 不在拦截范围内：播放器在 {@code <video src>} 里直接请求，
 *       不能因为会话状态而中断播放。</li>
 * </ul>
 */
public class AuthInterceptor implements HandlerInterceptor {

    private static final Set<String> PUBLIC_PATHS = Set.of(
            "/api/auth/login",
            "/api/auth/register",
            "/api/auth/logout",
            "/api/auth/me",
            "/api/health"
    );

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String path = request.getRequestURI();
        if (path == null || !path.startsWith("/api/")) {
            return true;
        }
        if (PUBLIC_PATHS.contains(path)) {
            return true;
        }
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute(AuthService.SESSION_USER_ID) instanceof Long) {
            return true;
        }
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write("{\"message\":\"请先登录\"}");
        return false;
    }
}
