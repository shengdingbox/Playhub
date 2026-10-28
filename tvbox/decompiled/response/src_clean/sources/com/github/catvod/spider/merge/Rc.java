package com.github.catvod.spider.merge;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.HideUtils;
import com.github.catvod.spider.InitOrigin;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Rc {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f67short = {1825, 1795, 1814, 1797, 1792, 1792, 1805, 1859, 1881, 1858, 1884, 1868, 1860, 1851, 1797, 1794, 1800, 1795, 1819, 1823, 1868, 1826, 1848, 1868, 1885, 1884, 1858, 1884, 1879, 1868, 1851, 1797, 1794, 1882, 1880, 1879, 1868, 1812, 1882, 1880, 1861, 1868, 1837, 1820, 1820, 1792, 1801, 1851, 1801, 1806, 1831, 1797, 1816, 1859, 1881, 1887, 1883, 1858, 1887, 1882, 1868, 1860, 1831, 1828, 1848, 1825, 1824, 1856, 1868, 1792, 1797, 1799, 1801, 1868, 1835, 1801, 1807, 1799, 1795, 1861, 1868, 1839, 1796, 1822, 1795, 1793, 1801, 1859, 1885, 1880, 1884, 1858, 1884, 1858, 1884, 1858, 1884, 1868, 1855, 1805, 1802, 1805, 1822, 1797, 1859, 1881, 1887, 1883, 1858, 1887, 1882, 443, 409, 396, 415, 410, 410, 407, 473, 451, 472, 454, 470, 478, 442, 415, 408, 387, 398, 461, 470, 439, 408, 402, 388, 409, 415, 402, 470, 455, 452, 461, 470, 2987, 3017, 3070, 3042, 3047, 3055, 2980, 3032, 3008, 3034, 3002, 2981, 3001, 3002, 3002, 3002, 3002, 3000, 2981, 3003, 3003, 3002, 2992, 2987, 3068, 3069, 2978, 2987, 3018, 3067, 3067, 3047, 3054, 3036, 3054, 3049, 3008, 3042, 3071, 2980, 3006, 3000, 3004, 2981, 3000, 3005, 2987, 2979, 3008, 3011, 3039, 3014, 3015, 2983, 2987, 3047, 3042, 3040, 3054, 2987, 3020, 3054, 3048, 3040, 3044, 2978, 2987, 3037, 3054, 3065, 3064, 3042, 3044, 3045, 2980, 3007, 2981, 3003, 2987, 3016, 3043, 3065, 3044, 3046, 3054, 2980, 2994, 3004, 2981, 3003, 2981, 3007, 3005, 2994, 3001, 2981, 2994, 2995, 2987, 3014, 3044, 3049, 3042, 3047, 3054, 2987, 3032, 3050, 3053, 3050, 3065, 3042, 2980, 3006, 3000, 3004, 2981, 3000, 3005, 684, 689, 757, 2923, 2925, 2928, 3049, 3059, 3048, 696, 690, 680, 1378, 1397, 1386, 2374, 2396, 2368, 1055, 1026, 1045, 955, 956, 2891, 2902, 2837, 722, 722, 720, 309, 319, 306, 304, 1187, 1274, 1199, 901, 916, 897, 883, 891, 891, 2561, 2589, 2589, 2585, 2625, 2625, 2646, 2632, 2561, 2589, 2589, 2585, 2624, 2631, 2624, 2578, 2648, 2651, 2629, 2580, 2646, 2613, 2631, 2625, 2564, 2650, 2588, 2641, 2581, 2564, 2585, 2653, 2581, 2568, 2591, 2560, 2581, 2564, 2566, 2591, 2581, 2590, 2564, 2591, 2581, 2575, 2565, 2591, 2581, 2564, 2562, 2591, 2581, 2590, 2572, 2571, 2564, 2581, 2587, 2564, 2591, 2571, 2624, 2613, 2646, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2625, 2625, 2646, 2632, 2561, 2589, 2589, 2585, 2624, 2631, 2624, 2578, 2648, 2651, 2629, 2580, 2613, 2631, 2625, 2564, 2650, 2588, 2641, 2581, 2564, 2585, 2653, 2581, 2568, 2591, 2560, 2581, 2564, 2566, 2591, 2581, 2590, 2564, 2591, 2581, 2575, 2565, 2591, 2581, 2564, 2562, 2591, 2581, 2590, 2572, 2571, 2564, 2581, 2587, 2564, 2591, 2571, 2624, 2581, 2561, 2589, 2589, 2585, 2625, 2625, 2646, 2632, 2561, 2589, 2589, 2585, 2624, 2631, 2624, 2578, 2648, 2651, 2629, 2580, 2646, 2630, 2564, 2650, 2588, 2641, 2613, 2646, 2585, 2589, 2644, 2564, 2650, 2588, 2641, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2625, 2625, 2646, 2632, 2561, 2589, 2589, 2585, 2624, 2631, 2624, 2627, 2646, 2573, 2572, 2575, 2568, 2588, 2565, 2589, 2613, 2631, 2560, 2577, 2560, 2574, 2588, 2568, 2613, 2631, 2570, 2566, 2564, 2630, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2625, 2625, 2646, 2632, 2561, 2589, 2589, 2585, 2624, 2631, 2624, 2627, 2646, 2570, 2573, 2567, 2628, 2589, 2566, 2586, 2610, 2615, 2613, 2646, 2612, 2627, 2581, 2561, 2589, 2589, 2585, 2625, 2625, 2646, 2632, 2561, 2589, 2589, 2585, 2624, 2631, 2624, 2627, 2646, 2630, 2566, 2571, 2563, 2630, 2589, 2566, 2586, 2610, 2615, 2613, 2646, 2612, 2627, 2581, 2561, 2589, 2589, 2585, 2631, 2627, 2646, 2630, 2585, 2565, 2568, 2576, 2572, 2587, 2630, 2564, 2650, 2588, 2641, 2585, 2565, 2568, 2576, 2613, 2631, 2585, 2561, 2585, 2613, 2646, 2588, 2587, 2565, 2644, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2631, 2627, 2646, 2630, 2585, 2565, 2568, 2576, 2572, 2587, 2630, 2631, 2627, 2646, 2610, 2585, 2617, 2612, 2565, 2568, 2576, 2613, 2631, 2585, 2561, 2585, 2613, 2646, 2588, 2587, 2565, 2644, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2631, 2627, 2646, 2630, 2585, 2565, 2568, 2576, 2565, 2560, 2586, 2589, 2630, 2564, 2650, 2588, 2641, 2630, 2613, 2646, 2591, 2560, 2573, 2644, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2631, 2627, 2646, 2613, 2631, 2585, 2561, 2585, 2613, 2646, 2589, 2576, 2585, 2572, 2644, 2564, 2650, 2588, 2641, 2639, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2631, 2627, 2646, 2630, 2573, 2566, 2590, 2567, 2565, 2566, 2568, 2573, 2631, 2568, 2586, 2585, 2577, 2613, 2646, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2631, 2627, 2646, 2630, 2568, 2585, 2560, 2630, 2588, 2585, 2614, 2568, 2585, 2560, 2631, 2585, 2561, 2585, 2613, 2646, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2586, 2631, 2627, 2646, 2613, 2631, 2655, 2655, 2576, 2562, 2613, 2631, 2570, 2567, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2625, 2625, 2646, 2632, 2561, 2589, 2589, 2585, 2624, 2631, 2624, 2627, 2646, 2567, 2572, 2589, 2572, 2568, 2586, 2572, 2613, 2631, 2570, 2566, 2564, 2630, 2575, 2560, 2565, 2572, 2630, 2631, 2627, 2581, 2561, 2589, 2589, 2585, 2586, 2631, 2627, 2646, 2613, 2631, 2561, 2588, 2566, 2586, 2561, 2568, 2567, 2613, 2631, 2570, 2566, 2564, 2631, 2627, 2581, 2631, 2627, 2613, 2631, 2625, 2564, 2650, 2588, 2641, 2581, 2564, 2585, 2653, 2581, 2568, 2591, 2560, 2581, 2564, 2566, 2591, 2581, 2590, 2564, 2591, 2581, 2575, 2565, 2591, 2581, 2564, 2562, 2591, 2581, 2590, 2572, 2571, 2564, 2581, 2587, 2564, 2591, 2571, 2624, 2631, 2627, 1906, 1896, 1907, 3193, 3172, 3111, 1466, 1466, 1464, 1459, 1465, 1460, 1462, 875, 818, 871, 1430, 1408, 1431, 1545, 1555, 1567, 466, 473, 468, 453, 462, 455, 451, 1084, 2788, 2076, 483, 481, 641, 663, 670, 663, 657, 646, 754, 679, 672, 702, 754, 660, 640, 669, 671, 754, 657, 701, 700, 692, 699, 693, 754, 645, 666, 663, 640, 663, 754, 678, 683, 674, 695, 754, 751, 754, 3194, 3093, 3080, 3102, 3103, 3080, 3194, 3096, 3075, 3194, 3118, 3123, 3127, 3135, 3194, 3102, 3103, 3081, 3097, 3194, 3094, 3091, 3095, 3091, 3086, 3194, 3179, 499, 497, 508, 499, 450, 501, 483, 485, 508, 
    484, 631, 624, 622, 575, 618, 630, 630, 626, 2421, 2353, 2344, 896, 973, 989, 989, 2183, 2241, 2269, 2244, 2245, 2609, 2608, 2614, 2599, 2604, 2597, 2593, 3222, 3248, 3238, 3249, 3310, 3202, 3236, 3238, 3245, 3255, 1674, 1708, 1722, 1709, 1778, 1694, 1720, 1722, 1713, 1707, 2911, 2941, 2920, 2939, 2942, 2942, 2931, 2877, 2855, 2876, 2850, 2866, 2874, 2911, 2931, 2929, 2939, 2940, 2918, 2941, 2913, 2938, 2857, 2866, 2907, 2940, 2918, 2935, 2942, 2866, 2911, 2931, 2929, 2866, 2909, 2881, 2866, 2890, 2866, 2851, 2850, 2893, 2851, 2855, 2893, 2853, 2875, 2866, 2899, 2914, 2914, 2942, 2935, 2885, 2935, 2928, 2905, 2939, 2918, 2877, 2855, 2849, 2853, 2876, 2849, 2852, 2866, 2874, 2905, 2906, 2886, 2911, 2910, 2878, 2866, 2942, 2939, 2937, 2935, 2866, 2901, 2935, 2929, 2937, 2941, 2875, 2866, 2897, 2938, 2912, 2941, 2943, 2935, 2877, 2851, 2854, 2858, 2876, 2850, 2876, 2850, 2876, 2850, 2866, 2881, 2931, 2932, 2931, 2912, 2939, 2877, 2855, 2849, 2853, 2876, 2849, 2852, 2670, 2636, 2649, 2634, 2639, 2639, 2626, 2572, 2582, 2573, 2579, 2563, 2571, 2683, 2578, 2578, 2584, 2563, 2671, 2634, 2637, 2646, 2651, 2563, 2626, 2626, 2641, 2624, 2635, 2581, 2583, 2570, 2563, 2658, 2643, 2643, 2639, 2630, 2676, 2630, 2625, 2664, 2634, 2647, 2572, 2582, 2576, 2580, 2573, 2576, 2581, 2563, 2571, 2664, 2667, 2679, 2670, 2671, 2575, 2563, 2639, 2634, 2632, 2630, 2563, 2660, 2630, 2624, 2632, 2636, 2570, 2563, 2656, 2635, 2641, 2636, 2638, 2630, 2572, 2578, 2583, 2587, 2573, 2579, 2573, 2579, 2573, 2579, 2563, 2672, 2626, 2629, 2626, 2641, 2634, 2572, 2582, 2576, 2580, 2573, 2576, 2581, 845, 890, 889, 890, 877, 890, 877, 1796, 1832, 1832, 1836, 1838, 1826, 2979, 2977, 2950, 2945, 2977, 2944, 3033, 1126, 2849, 1647, 1640, 1654, 1471, 1471, 3165, 3137, 3137, 3141, 3142, 3087, 1875, 1871, 1871, 1867, 521, 529, 521, 537, 521, 590, 515, 527, 525, 1837, 1909, 1834, 1834, 1909, 1848, 1844, 1846, 1254, 1264, 1258, 1268, 1258, 1201, 1276, 1264, 1266, 2514, 2523, 2448, 2525, 2513, 2515, 1247, 1246, 1231, 1220, 1246, 1157, 1224, 1220, 1222, 1329, 1339, 1320, 1322, 1394, 1343, 1331, 1329, 642, 670, 665, 644, 735, 658, 670, 668, 953, 955, 958, 941, 950, 1014, 955, 950, 2031, 2020, 2017, 2020, 2031, 2020, 2017, 2020, 1955, 2030, 2018, 2016, 1010, 1009, 1023, 1014, 1013, 1022, 1015, 958, 1011, 1023, 1021, 1063, 1063, 1059, 1057, 1145, 1076, 1080, 1082, 551, 545, 567, 544, 639, 563, 565, 567, 572, 550, 2776, 2814, 2792, 2815, 2720, 2764, 2794, 2792, 2787, 2809, 1374, 1353, 1354, 1353, 1374, 1353, 1374, 1281, 1334, 1333, 1334, 1313, 1334, 1313, 2334, 2334, 2334, 2375, 2308, 2318, 2333, 2335, 2375, 2314, 2310, 2308, 2405, 2424, 2405, 2416, 2431, 2367, 2428, 2422, 2405, 2407, 1724, 1694, 1675, 1688, 1693, 1693, 1680, 1758, 1732, 1759, 1729, 2833, 2842, 2847, 2842, 2833, 2842, 2847, 2842, 2980, 3000, 3000, 3004, 3007, 3062, 3043, 3043, 3003, 3003, 3003, 3042, 2990, 2981, 2976, 2981, 2990, 2981, 2976, 2981, 3042, 2991, 2979, 2977, 3043, 1025, 1059, 1078, 1061, 1056, 1056, 1069, 1123, 1145, 1122, 1148, 1132, 1124, 1044, 1149, 1149, 1143, 1132, 1024, 1061, 1058, 1081, 1076, 1132, 1069, 1069, 1086, 1071, 1060, 1146, 1144, 1125, 1132, 1037, 1084, 1084, 1056, 1065, 1051, 1065, 1070, 1031, 1061, 1080, 1123, 1145, 1151, 1147, 1122, 1151, 1146, 1132, 1124, 1031, 1028, 1048, 1025, 1024, 1120, 1132, 1056, 1061, 1063, 1065, 1132, 1035, 1065, 1071, 1063, 1059, 1125, 1132, 1039, 1060, 1086, 1059, 1057, 1065, 1123, 1149, 1144, 1140, 1122, 1148, 1122, 1148, 1122, 1148, 1132, 1055, 1069, 1066, 1069, 1086, 1061, 1123, 1145, 1151, 1147, 1122, 1151, 1146, 2737, 2748, 2744, 2749, 2748, 2731, 1617, 1613, 1613, 1609, 1271, 1276, 1269, 1254, 2305, 2330, 2306, 2178, 1541, 1554, 1552, 690, 2172, 1656, 2759, 1866, 1861, 1872, 1869, 1874, 1857, 1915, 1872, 1869, 1866, 1859, 1915, 1865, 1856, 1809, 1523, 1526, 1535, 3016, 3017, 3035, 2992, 2981, 1744, 1755, 1735, 1683, 1744, 1670, 2722, 2740, 1765, 1760, 263, 264, 1959, 1966, 1459, 1458, 1460, 2792, 2810, 2810, 2959, 2959, 2973, 302, 303, 317, 342, 323, 1147, 1138, 1027, 403};
    public static String yq = C0039.m1937(f67short, 0, 111, 1900);
    public static final String SN = A7.N(by.yq(C0005.m169(f67short, 111, 32, 502)), Build.MODEL, C0050.m2224(f67short, 143, 119, 2955));
    public static final List<String> N = Arrays.asList(C0057.m2384(f67short, 262, 3, 705), C0036.m1850(f67short, 265, 3, 2822), C0051.m2237(f67short, 268, 3, 2974), C0003.m86(f67short, 271, 3, 734), C0039.m1937(f67short, 274, 3, 1283), C0029.m1635(f67short, 277, 3, 2351), C0036.m1850(f67short, 280, 3, 1138), C0006.m180(f67short, 283, 2, 975), C0056.m2339(f67short, 285, 3, 2854), C0032.m1749(f67short, 288, 3, 691), C0054.m2301(f67short, 291, 4, 339), C0057.m2384(f67short, 295, 3, 1230), C0044.m2052(f67short, 298, 3, 996), C0001.m35(f67short, 301, 3, 796));
    public static final Pattern tF = Pattern.compile(C0001.m35(f67short, 304, 590, 2665));
    public static final List<String> zH = Arrays.asList(C0020.m1390(f67short, 894, 3, 1797), C0002.m57(f67short, 897, 3, 3092), C0045.m2098(f67short, 900, 3, 1499), C0023.m1457(f67short, 903, 4, 1493), C0003.m86(f67short, 907, 3, 774), C0046.m2123(f67short, 910, 3, 1505), C0020.m1390(f67short, 913, 3, 1662));
    private static boolean i = false;

    public static String B(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (cn.yq) {
            return HideUtils.encrypt(str);
        }
        try {
            return (String) InitOrigin.i.getDeclaredMethod(C0031.m1713(f67short, 916, 7, 439), String.class).invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String F5(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
        }
        return arrayList.toString().replace(C0044.m2052(f67short, 923, 1, 1127), "").replace(C0033.m1764(f67short, 924, 1, 2745), "");
    }

    public static boolean G(JSONObject jSONObject, String str, String str2) {
        String str3 = C0031.m1713(m1154(), 925, 1, 2106);
        boolean z = C0037.m1888(str2, str3);
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
                    String[] strArr = C0011.m339(str2, str3);
                    int i3 = 0;
                    while (true) {
                        int length = strArr.length;
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = i3 < length ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    str2 = strArr[i3];
                                    boolean z2 = C0037.m1888(C0022.m1450(jSONObject, str), str2);
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = z2 ? 48736 : 48705;
                                            case 47384:
                                                i3++;
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
                                            case 47417:
                                                return true;
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
            i2 = 1678;
        }
        boolean z3 = C0037.m1888(C0022.m1450(jSONObject, str), str2);
        int i7 = 48891;
        while (true) {
            i7 ^= 48908;
            switch (i7) {
                case 22:
                    break;
                case 53:
                    return false;
                case 503:
                    if (!z3) {
                        break;
                    } else {
                        i7 = 49635;
                        continue;
                    }
                case 32495:
                    return true;
            }
            i7 = 48953;
        }
    }

    public static String G4(int i2) {
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(InitOrigin.context().getDatabasePath(C0013.m380(f67short, 926, 2, 407)).getAbsolutePath(), null, 1);
            Cursor rawQuery = openDatabase.rawQuery(C0045.m2098(f67short, 928, 36, 722) + i2 + C0029.m1635(f67short, 964, 27, 3162), null);
            String string = rawQuery.moveToFirst() ? rawQuery.getString(0) : "";
            rawQuery.close();
            openDatabase.close();
            return string;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public static int[] Gc(int[] iArr) {
        if (cn.yq) {
            return HideUtils.calcResult(iArr);
        }
        try {
            return (int[]) InitOrigin.i.getDeclaredMethod(C0049.m2175(f67short, 991, 10, 400), int[].class).invoke(null, iArr);
        } catch (Exception e) {
            e.printStackTrace();
            if (!i) {
                i = true;
                new Handler(Looper.getMainLooper()).post(new Fz(e, 2));
            }
            return null;
        }
    }

    public static boolean Gd(String str) {
        if (str.contains(C0024.m1513(f67short, 1001, 8, 514)) || str.contains(C0028.m1613(f67short, 1009, 3, 2395)) || str.contains(C0053.m2276(f67short, 1012, 4, 942)) || str.contains(C0035.m1833(f67short, 1016, 5, 2217))) {
            return false;
        }
        return tF.matcher(str).find();
    }

    public static String KJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (cn.yq) {
            return HideUtils.decrypt(str);
        }
        try {
            return (String) InitOrigin.i.getDeclaredMethod(C0012.m361(f67short, 1021, 7, 2645), String.class).invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            if (!i) {
                i = true;
                new Handler(Looper.getMainLooper()).post(new OW(e, 1));
            }
            return "";
        }
    }

    public static HashMap<String, String> M(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(C0002.m57(f67short, 1028, 10, 3267), str);
        return hashMap;
    }

    public static HashMap<String, String> N(String str, String str2, int i2) {
        HashMap<String, String> hashMap = new HashMap<>();
        String str3 = C0041.m1994(f67short, 1038, 10, 1759);
        if (i2 == 1) {
            hashMap.put(str3, C0033.m1764(f67short, 1048, 117, 2834));
        }
        if (i2 == 2) {
            hashMap.put(str3, C0027.m1601(f67short, 1165, 102, 2595));
        }
        if (i2 == 3) {
            hashMap.put(str3, yq);
        }
        if (!ee(str)) {
            hashMap.put(C0011.m328(f67short, 1267, 7, 799), str);
        }
        if (!ee(str2)) {
            hashMap.put(C0009.m277(f67short, 1274, 6, 1863), str2);
        }
        return hashMap;
    }

    public static JSONObject Nl(String str, String str2) {
        return OW(str, new JSONObject(str2));
    }

    public static HashMap<String, String> O(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        String trim = str.trim().replaceAll(C0023.m1457(f67short, 1280, 7, 3069), "").trim();
        if (!trim.isEmpty()) {
            String[] split = trim.split(C0000.m18(f67short, 1287, 1, 1098));
            for (String str2 : split) {
                String trim2 = str2.trim();
                int indexOf = trim2.indexOf(C0033.m1764(f67short, 1288, 1, 2844));
                if (indexOf > 0) {
                    hashMap.put(trim2.substring(0, indexOf).trim(), trim2.substring(indexOf + 1).trim());
                }
            }
        }
        return hashMap;
    }

    public static JSONObject OW(String str, JSONObject jSONObject) {
        String str2;
        boolean z;
        String str3 = C0045.m2098(f67short, 1289, 3, 1562);
        String string = jSONObject.getString(str3);
        String yq2 = string.startsWith(C0030.m1688(f67short, 1292, 2, 1424)) ? oX.yq(C0042.m2010(f67short, 1294, 6, 3125), string) : string;
        if (!yq2.startsWith(C0026.m1551(f67short, 1300, 4, 1851))) {
            return null;
        }
        if (yq2.equals(str)) {
            Iterator it = Arrays.asList(C0048.m2145(f67short, 1304, 9, 608), C0002.m57(f67short, 1313, 8, 1883), C0003.m86(f67short, 1321, 9, 1183), C0023.m1457(f67short, 1330, 6, 2494), C0021.m1417(f67short, 1336, 9, 1195), C0002.m57(f67short, 1345, 8, 1372), C0030.m1688(f67short, 1353, 8, 753), C0015.m457(f67short, 1361, 8, 984), C0020.m1390(f67short, 1369, 12, 1933), C0056.m2339(f67short, 1381, 11, 912), C0035.m1833(f67short, 1392, 8, 1111)).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (yq2.contains((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z || !Gd(yq2)) {
                return null;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        String optString = jSONObject.optString(C0027.m1601(f67short, 1400, 10, 594), "");
        int length = optString.trim().length();
        String str4 = C0001.m35(f67short, 1410, 10, 2701);
        if (length > 0) {
            jSONObject2.put(str4, optString);
        }
        String optString2 = jSONObject.optString(C0054.m2301(f67short, 1420, 7, 1324), "");
        int length2 = optString2.trim().length();
        String str5 = C0012.m361(f67short, 1427, 7, 1363);
        if (length2 > 0) {
            jSONObject2.put(str5, optString2);
        }
        if (!str.contains(C0044.m2052(f67short, 1434, 12, 2409)) && !yq2.contains(C0053.m2276(f67short, 1446, 10, 2321))) {
            if (str.contains(C0001.m35(f67short, 1467, 8, 2931))) {
                jSONObject2.put(str5, C0041.m1994(f67short, 1475, 25, 3020));
                str2 = C0046.m2123(f67short, 1500, 102, 1100);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C0052.m2261(f67short, 1602, 6, 2777), jSONObject2);
            jSONObject3.put(str3, yq2);
            return jSONObject3;
        }
        jSONObject2.put(str5, "");
        str2 = C0000.m18(f67short, 1456, 11, 1777);
        jSONObject2.put(str4, str2);
        JSONObject jSONObject32 = new JSONObject();
        jSONObject32.put(C0052.m2261(f67short, 1602, 6, 2777), jSONObject2);
        jSONObject32.put(str3, yq2);
        return jSONObject32;
    }

    public static HashMap<String, String> SN(String str) {
        return str.startsWith(C0022.m1433(f67short, 1608, 4, 1593)) ? N(str, null, 1) : N("", str, 1);
    }

    public static String W(int i2) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i3 = 0; i3 < i2; i3++) {
            int nextInt = random.nextInt(2);
            String str = C0013.m380(f67short, 1612, 4, 1172);
            if (str.equalsIgnoreCase(nextInt % 2 == 0 ? str : C0002.m57(f67short, 1616, 3, 2415))) {
                sb.append((char) ((random.nextInt(2) % 2 == 0 ? 65 : 97) + random.nextInt(26)));
            } else {
                sb.append(random.nextInt(10));
            }
        }
        return sb.toString();
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str).replace(C0048.m2145(f67short, 1619, 1, 2217), C0027.m1601(f67short, 1620, 3, 1568));
        } catch (Exception e) {
            return "";
        }
    }

    public static String dT(String str) {
        return str.substring(str.lastIndexOf(C0038.m1903(f67short, 1623, 1, 668)) + 1);
    }

    public static boolean ee(String str) {
        return str == null || str.isEmpty();
    }

    public static String g1(String str) {
        String str2 = C0011.m328(f67short, 1624, 1, 2130);
        return str.contains(str2) ? str.substring(0, str.lastIndexOf(str2)) : str;
    }

    public static boolean g9(String str) {
        return N.contains(dT(str).toLowerCase());
    }

    public static HashMap<String, String> i(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(C0002.m57(f67short, 1625, 1, 1630))) {
            String[] split = str2.split(C0048.m2145(f67short, 1626, 1, 2810), 2);
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }

    public static String n(String str) {
        if (cn.yq) {
            return HideUtils.tingMd5(str);
        }
        try {
            return (String) InitOrigin.i.getDeclaredMethod(C0021.m1417(f67short, 1627, 15, 1828), String.class).invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            if (!i) {
                i = true;
                new Handler(Looper.getMainLooper()).post(new O(e, 4));
            }
            return "";
        }
    }

    public static int q(int i2) {
        return (int) TypedValue.applyDimension(1, i2, InitOrigin.context().getResources().getDisplayMetrics());
    }

    public static String s(String str) {
        return (str == null || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
    }

    public static String t0(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String tF(String str) {
        return zH(str);
    }

    public static byte[] un(byte[] bArr) {
        String str = C0044.m2052(f67short, 1642, 3, 1460);
        Charset forName = Charset.forName(str);
        return Arrays.equals(bArr, new String(bArr, forName).getBytes(forName)) ? new String(bArr, Charset.forName(str)).getBytes(C0039.m1937(f67short, 1645, 5, 2973)) : bArr;
    }

    public static byte[] v(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static String v3(double d) {
        if (d <= 0.0d) {
            return "";
        }
        String str = C0003.m86(f67short, 1650, 6, 1781);
        return d > 1.099511627776E12d ? String.format(Locale.getDefault(), str, Double.valueOf(d / 1.099511627776E12d), C0004.m130(f67short, 1656, 2, 2806)) : d > 1.073741824E9d ? String.format(Locale.getDefault(), str, Double.valueOf(d / 1.073741824E9d), C0025.m1542(f67short, 1658, 2, 1698)) : d > 1048576.0d ? String.format(Locale.getDefault(), str, Double.valueOf(d / 1048576.0d), C0041.m1994(f67short, 1660, 2, 330)) : String.format(Locale.getDefault(), str, Double.valueOf(d / 1024.0d), C0033.m1764(f67short, 1662, 2, 2028));
    }

    public static boolean xa(String str) {
        return str.contains(C0057.m2384(f67short, 1664, 3, 1472)) || str.contains(C0057.m2384(f67short, 1667, 3, 2697)) || str.contains(C0044.m2052(f67short, 1670, 3, 3068));
    }

    public static HashMap<String, String> yq() {
        return N("", "", 1);
    }

    public static String zH(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance(C0010.m296(f67short, 1678, 3, 1078)).digest(str.getBytes(C0057.m2384(f67short, 1673, 5, 379)))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, C0042.m2010(f67short, 1681, 1, 419));
            }
            return sb.toString().toLowerCase();
        } catch (Exception e) {
            return "";
        }
    }

    /* renamed from: نوهك  reason: contains not printable characters */
    public static short[] m1154() {
        if (C0054.m2295() < 0) {
            return f67short;
        }
        return null;
    }
}
