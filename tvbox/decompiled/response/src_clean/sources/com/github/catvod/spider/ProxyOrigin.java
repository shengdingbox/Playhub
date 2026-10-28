package com.github.catvod.spider;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.text.format.Formatter;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0010;
import com.github.catvod.spider.ProxyOrigin;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.FA;
import com.github.catvod.spider.merge.HE;
import com.github.catvod.spider.merge.IH;
import com.github.catvod.spider.merge.Q;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.RunnableC0083b;
import com.github.catvod.spider.merge.St;
import com.github.catvod.spider.merge.Ud;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.View$OnKeyListenerC0152nV;
import com.github.catvod.spider.merge.XM;
import com.github.catvod.spider.merge.by;
import com.github.catvod.spider.merge.fj;
import com.github.catvod.spider.merge.jA;
import com.github.catvod.spider.merge.lW;
import com.github.catvod.spider.merge.p7;
import com.github.catvod.spider.merge.rg;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Response;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class ProxyOrigin extends Spider {
    public static final int Gc = 0;
    private static boolean N = false;
    private static boolean SN = false;
    private static boolean i = false;

    /* renamed from: short */
    private static final short[] f46short = {579, 546, 588, 259, 262, 264, 279, 273, 278, 306, 269, 272, 278, 2304, 2311, 2322, 2305, 2311, 2377, 2565, 2585, 2585, 2589, 2647, 2626, 2626, 2652, 2655, 2650, 2627, 2653, 2627, 2653, 2627, 2652, 2647, 1404, 1315, 1313, 1340, 1323, 1322, 1388, 1335, 1340, 1390, 1328, 1336, 2861, 2854, 2860, 2930, 723, 727, 2880, 2921, 2931, 2920, 2914, 2854, 2922, 2921, 2917, 2919, 2922, 2854, 2933, 2915, 2932, 2928, 2915, 2932, 2854, 2934, 2921, 2932, 2930, 2854, 29418, 23526, 24773, 25934, 20788, -31456, 917, 913, 925, 923, 921, 979, 982, 2407, 2402, 2423, 2402, 2361, 2410, 2414, 2402, 2404, 2406, 2348, 2409, 2419, 2406, 2404, 2360, 2401, 2402, 2416, 2406, 2357, 2359, 2351, 1517, 1521, 1521, 1525, 1471, 1450, 1450, 1460, 1463, 1458, 1451, 1461, 1451, 1461, 1451, 1460, 1471, 1249, 1214, 1212, 1185, 1206, 1207, 1265, 1194, 1185, 1267, 1197, 1189, 1274, 1278, 654, 679, 701, 678, 684, 744, 676, 679, 683, 681, 676, 744, 699, 685, 698, 702, 685, 698, 744, 696, 679, 698, 700, 744, 1320, 1311, 1291, 1295, 1311, 1289, 1294, 1370, 1308, 1307, 1299, 1302, 1311, 1310, 1344, 1370, 2339, 2324, 2304, 2308, 2324, 2306, 2309, 2385, 2309, 2328, 2332, 2324, 2325, 2385, 2334, 2308, 2309, 2379, 2385, 1720, 1700, 1700, 1696, 1770, 1791, 1791, 1761, 1762, 1767, 1790, 1760, 1790, 1760, 1790, 1761, 1770, 575, 630, 633, 636, 629, 1430, 1416, 1415, 1416, 2559, 2531, 2531, 2535, 2477, 2488, 2488, 2644, 736, 703, 701, 672, 695, 694, 961, 2356, 2344, 2344, 2348, 2406, 2419, 2419, 2413, 2414, 2411, 2418, 2412, 2418, 2412, 2418, 2413, 2406, 1170, 1229, 1231, 1234, 1221, 1220, 1170, 1309, 1350, 1357, 1311, 1132, 1086, 1075, 1082, 1071, 1143, 1145, 1146, 1144, 2942, 2853, 2862, 2940, 486, 436, 441, 432, 421, 509, 499, 496, 498, 845, 849, 849, 853, 799, 778, 778, 788, 791, 786, 779, 789, 779, 789, 779, 788, 799, 2062, 2129, 2131, 2126, 2137, 2136, 2854, 2851, 2860, 2863, 2851, 2857, 2871, 2845, 2862, 2861, 2851, 2854, 761, 764, 755, 752, 744, 706, 753, 754, 764, 761, 1617, 1618, 1655, 1622, 1611, 1614, 1617, 736, 741, 746, 763, 745, 753, 763, 759, 755, 749, 752, 743, 748, 614, 618, 616, 555, 621, 620, 630, 608, 619, 555, 612, 619, 609, 631, 618, 620, 609, 555, 625, 627, 1584, 1588, 1574, 1580, 1033, 1024, 1025, 1032, 1026, 1030, 21615, 25576, -27690, 26294, 22172, 22512, 21336, 21044, 17136, 26749, -27618, -27951, 2141, 2138, 2116, 2546, 2544, 2546, 2553, 2548, 2501, 2552, 2556, 2548, 406, 401, 1356, 1360, 1354, 1373, 1369, 1372, 952, 958, 953, 937, 2368, 2334, 2392, 2325, 2313, 258, 378, 1952, 1964, 1959, 1958, 1136, 1138, 1138, 1624, 1626, 1607, 1616, 1617, 1559, 1612, 1607, 1557, 1605, 1563, 1629, 1552, 1550, 1628, 1600, 1626, 1613, 1609, 1612, 1557, 3052, 2985, 2987, 2985, 2978, 2991, 2974, 2979, 2983, 2991, 3063, 946, 1013, 1008, 937, 1010, 1013, 1016, 999, 1009, 946, 993, 998, 1016, 937, 592, 577, 577, 605, 600, 594, 592, 581, 600, 606, 607, 542, 603, 578, 606, 607, 2935, 2934, 2916, 2831, 2842, 3185, 3139, 2354, 2388, 2377, 2373, 2392, 2399, 2391, 2347, 2241, 569, 1356, 1355, 1365, 1284, 1355, 1344, 2431, 2405, 2399, 2396, 2840, 2816, 2822, 2844, 2838, 2873, 2823, 2838, 1648, 1632, 1639, 1601, 1644, 2107, 2111, 2091, 2104, 2081, 1000, 1002, 968, 1009, 1019, 2047, 2040, 2022, 2019, 2018, 3043, 3046, 3049, 3050, 3058, 1202, 1188, 1206, 1192, 3132, 3170, 3108, 3177, 664, 669, 649, 643, 2511, 2500, 2497, 2500, 2102, 2095, 2085, 3011, 3022, 3019, 2920, 2912, 2966, 2944, 2008, 2002, 1999, 2028, 2005, 2015, 2638, 2666, 2683, 2631, 2662, 2670, 2668, 3044, 3008, 3025, 3070, 3020, 3019, 1286, 1292, 1281, 1287, 2442, 2446, 2434, 2436, 2438, 2508, 2505, 1944, 1978, 1967, 1980, 1977, 1977, 1972, 2042, 2016, 2043, 2021, 2037, 2045, 1944, 1972, 1974, 1980, 1979, 1953, 1978, 1958, 1981, 2030, 2037, 1948, 1979, 1953, 1968, 1977, 2037, 1944, 1972, 1974, 2037, 1946, 1926, 2037, 1933, 2037, 2020, 2021, 1930, 2020, 2016, 1930, 2018, 2044, 2037, 1940, 1957, 1957, 1977, 1968, 1922, 1968, 1975, 1950, 1980, 1953, 2042, 2016, 2022, 2018, 2043, 2022, 2019, 2037, 2045, 1950, 1949, 1921, 1944, 1945, 2041, 2037, 1977, 1980, 1982, 1968, 2037, 1938, 1968, 1974, 1982, 1978, 2044, 2037, 1942, 1981, 1959, 1978, 1976, 1968, 2042, 2020, 2017, 2029, 2043, 2021, 2043, 2021, 2043, 2021, 2037, 1926, 1972, 1971, 1972, 1959, 1980, 2042, 2016, 2022, 2018, 2043, 2022, 2019, 464, 470, 448, 471, 392, 452, 450, 448, 459, 465, 2434, 2448, 2517, 2491, 2486, 2516, 2434, 2448, 2499, 2441, 2501, 2504, 2518, 2497, 2516, 2461, 2454, 2517, 2477, 2475, 2499, 2441, 2501, 2504, 2518, 2496, 2516, 2461, 2454, 2499, 2441, 2501, 2504, 2518, 2511, 1990, 2020, 2020, 2018, 2039, 2035, 1962, 1995, 2022, 2025, 2016, 2034, 2022, 2016, 2018, 2853, 2827, 2827, 2846, 2883, 2863, 2818, 2823, 2840, 2827, 2158, 2114, 2115, 2115, 2120, 2126, 2137, 2116, 2114, 2115, 1590, 1574, 1573, 1228, 1243, 1240, 1243, 1228, 1243, 1228, 927, 920, 902, 1009, 1020, 3288, 3278, 3285, 3274, 3289, 1808, 1853, 1853, 1853, 1848, 1831, 1844, 2207, 2215, 2209, 2235, 2225, 470, 468, 451, 845, 849, 849, 853, 854, 799, 778, 778, 850, 850, 850, 779, 838, 863, 863, 860, 786, 786, 779, 838, 842, 840, 778, 994, 1011, 1011, 1007, 1002, 992, 994, 1015, 1002, 1004, 1005, 940, 1012, 994, 1008, 1006, 2801, 2797, 2784, 2808, 879, 866, 870, 867, 866, 885, 884, 949, 2638, 2418, 2403, 2403, 2431, 2426, 2416, 2418, 2407, 2426, 2428, 2429, 2364, 2405, 2429, 2423, 2365, 2418, 2403, 2403, 2431, 2422, 2365, 2430, 2403, 2422, 2420, 2374, 2369, 2399, 921, 904, 917, 921, 962, 925, 897, 908, 900, 899, 982, 973, 910, 901, 908, 927, 926, 904, 921, 976, 920, 921, 907, 960, 981, 727, 723, 865, 864, 882, 793, 780, 2079, 2068, 1578, 1579, 1536, 1573, 1578, 1577, 1585, 2785, 2789, 2801, 2786, 2811, 401, 403, 433, 392, 386, 2865, 2868, 2875, 2872, 2848, 2237, 2232, 2215, 2228, 2020, 2025, 2028, 1580, 1572, 614, 624, 419, 420, 
    442, 775, 790, 779, 775, 860, 779, 798, 799, 840, 851, 784, 795, 786, 769, 768, 790, 775, 846, 774, 775, 789, 862, 843, 1233, 1182, 1154, 1176, 1183, 1166, 1160, 1235, 1158, 1216, 1179, 1233, 1218, 1182, 1154, 1176, 1183, 1166, 1160, 1235, 1255, 1233, 1161, 1229, 1181, 1232, 1231, 1245, 1219, 1245, 1245, 1245, 1245, 1245, 1217, 1244, 1217, 1247, 1240, 1217, 1244, 1243, 1242, 1242, 1242, 1247, 1244, 1240, 1231, 1235, 1233, 1218, 1161, 1235, 3192, 3147, 3140, 3149, 3151, 2102, 2093, 2080, 2097, 2087, 2153, 2148, 2169, 791, 795, 794, 768, 785, 794, 768, 857, 792, 785, 794, 787, 768, 796, 1835, 1839, 1827, 1829, 1831, 1901, 1896, 1295, 1290, 1311, 1290, 1361, 1282, 1286, 1290, 1292, 1294, 1348, 1281, 1307, 1294, 1292, 1360, 1289, 1290, 1304, 1294, 1373, 1375, 1351, 2401, 2390, 2390, 2379, 2390, 2308, 2390, 2369, 2373, 2368, 2381, 2378, 2371, 2308, 2390, 2369, 2391, 2388, 2379, 2378, 2391, 2369, 2308, 2391, 2384, 2390, 2369, 2373, 2377, 2334, 2308, 1657, 1659, 1644, 417, 432, 429, 417, 506, 421, 441, 436, 444, 443, 494, 501, 438, 445, 436, 423, 422, 432, 417, 488, 416, 417, 435, 504, 493, 1950, 1946, 1720, 1721, 1707, 1728, 1749, 24150, 24150, 21266, 30748, 19548, 28436, -28256, 30055, 3052, 2996, 2982, 2977, 2983, 2978, 2997, 1018, 930, 944, 951, 945, 948, 931, 1018, 2120, 2628, 2628, 2628, 2634, 2637, 2643, 662, 650, 650, 654, 2246, 2244, 2265, 2254, 2255, 2185, 2258, 2265, 2187, 2267, 2181, 2243, 2190, 2192, 2266, 2271, 2240, 2259, 2187, 2192, 2242, 2270, 2244, 2259, 2263, 2258, 2187, 2768, 2764, 2774, 2753, 2757, 2752, 2578, 2580, 2579, 2563, 2200, 2269, 2271, 2269, 2262, 2267, 2282, 2263, 2259, 2267, 2179, 2654, 2652, 2654, 2645, 2648, 2665, 2644, 2640, 2648, 1018, 957, 952, 993, 954, 957, 944, 943, 953, 1018, 937, 942, 944, 993, 1451, 1422, 1425, 1457, 1460, 1410, 1469, 1456, 1490, 1415, 1411, 1414, 1411, 1462, 1416, 1491, 1458, 1440, 1448, 1423, 1471, 1495, 1425, 1453, 1449, 1501, 1493, 1441, 1410, 1417, 1493, 1440, 1449, 1449, 1439, 1468, 1419, 1421, 1448, 1439, 1436, 1429, 1436, 1457, 1429, 1409, 1441, 1441, 1443, 1412, 1457, 1500, 1469, 1446, 1454, 1454, 1423, 1458, 1450, 1460, 1454, 1429, 1411, 1425, 1469, 1431, 1448, 1461, 1431, 1444, 1439, 1440, 1449, 1491, 1454, 1439, 1448, 1488, 1441, 1439, 1482, 1462, 1451, 1426, 1422, 1460, 1492, 1412, 1408, 1469, 1425, 1501, 1436, 1488, 1492, 1460, 1436, 1459, 1426, 1458, 1443, 1493, 1418, 1494, 1417, 1486, 1488, 1422, 1428, 1460, 1496, 1496, 2851, 2866, 2863, 2851, 2936, 2855, 2875, 2870, 2878, 2873, 1759, 1752, 1734, 2577, 2589, 2588, 2566, 2583, 2588, 2566, 2655, 2590, 2583, 2588, 2581, 2566, 2586, 2119, 2112, 2124, 2113, 2602, 2619, 2619, 2599, 2594, 2600, 2602, 2623, 2594, 2596, 2597, 2660, 2596, 2600, 2623, 2662, 2616, 2623, 2617, 2606, 2602, 2598, 1893, 1908, 1897, 1893, 1854, 1889, 1917, 1904, 1912, 1919, 3185, 3184, 3179, 3103, 3193, 3178, 3198, 3185, 3195, 886, 852, 841, 862, 863, 779, 854, 852, 841, 862, 863, 875, 789, 851, 798, 796, 692, 693, 679, 716, 729, 2132, 2117, 2136, 2132, 2063, 2128, 2124, 2113, 2121, 2126, 2779, 2774, 2783, 2762, 1415, 1411, 1423, 1417, 1419, 1473, 1476, 1061, 1050, 1047, 1046, 1052, 2137, 2164, 2173, 2152, 2093, 2147, 2146, 2169, 2093, 2155, 2146, 2168, 2147, 2153, 862, 859, 846, 859, 768, 851, 855, 859, 861, 863, 789, 848, 842, 863, 861, 769, 856, 859, 841, 863, 780, 782, 790, 2015, 2040, 2032, 2037, 2044, 2045, 1977, 2029, 2038, 1977, 2045, 2044, 2042, 2038, 2045, 2044, 1977, 2032, 2036, 2040, 2046, 2044, 1583, 1544, 1552, 1543, 1546, 1551, 1538, 1606, 1558, 1543, 1556, 1543, 1547, 1539, 1554, 1539, 1556, 1557, 2384, 2431, 2429, 2410, 2409, 2410, 2429, 2410, 2401, 2412, 2410, 2428, 803, 806, 809, 810, 818, 2849, 2851, 2866, 2821, 2867, 2868, 2868, 2851, 2856, 2866, 2834, 2851, 2878, 2866, 2821, 2857, 2858, 2857, 2868};
    private static Handler t0 = new Handler(Looper.getMainLooper());
    private static long tF = 0;
    private static int yq = -1;
    private static jA zH;

    private static String B(View view) {
        return view instanceof TextView ? ((TextView) view).getText().toString() : "N/A";
    }

    public static void G() {
        SN = false;
        N = false;
        tF = 0L;
        if (zH != null) {
            zH = null;
        }
    }

    static void Gc() {
        String B;
        int i2 = 9978;
        String str = "adjustPort";
        if (yq < 9978) {
            while (true) {
                int i3 = i2;
                
                    try {
                        Log.e(str, "start:" + i3);
                        B = V3.B("http://127.0.0.1:" + i3 + "/proxy?do=ck");
                        Log.e(str, "end:" + i3 + B);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e(str, "端口检测失败");
                    }
                    if (B.equals("ok")) {
                        SpiderDebug.log("Found local server port " + i3);
                        yq = i3;
                        return;
                    }
                    continue;
                    i2 = i3 + 1;
                
            }
        }
    }

    private static void KJ(TextView textView, Drawable drawable) {
        try {
            if (drawable instanceof ColorDrawable) {
                textView.setBackgroundColor(((ColorDrawable) drawable).getColor());
            } else {
                textView.setBackgroundColor(0);
            }
        } catch (Exception e) {
            textView.setBackgroundColor(0);
        }
    }

    private static Object[] M() {
        return new Object[]{200, "image/*", new ByteArrayInputStream(Q.yq("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDABsSFBcUERsXFhceHBsgKEIrKCUlKFE6PTBCYFVlZF9VXVtqeJmBanGQc1tdhbWGkJ6jq62rZ4C8ybqmx5moq6T/2wBDARweHigjKE4rK06kbl1upKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKT/wAARCAFyApIDASIAAhEBAxEB/8QAGgAAAwEBAQEAAAAAAAAAAAAAAAECAwQFBv/EADcQAAICAQMDAwIEBAYCAwEAAAABAhEDEiExBEFREyJhMnEFQoGRFFKh0SMzYrHB8OHxJENykv/EABcBAQEBAQAAAAAAAAAAAAAAAAABAgP/xAAdEQEBAQEBAQEBAQEAAAAAAAAAEQExIQJBElFh/9oADAMBAAIRAxEAPwDw4asWTTOLXZxexn1GL05JreElcX5PV6rol1GNZsCWqrcaV9v7nDiqcZdPkpN7pulT+X4+x23GM1xgVODhJxfKJMNAAAAAAKAYgAY03VXsIChgAFQAAAMaEADAAKhjbtt0lfgkYAMQBDGIAhjsQFDG6va6+SRhDAAKBDEMIYACAY0JDQDKQqKSCGkWiRgUMlDsoqxX9ibCwKsa2JQ7AtPe2rGiUUgNIGsmRAJMIL3IkxkNgJisGxWFWmOXBCZV2giGKxyJCq5Ja3CwbsCGIqX2JYBY7JCyBiCxADJZQrAQhkhTEFgBLByenTe13QxMCQHQgEIbQiKQDEFIBgFelDqJYsuuHZ3LVJ6dX378G2bFj6mMZNPVwpX9lvv99jbrekU8TnGMo44qnGT70zzYSn0uRqWOWNP5rvzuRMT1vTyeJZWvcvqf6J/8nnnv9N1OBz9PMlFOk+OP0/3PP/FPw6XR5NUVqwy+mX/BnWvnfxwAAEaAAADEMRQwAAGAhlAAAEAxAAxiGEAxAUMAAIYCGUAxAEMAABjEBUMYgQRQANANDSBDQDRSJGEUhiQWA7AVgAxoSAoqwQkMCkXHkzRpHkDWPAmwvYhsIdkthZLATYCYBTspMzKTAciGW+CGAhpksAGyWOxMCWIbJZA7CyRgOxCAKYmAmACGJgIBAACGIAE0MAqRFMRFIBgB9LilCaXU44WmpNxk093Ln+px9d0sFJvVJztXKSelvmji6DqcnTSTfugkk41ytSex7j98FOD143c2qXt2dfJniPn1d+nLIpPtap/uzs6TNeN9PJe17emtrt8N9vkOr6eeJ1makpPiOPdb7Lbyc8bpJfXHiKdtuv8AyVWfV9Il/iY2qe9pbcW38bukcMk4umqfyew57OTipLZZIJrtx2+Oxz9R0yyQ9THJTj/Nv+rexNxrNecA2muRGWgAxFDALdUAAMQAMAAqAAABjrev9hAAwACoYCGADEAQwACgGIYQDEMIY0JDRUNFIQwGMQwGgEh2A7AVjCAYhrgCkAvsMARRI0UUjSJmjSIFNkNjbJCHexLATYUMQCABkhYFpiYkxsCVTat0r3Yns3TteRslsgLHZIANkMoTAliGxMKLCxAA7CybGACYWAAJgACAAABABFAgAKAAAN1CvpkpVyn23OvoOrl0s5R06sc+Uuas5dMZVLFLVsr7UytCapOpJd/uWJXu5odPmx3HCmmpNNKtl2Z5FSxS0v8AL+Vbuv1fGx1dFmnjuOXT6c7U3W63/cf4p0qyRl1KyK1tGMdtvv8AuZ4VjipxqCbVaZY47utk9/LbZjL1OnyyeOskHvS2/dGePLkxtST1OPDgrae/f7s71jh1mFvFWqD+nit6X67cFHJ1PS4urTydP7cl7xbbvnb9keXKLhJxkqaPRTlCVZIuS7t7SXF/7l9Rjj1MbdOfMZKlfL38UZ3G815Qi8kHB+U+H5JI0QxDAAEMBgAFAAAEAxDACoSUZJuKkvDJGVAMQAMAAIYCGUAwAIaGJDKhjQhhDGSNc0AxiQwGIAAYyRoCkMkYQxklAMaENFFI0WyM48lsBNiBkgU2SAmAgARAxCsLAuo6L1e6/prt5BMmx2uwAyGUyQFYgYBTsLEACYmNiYCEMQCAYgABAAxAAAAAAhDERQACCmAgArDmUWovaLa1Ub65QinF6oStq+ys4TXFl0pqScrVL4Jmtb8vQxzUW522nqvT+nY9bDPFng45l61qTTlwltvueA7hOSkk95d6Z19L1ajKmk4vZqUvgu+sQuuwTw58kk1LHqaXuSj+y+5hizSwZFPDJKXZRT3PoM2FfiHTLJjuUd3GqTu0eDkjPHklhy6tvORbEzR6Clj6+KnhahmVXjuk3tx445OZ4tLcWmndU0l+lcLvucklLHNVSfCSfB14fxCGRLH1idPaOat/1/cow6jGssHOb99+58tv4XbsefOMoScZKmj3OqwTwT9VO4vdSi61LfhrfhI4Or6a4a4R/wD5Tf33ZnW/nXCIYiNGAhgAxAAwACoAAAGAAUMAAIYCGEAxDKGt+4AAQ0MAKgGhDCGMQAMdkjAYCGAxoQAUMlFAAxDCGNCQ0BceRtiQmygsBWAA2LZ3vVL9wYmQAgEAAArAYybBMC7JYAwJEMQUCsBAUJiAAEMTAQhiAAAAABBZFMBCYDEAAAhgFIBgBiBq1Ga4pmcotcmY3W2J+pH02lsm7bKa0t1iUvm/g5k6OpackddLXfC7bFxNdn4b+IZunyaNakpJJLwex+IdHi6vEsuOS19r4kfM6pKriorbdco9T8N6vHBK28tUoxm/pfwNxnXNKGiTw5fY+K00/sc+XFKHbni+x7XVaZKKyeplxP6csItNbva/2OXJD0FpySjPG/asid2/Bc1GP4f1ixr+Hz+7ppbNv8jdK1/Y3z4H0+TdaoTWzrlbbf1OfL0cZb4n9ovZs7OhzPLj/hOpT1R3i12+/wCxIV5PWdM8b9SG+N91wmcp708Lx3CcfUxvart+FXzZ5fV9G8D143rxPiSd19ybjebXIMAI0AAAGAbV3sCgAACAYhgNVvYCGVDAQwgGIZQwEMIaAAKhjQgCKAkYDAAAYxAAxiGgGhi7DAqnV1t5ASBBFD27OxIaAqxMGxMoAFYWQDEDEAgAQBYAIKBiACkwEAASNiAQAIBisLABiEAAxDYgAQxEUCAAoAAAAAAAAAAAAA1WPFlScJKMu6Yn007r6l8HMtjSGWcVUZMlWaJ4Jw/KyISnB2rRqupyx/Nf3HLPHIqcEh4t1pBwzNekown/AC1zsViema9bHKS23iqOeWJxjrXBri618ZlqXlc8Uip3j0sHUU1jlijLp2ktM3wvKRbc+lhcXLL0slUakouEd9qT+25ljbyYv8PTOtlJLfaO48Us+J6G5KT+mbpcLgbjFL0tUHl6aUZR70nt8K3zwKGZW1OGye97Nhj6jG8rlqj0/UL83MeF2vY6cmLHn2lH08kfzR324tvv2/cU3G9rNjuErlVq+Xz/AF3ObLj0puHujw4VtW6pJcsiEZ4cjjJpvlS1cP4OrHmxzlpzScJ/zxWz/wC/8geF1fSxjeTFx+aD2cf0s5D6fqehyKPq4oJqrlGMvZLy67ng9d0zwZE4prHPeN9vgy6ZrmAQyNAAAoYA23u3YBAMQwAYAVDALvlgEAxDsAGIfYqAYgAYxAVDAACGhiGA0AhgNK+BoSBAMaEMCgEhhDRRKKAGJgybAdgIABiBiAACxAAN2IAoABAUBI7AYmFiYAIGIACwEA7CxAAAAAAhiIpAABQAAAAAAMBDCEAAFZJlpJ8C0J/SyXFoy31pLHJR1MzexcJtPd7Gj0ZeVT7MqWMseSUX5T5TNJrHVxsylFxdBB0yG5+t8GXJgnrxSp1T+x6c5fxWGWaGlSpuSr7JL5PK0xauOzNulyL1Vqk4tO14NMa6+ojHPBzTqSuNLvwiMHUSxy0uskNX0SV/mXb9BzaxvXF9qblvqbfgwn7ZLdNbb9v27lTHpSayYllhP/DdW5ypxb24/ciGZS/w5yvb2zitn+5x9N1WTp5KUdnStNcqn2X3O/JhXUYnm6aTkqtrJkt49vHyTixv0nULF7NcUuz1HTnw9L12B49eOGVu00u548JYepk8WSCxZ02qe1u/9yk54pqLmozX+nn/AMjcpxj1n4P1PTt/4LmvMFZ508Tg6lGUfuqPp11C6nFGepRy8Nrbc4+pjktpNV45r+v+5M/6f08LR4YjtyYoZPpjol2rdM5ZRduMlTQjdQANU6AigYhgMBDKgGIAGAAEMAAoYCGEAxDCGCACgKJKCAYhgCGhDAYxABQyRoCkMSCwgZLBsQDsBAACCwv4CkFgIAABMBhYgAYCABgJMYCExiYCAAAAACABfIAFAAkBQCGACChgQKgoGxWA6EG3dg2gpWAWAGbTQ1N8M0tpdmiXpfKokaqS4vUlFC9nyNJfle4TVeo8e00pfcHng/8A6khTg9GuRnqS4QMbJXun+gOrtqn5Rkp070m0c0e8C1Nx3dLkhmitSUpw3j9yJ9NPTFRxpyStzk9l8HPFJSWTBPS/DO9Slmi8k5zUttUI73+hWXm1XlRWzlW6dcG/S9Tl6XIpQaTde1/S1XcfUR90cnpSV0kq2f3MEoqNxuWO05bcEar2J+j+JwhOEU8qSWl7S7XK/wDvcnC4Z8SxZJSTS9rlyvCvvwzzMGaWKSnCV8Xu9lfB6mPPj6tJtNz5aTqe3Fdn+pE1ShkwzcMrlUtlNJOnvVmkMrd48ylF8XJbP+o8OWK04p5U47xqcar+b4/U0y9DCcFkxRUJ13eqIqRzdR+Hxy3PC4qXeL/7sjz83SSdKbUcn5fMl+x6cYzjWp//AJd2pfZf3CTlJ6JpttVplzL7eCl14EsVr2vdGNU6Z63V4YuWtR9KfeDaf7HDnxtPdU+w3Gs+nOA2qEZbMAABgIZUNAIAGMQBDGICoYAADGJDKgGhDCGMQAMbVCGADEMBjRJSAYMBMIQhiAAEABYWIAoCxWABYCCwGArEBQEgBQEjsAEUKgEAxAAAAAAUAUWAUAQBYCCixMdWPTsQQBemyXF+AtSBSg/sPTFcsKgCvaAGakytSfJmMy1F6U+GJpxYkaRlXO5UVjak0pv2k5McNT0ukUoxfDpl6Lx6VFyZWa53F8xaf2JUmnuVK4OnGmNShLlUzLRxae90dPTdRLDNSWSqORwV7MWn5LUma+gh6XWY24xeTJL6o6qR5WfHLBlSajt9NK0zDBmeCalBu0e1DJi/FMDjJacqXnn7FZkeU4qael6J76o8JiUrlv7Xf2SRplwywZNEovZ/Suf3oTjHOrTua3l5B1uuoytVqTT293Gnx5o6ej/Fli9mXHKClbel7fp/Y8yM54nurT/VpI3U+nzRqaq3Sd7pDcq8e/Uc0PVw5FOElb0reKqqSfBlPNPHSySWib9ktG/2Z5/Sp4Pz68cndvtXc9NXlWictSyL6kpX8GeIic4zuHUYMbhXPEv6bnB1nQenFyxN5cP290ToyLL0eV4pwxzlHeLct68m+HqFkfpybcvhcP8AsaR83mxuL/58mJ7/AOIdEm24xSfOlPn5R4mWGlk1v51mMQEaMYgKhgAAMBDCAYhlDAACGuABDKgGIaYQwAEBUnqd0l9gEMAAAAY0IYDEArABAIBiAAATEAAACAYgAAAAp1fYAAAABoQ0gGDGAEjodUKwCgHuJqTAWoNQODDSwpWOmytorcl5PCANL8hSXIrsLAHLstiW2NkkU7Yan5CgSAG2+5LL2D2d9gMwKqIEVkABsZbNAKhqu7CGmbYcrhJSXYyWjuUtPY1jOujLinlxvLdrwc3pp/B19N9VSmlF8kdZ0vpy1Qlqi/BdTN/GPoS7bk+jLvsTcl3aGpOeze/knjXorT2svFlnjkpLZonePyG8gj11lx9fiqcfTmlWq7X6nFkwNSqKba4UVRhimoSq5V8M7Jzjkj7p5nk4iVnjK5y2mql3fhcBHHGTtLRJ7Rrh9mKUmm4ZYuNcvuS5S/LGnLhVtRRsoTx3o37U92vk6MHVzVQnNqLftk5aV+pwxyyreTpbLemmaN8p079qaWzCPZjPH12L08sMUM0PpTd6kv7HJKD6eThO8UU6q21L+xHS5VqjOLucHWO0tzszKPqaMmN01cHK1t3W/NGc8NbYMznj0ZKtdtXBy/iP4dDLF58DTv6q3RMFkxSvDN2nwu7fx2O/pM66hPjWtpRTbTKPlsmCUJVsQ4yXKPe/Evw6ak5447fHc8ecZK9mI1n05xmja7olxXb9iRqpGICBjEMoBiAIYxDKgKJGEMAQFDQxFBAMAABiGADEAAIGIAAQAAAIABtbUvuIAAAAAAAAAGkPgBUHA9xpASk2VQ+CdTAeyHaEnaE0wG2iWx6WJqgFbDU/IMkKdj1vySNKyAsRVLuwuKASQ6XkWoNQFem3wNQ07sjU/Im2wKlJdiVJppp7oKY1Fd2FSDi/A3XYWpruFKmAan5Ah6jT8oGqFYWZbAhpD0sBKr3dA227fJWh0JxaEKFJo7ulzqcPSnG72RwFQnKDTTpouam5W/U9PPFN7e0523wepjlHq8CjKSU0jjzYVjlTV/JrcZz6/wBYRbRSytvhC9OUt0g0vwT1fGiyQe2mn5OnBJ/T6+nwcNafuVGTi0+5am47M2PUlu8mZu/JyqbV3p37eDuwdVLLFvRBZKq+LMup6eMJRcMqnJrdBnPPNc+pXs0nFbUuTSM9K0yjaXKk+4o4JVTft5fwyvRlBq5RTrUnzYXY0UY3rjLdKotKtz0OmnDN076eUovNBXqk+UeZHXDepbbvet/J1dJ1cseSChGKl9U5N1a+5WW69RbxjSf5XJbfp5NYZMUpJuoyj/NvS/48EdTkcHLTKlzPSlbXZp0Y3NtWk3tpale/an/VkHudNkUoVs1Xuilx8rycn4h0LT1490+Tj6fqHBqST558/t8Wz18HV6l9Sare3dE9zivm8uFO24ST77HLODg/K8n13UQeRWvbLw+55XU4ot6cuNLy6/78l6nHhTXdfqSdufpHj3j7oPuuxxtNOmTW82gAAKYAAQ0MQFQxoQ0A0AAVFDQhhDAAaoAAAAYCE2A5cuna8ktg2IAAAALAQAADoKAQFaQ0gSNIey7hq8IAYbLcLvklgVq+A1slblbLsAlyOr2DW+yH7m7p2AtEilBrllaZ+SGpLkB3FB6nwTTfYehL6pUAXCXKaD04P8wexcWyXKwKUYLvYnkUdoolu6uthbdyKdp8oVR8j1R8D9svgCaQKN3TX7g4MNMmFKg4K0MWj5QCslsbEFAABAgAArMZr6a/mROheSRagBuNdxEUWx2xDjKuUAbP4YqNUsb7sGsfazUZow5PTmpVwejqj1GNatjzLR0dNkg24zm0uxcZ+s/Sz4pY3UG2jLVOO3c9DViSqLsxyJbtRpliZrlTreS3BSg3bVIqSmt5LYzbUnVUZaaRcHNNPTXk74Y1lxf/ABcUZTfLvdM8t77I0w554JpwbXn5LTcPNjyYpuE9TfMkmSpNL/S/HKO/JjxdT06yYk1JfVvZxNK/5W+3aiGacM0lVu1zfJqmsq0tKLm7b4pGSUb3The7XZ+CtLSdNL+Z3x8FTXfalghkxJtYnpayK04nO/V6ffEnkwyV1Lf9P/RXRdRJT0ymoYWtKUo6v2XkpyePJLHlwyir30u0mE9EevUHc+mU7fOtnd0v4hizNKEViyrjU7vyeZPHNP2NST4b7/2M/ct9Di+dhB9PDN6kXcXGXeN20Kag9pw1J7fJ5nQ9XGVYsjT7K9rPQptU64/K7T+CRGWXpopaocS5XP7nmdf+Gy0+rhVpcxXY9fHklCVS9yv90arG574ptf6ZdimPkHGUdmmhHvdf+Hte9wSi+a/KedPoV+XIhGv6cYGuTBLG6Znpd1x9wtIYhkDAQyoaGJD2vbgqKQyUMIYCHYAAWAAJjoGgJAdD0gQVVD07jryAkk+w/sUkD+EAtu4bdmS4zb4GsbfOwDr5Co+RySqkZuMvAF6Ii0REotK5OguLfLAqkuwLT4Fqgu7Inqv4A0c4onXHwZD5Cxp63+lDeSTWyozVR5FqYDk5d2wU5LuCl53Hoi+9ADySargm7L9P/UhODXYCbCxNUCTfCIHyDQmmuzEFAAADsNT8k2FhYep+RWAEAA6EABQWJsBgTYBUopp8lRlGPCBzZCovyP2v4G9MudhaPDQUaV5FQNNCsAGpUICVWijGfDph6U12M0UpyX5mVJrtwVOGh0mVOKeyk3XJxQyOMkzsjl1wXppfJvNc9yM3lb9tbfJGSMWqiqkaZJ17KT8kVp3v9AYxdw2asE41utzWtf3J0NO6MxqtOlzS6TJrjPnZx8o26zFDSs+JuUJ8p9vg5kk95o6OkyuGrHr/AMGe0kypv+uV2u9fD3Q4txrb9eV9zbP08sU3pknF8PsYWk6acbC2tU7amoPJLtqe37HVnisuCGZQUZpVJYmtv0Ry49DlvGKvd3wdvR5Fhm4Rxf4c6Upatl4ESubFOdNrVp/mnJ0jbUpx90l5vhmPWweLM4ZJ5JVxFmD1K7SfeStV8VX3FI6dajajSa89v/R3dF1cskfSnk35i6tpeNjyk1S1XKPbyl/1mkVK9VptPVs+WVI9z1XKHeL81VMmPU5sc6kk15XY5FKVR6had/8ANi223I09SabhLaVfFBl6mLNHLGpLd7NM5uo/D1P3YmckM2THLeVrs3/ydsOp/wBTTXZk5wefPpcsdpwc4+UcuX8PyNasSco/7Hu+u26CVzj7XXlFHy08GXG6lBog97qOieTeMtjkn+HX+bcka/p5gzpydFPFym18GLivlCFQMHFr7AAxpiSb4LUJeCoQFLHL7FqCj8gZUUkaqLl2RaxgY0D0o2e3YlqMuUEZWnwilF+DTQ0qikPSl9TAz0goeTRzgvAnomtppfYCHKMeWQ82+yKeOEeZWK4rsFJZX4QpSm+FRokpLakyJa4P3LYDL3LyXH1K2sqMrfFs01KK97r4AxeOb3ZEoyXKaNn1CvZDWSMudgOY0hk0bNWjVrF/MkQ/SW1N/IU6hL4JnFR+l2Kv5aHGLe1poIyYjf0e9goJdhFrJWUpJclt8LYlxi+9AGqPgWprhiqu9ioCvUa7L9g9WXakTpYiCnkb+rcNOrhogLCm4tdiRqbXceu+UBIi6T4Bwfgi1Ax6X4FVcgNbj0MhsNTXDBDaaJL9S9mhNLsBID2AKhMolc7lJMmLqWgSNHBVyS0lwIUg0vsJgpNcMinpk+w9Nch6kvIa75RfE9HtQNxD2y+GGjyAi8U3CWzaQ0sa5ix+pjXECprf2KGqKbbI77p0Viz44qqo2k9UbjW/c05uZzj2ht5HLK3HQu5emS5qidOJb69wrCTplxk5VFcGjxya2Sd9zKS9PZ/UReu/BKUsXpzX2M541FvVD7rwcPqS7NnZHL6+LeVTjyq+oVNzcSp44q4q1y0+xouohKLUlbW7SRzOpO3tLkvHcJW5JLl/JSY9DBl/j+meKCWPJj+h8t/H/o8/RLV7NVxez08yNtccUo5YpbfT4OvqkuoxevDS8iXvxwT58kK8tRkt4p13jv8A1GtSppypb7bUzVZN2qWpeN7+R+vDmK43aoF0+l6iWCdNvRxKt7Z2a3q9PIra+mT5l3bOL1Vy4ppfHc3xT9SGikpR3TUU20+xU1q8mOftm9L4dmmKDjw00uPhGORXHW4xTT0yXFv/AKyI6XtG1X6V/bkI9KLk40t2uFy/sOOV3u2n5OGMp9py/R/98lZJtJTTdPbwl8fsEemsmqLdKTXNdyZaZx1Q/Y4cOad77ryux0Tx5JL1cVJ8teUFGpPmJlk6eGTdRjYevF7ThUvgNSe8G00VHJk6G70/sZroGt2z0fU2tbijng37lSC1xrplFbB/Ds7vTjPeE19iZYpLcI4/RaXAtM+0LOnUl8g5R5boDmUMj/Koj9GX8xrLJBfmsh294ZF9gI9LJ/Mg9CT5l+wpTzR4VmT6rJF01RFbPG4LZt/c55YsknuzeOVZVvJoTeKPM5Mox/hpvuTLpskeFf2NZ5J/kewo58i+SLWPuX1RYO+yOpzhL89vwZSlFbUwMVFt7s2WbRGpUyHq7KkZOL5sDoeeM1Sai/JhOEuXv8kUy8am3UUF4zA61hxte91L4E8GJ8SZCuaxWbOGNeWw0xlyq+QVjYJnR/D43v60RPFhX/2BbjJTkuGweSXkt4ov6Jp/czlCUeUDwm2+WCYaX4DS/AVSa8lJw8sz0vwPSwkaKcY8b/cHmv6ooz01ywddgRb9J70yXJcJEgAOmKhhaCkFsrVtXbwLUvBAnJ+SbL1LwKk+NgqQG1QiASKSvuSIC9IE2wKQkPfuJSaVA22yKpOwaJTLTsqFS7ienstwewL7kUqfgNPyHuYtLIp0vIan5FQJAPUylJd0JOK7WGpeCoa0v4N8WWMfbexzbPgOC1NyuzJBtWnsYOO+5eHI2nGTNHpaorHHPbuot0X6Tkrb3NNCjxFCqbeydArPRHHvPd+C4ZYQknFUwni7uLMtDTugvmunLjjlXqw2vlGXpaVbdrugwyljnb4fKLyJwdp3B8MqcPGlkjU9TnzH+xp0WafTTdPTGX+ZTa2/QxU6d8M0yJ5Yqdxt8pvfYhXR1nTY8sfWxNKL33mv1fk4fTTaepKXPwdHS9ROLq25P+XGpNL4fY1zYIZ4qeNOM97xzfuaXjb7hXLFKG75W7TdFLLpalFu17pNMycZJ1O9t32a/wC7DSVe52uXvywR3Qyxr1YpVXvVcEZU8barVHz2/wDBhDLLFNSur90lfbsdNQy4abqKVpuTtf05KkY+o6e/6/uarJG9LpRd3UbaX/pI5ZqUJuM71K/h9/3KjkX6Pb/v9hSKnlzYMri3pafCo6em/FcuJr1FGcW97W5i66jDpk6nFXF1d3ba/qjm0uGSUJUmnT+N9yEe9KXTdU03DTa2lEzfSzj78MtaXY8nFNpendPmLuqOvD1U/qjJxmua7lZ3Gl3co7eY+DPNidakdalHqY6nSyLuu5z+v6E9OWL0vuVHMpzxu2mjbH1X+p/ZmzxxyrVgzx//AC0c2XHkg/8AFxWv5ohW0s8Kuv2FGeCe0ptX5MMcsU3Wqvhin07jvF7Abz6GM98GZP4bOTJhzYZU0/uVGofU3E3j1EKUck212kBxxzTWzZetyXZm+TDGStVKPlGa6ST3xy/RkVhKbW1UCyvukzWeLLH/ADMTf2M/Si+U4/cAWVLsNzU1XAfw8atTT+Beg13QPEuKW6ZSzNKnuhJqL9zNP8Cez9r8gZ+pFjU4eScmBw3TUl5RkRY6PVj2RMs8nstvsY2ApFan3dhb7EgmFivUfcUrHcXyUlB/mAyAuWNx35RBFBcckltZAAaeo2Fy7UQFlSK1yRNt9ylJPaSseiL4kBnYxvG0Kn4CgdCDcBNNCK1NC2ZBNgOhBQAAQVYnQgKChFWGxBID2AKmmFMdoLCimEeQtgEXJWjOi0xt32CYzthqY9vAVfBFGoQ9L8DUH32B4kErLSivkbk1wiwqYwZXpvyS5yfcanJfJfE9PTJPY0i5NUyVPyg1FZ1opOHzY/XmtkzLUNqu9hI2j1OTuk0Esinvx8GFitikauRrjy3FwaVdtuDm+WC1eaFI1lFXxVee48UnibppJ7N1dEynqWqUrlwSppc9kUdU8Ota4NrV22VpEqW2qLjiny3bcq+CMWaWNvS+fq+TqU4Z25Yv8PNblKN0muyAyeTH1EU8qUJfllvcvvsZ5sU8M/8AETe9219b/wC/7mk8MsjlLHGfrV/iL+RGeLqFBPtiT5e7k/jcjTPbdSltzOXn4XkrHlnhldVfulF/0Laja9rjKrUeX96/uOKxPad6XLs/qf37/wCxBvPHDrIaou8i3bk6r445OGSlCdTTjL52fbnx9zrw4Ip+rizp/mkpQq1wkle/g6smHDmitc1G1cou1V7357d+4OPNxyqq2fmuODeWnPjt1tHs947P/lhm6HJijKcfdBcu7a2fPkyjKUJqk3v9O/mv+CoM2KUFqdNX9V87tL/Ylydqa2fLo6cc1NPTXuVU1duq/f3MWbplbni2g91F+Ldf0QQsWe5Jv2y8o73lh1ENOSCU/wCZbpnkVvTtfc1xZpY3plwVlrkWbBL8riXDPKva3XeLGsjcbilKL5TM9MXK8ftl/KygnjxZt4e2fdGayZcL0veJckm037JCyOaW6sBrOp8xTIlGNbRVGeuF+6NPyjWGmX0yIJhqg7hKl4Fl9T64ydfBUsT/ACuwjcHvYGceszx2WRtfJf8AFyn9cUzR9NDJbjaMp9OsW8mwvg9jdxSQ1+hneN7EZMbjvF2gR0SxykvbTOecWn7lREZyjwzWOdtVLcLCi2tuwTSXK/UJp8xdoIZmvbNXECKi+GHpt8Grjib22FeKPZt/chUxwvu0N448WJzb+l/oQ5yQPTlilH5XkRSzTqm7Xgl090FUpSXG68DahLyjO2hqT8gVpgu7E9PawuX3JbaYDcfkNkvnyLVfIq2v9OSKLQ00IQFqbQ/U+CBFpFuae1UK2SBCLUvKsHKHggQpGntfAaE+6MwsEXojDeUr+wa12RmAWNNmKVXsqIToblYICRiIoAAIoAel+A0vwAJfIMAKgRa3IKVFTSdIFKuxWxDIuHrYnJt7sQEpANCAqq2Q9XwSAQ7DVQgoB6h2ydgAtTj3Q9SfDMhipGnfcNmQptFppr5KkVjk4vatwnFxfvTtio0io5E9T9yW3yVGSfjb5KttO3Tvklxd1Tv5EnVat14Cx2xzfxCqTUMid6u814JyxjOH8TFQxKPGJPe75Obd01Kq3XwdMcqf/wAi3PLDbS1cX8g4xjb9l057zlzS5Gm5NUpLXslFO1Bc/f8A8FZ8b0+ot5ZXvFK3ExlXv2jSWlcr9V/3uRVp8TUb/NcNmlwr8bnT03VXt6qjN1csl793wcjSdt8WoqaVR/XYJN1eSN6raktr7AenDO9aUqjL+bGm9Kbp38BnhHLjc6Vv3VG32bv95I5oZHkgmpPJKLv09KWulduua3NcOeULSnceJe5LfxH4DMc+TG8eTa2rpNd0nX6cGnT5rioT9y/LJLulsv6mnURjBtpJ45bx7p8pcLyc2SCxZLq43y1yrrjzsUb5caySak0sidaru38nO003jmmpLZWaxlrSjs5JJJJfV3oHpyxUZcrhrlfD+LfJUZQyzxO4v7o6YZ8WZJTTjLs0c8ovib3a58/KMWmnXcEeinFrTl90XxJcr7kShLF7W9UHwzmhmdU2dGHqFXp5VcWGYzy4dauPPg5t4ve0zuyReKpLeD4a7EyrIrTTC5rlWWXd/qaanNVq93+5osF/VBV5TFLporeE7QGDnki61NFRzN7T3Q5bbZI2vPch4r3hK0FOUFL6dhRm4e2XAk+0lT8l02t6kvKAUscZR1Qe/gy4LpwlXYvSprfnySLWUX4YN38FTxThu1t5J+rZ8gJNoLsKfFD0NdgqeBqXncQEDuP8pSlHvEgARdRfFoTh4aJToq7KiblFlKSls+Q+GS41wRTlGuCCoz7MbimriDiLHYilHyFAi00inLG+24SsgLcU+GTQCHS7sVCoKrT4dktNchwUp9nuBAFOF7xJquSKQ3XYdJicWAgHpfgHFrsAgAAqlNhJtvkmg4CQDS8jTABOrdcBQWFoBpgGwAKrCgbFYDoLEBFFhYCFDsLEAoqhBbFuKGIBuuxAhiAC1kaNE1L3J7mA06NZqbjubWdXJU0q2MZYWlcHqXczhlaatWvB0xnGa1XpXaJrGPcc6a3r9Ssc3hyLJBu0bzxKabglGXjyYNape/Zha6NWPHeb1ZTeVbxi6aMWoqSUPU0R9zcttx9Pl9KclojJPZauz8muaE9NZ+pcYy3Uab/oBzp7xk3Ft3JuTtP9BJUnpbT0q0+9vsNu9Uo8fTFbDlVtPi0t3cl9iKFKptxbxTV8WkvjydT51RWiW6jqpRiqVv77nLu4v260k2q5Xyy8Uoxem1LFJ1ut48W6A7MEoZYOClqaX+HSpulsqXmzJpKUoJXTr2q3a79u7HOUoy1erJzq06tb8V/c1zQtKdS0J6W5yvjl/qysuWvTehtpb6L3avZt/sN/VVpNfZRf3Ki/bpXFcK1b+ftuTNVFJ+/EvpbdX8gNStaZWnWy87f7EZcWzlHevAk6S31Rvlcp7b0aRm1G7jqStNurW7COQuM79sv3N3hx54a8Mkpd4swnhyY/rg1+gV04M7j7Jfqn3HLGt3ibT50nGm/2No5HNU3TXDKm4JZMidNtBDI75LjOOX2TajLyzPJinje6teVwEaOfaSteRaMb3Umn8GSlW1ic0nTiBq0++/yZtU/bsNSj2k0/ktNNVJW/KAlZrWme4JQ51UTODXyvJFK9yK6odVHHso618lqfTZvqgov7nBugtirHbkSi9O1djFqmRjyXHRLjt8C1uLp7lqRUoJ7oyaa5NYyi3Sf7mqxRlzJELHKB0S6dR49y+DNwi/KYi1kI0lCiCNVSlfIyLHGVc8BIr2PkIqK3TE4p/STTQGtrwrJakyddBrLSE4sSHqY7silYamOk/uS7QDbYrAGFIAEQUpNcMHK+SQAAUmu4ART1Mam+5ACkXcfAEAKQ0x2SAFCsAAAAACwAAAAABAAEAAAAAAANOgsRVoomwHQECGIAGAhlAOLppiADox5NMlKG8+dzbUuou0o5PKezOJOjaM4vfTRvNY3BPHpVvmzbp8kKbnHXPw90EXHMlBtqS8mD1Ycvtluu6CddGfFki1knoUI8RVb/AKGEXpUd2quVxW6/U6+nePqPbKDySlu9Tqv1MOow5MU3rVOW0dMtqGrms2lSTpOtmnd79xye8rajLe5R4l8bCvTqVVC0nG9xN0lfujvSv6SK6cWZ404zkscN6guU9ufK+DowPGoyk1eJqrhSattq99ntwcKu5aVGclzJ7qtvJrDJPFJTqqf1Y2q73+oRpOM8eRwkpKS3q91xQ4e+4JxU1dOUto7O/wBDW8fU4NWOKuG8lu7bb0xrvsjmaaVStNKk3STpLb+oRG2q4b12bu9+PkUZJL2txXlJOV1x9jbOnlXqPV6itzde1K2kYytN7KMkt+OP7lBmuOX1I37r1Wu9vYazTW8ZtX2sqKU4uFTcZPl8J771/wB7nPvCTi1fwCVq8rb3p/oFRk7j7WZteN0OMqYSFljxL9ysXUSx+17x8M1SWSNd6OScXCTi+UFz12enDOrxfV4MZ4Z8OLTRipOLtOmdMMnrRScqyLj5FpuRztNcoFJrhmrbTqSv4J9PV9D38MLVY8nbn4L9NZF7Hv4MNE4/lZpBtK1afwMZ1E4Si6kqIOhZG1Td+LM5fKoRc1maf5kf9S/qQwTp2iKQ05LhsuUVNao89zK2FxrHLkjxJl+q5LerOe2CYqRvraJahP4ZClfIFSCcHB/BBtGdKpK0TkjFbx4JGs1CdF/WtuSLGmvswJA0rWvkzaaIpqr34AQ0AWVtLklqhBDlFoE/JUZ7U90Nxg+9FEOPgNLK0fyslqS5CiqDUu6Dcq4em46fdf1WQTqXgd32IaaABun2EA7IqQKsBAgEMACwEA7AQAMQxAAABAAAAAxDABAMArZOwQAUPngkpNIG/gaJAAIAYgAYABQDTrgQ9kBvHLJpST93g0yYp5Mcs1JVyc0JuMro6IvTHU3ep8G3PfGEJOLuO1Hp9Pm6fq8fo54wjOK/w2lSv5PNyxcZPZpMm3ytlZFldWfpcvSyVqO26muGYK1FuN1Xu24O/B1Uuog4SkvVeynLsjLLhhkevGn9VKOnaZYl/wBczpqragrcW1yVFwu4asTvaV2iJLS2pLzST4ZopZFL3ZYxbe8Jcc91wRpeLqJ4s6zerCU1utSb7HTnjjdZMTWiSvSkrSW+77bnC1KOyw71d03arn/k36bP6c3jyzisU3/iaHVpL9gNMM1SWX3wTWrffa29/uyMuGWNpPeNJxlxzW7HKMnJLicknVr81tfdUa4ZrLFwnCLtubbkqrb9uAjkW+9OVPm6XfYrND1Y6l9aXlPUh5Mbq01JJUm399qQo77RV/bHz+/3KOZScXurLWl8N/ZmuSEcrdOp35u38/JzTjLHKpxpkXrbHKnvsa5cf8RDVFJZIrdeUc0Zp8m2Obi00/sVnjmaadNUCdO1ydmdKcfVhTT+qPhnNKK5X7Ei5taqfrQt/XHn5I1L80TOMnGSa5RpkprWuH/QtIFJdpv9RqTi7e5iwtkpHT6etasbv4IT7SM45HF2nR0PTnhqj9a5+S1JGMoVut0Q1RopVsx6VJCFjKMnGVo19mX4kZyxyTqrFpkuzRGjljadEtNFKd7SDU12sHqB20Vqi+VX2FKHdO0A00yotcPhmI1Jim4vJBx3W6INYTjxJ0injx8qVhLOsoyceDeLw5I1NNS8mUlX0ozcmOLK2n07SuMtS+DJpocMkovZl+su8Ux4e4zt8UDNPWXZJB6qe0kmBkBcormL/QWm/gKm6K1v7icJLsKmQU3ZNsQ7vkAUmg2fwLdARQ1QDT7MTVAAABAgAAAbdiAAAAIAAGUIBgtnYCAAAAAaTfACAAAYCGigorUuKJ5HVMITrsIvaSJaoauEMQyAAQygHsIYBZrha1LV2Mhx5Kzroy5HnTbjwc/y+DqxZnFOoKnzsYTilK+z4LqZ/hRk4tPx5OyGdOCnka2VQhHZp+ThXyaY8jhLUkrSpWhhuOvLhSUoS0w0pJy5bZzKOibXp65Lm7rnk1xZY49MJu4K5yaW90b5enlnxqvUnk0qXtapJ70VOOOUdqbeLvpdtPnf/gm+VCK4e8uXsaKLXt0v/wDM+Hu+/YiWrR71oj2XzXj5I02hNTWiUoJ25a1/pjsiFk0+3JF2kn9Nfl2M7tWoRjF3Vm0k+oTa92VapSalSUVFEV1anlUpQbbepprfbj/nuY5IKTcquub3qq3/ALo58GR45tUvdSdvbZp/8HZF+q0lq9RcaWt0rt8fC/8AJWZHP2ins2qT4vjav15BpZIaW00uHe6/sv6lZIaZOUYpxf1JfSt+7/QyXa7aX5mrrhW/K8BWM4OE3GXbugjJxezOhxWWGm6mvp1SSS7/AKnKRXTiyK7XDVSiKcdErXHKME3F2mdEJxyRae3/AAaZ3Ixklyv1NMLi3TdX54FOLg6ZlLZk4da5cEobq6MTbD1Dj7Z+6Pg0yY4ZI6obDpZ1yFY5uElJdhSTi6YiNOjIlKpx4f8AQhNrhixyq49mPbjhlZ4r1Z1abtC/icir3avhoFaM5x0yGrkb68eVb41F/BOnHw5NGC2NFJTVPkU3FPFDtMSjX5k0S7i/gE0D05RIcWjWMq+UJ7CGayGm0U0pK0QZa6pT8le2XOzMwLUipRcSWVGXZ8DlB1a3QEAAEU06GSFlqRSm0P1G+UTyLgUhvkQ1vsJkUJja8CDgAAa35Bxa7AIBAAAAGVAAAQAAAAAAFIbVkFKRpCaYjVNMHBMsKyAtwJexItIAAyAbdsQFDuhpNkjtgUqTCS7oWljWyqzSIAck0IyoGIZQAAAOxqxD3KjSEnp0LuzXqNNKDq4rsc8eUdGL0alPIpSfhGmdc33D7lZKcnJKl4J+SNLT2kr5Zv0+eeCacWnBzTlHzRzJvwO9l+oSPTjjwdWozhF4Jy0qnvGT1bv/ANnNm6J41qvWtLaqS3XF/v2MMcoxb1QU9kt9qO/FklJ/w7m3J0oenK4xirbQTjz8sZQnJZlL1Laae1MGnFtOEI87N8bfc6pTU4SSer2yepuuX99zmy4vTlJRjqhckpy21URrNaZI+tc4KOvduEI7RSit/wDciEk4NPaUUlHtuSpNN1Jb39MeVRtp9SXqYqjkTctCf0pRu7/cDfDmhnn6WZRWS6qnJSdpVt+v3Ms2CWFxbunVSku9J1XhGMo64KcE6ik5PzJvsa9P1C0ShKovT2rigkRC7Suvj9rafyPqMbyQeaKdr/M22RpkTjJvRcU3aj2548rYeN6UpY2skePlcpJr+pRwAm07R0dX08cdZcW+GfD8HORXRjyxlHRNX/wKeFte1qS8nOawm/O/ktSTiNElyXjcsUv90Ocr3ZF33B10zxKcG4NSTW3lHI006ZriyODqzXJBZ1qilHKuV5CZ45DT618mbTTpjUmnaI0am0bR05cbjXuXBn7Zq1s/AlLTK9O5UiZJxdMR1XiyRtp/JnLHj/K2If0zU+0t0KSp/BTx+GKnwyKmy1K+SZc8UIEU1TtCavdDjLswaae3AEgU1e6J4IoKhkcflEgBs8ayrVj57oxaadNUxxk4u06N1mjlVZVv/MXqcc4GssDq4PUvgzcWuUSFIEwAKKoa3XyJOh0nwAmmgorcTTAQ1JokCUVr+AJAXSAAAigAAAAAIAAAoAAAio8miADpjP0bMpcgA0+UgAHNoAAAA+4AUX2I7gBrUxpL6TIAGmAAAyoGwAoaBgBUOPJtj+mQAaxnWcyAAmrhrgSAAprlHfjSX4TKSXu1PfuAFxnV9ckopJVUcbXx7Uc/4nt1OSC2jGcqS4QATTGPUNrLJJ0r4/Qptxy6U6i4JtLj6QAjTo6lL+NmqVa4Kv0OPNtkklslJ0gAg78e/SOb3k4Nt93/AJhn1CUOslpWnefG3kANI2xJPp+rTW1J1+h5fYAIYQdwANN48R+zMQArOBG8W9UHYAXE+i6z/OZgAGd61nAuS8nYAB+jF9QwAucTehcnRkS/h06VgBWf1yz5IADDphlrgALiaT+ocvpAAIAAIoAAAvG2pKmzSXLADWcY3rGf1CADLYAAAtfSSgAqJAAMqAACD//Z".replace("data:image/jpeg;base64,", ""), 0))};
    }

    public static /* synthetic */ boolean N(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                view.removeCallbacks(fj.N);
                if (!SN) {
                    i = true;
                    InitOrigin.run(XM.tF);
                    G();
                    return true;
                }
            } else if (action != 3) {
                return false;
            }
            G();
            return false;
        }
        i = false;
        G();
        B(view);
        view.postDelayed(St.N, 400L);
        return false;
    }

    public static /* synthetic */ boolean SN(View view, int i2, KeyEvent keyEvent) {
        boolean z = false;
        if (i2 == 23 || i2 == 66) {
            B(view);
            int action = keyEvent.getAction();
            if (action == 0) {
                G();
                i = false;
                tF = System.currentTimeMillis();
                Runnable runnable = zH;
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
                jA jAVar = jA.N;
                zH = jAVar;
                view.postDelayed(jAVar, 250L);
                if (keyEvent.getRepeatCount() > 0) {
                    N = true;
                }
            } else if (action != 1) {
                G();
            } else {
                Runnable runnable2 = zH;
                if (runnable2 != null) {
                    view.removeCallbacks(runnable2);
                }
                if (System.currentTimeMillis() - tF >= 250 || N) {
                    z = true;
                }
                if (z) {
                    G();
                    return true;
                }
                i = true;
                try {
                    try {
                        InitOrigin.execute(IH.N);
                        t0.post(rg.yq);
                        return true;
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } catch (Exception e2) {
                    System.out.println(e2);
                    tF = 0L;
                    return true;
                }
            }
        } else {
            G();
            tF = 0L;
        }
        return false;
    }

    public static void drivePort() {
        int i2 = yq;
        if (i2 < 6677 || i2 >= 7000) {
            for (int i3 = 6677; i3 < 7000; i3++) {
                if (V3.q("http://127.0.0.1:" + i3 + "/proxy?do=ck", null).equals("ok")) {
                    SpiderDebug.log("Found local server port " + i3);
                    yq = i3;
                    return;
                }
            }
        }
    }

    public static Object[] fetchFileWithTimeout(final String str) {
        Object[] M;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future submit = newSingleThreadExecutor.submit(new Callable() { // from class: com.github.catvod.spider.merge.qI
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                int i2 = ProxyOrigin.Gc;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    Response M2 = C0068Pe.M(str2, Rc.M(A4.i()), 5);
                    if (M2 != null) {
                        InputStream byteStream = M2.body().byteStream();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                        ScheduledFuture<?> schedule = newSingleThreadScheduledExecutor.schedule(new g1(byteStream, 6), 5000L, TimeUnit.MILLISECONDS);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = byteStream.read(bArr);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr, 0, read);
                                if (System.currentTimeMillis() - currentTimeMillis > 5000) {
                                    throw new IOException("Total timeout exceeded: File download took too long");
                                }
                            } else {
                                schedule.cancel(true);
                                newSingleThreadScheduledExecutor.shutdown();
                                Object[] objArr = {200, "image/*", new ByteArrayInputStream(byteArrayOutputStream.toByteArray())};
                                M2.close();
                                return objArr;
                            }
                        }
                    } else {
                        if (M2 != null) {
                            M2.close();
                        }
                        return null;
                    }
                } catch (Exception e) {
                    SpiderDebug.log("Error: ");
                    throw e;
                }
            }
        });
        try {
            M = (Object[]) submit.get(6L, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            submit.cancel(true);
            SpiderDebug.log("Request timed out: ");
            M = M();
        } catch (Exception e2) {
            SpiderDebug.log("Request failed: ");
            M = M();
        } finally {
            newSingleThreadExecutor.shutdown();
        }
        return M;
    }

    public static String getFileUrl() {
        Gc();
        StringBuilder yq2 = by.yq("http://127.0.0.1:");
        yq2.append(yq);
        yq2.append("/file");
        return yq2.toString();
    }

    public static String getInternalIP() {
        String str;
        try {
            int ipAddress = ((WifiManager) InitOrigin.context().getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
            if (ipAddress == 0) {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                loop0: while (true) {
                    if (!networkInterfaces.hasMoreElements()) {
                        str = "";
                        break;
                    }
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            str = nextElement.getHostAddress();
                            break loop0;
                        }
                    }
                }
            } else {
                str = Formatter.formatIpAddress(ipAddress);
            }
            return str;
        } catch (Exception e) {
            return "";
        }
    }

    public static String getInternalUrl() {
        Gc();
        StringBuilder yq2 = by.yq("http://");
        yq2.append(getInternalIP());
        yq2.append(":");
        yq2.append(yq);
        yq2.append("/proxy");
        return yq2.toString();
    }

    public static String getOwnProxyUrl() {
        return getOwnProxyUrl("");
    }

    public static String getOwnProxyUrl(String str) {
        drivePort();
        boolean equals = str.equals("");
        String str2 = "/";
        String str3 = "http://127.0.0.1:";
        if (equals) {
            StringBuilder yq2 = by.yq(str3);
            yq2.append(yq);
            yq2.append(str2);
            return yq2.toString();
        }
        StringBuilder yq3 = by.yq(str3);
        yq3.append(yq);
        yq3.append("/proxy/");
        yq3.append(str);
        yq3.append(str2);
        return yq3.toString();
    }

    public static String getOwnRedirectUrl(String str) {
        return getOwnProxyUrl() + "?do=" + str + "&type=302";
    }

    public static String getRedirectUrl(String str) {
        return getUrl() + "?do=" + str + "&type=302";
    }

    public static String getUrl() {
        Gc();
        StringBuilder yq2 = by.yq("http://127.0.0.1:");
        yq2.append(yq);
        yq2.append("/proxy");
        return yq2.toString();
    }

    public static void getan() {
        try {
            if (Pan.Nl == null) {
                Pan.Nl = new FA();
            }
            Activity activity = InitOrigin.getActivity();
            String packageName = InitOrigin.context().getPackageName();
            boolean SN2 = HE.SN("danmaku_load");
            boolean SN3 = HE.SN("danmu_load");
            boolean z = InitOrigin.context().getSharedPreferences("spUtils", 0).getBoolean("DAN_MU_SWITCH", true);
            String str = "com.hisen.android.tv";
            String str2 = "okys";
            String str3 = "fongmi";
            boolean z2 = z && !packageName.contains(str3) && !packageName.contains(str2) && !packageName.contains(str);
            if ((SN2 || SN3 || z2) && Pan.Nl.tF()) {
                new Thread(IH.SN).start();
            }
            ArrayList arrayList = new ArrayList();
            View decorView = activity.getWindow().getDecorView();
            String str4 = "刷新";
            String str5 = "重播";
            String str6 = "弹幕";
            ArrayList arrayList2 = new ArrayList();
            q(decorView, new String[]{str4, str5, str6}, arrayList2);
            if (!arrayList2.isEmpty()) {
                ViewParent parent = ((View) arrayList2.get(0)).getParent();
                ViewGroup viewGroup = (ViewGroup) parent;
                if (parent instanceof ViewGroup) {
                    boolean z3 = parent instanceof ViewGroup;
                    String str7 = "弹幕云搜";
                    if (z3) {
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            View childAt = viewGroup.getChildAt(i2);
                            String B = B(childAt);
                            if (B.contains(str7)) {
                                break;
                            }
                            if (B.contains("选集")) {
                                arrayList.add(childAt);
                            }
                        }
                    }
                    if (SN2 || SN3 || z2) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            View view = (View) it.next();
                            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                            int indexOfChild = viewGroup2.indexOfChild(view);
                            TextView textView = new TextView(view.getContext());
                            TextView textView2 = (TextView) view;
                            textView.setText(str7);
                            textView.setTextSize(0, textView2.getTextSize());
                            textView.setTextColor(textView2.getTextColors());
                            textView.setTypeface(textView2.getTypeface());
                            textView.setLayoutParams(view.getLayoutParams());
                            Drawable background = textView2.getBackground();
                            if (background != null) {
                                try {
                                    Drawable newDrawable = background.getConstantState() != null ? background.getConstantState().newDrawable() : null;
                                    if (newDrawable != null) {
                                        textView.setBackground(newDrawable);
                                        textView.post(new RunnableC0083b(newDrawable, textView, 2));
                                    } else {
                                        KJ(textView, background);
                                    }
                                } catch (Exception e) {
                                    KJ(textView, background);
                                }
                            } else {
                                textView.setBackgroundColor(0);
                            }
                            textView.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                            textView.setGravity(textView2.getGravity());
                            textView.setFocusable(true);
                            textView.setClickable(true);
                            viewGroup2.addView(textView, indexOfChild);
                            textView.setOnTouchListener(Ud.yq);
                            if (packageName.contains(str3) || packageName.contains(str) || packageName.contains(str2)) {
                                textView.setOnLongClickListener(p7.yq);
                            }
                            textView.setOnKeyListener(View$OnKeyListenerC0152nV.yq);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            SpiderDebug.log(e2);
        }
    }

    public static Object[] jiexiM3u8(Map<String, String> map) {
        String str = "url";
        String str2 = map.get(str);
        String str3 = "cacheTime";
        String str4 = map.containsKey(str3) ? map.get(str3) : "70";
        String str5 = "thread";
        String str6 = map.containsKey(str5) ? map.get(str5) : "true";
        if (str2.contains("m3u8$")) {
            str2 = str2.split("\\$")[0];
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "200");
        jSONObject.put(str, getOwnProxyUrl() + "proxy?do=m3u8&thread=" + str6 + "&cacheTime=" + str4 + "&ad=false&url=" + URLEncoder.encode(str2));
        return new Object[]{200, "application/json", new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"))};
    }

    public static Map<String, Double> parseToMap(String str) {
        String[] split = str.split("\\n");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < split.length; i2++) {
            if (split[i2].startsWith("#EXTINF:")) {
                double parseDouble = Double.parseDouble(split[i2].substring(8, split[i2].indexOf(",")));
                int i3 = i2 + 1;
                if (i3 < split.length && !split[i3].startsWith("#")) {
                    linkedHashMap.put(URLDecoder.decode(split[i3].trim().split("url=")[1]), Double.valueOf(parseDouble));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] proxy(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.ProxyOrigin.proxy(java.util.Map):java.lang.Object[]");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    public static Object[] proxyDrive(Map<String, String> map, String str, Map<String, String> map2, String str2, String str3) {
        char c;
        Object[] M;
        Response response;
        String str4 = "do";
        if (map.containsKey(str4)) {
            String str5 = map.get(str4);
            Objects.requireNonNull(str5);
            switch (str5.hashCode()) {
                case 2702:
                    if (str5.equals("UC")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3176:
                    if (str5.equals("ck")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96670:
                    if (str5.equals("ali")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3322092:
                    if (str5.equals("live")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 95351033:
                    if (str5.equals("danmu")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 106910760:
                    if (str5.equals("prPic")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 107940278:
                    if (str5.equals("quark")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 2084791224:
                    if (str5.equals("noDanmu")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str6 = "url";
            switch (c) {
                case Gc /* 0 */:
                    return Cloud_uc.proxy(map);
                case 1:
                    return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
                case 2:
                    return Cloud_ali.proxy(map);
                case 3:
                    return proxyLivelist(map);
                case 4:
                    return new lW(map.get(str6), map.get("act")).Dr();
                case 5:
                    String str7 = map.get(str6);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashMap<String, String> yq2 = Rc.yq();
                    yq2.put("Range", "bytes=0-");
                    try {
                        Response M2 = C0068Pe.M(str7, yq2, 5);
                        if (M2 == null) {
                            M();
                            if (M2 != null) {
                                M2.close();
                                break;
                            }
                        } else {
                            try {
                                long parseLong = Long.parseLong((String) M2.headers("content-length").get(0));
                                InputStream byteStream = M2.body().byteStream();
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = byteStream.read(bArr);
                                    String str8 = "image/*";
                                    if (read != -1) {
                                        byteArrayOutputStream.write(bArr, 0, read);
                                        if (System.currentTimeMillis() - currentTimeMillis > 5000) {
                                            byteStream.close();
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Q.yq("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDABsSFBcUERsXFhceHBsgKEIrKCUlKFE6PTBCYFVlZF9VXVtqeJmBanGQc1tdhbWGkJ6jq62rZ4C8ybqmx5moq6T/2wBDARweHigjKE4rK06kbl1upKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKT/wAARCAFyApIDASIAAhEBAxEB/8QAGgAAAwEBAQEAAAAAAAAAAAAAAAECAwQFBv/EADcQAAICAQMDAwIEBAYCAwEAAAABAhEDEiExBEFREyJhMnEFQoGRFFKh0SMzYrHB8OHxJENykv/EABcBAQEBAQAAAAAAAAAAAAAAAAABAgP/xAAdEQEBAQEBAQEBAQEAAAAAAAAAEQExIQJBElFh/9oADAMBAAIRAxEAPwDw4asWTTOLXZxexn1GL05JreElcX5PV6rol1GNZsCWqrcaV9v7nDiqcZdPkpN7pulT+X4+x23GM1xgVODhJxfKJMNAAAAAAKAYgAY03VXsIChgAFQAAAMaEADAAKhjbtt0lfgkYAMQBDGIAhjsQFDG6va6+SRhDAAKBDEMIYACAY0JDQDKQqKSCGkWiRgUMlDsoqxX9ibCwKsa2JQ7AtPe2rGiUUgNIGsmRAJMIL3IkxkNgJisGxWFWmOXBCZV2giGKxyJCq5Ja3CwbsCGIqX2JYBY7JCyBiCxADJZQrAQhkhTEFgBLByenTe13QxMCQHQgEIbQiKQDEFIBgFelDqJYsuuHZ3LVJ6dX378G2bFj6mMZNPVwpX9lvv99jbrekU8TnGMo44qnGT70zzYSn0uRqWOWNP5rvzuRMT1vTyeJZWvcvqf6J/8nnnv9N1OBz9PMlFOk+OP0/3PP/FPw6XR5NUVqwy+mX/BnWvnfxwAAEaAAADEMRQwAAGAhlAAAEAxAAxiGEAxAUMAAIYCGUAxAEMAABjEBUMYgQRQANANDSBDQDRSJGEUhiQWA7AVgAxoSAoqwQkMCkXHkzRpHkDWPAmwvYhsIdkthZLATYCYBTspMzKTAciGW+CGAhpksAGyWOxMCWIbJZA7CyRgOxCAKYmAmACGJgIBAACGIAE0MAqRFMRFIBgB9LilCaXU44WmpNxk093Ln+px9d0sFJvVJztXKSelvmji6DqcnTSTfugkk41ytSex7j98FOD143c2qXt2dfJniPn1d+nLIpPtap/uzs6TNeN9PJe17emtrt8N9vkOr6eeJ1makpPiOPdb7Lbyc8bpJfXHiKdtuv8AyVWfV9Il/iY2qe9pbcW38bukcMk4umqfyew57OTipLZZIJrtx2+Oxz9R0yyQ9THJTj/Nv+rexNxrNecA2muRGWgAxFDALdUAAMQAMAAqAAABjrev9hAAwACoYCGADEAQwACgGIYQDEMIY0JDRUNFIQwGMQwGgEh2A7AVjCAYhrgCkAvsMARRI0UUjSJmjSIFNkNjbJCHexLATYUMQCABkhYFpiYkxsCVTat0r3Yns3TteRslsgLHZIANkMoTAliGxMKLCxAA7CybGACYWAAJgACAAABABFAgAKAAAN1CvpkpVyn23OvoOrl0s5R06sc+Uuas5dMZVLFLVsr7UytCapOpJd/uWJXu5odPmx3HCmmpNNKtl2Z5FSxS0v8AL+Vbuv1fGx1dFmnjuOXT6c7U3W63/cf4p0qyRl1KyK1tGMdtvv8AuZ4VjipxqCbVaZY47utk9/LbZjL1OnyyeOskHvS2/dGePLkxtST1OPDgrae/f7s71jh1mFvFWqD+nit6X67cFHJ1PS4urTydP7cl7xbbvnb9keXKLhJxkqaPRTlCVZIuS7t7SXF/7l9Rjj1MbdOfMZKlfL38UZ3G815Qi8kHB+U+H5JI0QxDAAEMBgAFAAAEAxDACoSUZJuKkvDJGVAMQAMAAIYCGUAwAIaGJDKhjQhhDGSNc0AxiQwGIAAYyRoCkMkYQxklAMaENFFI0WyM48lsBNiBkgU2SAmAgARAxCsLAuo6L1e6/prt5BMmx2uwAyGUyQFYgYBTsLEACYmNiYCEMQCAYgABAAxAAAAAAhDERQACCmAgArDmUWovaLa1Ub65QinF6oStq+ys4TXFl0pqScrVL4Jmtb8vQxzUW522nqvT+nY9bDPFng45l61qTTlwltvueA7hOSkk95d6Z19L1ajKmk4vZqUvgu+sQuuwTw58kk1LHqaXuSj+y+5hizSwZFPDJKXZRT3PoM2FfiHTLJjuUd3GqTu0eDkjPHklhy6tvORbEzR6Clj6+KnhahmVXjuk3tx445OZ4tLcWmndU0l+lcLvucklLHNVSfCSfB14fxCGRLH1idPaOat/1/cow6jGssHOb99+58tv4XbsefOMoScZKmj3OqwTwT9VO4vdSi61LfhrfhI4Or6a4a4R/wD5Tf33ZnW/nXCIYiNGAhgAxAAwACoAAAGAAUMAAIYCGEAxDKGt+4AAQ0MAKgGhDCGMQAMdkjAYCGAxoQAUMlFAAxDCGNCQ0BceRtiQmygsBWAA2LZ3vVL9wYmQAgEAAArAYybBMC7JYAwJEMQUCsBAUJiAAEMTAQhiAAAAABBZFMBCYDEAAAhgFIBgBiBq1Ga4pmcotcmY3W2J+pH02lsm7bKa0t1iUvm/g5k6OpackddLXfC7bFxNdn4b+IZunyaNakpJJLwex+IdHi6vEsuOS19r4kfM6pKriorbdco9T8N6vHBK28tUoxm/pfwNxnXNKGiTw5fY+K00/sc+XFKHbni+x7XVaZKKyeplxP6csItNbva/2OXJD0FpySjPG/asid2/Bc1GP4f1ixr+Hz+7ppbNv8jdK1/Y3z4H0+TdaoTWzrlbbf1OfL0cZb4n9ovZs7OhzPLj/hOpT1R3i12+/wCxIV5PWdM8b9SG+N91wmcp708Lx3CcfUxvart+FXzZ5fV9G8D143rxPiSd19ybjebXIMAI0AAAGAbV3sCgAACAYhgNVvYCGVDAQwgGIZQwEMIaAAKhjQgCKAkYDAAAYxAAxiGgGhi7DAqnV1t5ASBBFD27OxIaAqxMGxMoAFYWQDEDEAgAQBYAIKBiACkwEAASNiAQAIBisLABiEAAxDYgAQxEUCAAoAAAAAAAAAAAAA1WPFlScJKMu6Yn007r6l8HMtjSGWcVUZMlWaJ4Jw/KyISnB2rRqupyx/Nf3HLPHIqcEh4t1pBwzNekown/AC1zsViema9bHKS23iqOeWJxjrXBri618ZlqXlc8Uip3j0sHUU1jlijLp2ktM3wvKRbc+lhcXLL0slUakouEd9qT+25ljbyYv8PTOtlJLfaO48Us+J6G5KT+mbpcLgbjFL0tUHl6aUZR70nt8K3zwKGZW1OGye97Nhj6jG8rlqj0/UL83MeF2vY6cmLHn2lH08kfzR324tvv2/cU3G9rNjuErlVq+Xz/AF3ObLj0puHujw4VtW6pJcsiEZ4cjjJpvlS1cP4OrHmxzlpzScJ/zxWz/wC/8geF1fSxjeTFx+aD2cf0s5D6fqehyKPq4oJqrlGMvZLy67ng9d0zwZE4prHPeN9vgy6ZrmAQyNAAAoYA23u3YBAMQwAYAVDALvlgEAxDsAGIfYqAYgAYxAVDAACGhiGA0AhgNK+BoSBAMaEMCgEhhDRRKKAGJgybAdgIABiBiAACxAAN2IAoABAUBI7AYmFiYAIGIACwEA7CxAAAAAAhiIpAABQAAAAAAMBDCEAAFZJlpJ8C0J/SyXFoy31pLHJR1MzexcJtPd7Gj0ZeVT7MqWMseSUX5T5TNJrHVxsylFxdBB0yG5+t8GXJgnrxSp1T+x6c5fxWGWaGlSpuSr7JL5PK0xauOzNulyL1Vqk4tO14NMa6+ojHPBzTqSuNLvwiMHUSxy0uskNX0SV/mXb9BzaxvXF9qblvqbfgwn7ZLdNbb9v27lTHpSayYllhP/DdW5ypxb24/ciGZS/w5yvb2zitn+5x9N1WTp5KUdnStNcqn2X3O/JhXUYnm6aTkqtrJkt49vHyTixv0nULF7NcUuz1HTnw9L12B49eOGVu00u548JYepk8WSCxZ02qe1u/9yk54pqLmozX+nn/AMjcpxj1n4P1PTt/4LmvMFZ508Tg6lGUfuqPp11C6nFGepRy8Nrbc4+pjktpNV45r+v+5M/6f08LR4YjtyYoZPpjol2rdM5ZRduMlTQjdQANU6AigYhgMBDKgGIAGAAEMAAoYCGEAxDCGCACgKJKCAYhgCGhDAYxABQyRoCkMSCwgZLBsQDsBAACCwv4CkFgIAABMBhYgAYCABgJMYCExiYCAAAAACABfIAFAAkBQCGACChgQKgoGxWA6EG3dg2gpWAWAGbTQ1N8M0tpdmiXpfKokaqS4vUlFC9nyNJfle4TVeo8e00pfcHng/8A6khTg9GuRnqS4QMbJXun+gOrtqn5Rkp070m0c0e8C1Nx3dLkhmitSUpw3j9yJ9NPTFRxpyStzk9l8HPFJSWTBPS/DO9Slmi8k5zUttUI73+hWXm1XlRWzlW6dcG/S9Tl6XIpQaTde1/S1XcfUR90cnpSV0kq2f3MEoqNxuWO05bcEar2J+j+JwhOEU8qSWl7S7XK/wDvcnC4Z8SxZJSTS9rlyvCvvwzzMGaWKSnCV8Xu9lfB6mPPj6tJtNz5aTqe3Fdn+pE1ShkwzcMrlUtlNJOnvVmkMrd48ylF8XJbP+o8OWK04p5U47xqcar+b4/U0y9DCcFkxRUJ13eqIqRzdR+Hxy3PC4qXeL/7sjz83SSdKbUcn5fMl+x6cYzjWp//AJd2pfZf3CTlJ6JpttVplzL7eCl14EsVr2vdGNU6Z63V4YuWtR9KfeDaf7HDnxtPdU+w3Gs+nOA2qEZbMAABgIZUNAIAGMQBDGICoYAADGJDKgGhDCGMQAMbVCGADEMBjRJSAYMBMIQhiAAEABYWIAoCxWABYCCwGArEBQEgBQEjsAEUKgEAxAAAAAAUAUWAUAQBYCCixMdWPTsQQBemyXF+AtSBSg/sPTFcsKgCvaAGakytSfJmMy1F6U+GJpxYkaRlXO5UVjak0pv2k5McNT0ukUoxfDpl6Lx6VFyZWa53F8xaf2JUmnuVK4OnGmNShLlUzLRxae90dPTdRLDNSWSqORwV7MWn5LUma+gh6XWY24xeTJL6o6qR5WfHLBlSajt9NK0zDBmeCalBu0e1DJi/FMDjJacqXnn7FZkeU4qael6J76o8JiUrlv7Xf2SRplwywZNEovZ/Suf3oTjHOrTua3l5B1uuoytVqTT293Gnx5o6ej/Fli9mXHKClbel7fp/Y8yM54nurT/VpI3U+nzRqaq3Sd7pDcq8e/Uc0PVw5FOElb0reKqqSfBlPNPHSySWib9ktG/2Z5/Sp4Pz68cndvtXc9NXlWictSyL6kpX8GeIic4zuHUYMbhXPEv6bnB1nQenFyxN5cP290ToyLL0eV4pwxzlHeLct68m+HqFkfpybcvhcP8AsaR83mxuL/58mJ7/AOIdEm24xSfOlPn5R4mWGlk1v51mMQEaMYgKhgAAMBDCAYhlDAACGuABDKgGIaYQwAEBUnqd0l9gEMAAAAY0IYDEArABAIBiAAATEAAACAYgAAAAp1fYAAAABoQ0gGDGAEjodUKwCgHuJqTAWoNQODDSwpWOmytorcl5PCANL8hSXIrsLAHLstiW2NkkU7Yan5CgSAG2+5LL2D2d9gMwKqIEVkABsZbNAKhqu7CGmbYcrhJSXYyWjuUtPY1jOujLinlxvLdrwc3pp/B19N9VSmlF8kdZ0vpy1Qlqi/BdTN/GPoS7bk+jLvsTcl3aGpOeze/knjXorT2svFlnjkpLZonePyG8gj11lx9fiqcfTmlWq7X6nFkwNSqKba4UVRhimoSq5V8M7Jzjkj7p5nk4iVnjK5y2mql3fhcBHHGTtLRJ7Rrh9mKUmm4ZYuNcvuS5S/LGnLhVtRRsoTx3o37U92vk6MHVzVQnNqLftk5aV+pwxyyreTpbLemmaN8p079qaWzCPZjPH12L08sMUM0PpTd6kv7HJKD6eThO8UU6q21L+xHS5VqjOLucHWO0tzszKPqaMmN01cHK1t3W/NGc8NbYMznj0ZKtdtXBy/iP4dDLF58DTv6q3RMFkxSvDN2nwu7fx2O/pM66hPjWtpRTbTKPlsmCUJVsQ4yXKPe/Evw6ak5447fHc8ecZK9mI1n05xmja7olxXb9iRqpGICBjEMoBiAIYxDKgKJGEMAQFDQxFBAMAABiGADEAAIGIAAQAAAIABtbUvuIAAAAAAAAAGkPgBUHA9xpASk2VQ+CdTAeyHaEnaE0wG2iWx6WJqgFbDU/IMkKdj1vySNKyAsRVLuwuKASQ6XkWoNQFem3wNQ07sjU/Im2wKlJdiVJppp7oKY1Fd2FSDi/A3XYWpruFKmAan5Ah6jT8oGqFYWZbAhpD0sBKr3dA227fJWh0JxaEKFJo7ulzqcPSnG72RwFQnKDTTpouam5W/U9PPFN7e0523wepjlHq8CjKSU0jjzYVjlTV/JrcZz6/wBYRbRSytvhC9OUt0g0vwT1fGiyQe2mn5OnBJ/T6+nwcNafuVGTi0+5am47M2PUlu8mZu/JyqbV3p37eDuwdVLLFvRBZKq+LMup6eMJRcMqnJrdBnPPNc+pXs0nFbUuTSM9K0yjaXKk+4o4JVTft5fwyvRlBq5RTrUnzYXY0UY3rjLdKotKtz0OmnDN076eUovNBXqk+UeZHXDepbbvet/J1dJ1cseSChGKl9U5N1a+5WW69RbxjSf5XJbfp5NYZMUpJuoyj/NvS/48EdTkcHLTKlzPSlbXZp0Y3NtWk3tpale/an/VkHudNkUoVs1Xuilx8rycn4h0LT1490+Tj6fqHBqST558/t8Wz18HV6l9Sare3dE9zivm8uFO24ST77HLODg/K8n13UQeRWvbLw+55XU4ot6cuNLy6/78l6nHhTXdfqSdufpHj3j7oPuuxxtNOmTW82gAAKYAAQ0MQFQxoQ0A0AAVFDQhhDAAaoAAAAYCE2A5cuna8ktg2IAAAALAQAADoKAQFaQ0gSNIey7hq8IAYbLcLvklgVq+A1slblbLsAlyOr2DW+yH7m7p2AtEilBrllaZ+SGpLkB3FB6nwTTfYehL6pUAXCXKaD04P8wexcWyXKwKUYLvYnkUdoolu6uthbdyKdp8oVR8j1R8D9svgCaQKN3TX7g4MNMmFKg4K0MWj5QCslsbEFAABAgAArMZr6a/mROheSRagBuNdxEUWx2xDjKuUAbP4YqNUsb7sGsfazUZow5PTmpVwejqj1GNatjzLR0dNkg24zm0uxcZ+s/Sz4pY3UG2jLVOO3c9DViSqLsxyJbtRpliZrlTreS3BSg3bVIqSmt5LYzbUnVUZaaRcHNNPTXk74Y1lxf/ABcUZTfLvdM8t77I0w554JpwbXn5LTcPNjyYpuE9TfMkmSpNL/S/HKO/JjxdT06yYk1JfVvZxNK/5W+3aiGacM0lVu1zfJqmsq0tKLm7b4pGSUb3The7XZ+CtLSdNL+Z3x8FTXfalghkxJtYnpayK04nO/V6ffEnkwyV1Lf9P/RXRdRJT0ymoYWtKUo6v2XkpyePJLHlwyir30u0mE9EevUHc+mU7fOtnd0v4hizNKEViyrjU7vyeZPHNP2NST4b7/2M/ct9Di+dhB9PDN6kXcXGXeN20Kag9pw1J7fJ5nQ9XGVYsjT7K9rPQptU64/K7T+CRGWXpopaocS5XP7nmdf+Gy0+rhVpcxXY9fHklCVS9yv90arG574ptf6ZdimPkHGUdmmhHvdf+Hte9wSi+a/KedPoV+XIhGv6cYGuTBLG6Znpd1x9wtIYhkDAQyoaGJD2vbgqKQyUMIYCHYAAWAAJjoGgJAdD0gQVVD07jryAkk+w/sUkD+EAtu4bdmS4zb4GsbfOwDr5Co+RySqkZuMvAF6Ii0REotK5OguLfLAqkuwLT4Fqgu7Inqv4A0c4onXHwZD5Cxp63+lDeSTWyozVR5FqYDk5d2wU5LuCl53Hoi+9ADySargm7L9P/UhODXYCbCxNUCTfCIHyDQmmuzEFAAADsNT8k2FhYep+RWAEAA6EABQWJsBgTYBUopp8lRlGPCBzZCovyP2v4G9MudhaPDQUaV5FQNNCsAGpUICVWijGfDph6U12M0UpyX5mVJrtwVOGh0mVOKeyk3XJxQyOMkzsjl1wXppfJvNc9yM3lb9tbfJGSMWqiqkaZJ17KT8kVp3v9AYxdw2asE41utzWtf3J0NO6MxqtOlzS6TJrjPnZx8o26zFDSs+JuUJ8p9vg5kk95o6OkyuGrHr/AMGe0kypv+uV2u9fD3Q4txrb9eV9zbP08sU3pknF8PsYWk6acbC2tU7amoPJLtqe37HVnisuCGZQUZpVJYmtv0Ry49DlvGKvd3wdvR5Fhm4Rxf4c6Upatl4ESubFOdNrVp/mnJ0jbUpx90l5vhmPWweLM4ZJ5JVxFmD1K7SfeStV8VX3FI6dajajSa89v/R3dF1cskfSnk35i6tpeNjyk1S1XKPbyl/1mkVK9VptPVs+WVI9z1XKHeL81VMmPU5sc6kk15XY5FKVR6had/8ANi223I09SabhLaVfFBl6mLNHLGpLd7NM5uo/D1P3YmckM2THLeVrs3/ydsOp/wBTTXZk5wefPpcsdpwc4+UcuX8PyNasSco/7Hu+u26CVzj7XXlFHy08GXG6lBog97qOieTeMtjkn+HX+bcka/p5gzpydFPFym18GLivlCFQMHFr7AAxpiSb4LUJeCoQFLHL7FqCj8gZUUkaqLl2RaxgY0D0o2e3YlqMuUEZWnwilF+DTQ0qikPSl9TAz0goeTRzgvAnomtppfYCHKMeWQ82+yKeOEeZWK4rsFJZX4QpSm+FRokpLakyJa4P3LYDL3LyXH1K2sqMrfFs01KK97r4AxeOb3ZEoyXKaNn1CvZDWSMudgOY0hk0bNWjVrF/MkQ/SW1N/IU6hL4JnFR+l2Kv5aHGLe1poIyYjf0e9goJdhFrJWUpJclt8LYlxi+9AGqPgWprhiqu9ioCvUa7L9g9WXakTpYiCnkb+rcNOrhogLCm4tdiRqbXceu+UBIi6T4Bwfgi1Ax6X4FVcgNbj0MhsNTXDBDaaJL9S9mhNLsBID2AKhMolc7lJMmLqWgSNHBVyS0lwIUg0vsJgpNcMinpk+w9Nch6kvIa75RfE9HtQNxD2y+GGjyAi8U3CWzaQ0sa5ix+pjXECprf2KGqKbbI77p0Viz44qqo2k9UbjW/c05uZzj2ht5HLK3HQu5emS5qidOJb69wrCTplxk5VFcGjxya2Sd9zKS9PZ/UReu/BKUsXpzX2M541FvVD7rwcPqS7NnZHL6+LeVTjyq+oVNzcSp44q4q1y0+xouohKLUlbW7SRzOpO3tLkvHcJW5JLl/JSY9DBl/j+meKCWPJj+h8t/H/o8/RLV7NVxez08yNtccUo5YpbfT4OvqkuoxevDS8iXvxwT58kK8tRkt4p13jv8A1GtSppypb7bUzVZN2qWpeN7+R+vDmK43aoF0+l6iWCdNvRxKt7Z2a3q9PIra+mT5l3bOL1Vy4ppfHc3xT9SGikpR3TUU20+xU1q8mOftm9L4dmmKDjw00uPhGORXHW4xTT0yXFv/AKyI6XtG1X6V/bkI9KLk40t2uFy/sOOV3u2n5OGMp9py/R/98lZJtJTTdPbwl8fsEemsmqLdKTXNdyZaZx1Q/Y4cOad77ryux0Tx5JL1cVJ8teUFGpPmJlk6eGTdRjYevF7ThUvgNSe8G00VHJk6G70/sZroGt2z0fU2tbijng37lSC1xrplFbB/Ds7vTjPeE19iZYpLcI4/RaXAtM+0LOnUl8g5R5boDmUMj/Koj9GX8xrLJBfmsh294ZF9gI9LJ/Mg9CT5l+wpTzR4VmT6rJF01RFbPG4LZt/c55YsknuzeOVZVvJoTeKPM5Mox/hpvuTLpskeFf2NZ5J/kewo58i+SLWPuX1RYO+yOpzhL89vwZSlFbUwMVFt7s2WbRGpUyHq7KkZOL5sDoeeM1Sai/JhOEuXv8kUy8am3UUF4zA61hxte91L4E8GJ8SZCuaxWbOGNeWw0xlyq+QVjYJnR/D43v60RPFhX/2BbjJTkuGweSXkt4ov6Jp/czlCUeUDwm2+WCYaX4DS/AVSa8lJw8sz0vwPSwkaKcY8b/cHmv6ooz01ywddgRb9J70yXJcJEgAOmKhhaCkFsrVtXbwLUvBAnJ+SbL1LwKk+NgqQG1QiASKSvuSIC9IE2wKQkPfuJSaVA22yKpOwaJTLTsqFS7ienstwewL7kUqfgNPyHuYtLIp0vIan5FQJAPUylJd0JOK7WGpeCoa0v4N8WWMfbexzbPgOC1NyuzJBtWnsYOO+5eHI2nGTNHpaorHHPbuot0X6Tkrb3NNCjxFCqbeydArPRHHvPd+C4ZYQknFUwni7uLMtDTugvmunLjjlXqw2vlGXpaVbdrugwyljnb4fKLyJwdp3B8MqcPGlkjU9TnzH+xp0WafTTdPTGX+ZTa2/QxU6d8M0yJ5Yqdxt8pvfYhXR1nTY8sfWxNKL33mv1fk4fTTaepKXPwdHS9ROLq25P+XGpNL4fY1zYIZ4qeNOM97xzfuaXjb7hXLFKG75W7TdFLLpalFu17pNMycZJ1O9t32a/wC7DSVe52uXvywR3Qyxr1YpVXvVcEZU8barVHz2/wDBhDLLFNSur90lfbsdNQy4abqKVpuTtf05KkY+o6e/6/uarJG9LpRd3UbaX/pI5ZqUJuM71K/h9/3KjkX6Pb/v9hSKnlzYMri3pafCo6em/FcuJr1FGcW97W5i66jDpk6nFXF1d3ba/qjm0uGSUJUmnT+N9yEe9KXTdU03DTa2lEzfSzj78MtaXY8nFNpendPmLuqOvD1U/qjJxmua7lZ3Gl3co7eY+DPNidakdalHqY6nSyLuu5z+v6E9OWL0vuVHMpzxu2mjbH1X+p/ZmzxxyrVgzx//AC0c2XHkg/8AFxWv5ohW0s8Kuv2FGeCe0ptX5MMcsU3Wqvhin07jvF7Abz6GM98GZP4bOTJhzYZU0/uVGofU3E3j1EKUck212kBxxzTWzZetyXZm+TDGStVKPlGa6ST3xy/RkVhKbW1UCyvukzWeLLH/ADMTf2M/Si+U4/cAWVLsNzU1XAfw8atTT+Beg13QPEuKW6ZSzNKnuhJqL9zNP8Cez9r8gZ+pFjU4eScmBw3TUl5RkRY6PVj2RMs8nstvsY2ApFan3dhb7EgmFivUfcUrHcXyUlB/mAyAuWNx35RBFBcckltZAAaeo2Fy7UQFlSK1yRNt9ylJPaSseiL4kBnYxvG0Kn4CgdCDcBNNCK1NC2ZBNgOhBQAAQVYnQgKChFWGxBID2AKmmFMdoLCimEeQtgEXJWjOi0xt32CYzthqY9vAVfBFGoQ9L8DUH32B4kErLSivkbk1wiwqYwZXpvyS5yfcanJfJfE9PTJPY0i5NUyVPyg1FZ1opOHzY/XmtkzLUNqu9hI2j1OTuk0Esinvx8GFitikauRrjy3FwaVdtuDm+WC1eaFI1lFXxVee48UnibppJ7N1dEynqWqUrlwSppc9kUdU8Ota4NrV22VpEqW2qLjiny3bcq+CMWaWNvS+fq+TqU4Z25Yv8PNblKN0muyAyeTH1EU8qUJfllvcvvsZ5sU8M/8AETe9219b/wC/7mk8MsjlLHGfrV/iL+RGeLqFBPtiT5e7k/jcjTPbdSltzOXn4XkrHlnhldVfulF/0Laja9rjKrUeX96/uOKxPad6XLs/qf37/wCxBvPHDrIaou8i3bk6r445OGSlCdTTjL52fbnx9zrw4Ip+rizp/mkpQq1wkle/g6smHDmitc1G1cou1V7357d+4OPNxyqq2fmuODeWnPjt1tHs947P/lhm6HJijKcfdBcu7a2fPkyjKUJqk3v9O/mv+CoM2KUFqdNX9V87tL/Ylydqa2fLo6cc1NPTXuVU1duq/f3MWbplbni2g91F+Ldf0QQsWe5Jv2y8o73lh1ENOSCU/wCZbpnkVvTtfc1xZpY3plwVlrkWbBL8riXDPKva3XeLGsjcbilKL5TM9MXK8ftl/KygnjxZt4e2fdGayZcL0veJckm037JCyOaW6sBrOp8xTIlGNbRVGeuF+6NPyjWGmX0yIJhqg7hKl4Fl9T64ydfBUsT/ACuwjcHvYGceszx2WRtfJf8AFyn9cUzR9NDJbjaMp9OsW8mwvg9jdxSQ1+hneN7EZMbjvF2gR0SxykvbTOecWn7lREZyjwzWOdtVLcLCi2tuwTSXK/UJp8xdoIZmvbNXECKi+GHpt8Grjib22FeKPZt/chUxwvu0N448WJzb+l/oQ5yQPTlilH5XkRSzTqm7Xgl090FUpSXG68DahLyjO2hqT8gVpgu7E9PawuX3JbaYDcfkNkvnyLVfIq2v9OSKLQ00IQFqbQ/U+CBFpFuae1UK2SBCLUvKsHKHggQpGntfAaE+6MwsEXojDeUr+wa12RmAWNNmKVXsqIToblYICRiIoAAIoAel+A0vwAJfIMAKgRa3IKVFTSdIFKuxWxDIuHrYnJt7sQEpANCAqq2Q9XwSAQ7DVQgoB6h2ydgAtTj3Q9SfDMhipGnfcNmQptFppr5KkVjk4vatwnFxfvTtio0io5E9T9yW3yVGSfjb5KttO3Tvklxd1Tv5EnVat14Cx2xzfxCqTUMid6u814JyxjOH8TFQxKPGJPe75Obd01Kq3XwdMcqf/wAi3PLDbS1cX8g4xjb9l057zlzS5Gm5NUpLXslFO1Bc/f8A8FZ8b0+ot5ZXvFK3ExlXv2jSWlcr9V/3uRVp8TUb/NcNmlwr8bnT03VXt6qjN1csl793wcjSdt8WoqaVR/XYJN1eSN6raktr7AenDO9aUqjL+bGm9Kbp38BnhHLjc6Vv3VG32bv95I5oZHkgmpPJKLv09KWulduua3NcOeULSnceJe5LfxH4DMc+TG8eTa2rpNd0nX6cGnT5rioT9y/LJLulsv6mnURjBtpJ45bx7p8pcLyc2SCxZLq43y1yrrjzsUb5caySak0sidaru38nO003jmmpLZWaxlrSjs5JJJJfV3oHpyxUZcrhrlfD+LfJUZQyzxO4v7o6YZ8WZJTTjLs0c8ovib3a58/KMWmnXcEeinFrTl90XxJcr7kShLF7W9UHwzmhmdU2dGHqFXp5VcWGYzy4dauPPg5t4ve0zuyReKpLeD4a7EyrIrTTC5rlWWXd/qaanNVq93+5osF/VBV5TFLporeE7QGDnki61NFRzN7T3Q5bbZI2vPch4r3hK0FOUFL6dhRm4e2XAk+0lT8l02t6kvKAUscZR1Qe/gy4LpwlXYvSprfnySLWUX4YN38FTxThu1t5J+rZ8gJNoLsKfFD0NdgqeBqXncQEDuP8pSlHvEgARdRfFoTh4aJToq7KiblFlKSls+Q+GS41wRTlGuCCoz7MbimriDiLHYilHyFAi00inLG+24SsgLcU+GTQCHS7sVCoKrT4dktNchwUp9nuBAFOF7xJquSKQ3XYdJicWAgHpfgHFrsAgAAqlNhJtvkmg4CQDS8jTABOrdcBQWFoBpgGwAKrCgbFYDoLEBFFhYCFDsLEAoqhBbFuKGIBuuxAhiAC1kaNE1L3J7mA06NZqbjubWdXJU0q2MZYWlcHqXczhlaatWvB0xnGa1XpXaJrGPcc6a3r9Ssc3hyLJBu0bzxKabglGXjyYNape/Zha6NWPHeb1ZTeVbxi6aMWoqSUPU0R9zcttx9Pl9KclojJPZauz8muaE9NZ+pcYy3Uab/oBzp7xk3Ft3JuTtP9BJUnpbT0q0+9vsNu9Uo8fTFbDlVtPi0t3cl9iKFKptxbxTV8WkvjydT51RWiW6jqpRiqVv77nLu4v260k2q5Xyy8Uoxem1LFJ1ut48W6A7MEoZYOClqaX+HSpulsqXmzJpKUoJXTr2q3a79u7HOUoy1erJzq06tb8V/c1zQtKdS0J6W5yvjl/qysuWvTehtpb6L3avZt/sN/VVpNfZRf3Ki/bpXFcK1b+ftuTNVFJ+/EvpbdX8gNStaZWnWy87f7EZcWzlHevAk6S31Rvlcp7b0aRm1G7jqStNurW7COQuM79sv3N3hx54a8Mkpd4swnhyY/rg1+gV04M7j7Jfqn3HLGt3ibT50nGm/2No5HNU3TXDKm4JZMidNtBDI75LjOOX2TajLyzPJinje6teVwEaOfaSteRaMb3Umn8GSlW1ic0nTiBq0++/yZtU/bsNSj2k0/ktNNVJW/KAlZrWme4JQ51UTODXyvJFK9yK6odVHHso618lqfTZvqgov7nBugtirHbkSi9O1djFqmRjyXHRLjt8C1uLp7lqRUoJ7oyaa5NYyi3Sf7mqxRlzJELHKB0S6dR49y+DNwi/KYi1kI0lCiCNVSlfIyLHGVc8BIr2PkIqK3TE4p/STTQGtrwrJakyddBrLSE4sSHqY7silYamOk/uS7QDbYrAGFIAEQUpNcMHK+SQAAUmu4ART1Mam+5ACkXcfAEAKQ0x2SAFCsAAAAACwAAAAABAAEAAAAAAANOgsRVoomwHQECGIAGAhlAOLppiADox5NMlKG8+dzbUuou0o5PKezOJOjaM4vfTRvNY3BPHpVvmzbp8kKbnHXPw90EXHMlBtqS8mD1Ycvtluu6CddGfFki1knoUI8RVb/AKGEXpUd2quVxW6/U6+nePqPbKDySlu9Tqv1MOow5MU3rVOW0dMtqGrms2lSTpOtmnd79xye8rajLe5R4l8bCvTqVVC0nG9xN0lfujvSv6SK6cWZ404zkscN6guU9ufK+DowPGoyk1eJqrhSattq99ntwcKu5aVGclzJ7qtvJrDJPFJTqqf1Y2q73+oRpOM8eRwkpKS3q91xQ4e+4JxU1dOUto7O/wBDW8fU4NWOKuG8lu7bb0xrvsjmaaVStNKk3STpLb+oRG2q4b12bu9+PkUZJL2txXlJOV1x9jbOnlXqPV6itzde1K2kYytN7KMkt+OP7lBmuOX1I37r1Wu9vYazTW8ZtX2sqKU4uFTcZPl8J771/wB7nPvCTi1fwCVq8rb3p/oFRk7j7WZteN0OMqYSFljxL9ysXUSx+17x8M1SWSNd6OScXCTi+UFz12enDOrxfV4MZ4Z8OLTRipOLtOmdMMnrRScqyLj5FpuRztNcoFJrhmrbTqSv4J9PV9D38MLVY8nbn4L9NZF7Hv4MNE4/lZpBtK1afwMZ1E4Si6kqIOhZG1Td+LM5fKoRc1maf5kf9S/qQwTp2iKQ05LhsuUVNao89zK2FxrHLkjxJl+q5LerOe2CYqRvraJahP4ZClfIFSCcHB/BBtGdKpK0TkjFbx4JGs1CdF/WtuSLGmvswJA0rWvkzaaIpqr34AQ0AWVtLklqhBDlFoE/JUZ7U90Nxg+9FEOPgNLK0fyslqS5CiqDUu6Dcq4em46fdf1WQTqXgd32IaaABun2EA7IqQKsBAgEMACwEA7AQAMQxAAABAAAAAxDABAMArZOwQAUPngkpNIG/gaJAAIAYgAYABQDTrgQ9kBvHLJpST93g0yYp5Mcs1JVyc0JuMro6IvTHU3ep8G3PfGEJOLuO1Hp9Pm6fq8fo54wjOK/w2lSv5PNyxcZPZpMm3ytlZFldWfpcvSyVqO26muGYK1FuN1Xu24O/B1Uuog4SkvVeynLsjLLhhkevGn9VKOnaZYl/wBczpqragrcW1yVFwu4asTvaV2iJLS2pLzST4ZopZFL3ZYxbe8Jcc91wRpeLqJ4s6zerCU1utSb7HTnjjdZMTWiSvSkrSW+77bnC1KOyw71d03arn/k36bP6c3jyzisU3/iaHVpL9gNMM1SWX3wTWrffa29/uyMuGWNpPeNJxlxzW7HKMnJLicknVr81tfdUa4ZrLFwnCLtubbkqrb9uAjkW+9OVPm6XfYrND1Y6l9aXlPUh5Mbq01JJUm399qQo77RV/bHz+/3KOZScXurLWl8N/ZmuSEcrdOp35u38/JzTjLHKpxpkXrbHKnvsa5cf8RDVFJZIrdeUc0Zp8m2Obi00/sVnjmaadNUCdO1ydmdKcfVhTT+qPhnNKK5X7Ei5taqfrQt/XHn5I1L80TOMnGSa5RpkprWuH/QtIFJdpv9RqTi7e5iwtkpHT6etasbv4IT7SM45HF2nR0PTnhqj9a5+S1JGMoVut0Q1RopVsx6VJCFjKMnGVo19mX4kZyxyTqrFpkuzRGjljadEtNFKd7SDU12sHqB20Vqi+VX2FKHdO0A00yotcPhmI1Jim4vJBx3W6INYTjxJ0injx8qVhLOsoyceDeLw5I1NNS8mUlX0ozcmOLK2n07SuMtS+DJpocMkovZl+su8Ux4e4zt8UDNPWXZJB6qe0kmBkBcormL/QWm/gKm6K1v7icJLsKmQU3ZNsQ7vkAUmg2fwLdARQ1QDT7MTVAAABAgAAAbdiAAAAIAAGUIBgtnYCAAAAAaTfACAAAYCGigorUuKJ5HVMITrsIvaSJaoauEMQyAAQygHsIYBZrha1LV2Mhx5Kzroy5HnTbjwc/y+DqxZnFOoKnzsYTilK+z4LqZ/hRk4tPx5OyGdOCnka2VQhHZp+ThXyaY8jhLUkrSpWhhuOvLhSUoS0w0pJy5bZzKOibXp65Lm7rnk1xZY49MJu4K5yaW90b5enlnxqvUnk0qXtapJ70VOOOUdqbeLvpdtPnf/gm+VCK4e8uXsaKLXt0v/wDM+Hu+/YiWrR71oj2XzXj5I02hNTWiUoJ25a1/pjsiFk0+3JF2kn9Nfl2M7tWoRjF3Vm0k+oTa92VapSalSUVFEV1anlUpQbbepprfbj/nuY5IKTcquub3qq3/ALo58GR45tUvdSdvbZp/8HZF+q0lq9RcaWt0rt8fC/8AJWZHP2ins2qT4vjav15BpZIaW00uHe6/sv6lZIaZOUYpxf1JfSt+7/QyXa7aX5mrrhW/K8BWM4OE3GXbugjJxezOhxWWGm6mvp1SSS7/AKnKRXTiyK7XDVSiKcdErXHKME3F2mdEJxyRae3/AAaZ3Ixklyv1NMLi3TdX54FOLg6ZlLZk4da5cEobq6MTbD1Dj7Z+6Pg0yY4ZI6obDpZ1yFY5uElJdhSTi6YiNOjIlKpx4f8AQhNrhixyq49mPbjhlZ4r1Z1abtC/icir3avhoFaM5x0yGrkb68eVb41F/BOnHw5NGC2NFJTVPkU3FPFDtMSjX5k0S7i/gE0D05RIcWjWMq+UJ7CGayGm0U0pK0QZa6pT8le2XOzMwLUipRcSWVGXZ8DlB1a3QEAAEU06GSFlqRSm0P1G+UTyLgUhvkQ1vsJkUJja8CDgAAa35Bxa7AIBAAAAGVAAAQAAAAAAFIbVkFKRpCaYjVNMHBMsKyAtwJexItIAAyAbdsQFDuhpNkjtgUqTCS7oWljWyqzSIAck0IyoGIZQAAAOxqxD3KjSEnp0LuzXqNNKDq4rsc8eUdGL0alPIpSfhGmdc33D7lZKcnJKl4J+SNLT2kr5Zv0+eeCacWnBzTlHzRzJvwO9l+oSPTjjwdWozhF4Jy0qnvGT1bv/ANnNm6J41qvWtLaqS3XF/v2MMcoxb1QU9kt9qO/FklJ/w7m3J0oenK4xirbQTjz8sZQnJZlL1Laae1MGnFtOEI87N8bfc6pTU4SSer2yepuuX99zmy4vTlJRjqhckpy21URrNaZI+tc4KOvduEI7RSit/wDciEk4NPaUUlHtuSpNN1Jb39MeVRtp9SXqYqjkTctCf0pRu7/cDfDmhnn6WZRWS6qnJSdpVt+v3Ms2CWFxbunVSku9J1XhGMo64KcE6ik5PzJvsa9P1C0ShKovT2rigkRC7Suvj9rafyPqMbyQeaKdr/M22RpkTjJvRcU3aj2548rYeN6UpY2skePlcpJr+pRwAm07R0dX08cdZcW+GfD8HORXRjyxlHRNX/wKeFte1qS8nOawm/O/ktSTiNElyXjcsUv90Ocr3ZF33B10zxKcG4NSTW3lHI006ZriyODqzXJBZ1qilHKuV5CZ45DT618mbTTpjUmnaI0am0bR05cbjXuXBn7Zq1s/AlLTK9O5UiZJxdMR1XiyRtp/JnLHj/K2If0zU+0t0KSp/BTx+GKnwyKmy1K+SZc8UIEU1TtCavdDjLswaae3AEgU1e6J4IoKhkcflEgBs8ayrVj57oxaadNUxxk4u06N1mjlVZVv/MXqcc4GssDq4PUvgzcWuUSFIEwAKKoa3XyJOh0nwAmmgorcTTAQ1JokCUVr+AJAXSAAAigAAAAAIAAAoAAAio8miADpjP0bMpcgA0+UgAHNoAAAA+4AUX2I7gBrUxpL6TIAGmAAAyoGwAoaBgBUOPJtj+mQAaxnWcyAAmrhrgSAAprlHfjSX4TKSXu1PfuAFxnV9ckopJVUcbXx7Uc/4nt1OSC2jGcqS4QATTGPUNrLJJ0r4/Qptxy6U6i4JtLj6QAjTo6lL+NmqVa4Kv0OPNtkklslJ0gAg78e/SOb3k4Nt93/AJhn1CUOslpWnefG3kANI2xJPp+rTW1J1+h5fYAIYQdwANN48R+zMQArOBG8W9UHYAXE+i6z/OZgAGd61nAuS8nYAB+jF9QwAucTehcnRkS/h06VgBWf1yz5IADDphlrgALiaT+ocvpAAIAAIoAAAvG2pKmzSXLADWcY3rGf1CADLYAAAtfSSgAqJAAMqAACD//Z".replace("data:image/jpeg;base64,", ""), 0));
                                            M2.close();
                                            response = 2;
                                            M = new Object[]{200, str8, byteArrayInputStream};
                                        }
                                    } else if (byteArrayOutputStream.size() == parseLong) {
                                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                        M2.close();
                                        response = 2;
                                        M = new Object[]{200, str8, byteArrayInputStream2};
                                    } else {
                                        M = M();
                                        M2.close();
                                        response = M2;
                                    }
                                }
                                return M;
                            } catch (Exception e) {
                                SpiderDebug.log("Error reading response stream: ");
                                Object[] M3 = M();
                                response.close();
                                return M3;
                            }
                        }
                    } catch (Exception e2) {
                        SpiderDebug.log(e2);
                        M();
                        break;
                    }
                    break;
                case 6:
                    return Cloud_quark.proxy(map);
                case 7:
                    return new Object[]{200, "text/xml; charset=utf-8", new ByteArrayInputStream("<source>k-v</source>\n<d p=\"0.00000,1,25,16777215\"></d>".getBytes())};
            }
            return null;
        }
        String str9 = "嘟嘟";
        if (str.contains(str9) || str3.contains(str9)) {
            return Cloud_baidu.proxys(map, map2, str2);
        }
        String str10 = "夸父";
        if (str.contains(str10) || str3.contains(str10)) {
            return Cloud_quark.proxys(map, map2, str2);
        }
        String str11 = "优汐";
        if (str.contains(str11) || str3.contains(str11)) {
            return Cloud_uc.proxys(map, map2, str2);
        }
        String str12 = "阿狸";
        if (str.contains(str12) || str3.contains(str12)) {
            return Cloud_ali.proxys(map, map2, str2);
        }
        if (str.startsWith("/webdav")) {
            return WebDAV.vod(map, str.replace("/webdav/", ""), map2);
        }
        return null;
    }

    public static Object[] proxyLivelist(Map<String, String> map) {
        String str;
        boolean z;
        String str2 = "\n";
        String str3 = "@@@";
        try {
            String str4 = C0028.m1633((String) (map.get("url")), Rc.yq());
            boolean z2 = (str4.contains(str3));
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (!z2) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        str4 = (C0004.m119((str4.split(str3))[1]).Fo());
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            String[] strArr = (str4.split(str2));
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
                            StringBuilder sb = new StringBuilder();
                            int length2 = strArr.length;
                            int i5 = 49790;
                            while (true) {
                                i5 ^= 49807;
                                switch (i5) {
                                    case 18:
                                        break;
                                    case 51:
                                        break;
                                    case 84:
                                        (sb.append(strArr[0]));
                                        int i6 = 1;
                                        while (true) {
                                            int length3 = strArr.length;
                                            int i7 = 49914;
                                            while (true) {
                                                i7 ^= 49931;
                                                switch (i7) {
                                                    case 497:
                                                        i7 = i6 < length3 ? 50658 : 50627;
                                                    case 1711:
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        (sb.append(str2));
                                                        (sb.append(strArr[i6]));
                                                        i6++;
                                                        int i8 = 50689;
                                                        while (true) {
                                                            i8 ^= 50706;
                                                            switch (i8) {
                                                                case 19:
                                                                    i8 = 50720;
                                                                case 50:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 241:
                                        if (length2 <= 0) {
                                            break;
                                        } else {
                                            i5 = 49883;
                                            continue;
                                        }
                                    default:
                                        continue;
                                }
                                i5 = 49852;
                            }
                            String str5 = (sb.toString());
                            C0006.m194(C0049.m2191("NktTQgXU7bfcfSm6WEMjZ2tHL80Dgl0ELLzYnhMzypyTpdDDFaT9XCKKjWOQKpftXrMPrAzEL6KzM5Dz/SNwkQ1aeXt8y51QyVwWF0o3l+5kqQ=="));
                            return new Object[]{(Integer.valueOf(200)), "text/plain", new ByteArrayInputStream((str5.getBytes()))};
                        case 500:
                            String str6 = strArr[i3];
                            boolean z3 = (str6.startsWith("http"));
                            int i9 = 1864;
                            while (true) {
                                i9 ^= 1881;
                                switch (i9) {
                                    case 17:
                                        i9 = z3 ? 48736 : 48705;
                                    case 47384:
                                        str = str6;
                                        break;
                                    case 47417:
                                        StringBuilder sb2 = new StringBuilder();
                                        (sb2.append(ProxyOrigin.getOwnProxyUrl()));
                                        (sb2.append("proxy?do=m3u8&live=&thread="));
                                        boolean z4 = ((String) (map.get("thread")).equals("true"));
                                        int i10 = 48767;
                                        while (true) {
                                            i10 ^= 48784;
                                            switch (i10) {
                                                case 14:
                                                case 45:
                                                    z = false;
                                                    break;
                                                case 76:
                                                    int i11 = 48891;
                                                    while (true) {
                                                        i11 ^= 48908;
                                                        switch (i11) {
                                                            case 22:
                                                                z = true;
                                                                break;
                                                            case 503:
                                                                i11 = 48922;
                                                        }
                                                    }
                                                    break;
                                                case 239:
                                                    i10 = z4 ? 48860 : 48829;
                                            }
                                        }
                                        (sb2.append(z));
                                        (sb2.append("&cacheTime="));
                                        (sb2.append((String) (map.get("cacheTime"))));
                                        (sb2.append("&ad=false&url="));
                                        (sb2.append(C0010.m314(str6)));
                                        str = (sb2.toString());
                                        break;
                                    case 47483:
                                }
                            }
                            strArr[i3] = str;
                            i3++;
                            int i12 = 49666;
                            while (true) {
                                i12 ^= 49683;
                                switch (i12) {
                                    case 17:
                                        i12 = 49697;
                                    case 50:
                                        break;
                                }
                            }
                            break;
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

    public static Object[] proxyM3u8(Map<String, String> map) {
        Object[] objArr;
        try {
            Response Gc2 = C0068Pe.Gc(map.get("url"), Rc.N("", "", 3));
            String header = Gc2.header("content-length");
            if (Gc2.code() != 200 || header == null || header.equals("3485")) {
                Gc2.close();
                objArr = new Object[]{404, "text/plain", new ByteArrayInputStream("NOT FUAND".getBytes())};
            } else {
                objArr = new Object[]{200, "application/oct-stream", Gc2.body().byteStream()};
            }
            return objArr;
        } catch (Exception e) {
            InitOrigin.show("Proxy-proxyM3u8:");
            return null;
        }
    }

    public static Object[] proxyPic(Map<String, String> map) {
        String str = "UTF-8";
        String str2 = "text/plain";
        if (map != null) {
            String str3 = "type";
            if (map.containsKey(str3)) {
                String str4 = map.get(str3);
                String str5 = "image/*";
                Objects.requireNonNull(str4);
                if (!str4.equals("Video")) {
                    return new Object[]{404, str2, new ByteArrayInputStream("Type not found".getBytes(str))};
                }
                try {
                    return new Object[]{200, str5, new ByteArrayInputStream(Q.yq("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDABsSFBcUERsXFhceHBsgKEIrKCUlKFE6PTBCYFVlZF9VXVtqeJmBanGQc1tdhbWGkJ6jq62rZ4C8ybqmx5moq6T/2wBDARweHigjKE4rK06kbl1upKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKT/wAARCAFyApIDASIAAhEBAxEB/8QAGgAAAwEBAQEAAAAAAAAAAAAAAAECAwQFBv/EADcQAAICAQMDAwIEBAYCAwEAAAABAhEDEiExBEFREyJhMnEFQoGRFFKh0SMzYrHB8OHxJENykv/EABcBAQEBAQAAAAAAAAAAAAAAAAABAgP/xAAdEQEBAQEBAQEBAQEAAAAAAAAAEQExIQJBElFh/9oADAMBAAIRAxEAPwDw4asWTTOLXZxexn1GL05JreElcX5PV6rol1GNZsCWqrcaV9v7nDiqcZdPkpN7pulT+X4+x23GM1xgVODhJxfKJMNAAAAAAKAYgAY03VXsIChgAFQAAAMaEADAAKhjbtt0lfgkYAMQBDGIAhjsQFDG6va6+SRhDAAKBDEMIYACAY0JDQDKQqKSCGkWiRgUMlDsoqxX9ibCwKsa2JQ7AtPe2rGiUUgNIGsmRAJMIL3IkxkNgJisGxWFWmOXBCZV2giGKxyJCq5Ja3CwbsCGIqX2JYBY7JCyBiCxADJZQrAQhkhTEFgBLByenTe13QxMCQHQgEIbQiKQDEFIBgFelDqJYsuuHZ3LVJ6dX378G2bFj6mMZNPVwpX9lvv99jbrekU8TnGMo44qnGT70zzYSn0uRqWOWNP5rvzuRMT1vTyeJZWvcvqf6J/8nnnv9N1OBz9PMlFOk+OP0/3PP/FPw6XR5NUVqwy+mX/BnWvnfxwAAEaAAADEMRQwAAGAhlAAAEAxAAxiGEAxAUMAAIYCGUAxAEMAABjEBUMYgQRQANANDSBDQDRSJGEUhiQWA7AVgAxoSAoqwQkMCkXHkzRpHkDWPAmwvYhsIdkthZLATYCYBTspMzKTAciGW+CGAhpksAGyWOxMCWIbJZA7CyRgOxCAKYmAmACGJgIBAACGIAE0MAqRFMRFIBgB9LilCaXU44WmpNxk093Ln+px9d0sFJvVJztXKSelvmji6DqcnTSTfugkk41ytSex7j98FOD143c2qXt2dfJniPn1d+nLIpPtap/uzs6TNeN9PJe17emtrt8N9vkOr6eeJ1makpPiOPdb7Lbyc8bpJfXHiKdtuv8AyVWfV9Il/iY2qe9pbcW38bukcMk4umqfyew57OTipLZZIJrtx2+Oxz9R0yyQ9THJTj/Nv+rexNxrNecA2muRGWgAxFDALdUAAMQAMAAqAAABjrev9hAAwACoYCGADEAQwACgGIYQDEMIY0JDRUNFIQwGMQwGgEh2A7AVjCAYhrgCkAvsMARRI0UUjSJmjSIFNkNjbJCHexLATYUMQCABkhYFpiYkxsCVTat0r3Yns3TteRslsgLHZIANkMoTAliGxMKLCxAA7CybGACYWAAJgACAAABABFAgAKAAAN1CvpkpVyn23OvoOrl0s5R06sc+Uuas5dMZVLFLVsr7UytCapOpJd/uWJXu5odPmx3HCmmpNNKtl2Z5FSxS0v8AL+Vbuv1fGx1dFmnjuOXT6c7U3W63/cf4p0qyRl1KyK1tGMdtvv8AuZ4VjipxqCbVaZY47utk9/LbZjL1OnyyeOskHvS2/dGePLkxtST1OPDgrae/f7s71jh1mFvFWqD+nit6X67cFHJ1PS4urTydP7cl7xbbvnb9keXKLhJxkqaPRTlCVZIuS7t7SXF/7l9Rjj1MbdOfMZKlfL38UZ3G815Qi8kHB+U+H5JI0QxDAAEMBgAFAAAEAxDACoSUZJuKkvDJGVAMQAMAAIYCGUAwAIaGJDKhjQhhDGSNc0AxiQwGIAAYyRoCkMkYQxklAMaENFFI0WyM48lsBNiBkgU2SAmAgARAxCsLAuo6L1e6/prt5BMmx2uwAyGUyQFYgYBTsLEACYmNiYCEMQCAYgABAAxAAAAAAhDERQACCmAgArDmUWovaLa1Ub65QinF6oStq+ys4TXFl0pqScrVL4Jmtb8vQxzUW522nqvT+nY9bDPFng45l61qTTlwltvueA7hOSkk95d6Z19L1ajKmk4vZqUvgu+sQuuwTw58kk1LHqaXuSj+y+5hizSwZFPDJKXZRT3PoM2FfiHTLJjuUd3GqTu0eDkjPHklhy6tvORbEzR6Clj6+KnhahmVXjuk3tx445OZ4tLcWmndU0l+lcLvucklLHNVSfCSfB14fxCGRLH1idPaOat/1/cow6jGssHOb99+58tv4XbsefOMoScZKmj3OqwTwT9VO4vdSi61LfhrfhI4Or6a4a4R/wD5Tf33ZnW/nXCIYiNGAhgAxAAwACoAAAGAAUMAAIYCGEAxDKGt+4AAQ0MAKgGhDCGMQAMdkjAYCGAxoQAUMlFAAxDCGNCQ0BceRtiQmygsBWAA2LZ3vVL9wYmQAgEAAArAYybBMC7JYAwJEMQUCsBAUJiAAEMTAQhiAAAAABBZFMBCYDEAAAhgFIBgBiBq1Ga4pmcotcmY3W2J+pH02lsm7bKa0t1iUvm/g5k6OpackddLXfC7bFxNdn4b+IZunyaNakpJJLwex+IdHi6vEsuOS19r4kfM6pKriorbdco9T8N6vHBK28tUoxm/pfwNxnXNKGiTw5fY+K00/sc+XFKHbni+x7XVaZKKyeplxP6csItNbva/2OXJD0FpySjPG/asid2/Bc1GP4f1ixr+Hz+7ppbNv8jdK1/Y3z4H0+TdaoTWzrlbbf1OfL0cZb4n9ovZs7OhzPLj/hOpT1R3i12+/wCxIV5PWdM8b9SG+N91wmcp708Lx3CcfUxvart+FXzZ5fV9G8D143rxPiSd19ybjebXIMAI0AAAGAbV3sCgAACAYhgNVvYCGVDAQwgGIZQwEMIaAAKhjQgCKAkYDAAAYxAAxiGgGhi7DAqnV1t5ASBBFD27OxIaAqxMGxMoAFYWQDEDEAgAQBYAIKBiACkwEAASNiAQAIBisLABiEAAxDYgAQxEUCAAoAAAAAAAAAAAAA1WPFlScJKMu6Yn007r6l8HMtjSGWcVUZMlWaJ4Jw/KyISnB2rRqupyx/Nf3HLPHIqcEh4t1pBwzNekown/AC1zsViema9bHKS23iqOeWJxjrXBri618ZlqXlc8Uip3j0sHUU1jlijLp2ktM3wvKRbc+lhcXLL0slUakouEd9qT+25ljbyYv8PTOtlJLfaO48Us+J6G5KT+mbpcLgbjFL0tUHl6aUZR70nt8K3zwKGZW1OGye97Nhj6jG8rlqj0/UL83MeF2vY6cmLHn2lH08kfzR324tvv2/cU3G9rNjuErlVq+Xz/AF3ObLj0puHujw4VtW6pJcsiEZ4cjjJpvlS1cP4OrHmxzlpzScJ/zxWz/wC/8geF1fSxjeTFx+aD2cf0s5D6fqehyKPq4oJqrlGMvZLy67ng9d0zwZE4prHPeN9vgy6ZrmAQyNAAAoYA23u3YBAMQwAYAVDALvlgEAxDsAGIfYqAYgAYxAVDAACGhiGA0AhgNK+BoSBAMaEMCgEhhDRRKKAGJgybAdgIABiBiAACxAAN2IAoABAUBI7AYmFiYAIGIACwEA7CxAAAAAAhiIpAABQAAAAAAMBDCEAAFZJlpJ8C0J/SyXFoy31pLHJR1MzexcJtPd7Gj0ZeVT7MqWMseSUX5T5TNJrHVxsylFxdBB0yG5+t8GXJgnrxSp1T+x6c5fxWGWaGlSpuSr7JL5PK0xauOzNulyL1Vqk4tO14NMa6+ojHPBzTqSuNLvwiMHUSxy0uskNX0SV/mXb9BzaxvXF9qblvqbfgwn7ZLdNbb9v27lTHpSayYllhP/DdW5ypxb24/ciGZS/w5yvb2zitn+5x9N1WTp5KUdnStNcqn2X3O/JhXUYnm6aTkqtrJkt49vHyTixv0nULF7NcUuz1HTnw9L12B49eOGVu00u548JYepk8WSCxZ02qe1u/9yk54pqLmozX+nn/AMjcpxj1n4P1PTt/4LmvMFZ508Tg6lGUfuqPp11C6nFGepRy8Nrbc4+pjktpNV45r+v+5M/6f08LR4YjtyYoZPpjol2rdM5ZRduMlTQjdQANU6AigYhgMBDKgGIAGAAEMAAoYCGEAxDCGCACgKJKCAYhgCGhDAYxABQyRoCkMSCwgZLBsQDsBAACCwv4CkFgIAABMBhYgAYCABgJMYCExiYCAAAAACABfIAFAAkBQCGACChgQKgoGxWA6EG3dg2gpWAWAGbTQ1N8M0tpdmiXpfKokaqS4vUlFC9nyNJfle4TVeo8e00pfcHng/8A6khTg9GuRnqS4QMbJXun+gOrtqn5Rkp070m0c0e8C1Nx3dLkhmitSUpw3j9yJ9NPTFRxpyStzk9l8HPFJSWTBPS/DO9Slmi8k5zUttUI73+hWXm1XlRWzlW6dcG/S9Tl6XIpQaTde1/S1XcfUR90cnpSV0kq2f3MEoqNxuWO05bcEar2J+j+JwhOEU8qSWl7S7XK/wDvcnC4Z8SxZJSTS9rlyvCvvwzzMGaWKSnCV8Xu9lfB6mPPj6tJtNz5aTqe3Fdn+pE1ShkwzcMrlUtlNJOnvVmkMrd48ylF8XJbP+o8OWK04p5U47xqcar+b4/U0y9DCcFkxRUJ13eqIqRzdR+Hxy3PC4qXeL/7sjz83SSdKbUcn5fMl+x6cYzjWp//AJd2pfZf3CTlJ6JpttVplzL7eCl14EsVr2vdGNU6Z63V4YuWtR9KfeDaf7HDnxtPdU+w3Gs+nOA2qEZbMAABgIZUNAIAGMQBDGICoYAADGJDKgGhDCGMQAMbVCGADEMBjRJSAYMBMIQhiAAEABYWIAoCxWABYCCwGArEBQEgBQEjsAEUKgEAxAAAAAAUAUWAUAQBYCCixMdWPTsQQBemyXF+AtSBSg/sPTFcsKgCvaAGakytSfJmMy1F6U+GJpxYkaRlXO5UVjak0pv2k5McNT0ukUoxfDpl6Lx6VFyZWa53F8xaf2JUmnuVK4OnGmNShLlUzLRxae90dPTdRLDNSWSqORwV7MWn5LUma+gh6XWY24xeTJL6o6qR5WfHLBlSajt9NK0zDBmeCalBu0e1DJi/FMDjJacqXnn7FZkeU4qael6J76o8JiUrlv7Xf2SRplwywZNEovZ/Suf3oTjHOrTua3l5B1uuoytVqTT293Gnx5o6ej/Fli9mXHKClbel7fp/Y8yM54nurT/VpI3U+nzRqaq3Sd7pDcq8e/Uc0PVw5FOElb0reKqqSfBlPNPHSySWib9ktG/2Z5/Sp4Pz68cndvtXc9NXlWictSyL6kpX8GeIic4zuHUYMbhXPEv6bnB1nQenFyxN5cP290ToyLL0eV4pwxzlHeLct68m+HqFkfpybcvhcP8AsaR83mxuL/58mJ7/AOIdEm24xSfOlPn5R4mWGlk1v51mMQEaMYgKhgAAMBDCAYhlDAACGuABDKgGIaYQwAEBUnqd0l9gEMAAAAY0IYDEArABAIBiAAATEAAACAYgAAAAp1fYAAAABoQ0gGDGAEjodUKwCgHuJqTAWoNQODDSwpWOmytorcl5PCANL8hSXIrsLAHLstiW2NkkU7Yan5CgSAG2+5LL2D2d9gMwKqIEVkABsZbNAKhqu7CGmbYcrhJSXYyWjuUtPY1jOujLinlxvLdrwc3pp/B19N9VSmlF8kdZ0vpy1Qlqi/BdTN/GPoS7bk+jLvsTcl3aGpOeze/knjXorT2svFlnjkpLZonePyG8gj11lx9fiqcfTmlWq7X6nFkwNSqKba4UVRhimoSq5V8M7Jzjkj7p5nk4iVnjK5y2mql3fhcBHHGTtLRJ7Rrh9mKUmm4ZYuNcvuS5S/LGnLhVtRRsoTx3o37U92vk6MHVzVQnNqLftk5aV+pwxyyreTpbLemmaN8p079qaWzCPZjPH12L08sMUM0PpTd6kv7HJKD6eThO8UU6q21L+xHS5VqjOLucHWO0tzszKPqaMmN01cHK1t3W/NGc8NbYMznj0ZKtdtXBy/iP4dDLF58DTv6q3RMFkxSvDN2nwu7fx2O/pM66hPjWtpRTbTKPlsmCUJVsQ4yXKPe/Evw6ak5447fHc8ecZK9mI1n05xmja7olxXb9iRqpGICBjEMoBiAIYxDKgKJGEMAQFDQxFBAMAABiGADEAAIGIAAQAAAIABtbUvuIAAAAAAAAAGkPgBUHA9xpASk2VQ+CdTAeyHaEnaE0wG2iWx6WJqgFbDU/IMkKdj1vySNKyAsRVLuwuKASQ6XkWoNQFem3wNQ07sjU/Im2wKlJdiVJppp7oKY1Fd2FSDi/A3XYWpruFKmAan5Ah6jT8oGqFYWZbAhpD0sBKr3dA227fJWh0JxaEKFJo7ulzqcPSnG72RwFQnKDTTpouam5W/U9PPFN7e0523wepjlHq8CjKSU0jjzYVjlTV/JrcZz6/wBYRbRSytvhC9OUt0g0vwT1fGiyQe2mn5OnBJ/T6+nwcNafuVGTi0+5am47M2PUlu8mZu/JyqbV3p37eDuwdVLLFvRBZKq+LMup6eMJRcMqnJrdBnPPNc+pXs0nFbUuTSM9K0yjaXKk+4o4JVTft5fwyvRlBq5RTrUnzYXY0UY3rjLdKotKtz0OmnDN076eUovNBXqk+UeZHXDepbbvet/J1dJ1cseSChGKl9U5N1a+5WW69RbxjSf5XJbfp5NYZMUpJuoyj/NvS/48EdTkcHLTKlzPSlbXZp0Y3NtWk3tpale/an/VkHudNkUoVs1Xuilx8rycn4h0LT1490+Tj6fqHBqST558/t8Wz18HV6l9Sare3dE9zivm8uFO24ST77HLODg/K8n13UQeRWvbLw+55XU4ot6cuNLy6/78l6nHhTXdfqSdufpHj3j7oPuuxxtNOmTW82gAAKYAAQ0MQFQxoQ0A0AAVFDQhhDAAaoAAAAYCE2A5cuna8ktg2IAAAALAQAADoKAQFaQ0gSNIey7hq8IAYbLcLvklgVq+A1slblbLsAlyOr2DW+yH7m7p2AtEilBrllaZ+SGpLkB3FB6nwTTfYehL6pUAXCXKaD04P8wexcWyXKwKUYLvYnkUdoolu6uthbdyKdp8oVR8j1R8D9svgCaQKN3TX7g4MNMmFKg4K0MWj5QCslsbEFAABAgAArMZr6a/mROheSRagBuNdxEUWx2xDjKuUAbP4YqNUsb7sGsfazUZow5PTmpVwejqj1GNatjzLR0dNkg24zm0uxcZ+s/Sz4pY3UG2jLVOO3c9DViSqLsxyJbtRpliZrlTreS3BSg3bVIqSmt5LYzbUnVUZaaRcHNNPTXk74Y1lxf/ABcUZTfLvdM8t77I0w554JpwbXn5LTcPNjyYpuE9TfMkmSpNL/S/HKO/JjxdT06yYk1JfVvZxNK/5W+3aiGacM0lVu1zfJqmsq0tKLm7b4pGSUb3The7XZ+CtLSdNL+Z3x8FTXfalghkxJtYnpayK04nO/V6ffEnkwyV1Lf9P/RXRdRJT0ymoYWtKUo6v2XkpyePJLHlwyir30u0mE9EevUHc+mU7fOtnd0v4hizNKEViyrjU7vyeZPHNP2NST4b7/2M/ct9Di+dhB9PDN6kXcXGXeN20Kag9pw1J7fJ5nQ9XGVYsjT7K9rPQptU64/K7T+CRGWXpopaocS5XP7nmdf+Gy0+rhVpcxXY9fHklCVS9yv90arG574ptf6ZdimPkHGUdmmhHvdf+Hte9wSi+a/KedPoV+XIhGv6cYGuTBLG6Znpd1x9wtIYhkDAQyoaGJD2vbgqKQyUMIYCHYAAWAAJjoGgJAdD0gQVVD07jryAkk+w/sUkD+EAtu4bdmS4zb4GsbfOwDr5Co+RySqkZuMvAF6Ii0REotK5OguLfLAqkuwLT4Fqgu7Inqv4A0c4onXHwZD5Cxp63+lDeSTWyozVR5FqYDk5d2wU5LuCl53Hoi+9ADySargm7L9P/UhODXYCbCxNUCTfCIHyDQmmuzEFAAADsNT8k2FhYep+RWAEAA6EABQWJsBgTYBUopp8lRlGPCBzZCovyP2v4G9MudhaPDQUaV5FQNNCsAGpUICVWijGfDph6U12M0UpyX5mVJrtwVOGh0mVOKeyk3XJxQyOMkzsjl1wXppfJvNc9yM3lb9tbfJGSMWqiqkaZJ17KT8kVp3v9AYxdw2asE41utzWtf3J0NO6MxqtOlzS6TJrjPnZx8o26zFDSs+JuUJ8p9vg5kk95o6OkyuGrHr/AMGe0kypv+uV2u9fD3Q4txrb9eV9zbP08sU3pknF8PsYWk6acbC2tU7amoPJLtqe37HVnisuCGZQUZpVJYmtv0Ry49DlvGKvd3wdvR5Fhm4Rxf4c6Upatl4ESubFOdNrVp/mnJ0jbUpx90l5vhmPWweLM4ZJ5JVxFmD1K7SfeStV8VX3FI6dajajSa89v/R3dF1cskfSnk35i6tpeNjyk1S1XKPbyl/1mkVK9VptPVs+WVI9z1XKHeL81VMmPU5sc6kk15XY5FKVR6had/8ANi223I09SabhLaVfFBl6mLNHLGpLd7NM5uo/D1P3YmckM2THLeVrs3/ydsOp/wBTTXZk5wefPpcsdpwc4+UcuX8PyNasSco/7Hu+u26CVzj7XXlFHy08GXG6lBog97qOieTeMtjkn+HX+bcka/p5gzpydFPFym18GLivlCFQMHFr7AAxpiSb4LUJeCoQFLHL7FqCj8gZUUkaqLl2RaxgY0D0o2e3YlqMuUEZWnwilF+DTQ0qikPSl9TAz0goeTRzgvAnomtppfYCHKMeWQ82+yKeOEeZWK4rsFJZX4QpSm+FRokpLakyJa4P3LYDL3LyXH1K2sqMrfFs01KK97r4AxeOb3ZEoyXKaNn1CvZDWSMudgOY0hk0bNWjVrF/MkQ/SW1N/IU6hL4JnFR+l2Kv5aHGLe1poIyYjf0e9goJdhFrJWUpJclt8LYlxi+9AGqPgWprhiqu9ioCvUa7L9g9WXakTpYiCnkb+rcNOrhogLCm4tdiRqbXceu+UBIi6T4Bwfgi1Ax6X4FVcgNbj0MhsNTXDBDaaJL9S9mhNLsBID2AKhMolc7lJMmLqWgSNHBVyS0lwIUg0vsJgpNcMinpk+w9Nch6kvIa75RfE9HtQNxD2y+GGjyAi8U3CWzaQ0sa5ix+pjXECprf2KGqKbbI77p0Viz44qqo2k9UbjW/c05uZzj2ht5HLK3HQu5emS5qidOJb69wrCTplxk5VFcGjxya2Sd9zKS9PZ/UReu/BKUsXpzX2M541FvVD7rwcPqS7NnZHL6+LeVTjyq+oVNzcSp44q4q1y0+xouohKLUlbW7SRzOpO3tLkvHcJW5JLl/JSY9DBl/j+meKCWPJj+h8t/H/o8/RLV7NVxez08yNtccUo5YpbfT4OvqkuoxevDS8iXvxwT58kK8tRkt4p13jv8A1GtSppypb7bUzVZN2qWpeN7+R+vDmK43aoF0+l6iWCdNvRxKt7Z2a3q9PIra+mT5l3bOL1Vy4ppfHc3xT9SGikpR3TUU20+xU1q8mOftm9L4dmmKDjw00uPhGORXHW4xTT0yXFv/AKyI6XtG1X6V/bkI9KLk40t2uFy/sOOV3u2n5OGMp9py/R/98lZJtJTTdPbwl8fsEemsmqLdKTXNdyZaZx1Q/Y4cOad77ryux0Tx5JL1cVJ8teUFGpPmJlk6eGTdRjYevF7ThUvgNSe8G00VHJk6G70/sZroGt2z0fU2tbijng37lSC1xrplFbB/Ds7vTjPeE19iZYpLcI4/RaXAtM+0LOnUl8g5R5boDmUMj/Koj9GX8xrLJBfmsh294ZF9gI9LJ/Mg9CT5l+wpTzR4VmT6rJF01RFbPG4LZt/c55YsknuzeOVZVvJoTeKPM5Mox/hpvuTLpskeFf2NZ5J/kewo58i+SLWPuX1RYO+yOpzhL89vwZSlFbUwMVFt7s2WbRGpUyHq7KkZOL5sDoeeM1Sai/JhOEuXv8kUy8am3UUF4zA61hxte91L4E8GJ8SZCuaxWbOGNeWw0xlyq+QVjYJnR/D43v60RPFhX/2BbjJTkuGweSXkt4ov6Jp/czlCUeUDwm2+WCYaX4DS/AVSa8lJw8sz0vwPSwkaKcY8b/cHmv6ooz01ywddgRb9J70yXJcJEgAOmKhhaCkFsrVtXbwLUvBAnJ+SbL1LwKk+NgqQG1QiASKSvuSIC9IE2wKQkPfuJSaVA22yKpOwaJTLTsqFS7ienstwewL7kUqfgNPyHuYtLIp0vIan5FQJAPUylJd0JOK7WGpeCoa0v4N8WWMfbexzbPgOC1NyuzJBtWnsYOO+5eHI2nGTNHpaorHHPbuot0X6Tkrb3NNCjxFCqbeydArPRHHvPd+C4ZYQknFUwni7uLMtDTugvmunLjjlXqw2vlGXpaVbdrugwyljnb4fKLyJwdp3B8MqcPGlkjU9TnzH+xp0WafTTdPTGX+ZTa2/QxU6d8M0yJ5Yqdxt8pvfYhXR1nTY8sfWxNKL33mv1fk4fTTaepKXPwdHS9ROLq25P+XGpNL4fY1zYIZ4qeNOM97xzfuaXjb7hXLFKG75W7TdFLLpalFu17pNMycZJ1O9t32a/wC7DSVe52uXvywR3Qyxr1YpVXvVcEZU8barVHz2/wDBhDLLFNSur90lfbsdNQy4abqKVpuTtf05KkY+o6e/6/uarJG9LpRd3UbaX/pI5ZqUJuM71K/h9/3KjkX6Pb/v9hSKnlzYMri3pafCo6em/FcuJr1FGcW97W5i66jDpk6nFXF1d3ba/qjm0uGSUJUmnT+N9yEe9KXTdU03DTa2lEzfSzj78MtaXY8nFNpendPmLuqOvD1U/qjJxmua7lZ3Gl3co7eY+DPNidakdalHqY6nSyLuu5z+v6E9OWL0vuVHMpzxu2mjbH1X+p/ZmzxxyrVgzx//AC0c2XHkg/8AFxWv5ohW0s8Kuv2FGeCe0ptX5MMcsU3Wqvhin07jvF7Abz6GM98GZP4bOTJhzYZU0/uVGofU3E3j1EKUck212kBxxzTWzZetyXZm+TDGStVKPlGa6ST3xy/RkVhKbW1UCyvukzWeLLH/ADMTf2M/Si+U4/cAWVLsNzU1XAfw8atTT+Beg13QPEuKW6ZSzNKnuhJqL9zNP8Cez9r8gZ+pFjU4eScmBw3TUl5RkRY6PVj2RMs8nstvsY2ApFan3dhb7EgmFivUfcUrHcXyUlB/mAyAuWNx35RBFBcckltZAAaeo2Fy7UQFlSK1yRNt9ylJPaSseiL4kBnYxvG0Kn4CgdCDcBNNCK1NC2ZBNgOhBQAAQVYnQgKChFWGxBID2AKmmFMdoLCimEeQtgEXJWjOi0xt32CYzthqY9vAVfBFGoQ9L8DUH32B4kErLSivkbk1wiwqYwZXpvyS5yfcanJfJfE9PTJPY0i5NUyVPyg1FZ1opOHzY/XmtkzLUNqu9hI2j1OTuk0Esinvx8GFitikauRrjy3FwaVdtuDm+WC1eaFI1lFXxVee48UnibppJ7N1dEynqWqUrlwSppc9kUdU8Ota4NrV22VpEqW2qLjiny3bcq+CMWaWNvS+fq+TqU4Z25Yv8PNblKN0muyAyeTH1EU8qUJfllvcvvsZ5sU8M/8AETe9219b/wC/7mk8MsjlLHGfrV/iL+RGeLqFBPtiT5e7k/jcjTPbdSltzOXn4XkrHlnhldVfulF/0Laja9rjKrUeX96/uOKxPad6XLs/qf37/wCxBvPHDrIaou8i3bk6r445OGSlCdTTjL52fbnx9zrw4Ip+rizp/mkpQq1wkle/g6smHDmitc1G1cou1V7357d+4OPNxyqq2fmuODeWnPjt1tHs947P/lhm6HJijKcfdBcu7a2fPkyjKUJqk3v9O/mv+CoM2KUFqdNX9V87tL/Ylydqa2fLo6cc1NPTXuVU1duq/f3MWbplbni2g91F+Ldf0QQsWe5Jv2y8o73lh1ENOSCU/wCZbpnkVvTtfc1xZpY3plwVlrkWbBL8riXDPKva3XeLGsjcbilKL5TM9MXK8ftl/KygnjxZt4e2fdGayZcL0veJckm037JCyOaW6sBrOp8xTIlGNbRVGeuF+6NPyjWGmX0yIJhqg7hKl4Fl9T64ydfBUsT/ACuwjcHvYGceszx2WRtfJf8AFyn9cUzR9NDJbjaMp9OsW8mwvg9jdxSQ1+hneN7EZMbjvF2gR0SxykvbTOecWn7lREZyjwzWOdtVLcLCi2tuwTSXK/UJp8xdoIZmvbNXECKi+GHpt8Grjib22FeKPZt/chUxwvu0N448WJzb+l/oQ5yQPTlilH5XkRSzTqm7Xgl090FUpSXG68DahLyjO2hqT8gVpgu7E9PawuX3JbaYDcfkNkvnyLVfIq2v9OSKLQ00IQFqbQ/U+CBFpFuae1UK2SBCLUvKsHKHggQpGntfAaE+6MwsEXojDeUr+wa12RmAWNNmKVXsqIToblYICRiIoAAIoAel+A0vwAJfIMAKgRa3IKVFTSdIFKuxWxDIuHrYnJt7sQEpANCAqq2Q9XwSAQ7DVQgoB6h2ydgAtTj3Q9SfDMhipGnfcNmQptFppr5KkVjk4vatwnFxfvTtio0io5E9T9yW3yVGSfjb5KttO3Tvklxd1Tv5EnVat14Cx2xzfxCqTUMid6u814JyxjOH8TFQxKPGJPe75Obd01Kq3XwdMcqf/wAi3PLDbS1cX8g4xjb9l057zlzS5Gm5NUpLXslFO1Bc/f8A8FZ8b0+ot5ZXvFK3ExlXv2jSWlcr9V/3uRVp8TUb/NcNmlwr8bnT03VXt6qjN1csl793wcjSdt8WoqaVR/XYJN1eSN6raktr7AenDO9aUqjL+bGm9Kbp38BnhHLjc6Vv3VG32bv95I5oZHkgmpPJKLv09KWulduua3NcOeULSnceJe5LfxH4DMc+TG8eTa2rpNd0nX6cGnT5rioT9y/LJLulsv6mnURjBtpJ45bx7p8pcLyc2SCxZLq43y1yrrjzsUb5caySak0sidaru38nO003jmmpLZWaxlrSjs5JJJJfV3oHpyxUZcrhrlfD+LfJUZQyzxO4v7o6YZ8WZJTTjLs0c8ovib3a58/KMWmnXcEeinFrTl90XxJcr7kShLF7W9UHwzmhmdU2dGHqFXp5VcWGYzy4dauPPg5t4ve0zuyReKpLeD4a7EyrIrTTC5rlWWXd/qaanNVq93+5osF/VBV5TFLporeE7QGDnki61NFRzN7T3Q5bbZI2vPch4r3hK0FOUFL6dhRm4e2XAk+0lT8l02t6kvKAUscZR1Qe/gy4LpwlXYvSprfnySLWUX4YN38FTxThu1t5J+rZ8gJNoLsKfFD0NdgqeBqXncQEDuP8pSlHvEgARdRfFoTh4aJToq7KiblFlKSls+Q+GS41wRTlGuCCoz7MbimriDiLHYilHyFAi00inLG+24SsgLcU+GTQCHS7sVCoKrT4dktNchwUp9nuBAFOF7xJquSKQ3XYdJicWAgHpfgHFrsAgAAqlNhJtvkmg4CQDS8jTABOrdcBQWFoBpgGwAKrCgbFYDoLEBFFhYCFDsLEAoqhBbFuKGIBuuxAhiAC1kaNE1L3J7mA06NZqbjubWdXJU0q2MZYWlcHqXczhlaatWvB0xnGa1XpXaJrGPcc6a3r9Ssc3hyLJBu0bzxKabglGXjyYNape/Zha6NWPHeb1ZTeVbxi6aMWoqSUPU0R9zcttx9Pl9KclojJPZauz8muaE9NZ+pcYy3Uab/oBzp7xk3Ft3JuTtP9BJUnpbT0q0+9vsNu9Uo8fTFbDlVtPi0t3cl9iKFKptxbxTV8WkvjydT51RWiW6jqpRiqVv77nLu4v260k2q5Xyy8Uoxem1LFJ1ut48W6A7MEoZYOClqaX+HSpulsqXmzJpKUoJXTr2q3a79u7HOUoy1erJzq06tb8V/c1zQtKdS0J6W5yvjl/qysuWvTehtpb6L3avZt/sN/VVpNfZRf3Ki/bpXFcK1b+ftuTNVFJ+/EvpbdX8gNStaZWnWy87f7EZcWzlHevAk6S31Rvlcp7b0aRm1G7jqStNurW7COQuM79sv3N3hx54a8Mkpd4swnhyY/rg1+gV04M7j7Jfqn3HLGt3ibT50nGm/2No5HNU3TXDKm4JZMidNtBDI75LjOOX2TajLyzPJinje6teVwEaOfaSteRaMb3Umn8GSlW1ic0nTiBq0++/yZtU/bsNSj2k0/ktNNVJW/KAlZrWme4JQ51UTODXyvJFK9yK6odVHHso618lqfTZvqgov7nBugtirHbkSi9O1djFqmRjyXHRLjt8C1uLp7lqRUoJ7oyaa5NYyi3Sf7mqxRlzJELHKB0S6dR49y+DNwi/KYi1kI0lCiCNVSlfIyLHGVc8BIr2PkIqK3TE4p/STTQGtrwrJakyddBrLSE4sSHqY7silYamOk/uS7QDbYrAGFIAEQUpNcMHK+SQAAUmu4ART1Mam+5ACkXcfAEAKQ0x2SAFCsAAAAACwAAAAABAAEAAAAAAANOgsRVoomwHQECGIAGAhlAOLppiADox5NMlKG8+dzbUuou0o5PKezOJOjaM4vfTRvNY3BPHpVvmzbp8kKbnHXPw90EXHMlBtqS8mD1Ycvtluu6CddGfFki1knoUI8RVb/AKGEXpUd2quVxW6/U6+nePqPbKDySlu9Tqv1MOow5MU3rVOW0dMtqGrms2lSTpOtmnd79xye8rajLe5R4l8bCvTqVVC0nG9xN0lfujvSv6SK6cWZ404zkscN6guU9ufK+DowPGoyk1eJqrhSattq99ntwcKu5aVGclzJ7qtvJrDJPFJTqqf1Y2q73+oRpOM8eRwkpKS3q91xQ4e+4JxU1dOUto7O/wBDW8fU4NWOKuG8lu7bb0xrvsjmaaVStNKk3STpLb+oRG2q4b12bu9+PkUZJL2txXlJOV1x9jbOnlXqPV6itzde1K2kYytN7KMkt+OP7lBmuOX1I37r1Wu9vYazTW8ZtX2sqKU4uFTcZPl8J771/wB7nPvCTi1fwCVq8rb3p/oFRk7j7WZteN0OMqYSFljxL9ysXUSx+17x8M1SWSNd6OScXCTi+UFz12enDOrxfV4MZ4Z8OLTRipOLtOmdMMnrRScqyLj5FpuRztNcoFJrhmrbTqSv4J9PV9D38MLVY8nbn4L9NZF7Hv4MNE4/lZpBtK1afwMZ1E4Si6kqIOhZG1Td+LM5fKoRc1maf5kf9S/qQwTp2iKQ05LhsuUVNao89zK2FxrHLkjxJl+q5LerOe2CYqRvraJahP4ZClfIFSCcHB/BBtGdKpK0TkjFbx4JGs1CdF/WtuSLGmvswJA0rWvkzaaIpqr34AQ0AWVtLklqhBDlFoE/JUZ7U90Nxg+9FEOPgNLK0fyslqS5CiqDUu6Dcq4em46fdf1WQTqXgd32IaaABun2EA7IqQKsBAgEMACwEA7AQAMQxAAABAAAAAxDABAMArZOwQAUPngkpNIG/gaJAAIAYgAYABQDTrgQ9kBvHLJpST93g0yYp5Mcs1JVyc0JuMro6IvTHU3ep8G3PfGEJOLuO1Hp9Pm6fq8fo54wjOK/w2lSv5PNyxcZPZpMm3ytlZFldWfpcvSyVqO26muGYK1FuN1Xu24O/B1Uuog4SkvVeynLsjLLhhkevGn9VKOnaZYl/wBczpqragrcW1yVFwu4asTvaV2iJLS2pLzST4ZopZFL3ZYxbe8Jcc91wRpeLqJ4s6zerCU1utSb7HTnjjdZMTWiSvSkrSW+77bnC1KOyw71d03arn/k36bP6c3jyzisU3/iaHVpL9gNMM1SWX3wTWrffa29/uyMuGWNpPeNJxlxzW7HKMnJLicknVr81tfdUa4ZrLFwnCLtubbkqrb9uAjkW+9OVPm6XfYrND1Y6l9aXlPUh5Mbq01JJUm399qQo77RV/bHz+/3KOZScXurLWl8N/ZmuSEcrdOp35u38/JzTjLHKpxpkXrbHKnvsa5cf8RDVFJZIrdeUc0Zp8m2Obi00/sVnjmaadNUCdO1ydmdKcfVhTT+qPhnNKK5X7Ei5taqfrQt/XHn5I1L80TOMnGSa5RpkprWuH/QtIFJdpv9RqTi7e5iwtkpHT6etasbv4IT7SM45HF2nR0PTnhqj9a5+S1JGMoVut0Q1RopVsx6VJCFjKMnGVo19mX4kZyxyTqrFpkuzRGjljadEtNFKd7SDU12sHqB20Vqi+VX2FKHdO0A00yotcPhmI1Jim4vJBx3W6INYTjxJ0injx8qVhLOsoyceDeLw5I1NNS8mUlX0ozcmOLK2n07SuMtS+DJpocMkovZl+su8Ux4e4zt8UDNPWXZJB6qe0kmBkBcormL/QWm/gKm6K1v7icJLsKmQU3ZNsQ7vkAUmg2fwLdARQ1QDT7MTVAAABAgAAAbdiAAAAIAAGUIBgtnYCAAAAAaTfACAAAYCGigorUuKJ5HVMITrsIvaSJaoauEMQyAAQygHsIYBZrha1LV2Mhx5Kzroy5HnTbjwc/y+DqxZnFOoKnzsYTilK+z4LqZ/hRk4tPx5OyGdOCnka2VQhHZp+ThXyaY8jhLUkrSpWhhuOvLhSUoS0w0pJy5bZzKOibXp65Lm7rnk1xZY49MJu4K5yaW90b5enlnxqvUnk0qXtapJ70VOOOUdqbeLvpdtPnf/gm+VCK4e8uXsaKLXt0v/wDM+Hu+/YiWrR71oj2XzXj5I02hNTWiUoJ25a1/pjsiFk0+3JF2kn9Nfl2M7tWoRjF3Vm0k+oTa92VapSalSUVFEV1anlUpQbbepprfbj/nuY5IKTcquub3qq3/ALo58GR45tUvdSdvbZp/8HZF+q0lq9RcaWt0rt8fC/8AJWZHP2ins2qT4vjav15BpZIaW00uHe6/sv6lZIaZOUYpxf1JfSt+7/QyXa7aX5mrrhW/K8BWM4OE3GXbugjJxezOhxWWGm6mvp1SSS7/AKnKRXTiyK7XDVSiKcdErXHKME3F2mdEJxyRae3/AAaZ3Ixklyv1NMLi3TdX54FOLg6ZlLZk4da5cEobq6MTbD1Dj7Z+6Pg0yY4ZI6obDpZ1yFY5uElJdhSTi6YiNOjIlKpx4f8AQhNrhixyq49mPbjhlZ4r1Z1abtC/icir3avhoFaM5x0yGrkb68eVb41F/BOnHw5NGC2NFJTVPkU3FPFDtMSjX5k0S7i/gE0D05RIcWjWMq+UJ7CGayGm0U0pK0QZa6pT8le2XOzMwLUipRcSWVGXZ8DlB1a3QEAAEU06GSFlqRSm0P1G+UTyLgUhvkQ1vsJkUJja8CDgAAa35Bxa7AIBAAAAGVAAAQAAAAAAFIbVkFKRpCaYjVNMHBMsKyAtwJexItIAAyAbdsQFDuhpNkjtgUqTCS7oWljWyqzSIAck0IyoGIZQAAAOxqxD3KjSEnp0LuzXqNNKDq4rsc8eUdGL0alPIpSfhGmdc33D7lZKcnJKl4J+SNLT2kr5Zv0+eeCacWnBzTlHzRzJvwO9l+oSPTjjwdWozhF4Jy0qnvGT1bv/ANnNm6J41qvWtLaqS3XF/v2MMcoxb1QU9kt9qO/FklJ/w7m3J0oenK4xirbQTjz8sZQnJZlL1Laae1MGnFtOEI87N8bfc6pTU4SSer2yepuuX99zmy4vTlJRjqhckpy21URrNaZI+tc4KOvduEI7RSit/wDciEk4NPaUUlHtuSpNN1Jb39MeVRtp9SXqYqjkTctCf0pRu7/cDfDmhnn6WZRWS6qnJSdpVt+v3Ms2CWFxbunVSku9J1XhGMo64KcE6ik5PzJvsa9P1C0ShKovT2rigkRC7Suvj9rafyPqMbyQeaKdr/M22RpkTjJvRcU3aj2548rYeN6UpY2skePlcpJr+pRwAm07R0dX08cdZcW+GfD8HORXRjyxlHRNX/wKeFte1qS8nOawm/O/ktSTiNElyXjcsUv90Ocr3ZF33B10zxKcG4NSTW3lHI006ZriyODqzXJBZ1qilHKuV5CZ45DT618mbTTpjUmnaI0am0bR05cbjXuXBn7Zq1s/AlLTK9O5UiZJxdMR1XiyRtp/JnLHj/K2If0zU+0t0KSp/BTx+GKnwyKmy1K+SZc8UIEU1TtCavdDjLswaae3AEgU1e6J4IoKhkcflEgBs8ayrVj57oxaadNUxxk4u06N1mjlVZVv/MXqcc4GssDq4PUvgzcWuUSFIEwAKKoa3XyJOh0nwAmmgorcTTAQ1JokCUVr+AJAXSAAAigAAAAAIAAAoAAAio8miADpjP0bMpcgA0+UgAHNoAAAA+4AUX2I7gBrUxpL6TIAGmAAAyoGwAoaBgBUOPJtj+mQAaxnWcyAAmrhrgSAAprlHfjSX4TKSXu1PfuAFxnV9ckopJVUcbXx7Uc/4nt1OSC2jGcqS4QATTGPUNrLJJ0r4/Qptxy6U6i4JtLj6QAjTo6lL+NmqVa4Kv0OPNtkklslJ0gAg78e/SOb3k4Nt93/AJhn1CUOslpWnefG3kANI2xJPp+rTW1J1+h5fYAIYQdwANN48R+zMQArOBG8W9UHYAXE+i6z/OZgAGd61nAuS8nYAB+jF9QwAucTehcnRkS/h06VgBWf1yz5IADDphlrgALiaT+ocvpAAIAAIoAAAvG2pKmzSXLADWcY3rGf1CADLYAAAtfSSgAqJAAMqAACD//Z".replace("data:image/jpeg;base64,", ""), 0))};
                } catch (Exception e) {
                    return new Object[]{500, str2, new ByteArrayInputStream("Failed to decode image".getBytes(str))};
                }
            }
        }
        return new Object[]{400, str2, new ByteArrayInputStream("Invalid parameters".getBytes(str))};
    }

    private static void q(View view, String[] strArr, List<View> list) {
        if (view instanceof TextView) {
            String charSequence = ((TextView) view).getText().toString();
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (charSequence.contains(strArr[i2])) {
                    list.add(view);
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                q(viewGroup.getChildAt(i3), strArr, list);
            }
        }
    }

    public static /* synthetic */ void tF() {
        N = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a2 -> B:25:0x00a3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void yq(android.view.View r13) {
        /*
            r12 = 1
            r11 = -256(0xffffffffffffff00, float:NaN)
            r2 = -1
            r10 = 0
            boolean r1 = com.github.catvod.spider.ProxyOrigin.i
            if (r1 != 0) goto L76
            android.app.Application r1 = com.github.catvod.spider.InitOrigin.context()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.app.Application r4 = com.github.catvod.spider.InitOrigin.context()
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            short[] r4 = com.github.catvod.spider.ProxyOrigin.f46short
            r5 = 1614(0x64e, float:2.262E-42)
            r6 = 12
            r7 = 2319(0x90f, float:3.25E-42)
            java.lang.String r4 = com.github.catvod.parser.C0007.m210(r4, r5, r6, r7)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.content.SharedPreferences r3 = r1.getSharedPreferences(r3, r10)
            short[] r1 = com.github.catvod.spider.ProxyOrigin.f46short
            r4 = 1626(0x65a, float:2.279E-42)
            r5 = 5
            r6 = 839(0x347, float:1.176E-42)
            java.lang.String r4 = com.github.catvod.spider.merge.C0027.m1601(r1, r4, r5, r6)
            boolean r5 = r3.getBoolean(r4, r12)
            if (r13 == 0) goto La3
            boolean r1 = r13 instanceof android.widget.TextView     // Catch: java.lang.Exception -> La2
            if (r1 == 0) goto L77
            r0 = r13
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> La2
            r1 = r0
            int r1 = r1.getCurrentTextColor()     // Catch: java.lang.Exception -> La2
        L51:
            if (r1 != r2) goto La5
            if (r5 != 0) goto La5
            boolean r1 = r13 instanceof android.widget.TextView
            if (r1 == 0) goto L5e
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r11)
        L5e:
            android.content.SharedPreferences$Editor r1 = r3.edit()
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r4, r12)
            r1.apply()
            java.lang.String r1 = com.github.catvod.spider.merge.lW.v
            boolean r1 = com.github.catvod.spider.merge.Rc.g9(r1)
            if (r1 != 0) goto L76
            com.github.catvod.spider.merge.XM r1 = com.github.catvod.spider.merge.XM.N
        L73:
            com.github.catvod.spider.InitOrigin.execute(r1)
        L76:
            return
        L77:
            java.lang.Class r1 = r13.getClass()     // Catch: java.lang.Exception -> La2
            short[] r6 = com.github.catvod.spider.ProxyOrigin.f46short     // Catch: java.lang.Exception -> La2
            r7 = 1631(0x65f, float:2.286E-42)
            r8 = 19
            r9 = 2886(0xb46, float:4.044E-42)
            java.lang.String r6 = com.github.catvod.spider.merge.C0036.m1850(r6, r7, r8, r9)     // Catch: java.lang.Exception -> La2
            r7 = 0
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> La2
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch: java.lang.Exception -> La2
            if (r1 == 0) goto La3
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La2
            java.lang.Object r1 = r1.invoke(r13, r6)     // Catch: java.lang.Exception -> La2
            boolean r6 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> La2
            if (r6 == 0) goto La3
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> La2
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> La2
            goto L51
        La2:
            r1 = move-exception
        La3:
            r1 = r2
            goto L51
        La5:
            if (r1 == r11) goto Lab
            r6 = -5317(0xffffffffffffeb3b, float:NaN)
            if (r1 != r6) goto L76
        Lab:
            if (r5 == 0) goto L76
            boolean r1 = r13 instanceof android.widget.TextView
            if (r1 == 0) goto Lb6
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r2)
        Lb6:
            android.content.SharedPreferences$Editor r1 = r3.edit()
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r4, r10)
            r1.apply()
            com.github.catvod.spider.merge.PR r1 = com.github.catvod.spider.merge.PR.SN
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.ProxyOrigin.yq(android.view.View):void");
    }

}
