package com.tvbox.web.controller;

import com.tvbox.web.service.DriveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * 网盘绑定、目录浏览与播放接口（对应前端 {@code window.api.drives.*}）。
 *
 * <p>所有响应都使用 IpcResult 信封。网盘上游故障不会冒泡成未捕获异常；
 * 具体失败原因放在 {@code error.message}，HTTP 状态仍保持 200，便于 web-bridge 统一解包。
 */
@RestController
@RequestMapping("/api/drive")
public class DriveController {

    private static final Logger log = LoggerFactory.getLogger(DriveController.class);

    private final DriveService driveService;

    public DriveController(DriveService driveService) {
        this.driveService = driveService;
    }

    public record ProviderRequest(String provider) {
    }

    public record SetRequest(String provider, String token) {
    }

    public record QrPollRequest(String provider, String sid) {
    }

    /** path 对夸克/UC 表示目录 fid，对百度表示网盘绝对路径；根目录可省略。 */
    public record BrowseRequest(String provider, String path, Integer page, Integer size) {
    }

    /** fileId 优先；只有 path 时，百度会按路径定位 fs_id，夸克/UC 直接把 path 当 fid。 */
    public record PlayRequest(String provider, String path, String fileId) {
    }

    @PostMapping("/qrCreate")
    public Map<String, Object> qrCreate(@RequestBody(required = false) ProviderRequest req) {
        return respond(() -> driveService.qrCreate(req == null ? null : req.provider()));
    }

    @PostMapping("/qrPoll")
    public Map<String, Object> qrPoll(@RequestBody(required = false) QrPollRequest req) {
        return respond(() -> {
            requireBody(req);
            return driveService.qrPoll(req.provider(), req.sid());
        });
    }

    /** 浏览器没有 Electron 的可控登录窗口；Web 版使用 qrCreate/qrPoll 或手动 Cookie。 */
    @PostMapping("/webLogin")
    public Map<String, Object> webLogin(@RequestBody(required = false) ProviderRequest req) {
        return err("NOT_SUPPORTED", "Web 版不支持内嵌网页登录，请使用扫码登录或手动 Cookie 绑定");
    }

    @GetMapping("/ucTvStatus")
    public Map<String, Object> ucTvStatus() {
        return err("NOT_SUPPORTED", "UC TV 授权暂未接入 Web 版");
    }

    @PostMapping("/ucTvQrCreate")
    public Map<String, Object> ucTvQrCreate() {
        return err("NOT_SUPPORTED", "UC TV 授权暂未接入 Web 版");
    }

    @PostMapping("/ucTvQrPoll")
    public Map<String, Object> ucTvQrPoll() {
        return err("NOT_SUPPORTED", "UC TV 授权暂未接入 Web 版");
    }

    @PostMapping("/ucTvRemove")
    public Map<String, Object> ucTvRemove() {
        return err("NOT_SUPPORTED", "UC TV 授权暂未接入 Web 版");
    }

    @PostMapping("/set")
    public Map<String, Object> set(@RequestBody(required = false) SetRequest req) {
        return respond(() -> {
            requireBody(req);
            driveService.set(req.provider(), req.token());
            return null;
        });
    }

    @GetMapping("/list")
    public Map<String, Object> list() {
        return respond(driveService::list);
    }

    @PostMapping("/browse")
    public Map<String, Object> browse(@RequestBody(required = false) BrowseRequest req) {
        return respond(() -> {
            requireBody(req);
            return driveService.browse(req.provider(), req.path(), req.page(), req.size());
        });
    }

    @PostMapping("/playUrl")
    public Map<String, Object> playUrl(@RequestBody(required = false) PlayRequest req) {
        return respond(() -> {
            requireBody(req);
            return driveService.playUrl(req.provider(), req.path(), req.fileId());
        });
    }

    @PostMapping("/remove")
    public Map<String, Object> remove(@RequestBody(required = false) ProviderRequest req) {
        return respond(() -> {
            requireBody(req);
            driveService.remove(req.provider());
            return null;
        });
    }

    private Map<String, Object> respond(Supplier<Object> action) {
        try {
            return ok(action.get());
        } catch (DriveService.DriveException ex) {
            return err(ex.code(), ex.getMessage());
        } catch (IllegalArgumentException ex) {
            return err("BAD_REQUEST", ex.getMessage());
        } catch (Exception ex) {
            // 不打印请求体、Cookie 或播放签名 URL，避免凭据进入日志。
            log.warn("[drive] 未预期的接口异常（{}）: {}", ex.getClass().getSimpleName(), ex.getMessage());
            return err("DRIVE_ERROR", "网盘接口处理失败，请稍后重试");
        }
    }

    private static void requireBody(Object req) {
        if (req == null) {
            throw new IllegalArgumentException("缺少请求体");
        }
    }

    private static Map<String, Object> ok(Object data) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("ok", true);
        result.put("data", data);
        return result;
    }

    private static Map<String, Object> err(String code, String message) {
        Map<String, Object> error = new LinkedHashMap<>();
        error.put("code", code);
        error.put("message", message == null || message.isBlank() ? "网盘接口处理失败" : message);
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("ok", false);
        result.put("error", error);
        return result;
    }
}
