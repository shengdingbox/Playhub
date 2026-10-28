package com.github.catvod.spider;

import android.content.Context;
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
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Tingshu275 extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f51short = {1274, 1254, 1254, 1250, 1249, 1192, 1213, 1213, 1267, 1250, 1250, 1212, 1185, 1188, 1191, 1254, 1275, 1276, 1269, 1212, 1265, 1277, 1279, 1353, 1391, 1401, 1390, 1329, 1373, 1403, 1401, 1394, 1384, 1741, 1776, 1783, 1790, 1738, 1777, 1776, 1747, 1776, 1788, 1718, 1704, 1719, 1697, 1719, 1697, 1721, 1713, 1780, 1719, 1776, 1707, 1710, 1708, 1719, 1786, 1782, 1780, 1712, 1101, 1103, 1114, 1099, 1127, 1098, 2443, 2441, 2460, 2445, 2447, 2439, 2458, 2449, 2468, 2433, 2459, 2460, 2519, 2459, 2433, 2450, 2445, 2517, 2521, 2520, 2510, 2456, 2441, 2447, 2445, 2517, 2509, 2459, 2510, 2443, 2441, 2460, 2445, 2447, 2439, 2458, 2449, 2465, 2444, 2517, 2509, 2459, 3307, 3310, 3323, 3310, 1883, 1886, 1860, 1859, 1184, 1197, 2313, 2308, 2308, 2304, 2338, 2310, 2314, 2316, 2318, 1599, 1586, 1586, 1590, 1545, 1588, 1577, 1585, 1592, 476, 465, 465, 469, 511, 464, 477, 470, 465, 460, 1921, 1932, 1932, 1928, 2012, 1921, 1932, 1932, 1928, 1962, 1927, 2014, 921, 924, 905, 924, 1943, 1946, 1946, 1950, 1969, 1940, 1921, 1940, 641, 652, 652, 648, 695, 650, 663, 655, 646, 2246, 2251, 2251, 2255, 2285, 2249, 2245, 2243, 2241, 2916, 2918, 2931, 2914, 2912, 2920, 2933, 2942, 2889, 2918, 2922, 2914, 314, 311, 311, 307, 284, 317, 299, 315, 2395, 2390, 2390, 2386, 2424, 2391, 2394, 2385, 2390, 2379, 845, 838, 847, 862, 858, 843, 860, 785, 861, 839, 852, 843, 787, 791, 791, 791, 791, 776, 862, 847, 841, 843, 787, 799, 776, 861, 833, 860, 858, 787, 847, 861, 845, 776, 844, 833, 833, 837, 871, 842, 787, 1744, 1749, 1743, 1736, 2995, 2990, 2995, 2987, 2978, 1220, 2677, 2686, 2679, 2662, 2658, 2675, 2660, 2655, 2674, 625, 625, 625, 3246, 30134, -26692, 1055, 1055, 1055, 1995, 1480, 1141, 2080, 2702, 2703, 2421, 2421, 2771, 2768, 555, 553, 1798, 1795, 620, 616, 662, 667, 31303, 22456, 20612, 22456, -25957, 21604, -32666, 27299, 22332, 26880, 21988, -27642, 21005, 24239, 23763, 27533, 28169, 19151, 19382, 19151, 23211, 18204, 27410, 31932, 24802, -27351, 31377, 23867, -27377, 29149, 32445, -30392, 25980, 25914, 26086, 26038, 28269, 20620, 22636, 22552, 18431, 27132, 26910, 26820, 2671, 2665, 599, 587, 587, 591, 517, 528, 528, 526, 526, 520, 529, 520, 525, 529, 526, 526, 525, 529, 525, 524, 523, 517, 519, 527, 518, 527, 528, 604, 592, 593, 601, 598, 600, 528, 587, 598, 593, 600, 604, 599, 598, 593, 606, 525, 527, 525, 522, 529, 587, 583, 587, 2085, 2053, 2085, 2053, 2085, 2053, 2179, 2226, 2226, 2181, 2215, 2230, 2177, 2218, 2211, 2226, 2230, 2215, 2224, 2199, 2224, 2222, 2288, 2290, 2288, 2289, 2301, 2230, 2219, 2223, 2215, 2193, 2230, 2211, 2223, 2226, 2303, 1140, 1063, 1083, 1078, 1135, 1140, 1073, 1082, 1075, 1058, 1062, 1079, 1056, 1051, 1078, 1135, 1467, 1532, 1529, 1529, 1492, 1513, 1485, 1532, 1519, 1532, 1517, 1528, 1513, 1440, 430, 490, 487, 487, 483, 449, 492, 437, 749, 748, 765, 2123, 2157, 2171, 2156, 2099, 2143, 2169, 2171, 2160, 2154, 1115, 1118, 1092, 1091, 1106, 1113, 1048, 1030, 1049, 1039, 1049, 1038, 1047, 1055, 1147, 1118, 1113, 1090, 1103, 1036, 1142, 1113, 1107, 1093, 1112, 1118, 1107, 1047, 1030, 1029, 1054, 1047, 1138, 1103, 1112, 1127, 1115, 1110, 1102, 1106, 1093, 1147, 1118, 1109, 1048, 1029, 1049, 1039, 1049, 1027, 1167, 1228, 1225, 1235, 1236, 1221, 1230, 1167, 1217, 1232, 1232, 1224, 1217, 1225, 1220, 1217, 1231, 1167, 1217, 1232, 1232, 1267, 1221, 1217, 1234, 1219, 1224, 1183, 1235, 1221, 1217, 1234, 1219, 1224, 1181, 2224, 2229, 2208, 2229, 2037, 2040, 2040, 2044, 2003, 2038, 2019, 2038, 1342, 1331, 2666, 2663, 2663, 2659, 2625, 2661, 2665, 2671, 2669, 3306, 3303, 3303, 3299, 3292, 3297, 3324, 3300, 3309, 2773, 2776, 2776, 2780, 2806, 2777, 2772, 2783, 2776, 2757, 1347};
    private String yq = C0043.m2020(m982(), 0, 23, 1170);

    public Tingshu275() {
        int i = C0003.m81();
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
                    System.out.println(C0044.m2045("6Uf"));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private Map<String, String> yq() {
        String str = "۠ۧ۠";
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56326:
                    sArr = m982();
                    str = "ۣ۟ۧ";
                    break;
                case 1747897:
                    hashMap = new HashMap();
                    str = "ۡۤ۟";
                    break;
                case 1748764:
                    sArr = m982();
                    str = "ۣۧۧ";
                    break;
                case 1749764:
                    return hashMap;
                case 1750787:
                    str2 = C0028.m1613(sArr, 23, 10, 1308);
                    str = "۠ۦ";
                    break;
                case 1754444:
                    C0042.m1999(hashMap, str2, str3);
                    str = "ۢۥۧ";
                    break;
                default:
                    str3 = C0000.m18(sArr, 33, 29, 1689);
                    str = "ۧۡۦ";
                    break;
            }
        }
    }

    /* renamed from: طدﺭﺵ  reason: contains not printable characters */
    public static Map m980(Object obj) {
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
                    return ((Tingshu275) obj).yq();
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

    /* renamed from: طشﻉﺭ  reason: contains not printable characters */
    public static String m981(Object obj) {
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
                    return ((Tingshu275) obj).yq;
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

    /* renamed from: ظمذا  reason: contains not printable characters */
    public static short[] m982() {
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
                    return f51short;
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
        int i;
        HashMap hashMap2 = new HashMap();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (hashMap == null) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    int i3 = C0042.m2009(hashMap);
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                if (i3 <= 0) {
                                    break;
                                } else {
                                    i4 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                C0004.m146(hashMap2, hashMap);
                                break;
                        }
                        i4 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        String str3 = C0042.m2010(m982(), 62, 6, 1070);
        Object obj = C0007.m220(hashMap2, str3);
        int i5 = 1864;
        while (true) {
            i5 ^= 1881;
            switch (i5) {
                case 17:
                    if (obj != null) {
                        break;
                    } else {
                        i5 = 48736;
                        continue;
                    }
                case 47384:
                    str = (String) C0007.m220(hashMap2, str3);
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
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
            }
            i5 = 48705;
        }
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m981(this));
        C0032.m1746(sb, C0048.m2160(C0027.m1601(m982(), 68, 42, 2536), new Object[]{str2, str}));
        String str4 = C0028.m1633(C0043.m2039(sb), m980(this));
        int i7 = C0007.m223(str2);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = C0010.m316(C0006.m188(new JSONObject(str4), C0031.m1713(m982(), 110, 4, 3215)), C0042.m2010(m982(), 114, 4, 1847));
        int i8 = 0;
        while (true) {
            int i9 = C0035.m1823(jSONArray);
            int i10 = 48891;
            while (true) {
                i10 ^= 48908;
                switch (i10) {
                    case 22:
                    case 53:
                        int i11 = C0008.m231(arrayList);
                        int i12 = 49790;
                        while (true) {
                            i12 ^= 49807;
                            switch (i12) {
                                case 18:
                                    break;
                                case 51:
                                    i = i7 + 1;
                                    break;
                                case 84:
                                    int i13 = 49914;
                                    while (true) {
                                        i13 ^= 49931;
                                        switch (i13) {
                                            case 497:
                                                i13 = 50596;
                                                break;
                                            case 1711:
                                                i = i7;
                                                break;
                                        }
                                    }
                                    break;
                                case 241:
                                    if (i11 >= 10) {
                                        break;
                                    } else {
                                        i12 = 49883;
                                        continue;
                                    }
                            }
                            i12 = 49852;
                        }
                        iX iXVar = new iX();
                        C0040.m1949(iXVar, arrayList);
                        C0042.m2011(iXVar, i7, i, 10, 0);
                        return C0033.m1763(iXVar);
                    case 503:
                        i10 = i8 < i9 ? 49635 : 48953;
                    case 32495:
                        JSONObject jSONObject = C0036.m1841(jSONArray, i8);
                        C0003.m116(arrayList, new ME(C0022.m1450(jSONObject, C0006.m180(m982(), 118, 2, 1225)), C0022.m1450(jSONObject, C0043.m2020(m982(), 129, 9, 1629)), C0022.m1450(jSONObject, C0030.m1688(m982(), 120, 9, 2411)), C0022.m1450(jSONObject, C0049.m2175(m982(), 138, 10, 446))));
                        i8++;
                        int i14 = 49666;
                        while (true) {
                            i14 ^= 49683;
                            switch (i14) {
                                case 17:
                                    i14 = 49697;
                                case 50:
                                    break;
                            }
                        }
                        break;
                }
            }
        }
    }

    public String detailContent(List<String> list) {
        int i = 0;
        String str = (String) C0035.m1801(list, 0);
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m981(this));
        C0032.m1746(sb, C0025.m1542(m982(), 148, 12, 2019));
        C0032.m1746(sb, str);
        JSONObject jSONObject = new JSONObject(C0028.m1633(C0043.m2039(sb), m980(this)));
        String str2 = C0034.m1781(m982(), 160, 4, 1021);
        JSONObject jSONObject2 = C0006.m188(C0006.m188(jSONObject, str2), C0038.m1903(m982(), 164, 8, 2037));
        ME me = new ME();
        C0009.m284(me, str);
        C0008.m255(me, C0028.m1632(jSONObject2, C0010.m296(m982(), 172, 9, 739)));
        C0021.m1409(me, C0028.m1632(jSONObject2, C0035.m1833(m982(), 181, 9, 2212)));
        C0039.m1933(me, C0028.m1632(jSONObject2, C0055.m2320(m982(), 190, 12, 2823)));
        C0044.m2056(me, C0028.m1632(jSONObject2, C0047.m2133(m982(), 202, 8, 344)));
        String str3 = C0005.m169(m982(), 210, 10, 2361);
        C0043.m2035(me, C0028.m1632(jSONObject2, str3));
        C0055.m2330(me, C0028.m1632(jSONObject2, str3));
        StringBuilder sb2 = new StringBuilder();
        C0032.m1746(sb2, m981(this));
        C0032.m1746(sb2, C0027.m1601(m982(), 220, 41, 814));
        C0032.m1746(sb2, str);
        JSONArray jSONArray = C0010.m316(C0006.m188(new JSONObject(C0028.m1633(C0043.m2039(sb2), m980(this))), str2), C0046.m2123(m982(), 261, 4, 1724));
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
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
                        JSONObject jSONObject3 = C0036.m1841(jSONArray, i);
                        StringBuilder sb3 = new StringBuilder();
                        C0032.m1746(sb3, C0022.m1450(jSONObject3, C0032.m1749(m982(), 265, 5, 3015)));
                        C0032.m1746(sb3, C0044.m2052(m982(), 270, 1, 1248));
                        C0032.m1746(sb3, C0022.m1450(jSONObject3, C0000.m18(m982(), 271, 9, 2582)));
                        C0032.m1746(sb3, C0051.m2237(m982(), 280, 3, 525));
                        C0032.m1746(sb3, str);
                        C0003.m116(arrayList, C0043.m2039(sb3));
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
                        int i5 = C0008.m231(arrayList);
                        int i6 = 1864;
                        while (true) {
                            i6 ^= 1881;
                            switch (i6) {
                                case 17:
                                    if (i5 <= 0) {
                                        break;
                                    } else {
                                        i6 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    break;
                                case 47417:
                                    C0020.m1364(linkedHashMap, C0037.m1882(m982(), 284, 2, 834), C0038.m1902(C0048.m2145(m982(), 283, 1, 3213), arrayList));
                                    break;
                                case 47483:
                                    break;
                            }
                            i6 = 48705;
                        }
                        int i7 = C0000.m16(linkedHashMap);
                        int i8 = 48767;
                        while (true) {
                            i8 ^= 48784;
                            switch (i8) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    Set set = C0006.m200(linkedHashMap);
                                    String str4 = C0040.m1953(m982(), 286, 3, 1083);
                                    C0020.m1375(me, C0038.m1902(str4, set));
                                    C0005.m160(me, C0038.m1902(str4, C0039.m1934(linkedHashMap)));
                                    break;
                                case 239:
                                    if (i7 <= 0) {
                                        break;
                                    } else {
                                        i8 = 48860;
                                        continue;
                                    }
                            }
                            i8 = 48829;
                        }
                        return C0000.m21(me);
                }
            }
        }
    }

    public String homeContent(boolean z) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        List list = C0031.m1721(new String[]{C0055.m2320(m982(), 289, 1, 2045), C0027.m1601(m982(), 290, 1, 1535), C0038.m1903(m982(), 291, 1, 1101), C0049.m2175(m982(), 292, 1, 2073), C0005.m169(m982(), 293, 2, 2751), C0037.m1882(m982(), 295, 2, 2372), C0040.m1953(m982(), 297, 2, 2786), C0038.m1903(m982(), 299, 2, 538), C0005.m169(m982(), 301, 2, 1847), C0041.m1994(m982(), 303, 2, 605), C0033.m1764(m982(), 305, 2, 674)});
        List list2 = C0031.m1721(new String[]{C0057.m2384(m982(), 307, 4, 2499), C0036.m1850(m982(), 311, 4, 2662), C0006.m180(m982(), 315, 4, 3223), C0053.m2276(m982(), 319, 4, 2453), C0010.m296(m982(), 323, 4, 1391), C0043.m2020(m982(), 327, 4, 2234), C0027.m1601(m982(), 331, 4, 832), C0046.m2123(m982(), 335, 4, 1218), C0052.m2261(m982(), 339, 4, 1324), C0021.m1417(m982(), 343, 4, 3050), C0027.m1601(m982(), 347, 4, 2523)});
        while (true) {
            int i2 = i;
            int i3 = C0046.m2125(list);
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                    case 49:
                        i4 = i2 < i3 ? 1709 : 1678;
                    case 204:
                        C0003.m116(arrayList, new rP((String) C0035.m1801(list, i2), (String) C0035.m1801(list2, i2)));
                        i = i2 + 1;
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            switch (i5) {
                                case 17:
                                    i5 = 1771;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        return C0000.m9(arrayList, new JSONObject(C0002.m57(m982(), 351, 2, 2580)));
                }
            }
        }
    }

    public void init(Context context) {
        this.yq = C0028.m1633(C0023.m1457(m982(), 353, 51, 575), m980(this));
        int i = C0057.m2368();
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
                    System.out.println(Double.decode(C0003.m113("PLWZW8smpXODsEHOiCQO")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        short[] sArr = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        StringBuilder sb = null;
        String str6 = null;
        Map map = null;
        JSONObject jSONObject = null;
        iX iXVar = null;
        HashMap hashMap = null;
        String str7 = "ۣۨۧ";
        while (true) {
            switch (C0002.m76(str7)) {
                case 56390:
                    iXVar = new iX();
                    sArr = m982();
                    str7 = "۠ۨۢ";
                    break;
                case 1746689:
                    sArr = m982();
                    str3 = C0009.m277(sArr, 457, 14, 1437);
                    str7 = "ۣۧ۠";
                    break;
                case 1746718:
                    sArr = m982();
                    str6 = C0023.m1457(sArr, 471, 8, 392);
                    str7 = "ۣۧۨ";
                    break;
                case 1746750:
                    sArr = m982();
                    str6 = C0006.m180(sArr, 410, 31, 2242);
                    str7 = "ۣۡ۟";
                    break;
                case 1746850:
                    str2 = C0043.m2039(sb);
                    map = m980(this);
                    str7 = "۠ۥۤ";
                    break;
                case 1746940:
                    C0042.m1999(hashMap, str4, str2);
                    C0007.m212(iXVar, hashMap);
                    str7 = "ۣۢ۟";
                    break;
                case 1746941:
                    sArr = m982();
                    str6 = C0052.m2261(sArr, 441, 16, 1106);
                    str7 = "ۢۨۢ";
                    break;
                case 1747655:
                    str4 = C0011.m339(str2, str3)[1];
                    str7 = "ۤۡۥ";
                    break;
                case 1747839:
                    str3 = C0028.m1633(str2, map);
                    jSONObject = new JSONObject(str3);
                    str7 = "ۢۨ";
                    break;
                case 1747901:
                    sArr = m982();
                    str4 = C0006.m180(sArr, 482, 10, 2078);
                    str7 = "ۤۧۨ";
                    break;
                case 1749574:
                    return C0033.m1763(iXVar);
                case 1749792:
                    str6 = m981(this);
                    C0032.m1746(sb, str6);
                    str7 = "۟ۡ۠";
                    break;
                case 1749852:
                    C0032.m1746(sb, str6);
                    C0032.m1746(sb, str2);
                    str7 = "۟۟ۡ";
                    break;
                case 1749854:
                    str5 = C0020.m1367(str3);
                    sb = new StringBuilder();
                    str7 = "ۢۦۤ";
                    break;
                case 1750533:
                    str3 = C0049.m2192(C0043.m2022());
                    str7 = "ۢۨۤ";
                    break;
                case 1750593:
                    C0032.m1746(sb, str6);
                    C0032.m1746(sb, str3);
                    str7 = "۟ۧۥ";
                    break;
                case 1750788:
                    C0032.m1746(sb, str6);
                    C0032.m1746(sb, str4);
                    str7 = "۟ۤۧ";
                    break;
                case 1751560:
                    str2 = C0011.m339(str2, str3)[0];
                    str7 = "ۣ۟ۡ";
                    break;
                case 1751749:
                    sArr = m982();
                    str2 = C0003.m86(sArr, 492, 50, 1079);
                    str7 = "۟ۧۤ";
                    break;
                case 1754500:
                    C0032.m1746(sb, str3);
                    C0032.m1746(sb, str5);
                    str7 = "۟۠۟";
                    break;
                case 1755523:
                    C0013.m394(iXVar, str6, false);
                    hashMap = new HashMap();
                    str7 = "۠ۧۤ";
                    break;
                case 1755588:
                    sArr = m982();
                    str3 = C0031.m1713(sArr, 404, 6, 2169);
                    str7 = "۠۟ۦ";
                    break;
                default:
                    str5 = C0034.m1781(sArr, 479, 3, 670);
                    str6 = C0022.m1450(jSONObject, str5);
                    str7 = "ۨۥ۠";
                    break;
            }
        }
    }

    public String searchContent(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m981(this));
        C0032.m1746(sb, C0034.m1781(m982(), 542, 35, 1184));
        C0032.m1746(sb, C0010.m314(str));
        JSONArray jSONArray = C0010.m316(C0006.m188(new JSONObject(C0028.m1633(C0043.m2039(sb), m980(this))), C0020.m1390(m982(), 577, 4, 2260)), C0009.m277(m982(), 581, 8, 1943));
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
                        C0003.m116(arrayList, new ME(C0022.m1450(jSONObject, C0034.m1781(m982(), 589, 2, 1367)), C0022.m1450(jSONObject, C0009.m277(m982(), 600, 9, 3208)), C0022.m1450(jSONObject, C0010.m296(m982(), 591, 9, 2568)), C0022.m1450(jSONObject, C0005.m169(m982(), 609, 10, 2743))));
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
                        return C0022.m1435(arrayList);
                }
            }
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = "ۣۨۧ";
        short[] sArr = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch (C0002.m76(str2)) {
                case 1749573:
                    return str3;
                case 1750818:
                    sArr = m982();
                    str2 = "ۦۥ۠";
                    break;
                case 1753601:
                    str4 = C0000.m18(sArr, 619, 1, 1394);
                    str2 = "ۣ۟";
                    break;
                default:
                    str3 = C0012.m367(this, str, str4);
                    str2 = "ۢ۟ۢ";
                    break;
            }
        }
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0012.m367(this, str, str2);
    }
}
