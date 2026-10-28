package com.github.catvod.utils;

import android.util.Base64;

import com.github.catvod.spider.ProxyOrigin;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * 播放地址代理封装。
 * <p>对应原来的混淆包装 {@code DC.B}。
 */
public final class Proxy {

    private Proxy() {
    }

    /** 把 m3u8 地址（含可选请求头）包装成本机代理地址。 */
    public static String m3u8(String url, HashMap<String, String> headers) {
        if (headers == null || headers.isEmpty()) {
            return ProxyOrigin.getUrl() + "?do=m3u8&url=" + URLEncoder.encode(url);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : headers.entrySet()) {
            sb.append(URLEncoder.encode((String) entry.getKey()));
            sb.append(":");
            sb.append(URLEncoder.encode((String) entry.getValue()));
            sb.append(";");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        String encoded = Base64.encodeToString(sb.toString().getBytes(), 2);
        return ProxyOrigin.getUrl() + "?do=m3u8&url=" + URLEncoder.encode(url) + "&headers=" + encoded;
    }
}
