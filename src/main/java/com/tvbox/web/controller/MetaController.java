package com.tvbox.web.controller;

import com.tvbox.web.service.MetaService;
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
 * 豆瓣元数据接口（Win-box 移植，对应前端 {@code window.api.meta.*}）。
 *
 * <p>统一返回 IpcResult 信封：{@code {ok:true, data}} 或 {@code {ok:false, error:{code,message}}}。
 * 豆瓣侧不可用（风控/超时/未命中）时<b>不报错</b>：单对象接口返回 {@code {ok:true, data:null}}，
 * 榜单接口返回 {@code {ok:true, data:[]}}。
 *
 * <p>认证：/api/** 由 AuthInterceptor 统一拦截，本类不处理鉴权。
 */
@RestController
@RequestMapping("/api/meta")
public class MetaController {

    private static final Logger log = LoggerFactory.getLogger(MetaController.class);

    private final MetaService metaService;

    public MetaController(MetaService metaService) {
        this.metaService = metaService;
    }

    public record SearchRequest(String name, String year) {
    }

    public record ExtraRequest(String name, String year) {
    }

    public record DoubanExtraRequest(String name, String year) {
    }

    public record DiscoverRequest(String section, Boolean refresh) {
    }

    /** 豆瓣搜索（标题匹配）→ MetaHit {title, year, poster, overview, type, doubanId} 或 null。 */
    @PostMapping("/search")
    public Map<String, Object> search(@RequestBody(required = false) SearchRequest req) {
        if (req == null || req.name() == null || req.name().isBlank()) {
            return err("BAD_REQUEST", "缺少参数 name");
        }
        try {
            return ok(metaService.search(req.name().trim(), req.year()));
        } catch (Exception ex) {
            log.warn("[meta] 搜索异常: {}", ex.getMessage());
            return ok(null);
        }
    }

    /** 详情补充（演员/简介/封面/类型/推荐）→ MetaExtra 或 null。 */
    @PostMapping("/extra")
    public Map<String, Object> extra(@RequestBody(required = false) ExtraRequest req) {
        if (req == null || req.name() == null || req.name().isBlank()) {
            return err("BAD_REQUEST", "缺少参数 name");
        }
        try {
            return ok(metaService.extra(req.name().trim(), req.year()));
        } catch (Exception ex) {
            log.warn("[meta] extra 异常: {}", ex.getMessage());
            return ok(null);
        }
    }

    /** 详情页「相关推荐 / 豆瓣影评」→ {id, recommendations, reviews} 或 null。 */
    @PostMapping("/doubanExtra")
    public Map<String, Object> doubanExtra(@RequestBody(required = false) DoubanExtraRequest req) {
        if (req == null || req.name() == null || req.name().isBlank()) {
            return err("BAD_REQUEST", "缺少参数 name");
        }
        try {
            return ok(metaService.doubanExtra(req.name().trim(), req.year()));
        } catch (Exception ex) {
            log.warn("[meta] doubanExtra 异常: {}", ex.getMessage());
            return ok(null);
        }
    }

    /**
     * 发现页榜单（豆瓣热门电影/正在上映/Top250/热门剧集/华语口碑榜）。
     * section 缺省返回全部分区（过滤空分区）；指定分区只返回该分区。
     */
    @PostMapping("/discover")
    public Map<String, Object> discover(@RequestBody(required = false) DiscoverRequest req) {
        String section = req == null ? null : req.section();
        boolean refresh = req != null && Boolean.TRUE.equals(req.refresh());
        try {
            List<Map<String, Object>> data = metaService.discover(section, refresh);
            return ok(data);
        } catch (IllegalArgumentException ex) {
            return err("BAD_REQUEST", ex.getMessage());
        } catch (Exception ex) {
            log.warn("[meta] discover 异常: {}", ex.getMessage());
            return ok(List.of());
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
