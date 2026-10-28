package com.github.catvod.utils;

import com.github.catvod.spider.merge.V3;

import java.util.Map;

/**
 * HTTP 请求封装。
 * <p>底层复用项目自带的 OkHttp 客户端 {@code V3}（原调用点 {@code C0005.m167(...).yq()}）。
 */
public final class Http {

    private Http() {
    }

    /** POST 表单请求，返回响应正文。 */
    public static String post(String url, Map<String, String> params, Map<String, String> headers) {
        return V3.t0(url, params, headers).yq();
    }
}
