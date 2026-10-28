package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
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
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class KkSs extends Pan {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f33short = {3306, 3318, 3318, 3314, 3256, 3245, 3245, 3322, 3307, 3299, 3309, 3297, 3301, 3303, 3244, 3300, 3319, 3308, 3245, 2433, 2461, 2461, 2457, 2515, 2502, 2502, 2523, 2449, 2432, 2440, 2438, 2457, 2440, 2439, 2503, 2447, 2460, 2439, 2502, 1437, 1409, 1409, 1413, 1414, 1487, 1498, 1498, 1427, 1424, 1436, 1432, 1428, 1434, 1475, 1475, 1475, 1499, 1427, 1408, 1435, 1498, 2536, 2548, 2548, 2544, 2547, 2490, 2479, 2479, 2548, 2550, 2478, 2553, 2553, 2532, 2547, 2553, 2547, 2478, 2548, 2543, 2544, 2479, 2471, 2491, 2491, 2495, 2549, 2528, 2528, 2488, 2488, 2488, 2529, 2466, 2470, 2494, 2468, 2529, 2476, 2476, 2528, 997, 1017, 1017, 1021, 1022, 951, 930, 930, 992, 996, 997, 1001, 1023, 931, 1017, 994, 1021, 930, 1858, 1886, 1886, 1882, 1881, 1808, 1797, 1797, 1868, 1871, 1859, 1863, 1867, 1861, 1820, 1820, 1820, 1796, 1868, 1887, 1860, 1797, 3140, 3160, 3160, 3164, 3094, 3075, 3075, 3156, 3141, 3149, 3139, 3137, 3141, 3098, 3098, 3098, 3074, 3146, 3161, 3138, 3075, 24157, 23198, 26343, 2012, 2493, 2490, 2480, 2481, 2476, 2554, 2468, 2492, 2468, 2555, 2466, 2491, 2480, 2555, 2480, 2481, 2464, 2485, 2493, 2488, 2555, 2493, 2480, 2555, 907, 973, 977, 968, 969, 402, 415, 384, 472, 384, 415, 402, 403, 409, 475, 405, 409, 384, 403, 388, 470, 402, 415, 384, 472, 411, 409, 402, 387, 410, 403, 475, 415, 386, 403, 411, 475, 390, 415, 405, 470, 415, 411, 401, 472, 410, 407, 396, 399, 410, 409, 407, 402, 2090, 2087, 2111, 1881, 1861, 1861, 1857, 1858, 1803, 1822, 1822, 1880, 1884, 1878, 1793, 1798, 1823, 1858, 1886, 1878, 1886, 1860, 1874, 1877, 1887, 1823, 1874, 1886, 1884, 1822, 1863, 1795, 1822, 1861, 1881, 1860, 1884, 1875, 1822, 1859, 1876, 1861, 1864, 1857, 1876, 1902, 1876, 1865, 1874, 1885, 1860, 1877, 1876, 1902, 1878, 1880, 1879, 1822, 1876, 1865, 1861, 1822, 1872, 1860, 1861, 1886, 1822, 1856, 1822, 1800, 1796, 1822, 1874, 1859, 1886, 1857, 1822, 1865, 1864, 1822, 1872, 1880, 1822, 1861, 1822, 1793, 1822, 1806, 1872, 1857, 1857, 1880, 1877, 1804, 1792, 1795, 1795, 1815, 1860, 1859, 1885, 1804, 1881, 1861, 1861, 1857, 1858, 1803, 1822, 1822, 1880, 1884, 1878, 1823, 1865, 1865, 1886, 1886, 1886, 1823, 1874, 1879, 1822, 1857, 1886, 1859, 1861, 1859, 1872, 1880, 1861, 1822, 1862, 1876, 1875, 1857, 1822, 1795, 1793, 1795, 1799, 1793, 1796, 1792, 1801, 1902, 1792, 1796, 1792, 1795, 1794, 1799, 1902, 1792, 1797, 1794, 1793, 1823, 1862, 1876, 1875, 1857, 22770, -31610, 23481, 18196, 999, 1002, 1013, 941, 1006, 1004, 999, 1014, 1007, 998, 942, 1009, 1004, 1012, 942, 1002, 1005, 997, 1004, 931, 957, 931, 994, 385, 388, 401, 388, 456, 390, 393, 396, 405, 391, 394, 388, 407, 385, 456, 401, 384, 413, 401, 1224, 1235, 1242, 1225, 1246, 1262, 1225, 1239, 1174, 1174, 2266, 2254, 2259, 2257, 2255, 1983, 1955, 1966, 1974, 1980, 1690, 1690, 1690, 3138, -11299, -11086, 27853, 25969, 28110, 29872, 32057, 28669, 30403, 25969, -2835, 17700, 28366, 26848, 28669, 30403, 2568, 2570, 2561, 2576, 2569, 2560, 2632, 2582, 2560, 2564, 2583, 2566, 2573, 2632, 2572, 2577, 2560, 2568, 2828, 2867, 2870, 2851, 2870, 2938, 2852, 2853, 2868, 2826, 1999, 1986, 2013, 1925, 1990, 1988, 1999, 2014, 1991, 1998, 1926, 2008, 1998, 1994, 2009, 1992, 1987, 1926, 1986, 2015, 1998, 1990, 985, 941, 917, 986, 984, 991, 921, 901, 924, 925, 1486, 1533, 1511, 1520, 1523, 1471, 1448, 1521, 1520, 1505, 1524, 1532, 1529, 1480, 1486, 1505, 1532, 1505, 1529, 1520, 1480, 2277, 2303, 2280, 2283, 2166, 2171, 2147, 2706, 2711, 2690, 2711, 2779, 2693, 2692, 2709, 1121};
    private String[] O = {C0047.m2133(m822(), 0, 19, 3202), C0039.m1937(m822(), 19, 20, 2537), C0050.m2224(m822(), 39, 22, 1525), C0014.m421(m822(), 61, 22, 2432), C0043.m2020(m822(), 83, 19, 2511), C0046.m2123(m822(), 102, 18, 909), C0033.m1764(m822(), 120, 22, 1834), C0047.m2133(m822(), 142, 21, 3116)};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class WebsiteResponse {
        private String SN;
        private String yq;

        public WebsiteResponse(String str, String str2) {
            this.yq = str2;
            this.SN = str;
            int i = C0045.m2093();
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
                        System.out.println(Double.valueOf(C0007.m222("rg3NCKA7mC3u0pavq")));
                        return;
                    case 239:
                        return;
                }
                i2 = 1678;
            }
        }

        /* renamed from: طﺝﻉن  reason: contains not printable characters */
        public static String m826(Object obj) {
            int i = C0052.m2256();
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
                        return ((WebsiteResponse) obj).SN;
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

        /* renamed from: هحـﺩ  reason: contains not printable characters */
        public static String m827(Object obj) {
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
                        return ((WebsiteResponse) obj).yq;
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

        public String getResponse() {
            return m827(this);
        }

        public String getUrl() {
            return m826(this);
        }
    }

    public KkSs() {
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
                    System.out.println(Long.decode(C0021.m1395("V26SjiQRGVOkNtsBnxO9rkJssS")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ثومﻅ  reason: contains not printable characters */
    public static String m820(Object obj) {
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
                    return ((WebsiteResponse) obj).getUrl();
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

    /* renamed from: دصغن  reason: contains not printable characters */
    public static void m821(Object obj) {
        int i = C0027.m1588();
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

    /* renamed from: طغﺏﺽ  reason: contains not printable characters */
    public static short[] m822() {
        int i = C0036.m1838();
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
                    return f33short;
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

    /* renamed from: ظخنف  reason: contains not printable characters */
    public static void m823(Object obj) {
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

    /* renamed from: مهجﻍ  reason: contains not printable characters */
    public static String[] m824(Object obj) {
        int i = C0035.m1802();
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
                    return ((KkSs) obj).O;
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

    /* renamed from: ﺽخدر  reason: contains not printable characters */
    public static String m825(Object obj) {
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
                    return ((WebsiteResponse) obj).getResponse();
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

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        int i = 3;
        int i2 = 0;
        String str = C0009.m277(m822(), 163, 3, 943);
        String str2 = C0010.m296(m822(), 166, 1, 2042);
        C0056.m2351(true);
        try {
            ME me = new ME();
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, C0011.m339((String) C0035.m1801(list, 0), str2)[0]);
            C0032.m1746(sb, C0020.m1390(m822(), 167, 24, 2516));
            C0032.m1746(sb, C0011.m339((String) C0035.m1801(list, 0), str2)[1]);
            C0032.m1746(sb, C0047.m2133(m822(), 191, 5, 933));
            Va va = C0040.m1964(C0011.m353(C0043.m2039(sb), C0024.m1520(), 0));
            String str3 = C0013.m381(C0022.m1431(C0014.m434(va, C0024.m1513(m822(), 196, 48, 502))), C0045.m2098(m822(), 244, 3, 2123));
            C0008.m255(me, str3);
            C0021.m1409(me, C0021.m1417(m822(), 247, 159, 1841));
            C0039.m1933(me, C0023.m1457(m822(), 406, 4, 2495));
            kB kBVar = C0014.m434(va, C0037.m1882(m822(), 410, 23, 899));
            ArrayList arrayList = new ArrayList();
            int i3 = C0014.m422(kBVar);
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                        break;
                    case 49:
                        if (i3 <= 0) {
                            break;
                        } else {
                            i4 = 1709;
                            continue;
                        }
                    case 204:
                        int i5 = C0014.m422(kBVar);
                        int i6 = 1740;
                        while (true) {
                            i6 ^= 1757;
                            switch (i6) {
                                case 17:
                                    if (i5 <= 3) {
                                        break;
                                    } else {
                                        i6 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    i = C0014.m422(kBVar);
                                    break;
                                case 500:
                                    int i7 = 1864;
                                    while (true) {
                                        i7 ^= 1881;
                                        switch (i7) {
                                            case 17:
                                                i7 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i6 = 1802;
                        }
                        while (true) {
                            int i8 = 48767;
                            while (true) {
                                i8 ^= 48784;
                                switch (i8) {
                                    case 14:
                                    case 45:
                                        break;
                                    case 76:
                                        String str4 = C0013.m381((hN) C0038.m1913(kBVar, i2), C0013.m380(m822(), 433, 19, 485));
                                        StringBuilder sb2 = new StringBuilder();
                                        C0032.m1746(sb2, C0042.m2010(m822(), 452, 10, 1211));
                                        C0032.m1746(sb2, str4);
                                        m821(C0043.m2039(sb2));
                                        C0003.m116(arrayList, str4);
                                        i2++;
                                        int i9 = 48891;
                                        while (true) {
                                            i9 ^= 48908;
                                            switch (i9) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i9 = 48922;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i8 = i2 < i ? 48860 : 48829;
                                }
                            }
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i4 = 1678;
            }
            JSONObject panList = super.panList(arrayList, str3);
            String str5 = C0022.m1450(panList, C0043.m2020(m822(), 462, 5, 2236));
            String str6 = C0022.m1450(panList, C0040.m1953(m822(), 467, 5, 1999));
            boolean z = C0030.m1681(str6, C0015.m457(m822(), 472, 3, 1726));
            int i10 = 49666;
            while (true) {
                i10 ^= 49683;
                switch (i10) {
                    case 17:
                        if (z) {
                            break;
                        } else {
                            i10 = 49759;
                            continue;
                        }
                    case 50:
                        break;
                    case 76:
                        C0005.m160(me, str6);
                        C0020.m1375(me, str5);
                        break;
                    case 83:
                        break;
                    default:
                        continue;
                }
                i10 = 49728;
            }
            boolean z2 = C0054.m2307(str6);
            int i11 = 49790;
            while (true) {
                i11 ^= 49807;
                switch (i11) {
                    case 18:
                        break;
                    case 51:
                        break;
                    case 84:
                        C0005.m160(me, str);
                        C0020.m1375(me, str);
                        break;
                    case 241:
                        if (!z2) {
                            break;
                        } else {
                            i11 = 49883;
                            continue;
                        }
                    default:
                        continue;
                }
                i11 = 49852;
            }
            return C0000.m21(me);
        } catch (Exception e) {
            m823(e);
            return C0031.m1705();
        }
    }

    public String homeContent(boolean z) {
        String str = "ۧۧۦ";
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        JSONObject jSONObject = null;
        rP rPVar = null;
        short[] sArr = null;
        String str3 = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56387:
                    rPVar = new rP(str3, str2);
                    str = "ۤۢۥ";
                    break;
                case 56475:
                    jSONObject = new JSONObject();
                    str = "۠۟ۦ";
                    break;
                case 1746781:
                    return str3;
                case 1746847:
                    str3 = C0026.m1551(sArr, 475, 1, 3187);
                    str = "ۡ۟ۤ";
                    break;
                case 1747655:
                    str3 = C0054.m2296(arrayList2, arrayList, jSONObject);
                    str = "۟ۢ۠";
                    break;
                case 1748614:
                    sArr = m822();
                    str = "ۥۥ";
                    break;
                case 1751591:
                    C0003.m116(arrayList2, rPVar);
                    str = "ۥ۠";
                    break;
                case 1753570:
                    sArr = m822();
                    str = "۟ۤۤ";
                    break;
                case 1754630:
                    arrayList = new ArrayList();
                    str = "ۨۢۧ";
                    break;
                case 1755437:
                    arrayList2 = new ArrayList();
                    str = "ۦۤ۠";
                    break;
                default:
                    str2 = C0007.m210(sArr, 476, 16, 3041);
                    str = "ۢۥ";
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
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
        }
    }

    public void requestWebsites(String[] strArr, List<WebsiteResponse> list, String str) {
        int i = 0;
        ExecutorService executorService = C0040.m1962(strArr.length);
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                    case 49:
                        i3 = i2 < length ? 1709 : 1678;
                    case 204:
                        C0008.m252(executorCompletionService, new yq(this, strArr[i2], str, 0));
                        i2++;
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
                        break;
                }
            }
        }
        while (true) {
            int length2 = strArr.length;
            int i5 = 1864;
            while (true) {
                i5 ^= 1881;
                switch (i5) {
                    case 17:
                        i5 = i < length2 ? 48736 : 48705;
                    case 47384:
                        break;
                    case 47417:
                        try {
                            WebsiteResponse websiteResponse = (WebsiteResponse) C0021.m1408(C0041.m1990(executorCompletionService));
                            boolean z = C0037.m1888(m825(websiteResponse), C0021.m1417(m822(), 492, 18, 2661));
                            int i6 = 48767;
                            while (true) {
                                i6 ^= 48784;
                                switch (i6) {
                                    case 14:
                                    case 45:
                                        break;
                                    case 76:
                                        C0004.m132(list, websiteResponse);
                                        int i7 = C0046.m2125(list);
                                        int i8 = 48891;
                                        while (true) {
                                            i8 ^= 48908;
                                            switch (i8) {
                                                case 22:
                                                case 53:
                                                    break;
                                                case 503:
                                                    i8 = i7 == 3 ? 49635 : 48953;
                                                case 32495:
                                                    int i9 = 49666;
                                                    while (true) {
                                                        i9 ^= 49683;
                                                        switch (i9) {
                                                            case 17:
                                                                i9 = 49697;
                                                                break;
                                                            case 50:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i6 = z ? 48860 : 48829;
                                }
                            }
                        } catch (Exception e) {
                            C0011.m342(e);
                        }
                        i++;
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
                    case 47483:
                }
            }
        }
        C0001.m30(executorService);
        int i11 = C0029.m1639();
        int i12 = 49914;
        while (true) {
            i12 ^= 49931;
            switch (i12) {
                case 497:
                    if (i11 > 0) {
                        break;
                    } else {
                        i12 = 50658;
                        continue;
                    }
                case 1711:
                    break;
                case 1736:
                    return;
                case 1769:
                    System.out.println(C0048.m2157("LOvEfnaSn7ukRlPlm5DQ5YjAyx"));
                    return;
            }
            i12 = 50627;
        }
    }

    public String searchContent(String str, boolean z) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        String str2 = C0005.m169(m822(), 510, 10, 2903);
        ArrayList arrayList2 = new ArrayList();
        C0009.m268(this, m824(this), arrayList2, str);
        int i = 0;
        while (true) {
            int i2 = i;
            int i3 = C0008.m231(arrayList2);
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                    case 49:
                        i4 = i2 < i3 ? 1709 : 1678;
                    case 204:
                        WebsiteResponse websiteResponse = (WebsiteResponse) C0003.m90(arrayList2, i2);
                        try {
                            it = C0004.m122(C0014.m434(C0004.m119(m825(websiteResponse)), C0032.m1749(m822(), 520, 22, 1963)));
                        } catch (Exception e) {
                            m823(e);
                        }
                        while (true) {
                            boolean z2 = C0000.m11(it);
                            int i5 = 1740;
                            while (true) {
                                i5 ^= 1757;
                                switch (i5) {
                                    case 17:
                                        i5 = z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        hN hNVar = (hN) C0026.m1556(it);
                                        String str3 = C0039.m1937(m822(), 542, 10, 1009);
                                        String str4 = C0027.m1601(m822(), 552, 21, 1429);
                                        C0003.m107(hNVar);
                                        String str5 = C0007.m228(str3, C0013.m381(C0000.m12(str4, hNVar), C0051.m2237(m822(), 573, 4, 2189)), 1);
                                        String str6 = C0013.m381(C0000.m12(str2, hNVar), C0012.m361(m822(), 577, 3, 2071));
                                        String str7 = C0013.m381(C0000.m12(str2, hNVar), C0052.m2261(m822(), 580, 8, 2806));
                                        StringBuilder sb = new StringBuilder();
                                        C0032.m1746(sb, m820(websiteResponse));
                                        C0032.m1746(sb, C0012.m361(m822(), 588, 1, 1095));
                                        C0032.m1746(sb, str5);
                                        C0003.m116(arrayList, new ME(C0043.m2039(sb), str6, str7, C0031.m1705()));
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
                            i = i2 + 1;
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
                        }
                        break;
                    case 239:
                        return C0022.m1435(arrayList);
                }
            }
        }
    }
}
