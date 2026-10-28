package com.github.catvod.spider;

import android.content.Context;
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
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
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
public class UuSs extends Pan {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f52short = {2912, 2940, 2940, 2936, 2866, 2855, 2855, 2873, 2874, 2875, 2854, 2878, 2878, 2878, 2874, 2865, 2873, 2854, 2928, 2929, 2930, 2855, 3149, 3153, 3153, 3157, 3103, 3082, 3082, 3091, 3091, 3091, 3083, 3091, 3091, 3091, 3095, 3100, 3092, 3083, 3165, 3164, 3167, 3082, 1266, 1262, 1262, 1258, 1184, 1205, 1205, 1195, 1194, 1193, 1204, 1198, 1199, 1204, 1195, 1196, 1192, 1204, 1192, 1194, 1197, 1184, 1192, 1194, 1197, 1192, 1194, 1205, 1501, 1473, 1473, 1477, 1478, 1423, 1434, 1434, 1474, 1474, 1474, 1435, 1496, 1472, 1498, 1472, 1435, 1478, 1500, 1473, 1488, 1434, 1749, 1737, 1737, 1741, 1671, 1682, 1682, 1744, 1748, 1745, 1739, 1753, 1746, 1736, 1683, 1755, 1736, 1747, 1682, 1756, 1728, 1728, 1732, 1678, 1691, 1691, 1731, 1731, 1731, 1690, 1753, 1729, 1755, 1729, 1690, 1749, 1735, 1757, 1749, 1691, 1032, 1044, 1044, 1040, 1114, 1103, 1103, 1048, 1043, 1025, 1049, 1025, 1038, 1031, 1102, 1030, 1045, 1038, 1114, 1105, 1106, 1109, 1105, 1106, 1103, 23302, 24517, 25532, 1383, 836, 835, 841, 840, 853, 771, 861, 837, 861, 770, 859, 834, 841, 770, 841, 840, 857, 844, 836, 833, 770, 836, 841, 770, 1008, 950, 938, 947, 946, 2757, 2760, 2775, 2703, 2775, 2760, 2757, 2756, 2766, 2700, 2754, 2766, 2775, 2756, 2771, 2689, 2757, 2760, 2775, 2703, 2764, 2766, 2757, 2772, 2765, 2756, 2700, 2760, 2773, 2756, 2764, 2700, 2769, 2760, 2754, 2689, 2760, 2764, 2758, 2703, 2765, 2752, 2779, 2776, 2765, 2766, 2752, 2757, 1575, 1578, 1586, 1910, 1898, 1898, 1902, 1901, 1828, 1841, 1841, 1911, 1907, 1913, 1838, 1833, 1840, 1901, 1905, 1913, 1905, 1899, 1917, 1914, 1904, 1840, 1917, 1905, 1907, 1841, 1896, 1836, 1841, 1898, 1910, 1899, 1907, 1916, 1841, 1900, 1915, 1898, 1895, 1902, 1915, 1857, 1915, 1894, 1917, 1906, 1899, 1914, 1915, 1857, 1913, 1911, 1912, 1841, 1915, 1894, 1898, 1841, 1919, 1899, 1898, 1905, 1841, 1903, 1841, 1831, 1835, 1841, 1917, 1900, 1905, 1902, 1841, 1894, 1895, 1841, 1919, 1911, 1841, 1898, 1841, 1838, 1841, 1825, 1919, 1902, 1902, 1911, 1914, 1827, 1839, 1836, 1836, 1848, 1899, 1900, 1906, 1827, 1910, 1898, 1898, 1902, 1901, 1828, 1841, 1841, 1911, 1907, 1913, 1840, 1894, 1894, 1905, 1905, 1905, 1840, 1917, 1912, 1841, 1902, 1905, 1900, 1898, 1900, 1919, 1911, 1898, 1841, 1897, 1915, 1916, 1902, 1841, 1836, 1838, 1836, 1832, 1838, 1835, 1839, 1830, 1857, 1839, 1835, 1839, 1836, 1837, 1832, 1857, 1839, 1834, 1837, 1838, 1840, 1897, 1915, 1916, 1902, 22487, -29789, 21660, 18481, 923, 918, 905, 977, 914, 912, 923, 906, 915, 922, 978, 909, 912, 904, 978, 918, 913, 921, 912, 991, 961, 991, 926, 2227, 2230, 2211, 2230, 2298, 2228, 2235, 2238, 2215, 2229, 2232, 2230, 2213, 2227, 2298, 2211, 2226, 2223, 2211, 2194, 2185, 2176, 2195, 2180, 2228, 2195, 2189, 2252, 2252, 3199, 3179, 3190, 3188, 3178, 2032, 2028, 2017, 2041, 2035, 2229, 2229, 2229, 1903, -8712, -9577, 25320, 27476, 25579, 31381, 29468, 25048, 30950, 27476, -1336, 19201, 24811, 26309, 25048, 30950, 2908, 2904, 2905, 2910, 2880, 2615, 2603, 2603, 2607, 2340, 2308, 1374, 1372, 1367, 1350, 1375, 1366, 1310, 1344, 1366, 1362, 1345, 1360, 1371, 1310, 1370, 1351, 1366, 1374, 462, 497, 500, 481, 500, 440, 486, 487, 502, 456, 1993, 1988, 2011, 1923, 1984, 1986, 1993, 2008, 1985, 1992, 1920, 2014, 1992, 1996, 2015, 1998, 1989, 1920, 1988, 2009, 1992, 1984, 2908, 2856, 2832, 2911, 2909, 2906, 2844, 2816, 2841, 2840, 3306, 3289, 3267, 3284, 3287, 3227, 3212, 3285, 3284, 3269, 3280, 3288, 3293, 3308, 3306, 3269, 3288, 3269, 3293, 3284, 3308, 458, 464, 455, 452, 2124, 2113, 2137, 536, 541, 520, 541, 593, 527, 526, 543, 451};
    private String[] O = {C0045.m2098(m984(), 0, 22, 2824), C0006.m180(m984(), 22, 22, 3109), C0002.m57(m984(), 44, 28, 1178), C0023.m1457(m984(), 72, 22, 1461), C0053.m2276(m984(), 94, 19, 1725), C0002.m57(m984(), 113, 21, 1716), C0022.m1433(m984(), 134, 25, 1120)};

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
                        System.out.println(Integer.decode(C0002.m72("T2jY")));
                        return;
                    case 239:
                        return;
                }
                i2 = 1678;
            }
        }

        /* renamed from: خﺝضﺫ  reason: contains not printable characters */
        public static String m989(Object obj) {
            int i = C0008.m250();
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

        /* renamed from: ﺕﻍعر  reason: contains not printable characters */
        public static String m990(Object obj) {
            int i = C0037.m1870();
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

        public String getResponse() {
            return m989(this);
        }

        public String getUrl() {
            return m990(this);
        }
    }

    public UuSs() {
        int i = C0028.m1612();
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
                    System.out.println(Float.decode(C0009.m273("erm7dStMByp71eqkdKElECv")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ذغخﻅ  reason: contains not printable characters */
    public static void m983(Object obj) {
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

    /* renamed from: زغرذ  reason: contains not printable characters */
    public static short[] m984() {
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
                    return f52short;
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

    /* renamed from: عنحﺡ  reason: contains not printable characters */
    public static String m985(Object obj) {
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

    /* renamed from: ﺱظوﻱ  reason: contains not printable characters */
    public static String m986(Object obj) {
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

    /* renamed from: ﻙﺎﺩﺡ  reason: contains not printable characters */
    public static String[] m987(Object obj) {
        int i = C0056.m2341();
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
                    return ((UuSs) obj).O;
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

    /* renamed from: ﻩداﺩ  reason: contains not printable characters */
    public static void m988(Object obj) {
        int i = C0047.m2134();
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
                    break;
                case 239:
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
            i2 = 1678;
        }
        int i4 = C0031.m1699();
        int i5 = 1740;
        while (true) {
            i5 ^= 1757;
            switch (i5) {
                case 17:
                    if (i4 > 0) {
                        break;
                    } else {
                        i5 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    System.out.println(Long.parseLong(C0020.m1383("HPT")));
                    return;
            }
            i5 = 1802;
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        int i = 3;
        int i2 = 0;
        String str = C0014.m421(m984(), 159, 3, 1780);
        String str2 = C0037.m1882(m984(), 162, 1, 1345);
        C0056.m2351(true);
        try {
            ME me = new ME();
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, C0011.m339((String) C0035.m1801(list, 0), str2)[0]);
            C0032.m1746(sb, C0002.m57(m984(), 163, 24, 813));
            C0032.m1746(sb, C0011.m339((String) C0035.m1801(list, 0), str2)[1]);
            C0032.m1746(sb, C0021.m1417(m984(), 187, 5, 990));
            Va va = C0040.m1964(C0011.m353(C0043.m2039(sb), C0024.m1520(), 0));
            String str3 = C0013.m381(C0022.m1431(C0014.m434(va, C0028.m1613(m984(), 192, 48, 2721))), C0046.m2123(m984(), 240, 3, 1606));
            C0008.m255(me, str3);
            C0021.m1409(me, C0029.m1635(m984(), 243, 159, 1822));
            C0039.m1933(me, C0002.m57(m984(), 402, 4, 1690));
            kB kBVar = C0014.m434(va, C0039.m1937(m984(), 406, 23, 1023));
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
                                        String str4 = C0013.m381((hN) C0038.m1913(kBVar, i2), C0024.m1513(m984(), 429, 19, 2263));
                                        StringBuilder sb2 = new StringBuilder();
                                        C0032.m1746(sb2, C0013.m380(m984(), 448, 10, 2273));
                                        C0032.m1746(sb2, str4);
                                        m983(C0043.m2039(sb2));
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
            String str5 = C0022.m1450(panList, C0039.m1937(m984(), 458, 5, 3097));
            String str6 = C0022.m1450(panList, C0023.m1457(m984(), 463, 5, 1920));
            boolean z = C0030.m1681(str6, C0001.m35(m984(), 468, 3, 2193));
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
            m988(e);
            return C0031.m1705();
        }
    }

    public String homeContent(boolean z) {
        String str = "ۨۨۥ";
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        JSONObject jSONObject = null;
        rP rPVar = null;
        String str3 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 1748645:
                    arrayList2 = new ArrayList();
                    str = "ۦۤۦ";
                    break;
                case 1749607:
                    C0003.m116(arrayList2, rPVar);
                    str = "ۤۧۨ";
                    break;
                case 1749635:
                    return str3;
                case 1751619:
                    rPVar = new rP(str3, str2);
                    str = "ۢ۠ۥ";
                    break;
                case 1751749:
                    jSONObject = new JSONObject();
                    str = "ۣۣ";
                    break;
                case 1752710:
                    sArr = m984();
                    str = "ۨۤ۠";
                    break;
                case 1753576:
                    sArr = m984();
                    str = "ۣۨ۟";
                    break;
                case 1755340:
                    str3 = C0041.m1994(sArr, 471, 1, 1886);
                    str = "ۥۧۨ";
                    break;
                case 1755492:
                    str2 = C0001.m35(sArr, 472, 16, 1476);
                    str = "ۣۤۢ";
                    break;
                case 1755621:
                    arrayList = new ArrayList();
                    str = "ۡ۠ۤ";
                    break;
                default:
                    str3 = C0054.m2296(arrayList2, arrayList, jSONObject);
                    str = "ۢۡۢ";
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        String str2 = C0001.m35(m984(), 488, 5, 2860);
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = C0037.m1888(str, str2);
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
                        String str3 = C0022.m1450(jSONObject, str2);
                        boolean z2 = C0030.m1681(str3, C0040.m1953(m984(), 493, 4, 2655));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (z2) {
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
                                    str3 = C0049.m2191(str3);
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        this.O = C0011.m339(str3, C0000.m18(m984(), 497, 2, 2424));
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            super.init(context, str);
        } catch (Exception e) {
            int i3 = 48767;
            while (true) {
                i3 ^= 48784;
                switch (i3) {
                    case 14:
                        break;
                    case 239:
                        i3 = 48798;
                        break;
                }
            }
        }
        int i4 = C0013.m382();
        int i5 = 1864;
        while (true) {
            i5 ^= 1881;
            switch (i5) {
                case 17:
                    if (i4 < 0) {
                        break;
                    } else {
                        i5 = 48736;
                        continue;
                    }
                case 47384:
                    return;
                case 47417:
                    System.out.println(Integer.decode(C0030.m1663("9Ixtv9LXmkspR2")));
                    return;
                case 47483:
                    break;
            }
            i5 = 48705;
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
                        C0008.m252(executorCompletionService, new yq(this, strArr[i2], str, 1));
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
                            boolean z = C0037.m1888(m985(websiteResponse), C0013.m380(m984(), 499, 18, 1331));
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
    }

    public String searchContent(String str, boolean z) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        String str2 = C0030.m1688(m984(), 517, 10, 405);
        ArrayList arrayList2 = new ArrayList();
        C0048.m2147(this, m987(this), arrayList2, str);
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
                            it = C0004.m122(C0014.m434(C0004.m119(m985(websiteResponse)), C0035.m1833(m984(), 527, 22, 1965)));
                        } catch (Exception e) {
                            m988(e);
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
                                        String str3 = C0053.m2276(m984(), 549, 10, 2932);
                                        String str4 = C0004.m130(m984(), 559, 21, 3249);
                                        C0003.m107(hNVar);
                                        String str5 = C0007.m228(str3, C0013.m381(C0000.m12(str4, hNVar), C0009.m277(m984(), 580, 4, 418)), 1);
                                        String str6 = C0013.m381(C0000.m12(str2, hNVar), C0006.m180(m984(), 584, 3, 2093));
                                        String str7 = C0013.m381(C0000.m12(str2, hNVar), C0006.m180(m984(), 587, 8, 636));
                                        StringBuilder sb = new StringBuilder();
                                        C0032.m1746(sb, m986(websiteResponse));
                                        C0032.m1746(sb, C0011.m328(m984(), 595, 1, 485));
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
