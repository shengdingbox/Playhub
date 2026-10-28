package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
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
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class LiveGz extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f35short = {996, 1016, 1016, 1020, 1023, 950, 931, 931, 1005, 1020, 997, 930, 993, 995, 1001, 959, 1000, 1014, 1001, 930, 1007, 995, 993, 1435, 1439, 1426, 2228, 2232, 2221, 2234, 2225, 2182, 2224, 2237, 2126, 2125, 2112, 2112, 2163, 2136, 2133, 2140, 2121, 2678, 1324, 1323, 1321, 1313, 1015, 1016, 1012, 1020, 1940, 1986, 1991, 1940, 1209, 1190, 1212, 1190, 1211, 1190, 1185, 1192, 2946, 2945, 2953, 2945, 901, 898, 919, 913, 915, 1580, 1599, 1580, 1575, 1597, 1558, 1575, 1576, 1572, 1580, 1523, 2041, 2037, 2016, 2039, 2044, 1995, 2016, 2045, 2041, 2033, 2430, 2430, 2334, 2391, 2391, 2323, 2427, 2427, 2313, 2398, 2398, 26275, 24201, -29486, 425, 1987, 2003, 2015, 1986, 2005, 31346, 26667, 17067, 3238, 20819, 22317, -32262, 3201, 840, 26812, 20846, 1809, 3042, 1704, 1777, 1717, 1697, 1714, 1726, 1718, 1777, 1769, 1777, 1763, 1777, 1791, 1777, 1723, 1724, 1703, 1777, 1769, 1777, 2517, 2523, 2517, 2435, 2454, 2448, 2517, 2509, 2517, 2924, 2914, 2924, 2874, 2871, 2878, 2859, 2924, 2932, 2924, 593, 526, 757, 767, 752, 761, 763, 751, 759, 747, 766, 646, 646, 648, 646, 671, 704, 656, 2536, 2538, 2536, 2536, 2536, 2537, 2536, 2529, 2536, 2536, 2536, 2539, 2536, 2538, 2536, 2543, 697, 753, 748, 697, 762, 767, 736, 755, 697, 741, 742, 761, 740, 738, 741, 681, 742, 759, 740, 759, 763, 755, 738, 755, 740, 683, 765, 755, 751, 905, 943, 953, 942, 1009, 925, 955, 953, 946, 936, 1614, 1610, 1609, 1621, 1621, 1617, 1550, 1554, 1551, 1552, 1555, 1551, 1553, 2306, 2317, 2312, 2308, 2319, 2325, 2380, 2327, 2308, 2323, 2322, 2312, 2318, 2319, 2441, 2452, 2442, 2452, 2446, 2452, 2442, 2521, 2504, 2523, 2504, 2500, 2508, 2525, 2508, 2523, 2766, 2763, 2782, 2763, 1345, 1395, 1375, 1368, 1357, 1368, 1369, 1375, 2416, 474, 387, 451, 448, 461, 461, 510, 469, 472, 465, 452, 387, 411, 387, 1262, 1248, 1262, 1185, 1197, 1208, 1199, 1188, 1171, 1189, 1192, 1262, 1270, 1262, 2928, 2942, 2928, 2879, 2875, 2870, 2928, 2920, 2928, 1701, 1786, 1621, 1631, 1616, 1625, 1627, 1615, 1623, 1611, 1630, 1574, 1574, 1576, 1574, 1599, 1632, 1584, 1354, 1352, 1354, 1354, 1354, 1355, 1354, 1347, 1354, 1354, 1354, 1353, 1354, 1352, 1354, 1357, 1489, 1433, 1412, 1489, 1426, 1431, 1416, 1435, 1489, 1434, 1435, 1418, 1439, 1431, 1426, 1473, 1422, 1439, 1420, 1439, 1427, 1435, 1418, 1435, 1420, 1475, 1429, 1435, 1415, 579, 613, 627, 612, 571, 599, 625, 627, 632, 610, 426, 430, 429, 433, 433, 437, 490, 502, 491, 500, 503, 491, 501, 1197, 1186, 1191, 1195, 1184, 1210, 1251, 1208, 1195, 1212, 1213, 1191, 1185, 1184, 335, 338, 332, 338, 328, 338, 332, 2732, 2749, 2734, 2749, 2737, 2745, 2728, 2745, 2734, 2414, 2411, 2430, 2411, 1997, 2047, 2003, 2004, 1985, 2004, 2005, 2003, 767, 762, 741, 758, 716, 767, 762, 765, 758, 928, 943, 931, 939, 2700, 483, 445, 507, 438, 2803, -31870, 23178, 32397, 18324, -32333, -28444, 18008, 18062, 18208, 22026, 23615, 1064, 1064, 1064, 1632, 1660, 1633, 1660, 1633, 31901, 26845, 2061, 2064, 2062, 2058, 2064, 2061, 1562, 1558, 1557, 767, 738, 767, 738, 766, -30392, 28920, 2899, 2894, 2899, 2894, 2897, 29630, 31827, 1750, 1745, 1743, 758, 743, 756, 757, 739, 1315, 443, 423, 426, 434, 414, 441, 423};
    private String yq = C0040.m1953(m850(), 0, 23, 908);

    public LiveGz() {
        int i = C0021.m1415();
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
                    System.out.println(Double.valueOf(C0001.m28("fcyomhv")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x025f, code lost:
        com.github.catvod.spider.merge.C0032.m1746(r4, r3);
        com.github.catvod.spider.merge.C0032.m1746(r4, r11);
        com.github.catvod.spider.merge.C0032.m1746(r4, r12);
        com.github.catvod.spider.merge.C0032.m1746(r4, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.github.catvod.spider.merge.ME SN(org.json.JSONObject r17, int r18) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.LiveGz.SN(org.json.JSONObject, int):com.github.catvod.spider.merge.ME");
    }

    private List<ME> yq(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = C0011.m339(str, C0036.m1850(m850(), 126, 1, 3023));
        StringBuilder sb = C0052.m2253(C0043.m2020(m850(), 127, 20, 1747));
        int i = 0;
        C0032.m1746(sb, strArr[0]);
        C0032.m1746(sb, C0046.m2123(m850(), 147, 9, 2551));
        C0032.m1746(sb, strArr[1]);
        C0032.m1746(sb, C0001.m35(m850(), 156, 10, 2894));
        String str2 = C0032.m1739(sb, strArr[2], C0045.m2098(m850(), 166, 2, 627));
        String str3 = C0027.m1601(m850(), 168, 16, 702);
        String str4 = C0000.m18(m850(), 184, 16, 2520);
        String str5 = C0039.m1940(str2, str3, str4, 0);
        String str6 = C0032.m1739(new StringBuilder(), m851(this), C0051.m2237(m850(), 200, 29, 662));
        HashMap hashMap = C0055.m2325(C0031.m1713(m850(), 229, 10, 988), C0043.m2020(m850(), 239, 13, 1569), C0056.m2339(m850(), 252, 14, 2401), C0054.m2301(m850(), 266, 7, 2490));
        HashMap hashMap2 = new HashMap();
        C0042.m1999(hashMap2, C0046.m2123(m850(), 273, 9, 2473), str5);
        JSONArray jSONArray = new JSONArray(C0031.m1720(C0022.m1450(new JSONObject(C0052.m2257(C0005.m167(str6, hashMap2, hashMap))), C0020.m1390(m850(), 282, 4, 2730)), str3, str4));
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
                        int i4 = C0052.m2260(jSONObject, C0048.m2145(m850(), 286, 8, 1324));
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            switch (i5) {
                                case 17:
                                    i5 = i4 == 2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    C0003.m116(arrayList, m853(this, jSONObject, i4));
                                    break;
                                case 500:
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
                        i++;
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
                    case 239:
                        return arrayList;
                }
            }
        }
    }

    /* renamed from: سنمذ  reason: contains not printable characters */
    public static short[] m850() {
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
                    return f35short;
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

    /* renamed from: ضغﺩف  reason: contains not printable characters */
    public static String m851(Object obj) {
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
                    return ((LiveGz) obj).yq;
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

    /* renamed from: قﻩذﺯ  reason: contains not printable characters */
    public static void m852(Object obj) {
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

    /* renamed from: لـطﺥ  reason: contains not printable characters */
    public static ME m853(Object obj, Object obj2, int i) {
        int i2 = C0020.m1371();
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
                    return ((LiveGz) obj).SN((JSONObject) obj2, i);
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

    /* renamed from: ﻭـﻍﺯ  reason: contains not printable characters */
    public static List m854(Object obj, Object obj2) {
        int i = C0022.m1429();
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
                    return ((LiveGz) obj).yq((String) obj2);
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
        List list = null;
        String str3 = "۟ۧۦ";
        while (true) {
            switch (C0002.m76(str3)) {
                case 1746817:
                    return str;
                case 1749602:
                    str = C0022.m1435(list);
                    str3 = "ۣ۟ۥ";
                    break;
                default:
                    list = m854(this, str);
                    str3 = "ۢ۠۠";
                    break;
            }
        }
    }

    public String detailContent(List<String> list) {
        int i = 0;
        String[] strArr = C0011.m339((String) C0035.m1801(list, 0), C0055.m2320(m850(), 294, 1, 2397));
        StringBuilder sb = C0052.m2253(C0039.m1937(m850(), 295, 14, 417));
        C0032.m1746(sb, strArr[2]);
        C0032.m1746(sb, C0057.m2384(m850(), 309, 14, 1228));
        C0032.m1746(sb, strArr[1]);
        C0032.m1746(sb, C0025.m1542(m850(), 323, 9, 2898));
        String str = C0032.m1739(sb, strArr[0], C0040.m1953(m850(), 332, 2, 1671));
        String str2 = C0000.m18(m850(), 334, 16, 1566);
        String str3 = C0033.m1764(m850(), 350, 16, 1402);
        String str4 = C0039.m1940(str, str2, str3, 0);
        String str5 = C0032.m1739(new StringBuilder(), m851(this), C0032.m1749(m850(), 366, 29, 1534));
        HashMap hashMap = C0055.m2325(C0042.m2010(m850(), 395, 10, 534), C0052.m2261(m850(), 405, 13, 453), C0007.m210(m850(), 418, 14, 1230), C0033.m1764(m850(), 432, 7, 380));
        HashMap hashMap2 = new HashMap();
        C0042.m1999(hashMap2, C0006.m180(m850(), 439, 9, 2780), str4);
        JSONObject jSONObject = new JSONObject(C0031.m1720(C0022.m1450(new JSONObject(C0052.m2257(C0005.m167(str5, hashMap2, hashMap))), C0030.m1688(m850(), 448, 4, 2314)), str2, str3));
        ME me = m853(this, jSONObject, C0052.m2260(jSONObject, C0039.m1937(m850(), 452, 8, 1952)));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArray = C0033.m1766(jSONObject, C0045.m2098(m850(), 460, 9, 659));
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
                        JSONObject jSONObject2 = C0008.m237(jSONArray, i);
                        C0003.m116(arrayList, C0028.m1632(jSONObject2, C0056.m2339(m850(), 469, 4, 974)));
                        ArrayList arrayList3 = new ArrayList();
                        StringBuilder sb2 = new StringBuilder();
                        i++;
                        C0034.m1785(sb2, i);
                        C0032.m1746(sb2, C0012.m361(m850(), 473, 1, 2728));
                        C0032.m1746(sb2, C0022.m1450(jSONObject2, C0031.m1713(m850(), 474, 4, 398)));
                        C0003.m116(arrayList3, C0043.m2039(sb2));
                        C0003.m116(arrayList2, C0038.m1902(C0039.m1937(m850(), 478, 1, 2768), arrayList3));
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
                        C0039.m1933(me, C0031.m1705());
                        C0044.m2056(me, C0040.m1953(m850(), 479, 11, 2165));
                        String str6 = C0021.m1417(m850(), 490, 3, 1036);
                        C0020.m1375(me, C0038.m1902(str6, arrayList));
                        C0005.m160(me, C0038.m1902(str6, arrayList2));
                        return C0000.m21(me);
                }
            }
        }
    }

    public String homeContent(boolean z) {
        String str = "ۤ۠۟";
        ArrayList arrayList = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        rP rPVar = null;
        String str4 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56381:
                    sArr = m850();
                    str = "ۥۧۢ";
                    break;
                case 1746750:
                    str4 = C0038.m1906(arrayList, list);
                    str = "ۢۡۦ";
                    break;
                case 1746938:
                    sArr = m850();
                    str = "ۤۥۢ";
                    break;
                case 1747900:
                    str4 = C0026.m1551(sArr, 516, 5, 2915);
                    str = "ۨۥۧ";
                    break;
                case 1748613:
                    list = m854(this, str2);
                    str = "۟ۡ۠";
                    break;
                case 1748864:
                    str4 = C0013.m380(sArr, 509, 5, 719);
                    str = "ۢ۟";
                    break;
                case 1749576:
                    C0003.m116(arrayList, rPVar);
                    str = "ۥۥۥ";
                    break;
                case 1749577:
                    str3 = C0051.m2237(sArr, 521, 2, 2128);
                    str = "ۥۡۢ";
                    break;
                case 1749639:
                    return str4;
                case 1750567:
                    rPVar = new rP(str4, str3);
                    str = "ۢ۟ۥ";
                    break;
                case 1750570:
                    C0003.m116(arrayList, rPVar);
                    str = "ۧ۟ۢ";
                    break;
                case 1750627:
                    sArr = m850();
                    str = "ۦۦۢ";
                    break;
                case 1751523:
                    arrayList = new ArrayList();
                    str = "ۦ۠ۧ";
                    break;
                case 1751616:
                    str2 = C0012.m361(sArr, 493, 5, 1617);
                    str = "۟ۧۢ";
                    break;
                case 1751681:
                    str4 = C0026.m1551(sArr, 498, 2, 3184);
                    str = "ۤۧۥ";
                    break;
                case 1751746:
                    rPVar = new rP(str2, str4);
                    str = "ۨۥۢ";
                    break;
                case 1752518:
                    rPVar = new rP(str4, str3);
                    str = "ۦۢۤ";
                    break;
                case 1752645:
                    sArr = m850();
                    str = "ۣ۠ۧ";
                    break;
                case 1752704:
                    str3 = C0032.m1749(sArr, 514, 2, 1275);
                    str = "ۣ۠ۤ";
                    break;
                case 1753453:
                    sArr = m850();
                    str = "ۣۤ۟";
                    break;
                case 1753512:
                    C0003.m116(arrayList, rPVar);
                    str = "ۣۡ۟";
                    break;
                case 1753574:
                    rPVar = new rP(str4, str3);
                    str = "ۣ۠ۧ";
                    break;
                case 1753634:
                    str3 = C0048.m2145(sArr, 506, 3, 1620);
                    str = "ۦۤۤ";
                    break;
                case 1754378:
                    sArr = m850();
                    str = "ۡۧۦ";
                    break;
                case 1754382:
                    str4 = C0000.m18(sArr, 500, 6, 2109);
                    str = "ۣۢۢ";
                    break;
                case 1755525:
                    C0003.m116(arrayList, rPVar);
                    str = "ۣۨۢ";
                    break;
                case 1755530:
                    sArr = m850();
                    str = "ۢ۟ۦ";
                    break;
                default:
                    sArr = m850();
                    str = "ۧ۟ۦ";
                    break;
            }
        }
    }

    public void init(Context context, String str) {
        LiveGz.super.init(context, str);
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
                    this.yq = str;
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = C0031.m1705();
        C0056.m2351(true);
        try {
            JSONObject jSONObject = new JSONObject();
            C0005.m159(jSONObject, C0046.m2123(m850(), 523, 3, 1699), str2);
            C0005.m159(jSONObject, C0039.m1937(m850(), 526, 5, 646), C0020.m1390(m850(), 531, 1, 1299));
            C0005.m159(jSONObject, C0013.m380(m850(), 532, 7, 459), str3);
            return C0011.m335(jSONObject);
        } catch (Exception e) {
            m852(e);
            return str3;
        }
    }

    public String searchContent(String str, boolean z) {
        return C0031.m1705();
    }
}
