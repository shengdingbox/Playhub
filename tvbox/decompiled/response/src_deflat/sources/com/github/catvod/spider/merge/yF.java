package com.github.catvod.spider.merge;

import android.os.Build;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0012;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class yF implements Comparator<tX> {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f77short = {987, 892};

    public yF() {
        int i = C0002.m60();

        if (i < 0) {
            return;
        } else {
            System.out.println(Float.decode(C0012.m362("rFX")));
            return;
        }
    }

    public static void SN(List<tX> list) {
        int i = Build.VERSION.SDK_INT;

        if (i < 24) {
            Collections.sort(list, new yF());
            return;
        } else {
            list.sort(new yF());
            return;
        }
    }

    private String yq(String str) {
        int lastIndexOf = str.lastIndexOf(".");

        if (lastIndexOf <= 0) {
            return str;
        } else {
            int length = str.length();
            if (lastIndexOf >= length - 1) {
                return str;
            } else {
                String substring = str.substring(0, lastIndexOf);
                char charAt = substring.charAt(substring.length() - 1);
                boolean isDigit = Character.isDigit(charAt);
                if (!isDigit) {
                    return str;
                } else {
                    return substring.substring(0, substring.length() - 1) + "0" + charAt + str.substring(lastIndexOf);
                }
                return str;
            }
            return str;
        }
    }

    /* renamed from: ﻝضحب  reason: contains not printable characters */
    public static String m1363(Object obj, Object obj2) {
        int i = C0007.m214();

        if (i > 0) {
            return null;
        } else {
            return ((yF) obj).yq((String) obj2);
        }
    }

    @Override // java.util.Comparator
    public final int compare(tX tXVar, tX tXVar2) {
        tX tXVar3 = tXVar;
        tX tXVar4 = tXVar2;
        boolean z = C0022.m1447(tXVar3);
        boolean z2 = C0022.m1447(tXVar4);

        if (z) {
            if (z2) {
                return 0;
            }
        }

        if (!z) {
            if (!z2) {
                return C0033.m1753(m1363(this, C0053.m2277(tXVar3)), m1363(this, C0053.m2277(tXVar4)));
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}
