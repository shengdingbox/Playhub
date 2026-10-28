package com.github.catvod.utils;

import android.content.SharedPreferences;

import com.github.catvod.spider.InitOrigin;

/**
 * 配置存储：{@code SharedPreferences("spUtils")} 的类型化读写。
 * <p>对应原来的混淆包装 {@code C0065Ku}（C0002.m78 / C0014.m419 等转发到此）。
 */
public final class Store {

    private Store() {
    }

    private static SharedPreferences sp() {
        return InitOrigin.context().getSharedPreferences("spUtils", 0);
    }

    /** 写入配置，按值的运行时类型分派 putString / putBoolean / putFloat / putInt / putLong。 */
    public static void put(String key, Object value) {
        if (value == null) {
            return;
        }
        SharedPreferences.Editor editor;
        if (value instanceof String) {
            editor = sp().edit().putString(key, (String) value);
        } else if (value instanceof Boolean) {
            editor = sp().edit().putBoolean(key, (Boolean) value);
        } else if (value instanceof Float) {
            editor = sp().edit().putFloat(key, (Float) value);
        } else if (value instanceof Integer) {
            editor = sp().edit().putInt(key, (Integer) value);
        } else if (value instanceof Long) {
            editor = sp().edit().putLong(key, (Long) value);
        } else {
            return;
        }
        editor.apply();
    }

    /** 读取字符串配置。 */
    public static String get(String key, String defValue) {
        return sp().getString(key, defValue);
    }

    /** 读取字符串配置（默认空串）。 */
    public static String get(String key) {
        return get(key, "");
    }

    /** 读取整数配置（默认 0）。 */
    public static int getInt(String key) {
        return sp().getInt(key, 0);
    }

    /** 读取布尔配置。 */
    public static boolean getBoolean(String key, boolean defValue) {
        return sp().getBoolean(key, defValue);
    }
}
