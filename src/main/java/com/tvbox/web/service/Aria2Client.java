package com.tvbox.web.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 本机 aria2 JSON-RPC 客户端与 sidecar 生命周期管理。
 *
 * <p>优先复用已经监听的 RPC 实例；没有实例时才查找并懒启动 aria2c。
 * 缺少可执行文件只影响磁力功能，不影响 Spring 容器启动。</p>
 */
@Component
public class Aria2Client {

    private static final Logger log = LoggerFactory.getLogger(Aria2Client.class);

    private final ObjectMapper objectMapper;
    private final AppPathsService appPathsService;
    private final HttpClient httpClient;
    private final URI rpcUri;
    private final String configuredSecret;
    private final String configuredExecutable;
    private final boolean windows;
    private final Object startLock = new Object();
    private final AtomicLong requestIds = new AtomicLong();

    private volatile String rpcSecret;
    private volatile Process ownedProcess;

    public Aria2Client(ObjectMapper objectMapper,
                       AppPathsService appPathsService,
                       @Value("${app.aria2.rpc-url:http://127.0.0.1:6800/jsonrpc}") String rpcUrl,
                       @Value("${app.aria2.rpc-secret:}") String rpcSecret,
                       @Value("${app.aria2.executable:}") String executable) {
        this.objectMapper = objectMapper;
        this.appPathsService = appPathsService;
        this.rpcUri = URI.create(rpcUrl);
        this.configuredSecret = rpcSecret == null ? "" : rpcSecret.trim();
        this.rpcSecret = this.configuredSecret;
        this.configuredExecutable = executable == null ? "" : executable.trim();
        this.windows = System.getProperty("os.name", "").toLowerCase().contains("win");
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(2))
                .build();
    }

    /** 确保 RPC 可用；已有实例直接复用，否则从 resources/aria2 或 PATH 启动。 */
    public void ensureRunning(Path downloadDir) {
        if (ping()) {
            return;
        }
        synchronized (startLock) {
            if (ping()) {
                return;
            }
            Path executable = findExecutable().orElseThrow(() ->
                    new IllegalStateException("aria2 未安装，请将 aria2c 放入 resources/aria2/ 或加入系统 PATH"));
            try {
                Files.createDirectories(downloadDir);
                startProcess(executable, downloadDir.toAbsolutePath().normalize());
            } catch (IllegalStateException ex) {
                throw ex;
            } catch (Exception ex) {
                throw new IllegalStateException("aria2 启动失败: " + ex.getMessage(), ex);
            }
        }
    }

    public String addUri(String magnet, Path downloadDir) {
        Map<String, String> options = new LinkedHashMap<>();
        options.put("dir", downloadDir.toAbsolutePath().normalize().toString());
        // 元数据完成后先暂停，取得文件清单、选定正片后再 unpause。
        options.put("pause-metadata", "true");
        options.put("bt-save-metadata", "true");
        options.put("bt-remove-unselected-file", "false");
        options.put("seed-time", "0");
        options.put("file-allocation", "none");
        options.put("continue", "true");
        options.put("allow-overwrite", "false");
        options.put("auto-file-renaming", "false");
        options.put("bt-prioritize-piece", "head=8M,tail=8M");
        JsonNode result = call("aria2.addUri", List.of(List.of(magnet), options), Duration.ofSeconds(20));
        String gid = result == null ? "" : result.asText("").trim();
        if (gid.isEmpty()) {
            throw new IllegalStateException("aria2 添加磁力任务失败：未返回 gid");
        }
        return gid;
    }

    public JsonNode tellStatus(String gid, List<String> keys) {
        return call("aria2.tellStatus", List.of(gid, keys), Duration.ofSeconds(15));
    }

    public JsonNode getFiles(String gid) {
        JsonNode result = call("aria2.getFiles", List.of(gid), Duration.ofSeconds(15));
        if (result == null || !result.isArray()) {
            throw new IllegalStateException("aria2 文件清单格式不正确");
        }
        return result;
    }

    public void selectFile(String gid, int fileIndex) {
        call("aria2.changeOption", List.of(gid, Map.of("select-file", String.valueOf(fileIndex))),
                Duration.ofSeconds(15));
    }

    public void unpause(String gid) {
        call("aria2.unpause", List.of(gid), Duration.ofSeconds(15));
    }

    /** 完成/出错任务走 removeDownloadResult，活动任务走 remove。 */
    public void remove(String gid) {
        try {
            call("aria2.remove", List.of(gid), Duration.ofSeconds(10));
        } catch (RuntimeException removeError) {
            try {
                call("aria2.removeDownloadResult", List.of(gid), Duration.ofSeconds(10));
            } catch (RuntimeException ignore) {
                throw removeError;
            }
        }
    }

    private boolean ping() {
        try {
            call("aria2.getVersion", List.of(), Duration.ofSeconds(2));
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    private void startProcess(Path executable, Path downloadDir) {
        URI uri = rpcUri;
        String host = uri.getHost();
        if (host == null || !(host.equals("127.0.0.1") || host.equals("localhost") || host.equals("::1"))) {
            throw new IllegalStateException("aria2 RPC 不可用；远程 RPC 需预先启动，本机自动启动仅支持 127.0.0.1");
        }
        int port = uri.getPort() > 0 ? uri.getPort() : 6800;
        String secret = UUID.randomUUID().toString().replace("-", "");
        List<String> command = new ArrayList<>();
        command.add(executable.toString());
        command.add("--no-conf=true");
        command.add("--enable-rpc=true");
        command.add("--rpc-listen-all=false");
        command.add("--rpc-listen-port=" + port);
        command.add("--rpc-secret=" + secret);
        command.add("--dir=" + downloadDir);
        command.add("--file-allocation=none");
        command.add("--continue=true");
        command.add("--allow-overwrite=false");
        command.add("--auto-file-renaming=false");
        command.add("--bt-save-metadata=true");
        command.add("--bt-remove-unselected-file=false");
        command.add("--seed-time=0");
        command.add("--bt-prioritize-piece=head=8M,tail=8M");
        command.add("--bt-tracker-timeout=20");
        command.add("--bt-tracker-connect-timeout=10");
        command.add("--enable-dht=true");
        command.add("--enable-dht6=false");
        command.add("--bt-enable-lpd=true");
        command.add("--enable-peer-exchange=true");
        command.add("--max-concurrent-downloads=3");
        command.add("--disk-cache=32M");
        command.add("--console-log-level=warn");
        command.add("--log-level=warn");
        command.add("--summary-interval=0");
        if (windows) {
            command.add("--stop-with-process=" + ProcessHandle.current().pid());
        }

        try {
            Process process = new ProcessBuilder(command)
                    .redirectErrorStream(true)
                    .redirectOutput(ProcessBuilder.Redirect.DISCARD)
                    .start();
            ownedProcess = process;
            rpcSecret = secret;
            long deadline = System.currentTimeMillis() + 10_000L;
            while (System.currentTimeMillis() < deadline) {
                if (!process.isAlive()) {
                    break;
                }
                if (ping()) {
                    log.info("[BT] aria2 已启动: pid={} rpc=127.0.0.1:{} dir={}", process.pid(), port, downloadDir);
                    return;
                }
                Thread.sleep(200L);
            }
            throw new IllegalStateException("aria2 启动失败：RPC 在 10 秒内未就绪");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            stopOwnedProcess();
            throw new IllegalStateException("aria2 启动被中断", ex);
        } catch (Exception ex) {
            stopOwnedProcess();
            if (ex instanceof IllegalStateException state) {
                throw state;
            }
            throw new IllegalStateException("aria2 启动失败: " + ex.getMessage(), ex);
        } finally {
            if (ownedProcess == null) {
                rpcSecret = configuredSecret;
            }
        }
    }

    private Optional<Path> findExecutable() {
        List<Path> candidates = new ArrayList<>();
        String binary = windows ? "aria2c.exe" : "aria2c";
        if (StringUtils.hasText(configuredExecutable)) {
            candidates.add(appPathsService.resolveExisting(configuredExecutable));
        }
        candidates.add(appPathsService.resolveExisting("resources/aria2/" + binary));
        candidates.add(appPathsService.resolveExisting("src/main/resources/aria2/" + binary));
        candidates.add(appPathsService.resolveExisting("aria2/" + binary));
        if (windows) {
            candidates.add(appPathsService.resolveExisting("resources/aria2/aria2c"));
            candidates.add(appPathsService.resolveExisting("src/main/resources/aria2/aria2c"));
        }

        String path = System.getenv("PATH");
        if (path != null) {
            for (String dir : path.split(File.pathSeparator)) {
                if (!dir.isBlank()) {
                    candidates.add(Path.of(dir).resolve(binary));
                    if (windows) {
                        candidates.add(Path.of(dir).resolve("aria2c"));
                    }
                }
            }
        }
        return candidates.stream()
                .map(pathCandidate -> pathCandidate.toAbsolutePath().normalize())
                .filter(candidate -> Files.isRegularFile(candidate)
                        && (windows || Files.isExecutable(candidate)))
                .findFirst();
    }

    private JsonNode call(String method, List<?> params, Duration timeout) {
        try {
            List<Object> actualParams = new ArrayList<>();
            if (StringUtils.hasText(rpcSecret)) {
                actualParams.add("token:" + rpcSecret);
            }
            actualParams.addAll(params);
            Map<String, Object> payload = new LinkedHashMap<>();
            payload.put("jsonrpc", "2.0");
            payload.put("id", "playhub-" + requestIds.incrementAndGet());
            payload.put("method", method);
            payload.put("params", actualParams);

            HttpRequest request = HttpRequest.newBuilder(rpcUri)
                    .timeout(timeout)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofByteArray(objectMapper.writeValueAsBytes(payload)))
                    .build();
            HttpResponse<byte[]> response = httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray());
            if (response.statusCode() < 200 || response.statusCode() >= 300) {
                throw new IllegalStateException("aria2 RPC HTTP " + response.statusCode());
            }
            JsonNode root = objectMapper.readTree(response.body());
            if (root != null && root.has("error")) {
                JsonNode error = root.get("error");
                String message = error.path("message").asText("未知 RPC 错误");
                throw new IllegalStateException("aria2 " + method.substring("aria2.".length())
                        + " 失败: " + message);
            }
            if (root == null || !root.has("result")) {
                throw new IllegalStateException("aria2 RPC 返回格式不正确");
            }
            return root.get("result");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("aria2 RPC 被中断", ex);
        } catch (IllegalStateException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new IllegalStateException("aria2 RPC 不可用: " + ex.getMessage(), ex);
        }
    }

    @PreDestroy
    public void stopOwnedProcess() {
        Process process = ownedProcess;
        ownedProcess = null;
        rpcSecret = configuredSecret;
        if (process == null) {
            return;
        }
        try {
            process.destroy();
            if (!process.waitFor(1, java.util.concurrent.TimeUnit.SECONDS)) {
                process.destroyForcibly();
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            process.destroyForcibly();
        } catch (RuntimeException ignore) {
            // 应用退出时尽力清理，不让清理异常影响容器关闭。
        }
    }
}
