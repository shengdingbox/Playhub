package com.github.catvod.spider.merge;

import android.content.SharedPreferences;
import com.github.catvod.spider.InitOrigin;
/* renamed from: com.github.catvod.spider.merge.Ku  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0065Ku {
    private static SharedPreferences N() {
        return InitOrigin.context().getSharedPreferences("spUtils", 0);
    }

    public static int SN(String str) {
        return N().getInt(str, 0);
    }

    public static void i(String str, Object obj) {
        SharedPreferences.Editor putLong;
        if (obj != null) {
            if (obj instanceof String) {
                putLong = N().edit().putString(str, (String) obj);
            } else if (obj instanceof Boolean) {
                putLong = N().edit().putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                putLong = N().edit().putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                putLong = N().edit().putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                putLong = N().edit().putLong(str, ((Long) obj).longValue());
            } else {
                return;
            }
            putLong.apply();
        }
    }

    public static String tF(String str) {
        return zH(str, "");
    }

    public static boolean yq(String str, boolean z) {
        return N().getBoolean(str, z);
    }

    public static String zH(String str, String str2) {
        return N().getString(str, str2);
    }
}
