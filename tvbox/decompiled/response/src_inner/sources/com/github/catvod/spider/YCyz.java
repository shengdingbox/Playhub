package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class YCyz extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f56short = {1048, 1028, 1028, 1024, 1027, 1098, 1119, 1119, 1030, 1118, 1032, 1052, 1088, 1089, 1118, 1045, 1029, 1118, 1043, 1043, 1119, 2707, 2763, 2717, 2697, 2773, 2772, 2763, 2688, 2704, 2763, 2694, 2694, 596, 584, 584, 588, 591, 518, 531, 531, 586, 595, 600, 530, 580, 592, 524, 525, 530, 593, 601, 531, 927, 940, 931, 938, 936, 2692, 2719, 2706, 2691, 2709, 2779, 2774, 2763, 2774, 2297, 2261, 2260, 2254, 2271, 2260, 2254, 2199, 2286, 2243, 2250, 2271, 586, 597, 600, 601, 595, 531, 593, 588, 520, 409, 2619, 2589, 2571, 2588, 2627, 2607, 2569, 2571, 2560, 2586, 837, 871, 882, 865, 868, 868, 873, 807, 829, 806, 824, 808, 800, 837, 873, 875, 865, 870, 892, 871, 891, 864, 819, 808, 833, 870, 892, 877, 868, 808, 837, 873, 875, 808, 839, 859, 808, 848, 808, 825, 824, 855, 825, 829, 855, 831, 801, 808, 841, 888, 888, 868, 877, 863, 877, 874, 835, 865, 892, 807, 829, 827, 831, 806, 827, 830, 808, 800, 835, 832, 860, 837, 836, 804, 808, 868, 865, 867, 877, 808, 847, 877, 875, 867, 871, 801, 808, 843, 864, 890, 871, 869, 877, 807, 825, 828, 816, 806, 824, 806, 824, 806, 824, 808, 859, 873, 878, 873, 890, 865, 807, 829, 827, 831, 806, 827, 830, 1934, 1929, 1943, 2124, 2127, 2119, 2122, 2139, 3234, 3251, 3251, 3247, 3242, 3232, 3234, 3255, 3242, 3244, 3245, 3308, 3253, 3245, 3239, 3309, 3234, 3251, 3251, 3247, 3238, 3309, 3246, 3251, 3238, 3236, 3222, 3217, 3215, 1747, 1746, 1728, 1707, 1726, 569, 615, 633, 624, 1751, 1741, 1744, 1729, 2791, 2749, 2746, 2841, 536, 516, 516, 512, 2410, 2427, 2406, 2410, 2353, 2414, 2418, 2431, 2423, 2416, 2382, 2420, 2375, 2397, 2378, 2377, 2309, 2322, 2375, 2395, 2370, 2418, 1078, 1068, 1083, 1080, 2361, 2365, 2359, 2315, 2356, 2353, 2340, 2353, 2429, 2339, 2338, 2355, 2317, 1288, 1293, 1304, 1293, 1345, 1311, 1310, 1295, 2367, 2354, 2349, 2304, 2360, 2359, 2362, 2344, 2344, 2406, 2360, 2362, 2345, 2367, 2422, 2354, 2357, 2365, 2356, 2310, 2427, 2405, 2427, 2355, 2415, 602, 599, 584, 613, 605, 594, 607, 589, 589, 515, 605, 607, 588, 602, 531, 595, 603, 586, 607, 611, 542, 512, 542, 589, 590, 607, 592, 482, 495, 486, 499, 663, 713, 655, 706, 2314, 2331, 2331, 2311, 2306, 2312, 2314, 2335, 2306, 2308, 2309, 2372, 2333, 2309, 2319, 2373, 2314, 2331, 2331, 2311, 2318, 2373, 2310, 2331, 2318, 2316, 2334, 2329, 2311, 2705, 2743, 2721, 2742, 2793, 2693, 2723, 2721, 2730, 2736, 1772, 1742, 1755, 1736, 1741, 1741, 1728, 1678, 1684, 1679, 1681, 1665, 1673, 1785, 1680, 1680, 1690, 1665, 1773, 1736, 1743, 1748, 1753, 1665, 1728, 1728, 1747, 1730, 1737, 1687, 1685, 1672, 1665, 1760, 1745, 1745, 1741, 1732, 1782, 1732, 1731, 1770, 1736, 1749, 1678, 1684, 1682, 1686, 1679, 1682, 1687, 1665, 1673, 1770, 1769, 1781, 1772, 1773, 1677, 1665, 1741, 1736, 1738, 1732, 1665, 1766, 1732, 1730, 1738, 1742, 1672, 1665, 1762, 1737, 1747, 1742, 1740, 1732, 1678, 1680, 1685, 1689, 1679, 1681, 1679, 1681, 1679, 1681, 1665, 1778, 1728, 1735, 1728, 1747, 1736, 1678, 1684, 1682, 1686, 1679, 1682, 1687, 658, 687, 692, 698, 692, 691, 2494, 2494, 2494, 2494, 2494, 1086, 1064, 1081, 1120, 1070, 1058, 1058, 1062, 1060, 1064, 2328, 1665, 1685, 1672, 1694, 1695, 1672, 1671, 1086, 1078, 1080, 3178, 2421, 2895, 2835, 2895, 407, 1364, 1357, 1311, 1298, 1307, 1294, 1366, 2948, 2956, 2946, 3024, 2728, 2737, 2806, 2789, 2802, 2806, 2730, 2796, 2806, 2789, 2802, 2806, 2794, 2737, 2798, 2802, 2806, 2789, 2730, 2796, 2798, 2802, 2806, 2789, 2794, 2737, 2808, 2789, 2803, 2802, 2789, 2730, 2796, 2808, 2789, 2803, 2802, 2789, 2794, 2068, 2131, 2112, 2135, 2131, 2063, 2121, 2131, 2112, 2135, 2131, 2127, 2068, 2123, 2135, 2131, 2112, 2063, 2121, 2123, 2135, 2131, 2112, 2127, 2068, 2141, 2112, 2134, 2135, 2112, 2063, 2121, 2141, 2112, 2134, 2135, 2112, 2127, 1243, 2336, 2823, 2826, 2826, 2552, 2530, 2545, 2534, 2530, 2558, 1043, 1108, 1095, 1104, 1108, 1032, 1102, 1108, 1095, 1104, 1108, 1096, 888, 890, 870, 866, 881, 894, 1054, 1089, 1117, 1113, 1098, 1029, 1091, 1089, 1117, 1113, 1098, 1093, 1011, 1441, 1452, 1452, 1519, 3143, 3166, 3095, 3082, 3100, 3101, 3082, 3141, 3144, 2751, 2808, 2795, 2812, 2808, 2724, 2150, 2095, 2098, 2084, 2085, 2098, 2173, 2160, 1240, 2036, 2041, 2022, 1995, 2035, 2044, 2033, 2019, 2019, 1965, 2024, 2044, 1981, 2045, 2047, 2022, 2041, 2037, 2019, 1981, 2039, 2018, 2041, 2036, 1981, 1960, 1997, 1968, 2036, 2041, 2022, 1982, 2045, 2047, 2022, 2041, 2037, 1981, 2035, 2033, 2018, 2036, 3054, 3043, 3068, 3025, 3049, 3046, 3051, 3065, 3065, 2999, 3043, 3044, 3052, 3045, 2983, 3046, 3043, 3065, 3070, 3031, 2986, 3054, 3043, 3068, 2980, 3043, 3044, 3052, 3045, 2983, 3043, 3070, 3055, 3047, 1417, 1418, 1435, 1428, 1492, 1427, 1428, 1436, 1429, 1495, 1430, 1435, 1432, 1439, 1430, 20481, 25833, 746, 2176, 31489, 22128, 20464, 28383, 28863, 23375, 2388, 2393, 2374, 2411, 2387, 2396, 2385, 2371, 2371, 2317, 2388, 2389, 2371, 2387, 2413, 2285, 2272, 2303, 2258, 2282, 2277, 2280, 2298, 2298, 2228, 2297, 2277, 2280, 2288, 2212, 2277, 2272, 2298, 2301, 2260, 2217, 2280, 2258, 2273, 2299, 2284, 2287, 2211, 2228, 2273, 2301, 2276, 2260, 1377, 1403, 1388, 1391, 3002, -29778, 22764, 2221, 29435, 22719, 2948, 31880, -32645, 23514, 2829, 2847, 17681, 24001, 21019, -25222, 22691, -26686, 21475, 2389, 2340, 2307, 2309, 2314, 2307, 2320, 2309, 2317, 2318, 2321, 27509, 22186, 22333, 886, 775, 815, 806, 809, 813, 818, -27132, 21386, 391, 502, 475, 467, 479, 476, 451, 30784, 21929, 400, 481, 467, 456, 459, 468, 26340, 20838, 332, 317, 281, 274, 275, 282, 277, 264, 284, 22786, 32401, 2479, 2526, 2532, 2545, 2544, 2553, 2535, 2551, 31322, -31012, 2794, 2740, 2802, 2751, 2776, 2741, 990, 896, 966, 907, 393, 398, 400, 463, 883, 2818, 2837, 2822, 2900, 2820, 2845, 2832, 2900, 2889, 3042, 3012, 3026, 3013, 2970, 3062, 3024, 3026, 3033, 3011, 2796, 2766, 2779, 2760, 2765, 2765, 2752, 2702, 2708, 2703, 2705, 2689, 2697, 2796, 2752, 
    2754, 2760, 2767, 2773, 2766, 2770, 2761, 2714, 2689, 2792, 2767, 2773, 2756, 2765, 2689, 2796, 2752, 2754, 2689, 2798, 2802, 2689, 2809, 2689, 2704, 2705, 2814, 2704, 2708, 2814, 2710, 2696, 2689, 2784, 2769, 2769, 2765, 2756, 2806, 2756, 2755, 2794, 2760, 2773, 2702, 2708, 2706, 2710, 2703, 2706, 2711, 2689, 2697, 2794, 2793, 2805, 2796, 2797, 2701, 2689, 2765, 2760, 2762, 2756, 2689, 2790, 2756, 2754, 2762, 2766, 2696, 2689, 2786, 2761, 2771, 2766, 2764, 2756, 2702, 2704, 2709, 2713, 2703, 2705, 2703, 2705, 2703, 2705, 2689, 2802, 2752, 2759, 2752, 2771, 2760, 2702, 2708, 2706, 2710, 2703, 2706, 2711, 1708, 1724, 1709, 1718, 1711, 1707, 503, 480, 499, 417, 501, 488, 492, 484, 2863, 3182, 2468, 2465, 2470, 2477, 2491, 2551, 2492, 2549, 1148, 1065, 1085, 1127, 2551, 2465, 2488, 2485, 2540, 1538, 1543, 1554, 1543, 508, 950, 950, 950, 1007, 931, 933, 932, 1013, 1007, 930, 930, 2929, 2940, 2936, 2941, 2940, 2923, 2550, 2538, 2535, 2559, 2515, 2548, 2538, 2275, 2278, 2281, 2282, 2278, 2284, 2290, 657, 640, 659, 658, 644, 1309, 1306, 1284, 630, 565, 619, 557, 608, 2495, 2552, 2559, 2468, 2532, 2477, 2476, 2479, 2472, 2492, 2469, 2493, 2994, 3049, 3042, 2992, 3040, 3006, 3064, 2997, 2987, 3054, 3070, 3069, 2992, 3028, 3022, 3060, 3063, 2987, 3070, 3044, 3065, 3048, 2992, 3235, 3312, 3319, 3305, 3256, 1060, 1151, 1140, 1062, 1090, 1112, 1122, 1121, 1085, 1135, 1122, 1131, 1150, 1062, 1142, 1064, 1134, 1059, 1663, 1659, 1632, 1636, 1642, 1633, 1570, 1570, 1570, 1582, 1638, 1646, 1637, 1582, 1686, 2744, 2732, 999, 1012, 995, 1016, 1015, 1000, 978, 1022, 1013, 1012, 1091, 1028, 1027, 1112, 1048, 1105, 1104, 1107, 1108, 1088, 1113, 1089, 1051, 1089, 1116, 1118, 1089, 1114, 1118, 1110, 1105, 1115, 1051, 1110, 1114, 1112, 2293, 2226, 2229, 2286, 2222, 2279, 2278, 2277, 2274, 2294, 2287, 2295, 2221, 2274, 2280, 2274, 2286, 2274, 2282, 2297, 2278, 2279, 2221, 2285, 2278, 2295, 1521, 1514, 1526, 1448, 1508, 1513, 1516, 1526, 1506, 1448, 1523, 1448, 1461, 1461, 1461, 1461, 1562, 1537, 1565, 1603, 1539, 1551, 1538, 1543, 1560, 1551, 1603, 1537, 1603, 1630, 1630, 1630, 1630, 1603, 1563, 1565, 3077, 3150, 3097, 3089, 2693, 2766, 2719, 2719, 2183, 2189, 2266, 2269, 2246, 2184, 2186, 2203, 2184, 2206, 2207, 2245, 2189, 2186, 2184, 2190, 2206, 2190, 2191, 2178, 2207, 2180, 2201, 2205, 2245, 2184, 2180, 2182, 2281, 2275, 2228, 2227, 2216, 2294, 2272, 2278, 2294, 2273, 2286, 2219, 2279, 2284, 2289, 2294, 2294, 2272, 2278, 2219, 2278, 2282, 2280, 2474, 2464, 2551, 2544, 2539, 2466, 2471, 2482, 2471, 2536, 2468, 2495, 2482, 2467, 2486, 2474, 2483, 2485, 2469, 2466, 2472, 2536, 2469, 2473, 2475, 3154, 3160, 3087, 3080, 3091, 3160, 3162, 3155, 3088, 3160, 3162, 3155, 3159, 3152, 3161, 3149, 3088, 3165, 3153, 3155, 3115, 3105, 3190, 3185, 3178, 3108, 3108, 3178, 3106, 3121, 3106, 3125, 3127, 3119, 3112, 3123, 3112, 3177, 3105, 3110, 3108, 3106, 3122, 3115, 3121, 3177, 3108, 3112, 3114, 3010, 3016, 2975, 2968, 2947, 3016, 3023, 3021, 3019, 3035, 3010, 3032, 2944, 3021, 3009, 3011, 3265, 3275, 3228, 3227, 3200, 3274, 3272, 3278, 3270, 3266, 3278, 3273, 3267, 3200, 3266, 3275, 3275, 3265, 3268, 3267, 3272, 3203, 3274, 3200, 3293, 3200, 3294, 3289, 3276, 3289, 3268, 3278, 3203, 3278, 3266, 3264, 1118, 1090, 1090, 1094, 1093, 1036, 1049, 1049, 1094, 1031, 1024, 1051, 1118, 1107, 1092, 1111, 1051, 1093, 1119, 1105, 1112, 1051, 1088, 1111, 1048, 1119, 1108, 1103, 1090, 1107, 1119, 1115, 1105, 1048, 1109, 1113, 1115, 1049, 1113, 1108, 1116, 1049, 1969, 1965, 1965, 1961, 2019, 2038, 2038, 1973, 1983, 2030, 2030, 2036, 1982, 1980, 1978, 1970, 1974, 1978, 1981, 1975, 2039, 1979, 1952, 1965, 1980, 1982, 1980, 1978, 1970, 1974, 2036, 1968, 2024, 2017, 1975, 2039, 1978, 1974, 1972, 2038, 1974, 1979, 1971, 2038, 741, 761, 761, 765, 695, 674, 674, 737, 747, 700, 699, 672, 750, 745, 739, 672, 766, 738, 737, 763, 744, 675, 746, 748, 760, 761, 741, 736, 748, 761, 741, 675, 750, 738, 736, 674, 738, 751, 743, 674, 3087, 3091, 3091, 3095, 3165, 3144, 3144, 3076, 3101, 3101, 3102, 3145, 3103, 3081, 3146, 3146, 3082, 3152, 3093, 3155, 3158, 3157, 3078, 3075, 3089, 3077, 3166, 3157, 3085, 3157, 3158, 3092, 3091, 3153, 3154, 3078, 3145, 3091, 3084, 3144, 3077, 3086, 3075, 3086, 3092, 3074, 3078, 3093, 3076, 3087, 3145, 3095, 3087, 3095, 3160, 3088, 3075, 3162, 2480, 2481, 2467, 2504, 2525, 536, 536, 536, 2814, 2791, 2796, 2775, 2810, 2797, 2789, 2793, 2810, 2787, 2811, 3182, 3191, 3196, 3143, 3176, 3185, 3195, 3053, 3060, 3071, 3012, 3061, 3066, 3062, 3070, 2834, 2827, 2816, 2875, 2829, 2816, 2165, 2133, 1184, 1240, 1184, 1240, 1184, 1240, 1570, 1575, 1597, 1594, 2765, 2761, 2783, 2723, 2761, 2767, 2766, 2723, 2780, 2759, 2767, 2783, 2747, 2780, 2797, 2792, 2792, 2789, 2786, 2795, 1825, 1829, 1843};
    private static String t0 = "";
    private JSONObject i;
    private final Random yq = new Random();
    private String SN = C0050.m2224(m1014(), 0, 21, 1136);
    private String N = C0036.m1850(m1014(), 21, 12, 2789);
    private String tF = C0047.m2133(m1014(), 33, 20, 572);
    private String zH = C0031.m1705();

    public YCyz() {
        int i = C0042.m1998();
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
                    System.out.println(Long.valueOf(C0055.m2313("pE7tq6LRWyJJRxUA")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private String N(String str) {
        HashMap hashMap = new HashMap();
        Response response = m1001(str, m1004(this), hashMap, 5);
        String str2 = C0031.m1705();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (response == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    int i2 = m1007(response);
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (i2 != 302) {
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
                                String str3 = C0039.m1925(hashMap);
                                HashMap hashMap2 = m1004(this);
                                C0042.m1999(hashMap2, C0004.m130(m1014(), 53, 5, 973), C0012.m361(m1014(), 58, 9, 2790));
                                Response response2 = m1009(str3, hashMap2, 5);
                                int i4 = m1007(response2);
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            if (i4 == 200) {
                                                break;
                                            } else {
                                                i5 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            return str3;
                                        case 47417:
                                            int i6 = m1007(response2);
                                            int i7 = 48767;
                                            while (true) {
                                                i7 ^= 48784;
                                                switch (i7) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        return str2;
                                                    case 76:
                                                        int i8 = 48891;
                                                        while (true) {
                                                            i8 ^= 48908;
                                                            switch (i8) {
                                                                case 22:
                                                                    return str3;
                                                                case 503:
                                                                    i8 = 48922;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        if (i6 != 206) {
                                                            break;
                                                        } else {
                                                            i7 = 48860;
                                                            continue;
                                                        }
                                                }
                                                i7 = 48829;
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                    i5 = 48705;
                                }
                                break;
                        }
                        i3 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        int i9 = 49666;
        while (true) {
            i9 ^= 49683;
            switch (i9) {
                case 17:
                    if (response == null) {
                        break;
                    } else {
                        i9 = 49759;
                        continue;
                    }
                case 50:
                    break;
                case 76:
                    int i10 = m1007(response);
                    int i11 = 49790;
                    while (true) {
                        i11 ^= 49807;
                        switch (i11) {
                            case 18:
                                break;
                            case 51:
                                break;
                            case 84:
                                int i12 = m1007(response);
                                int i13 = 49914;
                                while (true) {
                                    i13 ^= 49931;
                                    switch (i13) {
                                        case 497:
                                            if (i12 != 206) {
                                                break;
                                            } else {
                                                i13 = 50658;
                                                continue;
                                            }
                                        case 1711:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            break;
                                    }
                                    i13 = 50627;
                                }
                                break;
                            case 241:
                                if (i10 == 200) {
                                    break;
                                } else {
                                    i11 = 49883;
                                    continue;
                                }
                        }
                        i11 = 49852;
                    }
                    boolean z = C0037.m1888(m1006(response, C0000.m18(m1014(), 67, 12, 2234)), C0055.m2320(m1014(), 79, 9, 572));
                    int i14 = 50689;
                    while (true) {
                        i14 ^= 50706;
                        switch (i14) {
                            case 19:
                                if (!z) {
                                    break;
                                } else {
                                    i14 = 50782;
                                    continue;
                                }
                            case 45:
                                break;
                            case 50:
                                break;
                            case 76:
                                return str;
                        }
                        i14 = 50751;
                    }
                    break;
                case 83:
                    break;
            }
            i9 = 49728;
        }
        return str2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 422
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static java.lang.Object[] proxyM3u8(java.util.Map<java.lang.String, java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.YCyz.proxyM3u8(java.util.Map):java.lang.Object[]");
    }

    private List tF(kB kBVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = C0004.m122(kBVar);
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
                        hN hNVar = (hN) C0026.m1556(it);
                        C0003.m107(hNVar);
                        String str2 = C0028.m1621(C0013.m381(C0000.m12(C0013.m380(m1014(), 284, 12, 2351), hNVar), C0020.m1390(m1014(), 296, 4, 1118)), 1);
                        String str3 = C0013.m381(C0000.m12(C0037.m1882(m1014(), 300, 13, 2384), hNVar), C0049.m2175(m1014(), 313, 8, 1388));
                        String str4 = C0022.m1427(C0000.m12(C0010.m296(m1014(), 321, 25, 2395), hNVar));
                        hN hNVar2 = C0000.m12(C0051.m2237(m1014(), 346, 27, 574), hNVar);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = hNVar2 != null ? 1833 : 1802;
                                case 54:
                                case 471:
                                    str = C0031.m1705();
                                    break;
                                case 500:
                                    str = C0022.m1427(hNVar2);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        C0003.m116(arrayList, new ME(str2, str4, str3, str));
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 239:
                                    i4 = 48798;
                            }
                        }
                        break;
                    case 239:
                        return arrayList;
                }
            }
        }
    }

    public static Object[] vod(Map<String, String> map) {
        boolean z = C0022.m1448((String) C0000.m15(map, C0050.m2224(m1014(), 373, 4, 406)), C0020.m1390(m1014(), 377, 4, 762));
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
                    return new Object[]{C0053.m2274(200), C0011.m328(m1014(), 381, 29, 2411), new ByteArrayInputStream(C0051.m2233(m1012()))};
                case 239:
                    return null;
            }
            i = 1678;
        }
    }

    private HashMap<String, String> zH() {
        String str = "ۢ۟ۨ";
        HashMap<String, String> hashMap = null;
        String str2 = null;
        String str3 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56511:
                    str2 = C0051.m2237(sArr, 522, 6, 733);
                    str = "ۥ۠ۦ";
                    break;
                case 1746974:
                    str3 = C0033.m1764(sArr, 410, 10, 2756);
                    str = "ۣۤۥ";
                    break;
                case 1751622:
                    sArr = m1014();
                    str = "ۨۡ۟";
                    break;
                case 1751714:
                    str3 = m1013(this);
                    str = "ۥ۟ۡ";
                    break;
                case 1752455:
                    sArr = m1014();
                    str = "ۦۥ";
                    break;
                case 1752491:
                    C0042.m1999(hashMap, str2, str3);
                    str = "ۨۡۨ";
                    break;
                case 1752670:
                    C0042.m1999(hashMap, str3, str2);
                    str = "ۤۦۤ";
                    break;
                case 1753575:
                    sArr = m1014();
                    str = "۟ۨۧ";
                    break;
                case 1755398:
                    str2 = C0052.m2261(sArr, 420, 102, 1697);
                    str = "ۥۦ۟";
                    break;
                case 1755407:
                    return hashMap;
                default:
                    hashMap = new HashMap<>();
                    str = "ۦۤۥ";
                    break;
            }
        }
    }

    /* renamed from: ثلصك  reason: contains not printable characters */
    public static Response m1001(Object obj, Object obj2, Object obj3, int i) {
        int i2 = C0005.m152();
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
                    return C0068Pe.v3((String) obj, (Map) obj2, (Map) obj3, i);
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

    /* renamed from: خغها  reason: contains not printable characters */
    public static String m1002(Object obj, Object obj2) {
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
                    return ((YCyz) obj).N((String) obj2);
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

    /* renamed from: دﻙاخ  reason: contains not printable characters */
    public static void m1003(Object obj) {
        int i = C0029.m1639();
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

    /* renamed from: سخﺫﺽ  reason: contains not printable characters */
    public static HashMap m1004(Object obj) {
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
                    return ((YCyz) obj).zH();
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

    /* renamed from: طبعﻅ  reason: contains not printable characters */
    public static Random m1005(Object obj) {
        int i = C0015.m447();
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
                    return ((YCyz) obj).yq;
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

    /* renamed from: طﻩجﺕ  reason: contains not printable characters */
    public static String m1006(Object obj, Object obj2) {
        int i = C0040.m1954();
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
                    return ((Response) obj).header((String) obj2);
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

    /* renamed from: ظﺥﻁﺏ  reason: contains not printable characters */
    public static int m1007(Object obj) {
        int i = C0045.m2093();
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
                    return ((Response) obj).code();
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

    /* renamed from: ظﻭعﻝ  reason: contains not printable characters */
    public static String m1008(Object obj) {
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
                    return ((YCyz) obj).tF;
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

    /* renamed from: غتهﺝ  reason: contains not printable characters */
    public static Response m1009(Object obj, Object obj2, int i) {
        int i2 = C0012.m378();
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
                    return C0068Pe.M((String) obj, (Map) obj2, i);
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

    /* renamed from: غﺕﻕف  reason: contains not printable characters */
    public static InputStream m1010(Object obj) {
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
                    return ((ResponseBody) obj).byteStream();
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

    /* renamed from: غﺹصم  reason: contains not printable characters */
    public static List m1011(Object obj, Object obj2) {
        int i = C0056.m2341();
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
                    return ((YCyz) obj).tF((kB) obj2);
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

    /* renamed from: قﺥﻉر  reason: contains not printable characters */
    public static String m1012() {
        int i = C0009.m276();
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
                    return t0;
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

    /* renamed from: قﺩيـ  reason: contains not printable characters */
    public static String m1013(Object obj) {
        int i = C0010.m301();
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
                    return ((YCyz) obj).N;
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

    /* renamed from: نحﻭﻝ  reason: contains not printable characters */
    public static short[] m1014() {
        int i = C0004.m129();
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
                    return f56short;
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

    /* renamed from: ﺫﺹظر  reason: contains not printable characters */
    public static JSONObject m1015(Object obj) {
        int i = C0044.m2051();
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
                    return ((YCyz) obj).i;
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

    /* renamed from: ﺭﺥﺯﻍ  reason: contains not printable characters */
    public static String m1016(Object obj) {
        int i = C0012.m378();
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
                    return ((YCyz) obj).SN();
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

    /* renamed from: ﺹفجﺽ  reason: contains not printable characters */
    public static ResponseBody m1017(Object obj) {
        int i = C0056.m2341();
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

    /* renamed from: ﻁمﻅن  reason: contains not printable characters */
    public static Response m1018(Object obj, Object obj2) {
        int i = C0039.m1918();
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
                    return C0068Pe.Gc((String) obj, (Map) obj2);
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

    /* renamed from: ﻕقوص  reason: contains not printable characters */
    public static void m1019(Object obj) {
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
        int i4 = C0056.m2341();
        int i5 = 1740;
        while (true) {
            i5 ^= 1757;
            switch (i5) {
                case 17:
                    if (i4 < 0) {
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
                    System.out.println(Long.parseLong(C0009.m273("58Lcmf0zrs027kXB")));
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: ﻩﺕﺥﺝ  reason: contains not printable characters */
    public static String m1020(Object obj, Object obj2, Object obj3) {
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
                    return ((YCyz) obj).yq((String) obj2, (String) obj3);
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

    /* renamed from: ﻩﻅبﻉ  reason: contains not printable characters */
    public static String m1021(Object obj) {
        int i = C0030.m1683();
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
                    return ((YCyz) obj).SN;
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

    /* renamed from: ﻭاشﺝ  reason: contains not printable characters */
    public static String m1022(Object obj) {
        int i = C0029.m1639();
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
                    return ((YCyz) obj).zH;
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

    protected final String SN() {
        this.zH = C0031.m1705();
        String str = C0032.m1739(new StringBuilder(), m1021(this), C0023.m1457(m1014(), 528, 5, 2500));
        HashMap hashMap = new HashMap();
        C0004.m141(str, m1004(this), hashMap);
        String str2 = C0003.m86(m1014(), 533, 10, 1101);
        boolean z = C0011.m326(hashMap, str2);
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
                    this.zH = C0011.m339((String) C0035.m1801((List) C0007.m220(hashMap, str2), 0), C0023.m1457(m1014(), 543, 1, 2339))[0];
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        return m1022(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 349
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String categoryContent(java.lang.String r14, java.lang.String r15, boolean r16, java.util.HashMap<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.YCyz.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 403
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String detailContent(java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.YCyz.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        try {
            new JSONObject();
            ArrayList arrayList = new ArrayList();
            C0003.m116(arrayList, new rP(C0013.m380(m1014(), 874, 1, 2205), C0035.m1833(m1014(), 875, 2, 1998)));
            C0003.m116(arrayList, new rP(C0038.m1903(m1014(), 877, 1, 2997), C0047.m2133(m1014(), 878, 3, 2493)));
            C0003.m116(arrayList, new rP(C0050.m2224(m1014(), 881, 6, 2876), C0022.m1433(m1014(), 887, 3, 388)));
            C0003.m116(arrayList, new rP(C0055.m2320(m1014(), 890, 11, 2404), C0052.m2261(m1014(), 901, 3, 1370)));
            C0003.m116(arrayList, new rP(C0022.m1433(m1014(), 904, 7, 839), C0031.m1713(m1014(), 911, 2, 493)));
            C0003.m116(arrayList, new rP(C0042.m2010(m1014(), 913, 7, 438), C0040.m1953(m1014(), 920, 2, 1998)));
            C0003.m116(arrayList, new rP(C0029.m1635(m1014(), 922, 6, 417), C0054.m2301(m1014(), 928, 2, 769)));
            C0003.m116(arrayList, new rP(C0056.m2339(m1014(), 930, 9, 381), C0014.m421(m1014(), 939, 2, 2986)));
            C0003.m116(arrayList, new rP(C0053.m2276(m1014(), 941, 8, 2462), C0030.m1688(m1014(), 949, 2, 1190)));
            m1016(this);
            iX iXVar = new iX();
            C0029.m1651(iXVar, arrayList);
            C0007.m227(iXVar, m1015(this));
            return C0033.m1763(iXVar);
        } catch (Exception e) {
            m1003(e);
            return C0031.m1705();
        }
    }

    public void init(Context context) {
        YCyz.super.init(context);
        try {
            this.i = new JSONObject(C0041.m1977());
        } catch (JSONException e) {
            int i = 1740;
            while (true) {
                i ^= 1757;
                switch (i) {
                    case 17:
                        i = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
        int i2 = C0004.m129();
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
                    System.out.println(Double.valueOf(C0041.m1972("7p3")));
                    return;
                case 239:
                    return;
            }
            i3 = 1678;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 591
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @android.annotation.TargetApi(19)
    public java.lang.String playerContent(java.lang.String r32, java.lang.String r33, java.util.List<java.lang.String> r34) {
        /*
            Method dump skipped, instructions count: 3582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.YCyz.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        String str2 = C0031.m1705();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, C0032.m1749(m1014(), 1668, 58, 3175));
            C0032.m1746(sb, C0009.m260(str, C0028.m1613(m1014(), 1726, 5, 2533)));
            String str3 = C0011.m353(C0043.m2039(sb), C0024.m1520(), 0);
            boolean z2 = C0037.m1888(str3, C0035.m1833(m1014(), 1731, 3, 572));
            String str4 = C0014.m421(m1014(), 1734, 11, 2696);
            String str5 = C0003.m86(m1014(), 1745, 7, 3096);
            String str6 = C0048.m2145(m1014(), 1752, 8, 2971);
            String str7 = C0052.m2261(m1014(), 1760, 6, 2916);
            String str8 = C0051.m2237(m1014(), 1766, 2, 2089);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!z2) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        String[] strArr = C0011.m339(str3, C0053.m2276(m1014(), 1768, 6, 1276));
                        int length = strArr.length;
                        int i2 = 0;
                        while (true) {
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = i2 < length ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        String[] strArr2 = C0011.m339(strArr[i2], str8);
                                        boolean z3 = C0010.m289(strArr2[1]);
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = z3 ? 48736 : 48705;
                                                case 47384:
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    C0005.m159(jSONObject2, str7, strArr2[0]);
                                                    C0005.m159(jSONObject2, str6, strArr2[1]);
                                                    C0005.m159(jSONObject2, str5, strArr2[2]);
                                                    C0005.m159(jSONObject2, str4, strArr2[3]);
                                                    C0041.m1985(jSONArray, jSONObject2);
                                                    break;
                                                case 47417:
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
                                                case 47483:
                                            }
                                        }
                                        i2++;
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
                                }
                            }
                        }
                        break;
                    case 239:
                        String[] strArr3 = C0011.m339(str3, str8);
                        boolean z4 = C0010.m289(strArr3[1]);
                        int i7 = 49666;
                        while (true) {
                            i7 ^= 49683;
                            switch (i7) {
                                case 17:
                                    if (!z4) {
                                        break;
                                    } else {
                                        i7 = 49759;
                                        continue;
                                    }
                                case 50:
                                    break;
                                case 76:
                                    return str2;
                                case 83:
                                    JSONObject jSONObject3 = new JSONObject();
                                    C0005.m159(jSONObject3, str7, strArr3[0]);
                                    C0005.m159(jSONObject3, str6, strArr3[1]);
                                    C0005.m159(jSONObject3, str5, strArr3[2]);
                                    C0005.m159(jSONObject3, str4, strArr3[3]);
                                    C0041.m1985(jSONArray, jSONObject3);
                                    break;
                                default:
                                    continue;
                            }
                            i7 = 49728;
                        }
                }
                i = 1678;
            }
            C0005.m159(jSONObject, C0037.m1882(m1014(), 1774, 4, 1614), jSONArray);
            return C0011.m335(jSONObject);
        } catch (Exception e) {
            m1003(e);
            return str2;
        }
    }

    protected final String yq(String str, String str2) {
        try {
            Cipher cipher = C0029.m1636(C0035.m1833(m1014(), 1778, 20, 2700));
            C0049.m2196(cipher, 1, new SecretKeySpec(C0051.m2233(str2), C0044.m2052(m1014(), 1798, 3, 1888)));
            byte[] bArr = C0024.m1500(cipher, C0051.m2233(str));
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
                            String str3 = C0030.m1677(bArr[i] & 255);
                            int i3 = C0046.m2105(str3);
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
                                        StringBuilder sb2 = new StringBuilder();
                                        C0048.m2158(sb2, '0');
                                        C0032.m1746(sb2, str3);
                                        str3 = C0043.m2039(sb2);
                                        break;
                                }
                            }
                            C0032.m1746(sb, str3);
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
                            return C0028.m1626(C0043.m2039(sb));
                    }
                }
            }
        } catch (Exception e) {
            m1003(e);
            return null;
        }
    }
}
