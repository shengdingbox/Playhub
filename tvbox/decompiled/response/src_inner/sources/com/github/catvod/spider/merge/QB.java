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
                    System.out.println(Integer.decode(C0011.m332("JOuv9x6OdDAXvLPyGIf")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    public static void SN(List<C0059Dl> list) {
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
                    list.sort(new QB());
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
                    Collections.sort(list, new QB());
                    return;
            }
            i2 = 1678;
        }
    }

    private String yq(String str) {
        int lastIndexOf = str.lastIndexOf(C0004.m130(f63short, 0, 1, 3200));
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
                                            return substring.substring(0, substring.length() - 1) + C0056.m2339(f63short, 1, 1, 507) + charAt + str.substring(lastIndexOf);
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

    /* renamed from: ذنﺯﻅ  reason: contains not printable characters */
    public static String m1073(Object obj, Object obj2) {
        int i = C0042.m1998();
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
                    return ((QB) obj).yq((String) obj2);
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
    public final int compare(C0059Dl dl, C0059Dl dl2) {
        C0059Dl dl3 = dl;
        C0059Dl dl4 = dl2;
        boolean z = C0039.m1932(dl3);
        boolean z2 = C0039.m1932(dl4);
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
                                return C0033.m1753(m1073(this, C0022.m1449(dl3)), m1073(this, C0022.m1449(dl4)));
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
