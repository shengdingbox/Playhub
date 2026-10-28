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
        int lastIndexOf = str.lastIndexOf(C0057.m2384(f68short, 0, 1, 1627));
        if (lastIndexOf <= 0 || lastIndexOf >= str.length() - 1) {
            return str;
        }
        String substring = str.substring(0, lastIndexOf);
        char charAt = substring.charAt(substring.length() - 1);
        if (!Character.isDigit(charAt)) {
            return str;
        }
        return substring.substring(0, substring.length() - 1) + C0055.m2320(f68short, 1, 1, 1224) + charAt + str.substring(lastIndexOf);
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
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z2) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            break;
                                        case 47483:
                                            return 0;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                    break;
                case 45:
                    int i5 = 49666;
                    while (true) {
                        i5 ^= 49683;
                        switch (i5) {
                            case 17:
                                if (!z2) {
                                    break;
                                } else {
                                    i5 = 49759;
                                    continue;
                                }
                            case 50:
                                break;
                            case 76:
                                int i6 = 49790;
                                while (true) {
                                    i6 ^= 49807;
                                    switch (i6) {
                                        case 18:
                                            return 1;
                                        case 241:
                                            i6 = 49821;
                                            break;
                                    }
                                }
                                break;
                            case 83:
                                return C0033.m1753(m1160(this, C0022.m1442(h73)), m1160(this, C0022.m1442(h74)));
                        }
                        i5 = 49728;
                    }
                    break;
                case 76:
                    int i7 = 48891;
                    while (true) {
                        i7 ^= 48908;
                        switch (i7) {
                            case 22:
                                return -1;
                            case 503:
                                i7 = 48922;
                                break;
                        }
                    }
                    break;
                case 239:
                    if (!z) {
                        break;
                    } else {
                        i4 = 48860;
                        continue;
                    }
            }
            i4 = 48829;
        }
    }
}
