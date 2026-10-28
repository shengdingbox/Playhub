package com.github.catvod.spider.merge;

import android.os.Build;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0003;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0053;
import java.util.Comparator;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Jb implements Comparator<Nh> {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f59short = {2982, 2407};

    public Jb() {
        int i = C0045.m2093();

        if (i > 0) {
            return;
        } else {
            System.out.println(Double.decode(C0024.m1516("svquRDk6GqgUsVqDqywSZiqZGWb")));
            return;
        }
    }

    public static void SN(List<Nh> list) {
        int i = Build.VERSION.SDK_INT;

        if (i < 24) {
            return;
        } else {
            list.sort(new Jb());
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

    /* renamed from: فخﻁج  reason: contains not printable characters */
    public static String m1037(Object obj, Object obj2) {
        int i = C0039.m1918();

        if (i >= 0) {
            return null;
        } else {
            return ((Jb) obj).yq((String) obj2);
        }
    }

    @Override // java.util.Comparator
    public final int compare(Nh nh, Nh nh2) {
        Nh nh3 = nh;
        Nh nh4 = nh2;
        boolean z = C0001.m23(nh3);
        boolean z2 = C0001.m23(nh4);

        if (z) {
            if (z2) {
                return 0;
            }
        }

        if (!z) {
            if (!z2) {
                return C0033.m1753(m1037(this, C0053.m2286(nh3)), m1037(this, C0053.m2286(nh4)));
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}
