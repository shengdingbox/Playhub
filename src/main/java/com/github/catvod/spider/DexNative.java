package com.github.catvod.spider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 加固包（mediahub-spider.jar）外层 dex 里 native 桥接类的桌面端桩。
 *
 * <p>原始实现见该 jar 的 classes.dex：
 * <pre>
 * public class DexNative {
 *     static { 从 assets 释放 ftyguard_v8.so/v7.so 到 cacheDir，System.load() }
 *     public static native String decrypt(String str);
 *     public static native String encrypt(String str);
 *     public static native Object getLoader(Object obj);
 *     public static native Object getSpider(Object obj, String str);
 *     public static native Object[] proxyInvoke(Object obj, Object obj2);
 * }
 * </pre>
 *
 * <p>它是 {@code InitOrigin.i} 期望注入的类（签名 {@code String decrypt(String)} 完全匹配），
 * 也就是 {@code Rc.KJ(String)} → {@code InitOrigin.i.decrypt(str)} 这条 ext 解密链的终点。
 *
 * <p><b>桌面端限制</b>：真实 decrypt 由 {@code ftyguard_v7.so}(ELF32 ARM) /
 * {@code ftyguard_v8.so}(ELF64 AARCH64) 实现，两者都是纯 ARM 指令集，
 * x64 JVM 无法加载或执行。
 *
 * <p><b>这里刻意不抛异常，改为原样返回</b>：若抛 {@link UnsatisfiedLinkError}，
 * 爬虫内部的 {@code Rc.KJ} 会进 catch 分支并 {@code printStackTrace()}，
 * 每次初始化都刷一整段栈帧。返回原串不会触发它，且这里只提示一次，
 * 日志保持干净——代价是该类站点的 ext 依旧解不出来（本来也解不出来）。
 */
public final class DexNative {

    private static final Logger log = LoggerFactory.getLogger(DexNative.class);

    /** 只提示一次，避免每次创建爬虫都刷屏。 */
    private static final AtomicBoolean NOTICE_LOGGED = new AtomicBoolean(false);

    private DexNative() {
    }

    /** 与原始 native 方法同签名；桌面端无 ARM 库可链接，原样返回。 */
    public static String decrypt(String str) {
        noticeOnce();
        return str == null ? "" : str;
    }

    public static String encrypt(String str) {
        noticeOnce();
        return str == null ? "" : str;
    }

    private static void noticeOnce() {
        if (NOTICE_LOGGED.compareAndSet(false, true)) {
            log.warn("[DexNative] 站点 ext 需要 ARM 原生库解密（ftyguard_v7/v8.so），"
                    + "当前平台无法加载，将按原样返回；相关站点会因缺少配置而不可用（仅提示一次）");
        }
    }
}
