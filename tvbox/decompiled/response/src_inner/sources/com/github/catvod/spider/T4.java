package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
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
import com.github.catvod.spider.merge.C0040;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class T4 extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f50short = {1252, 1251, 1257, 1256, 1269, 1187, 1277, 1253, 1277, 1186, 1275, 1250, 1257, 1186, 1278, 1256, 1260, 1279, 1262, 1253, 1186, 1277, 1260, 1258, 1256, 1186, 1192, 1278, 1186, 1274, 1257, 1186, 1192, 1278, 1187, 1253, 1273, 1248, 1249, 1331, 1317, 1313, 1330, 1315, 1320, -26529, -30446, 31442, -26678, -30404, 1489, 1501, 1494, 1495, 409, 414, 404, 405, 392, 478, 384, 408, 384, 479, 390, 405, 386, 409, 406, 393, 1926, 1930, 1930, 1934, 1932, 1920, 2183, 2196, 2179, 2200, 2199, 2184, 2676, 2681, 2672, 2661, 985, 908, 979, 964, 976, 980, 964, 978, 981, 964, 965, 908, 982, 968, 981, 969, 663, 642, 643, 647, 699, 699, 703, 669, 682, 702, 698, 682, 700, 699, 2164, 2115, 2112, 2115, 2132, 2115, 2132, 1090, 1093, 1103, 1102, 1107, 1029, 1115, 1091, 1115, 1028, 1098, 1089, 1098, 1107, 1028, 1117, 1102, 1113, 1090, 1101, 1106, 1140, 1096, 1091, 1102, 1096, 1088, 1044, 1119, 1106, 1115, 1102, 1046, 1112, 1102, 1098, 1113, 1096, 1091, 1037, 1117, 1102, 1113, 1090, 1101, 1106, 1046, 32740, 32192, 22678, 21111, -26221, -30498, 1582, 1544, 1566, 1545, 1622, 1594, 1564, 1566, 1557, 1551, 2952, 2980, 2980, 2976, 2978, 2990, 2901, 2896, 2890, 2893, 1055, 1053, 2596, 2597, 2612, 2593, 2601, 2604, 1542, 1644, 1659, 1064, 1073, 1082, 1025, 1072, 1087, 1075, 1083, 655, 662, 669, 678, 666, 661, 664, 650, 650, 17258, 30794, 3178, 16965, 29419, 3178, 30147, 24165, 3178, -29122, 27785, 3178, 24324, 21840, 3178, 17000, 27755, 631, 614, 608, 610, 2083, 2098, 2100, 2102, 2096, 2108, 2086, 2109, 2087, 2139, 2142, 2138, 2142, 2115, 2515, 2504, 2515, 2502, 2507, 1853, 1828, 1839, 1812, 1832, 1828, 1829, 1855, 1838, 1829, 1855, 1698, 1696, 1495, 1494, 1479, 1490, 1498, 1503, 1197, 1184, 1207, 2623, 2618, 2592, 2599, 3315, 3306, 3297, 3290, 3303, 3305, 3312, 3319, 3303, 2601, 2598, 2603, 2617, 2617, 1107, 1110, 1100, 1099, 1060, 1067, 1070, 1078, 1063, 1072, 2629, 2627, 2628, 2644, 963, 974, 967, 978, 1000, 985, 982, 986, 978, 18831, 29359, 19796, 32250, 29410, 22852, -31277, 26468, 21647, 24283, 18542, 26221, 423, 421, 2255, 2254, 2271, 2250, 2242, 2247, 546, 571, 560, 523, 570, 565, 569, 561, 2668, 2677, 2686, 2629, 2681, 2678, 2683, 2665, 2665, 19179, 29131, 1515, 19396, 31594, 1515, 31810, 22500, 1515, -30785, 25864, 1515, 22149, 23761, 1515, 19433, 26090, 2391, 2369, 2373, 2390, 2375, 2380, 2409, 2379, 2368, 2369, 620, 627, 605, 639, 618, 635, 633, 625, 620, 631, 635, 621, 2307, 2305, 2324, 2309, 2311, 2319, 2322, 2313, 2309, 2323, 837, 857, 852, 844, 864, 839, 857, 2358, 2363, 2354, 2343, 2743, 571, 567, 557, 560, 545, 529, 566, 552, 1184, 1205, 1205, 2792, 578, 513, 607, 537, 596, 536, 541, 530, 529, 541, 535, 521, 2765, 2762, 2772, 2371, 2399, 2386, 2378, 1477, 1487, 1474, 1476, 2127, 2142, 2125, 2124, 2138, 2500, 1342, 1314, 1314, 1318, 938, 947, 952, 899, 946, 957, 945, 953, 3144, 3149, 3159, 3152, 2250, 2248, 1213, 1212, 1197, 1208, 1200, 1205, 2858, 2873, 1615, 1624, 1330, 1323, 1312, 1307, 1319, 1320, 1317, 1335, 1335, 18720, 29184, 1568, 18447, 30881, 1568, 32649, 21551, 1568, -31628, 26307, 1568, 21838, 24346, 1568, 18466, 26145, 1191, 1214, 1205, 1166, 1215, 1200, 1212, 1204, 1208, 1213, 1191, 1184, 31320, 30844, 23850, 22475, -25553, -29342, 3066, 3066, 2996, 2958, 2998, 3002, 3003, 2977, 2996, 3004, 3003, 2982, 3069, 2965, 3005, 2983, 2992, 2995, 3065, 3061, 3058, 3004, 3003, 2993, 2992, 2989, 3067, 2981, 3005, 2981, 3066, 2979, 3002, 2993, 3066, 2993, 2992, 2977, 2996, 3004, 3001, 3058, 3068, 2952, 2495, 2478, 2483, 2495, 2531, 2530, 873, 833, 859, 844, 847, 3235, 3246, 3301, 3298, 3300, 3296, 3317, 3299, 3300, 3234, 3262, 3239, 3238, 410, 408, 2912, 2913, 2928, 2917, 2925, 2920, 663, 666, 653, 2598, 769, 792, 787, 808, 788, 795, 790, 772, 772, 19082, 29098, 1418, 19365, 31499, 1418, 31779, 22405, 1418, -30754, 25961, 1418, 22244, 23728, 1418, 19336, 25995};
    private List<String> N;
    private String SN;
    private String t0;
    private List<String> tF;
    private String yq;
    private String zH;
    private String i = C0005.m169(m970(), 0, 39, 1165);
    private int Gc = 4;

    public T4() {
        String str = C0031.m1705();
        this.yq = str;
        this.SN = str;
        this.zH = str;
        int i = C0038.m1893();
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
                    System.out.println(Long.valueOf(C0035.m1803("yYFc6VM8rqQUq5L")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private String N(String str, Boolean bool, HashMap hashMap) {
        String str2;
        String str3 = C0002.m57(m970(), 39, 6, 1344);
        String str4 = C0057.m2384(m970(), 45, 5, 723);
        String str5 = C0015.m457(m970(), 50, 4, 1458);
        String str6 = C0031.m1705();
        try {
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, m971(this));
            C0032.m1746(sb, C0056.m2339(m970(), 54, 16, 496));
            JSONObject jSONObject = C0052.m2263(C0043.m2039(sb), hashMap);
            String str7 = C0022.m1450(jSONObject, C0004.m130(m970(), 70, 6, 2021));
            int i = C0046.m2105(C0022.m1450(jSONObject, str5));
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (i >= 4) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        boolean z = C0056.m2335(bool);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (!z) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    m978(this, str, C0021.m1418(), hashMap);
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            String str8 = C0022.m1450(jSONObject, str5);
            HashMap hashMap2 = new HashMap();
            C0042.m1999(hashMap2, C0043.m2020(m970(), 76, 6, 2289), str8);
            C0042.m1999(hashMap2, C0035.m1833(m970(), 82, 4, 2560), str3);
            HashMap hashMap3 = m976(this, str7);
            C0042.m1999(hashMap3, C0013.m380(m970(), 86, 16, 929), C0038.m1903(m970(), 102, 14, 719));
            C0042.m1999(hashMap3, C0049.m2175(m970(), 116, 7, 2086), str);
            StringBuilder sb2 = new StringBuilder();
            C0032.m1746(sb2, m971(this));
            C0032.m1746(sb2, C0044.m2052(m970(), 123, 47, 1067));
            C0032.m1746(sb2, str8);
            String str9 = C0035.m1824(C0043.m2039(sb2), hashMap2, hashMap3);
            boolean z2 = C0037.m1888(str9, str4);
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        if (!z2) {
                            break;
                        } else {
                            i4 = 48736;
                            continue;
                        }
                    case 47384:
                        break;
                    case 47417:
                        boolean z3 = C0056.m2335(bool);
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    C0029.m1640(4000L);
                                    m978(this, str, C0021.m1418(), hashMap);
                                    break;
                                case 239:
                                    if (!z3) {
                                        break;
                                    } else {
                                        i5 = 48860;
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                            i5 = 48829;
                        }
                    case 47483:
                        break;
                    default:
                        continue;
                }
                i4 = 48705;
            }
            boolean z4 = C0037.m1888(str9, str4);
            int i6 = 48891;
            while (true) {
                i6 ^= 48908;
                switch (i6) {
                    case 22:
                        break;
                    case 53:
                        String str10 = C0011.m353(str, m976(this, str7), 0);
                        boolean z5 = C0037.m1888(str10, C0032.m1749(m970(), 170, 6, 799));
                        int i7 = 49666;
                        while (true) {
                            i7 ^= 49683;
                            switch (i7) {
                                case 17:
                                    if (!z5) {
                                        break;
                                    } else {
                                        i7 = 49759;
                                        continue;
                                    }
                                case 50:
                                    break;
                                case 76:
                                    return str6;
                                case 83:
                                    boolean z6 = C0020.m1370(str7);
                                    int i8 = 49790;
                                    while (true) {
                                        i8 ^= 49807;
                                        switch (i8) {
                                            case 18:
                                                break;
                                            case 51:
                                                str2 = str7;
                                                break;
                                            case 84:
                                                str2 = m975(this);
                                                int i9 = 49914;
                                                while (true) {
                                                    i9 ^= 49931;
                                                    switch (i9) {
                                                        case 497:
                                                            i9 = 50596;
                                                            break;
                                                        case 1711:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 241:
                                                if (!z6) {
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
                                    this.zH = str2;
                                    String str11 = m971(this);
                                    boolean z7 = C0020.m1370(str7);
                                    int i10 = 50689;
                                    while (true) {
                                        i10 ^= 50706;
                                        switch (i10) {
                                            case 19:
                                                if (!z7) {
                                                    break;
                                                } else {
                                                    i10 = 50782;
                                                    continue;
                                                }
                                            case 45:
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                str7 = m975(this);
                                                break;
                                            default:
                                                continue;
                                        }
                                        i10 = 50751;
                                    }
                                    C0002.m78(str11, str7);
                                    return str10;
                                default:
                                    continue;
                            }
                            i7 = 49728;
                        }
                        break;
                    case 503:
                        if (!z4) {
                            break;
                        } else {
                            i6 = 49635;
                            continue;
                        }
                    case 32495:
                        return str6;
                    default:
                        continue;
                }
                i6 = 48953;
            }
        } catch (Exception e) {
            C0043.m2037(C0003.m108(), e);
            return str6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        r0 = r0 ^ 1757;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
        switch(r0) {
            case 17: goto L34;
            case 54: goto L35;
            default: goto L37;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
        r0 = 1771;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        com.github.catvod.spider.C0042.m1999(r1, r3, r7);
        r0 = 1740;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashMap<java.lang.String, java.lang.String> SN(java.lang.String r7) {
        /*
            r6 = this;
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = com.github.catvod.spider.merge.C0030.m1684()
            short[] r2 = m970()
            r3 = 176(0xb0, float:2.47E-43)
            r4 = 10
            r5 = 1659(0x67b, float:2.325E-42)
            java.lang.String r2 = com.github.catvod.parser.C0004.m130(r2, r3, r4, r5)
            com.github.catvod.spider.C0042.m1999(r1, r2, r0)
            java.lang.String r0 = m975(r6)
            boolean r2 = com.github.catvod.spider.merge.C0020.m1370(r0)
            short[] r0 = m970()
            r3 = 186(0xba, float:2.6E-43)
            r4 = 6
            r5 = 3019(0xbcb, float:4.23E-42)
            java.lang.String r3 = com.github.catvod.spider.C0048.m2145(r0, r3, r4, r5)
            r0 = 1616(0x650, float:2.264E-42)
        L31:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L37;
                case 49: goto L3a;
                case 204: goto L3f;
                case 239: goto L51;
                default: goto L36;
            }
        L36:
            goto L31
        L37:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L31
        L3a:
            if (r2 != 0) goto L37
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L31
        L3f:
            java.lang.String r7 = m975(r6)
        L43:
            com.github.catvod.spider.C0042.m1999(r1, r3, r7)
            r0 = 1740(0x6cc, float:2.438E-42)
        L48:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L4e;
                case 54: goto L76;
                default: goto L4d;
            }
        L4d:
            goto L48
        L4e:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L48
        L51:
            boolean r2 = com.github.catvod.spider.merge.C0020.m1370(r7)
            r0 = 1864(0x748, float:2.612E-42)
        L57:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L5d;
                case 47384: goto L76;
                case 47417: goto L67;
                case 47483: goto L63;
                default: goto L5c;
            }
        L5c:
            goto L57
        L5d:
            if (r2 != 0) goto L63
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L57
        L63:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L57
        L67:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L6a:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L43;
                case 239: goto L72;
                default: goto L71;
            }
        L71:
            goto L6a
        L72:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L6a
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.T4.SN(java.lang.String):java.util.HashMap");
    }

    private HashMap<String, String> yq() {
        return m976(this, C0031.m1705());
    }

    /* renamed from: زﻉسﺥ  reason: contains not printable characters */
    public static String m967(Object obj) {
        int i = C0051.m2229();
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
                    return ((T4) obj).t0;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: سﻁﻅخ  reason: contains not printable characters */
    public static ArrayList m968(Object obj) {
        int i = C0015.m447();
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
                    return ((T4) obj).N;
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

    /* renamed from: كوﻙﺥ  reason: contains not printable characters */
    public static String m969(Object obj) {
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
                    return ((T4) obj).yq;
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

    /* renamed from: مﺱثغ  reason: contains not printable characters */
    public static short[] m970() {
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
                    return f50short;
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

    /* renamed from: يﻉغﻭ  reason: contains not printable characters */
    public static String m971(Object obj) {
        int i = C0054.m2295();
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
                    return ((T4) obj).SN;
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

    /* renamed from: ﺥﻕﻁﺝ  reason: contains not printable characters */
    public static String m972(Object obj) {
        int i = C0041.m1981();
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
                    return ((T4) obj).i;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: ﺭنيو  reason: contains not printable characters */
    public static ArrayList m973(Object obj) {
        int i = C0054.m2295();
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
                    return ((T4) obj).tF;
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

    /* renamed from: ﺭﺱﺡﺏ  reason: contains not printable characters */
    public static void m974(Object obj) {
        int i = C0004.m129();
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

    /* renamed from: ﺱحطع  reason: contains not printable characters */
    public static String m975(Object obj) {
        int i = C0029.m1639();
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
                    return ((T4) obj).zH;
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

    /* renamed from: ﺵﺡحﻉ  reason: contains not printable characters */
    public static HashMap m976(Object obj, Object obj2) {
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
                    return ((T4) obj).SN((String) obj2);
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

    /* renamed from: ﻕذﺹص  reason: contains not printable characters */
    public static int m977(Object obj) {
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
                    return ((T4) obj).Gc;
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

    /* renamed from: ﻝقﺱﺎ  reason: contains not printable characters */
    public static String m978(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = C0028.m1612();
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
                    return ((T4) obj).N((String) obj2, (Boolean) obj3, (HashMap) obj4);
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

    /* renamed from: ﻩﻅقل  reason: contains not printable characters */
    public static HashMap m979(Object obj) {
        int i = C0048.m2140();
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
                    return ((T4) obj).yq();
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
        String str3 = C0044.m2052(m970(), 192, 4, 2873);
        try {
            HashMap hashMap2 = new HashMap();
            C0042.m1999(hashMap2, C0034.m1781(m970(), 196, 2, 1150), C0030.m1688(m970(), 198, 6, 2624));
            C0042.m1999(hashMap2, C0005.m169(m970(), 204, 1, 1650), str);
            C0042.m1999(hashMap2, C0020.m1390(m970(), 205, 2, 1564), str2);
            JSONArray jSONArray = C0010.m316(new JSONObject(C0010.m310(m969(this), hashMap2, m979(this))), str3);
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
                            String str4 = C0022.m1450(jSONObject, C0049.m2175(m970(), 207, 8, 1118));
                            boolean z2 = C0031.m1694(jSONObject, C0023.m1457(m970(), 215, 9, 761), C0057.m2384(m970(), 224, 17, 3148));
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = !z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        boolean z3 = C0010.m289(str4);
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = z3 ? 48736 : 48705;
                                                case 47384:
                                                    C0041.m1985(jSONArray2, jSONObject);
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
                                        break;
                                }
                            }
                            i++;
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
                        case 239:
                            JSONObject jSONObject2 = new JSONObject();
                            C0005.m159(jSONObject2, C0022.m1433(m970(), 241, 4, 519), str2);
                            C0036.m1852(jSONObject2, C0053.m2276(m970(), 245, 9, 2131), Integer.MAX_VALUE);
                            C0036.m1852(jSONObject2, C0010.m296(m970(), 254, 5, 2103), 90);
                            C0036.m1852(jSONObject2, C0044.m2052(m970(), 259, 5, 2471), Integer.MAX_VALUE);
                            C0005.m159(jSONObject2, str3, jSONArray2);
                            return C0011.m335(jSONObject2);
                    }
                }
            }
        } catch (Exception e) {
            m974(e);
            return C0031.m1705();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
        r6 = com.github.catvod.spider.merge.C0035.m1823(r4);
        r0 = 1864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
        r0 = r0 ^ 1881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
        switch(r0) {
            case 17: goto L60;
            case 47384: goto L59;
            case 47417: goto L62;
            case 47483: goto L61;
            default: goto L64;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
        if (r2 >= r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
        r0 = 48736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
        r0 = 48705;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
        r0 = com.github.catvod.parser.C0008.m237(r4, r2);
        r6 = com.github.catvod.spider.merge.C0024.m1512(com.github.catvod.spider.merge.C0028.m1632(r0, r3));
        r7 = com.github.catvod.spider.merge.C0024.m1512(com.github.catvod.spider.merge.C0028.m1632(r0, com.github.catvod.spider.merge.C0023.m1457(m970(), 290, 9, 3205)));
        r8 = new java.lang.StringBuilder();
        com.github.catvod.spider.merge.C0032.m1746(r8, r7);
        com.github.catvod.spider.merge.C0032.m1746(r8, r6);
        com.github.catvod.parser.C0005.m159(r0, r3, com.github.catvod.spider.C0043.m2039(r8));
        r2 = r2 + 1;
        r2 = 48767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
        r2 = r2 ^ 48784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e8, code lost:
        switch(r2) {
            case 14: goto L70;
            case 239: goto L71;
            default: goto L72;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ec, code lost:
        r2 = 48798;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.T4.detailContent(java.util.List):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 372
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String homeContent(boolean r15) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.T4.homeContent(boolean):java.lang.String");
    }

    public void init(Context context, String str) {
        String str2;
        int i;
        String str3 = C0015.m457(m970(), 381, 10, 2340);
        String str4 = C0052.m2261(m970(), 391, 12, 542);
        String str5 = C0020.m1390(m970(), 403, 10, 2400);
        String str6 = C0020.m1390(m970(), 413, 7, 821);
        String str7 = C0041.m1994(m970(), 420, 4, 2370);
        try {
            boolean z = C0020.m1370(str);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (z) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        String str8 = C0049.m2191(str);
                        boolean z2 = C0030.m1681(str8, C0046.m2123(m970(), 424, 1, 2764));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (!z2) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    this.yq = str8;
                                    break;
                                case 500:
                                    JSONObject jSONObject = new JSONObject(str8);
                                    boolean z3 = C0046.m2127(jSONObject, str7);
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                if (!z3) {
                                                    break;
                                                } else {
                                                    i4 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                break;
                                            case 47417:
                                                this.Gc = C0052.m2260(jSONObject, str7);
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i4 = 48705;
                                    }
                                    boolean z4 = C0046.m2127(jSONObject, str6);
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                this.t0 = C0022.m1450(jSONObject, str6);
                                                break;
                                            case 239:
                                                if (!z4) {
                                                    break;
                                                } else {
                                                    i5 = 48860;
                                                    continue;
                                                }
                                            default:
                                                continue;
                                        }
                                        i5 = 48829;
                                    }
                                    boolean z5 = C0046.m2127(jSONObject, str5);
                                    int i6 = 48891;
                                    while (true) {
                                        i6 ^= 48908;
                                        switch (i6) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                if (!z5) {
                                                    break;
                                                } else {
                                                    i6 = 49635;
                                                    continue;
                                                }
                                            case 32495:
                                                JSONArray jSONArray = C0010.m316(jSONObject, str5);
                                                this.N = new ArrayList();
                                                int i7 = 0;
                                                while (true) {
                                                    int i8 = C0035.m1823(jSONArray);
                                                    int i9 = 49666;
                                                    while (true) {
                                                        i9 ^= 49683;
                                                        switch (i9) {
                                                            case 17:
                                                                i9 = i7 < i8 ? 49759 : 49728;
                                                            case 50:
                                                            case 76:
                                                                C0003.m116(m968(this), C0028.m1631(jSONArray, i7));
                                                                i7++;
                                                                int i10 = 49790;
                                                                while (true) {
                                                                    i10 ^= 49807;
                                                                    switch (i10) {
                                                                        case 18:
                                                                            break;
                                                                        case 241:
                                                                            i10 = 49821;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i6 = 48953;
                                    }
                                    boolean z6 = C0046.m2127(jSONObject, str4);
                                    int i11 = 49914;
                                    while (true) {
                                        i11 ^= 49931;
                                        switch (i11) {
                                            case 497:
                                                if (!z6) {
                                                    break;
                                                } else {
                                                    i11 = 50658;
                                                    continue;
                                                }
                                            case 1711:
                                                break;
                                            case 1736:
                                                break;
                                            case 1769:
                                                JSONArray jSONArray2 = C0010.m316(jSONObject, str4);
                                                this.tF = new ArrayList();
                                                int i12 = 0;
                                                while (true) {
                                                    int i13 = C0035.m1823(jSONArray2);
                                                    int i14 = 50689;
                                                    while (true) {
                                                        i14 ^= 50706;
                                                        switch (i14) {
                                                            case 19:
                                                                i14 = i12 < i13 ? 50782 : 50751;
                                                            case 45:
                                                                break;
                                                            case 50:
                                                            case 76:
                                                                C0003.m116(m973(this), C0028.m1631(jSONArray2, i12));
                                                                i12++;
                                                                int i15 = 50813;
                                                                while (true) {
                                                                    i15 ^= 50830;
                                                                    switch (i15) {
                                                                        case 18:
                                                                            break;
                                                                        case 243:
                                                                            i15 = 50844;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i11 = 50627;
                                    }
                                    boolean z7 = C0046.m2127(jSONObject, str3);
                                    int i16 = 51588;
                                    while (true) {
                                        i16 ^= 51605;
                                        switch (i16) {
                                            case 17:
                                                if (!z7) {
                                                    break;
                                                } else {
                                                    i16 = 51681;
                                                    continue;
                                                }
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                String str9 = C0028.m1632(jSONObject, str3);
                                                boolean z8 = C0020.m1370(str9);
                                                int i17 = 51712;
                                                while (true) {
                                                    i17 ^= 51729;
                                                    switch (i17) {
                                                        case 14:
                                                            break;
                                                        case 17:
                                                            if (z8) {
                                                                break;
                                                            } else {
                                                                i17 = 51805;
                                                                continue;
                                                            }
                                                        case 47:
                                                            break;
                                                        case 76:
                                                            StringBuilder sb = new StringBuilder();
                                                            C0032.m1746(sb, C0011.m339(str9, C0026.m1551(m970(), 425, 1, 541))[1]);
                                                            C0032.m1746(sb, m972(this));
                                                            this.i = C0043.m2039(sb);
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i17 = 51774;
                                                }
                                            default:
                                                continue;
                                        }
                                        i16 = 51650;
                                    }
                                    this.yq = C0022.m1450(jSONObject, C0011.m328(m970(), 426, 7, 580));
                                    int i18 = 51836;
                                    while (true) {
                                        i18 ^= 51853;
                                        switch (i18) {
                                            case 241:
                                                i18 = 52518;
                                                break;
                                            case 1963:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                        try {
                            URL url = new URL(m972(this));
                            StringBuilder sb2 = new StringBuilder();
                            C0032.m1746(sb2, C0002.m65(url));
                            C0032.m1746(sb2, C0022.m1433(m970(), 433, 3, 1178));
                            C0032.m1746(sb2, C0005.m172(url));
                            C0032.m1746(sb2, C0035.m1833(m970(), 436, 1, 2759));
                            str2 = C0043.m2039(sb2);
                            i = 52611;
                        } catch (Exception e) {
                            str2 = null;
                        }
                        while (true) {
                            i ^= 52628;
                            switch (i) {
                                case 23:
                                    i = 52642;
                                    break;
                                case 54:
                                    this.SN = str2;
                                    this.zH = C0045.m2084(str2);
                                    int i19 = 52735;
                                    while (true) {
                                        i19 ^= 52752;
                                        switch (i19) {
                                            case 14:
                                                break;
                                            case 1007:
                                                i19 = 52766;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
        } catch (Exception e2) {
            m974(e2);
        }
        int i20 = C0050.m2221();
        int i21 = 53510;
        while (true) {
            i21 ^= 53527;
            switch (i21) {
                case 17:
                    if (i20 < 0) {
                        break;
                    } else {
                        i21 = 53603;
                        continue;
                    }
                case 50:
                    break;
                case 83:
                    return;
                case 116:
                    System.out.println(Double.decode(C0049.m2171("BYFHoiYX7Ta8gGOQ7jvvu")));
                    return;
            }
            i21 = 53572;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        C0029.m1662();
        C0056.m2351(true);
        try {
            int i = m977(this);
            String str4 = C0021.m1417(m970(), 437, 5, 620);
            String str5 = C0054.m2301(m970(), 442, 7, 636);
            String str6 = C0011.m328(m970(), 449, 3, 2744);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (i != 4) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        HashMap hashMap = new HashMap();
                        C0042.m1999(hashMap, C0051.m2237(m970(), 452, 4, 2355), str2);
                        C0042.m1999(hashMap, C0000.m18(m970(), 456, 4, 1443), str);
                        str3 = C0010.m310(m969(this), hashMap, m979(this));
                        JSONObject jSONObject = new JSONObject(str3);
                        String str7 = C0022.m1450(jSONObject, str6);
                        boolean z = C0037.m1888(str7, str4);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (!z) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 500:
                                    C0005.m159(jSONObject, str6, C0009.m279(str7));
                                    C0005.m159(jSONObject, str5, C0033.m1778(str7));
                                    str3 = C0011.m335(jSONObject);
                                case 471:
                                    return str3;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                    case 239:
                        String str8 = m967(this);
                        String str9 = C0031.m1713(m970(), 460, 5, 2111);
                        int i4 = 1864;
                        while (true) {
                            i4 ^= 1881;
                            switch (i4) {
                                case 17:
                                    if (str8 == null) {
                                        break;
                                    } else {
                                        i4 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    JSONObject jSONObject2 = new JSONObject();
                                    C0036.m1852(jSONObject2, str9, 0);
                                    boolean z2 = C0037.m1888(str2, str4);
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                                break;
                                            case 45:
                                                C0005.m159(jSONObject2, str6, str2);
                                                C0005.m159(jSONObject2, str5, C0033.m1778(str2));
                                                str3 = C0011.m335(jSONObject2);
                                            case 76:
                                                C0005.m159(jSONObject2, str6, C0009.m279(str2));
                                                C0005.m159(jSONObject2, str5, C0033.m1778(str2));
                                                str3 = C0011.m335(jSONObject2);
                                            case 239:
                                                if (!z2) {
                                                    break;
                                                } else {
                                                    i5 = 48860;
                                                    continue;
                                                }
                                            default:
                                                continue;
                                        }
                                        i5 = 48829;
                                    }
                                case 47417:
                                    StringBuilder sb = new StringBuilder();
                                    C0032.m1746(sb, m967(this));
                                    C0032.m1746(sb, str2);
                                    String str10 = C0022.m1450(new JSONObject(C0011.m353(C0043.m2039(sb), m979(this), 0)), str6);
                                    JSONObject jSONObject3 = new JSONObject();
                                    C0036.m1852(jSONObject3, str9, 0);
                                    C0005.m159(jSONObject3, str6, str10);
                                    C0005.m159(jSONObject3, str5, C0033.m1778(str10));
                                    str3 = C0011.m335(jSONObject3);
                                case 47483:
                                    break;
                            }
                            i4 = 48705;
                        }
                        break;
                }
                i2 = 1678;
            }
            return str3;
        } catch (Exception e) {
            m974(e);
            return C0031.m1705();
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = "ۣۤۢ";
        String str3 = null;
        String str4 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str2)) {
                case 1748647:
                    return str4;
                case 1751589:
                    sArr = m970();
                    str2 = "ۨۧۤ";
                    break;
                case 1755589:
                    str3 = C0025.m1542(sArr, 465, 1, 2549);
                    str2 = "ۡۥۥ";
                    break;
                default:
                    str4 = C0049.m2195(this, str, z, str3);
                    str2 = "ۡ۠ۦ";
                    break;
            }
        }
    }

    public String searchContent(String str, boolean z, String str2) {
        boolean z2 = C0030.m1681(m972(this), C0030.m1688(m970(), 466, 4, 1366));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z2) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return C0046.m2114(this, str, z, str2);
                case 239:
                    return C0035.m1820(this, str, z, str2);
            }
            i = 1678;
        }
    }

    public String searchContentApi(String str, boolean z, String str2) {
        String str3 = C0030.m1688(m970(), 470, 8, 988);
        String str4 = C0007.m210(m970(), 478, 4, 3108);
        try {
            HashMap hashMap = new HashMap();
            C0042.m1999(hashMap, C0040.m1953(m970(), 482, 2, 2219), C0021.m1417(m970(), 484, 6, 1241));
            C0042.m1999(hashMap, C0046.m2123(m970(), 490, 2, 2909), str);
            C0042.m1999(hashMap, C0041.m1994(m970(), 492, 2, 1599), str2);
            JSONArray jSONArray = C0010.m316(new JSONObject(C0010.m310(m969(this), hashMap, m979(this))), str4);
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
                            boolean z2 = C0037.m1888(C0022.m1450(jSONObject, str3), str);
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = !z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        String str5 = C0022.m1450(jSONObject, str3);
                                        boolean z3 = C0031.m1694(jSONObject, C0046.m2123(m970(), 494, 9, 1348), C0043.m2020(m970(), 503, 17, 1542));
                                        int i5 = 48767;
                                        while (true) {
                                            i5 ^= 48784;
                                            switch (i5) {
                                                case 14:
                                                case 45:
                                                    break;
                                                case 76:
                                                    boolean z4 = C0010.m289(str5);
                                                    int i6 = 48891;
                                                    while (true) {
                                                        i6 ^= 48908;
                                                        switch (i6) {
                                                            case 22:
                                                            case 53:
                                                                C0041.m1985(jSONArray2, jSONObject);
                                                                break;
                                                            case 503:
                                                                i6 = z4 ? 49635 : 48953;
                                                            case 32495:
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
                                                        }
                                                    }
                                                    break;
                                                case 239:
                                                    i5 = !z3 ? 48860 : 48829;
                                            }
                                        }
                                        break;
                                    case 500:
                                        int i8 = 1864;
                                        while (true) {
                                            i8 ^= 1881;
                                            switch (i8) {
                                                case 17:
                                                    i8 = 48674;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            i++;
                            int i9 = 49790;
                            while (true) {
                                i9 ^= 49807;
                                switch (i9) {
                                    case 18:
                                        break;
                                    case 241:
                                        i9 = 49821;
                                }
                            }
                            break;
                        case 239:
                            JSONObject jSONObject2 = new JSONObject();
                            C0005.m159(jSONObject2, str4, jSONArray2);
                            return C0011.m335(jSONObject2);
                    }
                }
            }
        } catch (Exception e) {
            m974(e);
            return C0031.m1705();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(5:3|4|5|123|121)|9|(5:10|11|14|133|130)|113|36|(5:37|38|40|173|171)|112|265) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d1, code lost:
        com.github.catvod.spider.C0043.m2037(com.github.catvod.parser.C0003.m108(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ac, code lost:
        com.github.catvod.spider.C0043.m2036(r8, (java.lang.CharSequence) com.github.catvod.spider.merge.C0026.m1556(r5));
        r9 = com.github.catvod.parser.C0000.m11(r5);
        r0 = 50689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bc, code lost:
        r0 = r0 ^ 50706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c0, code lost:
        switch(r0) {
            case 19: goto L187;
            case 45: goto L186;
            case 50: goto L188;
            case 76: goto L189;
            default: goto L190;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c4, code lost:
        if (r9 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c6, code lost:
        r0 = 50782;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ca, code lost:
        r0 = 50751;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ce, code lost:
        com.github.catvod.spider.C0043.m2036(r8, r7);
        r0 = 50813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d4, code lost:
        r0 = r0 ^ 50830;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d8, code lost:
        switch(r0) {
            case 18: goto L197;
            case 243: goto L198;
            default: goto L199;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01dc, code lost:
        r0 = 50844;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0143 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String searchContentWeb(java.lang.String r13, boolean r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.T4.searchContentWeb(java.lang.String, boolean, java.lang.String):java.lang.String");
    }
}
