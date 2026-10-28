package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
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
import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class App99 extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f17short = {1118, 1118, 1090, 1103, 1968, 1953, 1953, 1951, 1968, 1980, 1972, 1520, 1505, 1505, 1530, 1524, 1512, 2115, 2130, 2128, 2136, 2130, 2132, 2134, 2138, 2125, 2129, 2132, 2140, 2166, 2125, 2133, 2138, 2141, 2122, 1837, 1850, 1830, 1827, 1835, 1820, 1830, 1832, 1825, 1838, 1851, 1850, 1853, 1834, 981, 966, 977, 976, 970, 972, 973, 2045, 2016, 2020, 2028, 2042, 2045, 2024, 2020, 2041, 1129, 1128, 1129, 1124, 1122, 2865, 2864, 2870, 2874, 2865, 2864, 2916, 2916, 2788, 2785, 2804, 2785, 2876, 2855, 2851, 2861, 2854, 2193, 2199, 2177, 2198, 2192, 2187, 2191, 2177, 2186, 2375, 2395, 2390, 2382, 2386, 2373, 2443, 2455, 2458, 2434, 2462, 2441, 1618, 1630, 1621, 1620, 1154, 1165, 1153, 1161, 2037, 1955, 2026, 2037, 1955, 2026, 2037, 1955, 2026, 2037, 1955, 2026, 2037, 1955, 1559, 1548, 1541, 1641, 1654, 1649, 1650, 2449, 2449, 2445, 2432, 2503, 2522, 2526, 2518, 2496, 2503, 2514, 2526, 2499, 1282, 1304, 1302, 1311, 2519, 2518, 2519, 2522, 2524, 2531, 2546, 2546, 2537, 2535, 2555, 393, 410, 397, 396, 406, 400, 401, 2816, 2833, 2824, 2878, 2839, 2820, 2835, 2834, 2824, 2830, 2831, 522, 589, 271, 266, 287, 266, 3173, 3175, 3186, 3171, 3169, 3177, 3188, 3199, 3189, 1995, 2010, 1993, 1992, 2014, 1993, 2020, 2010, 1995, 2002, 1139, 1135, 1122, 1146, 1126, 1137, 880, 318, 2594, 2962, 2958, 1758, 3138, 3155, 3146, 3189, 3142, 3153, 3152, 3146, 3148, 3149, 3270, 3202, 1378, 1401, 1405, 1395, 1400, 2424, 2405, 2401, 2409, 2431, 2424, 2413, 2401, 2428, 310, 311, 310, 315, 317, 482, 428, 445, 445, 482, 446, 436, 446, 441, 424, 416, 388, 419, 420, 441, 856, 856, 863, 869, 1638, 1655, 1636, 1637, 1651, 1637, 1445, 1447, 1458, 1443, 1441, 1449, 1460, 1455, 1443, 1461, 1732, 1752, 1749, 1741, 1745, 1734, 2332, 2320, 2331, 2330, 2679, 2679, 2679, 2678, 2604, 2592, 2603, 2602, 897, 922, 899, 899, 2452, 2448, 2438, 759, 755, 741, 665, 757, 756, 757, 665, 742, 765, 757, 741, 643, 742, 727, 722, 722, 735, 728, 721, 2972, 2950, 2970, 3064, 3053, 3053, 3040, 3052, 3064, 3044, 1441, 1414, 1438, 1417, 1412, 1409, 1420, 1480, 1419, 1409, 1432, 1408, 1421, 1434, 1436, 1421, 1424, 1436, 1480, 1412, 1421, 1414, 1423, 1436, 1408, 2286, 2287, 2281, 2296, 2291, 2298, 2302, 2218, 2284, 2283, 2275, 2278, 2287, 2286, 765, 764, 750, 645, 656, 3139, 3154, 3154, 3150, 3147, 3137, 3139, 3158, 3147, 3149, 3148, 3085, 3144, 3153, 3149, 3148, 3097, 3074, 3137, 3146, 3139, 3152, 3153, 3143, 3158, 3103, 3159, 3158, 3140, 3087, 3098, 1201, 1184, 1190, 1188, 1182, 1186, 1198, 1204, 1199, 1205, 1123, 1138, 1140, 1142, 1136, 1148, 1126, 1149, 1127, 1197, 1212, 1210, 1208, 1182, 1202, 1192, 1203, 1193, 2005, 2000, 1989, 2000, 1615, 1614, 1615, 1602, 1604, 2659, 2686, 2682, 2674, 2660, 2659, 2678, 2682, 2663, 1310, 1285, 1281, 1295, 1284, 1236, 1420, 1416, 1438, 3048, 3052, 3066, 2950, 3050, 3051, 3050, 2950, 3065, 3042, 3050, 3066, 2972, 3065, 3016, 3021, 3021, 3008, 3015, 3022, 614, 576, 598, 577, 542, 626, 596, 598, 605, 583, 2654, 2631, 2636, 2679, 2650, 2637, 2629, 2633, 2650, 2627, 2651, 2265, 2240, 2251, 2288, 2271, 2246, 2252, 1807, 1814, 1821, 1830, 1815, 1816, 1812, 1820, 1220, 1245, 1238, 1261, 1243, 1238, 2335, 2322, 2147, 2156, 2144, 2152, 808, 821, 808, 816, 825, 2354, 2347, 2337, 967, 971, 978, 961, 982, 1638, 1649, 1657, 1653, 1638, 1663, 1639, 548, 549, 574, 559, 1661, 1633, 1644, 1652, 1618, 1643, 1663, 1634, 1632, 2249, 2261, 2264, 2240, 2271, 2251, 2262, 2260, 2644, 2632, 2629, 2653, 2683, 2641, 2646, 2632, 2839, 2827, 2822, 2846, 2834, 2837, 2827, 1535, 1415, 1535, 1415, 1535, 1415, 3313, 3326, 3314, 3322, 1076, 1069, 1062, 1053, 1068, 1059, 1071, 1063, 3078, 3099, 3078, 3102, 3095, 523, 535, 538, 514, 542, 521, 683, 679, 684, 685, 30321, -31455, 3039, 2048, 633, 513, 706, 730, 693, 605, 1150, 1064, 1151, 1150, 1064, 1051, 1150, 1064, 1051, 1150, 1064, 1051, 1150, 1064, 2278, 2278, 2278, 3104, 3109, 3120, 3109, 2650, 2655, 2629, 2626, 586, 599, 582, 590, 592, 1360, 1351, 1361, 1367, 1358, 1366, 1112, 1117, 1113, 1117, 1088, 1875, 1858, 1860, 1862, 786, 782, 2824, 2833, 2844, 1014, 1003, 1021, 1020, 1003, 987, 992, 802, 831, 827, 819, 863, 837, 885, 855, 834, 851, 849, 857, 836, 847, 751, 694, 687, 676, 751, 691, 677, 673, 690, 675, 680, 524, 521, 531, 532, 2932, 2917, 2915, 2913, 2919, 2923, 2929, 2922, 2928, 3136, 3163, 3136, 3157, 3160, 1124, 1085, 1139, 1142, 1132, 1131, 1085, 1061, 1092, 1090, 1075, 1085, 1135, 1150, 1144, 1146, 1085, 1061, 1248, 1262, 1212, 1197, 1195, 1193, 1199, 1187, 1209, 1186, 1208, 1262, 1270, 1277, 1248, 1262, 1184, 1189, 1185, 1189, 1208, 1262, 1270, 1278, 1277, 1248, 1262, 1208, 1187, 1208, 1197, 1184, 1262, 1270, 1276, 1201, 1560, 1557, 1564, 1545, 1587, 1538, 1549, 1537, 1545, 3041, 3064, 3059, 3016, 3060, 3064, 3065, 3043, 3058, 3065, 3043, 2652, 2629, 2638, 2677, 2638, 2627, 2648, 2639, 2633, 2654, 2629, 2648, 3129, 3104, 3115, 3088, 3118, 3116, 3131, 3104, 3133, 2010, 1987, 1992, 2035, 1997, 2014, 1993, 1997, 1615, 1622, 1629, 1638, 1600, 1628, 1624, 1611, 676, 701, 694, 653, 672, 695, 703, 691, 672, 697, 673, 854, 847, 836, 895, 848, 841, 835, 694, 687, 676, 671, 686, 673, 685, 677, 632, 609, 618, 593, 615, 618, 1807, 1794, 1919, 1830, 1896, 1901, 1911, 1904, 1830, 1854, 1887, 1881, 1913, 2779, 2766, 2765, 1069, 836, 2682, 2662, 2680, 2662, 2680, 1596, 1568, 2080, 2169, 2144, 2155, 2080, 2155, 2154, 2171, 2158, 2150, 2147, 506, 511, 490, 511, 1600, 1615, 1603, 1611, 3077, 3096, 3077, 3101, 3092, 895, 870, 876, 878, 866, 891, 872, 895, 427, 444, 436, 440, 427, 434, 426, 1127, 1126, 1149, 1132, 1996, 2000, 2004, 1991, 2349, 2366, 2345, 2349, 2120, 2122, 2141, 2118, 2139, 2972, 2961, 2954, 2973, 2971, 2956, 2967, 2954, 1237, 1241, 1240, 1218, 1235, 1240, 1218, 3127, 3129, 3104, 3111, 3127, 2250, 2245, 2248, 2266, 2266, 959, 934, 941, 918, 953, 933, 936, 944, 918, 943, 955, 934, 932, 
    292, 317, 310, 269, 290, 318, 307, 299, 269, 295, 288, 318, 3161, 3164, 3142, 3137, 2598, 2596, 2609, 2592, 2594, 2602, 2615, 2604, 2592, 2614, 2621, 2608, 2617, 2604, 2582, 2599, 2600, 2596, 2604, 1954, 1967, 1958, 1971, 1929, 1983, 1970, 1399, 1402, 860, 851, 863, 855, 24304, -26031, 29397, 22673, 32255, -32391, 20645, 27942, 30127, 20517, 2689, 2702, 2691, 2705, 2705, 1326, 1313, 1316, 1340, 1325, 1338, 1339, 1551, 1622, 1559, 1560, 1557, 1543, 1543, 1622, 1614, 1583, 1577, 1624, 1622, 1554, 1565, 1560, 1536, 1553, 1542, 1543, 1622, 1614, 1551, 1545, 1545, 1312, 1340, 3177, 3192, 3198, 3196, 3118, 2861, 2856, 2860, 2856, 2869, 2535, 2558, 2547, 1298, 3293, 3264, 3286, 3287, 3264, 3312, 3275, 907, 918, 914, 922, 2952, 2962, 2978, 2944, 2965, 2948, 2950, 2958, 2963, 2968, 3082, 3155, 3146, 3137, 3082, 3158, 3136, 3140, 3159, 3142, 3149, 1967, 1962, 1968, 1975, 1237, 1164, 1218, 1223, 1245, 1242, 1164, 1172, 1269, 1267, 1235, 294, 311, 311, 299, 302, 292, 294, 307, 302, 296, 297, 360, 301, 308, 296, 297, 958, 953, 933, 930, 3027, 3031, 3032, 3178, 3145, 3137, 3151, 3144, 3190, 3143, 3154, 3150, 1693, 1747, 1730, 1730, 1693, 1735, 1729, 1751, 1728, 1787, 1756, 1748, 1757, 422, 439, 439, 428, 418, 446, 3037, 3022, 3033, 3032, 3010, 3012, 3013, 3045, 3018, 3014, 3022, 804, 823, 800, 801, 827, 829, 828, 734, 652, 730, 733, 732, 726, 732, 726, 729, 655, 731, 650, 727, 731, 733, 651, 924, 915, 927, 919, 2355, 2338, 2336, 2344, 2338, 2340, 2342, 2392, 2383, 2387, 2390, 2398, 2420, 2383, 2391, 2392, 2399, 2376, 2303, 2280, 2292, 2289, 2297, 2254, 2292, 2298, 2291, 2300, 2281, 2280, 2287, 2296, 2062, 2069, 2065, 2079, 2068, 461, 461, 465, 476, 2647, 2627, 778, 808, 829, 814, 811, 811, 806, 872, 882, 873, 887, 871, 879, 784, 814, 809, 803, 808, 816, 820, 871, 777, 787, 871, 886, 887, 873, 887, 892, 871, 784, 814, 809, 881, 883, 892, 871, 831, 881, 883, 878, 871, 774, 823, 823, 811, 802, 784, 802, 805, 780, 814, 819, 872, 882, 884, 880, 873, 884, 881, 871, 879, 780, 783, 787, 778, 779, 875, 871, 811, 814, 812, 802, 871, 768, 802, 804, 812, 808, 878, 871, 772, 815, 821, 808, 810, 802, 872, 886, 885, 885, 873, 887, 873, 881, 885, 894, 894, 873, 894, 882, 871, 788, 806, 801, 806, 821, 814, 872, 882, 884, 880, 873, 884, 881, 1995, 2006, 2002, 2010, 2000, 1994, 1995, 1947, 1981, 1963, 1980, 2019, 1935, 1961, 1963, 1952, 1978, 3013, 3047, 3047, 3041, 3060, 3056, 972, 992, 993, 1019, 1002, 993, 1019, 930, 987, 1014, 1023, 1002, 2399, 2384, 2389, 2393, 2386, 2376, 2403, 2376, 2373, 2380, 2393, 3056, 3071, 3061, 3043, 3070, 3064, 3061, 2948, 2968, 2965, 2957, 2961, 2950, 2031, 2018, 2022, 2019, 2018, 2037, 2212, 2229, 2214, 2215, 2225, 1739, 1740, 1746, 274, 308, 290, 309, 362, 262, 288, 290, 297, 307, 2039, 769, 780, 773, 784, 600, 605, 594, 593, 605, 599, 585, 3207, 3268, 3226, 3292, 3217, 1379, 1407, 1394, 1386, 1350, 1377, 1407, 2954, 2971, 2952, 2953, 2975, 2991, 2952, 2966, 1384, 676, 681, 257, 272, 265, 277, 274, 268, 2748, 2733, 2740, 2696, 2735, 2737, 3143, 3102, 3148, 3165, 3150, 3151, 3161, 3102, 3078, 3085, 3088, 3102, 3145, 3150, 3152, 3102, 3078, 3102, 1634, 1597, 2807, 2114, 2075, 2050, 2057, 2114, 2078, 2056, 2060, 2079, 2062, 2053, 2846, 2819, 2837, 2836, 2819, 2867, 2824, 2469, 2484, 2482, 2480, 1575, 1595, 1614, 1611, 1615, 1611, 1622, 1702, 1727, 1716, 1679, 1720, 1721, 1700, 1699, 1679, 1725, 1727, 1726, 1700, 1720, 1704, 1716, 1705, 1711, 1259, 1258, 1276, 1260, 1352, 1361, 1370, 1366, 1367, 1354, 1357, 1363, 1361, 1360, 1354, 1366, 1114, 1119, 1093, 1090, 581, 596, 594, 592, 598, 602, 576, 603, 577, 610, 571, 629, 624, 618, 621, 571, 547, 578, 580, 565, 571, 617, 632, 638, 636, 571, 547, 3075, 3085, 3167, 3150, 3144, 3146, 3148, 3136, 3162, 3137, 3163, 3085, 3093, 3102, 3154};
    private String B;
    private Map<String, Object> F5;
    private int G;
    private Map<String, String> G4;
    private String Gc;
    private String KJ;
    private String M;
    private String N;
    private String SN;
    private OkHttpClient W;
    private Map<String, String> dT;
    private String i;
    private String q;
    private String t0;
    private String tF;
    private JSONArray v3;
    private String yq;
    private String zH;

    public App99() {
        int i = C0005.m152();
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
                    System.out.println(Integer.parseInt(C0031.m1714("xqcrpCh")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0139 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean B() {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.B():boolean");
    }

    private void F5(JSONObject jSONObject) {
        C0042.m1999(m514(this), C0051.m2237(m513(), 102, 6, 2555), jSONObject);
        Iterator it = C0043.m2019(jSONObject);
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
                        JSONObject jSONObject2 = C0041.m1969(jSONObject, (String) C0026.m1556(it));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = jSONObject2 != null ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    String str = C0031.m1705();
                                    String str2 = C0024.m1512(C0038.m1898(jSONObject2, C0039.m1937(m513(), 108, 4, 1585), str));
                                    String str3 = C0024.m1512(C0038.m1898(jSONObject2, C0055.m2320(m513(), 112, 4, 1260), str));
                                    boolean z2 = C0054.m2307(str2);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = !z2 ? 48736 : 48705;
                                            case 47384:
                                                break;
                                            case 47417:
                                                HashMap hashMap = m500(this);
                                                boolean z3 = C0054.m2307(str3);
                                                int i4 = 48767;
                                                while (true) {
                                                    i4 ^= 48784;
                                                    switch (i4) {
                                                        case 14:
                                                        case 45:
                                                            break;
                                                        case 76:
                                                            str3 = str2;
                                                            break;
                                                        case 239:
                                                            i4 = z3 ? 48860 : 48829;
                                                    }
                                                }
                                                C0042.m1999(hashMap, str2, str3);
                                                int i5 = 48891;
                                                while (true) {
                                                    i5 ^= 48908;
                                                    switch (i5) {
                                                        case 22:
                                                            continue;
                                                        case 503:
                                                            i5 = 48922;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 239:
                        return;
                }
            }
        }
    }

    private Map<String, String> G(String str, String str2, String str3) {
        String str4;
        byte[] bArr;
        StringBuilder sb;
        int length;
        int i = 0;
        try {
            bArr = C0035.m1817(C0027.m1581(C0045.m2098(m513(), 130, 7, 1604)), C0046.m2116(C0048.m2160(C0054.m2301(m513(), 116, 14, 2000), new Object[]{str3, str2, str, m519(this), m527(this)}), C0035.m1808()));
            sb = new StringBuilder();
            length = bArr.length;
        } catch (Exception e) {
            str4 = C0031.m1705();
        }
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < length ? 1709 : 1678;
                    case 204:
                        String str5 = C0030.m1677(bArr[i] & 255);
                        int i3 = C0046.m2105(str5);
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
                        C0032.m1746(sb, str5);
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
                        str4 = C0043.m2039(sb);
                        int i6 = 48767;
                        while (true) {
                            i6 ^= 48784;
                            switch (i6) {
                                case 14:
                                    break;
                                case 239:
                                    i6 = 48798;
                                    break;
                            }
                        }
                        break;
                }
            }
            HashMap hashMap = new HashMap(m479(this));
            C0042.m1999(hashMap, C0044.m2052(m513(), 137, 4, 2532), m523(this));
            C0042.m1999(hashMap, C0037.m1882(m513(), 141, 9, 2483), str2);
            C0042.m1999(hashMap, C0053.m2276(m513(), 150, 4, 1393), str4);
            C0042.m1999(hashMap, C0011.m328(m513(), 154, 5, 2489), str);
            C0042.m1999(hashMap, C0051.m2237(m513(), 159, 6, 2434), m527(this));
            C0042.m1999(hashMap, C0029.m1635(m513(), 165, 7, 511), m521(this));
            C0042.m1999(hashMap, C0027.m1601(m513(), 172, 11, 2913), C0057.m2384(m513(), 183, 2, 636));
            return hashMap;
        }
    }

    private boolean G4() {
        String str = C0028.m1613(m513(), 185, 4, 363);
        String str2 = C0040.m1953(m513(), 189, 9, 3078);
        String str3 = C0023.m1457(m513(), 198, 10, 1979);
        String str4 = C0012.m361(m513(), 208, 6, 1027);
        try {
            String str5 = m499(this);
            String str6 = m491(this);
            JSONObject jSONObject = new JSONObject();
            C0005.m159(jSONObject, C0001.m35(m513(), 214, 1, 774), m509(this));
            C0005.m159(jSONObject, C0006.m180(m513(), 215, 1, 336), m492(this));
            C0005.m159(jSONObject, C0021.m1417(m513(), 216, 1, 2641), m489(this));
            C0005.m159(jSONObject, C0047.m2133(m513(), 217, 2, 3042), C0027.m1601(m513(), 219, 1, 1775));
            C0005.m159(jSONObject, C0049.m2175(m513(), 220, 10, 3107), C0023.m1457(m513(), 230, 2, 3248));
            C0005.m159(jSONObject, C0039.m1937(m513(), 232, 5, 1302), C0031.m1705());
            C0005.m159(jSONObject, C0038.m1903(m513(), 237, 9, 2316), str6);
            C0005.m159(jSONObject, C0028.m1613(m513(), 246, 5, 344), str5);
            String str7 = m494(this, C0011.m335(jSONObject));
            Map map = m520(this, str5, str6, str7);
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m512(this));
            C0032.m1746(sb, C0022.m1433(m513(), 251, 15, 461));
            String str8 = m517(this, m518(this, C0043.m2039(sb), str7, map));
            PrintStream printStream = C0003.m108();
            StringBuilder sb2 = new StringBuilder();
            C0032.m1746(sb2, C0022.m1433(m513(), 266, 4, 785));
            C0032.m1746(sb2, str8);
            C0001.m27(printStream, C0043.m2039(sb2));
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (str8 == null) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        boolean z = C0054.m2307(str8);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (!z) {
                                        break;
                                    } else {
                                        i2 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    JSONObject jSONObject2 = new JSONObject(str8);
                                    boolean z2 = C0046.m2127(jSONObject2, str4);
                                    int i3 = 48767;
                                    while (true) {
                                        i3 ^= 48784;
                                        switch (i3) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                JSONObject jSONObject3 = C0041.m1969(jSONObject2, str4);
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 503:
                                                            if (jSONObject3 == null) {
                                                                break;
                                                            } else {
                                                                i4 = 49635;
                                                                continue;
                                                            }
                                                        case 32495:
                                                            m487(this, jSONObject3);
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i4 = 48953;
                                                }
                                            case 239:
                                                if (!z2) {
                                                    break;
                                                } else {
                                                    i3 = 48860;
                                                    continue;
                                                }
                                            default:
                                                continue;
                                        }
                                        i3 = 48829;
                                    }
                                    boolean z3 = C0046.m2127(jSONObject2, str3);
                                    int i5 = 49666;
                                    while (true) {
                                        i5 ^= 49683;
                                        switch (i5) {
                                            case 17:
                                                if (!z3) {
                                                    break;
                                                } else {
                                                    i5 = 49759;
                                                    continue;
                                                }
                                            case 50:
                                                break;
                                            case 76:
                                                JSONArray jSONArray = C0033.m1766(jSONObject2, str3);
                                                int i6 = 49790;
                                                while (true) {
                                                    i6 ^= 49807;
                                                    switch (i6) {
                                                        case 18:
                                                            break;
                                                        case 51:
                                                            break;
                                                        case 84:
                                                            C0042.m1999(m514(this), C0004.m130(m513(), 270, 6, 1558), jSONArray);
                                                            this.v3 = jSONArray;
                                                            break;
                                                        case 241:
                                                            if (jSONArray == null) {
                                                                break;
                                                            } else {
                                                                i6 = 49883;
                                                                continue;
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                    i6 = 49852;
                                                }
                                            case 83:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i5 = 49728;
                                    }
                                    boolean z4 = C0046.m2127(jSONObject2, str2);
                                    int i7 = 49914;
                                    while (true) {
                                        i7 ^= 49931;
                                        switch (i7) {
                                            case 497:
                                                if (!z4) {
                                                    break;
                                                } else {
                                                    i7 = 50658;
                                                    continue;
                                                }
                                            case 1711:
                                                break;
                                            case 1736:
                                                return true;
                                            case 1769:
                                                JSONObject jSONObject4 = C0041.m1969(jSONObject2, str2);
                                                int i8 = 50689;
                                                while (true) {
                                                    i8 ^= 50706;
                                                    switch (i8) {
                                                        case 19:
                                                            if (jSONObject4 == null) {
                                                                break;
                                                            } else {
                                                                i8 = 50782;
                                                                continue;
                                                            }
                                                        case 45:
                                                            return true;
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            boolean z5 = C0046.m2127(jSONObject4, str);
                                                            int i9 = 50813;
                                                            while (true) {
                                                                i9 ^= 50830;
                                                                switch (i9) {
                                                                    case 18:
                                                                        break;
                                                                    case 53:
                                                                        return true;
                                                                    case 243:
                                                                        if (!z5) {
                                                                            break;
                                                                        } else {
                                                                            i9 = 51557;
                                                                            continue;
                                                                        }
                                                                    case 4075:
                                                                        JSONArray jSONArray2 = C0033.m1766(jSONObject4, str);
                                                                        int i10 = 51588;
                                                                        while (true) {
                                                                            i10 ^= 51605;
                                                                            switch (i10) {
                                                                                case 17:
                                                                                    if (jSONArray2 == null) {
                                                                                        break;
                                                                                    } else {
                                                                                        i10 = 51681;
                                                                                        continue;
                                                                                    }
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    return true;
                                                                                case 116:
                                                                                    C0042.m1999(m514(this), C0041.m1994(m513(), 276, 10, 1478), jSONArray2);
                                                                                    return true;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i10 = 51650;
                                                                        }
                                                                    default:
                                                                        continue;
                                                                }
                                                                i9 = 50875;
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                    i8 = 50751;
                                                }
                                            default:
                                                continue;
                                        }
                                        i7 = 50627;
                                    }
                                case 500:
                                    int i11 = 1864;
                                    while (true) {
                                        i11 ^= 1881;
                                        switch (i11) {
                                            case 17:
                                                i11 = 48674;
                                                break;
                                            case 47483:
                                                break;
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
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            return false;
        } catch (Exception e) {
            C0011.m342(e);
            return false;
        }
    }

    private String Gc() {
        String str = "ۣۣ۟";
        byte[] bArr = null;
        String str2 = null;
        SecureRandom secureRandom = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 1750655:
                    bArr = new byte[16];
                    str = "۟ۨۢ";
                    break;
                case 1752615:
                    C0057.m2381(secureRandom, bArr);
                    str = "ۦۤۥ";
                    break;
                case 1753575:
                    str2 = C0034.m1790(bArr, 2);
                    str = "ۧۨۤ";
                    break;
                case 1754659:
                    return str2;
                default:
                    secureRandom = new SecureRandom();
                    str = "ۥۤۦ";
                    break;
            }
        }
    }

    private JSONObject KJ(String str) {
        Object obj = C0007.m220(m514(this), C0050.m2224(m513(), 286, 6, 1716));
        boolean z = obj instanceof JSONObject;
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
                    JSONObject jSONObject = (JSONObject) obj;
                    Iterator it = C0043.m2019(jSONObject);
                    while (true) {
                        boolean z2 = C0000.m11(it);
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
                                    JSONObject jSONObject2 = C0041.m1969(jSONObject, (String) C0026.m1556(it));
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = jSONObject2 != null ? 48736 : 48705;
                                            case 47384:
                                                break;
                                            case 47417:
                                                boolean z3 = C0056.m2343(C0024.m1512(C0038.m1898(jSONObject2, C0024.m1513(m513(), 292, 4, 2431), C0031.m1705())), C0024.m1512(str));
                                                int i4 = 48767;
                                                while (true) {
                                                    i4 ^= 48784;
                                                    switch (i4) {
                                                        case 14:
                                                        case 45:
                                                            break;
                                                        case 76:
                                                            PrintStream printStream = C0003.m108();
                                                            StringBuilder sb = new StringBuilder();
                                                            C0032.m1746(sb, C0013.m380(m513(), 296, 8, 2639));
                                                            C0025.m1533(sb, jSONObject2);
                                                            C0001.m27(printStream, C0043.m2039(sb));
                                                            return jSONObject2;
                                                        case 239:
                                                            i4 = z3 ? 48860 : 48829;
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
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        return new JSONObject();
    }

    private String M(JSONObject jSONObject, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            String str = C0031.m1705();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < length ? 1709 : 1678;
                    case 204:
                        String str2 = C0038.m1898(jSONObject, strArr[i], str);
                        boolean z = C0054.m2307(str2);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = !z ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    boolean z2 = C0056.m2343(C0041.m1994(m513(), 304, 4, 1007), str2);
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = !z2 ? 48736 : 48705;
                                            case 47384:
                                                break;
                                            case 47417:
                                                return str2;
                                            case 47483:
                                        }
                                    }
                                    break;
                            }
                        }
                        i++;
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                    break;
                                case 239:
                                    i5 = 48798;
                            }
                        }
                        break;
                    case 239:
                        return str;
                }
            }
        }
    }

    private String N(String str, String str2) {
        byte[] bArr = C0022.m1420(str, 2);
        int length = bArr.length;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (length < 16) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    byte[] bArr2 = C0032.m1741(bArr, 0, 16);
                    byte[] bArr3 = C0032.m1741(bArr, 16, bArr.length);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(m515(this, str2), C0033.m1764(m513(), 308, 3, 2517));
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                    Cipher cipher = C0029.m1636(C0039.m1937(m513(), 311, 20, 694));
                    C0043.m2041(cipher, 2, secretKeySpec, ivParameterSpec);
                    byte[] bArr4 = C0024.m1500(cipher, bArr3);
                    try {
                        return m525(this, bArr4);
                    } catch (Exception e) {
                        try {
                            return new String(bArr4, C0035.m1808());
                        } catch (Exception e2) {
                            return new String(bArr4, C0032.m1749(m513(), 331, 10, 3029));
                        }
                    }
                case 239:
                    throw new Exception(C0054.m2301(m513(), 341, 25, 1512));
            }
            i = 1678;
        }
    }

    private String SN(String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str != null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return C0031.m1705();
                case 239:
                    String str2 = C0024.m1512(str);
                    try {
                        return m531(this, str2, m523(this));
                    } catch (Exception e) {
                        try {
                            return m531(this, str2, null);
                        } catch (Exception e2) {
                            throw new Exception(C0028.m1613(m513(), 366, 14, 2186), e2);
                        }
                    }
            }
            i = 1678;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0012 A[EXC_TOP_SPLITTER, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String W(byte[] r7) {
        /*
            r6 = this;
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
            com.github.catvod.spider.C0046.m2110(r1, r7)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            int r0 = r7.length
            r2.<init>(r0)
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r0]
        L12:
            boolean r4 = com.github.catvod.spider.merge.C0029.m1647(r1)     // Catch: java.lang.Throwable -> L87
            r0 = 1616(0x650, float:2.264E-42)
        L18:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1e;
                case 49: goto L21;
                case 204: goto L26;
                case 239: goto L5b;
                default: goto L1d;
            }     // Catch: java.lang.Throwable -> L87
        L1d:
            goto L18
        L1e:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L18
        L21:
            if (r4 != 0) goto L1e
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L18
        L26:
            int r4 = com.github.catvod.parser.C0000.m20(r1, r3)     // Catch: java.lang.Throwable -> L87
            r0 = 1740(0x6cc, float:2.438E-42)
        L2c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L32;
                case 54: goto L37;
                case 471: goto L74;
                case 500: goto L3a;
                default: goto L31;
            }     // Catch: java.lang.Throwable -> L87
        L31:
            goto L2c
        L32:
            if (r4 != 0) goto L37
            r0 = 1833(0x729, float:2.569E-42)
            goto L2c
        L37:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2c
        L3a:
            boolean r5 = com.github.catvod.parser.C0013.m401(r1)     // Catch: java.lang.Throwable -> L87
            r0 = 1864(0x748, float:2.612E-42)
        L40:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L46;
                case 47384: goto L74;
                case 47417: goto L50;
                case 47483: goto L4c;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            if (r5 == 0) goto L4c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L40
        L4c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L40
        L50:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L53:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L5b;
                case 239: goto L70;
                default: goto L5a;
            }
        L5a:
            goto L53
        L5b:
            com.github.catvod.parser.C0013.m397(r1)
            short[] r0 = m513()
            r1 = 380(0x17c, float:5.32E-43)
            r3 = 5
            r4 = 680(0x2a8, float:9.53E-43)
            java.lang.String r0 = com.github.catvod.parser.C0009.m277(r0, r1, r3, r4)
            java.lang.String r0 = com.github.catvod.spider.merge.C0034.m1789(r2, r0)
            return r0
        L70:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L53
        L74:
            r0 = 0
            com.github.catvod.spider.merge.C0023.m1459(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L87
            r0 = 48891(0xbefb, float:6.8511E-41)
        L7b:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 22: goto L12;
                case 503: goto L83;
                default: goto L82;
            }
        L82:
            goto L7b
        L83:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L7b
        L87:
            r0 = move-exception
            com.github.catvod.parser.C0013.m397(r1)
            r1 = 49666(0xc202, float:6.9597E-41)
        L8e:
            r2 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L96;
                case 50: goto L9b;
                default: goto L95;
            }
        L95:
            goto L8e
        L96:
            r1 = 49697(0xc221, float:6.964E-41)
            goto L8e
        L9a:
            throw r0
        L9b:
            r1 = 49790(0xc27e, float:6.977E-41)
        L9e:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L9a;
                case 241: goto La6;
                default: goto La5;
            }
        La5:
            goto L9e
        La6:
            r1 = 49821(0xc29d, float:6.9814E-41)
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.W(byte[]):java.lang.String");
    }

    private String dT() {
        return C0049.m2192(C0043.m2022());
    }

    private String ee(String str, String str2, Map<String, String> map) {
        Request.Builder builder;
        Iterator it;
        try {
            builder = m528(m503(new Request.Builder(), str), m522(m483(C0046.m2123(m513(), 385, 31, 3106)), str2));
            it = C0014.m413(C0031.m1690(map));
        } catch (Exception e) {
            C0011.m342(e);
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
                        Map.Entry entry = (Map.Entry) C0026.m1556(it);
                        m493(builder, (String) C0032.m1733(entry), (String) C0045.m2095(entry));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        Response response = m488(m510(m496(this), m486(builder)));
                        boolean z2 = m502(response);
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    if (!z2) {
                                        break;
                                    } else {
                                        i3 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    break;
                                case 47417:
                                    ResponseBody responseBody = m498(response);
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                String str3 = m478(m498(response));
                                                m526(response);
                                                return str3;
                                            case 239:
                                                if (responseBody == null) {
                                                    break;
                                                } else {
                                                    i4 = 48860;
                                                    continue;
                                                }
                                            default:
                                                continue;
                                        }
                                        i4 = 48829;
                                    }
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 48705;
                        }
                        m526(response);
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 503:
                                    i5 = 48922;
                                    break;
                            }
                        }
                        break;
                }
            }
            return C0031.m1705();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
        return com.github.catvod.parser.C0007.m223(com.github.catvod.spider.merge.C0022.m1450(r3, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
        r0 = 49666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        r0 = r0 ^ 49683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
        switch(r0) {
            case 17: goto L113;
            case 50: goto L114;
            case 76: goto L115;
            case 83: goto L111;
            default: goto L119;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
        if (r1 >= 3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r0 = 49759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
        r0 = 49728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r4 = r5[r1];
        r6 = com.github.catvod.spider.C0046.m2127(r3, r4);
        r0 = 49790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
        r0 = r0 ^ 49807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
        switch(r0) {
            case 18: goto L122;
            case 51: goto L124;
            case 84: goto L62;
            case 241: goto L123;
            default: goto L128;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
        r0 = 49852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
        if (r6 == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
        r0 = 49883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
        r1 = r1 + 1;
        r0 = 49914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        r0 = r0 ^ 49931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
        switch(r0) {
            case 497: goto L132;
            case 1711: goto L131;
            default: goto L134;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r0 = 50596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
        r0 = 50813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0111, code lost:
        r0 = r0 ^ 50830;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
        switch(r0) {
            case 18: goto L141;
            case 243: goto L142;
            default: goto L144;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
        r0 = 50844;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int i(org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.i(org.json.JSONObject):int");
    }

    private String q(String str, JSONObject jSONObject) {
        String str2 = C0014.m421(m513(), 448, 5, 1569);
        String str3 = C0010.m296(m513(), 453, 9, 2583);
        String str4 = C0027.m1601(m513(), 462, 5, 1386);
        try {
            String str5 = m499(this);
            String str6 = m491(this);
            boolean z = C0046.m2127(jSONObject, str4);
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
                        C0005.m159(jSONObject, str4, m519(this));
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            boolean z2 = C0046.m2127(jSONObject, str3);
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        if (z2) {
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
                        C0005.m159(jSONObject, str3, str6);
                        break;
                    default:
                        continue;
                }
                i2 = 1802;
            }
            boolean z3 = C0046.m2127(jSONObject, str2);
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        if (z3) {
                            break;
                        } else {
                            i3 = 48736;
                            continue;
                        }
                    case 47384:
                        break;
                    case 47417:
                        C0005.m159(jSONObject, str2, str5);
                        break;
                    case 47483:
                        break;
                    default:
                        continue;
                }
                i3 = 48705;
            }
            String str7 = m494(this, C0011.m335(jSONObject));
            Map map = m520(this, str5, str6, str7);
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m512(this));
            C0032.m1746(sb, str);
            return m517(this, m518(this, C0043.m2039(sb), str7, map));
        } catch (Exception e) {
            C0011.m342(e);
            return C0031.m1705();
        }
    }

    private byte[] t0(String str) {
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
                    boolean z = C0054.m2307(str);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z) {
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
        str = m523(this);
        String str2 = C0031.m1705();
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    if (str != null) {
                        break;
                    } else {
                        i3 = 48736;
                        continue;
                    }
                case 47384:
                    break;
                case 47417:
                    str = str2;
                    break;
                case 47483:
                    break;
            }
            i3 = 48705;
        }
        byte[] bArr = C0046.m2116(C0036.m1853(str, C0015.m457(m513(), 467, 1, 1273), str2), C0035.m1808());
        int length = bArr.length;
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                    break;
                case 45:
                    return bArr;
                case 76:
                    int length2 = bArr.length;
                    int i5 = 48891;
                    while (true) {
                        i5 ^= 48908;
                        switch (i5) {
                            case 22:
                                break;
                            case 53:
                                return bArr;
                            case 503:
                                if (length2 == 24) {
                                    break;
                                } else {
                                    i5 = 49635;
                                    continue;
                                }
                            case 32495:
                                int length3 = bArr.length;
                                int i6 = 49666;
                                while (true) {
                                    i6 ^= 49683;
                                    switch (i6) {
                                        case 17:
                                            if (length3 != 32) {
                                                break;
                                            } else {
                                                i6 = 49759;
                                                continue;
                                            }
                                        case 50:
                                            break;
                                        case 76:
                                            int i7 = 49790;
                                            while (true) {
                                                i7 ^= 49807;
                                                switch (i7) {
                                                    case 18:
                                                        return bArr;
                                                    case 241:
                                                        i7 = 49821;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 83:
                                            int length4 = bArr.length;
                                            int i8 = 49914;
                                            while (true) {
                                                i8 ^= 49931;
                                                switch (i8) {
                                                    case 497:
                                                        if (length4 <= 32) {
                                                            break;
                                                        } else {
                                                            i8 = 50658;
                                                            continue;
                                                        }
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        byte[] bArr2 = new byte[32];
                                                        C0025.m1532(bArr, 0, bArr2, 0, bArr.length);
                                                        int length5 = bArr.length;
                                                        while (true) {
                                                            int i9 = 50689;
                                                            while (true) {
                                                                i9 ^= 50706;
                                                                switch (i9) {
                                                                    case 19:
                                                                        i9 = length5 < 32 ? 50782 : 50751;
                                                                    case 45:
                                                                        return bArr2;
                                                                    case 50:
                                                                    case 76:
                                                                        bArr2[length5] = 48;
                                                                        length5++;
                                                                        int i10 = 50813;
                                                                        while (true) {
                                                                            i10 ^= 50830;
                                                                            switch (i10) {
                                                                                case 18:
                                                                                    break;
                                                                                case 243:
                                                                                    i10 = 50844;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 1769:
                                                        return C0032.m1728(bArr, 32);
                                                }
                                                i8 = 50627;
                                            }
                                            break;
                                    }
                                    i6 = 49728;
                                }
                                break;
                        }
                        i5 = 48953;
                    }
                    break;
                case 239:
                    if (length == 16) {
                        break;
                    } else {
                        i4 = 48860;
                        continue;
                    }
            }
            i4 = 48829;
        }
    }

    private String tF(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(m515(this, null), C0035.m1833(m513(), 468, 3, 1485));
            byte[] bArr = new byte[16];
            C0057.m2381(new SecureRandom(), bArr);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher cipher = C0029.m1636(C0055.m2320(m513(), 471, 20, 2985));
            C0043.m2041(cipher, 1, secretKeySpec, ivParameterSpec);
            byte[] bArr2 = C0024.m1500(cipher, C0046.m2116(str, C0035.m1808()));
            byte[] bArr3 = new byte[bArr2.length + 16];
            C0025.m1532(bArr, 0, bArr3, 0, 16);
            C0025.m1532(bArr2, 0, bArr3, 16, bArr2.length);
            return C0034.m1790(bArr3, 2);
        } catch (Exception e) {
            C0011.m342(e);
            return C0031.m1705();
        }
    }

    private String v(String str) {
        int i;
        try {
            Response response = m488(m510(m496(this), m486(m493(m503(new Request.Builder(), str), C0005.m169(m513(), 491, 10, 563), m485(this)))));
            boolean z = m502(response);
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
                        ResponseBody responseBody = m498(response);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (responseBody == null) {
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
                                    String str2 = m478(m498(response));
                                    m526(response);
                                    return str2;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            m526(response);
            i = 1864;
        } catch (Exception e) {
            C0011.m342(e);
        }
        while (true) {
            i ^= 1881;
            switch (i) {
                case 17:
                    i = 48674;
                    break;
                case 47483:
                    return C0031.m1705();
            }
        }
    }

    private JSONArray v3(JSONArray jSONArray) {
        int i = 0;
        JSONArray jSONArray2 = new JSONArray();
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
                        JSONObject jSONObject = C0008.m237(jSONArray, i);
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = jSONObject != null ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    String str = C0021.m1417(m513(), 501, 11, 2600);
                                    String str2 = C0042.m2010(m513(), 512, 7, 2223);
                                    String str3 = C0039.m1937(m513(), 519, 8, 1913);
                                    String str4 = C0014.m421(m513(), 527, 6, 1202);
                                    JSONObject jSONObject2 = new JSONObject();
                                    try {
                                        C0005.m159(jSONObject2, str4, m504(this, jSONObject, new String[]{C0023.m1457(m513(), 533, 2, 2422), str4}));
                                        String str5 = m504(this, jSONObject, new String[]{C0032.m1749(m513(), 535, 4, 2061), str3, C0020.m1390(m513(), 539, 5, 860)});
                                        boolean z = C0010.m289(str5);
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = z ? 48736 : 48705;
                                                case 47384:
                                                    C0005.m159(jSONObject2, str3, str5);
                                                    C0005.m159(jSONObject2, str2, m504(this, jSONObject, new String[]{C0024.m1513(m513(), 544, 3, 2370), str2, C0007.m210(m513(), 547, 5, 932)}));
                                                    C0005.m159(jSONObject2, str, m504(this, jSONObject, new String[]{C0038.m1903(m513(), 552, 7, 1556), str, C0034.m1781(m513(), 559, 4, 586)}));
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
                                                case 47417:
                                                    jSONObject2 = null;
                                                    int i7 = 48767;
                                                    while (true) {
                                                        i7 ^= 48784;
                                                        switch (i7) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i7 = 48798;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                    } catch (Exception e) {
                                    }
                                    int i8 = 49666;
                                    while (true) {
                                        i8 ^= 49683;
                                        switch (i8) {
                                            case 17:
                                                i8 = jSONObject2 != null ? 49759 : 49728;
                                            case 50:
                                            case 76:
                                                C0041.m1985(jSONArray2, jSONObject2);
                                                break;
                                            case 83:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        i++;
                        int i9 = 49790;
                        while (true) {
                            i9 ^= 49807;
                            switch (i9) {
                                case 18:
                                    break;
                                case 241:
                                    i9 = 49821;
                            }
                        }
                        break;
                    case 239:
                        return jSONArray2;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 376
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private java.lang.String[] yq(org.json.JSONObject r25) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.yq(org.json.JSONObject):java.lang.String[]");
    }

    private JSONArray zH(JSONObject jSONObject) {
        String str = C0014.m421(m513(), 655, 4, 3140);
        String str2 = C0031.m1713(m513(), 659, 4, 2614);
        String str3 = C0052.m2261(m513(), 663, 5, 547);
        String str4 = C0024.m1513(m513(), 668, 6, 1314);
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < 4 ? 1709 : 1678;
                    case 204:
                        JSONArray jSONArray = C0033.m1766(jSONObject, new String[]{str, str2, str3, str4}[i]);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = jSONArray != null ? 1833 : 1802;
                                case 54:
                                case 471:
                                    i++;
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                case 500:
                                    return jSONArray;
                            }
                        }
                        break;
                    case 239:
                        JSONObject jSONObject2 = C0041.m1969(jSONObject, str);
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    int i6 = 0;
                                    while (true) {
                                        int i7 = 48891;
                                        while (true) {
                                            i7 ^= 48908;
                                            switch (i7) {
                                                case 22:
                                                case 53:
                                                    break;
                                                case 503:
                                                    i7 = i6 < 3 ? 49635 : 48953;
                                                case 32495:
                                                    JSONArray jSONArray2 = C0033.m1766(jSONObject2, new String[]{str2, str3, str}[i6]);
                                                    int i8 = 49666;
                                                    while (true) {
                                                        i8 ^= 49683;
                                                        switch (i8) {
                                                            case 17:
                                                                i8 = jSONArray2 != null ? 49759 : 49728;
                                                            case 50:
                                                            case 76:
                                                                return jSONArray2;
                                                            case 83:
                                                                i6++;
                                                                int i9 = 49790;
                                                                while (true) {
                                                                    i9 ^= 49807;
                                                                    switch (i9) {
                                                                        case 18:
                                                                            break;
                                                                        case 241:
                                                                            i9 = 49821;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case 239:
                                    if (jSONObject2 == null) {
                                        break;
                                    } else {
                                        i5 = 48860;
                                        continue;
                                    }
                            }
                            i5 = 48829;
                        }
                        return new JSONArray();
                }
            }
        }
    }

    /* renamed from: اﺵمﺽ  reason: contains not printable characters */
    public static String m478(Object obj) {
        int i = C0038.m1893();
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
                    return ((ResponseBody) obj).string();
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
    /* renamed from: بﺵشﺹ  reason: contains not printable characters */
    public static HashMap m479(Object obj) {
        int i = C0054.m2295();
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
                    return ((App99) obj).G4;
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

    /* renamed from: تكلﻉ  reason: contains not printable characters */
    public static int m480(Object obj, Object obj2) {
        int i = C0025.m1534();
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
                    return ((App99) obj).i((JSONObject) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ثصلر  reason: contains not printable characters */
    public static JSONArray m481(Object obj, Object obj2) {
        int i = C0051.m2229();
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
                    return ((App99) obj).zH((JSONObject) obj2);
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

    /* renamed from: ثهﺝد  reason: contains not printable characters */
    public static String m482(Object obj) {
        int i = C0051.m2229();
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
                    return ((App99) obj).Gc;
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

    /* renamed from: جدﺥﺱ  reason: contains not printable characters */
    public static MediaType m483(Object obj) {
        int i = C0049.m2194();
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
                    return MediaType.parse((String) obj);
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

    /* renamed from: جﻭﻅو  reason: contains not printable characters */
    public static String m484(Object obj, Object obj2) {
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
                    return ((App99) obj).v((String) obj2);
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

    /* renamed from: خذﺫﺙ  reason: contains not printable characters */
    public static String m485(Object obj) {
        int i = C0043.m2042();
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
                    return ((App99) obj).B;
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

    /* renamed from: داثب  reason: contains not printable characters */
    public static Request m486(Object obj) {
        int i = C0053.m2279();
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
                    return ((Request.Builder) obj).build();
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

    /* renamed from: دشطق  reason: contains not printable characters */
    public static void m487(Object obj, Object obj2) {
        int i = C0001.m25();
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
                    ((App99) obj).F5((JSONObject) obj2);
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

    /* renamed from: ذﻁﺙص  reason: contains not printable characters */
    public static Response m488(Object obj) {
        int i = C0045.m2093();
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
                    return ((Call) obj).execute();
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

    /* renamed from: روﻭﻙ  reason: contains not printable characters */
    public static String m489(Object obj) {
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
                    return ((App99) obj).M;
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

    /* renamed from: رﺯﺎد  reason: contains not printable characters */
    public static OkHttpClient m490(Object obj) {
        int i = C0045.m2093();
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
                    return ((OkHttpClient.Builder) obj).build();
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

    /* renamed from: شقﻙص  reason: contains not printable characters */
    public static String m491(Object obj) {
        int i = C0021.m1415();
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
                    return ((App99) obj).dT();
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

    /* renamed from: شيوﻕ  reason: contains not printable characters */
    public static String m492(Object obj) {
        int i = C0056.m2341();
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
                    return ((App99) obj).i;
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

    /* renamed from: شﺫظت  reason: contains not printable characters */
    public static Request.Builder m493(Object obj, Object obj2, Object obj3) {
        int i = C0008.m250();
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
                    return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
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

    /* renamed from: صسـﻡ  reason: contains not printable characters */
    public static String m494(Object obj, Object obj2) {
        int i = C0013.m382();
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
                    return ((App99) obj).tF((String) obj2);
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

    /* renamed from: ضﺯﺡر  reason: contains not printable characters */
    public static String m495(Object obj) {
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
                    return ((App99) obj).SN;
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

    /* renamed from: ظﺕما  reason: contains not printable characters */
    public static OkHttpClient m496(Object obj) {
        int i = C0007.m214();
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
                    return ((App99) obj).W;
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

    /* renamed from: عرﺵـ  reason: contains not printable characters */
    public static int m497(Object obj) {
        int i = C0052.m2256();
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
                    return ((App99) obj).G;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: غﻭمت  reason: contains not printable characters */
    public static ResponseBody m498(Object obj) {
        int i = C0012.m378();
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
                    return ((Response) obj).body();
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

    /* renamed from: ـهﻝذ  reason: contains not printable characters */
    public static String m499(Object obj) {
        int i = C0000.m13();
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
                    return ((App99) obj).Gc();
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
    /* renamed from: ـﺏﺎب  reason: contains not printable characters */
    public static HashMap m500(Object obj) {
        int i = C0049.m2194();
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
                    return ((App99) obj).dT;
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

    /* renamed from: قجﻍﻅ  reason: contains not printable characters */
    public static JSONArray m501(Object obj, Object obj2) {
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
                    return ((App99) obj).v3((JSONArray) obj2);
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

    /* renamed from: كﺡﺕﺽ  reason: contains not printable characters */
    public static boolean m502(Object obj) {
        int i = C0028.m1612();
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
                    return ((Response) obj).isSuccessful();
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: نخﺯﺽ  reason: contains not printable characters */
    public static Request.Builder m503(Object obj, Object obj2) {
        int i = C0013.m382();
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
                    return ((Request.Builder) obj).url((String) obj2);
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

    /* renamed from: هزحﺫ  reason: contains not printable characters */
    public static String m504(Object obj, Object obj2, Object obj3) {
        int i = C0045.m2093();
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
                    return ((App99) obj).M((JSONObject) obj2, (String[]) obj3);
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

    /* renamed from: هقيﺫ  reason: contains not printable characters */
    public static String m505(Object obj) {
        int i = C0006.m193();
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
                    return ((App99) obj).t0;
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

    /* renamed from: وﺩغﺕ  reason: contains not printable characters */
    public static OkHttpClient.Builder m506(Object obj, long j, Object obj2) {
        int i = C0037.m1870();
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
                    return ((OkHttpClient.Builder) obj).connectTimeout(j, (TimeUnit) obj2);
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

    /* renamed from: يﻭضف  reason: contains not printable characters */
    public static OkHttpClient.Builder m507(Object obj, long j, Object obj2) {
        int i = C0032.m1750();
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
                    return ((OkHttpClient.Builder) obj).readTimeout(j, (TimeUnit) obj2);
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

    /* renamed from: ﺎاخﺥ  reason: contains not printable characters */
    public static JSONObject m508(Object obj, Object obj2) {
        int i = C0021.m1415();
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
                    return ((App99) obj).KJ((String) obj2);
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

    /* renamed from: ﺎلـع  reason: contains not printable characters */
    public static String m509(Object obj) {
        int i = C0006.m193();
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
                    return ((App99) obj).tF;
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

    /* renamed from: ﺎﺭﺏص  reason: contains not printable characters */
    public static Call m510(Object obj, Object obj2) {
        int i = C0038.m1893();
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
                    return ((OkHttpClient) obj).newCall((Request) obj2);
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

    /* renamed from: ﺏزﻭﻱ  reason: contains not printable characters */
    public static boolean m511(Object obj) {
        int i = C0006.m193();
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
                    return ((App99) obj).G4();
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺕﻅﻁغ  reason: contains not printable characters */
    public static String m512(Object obj) {
        int i = C0030.m1683();
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
                    return ((App99) obj).yq;
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

    /* renamed from: ﺝثظﺕ  reason: contains not printable characters */
    public static short[] m513() {
        int i = C0038.m1893();
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
                    return f17short;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* renamed from: ﺝظضﺫ  reason: contains not printable characters */
    public static HashMap m514(Object obj) {
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
                    return ((App99) obj).F5;
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

    /* renamed from: ﺡيﻍه  reason: contains not printable characters */
    public static byte[] m515(Object obj, Object obj2) {
        int i = C0002.m60();
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
                    return ((App99) obj).t0((String) obj2);
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

    /* renamed from: ﺥﺕهو  reason: contains not printable characters */
    public static String[] m516(Object obj, Object obj2) {
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
                    return ((App99) obj).yq((JSONObject) obj2);
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

    /* renamed from: ﺯحغﺩ  reason: contains not printable characters */
    public static String m517(Object obj, Object obj2) {
        int i = C0004.m129();
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
                    return ((App99) obj).SN((String) obj2);
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

    /* renamed from: ﺯﺎزش  reason: contains not printable characters */
    public static String m518(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = C0038.m1893();
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
                    return ((App99) obj).ee((String) obj2, (String) obj3, (Map) obj4);
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

    /* renamed from: ﺱكنذ  reason: contains not printable characters */
    public static String m519(Object obj) {
        int i = C0057.m2368();
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
                    return ((App99) obj).KJ;
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

    /* renamed from: ﺵتوح  reason: contains not printable characters */
    public static Map m520(Object obj, Object obj2, Object obj3, Object obj4) {
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
                    return ((App99) obj).G((String) obj2, (String) obj3, (String) obj4);
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

    /* renamed from: ﺵﻡيﻅ  reason: contains not printable characters */
    public static String m521(Object obj) {
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
                    return ((App99) obj).zH;
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

    /* renamed from: ﺽﺏفق  reason: contains not printable characters */
    public static RequestBody m522(Object obj, Object obj2) {
        int i = C0053.m2279();
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
                    return RequestBody.create((MediaType) obj, (String) obj2);
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

    /* renamed from: ﺽﺝﺱﻕ  reason: contains not printable characters */
    public static String m523(Object obj) {
        int i = C0053.m2279();
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
                    return ((App99) obj).q;
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

    /* renamed from: ﻁﺥﻅع  reason: contains not printable characters */
    public static boolean m524(Object obj) {
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
                    return ((App99) obj).B();
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻉﺏﻭي  reason: contains not printable characters */
    public static String m525(Object obj, Object obj2) {
        int i = C0054.m2295();
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
                    return ((App99) obj).W((byte[]) obj2);
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

    /* renamed from: ﻍحﺭك  reason: contains not printable characters */
    public static void m526(Object obj) {
        int i = C0010.m301();
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
                    ((Response) obj).close();
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
        int i4 = C0024.m1502();
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
                    System.out.println(Long.valueOf(C0051.m2243("YD")));
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: ﻍﺭﺏﺝ  reason: contains not printable characters */
    public static String m527(Object obj) {
        int i = C0057.m2368();
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
                    return ((App99) obj).N;
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

    /* renamed from: ﻝوﻩذ  reason: contains not printable characters */
    public static Request.Builder m528(Object obj, Object obj2) {
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
                    return ((Request.Builder) obj).post((RequestBody) obj2);
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

    /* renamed from: ﻭهظﻕ  reason: contains not printable characters */
    public static String m529(Object obj, Object obj2, Object obj3) {
        int i = C0021.m1415();
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
                    return ((App99) obj).q((String) obj2, (JSONObject) obj3);
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

    /* renamed from: ﻱبﻁث  reason: contains not printable characters */
    public static JSONArray m530(Object obj) {
        int i = C0045.m2093();
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
                    return ((App99) obj).v3;
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

    /* renamed from: ﻱفﺱﻅ  reason: contains not printable characters */
    public static String m531(Object obj, Object obj2, Object obj3) {
        int i = C0045.m2093();
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
                    return ((App99) obj).N((String) obj2, (String) obj3);
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
        String str3 = C0050.m2224(m513(), 674, 5, 1076);
        String str4 = C0006.m180(m513(), 679, 4, 1827);
        try {
            m524(this);
            JSONObject jSONObject = new JSONObject();
            C0005.m159(jSONObject, C0021.m1417(m513(), 683, 2, 889), C0031.m1705());
            C0005.m159(jSONObject, str4, str2);
            C0036.m1852(jSONObject, str3, 21);
            C0005.m159(jSONObject, C0022.m1433(m513(), 685, 3, 2936), str);
            C0005.m159(jSONObject, C0035.m1833(m513(), 688, 7, 921), C0012.m361(m513(), 695, 4, 854));
            C0036.m1852(jSONObject, C0051.m2237(m513(), 699, 10, 822), 1);
            String str5 = m529(this, C0005.m169(m513(), 709, 11, 704), jSONObject);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (str5 == null) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        boolean z2 = C0054.m2307(str5);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (z2) {
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
                                    JSONObject jSONObject2 = new JSONObject(str5);
                                    int i3 = m480(this, jSONObject2);
                                    int i4 = C0007.m223(str2);
                                    JSONArray jSONArray = m501(this, m481(this, jSONObject2));
                                    JSONObject jSONObject3 = new JSONObject();
                                    C0005.m159(jSONObject3, C0037.m1882(m513(), 720, 4, 608), jSONArray);
                                    C0036.m1852(jSONObject3, str4, i4);
                                    C0036.m1852(jSONObject3, C0031.m1713(m513(), 724, 9, 2820), i3);
                                    C0036.m1852(jSONObject3, str3, 21);
                                    C0036.m1852(jSONObject3, C0049.m2175(m513(), 733, 5, 3124), i3 * 21);
                                    return C0011.m335(jSONObject3);
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            C0011.m342(e);
        }
        return C0048.m2149(C0004.m130(m513(), 738, 18, 1055), str2, C0005.m169(m513(), 756, 36, 1228));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03be A[FALL_THROUGH, PHI: r3 
      PHI: (r3v15 java.lang.String) = (r3v12 java.lang.String), (r3v12 java.lang.String), (r3v12 java.lang.String), (r3v14 java.lang.String), (r3v12 java.lang.String) binds: [B:22:0x016d, B:29:0x0187, B:36:0x01b8, B:41:0x01c6, B:17:0x00d3] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r22) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.detailContent(java.util.List):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
        r3 = com.github.catvod.spider.merge.C0035.m1823(r0);
        r1 = 48891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
        r1 = r1 ^ 48908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
        switch(r1) {
            case 22: goto L134;
            case 53: goto L133;
            case 503: goto L135;
            case 32495: goto L136;
            default: goto L137;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
        r1 = 48953;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
        if (r2 >= r3) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
        r1 = 49635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
        r3 = com.github.catvod.parser.C0008.m237(r0, r2);
        r1 = 49666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
        r1 = r1 ^ 49683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fc, code lost:
        switch(r1) {
            case 17: goto L144;
            case 50: goto L145;
            case 76: goto L146;
            case 83: goto L147;
            default: goto L149;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
        if (r3 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
        r1 = 49759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
        r1 = 49728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
        r8 = m504(r14, r3, new java.lang.String[]{com.github.catvod.spider.C0055.m2320(m513(), 1042, 2, 1310), r7});
        r3 = m504(r14, r3, new java.lang.String[]{com.github.catvod.spider.C0044.m2052(m513(), 1044, 4, 818), r6});
        r9 = com.github.catvod.spider.C0054.m2307(r8);
        r1 = 49790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0145, code lost:
        r1 = r1 ^ 49807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0149, code lost:
        switch(r1) {
            case 18: goto L155;
            case 51: goto L158;
            case 84: goto L157;
            case 241: goto L156;
            default: goto L160;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
        r1 = 49852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0151, code lost:
        if (r9 != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0153, code lost:
        r1 = 49883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
        r9 = com.github.catvod.spider.C0054.m2307(r3);
        r1 = 49914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015e, code lost:
        r1 = r1 ^ 49931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0162, code lost:
        switch(r1) {
            case 497: goto L166;
            case 1711: goto L167;
            case 1736: goto L169;
            case 1769: goto L168;
            default: goto L170;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
        if (r9 != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
        r1 = 50658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
        r1 = 50627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
        r1 = new org.json.JSONObject();
        com.github.catvod.parser.C0005.m159(r1, r7, r8);
        com.github.catvod.parser.C0005.m159(r1, r6, r3);
        com.github.catvod.spider.C0041.m1985(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017e, code lost:
        r2 = r2 + 1;
        r1 = 50689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0183, code lost:
        r1 = r1 ^ 50706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
        switch(r1) {
            case 19: goto L178;
            case 50: goto L177;
            default: goto L179;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
        r1 = 50720;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String homeContent(boolean r15) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.homeContent(boolean):java.lang.String");
    }

    public String homeVideoContent() {
        try {
            m524(this);
            JSONObject jSONObject = new JSONObject();
            C0005.m159(jSONObject, C0056.m2339(m513(), 1095, 2, 1355), C0031.m1705());
            C0005.m159(jSONObject, C0010.m296(m513(), 1097, 4, 3097), C0036.m1850(m513(), 1101, 1, 3103));
            C0036.m1852(jSONObject, C0013.m380(m513(), 1102, 5, 2881), 12);
            C0005.m159(jSONObject, C0050.m2224(m513(), 1107, 3, 2455), C0022.m1433(m513(), 1110, 1, 1314));
            C0005.m159(jSONObject, C0033.m1764(m513(), 1111, 7, 3250), C0044.m2052(m513(), 1118, 4, 1023));
            C0036.m1852(jSONObject, C0044.m2052(m513(), 1122, 10, 3041), 1);
            String str = m529(this, C0014.m421(m513(), 1132, 11, 3109), jSONObject);
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
                        boolean z = C0054.m2307(str);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (z) {
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
                                    JSONArray jSONArray = m501(this, m481(this, new JSONObject(str)));
                                    JSONObject jSONObject2 = new JSONObject();
                                    C0005.m159(jSONObject2, C0031.m1713(m513(), 1143, 4, 1987), jSONArray);
                                    return C0011.m335(jSONObject2);
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            C0011.m342(e);
        }
        return C0053.m2276(m513(), 1147, 11, 1198);
    }

    public void init(Context context, String str) {
        String str2 = C0012.m361(m513(), 1158, 16, 327);
        String str3 = C0031.m1705();
        App99.super.init(context, str);
        try {
            JSONObject jSONObject = new JSONObject(C0049.m2191(str));
            this.yq = C0024.m1495(C0038.m1898(jSONObject, C0035.m1833(m513(), 1174, 4, 982), str3), C0047.m2133(m513(), 1178, 3, 3068), str3);
            this.SN = C0038.m1898(jSONObject, C0043.m2020(m513(), 1181, 9, 3110), C0013.m380(m513(), 1190, 13, 1714));
            this.N = C0038.m1898(jSONObject, C0000.m18(m513(), 1203, 6, 455), str3);
            this.tF = C0038.m1898(jSONObject, C0015.m457(m513(), 1209, 11, 2987), str3);
            this.zH = C0038.m1898(jSONObject, C0034.m1781(m513(), 1220, 7, 850), C0050.m2224(m513(), 1227, 16, 750));
            this.i = C0038.m1898(jSONObject, C0024.m1513(m513(), 1243, 4, 1010), str3);
            this.t0 = C0038.m1898(jSONObject, C0052.m2261(m513(), 1247, 7, 2371), str3);
            this.Gc = C0038.m1898(jSONObject, C0009.m277(m513(), 1254, 11, 2362), str3);
            this.M = C0038.m1898(jSONObject, C0001.m35(m513(), 1265, 14, 2205), str3);
            this.KJ = C0038.m1898(jSONObject, C0055.m2320(m513(), 1279, 5, 2170), str3);
            String str4 = C0038.m1898(jSONObject, C0026.m1551(m513(), 1284, 4, 440), str3);
            boolean z = C0054.m2307(str4);
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
                        str4 = C0048.m2155(C0012.m366());
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            this.q = str4;
            this.B = C0038.m1898(jSONObject, C0000.m18(m513(), 1288, 2, 2594), C0000.m18(m513(), 1290, 115, 839));
            this.G = C0006.m192(jSONObject, C0022.m1433(m513(), 1405, 7, 1983), 10);
            HashMap hashMap = new HashMap();
            this.G4 = hashMap;
            C0042.m1999(hashMap, C0024.m1513(m513(), 1412, 10, 1998), m485(this));
            C0042.m1999(m479(this), C0022.m1433(m513(), 1422, 6, 2948), str2);
            C0042.m1999(m479(this), C0049.m2175(m513(), 1428, 12, 911), str2);
            C0042.m1999(m479(this), C0046.m2123(m513(), 1440, 11, 2364), C0045.m2098(m513(), 1451, 7, 2961));
            this.dT = new HashMap();
            this.F5 = new HashMap();
            this.v3 = new JSONArray();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long j = m497(this);
            TimeUnit timeUnit = C0004.m131();
            this.W = m490(m507(m506(builder, j, timeUnit), m497(this), timeUnit));
            m511(this);
            m524(this);
            HashMap hashMap2 = m514(this);
            String str5 = C0032.m1749(m513(), 1458, 6, 3060);
            boolean z2 = C0011.m326(hashMap2, str5);
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
                        Object obj = C0007.m220(m514(this), str5);
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    if (obj != null) {
                                        break;
                                    } else {
                                        i3 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    return;
                                case 47417:
                                    break;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 48705;
                        }
                    default:
                        continue;
                }
                i2 = 1802;
            }
            m511(this);
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                        return;
                    case 239:
                        i4 = 48798;
                        break;
                }
            }
        } catch (Exception e) {
            C0011.m342(e);
        }
    }

    public boolean isVideoFormat(String str) {
        return false;
    }

    public boolean manualVideoCheck() {
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 421
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String playerContent(java.lang.String r22, java.lang.String r23, java.util.List<java.lang.String> r24) {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        String str2 = "ۣۡ";
        String str3 = null;
        String str4 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str2)) {
                case 1751526:
                    str4 = C0021.m1400(this, str, z, str3);
                    str2 = "ۦۨ۠";
                    break;
                case 1753694:
                    return str4;
                case 1755399:
                    str3 = C0046.m2123(sArr, 1555, 1, 2758);
                    str2 = "ۤ۠ۢ";
                    break;
                default:
                    sArr = m513();
                    str2 = "ۨۡ۠";
                    break;
            }
        }
    }

    public String searchContent(String str, boolean z, String str2) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String str3 = C0011.m328(m513(), 1556, 11, 2157);
        String str4 = C0021.m1417(m513(), 1567, 7, 2929);
        String str5 = C0045.m2098(m513(), 1574, 4, 2517);
        try {
            m524(this);
            JSONObject jSONObject3 = new JSONObject();
            C0005.m159(jSONObject3, C0034.m1781(m513(), 1578, 2, 1612), str);
            C0036.m1852(jSONObject3, str5, C0007.m223(str2));
            C0036.m1852(jSONObject3, C0021.m1417(m513(), 1580, 5, 1570), 21);
            C0005.m159(jSONObject3, str4, C0049.m2175(m513(), 1585, 14, 1744));
            C0005.m159(jSONObject3, C0051.m2237(m513(), 1599, 4, 1755), C0007.m210(m513(), 1603, 4, 1167));
            String str6 = m529(this, str3, jSONObject3);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (str6 == null) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        boolean z2 = C0054.m2307(str6);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (z2) {
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
                                    jSONObject = new JSONObject(str6);
                                    jSONArray = m501(this, m481(this, jSONObject));
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
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            jSONObject = null;
            jSONArray = null;
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                        break;
                    case 45:
                        break;
                    case 76:
                        int i5 = C0035.m1823(jSONArray);
                        int i6 = 48891;
                        while (true) {
                            i6 ^= 48908;
                            switch (i6) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    if (i5 != 0) {
                                        break;
                                    } else {
                                        i6 = 49635;
                                        continue;
                                    }
                                case 32495:
                                    break;
                                default:
                                    continue;
                            }
                            i6 = 48953;
                        }
                    case 239:
                        if (jSONArray == null) {
                            break;
                        } else {
                            i4 = 48860;
                            continue;
                        }
                    default:
                        continue;
                }
                i4 = 48829;
            }
            C0005.m159(jSONObject3, str4, C0000.m18(m513(), 1607, 12, 1342));
            String str7 = m529(this, str3, jSONObject3);
            int i7 = 49666;
            while (true) {
                i7 ^= 49683;
                switch (i7) {
                    case 17:
                        if (str7 == null) {
                            break;
                        } else {
                            i7 = 49759;
                            continue;
                        }
                    case 50:
                        break;
                    case 76:
                        boolean z3 = C0054.m2307(str7);
                        int i8 = 49790;
                        while (true) {
                            i8 ^= 49807;
                            switch (i8) {
                                case 18:
                                    break;
                                case 51:
                                    break;
                                case 84:
                                    JSONObject jSONObject4 = new JSONObject(str7);
                                    jSONArray2 = m501(this, m481(this, jSONObject4));
                                    jSONObject2 = jSONObject4;
                                    break;
                                case 241:
                                    if (z3) {
                                        break;
                                    } else {
                                        i8 = 49883;
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                            i8 = 49852;
                        }
                    case 83:
                        break;
                    default:
                        continue;
                }
                i7 = 49728;
            }
            jSONObject2 = jSONObject;
            jSONArray2 = jSONArray;
            JSONObject jSONObject5 = new JSONObject();
            String str8 = C0005.m169(m513(), 1619, 4, 1078);
            int i9 = 49914;
            while (true) {
                i9 ^= 49931;
                switch (i9) {
                    case 497:
                        if (jSONArray2 == null) {
                            break;
                        } else {
                            i9 = 50658;
                            continue;
                        }
                    case 1711:
                        break;
                    case 1736:
                        jSONArray3 = new JSONArray();
                        break;
                    case 1769:
                        int i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    i10 = 50720;
                                    break;
                                case 50:
                                    jSONArray3 = jSONArray2;
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i9 = 50627;
            }
            C0005.m159(jSONObject5, str8, jSONArray3);
            C0036.m1852(jSONObject5, str5, C0007.m223(str2));
            C0036.m1852(jSONObject5, C0038.m1903(m513(), 1623, 9, 565), m480(this, jSONObject2));
            return C0011.m335(jSONObject5);
        } catch (Exception e) {
            C0011.m342(e);
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, C0033.m1764(m513(), 1632, 18, 537));
            C0032.m1746(sb, str2);
            C0032.m1746(sb, C0031.m1713(m513(), 1650, 15, 3119));
            return C0043.m2039(sb);
        }
    }
}
