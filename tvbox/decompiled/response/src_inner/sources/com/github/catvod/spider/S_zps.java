package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.by;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class S_zps extends Pan {
    private static HashMap<String, User> n;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f47short = {1551, 1555, 1555, 1559, 1556, 1629, 1608, 1608, 1556, 1544, 1609, 1621, 1618, 1621, 1623, 1620, 1618, 1609, 1567, 1566, 1565, 1608, 387, 402, 395, 461, 401, 391, 387, 400, 385, 394, 477, 393, 405, 479, 418, 558, 631, 544, 550, 560, 551, 571, 564, 568, 560, 631, 623, 631, 624, 550, 631, 633, 631, 549, 564, 550, 550, 546, 570, 551, 561, 631, 623, 631, 624, 550, 631, 552, 622, 639, 614, 544, 622, 634, 635, 615, 544, 611, 608, 616, 614, 609, 2793, 2766, 2762, 2777, 2766, 2777, 2699, 569, 546, 550, 552, 547, 1132, 1133, 1142, 1127, 577, 582, 600, 3075, 2394, 2374, 2374, 2370, 2369, 2312, 2333, 2333, 2395, 2399, 2389, 2306, 2309, 2332, 2369, 2397, 2389, 2397, 2375, 2385, 2390, 2396, 2332, 2385, 2397, 2399, 2333, 2372, 2304, 2333, 2374, 2394, 2375, 2399, 2384, 2333, 2368, 2391, 2374, 2379, 2370, 2391, 2413, 2391, 2378, 2385, 2398, 2375, 2390, 2391, 2413, 2389, 2395, 2388, 2333, 2391, 2378, 2374, 2333, 2387, 2375, 2374, 2397, 2333, 2371, 2333, 2315, 2311, 2333, 2385, 2368, 2397, 2370, 2333, 2378, 2379, 2333, 2387, 2395, 2333, 2374, 2333, 2306, 2333, 2317, 2387, 2370, 2370, 2395, 2390, 2319, 2307, 2304, 2304, 2324, 2375, 2368, 2398, 2319, 2394, 2374, 2374, 2370, 2369, 2312, 2333, 2333, 2397, 2369, 2369, 2310, 2398, 2395, 2372, 2395, 2391, 2373, 2332, 2399, 2397, 2392, 2395, 2332, 2385, 2397, 2399, 2333, 2374, 2394, 2390, 2413, 2388, 2395, 2398, 2391, 2333, 2304, 2306, 2304, 2311, 2333, 2306, 2309, 2333, 2304, 2314, 2333, 2387, 2308, 2384, 2390, 2384, 2304, 2304, 2385, 2385, 2310, 2384, 2306, 2384, 2388, 2385, 2309, 2384, 2305, 2305, 2305, 2388, 2391, 2385, 2311, 2390, 2306, 2304, 2309, 2384, 2315, 2311, 2307, 2332, 2392, 2370, 2389, 3254, -12246, -10427, 28474, 26246, 28217, 30535, 32462, 27658, 30004, 26246, -2278, 18131, 27961, 27415, 27658, 30004, 1197, 2045, 2023, 2042, 2027, 2011, 2044, 2018, 1918, 1890, 1890, 1894, 2376, 2398, 2394, 2377, 2392, 2387, 2426, 2379, 2386, 1572, 1575, 1583, 1569, 1574, 1266, 2465, 2485, 2484, 2472, 2479, 2482, 2473, 2490, 2465, 2484, 2473, 2479, 2478, 2829, 2824, 2845, 2824, 1795, 1803, 1820, 1801, 1803, 1802, 1841, 1804, 1815, 1841, 1818, 1815, 1822, 1803, 1673, 1672, 1683, 1666, 2692, 2691, 2717, 2946, 3038, 2946, 1780, 1784, 1790, 1783, 1788, 1773, 30520, 26016, 31902, 26293, 28295, 2169, 2159, 1732, 1752, 1752, 1756, 1759, 1686, 1667, 1667, 1733, 1729, 1739, 1692, 1691, 1666, 1759, 1731, 1739, 1731, 1753, 1743, 1736, 1730, 1666, 1743, 1731, 1729, 1667, 1754, 1694, 1667, 1752, 1732, 1753, 1729, 1742, 1667, 1758, 1737, 1752, 1749, 1756, 1737, 1779, 1737, 1748, 1743, 1728, 1753, 1736, 1737, 1779, 1739, 1733, 1738, 1667, 1737, 1748, 1752, 1667, 1741, 1753, 1752, 1731, 1667, 1757, 1667, 1685, 1689, 1667, 1743, 1758, 1731, 1756, 1667, 1748, 1749, 1667, 1741, 1733, 1667, 1752, 1667, 1692, 1667, 1683, 1741, 1756, 1756, 1733, 1736, 1681, 1693, 1694, 1694, 1674, 1753, 1758, 1728, 1681, 1732, 1752, 1752, 1756, 1759, 1686, 1667, 1667, 1759, 1693, 1666, 1733, 1729, 1741, 1739, 1737, 1732, 1753, 1742, 1666, 1743, 1743, 1667, 1733, 1729, 1741, 1739, 1737, 1759, 1667, 1694, 1692, 1694, 1690, 1667, 1692, 1689, 1667, 1692, 1684, 1667, 1694, 1688, 1688, 1688, 1694, 1741, 1695, 1695, 1736, 1688, 1690, 1738, 1736, 1693, 1741, 1737, 1737, 1736, 1736, 1736, 1741, 1690, 1695, 1741, 1738, 1688, 1684, 1695, 1695, 1689, 1694, 1689, 1666, 1756, 1730, 1739, 1482, 1486, 1498, 1481, 1488, 2852, 2872, 2872, 2876, 2879, 2934, 2915, 2915, 2853, 2849, 2859, 2940, 2939, 2914, 2879, 2851, 2859, 2851, 2873, 2863, 2856, 2850, 2914, 2863, 2851, 2849, 2915, 2874, 2942, 2915, 2872, 2852, 2873, 2849, 2862, 2915, 2878, 2857, 2872, 2869, 2876, 2857, 2835, 2857, 2868, 2863, 2848, 2873, 2856, 2857, 2835, 2859, 2853, 2858, 2915, 2857, 2868, 2872, 2915, 2861, 2873, 2872, 2851, 2915, 2877, 2915, 2933, 2937, 2915, 2863, 2878, 2851, 2876, 2915, 2868, 2869, 2915, 2861, 2853, 2915, 2872, 2915, 2940, 2915, 2931, 2861, 2876, 2876, 2853, 2856, 2929, 2941, 2942, 2942, 2922, 2873, 2878, 2848, 2929, 2852, 2872, 2872, 2876, 2879, 2934, 2915, 2915, 2879, 2941, 2914, 2853, 2849, 2861, 2859, 2857, 2852, 2873, 2862, 2914, 2863, 2863, 2915, 2853, 2849, 2861, 2859, 2857, 2879, 2915, 2942, 2940, 2942, 2938, 2915, 2940, 2937, 2915, 2940, 2932, 2915, 2941, 2858, 2857, 2857, 2863, 2937, 2940, 2862, 2938, 2856, 2937, 2932, 2933, 2857, 2940, 2936, 2932, 2857, 2861, 2863, 2936, 2940, 2937, 2856, 2938, 2862, 2861, 2933, 2932, 2932, 2861, 2863, 2914, 2876, 2850, 2859, 906, 903, 898, 914, 926, 901, 1011, 1007, 1007, 1003, 1000, 929, 948, 948, 1010, 1014, 1020, 939, 940, 949, 1000, 1012, 1020, 1012, 1006, 1016, 1023, 1013, 949, 1016, 1012, 1014, 948, 1005, 937, 948, 1007, 1011, 1006, 1014, 1017, 948, 1001, 1022, 1007, 994, 1003, 1022, 964, 1022, 995, 1016, 1015, 1006, 1023, 1022, 964, 1020, 1010, 1021, 948, 1022, 995, 1007, 948, 1018, 1006, 1007, 1012, 948, 1002, 948, 930, 942, 948, 1016, 1001, 1012, 1003, 948, 995, 994, 948, 1018, 1010, 948, 1007, 948, 939, 948, 932, 1018, 1003, 1003, 1010, 1023, 934, 938, 937, 937, 957, 1006, 1001, 1015, 934, 1011, 1007, 1007, 1003, 1000, 929, 948, 948, 1000, 938, 949, 1010, 1014, 1018, 1020, 1022, 1011, 1006, 1017, 949, 1016, 1016, 948, 1010, 1014, 1018, 1020, 1022, 1000, 948, 937, 939, 937, 941, 948, 939, 942, 948, 939, 931, 948, 942, 1023, 1018, 938, 930, 941, 938, 938, 943, 941, 937, 943, 939, 939, 1023, 1022, 936, 1016, 938, 930, 1017, 940, 943, 940, 1023, 940, 943, 939, 1023, 1021, 1018, 943, 949, 1003, 1013, 1020, 1297, 1298, 1306, 1303, 1286, 1709, 1713, 1713, 1717, 1718, 1791, 1770, 1770, 1708, 1704, 1698, 1781, 1778, 1771, 1718, 1706, 1698, 1706, 1712, 1702, 1697, 1707, 1771, 1702, 1706, 1704, 1770, 1715, 1783, 1770, 1713, 1709, 1712, 1704, 1703, 1770, 1719, 1696, 1713, 1724, 1717, 1696, 1690, 1696, 1725, 1702, 1705, 1712, 1697, 1696, 1690, 1698, 1708, 1699, 1770, 1696, 1725, 1713, 1770, 1700, 1712, 1713, 1706, 1770, 1716, 1770, 1788, 1776, 1770, 1702, 1719, 
    1706, 1717, 1770, 1725, 1724, 1770, 1700, 1708, 1770, 1713, 1770, 1781, 1770, 1786, 1700, 1717, 1717, 1708, 1697, 1784, 1780, 1783, 1783, 1763, 1712, 1719, 1705, 1784, 1709, 1713, 1713, 1717, 1718, 1791, 1770, 1770, 1718, 1780, 1771, 1708, 1704, 1700, 1698, 1696, 1709, 1712, 1703, 1771, 1702, 1702, 1770, 1708, 1704, 1700, 1698, 1696, 1718, 1770, 1783, 1781, 1783, 1779, 1770, 1781, 1776, 1770, 1781, 1789, 1770, 1696, 1777, 1703, 1782, 1779, 1783, 1777, 1697, 1697, 1782, 1703, 1781, 1782, 1789, 1777, 1789, 1702, 1779, 1699, 1779, 1788, 1780, 1776, 1697, 1777, 1782, 1778, 1699, 1696, 1700, 1782, 1779, 1771, 1717, 1707, 1698, 617, 2763};
    private String O = C0037.m1882(f47short, 0, 22, 1639);
    private String g1 = C0036.m1850(f47short, 22, 15, 482);
    private final HashMap<String, String> s = new HashMap<String, String>() { // from class: com.github.catvod.spider.S_zps.1

        /* renamed from: short  reason: not valid java name */
        private static final short[] f48short = {1923, 1927, 1939, 1920, 1945, 22691, 29613, 307, 304, 312, 309, 292, 23154, 23154, 1598, 1576, 19276, 26628, 3088, 3101, 3096, 3080, 3076, 3103, -25382, 30749};

        {
            put(C0002.m57(f48short, 0, 5, 2034), C0007.m210(f48short, 5, 2, 411));
            put(C0043.m2020(f48short, 7, 5, 337), C0034.m1781(f48short, 12, 2, 3181));
            put(C0003.m86(f48short, 14, 2, 1611), C0012.m361(f48short, 16, 2, 1108));
            put(C0000.m18(f48short, 18, 6, 3185), C0039.m1937(f48short, 24, 2, 2789));
            int i = C0034.m1793();
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
                        System.out.println(Long.decode(C0055.m2313("SOQcn")));
                        return;
                    case 239:
                        return;
                }
                i2 = 1678;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class User {
        private String N;
        private String SN;
        private String yq;

        public User(S_zps s_zps, String str, String str2) {
            this.yq = str;
            this.SN = str2;
            int i = C0009.m276();
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
                        System.out.println(Integer.valueOf(C0051.m2243("mtlz43incEvf4FcXqDuUmJ")));
                        return;
                    case 239:
                        return;
                }
                i2 = 1678;
            }
        }

        public String getKey() {
            return this.SN;
        }

        public String getName() {
            return this.yq;
        }

        public String getToken() {
            return this.N;
        }

        public void setToken(String str) {
            this.N = str;
        }
    }

    public S_zps() {
        int i = C0015.m447();
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
                    System.out.println(C0047.m2135("E8861MCfHv9y9tucf0"));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private void q() {
        Object[] objArr = new Object[2];
        String str = "ۨۧۦ";
        JSONObject jSONObject = null;
        String str2 = null;
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        StringBuilder sb2 = null;
        HashMap<String, User> hashMap = null;
        User user = null;
        short[] sArr = null;
        String str5 = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56449:
                    hashMap = n;
                    str5 = this.O;
                    str = "ۣۨۡ";
                    break;
                case 1746724:
                    hashMap = n;
                    str2 = this.O;
                    str = "ۣ۟ۤ";
                    break;
                case 1747710:
                    user = hashMap.get(str3);
                    str = "ۣۣ۠";
                    break;
                case 1750536:
                    user = hashMap.get(str2);
                    str = "ۧۦۦ";
                    break;
                case 1750566:
                    String name = user.getName();
                    objArr[0] = name;
                    str = "۟۠ۥ";
                    str3 = name;
                    break;
                case 1750726:
                    short[] sArr2 = f47short;
                    str5 = C0001.m35(sArr2, 70, 14, 527);
                    str = "ۤۧۢ";
                    sArr = sArr2;
                    break;
                case 1750812:
                    user = hashMap.get(str5);
                    str = "ۥۦۤ";
                    break;
                case 1751743:
                    sb2 = sb.append(str5);
                    str5 = sb.toString();
                    str = "ۡۨۡ";
                    break;
                case 1752675:
                    sArr = f47short;
                    str4 = C0035.m1833(sArr, 84, 7, 2731);
                    str = "ۧۦۤ";
                    break;
                case 1753483:
                    short[] sArr3 = f47short;
                    str5 = C0015.m457(sArr3, 37, 33, 597);
                    str = "ۨۧ۠";
                    sArr = sArr3;
                    break;
                case 1753665:
                    str5 = jSONObject.getString(C0047.m2133(sArr, 91, 5, 589));
                    str = "ۦۧۧ";
                    break;
                case 1753670:
                    sb = sb2.append(str5);
                    str4 = sb2.toString();
                    str = "ۨ۟ۤ";
                    break;
                case 1754597:
                    sb2 = by.yq(str4);
                    sArr = f47short;
                    str = "ۦۧۢ";
                    break;
                case 1754599:
                    String key = user.getKey();
                    objArr[1] = key;
                    str = "ۦۡۦ";
                    str2 = key;
                    break;
                case 1754657:
                    str5 = this.O;
                    sb2 = sb.append(str5);
                    str = "ۣۥۨ";
                    break;
                case 1755341:
                    user.setToken(str4);
                    return;
                case 1755585:
                    str4 = String.format(str5, objArr);
                    sb = new StringBuilder();
                    str = "ۧۨۢ";
                    break;
                case 1755591:
                    hashMap = n;
                    str3 = this.O;
                    str = "۠ۡ۟";
                    break;
                default:
                    jSONObject = new JSONObject(V3.Gc(str5, str4));
                    str = "ۤۥ";
                    break;
            }
        }
    }

    /* renamed from: بتﻭﻝ  reason: contains not printable characters */
    public static String m940(Object obj) {
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
                    return ((S_zps) obj).g1;
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

    /* renamed from: زدبش  reason: contains not printable characters */
    public static String m941(Object obj) {
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
                    return ((S_zps) obj).O;
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

    /* renamed from: سضغم  reason: contains not printable characters */
    public static HashMap m942(Object obj) {
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
                    return ((S_zps) obj).s;
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

    /* renamed from: شكﺫﻉ  reason: contains not printable characters */
    public static HashMap m943() {
        int i = C0012.m378();
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
                    return n;
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

    /* renamed from: فهﺫﻭ  reason: contains not printable characters */
    public static short[] m944() {
        int i = C0042.m1998();
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
                    return f47short;
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

    /* renamed from: ﺡضﻡﻱ  reason: contains not printable characters */
    public static String m945(Object obj) {
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
                    return ((User) obj).getToken();
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
        String str3 = C0031.m1705();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            Iterator it = C0043.m2019(jSONObject);
            while (true) {
                boolean z2 = C0000.m11(it);
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                        case 49:
                            i = z2 ? 1709 : 1678;
                        case 204:
                            JSONArray jSONArray = C0010.m316(jSONObject, (String) C0026.m1556(it));
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
                                            break;
                                        case 500:
                                            ME me = new ME();
                                            jSONObject = C0036.m1841(jSONArray, i2);
                                            String str4 = C0022.m1450(jSONObject, C0002.m57(m944(), 96, 4, 1026));
                                            String str5 = C0036.m1853(C0022.m1450(jSONObject, C0041.m1994(m944(), 100, 3, 564)), C0042.m2010(m944(), 103, 1, 3105), str3);
                                            C0056.m2351(true);
                                            C0021.m1409(me, C0028.m1613(m944(), 104, 183, 2354));
                                            C0009.m284(me, str5);
                                            C0008.m255(me, str4);
                                            C0003.m116(arrayList, me);
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
                        case 239:
                            iX iXVar = new iX();
                            C0040.m1949(iXVar, arrayList);
                            C0042.m2011(iXVar, 1, 1, C0008.m231(arrayList), C0008.m231(arrayList));
                            return C0033.m1763(iXVar);
                    }
                }
            }
        } catch (Exception e) {
            return str3;
        }
    }

    public String homeContent(boolean z) {
        String str = "ۡ۟۠";
        ArrayList arrayList = null;
        rP rPVar = null;
        JSONObject jSONObject = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56389:
                    arrayList2 = new ArrayList();
                    str = "ۦۡۧ";
                    break;
                case 56390:
                    sArr = f47short;
                    str = "ۨۥ۠";
                    break;
                case 1748610:
                    arrayList = new ArrayList();
                    str = "ۢۧ";
                    break;
                case 1753447:
                    rPVar = new rP(str3, str2);
                    str = "۟۟";
                    break;
                case 1753484:
                    sArr = f47short;
                    str = "ۦۦ۟";
                    break;
                case 1753631:
                    str3 = C0010.m296(sArr, 287, 1, 3207);
                    str = "ۢۨ";
                    break;
                case 1753637:
                    jSONObject = new JSONObject();
                    str = "ۧ۠ۤ";
                    break;
                case 1753665:
                    return str3;
                case 1754411:
                    str3 = iX.Nl(arrayList2, arrayList, jSONObject);
                    str = "ۦۧۢ";
                    break;
                case 1755523:
                    str2 = C0034.m1781(sArr, 288, 16, 2070);
                    str = "ۦ۠ۡ";
                    break;
                default:
                    arrayList2.add(rPVar);
                    str = "ۦۦۥ";
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        String str2 = C0004.m130(f47short, 304, 1, 1152);
        try {
            boolean isEmpty = TextUtils.isEmpty(str);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (isEmpty) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString(C0033.m1764(f47short, 305, 7, 1934));
                        boolean startsWith = optString.startsWith(C0015.m457(f47short, 312, 4, 1814));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (!startsWith) {
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
                                    this.O = optString;
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        String optString2 = jSONObject.optString(C0022.m1433(f47short, 316, 9, 2363));
                        boolean ee = Rc.ee(optString2);
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    if (ee) {
                                        break;
                                    } else {
                                        i3 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    break;
                                case 47417:
                                    this.g1 = optString2;
                                    break;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 48705;
                        }
                        String optString3 = jSONObject.optString(C0006.m180(f47short, 325, 5, 1608));
                        boolean ee2 = Rc.ee(optString3);
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    HashMap<String, User> hashMap = n;
                                    int i5 = 48891;
                                    while (true) {
                                        i5 ^= 48908;
                                        switch (i5) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                if (hashMap == null) {
                                                    break;
                                                } else {
                                                    i5 = 49635;
                                                    continue;
                                                }
                                            case 32495:
                                                boolean containsKey = hashMap.containsKey(optString);
                                                int i6 = 49666;
                                                while (true) {
                                                    i6 ^= 49683;
                                                    switch (i6) {
                                                        case 17:
                                                            if (containsKey) {
                                                                break;
                                                            } else {
                                                                i6 = 49759;
                                                                continue;
                                                            }
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            break;
                                                        case 83:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i6 = 49728;
                                                }
                                            default:
                                                continue;
                                        }
                                        i5 = 48953;
                                    }
                                    String str3 = optString3.split(str2)[0];
                                    String str4 = optString3.split(str2)[1];
                                    HashMap<String, User> hashMap2 = new HashMap<>();
                                    n = hashMap2;
                                    hashMap2.put(optString, new User(this, str3, str4));
                                    q();
                                    int i7 = 49790;
                                    while (true) {
                                        i7 ^= 49807;
                                        switch (i7) {
                                            case 18:
                                                break;
                                            case 241:
                                                i7 = 49821;
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    if (ee2) {
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
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            InitOrigin.show("");
        }
        super.init(context, str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 369
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String searchContent(java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.S_zps.searchContent(java.lang.String, boolean):java.lang.String");
    }
}
