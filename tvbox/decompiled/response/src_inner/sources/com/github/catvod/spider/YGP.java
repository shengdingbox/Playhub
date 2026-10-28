package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
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
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0128k;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class YGP extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f57short = {2990, 2989, 3004, 2995, 593, 589, 589, 585, 586, 515, 534, 534, 590, 590, 590, 535, 527, 593, 588, 598, 535, 602, 598, 596, 534, 1640, 1201, 1263, 1201, 1184, 1190, 1188, 1260, 1199, 1184, 1207, 1249, 1184, 2100, 2154, 2100, 2085, 2083, 2081, 2153, 2090, 2085, 2098, 2148, 2085, 2154, 2087, 2097, 2102, 2102, 2081, 2090, 2096, 27617, 24649, 25918, 21872, 26600, 26547, -28991, 29124, 31123, 24796, 21414, 2685, 2672, 2671, 2615, 2672, 2679, 2679, 2684, 2667, 2612, 2603, 2682, 2678, 2677, 2612, 2676, 2680, 2672, 2679, 2617, 2685, 2672, 2671, 2615, 2676, 2678, 2671, 2677, 2672, 2666, 2669, 2617, 2599, 2617, 2668, 2677, 2617, 2677, 2672, 2617, 2599, 2617, 2680, 2950, 2972, 2955, 2952, 696, 677, 696, 672, 681, 2086, 2082, 2088, 1614, 1615, 1630, 2286, 2290, 2290, 2294, 3051, 3058, 3065, 3010, 3060, 3065, 2277, 2300, 2295, 2252, 2301, 2290, 2302, 2294, 2935, 2926, 2917, 2910, 2929, 2920, 2914, 3185, 3176, 3171, 3160, 3189, 3170, 3178, 3174, 3189, 3180, 3188, 424, 441, 447, 445, 2628, 2645, 2643, 2641, 2647, 2651, 2625, 2650, 2624, 1359, 1354, 1358, 1354, 1367, 683, 688, 683, 702, 691, 995, 998, 1020, 1019, 816, 816, 816, 2374, 2384, 2378, 2313, 2374, 2381, 2371, 2308, 2374, 2384, 2378, 2313, 2371, 2390, 2369, 2369, 2378, 2308, 2384, 2376, 2381, 2391, 2384, 2313, 2374, 2384, 2378, 1393, 1389, 1389, 1385, 1386, 1315, 1334, 1334, 1390, 1390, 1390, 1335, 1327, 1393, 1388, 1398, 1335, 1402, 1398, 1396, 1334, 28463, 27725, -28375, 24039, 1193, 1188, 1211, 1251, 1184, 1186, 1211, 1188, 1192, 1248, 1209, 1188, 1209, 1185, 1192, 1248, 1193, 1192, 1209, 1196, 1188, 1185, 1261, 1213, 692, 697, 678, 766, 697, 702, 702, 693, 674, 765, 679, 674, 689, 672, 672, 693, 674, 3038, 3027, 3020, 2964, 3031, 3029, 3020, 3027, 3039, 2967, 3022, 3027, 3022, 3030, 3039, 2967, 3031, 3018, 3027, 3033, 2970, 2948, 2970, 3035, 2970, 2948, 3027, 3031, 3037, 1038, 1039, 1054, 2453, 2441, 2441, 2445, 608, 569, 550, 613, 615, 638, 609, 621, 549, 614, 617, 613, 621, 872, 869, 890, 802, 865, 867, 890, 869, 873, 801, 888, 869, 888, 864, 873, 801, 872, 873, 888, 877, 869, 864, 812, 877, 1628, 1606, 1617, 1618, 2843, 2839, 2829, 2838, 2828, 2826, 2817, 2339, 2337, 2360, 2343, 2347, 2362, 2359, 2366, 2347, 524, 22501, 25357, -3325, 3121, 3127, 3122, 3120, 16930, 25357, 19437, 25543, -1283, 1487, 1467, 1424, 1484, 1486, 19112, 27527, -1143, 1211, 1213, 1208, 1210, 22260, 25686, 21800, 26506, -1963, 1895, 1889, 1892, 1894, 1811, 1895, -29527, 31113, 1811, 1894, 895, 882, 877, 821, 882, 885, 885, 894, 873, 822, 876, 873, 890, 875, 875, 894, 873, 827, 890, 821, 888, 878, 873, 873, 894, 885, 879, -28479, 23567, 1127, 1130, 1141, 1056, 1143, 1122, 1121, 1140, 1137, 1122, 1139, 1139, 1126, 1137, 1070, 1122, 1135, 1135, 1059, 1143, 1137, 1059, 1143, 1127, 1059, 1122, 2559, 2535, 2530, 2552, 2559, 2470, 2537, 2537, 2552, 2470, 2559, 2543, 2559, 2530, 2559, 2535, 2542, 889, 2411, 28068, 28358, -27742, 24428, 2818, 2897, 2897, 2897, 3030, 3023, 3012, 3071, 3017, 3012, 2219, 2226, 2233, 2178, 2227, 2236, 2224, 2232, 294, 319, 308, 271, 288, 313, 307, 2635, 2630, 2639, 2650, 2656, 2641, 2654, 2642, 2650, 2735, 2742, 2749, 2694, 2720, 2748, 2744, 2731, 3277, 3284, 3295, 3300, 3290, 3273, 3294, 3290, 1673, 1680, 1691, 1696, 1677, 1690, 1682, 1694, 1677, 1684, 1676, 658, 651, 640, 699, 645, 647, 656, 651, 662, 1052, 1029, 1038, 1077, 1038, 1027, 1048, 1039, 1033, 1054, 1029, 1048, 2291, 2282, 2273, 2266, 2278, 2282, 2283, 2289, 2272, 2283, 2289, 2115, 2138, 2129, 2154, 2117, 2137, 2132, 2124, 2154, 2131, 2119, 2138, 2136, 1881, 1856, 1867, 1904, 1887, 1859, 1870, 1878, 1904, 1882, 1885, 1859, 2498, 2503, 2525, 2522, 398, 397, 412, 403, 1023, 995, 995, 999, 996, 941, 952, 952, 992, 992, 992, 953, 929, 1023, 994, 1016, 953, 1012, 1016, 1018, 952, 503, 506, 499, 486, 476, 490, 487, 305, 307, 298, 304, 309, 303, 296, 371, 2374, 2379, 2370, 2391, 2413, 2396, 2387, 2399, 2391, 24832, 30455, -25548, 20730, 1722, 1717, 1720, 1706, 1706, 536, 535, 530, 522, 539, 524, 525, 2798, 2787, 2812, 2724, 2791, 2789, 2812, 2790, 2787, 2809, 2814, 2730, 2740, 2730, 2815, 2790, 2730, 2790, 2787, 2730, 2740, 2730, 2795, 1610, 1616, 1607, 1604, 1209, 1188, 1209, 1185, 1192, 3287, 3283, 3289, 2219, 2218, 2235, 2724, 2744, 2744, 2748, 392, 401, 410, 417, 407, 410, 1709, 1716, 1727, 1668, 1717, 1722, 1718, 1726, 1840, 1833, 1826, 1817, 1846, 1839, 1829, 1343, 1318, 1325, 1302, 1339, 1324, 1316, 1320, 1339, 1314, 1338, 2681, 2684, 2662, 2657, 3164, 3136, 3136, 3140, 3143, 3086, 3099, 3099, 3139, 3139, 3139, 3098, 3074, 3164, 3137, 3163, 3098, 3159, 3163, 3161, 3099, 3039, 2966, 2953, 2949, 2967, 3037, 2945, 2960, 2953, 3014, 2957, 2959, 2948, 2949, 3037, 2948, 2959, 2967, 2958, 2956, 2959, 2945, 2948, 3021, 2948, 2945, 2964, 2945, 3014, 2962, 2945, 2958, 2948, 3037, 2054, 2132, 2132, 2121, 2116, 2077, 841, 1930, 1947, 1928, 1929, 1951, 1605, 1625, 1620, 1612, 1632, 1607, 1625, 801, 806, 824, 2780, 2782, 2759, 2756, 2755, 2781, 958, 957, 940, 931, 2841, 2821, 2821, 2817, 2818, 2891, 2910, 2910, 2822, 2822, 2822, 2911, 2887, 2841, 2820, 2846, 2911, 2834, 2846, 2844, 2910, 1561, 1613, 1603, 1631, 1617, 1609, 1620, 1602, 1563, 3168, 3120, 3119, 3107, 3121, 3195, 3125, 3107, 3111, 3124, 3109, 3118, 1375, 1362, 1357, 1301, 1366, 1364, 1357, 1367, 1362, 1352, 1359, 1307, 1285, 1307, 1358, 1367, 1307, 1367, 1362, 1307, 1285, 1307, 1370, 3317, 3311, 3320, 3323, 3095, 3082, 3095, 3087, 3078, 2862, 2858, 2848, 2730, 2731, 2746, 528, 524, 524, 520, 1266, 1259, 1248, 1243, 1261, 1248, 1448, 1457, 1466, 1409, 1456, 1471, 1459, 1467, 3166, 3143, 3148, 3191, 3160, 3137, 3147, 732, 709, 718, 757, 728, 719, 711, 715, 728, 705, 729, 1441, 1444, 1470, 1465, 987, 979, 962, 990, 985, 978, 2498, 2496, 2513, 891, 861, 843, 860, 771, 879, 841, 843, 832, 858, 1315, 1281, 1300, 1287, 1282, 1282, 1295, 1345, 1371, 1344, 1374, 1358, 
    1350, 1337, 1287, 1280, 1290, 1281, 1305, 1309, 1358, 1312, 1338, 1358, 1375, 1374, 1344, 1374, 1365, 1358, 1337, 1313, 1337, 1368, 1370, 1351, 1358, 1327, 1310, 1310, 1282, 1291, 1337, 1291, 1292, 1317, 1287, 1306, 1345, 1371, 1373, 1369, 1344, 1373, 1368, 1358, 1350, 1317, 1318, 1338, 1315, 1314, 1346, 1358, 1282, 1287, 1285, 1291, 1358, 1321, 1291, 1293, 1285, 1281, 1351, 1358, 1325, 1286, 1308, 1281, 1283, 1291, 1345, 1366, 1368, 1344, 1374, 1344, 1370, 1372, 1370, 1374, 1344, 1375, 1367, 1366, 1358, 1341, 1295, 1288, 1295, 1308, 1287, 1345, 1371, 1373, 1369, 1344, 1373, 1368, 1592, 1562, 1562, 1564, 1545, 1549, 1115, 1098, 1111, 1115, 1024, 1095, 1115, 1090, 1091, 1027, 1102, 1119, 1119, 1091, 1094, 1100, 1102, 1115, 1094, 1088, 1089, 1024, 1111, 1095, 1115, 1090, 1091, 1028, 1111, 1090, 1091, 1027, 1102, 1119, 1119, 1091, 1094, 1100, 1102, 1115, 1094, 1088, 1089, 1024, 1111, 1090, 1091, 1044, 1118, 1042, 1055, 1025, 1046, 1027, 1094, 1090, 1102, 1096, 1098, 1024, 1102, 1113, 1094, 1097, 1027, 1094, 1090, 1102, 1096, 1098, 1024, 1112, 1098, 1101, 1119, 1027, 1094, 1090, 1102, 1096, 1098, 1024, 1102, 1119, 1089, 1096, 1027, 1029, 1024, 1029, 1044, 1118, 1042, 1055, 1025, 1047, 1027, 1102, 1119, 1119, 1091, 1094, 1100, 1102, 1115, 1094, 1088, 1089, 1024, 1116, 1094, 1096, 1089, 1098, 1099, 1026, 1098, 1111, 1100, 1095, 1102, 1089, 1096, 1098, 1044, 1113, 1042, 1101, 1052, 1044, 1118, 1042, 1055, 1025, 1046, 402, 432, 432, 438, 419, 423, 510, 415, 434, 445, 436, 422, 434, 436, 438, 2401, 2419, 2358, 2392, 2389, 2359, 2401, 2419, 2336, 2410, 2342, 2347, 2357, 2338};
    private JSONObject yq;

    private static String SN(Pattern pattern, String str) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(1).trim() : str;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: دحوق  reason: contains not printable characters */
    public static JSONObject m1023(Object obj) {
        if (C0041.m1981() <= 0) {
            return ((YGP) obj).yq;
        }
        return null;
    }

    /* renamed from: غﺥﺙس  reason: contains not printable characters */
    public static HashMap m1024(Object obj) {
        if (C0047.m2134() < 0) {
            return ((YGP) obj).yq();
        }
        return null;
    }

    /* renamed from: هسﺩظ  reason: contains not printable characters */
    public static void m1025(Object obj) {
        if (C0040.m1954() < 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ﺏغﺽع  reason: contains not printable characters */
    public static short[] m1026() {
        if (C0022.m1429() <= 0) {
            return f57short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int i;
        int parseInt;
        String str3 = C0028.m1613(f57short, 0, 4, 3037);
        String str4 = C0006.m180(f57short, 4, 21, 569);
        try {
            String[] strArr = {"", "", "", "", ""};
            String str5 = str4 + str;
            strArr[4] = str2;
            if (hashMap != null && hashMap.size() > 0) {
                for (String str6 : hashMap.keySet()) {
                    strArr[Integer.parseInt(str6)] = URLEncoder.encode(hashMap.get(str6));
                }
            }
            String W = C0068Pe.W(str5 + TextUtils.join(C0012.m361(f57short, 25, 1, 1591), strArr), yq());
            Va yq = rN.yq(W);
            JSONObject jSONObject = new JSONObject();
            kB cS = yq.cS(C0030.m1688(f57short, 26, 12, 1217));
            if (cS.size() == 0) {
                int parseInt2 = Integer.parseInt(str2);
                i = parseInt2;
                parseInt = parseInt2;
            } else {
                int i2 = 0;
                int i3 = 0;
                while (i3 < cS.size()) {
                    hN hNVar = cS.get(i3);
                    i3++;
                    i2 = !isNumeric(hNVar.Fo()) ? i2 : i2 < Integer.parseInt(hNVar.Fo()) ? Integer.parseInt(hNVar.Fo()) : i2;
                }
                parseInt = Integer.parseInt(yq.cS(C0023.m1457(f57short, 38, 20, 2116)).t0());
                i = i2;
            }
            JSONArray jSONArray = new JSONArray();
            if (!W.contains(C0057.m2384(f57short, 58, 11, 1856))) {
                kB cS2 = yq.cS(C0049.m2175(f57short, 69, 43, 2585));
                for (int i4 = 0; i4 < cS2.size(); i4++) {
                    hN hNVar2 = cS2.get(i4);
                    String N = hNVar2.N(C0015.m457(f57short, 112, 4, 3054));
                    String N2 = PA.yq(str3, hNVar2).N(C0054.m2301(f57short, 116, 5, 716));
                    String N3 = PA.yq(C0036.m1850(f57short, 121, 3, 2127), hNVar2).N(C0024.m1513(f57short, 124, 3, 1597));
                    if (!N3.contains(C0011.m328(f57short, 127, 4, 2182))) {
                        N3 = str4 + N3;
                    }
                    String Fo = hNVar2.cS(str3).zH().Fo();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0055.m2320(f57short, 131, 6, 2973), N);
                    jSONObject2.put(C0013.m380(f57short, 137, 8, 2195), N2);
                    jSONObject2.put(C0002.m57(f57short, 145, 7, 2817), N3);
                    jSONObject2.put(C0053.m2276(f57short, 152, 11, 3079), Fo);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(C0029.m1635(f57short, 163, 4, 472), parseInt);
            jSONObject.put(C0027.m1601(f57short, 167, 9, 2612), i);
            jSONObject.put(C0014.m421(f57short, 176, 5, 1315), 30);
            jSONObject.put(C0013.m380(f57short, 181, 5, 735), i <= 1 ? jSONArray.length() : i * 30);
            jSONObject.put(C0013.m380(f57short, 186, 4, 911), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = C0025.m1542(f57short, 190, 3, 788);
        String str9 = C0021.m1417(f57short, 193, 27, 2340);
        String str10 = C0053.m2276(f57short, 220, 21, 1305);
        String str11 = C0002.m57(f57short, 241, 4, 2477);
        String str12 = C0038.m1903(f57short, 245, 24, 1229);
        try {
            Va yq = rN.yq(C0068Pe.W(str10 + list.get(0).substring(1), yq()));
            yq.ee().contains(str11);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            yq.cS(C0025.m1542(f57short, 269, 17, 720)).get(0);
            String yq2 = yq.cS(C0034.m1781(f57short, 286, 29, 3002)).yq(C0035.m1833(f57short, 315, 3, 1149));
            String str13 = yq2.contains(C0053.m2276(f57short, 318, 4, 2557)) ? yq2 : str10 + yq2;
            String t0 = yq.cS(C0044.m2052(f57short, 322, 13, 520)).t0();
            kB cS = yq.cS(C0035.m1833(f57short, 335, 24, 780));
            String str14 = "";
            String str15 = "";
            int i = 0;
            while (true) {
                int size = cS.size();
                str = C0025.m1542(f57short, 359, 4, 1588);
                if (i >= size) {
                    break;
                }
                String Fo = cS.get(i).N(str).contains(C0004.m130(f57short, 363, 7, 2936)) ? cS.get(i).Fo() : str15;
                String str16 = cS.get(i).N(str).contains(C0042.m2010(f57short, 370, 9, 2382)) ? str14 + cS.get(i).Fo() + C0044.m2052(f57short, 379, 1, 547) : str14;
                i++;
                str15 = Fo;
                str14 = str16;
            }
            String SN = SN(Pattern.compile(C0031.m1713(f57short, 380, 9, 3097)), yq.cS(str12).t0());
            String SN2 = SN(Pattern.compile(C0003.m86(f57short, 389, 8, 1511)), yq.cS(str12).t0());
            String SN3 = SN(Pattern.compile(C0028.m1613(f57short, 397, 9, 1171)), yq.cS(str12).t0());
            String SN4 = SN(Pattern.compile(C0015.m457(f57short, 406, 13, 1871)), yq.cS(str12).t0());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            kB cS2 = yq.cS(C0054.m2301(f57short, 419, 27, 795));
            if (!yq.ee().contains(str11)) {
                String str17 = "";
                int i2 = 0;
                String str18 = "";
                String str19 = "";
                while (i2 < cS2.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    if (cS2.get(i2).Fo().contains(C0040.m1953(f57short, 446, 2, 2117))) {
                        arrayList.add(cS2.get(i2).Fo());
                        kB cS3 = yq.cS(C0031.m1713(f57short, 448, 26, 1027));
                        for (int i3 = 0; i3 < cS3.size(); i3++) {
                            if (!cS3.get(i3).p(str9) && cS3.get(i3).p(C0006.m180(f57short, 474, 17, 2443))) {
                                str18 = cS3.get(i3).Fo();
                            }
                            if (cS3.get(i3).p(str9)) {
                                String N = cS3.get(i3).N(str);
                                StringBuilder sb = new StringBuilder();
                                sb.append(str18);
                                sb.append(C0013.m380(f57short, 491, 1, 861));
                                sb.append(N);
                                arrayList3.add(sb.toString());
                            }
                        }
                        String join = arrayList3.size() > 1 ? TextUtils.join(C0037.m1882(f57short, 492, 1, 2376), arrayList3) : (String) arrayList3.get(0);
                        arrayList2.add(join);
                        if (arrayList2.size() > 1) {
                            str19 = TextUtils.join(str8, arrayList2);
                            str7 = TextUtils.join(str8, arrayList);
                        } else {
                            str7 = (String) arrayList.get(0);
                            str19 = join;
                        }
                    } else {
                        str7 = str17;
                    }
                    i2++;
                    str17 = str7;
                }
                str3 = str19;
                str4 = SN2;
                str5 = str14;
                str2 = str17;
            } else {
                str2 = "";
                str3 = "";
                str4 = SN2;
                str5 = str14;
            }
            if (str2.equals("")) {
                str6 = C0013.m380(f57short, 493, 8, 2854);
                str2 = str11;
            } else {
                str6 = str3;
            }
            jSONObject2.put(C0013.m380(f57short, 501, 6, 2976), list.get(0));
            jSONObject2.put(C0039.m1937(f57short, 507, 8, 2269), t0);
            jSONObject2.put(C0027.m1601(f57short, 515, 7, 336), str13);
            jSONObject2.put(C0033.m1764(f57short, 522, 9, 2623), str5);
            jSONObject2.put(C0056.m2339(f57short, 531, 8, 2777), str4);
            jSONObject2.put(C0040.m1953(f57short, 539, 8, 3259), str15);
            jSONObject2.put(C0040.m1953(f57short, 547, 11, 1791), "");
            jSONObject2.put(C0034.m1781(f57short, 558, 9, 740), SN3);
            jSONObject2.put(C0043.m2020(f57short, 567, 12, 1130), SN);
            jSONObject2.put(C0026.m1551(f57short, 579, 11, 2181), SN4);
            jSONObject2.put(C0014.m421(f57short, 590, 13, 2101), str2);
            jSONObject2.put(C0020.m1390(f57short, 603, 12, 1839), str6);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put(C0011.m328(f57short, 615, 4, 2478), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        String str = C0028.m1613(m1026(), 619, 4, 509);
        String str2 = C0041.m1994(m1026(), 623, 21, 919);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            C0005.m159(jSONObject2, C0056.m2339(m1026(), 644, 7, 387), C0025.m1542(m1026(), 651, 8, 348));
            C0005.m159(jSONObject2, C0024.m1513(m1026(), 659, 9, 2354), C0054.m2301(m1026(), 668, 4, 1200));
            C0041.m1985(jSONArray, jSONObject2);
            C0005.m159(jSONObject, C0036.m1850(m1026(), 672, 5, 1753), jSONArray);
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
                        C0005.m159(jSONObject, C0031.m1713(m1026(), 677, 7, 638), m1023(this));
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            kB kBVar = C0014.m434(C0040.m1964(C0001.m32(str2, m1024(this))), C0027.m1601(m1026(), 684, 23, 2698));
            JSONArray jSONArray2 = new JSONArray();
            int i2 = 0;
            while (true) {
                int i3 = C0014.m422(kBVar);
                int i4 = 1740;
                while (true) {
                    i4 ^= 1757;
                    switch (i4) {
                        case 17:
                            i4 = i2 < i3 ? 1833 : 1802;
                        case 54:
                        case 471:
                            C0005.m159(jSONObject, C0024.m1513(m1026(), 758, 4, 2581), jSONArray2);
                            return C0011.m335(jSONObject);
                        case 500:
                            hN hNVar = (hN) C0038.m1913(kBVar, i2);
                            String str3 = C0013.m381(hNVar, C0000.m18(m1026(), 707, 4, 1570));
                            String str4 = C0013.m381(C0000.m12(str, hNVar), C0055.m2320(m1026(), 711, 5, 1229));
                            String str5 = C0013.m381(C0000.m12(C0052.m2261(m1026(), 716, 3, 3262), hNVar), C0050.m2224(m1026(), 719, 3, 2264));
                            boolean z2 = C0037.m1888(str5, C0046.m2123(m1026(), 722, 4, 2764));
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = z2 ? 48736 : 48705;
                                    case 47384:
                                        StringBuilder sb = new StringBuilder();
                                        C0032.m1746(sb, str2);
                                        C0032.m1746(sb, str5);
                                        str5 = C0043.m2039(sb);
                                        break;
                                    case 47417:
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
                                    case 47483:
                                }
                            }
                            String str6 = C0022.m1427(C0044.m2044(C0014.m434(hNVar, str)));
                            JSONObject jSONObject3 = new JSONObject();
                            C0005.m159(jSONObject3, C0027.m1601(m1026(), 726, 6, 510), str3);
                            C0005.m159(jSONObject3, C0049.m2175(m1026(), 732, 8, 1755), str4);
                            C0005.m159(jSONObject3, C0042.m2010(m1026(), 740, 7, 1862), str5);
                            C0005.m159(jSONObject3, C0057.m2384(m1026(), 747, 11, 1353), str6);
                            C0041.m1985(jSONArray2, jSONObject3);
                            i2++;
                            int i7 = 48891;
                            while (true) {
                                i7 ^= 48908;
                                switch (i7) {
                                    case 22:
                                        break;
                                    case 503:
                                        i7 = 48922;
                                }
                            }
                            break;
                    }
                }
            }
        } catch (Exception e) {
            m1025(e);
            return C0031.m1705();
        }
    }

    public void init(Context context) {
        YGP.super.init(context);
        try {
            this.yq = new JSONObject("{\"movlist/\":[{\"key\":\"1\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"灾难\",\"v\":\"灾难\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"冒险\",\"v\":\"冒险\"}]},{\"key\":\"0\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"2\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"},{\"n\":\"1999\",\"v\":\"1999\"},{\"n\":\"1998\",\"v\":\"1998\"},{\"n\":\"1980\",\"v\":\"1980\"}]},{\"key\":\"3\",\"name\":\"排序\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"最近更新\",\"v\":\"\"},{\"n\":\"上映时间\",\"v\":\"pubtime\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        cn.F5(false);
        try {
            JSONObject jSONObject = new JSONArray(C0068Pe.W(C0044.m2052(f57short, 762, 21, 3124) + C0040.m1953(f57short, 783, 34, 3040) + Math.random() + C0028.m1613(f57short, 817, 6, 2080) + str2.split(C0041.m1994(f57short, 823, 1, 870))[2], yq())).getJSONObject(0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0027.m1601(f57short, 824, 5, 2042), 0);
            jSONObject2.put(C0003.m86(f57short, 829, 7, 1589), "");
            jSONObject2.put(C0006.m180(f57short, 836, 3, 852), jSONObject.getString(C0056.m2339(f57short, 839, 6, 2737)));
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = C0056.m2339(f57short, 845, 4, 973);
        String str3 = C0001.m35(f57short, 849, 21, 2929);
        try {
            JSONObject jSONObject = new JSONObject();
            kB cS = rN.yq(C0068Pe.W(str3 + C0022.m1433(f57short, 870, 9, 1574) + URLEncoder.encode(str) + C0001.m35(f57short, 879, 12, 3142), yq())).cS(C0057.m2384(f57short, 891, 23, 1339));
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < cS.size(); i++) {
                hN hNVar = cS.get(i);
                String N = hNVar.N(C0041.m1994(f57short, 914, 4, 3229));
                String N2 = PA.yq(str2, hNVar).N(C0036.m1850(f57short, 918, 5, 3171));
                String N3 = PA.yq(C0048.m2145(f57short, 923, 3, 2887), hNVar).N(C0012.m361(f57short, 926, 3, 2777));
                if (!N3.contains(C0051.m2237(f57short, 929, 4, 632))) {
                    N3 = str3 + N3;
                }
                String Fo = hNVar.cS(str2).zH().Fo();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C0052.m2261(f57short, 933, 6, 1156), N);
                jSONObject2.put(C0021.m1417(f57short, 939, 8, 1502), N2);
                jSONObject2.put(C0050.m2224(f57short, 947, 7, 3112), N3);
                jSONObject2.put(C0047.m2133(f57short, 954, 11, 682), Fo);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(C0047.m2133(f57short, 965, 4, 1485), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    protected final HashMap<String, String> yq() {
        HashMap<String, String> SN = C0128k.SN(C0055.m2320(f57short, 969, 6, 950), C0023.m1457(f57short, 975, 3, 2437), C0030.m1688(f57short, 978, 10, 814), C0037.m1882(f57short, 988, 110, 1390));
        SN.put(C0056.m2339(f57short, 1098, 6, 1657), C0050.m2224(f57short, 1104, 135, 1071));
        SN.put(C0043.m2020(f57short, 1239, 15, 467), C0036.m1850(f57short, 1254, 14, 2331));
        return SN;
    }
}
