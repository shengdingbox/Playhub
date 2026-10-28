package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.Editable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.catvod.crawler.Spider;
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
import com.github.catvod.spider.Alllive;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
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
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.DialogInterface$OnClickListenerC0112h;
import com.github.catvod.spider.merge.DialogInterface$OnDismissListenerC0194v3;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.Fz;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nl;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.p9;
import com.github.catvod.spider.merge.rP;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Alllive extends Spider {

    /* renamed from: short */
    private static final short[] f16short = {1454, 1459, 1471, 1447, -29472, 30967, 1553, 1562, 1536, 1548, 1536, 27689, -27198, 570, 561, 555, 551, 567, 560, 25843, -28266, 1924, 1935, 1930, 1935, 1924, 1935, 1930, 1935, 21091, 21086, 21091, 21086, 830, 830, 30911, 25085, 1965, 1965, 2793, 2815, 2809, 2743, 2812, 2815, 2798, 2809, 2802, 2743, 2793, 2803, 2798, 2815, 2101, 2087, 2091, 2083, 2155, 2089, 2100, 2095, 2081, 2095, 2088, 2584, 2319, 2306, 2315, 2334, 1983, 1955, 1978, 1979, 3024, 3009, 3036, 3024, 2955, 3020, 3024, 3017, 3016, 1281, 1282, 1282, 1292, 1283, 1300, 1355, 1353, 1364, 1347, 1346, 1284, 1375, 1364, 1286, 1362, 1365, 1355, 1358, 1359, 1309, 1368, 1352, 1355, 1286, 1402, 1367, 1367, 1367, 1362, 1357, 1374, 1309, 1359, 1346, 1355, 1374, 1286, 1359, 1374, 1347, 1359, 1309, 26259, -27334, 1286, 1308, 1307, 1296, 1307, 1374, 1365, 1368, 1364, 1375, 1374, 1390, 1385, 1394, 1400, 1364, 1366, 1355, 1364, 1365, 1374, 1365, 1359, 1299, 1355, 1358, 1352, 1363, 1390, 1353, 1367, 1298, 1280, 1329, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1357, 1370, 1353, 1307, 1347, 1363, 1353, 1307, 1286, 1307, 1365, 1374, 1356, 1307, 1379, 1398, 1399, 1395, 1359, 1359, 1355, 1385, 1374, 1354, 1358, 1374, 1352, 1359, 1299, 1298, 1280, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1347, 1363, 1353, 1301, 1364, 1355, 1374, 1365, 1299, 1308, 1404, 1406, 1391, 1308, 1303, 1307, 1370, 1355, 1362, 1390, 1353, 1367, 1303, 1307, 1359, 1353, 1358, 1374, 1298, 1280, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1347, 1363, 1353, 1301, 1364, 1365, 1353, 1374, 1370, 1375, 1346, 1352, 1359, 1370, 1359, 1374, 1368, 1363, 1370, 1365, 1372, 1374, 1307, 1286, 1307, 1373, 1358, 1365, 1368, 1359, 1362, 1364, 1365, 1307, 1299, 1298, 1307, 1344, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1362, 1373, 1307, 1299, 1347, 1363, 1353, 1301, 1353, 1374, 1370, 1375, 1346, 1384, 1359, 1370, 1359, 1374, 1307, 1286, 1286, 1286, 1307, 1379, 1398, 1399, 1395, 1359, 1359, 1355, 1385, 1374, 1354, 1358, 1374, 1352, 1359, 1301, 1407, 1396, 1397, 1406, 1298, 1307, 1344, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1362, 1373, 1307, 1299, 1347, 1363, 1353, 1301, 1352, 1359, 1370, 1359, 1358, 1352, 1307, 1286, 1286, 1286, 1307, 1289, 1291, 1291, 1298, 1307, 1344, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1368, 1364, 1365, 1352, 1364, 1367, 1374, 1301, 1367, 1364, 1372, 1299, 1308, -28980, 27001, 26411, 22436, 1308, 1298, 1280, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1350, 1307, 1374, 1367, 1352, 1374, 1307, 1344, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1368, 1364, 1365, 1352, 1364, 1367, 1374, 1301, 1367, 1364, 1372, 1299, 1308, -28980, 27001, 23562, -30690, 1308, 1298, 1280, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1350, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1307, 1350, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1350, 1280, 1329, 1307, 1307, 1307, 1307, 1307, 1307, 1347, 1363, 1353, 1301, 1352, 1374, 1365, 1375, 1299, 1298, 1280, 1329, 1307, 1307, 1307, 1307, 1350, 1329, 1307, 1307, 1287, 1300, 1352, 1368, 1353, 1362, 1355, 1359, 1285, 1329, 1287, 1300, 1369, 1364, 1375, 1346, 1285, 1329, 1329, 1287, 1300, 1363, 1359, 1366, 1367, 1285, 1329, 2733, 2748, 2721, 2733, 27315, -26342, 2328, 1206, -29544, -30468, 22026, 25459, 31309, 22044, -28095, -29534, 497, 499, 31562, 28956, 20574, -29060, -343, 24075, 20036, 25550, 31140, 26041, 31879, 23251, 25741, 25494, 31400, 2446, 2437, 2432, 2437, 2446, 2437, 2432, 2437, 2665, 2664, 2682, 2577, 2564, 1168, 1237, 1241, 1241, 1245, 1247, 1235, 1163, 729, 722, 727, 722, 729, 722, 727, 722, 740, 2450, 2453, 2463, 2455, 2450, 2461, 2449, 2457, 1418, 1414, 1439, 1420, 1435, 2127, 2130, 2127, 2135, 2142, 2282, 2295, 2295, 2293, 2257, 2300, 1057, 1069, 1069, 1065, 1067, 1063, 2747, 2750, 2724, 2723, 2910, 2907, 2894, 2907, 1787, 1156, 1176, 1154, 2752, 2702, 2719, 2694, 2752, 2327, 2399, 2397, 2380, 2427, 2393, 2380, 2397, 2399, 2391, 2378, 2385, 2397, 2379, 454, 459, 450, 471, 2796, 2785, 2790, 2796, 2785, 673, 686, 674, 682, 1609, 1616, 1626, 1240, 1220, 1246, 1170, 1153, 1170, 1910, 1898, 1904, 1852, 1881, 1839, 1852, 26844, 25460, -29714, 21784, 24673, 31071, -28752, 1957, 1591, 1643, 1661, 1657, 1642, 1659, 1648, 1610, 1655, 1655, 1653, 1643, 1575, 1640, 1657, 1663, 1661, 1573, 2464, 2541, 2545, 2491, 802, 800, 821, 804, 806, 814, 819, 824, 1593, 1572, 1576, 1584, 1570, 1598, 1572, 1640, 1659, 1640, -28795, 31634, 28119, 29929, 2327, 2315, 2315, 2319, 2316, 2373, 2384, 2384, 2326, 2322, 2328, 2383, 2376, 2385, 2316, 2320, 2328, 2320, 2314, 2332, 2331, 2321, 2385, 2332, 2320, 2322, 2384, 2313, 2381, 2384, 2315, 2327, 2314, 2322, 2333, 2384, 2317, 2330, 2315, 2310, 2319, 2330, 2336, 2330, 2311, 2332, 2323, 2314, 2331, 2330, 2336, 2328, 2326, 2329, 2384, 2330, 2311, 2315, 2384, 2334, 2314, 2315, 2320, 2384, 2318, 2384, 2374, 2378, 2384, 2332, 2317, 2320, 2319, 2384, 2311, 2310, 2384, 2334, 2326, 2384, 2315, 2384, 2383, 2384, 2368, 2334, 2319, 2319, 2326, 2331, 2370, 2382, 2381, 2381, 2393, 2314, 2317, 2323, 2370, 2327, 2315, 2315, 2319, 2316, 2373, 2384, 2384, 2316, 2382, 2385, 2326, 2322, 2334, 2328, 2330, 2327, 2314, 2333, 2385, 2332, 2332, 2384, 2326, 2322, 2334, 2328, 2330, 2316, 2384, 2381, 2383, 2381, 2377, 2384, 2383, 2377, 2384, 2383, 2379, 2384, 2332, 2376, 2374, 2379, 2332, 2333, 2379, 2329, 2375, 2332, 2374, 2379, 2381, 2329, 2383, 2377, 2382, 2374, 2379, 2381, 2334, 2378, 2379, 2332, 2375, 2380, 2380, 2334, 2332, 2377, 2380, 2332, 2385, 2319, 2321, 2328, 2762, 2753, 2779, 2775, 2779, 2781, 2753, 2779, 2711, 2692, 2711, 28422, -26899, 28301, 30643, 1642, 1654, 1654, 1650, 1649, 1592, 1581, 1581, 1643, 1647, 1637, 1586, 1589, 1580, 1649, 1645, 1637, 1645, 1655, 1633, 1638, 1644, 1580, 1633, 1645, 1647, 1581, 1652, 1584, 1581, 1654, 1642, 1655, 1647, 1632, 1581, 1648, 1639, 1654, 1659, 1650, 1639, 1629, 1639, 1658, 1633, 1646, 1655, 1638, 1639, 1629, 1637, 1643, 1636, 1581, 1639, 1658, 1654, 1581, 1635, 1655, 1654, 1645, 
    1581, 1651, 1581, 1595, 1591, 1581, 1633, 1648, 1645, 1650, 1581, 1658, 1659, 1581, 1635, 1643, 1581, 1654, 1581, 1586, 1581, 1597, 1635, 1650, 1650, 1643, 1638, 1599, 1587, 1584, 1584, 1572, 1655, 1648, 1646, 1599, 1642, 1654, 1654, 1650, 1649, 1592, 1581, 1581, 1649, 1587, 1580, 1643, 1647, 1635, 1637, 1639, 1642, 1655, 1632, 1580, 1633, 1633, 1581, 1643, 1647, 1635, 1637, 1639, 1649, 1581, 1584, 1586, 1584, 1588, 1581, 1586, 1588, 1581, 1586, 1590, 1581, 1588, 1588, 1638, 1639, 1638, 1633, 1589, 1594, 1639, 1594, 1585, 1589, 1589, 1590, 1594, 1638, 1587, 1636, 1585, 1590, 1638, 1633, 1595, 1589, 1585, 1588, 1632, 1639, 1585, 1590, 1586, 1591, 1580, 1640, 1650, 1637, 417, 489, 491, 506, 461, 495, 506, 491, 489, 481, 508, 503, 476, 481, 481, 483, 509, 433, 487, 490, 435, 1738, 1692, 1669, 1672, 1745, 1757, 1738, 1692, 1677, 1675, 1673, 1745, 2684, 2610, 2595, 2618, 2684, 2609, 2618, 2623, 2618, 2609, 2618, 2623, 2618, 2684, 2612, 2614, 2599, 2561, 2614, 2608, 2620, 2622, 2622, 2614, 2621, 2615, 2561, 2620, 2620, 2622, 2592, 2668, 2595, 2610, 2612, 2614, 2670, 2057, 2751, 2801, 2784, 2809, 2751, 2666, 2594, 2592, 2609, 2583, 2602, 2602, 2600, 2561, 2592, 2609, 2596, 2604, 2601, 2682, 2604, 2593, 2680, 747, 750, 763, 750, 3161, 3140, 3140, 3142, 3170, 3151, 897, 924, 897, 921, 912, 1882, 1883, 1881, 1884, 1883, 1872, 2493, 2471, 2490, 2475, 2439, 2474, 3293, 3290, 3280, 3288, 3293, 3282, 3294, 3286, 257, 269, 276, 263, 272, 2900, 2899, 2893, 2466, 2464, 2485, 2468, 2470, 2478, 2483, 2488, 1471, 1464, 1456, 1465, 2024, 2023, 2027, 2019, 670, 959, 947, 952, 953, 2569, 2581, 2581, 2577, 2578, 2651, 2638, 2638, 2582, 2582, 2582, 2639, 2569, 2580, 2584, 2560, 2639, 2562, 2574, 2572, 2654, 257, 266, 292, 307, 318, 311, 290, 3292, 3265, 3277, 3285, 3307, 3288, 3293, 3266, 3281, 307, 1322, 1343, 2189, 2185, 2217, 2207, 2201, 2184, 2207, 2190, 2247, 2271, 2185, 2268, 2189, 2185, 2222, 2195, 2199, 2207, 2247, 2271, 2185, 2268, 2185, 2207, 2187, 2195, 2206, 2247, 2271, 2185, 2268, 2201, 2190, 2179, 2186, 2207, 2247, 2271, 2185, 2268, 2188, 2207, 2184, 2247, 2251, 2268, 2204, 2185, 2247, 2271, 2185, 2268, 2190, 2247, 2271, 2185, 2268, 2191, 2247, 2271, 2185, 907, 908, 906, 925, 921, 917, 2646, 2643, 2644, 2655, 2633, 2413, 2070, 1418, 1418, 1418, 2664, 2677, 2681, 2657, -29205, 31228, 1765, 1774, 1780, 1784, 1780, 26174, -24619, 1974, 1981, 1976, 1981, 1974, 1981, 1976, 1981, 22404, 22457, 455, 475, 449, -9405, -8589, 26466, 32348, 30290, 26427, 2750, 26392, 27499, 1506, 21142, 18167, 2251, 22277, 25450, 1694, 3027, 3038, 3031, 3010, 20783, 32594, 31656, 27329, 32295, 26233, 1352, 1371, 1407, 1401, 1397, 1405, 21623, 24600, 30671, 26906, 3245, 3235, 3259, 3248, 27277, 26366, 18391, -25292, 3013, 3023, 3022, 3022, 22577, 19536, 23337, 21808, 1174, 1155, -24924, 22020, 2203, 2200, 28877, 27548, 27803, 23050, 2521, 2520, 2501, 2522, -32348, -32695, 17627, 22753, 1121, 1128, 1196, 1200, 1200, 1204, 1207, 1278, 1259, 1259, 1201, 1184, 1190, 1192, 1187, 1194, 1258, 1196, 1201, 1213, 1189, 1258, 1191, 1195, 1193, 1259, 1203, 1185, 1190, 1259, 1189, 1194, 1195, 1194, 1213, 1193, 1195, 1201, 1207, 1160, 1195, 1187, 1197, 1194, 1655, 1582, 1645, 1660, 1660, 1605, 1640, 1582, 1590, 1593, 1596, 1596, 1598, 1568, 1582, 1646, 1653, 1628, 1645, 1663, 1663, 1582, 1590, 1599, 1568, 1582, 1647, 1635, 1634, 1656, 1641, 1652, 1656, 1582, 1590, 1582, 1582, 1568, 1582, 1658, 1641, 1662, 1663, 1637, 1635, 1634, 1582, 1590, 1582, 1598, 1570, 1592, 1582, 1568, 1582, 1640, 1645, 1656, 1645, 1582, 1590, 1655, 1649, 1649, 2739, 2742, 2723, 2742, 587, 599, 602, 2422, 2410, 2410, 2414, 750, 754, 754, 758, 757, 700, 2082, 2110, 2110, 2106, 2160, 2149, 2149, 2261, 2262, 2262, 2264, 2263, 2240, 2207, 2205, 2176, 2199, 2198, 2256, 2187, 2176, 2258, 2182, 2177, 2207, 2202, 2203, 2249, 2188, 2204, 2207, 2258, 2222, 2179, 2179, 2179, 2182, 2201, 2186, 2249, 2203, 2198, 2207, 2186, 2258, 2183, 2203, 2178, 2179, 19610, 30413, 23627, 19460, 24974, 31716, 24653, -27676, 20949, 945, 947, 30986, 26617, 32455};
    private static String t0;
    private String N;
    private String SN;
    private AlertDialog i;
    private boolean tF;
    private String yq;
    private boolean zH;

    public Alllive() {
        String str = C0031.m1705();
        this.yq = str;
        this.N = str;
        int i = C0036.m1838();
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
                    System.out.println(Long.parseLong(C0020.m1383("QHVMh")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private String Gc(String str) {
        boolean z = C0046.m2113(str, C0015.m457(m470(), 0, 4, 1478));
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
                    String str2 = C0056.m2339(m470(), 4, 2, 2734);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return str2;
                        }
                    }
                    break;
                case 239:
                    boolean z2 = C0046.m2113(str, C0024.m1513(m470(), 6, 5, 1653));
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
                                boolean z3 = C0046.m2113(str, C0036.m1850(m470(), 13, 6, 606));
                                int i4 = 48891;
                                while (true) {
                                    i4 ^= 48908;
                                    switch (i4) {
                                        case 22:
                                            break;
                                        case 53:
                                            boolean z4 = C0046.m2113(str, C0001.m35(m470(), 21, 8, 2022));
                                            int i5 = 49790;
                                            while (true) {
                                                i5 ^= 49807;
                                                switch (i5) {
                                                    case 18:
                                                        break;
                                                    case 51:
                                                        boolean z5 = C0046.m2113(str, C0054.m2301(m470(), 33, 2, 861));
                                                        int i6 = 50689;
                                                        while (true) {
                                                            i6 ^= 50706;
                                                            switch (i6) {
                                                                case 19:
                                                                    if (!z5) {
                                                                        break;
                                                                    } else {
                                                                        i6 = 50782;
                                                                        continue;
                                                                    }
                                                                case 45:
                                                                    return C0031.m1705();
                                                                case 50:
                                                                    break;
                                                                case 76:
                                                                    String str3 = C0039.m1937(m470(), 35, 4, 2030);
                                                                    int i7 = 50813;
                                                                    while (true) {
                                                                        i7 ^= 50830;
                                                                        switch (i7) {
                                                                            case 18:
                                                                                return str3;
                                                                            case 243:
                                                                                i7 = 50844;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            i6 = 50751;
                                                        }
                                                        break;
                                                    case 84:
                                                        String str4 = C0049.m2175(m470(), 29, 4, 1719);
                                                        int i8 = 49914;
                                                        while (true) {
                                                            i8 ^= 49931;
                                                            switch (i8) {
                                                                case 497:
                                                                    i8 = 50596;
                                                                    break;
                                                                case 1711:
                                                                    return str4;
                                                            }
                                                        }
                                                        break;
                                                    case 241:
                                                        if (!z4) {
                                                            break;
                                                        } else {
                                                            i5 = 49883;
                                                            continue;
                                                        }
                                                }
                                                i5 = 49852;
                                            }
                                            break;
                                        case 503:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i4 = 49635;
                                                continue;
                                            }
                                        case 32495:
                                            String str5 = C0013.m380(m470(), 19, 2, 1637);
                                            int i9 = 49666;
                                            while (true) {
                                                i9 ^= 49683;
                                                switch (i9) {
                                                    case 17:
                                                        i9 = 49697;
                                                        break;
                                                    case 50:
                                                        return str5;
                                                }
                                            }
                                            break;
                                    }
                                    i4 = 48953;
                                }
                                break;
                            case 47417:
                                String str6 = C0044.m2052(m470(), 11, 2, 2494);
                                int i10 = 48767;
                                while (true) {
                                    i10 ^= 48784;
                                    switch (i10) {
                                        case 14:
                                            return str6;
                                        case 239:
                                            i10 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                        }
                        i3 = 48705;
                    }
                    break;
            }
            i = 1678;
        }
    }

    private JSONObject M(String str) {
        String str2 = "ۦ۟ۢ";
        HashMap hashMap = null;
        JSONObject jSONObject = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str2)) {
                case 1746789:
                    C0042.m1999(hashMap, str5, str4);
                    str2 = "ۣ۠ۦ";
                    break;
                case 1747868:
                    str3 = C0024.m1495(str5, str4, str);
                    str2 = "ۨۡ۟";
                    break;
                case 1749855:
                    str5 = C0004.m130(sArr, 39, 14, 2714);
                    str2 = "ۥۥۢ";
                    break;
                case 1750569:
                    str5 = C0028.m1633(str, hashMap);
                    str2 = "ۨ۠۠";
                    break;
                case 1750632:
                    str4 = C0031.m1713(sArr, 64, 1, 2616);
                    str2 = "ۥ۠ۧ";
                    break;
                case 1752492:
                    str = C0031.m1705();
                    str2 = "۠ۦۢ";
                    break;
                case 1752642:
                    sArr = m470();
                    str2 = "ۧۧۦ";
                    break;
                case 1752738:
                    return jSONObject;
                case 1753417:
                    hashMap = new HashMap();
                    str2 = "۠ۤ۟";
                    break;
                case 1754538:
                    jSONObject = new JSONObject(str5);
                    str2 = "ۥۨۥ";
                    break;
                case 1754630:
                    str4 = C0013.m380(sArr, 53, 11, 2118);
                    str2 = "۟ۢۨ";
                    break;
                case 1755368:
                    sArr = m470();
                    str2 = "ۣۢۧ";
                    break;
                case 1755398:
                    str5 = C0037.m1869(str3);
                    str2 = "ۧۤۧ";
                    break;
                default:
                    sArr = m470();
                    str2 = "ۢۨۥ";
                    break;
            }
        }
    }

    public static /* synthetic */ void N(Alllive alllive) {
        boolean z = m474(alllive);
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
                    alllive.tF = false;
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        alllive.zH = false;
    }

    public static void SN(Alllive alllive) {
        Nl nl = null;
        String str = "۠ۤۧ";
        while (true) {
            switch (C0002.m76(str)) {
                case 56508:
                    return;
                case 1746723:
                    C0057.m2371(nl);
                    str = "ۦۢ";
                    break;
                case 1747811:
                    alllive.zH = true;
                    str = "ۧۦۣ";
                    break;
                case 1754596:
                    m463(alllive);
                    str = "ۣۢۧ";
                    break;
                default:
                    nl = new Nl(alllive, 3);
                    str = "۟۠ۤ";
                    break;
            }
        }
    }

    public static Object[] proxyInput(Map<String, String> map) {
        String str = C0040.m1953(m470(), 65, 4, 2427);
        boolean z = C0022.m1448((String) C0000.m15(map, str), C0015.m457(m470(), 69, 4, 2007));
        String str2 = C0015.m457(m470(), 73, 9, 2980);
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
                    C0032.m1746(sb, C0028.m1622());
                    C0032.m1746(sb, str3);
                    C0032.m1746(sb, C0051.m2237(m470(), 82, 459, 1339));
                    return new Object[]{num, str2, new ByteArrayInputStream(C0051.m2233(C0043.m2039(sb)))};
                case 239:
                    boolean z2 = C0022.m1448((String) C0000.m15(map, str), C0046.m2123(m470(), 541, 4, 2777));
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
                                String str4 = C0036.m1853(C0055.m2312((String) C0000.m15(map, C0001.m35(m470(), 545, 2, 2331))), C0050.m2224(m470(), 547, 1, 2360), C0009.m277(m470(), 548, 1, 1181));
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
                                            t0 = str4;
                                            return new Object[]{num, str2, new ByteArrayInputStream(new byte[0])};
                                        case 47483:
                                            break;
                                    }
                                    i3 = 48705;
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

    private void t0() {
        try {
            AlertDialog alertDialog = m472(this);
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
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            int i2 = 1864;
            while (true) {
                i2 ^= 1881;
                switch (i2) {
                    case 17:
                        i2 = 48674;
                        break;
                    case 47483:
                        break;
                }
            }
        }
        int i3 = C0048.m2140();
        int i4 = 1740;
        while (true) {
            i4 ^= 1757;
            switch (i4) {
                case 17:
                    if (i3 < 0) {
                        break;
                    } else {
                        i4 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    System.out.println(C0008.m249("KuX4Y2ap1lVTUo5kxejFzYA0"));
                    return;
            }
            i4 = 1802;
        }
    }

    public static void tF(Alllive alllive) {
        C0003.m107(alllive);
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            C0007.m224(layoutParams, C0038.m1895(16), C0038.m1895(16), C0038.m1895(16), C0038.m1895(16));
            FrameLayout frameLayout = new FrameLayout(C0010.m312());
            final EditText editText = new EditText(C0010.m312());
            C0015.m459(frameLayout, editText, layoutParams);
            AlertDialog alertDialog = C0026.m1570(C0023.m1485(C0057.m2373(C0037.m1883(C0044.m2078(C0014.m415(new AlertDialog.Builder(C0022.m1444()), C0043.m2020(m470(), 549, 8, 1903)), frameLayout), C0005.m169(m470(), 557, 13, 421), new DialogInterface$OnClickListenerC0112h(alllive, 0)), C0002.m57(m470(), 570, 2, 2309), null), C0055.m2320(m470(), 572, 2, 1930), new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.OT
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Alllive.yq(Alllive.this, editText);
                }
            }));
            alllive.i = alertDialog;
            C0056.m2346(alertDialog, new DialogInterface$OnDismissListenerC0194v3(alllive, 1));
        } catch (Exception e) {
            int i = 1740;
            while (true) {
                i ^= 1757;
                switch (i) {
                    case 17:
                        i = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
        int i2 = C0047.m2134();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 < 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    System.out.println(Integer.valueOf(C0007.m222("pXiSsv1")));
                    return;
                case 239:
                    return;
            }
            i3 = 1678;
        }
    }

    public static void yq(Alllive alllive, EditText editText) {
        String str = "ۥۥ";
        Editable editable = null;
        String str2 = null;
        Fz fz = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 1748768:
                    str2 = C0050.m2227(editable);
                    str = "ۦۣۦ";
                    break;
                case 1749634:
                    fz = new Fz(str2, 1);
                    str = "ۨۥۧ";
                    break;
                case 1751679:
                    return;
                case 1753545:
                    m463(alllive);
                    str = "ۢۡۡ";
                    break;
                case 1755460:
                    editable = C0055.m2326(editText);
                    str = "ۣۡۤ";
                    break;
                case 1755530:
                    C0038.m1909(fz);
                    str = "ۤۥ۠";
                    break;
                default:
                    C0003.m107(alllive);
                    str = "ۣۨ۟";
                    break;
            }
        }
    }

    public static /* synthetic */ void zH(String str) {
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
                    t0 = str;
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    /* renamed from: بمحت */
    public static void m463(Object obj) {
        int i = C0032.m1750();
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
                    ((Alllive) obj).t0();
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
        int i4 = C0047.m2134();
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
                    System.out.println(Float.parseFloat(C0040.m1943("Ufo")));
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: دﺎﻁغ */
    public static JsonObject m464(Object obj) {
        int i = C0032.m1750();
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
                    return FO.v((String) obj);
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

    /* renamed from: زﺙﺏط */
    public static String m465(Object obj) {
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
                    return ((Alllive) obj).N;
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

    /* renamed from: سلعخ */
    public static boolean m466(Object obj) {
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
                    return ((Alllive) obj).tF;
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

    /* renamed from: شظذﺵ */
    public static JSONObject m467(Object obj, Object obj2) {
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
                    return ((Alllive) obj).M((String) obj2);
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

    /* renamed from: لﻍﻡط */
    public static JsonElement m468(Object obj, Object obj2) {
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

    /* renamed from: يﺡﺏل */
    public static String m469(Object obj) {
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

    /* renamed from: ﺕاﺩﻙ */
    public static short[] m470() {
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
                    return f16short;
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

    /* renamed from: ﺕﺯرﺫ */
    public static String m471() {
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
                    return t0;
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

    /* renamed from: ﺙلﻕﺽ */
    public static AlertDialog m472(Object obj) {
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
                    return ((Alllive) obj).i;
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

    /* renamed from: ﺡظحج */
    public static String m473(Object obj) {
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
                    return ((Alllive) obj).SN;
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

    /* renamed from: ﺯجﻁﻉ */
    public static boolean m474(Object obj) {
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
                    return ((Alllive) obj).zH;
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

    /* renamed from: ﺯسصو */
    public static String m475(Object obj, Object obj2) {
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
                    return ((Alllive) obj).Gc((String) obj2);
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

    /* renamed from: ﺵذيﺡ */
    public static String m476(Object obj) {
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
                    return ((Alllive) obj).yq;
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

    /* renamed from: ﻭﺎﺱﺭ */
    public static JsonObject m477(Object obj, Object obj2) {
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 396
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String categoryContent(java.lang.String r27, java.lang.String r28, boolean r29, java.util.HashMap<java.lang.String, java.lang.String> r30) {
        /*
            Method dump skipped, instructions count: 2454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Alllive.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        String str;
        String str2 = C0052.m2261(m470(), 1183, 1, 2134);
        String[] strArr = C0011.m339((String) C0035.m1801(list, 0), str2);
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, m476(this));
        C0032.m1746(sb, C0020.m1390(m470(), 1184, 5, 2704));
        C0032.m1746(sb, strArr[0]);
        C0032.m1746(sb, C0003.m86(m470(), 1189, 18, 2629));
        C0032.m1746(sb, strArr[1]);
        JSONObject jSONObject = C0041.m1969(m467(this, C0043.m2039(sb)), C0004.m130(m470(), 1207, 4, 655));
        ME me = new ME();
        C0009.m284(me, C0028.m1632(jSONObject, C0012.m361(m470(), 1211, 6, 3115)));
        C0008.m255(me, C0028.m1632(jSONObject, C0012.m361(m470(), 1217, 5, 1013)));
        C0011.m343(me, C0028.m1632(jSONObject, C0014.m421(m470(), 1222, 6, 1845)));
        C0043.m2035(me, C0028.m1632(jSONObject, C0045.m2098(m470(), 1228, 6, 2510)));
        C0055.m2330(me, C0028.m1632(jSONObject, C0033.m1764(m470(), 1234, 8, 3251)));
        C0021.m1409(me, C0028.m1632(jSONObject, C0007.m210(m470(), 1242, 5, 354)));
        String str3 = C0025.m1542(m470(), 1247, 3, 2849);
        C0044.m2056(me, C0028.m1632(jSONObject, str3));
        C0039.m1933(me, C0028.m1632(jSONObject, C0021.m1417(m470(), 1250, 8, 2497)));
        JSONObject jSONObject2 = C0041.m1969(jSONObject, C0013.m380(m470(), 1258, 4, 1494));
        String str4 = C0013.m380(m470(), 1262, 4, 1926);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (jSONObject2 == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    StringBuilder sb2 = C0052.m2253(C0009.m277(m470(), 1266, 1, 696));
                    String str5 = C0028.m1632(jSONObject2, str4);
                    String str6 = C0028.m1632(jSONObject2, C0043.m2020(m470(), 1267, 4, 988));
                    StringBuilder sb3 = new StringBuilder();
                    C0032.m1746(sb3, C0006.m180(m470(), 1271, 21, 2657));
                    C0032.m1746(sb3, str6);
                    Uri uri = C0034.m1791(C0043.m2039(sb3));
                    long j = C0043.m2022();
                    String str7 = C0048.m2151((j / 1000) + 21600);
                    String str8 = C0049.m2192((j * 1000) + C0010.m288(m465(this)));
                    String str9 = C0011.m339(new String(C0022.m1420(C0037.m1880(uri, C0015.m457(m470(), 1292, 2, 359)), 0)), str2)[0];
                    String str10 = C0037.m1880(uri, C0054.m2301(m470(), 1294, 5, 327));
                    String str11 = C0046.m2123(m470(), 1299, 9, 3252);
                    boolean z = C0022.m1448(str11, str10);
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
                                str11 = str10;
                                break;
                            case 500:
                                break;
                        }
                        i2 = 1802;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    C0032.m1746(sb4, str8);
                    String str12 = C0037.m1882(m470(), 1308, 1, 335);
                    C0032.m1746(sb4, str12);
                    C0032.m1746(sb4, str11);
                    C0032.m1746(sb4, str12);
                    C0032.m1746(sb4, str11);
                    String str13 = C0023.m1463(C0043.m2039(sb4));
                    StringBuilder sb5 = C0037.m1877(str9, str2);
                    C0032.m1746(sb5, m465(this));
                    C0032.m1746(sb5, str2);
                    C0032.m1746(sb5, str5);
                    C0032.m1746(sb5, str2);
                    C0032.m1746(sb5, str13);
                    C0032.m1746(sb5, str2);
                    C0032.m1746(sb5, str7);
                    C0032.m1746(sb2, C0048.m2160(C0007.m210(m470(), 1311, 61, 2298), new Object[]{C0023.m1463(C0043.m2039(sb5)), str7, str8, str11, C0037.m1880(uri, C0031.m1713(m470(), 1309, 2, 1356)), str11, m465(this)}));
                    str = C0043.m2039(sb2);
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
                case 239:
                    str = C0031.m1705();
                    break;
            }
            i = 1678;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            String str14 = C0029.m1635(m470(), 1372, 6, 1016);
            int i6 = C0035.m1823(C0033.m1766(jSONObject, str14));
            int i7 = 48767;
            while (true) {
                i7 ^= 48784;
                switch (i7) {
                    case 14:
                    case 45:
                        String str15 = C0020.m1390(m470(), 1385, 3, 1454);
                        C0020.m1375(me, C0038.m1902(str15, arrayList));
                        C0005.m160(me, C0038.m1902(str15, arrayList2));
                        return C0000.m21(me);
                    case 76:
                        JSONObject jSONObject3 = C0008.m237(C0033.m1766(jSONObject, str14), i5);
                        C0003.m116(arrayList, C0028.m1632(jSONObject3, str4));
                        ArrayList arrayList3 = new ArrayList();
                        int i8 = 0;
                        while (true) {
                            String str16 = C0013.m380(m470(), 1378, 5, 2618);
                            int i9 = C0035.m1823(C0033.m1766(jSONObject3, str16));
                            int i10 = 48891;
                            while (true) {
                                i10 ^= 48908;
                                switch (i10) {
                                    case 22:
                                    case 53:
                                        C0003.m116(arrayList2, C0038.m1902(C0009.m277(m470(), 1384, 1, 2101), arrayList3));
                                        i4 = i5 + 1;
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
                                    case 503:
                                        i10 = i8 < i9 ? 49635 : 48953;
                                    case 32495:
                                        JSONObject jSONObject4 = C0008.m237(C0033.m1766(jSONObject3, str16), i8);
                                        StringBuilder sb6 = new StringBuilder();
                                        C0032.m1746(sb6, C0028.m1632(jSONObject4, str3));
                                        C0032.m1746(sb6, str);
                                        String str17 = C0043.m2039(sb6);
                                        StringBuilder sb7 = new StringBuilder();
                                        C0032.m1746(sb7, C0028.m1632(jSONObject4, str4));
                                        C0032.m1746(sb7, C0043.m2020(m470(), 1383, 1, 2377));
                                        C0032.m1746(sb7, str17);
                                        C0003.m116(arrayList3, C0043.m2039(sb7));
                                        i8++;
                                        int i12 = 49666;
                                        while (true) {
                                            i12 ^= 49683;
                                            switch (i12) {
                                                case 17:
                                                    i12 = 49697;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                    case 239:
                        i7 = i5 < i6 ? 48860 : 48829;
                }
            }
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = null;
        LinkedHashMap linkedHashMap = null;
        short[] sArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        p9.yq yqVar = null;
        p9 p9Var = null;
        String str5 = "ۢ۠ۡ";
        while (true) {
            switch (C0002.m76(str5)) {
                case 56359:
                    yqVar = new p9.yq(str3, str4);
                    C0003.m116(arrayList3, yqVar);
                    sArr = m470();
                    str3 = C0049.m2175(sArr, 1421, 2, 1363);
                    str5 = "ۢۢۦ";
                    break;
                case 56387:
                    yqVar = new p9.yq(str, C0014.m421(sArr, 1458, 4, 2998));
                    C0003.m116(arrayList2, yqVar);
                    sArr = m470();
                    str5 = "ۢۥۥ";
                    break;
                case 56479:
                    sArr = m470();
                    str2 = C0028.m1613(sArr, 1392, 2, 2981);
                    C0003.m116(arrayList, new rP(str, str2));
                    str5 = "ۣۥۨ";
                    break;
                case 56569:
                    C0003.m116(arrayList3, p9Var);
                    C0050.m2215(linkedHashMap, str2, arrayList3);
                    return C0049.m2178(arrayList, linkedHashMap);
                case 56571:
                    sArr = m470();
                    str4 = C0009.m277(sArr, 1409, 2, 848);
                    C0003.m116(arrayList, new rP(str3, str4));
                    str5 = "۠ۡ";
                    break;
                case 1746688:
                    yqVar = new p9.yq(str, C0032.m1749(sArr, 1470, 2, 2274));
                    C0003.m116(arrayList2, yqVar);
                    sArr = m470();
                    str5 = "ۦۧۡ";
                    break;
                case 1746974:
                    yqVar = new p9.yq(str, C0043.m2020(sArr, 1440, 6, 1304));
                    C0003.m116(arrayList2, yqVar);
                    sArr = m470();
                    str5 = "ۢۢۡ";
                    break;
                case 1747780:
                    arrayList2 = new ArrayList();
                    str = C0033.m1764(m470(), 1436, 4, 1273);
                    sArr = m470();
                    str5 = "۟ۨۧ";
                    break;
                case 1747804:
                    yqVar = new p9.yq(str3, str4);
                    C0003.m116(arrayList3, yqVar);
                    sArr = m470();
                    str3 = C0057.m2384(sArr, 1427, 2, 1104);
                    str5 = "ۣۢۧ";
                    break;
                case 1747807:
                    C0003.m116(arrayList2, yqVar);
                    str = C0055.m2320(m470(), 1454, 4, 2246);
                    sArr = m470();
                    str5 = "ۢۥ";
                    break;
                case 1748705:
                    C0003.m116(arrayList, new rP(str2, str3));
                    sArr = m470();
                    str3 = C0045.m2098(sArr, 1401, 8, 2004);
                    str5 = "ۣۨ";
                    break;
                case 1748740:
                    C0003.m116(arrayList, new rP(str3, str4));
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    str5 = "ۤۡۥ";
                    break;
                case 1748861:
                    yqVar = new p9.yq(str, C0023.m1457(sArr, 1484, 2, 1048));
                    C0003.m116(arrayList2, yqVar);
                    p9Var = new p9(str3, str4, arrayList2);
                    str5 = "ۨۡ";
                    break;
                case 1749603:
                    arrayList = new ArrayList();
                    linkedHashMap = new LinkedHashMap();
                    sArr = m470();
                    str = C0054.m2301(sArr, 1388, 4, 2560);
                    str5 = "ۥۤ";
                    break;
                case 1749635:
                    C0003.m116(arrayList2, yqVar);
                    str = C0041.m1994(m470(), 1480, 4, 2633);
                    sArr = m470();
                    str5 = "ۣۡۧ";
                    break;
                case 1749665:
                    str = C0035.m1833(sArr, 1446, 4, 1826);
                    sArr = m470();
                    yqVar = new p9.yq(str, C0052.m2261(sArr, 1450, 4, 3273));
                    str5 = "ۣ۠ۤ";
                    break;
                case 1749670:
                    sArr = m470();
                    str4 = C0003.m86(sArr, 1423, 1, 1489);
                    yqVar = new p9.yq(str3, str4);
                    C0003.m116(arrayList3, yqVar);
                    str5 = "ۤۢۡ";
                    break;
                case 1749762:
                    str = C0026.m1551(sArr, 1462, 4, 512);
                    sArr = m470();
                    yqVar = new p9.yq(str, C0045.m2098(sArr, 1466, 2, 1263));
                    str5 = "ۦۣ۠";
                    break;
                case 1749822:
                    sArr = m470();
                    str4 = C0005.m169(sArr, 1429, 1, 1708);
                    yqVar = new p9.yq(str3, str4);
                    C0003.m116(arrayList3, yqVar);
                    str5 = "ۥ۠ۨ";
                    break;
                case 1750726:
                    str2 = C0049.m2175(m470(), 1394, 5, 1665);
                    sArr = m470();
                    str3 = C0009.m277(sArr, 1399, 2, 937);
                    str5 = "ۡۢۢ";
                    break;
                case 1751560:
                    str3 = C0052.m2261(m470(), 1418, 2, 2307);
                    sArr = m470();
                    str4 = C0033.m1764(sArr, 1420, 1, 2703);
                    str5 = "ۡۨ";
                    break;
                case 1751587:
                    str3 = C0047.m2133(m470(), 1424, 2, 2215);
                    sArr = m470();
                    str4 = C0036.m1850(sArr, 1426, 1, 2291);
                    str5 = "۠ۤ۠";
                    break;
                case 1752493:
                    str3 = C0049.m2175(m470(), 1430, 4, 2983);
                    sArr = m470();
                    str4 = C0022.m1433(sArr, 1434, 2, 809);
                    str5 = "ۧۢ۠";
                    break;
                case 1753449:
                    C0003.m116(arrayList2, yqVar);
                    str = C0044.m2052(m470(), 1468, 2, 1592);
                    sArr = m470();
                    str5 = "۟۟۠";
                    break;
                case 1753664:
                    str = C0033.m1764(sArr, 1472, 4, 2332);
                    sArr = m470();
                    yqVar = new p9.yq(str, C0030.m1688(sArr, 1476, 4, 2482));
                    str5 = "ۢۡۢ";
                    break;
                case 1754469:
                    p9Var = new p9(str3, str4, arrayList3);
                    C0003.m116(arrayList2, p9Var);
                    C0050.m2215(linkedHashMap, str, arrayList2);
                    arrayList3 = new ArrayList();
                    str5 = "ۣ۠ۧ";
                    break;
                default:
                    str3 = C0029.m1635(m470(), 1411, 3, 436);
                    sArr = m470();
                    str4 = C0045.m2098(sArr, 1414, 4, 894);
                    str5 = "ۣۡۦ";
                    break;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:2|(5:3|4|5|27|25)|18|9|10|(3:11|12|31)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        r0 = com.github.catvod.spider.merge.C0031.m1705();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r1 = com.github.catvod.spider.merge.C0029.m1658(r8)
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 != 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = com.github.catvod.spider.C0049.m2191(r8)
            r6.yq = r0
        L1a:
            short[] r0 = m470()     // Catch: java.lang.Exception -> L78
            r1 = 1486(0x5ce, float:2.082E-42)
            r2 = 42
            r3 = 1220(0x4c4, float:1.71E-42)
            java.lang.String r0 = com.github.catvod.parser.C0012.m361(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L78
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L78
            r1.<init>()     // Catch: java.lang.Exception -> L78
            short[] r2 = m470()     // Catch: java.lang.Exception -> L78
            r3 = 1528(0x5f8, float:2.141E-42)
            r4 = 64
            r5 = 1548(0x60c, float:2.169E-42)
            java.lang.String r2 = com.github.catvod.parser.C0009.m277(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L78
            com.github.catvod.spider.merge.w2 r0 = com.github.catvod.spider.C0042.m2006(r0, r2, r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = com.github.catvod.spider.C0052.m2257(r0)     // Catch: java.lang.Exception -> L78
            com.google.gson.JsonObject r0 = m464(r0)     // Catch: java.lang.Exception -> L78
            short[] r1 = m470()     // Catch: java.lang.Exception -> L78
            r2 = 1592(0x638, float:2.231E-42)
            r3 = 4
            r4 = 2775(0xad7, float:3.889E-42)
            java.lang.String r1 = com.github.catvod.spider.merge.C0035.m1833(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L78
            com.google.gson.JsonObject r0 = m477(r0, r1)     // Catch: java.lang.Exception -> L78
            short[] r1 = m470()     // Catch: java.lang.Exception -> L78
            r2 = 1596(0x63c, float:2.236E-42)
            r3 = 3
            r4 = 574(0x23e, float:8.04E-43)
            java.lang.String r1 = com.github.catvod.spider.C0044.m2052(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L78
            com.google.gson.JsonElement r0 = m468(r0, r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = m469(r0)     // Catch: java.lang.Exception -> L78
            r1 = 1740(0x6cc, float:2.438E-42)
        L6f:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L75;
                case 54: goto L7d;
                default: goto L74;
            }
        L74:
            goto L6f
        L75:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L6f
        L78:
            r0 = move-exception
            java.lang.String r0 = com.github.catvod.spider.merge.C0031.m1705()
        L7d:
            r6.N = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Alllive.init(android.content.Context, java.lang.String):void");
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0056.m2351(true);
        boolean z = C0030.m1681(str2, C0005.m169(m470(), 1599, 4, 2334));
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
                    str2 = C0022.m1434(C0042.m2010(m470(), 1603, 6, 646), str2);
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        iX iXVar = new iX();
        C0013.m394(iXVar, str2, false);
        return C0033.m1763(iXVar);
    }

    public void showInputQRCode() {
        int i = 1616;
        try {
            StringBuilder sb = new StringBuilder();
            C0032.m1746(sb, C0005.m169(m470(), 1609, 7, 2122));
            C0032.m1746(sb, C0021.m1416());
            C0032.m1746(sb, C0035.m1833(m470(), 1616, 42, 2287));
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
            C0020.m1389(textView, C0005.m169(m470(), 1658, 14, 997));
            C0000.m17(textView, -1);
            C0020.m1394(textView, 17);
            C0015.m459(frameLayout, textView, layoutParams2);
            AlertDialog alertDialog = C0026.m1570(C0044.m2078(new AlertDialog.Builder(C0022.m1444()), frameLayout));
            this.i = alertDialog;
            C0039.m1922(C0035.m1809(alertDialog), new ColorDrawable(0));
            C0056.m2346(m472(this), new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.z
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Alllive.this.tF = false;
                }
            });
        } catch (Exception e) {
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
        }
        int i3 = C0039.m1918();
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (i3 < 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    System.out.println(Float.valueOf(C0043.m2024("eHUg0fhfywT8hDiUChG0rF")));
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }
}
