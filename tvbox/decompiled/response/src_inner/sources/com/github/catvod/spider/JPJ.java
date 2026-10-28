package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
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
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0170rC;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.gE;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.lm;
import com.github.catvod.spider.merge.rP;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class JPJ extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f30short = {1497, 1477, 1477, 1473, 1474, 1419, 1438, 1438, 1492, 1479, 1412, 1410, 1412, 1415, 1439, 1416, 1414, 1409, 1481, 1478, 1439, 1490, 1502, 1500, 1105, 1143, 1121, 1142, 1065, 1093, 1123, 1121, 1130, 1136, 1254, 1220, 1233, 1218, 1223, 1223, 1226, 1156, 1182, 1157, 1179, 1163, 1155, 1255, 1218, 1221, 1246, 1235, 1168, 1163, 1258, 1221, 1231, 1241, 1220, 1218, 1231, 1163, 1170, 1168, 1163, 1277, 1177, 1178, 1170, 1181, 1258, 1163, 1257, 1246, 1218, 1223, 1231, 1156, 1275, 1274, 1176, 1258, 1157, 1178, 1170, 1179, 1180, 1179, 1182, 1157, 1179, 1171, 1177, 1178, 1178, 1171, 1179, 1170, 1168, 1163, 1244, 1245, 1154, 1163, 1258, 1243, 1243, 1223, 1230, 1276, 1230, 1225, 1248, 1218, 1247, 1156, 1182, 1176, 1180, 1157, 1176, 1181, 1163, 1155, 1248, 1251, 1279, 1254, 1255, 1159, 1163, 1223, 1218, 1216, 1230, 1163, 1260, 1230, 1224, 1216, 1220, 1154, 1163, 1277, 1230, 1241, 1240, 1218, 1220, 1221, 1156, 1183, 1157, 1179, 1163, 1256, 1219, 1241, 1220, 1222, 1230, 1156, 1170, 1178, 1157, 1179, 1157, 1183, 1183, 1180, 1177, 1157, 1178, 1178, 1183, 1163, 1254, 1220, 1225, 1218, 1223, 1230, 1163, 1272, 1226, 1229, 1226, 1241, 1218, 1156, 1182, 1176, 1180, 1157, 1176, 1181, 1168, 1244, 1230, 1225, 1226, 1221, 1216, 1156, 1219, 1182, 1229, 1226, 1224, 1230, 1168, 1244, 1230, 1225, 1226, 1221, 1216, 1156, 1178, 1157, 1179, 1168, 1221, 1230, 1247, 1279, 1234, 1243, 1230, 1169, 1253, 1262, 1279, 1276, 1252, 1273, 1248, 1268, 1276, 1250, 1261, 1250, 1168, 1226, 1243, 1243, 1277, 1230, 1241, 1240, 1218, 1220, 1221, 1169, 1183, 1178, 1181, 1168, 1243, 1226, 1224, 1216, 1226, 1228, 1230, 1253, 1226, 1222, 1230, 1169, 1224, 1220, 1222, 1157, 1217, 1243, 1176, 1157, 1235, 1228, 1176, 1969, 1926, 1925, 1926, 1937, 1926, 1937, 638, 554, 545, 566, 556, 987, 2320, 2325, 2154, 2154, 650, 650, 650, 454, 469, 450, 454, 1871, 926, 898, 902, 917, 818, 809, 1825, 1828, 1840, 1845, 1824, 1845, 1733, 1675, 1690, 1667, 1733, 1673, 1688, 1695, 1671, 1672, 1733, 1670, 1667, 1689, 1694, 1749, 1676, 1673, 1675, 1694, 1679, 1717, 1690, 1667, 1678, 1751, 1743, 1689, 1740, 1675, 1688, 1679, 1675, 1751, 1743, 1689, 1740, 1683, 1679, 1675, 1688, 1751, 1743, 1689, 1740, 1694, 1683, 1690, 1679, 1751, 1754, 1740, 1689, 1669, 1688, 1694, 1751, 1743, 1689, 1740, 1690, 1675, 1677, 1679, 1751, 1743, 1689, 1740, 1673, 1675, 1694, 1679, 1677, 1669, 1688, 1683, 1717, 1667, 1678, 1751, 1462, 1528, 1513, 1520, 1462, 1533, 1504, 1485, 1528, 1534, 1462, 1525, 1520, 1514, 1517, 1446, 1530, 1528, 1517, 1532, 1534, 1526, 1515, 1504, 1478, 1520, 1533, 1444, 1468, 1514, 1471, 1513, 1528, 1534, 1532, 1444, 1468, 1514, 1364, 1306, 1291, 1298, 1364, 1293, 1298, 1311, 1310, 1300, 1364, 1311, 1310, 1295, 1306, 1298, 1303, 1293, 1353, 1348, 1298, 1311, 1350, 17338, 30874, 27200, -30473, 2563, 590, 2717, 934, 1208, 1213, 532, 532, 28884, 23184, 32748, -31969, 22718, 21521, 27026, 30713, -29825, 31524, 23259, 30665, 1670, 1709, 1724, 1710, 1700, 1697, 1712, 2136, 2142, 962, 908, 925, 900, 962, 926, 897, 900, 905, 904, 962, 897, 900, 926, 921, 978, 925, 898, 926, 946, 900, 905, 976, 981, 981, 3109, 3129, 3129, 3133, 3134, 3191, 3170, 3170, 3113, 3107, 3134, 3171, 3116, 3105, 3108, 3113, 3107, 3134, 3171, 3118, 3106, 3104, 3170, 3135, 3112, 3134, 3106, 3105, 3131, 3112, 3186, 3107, 3116, 3104, 3112, 3184, 3134, 3130, 3135, 3113, 3134, 3115, 3112, 3108, 3128, 3111, 3106, 3199, 3192, 3134, 3130, 3171, 3118, 3118, 3179, 3129, 3124, 3133, 3112, 3184, 3097, 3093, 3097, 557, 514, 543, 539, 521, 542, 905, 908, 921, 908, 1044, 352, 978, 974, 974, 970, 969, 896, 917, 917, 988, 987, 980, 907, 904, 905, 916, 992, 942, 959, 934, 992, 953, 1021, 992, 956, 938, 955, 955, 934, 929, 936, 956, 992, 957, 938, 956, 928, 954, 957, 940, 938, 907, 928, 930, 942, 934, 929, 908, 928, 929, 937, 934, 936, 1223, 1219, 1225, 1258, 1217, 1219, 1231, 1223, 1216, 1585, 1581, 1581, 1577, 1578, 1635, 1654, 1654, 2010, 1990, 1990, 1986, 1928, 1949, 1949, 2220, 2290, 2228, 2297, 1466, 1524, 1509, 1532, 1466, 1507, 1447, 1466, 1510, 1520, 1524, 1511, 1526, 1533, 1466, 1507, 1532, 1521, 1520, 1530, 1475, 1447, 1450, 1534, 1520, 1516, 1448, 1456, 1510, 1459, 1526, 1524, 1505, 1520, 1522, 1530, 1511, 1516, 1482, 1532, 1521, 1448, 1453, 1453, 1459, 1509, 1524, 1522, 1520, 1448, 1456, 1510, 1459, 1509, 1524, 1522, 1520, 1478, 1532, 1519, 1520, 1448, 1447, 1445, 1853};
    private String SN;
    private String yq = C0049.m2175(m799(), 0, 24, 1457);

    public JPJ() {
        int i = C0023.m1475();
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
                    System.out.println(Long.parseLong(C0043.m2024("RmrMLBkKyEIvJfbvZJ4UrAKFiKE")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private Map<String, String> yq() {
        String str = "ۥ۠ۡ";
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56355:
                    str3 = m797(this);
                    str = "ۦۣۨ";
                    break;
                case 1746820:
                    C0042.m1999(hashMap, str3, str2);
                    str = "ۡۤ";
                    break;
                case 1748614:
                    sArr = m799();
                    str = "ۥۡ۟";
                    break;
                case 1749757:
                    str3 = C0030.m1688(sArr, 24, 10, 1028);
                    str = "ۡ۟ۤ";
                    break;
                case 1751558:
                    str2 = C0000.m18(sArr, 281, 7, 2019);
                    str = "ۧ۠ۡ";
                    break;
                case 1752486:
                    hashMap = new HashMap();
                    str = "ۨ۠۠";
                    break;
                case 1752515:
                    str2 = C0026.m1551(sArr, 34, 247, 1195);
                    str = "ۣ۟ۨ";
                    break;
                case 1753697:
                    sArr = m799();
                    str = "ۣۤۡ";
                    break;
                case 1754408:
                    C0042.m1999(hashMap, str2, str3);
                    str = "ۧۢۦ";
                    break;
                case 1755368:
                    sArr = m799();
                    str = "ۢۥ۠";
                    break;
                default:
                    return hashMap;
            }
        }
    }

    /* renamed from: ثضلﻍ  reason: contains not printable characters */
    public static JsonElement m793(Object obj, Object obj2) {
        int i = C0038.m1893();
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
                    return ((JsonObject) obj).get((String) obj2);
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

    /* renamed from: دﻁﺕش  reason: contains not printable characters */
    public static Request.Builder m794(Object obj, Object obj2) {
        int i = C0057.m2368();
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

    /* renamed from: زصغق  reason: contains not printable characters */
    public static OkHttpClient m795() {
        int i = C0045.m2093();
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
                    return V3.SN();
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

    /* renamed from: زوذر  reason: contains not printable characters */
    public static JsonObject m796(Object obj, Object obj2) {
        int i = C0010.m301();
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
                    return ((JsonObject) obj).getAsJsonObject((String) obj2);
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

    /* renamed from: شـضﻝ  reason: contains not printable characters */
    public static String m797(Object obj) {
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
                    return ((JPJ) obj).yq;
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

    /* renamed from: شﺫظت  reason: contains not printable characters */
    public static JsonElement m798(Object obj, int i) {
        int i2 = C0023.m1475();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 <= 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return ((JsonArray) obj).get(i);
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

    /* renamed from: طغفه  reason: contains not printable characters */
    public static short[] m799() {
        int i = C0024.m1502();
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
                    return f30short;
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

    /* renamed from: ظﻡﻍﺫ  reason: contains not printable characters */
    public static String m800(Object obj) {
        int i = C0047.m2134();
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
                    return ((JPJ) obj).SN;
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

    /* renamed from: عروس  reason: contains not printable characters */
    public static Response m801(Object obj) {
        int i = C0020.m1371();
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

    /* renamed from: ـيشخ  reason: contains not printable characters */
    public static int m802(Object obj) {
        int i = C0000.m13();
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

    /* renamed from: فﺩمﻭ  reason: contains not printable characters */
    public static JsonObject m803(Object obj) {
        int i = C0036.m1838();
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
                    return ((JsonElement) obj).getAsJsonObject();
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

    /* renamed from: مﻙبز  reason: contains not printable characters */
    public static JsonArray m804(Object obj, Object obj2) {
        int i = C0026.m1561();
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
                    return ((JsonObject) obj).getAsJsonArray((String) obj2);
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

    /* renamed from: وهﺝد  reason: contains not printable characters */
    public static String m805(Object obj) {
        int i = C0030.m1683();
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
                    return ((JsonElement) obj).getAsString();
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

    /* renamed from: ﺕيﺱت  reason: contains not printable characters */
    public static Request.Builder m806(Object obj) {
        int i = C0013.m382();
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
                    return ((Request.Builder) obj).head();
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

    /* renamed from: ﺫزنﺎ  reason: contains not printable characters */
    public static Object m807(Object obj, Object obj2, Object obj3) {
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
                    return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
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

    /* renamed from: ﺫكﻱط  reason: contains not printable characters */
    public static Map m808(Object obj) {
        int i = C0020.m1371();
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
                    return ((JPJ) obj).yq();
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

    /* renamed from: ﻉثﺭﺽ  reason: contains not printable characters */
    public static Call m809(Object obj, Object obj2) {
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

    /* renamed from: ﻭسشص  reason: contains not printable characters */
    public static Request m810(Object obj) {
        int i = C0003.m81();
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 310
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String categoryContent(java.lang.String r10, java.lang.String r11, boolean r12, java.util.HashMap<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.JPJ.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m797(this));
        C0032.m1746(sb, C0025.m1542(m799(), 436, 23, 1403));
        C0032.m1746(sb, (String) C0035.m1801(list, 0));
        lm lmVar = C0049.m2199((C0170rC) C0030.m1682(C0028.m1633(C0043.m2039(sb), m808(this)), C0170rC.class));
        String str = C0025.m1545(C0020.m1369(lmVar));
        boolean z = C0037.m1888(str, C0010.m296(m799(), 459, 2, 3228));
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
                    boolean z2 = C0037.m1888(str, C0036.m1850(m799(), 461, 2, 2693));
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
                                ME me = C0004.m123(lmVar, m800(this));
                                C0020.m1375(me, C0006.m197(lmVar));
                                C0003.m94(me, C0029.m1638(lmVar));
                                C0011.m343(me, C0001.m52(lmVar));
                                C0039.m1933(me, C0020.m1369(lmVar));
                                C0055.m2330(me, C0045.m2082(lmVar));
                                C0005.m160(me, C0046.m2129(lmVar));
                                C0043.m2035(me, C0015.m449(lmVar));
                                C0044.m2056(me, C0007.m209(lmVar));
                                return C0000.m21(me);
                            case 500:
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
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        return C0000.m21(new ME());
    }

    public String homeContent(boolean z) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        List list = C0031.m1721(new String[]{C0004.m130(m799(), 463, 1, 2610), C0005.m169(m799(), 464, 1, 636), C0020.m1390(m799(), 465, 1, 2734), C0046.m2123(m799(), 466, 1, 914), C0028.m1613(m799(), 467, 2, 1165), C0051.m2237(m799(), 469, 2, 557)});
        List list2 = C0031.m1721(new String[]{C0005.m169(m799(), 471, 2, 1505), C0044.m2052(m799(), 473, 3, 2777), C0037.m1882(m799(), 476, 2, 1721), C0052.m2261(m799(), 478, 2, 2309), C0052.m2261(m799(), 480, 3, 1422), C0003.m86(m799(), 483, 7, 1736)});
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
                        return C0000.m9(arrayList, new JSONObject(C0037.m1882(m799(), 490, 2, 2083)));
                }
            }
        }
    }

    public String homeVideoContent() {
        ArrayList arrayList = new ArrayList();
        Iterator it = C0014.m435(C0035.m1830(C0001.m44(C0028.m1633(C0032.m1739(new StringBuilder(), m797(this), C0047.m2133(m799(), 492, 25, 1005)), m808(this)))));
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
                        C0003.m116(arrayList, C0045.m2086((lm) C0026.m1556(it), m800(this)));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
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

    /* JADX WARN: Code restructure failed: missing block: B:31:0x013c, code lost:
        r2 = r2 + 1;
        r2 = 52611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0141, code lost:
        r2 = r2 ^ 52628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0145, code lost:
        switch(r2) {
            case 23: goto L163;
            case 54: goto L164;
            default: goto L166;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
        r2 = 52642;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.JPJ.init(android.content.Context, java.lang.String):void");
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0029.m1662();
        C0056.m2351(true);
        boolean z = C0037.m1888(str2, C0049.m2175(m799(), 668, 4, 2241));
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
                    str2 = C0009.m279(str2);
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        iX iXVar = new iX();
        C0034.m1788(iXVar, str2);
        C0007.m212(iXVar, m808(this));
        return C0033.m1763(iXVar);
    }

    public String searchContent(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m797(this));
        C0032.m1746(sb, C0048.m2160(C0006.m180(m799(), 672, 64, 1429), new Object[]{C0010.m314(str), str2}));
        Iterator it = C0014.m435(C0029.m1654((gE) C0030.m1682(C0028.m1633(C0043.m2039(sb), m808(this)), gE.class)));
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
                        gE gEVar = (gE) C0026.m1556(it);
                        boolean z2 = C0010.m289(C0022.m1439(gEVar));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = z2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    C0003.m116(arrayList, C0025.m1543(gEVar, m800(this)));
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

    public String searchContent(String str, boolean z) {
        String str2 = "ۦۦ۠";
        short[] sArr = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch (C0002.m76(str2)) {
                case 1748865:
                    return str4;
                case 1749606:
                    str3 = C0015.m457(sArr, 736, 1, 1804);
                    str2 = "ۨ۟ۧ";
                    break;
                case 1755344:
                    str4 = C0035.m1827(this, str, str3);
                    str2 = "ۡۧۧ";
                    break;
                default:
                    sArr = m799();
                    str2 = "ۢ۠ۤ";
                    break;
            }
        }
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0035.m1827(this, str, str2);
    }
}
