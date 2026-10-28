package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.A4;
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
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.RS;
import com.github.catvod.spider.merge.Sq;
import com.github.catvod.spider.merge.Yx;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.l3;
import com.github.catvod.spider.merge.rP;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Seedhub extends Pan {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f49short = {3071, 3043, 3043, 3047, 3044, 2989, 3000, 3000, 3044, 3058, 3058, 3059, 3071, 3042, 3061, 3001, 3047, 3045, 3064, 3000, 1102, 1116, 1131, 1128, 1131, 1148, 1131, 1148, 1075, 381, 1755, 1789, 1771, 1788, 1699, 1743, 1769, 1771, 1760, 1786, 452, 499, 496, 499, 484, 499, 484, 2177, 2205, 2201, 2186, 706, 721, 710, 706, 2017, 2042, 2724, 2729, 2720, 2741, 1976, 537, 1936, 1929, 1922, 1977, 1928, 1927, 1931, 1923, 2919, 2942, 2933, 2894, 2915, 2932, 2940, 2928, 2915, 2938, 2914, 1514, 1526, 1526, 1522, 1521, 1464, 1453, 1453, 1515, 1519, 1509, 1458, 1461, 1452, 1521, 1517, 1509, 1517, 1527, 1505, 1510, 1516, 1452, 1505, 1517, 1519, 1453, 1524, 1456, 1453, 1526, 1514, 1527, 1519, 1504, 1453, 1520, 1511, 1526, 1531, 1522, 1511, 1501, 1511, 1530, 1505, 1518, 1527, 1510, 1511, 1501, 1509, 1515, 1508, 1453, 1511, 1530, 1526, 1453, 1507, 1527, 1526, 1517, 1453, 1523, 1453, 1467, 1463, 1453, 1505, 1520, 1517, 1522, 1453, 1530, 1531, 1453, 1507, 1515, 1453, 1526, 1453, 1458, 1453, 1469, 1507, 1522, 1522, 1515, 1510, 1471, 1459, 1456, 1456, 1444, 1527, 1520, 1518, 1471, 1514, 1526, 1526, 1522, 1521, 1464, 1453, 1453, 1517, 1521, 1521, 1462, 1518, 1515, 1524, 1515, 1511, 1525, 1452, 1519, 1517, 1512, 1515, 1452, 1505, 1517, 1519, 1453, 1526, 1514, 1510, 1501, 1508, 1515, 1518, 1511, 1453, 1456, 1458, 1456, 1463, 1453, 1458, 1461, 1453, 1456, 1466, 1453, 1507, 1460, 1504, 1510, 1504, 1456, 1456, 1505, 1505, 1462, 1504, 1458, 1504, 1508, 1505, 1461, 1504, 1457, 1457, 1457, 1508, 1511, 1505, 1463, 1510, 1458, 1456, 1461, 1504, 1467, 1463, 1459, 1452, 1512, 1522, 1509, 2776, 2777, 2760, 3158, 3148, 3163, 3160, 1629, 1600, 1629, 1605, 1612, 2618, 2577, 2588, 2581, 2560, 2582, 2634, 1290, 1311, 1305, 1293, 1361, 2117, 2119, 2130, 2115, 2113, 2121, 2132, 2127, 2115, 2133, 2057, 2051, 2133, 2057, 2051, 2133, 2057, 2123, 2121, 2128, 2127, 2115, 2133, 2057, 2073, 2134, 2119, 2113, 2115, 2075, 2051, 2133, 2048, 2121, 2132, 2114, 2115, 2132, 2075, 2051, 2133, 1347, 1345, 1364, 1349, 1351, 1359, 1362, 1353, 1349, 1363, 1295, 1285, 1363, 1295, 1357, 1359, 1366, 1353, 1349, 1363, 1295, 1311, 1360, 1345, 1351, 1349, 1309, 1285, 1363, 1286, 1359, 1362, 1348, 1349, 1362, 1309, 1285, 1363, 1366, 1364, 1345, 1360, 1362, 1370, 1351, 1372, 1360, 1350, 1306, 1296, 1350, 1306, 1368, 1370, 1347, 1372, 1360, 1350, 1306, 1290, 1349, 1364, 1362, 1360, 1288, 1296, 1350, 1873, 1884, 1859, 1819, 1878, 1882, 1859, 1872, 1863, 1816, 1878, 1882, 1883, 1857, 1876, 1884, 1883, 1872, 1863, 1813, 1873, 1884, 1859, 1819, 1878, 1882, 1859, 1872, 1863, 459, 394, 451, 455, 461, 3262, 3239, 3307, 3239, 3234, -28868, 30617, 2504, 2542, 2535, 2532, 2540, 2541, 2554, 2626, 1887, 2979, 2990, 2993, 3049, 2980, 2984, 2985, 2995, 2978, 2985, 2995, 869, 872, 887, 815, 866, 878, 887, 868, 883, 812, 866, 878, 879, 885, 864, 872, 879, 868, 883, 801, 872, 876, 870, 2420, 507, 502, 489, 433, 508, 496, 489, 506, 493, 434, 508, 496, 497, 491, 510, 502, 497, 506, 493, 447, 490, 499, 447, 499, 502, 24043, 26883, 18401, 26318, 32429, 21853, 20929, 29104, 21770, 22593, 984, 21703, 20685, -27686, 28385, 1383, 1406, 1397, 1358, 1377, 1400, 1394, 1901, 1908, 1919, 1860, 1890, 1918, 1914, 1897, 1747, 1738, 1729, 1786, 1732, 1734, 1745, 1738, 1751, 1727, 1702, 1709, 1686, 1709, 1696, 1723, 1708, 1706, 1725, 1702, 1723, 1703, 1726, 1717, 1678, 1712, 1699, 1716, 1712, 292, 297, 288, 309, 271, 318, 305, 317, 309, 2617, 2592, 2603, 2576, 2604, 2592, 2593, 2619, 2602, 2593, 2619, 508, 497, 494, 438, 507, 503, 502, 492, 509, 502, 492, 440, 502, 505, 494, 438, 502, 505, 494, 437, 500, 497, 502, 499, 491, 440, 508, 497, 494, 438, 502, 505, 494, 437, 497, 492, 509, 501, 440, 505, 693, 696, 679, 767, 690, 702, 703, 677, 692, 703, 677, 753, 676, 701, 767, 673, 688, 703, 764, 701, 696, 703, 698, 674, 753, 701, 696, 753, 688, 2440, 2437, 2458, 2498, 2447, 2435, 2434, 2456, 2441, 2434, 2456, 2508, 2457, 2432, 2498, 2463, 2441, 2441, 2440, 2463, 2508, 2432, 2437, 756, 756, 756, 815, 810, 831, 810, 870, 807, 802, 805, 800, 1370, 1366, 1373, 1372, 1636, 1636, 1636, 21460, 23463, 2361, 24325, 29707, 20630, 31640, 2438, 2087, 2107, 2107, 2111, 2108, 2165, 2144, 2144, 2086, 2082, 2088, 2175, 2168, 2145, 2108, 2080, 2088, 2080, 2106, 2092, 2091, 2081, 2145, 2092, 2080, 2082, 2144, 2105, 2173, 2144, 2107, 2087, 2106, 2082, 2093, 2144, 2109, 2090, 2107, 2102, 2111, 2090, 2064, 2090, 2103, 2092, 2083, 2106, 2091, 2090, 2064, 2088, 2086, 2089, 2144, 2090, 2103, 2107, 2144, 2094, 2106, 2107, 2080, 2144, 2110, 2144, 2166, 2170, 2144, 2092, 2109, 2080, 2111, 2144, 2103, 2102, 2144, 2094, 2086, 2144, 2107, 2144, 2175, 2144, 2160, 2094, 2111, 2111, 2086, 2091, 2162, 2174, 2173, 2173, 2153, 2106, 2109, 2083, 2162, 2087, 2107, 2107, 2111, 2108, 2165, 2144, 2144, 2108, 2174, 2145, 2086, 2082, 2094, 2088, 2090, 2087, 2106, 2093, 2145, 2092, 2092, 2144, 2086, 2082, 2094, 2088, 2090, 2108, 2144, 2173, 2175, 2173, 2171, 2144, 2174, 2174, 2144, 2175, 2169, 2144, 2091, 2089, 2172, 2089, 2093, 2171, 2091, 2168, 2175, 2175, 2166, 2172, 2167, 2172, 2091, 2172, 2094, 2166, 2170, 2092, 2090, 2089, 2169, 2169, 2166, 2167, 2092, 2167, 2166, 2173, 2175, 2175, 2145, 2085, 2111, 2088, 29994, 24050, 23916, 23916, 21647, 21647, 696, 1655, 1643, 1643, 1647, 1644, 1573, 1584, 1584, 1654, 1650, 1656, 1583, 1576, 1585, 1644, 1648, 1656, 1648, 1642, 1660, 1659, 1649, 1585, 1660, 1648, 1650, 1584, 1641, 1581, 1584, 1643, 1655, 1642, 1650, 1661, 1584, 1645, 1658, 1643, 1638, 1647, 1658, 1600, 1658, 1639, 1660, 1651, 1642, 1659, 1658, 1600, 1656, 1654, 1657, 1584, 1658, 1639, 1643, 1584, 1662, 1642, 1643, 1648, 1584, 1646, 1584, 1574, 1578, 1584, 1660, 1645, 1648, 1647, 1584, 1639, 1638, 1584, 1662, 1654, 1584, 1643, 1584, 1583, 1584, 1568, 1662, 1647, 1647, 1654, 1659, 1570, 1582, 1581, 1581, 1593, 1642, 1645, 1651, 1570, 1655, 1643, 1643, 1647, 1644, 1573, 1584, 1584, 1644, 1582, 1585, 1654, 1650, 
    1662, 1656, 1658, 1655, 1642, 1661, 1585, 1660, 1660, 1584, 1654, 1650, 1662, 1656, 1658, 1644, 1584, 1581, 1583, 1581, 1577, 1584, 1583, 1579, 1584, 1583, 1576, 1584, 1662, 1575, 1579, 1581, 1659, 1574, 1583, 1583, 1583, 1580, 1575, 1579, 1662, 1660, 1583, 1661, 1661, 1657, 1579, 1578, 1657, 1578, 1578, 1659, 1658, 1661, 1580, 1579, 1579, 1662, 1574, 1658, 1585, 1653, 1647, 1656, 3219, 3205, 20109, 28101, 18310, 25806, 2230, 1891, 1919, 1919, 1915, 1912, 1841, 1828, 1828, 1890, 1894, 1900, 1851, 1852, 1829, 1912, 1892, 1900, 1892, 1918, 1896, 1903, 1893, 1829, 1896, 1892, 1894, 1828, 1917, 1849, 1828, 1919, 1891, 1918, 1894, 1897, 1828, 1913, 1902, 1919, 1906, 1915, 1902, 1876, 1902, 1907, 1896, 1895, 1918, 1903, 1902, 1876, 1900, 1890, 1901, 1828, 1902, 1907, 1919, 1828, 1898, 1918, 1919, 1892, 1828, 1914, 1828, 1842, 1854, 1828, 1896, 1913, 1892, 1915, 1828, 1907, 1906, 1828, 1898, 1890, 1828, 1919, 1828, 1851, 1828, 1844, 1898, 1915, 1915, 1890, 1903, 1846, 1850, 1849, 1849, 1837, 1918, 1913, 1895, 1846, 1891, 1919, 1919, 1915, 1912, 1841, 1828, 1828, 1912, 1850, 1829, 1890, 1894, 1898, 1900, 1902, 1891, 1918, 1897, 1829, 1896, 1896, 1828, 1890, 1894, 1898, 1900, 1902, 1912, 1828, 1849, 1851, 1849, 1855, 1828, 1850, 1850, 1828, 1851, 1852, 1828, 1854, 1903, 1848, 1903, 1855, 1848, 1902, 1854, 1853, 1851, 1851, 1843, 1855, 1855, 1854, 1853, 1897, 1850, 1902, 1897, 1896, 1854, 1898, 1901, 1843, 1898, 1848, 1849, 1901, 1901, 1897, 1853, 1829, 1915, 1893, 1900, -24693, -26504, -28663, 29902, -28081, 30344, 1112, 3245, 3249, 3249, 3253, 3254, 3327, 3306, 3306, 3244, 3240, 3234, 3317, 3314, 3307, 3254, 3242, 3234, 3242, 3248, 3238, 3233, 3243, 3307, 3238, 3242, 3240, 3306, 3251, 3319, 3306, 3249, 3245, 3248, 3240, 3239, 3306, 3255, 3232, 3249, 3260, 3253, 3232, 3226, 3232, 3261, 3238, 3241, 3248, 3233, 3232, 3226, 3234, 3244, 3235, 3306, 3232, 3261, 3249, 3306, 3236, 3248, 3249, 3242, 3306, 3252, 3306, 3324, 3312, 3306, 3238, 3255, 3242, 3253, 3306, 3261, 3260, 3306, 3236, 3244, 3306, 3249, 3306, 3317, 3306, 3322, 3236, 3253, 3253, 3244, 3233, 3320, 3316, 3319, 3319, 3299, 3248, 3255, 3241, 3320, 3245, 3249, 3249, 3253, 3254, 3327, 3306, 3306, 3254, 3316, 3307, 3244, 3240, 3236, 3234, 3232, 3245, 3248, 3239, 3307, 3238, 3238, 3306, 3244, 3240, 3236, 3234, 3232, 3254, 3306, 3319, 3317, 3319, 3313, 3306, 3316, 3316, 3306, 3317, 3315, 3306, 3318, 3316, 3233, 3325, 3235, 3235, 3317, 3314, 3318, 3232, 3313, 3313, 3233, 3315, 3315, 3324, 3318, 3235, 3239, 3239, 3238, 3235, 3239, 3232, 3315, 3324, 3233, 3317, 3236, 3314, 3317, 3318, 3307, 3247, 3253, 3234, 3073, 3076, 3102, 3097, 1597, 1572, 1583, 1556, 1570, 1583, 2628, 2625, 2630, 2627, 2679, 2651, 2652, 2633, 2650, 2652, 1243, 2613, 2596, 2603, 2586, 2604, 2593, 2564, 2568, 2569, 2580, 2579, 2631, 2563, 2566, 2579, 2566, 2631, 2650, 2631, 2629, 2639, 2633, 2637, 2648, 2638, 2629, 899, 916, 903, 981, 901, 916, 923, 953, 924, 923, 926, 981, 968, 981, 983, 989, 987, 991, 970, 988, 983, 1425, 708, 733, 726, 749, 706, 734, 723, 715, 749, 711, 704, 734, 706, 731, 720, 747, 708, 728, 725, 717, 747, 722, 710, 731, 729, 2291, 2291, 2291, 23326, -29442, -28571, 24788, 29967, -31137, 21121, 28408, 2703, 2086, 2085, 2116, 2166, 2086, 2085, 2166, 2122, 2086, 2086, 2146, 2134, 2086, 2121, 2140, 2175, 2086, 2121, 2140, 2175, 2086, 2143, 2150, 2144, 1734, 29222, 22626, 2761, 21829, -28188, 675, 23011, 25696, 1044, 1049, 1030, 1118, 1043, 1055, 1030, 1045, 1026, 1117, 1043, 1055, 1054, 1028, 1041, 1049, 1054, 1045, 1026, 1104, 1044, 1049, 1030, 1118, 1043, 1055, 1030, 1045, 1026, 2715, 2694, 2715, 2691, 2698, 416, 481, 424, 428, 422, 385, 384, 401, 1761, 1784, 1716, 1784, 1789, -31050, 32275, 1873, 1867, 1884, 1887, 2240, 2278, 2287, 2284, 2276, 2277, 2290, 2132, 2130, 1104, 2399, 2307, 2313, 2399, 2307, 1507, 1518, 1521, 1449, 1508, 1512, 1521, 1506, 1525, 1450, 1508, 1512, 1513, 1523, 1510, 1518, 1513, 1506, 1525, 1447, 1507, 1518, 1521, 1449, 1508, 1512, 1521, 1506, 1525, 2248, 2261, 2248, 2256, 2265, 2264, 2201, 2256, 2260, 2270, 2520, 2521, 2504, 2508, 2517, 2457, 2517, 2512, -31028, 32361, 2822, 2844, 2827, 2824, 1274, 1244, 1237, 1238, 1246, 1247, 1224};
    private CacheData Dr;
    private CacheData Zm;
    private String b;
    private CacheData g;
    private String O = C0011.m328(f49short, 0, 20, 2967);
    private String g1 = "";
    private String s = "";
    private String n = "";
    private String un = "";

    /* renamed from: com.github.catvod.spider.Seedhub$1  reason: invalid class name */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class CacheData {
        private String N;
        private String SN;
        private String tF;
        private String yq;
        private String zH;

        CacheData() {
            int i = C0020.m1371();
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
                        System.out.println(Float.valueOf(C0052.m2269("lbHmU")));
                        return;
                    case 239:
                        return;
                }
                i2 = 1678;
            }
        }

        public String getBy() {
            return this.tF;
        }

        public String getData() {
            return this.SN;
        }

        public String getId() {
            return this.yq;
        }

        public String getPg() {
            return this.N;
        }

        public String getTypeOnly() {
            return this.zH;
        }

        public void setBy(String str) {
            this.tF = str;
            int i = C0044.m2051();
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
                        System.out.println(Double.decode(C0023.m1460("71J4QGUEuoxmkcmx3ukUBr")));
                        return;
                    case 239:
                        return;
                }
                i2 = 1678;
            }
        }

        public void setData(String str) {
            this.SN = str;
        }

        public void setId(String str) {
            this.yq = str;
            int i = C0010.m301();
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
                        System.out.println(Integer.decode(C0026.m1572("bEkSj2OTxZGF")));
                        return;
                    case 239:
                        return;
                }
                i2 = 1678;
            }
        }

        public void setPg(String str) {
            this.N = str;
            int i = C0013.m382();
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
                        System.out.println(Float.valueOf(C0025.m1531("1frVKyu4c")));
                        return;
                    case 239:
                        return;
                }
                i2 = 1678;
            }
        }

        public void setTypeOnly(String str) {
            this.zH = str;
        }
    }

    public Seedhub() {
        int i = C0055.m2324();
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
                    System.out.println(Integer.parseInt(C0031.m1714("D2cUt7R")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private String B(String str, String str2, String str3) {
        boolean equals = str.equals(this.g1);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (equals) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    this.g1 = str;
                    this.un = str;
                    return str;
                case 239:
                    boolean equals2 = str2.equals(this.s);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (equals2) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                boolean equals3 = str3.equals(this.n);
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (equals3) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            return "";
                                        case 47417:
                                            this.n = str3;
                                            this.un = str3;
                                            return str3;
                                        case 47483:
                                            break;
                                    }
                                    i3 = 48705;
                                }
                                break;
                            case 500:
                                this.s = str2;
                                this.un = str2;
                                return str2;
                        }
                        i2 = 1802;
                    }
                    break;
            }
            i = 1678;
        }
    }

    private String G(String str) {
        String str2 = "۠ۡۦ";
        StringBuilder sb = null;
        short[] sArr = null;
        String str3 = null;
        int i = 0;
        while (true) {
            switch (C0002.m76(str2)) {
                case 56412:
                    str3 = C0047.m2133(sArr, 29, 1, 338);
                    str2 = "ۤۡۧ";
                    break;
                case 56538:
                    str = sb.toString();
                    str2 = "ۣۡۥ";
                    break;
                case 1746781:
                    sb.append(str3);
                    str2 = "ۧۡ";
                    break;
                case 1746789:
                    str3 = C0047.m2133(sArr, 20, 9, 1038);
                    str2 = "ۣ۠ۦ";
                    break;
                case 1747717:
                    sArr = f49short;
                    str2 = "۟ۢۨ";
                    break;
                case 1747779:
                    sb = Sq.yq(str, str3);
                    str2 = "ۨۢ۠";
                    break;
                case 1748737:
                    str3 = str.substring(0, i);
                    str2 = "۟ۢ۠";
                    break;
                case 1748739:
                    return str;
                case 1750726:
                    sArr = f49short;
                    str2 = "ۣ۟";
                    break;
                case 1755430:
                    str = this.O;
                    str2 = "ۣۥۨ";
                    break;
                default:
                    i = str.lastIndexOf(str3);
                    str2 = "ۣۣۡ";
                    break;
            }
        }
    }

    private HashMap<String, String> q() {
        String str = "ۦۡۤ";
        HashMap<String, String> hashMap = null;
        String str2 = null;
        short[] sArr = null;
        String str3 = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56444:
                    str2 = this.O;
                    str = "ۧۡ۟";
                    break;
                case 1747809:
                    str3 = A4.i();
                    str = "ۥۤۢ";
                    break;
                case 1747934:
                    hashMap.put(str2, str3);
                    str = "ۤ۠";
                    break;
                case 1751681:
                    str3 = C0026.m1551(sArr, 40, 7, 406);
                    str = "ۦ۠ۨ";
                    break;
                case 1752611:
                    sArr = f49short;
                    str = "۠ۧ۟";
                    break;
                case 1753454:
                    hashMap.put(str3, str2);
                    str = "ۨۢۢ";
                    break;
                case 1753481:
                    hashMap = new HashMap<>();
                    str = "۠ۤۥ";
                    break;
                case 1754437:
                    sArr = f49short;
                    str = "ۤۥۢ";
                    break;
                case 1755432:
                    return hashMap;
                default:
                    str2 = C0048.m2145(sArr, 30, 10, 1678);
                    str = "۠ۨۦ";
                    break;
            }
        }
    }

    /* renamed from: اﻝﺥﺏ  reason: contains not printable characters */
    public static short[] m946() {
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
                    return f49short;
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

    /* renamed from: تكﻝغ  reason: contains not printable characters */
    public static String m947(Object obj) {
        int i = C0051.m2229();
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
                    return ((CacheData) obj).getData();
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

    /* renamed from: جﻱﺥﻅ  reason: contains not printable characters */
    public static String m948(Object obj) {
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
                    return ((Seedhub) obj).b;
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

    /* renamed from: دﺎسﻅ  reason: contains not printable characters */
    public static void m949(Object obj, Object obj2) {
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
                    ((CacheData) obj).setTypeOnly((String) obj2);
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

    /* renamed from: ضﺵﻅـ  reason: contains not printable characters */
    public static String m950(Object obj) {
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
                    return ((CacheData) obj).getId();
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

    /* renamed from: ظدنﺝ  reason: contains not printable characters */
    public static HashMap m951(Object obj) {
        int i = C0029.m1639();
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
                    return ((Seedhub) obj).q();
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

    /* renamed from: ظقنﻩ  reason: contains not printable characters */
    public static String m952(Object obj) {
        int i = C0006.m193();
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
                    return ((CacheData) obj).getBy();
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

    /* renamed from: ـوطﻍ  reason: contains not printable characters */
    public static CacheData m953(Object obj) {
        int i = C0021.m1415();
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
                    return ((Seedhub) obj).Zm;
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

    /* renamed from: قﺽفﺩ  reason: contains not printable characters */
    public static void m954(Object obj, Object obj2) {
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
                    ((CacheData) obj).setId((String) obj2);
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
        int i4 = C0011.m344();
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
                    System.out.println(Long.valueOf(C0000.m7("DanYONpuIVISJZIa6HfdZRqC")));
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: كذعﻕ  reason: contains not printable characters */
    public static CacheData m955(Object obj) {
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
                    return ((Seedhub) obj).g;
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

    /* renamed from: نتشر  reason: contains not printable characters */
    public static void m956(Object obj, Object obj2) {
        int i = C0022.m1429();
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
                    ((CacheData) obj).setPg((String) obj2);
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

    /* renamed from: ﺥاﺡج  reason: contains not printable characters */
    public static String m957(Object obj) {
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
                    return ((CacheData) obj).getPg();
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

    /* renamed from: ﺩبطﺕ  reason: contains not printable characters */
    public static CacheData m958(Object obj) {
        int i = C0039.m1918();
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
                    return ((Seedhub) obj).Dr;
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

    /* renamed from: ﺩسﻡو  reason: contains not printable characters */
    public static String m959(Object obj, Object obj2, Object obj3, Object obj4) {
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
                    return ((Seedhub) obj).B((String) obj2, (String) obj3, (String) obj4);
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

    /* renamed from: ﺫﻅﻁﻝ  reason: contains not printable characters */
    public static String m960(Object obj) {
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
                    return ((Seedhub) obj).un;
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

    /* renamed from: ﺭﺵﺹﻝ  reason: contains not printable characters */
    public static String m961(Object obj, Object obj2) {
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
                    return ((Seedhub) obj).G((String) obj2);
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

    /* renamed from: ﺵطعب  reason: contains not printable characters */
    public static void m962(Object obj, Object obj2) {
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
                    ((CacheData) obj).setData((String) obj2);
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

    /* renamed from: ﻁﻍﺏﺡ  reason: contains not printable characters */
    public static void m963(Object obj, Object obj2) {
        int i = C0025.m1534();
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
                    ((CacheData) obj).setBy((String) obj2);
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
        int i4 = C0035.m1802();
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
                    System.out.println(Double.decode(C0046.m2100("rBX3pi0VurSn7tkGozJ767T3")));
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: ﻕﺥمغ  reason: contains not printable characters */
    public static void m964(Object obj) {
        int i = C0035.m1802();
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

    /* renamed from: ﻙهﻭﻩ  reason: contains not printable characters */
    public static String m965(Object obj) {
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
                    return ((Seedhub) obj).O;
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

    /* renamed from: ﻙﺫﻝق  reason: contains not printable characters */
    public static String m966(Object obj) {
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
                    return ((CacheData) obj).getTypeOnly();
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
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 800
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String categoryContent(java.lang.String r25, java.lang.String r26, boolean r27, java.util.HashMap<java.lang.String, java.lang.String> r28) {
        /*
            Method dump skipped, instructions count: 5554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Seedhub.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String str;
        String str2;
        String str3 = C0025.m1542(m946(), 1430, 4, 3181);
        String str4 = C0031.m1705();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject((String) C0035.m1801(list, 0));
            JSONArray jSONArray = new JSONArray();
            String str5 = C0024.m1512(C0022.m1450(jSONObject2, C0048.m2145(m946(), 1434, 6, 1611)));
            boolean z = C0037.m1888(str5, C0053.m2276(m946(), 1440, 10, 2600));
            String str6 = C0033.m1764(m946(), 1450, 1, 1268);
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
                        boolean z2 = C0037.m1888(str5, C0030.m1688(m946(), 1451, 6, 2629));
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
                                    StringBuilder sb = new StringBuilder();
                                    String str7 = m965(this);
                                    C0032.m1746(sb, C0028.m1620(str7, 0, C0049.m2185(str7, str6)));
                                    C0032.m1746(sb, str5);
                                    return super.detailContent(C0031.m1721(new String[]{new String(C0005.m179(C0007.m228(C0024.m1513(m946(), 1457, 20, 2663), C0028.m1633(C0043.m2039(sb), m951(this)), 1), 0))}));
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    case 239:
                        break;
                }
                i = 1678;
            }
            StringBuilder sb2 = new StringBuilder();
            String str8 = m965(this);
            C0032.m1746(sb2, C0028.m1620(str8, 0, C0049.m2185(str8, str6)));
            C0032.m1746(sb2, str5);
            JSONObject jSONObject3 = C0036.m1841(C0010.m316(new JSONObject(super.detailContent(new ArrayList(C0031.m1721(C0011.m339(C0007.m228(C0012.m361(m946(), 1477, 21, 1013), C0028.m1633(C0043.m2039(sb2), C0027.m1590(str4, str4, 3)), 1), C0038.m1903(m946(), 1498, 1, 1469)))))), str3), 0);
            String str9 = C0055.m2320(m946(), 1499, 12, 690);
            String str10 = C0009.m277(m946(), 1511, 13, 692);
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        if (jSONObject3 == null) {
                            break;
                        } else {
                            i3 = 48736;
                            continue;
                        }
                    case 47384:
                        str = str4;
                        str2 = str4;
                        break;
                    case 47417:
                        str = C0022.m1450(jSONObject3, str10);
                        str2 = C0022.m1450(jSONObject3, str9);
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
            boolean z3 = C0030.m1681(str2, C0049.m2175(m946(), 1524, 3, 2263));
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                        break;
                    case 53:
                        break;
                    case 503:
                        if (z3) {
                            break;
                        } else {
                            i5 = 49635;
                            continue;
                        }
                    case 32495:
                        C0005.m159(jSONObject2, str10, str);
                        C0005.m159(jSONObject2, str9, str2);
                        break;
                    default:
                        continue;
                }
                i5 = 48953;
            }
            boolean z4 = C0054.m2307(str2);
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        if (!z4) {
                            break;
                        } else {
                            i6 = 49759;
                            continue;
                        }
                    case 50:
                        break;
                    case 76:
                        String str11 = C0026.m1551(m946(), 1527, 3, 1179);
                        String str12 = C0054.m2301(m946(), 1530, 5, 2992);
                        C0005.m159(jSONObject2, str10, str11);
                        C0005.m159(jSONObject2, str9, str12);
                        break;
                    case 83:
                        break;
                    default:
                        continue;
                }
                i6 = 49728;
            }
            C0041.m1985(jSONArray, jSONObject2);
            C0005.m159(jSONObject, str3, jSONArray);
            return C0011.m335(jSONObject);
        } catch (Exception e) {
            m964(e);
            return str4;
        }
    }

    public String homeContent(boolean z) {
        String str = C0011.m328(m946(), 1535, 1, 2798);
        boolean z2 = C0037.m1888(C0049.m2191(m948(this)), C0032.m1749(m946(), 1536, 24, 2067));
        String str2 = C0031.m1705();
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
                    return str2;
                case 239:
                    try {
                        CacheData cacheData = m955(this);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (cacheData == null) {
                                        break;
                                    } else {
                                        i2 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = new ArrayList();
                                    JSONObject jSONObject = new JSONObject(C0056.m2359());
                                    C0003.m116(arrayList2, new rP(C0014.m421(m946(), 1560, 1, 1783), C0051.m2237(m946(), 1561, 2, 1811)));
                                    C0003.m116(arrayList2, new rP(C0040.m1953(m946(), 1563, 1, 2810), C0026.m1551(m946(), 1564, 2, 1826)));
                                    C0003.m116(arrayList2, new rP(C0039.m1937(m946(), 1566, 1, 657), C0053.m2276(m946(), 1567, 2, 2891)));
                                    int i3 = 0;
                                    kB kBVar = C0014.m434(C0004.m119(C0011.m353(m965(this), m951(this), 0)), C0004.m130(m946(), 1569, 29, 1136));
                                    while (true) {
                                        int i4 = C0014.m422(kBVar);
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = i3 < i4 ? 48736 : 48705;
                                                case 47384:
                                                    CacheData cacheData2 = new CacheData();
                                                    this.g = cacheData2;
                                                    m962(cacheData2, C0054.m2296(arrayList2, arrayList, jSONObject));
                                                    return C0054.m2296(arrayList2, arrayList, jSONObject);
                                                case 47417:
                                                    hN hNVar = (hN) C0038.m1913(kBVar, i3);
                                                    C0003.m107(hNVar);
                                                    String str3 = C0013.m381(C0000.m12(str, hNVar), C0045.m2098(m946(), 1598, 5, 2799));
                                                    String str4 = m961(this, C0013.m381(C0000.m12(C0038.m1903(m946(), 1603, 5, 449), hNVar), C0026.m1551(m946(), 1608, 3, 498)));
                                                    Iterator it = C0004.m122(C0014.m434(hNVar, C0015.m457(m946(), 1611, 5, 1684)));
                                                    int i6 = 1;
                                                    String str5 = str2;
                                                    while (true) {
                                                        boolean z3 = C0000.m11(it);
                                                        int i7 = 48767;
                                                        while (true) {
                                                            i7 ^= 48784;
                                                            switch (i7) {
                                                                case 14:
                                                                case 45:
                                                                    StringBuilder sb = new StringBuilder();
                                                                    C0032.m1746(sb, C0013.m381(C0000.m12(str, hNVar), C0024.m1513(m946(), 1618, 4, 1849)));
                                                                    C0032.m1746(sb, C0010.m296(m946(), 1622, 7, 2176));
                                                                    C0003.m116(arrayList, new ME(C0043.m2039(sb), str3, str4, str5, true));
                                                                    i3++;
                                                                    int i8 = 49914;
                                                                    while (true) {
                                                                        i8 ^= 49931;
                                                                        switch (i8) {
                                                                            case 497:
                                                                                i8 = 50596;
                                                                            case 1711:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 76:
                                                                    hN hNVar2 = (hN) C0026.m1556(it);
                                                                    int i9 = 48891;
                                                                    while (true) {
                                                                        i9 ^= 48908;
                                                                        switch (i9) {
                                                                            case 22:
                                                                            case 53:
                                                                                break;
                                                                            case 503:
                                                                                i9 = i6 == 2 ? 49635 : 48953;
                                                                            case 32495:
                                                                                C0039.m1941(C0022.m1427(hNVar2));
                                                                                break;
                                                                        }
                                                                    }
                                                                    boolean z4 = C0037.m1888(C0022.m1427(hNVar2), C0002.m57(m946(), 1616, 2, 2800));
                                                                    int i10 = 49666;
                                                                    while (true) {
                                                                        i10 ^= 49683;
                                                                        switch (i10) {
                                                                            case 17:
                                                                                i10 = z4 ? 49759 : 49728;
                                                                            case 50:
                                                                            case 76:
                                                                                str5 = C0032.m1737(C0014.m434(hNVar2, str));
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i6++;
                                                                    int i11 = 49790;
                                                                    while (true) {
                                                                        i11 ^= 49807;
                                                                        switch (i11) {
                                                                            case 18:
                                                                                break;
                                                                            case 241:
                                                                                i11 = 49821;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 239:
                                                                    i7 = z3 ? 48860 : 48829;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                    }
                                    break;
                                case 500:
                                    return m947(cacheData);
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    } catch (Exception e) {
                        C0043.m2037(C0003.m108(), e);
                        return str2;
                    }
                    break;
            }
            i = 1678;
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        int i;
        try {
            this.b = str;
            i = 1616;
        } catch (Exception e) {
            InitOrigin.show("");
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    super.init(context, C0048.m2145(f49short, 1629, 2, 2095));
                    int i2 = C0009.m276();
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (i2 > 0) {
                                    break;
                                } else {
                                    i3 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                System.out.println(Integer.valueOf(C0057.m2365("1NT")));
                                return;
                        }
                        i3 = 1802;
                    }
                    break;
                case 49:
                    i = 1647;
                    break;
            }
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = C0039.m1937(f49short, 1631, 1, 1073);
        try {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append(this.O);
            int i = 0;
            sb.append(String.format(C0041.m1994(f49short, 1632, 5, 2348), URLEncoder.encode(str)));
            kB cS = l3.tF(RS.SN(sb.toString(), q(), 0)).cS(C0051.m2237(f49short, 1637, 29, 1415));
            while (true) {
                int size = cS.size();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < size ? 1709 : 1678;
                        case 204:
                            hN hNVar = cS.get(i);
                            Objects.requireNonNull(hNVar);
                            String N = PA.yq(str2, hNVar).N(C0047.m2133(f49short, 1666, 5, 2236));
                            String N2 = PA.yq(C0039.m1937(f49short, 1671, 5, 2233), hNVar).N(C0041.m1994(f49short, 1676, 3, 2475));
                            Iterator<hN> it = hNVar.cS(C0014.m421(f49short, 1679, 5, 2489)).iterator();
                            String str3 = "";
                            int i3 = 1;
                            while (true) {
                                boolean hasNext = it.hasNext();
                                int i4 = 1740;
                                while (true) {
                                    i4 ^= 1757;
                                    switch (i4) {
                                        case 17:
                                            i4 = hasNext ? 1833 : 1802;
                                        case 54:
                                        case 471:
                                            arrayList.add(new ME(PA.yq(str2, hNVar).N(C0028.m1613(f49short, 1686, 4, 2926)) + C0006.m180(f49short, 1690, 7, 1210), N, N2, str3, true));
                                            i++;
                                            int i5 = 49666;
                                            while (true) {
                                                i5 ^= 49683;
                                                switch (i5) {
                                                    case 17:
                                                        i5 = 49697;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 500:
                                            hN next = it.next();
                                            int i6 = 1864;
                                            while (true) {
                                                i6 ^= 1881;
                                                switch (i6) {
                                                    case 17:
                                                        i6 = i3 == 2 ? 48736 : 48705;
                                                    case 47384:
                                                        break;
                                                    case 47417:
                                                        Yx.SN(next.Fo());
                                                        break;
                                                    case 47483:
                                                }
                                            }
                                            boolean contains = next.Fo().contains(C0046.m2123(f49short, 1684, 2, 2698));
                                            int i7 = 48767;
                                            while (true) {
                                                i7 ^= 48784;
                                                switch (i7) {
                                                    case 14:
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        str3 = next.cS(str2).t0();
                                                        break;
                                                    case 239:
                                                        i7 = contains ? 48860 : 48829;
                                                }
                                            }
                                            i3++;
                                            int i8 = 48891;
                                            while (true) {
                                                i8 ^= 48908;
                                                switch (i8) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i8 = 48922;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                            break;
                        case 239:
                            return iX.ee(arrayList);
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
