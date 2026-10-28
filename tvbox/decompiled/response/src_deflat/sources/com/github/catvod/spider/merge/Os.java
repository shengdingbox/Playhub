package com.github.catvod.spider.merge;

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
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Os {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f61short = {2452, 2470, 2465, 2466, 2443, 2478, 2473, 2466, 2436, 2479, 2470, 2475, 2475, 2466, 2473, 2464, 2466, 2459, 2543, 2533, 2543, 2460, 2457, 2533, 2458, 2540, 2542, 2533, 661, 668, 655, 668, 661, 707, 677, 650, 723, 731, 721, 677, 669, 722, 720, 731, 1885, 1874, 1879, 1883, 1872, 1866, 1889, 1879, 1882, 1135, 1126, 1141, 1126, 1135, 782, 802, 803, 825, 808, 803, 825, 864, 793, 820, 829, 808, 2926, 2943, 2943, 2915, 2918, 2924, 2926, 2939, 2918, 2912, 2913, 2848, 2917, 2940, 2912, 2913, 2715, 2749, 2731, 2748, 2787, 2703, 2729, 2731, 2720, 2746, 1663, 1629, 1608, 1627, 1630, 1630, 1619, 1565, 1543, 1564, 1538, 1554, 1562, 1637, 1627, 1628, 1622, 1629, 1605, 1601, 1554, 1660, 1638, 1554, 1539, 1538, 1564, 1538, 1545, 1554, 1637, 1627, 1628, 1540, 1542, 1545, 1554, 1610, 1540, 1542, 1563, 1554, 1651, 1602, 1602, 1630, 1623, 1637, 1623, 1616, 1657, 1627, 1606, 1565, 1543, 1537, 1541, 1564, 1537, 1540, 1554, 1562, 1657, 1658, 1638, 1663, 1662, 1566, 1554, 1630, 1627, 1625, 1623, 1554, 1653, 1623, 1617, 1625, 1629, 1563, 1554, 1649, 1626, 1600, 1629, 1631, 1623, 1565, 1539, 1536, 1538, 1564, 1538, 1564, 1538, 1564, 1538, 1554, 1633, 1619, 1620, 1619, 1600, 1627, 1565, 1543, 1537, 1541, 1564, 1537, 1540, 1380, 1400, 1400, 1404, 1407, 1334, 1315, 1315, 1391, 1380, 1389, 1376, 1376, 1385, 1378, 1387, 1385, 1314, 1406, 1381, 1402, 1385, 1406, 1407, 1314, 1391, 1380, 1389, 1381, 1400, 1381, 1378, 1314, 1391, 1378, 1315, 1391, 1380, 1389, 1376, 1376, 1385, 1378, 1387, 1385, 1315, 1402, 1342, 1315, 1389, 1404, 1381, 1315, 1381, 1407, 1407, 1401, 1385, 1199, 1194, 1215, 1194, 2000, 1994, 1994, 1996, 2012, 2022, 2000, 2013, 1486, 1497, 1487, 1481, 1488, 1480, 1658, 1644, 1659, 1632, 1640, 1637, 1658, 1140, 1138, 1124, 1139, 1088, 1126, 1124, 1135, 1141, 3300, 3320, 3317, 3296, 3314, 3323, 3302, 3321, 916, 938, 941, 1008, 1009, 2870, 2875, 2868, 2877, 2863, 2875, 2877, 2879, 2377, 2395, 2334, 2416, 2429, 2335, 2390, 2397, 2335, 2390, 2397, 2334, 2420, 2417, 2335, 2390, 2397, 2334, 2406, 2400, 558, 573, 566, 572, 567, 554, 720, 760, 760, 752, 763, 754, 695, 734, 761, 756, 697, 1844, 1828, 1845, 1826, 1826, 1833, 1394, 1395, 1392, 1393, 1398, 1399, 1396, 1397, 1402, 1403, 1315, 1312, 1313, 1318, 1319, 1316, 1317, 1322, 1323, 1320, 1321, 1326, 1327, 1324, 1325, 1330, 1331, 1328, 1329, 1334, 1335, 1332, 1333, 1338, 1339, 1336, 3146, 3157, 3151, 3157, 3144, 3155, 3150, 3189, 3160, 1949, 1933, 1921, 1948, 1931, 2057, 2054, 2051, 2063, 2052, 2078, 1152, 1207, 1204, 1207, 1184, 1207, 1184, 794, 774, 774, 770, 769, 840, 861, 861, 785, 794, 787, 798, 798, 791, 796, 789, 791, 860, 768, 795, 772, 791, 768, 769, 860, 785, 794, 787, 795, 774, 795, 796, 860, 785, 796, 861, 785, 794, 787, 798, 798, 791, 796, 789, 791, 861, 772, 832, 861, 787, 770, 795, 861, 772, 791, 768, 795, 788, 779, 2601, 2612, 2615, 25084, 26825, 19154, 1084, 1108, 1096, 1105, 1104, 1084, 18993, 26572, 22474, 22494, 24940};
    private final String yq;

    public Os(String str) {
        this.yq = str;
        int i = C0035.m1802();

        if (i > 0) {
            return;
        } else {
            System.out.println(Long.decode(C0030.m1663("JIxIOau1NryxuUNpyh")));
            return;
        }
    }

    /* renamed from: ـمﻁل  reason: contains not printable characters */
    public static Response m1062(Object obj, Object obj2, Object obj3) {
        int i = C0041.m1981();

        if (i > 0) {
            return null;
        } else {
            return C0068Pe.dT((String) obj, (String) obj2, (Map) obj3);
        }
    }

    /* renamed from: فقﺽﻡ  reason: contains not printable characters */
    public static short[] m1063() {
        int i = C0027.m1588();

        if (i <= 0) {
            return null;
        } else {
            return f61short;
        }
    }

    /* renamed from: قجغﻁ  reason: contains not printable characters */
    public static String m1064(Object obj) {
        int i = C0024.m1502();

        if (i < 0) {
            return null;
        } else {
            return ((ResponseBody) obj).string();
        }
    }

    /* renamed from: نـﺽا  reason: contains not printable characters */
    public static ResponseBody m1065(Object obj) {
        int i = C0043.m2042();

        if (i > 0) {
            return null;
        } else {
            return ((Response) obj).body();
        }
    }

    /* renamed from: ﺱﺭﻕق  reason: contains not printable characters */
    public static String m1066(Object obj) {
        int i = C0039.m1918();

        if (i > 0) {
            return null;
        } else {
            return ((Os) obj).yq;
        }
    }

    public final String yq(String str) {
        String str2;
        Matcher matcher = C0022.m1425(C0005.m166(C0020.m1390(m1063(), 0, 28, 2503)), str);
        boolean z = C0054.m2303(matcher);
        Integer num = null;

        if (!z) {
            str2 = null;
        } else {
            str2 = C0030.m1678(matcher, 1);
            str2 = null;
        }
        Matcher matcher2 = C0022.m1425(C0005.m166(C0048.m2145(m1063(), 28, 16, 761)), str);
        boolean z2 = C0054.m2303(matcher2);

        if (z2) {
            num = C0053.m2274(C0007.m223(C0030.m1678(matcher2, 1)));
        }

        if (!(str2 == null)) {
            if (!(num == null)) {
                int i6 = C0012.m371(num);
                JSONObject jSONObject = new JSONObject();
                C0005.m159(jSONObject, C0010.m296(m1063(), 44, 9, 1854), str2);
                C0036.m1852(jSONObject, C0056.m2339(m1063(), 53, 5, 1027), i6);
                String str3 = C0044.m2052(m1063(), 58, 12, 845);
                String str4 = C0044.m2052(m1063(), 70, 16, 2831);
                String str5 = C0032.m1749(m1063(), 86, 10, 2766);
                String str6 = C0042.m2010(m1063(), 96, 111, 1586);
                JSONObject jSONObject2 = new JSONObject(m1064(m1065(m1062(C0055.m2320(m1063(), 207, 58, 1292), C0011.m335(jSONObject), C0055.m2325(str3, str4, str5, str6)))));
                String str7 = C0033.m1764(m1063(), 265, 4, 1227);
                JSONObject jSONObject3 = C0006.m188(jSONObject2, str7);
                String str8 = C0053.m2276(m1063(), 269, 8, 1977);
                String str9 = C0022.m1450(jSONObject3, str8);
                JSONArray jSONArray = C0010.m316(jSONObject3, str7);
                int[] iArr = new int[C0035.m1823(jSONArray)];
                int i7 = 0;
                while (true) {
                    int i8 = C0035.m1823(jSONArray);
                    if (i7 < i8) {
                        iArr[i7] = C0026.m1558(jSONArray, i7);
                        i7++;
                    } else {
                        C0043.m2037(C0003.m108(), iArr);
                        C0043.m2037(C0003.m108(), C0056.m2354(iArr));
                        int[] iArr2 = C0056.m2354(iArr);
                        JSONObject jSONObject4 = new JSONObject();
                        C0005.m159(jSONObject4, str8, str9);
                        JSONArray jSONArray2 = new JSONArray();
                        int length = iArr2.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                C0052.m2245(jSONArray2, iArr2[i11]);
                                i11++;
                            } else {
                                C0005.m159(jSONObject4, C0021.m1417(m1063(), 277, 6, 1468), jSONArray2);
                                C0005.m159(jSONObject4, C0004.m130(m1063(), 283, 7, 1545), new JSONArray());
                                Random random = new Random();
                                JSONObject jSONObject5 = new JSONObject();
                                C0005.m159(jSONObject5, C0009.m277(m1063(), 290, 9, 1025), str6);
                                C0005.m159(jSONObject5, C0032.m1749(m1063(), 299, 8, 3220), C0024.m1513(m1063(), 307, 5, 963));
                                C0005.m159(jSONObject5, C0043.m2020(m1063(), 312, 8, 2906), C0022.m1433(m1063(), 320, 20, 2355));
                                C0005.m159(jSONObject5, C0009.m277(m1063(), 340, 6, 600), C0053.m2276(m1063(), 346, 11, 663));
                                JSONArray jSONArray3 = new JSONArray();
                                C0052.m2245(jSONArray3, C0053.m2285(random, 300) + 1536);
                                C0052.m2245(jSONArray3, C0053.m2285(random, 300) + 864);
                                C0005.m159(jSONObject5, C0042.m2010(m1063(), 357, 6, 1863), jSONArray3);
                                Random random2 = new Random();
                                StringBuilder sb = new StringBuilder(32);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < 32) {
                                        C0048.m2158(sb, C0008.m244(C0038.m1903(m1063(), 363, 36, 1346), C0053.m2285(random2, 36)));
                                        i13++;
                                    } else {
                                        C0005.m159(jSONObject5, C0033.m1764(m1063(), 399, 9, 3132), C0043.m2039(sb));
                                        C0036.m1852(jSONObject5, C0042.m2010(m1063(), 408, 5, 2030), 0);
                                        C0005.m159(jSONObject4, C0010.m296(m1063(), 413, 6, 2154), jSONObject5);
                                        HashMap hashMap = new HashMap();
                                        C0042.m1999(hashMap, str3, str4);
                                        C0042.m1999(hashMap, C0036.m1850(m1063(), 419, 7, 1234), m1066(this));
                                        C0042.m1999(hashMap, str5, str6);
                                        return C0022.m1450(C0006.m188(new JSONObject(m1064(m1065(m1062(C0057.m2384(m1063(), 426, 59, 882), C0011.m335(jSONObject4), hashMap)))), str7), C0049.m2175(m1063(), 485, 3, 2627));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Exception exc = new Exception(C0003.m86(m1063(), 488, 14, 1052));

        throw exc;
    }
}
