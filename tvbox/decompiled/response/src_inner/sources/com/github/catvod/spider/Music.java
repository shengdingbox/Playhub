package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.catvod.crawler.Spider;
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
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.Music;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
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
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.DialogInterface$OnDismissListenerC0194v3;
import com.github.catvod.spider.merge.Gd;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nl;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.g1;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.ByteArrayInputStream;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Music extends Spider {
    private static Sjyy Gc;
    private static boolean KJ;
    private static String M;

    /* renamed from: short */
    private static final short[] f36short = {1325, 1329, 1329, 1333, 1407, 1386, 1386, 1330, 1330, 1330, 1387, 1393, 1318, 1393, 1393, 1387, 1318, 1322, 1320, 1237, 1168, 1161, 1237, 1162, 1174, 1179, 1155, 1236, 1162, 1170, 1162, 2989, 2970, 2969, 2970, 2957, 2970, 2957, 906, 922, 923, 911, 950, 925, 902, 898, 908, 903, 2331, 2310, 2334, 2322, 2333, 2348, 2320, 2331, 2326, 2320, 2328, 2299, 2294, 2281, 2225, 2291, 2292, 2284, 2294, 2289, 2296, 2298, 2285, 2240, 2291, 2294, 2284, 2283, 2239, 2209, 2239, 2282, 2291, 2239, 2209, 2239, 2291, 2294, 2228, 2233, 2214, 2302, 2211, 2233, 2238, 2231, 2229, 2210, 2191, 2236, 2233, 2211, 2212, 2288, 2286, 2288, 2213, 2236, 2288, 2286, 2288, 2236, 2233, 3174, 3179, 3188, 3116, 3188, 3179, 3174, 3175, 3181, 3165, 3182, 3179, 3185, 3190, 3106, 3132, 3106, 3191, 3182, 3106, 3132, 3106, 3182, 3179, 804, 867, 870, 867, 868, 877, 865, 895, 853, 876, 870, 810, 820, 810, 870, 867, 663, 651, 646, 670, 651, 654, 660, 659, 660, 2274, 2210, 2221, 2209, 2217, 2284, 2221, 908, -26296, 18288, 20630, 24007, 23515, 23098, 31812, 32623, 30394, 30519, 25255, 2507, 18411, 28729, 25933, -24676, 2328, 938, 929, 947, 2964, 2958, 2969, 2970, 1076, 1071, 1077, 1072, 1066, 1069, 2916, 2820, 2845, 2847, 2916, 2056, 2060, 2054, 925, 924, 909, 1856, 1884, 1884, 1880, 1883, 1810, 1799, 1799, 1857, 1861, 1871, 1816, 1823, 1798, 1883, 1863, 1871, 1863, 1885, 1867, 1868, 1862, 1798, 1867, 1863, 1861, 1799, 1886, 1818, 1799, 1884, 1856, 1885, 1861, 1866, 1799, 1882, 1869, 1884, 1873, 1880, 1869, 1911, 1869, 1872, 1867, 1860, 1885, 1868, 1869, 1911, 1871, 1857, 1870, 1799, 1869, 1872, 1884, 1799, 1865, 1885, 1884, 1863, 1799, 1881, 1799, 1809, 1821, 1799, 1867, 1882, 1863, 1880, 1799, 1872, 1873, 1799, 1865, 1857, 1799, 1884, 1799, 1816, 1799, 1815, 1865, 1880, 1880, 1857, 1868, 1813, 1817, 1818, 1818, 1806, 1885, 1882, 1860, 1813, 1856, 1884, 1884, 1880, 1883, 1810, 1799, 1799, 1883, 1817, 1798, 1857, 1861, 1865, 1871, 1869, 1856, 1885, 1866, 1798, 1867, 1867, 1799, 1857, 1861, 1865, 1871, 1869, 1883, 1799, 1818, 1816, 1818, 1822, 1799, 1816, 1819, 1799, 1816, 1817, 1799, 1809, 1809, 1809, 1817, 1870, 1867, 1869, 1865, 1865, 1866, 1809, 1866, 1818, 1822, 1816, 1808, 1818, 1866, 1821, 1818, 1819, 1868, 1822, 1809, 1817, 1869, 1819, 1822, 1817, 1822, 1870, 1821, 1798, 1861, 1868, 1798, 1858, 1880, 1871, 2458, 2492, 2474, 2493, 2530, 2446, 2472, 2474, 2465, 2491, 798, 828, 809, 826, 831, 831, 818, 892, 870, 893, 867, 883, 891, 772, 826, 829, 823, 828, 804, 800, 883, 797, 775, 883, 866, 867, 893, 867, 872, 883, 772, 796, 772, 869, 871, 890, 883, 786, 803, 803, 831, 822, 772, 822, 817, 792, 826, 807, 892, 870, 864, 868, 893, 864, 869, 883, 891, 792, 795, 775, 798, 799, 895, 883, 831, 826, 824, 822, 883, 788, 822, 816, 824, 828, 890, 883, 784, 827, 801, 828, 830, 822, 892, 875, 869, 893, 867, 893, 871, 865, 871, 867, 893, 866, 874, 875, 883, 768, 818, 821, 818, 801, 826, 892, 870, 864, 868, 893, 864, 869, 595, 639, 639, 635, 633, 629, 1089, 1091, 1091, 1093, 1104, 1108, 2061, 2076, 2049, 2061, 2134, 2065, 2061, 2068, 2069, 2133, 2072, 2057, 2057, 2069, 2064, 2074, 2072, 2061, 2064, 2070, 2071, 2134, 2049, 2065, 2061, 2068, 2069, 2130, 2049, 2068, 2069, 2133, 2072, 2057, 2057, 2069, 2064, 2074, 2072, 2061, 2064, 2070, 2071, 2134, 2049, 2068, 2069, 2114, 2056, 2116, 2121, 2135, 2112, 2133, 2064, 2068, 2072, 2078, 2076, 2134, 2072, 2063, 2064, 2079, 2133, 2064, 2068, 2072, 2078, 2076, 2134, 2062, 2076, 2075, 2057, 2133, 2064, 2068, 2072, 2078, 2076, 2134, 2072, 2057, 2071, 2078, 2133, 2131, 2134, 2131, 2114, 2056, 2116, 2121, 2135, 2113, 2133, 2072, 2057, 2057, 2069, 2064, 2074, 2072, 2061, 2064, 2070, 2071, 2134, 2058, 2064, 2078, 2071, 2076, 2077, 2132, 2076, 2049, 2074, 2065, 2072, 2071, 2078, 2076, 2114, 2063, 2116, 2075, 2122, 2114, 2056, 2116, 2121, 2135, 2126, 2056, 2111, 2108, 2111, 2088, 2111, 2088, 2694, 2711, 2711, 2699, 2702, 2692, 2694, 2707, 2702, 2696, 2697, 2760, 2696, 2692, 2707, 2762, 2708, 2707, 2709, 2690, 2694, 2698, 2452, 2457, 2448, 2437, 2924, 2928, 2921, 2920, 1857, 1872, 1869, 1857, 1818, 1885, 1857, 1880, 1881, 622, 621, 621, 611, 620, 635, 548, 550, 571, 556, 557, 619, 560, 571, 617, 573, 570, 548, 545, 544, 626, 567, 551, 548, 617, 537, 545, 551, 573, 567, 626, 544, 557, 548, 561, 617, 544, 561, 556, 544, 626, 575, 547, 617, 627, 628, 639, 628, 561, 570, 567, 571, 560, 561, 513, 518, 541, 535, 571, 569, 548, 571, 570, 561, 570, 544, 636, 575, 547, 637, 623, 606, 628, 628, 628, 628, 628, 628, 546, 565, 550, 628, 556, 572, 550, 628, 617, 628, 570, 561, 547, 628, 524, 537, 536, 540, 544, 544, 548, 518, 561, 549, 545, 561, 551, 544, 636, 637, 623, 606, 628, 628, 628, 628, 628, 628, 556, 572, 550, 634, 571, 548, 561, 570, 636, 627, 531, 529, 512, 627, 632, 628, 565, 548, 573, 513, 550, 568, 632, 628, 544, 550, 545, 561, 637, 623, 606, 628, 628, 628, 628, 628, 628, 556, 572, 550, 634, 551, 561, 570, 560, 636, 637, 623, 606, 628, 628, 628, 628, 553, 606, 628, 628, 616, 635, 551, 567, 550, 573, 548, 544, 618, 606, 616, 635, 566, 571, 560, 557, 618, 606, 616, 635, 572, 544, 569, 568, 618, 606, 1169, 1152, 1181, 1169, 3070, 3042, 1599, 1598, 1580, 1607, 1618, 603, 834, 1515, 1516, 1522, 1527, 1526, 1497, 1516, 1507, 1519, 1511, 1471, 1505, 1521, 1520, 1508, 1501, 1526, 1517, 1513, 1511, 1516, 1503, 567, 544, 557, 564, 548, 3175, 3190, 3172, 3172, 3156, 3190, 3175, 3171, 3188, 3199, 3190, 3117, 3127, 3188, 3172, 3173, 3185, 3144, 3171, 3192, 3196, 3186, 3193, 3127, 3193, 3192, 3171, 3127, 3185, 3192, 3170, 3193, 3187, 2035, 2019, 2018, 2038, 1999, 2020, 2047, 2043, 2037, 2046, 2485, 2472, 2480, 2492, 2483, 2434, 2494, 2485, 2488, 2494, 2486, 475, 474, 927, 905, 920, 961, 
    911, 899, 899, 903, 901, 905, 1883, 1885, 1905, 1896, 1915, 1915, -29179, -30111, 21655, 25070, 30928, 21633, -28452, -29121, 1469, 1471, 32518, 30032, 21522, -30160, -1307, 23111, 18952, 26498, 32232, 25077, 30923, 22025, 26711, 25336, 31686, 2188, 2192, 2186, 303, 307, 297, 357, 374, 357, 22311, 24788, 31210, 1256, 28548, 25303, 1255, 28548, 20677, 2168, 2148, 2148, 2144, 2147, 2090, 2111, 2111, 2169, 2173, 2167, 2080, 2087, 2110, 2147, 2175, 2167, 2175, 2149, 2163, 2164, 2174, 2110, 2163, 2175, 2173, 2111, 2150, 2082, 2111, 2148, 2168, 2149, 2173, 2162, 2111, 2146, 2165, 2148, 2153, 2144, 2165, 2127, 2165, 2152, 2163, 2172, 2149, 2164, 2165, 2127, 2167, 2169, 2166, 2111, 2165, 2152, 2148, 2111, 2161, 2149, 2148, 2175, 2111, 2145, 2111, 2089, 2085, 2111, 2163, 2146, 2175, 2144, 2111, 2152, 2153, 2111, 2161, 2169, 2111, 2148, 2111, 2080, 2111, 2095, 2161, 2144, 2144, 2169, 2164, 2093, 2081, 2082, 2082, 2102, 2149, 2146, 2172, 2093, 2168, 2148, 2148, 2144, 2147, 2090, 2111, 2111, 2147, 2081, 2110, 2169, 2173, 2161, 2167, 2165, 2168, 2149, 2162, 2110, 2163, 2163, 2111, 2169, 2173, 2161, 2167, 2165, 2147, 2111, 2082, 2080, 2082, 2086, 2111, 2080, 2083, 2111, 2080, 2081, 2111, 2089, 2089, 2089, 2081, 2166, 2163, 2165, 2161, 2161, 2162, 2089, 2162, 2082, 2086, 2080, 2088, 2082, 2162, 2085, 2082, 2083, 2164, 2086, 2089, 2081, 2165, 2083, 2086, 2081, 2086, 2166, 2085, 2110, 2173, 2164, 2110, 2170, 2144, 2167, 1172, 1160, 1170, 1246, 1229, 1246, 1793, 1863, 1883, 1858, 1859, 27921, 26297, -29149, 20693, 26028, 31890, -30083, 944, 1004, 1008, 944, 3300, 3320, 3320, 3324, 3327, 3254, 3235, 3235, 3301, 3297, 3307, 3260, 3259, 3234, 3327, 3299, 3307, 3299, 3321, 3311, 3304, 3298, 3234, 3311, 3299, 3297, 3235, 3322, 3262, 3235, 3320, 3300, 3321, 3297, 3310, 3235, 3326, 3305, 3320, 3317, 3324, 3305, 3283, 3305, 3316, 3311, 3296, 3321, 3304, 3305, 3283, 3307, 3301, 3306, 3235, 3305, 3316, 3320, 3235, 3309, 3321, 3320, 3299, 3235, 3325, 3235, 3253, 3257, 3235, 3311, 3326, 3299, 3324, 3235, 3316, 3317, 3235, 3309, 3301, 3235, 3320, 3235, 3260, 3235, 3251, 3309, 3324, 3324, 3301, 3304, 3249, 3261, 3262, 3262, 3242, 3321, 3326, 3296, 3249, 3300, 3320, 3320, 3324, 3327, 3254, 3235, 3235, 3327, 3261, 3234, 3301, 3297, 3309, 3307, 3305, 3300, 3321, 3310, 3234, 3311, 3311, 3235, 3301, 3297, 3309, 3307, 3305, 3327, 3235, 3262, 3260, 3262, 3258, 3235, 3260, 3258, 3235, 3262, 3261, 3235, 3252, 3304, 3252, 3256, 3304, 3261, 3259, 3261, 3256, 3304, 3257, 3253, 3258, 3310, 3256, 3309, 3306, 3260, 3304, 3258, 3262, 3253, 3310, 3259, 3262, 3252, 3258, 3256, 3260, 3305, 3258, 3304, 3234, 3297, 3304, 3234, 3302, 3324, 3305, 3307, 2773, 1456, 1518, 1522, 1535, 1511, 1473, 1522, 1527, 1517, 1514, 1470, 1526, 1455, 1479, 1463, 3020, 2962, 2958, 2947, 2971, 3005, 2958, 2955, 2961, 2966, 3010, 3036, 3010, 2967, 2958, 3010, 3036, 3010, 2958, 2955, 2485, 2549, 2554, 2550, 2558, 2491, 2554, 2480, 2474, 2493, 2494, 2506, 2503, 2520, 2432, 2526, 2498, 2511, 2519, 2545, 2498, 2507, 2504, 2522, 1180, 1176, 1170, 1023, 1022, 1007, 1432, 1412, 1412, 1408, 1411, 1482, 1503, 1503, 1433, 1437, 1431, 1472, 1479, 1502, 1411, 1439, 1431, 1439, 1413, 1427, 1428, 1438, 1502, 1427, 1439, 1437, 1503, 1414, 1474, 1503, 1412, 1432, 1413, 1437, 1426, 1503, 1410, 1429, 1412, 1417, 1408, 1429, 1455, 1429, 1416, 1427, 1436, 1413, 1428, 1429, 1455, 1431, 1433, 1430, 1503, 1429, 1416, 1412, 1503, 1425, 1413, 1412, 1439, 1503, 1409, 1503, 1481, 1477, 1503, 1427, 1410, 1439, 1408, 1503, 1416, 1417, 1503, 1425, 1433, 1503, 1412, 1503, 1472, 1503, 1487, 1425, 1408, 1408, 1433, 1428, 1485, 1473, 1474, 1474, 1494, 1413, 1410, 1436, 1485, 1432, 1412, 1412, 1408, 1411, 1482, 1503, 1503, 1411, 1473, 1502, 1433, 1437, 1425, 1431, 1429, 1432, 1413, 1426, 1502, 1427, 1427, 1503, 1433, 1437, 1425, 1431, 1429, 1411, 1503, 1474, 1472, 1474, 1478, 1503, 1472, 1475, 1503, 1472, 1473, 1503, 1481, 1481, 1481, 1473, 1430, 1427, 1429, 1425, 1425, 1426, 1481, 1426, 1474, 1478, 1472, 1480, 1474, 1426, 1477, 1474, 1475, 1428, 1478, 1481, 1473, 1429, 1475, 1478, 1473, 1478, 1430, 1477, 1502, 1437, 1428, 1502, 1434, 1408, 1431, 3080, 1447, 1508, 1535, 2252, 2191, 2196, 2242, 2179, 1434, 1530, 1507, 1505, 1427, 1981, 974, 974, 974, 24683, 21076, 1590, 1589, 1588, 1587, 1586, 1585, 1584, 1599, 1598, 1597, 1596, 1595, 1594, 1593, 1592, 1575, 1574, 1573, 1572, 1571, 1570, 1569, 1568, 1583, 1582, 1581, 1558, 1557, 1556, 1555, 1554, 1553, 1552, 1567, 1566, 1565, 1564, 1563, 1562, 1561, 1560, 1543, 1542, 1541, 1540, 1539, 1538, 1537, 1536, 1551, 1550, 1549, 1607, 1606, 1605, 1604, 1603, 1602, 1601, 1600, 1615, 1614, 2947, 2971, 2947, 2944, 2966, 2944, 2944, 2970, 2967, 3054, 1841, 1852, 1827, 1915, 1829, 1824, 1849, 1849, 1912, 1831, 1852, 1842, 1853, 1825, 1909, 1899, 1909, 1841, 1852, 1827, 1909, 1899, 1909, 1824, 1849, 1909, 1899, 1909, 1849, 1852, 1909, 1899, 1909, 1844, 399, 405, 386, 385, 2226, 2292, 2280, 2289, 2288, 1848, 1829, 1848, 1824, 1833, 3017, 3029, 3023, -11517, -10701, 28450, 30236, 552, 976, 982, 1018, 995, 1008, 1008, 1105, 1100, 1032, 2466, 2858, 2873, 2876, 2865, 2871, 1934, 1985, 2009, 2015, 1989, 1999, 1934, 1920, 1934, 1924, 1922, 1926, 1939, 1925, 1934, 904, 904, 904, 904, 956, 956, 917, 917, 953, 953, 924, 924, 1431, 1434, 2374, 2379, 2370, 2391, 2002, 1994, 1996, 2006, 2012, 3041, 3055, 3059, 3166, 3081, 3166, 3166, 27168, -30047, 2468, 2559, 2548, 2470, 2550, 2542, 2536, 2546, 2552, 2519, 2537, 2552, 2493, 2552, 2536, 2539, 2470, 2536, 2545, 2530, 2530, 3083, 3097, 3097, 2324, 2312, 2312, 2316, 2374, 2387, 2387, 2315, 2315, 2315, 2386, 2376, 2335, 2376, 2376, 2386, 2335, 2323, 2321, 2387, 2328, 2333, 2312, 2333, 2387, 2328, 2323, 2315, 2322, 2386, 2316, 2324, 2316, 2371, 2333, 2335, 2369, 2314, 2316, 2320, 2333, 2309, 2394, 2325, 2328, 2369, 2393, 2319, 2394, 2317, 2369, 2381, 2380, 2372, 2380, 2161, 2157, 2157, 2153, 2083, 2102, 2102, 2722, 2721, 2721, 2735, 2720, 2743, 2792, 2794, 2807, 2784, 2785, 2727, 2812, 2807, 2725, 2801, 2806, 2792, 2797, 2796, 2750, 2811, 2795, 
    2792, 2725, 2773, 2797, 2795, 2801, 2811, 2750, 2796, 2785, 2792, 2813, 2725, 2800, 2796, 2805, 2804, 19646, 30441, 23663, 19488, 25002, 31680, 24681, -27712, 20977, 917, 919, 31022, 26589, 32483};
    private String N;
    private AlertDialog i;
    private boolean tF;
    private boolean zH;
    private String yq = C0054.m2301(m857(), 0, 19, 1349);
    private String SN = C0032.m1739(new StringBuilder(), m869(this), C0026.m1551(m857(), 19, 12, 1274));
    private final SecureRandom t0 = new SecureRandom();

    /* renamed from: com.github.catvod.spider.Music$1 */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class Sjyy {

        /* renamed from: short */
        private static final short[] f37short = {2705, 2701, 2701, 2697, 2698, 2755, 2774, 2774, 2704, 2708, 2718, 2761, 2766, 2775, 2698, 2710, 2718, 2710, 2700, 2714, 2717, 2711, 2775, 2714, 2710, 2708, 2774, 2703, 2763, 2774, 2701, 2705, 2700, 2708, 2715, 2774, 2699, 2716, 2701, 2688, 2697, 2716, 2726, 2716, 2689, 2714, 2709, 2700, 2717, 2716, 2726, 2718, 2704, 2719, 2774, 2716, 2689, 2701, 2774, 2712, 2700, 2701, 2710, 2774, 2696, 2774, 2752, 2764, 2774, 2714, 2699, 2710, 2697, 2774, 2689, 2688, 2774, 2712, 2704, 2774, 2701, 2774, 2761, 2774, 2758, 2712, 2697, 2697, 2704, 2717, 2756, 2760, 2763, 2763, 2783, 2700, 2699, 2709, 2756, 2705, 2701, 2701, 2697, 2698, 2755, 2774, 2774, 2704, 2708, 2718, 2775, 2719, 2709, 2708, 2697, 2762, 2775, 2697, 2699, 2710, 2774, 2704, 2708, 2712, 2718, 2716, 2774, 2763, 2761, 2763, 2765, 2761, 2766, 2761, 2753, 2774, 2763, 2761, 2763, 2765, 2761, 2766, 2761, 2753, 2763, 2763, 2763, 2760, 2764, 2763, 2726, 2765, 2752, 2764, 2775, 2702, 2716, 2715, 2697};
        @SerializedName("title")
        private String N;
        @SerializedName("pic")
        private String SN;
        @SerializedName("lrc")
        private String tF;
        @SerializedName("url")
        private String yq;

        /* renamed from: جﺫﻱر */
        public static String m883(Object obj) {
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
                        return ((Sjyy) obj).yq;
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

        /* renamed from: صدﺥﻱ */
        public static String m884(Object obj) {
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
                        return ((Sjyy) obj).tF;
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

        /* renamed from: ﺭﻱسﺯ */
        public static short[] m885() {
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
                        return f37short;
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

        /* renamed from: ﻍﺥفخ */
        public static String m886(Object obj) {
            int i = C0053.m2279();
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
                        return ((Sjyy) obj).SN;
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

        /* renamed from: ﻩمﻁﻱ */
        public static String m887(Object obj) {
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
                        return ((Sjyy) obj).N;
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

        public String getLrc() {
            return m884(this);
        }

        public String getPic() {
            boolean z = C0020.m1370(m886(this));
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
                        String str = m886(this);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    return str;
                            }
                        }
                        break;
                    case 239:
                        return C0000.m18(m885(), 0, 159, 2809);
                }
                i = 1678;
            }
        }

        public String getTitle() {
            return m887(this);
        }

        public String getUrl() {
            return m883(this);
        }
    }

    public Music() {
        int i = C0006.m193();
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
                    System.out.println(Integer.decode(C0040.m1943("BcxW")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[FALL_THROUGH, PHI: r0 
      PHI: (r0v12 java.lang.String) = (r0v6 java.lang.String), (r0v6 java.lang.String), (r0v8 java.lang.String), (r0v11 java.lang.String) binds: [B:4:0x003e, B:11:0x0060, B:25:0x008a, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String Gc(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            java.util.HashMap r0 = m862(r5)     // Catch: java.lang.Exception -> L96
            short[] r1 = m857()     // Catch: java.lang.Exception -> L96
            r2 = 31
            r3 = 7
            r4 = 3071(0xbff, float:4.303E-42)
            java.lang.String r1 = com.github.catvod.spider.merge.C0040.m1953(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = m869(r5)     // Catch: java.lang.Exception -> L96
            com.github.catvod.spider.C0042.m1999(r0, r1, r2)     // Catch: java.lang.Exception -> L96
            java.util.HashMap r0 = m862(r5)     // Catch: java.lang.Exception -> L96
            okhttp3.Response r0 = m881(r6, r0)     // Catch: java.lang.Exception -> L96
            okhttp3.ResponseBody r0 = m872(r0)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = m879(r0)     // Catch: java.lang.Exception -> L96
            short[] r1 = m857()     // Catch: java.lang.Exception -> L96
            r2 = 38
            r3 = 10
            r4 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r1 = com.github.catvod.spider.C0055.m2320(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L96
            boolean r2 = com.github.catvod.spider.merge.C0037.m1888(r0, r1)     // Catch: java.lang.Exception -> L96
            r1 = 1616(0x650, float:2.264E-42)
        L3c:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L42;
                case 49: goto L45;
                case 204: goto L4a;
                case 239: goto L89;
                default: goto L41;
            }     // Catch: java.lang.Exception -> L96
        L41:
            goto L3c
        L42:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L3c
        L45:
            if (r2 == 0) goto L42
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L3c
        L4a:
            short[] r1 = m857()     // Catch: java.lang.Exception -> L96
            r2 = 48
            r3 = 11
            r4 = 2419(0x973, float:3.39E-42)
            java.lang.String r1 = com.github.catvod.spider.merge.C0036.m1850(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L96
            boolean r2 = com.github.catvod.spider.merge.C0037.m1888(r0, r1)     // Catch: java.lang.Exception -> L96
            r1 = 1740(0x6cc, float:2.438E-42)
        L5e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L64;
                case 54: goto L69;
                case 471: goto L89;
                case 500: goto L6c;
                default: goto L63;
            }     // Catch: java.lang.Exception -> L96
        L63:
            goto L5e
        L64:
            if (r2 == 0) goto L69
            r1 = 1833(0x729, float:2.569E-42)
            goto L5e
        L69:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L5e
        L6c:
            r1 = 1864(0x748, float:2.612E-42)
        L6e:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L74;
                case 47384: goto L8a;
                case 47417: goto L7e;
                case 47483: goto L7a;
                default: goto L73;
            }     // Catch: java.lang.Exception -> L96
        L73:
            goto L6e
        L74:
            if (r7 == 0) goto L7a
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L6e
        L7a:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L6e
        L7e:
            java.lang.String r0 = com.github.catvod.spider.C0053.m2272(r5)     // Catch: java.lang.Exception -> L96
            r5.N = r0     // Catch: java.lang.Exception -> L96
            r0 = 0
            java.lang.String r0 = m867(r5, r6, r0)     // Catch: java.lang.Exception -> L96
        L89:
            return r0
        L8a:
            m855(r5, r0)     // Catch: java.lang.Exception -> L96
            java.util.HashMap r0 = m862(r5)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = com.github.catvod.parser.C0001.m32(r6, r0)     // Catch: java.lang.Exception -> L96
            goto L89
        L96:
            r0 = move-exception
            java.io.PrintStream r1 = com.github.catvod.parser.C0003.m108()
            com.github.catvod.spider.C0043.m2037(r1, r0)
            java.lang.String r0 = com.github.catvod.spider.merge.C0031.m1705()
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Music.Gc(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0295, code lost:
        com.github.catvod.parser.C0003.m116(r4, new com.github.catvod.spider.merge.ME(r2, r1, r0));
        r0 = 53510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02a0, code lost:
        r0 = r0 ^ 53527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a4, code lost:
        switch(r0) {
            case 17: goto L256;
            case 50: goto L165;
            default: goto L258;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02a8, code lost:
        r0 = 53541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01df, code lost:
        r2 = com.github.catvod.parser.C0014.m434(r0, r3);
        r8 = com.github.catvod.spider.C0043.m2020(m857(), 188, 4, 3068);
        r2 = com.github.catvod.spider.merge.C0023.m1479(r2, r8);
        r10 = com.github.catvod.spider.C0054.m2307(r2);
        r3 = 51836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fb, code lost:
        r3 = r3 ^ 51853;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ff, code lost:
        switch(r3) {
            case 241: goto L226;
            case 1963: goto L227;
            case 1992: goto L229;
            case 2025: goto L228;
            default: goto L233;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0203, code lost:
        if (r10 == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0205, code lost:
        r3 = 52580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0209, code lost:
        r3 = 52549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020d, code lost:
        r2 = com.github.catvod.spider.merge.C0023.m1479(com.github.catvod.parser.C0014.m434(r0, r9), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0215, code lost:
        r8 = com.github.catvod.spider.merge.C0037.m1888(r14, com.github.catvod.spider.C0051.m2237(m857(), 192, 6, 1113));
        r3 = 52611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0229, code lost:
        r3 = r3 ^ 52628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x022d, code lost:
        switch(r3) {
            case 23: goto L236;
            case 54: goto L237;
            case 85: goto L239;
            case 116: goto L238;
            default: goto L243;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0231, code lost:
        if (r8 == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0233, code lost:
        r3 = 52704;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0237, code lost:
        r3 = 52673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x023b, code lost:
        r2 = com.github.catvod.spider.C0048.m2149(r1, com.github.catvod.spider.C0050.m2224(m857(), 198, 5, 2889), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024c, code lost:
        r0 = com.github.catvod.spider.merge.C0023.m1479(com.github.catvod.parser.C0014.m434(r0, com.github.catvod.parser.C0012.m361(m857(), 203, 3, 2145)), com.github.catvod.spider.merge.C0023.m1457(m857(), 206, 3, 1006));
        r8 = com.github.catvod.spider.C0054.m2307(r0);
        r3 = 52735;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0275, code lost:
        r3 = r3 ^ 52752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0279, code lost:
        switch(r3) {
            case 14: goto L246;
            case 45: goto L249;
            case 1007: goto L247;
            case 7927: goto L248;
            default: goto L253;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027d, code lost:
        r3 = 52797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0281, code lost:
        if (r8 == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0283, code lost:
        r3 = 53479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0287, code lost:
        r0 = com.github.catvod.spider.C0044.m2052(m857(), 209, 179, 1832);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.github.catvod.spider.merge.ME> KJ(com.github.catvod.spider.merge.Va r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Music.KJ(com.github.catvod.spider.merge.Va, java.lang.String, java.lang.String):java.util.List");
    }

    private HashMap<String, String> M() {
        HashMap<String, String> hashMap = new HashMap<>();
        C0042.m1999(hashMap, C0041.m1994(m857(), 388, 10, 2511), C0000.m18(m857(), 398, 110, 851));
        boolean z = C0029.m1658(m861(this));
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
                    C0042.m1999(hashMap, C0021.m1417(m857(), 508, 6, 528), m861(this));
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        C0042.m1999(hashMap, C0026.m1551(m857(), 514, 6, 1056), C0051.m2237(m857(), 520, 135, 2169));
        C0042.m1999(hashMap, C0029.m1635(m857(), 655, 7, 2138), m869(this));
        return hashMap;
    }

    public static /* synthetic */ void N(String str) {
        boolean z = C0020.m1370(str);
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
                    M = str;
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    public static /* synthetic */ void SN(Music music) {
        music.tF = false;
        int i = C0033.m1755();
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
                    System.out.println(Double.decode(C0023.m1460("spu4juKxAD4peq3GJvenTbkXPqel")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    public static void i(Music music) {
        g1 g1Var = null;
        String str = "ۣۢ۟";
        while (true) {
            switch (C0002.m76(str)) {
                case 1748704:
                    return;
                case 1750624:
                    music.zH = true;
                    str = "ۦۦۨ";
                    break;
                case 1754654:
                    C0057.m2371(g1Var);
                    str = "ۡۢۡ";
                    break;
                case 1755621:
                    g1Var = new g1(music, 5);
                    str = "ۧۨ۟";
                    break;
                default:
                    m865(music);
                    str = "ۨۨۥ";
                    break;
            }
        }
    }

    public static Object[] proxy() {
        String str = "۠ۡۡ";
        List list = null;
        short[] sArr = null;
        ByteArrayInputStream byteArrayInputStream = null;
        Object[] objArr = null;
        Sjyy sjyy = null;
        Integer num = null;
        String str2 = null;
        byte[] bArr = null;
        String str3 = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56383:
                    objArr[2] = byteArrayInputStream;
                    str = "ۢۢ";
                    break;
                case 1747712:
                    sjyy = m880();
                    str = "ۧۤۦ";
                    break;
                case 1747746:
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    str = "ۢۡ";
                    break;
                case 1747897:
                    objArr[1] = str2;
                    str = "ۨۧۨ";
                    break;
                case 1748800:
                    num = C0053.m2274(200);
                    str = "ۢۦۥ";
                    break;
                case 1749788:
                    list = C0029.m1656(str3);
                    str = "ۣۣۢ";
                    break;
                case 1749793:
                    objArr[0] = num;
                    str = "ۥۢ۟";
                    break;
                case 1750658:
                    str3 = C0044.m2049(list);
                    str = "ۤۥۧ";
                    break;
                case 1750780:
                    str2 = C0050.m2224(sArr, 662, 22, 2791);
                    str = "۠ۧ۠";
                    break;
                case 1751686:
                    objArr = new Object[3];
                    str = "ۡۥۤ";
                    break;
                case 1752546:
                    sArr = m857();
                    str = "ۣۧ۠";
                    break;
                case 1754537:
                    str3 = m875(sjyy);
                    str = "ۢۦ۠";
                    break;
                case 1755593:
                    bArr = C0051.m2233(str3);
                    str = "۠ۢۤ";
                    break;
                default:
                    return objArr;
            }
        }
    }

    public static Object[] proxyInput(Map<String, String> map) {
        String str = C0002.m57(m857(), 684, 4, 2528);
        boolean z = C0022.m1448(C0049.m2175(m857(), 688, 4, 2820), C0000.m15(map, str));
        String str2 = C0012.m361(m857(), 692, 9, 1845);
        Integer num = C0053.m2274(200);
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
                    String str3 = C0021.m1416();
                    StringBuilder sb = new StringBuilder();
                    C0032.m1746(sb, C0032.m1740());
                    C0032.m1746(sb, str3);
                    C0032.m1746(sb, C0013.m380(m857(), 701, 199, 596));
                    return new Object[]{num, str2, new ByteArrayInputStream(C0051.m2233(C0043.m2039(sb)))};
                case 239:
                    boolean z2 = C0022.m1448(C0051.m2237(m857(), 900, 4, 1253), C0000.m15(map, str));
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
                                try {
                                    String str4 = C0036.m1853(C0039.m1929((String) C0000.m15(map, C0038.m1903(m857(), 904, 2, 2965)), C0009.m277(m857(), 906, 5, 1642)), C0020.m1390(m857(), 911, 1, 635), C0057.m2384(m857(), 912, 1, 873));
                                    boolean z3 = C0029.m1658(str4);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                if (z3) {
                                                    break;
                                                } else {
                                                    i3 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                break;
                                            case 47417:
                                                M = str4;
                                                return new Object[]{num, str2, new ByteArrayInputStream(new byte[0])};
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i3 = 48705;
                                    }
                                } catch (Exception e) {
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
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    return null;
            }
            i = 1678;
        }
    }

    private void q(String str) {
        try {
            String str2 = C0023.m1479(C0014.m434(C0004.m119(str), C0042.m2010(m857(), 913, 22, 1410)), C0049.m2175(m857(), 935, 5, 577));
            boolean z = C0029.m1658(str2);
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
                        m871(C0056.m2339(m857(), 940, 33, 3095));
                        return;
                    case 239:
                        HashMap hashMap = new HashMap();
                        C0042.m1999(hashMap, C0054.m2301(m857(), 973, 10, 1936), str2);
                        C0042.m1999(hashMap, C0052.m2261(m857(), 983, 11, 2525), C0037.m1882(m857(), 994, 2, 436));
                        Response response = m882(m869(this), hashMap, m862(this));
                        Map map = m868(m860(response));
                        boolean z2 = C0021.m1410(map, C0028.m1613(m857(), 996, 10, 1004));
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
                                    String str3 = C0037.m1863(map);
                                    boolean z3 = C0029.m1658(str3);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                if (z3) {
                                                    break;
                                                } else {
                                                    i3 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                break;
                                            case 47417:
                                                this.N = str3;
                                                C0002.m78(C0054.m2301(m857(), 1006, 6, 1794), str3);
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i3 = 48705;
                                    }
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        m879(m872(response));
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    return;
                                case 239:
                                    i4 = 48798;
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            m859(e);
        }
    }

    private void t0() {
        try {
            AlertDialog alertDialog = m873(this);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (alertDialog == null) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        C0042.m2012(alertDialog);
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        i2 = 1771;
                        break;
                    case 54:
                        return;
                }
            }
        }
    }

    public static /* synthetic */ void tF(Music music) {
        boolean z = m870(music);
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
                    music.tF = false;
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        music.zH = false;
    }

    public static void yq(Music music, EditText editText) {
        String str = "ۨۥ۟";
        Gd gd = null;
        String str2 = null;
        Editable editable = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 1749579:
                    return;
                case 1749827:
                    gd = new Gd(str2, 5);
                    str = "ۥۦۢ";
                    break;
                case 1752673:
                    C0038.m1909(gd);
                    str = "ۢ۟ۨ";
                    break;
                case 1752740:
                    editable = C0055.m2326(editText);
                    str = "ۦۥۥ";
                    break;
                case 1753606:
                    str2 = C0050.m2227(editable);
                    str = "ۡۨۢ";
                    break;
                case 1755522:
                    C0003.m107(music);
                    str = "ۥۨۧ";
                    break;
                default:
                    m865(music);
                    str = "ۢۧۨ";
                    break;
            }
        }
    }

    public static void zH(Music music) {
        C0003.m107(music);
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            C0007.m224(layoutParams, C0038.m1895(16), C0038.m1895(16), C0038.m1895(16), C0038.m1895(16));
            FrameLayout frameLayout = new FrameLayout(C0010.m312());
            final EditText editText = new EditText(C0010.m312());
            C0015.m459(frameLayout, editText, layoutParams);
            AlertDialog alertDialog = C0026.m1570(C0023.m1485(C0057.m2373(C0037.m1883(C0044.m2078(C0014.m415(new AlertDialog.Builder(C0022.m1444()), C0051.m2237(m857(), 1012, 8, 1522)), frameLayout), C0015.m457(m857(), 1020, 13, 1513), new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.OI
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Music.i(Music.this);
                }
            }), C0042.m2010(m857(), 1033, 2, 1503), null), C0036.m1850(m857(), 1035, 2, 1764), new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.y5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Music.yq(Music.this, editText);
                }
            }));
            music.i = alertDialog;
            C0056.m2346(alertDialog, new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.FY
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Music.tF(Music.this);
                }
            });
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

    /* renamed from: بﺹﻡس */
    public static void m855(Object obj, Object obj2) {
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
                    ((Music) obj).q((String) obj2);
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

    /* renamed from: تﻕوا */
    public static boolean m856(Object obj) {
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
                    return ((Music) obj).tF;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: حعﻱه */
    public static short[] m857() {
        int i = C0004.m129();
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
                    return f36short;
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

    /* renamed from: ذﺕﺭح */
    public static SecureRandom m858(Object obj) {
        int i = C0045.m2093();
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
                    return ((Music) obj).t0;
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

    /* renamed from: ذﺥـج */
    public static void m859(Object obj) {
        int i = C0026.m1561();
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
        int i4 = C0023.m1475();
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
                    System.out.println(Long.parseLong(C0047.m2135("QhETKsB2cmiM1iKPfUmlEJz")));
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: زربﺏ */
    public static Headers m860(Object obj) {
        int i = C0005.m152();
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
                    return ((Response) obj).headers();
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

    /* renamed from: ظنفﻁ */
    public static String m861(Object obj) {
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
                    return ((Music) obj).N;
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

    /* renamed from: عازﻱ */
    public static HashMap m862(Object obj) {
        int i = C0053.m2279();
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
                    return ((Music) obj).M();
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

    /* renamed from: عﺽخق */
    public static boolean m863() {
        int i = C0053.m2279();
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
                    return KJ;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: غضﺩظ */
    public static List m864(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = C0023.m1475();
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
                    return ((Music) obj).KJ((Va) obj2, (String) obj3, (String) obj4);
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

    /* renamed from: فهﺫﻭ */
    public static void m865(Object obj) {
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
                    ((Music) obj).t0();
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

    /* renamed from: لﻍﺩح */
    public static String m866() {
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
                    return M;
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

    /* renamed from: موضن */
    public static String m867(Object obj, Object obj2, boolean z) {
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
                    return ((Music) obj).Gc((String) obj2, z);
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

    /* renamed from: نثﻱر */
    public static Map m868(Object obj) {
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
                    return ((Headers) obj).toMultimap();
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

    /* renamed from: نخغش */
    public static String m869(Object obj) {
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
                    return ((Music) obj).yq;
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

    /* renamed from: ﺎﻕﻭﺯ */
    public static boolean m870(Object obj) {
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
                    return ((Music) obj).zH;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺕوذﺏ */
    public static void m871(Object obj) {
        int i = C0001.m25();
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
                    SpiderDebug.log((String) obj);
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
        int i4 = C0054.m2295();
        int i5 = 1740;
        while (true) {
            i5 ^= 1757;
            switch (i5) {
                case 17:
                    if (i4 < 0) {
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
                    System.out.println(Long.parseLong(C0049.m2171("9plD7SwQ8pi1SD")));
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: ﺝذزب */
    public static ResponseBody m872(Object obj) {
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
                    return ((Response) obj).body();
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

    /* renamed from: ﺥخﺩق */
    public static AlertDialog m873(Object obj) {
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
                    return ((Music) obj).i;
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

    /* renamed from: ﺥﻩمظ */
    public static Object m874(Object obj, Object obj2, Object obj3) {
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

    /* renamed from: ﺭﻡﺵي */
    public static String m875(Object obj) {
        int i = C0009.m276();
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
                    return Sjyy.m884((Sjyy) obj);
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

    /* renamed from: ﺯﻉﻅﻡ */
    public static String m876(Object obj) {
        int i = C0027.m1588();
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
                    return Sjyy.m883((Sjyy) obj);
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

    /* renamed from: ﺱتال */
    public static String m877(Object obj) {
        int i = C0040.m1954();
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
                    return ((Sjyy) obj).getPic();
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

    /* renamed from: ﺱـشﻩ */
    public static String m878(Object obj) {
        int i = C0009.m276();
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
                    return ((Music) obj).SN;
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

    /* renamed from: ﺱﻍﻩخ */
    public static String m879(Object obj) {
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
                    return ((ResponseBody) obj).string();
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

    /* renamed from: ﻙﻉشﺥ */
    public static Sjyy m880() {
        int i = C0055.m2324();
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
                    return Gc;
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

    /* renamed from: ﻩطﻡر */
    public static Response m881(Object obj, Object obj2) {
        int i = C0000.m13();
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
                    return C0068Pe.Gc((String) obj, (Map) obj2);
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

    /* renamed from: ﻩفﺎي */
    public static Response m882(Object obj, Object obj2, Object obj3) {
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
                    return C0068Pe.F5((String) obj, (Map) obj2, (Map) obj3);
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
        boolean z2 = C0022.m1448(C0051.m2237(m857(), 1037, 3, 2303), str);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z2) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    ArrayList arrayList = new ArrayList();
                    C0003.m116(arrayList, new ME(C0009.m277(m857(), 1040, 6, 348), C0035.m1833(m857(), 1046, 9, 1224), C0007.m210(m857(), 1055, 179, 2064), C0031.m1705(), true));
                    iX iXVar = new iX();
                    C0040.m1949(iXVar, arrayList);
                    C0042.m2011(iXVar, 1, 1, 1, 1);
                    return C0033.m1763(iXVar);
                case 239:
                    boolean z3 = C0030.m1681(str, C0049.m2175(m857(), 1234, 6, 1255));
                    String str3 = C0010.m296(m857(), 1240, 5, 1839);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z3) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                StringBuilder sb = new StringBuilder();
                                C0032.m1746(sb, m869(this));
                                C0032.m1746(sb, str);
                                C0032.m1746(sb, C0029.m1635(m857(), 1436, 1, 2810));
                                C0032.m1746(sb, str2);
                                C0032.m1746(sb, str3);
                                return C0022.m1435(m864(this, C0040.m1964(m867(this, C0043.m2039(sb), true)), str, str2));
                            case 500:
                                int i3 = C0007.m223(str2);
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            if (i3 <= 1) {
                                                break;
                                            } else {
                                                i4 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            this.tF = true;
                                            String str4 = C0031.m1705();
                                            M = str4;
                                            C0057.m2371(new Nl(this, 4));
                                            while (true) {
                                                boolean z4 = C0029.m1658(m866());
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                        case 45:
                                                            break;
                                                        case 76:
                                                            boolean z5 = m856(this);
                                                            int i6 = 48891;
                                                            while (true) {
                                                                i6 ^= 48908;
                                                                switch (i6) {
                                                                    case 22:
                                                                    case 53:
                                                                        break;
                                                                    case 503:
                                                                        i6 = z5 ? 49635 : 48953;
                                                                    case 32495:
                                                                        C0037.m1868(500L);
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
                                                            i5 = z4 ? 48860 : 48829;
                                                    }
                                                }
                                            }
                                            boolean z6 = C0029.m1658(m866());
                                            int i8 = 49790;
                                            while (true) {
                                                i8 ^= 49807;
                                                switch (i8) {
                                                    case 18:
                                                        break;
                                                    case 51:
                                                        m865(this);
                                                        String str5 = m866();
                                                        M = str4;
                                                        String str6 = C0048.m2149(C0031.m1713(m857(), 1252, 4, 927), str5, str3);
                                                        ArrayList arrayList2 = new ArrayList();
                                                        C0003.m116(arrayList2, new ME(str6, str5, C0026.m1551(m857(), 1256, 180, 3212)));
                                                        return C0022.m1435(arrayList2);
                                                    case 84:
                                                        C0006.m194(C0021.m1417(m857(), 1245, 7, 432));
                                                        return C0022.m1435(new ArrayList());
                                                    case 241:
                                                        if (!z6) {
                                                            break;
                                                        } else {
                                                            i8 = 49883;
                                                            continue;
                                                        }
                                                }
                                                i8 = 49852;
                                            }
                                            break;
                                        case 47417:
                                            return C0022.m1435(new ArrayList());
                                        case 47483:
                                            break;
                                    }
                                    i4 = 48705;
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
            }
            i = 1678;
        }
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m869(this));
        C0032.m1746(sb, (String) C0035.m1801(list, 0));
        Va va = C0004.m119(m867(this, C0043.m2039(sb), true));
        String str = C0011.m339(C0032.m1737(C0014.m434(va, C0005.m169(m857(), 1437, 13, 1438))), C0010.m296(m857(), 1450, 2, 1435))[0];
        ArrayList arrayList = new ArrayList();
        kB kBVar = C0014.m434(va, C0056.m2339(m857(), 1452, 20, 3042));
        String str2 = C0031.m1705();
        int i = 0;
        while (true) {
            int i2 = C0014.m422(kBVar);
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                    case 49:
                        i3 = i < i2 ? 1709 : 1678;
                    case 204:
                        hN hNVar = (hN) C0038.m1913(kBVar, i);
                        String str3 = C0035.m1833(m857(), 1472, 7, 2459);
                        kB kBVar2 = C0014.m434(hNVar, str3);
                        String str4 = C0011.m328(m857(), 1479, 4, 2520);
                        String str5 = C0023.m1479(kBVar2, str4);
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = i == 0 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    Va va2 = C0004.m119(C0028.m1633(C0032.m1739(new StringBuilder(), m869(this), str5), m862(this)));
                                    C0003.m107(va2);
                                    hN hNVar2 = C0000.m12(C0050.m2224(m857(), 1483, 13, 2478), va2);
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = hNVar2 != null ? 48736 : 48705;
                                            case 47384:
                                                break;
                                            case 47417:
                                                hN hNVar3 = C0000.m12(C0032.m1749(m857(), 1496, 3, 1269), hNVar2);
                                                int i6 = 48767;
                                                while (true) {
                                                    i6 ^= 48784;
                                                    switch (i6) {
                                                        case 14:
                                                        case 45:
                                                            break;
                                                        case 76:
                                                            str2 = C0013.m381(hNVar3, C0034.m1781(m857(), 1499, 3, 908));
                                                            break;
                                                        case 239:
                                                            i6 = hNVar3 != null ? 48860 : 48829;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                        }
                                    }
                                    int i7 = 48891;
                                    while (true) {
                                        i7 ^= 48908;
                                        switch (i7) {
                                            case 22:
                                            case 53:
                                                break;
                                            case 503:
                                                i7 = str2 != null ? 49635 : 48953;
                                            case 32495:
                                                boolean z = C0054.m2307(str2);
                                                int i8 = 49666;
                                                while (true) {
                                                    i8 ^= 49683;
                                                    switch (i8) {
                                                        case 17:
                                                            i8 = z ? 49759 : 49728;
                                                        case 50:
                                                        case 76:
                                                            break;
                                                        case 83:
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    str2 = C0054.m2301(m857(), 1502, 179, 1520);
                                    break;
                            }
                        }
                        String str6 = C0032.m1737(C0014.m434(hNVar, str3));
                        StringBuilder sb2 = new StringBuilder();
                        C0032.m1746(sb2, str6);
                        C0032.m1746(sb2, C0043.m2020(m857(), 1681, 1, 3116));
                        C0032.m1746(sb2, str5);
                        C0003.m116(arrayList, C0043.m2039(sb2));
                        int i9 = C0014.m422(C0014.m434(hNVar, C0040.m1953(m857(), 1682, 3, 1417)));
                        int i10 = 49790;
                        while (true) {
                            i10 ^= 49807;
                            switch (i10) {
                                case 18:
                                case 51:
                                    break;
                                case 84:
                                    String str7 = C0023.m1479(C0014.m434(hNVar, C0050.m2224(m857(), 1685, 5, 2274)), str4);
                                    StringBuilder sb3 = new StringBuilder();
                                    C0032.m1746(sb3, str6);
                                    C0032.m1746(sb3, C0036.m1850(m857(), 1690, 5, 1463));
                                    C0032.m1746(sb3, str7);
                                    C0003.m116(arrayList, C0043.m2039(sb3));
                                    break;
                                case 241:
                                    i10 = i9 > 0 ? 49883 : 49852;
                            }
                        }
                        i++;
                        int i11 = 49914;
                        while (true) {
                            i11 ^= 49931;
                            switch (i11) {
                                case 497:
                                    i11 = 50596;
                                case 1711:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        String str8 = C0038.m1902(C0013.m380(m857(), 1696, 3, 1002), C0038.m1910(C0038.m1902(C0032.m1749(m857(), 1695, 1, 1950), arrayList)));
                        ME me = new ME();
                        C0009.m284(me, (String) C0035.m1801(list, 0));
                        C0008.m255(me, str);
                        C0021.m1409(me, str2);
                        String str9 = C0022.m1433(m857(), 1699, 2, 1656);
                        C0043.m2035(me, str9);
                        C0055.m2330(me, str9);
                        C0020.m1375(me, str9);
                        C0005.m160(me, str8);
                        return C0000.m21(me);
                }
            }
        }
    }

    public String generateSessionId() {
        StringBuilder sb = new StringBuilder(26);
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < 26 ? 1709 : 1678;
                    case 204:
                        C0048.m2158(sb, C0008.m244(C0050.m2224(m857(), 1701, 62, 1655), C0053.m2285(m858(this), 62)));
                        i++;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        StringBuilder sb2 = C0052.m2253(C0022.m1433(m857(), 1763, 10, 3027));
                        C0032.m1746(sb2, C0043.m2039(sb));
                        return C0043.m2039(sb2);
                }
            }
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        Va va = C0040.m1964(m867(this, m869(this), true));
        int i = 0;
        Iterator it = C0004.m122(C0014.m434(va, C0011.m328(m857(), 1773, 34, 1877)));
        while (true) {
            boolean z2 = C0000.m11(it);
            String str = C0031.m1705();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = z2 ? 1709 : 1678;
                    case 204:
                        hN hNVar = (hN) C0026.m1556(it);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = i == 0 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    C0003.m116(arrayList, new rP(C0036.m1853(C0013.m381(hNVar, C0000.m18(m857(), 1807, 4, 487)), C0006.m180(m857(), 1811, 5, 2204), str), C0013.m381(hNVar, C0051.m2237(m857(), 1816, 5, 1868))));
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                                break;
                                            case 239:
                                                i4 = 48798;
                                        }
                                    }
                                    break;
                                case 500:
                                    i++;
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
                        break;
                    case 239:
                        C0003.m116(arrayList, new rP(C0055.m2320(m857(), 1821, 3, 3002), C0042.m2010(m857(), 1824, 4, 2878)));
                        return C0038.m1906(arrayList, m864(this, va, str, C0051.m2237(m857(), 1828, 1, 537)));
                }
            }
        }
    }

    public void init(Context context, String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z = C0054.m2307(str);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (z) {
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
        str = m869(this);
        this.yq = str;
        this.N = C0014.m419(C0040.m1953(m857(), 1829, 6, 905), C0031.m1705());
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = C0021.m1417(m857(), 1835, 3, 1084);
        String str4 = C0031.m1705();
        C0056.m2351(true);
        try {
            String str5 = C0028.m1620(str2, C0049.m2185(str2, C0000.m18(m857(), 1838, 1, 2445)) + 1, C0046.m2105(str2) - 5);
            boolean z = C0037.m1888(str2, str3);
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
                        HashMap hashMap = new HashMap();
                        boolean z2 = C0037.m1888(str2, C0055.m2320(m857(), 1839, 5, 2904));
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
                                    StringBuilder sb = new StringBuilder();
                                    C0032.m1746(sb, m869(this));
                                    C0032.m1746(sb, str2);
                                    str5 = C0007.m228(C0028.m1613(m857(), 1844, 15, 1964), C0001.m32(C0043.m2039(sb), m862(this)), 1);
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        boolean z3 = C0020.m1370(str5);
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
                                    String str6 = C0039.m1931(new SimpleDateFormat(C0041.m1994(m857(), 1859, 12, 1009)), new Date());
                                    C0042.m1999(hashMap, C0049.m2175(m857(), 1871, 2, 1534), str5);
                                    C0042.m1999(hashMap, C0025.m1542(m857(), 1873, 4, 2354), C0054.m2301(m857(), 1877, 5, 1983));
                                    String str7 = C0039.m1937(m857(), 1882, 3, 2954);
                                    StringBuilder sb2 = new StringBuilder();
                                    C0032.m1746(sb2, str6);
                                    C0032.m1746(sb2, C0007.m210(m857(), 1885, 4, 3178));
                                    C0042.m1999(hashMap, str7, C0043.m2039(sb2));
                                    Gc = (Sjyy) m874(new Gson(), C0042.m2001(m878(this), hashMap, m862(this)), Sjyy.class);
                                    ArrayList arrayList = new ArrayList();
                                    boolean z4 = C0020.m1370(m875(m880()));
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                                break;
                                            case 45:
                                                iX iXVar = new iX();
                                                C0013.m394(iXVar, m876(m880()), false);
                                                C0008.m233(iXVar, m877(m880()));
                                                C0027.m1602(iXVar, m877(m880()));
                                                return C0033.m1763(iXVar);
                                            case 76:
                                                String str8 = C0044.m2049(C0029.m1656(m875(m880())));
                                                gU gUVar = new gU();
                                                C0012.m359(gUVar, C0010.m296(m857(), 1889, 2, 364));
                                                StringBuilder sb3 = new StringBuilder();
                                                C0032.m1746(sb3, C0035.m1826());
                                                C0032.m1746(sb3, C0004.m130(m857(), 1891, 21, 2459));
                                                C0009.m259(gUVar, C0043.m2039(sb3));
                                                C0044.m2047(gUVar);
                                                gU gUVar2 = C0006.m186(gUVar, C0032.m1749(m857(), 1912, 3, 3178));
                                                C0004.m145(gUVar2, str8);
                                                C0003.m116(arrayList, gUVar2);
                                                iX iXVar2 = new iX();
                                                C0013.m394(iXVar2, m876(m880()), false);
                                                C0008.m233(iXVar2, m877(m880()));
                                                C0027.m1602(iXVar2, m877(m880()));
                                                C0030.m1689(iXVar2, arrayList);
                                                return C0033.m1763(iXVar2);
                                            case 239:
                                                if (z4) {
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
                                case 47417:
                                    return str4;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 48705;
                        }
                    case 239:
                        boolean z5 = C0037.m1888(str2, str3);
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    if (!z5) {
                                        break;
                                    } else {
                                        i5 = 49635;
                                        continue;
                                    }
                                case 32495:
                                    iX iXVar3 = new iX();
                                    C0013.m394(iXVar3, C0048.m2160(C0025.m1542(m857(), 1915, 55, 2428), new Object[]{str5}), false);
                                    return C0033.m1763(iXVar3);
                                default:
                                    continue;
                            }
                            i5 = 48953;
                        }
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            m859(e);
        }
        return str4;
    }

    public void showInputQRCode() {
        try {
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, C0051.m2237(m857(), 1970, 7, 2073));
            C0032.m1746(sb, C0021.m1416());
            C0032.m1746(sb, C0057.m2384(m857(), 1977, 40, 2712));
            String str = C0043.m2039(sb);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C0038.m1895(200), C0038.m1895(200));
            ImageView imageView = new ImageView(C0010.m312());
            C0031.m1697(imageView, C0041.m1973());
            C0056.m2357(imageView, C0032.m1731(str, 200, 2));
            FrameLayout frameLayout = new FrameLayout(C0010.m312());
            layoutParams.gravity = 17;
            C0015.m459(frameLayout, imageView, layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C0038.m1895(500), C0038.m1895(50));
            layoutParams2.topMargin = C0038.m1895(240);
            layoutParams2.gravity = 1;
            TextView textView = new TextView(C0010.m312());
            C0020.m1389(textView, C0025.m1542(m857(), 2017, 14, 961));
            C0000.m17(textView, -1);
            C0020.m1394(textView, 17);
            C0015.m459(frameLayout, textView, layoutParams2);
            AlertDialog alertDialog = C0026.m1570(C0044.m2078(new AlertDialog.Builder(C0022.m1444()), frameLayout));
            this.i = alertDialog;
            C0039.m1922(C0035.m1809(alertDialog), new ColorDrawable(0));
            C0056.m2346(m873(this), new DialogInterface$OnDismissListenerC0194v3(this, 2));
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
}
