package com.github.catvod.spider;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
import com.github.catvod.spider.merge.L9;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Nmyswv extends Spider {
    public static JSONObject N;
    private String yq = C0031.m1705();

    /* renamed from: short */
    private static final short[] f40short = {1584, 1580, 1580, 1576, 1579, 1634, 1655, 1655, 1582, 1585, 1576, 1654, 1583, 1583, 1599, 1570, 1654, 1595, 1590, 1634, 1645, 1642, 1640, 1640, 1655, 3151, 3177, 3199, 3176, 3127, 3163, 3197, 3199, 3188, 3182, 2448, 2463, 2450, 2432, 2432, 2390, 2378, 2382, 2397, 2066, 2049, 2070, 2066, 3024, 3019, 808, 821, 824, 2440, 2510, 2505, 2499, 2498, 2527, 2441, 2519, 2511, 2519, 2456, 2506, 2458, 2513, 2504, 2499, 2442, 2507, 2510, 2516, 2515, 2442, 2510, 2499, 2442, 2434, 2516, 2442, 2519, 2496, 2442, 2434, 2516, 2442, 2504, 2517, 2499, 2498, 2517, 2442, 2442, 2501, 2526, 2442, 2434, 2516, 2442, 2500, 2507, 2502, 2516, 2516, 2442, 2442, 2526, 2498, 2502, 2517, 2442, 2434, 2516, 2442, 2507, 2498, 2515, 2515, 2498, 2517, 2442, 2442, 2502, 2517, 2498, 2502, 2442, 2434, 2516, 2442, 2507, 2502, 2505, 2496, 2442, 2441, 2511, 2515, 2506, 2507, 2418, 2411, 2345, 2421, 2402, 2420, 2414, 2429, 2402, 2392, 2411, 2414, 2420, 2419, 2343, 2361, 2343, 2411, 2414, 1527, 1462, 1448, 1462, 1522, 1535, 1504, 1462, 1448, 1462, 1535, 1531, 1521, 3084, 3085, 3100, 2409, 3154, 3144, 3167, 3164, 2941, 2912, 2941, 2917, 2924, 1188, 1253, 1275, 1253, 1185, 1196, 1203, 1253, 1275, 1253, 1206, 1205, 1188, 1195, 1259, 1206, 1159, 1194, 1201, 1201, 1194, 1192, 1253, 1275, 1253, 1206, 1205, 1188, 1195, 1889, 1912, 1907, 1864, 1918, 1907, 771, 794, 785, 810, 795, 788, 792, 784, 1782, 1775, 1764, 1759, 1776, 1769, 1763, 3182, 3191, 3196, 3143, 3178, 3197, 3189, 3193, 3178, 3187, 3179, 1647, 1590, 1577, 1651, 1646, 1651, 1643, 1634, 1575, 1593, 1575, 1638, 2534, 2544, 2550, 2529, 2556, 2554, 2555, 2491, 2533, 2548, 2546, 2544, 2488, 2557, 2545, 2485, 2475, 2485, 2548, 2485, 2475, 2485, 2556, 2552, 2546, 1755, 1754, 1739, 1793, 1810, 1812, 1801, 1795, 1804, 1797, 1870, 1796, 1797, 1812, 1793, 1801, 1804, 1869, 1795, 1807, 1806, 1856, 1886, 1856, 1808, -3030, 1724, 1706, 1708, 1723, 1702, 1696, 1697, 1761, 1727, 1710, 1704, 1706, 1762, 1709, 1707, 1775, 1777, 1775, 1707, 1702, 1721, 1761, 1707, 1706, 1724, 1708, 1680, 1702, 1723, 1706, 1698, 1781, 1697, 1723, 1703, 1762, 1708, 1703, 1702, 1699, 1707, 1767, 1788, 1766, 1775, 1777, 1775, 1710, 1556, 1538, 1540, 1555, 1550, 1544, 1545, 1609, 1559, 1542, 1536, 1538, 1610, 1541, 1539, 1607, 1625, 1607, 1539, 1550, 1553, 1609, 1539, 1538, 1556, 1540, 1592, 1550, 1555, 1538, 1546, 1629, 1545, 1555, 1551, 1610, 1540, 1551, 1550, 1547, 1539, 1615, 1618, 1614, 1607, 1625, 1607, 1542, 1304, 1388, 1364, 1355, 1284, 1357, 1305, 2065, 2055, 2049, 2070, 2059, 2061, 2060, 2124, 2066, 2051, 2053, 2055, 2127, 2048, 2054, 2114, 2140, 2114, 2054, 2059, 2068, 2124, 2054, 2055, 2065, 2049, 2109, 2059, 2070, 2055, 2063, 2136, 2060, 2070, 2058, 2127, 2049, 2058, 2059, 2062, 2054, 2122, 2134, 2123, 2114, 2140, 2114, 2051, 2750, 2728, 2734, 2745, 2724, 2722, 2723, 2787, 2749, 2732, 2730, 2728, 2784, 2735, 2729, 2797, 2803, 2797, 2729, 2724, 2747, 2787, 2729, 2728, 2750, 2734, 2706, 2724, 2745, 2728, 2720, 2807, 2723, 2745, 2725, 2784, 2734, 2725, 2724, 2721, 2729, 2789, 2815, 2788, 2797, 2803, 2797, 2731, 2722, 2723, 2745, 1063, 1066, 1077, 1133, 1069, 1078, 1070, 1039, 1066, 1072, 1079, 3282, 3278, 3284, 3283, 3266, 3268, 3282, 3212, 1062, 1067, 1076, 1132, 1067, 1062, 299, 311, 301, 298, 315, 317, 278, 313, 309, 317, 373, 480, 505, 437, 427, 437, 505, 508, 437, 427, 437, 500, 2902, 743, 765, 746, 745, 439, 489, 431, 482, 29198, -32418, 1232, 2247, 2247, 2247, 3056, 32040, 22380, 497, 31011, -31280, 24177, 774, 30059, -30227, 1607, 22358, 27349, 1202, 1206, 29365, 22335, 417, 428, 435, 491, 418, 425, 426, 423, 420, 425, 405, 428, 422, 393, 428, 438, 433, 1040, 1033, 1093, 1115, 1093, 1033, 1036, 2810, 2747, 2725, 2747, 2815, 2802, 2797, 2747, 2725, 2747, 2802, 2806, 2812, 1076, 1073, 1060, 1073, 1149, 1059, 1058, 1075, 2106, 451, 473, 462, 461, 1875, 1870, 1875, 1867, 1858, 1701, 1764, 1786, 1764, 1696, 1709, 1714, 1764, 1786, 1764, 1719, 1716, 1701, 1706, 1770, 1719, 1670, 1707, 1712, 1712, 1707, 1705, 1764, 1786, 1764, 1719, 1716, 1701, 1706, 2111, 2081, 2111, 2822, 2847, 2836, 2909, 2816, 2844, 2833, 2825, 2909, 2841, 2836, 2909, 2860, 2836, 2907, 2909, 2819, 2818, 2835, 2909, 2904, 2860, 2836, 2907, 2905, 2909, 2846, 2821, 2845, 2909, 2860, 2836, 2907, 2318, 2327, 2332, 2389, 2312, 2324, 2329, 2305, 2389, 2321, 2332, 2389, 2340, 2332, 2387, 2389, 2315, 2314, 2331, 2389, 2340, 2332, 2387, 2389, 2326, 2317, 2325, 2389, 2384, 2340, 2332, 2387, 2385, 2257, 2269, 2271, 2275, 2249, 2254, 2256, 2177, 2203, 2196, 2194, 2198, 2179, 2197, 2203, 2183, 2301, 2181, 2301, 2181, 2301, 2181, 883, 2040, 1920, 3166, 3101, 3139, 3077, 3144, 627, 596, 1145, 1145, 1062, 1062, 1145, 2326, 497, 430, 430, 430, 497, 1825, 3009, 3006, 3009, 3006, 3009, 2730, 2968, 3038, 3033, 3027, 3026, 3023, 2969, 3015, 3039, 3015, 2952, 3034, 2954, 3009, 3032, 3027, 2970, 3012, 3026, 3030, 3013, 3028, 3039, 2961, 3008, 3027, 2954, 839, 862, 873, 859, 854, 783, 854, 851, 838, 851, 877, 862, 859, 833, 838, 879, 786, 780, 786, 862, 859, 1608, 1612, 1606, 733, 728, 717, 728, 660, 714, 715, 730, 1350, 2189, 2199, 2176, 2179, 813, 814, 831, 816, 880, 813, 778, 823, 810, 1612, 1549, 1555, 1549, 1609, 1604, 1627, 1549, 1555, 1549, 1630, 1629, 1612, 1603, 1539, 1627, 1602, 1609, 1650, 1631, 1608, 1600, 1612, 1631, 1606, 1630};
    private static String SN = C0022.m1433(m936(), 0, 25, 1624);

    /* renamed from: com.github.catvod.spider.Nmyswv$1 */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    class AnonymousClass1 extends WebViewClient {

        /* renamed from: com.github.catvod.spider.Nmyswv$1$1 */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        class RunnableC00161 implements Runnable {
            final /* synthetic */ Map N;
            final /* synthetic */ String SN;
            final /* synthetic */ WebView yq;

            @Override // java.lang.Runnable
            @TargetApi(19)
            public void run() {
                this.yq.loadUrl(this.SN, this.N);
            }
        }

        /* renamed from: com.github.catvod.spider.Nmyswv$1$2 */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        class AnonymousClass2 implements Runnable {
            final /* synthetic */ WebView yq;

            @Override // java.lang.Runnable
            @TargetApi(19)
            public void run() {
                this.yq.destroy();
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(19)
        public void onPageFinished(WebView webView, String str) {
            throw null;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            int i = Build.VERSION.SDK_INT;
            String uri = i >= 21 ? webResourceRequest.getUrl().toString() : null;
            PrintStream printStream = System.out;
            printStream.println("SIRequest URL: " + uri);
            (i >= 21 ? webResourceRequest.getRequestHeaders() : null).get("Referer");
            throw null;
        }
    }

    public Nmyswv() {
        int i = C0025.m1534();
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
                    System.out.println(Long.parseLong(C0005.m161("fWOA7HiyeTjSTwNEw")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private HashMap<String, String> SN() {
        String str = "ۧ۟ۥ";
        String str2 = null;
        HashMap<String, String> hashMap = null;
        short[] sArr = null;
        String str3 = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56294:
                    str2 = C0040.m1953(sArr, 25, 10, 3098);
                    str = "ۣ۠ۧ";
                    break;
                case 1747900:
                    C0042.m1999(hashMap, str2, str3);
                    str = "ۥۤۦ";
                    break;
                case 1752615:
                    return hashMap;
                case 1753662:
                    sArr = m936();
                    str = "۟ۥ";
                    break;
                case 1754381:
                    hashMap = new HashMap<>();
                    str = "ۦۣ۠";
                    break;
                default:
                    str3 = C0020.m1379();
                    str = "ۦۧ۟";
                    break;
            }
        }
    }

    public static void addView(View view, ViewGroup.LayoutParams layoutParams) {
        int i;
        try {
            C0015.m459((ViewGroup) C0004.m133(C0051.m2231(C0001.m29(C0022.m1444())), 16908290), view, layoutParams);
            i = 1616;
        } catch (Exception e) {
            C0011.m342(e);
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    int i2 = C0015.m447();
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (i2 > 0) {
                                    break;
                                } else {
                                    i3 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                System.out.println(Float.parseFloat(C0012.m362("FU5yDM0N9wCyBmpoy7rvP5")));
                                return;
                        }
                        i3 = 1802;
                    }
                    break;
                case 49:
                    i = 1647;
                    break;
            }
        }
    }

    public static void loadWebView(String str, WebViewClient webViewClient) {
        C0057.m2371(new L9(webViewClient, str, 1));
    }

    public static void removeView(View view) {
        try {
            C0031.m1722((ViewGroup) C0004.m133(C0051.m2231(C0001.m29(C0022.m1444())), 16908290), view);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        return;
                    case 49:
                        i = 1647;
                        break;
                }
            }
        } catch (Exception e) {
            C0011.m342(e);
        }
    }

    public static /* synthetic */ void yq(WebViewClient webViewClient, String str) {
        WebView webView = new WebView(C0010.m312());
        C0029.m1660(C0026.m1562(webView), true);
        C0004.m144(C0026.m1562(webView), true);
        C0008.m258(C0026.m1562(webView), true);
        int i = C0014.m430();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 21) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    C0022.m1419(C0026.m1562(webView), 0);
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        C0026.m1554(C0026.m1562(webView), C0020.m1379());
        C0044.m2071(webView, new ViewGroup.LayoutParams(0, 0));
        C0006.m198(webView, webViewClient);
        C0005.m165(webView, str);
        int i3 = C0029.m1639();
        int i4 = 1740;
        while (true) {
            i4 ^= 1757;
            switch (i4) {
                case 17:
                    if (i3 > 0) {
                        break;
                    } else {
                        i4 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    System.out.println(Double.parseDouble(C0047.m2135("LPuTdb0CUDMUaNPGJG3RBEL11LYO")));
                    return;
            }
            i4 = 1802;
        }
    }

    /* renamed from: سجيك */
    public static void m934(Object obj) {
        int i = C0001.m25();
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
                    SpiderDebug.log((String) obj);
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

    /* renamed from: صﻡﺫز */
    public static String m935() {
        int i = C0042.m1998();
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
                    return SN;
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

    /* renamed from: ﺡﺫﺯﻁ */
    public static short[] m936() {
        int i = C0007.m214();
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
                    return f40short;
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

    /* renamed from: ﺽﻉﻡﺎ */
    public static HashMap m937(Object obj) {
        int i = C0046.m2112();
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
                    return ((Nmyswv) obj).SN();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object[], java.lang.Object] */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        JSONArray jSONArray = new JSONArray();
        String str3 = C0050.m2224(m936(), 35, 5, 2547);
        Object obj = C0007.m220(hashMap, str3);
        String str4 = C0031.m1705();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (obj != null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    C0042.m1999(hashMap, str3, str4);
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        String str5 = C0014.m421(m936(), 40, 4, 2351);
        Object obj2 = C0007.m220(hashMap, str5);
        int i2 = 1740;
        while (true) {
            i2 ^= 1757;
            switch (i2) {
                case 17:
                    if (obj2 != null) {
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
                    C0042.m1999(hashMap, str5, str4);
                    break;
            }
            i2 = 1802;
        }
        String str6 = C0006.m180(m936(), 44, 4, 2163);
        Object obj3 = C0007.m220(hashMap, str6);
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    if (obj3 != null) {
                        break;
                    } else {
                        i3 = 48736;
                        continue;
                    }
                case 47384:
                    break;
                case 47417:
                    C0042.m1999(hashMap, str6, str4);
                    break;
                case 47483:
                    break;
            }
            i3 = 48705;
        }
        String str7 = C0020.m1390(m936(), 48, 2, 2994);
        Object obj4 = C0007.m220(hashMap, str7);
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                    break;
                case 45:
                    break;
                case 76:
                    C0042.m1999(hashMap, str7, str4);
                    break;
                case 239:
                    if (obj4 != null) {
                        break;
                    } else {
                        i4 = 48860;
                        continue;
                    }
            }
            i4 = 48829;
        }
        String str8 = (String) C0007.m220(hashMap, str7);
        String str9 = (String) C0007.m220(hashMap, str5);
        String str10 = C0010.m314((String) C0007.m220(hashMap, str6));
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m935());
        String str11 = C0013.m380(m936(), 50, 3, 860);
        boolean z2 = C0011.m326(hashMap, str11);
        int i5 = 48891;
        while (true) {
            i5 ^= 48908;
            switch (i5) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    if (!z2) {
                        break;
                    } else {
                        i5 = 49635;
                        continue;
                    }
                case 32495:
                    str = C0007.m220(hashMap, str11);
                    break;
            }
            i5 = 48953;
        }
        C0032.m1746(sb, C0048.m2160(C0024.m1513(m936(), 53, 88, 2471), new Object[]{str, str2, str8, str9, str10}));
        Iterator it = C0004.m122(C0014.m434(C0004.m119(C0028.m1633(C0043.m2039(sb), m937(this))), C0034.m1781(m936(), 141, 19, 2311)));
        while (true) {
            boolean z3 = C0000.m11(it);
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        i6 = z3 ? 49759 : 49728;
                    case 50:
                    case 76:
                        hN hNVar = (hN) C0026.m1556(it);
                        String str12 = C0023.m1479(C0014.m434(hNVar, C0057.m2384(m936(), 160, 13, 1430)), C0000.m18(m936(), 173, 3, 3199));
                        String str13 = C0049.m2175(m936(), 176, 1, 2312);
                        String str14 = C0023.m1479(C0014.m434(hNVar, str13), C0001.m35(m936(), 177, 4, 3130));
                        String str15 = C0023.m1479(C0014.m434(hNVar, str13), C0054.m2301(m936(), 181, 5, 2825));
                        boolean z4 = C0010.m289(str15);
                        int i7 = 49790;
                        while (true) {
                            i7 ^= 49807;
                            switch (i7) {
                                case 18:
                                case 51:
                                    String str16 = C0008.m242(C0022.m1431(C0014.m434(hNVar, C0050.m2224(m936(), 186, 29, 1221))));
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        C0005.m159(jSONObject, C0033.m1764(m936(), 215, 6, 1815), str14);
                                        C0005.m159(jSONObject, C0025.m1542(m936(), 221, 8, 885), str15);
                                        C0005.m159(jSONObject, C0013.m380(m936(), 229, 7, 1664), str12);
                                        C0005.m159(jSONObject, C0040.m1953(m936(), 236, 11, 3096), str16);
                                        C0041.m1985(jSONArray, jSONObject);
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
                                    } catch (JSONException e) {
                                        throw new RuntimeException(e);
                                    }
                                    break;
                                case 84:
                                    int i9 = 49914;
                                    while (true) {
                                        i9 ^= 49931;
                                        switch (i9) {
                                            case 497:
                                                i9 = 50596;
                                            case 1711:
                                                break;
                                        }
                                    }
                                    break;
                                case 241:
                                    i7 = z4 ? 49883 : 49852;
                            }
                        }
                        break;
                    case 83:
                        JSONObject jSONObject2 = new JSONObject();
                        C0012.m364(jSONArray, jSONObject2, str2);
                        return C0011.m335(jSONObject2);
                }
            }
        }
    }

    public String detailContent(List<String> list) {
        String str;
        String str2;
        m934(C0001.m33(m935(), (String) C0035.m1801(list, 0)));
        Va va = C0004.m119(C0028.m1633(C0001.m33(m935(), (String) C0035.m1801(list, 0)), m937(this)));
        String str3 = C0032.m1737(C0014.m434(va, C0031.m1713(m936(), 247, 12, 1543)));
        String str4 = C0023.m1479(C0014.m434(va, C0049.m2175(m936(), 259, 25, 2453)), C0022.m1433(m936(), 284, 3, 1704));
        String str5 = C0032.m1737(C0014.m434(va, C0026.m1551(m936(), 287, 22, 1888)));
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
                    String str6 = C0053.m2276(m936(), 309, 1, 2864);
                    boolean z = C0037.m1888(str5, str6);
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
                                int length = C0011.m339(str5, str6).length;
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (length <= 1) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            break;
                                        case 47417:
                                            str = C0011.m339(str5, str6)[1];
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 239:
                                                        i4 = 48798;
                                                        break;
                                                }
                                            }
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
        str = C0031.m1705();
        String str7 = C0032.m1737(C0014.m434(va, C0038.m1903(m936(), 310, 48, 1743)));
        String str8 = C0009.m275(C0032.m1737(C0014.m434(va, C0002.m57(m936(), 358, 48, 1639))), C0025.m1542(m936(), 406, 7, 1328));
        String str9 = C0032.m1737(C0014.m434(va, C0032.m1749(m936(), 413, 48, 2146)));
        String str10 = C0032.m1737(C0014.m434(va, C0039.m1937(m936(), 461, 51, 2765)));
        ME me = new ME();
        C0009.m284(me, (String) C0035.m1801(list, 0));
        C0021.m1409(me, str4);
        C0008.m255(me, str3);
        C0055.m2330(me, str7);
        C0055.m2330(me, str9);
        C0055.m2330(me, str8);
        C0014.m414(me, str10);
        C0044.m2056(me, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str11 = C0023.m1457(m936(), 512, 11, 1091);
        kB kBVar = C0014.m434(va, str11);
        StringBuilder sb = C0052.m2253(C0027.m1601(m936(), 523, 8, 3233));
        C0034.m1785(sb, C0014.m422(kBVar));
        m934(C0043.m2039(sb));
        kB kBVar2 = C0014.m434(va, str11);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            int i7 = C0014.m422(kBVar);
            int i8 = 48891;
            while (true) {
                i8 ^= 48908;
                switch (i8) {
                    case 22:
                    case 53:
                        int i9 = C0000.m16(linkedHashMap);
                        int i10 = 51588;
                        while (true) {
                            i10 ^= 51605;
                            switch (i10) {
                                case 17:
                                    if (i9 <= 0) {
                                        break;
                                    } else {
                                        i10 = 51681;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 87:
                                    break;
                                case 116:
                                    Set set = C0006.m200(linkedHashMap);
                                    String str12 = C0037.m1882(m936(), 571, 3, 2275);
                                    C0020.m1375(me, C0038.m1902(str12, set));
                                    C0005.m160(me, C0038.m1902(str12, C0039.m1934(linkedHashMap)));
                                    break;
                            }
                            i10 = 51650;
                        }
                        return C0000.m21(me);
                    case 503:
                        i8 = i6 < i7 ? 49635 : 48953;
                    case 32495:
                        String str13 = C0013.m381((hN) C0038.m1913(kBVar, i6), C0015.m457(m936(), 531, 6, 1090));
                        StringBuilder sb2 = new StringBuilder();
                        C0032.m1746(sb2, C0012.m361(m936(), 537, 11, 344));
                        C0032.m1746(sb2, str13);
                        m934(C0043.m2039(sb2));
                        kB kBVar3 = C0014.m434((hN) C0038.m1913(kBVar2, i6), C0057.m2384(m936(), 548, 11, 405));
                        ArrayList arrayList = new ArrayList();
                        int i11 = 0;
                        while (true) {
                            int i12 = i11;
                            int i13 = C0014.m422(kBVar3);
                            int i14 = 49666;
                            while (true) {
                                i14 ^= 49683;
                                switch (i14) {
                                    case 17:
                                        i14 = i12 < i13 ? 49759 : 49728;
                                    case 50:
                                    case 76:
                                        hN hNVar = (hN) C0038.m1913(kBVar3, i12);
                                        StringBuilder sb3 = new StringBuilder();
                                        String str14 = C0022.m1427(hNVar);
                                        C0028.m1629();
                                        C0032.m1746(sb3, str14);
                                        C0032.m1746(sb3, C0037.m1882(m936(), 559, 1, 2930));
                                        C0032.m1746(sb3, C0013.m381(hNVar, C0049.m2175(m936(), 560, 4, 655)));
                                        C0003.m116(arrayList, C0043.m2039(sb3));
                                        i11 = i12 + 1;
                                        int i15 = 49790;
                                        while (true) {
                                            i15 ^= 49807;
                                            switch (i15) {
                                                case 18:
                                                    break;
                                                case 241:
                                                    i15 = 49821;
                                            }
                                        }
                                        break;
                                    case 83:
                                        int i16 = C0008.m231(arrayList);
                                        int i17 = 49914;
                                        while (true) {
                                            i17 ^= 49931;
                                            switch (i17) {
                                                case 497:
                                                    i17 = i16 > 0 ? 50658 : 50627;
                                                case 1711:
                                                case 1736:
                                                    break;
                                                case 1769:
                                                    C0037.m1872(arrayList);
                                                    boolean z2 = C0037.m1888(str13, C0041.m1994(m936(), 564, 4, 474));
                                                    int i18 = 50689;
                                                    while (true) {
                                                        i18 ^= 50706;
                                                        switch (i18) {
                                                            case 19:
                                                                i18 = !z2 ? 50782 : 50751;
                                                            case 45:
                                                                str2 = str13;
                                                                break;
                                                            case 50:
                                                            case 76:
                                                                StringBuilder sb4 = C0052.m2253(C0042.m2010(m936(), 568, 2, 3249));
                                                                C0034.m1785(sb4, i6 + 1);
                                                                str2 = C0043.m2039(sb4);
                                                                break;
                                                        }
                                                    }
                                                    C0020.m1364(linkedHashMap, str2, C0038.m1902(C0054.m2301(m936(), 570, 1, 1267), arrayList));
                                                    break;
                                            }
                                        }
                                        i5 = i6 + 1;
                                        int i19 = 50813;
                                        while (true) {
                                            i19 ^= 50830;
                                            switch (i19) {
                                                case 18:
                                                    break;
                                                case 243:
                                                    i19 = 50844;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public String homeContent(boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        Va va = C0004.m119(C0028.m1633(m935(), m937(this)));
        C0003.m116(arrayList2, new rP(C0056.m2339(m936(), 574, 1, 3009), C0040.m1953(m936(), 575, 2, 2077)));
        C0003.m116(arrayList2, new rP(C0045.m2098(m936(), 577, 1, 451), C0048.m2145(m936(), 578, 3, 3094)));
        C0003.m116(arrayList2, new rP(C0031.m1713(m936(), 581, 1, 821), C0003.m86(m936(), 582, 2, 2967)));
        C0003.m116(arrayList2, new rP(C0023.m1457(m936(), 584, 1, 1651), C0038.m1903(m936(), 585, 2, 1534)));
        C0003.m116(arrayList2, new rP(C0050.m2224(m936(), 587, 2, 1152), C0030.m1688(m936(), 589, 2, 1368)));
        try {
            N = new JSONObject(C0003.m112());
            i = 1616;
        } catch (JSONException e) {
            C0011.m342(e);
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    Iterator it = C0004.m122(C0014.m434((hN) C0038.m1913(C0014.m434(va, C0030.m1688(m936(), 591, 17, 453)), 0), C0057.m2384(m936(), 608, 7, 1125)));
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
                                    return C0054.m2296(arrayList2, arrayList, C0035.m1816());
                                case 500:
                                    hN hNVar = (hN) C0026.m1556(it);
                                    String str = C0023.m1479(C0014.m434(hNVar, C0051.m2237(m936(), 615, 13, 2715)), C0033.m1764(m936(), 628, 8, 1104));
                                    String str2 = C0050.m2224(m936(), 636, 1, 2139);
                                    String str3 = C0023.m1479(C0014.m434(hNVar, str2), C0022.m1433(m936(), 637, 4, 427));
                                    String str4 = C0023.m1479(C0014.m434(hNVar, str2), C0004.m130(m936(), 641, 5, 1831));
                                    boolean z3 = C0010.m289(str4);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = z3 ? 48736 : 48705;
                                            case 47384:
                                                C0003.m116(arrayList, new ME(str3, str4, str, C0036.m1853(C0032.m1737(C0014.m434(hNVar, C0035.m1833(m936(), 646, 29, 1732))), C0027.m1601(m936(), 675, 3, 2063), C0031.m1705())));
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i4 = 48922;
                                                    }
                                                }
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
                                    break;
                            }
                        }
                    }
                    break;
                case 49:
                    i = 1647;
                    break;
            }
        }
    }

    public void init(Context context, String str) {
        Nmyswv.super.init(context, str);
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
                    SN = str;
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0029.m1662();
        C0056.m2351(true);
        String str3 = C0011.m339(C0011.m339(C0011.m339(C0009.m275(C0028.m1633(C0001.m33(m935(), str2), m937(this)), C0012.m361(m936(), 744, 16, 2236)), C0050.m2224(m936(), 760, 6, 2209))[C0007.m223(C0009.m275(str2, C0026.m1551(m936(), 678, 33, 2928))) - 1], C0012.m361(m936(), 766, 1, 848))[C0007.m223(C0009.m275(str2, C0004.m130(m936(), 711, 33, 2424))) - 1], C0011.m328(m936(), 767, 2, 1956))[1];
        String str4 = C0003.m86(m936(), 769, 5, 3184);
        boolean z = C0037.m1888(str3, str4);
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
                    C0034.m1788(iXVar, C0048.m2137(str3, null));
                    C0007.m212(iXVar, m937(this));
                    return C0033.m1763(iXVar);
                case 239:
                    boolean z2 = C0030.m1681(str3, C0033.m1764(m936(), 774, 2, 530));
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
                                iX iXVar2 = new iX();
                                C0034.m1788(iXVar2, C0001.m33(m935(), str2));
                                C0053.m2284(iXVar2);
                                C0007.m212(iXVar2, m937(this));
                                return C0033.m1763(iXVar2);
                            case 500:
                                String str5 = C0031.m1705();
                                int i3 = 0;
                                int i4 = 0;
                                while (true) {
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = i4 < 34 ? 48736 : 48705;
                                            case 47384:
                                                StringBuilder sb = C0052.m2253(str5);
                                                C0032.m1746(sb, C0036.m1853(C0036.m1853(C0036.m1853(C0028.m1621(str3, 67), C0052.m2261(m936(), 776, 5, 1046), C0057.m2384(m936(), 781, 1, 2361)), C0051.m2237(m936(), 782, 5, 414), C0046.m2123(m936(), 787, 1, 1802)), C0005.m169(m936(), 788, 5, 2958), C0011.m328(m936(), 793, 1, 2711)));
                                                String str6 = new String(C0022.m1420(C0043.m2039(sb), 0));
                                                iX iXVar3 = new iX();
                                                boolean z3 = C0037.m1888(str6, str4);
                                                int i6 = 48891;
                                                while (true) {
                                                    i6 ^= 48908;
                                                    switch (i6) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 503:
                                                            if (!z3) {
                                                                break;
                                                            } else {
                                                                i6 = 49635;
                                                                continue;
                                                            }
                                                        case 32495:
                                                            str6 = C0048.m2137(str6, null);
                                                            break;
                                                    }
                                                    i6 = 48953;
                                                }
                                                C0034.m1788(iXVar3, str6);
                                                C0007.m212(iXVar3, m937(this));
                                                return C0033.m1763(iXVar3);
                                            case 47417:
                                                StringBuilder sb2 = C0052.m2253(str5);
                                                C0032.m1746(sb2, C0028.m1620(str3, i3 + 0, i3 + 1));
                                                str5 = C0043.m2039(sb2);
                                                i3 += 2;
                                                i4++;
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
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
            }
            i = 1678;
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = C0004.m122(C0014.m434(C0004.m119(C0028.m1633(C0001.m33(C0001.m33(m935(), C0009.m277(m936(), 794, 27, 2999)), str), m937(this))), C0025.m1542(m936(), 821, 21, 818)));
        while (true) {
            boolean z2 = C0000.m11(it);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = z2 ? 1709 : 1678;
                    case 204:
                        hN hNVar = (hN) C0026.m1556(it);
                        C0003.m107(hNVar);
                        String str2 = C0013.m381(C0000.m12(C0001.m35(m936(), 842, 3, 1569), hNVar), C0007.m210(m936(), 845, 8, 697));
                        String str3 = C0013.m381(C0000.m12(C0000.m18(m936(), 853, 1, 1319), hNVar), C0010.m296(m936(), 854, 4, 2277));
                        String str4 = C0022.m1427(C0000.m12(C0055.m2320(m936(), 858, 9, 862), hNVar));
                        boolean z3 = C0010.m289(str4);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = z3 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    C0003.m116(arrayList, new ME(str3, str4, str2, C0032.m1737(C0014.m434(hNVar, C0052.m2261(m936(), 867, 26, 1581)))));
                                    int i3 = 48767;
                                    while (true) {
                                        i3 ^= 48784;
                                        switch (i3) {
                                            case 14:
                                                break;
                                            case 239:
                                                i3 = 48798;
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
                                            case 47483:
                                                break;
                                        }
                                    }
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
