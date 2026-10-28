package com.tvbox.web.controller;

import com.tvbox.web.config.AuthGuard;
import com.tvbox.web.service.ConfigService;
import com.tvbox.web.service.SourceService;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 片源库接口。
 *
 * <p>片源是<b>全局共享</b>的：管理员导入 / 维护一套片源，所有用户可见；
 * 每个用户再从中勾选自己要用的那些（勾选结果存账号）。
 */
@RestController
@RequestMapping("/api/sources")
public class SourceController {

    private final SourceService sourceService;
    private final ConfigService configService;

    public SourceController(SourceService sourceService, ConfigService configService) {
        this.sourceService = sourceService;
        this.configService = configService;
    }

    public record ImportRequest(String json, String url) {
    }

    public record SelectionRequest(List<Long> sourceIds) {
    }

    public record EnabledRequest(boolean enabled) {
    }

    /** 片源列表；管理员能看到被停用的，普通用户只看启用的。同时返回自己的勾选状态。 */
    @GetMapping
    public ResponseEntity<?> list(HttpSession session) {
        Long userId = AuthGuard.userId(session);
        if (userId == null) {
            return unauthorized();
        }
        try {
            boolean admin = AuthGuard.isAdmin(session);
            List<SourceService.SourceRow> rows = sourceService.list(admin);
            Set<Long> choices = sourceService.getChoices(userId);

            List<Map<String, Object>> items = new ArrayList<>();
            for (SourceService.SourceRow row : rows) {
                Map<String, Object> m = sourceService.toPublicMap(row);
                // 没有勾选记录时视为全部启用
                m.put("selected", choices.isEmpty() || choices.contains(row.id()));
                items.add(m);
            }
            Map<String, Object> out = new LinkedHashMap<>();
            out.put("sources", items);
            out.put("total", items.size());
            out.put("selectionsInitialized", !choices.isEmpty());
            out.put("isAdmin", admin);
            return ResponseEntity.ok(out);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "读取片源失败: " + ex.getMessage()));
        }
    }

    @GetMapping("/selection")
    public ResponseEntity<?> getSelection(HttpSession session) {
        Long userId = AuthGuard.userId(session);
        if (userId == null) {
            return unauthorized();
        }
        try {
            Set<Long> choices = sourceService.getChoices(userId);
            return ResponseEntity.ok(Map.of(
                    "sourceIds", new ArrayList<>(choices),
                    "initialized", !choices.isEmpty()));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", ex.getMessage()));
        }
    }

    /** 保存本人勾选；传空数组表示恢复「全部启用」。 */
    @PutMapping("/selection")
    public ResponseEntity<?> setSelection(@RequestBody SelectionRequest body, HttpSession session) {
        Long userId = AuthGuard.userId(session);
        if (userId == null) {
            return unauthorized();
        }
        try {
            sourceService.setChoices(userId, body == null ? List.of() : body.sourceIds());
            return ResponseEntity.ok(Map.of("success", true));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "保存选择失败: " + ex.getMessage()));
        }
    }

    /** 导入 TVBox 配置：传 json（JSON 文本）或 url（配置地址），二选一。仅管理员。 */
    @PostMapping("/import")
    public ResponseEntity<?> importSources(@RequestBody ImportRequest body, HttpSession session) {
        if (!AuthGuard.isAdmin(session)) {
            return forbidden();
        }
        try {
            SourceService.ImportResult result;
            boolean byUrl = body != null && body.url() != null && !body.url().isBlank();
            if (byUrl) {
                result = sourceService.importFromUrl(body.url(), configService);
            } else {
                result = sourceService.importFromJson(body == null ? null : body.json());
            }
            // 导入后清掉各会话里缓存的旧配置，使新片源立即生效
            configService.invalidateAllSessionPayloads();
            Map<String, Object> out = new LinkedHashMap<>();
            out.put("success", true);
            out.put("total", result.total());
            out.put("inserted", result.inserted());
            out.put("updated", result.updated());
            out.put("skipped", result.skipped());
            return ResponseEntity.ok(out);
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(Map.of("message", ex.getMessage()));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "导入失败: " + ex.getMessage()));
        }
    }

    @PatchMapping("/{id}/enabled")
    public ResponseEntity<?> setEnabled(@PathVariable long id, @RequestBody EnabledRequest body,
                                        HttpSession session) {
        if (!AuthGuard.isAdmin(session)) {
            return forbidden();
        }
        try {
            boolean ok = sourceService.setEnabled(id, body != null && body.enabled());
            configService.invalidateAllSessionPayloads();
            return ResponseEntity.ok(Map.of("success", ok));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", ex.getMessage()));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id, HttpSession session) {
        if (!AuthGuard.isAdmin(session)) {
            return forbidden();
        }
        try {
            boolean ok = sourceService.delete(id);
            configService.invalidateAllSessionPayloads();
            return ResponseEntity.ok(Map.of("success", ok));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "删除失败: " + ex.getMessage()));
        }
    }

    @DeleteMapping("/all")
    public ResponseEntity<?> clear(HttpSession session) {
        if (!AuthGuard.isAdmin(session)) {
            return forbidden();
        }
        try {
            int removed = sourceService.clearAll();
            configService.invalidateAllSessionPayloads();
            return ResponseEntity.ok(Map.of("success", true, "removed", removed));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "清空失败: " + ex.getMessage()));
        }
    }

    private static ResponseEntity<?> unauthorized() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("message", "请先登录"));
    }

    private static ResponseEntity<?> forbidden() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(Map.of("message", "仅管理员可操作"));
    }
}
