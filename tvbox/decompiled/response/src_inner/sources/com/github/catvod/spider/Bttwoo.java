package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Bttwoo extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f23short = {2656, 2684, 2684, 2680, 2683, 2610, 2599, 2599, 2687, 2687, 2687, 2598, 2666, 2684, 2684, 2687, 2663, 2598, 2660, 2657, 2670, 2669, 2599, 3262, 2338, 2350, 2337, 2339, 2362, 2341, 2345, 2430, 2428, 2430, 2424, 2367, 2345, 2351, 2366, 2345, 2360, 2343, 2345, 2357, 2096, 2099, 2082, 2093, 2169, 2080, 2092, 2093, 2103, 2082, 2090, 2093, 2096, 2155, 2069, 2058, 2067, 2154, 917, 943, 924, 902, 913, 914, 990, 969, 900, 920, 917, 909, 937, 1601, 1627, 1612, 1615, 1091, 1095, 1101, 1028, 1093, 1096, 1088, 1103, 1097, 1118, 1031, 1097, 1093, 1116, 1103, 1112, 2760, 2765, 2776, 2765, 2689, 2783, 2782, 2767, 760, 757, 749, 1620, 1619, 1617, 1625, 1762, 1761, 1776, 1791, 1727, 1765, 1780, 1769, 1765, 1724, 1763, 1784, 1782, 1785, 1765, 903, 901, 912, 897, 1725, 1726, 1711, 1696, 1760, 1722, 1707, 1718, 1722, 1763, 1722, 1707, 1718, 1722, 1763, 1699, 1723, 1722, 1707, 1706, 618, 615, 632, 597, 618, 623, 634, 623, 547, 632, 609, 618, 547, 615, 618, 595, 1486, 1484, 1497, 1480, 2465, 2476, 2483, 2462, 2470, 2473, 2468, 2486, 2486, 2552, 2466, 2487, 2476, 2465, 2533, 2466, 2487, 2476, 2465, 2536, 2470, 2474, 2473, 2486, 2536, 2550, 2533, 2466, 2468, 2485, 2536, 2551, 2533, 2481, 2464, 2493, 2481, 2536, 2493, 2486, 2456, 2533, 2465, 2476, 2483, 20975, 25863, 30745, 21864, 19488, 27919, 513, 3326, 3285, 3309, 3298, 3311, 3325, 3325, 3251, 3322, 3307, 3318, 3322, 3235, 3318, 3325, 3246, 3322, 3307, 3318, 3322, 3235, 3322, 3307, 3318, 3322, 3235, 3325, 3307, 3309, 3297, 3296, 3306, 3311, 3324, 3319, 3246, 3298, 3307, 3311, 3306, 3303, 3296, 3305, 3235, 3324, 3307, 3298, 3311, 3318, 3307, 3306, 3283, 386, 397, 410, 439, 389, 392, 465, 386, 397, 410, 398, 397, 414, 433, 408, 461, 388, 385, 404, 385, 3078, 3072, 3094, 3073, 3103, 3098, 3101, 3096, 3145, 3156, 3163, 3165, 3161, 3148, 3162, 3156, 3167, 510, 499, 492, 449, 489, 494, 483, 502, 511, 455, 442, 507, 449, 498, 488, 511, 508, 432, 423, 490, 502, 507, 483, 455, 1257, 1258, 1275, 1268, 1217, 1250, 1207, 1257, 1266, 1269, 1261, 1223, 1731, 1753, 1742, 1741, 1860, 1895, 1896, 1901, 1895, 1903, 1834, 1908, 1910, 1889, 1906, 1889, 1898, 1904, 2641, 2648, 2647, 2653, 2645, 2652, 2684, 2633, 2640, 2634, 2646, 2653, 2652, 2682, 2645, 2640, 2650, 2642, 2661, 2577, 2583, 2579, 2566, 2581, 2661, 2634, 2579, 2590, 2577, 2661, 2653, 2578, 2576, 2590, 2583, 2579, 2566, 2661, 2576, 2532, 2773, 2761, 2756, 2780, 2800, 2775, 2761, 1804, 1808, 1821, 1797, 1827, 1813, 1816, 2797, 2795, 2813, 2794, 2804, 2801, 2806, 2803, -31312, 22258, 2625, 2029, 2018, 2023, 2047, 2030, 2041, 1972, 2024, 2023, 2026, 2040, 2040, 2018, 2029, 2034, 1974, 1978, 1965, 2043, 2026, 2028, 2030, 1974, 32062, 22394, 287, 272, 277, 269, 284, 267, 326, 282, 277, 280, 266, 266, 272, 287, 256, 324, 331, 351, 265, 280, 286, 284, 324, 32492, -32225, 22974, 2069, 2074, 2079, 2055, 2070, 2049, 2124, 2064, 2079, 2066, 2048, 2048, 2074, 2069, 2058, 2126, 2112, 2133, 2051, 2066, 2068, 2070, 2126, 20550, 28101, 2647, 2650, 2629, 2664, 2640, 2655, 2642, 2624, 2624, 2585, 2574, 2567, 2635, 2655, 2569, 2644, 2625, 2650, 2647, 2590, 2640, 2652, 2655, 2624, 2590, 2571, 2670, 2579, 2647, 2650, 2629, 2664, 2647, 2642, 2631, 2642, 2590, 2629, 2652, 2647, 2590, 2650, 2647, 2670, 1369, 1374, 1372, 1364, 1659, 1633, 1660, 1645, 1629, 1658, 1636, 576, 604, 604, 600, 3218, 1655, 1643, 1638, 1662, 1618, 1653, 1643, 2063, 2067, 2078, 2054, 2128, 2651, 2631, 2634, 2642, 2676, 2626, 2639, 829, 827, 813, 826, 804, 801, 806, 803, 2261, 2250, 2247, 2246, 2252, 2188, 2259, 2255, 2242, 2266, 2204, 2259, 2206, 2182, 2256, 2181, 2261, 2206, 2182, 2256, 2181, 2258, 2206, 2194, 2195, 2203, 2195, 2181, 2256, 2206, 2182, 2256, 2181, 2263, 2206, 2182, 2256, 2181, 2248, 2206, 2182, 2256, 908, 905, 924, 905, 2469, 2465, 2485, 2488, 2493, 2464, 2477, 2443, 2465, 2470, 2488, 2471, 889, 894, 864, 993, 1015, 1011, 992, 1009, 1018, 941, 995, 943, 475, 470, 457, 401, 472, 461, 464, 458, 463, 401, 461, 474, 467, 478, 459, 470, 457, 474, 272, 262, 258, 273, 256, 267};
    private String yq = C0007.m210(m699(), 0, 23, 2568);

    public Bttwoo() {
        int i = C0032.m1750();
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
                    System.out.println(Double.valueOf(C0029.m1645("LeENmGtxgK")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    public static String encodePlayKey(String str) {
        String str2 = C0040.m1953(m699(), 23, 1, 3214);
        boolean z = C0022.m1448(str2, str);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z2 = C0054.m2307(str);
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
                                byte[] bArr = C0046.m2116(C0025.m1542(m699(), 24, 20, 2380), C0035.m1808());
                                byte[] bArr2 = C0046.m2116(str, C0035.m1808());
                                byte[] bArr3 = new byte[bArr2.length];
                                int i3 = 0;
                                while (true) {
                                    int length = bArr2.length;
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                            case 45:
                                                return C0012.m368(C0012.m368(C0034.m1790(bArr3, 0), '+', '-'), '/', '_');
                                            case 76:
                                                bArr3[i3] = (byte) (bArr[i3 % bArr.length] ^ bArr2[i3]);
                                                i3++;
                                                int i5 = 48891;
                                                while (true) {
                                                    i5 ^= 48908;
                                                    switch (i5) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i5 = 48922;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i4 = i3 < length ? 48860 : 48829;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i6 = 1864;
                                while (true) {
                                    i6 ^= 1881;
                                    switch (i6) {
                                        case 17:
                                            i6 = 48674;
                                            break;
                                        case 47483:
                                            return str2;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return str2;
            }
            i = 1678;
        }
    }

    private List yq(kB kBVar, String str) {
        Iterator it;
        hN hNVar;
        ArrayList arrayList = new ArrayList();
        try {
            it = C0004.m122(kBVar);
        } catch (Exception e) {
            m701(e);
        }
        while (true) {
            boolean z = C0000.m11(it);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = z ? 1709 : 1678;
                    case 204:
                        hN hNVar2 = (hN) C0026.m1556(it);
                        int i2 = C0014.m422(C0014.m434(hNVar2, C0041.m1994(m699(), 44, 18, 2115)));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = i2 > 0 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    String str2 = C0028.m1621(C0013.m381(C0000.m12(C0047.m2133(m699(), 62, 13, 1012), hNVar2), C0023.m1457(m699(), 75, 4, 1577)), 1);
                                    hN hNVar3 = C0000.m12(C0035.m1833(m699(), 79, 16, 1066), hNVar2);
                                    String str3 = C0013.m381(hNVar3, C0049.m2175(m699(), 95, 8, 2732));
                                    String str4 = C0013.m381(hNVar3, C0042.m2010(m699(), 103, 3, 665));
                                    boolean z2 = C0010.m289(str4);
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                            case 45:
                                                String str5 = C0031.m1705();
                                                hN hNVar4 = null;
                                                boolean z3 = C0022.m1448(str, C0006.m180(m699(), 106, 4, 1596));
                                                int i5 = 49666;
                                                while (true) {
                                                    i5 ^= 49683;
                                                    switch (i5) {
                                                        case 17:
                                                            i5 = z3 ? 49759 : 49728;
                                                        case 50:
                                                        case 76:
                                                            hNVar4 = C0000.m12(C0022.m1433(m699(), 110, 15, 1681), hNVar2);
                                                            break;
                                                        case 83:
                                                            break;
                                                    }
                                                }
                                                boolean z4 = C0022.m1448(str, C0021.m1417(m699(), 125, 4, 996));
                                                int i6 = 49790;
                                                while (true) {
                                                    i6 ^= 49807;
                                                    switch (i6) {
                                                        case 18:
                                                        case 51:
                                                            hNVar = hNVar4;
                                                            break;
                                                        case 84:
                                                            hNVar = C0000.m12(C0041.m1994(m699(), 129, 20, 1742), hNVar2);
                                                            break;
                                                        case 241:
                                                            i6 = z4 ? 49883 : 49852;
                                                    }
                                                }
                                                int i7 = 49914;
                                                while (true) {
                                                    i7 ^= 49931;
                                                    switch (i7) {
                                                        case 497:
                                                            i7 = hNVar != null ? 50658 : 50627;
                                                        case 1711:
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            str5 = C0022.m1427(hNVar);
                                                            break;
                                                    }
                                                }
                                                C0003.m116(arrayList, new ME(str2, str4, str3, str5));
                                                int i8 = 50689;
                                                while (true) {
                                                    i8 ^= 50706;
                                                    switch (i8) {
                                                        case 19:
                                                            i8 = 50720;
                                                        case 50:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 76:
                                                int i9 = 48891;
                                                while (true) {
                                                    i9 ^= 48908;
                                                    switch (i9) {
                                                        case 22:
                                                            continue;
                                                        case 503:
                                                            i9 = 48922;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i4 = z2 ? 48860 : 48829;
                                        }
                                    }
                                    break;
                                case 500:
                                    int i10 = 1864;
                                    while (true) {
                                        i10 ^= 1881;
                                        switch (i10) {
                                            case 17:
                                                i10 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: هسثظ  reason: contains not printable characters */
    public static String m698(Object obj) {
        int i = C0000.m13();
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
                    return ((Bttwoo) obj).yq;
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

    /* renamed from: ﺹﻱﺱك  reason: contains not printable characters */
    public static short[] m699() {
        int i = C0024.m1502();
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
                    return f23short;
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

    /* renamed from: ﺽﻍثﻭ  reason: contains not printable characters */
    public static List m700(Object obj, Object obj2, Object obj3) {
        int i = C0055.m2324();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((Bttwoo) obj).yq((kB) obj2, (String) obj3);
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

    /* renamed from: ﻅﺏصل  reason: contains not printable characters */
    public static void m701(Object obj) {
        int i = C0032.m1750();
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
                    SpiderDebug.log((Throwable) obj);
                    return;
                case 239:
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
            }
            i2 = 1678;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        try {
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m698(this));
            C0032.m1746(sb, str);
            C0032.m1746(sb, str2);
            kB kBVar = C0014.m434(C0004.m119(C0001.m32(C0043.m2039(sb), C0024.m1520())), C0001.m35(m699(), 149, 16, 526));
            iX iXVar = new iX();
            C0040.m1949(iXVar, m700(this, kBVar, C0025.m1542(m699(), 165, 4, 1453)));
            return C0033.m1763(iXVar);
        } catch (Exception e) {
            m701(e);
            return C0033.m1763(new iX());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0337, code lost:
        com.github.catvod.spider.C0043.m2036(r3, (java.lang.CharSequence) com.github.catvod.spider.merge.C0026.m1556(r2));
        r4 = com.github.catvod.parser.C0000.m11(r2);
        r0 = 53510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0347, code lost:
        r0 = r0 ^ 53527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x034b, code lost:
        switch(r0) {
            case 17: goto L268;
            case 50: goto L269;
            case 83: goto L267;
            case 116: goto L270;
            default: goto L271;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x034f, code lost:
        if (r4 == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0351, code lost:
        r0 = 53603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0355, code lost:
        r0 = 53572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0359, code lost:
        com.github.catvod.spider.C0043.m2036(r3, r1);
        r0 = 53634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x035f, code lost:
        r0 = r0 ^ 53651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0363, code lost:
        switch(r0) {
            case 17: goto L279;
            case 50: goto L278;
            default: goto L280;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0367, code lost:
        r0 = 53665;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Bttwoo.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        try {
            Va va = C0004.m119(C0001.m32(m698(this), C0024.m1520()));
            ArrayList arrayList = new ArrayList();
            C0003.m116(arrayList, new rP(C0015.m457(m699(), 429, 23, 1931), C0036.m1850(m699(), 452, 2, 2059)));
            C0003.m116(arrayList, new rP(C0042.m2010(m699(), 454, 23, 377), C0040.m1953(m699(), 477, 3, 3033)));
            C0003.m116(arrayList, new rP(C0006.m180(m699(), 480, 23, 2163), C0053.m2276(m699(), 503, 2, 750)));
            kB kBVar = C0014.m434(va, C0021.m1417(m699(), 505, 44, 2611));
            iX iXVar = new iX();
            C0029.m1651(iXVar, arrayList);
            C0040.m1949(iXVar, m700(this, kBVar, C0055.m2320(m699(), 549, 4, 1329)));
            return C0033.m1763(iXVar);
        } catch (Exception e) {
            m701(e);
            return C0033.m1763(new iX());
        }
    }

    public void init(Context context, String str) {
        try {
            boolean z = C0020.m1370(str);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (z) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        String str2 = C0028.m1632(new JSONObject(str), C0037.m1882(m699(), 553, 7, 1544));
                        boolean z2 = C0030.m1681(str2, C0053.m2276(m699(), 560, 4, 552));
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
                                    return;
                                case 500:
                                    this.yq = str2;
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                break;
                                            case 47483:
                                                return;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            m701(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = C0055.m2320(m699(), 564, 1, 3240);
        try {
            C0029.m1662();
            boolean z = C0049.m2190();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (z) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        C0056.m2351(true);
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            HashMap hashMap = C0009.m283(str2);
            String str4 = C0036.m1853((String) C0007.m220(hashMap, C0012.m361(m699(), 565, 7, 1543)), C0026.m1551(m699(), 572, 5, 2175), C0031.m1705());
            String str5 = (String) C0007.m220(hashMap, C0035.m1833(m699(), 577, 7, 2603));
            String str6 = C0049.m2192(C0043.m2022());
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, str5);
            C0032.m1746(sb, str3);
            C0032.m1746(sb, str6);
            C0032.m1746(sb, str3);
            C0032.m1746(sb, str4);
            String str7 = C0028.m1620(C0051.m2232(C0043.m2039(sb), str4), 0, 32);
            String str8 = C0038.m1899((String) C0007.m220(hashMap, C0025.m1542(m699(), 584, 8, 840)));
            StringBuilder sb2 = new StringBuilder();
            C0032.m1746(sb2, m698(this));
            C0032.m1746(sb2, C0055.m2320(m699(), 592, 42, 2211));
            JSONArray jSONArray = C0033.m1766(C0041.m1969(new JSONObject(C0001.m32(C0048.m2160(C0043.m2039(sb2), new Object[]{str5, str4, str7, str6, str8}), C0024.m1520())), C0035.m1833(m699(), 634, 4, 1000)), C0021.m1417(m699(), 638, 12, 2516));
            String str9 = C0028.m1632(C0036.m1841(jSONArray, C0035.m1823(jSONArray) - 1), C0037.m1882(m699(), 650, 3, 780));
            iX iXVar = new iX();
            C0034.m1788(iXVar, str9);
            return C0033.m1763(iXVar);
        } catch (Exception e) {
            m701(e);
            return C0033.m1763(new iX());
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m698(this));
            C0032.m1746(sb, C0027.m1601(m699(), 653, 9, 914));
            C0032.m1746(sb, str);
            kB kBVar = C0014.m434(C0004.m119(C0001.m32(C0043.m2039(sb), C0024.m1520())), C0000.m18(m699(), 662, 18, 447));
            iX iXVar = new iX();
            C0040.m1949(iXVar, m700(this, kBVar, C0054.m2301(m699(), 680, 6, 355)));
            return C0033.m1763(iXVar);
        } catch (Exception e) {
            m701(e);
            return C0033.m1763(new iX());
        }
    }
}
