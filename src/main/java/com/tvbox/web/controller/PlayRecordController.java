package com.tvbox.web.controller;

import com.tvbox.web.service.AuthService;
import com.tvbox.web.service.PlayRecordService;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 播放记录接口（线路级：一行 = 一条线路）。
 */
@RestController
@RequestMapping("/api/records")
public class PlayRecordController {

    private final PlayRecordService recordService;

    public PlayRecordController(PlayRecordService recordService) {
        this.recordService = recordService;
    }

    /** 一条记录对应一个线路；服务端按 (user, source_uid, vod_id, flag_name) 去重并原地更新。 */
    public record RecordBody(
            String sourceUid,
            String vodId,
            String title,
            String poster,
            String flagName,
            Integer episodeIndex,
            String episodeName,
            String url,
            Integer position,
            Integer duration,
            Long updatedAt
    ) {
    }

    public record ImportBody(List<RecordBody> records) {
    }

    @GetMapping
    public ResponseEntity<?> list(@RequestParam(defaultValue = "500") int limit, HttpSession session) {
        Long userId = currentUserId(session);
        if (userId == null) {
            return unauthorized();
        }
        try {
            return ResponseEntity.ok(Map.of("records", recordService.list(userId, limit)));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "读取记录失败: " + ex.getMessage()));
        }
    }

    @PostMapping
    public ResponseEntity<?> upsert(@RequestBody RecordBody body, HttpSession session) {
        Long userId = currentUserId(session);
        if (userId == null) {
            return unauthorized();
        }
        try {
            recordService.upsert(userId, toRecord(body));
            return ResponseEntity.ok(Map.of("success", true));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(Map.of("message", ex.getMessage()));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "保存记录失败: " + ex.getMessage()));
        }
    }

    /** 登录后把浏览器 localStorage 的旧历史一次性迁移进来。 */
    @PostMapping("/import")
    public ResponseEntity<?> importBatch(@RequestBody ImportBody body, HttpSession session) {
        Long userId = currentUserId(session);
        if (userId == null) {
            return unauthorized();
        }
        List<RecordBody> items = body == null || body.records() == null ? List.of() : body.records();
        List<PlayRecordService.Record> records = items.stream()
                .map(this::toRecord)
                .toList();
        int imported = recordService.importBatch(userId, records);
        return ResponseEntity.ok(Map.of("success", true, "imported", imported, "total", records.size()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id, HttpSession session) {
        Long userId = currentUserId(session);
        if (userId == null) {
            return unauthorized();
        }
        try {
            boolean ok = recordService.delete(userId, id);
            return ResponseEntity.ok(Map.of("success", ok));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "删除失败: " + ex.getMessage()));
        }
    }

    /** 删除某部视频的所有线路记录。 */
    @DeleteMapping("/video")
    public ResponseEntity<?> deleteByVideo(@RequestParam String sourceUid,
                                           @RequestParam String vodId,
                                           HttpSession session) {
        Long userId = currentUserId(session);
        if (userId == null) {
            return unauthorized();
        }
        try {
            int removed = recordService.deleteByVideo(userId, sourceUid, vodId);
            return ResponseEntity.ok(Map.of("success", true, "removed", removed));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "删除失败: " + ex.getMessage()));
        }
    }

    @DeleteMapping("/all")
    public ResponseEntity<?> clear(HttpSession session) {
        Long userId = currentUserId(session);
        if (userId == null) {
            return unauthorized();
        }
        try {
            int removed = recordService.clear(userId);
            return ResponseEntity.ok(Map.of("success", true, "removed", removed));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "清空失败: " + ex.getMessage()));
        }
    }

    private PlayRecordService.Record toRecord(RecordBody body) {
        if (body == null) {
            throw new IllegalArgumentException("记录不能为空");
        }
        return new PlayRecordService.Record(
                null,
                body.sourceUid(),
                body.vodId(),
                body.title(),
                body.poster(),
                body.flagName(),
                body.episodeIndex() == null ? 0 : body.episodeIndex(),
                body.episodeName(),
                body.url(),
                body.position() == null ? 0 : body.position(),
                body.duration() == null ? 0 : body.duration(),
                body.updatedAt() == null ? System.currentTimeMillis() : body.updatedAt());
    }

    private static Long currentUserId(HttpSession session) {
        Object userId = session.getAttribute(AuthService.SESSION_USER_ID);
        return userId instanceof Long id ? id : null;
    }

    private static ResponseEntity<?> unauthorized() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("message", "请先登录"));
    }
}
