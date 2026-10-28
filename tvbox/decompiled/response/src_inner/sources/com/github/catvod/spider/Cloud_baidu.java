package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0080aF;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.RQ;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Cloud_baidu extends Spider {
    public static boolean i = false;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f24short = {2172, 2080, 2172, 2171, 2056, 2061, 2172, 2062, 2168, 2170, 2063, 2156, 2083, 2084, 2103, 2158, 2171, 2171, 2056, 2061, 2172, 2062, 2168, 2170, 2170, 27466, 23372, 28827, 2208, 2226, 2226, 2241, 2244, 2229, 2247, 2225, 2227, 2227, 1776, 1761, 1774, 1710, 1762, 1761, 1769, 1764, 1781, 1710, 1763, 1775, 1773, 1711, 1710, 1706, 1727, 1756, 1727, 1779, 1781, 1778, 1772, 1725, 1704, 1755, 1758, 1711, 1757, 1707, 1705, 1702, 1776, 1783, 1764, 1725, 1704, 1704, 1755, 1758, 1711, 1757, 1707, 1705, 1705, 2308, 2392, 2308, 2307, 2416, 2421, 2423, 2324, 2422, 2304, 2306, 525, 512, 521, 540, 1508, 1506, 1525, 2547, 2544, 2546, 3321, 3326, 3296, 3301, 3300, 26106, 22012, 32299, 1623, 24208, 24208, 28015, -24865, 3105, 3086, 3085, 3095, 3078, 3151, 3078, 3088, 3083, 3092, 3079, 399, 398, 919, 913, 950, 926, 2434, 2464, 2492, 2492, 2488, 1316, 1176, 1182, 3098, 3083, 3076, 3125, 3097, 3077, 3103, 3096, 3081, 3087, 3125, 3097, 3077, 3096, 3102, 1510, 1530, 1511, 1505, 2511, 2543, 3044, 2971, 2646, 27767, 28653, -25507, 20821, 2640, 28388, 27557, 29135, 27206, 28301, 27694, 25883, 28003, 27888, -2366, 23508, 21564, 27557, 29135, 32586, -32199, 23545, 27774, 1436, 1436, 1436};
    private static String zH = "";
    private final Pattern yq = C0005.m166(C0005.m169(m702(), 0, 25, 2131));
    private final Pattern SN = C0005.m166(C0013.m380(m702(), 25, 13, 2202));
    private final Pattern N = C0005.m166(C0006.m180(m702(), 38, 45, 1664));
    private final Pattern tF = C0005.m166(C0053.m2276(m702(), 83, 11, 2347));

    public Cloud_baidu() {
        int i2 = C0048.m2140();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 < 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    System.out.println(Double.valueOf(C0052.m2269("S9")));
                    return;
                case 239:
                    return;
            }
            i3 = 1678;
        }
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = (String) C0000.m15(map, C0055.m2320(m702(), 94, 4, 633));
        boolean z = C0022.m1448(str, C0044.m2052(m702(), 98, 3, 1431));
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return C0036.m1842(C0008.m243(), map);
                case 239:
                    boolean z2 = C0022.m1448(str, C0043.m2020(m702(), 101, 3, 2496));
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (!z2) {
                                    break;
                                } else {
                                    i3 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                boolean z3 = C0022.m1448(str, C0046.m2123(m702(), 104, 5, 3216));
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i4 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            return null;
                                        case 47417:
                                            return C0020.m1378(C0008.m243(), map);
                                        case 47483:
                                            break;
                                    }
                                    i4 = 48705;
                                }
                                break;
                            case 500:
                                return C0026.m1550(C0008.m243());
                        }
                        i3 = 1802;
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    public static Object[] proxys(Map<String, String> map, Map<String, String> map2, String str) {
        String str2 = "۠۟ۦ";
        RQ rq = null;
        Object[] objArr = null;
        while (true) {
            switch (C0002.m76(str2)) {
                case 1747655:
                    rq = C0008.m243();
                    str2 = "۟ۤ۠";
                    break;
                case 1754598:
                    return objArr;
                default:
                    objArr = C0038.m1914(rq, map2);
                    str2 = "ۧۦۥ";
                    break;
            }
        }
    }

    /* renamed from: سخكﻕ  reason: contains not printable characters */
    public static short[] m702() {
        int i2 = C0003.m81();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 < 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return f24short;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: سخﺫﺽ  reason: contains not printable characters */
    public static String m703() {
        int i2 = C0008.m250();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 <= 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return zH;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: عﻙﺝﺏ  reason: contains not printable characters */
    public static Pattern m704(Object obj) {
        int i2 = C0009.m276();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 < 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return ((Cloud_baidu) obj).tF;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: وﻉﻱت  reason: contains not printable characters */
    public static Pattern m705(Object obj) {
        int i2 = C0023.m1475();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 < 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return ((Cloud_baidu) obj).SN;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: يذﻉا  reason: contains not printable characters */
    public static Pattern m706(Object obj) {
        int i2 = C0040.m1954();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 > 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return ((Cloud_baidu) obj).N;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﻁﺝﻉر  reason: contains not printable characters */
    public static Pattern m707(Object obj) {
        int i2 = C0044.m2051();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 >= 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return ((Cloud_baidu) obj).yq;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    public String detailContent(List<String> list) {
        ME me = C0032.m1725(this, list);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (me != null) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return C0031.m1705();
                case 239:
                    return C0000.m21(me);
            }
            i2 = 1678;
        }
    }

    public ME detailVideo(List<String> list) {
        String str;
        String str2;
        boolean z = C0020.m1370(C0037.m1873(C0015.m439(C0008.m243())));
        String str3 = C0031.m1705();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    zH = str3;
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        String str4 = C0024.m1512((String) C0035.m1801(list, 0));
        boolean z2 = C0037.m1888(str4, C0037.m1882(m702(), 109, 3, 1578));
        int i3 = 1740;
        while (true) {
            i3 ^= 1757;
            switch (i3) {
                case 17:
                    if (!z2) {
                        break;
                    } else {
                        i3 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    break;
                case 500:
                    Matcher matcher = C0022.m1425(m704(this), str4);
                    boolean z3 = C0054.m2303(matcher);
                    int i4 = 1864;
                    while (true) {
                        i4 ^= 1881;
                        switch (i4) {
                            case 17:
                                if (!z3) {
                                    break;
                                } else {
                                    i4 = 48736;
                                    continue;
                                }
                            case 47384:
                                str = str3;
                                break;
                            case 47417:
                                str = C0030.m1678(matcher, 1);
                                int i5 = 48767;
                                while (true) {
                                    i5 ^= 48784;
                                    switch (i5) {
                                        case 14:
                                            break;
                                        case 239:
                                            i5 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                        }
                        i4 = 48705;
                    }
                    Matcher matcher2 = C0022.m1425(m705(this), str4);
                    boolean z4 = C0054.m2303(matcher2);
                    int i6 = 48891;
                    while (true) {
                        i6 ^= 48908;
                        switch (i6) {
                            case 22:
                                break;
                            case 53:
                                str2 = str3;
                                break;
                            case 503:
                                if (!z4) {
                                    break;
                                } else {
                                    i6 = 49635;
                                    continue;
                                }
                            case 32495:
                                str2 = C0030.m1678(matcher2, 1);
                                int i7 = 49666;
                                while (true) {
                                    i7 ^= 49683;
                                    switch (i7) {
                                        case 17:
                                            i7 = 49697;
                                            break;
                                        case 50:
                                            break;
                                    }
                                }
                                break;
                        }
                        i6 = 48953;
                    }
                    boolean z5 = C0054.m2307(str);
                    int i8 = 49790;
                    while (true) {
                        i8 ^= 49807;
                        switch (i8) {
                            case 18:
                                break;
                            case 51:
                                break;
                            case 84:
                                boolean z6 = C0054.m2307(str2);
                                int i9 = 49914;
                                while (true) {
                                    i9 ^= 49931;
                                    switch (i9) {
                                        case 497:
                                            if (z6) {
                                                break;
                                            } else {
                                                i9 = 50658;
                                                continue;
                                            }
                                        case 1711:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            return C0044.m2074(C0008.m243(), str, str2);
                                    }
                                    i9 = 50627;
                                }
                                break;
                            case 241:
                                if (z5) {
                                    break;
                                } else {
                                    i8 = 49883;
                                    continue;
                                }
                        }
                        i8 = 49852;
                    }
                    break;
            }
            i3 = 1802;
        }
        Matcher matcher3 = C0022.m1425(m707(this), str4);
        boolean z7 = C0054.m2303(matcher3);
        int i10 = 50689;
        while (true) {
            i10 ^= 50706;
            switch (i10) {
                case 19:
                    if (!z7) {
                        break;
                    } else {
                        i10 = 50782;
                        continue;
                    }
                case 45:
                    Matcher matcher4 = C0022.m1425(m706(this), str4);
                    boolean z8 = C0054.m2303(matcher4);
                    int i11 = 50813;
                    while (true) {
                        i11 ^= 50830;
                        switch (i11) {
                            case 18:
                                break;
                            case 53:
                                Matcher matcher5 = C0022.m1425(m704(this), str4);
                                boolean z9 = C0054.m2303(matcher5);
                                int i12 = 51588;
                                while (true) {
                                    i12 ^= 51605;
                                    switch (i12) {
                                        case 17:
                                            if (!z9) {
                                                break;
                                            } else {
                                                i12 = 51681;
                                                continue;
                                            }
                                        case 54:
                                            break;
                                        case 87:
                                            return null;
                                        case 116:
                                            return C0044.m2074(C0008.m243(), C0030.m1678(matcher5, 1), str3);
                                    }
                                    i12 = 51650;
                                }
                                break;
                            case 243:
                                if (!z8) {
                                    break;
                                } else {
                                    i11 = 51557;
                                    continue;
                                }
                            case 4075:
                                StringBuilder sb = C0052.m2253(C0057.m2384(m702(), 112, 1, 1638));
                                C0032.m1746(sb, C0030.m1678(matcher4, 1));
                                return C0044.m2074(C0008.m243(), C0043.m2039(sb), C0030.m1678(matcher4, 2));
                        }
                        i11 = 50875;
                    }
                    break;
                case 50:
                    break;
                case 76:
                    return C0044.m2074(C0008.m243(), C0030.m1678(matcher3, 1), C0030.m1678(matcher3, 2));
            }
            i10 = 50751;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x020e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Cloud_baidu.init(android.content.Context, java.lang.String):void");
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = C0028.m1613(m702(), 165, 6, 2573);
        String str4 = C0031.m1705();
        try {
            boolean z = C0004.m142();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (z) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        boolean z2 = C0020.m1370(C0037.m1873(C0015.m439(C0008.m243())));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (z2) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean z3 = C0026.m1555(C0008.m243());
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                if (!z3) {
                                                    break;
                                                } else {
                                                    i4 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                i = true;
                                                return C0011.m335(C0007.m215(C0044.m2052(m702(), 171, 18, 2510)));
                                            case 47417:
                                                boolean z4 = C0013.m396(C0008.m243());
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case 76:
                                                            long j = C0043.m2022() / 1000;
                                                            long j2 = C0045.m2085(C0030.m1673(C0008.m243()));
                                                            int i6 = 48891;
                                                            while (true) {
                                                                i6 ^= 48908;
                                                                switch (i6) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 503:
                                                                        if (j <= j2) {
                                                                            break;
                                                                        } else {
                                                                            i6 = 49635;
                                                                            continue;
                                                                        }
                                                                    case 32495:
                                                                        boolean z5 = C0020.m1370(C0020.m1372(C0015.m439(C0008.m243())));
                                                                        int i7 = 49666;
                                                                        while (true) {
                                                                            i7 ^= 49683;
                                                                            switch (i7) {
                                                                                case 17:
                                                                                    if (z5) {
                                                                                        break;
                                                                                    } else {
                                                                                        i7 = 49759;
                                                                                        continue;
                                                                                    }
                                                                                case 50:
                                                                                    break;
                                                                                case 76:
                                                                                    C0003.m99(C0008.m243());
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i7 = 49728;
                                                                        }
                                                                    default:
                                                                        continue;
                                                                }
                                                                i6 = 48953;
                                                            }
                                                            C0006.m202(C0008.m243(), C0046.m2126(C0008.m243()));
                                                            break;
                                                        case 239:
                                                            if (z4) {
                                                                break;
                                                            } else {
                                                                i5 = 48860;
                                                                continue;
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                    i5 = 48829;
                                                }
                                                i = true;
                                                int i8 = 49790;
                                                while (true) {
                                                    i8 ^= 49807;
                                                    switch (i8) {
                                                        case 18:
                                                            break;
                                                        case 241:
                                                            i8 = 49821;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i4 = 48705;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            boolean z6 = C0020.m1370(C0037.m1873(C0015.m439(C0008.m243())));
            int i9 = 49914;
            while (true) {
                i9 ^= 49931;
                switch (i9) {
                    case 497:
                        if (!z6) {
                            break;
                        } else {
                            i9 = 50658;
                            continue;
                        }
                    case 1711:
                        break;
                    case 1736:
                        break;
                    case 1769:
                        boolean z7 = C0022.m1448(C0024.m1495(m703(), str3, str4), C0024.m1495(str, str3, str4));
                        int i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    if (z7) {
                                        break;
                                    } else {
                                        i10 = 50782;
                                        continue;
                                    }
                                case 45:
                                    break;
                                case 50:
                                    break;
                                case 76:
                                    C0026.m1555(C0008.m243());
                                    zH = str;
                                    i = true;
                                    break;
                                default:
                                    continue;
                            }
                            i10 = 50751;
                        }
                    default:
                        continue;
                }
                i9 = 50627;
            }
            C0080aF.G4 = str;
            return C0041.m1979(C0008.m243(), str2, str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, C0050.m2227(e));
            C0032.m1746(sb, C0051.m2237(m702(), 189, 3, 1457));
            C0006.m194(C0043.m2039(sb));
            return str4;
        }
    }

    public void setFlag(String str) {
        zH = C0031.m1705();
        int i2 = C0000.m13();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 > 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    System.out.println(Long.parseLong(C0055.m2313("Zi7adCGESQanDK7fV33alJLQKAa")));
                    return;
                case 239:
                    return;
            }
            i3 = 1678;
        }
    }
}
