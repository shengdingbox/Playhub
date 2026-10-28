package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
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
import com.github.catvod.spider.merge.rP;
import java.io.PrintStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Jpys extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f31short = {1276, 1248, 1248, 1252, 1255, 1198, 1211, 1211, 1251, 1251, 1251, 1210, 1267, 1276, 1251, 1197, 1262, 1251, 1252, 1185, 1210, 1271, 1275, 1273, 391, 412, 405, 505, 485, 700, 679, 21633, -27391, 1786, 1766, 1762, 1777, 1940, 1927, 1936, 1940, 1817, 1802, 1821, 1817, 1861, 2521, 2447, 2462, 2456, 2458, 2481, 2442, 2450, 2498, 1971, 2017, 2028, 2021, 2032, 1956, 1960, 3229, 3266, 3294, 3290, 3273, 3206, 2111, 2162, 2172, 2144, 2084, 2170, 2171, 2081, 2089, 2081, 2092, 2091, 2080, 2171, 2168, 2172, 2095, 2171, 2095, 2171, 2172, 2093, 2092, 2172, 2170, 2175, 2168, 2171, 2091, 2080, 2168, 2093, 2081, 2081, 2080, 2171, 2170, 2111, 2157, 2084, 2588, 2566, 2568, 2561, 859, 1601, 1600, 1619, 1612, 1606, 1600, 1612, 1601, 992, 942, 959, 934, 992, 930, 952, 994, 930, 928, 953, 934, 938, 992, 942, 929, 928, 929, 950, 930, 928, 954, 956, 992, 953, 934, 939, 938, 928, 992, 931, 934, 956, 955, 1008, 955, 950, 959, 938, 1022, 1010, 1002, 956, 1001, 959, 942, 936, 938, 897, 954, 930, 1010, 1002, 956, 1001, 942, 957, 938, 942, 1010, 1002, 956, 1001, 950, 938, 942, 957, 1010, 1002, 956, 445, 445, 416, 416, 1328, 1333, 1312, 1333, 1747, 1750, 1740, 1739, 2518, 2511, 2500, 2531, 2508, 2497, 2515, 2515, 22907, 21390, 2091, 18219, 31755, 2091, 26824, -30081, 2091, 23146, 26824, 2081, 31292, 26824, 1411, 1434, 1425, 1445, 1436, 1430, 1409, 1432, 1427, 1465, 1430, 1434, 1426, 1877, 1868, 1863, 1909, 1862, 1873, 1872, 1866, 1868, 1869, 1476, 1501, 1494, 1531, 1494, 2455, 2521, 2504, 2513, 2455, 2517, 2511, 2453, 2517, 2519, 2510, 2513, 2525, 2455, 2521, 2518, 2519, 2518, 2497, 2517, 2519, 2509, 2507, 2455, 2510, 2513, 2524, 2525, 2519, 2455, 2524, 2525, 2508, 2521, 2513, 2516, 2439, 2513, 2524, 2437, 431, 418, 507, 1376, 1325, 1315, 1343, 1403, 1317, 1316, 1406, 1398, 1406, 1395, 1396, 1407, 1316, 1319, 1315, 1392, 1316, 1392, 1316, 1315, 1394, 1395, 1315, 1317, 1312, 1319, 1316, 1396, 1407, 1319, 1394, 1406, 1406, 1407, 1316, 1317, 1376, 1330, 1403, 1787, 1761, 1775, 1766, 405, 1293, 1293, 1296, 1296, 611, 614, 627, 614, 2649, 2624, 2635, 2657, 2638, 2626, 2634, 2071, 2048, 2056, 2056, 469, 460, 455, 497, 454, 462, 450, 465, 456, 464, 2686, 2663, 2668, 2648, 2657, 2667, 1958, 1983, 1972, 1937, 1954, 1973, 1969, 1053, 1028, 1039, 1074, 1038, 1034, 1049, 463, 476, 1210, 1190, 2301, 2276, 2287, 2248, 2279, 2282, 2296, 2296, 404, 397, 390, 419, 385, 406, 397, 400, 1450, 1448, 1448, 475, 450, 457, 489, 452, 479, 456, 462, 473, 450, 479, 1145, 1120, 1131, 1101, 1123, 1146, 1149, 1133, 1416, 1425, 1434, 1469, 1425, 1424, 1418, 1435, 1424, 1418, 528, 517, 540, 518, 538, 529, 528, 569, 540, 518, 513, 1524, 1512, 1525, 1525, 30646, 28850, 23286, 1255, 1256, 1252, 1260, 2479, 2472, 2469, 3011, 2218, 1544, 28741, 30529, 23813, 3051, 3051, 3051, 2417, 32664, 21980, 1659, 32059, -32312, 23145, 564, 22517, 27254, 611, 30591, -29703, 2149, 2155, 2167, 2099, 2157, 2156, 2102, 2110, 2102, 2107, 2108, 2103, 2156, 2159, 2155, 2104, 2156, 2104, 2156, 2155, 2106, 2107, 2155, 2157, 2152, 2159, 2156, 2108, 2103, 2159, 2106, 2102, 2102, 2103, 2156, 2157, 2088, 2170, 2099, 395, 401, 415, 406, 2481, 2625, 2624, 2643, 2636, 2630, 2624, 2636, 2625, 3164, 3090, 3075, 3098, 3164, 3102, 3076, 3166, 3102, 3100, 3077, 3098, 3094, 3164, 3090, 3101, 3100, 3101, 3082, 3102, 3100, 3078, 3072, 3164, 3099, 3100, 3102, 3094, 3164, 3099, 3100, 3079, 3104, 3094, 3090, 3073, 3088, 3099, 1016, 1021, 1000, 1021, 630, 623, 612, 579, 620, 609, 627, 627, 21605, 24208, 1333, 18997, 28949, 1333, 26070, -30879, 1333, 22388, 26070, 1343, 30498, 26070, 575, 550, 557, 537, 544, 554, 3133, 3108, 3119, 3077, 3114, 3110, 3118, 2914, 2939, 2928, 2882, 2929, 2918, 2919, 2941, 2939, 2938, 2684, 2661, 2670, 2627, 2670, 657, 651, 703, 670, 653, 658, 664, 670, 690, 671, 1957, 1977, 1977, 1981, 1982, 2039, 2018, 2018, 1978, 1978, 1978, 2019, 1962, 1957, 1978, 2036, 1975, 1978, 1981, 2040, 2019, 1966, 1954, 1952, 2817, 2822, 2840, 2578, 2608, 2597, 2614, 2611, 2611, 2622, 2672, 2666, 2673, 2671, 2687, 2679, 2567, 2670, 2670, 2660, 2687, 2579, 2614, 2609, 2602, 2599, 2687, 2622, 2622, 2605, 2620, 2615, 2665, 2667, 2678, 2687, 2590, 2607, 2607, 2611, 2618, 2568, 2618, 2621, 2580, 2614, 2603, 2672, 2666, 2668, 2664, 2673, 2668, 2665, 2687, 2679, 2580, 2583, 2571, 2578, 2579, 2675, 2687, 2611, 2614, 2612, 2618, 2687, 2584, 2618, 2620, 2612, 2608, 2678, 2687, 2588, 2615, 2605, 2608, 2610, 2618, 2672, 2670, 2667, 2663, 2673, 2671, 2673, 2671, 2673, 2671, 2687, 2572, 2622, 2617, 2622, 2605, 2614, 2672, 2666, 2668, 2664, 2673, 2668, 2665, 1391, 1353, 1375, 1352, 1303, 1403, 1373, 1375, 1364, 1358, 1327, 1383, 1376, 1389, 1332, 2133, 670, 720, 705, 728, 670, 732, 710, 668, 732, 734, 711, 728, 724, 670, 720, 735, 734, 735, 712, 732, 734, 708, 706, 670, 711, 643, 670, 711, 728, 725, 724, 734, 670, 724, 705, 728, 706, 734, 725, 724, 670, 708, 707, 733, 654, 722, 733, 728, 724, 735, 709, 741, 712, 705, 724, 652, 642, 663, 728, 725, 652, 3188, 3195, 3198, 3186, 3193, 3171, 3139, 3182, 3175, 3186, 3114, 3108, 3121, 3198, 3187, 3114, 848, 797, 787, 783, 843, 789, 788, 846, 838, 846, 835, 836, 847, 788, 791, 787, 832, 788, 832, 788, 787, 834, 835, 787, 789, 784, 791, 788, 836, 847, 791, 834, 846, 846, 847, 788, 789, 848, 770, 843, 1220, 1246, 1232, 1241, 822, 1195, 1194, 1209, 1190, 1196, 1194, 1190, 1195, 2063, 2063, 2066, 2066, 1467, 1470, 1451, 1470, 860, 857, 835, 836, 492, 492, 492, 492, 1629, 1632, 1659, 1653, 1659, 1660, 2048, 2103, 2100, 2103, 2080, 2103, 2080, 796, 781, 798, 799, 777, 354, 2112, 2140, 2129, 2121, 2149, 2114, 2140, 476, 465, 469, 464, 465, 454, 1868, 1865, 1862, 1861, 1865, 1859, 1885, 786, 860, 845, 852, 786, 848, 842, 784, 848, 850, 843, 852, 856, 786, 860, 851, 850, 851, 836, 848, 850, 840, 846, 786, 843, 852, 857, 
    856, 850, 786, 846, 856, 860, 847, 862, 853, 895, 836, 874, 850, 847, 857, 770, 854, 856, 836, 842, 850, 847, 857, 768, 2061, 2139, 2122, 2124, 2126, 2149, 2142, 2118, 2070, 2074, 2061, 2139, 2122, 2124, 2126, 2168, 2114, 2129, 2126, 2070, 2067, 1768, 1766, 1786, 1780, 1772, 1777, 1767, 1726, 2406, 2352, 2337, 2343, 2341, 2318, 2357, 2349, 2429, 2417, 2406, 2352, 2337, 2343, 2341, 2323, 2345, 2362, 2341, 2429, 2424, 2406, 2347, 2341, 2361, 2429, 2339, 2338, 2424, 2416, 2424, 2421, 2418, 2425, 2338, 2337, 2341, 2422, 2338, 2422, 2338, 2341, 2420, 2421, 2341, 2339, 2342, 2337, 2338, 2418, 2425, 2337, 2420, 2424, 2424, 2425, 2338, 2339, 2406, 2356, 2429, 1557, 1551, 1537, 1544, 1888, 2553, 2552, 2539, 2548, 2558, 2552, 2548, 2553, 1099, 1102, 1115, 1102, 2110, 2089, 2111, 2105, 2080, 2104, 3273, 3276, 3286, 3281, 2857, 2864, 2875, 2833, 2878, 2866, 2874, 2194, 2187, 2176, 2215, 2184, 2181, 2199, 2199, 23420, 20873, 2604, 17708, 32268, 2604, 27343, -30600, 2604, 22637, 27343, 2598, 30779, 27343, 1235, 1226, 1217, 1269, 1228, 1222, 1533, 1508, 1519, 1474, 1519, 3064, 3041, 3050, 3036, 3051, 3043, 3055, 3068, 3045, 3069};
    private String yq = C0038.m1903(m814(), 0, 24, 1172);
    private String SN = C0031.m1705();

    public Jpys() {
        int i = C0011.m344();
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
                    System.out.println(Long.decode(C0054.m2305("JU7J4lrv8yLLBqYVksigkFmA7lfq")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    public static String getUUID() {
        return C0048.m2155(C0012.m366());
    }

    public static String sha1(String str) {
        try {
            byte[] bArr = C0035.m1817(C0027.m1581(C0004.m130(m814(), 24, 5, 468)), C0051.m2233(str));
            StringBuilder sb = new StringBuilder();
            int length = bArr.length;
            int i = 0;
            while (true) {
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            String str2 = C0030.m1677(bArr[i] & 255);
                            int i3 = C0046.m2105(str2);
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = i3 == 1 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        C0048.m2158(sb, '0');
                                        break;
                                }
                            }
                            C0032.m1746(sb, str2);
                            i++;
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = 48674;
                                    case 47483:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            return C0043.m2039(sb);
                    }
                }
            }
        } catch (NoSuchAlgorithmException e) {
            C0011.m342(e);
            return null;
        }
    }

    /* renamed from: تﺹيد  reason: contains not printable characters */
    public static void m811(Object obj) {
        int i = C0011.m344();
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
                    SpiderDebug.log((Throwable) obj);
                    break;
                case 239:
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = 48674;
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
        int i4 = C0030.m1683();
        int i5 = 1740;
        while (true) {
            i5 ^= 1757;
            switch (i5) {
                case 17:
                    if (i4 > 0) {
                        break;
                    } else {
                        i5 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    System.out.println(Double.decode(C0043.m2024("zyhxxUZQeP5XKg")));
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: خجﻝﺕ  reason: contains not printable characters */
    public static String m812(Object obj) {
        int i = C0047.m2134();
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
                    return ((Jpys) obj).yq;
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

    /* renamed from: فﺙﺡد  reason: contains not printable characters */
    public static String m813(Object obj) {
        int i = C0050.m2221();
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
                    return ((Jpys) obj).SN;
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

    /* renamed from: ﺭﺵمﺥ  reason: contains not printable characters */
    public static short[] m814() {
        int i = C0054.m2295();
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
                    return f31short;
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

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList();
        String str3 = C0022.m1433(m814(), 29, 2, 734);
        Object obj = C0007.m220(hashMap, str3);
        String str4 = C0001.m35(m814(), 31, 2, 1513);
        String str5 = C0031.m1705();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (obj == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z2 = C0022.m1448((String) C0007.m220(hashMap, str3), str4);
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
        C0042.m1999(hashMap, str3, str5);
        String str6 = C0046.m2123(m814(), 33, 4, 1667);
        Object obj2 = C0007.m220(hashMap, str6);
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    if (obj2 == null) {
                        break;
                    } else {
                        i3 = 48736;
                        continue;
                    }
                case 47384:
                    break;
                case 47417:
                    boolean z3 = C0022.m1448((String) C0007.m220(hashMap, str6), str4);
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                break;
                            case 239:
                                if (!z3) {
                                    break;
                                } else {
                                    i4 = 48860;
                                    continue;
                                }
                        }
                        i4 = 48829;
                    }
                    break;
                case 47483:
                    break;
            }
            i3 = 48705;
        }
        C0042.m1999(hashMap, str6, str5);
        String str7 = C0028.m1613(m814(), 37, 4, 2037);
        Object obj3 = C0007.m220(hashMap, str7);
        int i5 = 48891;
        while (true) {
            i5 ^= 48908;
            switch (i5) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    if (obj3 == null) {
                        break;
                    } else {
                        i5 = 49635;
                        continue;
                    }
                case 32495:
                    boolean z4 = C0022.m1448((String) C0007.m220(hashMap, str7), str4);
                    int i6 = 49666;
                    while (true) {
                        i6 ^= 49683;
                        switch (i6) {
                            case 17:
                                if (!z4) {
                                    break;
                                } else {
                                    i6 = 49759;
                                    continue;
                                }
                            case 50:
                                break;
                            case 76:
                                break;
                            case 83:
                                break;
                        }
                        i6 = 49728;
                    }
                    break;
            }
            i5 = 48953;
        }
        C0042.m1999(hashMap, str7, str5);
        String str8 = (String) C0007.m220(hashMap, str3);
        String str9 = (String) C0007.m220(hashMap, str6);
        String str10 = (String) C0007.m220(hashMap, str7);
        String str11 = C0049.m2192(C0043.m2022());
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, C0033.m1764(m814(), 41, 5, 1912));
        C0032.m1746(sb, str10);
        C0032.m1746(sb, C0043.m2020(m814(), 46, 9, 2559));
        C0032.m1746(sb, str2);
        C0032.m1746(sb, C0033.m1764(m814(), 55, 7, 1941));
        C0032.m1746(sb, str);
        C0032.m1746(sb, C0022.m1433(m814(), 62, 6, 3259));
        C0032.m1746(sb, str9);
        C0032.m1746(sb, C0049.m2175(m814(), 68, 40, 2073));
        C0032.m1746(sb, str11);
        HashMap hashMap2 = C0055.m2325(C0021.m1417(m814(), 108, 4, 2671), C0007.m216(C0052.m2266(C0043.m2039(sb))), C0054.m2301(m814(), 112, 1, 783), str11);
        C0042.m1999(hashMap2, C0025.m1542(m814(), 113, 8, 1573), m813(this));
        int i7 = 0;
        String str12 = C0028.m1633(C0048.m2160(C0032.m1739(new StringBuilder(), m812(this), C0032.m1749(m814(), 121, 70, 975)), new Object[]{str, str2, str10, str9}), hashMap2);
        PrintStream printStream = C0003.m108();
        StringBuilder sb2 = new StringBuilder();
        C0032.m1746(sb2, C0057.m2384(m814(), 191, 4, 473));
        C0032.m1746(sb2, str12);
        C0001.m27(printStream, C0043.m2039(sb2));
        JSONArray jSONArray = C0010.m316(C0006.m188(new JSONObject(str12), C0010.m296(m814(), 195, 4, 1364)), C0056.m2339(m814(), 199, 4, 1727));
        while (true) {
            int i8 = C0035.m1823(jSONArray);
            int i9 = 49790;
            while (true) {
                i9 ^= 49807;
                switch (i9) {
                    case 18:
                    case 51:
                        return C0022.m1435(arrayList);
                    case 84:
                        JSONObject jSONObject = C0036.m1841(jSONArray, i7);
                        boolean z5 = C0031.m1694(jSONObject, C0014.m421(m814(), 203, 8, 2464), C0000.m18(m814(), 211, 14, 2061));
                        int i10 = 49914;
                        while (true) {
                            i10 ^= 49931;
                            switch (i10) {
                                case 497:
                                    i10 = z5 ? 50658 : 50627;
                                case 1711:
                                case 1736:
                                    C0003.m116(arrayList, new ME(C0022.m1450(jSONObject, C0006.m180(m814(), 248, 5, 1458)), C0022.m1450(jSONObject, C0007.m210(m814(), 231, 7, 1527)), C0022.m1450(jSONObject, C0048.m2145(m814(), 225, 6, 1525)), C0022.m1450(jSONObject, C0028.m1613(m814(), 238, 10, 1827))));
                                    break;
                                case 1769:
                                    int i11 = 50689;
                                    while (true) {
                                        i11 ^= 50706;
                                        switch (i11) {
                                            case 19:
                                                i11 = 50720;
                                            case 50:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        i7++;
                        int i12 = 50813;
                        while (true) {
                            i12 ^= 50830;
                            switch (i12) {
                                case 18:
                                    break;
                                case 243:
                                    i12 = 50844;
                            }
                        }
                        break;
                    case 241:
                        i9 = i7 < i8 ? 49883 : 49852;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0265, code lost:
        r1 = com.github.catvod.spider.merge.C0022.m1450(r2, r0);
        r1 = 48767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x026c, code lost:
        r1 = r1 ^ 48784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0270, code lost:
        switch(r1) {
            case 14: goto L77;
            case 239: goto L78;
            default: goto L80;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02e4, code lost:
        r1 = 48798;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Jpys.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        C0003.m116(arrayList2, new rP(C0009.m277(m814(), 476, 1, 2368), C0022.m1433(m814(), 477, 2, 2733)));
        C0003.m116(arrayList2, new rP(C0040.m1953(m814(), 479, 1, 1609), C0045.m2098(m814(), 480, 3, 2062)));
        C0003.m116(arrayList2, new rP(C0043.m2020(m814(), 483, 1, 512), C0057.m2384(m814(), 484, 2, 1373)));
        C0003.m116(arrayList2, new rP(C0009.m277(m814(), 486, 1, 592), C0004.m130(m814(), 487, 2, 2435)));
        JSONObject jSONObject = new JSONObject(C0001.m24());
        String str = C0049.m2192(C0043.m2022());
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, C0027.m1601(m814(), 489, 39, 2062));
        C0032.m1746(sb, str);
        HashMap hashMap = C0055.m2325(C0037.m1882(m814(), 528, 4, 504), C0007.m216(C0052.m2266(C0043.m2039(sb))), C0032.m1749(m814(), 532, 1, 2533), str);
        C0042.m1999(hashMap, C0024.m1513(m814(), 533, 8, 2597), m813(this));
        StringBuilder sb2 = new StringBuilder();
        C0032.m1746(sb2, m812(this));
        C0032.m1746(sb2, C0015.m457(m814(), 541, 38, 3187));
        JSONArray jSONArray = C0010.m316(new JSONObject(C0028.m1633(C0043.m2039(sb2), hashMap)), C0003.m86(m814(), 579, 4, 924));
        int i = 0;
        while (true) {
            int i2 = C0035.m1823(jSONArray);
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                    case 49:
                        i3 = i < i2 ? 1709 : 1678;
                    case 204:
                        JSONObject jSONObject2 = C0036.m1841(jSONArray, i);
                        boolean z2 = C0031.m1694(jSONObject2, C0042.m2010(m814(), 583, 8, 512), C0034.m1781(m814(), 591, 14, 1299));
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = z2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    C0003.m116(arrayList, new ME(C0022.m1450(jSONObject2, C0035.m1833(m814(), 628, 5, 2570)), C0022.m1450(jSONObject2, C0026.m1551(m814(), 611, 7, 3147)), C0022.m1450(jSONObject2, C0052.m2261(m814(), 605, 6, 585)), C0022.m1450(jSONObject2, C0014.m421(m814(), 618, 10, 2836))));
                                    break;
                                case 500:
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        i++;
                        int i6 = 48767;
                        while (true) {
                            i6 ^= 48784;
                            switch (i6) {
                                case 14:
                                    break;
                                case 239:
                                    i6 = 48798;
                            }
                        }
                        break;
                    case 239:
                        return C0054.m2296(arrayList2, arrayList, jSONObject);
                }
            }
        }
    }

    public void init(Context context, String str) {
        Jpys.super.init(context, str);
        boolean z = C0029.m1658(str);
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
                    this.yq = str;
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        String str2 = C0033.m1764(m814(), 633, 10, 763);
        String str3 = C0041.m1978(str2, C0031.m1705());
        this.SN = str3;
        boolean z2 = C0029.m1658(str3);
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
                    String str4 = C0010.m306();
                    this.SN = str4;
                    C0023.m1453(str2, str4);
                    return;
            }
            i2 = 1802;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = C0009.m277(m814(), 643, 24, 1997);
        String str4 = C0057.m2384(m814(), 667, 3, 2932);
        String str5 = C0009.m277(m814(), 670, 102, 2655);
        String str6 = C0036.m1850(m814(), 772, 10, 1338);
        String str7 = C0051.m2237(m814(), 782, 5, 1289);
        String str8 = C0031.m1705();
        C0029.m1662();
        C0056.m2351(true);
        try {
            String[] strArr = C0011.m339(str2, C0003.m86(m814(), 787, 1, 2069));
            String str9 = strArr[0];
            String str10 = strArr[1];
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m812(this));
            C0032.m1746(sb, C0011.m328(m814(), 788, 61, 689));
            C0032.m1746(sb, str9);
            C0032.m1746(sb, str7);
            C0032.m1746(sb, str10);
            String str11 = C0043.m2039(sb);
            String str12 = C0049.m2192(C0043.m2022());
            StringBuilder sb2 = new StringBuilder();
            C0032.m1746(sb2, C0031.m1713(m814(), 849, 16, 3095));
            C0032.m1746(sb2, str9);
            C0032.m1746(sb2, str7);
            C0032.m1746(sb2, str10);
            C0032.m1746(sb2, C0038.m1903(m814(), 865, 40, 886));
            C0032.m1746(sb2, str12);
            String str13 = C0007.m216(C0052.m2266(C0043.m2039(sb2)));
            HashMap hashMap = new HashMap();
            C0042.m1999(hashMap, str6, str5);
            C0042.m1999(hashMap, C0007.m210(m814(), 905, 4, 1207), str13);
            C0042.m1999(hashMap, C0010.m296(m814(), 909, 1, 866), str12);
            C0042.m1999(hashMap, C0005.m169(m814(), 910, 8, 1231), m813(this));
            String str14 = C0028.m1633(str11, hashMap);
            PrintStream printStream = C0003.m108();
            StringBuilder sb3 = new StringBuilder();
            C0032.m1746(sb3, C0026.m1551(m814(), 918, 4, 2155));
            C0032.m1746(sb3, str14);
            C0001.m27(printStream, C0043.m2039(sb3));
            JSONObject jSONObject = new JSONObject(str14);
            JSONObject jSONObject2 = new JSONObject();
            String str15 = C0022.m1450(C0036.m1841(C0010.m316(C0006.m188(jSONObject, C0005.m169(m814(), 922, 4, 1503)), C0033.m1764(m814(), 926, 4, 816)), 0), str4);
            PrintStream printStream2 = C0003.m108();
            StringBuilder sb4 = new StringBuilder();
            C0032.m1746(sb4, C0025.m1542(m814(), 930, 4, 415));
            C0032.m1746(sb4, str15);
            C0001.m27(printStream2, C0043.m2039(sb4));
            JSONObject jSONObject3 = new JSONObject();
            C0005.m159(jSONObject3, str6, str5);
            C0005.m159(jSONObject3, C0023.m1457(m814(), 934, 6, 1554), str3);
            C0005.m159(jSONObject3, C0021.m1417(m814(), 940, 7, 2130), str3);
            C0005.m159(jSONObject2, str4, str15);
            C0005.m159(jSONObject2, C0054.m2301(m814(), 947, 5, 876), C0033.m1764(m814(), 952, 1, 338));
            C0005.m159(jSONObject2, C0034.m1781(m814(), 953, 7, 2096), str8);
            C0005.m159(jSONObject2, C0023.m1457(m814(), 960, 6, 436), C0011.m335(jSONObject3));
            C0005.m159(jSONObject2, C0041.m1994(m814(), 966, 7, 1832), C0033.m1778(str15));
            return C0011.m335(jSONObject2);
        } catch (Exception e) {
            m811(e);
            return str8;
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m812(this));
        C0032.m1746(sb, C0033.m1764(m814(), 973, 51, 829));
        C0032.m1746(sb, C0010.m314(str));
        C0032.m1746(sb, C0037.m1882(m814(), 1024, 21, 2091));
        String str2 = C0043.m2039(sb);
        String str3 = C0049.m2192(C0043.m2022());
        StringBuilder sb2 = new StringBuilder();
        C0032.m1746(sb2, C0021.m1417(m814(), 1045, 8, 1667));
        C0032.m1746(sb2, str);
        C0032.m1746(sb2, C0051.m2237(m814(), 1053, 61, 2368));
        C0032.m1746(sb2, str3);
        HashMap hashMap = C0055.m2325(C0054.m2301(m814(), 1114, 4, 1638), C0007.m216(C0052.m2266(C0043.m2039(sb2))), C0056.m2339(m814(), 1118, 1, 1844), str3);
        C0042.m1999(hashMap, C0033.m1764(m814(), 1119, 8, 2461), m813(this));
        JSONArray jSONArray = C0010.m316(C0006.m188(C0006.m188(new JSONObject(C0028.m1633(str2, hashMap)), C0021.m1417(m814(), 1127, 4, 1071)), C0032.m1749(m814(), 1131, 6, 2124)), C0012.m361(m814(), 1137, 4, 3237));
        int i = 0;
        while (true) {
            int i2 = C0035.m1823(jSONArray);
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                    case 49:
                        i3 = i < i2 ? 1709 : 1678;
                    case 204:
                        JSONObject jSONObject = C0036.m1841(jSONArray, i);
                        String str4 = C0050.m2224(m814(), 1141, 7, 2911);
                        boolean z2 = C0037.m1888(C0022.m1450(jSONObject, str4), str);
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = !z2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    boolean z3 = C0031.m1694(jSONObject, C0011.m328(m814(), 1148, 8, 2276), C0026.m1551(m814(), 1156, 14, 2570));
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                            case 45:
                                                C0003.m116(arrayList, new ME(C0022.m1450(jSONObject, C0057.m2384(m814(), 1176, 5, 1419)), C0022.m1450(jSONObject, str4), C0022.m1450(jSONObject, C0002.m57(m814(), 1170, 6, 1189)), C0022.m1450(jSONObject, C0053.m2276(m814(), 1181, 10, 2958))));
                                                break;
                                            case 76:
                                                int i6 = 48891;
                                                while (true) {
                                                    i6 ^= 48908;
                                                    switch (i6) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i6 = 48922;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i5 = z3 ? 48860 : 48829;
                                        }
                                    }
                                    break;
                                case 500:
                                    int i7 = 1864;
                                    while (true) {
                                        i7 ^= 1881;
                                        switch (i7) {
                                            case 17:
                                                i7 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        i++;
                        int i8 = 49666;
                        while (true) {
                            i8 ^= 49683;
                            switch (i8) {
                                case 17:
                                    i8 = 49697;
                                case 50:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        return C0022.m1435(arrayList);
                }
            }
        }
    }
}
