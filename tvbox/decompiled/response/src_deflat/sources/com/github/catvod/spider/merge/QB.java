package com.github.catvod.spider.merge;

import android.os.Build;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0056;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class QB implements Comparator<C0059Dl> {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f63short = {3246, 459};

    public QB() {
        int i = C0010.m301();

        if (i > 0) {
            return;
        } else {
            System.out.println(Integer.decode(C0011.m332("JOuv9x6OdDAXvLPyGIf")));
            return;
        }
    }

    public static void SN(List<C0059Dl> list) {
        int i = Build.VERSION.SDK_INT;

        if (i < 24) {
            Collections.sort(list, new QB());
            return;
        } else {
            list.sort(new QB());
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

    /* renamed from: ذنﺯﻅ  reason: contains not printable characters */
    public static String m1073(Object obj, Object obj2) {
        int i = C0042.m1998();

        if (i >= 0) {
            return null;
        } else {
            return ((QB) obj).yq((String) obj2);
        }
    }

    @Override // java.util.Comparator
    public final int compare(C0059Dl dl, C0059Dl dl2) {
        C0059Dl dl3 = dl;
        C0059Dl dl4 = dl2;
        boolean z = C0039.m1932(dl3);
        boolean z2 = C0039.m1932(dl4);

        if (z) {
            if (z2) {
                return 0;
            }
        }

        if (!z) {
            if (!z2) {
                return C0033.m1753(m1073(this, C0022.m1449(dl3)), m1073(this, C0022.m1449(dl4)));
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}
