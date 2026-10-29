package com.tvbox.web.controller;

import com.tvbox.web.service.JarSpiderService;
import com.tvbox.web.service.TorrentService;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Map;

@RestController
public class ProxyController {

    private static final Logger log = LoggerFactory.getLogger(ProxyController.class);
    private static final int BT_CHUNK_SIZE = 256 * 1024;
    private static final long BT_STREAM_GATE_TIMEOUT_MS = 120_000L;

    private final JarSpiderService jarSpiderService;
    private final TorrentService torrentService;

    public ProxyController(JarSpiderService jarSpiderService, TorrentService torrentService) {
        this.jarSpiderService = jarSpiderService;
        this.torrentService = torrentService;
    }

    @GetMapping("/proxy")
    public ResponseEntity<StreamingResponseBody> proxy(HttpSession session,
                                                       @RequestParam Map<String, String> params,
                                                       @RequestHeader(value = HttpHeaders.RANGE, required = false)
                                                       String rangeHeader) {
        if ("bt".equalsIgnoreCase(params.get("do"))) {
            return btStream(params.get("gid"), parseFileIndex(params.get("file")), rangeHeader);
        }

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

    /**
     * BT 本地文件中继。首块在写响应头之前等待，因此未就绪还能返回明确的 503；
     * 后续按 256 KiB 分块门控，避免 bytes=0- 退化成等待整部下载完成。
     */
    private ResponseEntity<StreamingResponseBody> btStream(String gid, int fileIndex, String rangeHeader) {
        final TorrentService.TorrentFile file;
        try {
            file = torrentService.resolveFile(gid, fileIndex);
        } catch (RuntimeException ex) {
            return btError(HttpStatus.SERVICE_UNAVAILABLE, safeMessage(ex), null);
        }
        if (file == null || file.fileLength() <= 0) {
            return btError(HttpStatus.NOT_FOUND, "BT 文件不存在或尚未取得元数据", null);
        }

        final ByteRange range;
        try {
            range = parseByteRange(rangeHeader, file.fileLength());
        } catch (IllegalArgumentException ex) {
            HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.CONTENT_RANGE, "bytes */" + file.fileLength());
            return btError(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE, ex.getMessage(), headers);
        }

        try {
            long firstEnd = Math.min(range.end, range.start + BT_CHUNK_SIZE - 1L);
            TorrentService.TorrentFile ready = torrentService.waitRange(
                    gid, fileIndex, range.start, firstEnd, BT_STREAM_GATE_TIMEOUT_MS);
            if (ready == null) {
                return btError(HttpStatus.SERVICE_UNAVAILABLE,
                        "BT 数据尚未就绪（做种者过少或下载已暂停），请稍后重试", null);
            }
        } catch (IllegalArgumentException ex) {
            HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.CONTENT_RANGE, "bytes */" + file.fileLength());
            return btError(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE, safeMessage(ex), headers);
        } catch (RuntimeException ex) {
            return btError(HttpStatus.SERVICE_UNAVAILABLE, safeMessage(ex), null);
        }

