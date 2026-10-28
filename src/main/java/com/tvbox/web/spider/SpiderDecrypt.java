package com.tvbox.web.spider;

/**
 * 供 fty 加固包内层爬虫使用的字符串解密入口。
 *
 * <p>内层 dex 里的 {@code com.github.catvod.spider.merge.Rc.KJ(String)} 会执行：
 * <pre>
 *   if (cn.yq) return HideUtils.decrypt(str);
 *   return InitOrigin.i.getDeclaredMethod("decrypt", String.class).invoke(null, str);
 * </pre>
 * 其中 {@code HideUtils} 并不在这个 jar 内（由宿主 TVBox 提供），
 * {@code cn.yq} 默认 false，因此必须由宿主调用
 * {@code InitOrigin.setClass(...)} 注入一个含 {@code decrypt(String)} 的类，
 * 否则 {@code InitOrigin.i} 为 null，爬虫 init 阶段直接抛 NullPointerException。
 *
 * <p>这里提供的实现是"原样返回"的兜底：多数爬虫只是用 KJ 解一个可选参数，
 * 拿到原串即可继续；确需真正解密时再替换本方法。
 */
public final class SpiderDecrypt {

    private SpiderDecrypt() {
    }

    public static String decrypt(String value) {
        return value == null ? "" : value;
    }
}
