package com.tvbox.web.controller;

import com.tvbox.web.service.DanmakuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 弹幕接口（Win-box 移植，对应前端 {@code window.api.danmaku.*}）。
 *
 * <p>统一返回 IpcResult 信封：{@code {ok:true, data}} 或 {@code {ok:false, error:{code,message}}}。
 * 弹幕内容统一为解析后的数组 {@code [{time, mode, text, size, color}]}，
 * 其中 {@code mode} 为 scroll / top / bottom，{@code color} 为 #rrggbb。
 *
 * <p>认证：/api/** 由 AuthInterceptor 统一拦截，本类不处理鉴权。
 */
@RestController
@RequestMapping("/api/danmaku")
public class DanmakuController {

    private static final Logger log = LoggerFactory.getLogger(DanmakuController.class);

    private final DanmakuService danmakuService;

    public DanmakuController(DanmakuService danmakuService) {
        this.danmakuService = danmakuService;
    }

    public record SearchRequest(String name, Integer season) {
    }

    public record EpisodesRequest(Long bangumiId, String animeTitle, String source) {
    }

    /** 两种形态：① {episodeId, source?} 精确拉取；② {name, episodeIndex, season?} 自动匹配。 */
    public record FetchRequest(Long episodeId, String source, String name, Integer episodeIndex, Integer season) {
    }

    /** 按名称搜索弹幕库番剧，返回候选列表（全部源失败时返回空列表而非报错）。 */
    @PostMapping("/search")
    public Map<String, Object> search(@RequestBody(required = false) SearchRequest req) {
        if (req == null || req.name() == null || req.name().isBlank()) {
            return err("BAD_REQUEST", "缺少参数 name");
        }
        try {
            List<Map<String, Object>> data = danmakuService.search(req.name().trim(), req.season());
            return ok(data);
        } catch (Exception ex) {
            log.warn("[danmaku] 搜索异常: {}", ex.getMessage());
            return err("UPSTREAM", "弹幕搜索失败: " + ex.getMessage());
        }
    }

    /** 番剧的剧集列表。source 缺省时用默认弹幕源。 */
    @PostMapping("/episodes")
    public Map<String, Object> episodes(@RequestBody(required = false) EpisodesRequest req) {
        if (req == null || req.bangumiId() == null) {
            return err("BAD_REQUEST", "缺少参数 bangumiId");
        }
        try {
            return ok(danmakuService.episodes(req.bangumiId(), req.animeTitle(), req.source()));
        } catch (IllegalStateException ex) {
            return err("UPSTREAM", ex.getMessage());
        } catch (Exception ex) {
            log.warn("[danmaku] 剧集查询异常: {}", ex.getMessage());
            return err("UPSTREAM", "剧集查询失败: " + ex.getMessage());
        }
    }

    /**
     * 拉取弹幕内容。
     * 形态一：{episodeId, source?} —— 精确拉某集；
     * 形态二：{name, episodeIndex, season?} —— 按名称自动匹配番剧后拉第 N 集（1 起）。
     */
    @PostMapping("/fetch")
    public Map<String, Object> fetch(@RequestBody(required = false) FetchRequest req) {
        if (req == null) {
            return err("BAD_REQUEST", "缺少请求体");
        }
        try {
            if (req.episodeId() != null) {
                return ok(danmakuService.fetch(req.episodeId(), req.source()));
            }
            if (req.name() != null && !req.name().isBlank() && req.episodeIndex() != null && req.episodeIndex() >= 1) {
                return ok(danmakuService.fetchByName(req.name().trim(), req.episodeIndex(), req.season()));
            }
            return err("BAD_REQUEST", "参数需为 {episodeId} 或 {name, episodeIndex}");
        } catch (IllegalStateException ex) {
            return err("UPSTREAM", ex.getMessage());
        } catch (Exception ex) {
            log.warn("[danmaku] 弹幕拉取异常: {}", ex.getMessage());
            return err("UPSTREAM", "弹幕拉取失败: " + ex.getMessage());
        }
    }

    // ---------------------------------------------------------------- IpcResult 信封

    static Map<String, Object> ok(Object data) {
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("ok", true);
        m.put("data", data);
        return m;
    }

    static Map<String, Object> err(String code, String message) {
        Map<String, Object> error = new LinkedHashMap<>();
        error.put("code", code);
        error.put("message", message);
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("ok", false);
        m.put("error", error);
        return m;
    }
}
