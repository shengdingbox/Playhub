package com.tvbox.web.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 磁力 BT 边下边播编排：aria2 元数据接续、选片、piece 覆盖门控与播放会话复用。
 *
 * <p>播放结果里的 magnet 经 {@link #open(String)} 转为 Playhub 本地代理地址；
 * {@code ProxyController} 再用 {@link #waitRange} 确认字节所属 piece 已校验落盘。
 * 绝不能只按稀疏文件的逻辑长度直接读，否则未下载区域会变成零字节坏流。</p>
 */
@Service
public class TorrentService {

    private static final Logger log = LoggerFactory.getLogger(TorrentService.class);

    private static final long META_TIMEOUT_MS = 45_000L;
    private static final long HEAD_GATE_TIMEOUT_MS = 45_000L;
    private static final int HEAD_GATE_BYTES = 512 * 1024;
    private static final long IDLE_STOP_MS = 10 * 60_000L;
    private static final int MAX_SESSIONS = 3;
    private static final Pattern INFO_HASH_PATTERN = Pattern.compile(
            "(?:[?&])xt=urn:btih:([0-9a-fA-F]{40}|[A-Za-z2-7]{32})(?:&|$)",
            Pattern.CASE_INSENSITIVE);
    private static final Set<String> VIDEO_EXTENSIONS = Set.of(
            "mp4", "m4v", "mkv", "avi", "mov", "wmv", "flv", "ts", "m2ts", "webm",
            "rmvb", "rm", "mpg", "mpeg", "vob", "3gp");
    private static final List<String> STREAM_STATUS_KEYS = List.of(
            "status", "completedLength", "downloadSpeed", "pieceLength", "bitfield",
            "errorCode", "errorMessage");

    private final Aria2Client aria2;
    private final ConfigService configService;
    private final ConcurrentHashMap<String, TorrentSession> sessionsByGid = new ConcurrentHashMap<>();

    public TorrentService(Aria2Client aria2, ConfigService configService) {
        this.aria2 = aria2;
        this.configService = configService;
    }

    /**
     * 文件定位信息。fileOffset 是文件在整个 torrent 数据流里的偏移，仅用于 piece 映射；
     * RandomAccessFile 的 seek 仍使用文件内相对偏移 start。
     */
    public record TorrentFile(String absolutePath, long fileLength, long fileOffset, long pieceLength) {
    }

    private static final class TorrentSession {
        private final String magnetKey;
        private final String metadataGid;
        private final String gid;
        private final String title;
        private final int fileIndex;
        private final TorrentFile file;
        private volatile long lastAccess;

        private TorrentSession(String magnetKey, String metadataGid, String gid, String title,
                               int fileIndex, TorrentFile file) {
            this.magnetKey = magnetKey;
            this.metadataGid = metadataGid;
            this.gid = gid;
            this.title = title;
            this.fileIndex = fileIndex;
            this.file = file;
            this.lastAccess = System.currentTimeMillis();
        }
    }

    private record CandidateFile(int index, String path, long length, long offset) {
    }

    /**
     * 添加磁力并等待正片首块可读，返回同源播放地址。
     * 失败抛出带人话原因的 IllegalStateException，由播放链路保留原 magnet 并附加提示。
     */
    public String open(String magnet) {
        if (!StringUtils.hasText(magnet) || !magnet.trim().regionMatches(true, 0, "magnet:?", 0, 8)) {
            throw new IllegalStateException("磁力链接格式无法识别");
        }
        String normalizedMagnet = magnet.trim();
        String magnetKey = magnetKey(normalizedMagnet);
        TorrentSession existing = findByMagnetKey(magnetKey);
        if (existing != null) {
            try {
                long end = Math.min(HEAD_GATE_BYTES - 1L, existing.file.fileLength - 1L);
                TorrentFile ready = waitRange(existing.gid, existing.fileIndex, 0, end, HEAD_GATE_TIMEOUT_MS);
                if (ready != null) {
                    return streamUrl(existing.gid, existing.fileIndex);
                }
            } catch (RuntimeException ex) {
                log.debug("[BT] 复用旧会话失败，将重建: {}", ex.getMessage());
            }
            drop(existing);
        }

        reapSessions();
        Path downloadDir = downloadDir();
        // 没有 RPC 且没有 aria2c 时在这里明确报「aria2 未安装」，不影响其它播放源。
        aria2.ensureRunning(downloadDir);

        String metadataGid = null;
        String torrentGid = null;
        TorrentSession created = null;
        try {
            metadataGid = aria2.addUri(normalizedMagnet, downloadDir);
            torrentGid = waitFollowedBy(metadataGid, META_TIMEOUT_MS);
            List<CandidateFile> files = readFiles(torrentGid);
            CandidateFile picked = pickVideoFile(files);
            if (picked == null) {
                throw new IllegalStateException("种子内未找到视频文件（可能只是字幕或图片包）");
            }

            // 合集只下正片，避免其它剧集/字幕占用带宽。
            aria2.selectFile(torrentGid, picked.index);
            aria2.unpause(torrentGid);
            JsonNode status = aria2.tellStatus(torrentGid, List.of("pieceLength", "totalLength"));
            TorrentFile file = checkedTorrentFile(picked, number(status, "pieceLength"), downloadDir);
            created = new TorrentSession(magnetKey, metadataGid, torrentGid,
                    displayName(picked.path), picked.index, file);
            sessionsByGid.put(torrentGid, created);

            long headEnd = Math.min(HEAD_GATE_BYTES - 1L, file.fileLength - 1L);
            if (waitRange(torrentGid, picked.index, 0, headEnd, HEAD_GATE_TIMEOUT_MS) == null) {
                throw new IllegalStateException("BT 缓冲超时（做种者过少或无做种）");
            }
            log.info("[BT] 磁力起播: gid={} file#{} 「{}」", torrentGid, picked.index, created.title);
            return streamUrl(torrentGid, picked.index);
        } catch (RuntimeException ex) {
            if (created != null) {
                sessionsByGid.remove(torrentGid, created);
            }
            bestEffortRemove(torrentGid);
            if (metadataGid != null && !metadataGid.equals(torrentGid)) {
                bestEffortRemove(metadataGid);
            }
            if (ex instanceof IllegalStateException state) {
                throw state;
            }
            throw new IllegalStateException("BT 会话建立失败: " + ex.getMessage(), ex);
        }
    }

    /** 返回文件元数据，不等待数据落盘；供代理解析 Range 使用。 */
    public TorrentFile resolveFile(String gid, int fileIndex) {
        if (!StringUtils.hasText(gid) || fileIndex <= 0) {
            throw new IllegalArgumentException("BT 文件定位参数不正确");
        }
        TorrentSession session = sessionsByGid.get(gid);
        if (session != null) {
            if (session.fileIndex != fileIndex) {
                return null;
            }
            session.lastAccess = System.currentTimeMillis();
            return session.file;
        }

        // 应用重启但外部 aria2 仍在时，可凭 gid 重建只读播放会话。
        Path downloadDir = downloadDir();
        aria2.ensureRunning(downloadDir);
        List<CandidateFile> files = readFiles(gid);
        CandidateFile picked = files.stream().filter(file -> file.index == fileIndex).findFirst().orElse(null);
        if (picked == null) {
            return null;
        }
        JsonNode status = aria2.tellStatus(gid, List.of("pieceLength"));
        TorrentFile file = checkedTorrentFile(picked, number(status, "pieceLength"), downloadDir);
        TorrentSession restored = new TorrentSession("", null, gid, displayName(picked.path), fileIndex, file);
        sessionsByGid.put(gid, restored);
        return file;
    }

    /**
     * 等 [start,end]（文件内相对字节、闭区间）所在 piece 全部下载校验完成。
     * 超时返回 null；引擎/任务错误抛出原因，代理据此返回 503 而不是喂零字节。
     */
    public TorrentFile waitRange(String gid, int fileIndex, long start, long end, long timeoutMs) {
        TorrentFile file = resolveFile(gid, fileIndex);
        if (file == null) {
            return null;
        }
        if (start < 0 || end < start || start >= file.fileLength) {
            throw new IllegalArgumentException("BT Range 超出文件范围");
        }
        long targetEnd = Math.min(end, file.fileLength - 1L);
        long deadline = System.currentTimeMillis() + Math.max(0L, timeoutMs);

        while (true) {
            JsonNode status = aria2.tellStatus(gid, STREAM_STATUS_KEYS);
            String state = status.path("status").asText("");
            if (state.equals("error")) {
                String message = status.path("errorMessage").asText("未知下载错误");
                throw new IllegalStateException("BT 下载出错: " + message);
            }
            if (state.equals("removed")) {
                throw new IllegalStateException("BT 下载任务已移除");
            }
            long pieceLength = number(status, "pieceLength");
            if (pieceLength <= 0) {
                pieceLength = file.pieceLength;
            }
            boolean covered = state.equals("complete")
                    || (pieceLength > 0 && isPieceRangeSet(status.path("bitfield").asText(""),
                    firstPiece(file.fileOffset, pieceLength, start),
                    lastPiece(file.fileOffset, pieceLength, targetEnd)));
            if (covered && fileHasBytes(file.absolutePath, targetEnd + 1L)) {
                TorrentSession session = sessionsByGid.get(gid);
                if (session != null) {
                    session.lastAccess = System.currentTimeMillis();
                }
                return new TorrentFile(file.absolutePath, file.fileLength, file.fileOffset, pieceLength);
            }
            long remaining = deadline - System.currentTimeMillis();
            if (remaining <= 0) {
                return null;
            }
            try {
                Thread.sleep(Math.min(400L, remaining));
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
    }

    /** 内部排障能力：查询 aria2 原始状态。 */
    public JsonNode status(String gid) {
        aria2.ensureRunning(downloadDir());
        return aria2.tellStatus(gid, STREAM_STATUS_KEYS);
    }

    /** 内部清理能力：删除下载任务，保留下载文件供下次续传。 */
    public void remove(String gid) {
        TorrentSession session = sessionsByGid.remove(gid);
        aria2.ensureRunning(downloadDir());
        aria2.remove(gid);
        if (session != null && session.metadataGid != null && !session.metadataGid.equals(gid)) {
            bestEffortRemove(session.metadataGid);
        }
    }

    /** 内部排障能力：当前由本服务管理的任务状态列表。 */
    public List<JsonNode> list() {
        List<JsonNode> result = new ArrayList<>();
        for (String gid : sessionsByGid.keySet()) {
            try {
                result.add(status(gid));
            } catch (RuntimeException ex) {
                log.debug("[BT] 状态查询失败 gid={}: {}", gid, ex.getMessage());
            }
        }
        return result;
    }

    private String waitFollowedBy(String metadataGid, long timeoutMs) {
        long deadline = System.currentTimeMillis() + timeoutMs;
        while (System.currentTimeMillis() < deadline) {
            JsonNode status = aria2.tellStatus(metadataGid,
                    List.of("status", "followedBy", "errorCode", "errorMessage"));
            String followedBy = firstFollowedBy(status.get("followedBy"));
            if (!followedBy.isEmpty()) {
                return followedBy;
            }
            if (status.path("status").asText("").equals("error")
                    || !status.path("errorCode").asText("0").equals("0")) {
                String message = status.path("errorMessage").asText("无法取得种子元数据");
                throw new IllegalStateException("种子元数据下载失败: " + message);
            }
            try {
                Thread.sleep(700L);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("等待种子元数据被中断", ex);
            }
        }
        throw new IllegalStateException("等待种子元数据超时（该磁力可能已无做种或 tracker 不可达）");
    }

    private List<CandidateFile> readFiles(String gid) {
        JsonNode rawFiles = aria2.getFiles(gid);
        List<CandidateFile> result = new ArrayList<>(rawFiles.size());
        long offset = 0L;
        for (JsonNode raw : rawFiles) {
            int index = (int) number(raw, "index");
            long length = number(raw, "length");
            String path = raw.path("path").asText("");
            result.add(new CandidateFile(index, path, length, offset));
            offset = Math.addExact(offset, Math.max(0L, length));
        }
        return result;
    }

    private CandidateFile pickVideoFile(List<CandidateFile> files) {
        return files.stream()
                .filter(file -> file.length > 0 && VIDEO_EXTENSIONS.contains(extension(file.path)))
                .max(Comparator.comparingLong(CandidateFile::length))
                .orElse(null);
    }

    private TorrentFile checkedTorrentFile(CandidateFile file, long pieceLength, Path downloadDir) {
        if (file.length <= 0 || !StringUtils.hasText(file.path)) {
            throw new IllegalStateException("BT 视频文件为空或尚未取得路径");
        }
        final Path path;
        try {
            path = Path.of(file.path).toAbsolutePath().normalize();
        } catch (RuntimeException ex) {
            throw new IllegalStateException("aria2 返回了无效文件路径", ex);
        }
        Path root = downloadDir.toAbsolutePath().normalize();
        if (!path.startsWith(root)) {
            throw new IllegalStateException("aria2 文件不在 Playhub BT 缓存目录内，已拒绝读取");
        }
        return new TorrentFile(path.toString(), file.length, file.offset, pieceLength);
    }

    private Path downloadDir() {
        Path cacheDir = configService.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("Playhub 缓存目录尚未初始化");
        }
        Path dir = cacheDir.resolve("torrent").toAbsolutePath().normalize();
        try {
            Files.createDirectories(dir);
            return dir;
        } catch (Exception ex) {
            throw new IllegalStateException("BT 下载目录不可用: " + ex.getMessage(), ex);
        }
    }

    private String streamUrl(String gid, int fileIndex) {
        return "/proxy?do=bt&gid=" + URLEncoder.encode(gid, StandardCharsets.UTF_8) + "&file=" + fileIndex;
    }

    private TorrentSession findByMagnetKey(String key) {
        return sessionsByGid.values().stream()
                .filter(session -> session.magnetKey.equals(key))
                .findFirst()
                .orElse(null);
    }

    private void reapSessions() {
        long now = System.currentTimeMillis();
        List<TorrentSession> ordered = sessionsByGid.values().stream()
                .sorted(Comparator.comparingLong(session -> session.lastAccess))
                .toList();
        for (TorrentSession session : ordered) {
            boolean idle = now - session.lastAccess > IDLE_STOP_MS;
            boolean overCapacity = sessionsByGid.size() >= MAX_SESSIONS;
            if (!idle && !overCapacity) {
                break;
            }
            drop(session);
        }
    }

    private void drop(TorrentSession session) {
        if (session == null || !sessionsByGid.remove(session.gid, session)) {
            return;
        }
        bestEffortRemove(session.gid);
        if (session.metadataGid != null && !session.metadataGid.equals(session.gid)) {
            bestEffortRemove(session.metadataGid);
        }
    }

    private void bestEffortRemove(String gid) {
        if (!StringUtils.hasText(gid)) {
            return;
        }
        try {
            aria2.remove(gid);
        } catch (RuntimeException ex) {
            log.debug("[BT] 清理任务失败 gid={}: {}", gid, ex.getMessage());
        }
    }

    private static boolean fileHasBytes(String absolutePath, long requiredSize) {
        try {
            Path path = Path.of(absolutePath);
            return Files.isRegularFile(path) && Files.size(path) >= requiredSize;
        } catch (RuntimeException | java.io.IOException ex) {
            return false;
        }
    }

    private static long firstPiece(long fileOffset, long pieceLength, long start) {
        return Math.floorDiv(Math.addExact(fileOffset, start), pieceLength);
    }

    private static long lastPiece(long fileOffset, long pieceLength, long end) {
        return Math.floorDiv(Math.addExact(fileOffset, end), pieceLength);
    }

    /** aria2 bitfield 是 MSB-first hex；一个 hex 字符保存 4 个 piece。 */
    private static boolean isPieceRangeSet(String hex, long first, long last) {
        if (last < first) {
            return true;
        }
        for (long piece = first; piece <= last; piece++) {
            if (!isPieceSet(hex, piece)) {
                return false;
            }
            if (piece == Long.MAX_VALUE) {
                break;
            }
        }
        return true;
    }

    private static boolean isPieceSet(String hex, long piece) {
        if (piece < 0 || piece / 4 >= hex.length()) {
            return false;
        }
        int index = (int) (piece / 4);
        int digit = Character.digit(hex.charAt(index), 16);
        return digit >= 0 && ((digit >> (3 - (int) (piece & 3))) & 1) == 1;
    }

    private static String firstFollowedBy(JsonNode value) {
        if (value == null) {
            return "";
        }
        if (value.isTextual()) {
            return value.asText("").trim();
        }
        if (value.isArray()) {
            for (JsonNode item : value) {
                if (item.isTextual() && !item.asText("").isBlank()) {
                    return item.asText("").trim();
                }
            }
        }
        return "";
    }

    private static long number(JsonNode node, String field) {
        if (node == null) {
            return 0L;
        }
        JsonNode value = node.get(field);
        if (value == null) {
            return 0L;
        }
        try {
            return value.isNumber() ? value.asLong() : Long.parseLong(value.asText("0").trim());
        } catch (RuntimeException ex) {
            return 0L;
        }
    }

    private static String magnetKey(String magnet) {
        Matcher matcher = INFO_HASH_PATTERN.matcher(magnet);
        return matcher.find() ? matcher.group(1).toLowerCase(Locale.ROOT) : magnet;
    }

    private static String extension(String path) {
        String name = displayName(path);
        int dot = name.lastIndexOf('.');
        return dot <= 0 || dot == name.length() - 1
                ? "" : name.substring(dot + 1).toLowerCase(Locale.ROOT);
    }

    private static String displayName(String path) {
        String normalized = path == null ? "" : path.replace('\\', '/');
        int slash = normalized.lastIndexOf('/');
        return slash >= 0 ? normalized.substring(slash + 1) : normalized;
    }
}
