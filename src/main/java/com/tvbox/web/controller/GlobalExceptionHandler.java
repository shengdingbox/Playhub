package com.tvbox.web.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 全局异常处理。
 *
 * <p><b>为什么手动写响应而不是直接返回 Map</b>：{@code /proxy} 是流式响应，
 * 它会先把上游的 Content-Type（如 {@code text/javascript}、{@code video/mp2t}）
 * 写进响应头，再开始传输。如果传输中途出错（客户端拖动进度条、关闭页面、
 * 上游断连），异常会冒到这里——此时若再尝试返回 Map，
 * Spring 会因为没有「Map → text/javascript」的转换器而抛出
 * {@code HttpMessageNotWritableException}，把真正的错误盖掉。
 *
 * <p>所以这里统一：只有在响应尚未提交、且内容是 JSON 时才写 JSON 错误体；
 * 其余情况仅记录日志并尽力设置状态码。
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public void handleBadRequest(IllegalArgumentException ex, HttpServletResponse response)
            throws IOException {
        writeError(response, HttpStatus.BAD_REQUEST, ex);
    }

    @ExceptionHandler(IllegalStateException.class)
    public void handleIllegalState(IllegalStateException ex, HttpServletResponse response)
            throws IOException {
        writeError(response, HttpStatus.BAD_REQUEST, ex);
    }

    @ExceptionHandler(Exception.class)
    public void handleException(Exception ex, HttpServletResponse response) throws IOException {
        writeError(response, HttpStatus.INTERNAL_SERVER_ERROR, ex);
    }

    private void writeError(HttpServletResponse response, HttpStatus status, Exception ex)
            throws IOException {
        String message = ex.getMessage() == null ? ex.getClass().getSimpleName() : ex.getMessage();

        // 响应已提交（流式中途出错）：状态码与响应体都改不了了，只能记日志
        if (response.isCommitted()) {
            log.debug("[EX] 响应已提交，无法返回错误体: {}", message);
            return;
        }

        // 响应头已被业务代码定成非 JSON（代理脚本/视频分片等），不能再写 JSON
        String contentType = response.getContentType();
        boolean jsonWritable = contentType == null
                || contentType.toLowerCase().contains("json");
        if (!jsonWritable) {
            log.warn("[EX] {} 处理失败（响应类型 {} 无法承载 JSON）: {}",
                    ex.getClass().getSimpleName(), contentType, message);
            try {
                response.setStatus(status.value());
            } catch (IllegalStateException ignore) {
                // 已被容器锁定
            }
            return;
        }

        log.warn("[EX] {}: {}", ex.getClass().getSimpleName(), message);
        response.setStatus(status.value());
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write("{\"ok\":false,\"error\":" + quote(message) + "}");
    }

    /** 极简 JSON 字符串转义，避免引号/换行破坏响应体。 */
    private static String quote(String value) {
        StringBuilder sb = new StringBuilder(value.length() + 16);
        sb.append('"');
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '"' -> sb.append("\\\"");
                case '\\' -> sb.append("\\\\");
                case '\n' -> sb.append("\\n");
                case '\r' -> sb.append("\\r");
                case '\t' -> sb.append("\\t");
                default -> {
                    if (c < 0x20) {
                        sb.append(String.format("\\u%04x", (int) c));
                    } else {
                        sb.append(c);
                    }
                }
            }
        }
        sb.append('"');
        return sb.toString();
    }
}
