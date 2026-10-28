package com.github.catvod.spider;

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
 * Windows x64 JVM 无法加载或执行。因此这里只保留类与签名，
 * 让调用方能走到 native 边界并得到明确的错误，而不是被 NPE 掩盖。
 */
public final class DexNative {

    private DexNative() {
    }

    /** 与原始 native 方法同签名；桌面端无 ARM 库可链接。 */
    public static String decrypt(String str) {
        throw new UnsatisfiedLinkError(
                "DexNative.decrypt 需要 ARM 原生库 (ftyguard_v7/v8.so)，当前平台无法加载");
    }

    public static String encrypt(String str) {
        throw new UnsatisfiedLinkError(
                "DexNative.encrypt 需要 ARM 原生库 (ftyguard_v7/v8.so)，当前平台无法加载");
    }
}
