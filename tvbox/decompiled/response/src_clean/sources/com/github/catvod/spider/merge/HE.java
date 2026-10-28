package com.github.catvod.spider.merge;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.github.catvod.spider.InitOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class HE {
    private static SharedPreferences N() {
        return PreferenceManager.getDefaultSharedPreferences(InitOrigin.context());
    }

    public static boolean SN(String str) {
        return N().getBoolean(str, false);
    }

    public static void tF() {
        Boolean bool = Boolean.FALSE;
        if (bool != null) {
            (bool instanceof String ? N().edit().putString("danmu_load", (String) bool) : N().edit().putBoolean("danmu_load", bool.booleanValue())).apply();
        }
    }

    public static Boolean yq() {
        if (N().contains("danmu_load")) {
            return Boolean.valueOf(N().getBoolean("danmu_load", false));
        }
        return null;
    }
}
