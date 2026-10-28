package com.github.catvod.spider.merge;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/* renamed from: com.github.catvod.spider.merge.oS  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0156oS {
    private static final Random yq = new Random();
    private static final List<String> SN = Arrays.asList("25060RK16C");
    private static final List<String> N = Arrays.asList("Xiaomi");

    public static String SN() {
        String str = Build.MODEL;
        boolean z = true;
        if (str != null) {
            int length = str.length();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = true;
                    break;
                }
                int codePointAt = str.codePointAt(i);
                if (!Character.isWhitespace(codePointAt)) {
                    break;
                }
                i += Character.charCount(codePointAt);
            }
            if (!z2) {
                z = str.matches(".*[^a-zA-Z0-9_\\-\\.].*");
            }
        }
        if (!z) {
            return str;
        }
        List<String> list = SN;
        return list.get(yq.nextInt(list.size()));
    }

    public static String yq() {
        String str = Build.BRAND;
        if (str != null && !str.trim().isEmpty()) {
            return str;
        }
        List<String> list = N;
        return list.get(yq.nextInt(list.size()));
    }
}
