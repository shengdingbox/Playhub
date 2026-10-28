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
                    System.out.println(Double.decode(C0024.m1516("svquRDk6GqgUsVqDqywSZiqZGWb")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    public static void SN(List<Nh> list) {
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
                    list.sort(new Jb());
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private String yq(String str) {
        int lastIndexOf = str.lastIndexOf(C0003.m86(f59short, 0, 1, 2952));
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
                                            return substring.substring(0, substring.length() - 1) + C0047.m2133(f59short, 1, 1, 2391) + charAt + str.substring(lastIndexOf);
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

    /* renamed from: فخﻁج  reason: contains not printable characters */
    public static String m1037(Object obj, Object obj2) {
        int i = C0039.m1918();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((Jb) obj).yq((String) obj2);
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
    public final int compare(Nh nh, Nh nh2) {
        Nh nh3 = nh;
        Nh nh4 = nh2;
        boolean z = C0001.m23(nh3);
        boolean z2 = C0001.m23(nh4);
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
                                return C0033.m1753(m1037(this, C0053.m2286(nh3)), m1037(this, C0053.m2286(nh4)));
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
