package com.github.catvod.spider;

import java.util.Map;

/**
 * 宿主提供的 {@code com.github.catvod.spider.Proxy}。
 *
 * <p>部分 TVBox 蜘蛛包里自带的同名类只含 {@code proxy(Map)} 与 {@code <init>}，
 * 缺 {@code getProxyUrlDo(String)}；Android 端由 App dex 里的完整版兜住，
 * 桌面端若解析到这个极简版会抛 {@code NoSuchMethodError}。
 *
 * <p>由于类加载器是 parent-first，本类会**遮蔽**转换产物里被
 * {@code SpiderClassPatcher} 补全过的那份，所以这里必须自己把方法补齐。
 */
public class Proxy {

    /**
     * 本机代理基地址。
     *
     * <p>端口按「系统属性 → 环境变量 → 默认 18080」的顺序解析，
     * 保证改了 {@code APP_PORT} 或 {@code -Dserver.port} 后蜘蛛拼出的地址仍然正确。
     */
    private static final String BASE_URL = "http://127.0.0.1:" + resolvePort() + "/proxy";

    private Proxy() {
    }

    private static String resolvePort() {
        String port = System.getProperty("server.port");
        if (port == null || port.isBlank() || "0".equals(port.trim())) {
            port = System.getenv("APP_PORT");
        }
        if (port == null || port.isBlank() || "0".equals(port.trim())) {
            port = "18080";
        }
        return port.trim();
    }

    /** 蜘蛛的本地代理入口（Android 端由 App 的完整实现接管；桌面端走我们的 /proxy）。 */
    public static Object[] proxy(Map<?, ?> params) {
        return null;
    }

    public static String getUrl() {
        return BASE_URL;
    }

    /**
     * 拼一个「按 do 路由」的代理地址，例如 {@code getProxyUrlDo("pan")}
     * → {@code http://127.0.0.1:18080/proxy?do=pan}。
     *
     * <p>与 {@code ProxyController} 的 {@code do=} 路由约定一致。
     */
    public static String getProxyUrlDo(String doName) {
        if (doName == null || doName.isBlank()) {
            return BASE_URL;
        }
        return BASE_URL + "?do=" + doName;
    }
}