        StreamingResponseBody body = outputStream -> {
            try (RandomAccessFile input = new RandomAccessFile(file.absolutePath(), "r")) {
                byte[] buffer = new byte[64 * 1024];
                long position = range.start;
                while (position <= range.end) {
                    long chunkEnd = Math.min(range.end, position + BT_CHUNK_SIZE - 1L);
                    if (position > range.start) {
                        TorrentService.TorrentFile ready = torrentService.waitRange(
                                gid, fileIndex, position, chunkEnd, BT_STREAM_GATE_TIMEOUT_MS);
                        if (ready == null) {
                            throw new IOException("BT 下一片区等待超时: " + position + "-" + chunkEnd);
                        }
                    }
                    // start 是文件内偏移；fileOffset 只用于 torrent piece 映射，不能加到这里。
                    input.seek(position);
                    long remaining = chunkEnd - position + 1L;
                    while (remaining > 0) {
                        int count = input.read(buffer, 0, (int) Math.min(buffer.length, remaining));
                        if (count < 0) {
                            throw new IOException("BT 文件提前到达 EOF");
                        }
                        outputStream.write(buffer, 0, count);
                        remaining -= count;
                    }
                    outputStream.flush();
                    position = chunkEnd + 1L;
                }
            } catch (IOException ex) {
                // 客户端 seek/关闭会主动断流；超时也只能中断当前响应，响应头已提交无法再改写 503。
                log.debug("[BT] 流传输结束（客户端断开或下载未就绪）: {}", ex.getMessage());
            } catch (RuntimeException ex) {
                log.warn("[BT] 流传输异常: {}", ex.getMessage());
            }
        };

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_TYPE, guessContentType(file.absolutePath()));
        headers.set(HttpHeaders.ACCEPT_RANGES, "bytes");
        headers.set(HttpHeaders.CACHE_CONTROL, "no-store");
        headers.setContentLength(range.end - range.start + 1L);
        if (range.partial) {
            headers.set(HttpHeaders.CONTENT_RANGE,
                    "bytes " + range.start + "-" + range.end + "/" + file.fileLength());
        }
        return ResponseEntity.status(range.partial ? HttpStatus.PARTIAL_CONTENT : HttpStatus.OK)
                .headers(headers)
                .body(body);
    }

    private ResponseEntity<StreamingResponseBody> btError(HttpStatus status, String message, HttpHeaders extraHeaders) {
        String text = StringUtils.hasText(message) ? message : "BT 播放失败";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        HttpHeaders headers = extraHeaders == null ? new HttpHeaders() : extraHeaders;
        headers.set(HttpHeaders.CONTENT_TYPE, "text/plain;charset=UTF-8");
        headers.setContentLength(bytes.length);
        headers.set(HttpHeaders.CACHE_CONTROL, "no-store");
        return ResponseEntity.status(status)
                .headers(headers)
                .body(outputStream -> outputStream.write(bytes));
    }

    private static int parseFileIndex(String value) {
        try {
            return Integer.parseInt(value);
        } catch (RuntimeException ex) {
            return -1;
        }
    }

    private static String safeMessage(RuntimeException ex) {
        return ex.getMessage() == null ? ex.getClass().getSimpleName() : ex.getMessage();
    }

    private record ByteRange(long start, long end, boolean partial) {
    }

    /** 单个 bytes Range，支持 bytes=a-b、bytes=a-、bytes=-suffix；多区间明确拒绝。 */
    private static ByteRange parseByteRange(String raw, long totalLength) {
        if (!StringUtils.hasText(raw)) {
            return new ByteRange(0, totalLength - 1L, false);
        }
        String value = raw.trim();
        if (!value.regionMatches(true, 0, "bytes=", 0, 6)) {
            throw new IllegalArgumentException("仅支持 bytes Range");
        }
        String spec = value.substring(6).trim();
        if (spec.contains(",")) {
            throw new IllegalArgumentException("不支持多重 Range");
        }
        int dash = spec.indexOf('-');
        if (dash < 0) {
            throw new IllegalArgumentException("Range 格式不正确");
        }
        String left = spec.substring(0, dash).trim();
        String right = spec.substring(dash + 1).trim();
        try {
            if (left.isEmpty()) {
                long suffix = Long.parseLong(right);
                if (suffix <= 0) {
                    throw new IllegalArgumentException("Range 后缀长度必须大于 0");
                }
                return new ByteRange(Math.max(0L, totalLength - suffix), totalLength - 1L, true);
            }
            long start = Long.parseLong(left);
            if (start < 0 || start >= totalLength) {
                throw new IllegalArgumentException("Range 起点超出文件范围");
            }
            long end = right.isEmpty() ? totalLength - 1L : Long.parseLong(right);
            if (end < start) {
                throw new IllegalArgumentException("Range 终点小于起点");
            }
            return new ByteRange(start, Math.min(end, totalLength - 1L), true);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Range 数字格式不正确");
        }
    }

    private static String guessContentType(String absolutePath) {
        String name = Path.of(absolutePath).getFileName().toString().toLowerCase(Locale.ROOT);
        int dot = name.lastIndexOf('.');
        String extension = dot >= 0 ? name.substring(dot + 1) : "";
        switch (extension) {
            case "mp4", "m4v" -> {
                return "video/mp4";
            }
            case "webm" -> {
                return "video/webm";
            }
            case "mkv" -> {
                return "video/x-matroska";
            }
            case "avi" -> {
                return "video/x-msvideo";
            }
            case "mov" -> {
                return "video/quicktime";
            }
            case "ts", "m2ts" -> {
                return "video/mp2t";
            }
            case "mpg", "mpeg" -> {
                return "video/mpeg";
            }
            default -> {
                try {
                    String detected = Files.probeContentType(Path.of(absolutePath));
                    return detected == null ? "application/octet-stream" : detected;
                } catch (IOException ex) {
                    return "application/octet-stream";
                }
            }
        }
    }
}
