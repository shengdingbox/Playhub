package com.tvbox.web.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 压制第三方爬虫刷屏的栈帧。
 *
 * <p>加固包里的爬虫大量使用 {@code e.printStackTrace()}，输出直接写到 {@code System.err}，
 * 不经过 SLF4J，所以 {@code logging.level} 管不到它。这类异常多数是环境限制导致的
 * 已知不可用（ext 需要 ARM 原生库解密、站点已下线、返回内容为空等），
 * 保留第一行说明就够了，后面几十行栈帧纯属噪音。
 *
 * <p>做法：把 {@code System.err} 换成「按行过滤」的流，**只丢弃纯栈帧行**
 * （缩进的 {@code at xxx(...)} 与 {@code ... N more}、{@code Suppressed:}）。
 * 异常首行、{@code Caused by:} 摘要都会保留，排查信息不丢。
 *
 * <p>可用 {@code app.suppress-stack-traces=false} 关闭。
 */
@Component
public class StackTraceSuppressor implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(StackTraceSuppressor.class);

    /** 防止重复安装（多实例场景）。 */
    private static final AtomicBoolean INSTALLED = new AtomicBoolean(false);

    private final boolean enabled;

    public StackTraceSuppressor(@Value("${app.suppress-stack-traces:true}") boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (!enabled) {
            log.info("[LOG] 栈帧压制已关闭 (app.suppress-stack-traces=false)");
            return;
        }
        if (!INSTALLED.compareAndSet(false, true)) {
            return;
        }
        PrintStream original = System.err;
        System.setErr(new PrintStream(new FilteringOutputStream(original), true, StandardCharsets.UTF_8));
        log.info("[LOG] 已启用栈帧压制：第三方爬虫的 printStackTrace 仅保留首行摘要");
    }

    /** 按行过滤的字节流：纯栈帧行直接丢弃，其余原样转给原始 stderr。 */
    private static final class FilteringOutputStream extends OutputStream {

        private final PrintStream delegate;
        private final ByteArrayOutputStream lineBuffer = new ByteArrayOutputStream(256);
        private final AtomicLong dropped = new AtomicLong();

        FilteringOutputStream(PrintStream delegate) {
            this.delegate = delegate;
        }

        @Override
        public void write(int b) {
            if (b == '\n') {
                flushLine();
                return;
            }
            if (b != '\r') {
                lineBuffer.write(b);
            }
        }

        @Override
        public void write(byte[] buf, int off, int len) {
            for (int i = off; i < off + len; i++) {
                write(buf[i]);
            }
        }

        private void flushLine() {
            String line = lineBuffer.toString(StandardCharsets.UTF_8);
            lineBuffer.reset();
            if (isStackTraceLine(line)) {
                dropped.incrementAndGet();
                return;
            }
            delegate.println(line);
        }

        /** 纯栈帧行：缩进的 {@code at ...}、{@code Suppressed:}，以及（可能无缩进的）{@code ... N more}。 */
        private static boolean isStackTraceLine(String line) {
            if (line == null || line.isEmpty()) {
                return false;
            }
            String trimmed = line.trim();
            // "... 25 more" 不可能是业务日志，与缩进无关，直接判定
            if (trimmed.matches("^\\.\\.\\. \\d+ more$")) {
                return true;
            }
            char first = line.charAt(0);
            if (first != ' ' && first != '\t') {
                return false;
            }
            return trimmed.startsWith("at ") || trimmed.startsWith("Suppressed:");
        }

        @Override
        public void flush() {
            if (lineBuffer.size() > 0) {
                flushLine();
            }
            delegate.flush();
        }
    }
}
