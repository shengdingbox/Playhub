package com.tvbox.web.controller;

import com.tvbox.web.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 账号相关接口：注册、登录、登出、当前用户、改密码。
 *
 * <p>登录态用 HttpSession 维持（前端 axios 已开启 withCredentials）。
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    public record Credentials(String username, String password) {
    }

    public record ChangePassword(String oldPassword, String newPassword) {
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Credentials body, HttpSession session,
                                      HttpServletRequest request) {
        try {
            AuthService.AuthUser user = authService.register(body.username(), body.password());
            markLoggedIn(request, session, user);
            return ResponseEntity.ok(payload(user));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(Map.of("message", ex.getMessage()));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "注册失败: " + ex.getMessage()));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Credentials body, HttpSession session,
                                   HttpServletRequest request) {
        try {
            AuthService.AuthUser user = authService.authenticate(body.username(), body.password());
            if (user == null) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(Map.of("message", "用户名或密码错误"));
            }
            markLoggedIn(request, session, user);
            return ResponseEntity.ok(payload(user));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(Map.of("message", ex.getMessage()));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "登录失败: " + ex.getMessage()));
        }
    }

    @PostMapping("/logout")
    public Map<String, Object> logout(HttpSession session) {
        session.invalidate();
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("loggedIn", false);
        return out;
    }

    /** 当前登录用户；未登录时返回 200 + loggedIn=false，前端据此决定是否跳登录页。 */
    @GetMapping("/me")
    public Map<String, Object> me(HttpSession session) {
        Object userId = session.getAttribute(AuthService.SESSION_USER_ID);
        if (!(userId instanceof Long id)) {
            Map<String, Object> out = new LinkedHashMap<>();
            out.put("loggedIn", false);
            return out;
        }
        try {
            // 查库而不是只读 session，保证角色变更能立刻反映
            AuthService.AuthUser user = authService.findById(id);
            if (user != null) {
                return payload(user);
            }
        } catch (Exception ignore) {
            // 查库失败时退回 session 里的信息
        }
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("loggedIn", true);
        out.put("userId", id);
        out.put("username", session.getAttribute(AuthService.SESSION_USERNAME));
        out.put("role", session.getAttribute(AuthService.SESSION_ROLE));
        return out;
    }

    @PostMapping("/password")
    public ResponseEntity<?> changePassword(@RequestBody ChangePassword body, HttpSession session) {
        Object userId = session.getAttribute(AuthService.SESSION_USER_ID);
        if (!(userId instanceof Long id)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "请先登录"));
        }
        try {
            boolean ok = authService.changePassword(id, body.oldPassword(), body.newPassword());
            if (!ok) {
                return ResponseEntity.badRequest().body(Map.of("message", "原密码不正确"));
            }
            return ResponseEntity.ok(Map.of("success", true));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(Map.of("message", ex.getMessage()));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "修改失败: " + ex.getMessage()));
        }
    }

    private static void markLoggedIn(HttpServletRequest request, HttpSession session,
                                     AuthService.AuthUser user) {
        // 登录成功换一个新 session id，避免会话固定攻击（changeSessionId 属于 request 而非 session）
        try {
            request.changeSessionId();
        } catch (IllegalStateException | UnsupportedOperationException ignore) {
            // 容器不支持时忽略，不影响登录
        }
        session.setAttribute(AuthService.SESSION_USER_ID, user.id());
        session.setAttribute(AuthService.SESSION_USERNAME, user.username());
        session.setAttribute(AuthService.SESSION_ROLE, user.role());
    }

    private static Map<String, Object> payload(AuthService.AuthUser user) {
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("loggedIn", true);
        out.put("userId", user.id());
        out.put("username", user.username());
        out.put("role", user.role());
        out.put("isAdmin", user.isAdmin());
        return out;
    }
}
