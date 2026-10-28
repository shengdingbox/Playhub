package com.tvbox.web.controller;

import com.tvbox.web.service.JarSpiderService;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@RestController
public class ProxyController {

    private static final Logger log = LoggerFactory.getLogger(ProxyController.class);

    private final JarSpiderService jarSpiderService;

    public ProxyController(JarSpiderService jarSpiderService) {
        this.jarSpiderService = jarSpiderService;
    }

    @GetMapping("/proxy")
    public ResponseEntity<StreamingResponseBody> proxy(HttpSession session,
                                                       @RequestParam Map<String, String> params) {
        JarSpiderService.ProxyResponse response = jarSpiderService.proxy(session.getId(), params);
        if (response == null) {
            return ResponseEntity.notFound().build();
        }

        StreamingResponseBody body = outputStream -> {
            try (InputStream inputStream = response.body()) {
                if (inputStream != null) {
                    inputStream.transferTo(outputStream);
                }
            } catch (IOException ex) {
                // 播放器拖动进度条 / 关闭页面 / 上游断连都会走到这里。
                // 此时响应头已经按上游类型写出，再抛给全局异常处理器只会产生
                // "No converter for LinkedHashMap with Content-Type text/javascript" 这类噪音，
                // 而且客户端早就断开、错误体也发不出去，所以这里只记调试日志。
                log.debug("[PROXY] 传输中断（客户端断开或上游中断）: {}", ex.getMessage());
            }
        };

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, response.contentType());
        return ResponseEntity.status(response.status())
                .headers(headers)
                .body(body);
    }
}
