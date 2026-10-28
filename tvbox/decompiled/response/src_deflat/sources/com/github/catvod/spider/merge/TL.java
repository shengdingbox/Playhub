package com.github.catvod.spider.merge;

import android.os.Build;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class TL implements Comparator<H7> {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f68short = {1653, 1272};

    public static void SN(List<H7> list) {
        if (Build.VERSION.SDK_INT >= 24) {
            list.sort(new TL());
        } else {
            Collections.sort(list, new TL());
        }
    }

    private String yq(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf <= 0 || lastIndexOf >= str.length() - 1) {
            return str;
        }
        String substring = str.substring(0, lastIndexOf);
        char charAt = substring.charAt(substring.length() - 1);
        if (!Character.isDigit(charAt)) {
            return str;
        }
        return substring.substring(0, substring.length() - 1) + "0" + charAt + str.substring(lastIndexOf);
    }

    /* renamed from: ضغنﻅ  reason: contains not printable characters */
    public static String m1160(Object obj, Object obj2) {
        if (C0024.m1502() >= 0) {
            return ((TL) obj).yq((String) obj2);
        }
        return null;
    }

    @Override // java.util.Comparator
    public final int compare(H7 h7, H7 h72) {
        H7 h73 = h7;
        H7 h74 = h72;
        boolean z = C0056.m2347(h73);
        boolean z2 = C0056.m2347(h74);

        if (z) {
            if (z2) {
                return 0;
            }
        }

        if (!z) {
            if (!z2) {
                return C0033.m1753(m1160(this, C0022.m1442(h73)), m1160(this, C0022.m1442(h74)));
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}
