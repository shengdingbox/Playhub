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
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
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
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.rP;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Doubao extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f27short = {1235, 1231, 1231, 1227, 1224, 1153, 1172, 1172, 1228, 1228, 1228, 1173, 1247, 1236, 1230, 1241, 1242, 1236, 1217, 1235, 1234, 1241, 1236, 1173, 1240, 1236, 1238, 1074, 1070, 1070, 1066, 1065, 1120, 1141, 1141, 1069, 1069, 1069, 1140, 1086, 1077, 1071, 1080, 1083, 1077, 1056, 1074, 1075, 1080, 1077, 1140, 1081, 1077, 1079, 1141, 1083, 1066, 1075, 1141, 1068, 1131, 1141, 1065, 1081, 1074, 1087, 1086, 1071, 1078, 1087, 1065, 1141, 1066, 1071, 1080, 1078, 1075, 1081, 1141, 1078, 1077, 1081, 1083, 1078, 599, 587, 587, 591, 588, 517, 528, 528, 584, 584, 584, 529, 603, 592, 586, 605, 606, 592, 581, 599, 598, 605, 592, 529, 604, 592, 594, 528, 606, 591, 598, 528, 585, 526, 528, 591, 595, 606, 582, 605, 606, 604, 596, 588, 2005, 2039, 2018, 2033, 2036, 2036, 2041, 1975, 1965, 1974, 1960, 1976, 1968, 1999, 2033, 2038, 2044, 2039, 2031, 2027, 1976, 2006, 1996, 1976, 1961, 1960, 1974, 1960, 1955, 1976, 1999, 2033, 2038, 1966, 1964, 1955, 1976, 2016, 1966, 1964, 1969, 1976, 2009, 2024, 2024, 2036, 2045, 1999, 2045, 2042, 2003, 2033, 2028, 1975, 1965, 1963, 1967, 1974, 1963, 1966, 1976, 1968, 2003, 2000, 1996, 2005, 2004, 1972, 1976, 2036, 2033, 2035, 2045, 1976, 2015, 2045, 2043, 2035, 2039, 1969, 1976, 2011, 2032, 2026, 2039, 2037, 2045, 1975, 1961, 1962, 1962, 1974, 1960, 1974, 1960, 1974, 1960, 1976, 1995, 2041, 2046, 2041, 2026, 2033, 1975, 1965, 1963, 1967, 1974, 1963, 1966, 646, 643, 662, 643, 2386, 2391, 2383, 2373, 1347, 1350, 1369, 1354, 1102, 1106, 1119, 1095, 1116, 1119, 1117, 1109, 1143, 1114, 1382, 1377, 1396, 1377, 1376, 1382, 1535, 1523, 1510, 1521, 1530, 1478, 1531, 1535, 1527, 2248, 2245, 3198, 3191, 3187, 3189, 3175, 3191, 1409, 1424, 1428, 1432, 1460, 3095, 3078, 3074, 3086, 3105, 503, 486, 482, 494, 450, 496, 480, 492, 497, 486, 1748, 1733, 1729, 1741, 1762, 1747, 1731, 1743, 1746, 1733, 12085, 11898, -8642, -9417, 3144, 3102, 3099, 3144, 2138, 928, 1020, 928, 716, 2150, 2147, 2172, 2159, 2089, 2089, 2089, 1585, 1568, 1572, 1576, 1540, 1548, 1576, 1572, 1570, 1568, 769, 1117, 1042, 1027, 1029, 1031, 1119, 1783, 1697, 1712, 1718, 1716, 1666, 1720, 1707, 1716, 1772, 1763, 1761, 1783, 1717, 1712, 1701, 1712, 1669, 1704, 1697, 1716, 1772, 831, 793, 783, 792, 839, 811, 781, 783, 772, 798, 1119, 1149, 1149, 1147, 1134, 1130, 869, 884, 884, 872, 877, 871, 869, 880, 877, 875, 874, 811, 878, 887, 875, 874, 3182, 3148, 3148, 3146, 3167, 3163, 3074, 3171, 3150, 3137, 3144, 3162, 3150, 3144, 3146, 883, 865, 804, 842, 839, 1544, 1544, 1544, 1544, 1628, 1596, 1596, 1628, 1557, 1557, 1622, 1573, 1622, 1593, 1593, 1611, 1564, 1564, 1611, 1538, 1538, 2537, 2536, 2559, 2990, 2990, 3022, 2951, 2951, 3011, 2987, 2987, 3033, 2958, 2958, 2295, 2245, 2271, 2263, 2201, 2277, 2270, 2263, 2264, 2257, 2270, 2263, 2271, 1587, 1590, 1577, 1594, 1693, 1674, 1695, 1667, 1678, 1686, 1712, 1673, 1664, 1664, 1691, 1677, 1678, 1667, 1667, 1272, 1265, 1265, 1258, 1276, 1279, 1266, 1266, 2025, 2046, 2027, 2039, 2042, 2018, 1988, 2041, 2042, 2024, 2032, 2046, 2031, 2041, 2042, 2039, 2039, 1132, 1135, 1149, 1125, 1131, 1146, 1132, 1135, 1122, 1122, 480, 493, 493, 3111, 3105, 3127, 3127, 3121, 3111, 3111, 2560, 2565, 2576, 2565, 2830, 2847, 2841, 2843, 531, 514, 516, 518, 560, 522, 537, 518, 2939, 2912, 2939, 2926, 2915, 2003, 2006, 1996, 1995, 3178, 3194, 3185, 3196, 3197, 3180, 3189, 3196, 2934, 2922, 2919, 2943, 2916, 2919, 2917, 2925, 541, 528, 2994, 2979, 2983, 2987, 2951, 2897, 2880, 2884, 2888, 2919, 2589, 2580, 2576, 2582, 2564, 2580, 415, 403, 390, 401, 410, 422, 411, 415, 407, 959, 942, 938, 934, 906, 952, 936, 932, 953, 942, 1687, 1670, 1666, 1678, 1697, 1680, 1664, 1676, 1681, 1670, 2958, 435, -8417, -10045, 1794, 371, 303, 371, 546, 565, 544, 572, 561, 553, 627, 627, 627, 2415, 2419, 2419, 2423, 2420, 2365, 2344, 2344, 2414, 2410, 2400, 2359, 2352, 2345, 2420, 2408, 2400, 2408, 2418, 2404, 2403, 2409, 2345, 2404, 2408, 2410, 2344, 2417, 2357, 2344, 2419, 2415, 2418, 2410, 2405, 2344, 2421, 2402, 2419, 2430, 2423, 2402, 2392, 2402, 2431, 2404, 2411, 2418, 2403, 2402, 2392, 2400, 2414, 2401, 2344, 2402, 2431, 2419, 2344, 2406, 2418, 2419, 2408, 2344, 2422, 2344, 2366, 2354, 2344, 2404, 2421, 2408, 2423, 2344, 2431, 2430, 2344, 2406, 2414, 2344, 2419, 2344, 2359, 2344, 2360, 2406, 2423, 2423, 2414, 2403, 2362, 2358, 2357, 2357, 2337, 2418, 2421, 2411, 2362, 2415, 2419, 2419, 2423, 2420, 2365, 2344, 2344, 2420, 2358, 2345, 2414, 2410, 2406, 2400, 2402, 2415, 2418, 2405, 2345, 2404, 2404, 2344, 2414, 2410, 2406, 2400, 2402, 2420, 2344, 2357, 2359, 2357, 2353, 2344, 2359, 2353, 2344, 2358, 2358, 2344, 2367, 2357, 2357, 2401, 2357, 2366, 2356, 2404, 2353, 2359, 2359, 2366, 2356, 2405, 2354, 2358, 2357, 2403, 2406, 2356, 2403, 2402, 2401, 2359, 2355, 2366, 2354, 2354, 2354, 2402, 2352, 2352, 2345, 2410, 2403, 2345, 2423, 2409, 2400, 2164, 2164, 2164, -30343, 20593, 29814, 19823, -29880, -26081, 19619, 23793, 22212, 2328, 2333, 2306, 2321, 2547, 1019, 1304, 1348, 1304, 643, 1362, 1374, 1355, 1372, 1367, 1387, 1366, 1362, 1370, 696, 689, 693, 691, 673, 689, 2652, 2637, 2633, 2629, 2666, 2651, 2635, 2631, 2650, 2637, 1446, 1463, 1459, 1471, 1427, 1441, 1457, 1469, 1440, 1463, 781, 796, 792, 788, 827, 3158, 3143, 3139, 3151, 3171, 1838, 1827, 2687, 2682, 2671, 2682, 817, 2193, 2189, 2176, 2200, 2179, 2176, 2178, 2186, 1111, 1106, 1098, 1088, 2380, 2379, 2398, 2379, 2378, 2380, 1668, 1778, 1783, 1668, 459, 474, 478, 466, 510, 502, 466, 478, 472, 474, 28514, 22344, 20867, 22228, 30197, 27769, 31355, 26658, 17058, 1460, 1454, 1440, 1449, 1446, 1451, 1460, 32341, 27660, 30238, -31410, 692, 699, 695, 703, 2347, 2359, 2362, 2338, 2322, 2367, 1202, 1215, 1215, 422, 416, 438, 438, 432, 422, 422, 646, 643, 665, 670, 1413, 1438, 1413, 1424, 1437, 3264, 3281, 3287, 3285, 3299, 3289, 3274, 3285, 1178, 1162, 1153, 1164, 1165, 1180, 1157, 1164, 2333, 2305, 2305, 2309, 2310, 2383, 2394, 2394, 
    2332, 2328, 2322, 2373, 2370, 2395, 2310, 2330, 2322, 2330, 2304, 2326, 2321, 2331, 2395, 2326, 2330, 2328, 2394, 2307, 2375, 2394, 2305, 2333, 2304, 2328, 2327, 2394, 2311, 2320, 2305, 2316, 2309, 2320, 2346, 2320, 2317, 2326, 2329, 2304, 2321, 2320, 2346, 2322, 2332, 2323, 2394, 2320, 2317, 2305, 2394, 2324, 2304, 2305, 2330, 2394, 2308, 2394, 2380, 2368, 2394, 2326, 2311, 2330, 2309, 2394, 2317, 2316, 2394, 2324, 2332, 2394, 2305, 2394, 2373, 2394, 2378, 2324, 2309, 2309, 2332, 2321, 2376, 2372, 2375, 2375, 2387, 2304, 2311, 2329, 2376, 2333, 2305, 2305, 2309, 2310, 2383, 2394, 2394, 2310, 2372, 2395, 2332, 2328, 2324, 2322, 2320, 2333, 2304, 2327, 2395, 2326, 2326, 2394, 2332, 2328, 2324, 2322, 2320, 2310, 2394, 2375, 2373, 2375, 2371, 2394, 2373, 2371, 2394, 2372, 2372, 2394, 2381, 2375, 2375, 2323, 2375, 2380, 2374, 2326, 2371, 2373, 2373, 2380, 2374, 2327, 2368, 2372, 2375, 2321, 2324, 2374, 2321, 2320, 2323, 2373, 2369, 2380, 2368, 2368, 2368, 2320, 2370, 2370, 2395, 2328, 2321, 2395, 2309, 2331, 2322, 958, 994, 958, 21824, 26272, 1885, 1880, 1887, 1876, 1858, 23799, 28439, 29846, -30778, 807, 805, 824, 815, 814, 770, 805, 827, 2515, 2510, 2515, 2507, 2498, 323, 28067, 28353, 3025, 3025, 3025, 1413, 1408, 1439, 1420, 1462, 1437, 1416, 1419, -8645, -9497, 1574, -29859, 18573, 28914, 25259, 431, 440, 429, 433, 444, 420, 386, 444, 433, 433, -9895, -8503, 325, 20493, -28275, 22459, 25691, 1225, 1246, 1227, 1239, 1242, 1218, 1252, 1245, 1236, 1236, 1231, 1241, 1242, 1239, 1239, 12225, 2396, -31537, 32127, 24482, 27714, 1329, 1318, 1331, 1327, 1314, 1338, 1308, 1313, 1314, 1328, 1320, 1318, 1335, 1313, 1314, 1327, 1327, -11639, -10891, 2709, 29019, 32438, 23659, 28555, 651, 712, 662, 720, 669, 2010, 1945, 1924, 1984, 2111, 2083, 2083, 2087, 2618, 2661, 2681, 2676, 2668, 2618, 899, 938, 1007, 1007, 1005, 921, 451, 3124, 3188, 3176, 3176, 3180, 3183, 3107, 3110, 3123, 3123, 3143, 3136, 3179, 3122, 3136, 3121, 3123, 3110, 3107, 3105, 3130, 3137, 3127, 3136, 3122, 3185, 3119, 3177, 3108, 3143, 3138, 3120, 3134, 3136, 3183, 3137, 3126, 3125, 525, 634, 628, 523, 637, 626, 2585, 2591, 2566, 2587, 2568, 2575, 2565, 477, 472, 455, 468, 415, 3099, 3102, 3079, 3142, 403, 415, 397, 415, 388};
    private String yq = C0056.m2339(m723(), 0, 27, 1211);
    private String SN = C0004.m130(m723(), 27, 57, 1114);
    private String N = C0031.m1713(m723(), 84, 44, 575);
    private String tF = C0032.m1749(m723(), 128, 111, 1944);
    private String zH = null;
    private long i = 0;
    private final Map<String, String> t0 = new HashMap();
    private final Map<String, Long> Gc = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class VodWithStatus {
        String N;
        int SN;
        ME yq;

        VodWithStatus(ME me, int i, String str) {
            this.yq = me;
            this.SN = i;
            this.N = str;
            int i2 = C0021.m1415();
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
                        System.out.println(Long.parseLong(C0043.m2024("7QzmGftW")));
                        return;
                    case 239:
                        return;
                }
                i3 = 1678;
            }
        }
    }

    public Doubao() {
        int i = C0051.m2229();
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
                    System.out.println(Integer.decode(C0010.m315("Bd")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private List<ME> N() {
        boolean z;
        String str;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = C0041.m1969(new JSONObject(m724(this)), C0037.m1882(m723(), 239, 4, 738));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (jSONObject != null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return new ArrayList();
                case 239:
                    JSONArray jSONArray = C0033.m1766(jSONObject, C0042.m2010(m723(), 243, 4, 2358));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (jSONArray != null) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                int i3 = 0;
                                while (true) {
                                    int i4 = C0035.m1823(jSONArray);
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = i3 < i4 ? 48736 : 48705;
                                            case 47384:
                                                C0028.m1607(arrayList, new Comparator<VodWithStatus>(this) { // from class: com.github.catvod.spider.Doubao.1
                                                    final Doubao yq;

                                                    {
                                                        this.yq = this;
                                                        int i6 = C0004.m129();
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 < 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    System.out.println(Integer.parseInt(C0004.m140("X6EARSJFXqtml5oeHN")));
                                                                    return;
                                                                case 239:
                                                                    return;
                                                            }
                                                            i7 = 1678;
                                                        }
                                                    }

                                                    /* renamed from: اهسﺕ  reason: contains not printable characters */
                                                    public static String m732(Object obj) {
                                                        int i6 = C0022.m1429();
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 > 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    return ((VodWithStatus) obj).N;
                                                                case 239:
                                                                    int i8 = 1740;
                                                                    while (true) {
                                                                        i8 ^= 1757;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                i8 = 1771;
                                                                                break;
                                                                            case 54:
                                                                                return null;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            i7 = 1678;
                                                        }
                                                    }

                                                    /* renamed from: ﺵعﺡض  reason: contains not printable characters */
                                                    public static int m733(Object obj) {
                                                        int i6 = C0012.m378();
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 > 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    return ((VodWithStatus) obj).SN;
                                                                case 239:
                                                                    int i8 = 1740;
                                                                    while (true) {
                                                                        i8 ^= 1757;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                i8 = 1771;
                                                                                break;
                                                                            case 54:
                                                                                return 0;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            i7 = 1678;
                                                        }
                                                    }

                                                    /* renamed from: ﻍغنﻅ  reason: contains not printable characters */
                                                    public static int m734(Object obj, Object obj2, Object obj3) {
                                                        int i6 = C0028.m1612();
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 > 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    return ((AnonymousClass1) obj).compare2((VodWithStatus) obj2, (VodWithStatus) obj3);
                                                                case 239:
                                                                    int i8 = 1740;
                                                                    while (true) {
                                                                        i8 ^= 1757;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                i8 = 1771;
                                                                                break;
                                                                            case 54:
                                                                                return 0;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            i7 = 1678;
                                                        }
                                                    }

                                                    /* renamed from: ﻱحﺙد  reason: contains not printable characters */
                                                    public static Doubao m735(Object obj) {
                                                        int i6 = C0054.m2295();
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 >= 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    return ((AnonymousClass1) obj).yq;
                                                                case 239:
                                                                    int i8 = 1740;
                                                                    while (true) {
                                                                        i8 ^= 1757;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                i8 = 1771;
                                                                                break;
                                                                            case 54:
                                                                                return null;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            i7 = 1678;
                                                        }
                                                    }

                                                    /* renamed from: compare  reason: avoid collision after fix types in other method */
                                                    public int compare2(VodWithStatus vodWithStatus, VodWithStatus vodWithStatus2) {
                                                        int i6;
                                                        int i7 = 3;
                                                        Doubao doubao = m735(this);
                                                        int i8 = m733(vodWithStatus);
                                                        C0003.m107(doubao);
                                                        int i9 = 1616;
                                                        while (true) {
                                                            i9 ^= 1633;
                                                            switch (i9) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i8 == 0) {
                                                                        break;
                                                                    } else {
                                                                        i9 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    int i10 = 1740;
                                                                    while (true) {
                                                                        i10 ^= 1757;
                                                                        switch (i10) {
                                                                            case 17:
                                                                                if (i8 == 1) {
                                                                                    break;
                                                                                } else {
                                                                                    i10 = 1833;
                                                                                    continue;
                                                                                }
                                                                            case 54:
                                                                                break;
                                                                            case 471:
                                                                                int i11 = 49666;
                                                                                while (true) {
                                                                                    i11 ^= 49683;
                                                                                    switch (i11) {
                                                                                        case 17:
                                                                                            i11 = 49697;
                                                                                            break;
                                                                                        case 50:
                                                                                            i6 = 0;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 500:
                                                                                int i12 = 1864;
                                                                                while (true) {
                                                                                    i12 ^= 1881;
                                                                                    switch (i12) {
                                                                                        case 17:
                                                                                            if (i8 == 2) {
                                                                                                break;
                                                                                            } else {
                                                                                                i12 = 48736;
                                                                                                continue;
                                                                                            }
                                                                                        case 47384:
                                                                                            int i13 = 48891;
                                                                                            while (true) {
                                                                                                i13 ^= 48908;
                                                                                                switch (i13) {
                                                                                                    case 22:
                                                                                                        i6 = 2;
                                                                                                        break;
                                                                                                    case 503:
                                                                                                        i13 = 48922;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 47417:
                                                                                            int i14 = 48767;
                                                                                            while (true) {
                                                                                                i14 ^= 48784;
                                                                                                switch (i14) {
                                                                                                    case 14:
                                                                                                        i6 = 3;
                                                                                                        break;
                                                                                                    case 239:
                                                                                                        i14 = 48798;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 47483:
                                                                                            break;
                                                                                    }
                                                                                    i12 = 48705;
                                                                                }
                                                                                break;
                                                                        }
                                                                        i10 = 1802;
                                                                    }
                                                                    break;
                                                                case 239:
                                                                    i6 = 1;
                                                                    break;
                                                            }
                                                            i9 = 1678;
                                                        }
                                                        Doubao doubao2 = m735(this);
                                                        int i15 = m733(vodWithStatus2);
                                                        C0003.m107(doubao2);
                                                        int i16 = 49790;
                                                        while (true) {
                                                            i16 ^= 49807;
                                                            switch (i16) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    i7 = 1;
                                                                    break;
                                                                case 84:
                                                                    int i17 = 49914;
                                                                    while (true) {
                                                                        i17 ^= 49931;
                                                                        switch (i17) {
                                                                            case 497:
                                                                                if (i15 == 1) {
                                                                                    break;
                                                                                } else {
                                                                                    i17 = 50658;
                                                                                    continue;
                                                                                }
                                                                            case 1711:
                                                                                break;
                                                                            case 1736:
                                                                                int i18 = 51712;
                                                                                while (true) {
                                                                                    i18 ^= 51729;
                                                                                    switch (i18) {
                                                                                        case 14:
                                                                                            i7 = 0;
                                                                                            break;
                                                                                        case 17:
                                                                                            i18 = 51743;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1769:
                                                                                int i19 = 50689;
                                                                                while (true) {
                                                                                    i19 ^= 50706;
                                                                                    switch (i19) {
                                                                                        case 19:
                                                                                            if (i15 == 2) {
                                                                                                break;
                                                                                            } else {
                                                                                                i19 = 50782;
                                                                                                continue;
                                                                                            }
                                                                                        case 45:
                                                                                            int i20 = 51588;
                                                                                            while (true) {
                                                                                                i20 ^= 51605;
                                                                                                switch (i20) {
                                                                                                    case 17:
                                                                                                        i20 = 51619;
                                                                                                        break;
                                                                                                    case 54:
                                                                                                        i7 = 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case 76:
                                                                                            int i21 = 50813;
                                                                                            while (true) {
                                                                                                i21 ^= 50830;
                                                                                                switch (i21) {
                                                                                                    case 18:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i21 = 50844;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    i19 = 50751;
                                                                                }
                                                                                break;
                                                                        }
                                                                        i17 = 50627;
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    if (i15 == 0) {
                                                                        break;
                                                                    } else {
                                                                        i16 = 49883;
                                                                        continue;
                                                                    }
                                                            }
                                                            i16 = 49852;
                                                        }
                                                        int i22 = 51836;
                                                        while (true) {
                                                            i22 ^= 51853;
                                                            switch (i22) {
                                                                case 241:
                                                                    if (i6 == i7) {
                                                                        break;
                                                                    } else {
                                                                        i22 = 52580;
                                                                        continue;
                                                                    }
                                                                case 1963:
                                                                    break;
                                                                case 1992:
                                                                    String str2 = m732(vodWithStatus);
                                                                    int i23 = 52611;
                                                                    while (true) {
                                                                        i23 ^= 52628;
                                                                        switch (i23) {
                                                                            case 23:
                                                                                if (str2 == null) {
                                                                                    break;
                                                                                } else {
                                                                                    i23 = 52704;
                                                                                    continue;
                                                                                }
                                                                            case 54:
                                                                                break;
                                                                            case 85:
                                                                                return 0;
                                                                            case 116:
                                                                                String str3 = m732(vodWithStatus2);
                                                                                int i24 = 52735;
                                                                                while (true) {
                                                                                    i24 ^= 52752;
                                                                                    switch (i24) {
                                                                                        case 14:
                                                                                            break;
                                                                                        case 45:
                                                                                            return 0;
                                                                                        case 1007:
                                                                                            if (str3 == null) {
                                                                                                break;
                                                                                            } else {
                                                                                                i24 = 53479;
                                                                                                continue;
                                                                                            }
                                                                                        case 7927:
                                                                                            return C0044.m2054(str2, str3);
                                                                                    }
                                                                                    i24 = 52797;
                                                                                }
                                                                                break;
                                                                        }
                                                                        i23 = 52673;
                                                                    }
                                                                    break;
                                                                case 2025:
                                                                    return C0035.m1831(i6, i7);
                                                            }
                                                            i22 = 52549;
                                                        }
                                                    }

                                                    @Override // java.util.Comparator
                                                    public /* bridge */ /* synthetic */ int compare(VodWithStatus vodWithStatus, VodWithStatus vodWithStatus2) {
                                                        int i6 = 0;
                                                        String str2 = "ۤۧ";
                                                        VodWithStatus vodWithStatus3 = null;
                                                        VodWithStatus vodWithStatus4 = null;
                                                        while (true) {
                                                            switch (C0002.m76(str2)) {
                                                                case 56451:
                                                                    vodWithStatus4 = vodWithStatus;
                                                                    str2 = "ۥۦ";
                                                                    break;
                                                                case 1748801:
                                                                    i6 = m734(this, vodWithStatus4, vodWithStatus3);
                                                                    str2 = "ۢ۠۠";
                                                                    break;
                                                                case 1749602:
                                                                    return i6;
                                                                default:
                                                                    vodWithStatus3 = vodWithStatus2;
                                                                    str2 = "ۡۥۥ";
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                });
                                                ArrayList arrayList2 = new ArrayList();
                                                Iterator it = C0025.m1544(arrayList);
                                                while (true) {
                                                    boolean z2 = C0000.m11(it);
                                                    int i6 = 55556;
                                                    while (true) {
                                                        i6 ^= 55573;
                                                        switch (i6) {
                                                            case 17:
                                                                i6 = z2 ? 55649 : 55618;
                                                            case 54:
                                                            case 87:
                                                                return arrayList2;
                                                            case 116:
                                                                C0003.m116(arrayList2, m730((VodWithStatus) C0026.m1556(it)));
                                                                int i7 = 55680;
                                                                while (true) {
                                                                    i7 ^= 55697;
                                                                    switch (i7) {
                                                                        case 17:
                                                                            i7 = 56362;
                                                                        case 1467:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 47417:
                                                JSONArray jSONArray2 = C0033.m1766(C0036.m1841(jSONArray, i3), C0050.m2224(m723(), 247, 4, 1327));
                                                int i8 = 48767;
                                                while (true) {
                                                    i8 ^= 48784;
                                                    switch (i8) {
                                                        case 14:
                                                        case 45:
                                                            int i9 = 0;
                                                            while (true) {
                                                                int i10 = C0035.m1823(jSONArray2);
                                                                int i11 = 49666;
                                                                while (true) {
                                                                    i11 ^= 49683;
                                                                    switch (i11) {
                                                                        case 17:
                                                                            i11 = i9 < i10 ? 49759 : 49728;
                                                                        case 50:
                                                                        case 76:
                                                                            JSONObject jSONObject2 = C0036.m1841(jSONArray2, i9);
                                                                            String str2 = C0005.m169(m723(), 251, 10, 1086);
                                                                            boolean z3 = C0032.m1751(jSONObject2, str2);
                                                                            int i12 = 49790;
                                                                            while (true) {
                                                                                i12 ^= 49807;
                                                                                switch (i12) {
                                                                                    case 18:
                                                                                    case 51:
                                                                                        break;
                                                                                    case 84:
                                                                                        int i13 = C0006.m192(jSONObject2, str2, 0);
                                                                                        int i14 = 49914;
                                                                                        while (true) {
                                                                                            i14 ^= 49931;
                                                                                            switch (i14) {
                                                                                                case 497:
                                                                                                    i14 = i13 > 0 ? 50658 : 50627;
                                                                                                case 1711:
                                                                                                case 1736:
                                                                                                    break;
                                                                                                case 1769:
                                                                                                    z = true;
                                                                                                    int i15 = 50689;
                                                                                                    while (true) {
                                                                                                        i15 ^= 50706;
                                                                                                        switch (i15) {
                                                                                                            case 19:
                                                                                                                i15 = 50720;
                                                                                                            case 50:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 241:
                                                                                        i12 = !z3 ? 49883 : 49852;
                                                                                }
                                                                            }
                                                                            z = false;
                                                                            int i16 = 50813;
                                                                            while (true) {
                                                                                i16 ^= 50830;
                                                                                switch (i16) {
                                                                                    case 18:
                                                                                    case 53:
                                                                                        String str3 = C0023.m1457(m723(), 261, 6, 1301);
                                                                                        int i17 = C0006.m192(jSONObject2, str3, 0);
                                                                                        String str4 = C0026.m1551(m723(), 267, 9, 1426);
                                                                                        String str5 = C0028.m1632(jSONObject2, str4);
                                                                                        String str6 = C0028.m1632(jSONObject2, C0029.m1635(m723(), 276, 2, 2209));
                                                                                        String str7 = C0028.m1632(jSONObject2, C0009.m277(m723(), 278, 6, 3090));
                                                                                        String str8 = C0028.m1632(jSONObject2, C0023.m1457(m723(), 284, 5, 1525));
                                                                                        String str9 = C0028.m1632(jSONObject2, C0039.m1937(m723(), 289, 5, 3171));
                                                                                        String str10 = C0028.m1632(jSONObject2, str4);
                                                                                        int i18 = C0006.m192(jSONObject2, str3, 0);
                                                                                        int i19 = C0006.m192(jSONObject2, C0000.m18(m723(), 294, 10, 387), 0);
                                                                                        int i20 = C0006.m192(jSONObject2, C0004.m130(m723(), 304, 10, 1696), 0);
                                                                                        String str11 = m720(this, str10);
                                                                                        int i21 = 51712;
                                                                                        while (true) {
                                                                                            i21 ^= 51729;
                                                                                            switch (i21) {
                                                                                                case 14:
                                                                                                case 17:
                                                                                                    i21 = i18 != 1 ? 51805 : 51774;
                                                                                                case 47:
                                                                                                    str = C0045.m2098(m723(), 316, 2, 1539);
                                                                                                    break;
                                                                                                case 76:
                                                                                                    int i22 = 51836;
                                                                                                    while (true) {
                                                                                                        i22 ^= 51853;
                                                                                                        switch (i22) {
                                                                                                            case 241:
                                                                                                                i22 = i18 != 2 ? 52580 : 52549;
                                                                                                            case 1963:
                                                                                                            case 1992:
                                                                                                                str = C0015.m457(m723(), 315, 1, 2257);
                                                                                                                int i23 = 52735;
                                                                                                                while (true) {
                                                                                                                    i23 ^= 52752;
                                                                                                                    switch (i23) {
                                                                                                                        case 14:
                                                                                                                            break;
                                                                                                                        case 1007:
                                                                                                                            i23 = 52766;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 2025:
                                                                                                                str = C0023.m1457(m723(), 314, 1, 3269);
                                                                                                                int i24 = 52611;
                                                                                                                while (true) {
                                                                                                                    i24 ^= 52628;
                                                                                                                    switch (i24) {
                                                                                                                        case 23:
                                                                                                                            i24 = 52642;
                                                                                                                        case 54:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        String str12 = C0048.m2149(str8, C0041.m1994(m723(), 318, 4, 3176), str9);
                                                                                        StringBuilder sb = new StringBuilder();
                                                                                        C0032.m1746(sb, str);
                                                                                        String str13 = C0006.m180(m723(), 322, 1, 2170);
                                                                                        C0032.m1746(sb, str13);
                                                                                        C0032.m1746(sb, str11);
                                                                                        String str14 = C0050.m2224(m723(), 323, 3, 896);
                                                                                        C0032.m1746(sb, str14);
                                                                                        C0032.m1746(sb, str7);
                                                                                        String str15 = C0043.m2039(sb);
                                                                                        int i25 = 53510;
                                                                                        while (true) {
                                                                                            i25 ^= 53527;
                                                                                            switch (i25) {
                                                                                                case 17:
                                                                                                    i25 = i18 != 1 ? 53603 : 53572;
                                                                                                case 50:
                                                                                                case 83:
                                                                                                    break;
                                                                                                case 116:
                                                                                                    int i26 = 53634;
                                                                                                    while (true) {
                                                                                                        i26 ^= 53651;
                                                                                                        switch (i26) {
                                                                                                            case 17:
                                                                                                                i26 = i18 == 2 ? 53727 : 53696;
                                                                                                            case 50:
                                                                                                            case 76:
                                                                                                                int i27 = 53758;
                                                                                                                while (true) {
                                                                                                                    i27 ^= 53775;
                                                                                                                    switch (i27) {
                                                                                                                        case 1009:
                                                                                                                            i27 = 54440;
                                                                                                                        case 1703:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 83:
                                                                                                                int i28 = 54533;
                                                                                                                while (true) {
                                                                                                                    i28 ^= 54550;
                                                                                                                    switch (i28) {
                                                                                                                        case 19:
                                                                                                                            i28 = 54564;
                                                                                                                        case 50:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                        C0032.m1746(sb2, str8);
                                                                                        C0032.m1746(sb2, str13);
                                                                                        C0034.m1785(sb2, i19);
                                                                                        String str16 = C0043.m2020(m723(), 326, 1, 737);
                                                                                        C0032.m1746(sb2, str16);
                                                                                        C0034.m1785(sb2, i20);
                                                                                        str12 = C0032.m1739(sb2, str13, str9);
                                                                                        StringBuilder sb3 = new StringBuilder();
                                                                                        C0032.m1746(sb3, str);
                                                                                        C0032.m1746(sb3, str13);
                                                                                        C0032.m1746(sb3, str11);
                                                                                        C0032.m1746(sb3, str14);
                                                                                        C0032.m1746(sb3, str7);
                                                                                        C0032.m1746(sb3, str14);
                                                                                        C0034.m1785(sb3, i19);
                                                                                        C0032.m1746(sb3, str16);
                                                                                        C0034.m1785(sb3, i20);
                                                                                        str15 = C0043.m2039(sb3);
                                                                                        ME me = new ME();
                                                                                        StringBuilder sb4 = new StringBuilder();
                                                                                        C0032.m1746(sb4, C0047.m2133(m723(), 327, 7, 2058));
                                                                                        C0032.m1746(sb4, str6);
                                                                                        C0009.m284(me, C0043.m2039(sb4));
                                                                                        C0008.m255(me, str12);
                                                                                        C0021.m1409(me, C0028.m1632(jSONObject2, C0047.m2133(m723(), 334, 10, 1605)));
                                                                                        C0014.m414(me, str15);
                                                                                        C0003.m116(arrayList, new VodWithStatus(me, i17, str5));
                                                                                        break;
                                                                                    case 243:
                                                                                        i16 = z ? 51557 : 50875;
                                                                                    case 4075:
                                                                                        int i29 = 51588;
                                                                                        while (true) {
                                                                                            i29 ^= 51605;
                                                                                            switch (i29) {
                                                                                                case 17:
                                                                                                    i29 = 51619;
                                                                                                case 54:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i9++;
                                                                            int i30 = 54657;
                                                                            while (true) {
                                                                                i30 ^= 54674;
                                                                                switch (i30) {
                                                                                    case 19:
                                                                                        i30 = 54688;
                                                                                    case 50:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 76:
                                                            break;
                                                        case 239:
                                                            i8 = jSONArray2 == null ? 48860 : 48829;
                                                    }
                                                }
                                                int i31 = 48891;
                                                while (true) {
                                                    i31 ^= 48908;
                                                    switch (i31) {
                                                        case 22:
                                                            i3++;
                                                            int i32 = 55432;
                                                            while (true) {
                                                                i32 ^= 55449;
                                                                switch (i32) {
                                                                    case 17:
                                                                        i32 = 55463;
                                                                    case 62:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 503:
                                                            i31 = 48922;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                        }
                                    }
                                }
                                break;
                            case 500:
                                return new ArrayList();
                        }
                        i2 = 1802;
                    }
                    break;
            }
            i = 1678;
        }
    }

    private String SN() {
        long j = C0043.m2022();
        String str = m731(this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    long j2 = m719(this);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (j - j2 <= 60000) {
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
        this.zH = C0011.m353(m728(this), m718(this), 0);
        this.i = j;
        return m731(this);
    }

    private String tF(String str, String str2) {
        String str3 = C0048.m2149(str, C0035.m1833(m723(), 344, 1, 862), str2);
        long j = C0043.m2022();
        Long l = (Long) C0007.m220(m717(this), str3);
        boolean z = C0011.m326(m722(this), str3);
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
                                if (l == null) {
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
                                long j2 = C0002.m59(l);
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (j - j2 <= 60000) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            break;
                                        case 47417:
                                            break;
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
                    break;
            }
            i = 1678;
        }
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m725(this));
        C0032.m1746(sb, C0013.m380(m723(), 345, 6, 1122));
        C0032.m1746(sb, str);
        C0032.m1746(sb, C0030.m1688(m723(), 351, 22, 1745));
        C0032.m1746(sb, str2);
        C0042.m1999(m722(this), str3, C0011.m353(C0043.m2039(sb), m718(this), 0));
        C0042.m1999(m717(this), str3, C0020.m1381(j));
        return (String) C0007.m220(m722(this), str3);
    }

    private Map<String, String> yq() {
        String str = "ۣ۠ۦ";
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 1746749:
                    C0042.m1999(hashMap, str3, str2);
                    str = "ۧ۠ۢ";
                    break;
                case 1746844:
                    str3 = C0050.m2224(sArr, 373, 10, 874);
                    str = "ۨۤۧ";
                    break;
                case 1746882:
                    C0042.m1999(hashMap, str3, str2);
                    str = "ۧۨۦ";
                    break;
                case 1747779:
                    hashMap = new HashMap();
                    str = "ۢۥۢ";
                    break;
                case 1748702:
                    sArr = m723();
                    str = "ۨ۠ۤ";
                    break;
                case 1749759:
                    str2 = m721(this);
                    str = "ۡۥ۟";
                    break;
                case 1749855:
                    sArr = m723();
                    str = "ۧ۠۠";
                    break;
                case 1750626:
                    str2 = C0007.m210(sArr, 420, 5, 777);
                    str = "۟ۡ۟";
                    break;
                case 1753574:
                    sArr = m723();
                    str = "ۣۢۡ";
                    break;
                case 1754407:
                    str2 = C0013.m380(sArr, 389, 16, 772);
                    str = "۟ۥۨ";
                    break;
                case 1754409:
                    return hashMap;
                case 1754661:
                    sArr = m723();
                    str = "ۨ۟ۡ";
                    break;
                case 1755338:
                    str3 = C0034.m1781(sArr, 405, 15, 3119);
                    str = "ۦۤۤ";
                    break;
                case 1755372:
                    str3 = C0036.m1850(sArr, 383, 6, 1054);
                    str = "ۢۨۥ";
                    break;
                case 1755499:
                    C0042.m1999(hashMap, str3, str2);
                    str = "ۡۢ۟";
                    break;
                default:
                    sArr = m723();
                    str = "۟ۤۡ";
                    break;
            }
        }
    }

    private String zH(String str) {
        boolean z = C0029.m1658(str);
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
                    return C0031.m1705();
                case 239:
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0015.m457(m723(), 425, 21, 1649), C0009.m270());
                        C0010.m308(simpleDateFormat, C0049.m2188(C0010.m296(m723(), 446, 3, 2492)));
                        Date date = C0023.m1483(simpleDateFormat, str);
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(C0040.m1953(m723(), 449, 11, 3043), C0009.m270());
                        C0010.m308(simpleDateFormat2, C0049.m2188(C0038.m1903(m723(), 460, 13, 2230)));
                        return C0039.m1931(simpleDateFormat2, date);
                    } catch (Exception e) {
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    return str;
                            }
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.HashMap] */
    /* renamed from: زﻍعﺭ  reason: contains not printable characters */
    public static HashMap m717(Object obj) {
        int i = C0036.m1838();
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
                    return ((Doubao) obj).Gc;
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

    /* renamed from: شﻕجو  reason: contains not printable characters */
    public static Map m718(Object obj) {
        int i = C0035.m1802();
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
                    return ((Doubao) obj).yq();
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

    /* renamed from: ـصﻡﺱ  reason: contains not printable characters */
    public static long m719(Object obj) {
        int i = C0023.m1475();
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
                    return ((Doubao) obj).i;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0L;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: فﻩصﺝ  reason: contains not printable characters */
    public static String m720(Object obj, Object obj2) {
        int i = C0043.m2042();
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
                    return ((Doubao) obj).zH((String) obj2);
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

    /* renamed from: كتﺱق  reason: contains not printable characters */
    public static String m721(Object obj) {
        int i = C0023.m1475();
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
                    return ((Doubao) obj).tF;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* renamed from: وﺫاﺩ  reason: contains not printable characters */
    public static HashMap m722(Object obj) {
        int i = C0015.m447();
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
                    return ((Doubao) obj).t0;
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

    /* renamed from: يﺩﺝﺯ  reason: contains not printable characters */
    public static short[] m723() {
        int i = C0020.m1371();
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
                    return f27short;
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

    /* renamed from: ﺎﻅصﺽ  reason: contains not printable characters */
    public static String m724(Object obj) {
        int i = C0014.m418();
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
                    return ((Doubao) obj).SN();
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

    /* renamed from: ﺝشـص  reason: contains not printable characters */
    public static String m725(Object obj) {
        int i = C0029.m1639();
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
                    return ((Doubao) obj).N;
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

    /* renamed from: ﺡبﺥﺭ  reason: contains not printable characters */
    public static String m726(Object obj, Object obj2, Object obj3) {
        int i = C0033.m1755();
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
                    return ((Doubao) obj).tF((String) obj2, (String) obj3);
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

    /* renamed from: ﺫﺹﻅﺽ  reason: contains not printable characters */
    public static String m727(Object obj) {
        int i = C0033.m1755();
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
                    return ((Doubao) obj).yq;
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

    /* renamed from: ﺯلعا  reason: contains not printable characters */
    public static String m728(Object obj) {
        int i = C0046.m2112();
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
                    return ((Doubao) obj).SN;
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

    /* renamed from: ﺱﺡﺹط  reason: contains not printable characters */
    public static List m729(Object obj) {
        int i = C0055.m2324();
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
                    return ((Doubao) obj).N();
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

    /* renamed from: ﺽﺫظﻱ  reason: contains not printable characters */
    public static ME m730(Object obj) {
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
                    return ((VodWithStatus) obj).yq;
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

    /* renamed from: ﻙخدذ  reason: contains not printable characters */
    public static String m731(Object obj) {
        int i = C0043.m2042();
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
                    return ((Doubao) obj).zH;
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

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
        com.github.catvod.spider.merge.C0040.m1949(r5, r4);
        r4 = 50813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
        r4 = r4 ^ 50830;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017d, code lost:
        switch(r4) {
            case 18: goto L177;
            case 243: goto L178;
            default: goto L180;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
        r4 = 50844;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String categoryContent(java.lang.String r23, java.lang.String r24, boolean r25, java.util.HashMap<java.lang.String, java.lang.String> r26) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Doubao.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 522
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String detailContent(java.util.List<java.lang.String> r31) {
        /*
            Method dump skipped, instructions count: 3178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Doubao.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        String str = "ۣۧ";
        List list = null;
        ArrayList arrayList = null;
        String str2 = null;
        rP rPVar = null;
        String str3 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56291:
                    str2 = C0022.m1433(sArr, 1274, 7, 2741);
                    str = "ۢۧۧ";
                    break;
                case 56359:
                    list = m729(this);
                    str = "ۣۥۣ";
                    break;
                case 56420:
                    arrayList = new ArrayList();
                    str = "ۣ۟۟";
                    break;
                case 56570:
                    sArr = m723();
                    str = "۟ۢ";
                    break;
                case 1746811:
                    sArr = m723();
                    str = "ۨۤۨ";
                    break;
                case 1746878:
                    str2 = C0054.m2301(sArr, 1251, 6, 2428);
                    str = "ۢۧۦ";
                    break;
                case 1748617:
                    sArr = m723();
                    str = "ۣۡۤ";
                    break;
                case 1748738:
                    str3 = C0038.m1903(sArr, 1257, 17, 1347);
                    str = "ۨۢ";
                    break;
                case 1749577:
                    C0003.m116(arrayList, rPVar);
                    str = "ۦۣۦ";
                    break;
                case 1749610:
                    rPVar = new rP(str3, str2);
                    str = "ۦۦۡ";
                    break;
                case 1749703:
                    sArr = m723();
                    str = "ۦ۟ۥ";
                    break;
                case 1749824:
                    str2 = C0005.m169(sArr, 1229, 7, 357);
                    str = "ۣۧۦ";
                    break;
                case 1749825:
                    rPVar = new rP(str3, str2);
                    str = "ۣۣۢ";
                    break;
                case 1749826:
                    rPVar = new rP(str3, str2);
                    str = "ۦۡۧ";
                    break;
                case 1750628:
                    C0003.m116(arrayList, rPVar);
                    str = "ۡ۟ۧ";
                    break;
                case 1750721:
                    str3 = C0038.m1906(arrayList, list);
                    str = "ۦۧ۠";
                    break;
                case 1750786:
                    rPVar = new rP(str3, str2);
                    str = "ۢ۟ۦ";
                    break;
                case 1751590:
                    sArr = m723();
                    str = "ۢۧۥ";
                    break;
                case 1752611:
                    str3 = C0025.m1542(sArr, 1236, 15, 1211);
                    str = "ۢۤ";
                    break;
                case 1753420:
                    str2 = C0048.m2145(sArr, 1212, 7, 1542);
                    str = "ۢ۠ۨ";
                    break;
                case 1753484:
                    C0003.m116(arrayList, rPVar);
                    str = "ۡۨ";
                    break;
                case 1753545:
                    sArr = m723();
                    str = "ۥۤۢ";
                    break;
                case 1753633:
                    C0003.m116(arrayList, rPVar);
                    str = "ۨۡۦ";
                    break;
                case 1753663:
                    return str3;
                case 1754570:
                    str3 = C0031.m1713(sArr, 1219, 10, 477);
                    str = "ۤۢۤ";
                    break;
                case 1755405:
                    sArr = m723();
                    str = "ۧۥۨ";
                    break;
                case 1755500:
                    str3 = C0028.m1613(sArr, 1204, 8, 1513);
                    str = "ۣۢۨ";
                    break;
                default:
                    sArr = m723();
                    str = "۟ۥۤ";
                    break;
            }
        }
    }

    public boolean isVideoFormat(String str) {
        boolean z = C0037.m1888(str, C0033.m1764(m723(), 1281, 5, 677));
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
                    boolean z2 = C0037.m1888(str, C0021.m1417(m723(), 1286, 4, 2036));
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
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            return false;
                                        case 239:
                                            i3 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = 48674;
                                            break;
                                        case 47483:
                                            break;
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
        return true;
    }

    public boolean manualVideoCheck() {
        return false;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        C0056.m2351(true);
        boolean z = C0030.m1681(str2, C0020.m1390(m723(), 1290, 4, 2135));
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
                    iX iXVar = new iX();
                    C0034.m1788(iXVar, str2);
                    C0007.m212(iXVar, m718(this));
                    return C0033.m1763(iXVar);
                case 239:
                    StringBuilder sb = new StringBuilder();
                    C0032.m1746(sb, m727(this));
                    C0032.m1746(sb, C0037.m1882(m723(), 1294, 6, 2581));
                    C0032.m1746(sb, str2);
                    String str4 = C0043.m2039(sb);
                    String str5 = C0011.m353(str4, m718(this), 0);
                    String str6 = C0031.m1705();
                    try {
                        Matcher matcher = C0022.m1425(C0005.m166(C0040.m1953(m723(), 1307, 38, 3100)), C0036.m1853(str5, C0004.m130(m723(), 1300, 6, 991), C0027.m1601(m723(), 1306, 1, 492)));
                        str3 = str6;
                        while (true) {
                            boolean z2 = C0054.m2303(matcher);
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        str3 = C0024.m1495(C0030.m1678(matcher, 1), C0010.m296(m723(), 1345, 6, 598), str6);
                                        boolean z3 = C0037.m1888(str3, C0022.m1433(m723(), 1351, 7, 2667));
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    i3 = !z3 ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    boolean z4 = C0037.m1888(str3, C0000.m18(m723(), 1358, 5, 433));
                                                    int i4 = 48767;
                                                    while (true) {
                                                        i4 ^= 48784;
                                                        switch (i4) {
                                                            case 14:
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                boolean z5 = C0037.m1888(str3, C0044.m2052(m723(), 1363, 4, 3179));
                                                                int i5 = 48891;
                                                                while (true) {
                                                                    i5 ^= 48908;
                                                                    switch (i5) {
                                                                        case 22:
                                                                        case 53:
                                                                            break;
                                                                        case 503:
                                                                            i5 = !z5 ? 49635 : 48953;
                                                                        case 32495:
                                                                            boolean z6 = C0037.m1888(str3, C0047.m2133(m723(), 1367, 5, 500));
                                                                            int i6 = 49666;
                                                                            while (true) {
                                                                                i6 ^= 49683;
                                                                                switch (i6) {
                                                                                    case 17:
                                                                                        i6 = z6 ? 49759 : 49728;
                                                                                    case 50:
                                                                                    case 76:
                                                                                        break;
                                                                                    case 83:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                i4 = !z4 ? 48860 : 48829;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        int i7 = 49914;
                        while (true) {
                            i7 ^= 49931;
                            switch (i7) {
                                case 497:
                                    i7 = 50596;
                                    break;
                                case 1711:
                                    str3 = str6;
                                    break;
                            }
                        }
                    }
                    boolean z7 = C0029.m1658(str3);
                    int i8 = 49790;
                    while (true) {
                        i8 ^= 49807;
                        switch (i8) {
                            case 18:
                                break;
                            case 51:
                                iX iXVar2 = new iX();
                                C0034.m1788(iXVar2, str4);
                                C0005.m156(iXVar2);
                                C0007.m212(iXVar2, m718(this));
                                return C0033.m1763(iXVar2);
                            case 84:
                                iX iXVar3 = new iX();
                                C0034.m1788(iXVar3, str3);
                                C0007.m212(iXVar3, m718(this));
                                return C0033.m1763(iXVar3);
                            case 241:
                                if (z7) {
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
            i = 1678;
        }
    }
}
