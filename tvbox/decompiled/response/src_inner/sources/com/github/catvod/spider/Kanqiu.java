package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0014;
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
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Kanqiu extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f32short = {820, 808, 808, 812, 870, 883, 883, 811, 811, 811, 882, 868, 868, 823, 829, 818, 813, 821, 809, 882, 809, 815, 2475, 2445, 2459, 2444, 2515, 2495, 2457, 2459, 2448, 2442, 1168, 1202, 1191, 1204, 1201, 1201, 1212, 1266, 1256, 1267, 1261, 1277, 1269, 1162, 1204, 1203, 1209, 1202, 1194, 1198, 1277, 1171, 1161, 1277, 1260, 1261, 1267, 1261, 1254, 1277, 1162, 1204, 1203, 1259, 1257, 1254, 1277, 1189, 1259, 1257, 1268, 1277, 1180, 1197, 1197, 1201, 1208, 1162, 1208, 1215, 1174, 1204, 1193, 1266, 1256, 1262, 1258, 1267, 1262, 1259, 1277, 1269, 1174, 1173, 1161, 1168, 1169, 1265, 1277, 1201, 1204, 1206, 1208, 1277, 1178, 1208, 1214, 1206, 1202, 1268, 1277, 1182, 1205, 1199, 1202, 1200, 1208, 1266, 1260, 1257, 1261, 1267, 1261, 1267, 1261, 1267, 1261, 1277, 1166, 1212, 1211, 1212, 1199, 1204, 1266, 1256, 1262, 1258, 1267, 1262, 1259, 2906, 2904, 2893, 2908, 2928, 2909, 2016, 1974, 1483, 1417, 1413, 1424, 1415, 1420, 1483, 1473, 1431, 1483, 1416, 1421, 1426, 1409, 1148, 1086, 1083, 1057, 1062, 1151, 1077, 1056, 1085, 1063, 1058, 1151, 1083, 1062, 1079, 1087, 3081, 3141, 3155, 3145, 3081, 3141, 3155, 3145, 3082, 3159, 3157, 3150, 3146, 3142, 3157, 3166, 3037, 3015, 3024, 3027, 2901, 2825, 2836, 2828, 2901, 2847, 2902, 2837, 2836, 2837, 2846, 2674, 2623, 2611, 2608, 2673, 2596, 2607, 2673, 2669, 1584, 1588, 1598, 2170, 2175, 2154, 2175, 2099, 2157, 2156, 2173, 1609, 1621, 1621, 1617, 1618, 1563, 1550, 1550, 1617, 1608, 1602, 1551, 1608, 1612, 1606, 1605, 1603, 1551, 1602, 1615, 1550, 1608, 1621, 1604, 1612, 1550, 1559, 1556, 1558, 1559, 1558, 1554, 1605, 1559, 1602, 1557, 1556, 1561, 1561, 1556, 1554, 1600, 1604, 1607, 1607, 1560, 1557, 1600, 1603, 1560, 1551, 1611, 1617, 1606, 1703, 1723, 1723, 1727, 688, 764, 746, 752, 688, 764, 746, 752, 691, 762, 763, 760, 767, 747, 754, 746, 699, 679, 682, 690, 1850, 1830, 1852, 1851, 1834, 1836, 2604, 2601, 2620, 2601, 1314, 1319, 1312, 1317, 1341, 2977, 2990, 2978, 2986, 294, 289, 319, 3013, 29228, 24693, -29255, 21681, 28854, 18863, -28792, -24865, 18531, 18613, 18715, 22577, 20996, 1630, 1955, 1186, 2368, 2371, 22969, -26567, 32293, 27772, 32368, 29085, 29546, 24883, -28810, 30406, 29745, 26216, 23512, 17528, 31834, 28163, 2107, 2146, 2161, 2146, 2170, 2144, 2075, 2107, 2146, 2091, 2085, 2105, 2146, 2170, 2144, 2146, 2083, 2081, 2100, 2085, 2057, 2084, 2146, 2156, 2144, 2146, 2094, 2081, 2093, 2085, 2146, 2170, 2144, 2146, 29755, 24523, 2146, 2156, 2144, 2146, 2102, 2081, 2092, 2101, 2085, 2146, 2170, 2144, 2075, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 2062, 2050, 2049, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2161, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 2051, 2050, 2049, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2162, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 29614, 31811, 30396, 23624, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2164, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 30444, 28453, 18195, -30478, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2162, 2161, 2146, 2109, 2077, 2109, 2077, 2156, 2146, 2168, 2146, 2170, 2144, 2075, 2107, 2146, 2091, 2085, 2105, 2146, 2170, 2144, 2146, 2083, 2081, 2100, 2085, 2057, 2084, 2146, 2156, 2144, 2146, 2094, 2081, 2093, 2085, 2146, 2170, 2144, 2146, 29755, 24523, 2146, 2156, 2144, 2146, 2102, 2081, 2092, 2101, 2085, 2146, 2170, 2144, 2075, 2107, 2146, 2094, 2146, 2170, 2144, 2146, -30031, -31291, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2168, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, -32449, 32114, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2169, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 26959, 32114, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2161, 2160, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 25447, 23008, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2161, 2162, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 25447, -30700, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2161, 2163, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 22519, 32114, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2161, 2164, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 25749, 32114, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2161, 2165, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 25447, 24253, -30700, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2161, 2166, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, -31245, 26747, 28463, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2162, 2167, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 24253, 31691, 28463, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2163, 2163, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 18029, -31291, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2167, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 18138, 23008, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2161, 2161, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, -31245, 31811, 30396, 23624, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2162, 2163, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 25447, 23311, -30700, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2162, 2168, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 30670, -30708, -30700, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2162, 2166, 2146, 2109, 2077, 2109, 2077, 2156, 2144, 2146, 2162, 2169, 2146, 2170, 2144, 2075, 2107, 2146, 2091, 2085, 2105, 2146, 2170, 2144, 2146, 2083, 2081, 2100, 2085, 2057, 2084, 2146, 2156, 2144, 2146, 2094, 2081, 2093, 2085, 2146, 2170, 2144, 2146, 29755, 24523, 2146, 2156, 2144, 2146, 2102, 2081, 2092, 2101, 2085, 2146, 2170, 2144, 2075, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 30481, 31811, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2162, 
    2169, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 28143, 25947, 22795, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2163, 2160, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 2061, 2060, 2050, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2163, 2168, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 2069, 2054, 2051, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2163, 2162, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 2062, 2054, 2060, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2162, 2165, 2146, 2109, 2156, 2144, 2107, 2146, 2094, 2146, 2170, 2144, 2146, 2051, 2051, 2068, 2070, 2165, 2146, 2156, 2144, 2146, 2102, 2146, 2170, 2144, 2146, 2161, 2168, 2146, 2109, 2077, 2109, 2077, 2109, 2976, 3050, 3053, 3059, 2978, 2094, 2125, 2055, 2048, 2078, 2127, 1477, 1427, 1438, 1479, 1432, 1427, 1438, 1426, 1433, 1432, 1433, 1454, 1417, 1423, 1501, 1472, 1501, 1498, 1493, 1491, 1495, 1474, 1492, 1498, 1109, 1108, 1093, 1051, 1025, 1038, 1032, 1036, 1049, 1039, 1028, 1146, 1037, 1103, 1090, 1334, 1365, 1283, 1294, 1367, 1158, 3227, 1289, 1290, 1291, 1292, 1293, 1294, 1295, 1280, 1281, 1282, 1283, 1284, 1285, 1286, 1287, 1304, 1305, 1306, 1307, 1308, 1309, 1310, 1311, 1296, 1359, 1352, 1366};
    private static String yq = C0023.m1457(m816(), 0, 22, 860);

    public Kanqiu() {
        int i = C0031.m1699();
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
                    System.out.println(Integer.valueOf(C0009.m273("8CYtY0EZpASD9x5JsCF4r")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private static int[] N(byte[] bArr) {
        int length;
        int length2 = bArr.length;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if ((length2 & 3) != 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    length = bArr.length >>> 2;
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
                    length = (bArr.length >>> 2) + 1;
                    break;
            }
            i = 1678;
        }
        int[] iArr = new int[length];
        int length3 = bArr.length;
        int i3 = 0;
        while (true) {
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        i4 = i3 < length3 ? 48736 : 48705;
                    case 47384:
                        return iArr;
                    case 47417:
                        int i5 = i3 >>> 2;
                        iArr[i5] = iArr[i5] | ((bArr[i3] & 255) << ((i3 & 3) << 3));
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
                    case 47483:
                }
            }
        }
    }

    private static int SN(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        String str = "ۣۣۢ";
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            switch (C0002.m76(str)) {
                case 56293:
                    i8 = i7 ^ i9;
                    str = "ۣۡ۟";
                    break;
                case 56413:
                    i = i8 + i10;
                    str = "۟ۢۨ";
                    break;
                case 1746718:
                    i9 = i3 << 4;
                    str = "۠ۥۥ";
                    break;
                case 1746789:
                    i8 = i ^ i7;
                    str = "ۣۢ۟";
                    break;
                case 1747840:
                    i10 = i7 ^ i9;
                    str = "ۥۣۨ";
                    break;
                case 1748613:
                    i7 = i2 >>> 3;
                    str = "۟۠۟";
                    break;
                case 1749574:
                    return i8;
                case 1750658:
                    i7 = i3 >>> 5;
                    str = "ۦۤۡ";
                    break;
                case 1752586:
                    i7 = i8 + i10;
                    str = "ۡۨ۠";
                    break;
                case 1752617:
                    i9 = i4 & 3;
                    str = "ۧۨۡ";
                    break;
                case 1752676:
                    i6 = iArr[i10];
                    str = "ۨۢۨ";
                    break;
                case 1753571:
                    i9 = i2 << 2;
                    str = "۟ۤ";
                    break;
                case 1754656:
                    i10 = i9 ^ i5;
                    str = "ۥۦۥ";
                    break;
                case 1755438:
                    i10 = i6 ^ i3;
                    str = "ۣ۠";
                    break;
                default:
                    i8 = i ^ i2;
                    str = "ۥۤۨ";
                    break;
            }
        }
    }

    private Map<String, String> yq() {
        String str = "ۣۧ";
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56420:
                    hashMap = new HashMap();
                    str = "ۦۣۨ";
                    break;
                case 1746693:
                    str2 = C0024.m1513(sArr, 22, 10, 2558);
                    str = "ۨۥۣ";
                    break;
                case 1747869:
                    str3 = C0009.m277(sArr, 32, 111, 1245);
                    str = "ۣۦۧ";
                    break;
                case 1750532:
                    return hashMap;
                case 1750756:
                    C0042.m1999(hashMap, str2, str3);
                    str = "ۣ۟۠";
                    break;
                case 1755526:
                    sArr = m816();
                    str = "۠ۦۣ";
                    break;
                default:
                    sArr = m816();
                    str = "۟۟ۥ";
                    break;
            }
        }
    }

    /* renamed from: اكﺥﺕ  reason: contains not printable characters */
    public static Map m815(Object obj) {
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
                    return ((Kanqiu) obj).yq();
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

    /* renamed from: دﺱعا  reason: contains not printable characters */
    public static short[] m816() {
        int i = C0011.m344();
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
                    return f32short;
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

    /* renamed from: غيشـ  reason: contains not printable characters */
    public static int m817(int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = C0010.m301();
        int i7 = 1616;
        while (true) {
            i7 ^= 1633;
            switch (i7) {
                case 14:
                    break;
                case 49:
                    if (i6 <= 0) {
                        break;
                    } else {
                        i7 = 1709;
                        continue;
                    }
                case 204:
                    return SN(i, i2, i3, i4, i5, (int[]) obj);
                case 239:
                    int i8 = 1740;
                    while (true) {
                        i8 ^= 1757;
                        switch (i8) {
                            case 17:
                                i8 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
            }
            i7 = 1678;
        }
    }

    /* renamed from: ﺡخلج  reason: contains not printable characters */
    public static String m818() {
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
                    return yq;
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

    /* renamed from: ﻙقﻉح  reason: contains not printable characters */
    public static int[] m819(Object obj) {
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
                    return N((byte[]) obj);
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
        String str4;
        String str5;
        String str6 = C0039.m1937(m816(), 143, 6, 2873);
        Object obj = C0007.m220(hashMap, str6);
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
                    str = (String) C0007.m220(hashMap, str6);
                    break;
            }
            i = 1678;
        }
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m818());
        boolean z2 = C0054.m2307(str);
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
                    str3 = C0048.m2160(C0022.m1433(m816(), 151, 14, 1508), new Object[]{str});
                    break;
                case 47417:
                    str3 = C0048.m2160(C0052.m2261(m816(), 149, 2, 1989), new Object[]{str});
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
        C0032.m1746(sb, str3);
        kB kBVar = C0014.m434(C0004.m119(C0028.m1633(C0043.m2039(sb), m815(this))), C0029.m1635(m816(), 165, 16, 1106));
        ArrayList arrayList = new ArrayList();
        Iterator it = C0004.m122(kBVar);
        while (true) {
            boolean z3 = C0000.m11(it);
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                    case 53:
                        iX iXVar = new iX();
                        C0042.m2011(iXVar, 1, 1, 0, C0014.m422(kBVar));
                        C0040.m1949(iXVar, arrayList);
                        return C0033.m1763(iXVar);
                    case 503:
                        i5 = z3 ? 49635 : 48953;
                    case 32495:
                        hN hNVar = (hN) C0026.m1556(it);
                        StringBuilder sb2 = new StringBuilder();
                        C0032.m1746(sb2, m818());
                        String str7 = C0028.m1613(m816(), 181, 16, 3111);
                        C0032.m1746(sb2, C0023.m1479(C0014.m434(hNVar, str7), C0025.m1542(m816(), 197, 4, 2997)));
                        String str8 = C0043.m2039(sb2);
                        String str9 = C0032.m1737(C0014.m434(hNVar, C0007.m210(m816(), 201, 11, 2939)));
                        boolean z4 = C0054.m2307(str9);
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    i6 = z4 ? 49759 : 49728;
                                case 50:
                                case 76:
                                    str4 = C0022.m1427(hNVar);
                                    break;
                                case 83:
                                    str4 = str9;
                                    break;
                            }
                        }
                        String str10 = C0023.m1479(C0055.m2329(C0044.m2069(C0014.m434(hNVar, C0001.m35(m816(), 212, 9, 2652)), 0), C0049.m2175(m816(), 221, 3, 1625)), C0027.m1601(m816(), 224, 8, 2078));
                        boolean z5 = C0054.m2307(str10);
                        int i7 = 49790;
                        while (true) {
                            i7 ^= 49807;
                            switch (i7) {
                                case 18:
                                case 51:
                                    break;
                                case 84:
                                    str10 = C0050.m2224(m816(), 232, 54, 1569);
                                    break;
                                case 241:
                                    i7 = z5 ? 49883 : 49852;
                            }
                        }
                        boolean z6 = C0030.m1681(str10, C0001.m35(m816(), 286, 4, 1743));
                        int i8 = 49914;
                        while (true) {
                            i8 ^= 49931;
                            switch (i8) {
                                case 497:
                                    i8 = !z6 ? 50658 : 50627;
                                case 1711:
                                case 1736:
                                    break;
                                case 1769:
                                    str10 = C0032.m1739(new StringBuilder(), m818(), str10);
                                    break;
                            }
                        }
                        String str11 = C0032.m1737(C0014.m434(hNVar, str7));
                        boolean z7 = C0054.m2307(str11);
                        int i9 = 50689;
                        while (true) {
                            i9 ^= 50706;
                            switch (i9) {
                                case 19:
                                    i9 = z7 ? 50782 : 50751;
                                case 45:
                                    str5 = str11;
                                    break;
                                case 50:
                                case 76:
                                    str5 = C0032.m1737(C0014.m434(hNVar, C0009.m277(m816(), 290, 16, 670)));
                                    break;
                            }
                        }
                        C0003.m116(arrayList, new ME(str8, str4, str10, str5));
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
    }

    public String detailContent(List<String> list) {
        String str;
        boolean z = C0022.m1448((String) C0035.m1801(list, 0), m818());
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
                    return C0049.m2186();
                case 239:
                    JSONArray jSONArray = C0010.m316(new JSONObject(new String(C0022.m1420(C0028.m1620(C0028.m1621(C0028.m1632(new JSONObject(C0028.m1633(C0036.m1853((String) C0035.m1801(list, 0), C0055.m2320(m816(), 306, 4, 715), C0010.m296(m816(), 310, 6, 1865)), m815(this))), C0039.m1937(m816(), 316, 4, 2632)), 6), 0, C0046.m2105(str) - 2), 0))), C0020.m1390(m816(), 320, 5, 1358));
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        int i3 = C0035.m1823(jSONArray);
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = i2 < i3 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    ME me = new ME();
                                    C0009.m284(me, (String) C0035.m1801(list, 0));
                                    C0020.m1375(me, C0054.m2301(m816(), 333, 2, 1240));
                                    C0039.m1933(me, C0031.m1705());
                                    C0044.m2056(me, C0011.m328(m816(), 335, 11, 1614));
                                    C0005.m160(me, C0038.m1902(C0032.m1749(m816(), 346, 1, 1661), arrayList));
                                    return C0000.m21(me);
                                case 500:
                                    JSONObject jSONObject = C0036.m1841(jSONArray, i2);
                                    String str2 = C0028.m1632(jSONObject, C0054.m2301(m816(), 325, 4, 3023));
                                    String str3 = C0028.m1632(jSONObject, C0050.m2224(m816(), 329, 3, 339));
                                    StringBuilder sb = new StringBuilder();
                                    C0032.m1746(sb, str2);
                                    C0032.m1746(sb, C0021.m1417(m816(), 332, 1, 3041));
                                    C0032.m1746(sb, str3);
                                    C0003.m116(arrayList, C0043.m2039(sb));
                                    i2++;
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
                    }
                    break;
            }
            i = 1678;
        }
    }

    public String homeContent(boolean z) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        List list = C0031.m1721(new String[]{C0031.m1705(), C0021.m1417(m816(), 347, 1, 1938), C0054.m2301(m816(), 348, 1, 1178), C0022.m1433(m816(), 349, 2, 2418)});
        List list2 = C0031.m1721(new String[]{C0002.m57(m816(), 351, 4, 2257), C0010.m296(m816(), 355, 4, 1438), C0057.m2384(m816(), 359, 4, 709), C0051.m2237(m816(), 363, 4, 2734)});
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
                        return C0000.m9(arrayList, new JSONObject(C0055.m2320(m816(), 367, 767, 2112)));
                }
            }
        }
    }

    public void init(Context context, String str) {
        boolean z = C0054.m2307(str);
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
                    yq = str;
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    public String matcher(String str, String str2) {
        Matcher matcher = C0022.m1425(C0005.m166(str2), str);
        boolean z = C0054.m2303(matcher);
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
                    return C0030.m1678(matcher, 1);
                case 239:
                    return C0031.m1705();
            }
            i = 1678;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0056.m2351(true);
        boolean z = C0037.m1888(str2, C0047.m2133(m816(), 1134, 5, 2975));
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
                    String str3 = C0055.m2312(C0011.m339(str2, C0035.m1833(m816(), 1139, 6, 2162))[1]);
                    iX iXVar = new iX();
                    C0034.m1788(iXVar, str3);
                    C0007.m212(iXVar, m815(this));
                    return C0033.m1763(iXVar);
                case 239:
                    boolean z2 = C0037.m1888(str2, C0048.m2145(m816(), 1145, 4, 1530));
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
                                String str4 = C0028.m1633(str2, m815(this));
                                String str5 = C0044.m2052(m816(), 1149, 20, 1533);
                                String str6 = C0041.m1982(this, str4, str5);
                                boolean z3 = C0029.m1658(str6);
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
                                            String str7 = C0041.m1982(this, str4, C0024.m1513(m816(), 1169, 15, 1062));
                                            boolean z4 = C0029.m1658(str7);
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        str6 = C0041.m1982(this, C0028.m1633(C0048.m2149(C0028.m1620(str2, 0, C0027.m1604(str2, C0055.m2320(m816(), 1190, 1, 3252), 8)), str7, C0011.m339(C0011.m339(str2, C0040.m1953(m816(), 1184, 5, 1386))[1], C0039.m1937(m816(), 1189, 1, 1184))[0]), m815(this)), str5);
                                                        break;
                                                    case 239:
                                                        if (z4) {
                                                            break;
                                                        } else {
                                                            i4 = 48860;
                                                            continue;
                                                        }
                                                }
                                                i4 = 48829;
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                    i3 = 48705;
                                }
                                boolean z5 = C0029.m1658(str6);
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            if (z5) {
                                                break;
                                            } else {
                                                i5 = 49635;
                                                continue;
                                            }
                                        case 32495:
                                            String str8 = C0028.m1632(new JSONObject(C0049.m2200(this, C0022.m1420(str6, 0), C0022.m1433(m816(), 1191, 24, 1352))), C0054.m2301(m816(), 1215, 3, 1338));
                                            iX iXVar2 = new iX();
                                            C0034.m1788(iXVar2, str8);
                                            C0007.m212(iXVar2, m815(this));
                                            return C0033.m1763(iXVar2);
                                    }
                                    i5 = 48953;
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    iX iXVar3 = new iX();
                    C0034.m1788(iXVar3, str2);
                    C0005.m156(iXVar3);
                    C0007.m212(iXVar3, m815(this));
                    return C0033.m1763(iXVar3);
            }
            i = 1678;
        }
    }

    public String xxteaDecrypt(byte[] bArr, String str) {
        int[] iArr;
        String str2;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (bArr == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    int length = bArr.length;
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (length != 0) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                int[] iArr2 = m819(bArr);
                                int[] iArr3 = m819(C0046.m2116(str, C0035.m1808()));
                                int length2 = iArr2.length;
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            int length3 = iArr3.length;
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        iArr = iArr3;
                                                        break;
                                                    case 503:
                                                        if (length3 >= 4) {
                                                            break;
                                                        } else {
                                                            i4 = 49635;
                                                            continue;
                                                        }
                                                    case 32495:
                                                        iArr = new int[4];
                                                        C0025.m1532(iArr3, 0, iArr, 0, iArr3.length);
                                                        break;
                                                }
                                                i4 = 48953;
                                            }
                                            int length4 = iArr2.length - 1;
                                            int i5 = ((52 / (length4 + 1)) + 6) * (-1640531527);
                                            int i6 = iArr2[0];
                                            while (true) {
                                                int i7 = 49666;
                                                while (true) {
                                                    i7 ^= 49683;
                                                    switch (i7) {
                                                        case 17:
                                                            i7 = i5 != 0 ? 49759 : 49728;
                                                        case 50:
                                                        case 76:
                                                            int i8 = (i5 >>> 2) & 3;
                                                            int i9 = length4;
                                                            while (true) {
                                                                int i10 = 49790;
                                                                while (true) {
                                                                    i10 ^= 49807;
                                                                    switch (i10) {
                                                                        case 18:
                                                                        case 51:
                                                                            i6 = iArr2[0] - m817(i5, i6, iArr2[length4], 0, i8, iArr);
                                                                            iArr2[0] = i6;
                                                                            i5 += 1640531527;
                                                                            int i11 = 50689;
                                                                            while (true) {
                                                                                i11 ^= 50706;
                                                                                switch (i11) {
                                                                                    case 19:
                                                                                        i11 = 50720;
                                                                                    case 50:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 84:
                                                                            int i12 = i9 - 1;
                                                                            i6 = iArr2[i9] - m817(i5, i6, iArr2[i12], i9, i8, iArr);
                                                                            iArr2[i9] = i6;
                                                                            int i13 = 49914;
                                                                            while (true) {
                                                                                i13 ^= 49931;
                                                                                switch (i13) {
                                                                                    case 497:
                                                                                        i13 = 50596;
                                                                                    case 1711:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i9 = i12;
                                                                            break;
                                                                        case 241:
                                                                            i10 = i9 > 0 ? 49883 : 49852;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 83:
                                                            int length5 = iArr2.length;
                                                            int i14 = iArr2[iArr2.length - 1];
                                                            int i15 = (length5 << 2) - 4;
                                                            int i16 = 50813;
                                                            while (true) {
                                                                i16 ^= 50830;
                                                                switch (i16) {
                                                                    case 18:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 243:
                                                                        if (i14 < i15 - 3) {
                                                                            break;
                                                                        } else {
                                                                            i16 = 51557;
                                                                            continue;
                                                                        }
                                                                    case 4075:
                                                                        int i17 = 51588;
                                                                        while (true) {
                                                                            i17 ^= 51605;
                                                                            switch (i17) {
                                                                                case 17:
                                                                                    if (i14 <= i15) {
                                                                                        break;
                                                                                    } else {
                                                                                        i17 = 51681;
                                                                                        continue;
                                                                                    }
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    byte[] bArr2 = new byte[i14];
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        int i19 = 51836;
                                                                                        while (true) {
                                                                                            i19 ^= 51853;
                                                                                            switch (i19) {
                                                                                                case 241:
                                                                                                    i19 = i18 < i14 ? 52580 : 52549;
                                                                                                case 1963:
                                                                                                case 1992:
                                                                                                    str2 = new String(bArr2, C0035.m1808());
                                                                                                    break;
                                                                                                case 2025:
                                                                                                    bArr2[i18] = (byte) (iArr2[i18 >>> 2] >>> ((i18 & 3) << 3));
                                                                                                    i18++;
                                                                                                    int i20 = 52611;
                                                                                                    while (true) {
                                                                                                        i20 ^= 52628;
                                                                                                        switch (i20) {
                                                                                                            case 23:
                                                                                                                i20 = 52642;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 116:
                                                                                    int i21 = 51712;
                                                                                    while (true) {
                                                                                        i21 ^= 51729;
                                                                                        switch (i21) {
                                                                                            case 14:
                                                                                                str2 = null;
                                                                                                break;
                                                                                            case 17:
                                                                                                i21 = 51743;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            i17 = 51650;
                                                                        }
                                                                        break;
                                                                }
                                                                i16 = 50875;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 76:
                                            return null;
                                        case 239:
                                            if (length2 >= 2) {
                                                break;
                                            } else {
                                                i3 = 48860;
                                                continue;
                                            }
                                    }
                                    i3 = 48829;
                                }
                                break;
                            case 500:
                                int i22 = 1864;
                                while (true) {
                                    i22 ^= 1881;
                                    switch (i22) {
                                        case 17:
                                            i22 = 48674;
                                            break;
                                        case 47483:
                                            str2 = null;
                                            break;
                                    }
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
        str2 = null;
        return str2;
    }
}
