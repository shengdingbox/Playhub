package com.github.catvod.utils;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 字符串与小集合工具。
 * <p>对应原来的混淆包装 {@code C0128k}。
 */
public final class Strings {

    private Strings() {
    }

    /** 构造含两个键值对的 HashMap。 */
    public static HashMap<String, String> map(String key1, String value1, String key2, String value2) {
        HashMap<String, String> map = new HashMap<>();
        map.put(key1, value1);
        map.put(key2, value2);
        return map;
    }

    /** 用 "#" 连接所有元素。 */
    public static String join(Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            sb.append(it.next());
        }
        while (it.hasNext()) {
            sb.append("#");
            sb.append(it.next());
        }
        return sb.toString();
    }
}
