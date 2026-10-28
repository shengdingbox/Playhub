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
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    System.out.println(Float.decode(C0012.m362("rFX")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    public static void SN(List<tX> list) {
        int i = Build.VERSION.SDK_INT;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 24) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    list.sort(new yF());
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                case 239:
                    Collections.sort(list, new yF());
                    return;
            }
            i2 = 1678;
        }
    }

    private String yq(String str) {
        int lastIndexOf = str.lastIndexOf(C0054.m2301(f77short, 0, 1, 1013));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (lastIndexOf <= 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    int length = str.length();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (lastIndexOf >= length - 1) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                return str;
                            case 500:
                                String substring = str.substring(0, lastIndexOf);
                                char charAt = substring.charAt(substring.length() - 1);
                                boolean isDigit = Character.isDigit(charAt);
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (!isDigit) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            return str;
                                        case 47417:
                                            return substring.substring(0, substring.length() - 1) + C0025.m1542(f77short, 1, 1, 844) + charAt + str.substring(lastIndexOf);
                                        case 47483:
                                            break;
                                    }
                                    i3 = 48705;
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return str;
            }
            i = 1678;
        }
    }

    /* renamed from: ﻝضحب  reason: contains not printable characters */
    public static String m1363(Object obj, Object obj2) {
        int i = C0007.m214();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i > 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((yF) obj).yq((String) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    @Override // java.util.Comparator
    public final int compare(tX tXVar, tX tXVar2) {
        tX tXVar3 = tXVar;
        tX tXVar4 = tXVar2;
        boolean z = C0022.m1447(tXVar3);
        boolean z2 = C0022.m1447(tXVar4);
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
                                return C0033.m1753(m1363(this, C0053.m2277(tXVar3)), m1363(this, C0053.m2277(tXVar4)));
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
