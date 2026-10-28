package com.tvbox.web.config;

import com.tvbox.web.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 启动时确保存在管理员账号。
 *
 * <p>默认 {@code admin / playhub}，可用配置覆盖：
 * <pre>
 * app:
 *   admin:
 *     username: admin
 *     password: playhub
 * </pre>
 *
 * <p>只在账号不存在时创建；已存在则不会重置密码，
 * 所以管理员登录后自行改过的密码不会被下次启动覆盖回去。
 */
@Component
public class AdminInitializer implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(AdminInitializer.class);

    private final AuthService authService;
    private final String username;
    private final String password;
    private final boolean enabled;

    public AdminInitializer(AuthService authService,
                            @Value("${app.admin.enabled:true}") boolean enabled,
                            @Value("${app.admin.username:admin}") String username,
                            @Value("${app.admin.password:playhub}") String password) {
        this.authService = authService;
        this.enabled = enabled;
        this.username = username;
        this.password = password;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (!enabled) {
            log.info("[Admin] 管理员自动初始化已关闭 (app.admin.enabled=false)");
            return;
        }
        try {
            boolean created = authService.ensureAdmin(username, password);
            if (created) {
                log.info("[Admin] 已创建管理员账号 {}（初始密码见配置 app.admin.password，请尽快修改）", username);
            } else {
                log.info("[Admin] 管理员账号 {} 已存在，保持现有密码不变", username);
            }
        } catch (Exception ex) {
            log.warn("[Admin] 初始化管理员失败: {}", ex.getMessage());
        }
    }
}
