package com.tvbox.web.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Generates fallback candidate URLs for GitHub-hosted resources.
 *
 * TVBox configs frequently reference raw.githubusercontent.com directly or
 * through proxy wrappers (ghfast.top, git.yylx.win, gh-proxy.com, ...).
 * Depending on the network, the primary host may be unreachable while a
 * mirror works. This resolver expands such a URL into an ordered candidate
 * list: the original first, then known mirrors, then the unwrapped direct URL.
 * Non-GitHub URLs resolve to a single-element list (the URL itself).
 */
public final class GithubMirrorResolver {

    /** Proxy wrappers seen in the wild: https://host/<original-url>. */
    private static final Pattern WRAPPED_GITHUB_URL = Pattern.compile(
            "^https?://(?:git\\.yylx\\.win|ghfast\\.top|mirror\\.ghproxy\\.com|gh-proxy\\.com|ghproxy\\.net|ghproxy\\.com|hub\\.fastgit\\.xyz)/(https?://\\S+)$",
            Pattern.CASE_INSENSITIVE);

    private static final Pattern GITHUB_HOST = Pattern.compile(
            "^https?://(?:raw\\.githubusercontent\\.com|github\\.com|gist\\.githubusercontent\\.com)/\\S+$",
            Pattern.CASE_INSENSITIVE);

    /** Mirrors tried (in order) after the original URL fails. */
    private static final List<String> MIRROR_PREFIXES = List.of(
            "https://gh-proxy.com/",
            "https://ghfast.top/");

    private GithubMirrorResolver() {
    }

    /**
     * Returns an ordered, de-duplicated list of URLs to try. The first element
     * is always the original URL. For GitHub content (direct or wrapped),
     * mirror candidates and the unwrapped direct URL follow.
     */
    public static List<String> candidates(String url) {
        LinkedHashSet<String> result = new LinkedHashSet<>();
        if (url == null || url.isBlank()) {
            return List.of();
        }

        String inner = unwrap(url);
        if (inner != null) {
            // 包装地址（git.yylx.win / ghfast.top 等代理常年在部分地区不可达）：
            // 优先走镜像 + 裸地址，原始包装地址放最后，避免每次白等一次超时。
            for (String prefix : MIRROR_PREFIXES) {
                result.add(prefix + inner);
            }
            result.add(inner);
            result.add(url);
            return new ArrayList<>(result);
        }

        result.add(url);
        if (isGithubUrl(url)) {
            for (String prefix : MIRROR_PREFIXES) {
                result.add(prefix + url);
            }
        }
        return new ArrayList<>(result);
    }

    /** Extracts the wrapped original URL from a proxy-prefixed URL, or null. */
    public static String unwrap(String url) {
        if (url == null) {
            return null;
        }
        Matcher matcher = WRAPPED_GITHUB_URL.matcher(url);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static boolean isGithubUrl(String url) {
        return url != null && GITHUB_HOST.matcher(url).matches();
    }

    /** True when the URL is GitHub content, direct or wrapped in a known proxy. */
    public static boolean isMirroredContent(String url) {
        return isGithubUrl(url) || unwrap(url) != null;
    }
}
