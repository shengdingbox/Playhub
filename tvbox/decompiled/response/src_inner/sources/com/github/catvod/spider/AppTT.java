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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class AppTT extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f19short = {2969, 2973, 2974, 2946, 2946, 2950, 3035, 2969, 2973, 2961, 2969, 3033, 2972, 2963, 2967, 2949, 2969, 2968, 2970, 2956, 2959, 2388, 2383, 2384, 2431, 2388, 2393, 2384, 2373, 2262, 2248, 2301, 2260, 2253, 2246, 2790, 2752, 2774, 2753, 2718, 2802, 2772, 2774, 2781, 2759, 1836, 1835, 1845, 3032, 3037, 3016, 3037, 1152, 1190, 1200, 1191, 1272, 1172, 1202, 1200, 1211, 1185, 1082, 1057, 1080, 1080, 1796, 1793, 1806, 1805, 1793, 1803, 1813, 1261, 1213, 1194, 1258, 1208, 1204, 1214, 1256, 1193, 1192, 1250, 1263, 1187, 1214, 1203, 1203, 1256, 1200, 1257, 1256, 1194, 1209, 1187, 1194, 1193, 1209, 1205, 1209, 1262, 1197, 1260, 1209, 1261, 1213, 1263, 1193, 1194, 1206, 722, 715, 704, 763, 726, 705, 713, 709, 726, 719, 727, 515, 538, 529, 554, 539, 532, 536, 528, 741, 764, 759, 716, 762, 759, 1745, 1748, 1742, 1737, 1739, 1754, 1756, 1758, 398, 395, 399, 395, 406, 2604, 2613, 2622, 2565, 2602, 2611, 2617, 2056, 2066, 2076, 2069, 1075, 1070, 1066, 1058, 1076, 1075, 1062, 1066, 1079, 2891, 2888, 998, 1003, 994, 1015, 973, 1019, 1014, 1865, 1808, 1877, 1865, 1806, 1801, 1803, 1795, 1865, 1810, 1823, 1814, 1795, 1849, 1813, 1795, 1799, 1812, 1797, 1806, 1950, 1947, 1934, 1947, 2597, 2620, 2615, 2572, 2595, 2618, 2608, 2572, 2599, 2619, 2598, 2622, 2609, 649, 664, 670, 668, 666, 662, 652, 663, 653, 2113, 2138, 2113, 2132, 2137, 2650, 2627, 2632, 2675, 2632, 2629, 2654, 2633, 2639, 2648, 2627, 2654, 732, 709, 718, 757, 715, 713, 734, 709, 728, 2742, 2735, 2724, 2719, 2738, 2725, 2733, 2721, 2738, 2731, 2739, 2393, 2368, 2379, 2416, 2382, 2397, 2378, 2382, 923, 898, 905, 946, 916, 904, 908, 927, 857, 832, 843, 880, 833, 846, 834, 842, 2345, 2352, 2363, 2304, 2364, 2352, 2353, 2347, 2362, 2353, 2347, 1965, 1972, 1983, 1924, 1970, 1983, 2038, 2031, 2020, 2015, 2032, 2025, 2019, 1032, 1042, 1052, 1045, 2864, 2861, 2857, 2849, 2871, 2864, 2853, 2857, 2868, 1114, 1027, 1094, 1114, 1053, 1050, 1048, 1040, 1114, 1027, 1050, 1041, 1066, 1041, 1040, 1025, 1044, 1052, 1049, 1030, 2687, 2682, 2671, 2682, 1067, 1121, 1145, 1078, 2638, 379, 314, 297, 358, 2319, 426, 509, 505, 483, 504, 439, 1331, 926, 1017, 1020, 924, 1023, 905, 924, 3161, 3179, 3127, 3118, 3109, 3102, 3121, 3112, 3106, 3102, 3125, 3113, 3124, 3116, 3107, 2882, 2907, 2896, 2923, 2884, 2904, 2901, 2893, 2923, 2904, 2909, 2887, 2880, 1336, 1330, 1343, 1337, 1345, 1360, 1347, 1346, 1364, 1390, 1348, 1347, 1373, 1346, 1359, 1352, 1366, 1294, 1301, 1292, 1292, 1055, 1048, 1030, 1049, 2172, 2163, 2175, 2167, 2096, 1315, 844, 853, 862, 869, 842, 854, 859, 835, 869, 860, 840, 853, 855, 701, 701, 701, 2752, 2777, 2770, 2793, 2758, 2778, 2775, 2767, 2793, 2755, 2756, 2778, 2930, 2935, 2925, 2922, 2664, 2661, 2668, 2681, 2627, 2677, 2680, 3273, 3268, 3277, 3288, 3298, 3283, 3292, 3280, 3288, 1661, 1639, 1641, 1632, 1089, 1116, 1112, 1104, 1094, 1089, 1108, 1112, 1093, 1098, 1043, 1110, 1098, 1041, 1052, 1045, 1024, 1098, 1041, 1034, 1045, 1082, 1041, 1052, 1045, 1024, 2926, 2923, 2942, 2923, 2335, 2330, 2304, 2311, 2406, 2409, 2404, 2422, 2422, 3327, 3302, 3309, 3286, 3323, 3308, 3300, 3304, 3323, 3298, 3322, 3172, 3197, 3190, 3149, 3196, 3187, 3199, 3191, 2068, 2061, 2054, 2109, 2059, 2054, 2299, 2274, 2281, 2258, 2301, 2276, 2286, 2736, 2730, 2724, 2733, 529, 524, 520, 512, 534, 529, 516, 520, 533, 849, 776, 845, 849, 778, 775, 782, 795, 849, 778, 788, 801, 776, 785, 794, 3136, 3141, 3152, 3141, 1440, 1453, 1444, 1457, 1419, 1442, 1467, 1456, 2861, 2868, 2879, 2280, 2289, 2298, 2241, 2286, 2295, 2301, 2241, 2282, 2294, 2283, 2291, 2300, 492, 489, 499, 500, 274, 332, 266, 327, 1542, 1559, 1540, 1541, 1555, 2455, 2443, 2438, 2462, 2482, 2453, 2443, 1288, 1295, 1297, 2395, 2398, 2385, 2386, 2398, 2388, 2378, 1721, 1696, 1707, 1680, 1725, 1706, 1698, 1710, 1725, 1700, 1724, 1866, 1875, 1880, 1891, 1877, 1880, 792, 769, 778, 817, 768, 783, 771, 779, 1832, 1837, 1847, 1840, 2828, 2837, 2846, 2853, 2826, 2835, 2841, 2809, 2787, 2797, 2788, 1782, 1771, 1775, 1767, 1777, 1782, 1763, 1775, 1778, 2511, 2497, 2525, 2515, 2507, 2518, 2496, 1342, 1383, 1314, 1342, 1401, 1406, 1404, 1396, 1342, 1378, 1396, 1392, 1379, 1394, 1401, 2419, 2422, 2403, 2422, 1633, 1656, 1651, 1608, 1639, 1662, 1652, 1608, 1635, 1663, 1634, 1658, 1653};
    private JSONObject N;
    private String SN = C0026.m1551(m578(), 0, 21, 3062);
    private String tF = C0031.m1705();
    private String yq;

    public AppTT() {
        int i = C0000.m13();
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
                    System.out.println(Float.valueOf(C0045.m2097("0s8O1mVRh")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private String N(String str, Map<String, String> map) {
        String str2 = C0031.m1705();
        try {
            MultipartBody.Builder builder = m580(new MultipartBody.Builder(), m581());
            boolean z = C0037.m1888(str, C0044.m2052(m578(), 21, 8, 2336));
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
                        boolean z2 = C0037.m1888(str, C0020.m1390(m578(), 29, 6, 2210));
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
            m583(builder, str2, str2);
            Iterator it = C0014.m413(C0031.m1690(map));
            while (true) {
                boolean z3 = C0000.m11(it);
                int i3 = 1864;
                while (true) {
                    i3 ^= 1881;
                    switch (i3) {
                        case 17:
                            i3 = z3 ? 48736 : 48705;
                        case 47384:
                            Response response = m596(m595(new OkHttpClient(), m592(m586(m599(m589(new Request.Builder(), str), m588(builder)), C0043.m2020(m578(), 35, 10, 2739), m593(this)))));
                            boolean z4 = m579(response);
                            int i4 = 48891;
                            while (true) {
                                i4 ^= 48908;
                                switch (i4) {
                                    case 22:
                                        break;
                                    case 53:
                                        return m594(m598(response));
                                    case 503:
                                        if (z4) {
                                            break;
                                        } else {
                                            i4 = 49635;
                                            continue;
                                        }
                                    case 32495:
                                        return str2;
                                    default:
                                        continue;
                                }
                                i4 = 48953;
                            }
                        case 47417:
                            Map.Entry entry = (Map.Entry) C0026.m1556(it);
                            m583(builder, (String) C0032.m1733(entry), (String) C0045.m2095(entry));
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
            }
        } catch (Exception e) {
            m590(e);
            return str2;
        }
    }

    private JSONObject SN(String str, String str2, JSONObject jSONObject) {
        String str3 = C0056.m2339(m578(), 45, 3, 1881);
        String str4 = C0036.m1850(m578(), 48, 4, 3004);
        try {
            boolean z = C0046.m2127(jSONObject, str);
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
                        StringBuilder sb = new StringBuilder();
                        C0032.m1746(sb, C0028.m1632(C0041.m1969(jSONObject, str), str3));
                        C0032.m1746(sb, str2);
                        String str5 = C0043.m2039(sb);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C0020.m1364(linkedHashMap, C0020.m1390(m578(), 52, 10, 1237), m593(this));
                        JSONObject jSONObject2 = new JSONObject(C0028.m1633(str5, linkedHashMap));
                        boolean z2 = C0046.m2127(jSONObject2, str4);
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
                                    boolean z3 = C0003.m114(jSONObject2, str4) instanceof JSONObject;
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                if (!z3) {
                                                    break;
                                                } else {
                                                    i3 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                break;
                                            case 47417:
                                                jSONObject2 = C0006.m188(jSONObject2, str4);
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
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    int i5 = C0056.m2342(jSONObject2);
                                    int i6 = 48891;
                                    while (true) {
                                        i6 ^= 48908;
                                        switch (i6) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                if (i5 <= 0) {
                                                    break;
                                                } else {
                                                    i6 = 49635;
                                                    continue;
                                                }
                                            case 32495:
                                                String str6 = C0028.m1632(jSONObject2, str3);
                                                boolean z4 = C0029.m1658(str6);
                                                int i7 = 49666;
                                                while (true) {
                                                    i7 ^= 49683;
                                                    switch (i7) {
                                                        case 17:
                                                            if (z4) {
                                                                break;
                                                            } else {
                                                                i7 = 49759;
                                                                continue;
                                                            }
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            boolean z5 = C0022.m1448(str6, C0001.m35(m578(), 62, 4, 1108));
                                                            int i8 = 49790;
                                                            while (true) {
                                                                i8 ^= 49807;
                                                                switch (i8) {
                                                                    case 18:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 84:
                                                                        C0005.m159(jSONObject2, C0056.m2339(m578(), 66, 7, 1888), C0033.m1778(str6));
                                                                        return jSONObject2;
                                                                    case 241:
                                                                        if (z5) {
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
                                            default:
                                                continue;
                                        }
                                        i6 = 48953;
                                    }
                                case 239:
                                    if (jSONObject2 == null) {
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
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            m590(e);
        }
        return new JSONObject();
    }

    private String yq(String str) {
        String str2 = "۟ۥۣ";
        StringBuilder sb = null;
        short[] sArr = null;
        String str3 = null;
        while (true) {
            switch (C0002.m76(str2)) {
                case 1746877:
                    sb = new StringBuilder();
                    str2 = "ۡۦۢ";
                    break;
                case 1747750:
                    str3 = C0043.m2039(sb);
                    str2 = "ۣۧ۠";
                    break;
                case 1748641:
                    return str;
                case 1748829:
                    sArr = m578();
                    str2 = "ۦۥۥ";
                    break;
                case 1753606:
                    str3 = C0026.m1551(sArr, 73, 38, 1242);
                    str2 = "ۨۨۥ";
                    break;
                case 1754500:
                    str = C0023.m1463(str3);
                    str2 = "ۡ۠۠";
                    break;
                case 1755621:
                    C0032.m1746(sb, str3);
                    str2 = "ۥۥ۟";
                    break;
                default:
                    C0032.m1746(sb, str);
                    str2 = "۠ۢۨ";
                    break;
            }
        }
    }

    /* renamed from: تزسﺕ  reason: contains not printable characters */
    public static short[] m578() {
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
                    return f19short;
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

    /* renamed from: تﻩهو  reason: contains not printable characters */
    public static boolean m579(Object obj) {
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

    /* renamed from: حقوﺏ  reason: contains not printable characters */
    public static MultipartBody.Builder m580(Object obj, Object obj2) {
        int i = C0009.m276();
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
                    return ((MultipartBody.Builder) obj).setType((MediaType) obj2);
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

    /* renamed from: حﻁزف  reason: contains not printable characters */
    public static MediaType m581() {
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
                    return MultipartBody.FORM;
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

    /* renamed from: دﺏذﻕ  reason: contains not printable characters */
    public static String m582(Object obj, Object obj2, Object obj3) {
        int i = C0003.m81();
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
                    return ((AppTT) obj).N((String) obj2, (Map) obj3);
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

    /* renamed from: دﺭﺯح  reason: contains not printable characters */
    public static MultipartBody.Builder m583(Object obj, Object obj2, Object obj3) {
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
                    return ((MultipartBody.Builder) obj).addFormDataPart((String) obj2, (String) obj3);
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

    /* renamed from: سﺭﺡﻭ  reason: contains not printable characters */
    public static JSONObject m584(Object obj, Object obj2, Object obj3, Object obj4) {
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
                    return ((AppTT) obj).SN((String) obj2, (String) obj3, (JSONObject) obj4);
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

    /* renamed from: سﺵﺫل  reason: contains not printable characters */
    public static String m585(Object obj) {
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
                    return ((AppTT) obj).tF;
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

    /* renamed from: صﺯﺩي  reason: contains not printable characters */
    public static Request.Builder m586(Object obj, Object obj2, Object obj3) {
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

    /* renamed from: صﻡﻕن  reason: contains not printable characters */
    public static JSONObject m587(Object obj) {
        int i = C0027.m1588();
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
                    return ((AppTT) obj).N;
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

    /* renamed from: ظقﺙﺡ  reason: contains not printable characters */
    public static MultipartBody m588(Object obj) {
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
                    return ((MultipartBody.Builder) obj).build();
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

    /* renamed from: غﺩمﺭ  reason: contains not printable characters */
    public static Request.Builder m589(Object obj, Object obj2) {
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

    /* renamed from: نثرﻭ  reason: contains not printable characters */
    public static void m590(Object obj) {
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

    /* renamed from: وﺫاﺩ  reason: contains not printable characters */
    public static String m591(Object obj) {
        int i = C0048.m2140();
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
                    return ((AppTT) obj).yq;
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

    /* renamed from: ﺕظجﻩ  reason: contains not printable characters */
    public static Request m592(Object obj) {
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

    /* renamed from: ﺙﺹرﻍ  reason: contains not printable characters */
    public static String m593(Object obj) {
        int i = C0041.m1981();
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
                    return ((AppTT) obj).SN;
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

    /* renamed from: ﺩذحﺽ  reason: contains not printable characters */
    public static String m594(Object obj) {
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

    /* renamed from: ﺱمـﻅ  reason: contains not printable characters */
    public static Call m595(Object obj, Object obj2) {
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

    /* renamed from: ﻁزسج  reason: contains not printable characters */
    public static Response m596(Object obj) {
        int i = C0026.m1561();
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

    /* renamed from: ﻅﺽﺹﺵ  reason: contains not printable characters */
    public static String m597(Object obj, Object obj2) {
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
                    return ((AppTT) obj).yq((String) obj2);
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

    /* renamed from: ﻙذﻅب  reason: contains not printable characters */
    public static ResponseBody m598(Object obj) {
        int i = C0003.m81();
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

    /* renamed from: ﻙمﺱﻩ  reason: contains not printable characters */
    public static Request.Builder m599(Object obj, Object obj2) {
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

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4 = C0010.m296(m578(), 111, 11, 676);
        String str5 = C0048.m2145(m578(), 122, 8, 629);
        String str6 = C0057.m2384(m578(), 130, 6, 659);
        String str7 = C0022.m1433(m578(), 136, 4, 1725);
        String str8 = C0021.m1417(m578(), 140, 4, 1723);
        String str9 = C0004.m130(m578(), 144, 5, 482);
        String str10 = C0036.m1850(m578(), 149, 7, 2650);
        try {
            String str11 = C0049.m2192(C0043.m2022() / 1000);
            String str12 = m597(this, str11);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0020.m1364(linkedHashMap, C0047.m2133(m578(), 156, 4, 2171), str12);
            C0020.m1364(linkedHashMap, C0026.m1551(m578(), 160, 9, 1095), str11);
            C0020.m1364(linkedHashMap, str9, C0032.m1749(m578(), 169, 2, 2938));
            C0020.m1364(linkedHashMap, C0003.m86(m578(), 171, 7, 914), str);
            C0020.m1364(linkedHashMap, str8, str2);
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m591(this));
            C0032.m1746(sb, C0044.m2052(m578(), 178, 20, 1894));
            JSONArray jSONArray = C0010.m316(C0006.m188(new JSONObject(m582(this, C0043.m2039(sb), linkedHashMap)), C0009.m277(m578(), 198, 4, 2042)), str7);
            JSONArray jSONArray2 = new JSONArray();
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
                            JSONObject jSONObject2 = new JSONObject();
                            boolean z2 = C0029.m1658(C0028.m1632(jSONObject, str10));
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        str3 = C0028.m1632(jSONObject, str10);
                                        break;
                                    case 500:
                                        str3 = C0028.m1632(jSONObject, C0000.m18(m578(), 202, 13, 2643));
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
                            C0005.m159(jSONObject2, str6, C0038.m1900(C0052.m2260(jSONObject, str6)));
                            C0005.m159(jSONObject2, str5, C0022.m1450(jSONObject, str5));
                            C0005.m159(jSONObject2, str10, str3);
                            C0005.m159(jSONObject2, str4, C0022.m1450(jSONObject, str4));
                            C0041.m1985(jSONArray2, jSONObject2);
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
                            JSONObject jSONObject3 = new JSONObject();
                            C0036.m1852(jSONObject3, str8, C0007.m223(str2));
                            C0036.m1852(jSONObject3, C0030.m1688(m578(), 215, 9, 761), 999);
                            C0036.m1852(jSONObject3, str9, 20);
                            C0036.m1852(jSONObject3, C0044.m2052(m578(), 224, 5, 2101), Integer.MAX_VALUE);
                            C0005.m159(jSONObject3, str7, jSONArray2);
                            return C0011.m335(jSONObject3);
                    }
                }
            }
        } catch (Exception e) {
            m590(e);
            return C0031.m1705();
        }
    }

    public String detailContent(List<String> list) {
        Exception e;
        String str;
        String str2 = C0002.m57(m578(), 229, 12, 2604);
        String str3 = C0012.m361(m578(), 241, 9, 682);
        String str4 = C0023.m1457(m578(), 250, 11, 2752);
        String str5 = C0026.m1551(m578(), 261, 8, 2351);
        String str6 = C0005.m169(m578(), 269, 8, 1005);
        String str7 = C0001.m35(m578(), 277, 8, 815);
        String str8 = C0010.m296(m578(), 285, 11, 2399);
        String str9 = C0057.m2384(m578(), 296, 6, 2011);
        String str10 = C0003.m86(m578(), 302, 7, 1920);
        String str11 = C0031.m1705();
        try {
            this.N = new JSONObject();
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str12 = C0049.m2192(C0043.m2022() / 1000);
            String str13 = m597(this, str12);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0020.m1364(linkedHashMap, C0025.m1542(m578(), 309, 4, 1147), str13);
            C0020.m1364(linkedHashMap, C0023.m1457(m578(), 313, 9, 2884), str12);
            C0020.m1364(linkedHashMap, str9, (String) C0035.m1801(list, 0));
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m591(this));
            C0032.m1746(sb, C0033.m1764(m578(), 322, 20, 1141));
            JSONObject jSONObject2 = C0006.m188(new JSONObject(m582(this, C0043.m2039(sb), linkedHashMap)), C0022.m1433(m578(), 342, 4, 2587));
            String str14 = C0024.m1512(C0024.m1495(C0024.m1495(C0036.m1853(C0036.m1853(C0036.m1853(C0022.m1450(jSONObject2, str8), C0050.m2224(m578(), 346, 4, 1037), C0043.m2020(m578(), 350, 1, 2674)), C0055.m2320(m578(), 351, 4, 349), C0010.m296(m578(), 355, 1, 2353)), C0056.m2339(m578(), 356, 6, 396), C0055.m2320(m578(), 362, 1, 1297)), C0039.m1937(m578(), 363, 7, 930), str11), C0039.m1937(m578(), 370, 2, 3077), str11));
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            boolean z = C0029.m1658(C0028.m1632(jSONObject2, str10));
            int i = 1616;
            while (true) {
                i ^= 1633;
                try {
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
                            str = C0028.m1632(jSONObject2, C0023.m1457(m578(), 372, 13, 3137));
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            str = C0028.m1632(jSONObject2, str10);
                            break;
                    }
                    i = 1678;
                } catch (Exception e2) {
                    e = e2;
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = 48674;
                                break;
                            case 47483:
                                m590(e);
                                return str11;
                        }
                    }
                }
            }
            C0005.m159(jSONObject3, str9, C0035.m1801(list, 0));
            C0005.m159(jSONObject3, str7, C0022.m1450(jSONObject2, str7));
            C0005.m159(jSONObject3, str10, str);
            C0005.m159(jSONObject3, str6, C0022.m1450(jSONObject2, str6));
            C0005.m159(jSONObject3, str5, C0022.m1450(jSONObject2, str5));
            C0005.m159(jSONObject3, str4, C0022.m1450(jSONObject2, str4));
            C0005.m159(jSONObject3, str3, C0022.m1450(jSONObject2, str3));
            C0005.m159(jSONObject3, str2, C0022.m1450(jSONObject2, str2));
            C0005.m159(jSONObject3, str8, C0050.m2203(str14));
            JSONArray jSONArray2 = C0010.m316(jSONObject2, C0056.m2339(m578(), 385, 13, 2868));
            int i4 = 0;
            while (true) {
                int i5 = C0035.m1823(jSONArray2);
                int i6 = 48767;
                while (true) {
                    i6 ^= 48784;
                    switch (i6) {
                        case 14:
                        case 45:
                            boolean z2 = C0005.m175(arrayList2);
                            int i7 = 53510;
                            while (true) {
                                i7 ^= 53527;
                                switch (i7) {
                                    case 17:
                                        if (z2) {
                                            break;
                                        } else {
                                            i7 = 53603;
                                            continue;
                                        }
                                    case 50:
                                        break;
                                    case 83:
                                        break;
                                    case 116:
                                        this.tF = (String) C0003.m90(arrayList2, 0);
                                        String str15 = C0051.m2237(m578(), 429, 13, 826);
                                        boolean z3 = C0049.m2190();
                                        String str16 = C0012.m361(m578(), 442, 3, 665);
                                        int i8 = 53634;
                                        while (true) {
                                            i8 ^= 53651;
                                            switch (i8) {
                                                case 17:
                                                    if (z3) {
                                                        break;
                                                    } else {
                                                        i8 = 53727;
                                                        continue;
                                                    }
                                                case 50:
                                                    break;
                                                case 76:
                                                    C0023.m1461(arrayList2, 0, C0001.m31());
                                                    break;
                                                case 83:
                                                    break;
                                            }
                                            i8 = 53696;
                                        }
                                        C0005.m159(jSONObject3, str15, C0038.m1902(str16, arrayList2));
                                        C0005.m159(jSONObject3, C0015.m457(m578(), 445, 12, 2742), C0038.m1902(str16, arrayList));
                                        break;
                                    default:
                                        continue;
                                }
                                i7 = 53572;
                            }
                            C0041.m1985(jSONArray, jSONObject3);
                            C0005.m159(jSONObject, C0041.m1994(m578(), 457, 4, 2846), jSONArray);
                            return C0011.m335(jSONObject);
                        case 76:
                            JSONObject jSONObject4 = C0036.m1841(jSONArray2, i4);
                            String str17 = C0022.m1450(jSONObject4, C0047.m2133(m578(), 398, 4, 1374));
                            JSONArray jSONArray3 = C0033.m1766(jSONObject4, C0052.m2261(m578(), 402, 10, 1329));
                            String str18 = C0000.m18(m578(), 412, 3, 1338);
                            int i9 = 48891;
                            while (true) {
                                i9 ^= 48908;
                                switch (i9) {
                                    case 22:
                                    case 53:
                                        break;
                                    case 503:
                                        i9 = jSONArray3 != null ? 49635 : 48953;
                                    case 32495:
                                        int i10 = C0035.m1823(jSONArray3);
                                        int i11 = 49666;
                                        while (true) {
                                            i11 ^= 49683;
                                            switch (i11) {
                                                case 17:
                                                    i11 = i10 > 0 ? 49759 : 49728;
                                                case 50:
                                                case 76:
                                                    int i12 = 0;
                                                    while (true) {
                                                        int i13 = C0035.m1823(jSONArray3);
                                                        int i14 = 49790;
                                                        while (true) {
                                                            i14 ^= 49807;
                                                            switch (i14) {
                                                                case 18:
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    String str19 = C0024.m1512(C0028.m1631(jSONArray3, i12));
                                                                    boolean z4 = C0029.m1658(str19);
                                                                    int i15 = 49914;
                                                                    while (true) {
                                                                        i15 ^= 49931;
                                                                        switch (i15) {
                                                                            case 497:
                                                                                i15 = !z4 ? 50658 : 50627;
                                                                            case 1711:
                                                                            case 1736:
                                                                                break;
                                                                            case 1769:
                                                                                boolean z5 = C0022.m1448(str19, C0003.m86(m578(), 415, 4, 1376));
                                                                                int i16 = 50689;
                                                                                while (true) {
                                                                                    i16 ^= 50706;
                                                                                    switch (i16) {
                                                                                        case 19:
                                                                                            i16 = !z5 ? 50782 : 50751;
                                                                                        case 45:
                                                                                            break;
                                                                                        case 50:
                                                                                        case 76:
                                                                                            boolean z6 = C0046.m2127(m587(this), str17);
                                                                                            int i17 = 50813;
                                                                                            while (true) {
                                                                                                i17 ^= 50830;
                                                                                                switch (i17) {
                                                                                                    case 18:
                                                                                                    case 53:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i17 = !z6 ? 51557 : 50875;
                                                                                                    case 4075:
                                                                                                        C0005.m159(m587(this), str17, C0005.m159(new JSONObject(), str18, str19));
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    i12++;
                                                                    int i18 = 51588;
                                                                    while (true) {
                                                                        i18 ^= 51605;
                                                                        switch (i18) {
                                                                            case 17:
                                                                                i18 = 51619;
                                                                            case 54:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i14 = i12 < i13 ? 49883 : 49852;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 83:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            JSONArray jSONArray4 = C0010.m316(jSONObject4, C0044.m2052(m578(), 419, 4, 1130));
                            StringBuilder sb2 = new StringBuilder();
                            int i19 = 0;
                            while (true) {
                                int i20 = C0035.m1823(jSONArray4);
                                int i21 = 51712;
                                while (true) {
                                    i21 ^= 51729;
                                    switch (i21) {
                                        case 14:
                                        case 17:
                                            i21 = i19 < i20 ? 51805 : 51774;
                                        case 47:
                                            int i22 = C0048.m2150(sb2);
                                            int i23 = 52611;
                                            while (true) {
                                                i23 ^= 52628;
                                                switch (i23) {
                                                    case 23:
                                                        i23 = i22 > 0 ? 52704 : 52673;
                                                    case 54:
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        C0001.m26(sb2, C0048.m2150(sb2) - 1);
                                                        break;
                                                }
                                            }
                                            C0003.m116(arrayList2, str17);
                                            C0003.m116(arrayList, C0043.m2039(sb2));
                                            i4++;
                                            int i24 = 52735;
                                            while (true) {
                                                i24 ^= 52752;
                                                switch (i24) {
                                                    case 14:
                                                        break;
                                                    case 1007:
                                                        i24 = 52766;
                                                }
                                            }
                                            break;
                                        case 76:
                                            JSONObject jSONObject5 = C0036.m1841(jSONArray4, i19);
                                            String str20 = C0022.m1450(jSONObject5, C0024.m1513(m578(), 423, 4, 2066));
                                            String str21 = C0022.m1450(jSONObject5, str18);
                                            C0032.m1746(sb2, str20);
                                            C0032.m1746(sb2, C0001.m35(m578(), 427, 1, 2068));
                                            C0032.m1746(sb2, str21);
                                            C0032.m1746(sb2, C0035.m1833(m578(), 428, 1, 1280));
                                            i19++;
                                            int i25 = 51836;
                                            while (true) {
                                                i25 ^= 51853;
                                                switch (i25) {
                                                    case 241:
                                                        i25 = 52518;
                                                    case 1963:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                            break;
                        case 239:
                            i6 = i4 < i5 ? 48860 : 48829;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public String homeContent(boolean z) {
        String str = C0002.m57(m578(), 461, 7, 2588);
        String str2 = C0043.m2020(m578(), 468, 9, 3261);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String str3 = C0049.m2192(C0043.m2022() / 1000);
            String str4 = m597(this, str3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0020.m1364(linkedHashMap, C0041.m1994(m578(), 477, 4, 1550), str4);
            C0020.m1364(linkedHashMap, C0047.m2133(m578(), 481, 9, 1077), str3);
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m591(this));
            C0032.m1746(sb, C0028.m1613(m578(), 490, 17, 1125));
            JSONArray jSONArray2 = C0010.m316(C0006.m188(new JSONObject(m582(this, C0043.m2039(sb), linkedHashMap)), C0031.m1713(m578(), 507, 4, 2826)), C0020.m1390(m578(), 511, 4, 2419));
            int i = 0;
            while (true) {
                int i2 = C0035.m1823(jSONArray2);
                int i3 = 1616;
                while (true) {
                    i3 ^= 1633;
                    switch (i3) {
                        case 14:
                        case 49:
                            i3 = i < i2 ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject2 = C0036.m1841(jSONArray2, i);
                            String str5 = C0028.m1632(jSONObject2, str2);
                            String str6 = C0038.m1900(C0052.m2258(jSONObject2, str));
                            JSONObject jSONObject3 = new JSONObject();
                            C0005.m159(jSONObject3, str2, str5);
                            C0005.m159(jSONObject3, str, str6);
                            C0041.m1985(jSONArray, jSONObject3);
                            i++;
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = 1771;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            C0005.m159(jSONObject, C0045.m2098(m578(), 515, 5, 2309), jSONArray);
                            return C0011.m335(jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            m590(e);
            return C0031.m1705();
        }
    }

    public String homeVideoContent() {
        String str;
        String str2 = C0051.m2237(m578(), 520, 11, 3209);
        String str3 = C0007.m210(m578(), 531, 8, 3090);
        String str4 = C0055.m2320(m578(), 539, 6, 2146);
        String str5 = C0006.m180(m578(), 545, 7, 2189);
        try {
            JSONObject jSONObject = new JSONObject();
            String str6 = C0049.m2192(C0043.m2022() / 1000);
            String str7 = m597(this, str6);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0020.m1364(linkedHashMap, C0033.m1764(m578(), 552, 4, 2755), str7);
            C0020.m1364(linkedHashMap, C0034.m1781(m578(), 556, 9, 613), str6);
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m591(this));
            C0032.m1746(sb, C0050.m2224(m578(), 565, 15, 894));
            JSONArray jSONArray = C0010.m316(C0006.m188(new JSONObject(m582(this, C0043.m2039(sb), linkedHashMap)), C0020.m1390(m578(), 580, 4, 3108)), C0011.m328(m578(), 584, 8, 1492));
            JSONArray jSONArray2 = new JSONArray();
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
                            JSONArray jSONArray3 = C0010.m316(C0036.m1841(jSONArray, i), C0055.m2320(m578(), 592, 3, 2907));
                            int i4 = 0;
                            while (true) {
                                int i5 = C0035.m1823(jSONArray3);
                                int i6 = 1740;
                                while (true) {
                                    i6 ^= 1757;
                                    switch (i6) {
                                        case 17:
                                            i6 = i4 < i5 ? 1833 : 1802;
                                        case 54:
                                        case 471:
                                            i++;
                                            int i7 = 49666;
                                            while (true) {
                                                i7 ^= 49683;
                                                switch (i7) {
                                                    case 17:
                                                        i7 = 49697;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 500:
                                            JSONObject jSONObject2 = C0036.m1841(jSONArray3, i4);
                                            JSONObject jSONObject3 = new JSONObject();
                                            boolean z = C0029.m1658(C0028.m1632(jSONObject2, str5));
                                            int i8 = 1864;
                                            while (true) {
                                                i8 ^= 1881;
                                                switch (i8) {
                                                    case 17:
                                                        i8 = z ? 48736 : 48705;
                                                    case 47384:
                                                        str = C0028.m1632(jSONObject2, str5);
                                                        break;
                                                    case 47417:
                                                        str = C0028.m1632(jSONObject2, C0039.m1937(m578(), 595, 13, 2206));
                                                        int i9 = 48767;
                                                        while (true) {
                                                            i9 ^= 48784;
                                                            switch (i9) {
                                                                case 14:
                                                                    break;
                                                                case 239:
                                                                    i9 = 48798;
                                                            }
                                                        }
                                                        break;
                                                    case 47483:
                                                }
                                            }
                                            C0005.m159(jSONObject3, str4, C0038.m1900(C0052.m2258(jSONObject2, str4)));
                                            C0005.m159(jSONObject3, str3, C0028.m1632(jSONObject2, str3));
                                            C0005.m159(jSONObject3, str5, str);
                                            C0005.m159(jSONObject3, str2, C0028.m1632(jSONObject2, str2));
                                            C0041.m1985(jSONArray2, jSONObject3);
                                            i4++;
                                            int i10 = 48891;
                                            while (true) {
                                                i10 ^= 48908;
                                                switch (i10) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i10 = 48922;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                            break;
                        case 239:
                            C0005.m159(jSONObject, C0021.m1417(m578(), 608, 4, 384), jSONArray2);
                            return C0011.m335(jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            m590(e);
            return C0031.m1705();
        }
    }

    public void init(Context context, String str) {
        int i;
        AppTT.super.init(context, str);
        try {
            this.yq = C0049.m2191(str);
            i = 1616;
        } catch (Exception e) {
            m590(e);
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    int i2 = C0045.m2093();
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
                                System.out.println(Float.decode(C0006.m184("VXWY")));
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

    public String playerContent(String str, String str2, List<String> list) {
        C0029.m1662();
        C0056.m2351(true);
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z = C0042.m2005(str2);
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
                        boolean z2 = C0037.m1888(str2, C0009.m277(m578(), 612, 4, 383));
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
                                    str2 = C0009.m279(str2);
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        C0036.m1852(jSONObject, C0003.m86(m578(), 616, 5, 1654), 0);
                        C0005.m159(jSONObject, C0029.m1635(m578(), 621, 7, 2535), C0031.m1705());
                        C0005.m159(jSONObject, C0022.m1433(m578(), 628, 3, 1405), str2);
                        C0005.m159(jSONObject, C0011.m328(m578(), 631, 7, 2367), C0033.m1778(str2));
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
                    case 239:
                        JSONObject jSONObject2 = m587(this);
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    int i5 = C0056.m2342(jSONObject2);
                                    int i6 = 48891;
                                    while (true) {
                                        i6 ^= 48908;
                                        switch (i6) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                if (i5 <= 0) {
                                                    break;
                                                } else {
                                                    i6 = 49635;
                                                    continue;
                                                }
                                            case 32495:
                                                boolean z3 = C0046.m2127(m587(this), str);
                                                int i7 = 49666;
                                                while (true) {
                                                    i7 ^= 49683;
                                                    switch (i7) {
                                                        case 17:
                                                            if (z3) {
                                                                break;
                                                            } else {
                                                                i7 = 49759;
                                                                continue;
                                                            }
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            str = m585(this);
                                                            break;
                                                        case 83:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i7 = 49728;
                                                }
                                                jSONObject = m584(this, str, str2, m587(this));
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
                                            default:
                                                continue;
                                        }
                                        i6 = 48953;
                                    }
                                    break;
                                case 239:
                                    if (jSONObject2 == null) {
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
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            m590(e);
        }
        return C0011.m335(jSONObject);
    }

    public String searchContent(String str, boolean z) {
        String str2;
        String str3 = C0024.m1513(m578(), 638, 11, 1743);
        String str4 = C0050.m2224(m578(), 649, 6, 1852);
        String str5 = C0053.m2276(m578(), 655, 8, 878);
        String str6 = C0021.m1417(m578(), 663, 4, 1860);
        String str7 = C0032.m1749(m578(), 667, 7, 2938);
        try {
            JSONObject jSONObject = new JSONObject();
            String str8 = C0049.m2192(C0043.m2022() / 1000);
            String str9 = m597(this, str8);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0020.m1364(linkedHashMap, C0039.m1937(m578(), 674, 4, 2698), str9);
            C0020.m1364(linkedHashMap, C0024.m1513(m578(), 678, 9, 1666), str8);
            C0020.m1364(linkedHashMap, C0013.m380(m578(), 687, 7, 2468), str);
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m591(this));
            C0032.m1746(sb, C0039.m1937(m578(), 694, 15, 1297));
            JSONArray jSONArray = C0010.m316(C0006.m188(new JSONObject(m582(this, C0043.m2039(sb), linkedHashMap)), C0039.m1937(m578(), 709, 4, 2327)), str6);
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                int i2 = i;
                int i3 = C0035.m1823(jSONArray);
                int i4 = 1616;
                while (true) {
                    i4 ^= 1633;
                    switch (i4) {
                        case 14:
                        case 49:
                            i4 = i2 < i3 ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject2 = C0036.m1841(jSONArray, i2);
                            JSONObject jSONObject3 = new JSONObject();
                            String str10 = C0022.m1450(jSONObject2, str5);
                            boolean z2 = C0029.m1658(C0028.m1632(jSONObject2, str7));
                            int i5 = 1740;
                            while (true) {
                                i5 ^= 1757;
                                switch (i5) {
                                    case 17:
                                        i5 = z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        str2 = C0028.m1632(jSONObject2, str7);
                                        break;
                                    case 500:
                                        str2 = C0028.m1632(jSONObject2, C0035.m1833(m578(), 713, 13, 1559));
                                        int i6 = 1864;
                                        while (true) {
                                            i6 ^= 1881;
                                            switch (i6) {
                                                case 17:
                                                    i6 = 48674;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            boolean z3 = C0037.m1888(str10, str);
                            int i7 = 48767;
                            while (true) {
                                i7 ^= 48784;
                                switch (i7) {
                                    case 14:
                                    case 45:
                                        C0005.m159(jSONObject3, str4, C0038.m1900(C0052.m2260(jSONObject2, str4)));
                                        C0005.m159(jSONObject3, str5, str10);
                                        C0005.m159(jSONObject3, str7, str2);
                                        C0005.m159(jSONObject3, str3, C0022.m1450(jSONObject2, str3));
                                        C0041.m1985(jSONArray2, jSONObject3);
                                        break;
                                    case 76:
                                        int i8 = 48891;
                                        while (true) {
                                            i8 ^= 48908;
                                            switch (i8) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i8 = 48922;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i7 = !z3 ? 48860 : 48829;
                                }
                            }
                            i = i2 + 1;
                            int i9 = 49666;
                            while (true) {
                                i9 ^= 49683;
                                switch (i9) {
                                    case 17:
                                        i9 = 49697;
                                    case 50:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            C0005.m159(jSONObject, str6, jSONArray2);
                            return C0011.m335(jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            m590(e);
            return C0031.m1705();
        }
    }
}
