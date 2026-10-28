package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.Pan;
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
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.DialogInterface$OnDismissListenerC0149mg;
import com.github.catvod.spider.merge.FA;
import com.github.catvod.spider.merge.H;
import com.github.catvod.spider.merge.M4;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Pg;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.RunnableC0083b;
import com.github.catvod.spider.merge.RunnableC0178sN;
import com.github.catvod.spider.merge.Sq;
import com.github.catvod.spider.merge.St;
import com.github.catvod.spider.merge.U;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.XM;
import com.github.catvod.spider.merge.Ys;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.by;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.fj;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.un;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Pan extends Spider {
    public static FA Nl;
    public static AlertDialog OW;
    public static boolean ee;
    public static String g9;
    public static boolean v;
    public static long xa;
    private Boolean B;
    protected Boolean F5;
    private Boolean G;
    private Boolean G4;
    protected Boolean W;
    protected Boolean dT;
    private Boolean q;
    protected Boolean v3;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f41short = {25459, 22109, 2403, 1200, 1200, 1200, 1257, 1190, 1195, 1198, 1214, 1202, 1193, 1187, 1205, 1198, 1201, 1186, 1257, 1188, 1192, 1194, 1300, 1300, 1300, 1357, 1282, 1295, 1290, 1299, 1282, 1293, 1357, 1280, 1292, 1294, 3115, 3133, 3110, 3129, 3114, 3169, 3130, 3116, 3169, 3116, 3105, 807, 822, 825, 889, 821, 822, 830, 819, 802, 889, 820, 824, 826, 431, 446, 433, 497, 430, 426, 446, 429, 436, 497, 444, 433, 2016, 2019, 2018, 2160, 2150, 2173, 2146, 2161, 2106, 2145, 2167, 2106, 2167, 2170, 1239, 1167, 1176, 1209, 1192, 1191, 1255, 1195, 1192, 1184, 1197, 1212, 1255, 1194, 1190, 1188, 2225, 2231, 2302, 2281, 2335, 2335, 2335, 2374, 2313, 2308, 2305, 2321, 2333, 2310, 2316, 2330, 2305, 2334, 2317, 2374, 2315, 2311, 2309, 1379, 1379, 1379, 1338, 1397, 1400, 1405, 1380, 1397, 1402, 1338, 1399, 1403, 1401, 2625, 2573, 2586, 1577, 1592, 1591, 1655, 1576, 1580, 1592, 1579, 1586, 1655, 1594, 1591, 1870, 1810, 1797, 1835, 1831, 1825, 1832, 1827, 1842, 19107, 19198, 1241, 25052, 29303, 30680, 20569, 21067, 21071, 2524, 30473, -31312, 29532, -30454, 1171, 19177, 29245, -32490, 25560, 22767, 32753, 1226, 30666, 28006, 27849, 3141, 16959, 31467, -30272, 27406, 22773, 2871, 23152, 23152, 880, 32373, 19932, 31788, 25154, 1513, 22037, 29511, -25691, -25718, -27604, 23244, 868, 28871, 30154, 26903, 22558, -27952, -27952, 2967, -31691, 27505, 26557, 3154, 31484, -31333, 29817, 28082, 20698, 600, -31482, -31484, 2514, 2522, 2517, 2512, 2512, 2516, 2514, 2514, 2522, 2512, 24377, 29872, 23966, 599, 587, 582, 606, 618, 584, 579, 578, 2363, 2351, 2322, 2340, 2367, 2336, 2355, 2313, 2339, 2341, 2355, 2309, 2338, 2359, 2338, 2355, 392, 389, 384, 438, 412, 410, 396, 442, 413, 392, 413, 396, 2505, 2511, 2548, 2526, 2520, 2510, 2552, 2527, 2506, 2527, 2510, 1729, 1751, 1771, 1729, 1735, 1745, 1767, 1728, 1749, 1728, 1745, 2122, 2126, 2138, 2121, 2128, 2148, 2126, 2120, 2142, 2152, 2127, 2138, 2127, 2142, 612, 629, 614, 615, 625, 1085, 1082, 1060, 1626, 1604, 1616, 2001, 1990, 1990, 2041, 1991, 2003, 2365, 2348, 2353, 2365, 2406, 2337, 2365, 2340, 2341, 2999, 2996, 2996, 3002, 2997, 2978, 3069, 3071, 3042, 3061, 3060, 2994, 3049, 3042, 2992, 3032, 3022, 2987, 3065, 3060, 3069, 3048, 2992, 3044, 3043, 3069, 3064, 3065, 2987, 26661, -25716, 2992, 2986, 2989, 2982, 2989, 3048, 3043, 3054, 3042, 3049, 3048, 3032, 3039, 3012, 3022, 3042, 3040, 3069, 3042, 3043, 3048, 3043, 3065, 2981, 3069, 3064, 3070, 3045, 3032, 3071, 3041, 2980, 2998, 2951, 2989, 2989, 2989, 2989, 2989, 2989, 3056, 2989, 3048, 3041, 3070, 3048, 2989, 3044, 3051, 2989, 2981, 3069, 3064, 3070, 3045, 3033, 3060, 3069, 3048, 2989, 2992, 2992, 2992, 2989, 2986, 3006, 2986, 2980, 2989, 3062, 2951, 2989, 2989, 2989, 2989, 2989, 2989, 2989, 2989, 3052, 3069, 3044, 3032, 3071, 3041, 2989, 2992, 2989, 2986, 3045, 3065, 3065, 3069, 2999, 2978, 2978, 1173, 1174, 1174, 1176, 1175, 1152, 1247, 1245, 1216, 1239, 1238, 1168, 1227, 1216, 1170, 1229, 1230, 1222, 1227, 1242, 1161, 1243, 1238, 1247, 1226, 1170, 1222, 1217, 1247, 1242, 1243, 1161, 26375, -27474, 1170, 1160, 1167, 1156, 1167, 1226, 1217, 1228, 1216, 1227, 1226, 1274, 1277, 1254, 1260, 1216, 1218, 1247, 1216, 1217, 1226, 1217, 1243, 1159, 1247, 1242, 1244, 1223, 1274, 1245, 1219, 1158, 1172, 1189, 1167, 1167, 1167, 1167, 1167, 1167, 1234, 1167, 1226, 1219, 1244, 1226, 1167, 1222, 1225, 1167, 1159, 1247, 1242, 1244, 1223, 1275, 1238, 1247, 1226, 1167, 1170, 1170, 1170, 1167, 1160, 1181, 1160, 1158, 1167, 1236, 1189, 1167, 1167, 1167, 1167, 1167, 1167, 1167, 1167, 1230, 1247, 1222, 1274, 1245, 1219, 1167, 1170, 1167, 1160, 1223, 1243, 1243, 1247, 1173, 1152, 1152, 1406, 1405, 1405, 1395, 1404, 1387, 1332, 1334, 1323, 1340, 1341, 1403, 1312, 1323, 1401, 1333, 1329, 1317, 1334, 1327, 1378, 1328, 1341, 1332, 1313, 1401, 1325, 1322, 1332, 1329, 1328, 1378, 26348, -27323, 1401, 1379, 1380, 1391, 1380, 1313, 1322, 1319, 1323, 1312, 1313, 1297, 1302, 1293, 1287, 1323, 1321, 1332, 1323, 1322, 1313, 1322, 1328, 1388, 1332, 1329, 1335, 1324, 1297, 1334, 1320, 1389, 1407, 1358, 1380, 1380, 1380, 1380, 1380, 1380, 1337, 1380, 1380, 1313, 1320, 1335, 1313, 1380, 1325, 1314, 1380, 1388, 1332, 1329, 1335, 1324, 1296, 1341, 1332, 1313, 1380, 1401, 1401, 1401, 1380, 1379, 1392, 1379, 1389, 1380, 1343, 1358, 1380, 1380, 1380, 1380, 1380, 1380, 1380, 1380, 1317, 1332, 1325, 1297, 1334, 1320, 1380, 1401, 1380, 1379, 1324, 1328, 1328, 1332, 1406, 1387, 1387, 3221, 3222, 3222, 3224, 3223, 3200, 3295, 3293, 3264, 3287, 3286, 3216, 3275, 3264, 3218, 3230, 3229, 3228, 3209, 3291, 3286, 3295, 3274, 3218, 3270, 3265, 3295, 3290, 3291, 3209, 28423, -25426, 3218, 3208, 3215, 3204, 3215, 3274, 3265, 3276, 3264, 3275, 3274, 3322, 3325, 3302, 3308, 3264, 3266, 3295, 3264, 3265, 3274, 3265, 3291, 3207, 3295, 3290, 3292, 3271, 3322, 3293, 3267, 3206, 3220, 3237, 3215, 3215, 3215, 3215, 3215, 3215, 3215, 3282, 3274, 3267, 3292, 3274, 3215, 3270, 3273, 3215, 3207, 3295, 3290, 3292, 3271, 3323, 3286, 3295, 3274, 3215, 3218, 3218, 3218, 3215, 3208, 3226, 3208, 3206, 3215, 3284, 3237, 3215, 3215, 3215, 3215, 3215, 3215, 3215, 3215, 3278, 3295, 3270, 3322, 3293, 3267, 3215, 3218, 3215, 3208, 3271, 3291, 3291, 3295, 3221, 3200, 3200, 2018, 2017, 2017, 2031, 2016, 2039, 1960, 1962, 1975, 1952, 1953, 2023, 1980, 1975, 2021, 1977, 1972, 1969, 2046, 1964, 1953, 1960, 1981, 2021, 1969, 1974, 1960, 1965, 1964, 2046, 25712, -26663, 2021, 2047, 2040, 2035, 2040, 1981, 1974, 1979, 1975, 1980, 1981, 1933, 1930, 1937, 1947, 1975, 1973, 1960, 1975, 1974, 1981, 1974, 1964, 2032, 1960, 1965, 1963, 1968, 1933, 1962, 1972, 2033, 2019, 2002, 2040, 2040, 2040, 2040, 2040, 2040, 2040, 1957, 1981, 1972, 1963, 1981, 2040, 1969, 1982, 2040, 2032, 1960, 1965, 1963, 1968, 1932, 1953, 1960, 1981, 2040, 2021, 2021, 2021, 2040, 2047, 2030, 2047, 2033, 2040, 1955, 2002, 2040, 2040, 2040, 2040, 2040, 2040, 2040, 2040, 1977, 1960, 1969, 1933, 1962, 1972, 2040, 2021, 2040, 2047, 1968, 1964, 1964, 1960, 2018, 2039, 2039, 431, 428, 428, 418, 429, 442, 485, 487, 506, 493, 492, 426, 497, 506, 424, 503, 
    508, 505, 508, 435, 481, 492, 485, 496, 424, 508, 507, 485, 480, 481, 435, 25149, -28268, 424, 434, 437, 446, 437, 496, 507, 502, 506, 497, 496, 448, 455, 476, 470, 506, 504, 485, 506, 507, 496, 507, 481, 445, 485, 480, 486, 509, 448, 487, 505, 444, 430, 415, 437, 437, 437, 437, 437, 437, 488, 415, 415, 437, 437, 437, 437, 437, 437, 483, 500, 487, 437, 493, 509, 487, 437, 424, 437, 507, 496, 482, 437, 461, 472, 473, 477, 481, 481, 485, 455, 496, 484, 480, 496, 486, 481, 445, 444, 430, 415, 437, 437, 437, 437, 437, 437, 493, 509, 487, 443, 506, 485, 496, 507, 445, 434, 466, 464, 449, 434, 441, 437, 500, 485, 508, 448, 487, 505, 441, 437, 481, 487, 480, 496, 444, 430, 415, 437, 437, 437, 437, 437, 437, 493, 509, 487, 443, 506, 507, 487, 496, 500, 497, 492, 486, 481, 500, 481, 496, 502, 509, 500, 507, 498, 496, 437, 424, 437, 499, 480, 507, 502, 481, 508, 506, 507, 437, 445, 444, 437, 494, 415, 437, 437, 437, 437, 437, 437, 437, 437, 508, 499, 437, 445, 493, 509, 487, 443, 487, 496, 500, 497, 492, 454, 481, 500, 481, 496, 437, 424, 424, 424, 437, 461, 472, 473, 477, 481, 481, 485, 455, 496, 484, 480, 496, 486, 481, 443, 465, 474, 475, 464, 444, 437, 494, 415, 437, 437, 437, 437, 437, 437, 437, 437, 437, 437, 508, 499, 437, 445, 493, 509, 487, 443, 486, 481, 500, 481, 480, 486, 437, 424, 424, 424, 437, 423, 421, 421, 444, 437, 494, 415, 437, 437, 437, 437, 437, 437, 437, 437, 437, 437, 437, 437, 502, 506, 507, 486, 506, 505, 496, 443, 505, 506, 498, 445, 434, -30110, 28119, 25477, 21258, 434, 444, 430, 415, 437, 437, 437, 437, 437, 437, 437, 437, 437, 437, 488, 437, 496, 505, 486, 496, 437, 494, 415, 437, 437, 437, 437, 437, 437, 437, 437, 437, 437, 437, 437, 502, 506, 507, 486, 506, 505, 496, 443, 505, 506, 498, 445, 434, -30110, 28119, 22692, -29520, 434, 444, 430, 415, 437, 437, 437, 437, 437, 437, 437, 437, 437, 437, 488, 415, 437, 437, 437, 437, 437, 437, 437, 437, 488, 415, 437, 437, 437, 437, 437, 437, 488, 430, 415, 437, 437, 437, 437, 437, 437, 493, 509, 487, 443, 486, 496, 507, 497, 445, 444, 430, 415, 437, 437, 437, 437, 488, 415, 437, 437, 425, 442, 486, 502, 487, 508, 485, 481, 427, 415, 425, 442, 503, 506, 497, 492, 427, 415, 415, 425, 442, 509, 481, 504, 505, 427, 22581, 32401, 3013, 3032, 28234, -25094, 2954, 11945, 2954, 28112, -29865, 28001, -29722, 2875, 11800, 2875, 22660, 32288, 2932, 2921, 28411, -25269, 20693, 928, 20511, 30395, 1007, 1010, 26208, -27184, 20594, 775, 25949, -31782, 22011, 21691, 18454, -28597, -27132, 18691, 27211, 24673, 20787, 21590, 2140, 2083, 2068, 2089, 2109, 2108, 2087, 315, 303, 302, 309, 262, 334, 305, 1237, 1194, 911, 923, 922, 897, 2659, 2677, 31658, 29219, 31300, -30444, 22198, 20725, 26473, 23156, 20835, 31466, 21444, 3258, 22718, 31161, 17084, 3257, 24446, -31926, 24052, 22557, 26765, 29107, -29317, 20832, 31305, 3256, 25864, 29085, 24097, 29999, 1844, 1849, 27511, 31270, 21256, 21880, 32497, 22495, 26702, 31963, 17735, 26127, 2674, 2687, 28376, 31309, 23254, 23254, 3300, 3305, 27103, 32074, -25103, 31030, 3043, 3054, 23561, 32014, 17931, 22789, 31857, 18292, 22905, 26407, 20148, 28156, -272, 22676, 29594, -272, 22451, 22451, -272, -26733, 29524, 19506, 28538, -906, 21813, 21813, -906, 23058, 28956, -906, -27371, 29138, 24537, 29911, -1603, 20734, 20734, -1603, 18937, 27313, -1603, -28450, 29721, 23393, 28783, -763, 19777, 28169, -763, 21574, 21574, -763, -27546, 28833, 24493, 24493, -2322, 20618, 31620, -2322, 18090, 26082, -2322, -24691, 31562, 23707, 23707, -2600, 17820, 26324, -2600, 21436, 30898, -2600, -25413, 30844, 31904, 29993, 24675, 23934, 1010, 998, 987, 1005, 1014, 1001, 1018, 960, 1002, 1004, 1018, 972, 1003, 1022, 1003, 1018, 20772, 29776, 20309, 1569, 1580, 1577, 1567, 1589, 1587, 1573, 1555, 1588, 1569, 1588, 1573, 513, 519, 572, 534, 528, 518, 560, 535, 514, 535, 518, 2440, 2462, 2466, 2440, 2446, 2456, 2478, 2441, 2460, 2441, 2456, 1427, 1431, 1411, 1424, 1417, 1469, 1431, 1425, 1415, 1457, 1430, 1411, 1430, 1415, 23751, 32192, 18117, -26809, 21157, 1739, 1754, 1754, 22009, 21861, -30383, 22511, -30880, 23419, 31195, 28754, 28618, -30230, 27198, 23967, 25062, 3318, 3324, 3321, 3324, 1891, 1903, 1897, 1888, 1899, 1914, 29517, 22807, 26478, 2984, 2984, 2984, 29517, 22807, 17799, -31503, 1125, 1125, 1125, 19018, -29892, 1125, 2457, 2453, 2451, 2458, 2449, 2432, 2510, 2483, 2479, 2479, 2475, 2472, 2529, 31050, 21264, 1515, 1527, 1527, 1523, 1520, 1465, 1452, 1452, 1514, 1518, 1508, 1459, 1460, 1453, 1520, 1516, 1508, 1516, 1526, 1504, 1511, 1517, 1453, 1504, 1516, 1518, 1452, 1525, 1457, 1452, 1527, 1515, 1526, 1518, 1505, 1452, 1521, 1510, 1527, 1530, 1523, 1510, 1500, 1510, 1531, 1504, 1519, 1526, 1511, 1510, 1500, 1508, 1514, 1509, 1452, 1510, 1531, 1527, 1452, 1506, 1526, 1527, 1516, 1452, 1522, 1452, 1466, 1462, 1452, 1504, 1521, 1516, 1523, 1452, 1531, 1530, 1452, 1506, 1514, 1452, 1527, 1452, 1459, 1452, 1468, 1506, 1523, 1523, 1514, 1511, 1470, 1458, 1457, 1457, 1445, 1526, 1521, 1519, 1470, 1515, 1527, 1527, 1523, 1520, 1465, 1452, 1452, 1516, 1520, 1520, 1463, 1519, 1514, 1525, 1514, 1510, 1524, 1453, 1518, 1516, 1513, 1514, 1453, 1504, 1516, 1518, 1452, 1527, 1515, 1511, 1500, 1509, 1514, 1519, 1510, 1452, 1457, 1459, 1457, 1462, 1452, 1459, 1460, 1452, 1457, 1467, 1452, 1506, 1461, 1505, 1511, 1505, 1457, 1457, 1504, 1504, 1463, 1505, 1459, 1505, 1509, 1504, 1460, 1505, 1456, 1456, 1456, 1509, 1510, 1504, 1462, 1511, 1459, 1457, 1460, 1505, 1466, 1462, 1458, 1453, 1513, 1523, 1508, 17706, 23994, 1126, 1143, 1144, 1097, 1125, 1145, 1124, 1122, 1098, 1110, 1099, 1101, 18620, 27636, -1800, 24220, 30098, -1800, 20923, 20923, -1800, -28261, 30044, 2806, -2570, 21791, 21791, 20214, 28094, 20488, 31494, -27422, 28709, 2762, 2762, 2762, 746, 360, 2446, 2458, 2439, 2437, 2459, 1686, 1674, 1671, 1695, 1685, 
    24428, 2941, 2936, 2942, 2917, 21056, 31054, 18557, 27445, 20903, 20903, -28408, 30159, 29663, 22917, 17685, -31645, -32615, -25753, 27015, 17765, -31725, 22155, 23065, 2929, 2929, 2929, 782, 791, 796, 807, 785, 796, 1641, 1641, 1641, 2231, 2222, 2213, 2206, 2223, 2208, 2220, 2212, 1251, 1274, 1265, 1226, 1255, 1264, 1272, 1268, 1255, 1278, 1254, 1535, 1515, 1494, 1504, 1531, 1508, 1527, 1485, 1511, 1505, 1527, 1473, 1510, 1523, 1510, 1527, 298, 302, 314, 297, 304, 260, 302, 296, 318, 264, 303, 314, 303, 318, 1946, 1932, 1968, 1946, 1948, 1930, 1980, 1947, 1934, 1947, 1930, 2311, 2314, 2319, 2361, 2323, 2325, 2307, 2357, 2322, 2311, 2322, 2307, 2282, 2284, 2263, 2301, 2299, 2285, 2267, 2300, 2281, 2300, 2285, 487, 502, 505, 452, 504, 482, 485, 500, 498, 452, 504, 485, 483, 2146, 2163, 2172, 2113, 2173, 2144, 2150, 2502, 2499, 2501, 2526, 2549, 2525, 3125, 3094, 3102, 3088, 3095, 3123, 3135, 3133, 3198, 3105, 3109, 3121, 3106, 3131, 3198, 3122, 3106, 3135, 3111, 3107, 3125, 3106, 2324, 2328, 2330, 2393, 2319, 2306, 2329, 2331, 2322, 2334, 2393, 2323, 2328, 2304, 2329, 2331, 2328, 2326, 2323, 2311, 2309, 2328, 2305, 2334, 2323, 2322, 2309, 3080, 3076, 3078, 3141, 3081, 3082, 3074, 3087, 3102, 3141, 3077, 3086, 3103, 3087, 3074, 3096, 3072, 957, 945, 947, 1008, 939, 957, 947, 945, 956, 951, 946, 955, 1008, 946, 951, 938, 955, 841, 836, 845, 782, 841, 846, 852, 837, 850, 846, 837, 852, 782, 836, 847, 855, 846, 844, 847, 833, 836, 782, 845, 833, 846, 833, 839, 837, 850, 782, 848, 844, 853, 851, 1737, 1733, 1735, 1668, 1791, 1769, 1767, 1733, 1736, 1731, 1734, 1743, 1397, 1401, 1403, 1336, 1382, 1407, 1405, 1397, 1402, 1401, 1379, 1394, 1336, 1382, 1407, 1405, 1382, 1399, 1405, 3311, 3299, 3297, 3234, 3327, 3317, 3298, 3299, 3296, 3299, 3307, 3317, 3234, 3272, 3295, 3304, 3299, 3323, 3298, 3296, 3299, 3309, 3304, 26294, -28361, 27471, 29093, 25028, 25744, 21726, 21761, 29638, 22650, 29638, 32747, 23583, -30508, -27862, 25034, 23991, 30219, 24944, 23587, 23419, 25893, 3079, 3099, 3099, 3103, 3157, 3136, 3136, 589, 590, 590, 576, 591, 600, 519, 517, 536, 527, 526, 584, 531, 536, 586, 542, 537, 519, 514, 515, 593, 532, 516, 519, 586, 531, 517, 542, 513, 530, 17352, 31135, 21273, 17238, 28380, 29878, 28447, -25418, 3223, 3316, 3288, 3288, 3292, 3294, 3282, 3223, 28321, 3223, 3299, 3288, 3292, 3282, 3289};
    public static String Gd = C0009.m277(f41short, 0, 3, 2386);
    public Cloud_quark yq = new Cloud_quark();
    public Cloud_ali SN = new Cloud_ali();
    public Cloud_uc N = new Cloud_uc();
    public Cloud_baidu tF = new Cloud_baidu();
    public final List<String> zH = Arrays.asList(C0033.m1764(f41short, 3, 19, 1223), C0030.m1688(f41short, 22, 14, 1379), C0057.m2384(f41short, 36, 11, 3151), C0005.m169(f41short, 47, 13, 855), C0028.m1613(f41short, 60, 12, 479), C0004.m130(f41short, 72, 3, 2001));
    public final List<String> i = Arrays.asList(C0049.m2175(f41short, 75, 11, 2068), C0046.m2123(f41short, 86, 3, 1186));
    public final List<String> t0 = Arrays.asList(C0035.m1833(f41short, 89, 13, 1225), C0023.m1457(f41short, 102, 4, 2259));
    public final List<String> Gc = Arrays.asList(C0000.m18(f41short, 106, 19, 2408), C0033.m1764(f41short, 125, 14, 1300), C0013.m380(f41short, 139, 3, 2592));
    public final List<String> M = Arrays.asList(C0030.m1688(f41short, 142, 12, 1625), C0020.m1390(f41short, 154, 3, 1855));
    public final List<String> KJ = Arrays.asList(C0009.m277(f41short, 157, 6, 1862));

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class KeyValueData {

        /* renamed from: short  reason: not valid java name */
        private static final short[] f44short = {2667, 2054, 2054, 2054, 1441, 1441, 1441, 2459};
        private LinkedHashMap<String, String> yq;

        public KeyValueData(int i) {
            this.yq = new LinkedHashMap<String, String>(i, i) { // from class: com.github.catvod.spider.Pan.KeyValueData.1
                final int yq;

                {
                    this.yq = i;
                }

                @Override // java.util.LinkedHashMap
                protected final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                    return size() > this.yq;
                }
            };
        }

        public static KeyValueData keyValueData(String str) {
            KeyValueData keyValueData = new KeyValueData(5);
            for (String str2 : str.split(C0012.m361(f44short, 0, 1, 2640))) {
                String[] split = str2.split(C0043.m2020(f44short, 1, 3, 2118));
                if (split.length == 2) {
                    keyValueData.put(split[0], split[1]);
                }
            }
            return keyValueData;
        }

        public boolean containsKey(String str) {
            return this.yq.containsKey(str);
        }

        public String get(String str) {
            return this.yq.get(str);
        }

        public void put(String str, String str2) {
            this.yq.put(str, str2);
        }

        public int size() {
            return this.yq.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : this.yq.entrySet()) {
                sb.append(entry.getKey());
                sb.append(C0040.m1953(f44short, 4, 3, 1505));
                sb.append(entry.getValue());
                sb.append(C0052.m2261(f44short, 7, 1, 2464));
            }
            return sb.toString();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class Svod {

        /* renamed from: short  reason: not valid java name */
        private static final short[] f45short = {2268};
        private String N;
        private String SN;
        private String yq;

        public Svod(Pan pan, String str, String str2, String str3) {
            this.yq = str;
            this.SN = str2;
            this.N = str3;
        }

        public String getId() {
            return this.SN;
        }

        public String getName() {
            return this.yq;
        }

        public String getSpeed() {
            return this.N;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.yq);
            arrayList.add(this.SN);
            arrayList.add(this.N);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) C0035.m1833(f45short, 0, 1, 2208));
                }
            }
            return sb.toString();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    class VodResult {
        private String N;
        private String SN;
        private String yq;

        public VodResult(Pan pan, String str, String str2, String str3) {
            this.yq = str;
            this.SN = str2;
            this.N = str3;
        }

        public String getFrom() {
            return this.yq;
        }

        public String getPlayId() {
            return this.N;
        }

        public String getPlayUrl() {
            return this.SN;
        }
    }

    private Drawable Gc() {
        int argb = Color.argb(255, 226, 124, 116);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(argb);
        gradientDrawable.setCornerRadius(10.0f);
        gradientDrawable.setStroke(1, argb);
        return gradientDrawable;
    }

    private Boolean KJ(String str) {
        boolean z;
        boolean z2 = C0022.m1448(str, C0038.m1903(m938(), 163, 7, 1267));
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
                    boolean z3 = C0022.m1448(str, C0044.m2052(m938(), 170, 5, 2550));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (z3) {
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
                                boolean z4 = C0022.m1448(str, C0030.m1688(m938(), 175, 7, 1209));
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (z4) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean z5 = C0022.m1448(str, C0053.m2276(m938(), 182, 4, 1248));
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        boolean z6 = C0022.m1448(str, C0026.m1551(m938(), 186, 7, 3183));
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    if (z6) {
                                                                        break;
                                                                    } else {
                                                                        i5 = 49635;
                                                                        continue;
                                                                    }
                                                                case 32495:
                                                                    boolean z7 = C0022.m1448(str, C0051.m2237(m938(), 193, 2, 2845));
                                                                    int i6 = 49666;
                                                                    while (true) {
                                                                        i6 ^= 49683;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                if (z7) {
                                                                                    break;
                                                                                } else {
                                                                                    i6 = 49759;
                                                                                    continue;
                                                                                }
                                                                            case 50:
                                                                                break;
                                                                            case 76:
                                                                                boolean z8 = C0022.m1448(str, C0031.m1713(m938(), 195, 5, 858));
                                                                                int i7 = 49790;
                                                                                while (true) {
                                                                                    i7 ^= 49807;
                                                                                    switch (i7) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 51:
                                                                                            break;
                                                                                        case 84:
                                                                                            boolean z9 = C0022.m1448(str, C0041.m1994(m938(), 200, 7, 1475));
                                                                                            int i8 = 49914;
                                                                                            while (true) {
                                                                                                i8 ^= 49931;
                                                                                                switch (i8) {
                                                                                                    case 497:
                                                                                                        if (z9) {
                                                                                                            break;
                                                                                                        } else {
                                                                                                            i8 = 50658;
                                                                                                            continue;
                                                                                                        }
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        break;
                                                                                                    case 1769:
                                                                                                        boolean z10 = C0022.m1448(str, C0036.m1850(m938(), 207, 7, 846));
                                                                                                        int i9 = 50689;
                                                                                                        while (true) {
                                                                                                            i9 ^= 50706;
                                                                                                            switch (i9) {
                                                                                                                case 19:
                                                                                                                    if (z10) {
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        i9 = 50782;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                case 45:
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    boolean z11 = C0022.m1448(str, C0045.m2098(m938(), 214, 4, 3005));
                                                                                                                    int i10 = 50813;
                                                                                                                    while (true) {
                                                                                                                        i10 ^= 50830;
                                                                                                                        switch (i10) {
                                                                                                                            case 18:
                                                                                                                                break;
                                                                                                                            case 53:
                                                                                                                                break;
                                                                                                                            case 243:
                                                                                                                                if (z11) {
                                                                                                                                    break;
                                                                                                                                } else {
                                                                                                                                    i10 = 51557;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                            case 4075:
                                                                                                                                boolean z12 = C0022.m1448(str, C0021.m1417(m938(), 218, 6, 3192));
                                                                                                                                int i11 = 51588;
                                                                                                                                while (true) {
                                                                                                                                    i11 ^= 51605;
                                                                                                                                    switch (i11) {
                                                                                                                                        case 17:
                                                                                                                                            if (z12) {
                                                                                                                                                break;
                                                                                                                                            } else {
                                                                                                                                                i11 = 51681;
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                        case 54:
                                                                                                                                            break;
                                                                                                                                        case 87:
                                                                                                                                            break;
                                                                                                                                        case 116:
                                                                                                                                            boolean z13 = C0022.m1448(str, C0029.m1635(m938(), 224, 5, 626));
                                                                                                                                            int i12 = 51712;
                                                                                                                                            while (true) {
                                                                                                                                                i12 ^= 51729;
                                                                                                                                                switch (i12) {
                                                                                                                                                    case 14:
                                                                                                                                                        break;
                                                                                                                                                    case 17:
                                                                                                                                                        if (z13) {
                                                                                                                                                            break;
                                                                                                                                                        } else {
                                                                                                                                                            i12 = 51805;
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                    case 47:
                                                                                                                                                        break;
                                                                                                                                                    case 76:
                                                                                                                                                        boolean z14 = C0022.m1448(str, C0028.m1613(m938(), 229, 10, 2531));
                                                                                                                                                        int i13 = 51836;
                                                                                                                                                        while (true) {
                                                                                                                                                            i13 ^= 51853;
                                                                                                                                                            switch (i13) {
                                                                                                                                                                case 241:
                                                                                                                                                                    if (!z14) {
                                                                                                                                                                        break;
                                                                                                                                                                    } else {
                                                                                                                                                                        i13 = 52580;
                                                                                                                                                                        continue;
                                                                                                                                                                    }
                                                                                                                                                                case 1963:
                                                                                                                                                                    break;
                                                                                                                                                                case 1992:
                                                                                                                                                                    z = false;
                                                                                                                                                                    int i14 = 52735;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i14 ^= 52752;
                                                                                                                                                                        switch (i14) {
                                                                                                                                                                            case 14:
                                                                                                                                                                                break;
                                                                                                                                                                            case 1007:
                                                                                                                                                                                i14 = 52766;
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 2025:
                                                                                                                                                                    int i15 = 52611;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i15 ^= 52628;
                                                                                                                                                                        switch (i15) {
                                                                                                                                                                            case 23:
                                                                                                                                                                                i15 = 52642;
                                                                                                                                                                                break;
                                                                                                                                                                            case 54:
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                            i13 = 52549;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                                i12 = 51774;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    i11 = 51650;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i10 = 50875;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            i9 = 50751;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                i8 = 50627;
                                                                                            }
                                                                                            break;
                                                                                        case 241:
                                                                                            if (z8) {
                                                                                                break;
                                                                                            } else {
                                                                                                i7 = 49883;
                                                                                                continue;
                                                                                            }
                                                                                    }
                                                                                    i7 = 49852;
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                        }
                                                                        i6 = 49728;
                                                                    }
                                                                    break;
                                                            }
                                                            i5 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        if (z5) {
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
        z = true;
        return C0026.m1559(z);
    }

    private Drawable M() {
        int argb = Color.argb(200, 0, 120, 215);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(argb);
        gradientDrawable.setCornerRadius(10.0f);
        gradientDrawable.setStroke(1, argb);
        return gradientDrawable;
    }

    public static /* synthetic */ void N(Pan pan, Button button, String str, boolean z) {
        Objects.requireNonNull(pan);
        button.setBackground(z ? pan.M() : !str.contains(C0045.m2098(f41short, 239, 3, 715)) ? pan.Gc() : pan.t0());
    }

    public static /* synthetic */ void SN(Pan pan, View view) {
        Runnable runnable;
        Objects.requireNonNull(pan);
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3 && pan.G.booleanValue()) {
                        runnable = XM.SN;
                    } else {
                        return;
                    }
                } else if (pan.G4.booleanValue()) {
                    runnable = fj.SN;
                } else {
                    return;
                }
            } else if (pan.B.booleanValue()) {
                runnable = St.SN;
            } else {
                return;
            }
        } else if (pan.q.booleanValue()) {
            runnable = RunnableC0178sN.SN;
        } else {
            return;
        }
        InitOrigin.execute(runnable);
    }

    public static DialogInterface.OnDismissListener dismissInputQRCode() {
        try {
            AlertDialog alertDialog = OW;
            if (alertDialog == null) {
                return null;
            }
            alertDialog.dismiss();
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static File getPlayModeFilesDir() {
        return M4.SN(C0012.m361(f41short, 242, 8, 551));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r1.getBoolean(com.github.catvod.spider.merge.C0028.m1613(com.github.catvod.spider.Pan.f41short, 266, 12, 489), false) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        r0 = r8.t0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r1.getBoolean(com.github.catvod.spider.C0053.m2276(com.github.catvod.spider.Pan.f41short, 278, 11, 2475), false) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        r0 = r8.Gc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r1.getBoolean(com.github.catvod.parser.C0013.m380(com.github.catvod.spider.Pan.f41short, 289, 11, 1716), false) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (r1.getBoolean(com.github.catvod.spider.merge.C0035.m1833(com.github.catvod.spider.Pan.f41short, 300, 14, 2107), false) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void i(com.github.catvod.spider.Pan r8, android.widget.Button r9, android.view.View r10, boolean r11) {
        /*
            r7 = 11
            r6 = 0
            java.util.Objects.requireNonNull(r8)
            java.lang.Object r0 = r10.getTag()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.app.Application r1 = com.github.catvod.spider.InitOrigin.context()
            com.github.catvod.spider.InitOrigin.context()
            short[] r2 = com.github.catvod.spider.Pan.f41short
            r3 = 250(0xfa, float:3.5E-43)
            r4 = 16
            r5 = 2390(0x956, float:3.349E-42)
            java.lang.String r2 = com.github.catvod.spider.C0056.m2339(r2, r3, r4, r5)
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r6)
            if (r11 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r8.M()
        L2d:
            r9.setBackground(r0)
        L30:
            return
        L31:
            if (r0 == 0) goto L79
            r2 = 1
            if (r0 == r2) goto L68
            r2 = 2
            if (r0 == r2) goto L53
            r2 = 3
            if (r0 != r2) goto L30
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r2 = 266(0x10a, float:3.73E-43)
            r3 = 12
            r4 = 489(0x1e9, float:6.85E-43)
            java.lang.String r0 = com.github.catvod.spider.merge.C0028.m1613(r0, r2, r3, r4)
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L63
        L4e:
            android.graphics.drawable.Drawable r0 = r8.t0()
            goto L2d
        L53:
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r2 = 278(0x116, float:3.9E-43)
            r3 = 2475(0x9ab, float:3.468E-42)
            java.lang.String r0 = com.github.catvod.spider.C0053.m2276(r0, r2, r7, r3)
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 != 0) goto L4e
        L63:
            android.graphics.drawable.Drawable r0 = r8.Gc()
            goto L2d
        L68:
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r2 = 289(0x121, float:4.05E-43)
            r3 = 1716(0x6b4, float:2.405E-42)
            java.lang.String r0 = com.github.catvod.parser.C0013.m380(r0, r2, r7, r3)
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L63
            goto L4e
        L79:
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r2 = 300(0x12c, float:4.2E-43)
            r3 = 14
            r4 = 2107(0x83b, float:2.953E-42)
            java.lang.String r0 = com.github.catvod.spider.merge.C0035.m1833(r0, r2, r3, r4)
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L63
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Pan.i(com.github.catvod.spider.Pan, android.widget.Button, android.view.View, boolean):void");
    }

    public static JSONObject msg(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0013.m380(f41short, 314, 5, 532), 0);
        jSONObject.put(C0056.m2339(f41short, 319, 3, 1096), "");
        jSONObject.put(C0047.m2133(f41short, 322, 3, 1591), str);
        jSONObject.put(C0012.m361(f41short, 325, 6, 1972), str);
        return jSONObject;
    }

    public static Object[] proxyInput() {
        String internalIP = ProxyOrigin.getInternalIP();
        String str = C0004.m130(f41short, 331, 9, 2377);
        return new Object[]{200, str, new ByteArrayInputStream(("<!DOCTYPE html>\n<html lang=\"zh-cmn-Hans\">\n\n<head>\n  <meta charset=\"UTF-8\">\n  <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=0,viewport-fit=cover\">\n  <style>\n    body {\n      display: flex;\n      flex-direction: column;\n      align-items: center;\n      justify-content: center;\n      min-height: 100vh;\n      margin: 0;\n      font-family: Arial, sans-serif;\n    }\n\n    .container {\n      width: 90%;\n      max-width: 500px;\n      display: flex;\n      flex-direction: column;\n      align-items: center;\n    }\n\n    .title {\n      font-size: 1.2em;\n      margin-bottom: 30px;\n      text-align: center;\n    }\n\n    .title span {\n      color: red;\n      font-weight: bold;\n    }\n\n    .input-wrapper {\n      width: 100%;\n      margin-bottom: 15px;\n    }\n\n    .input-wrapper textarea {\n      width: 100%;\n      height: 100px;\n      box-sizing: border-box;\n      padding: 10px;\n      font-size: 1em;\n      resize: none;\n    }\n\n    .select-container {\n      width: 100%;\n      margin-bottom: 15px;\n    }\n\n    .select-container select {\n      width: 100%;\n      height: 42px;\n      box-sizing: border-box;\n      padding: 0 10px;\n      font-size: 1em;\n      text-align: center;\n      text-align-last: center; /* For modern browsers */\n    }\n\n    .button {\n      width: 100%;\n      height: 42px;\n      box-sizing: border-box;\n      font-size: 1em;\n      margin-bottom: 10px;\n      cursor: pointer;\n    }\n\n    .button.push {\n      background-color: #4CAF50;\n      color: white;\n      border: none;\n    }\n\n    .button.clear {\n      background-color: #f44336;\n      color: white;\n      border: none;\n    }\n\n    .image-wrapper {\n      width: 100%;\n      display: flex;\n      justify-content: center;\n      margin-bottom: 15px;\n    }\n\n    .image-wrapper img {\n      width: 20%;\n    }\n  </style>\n</head>\n\n<body>\n  <div class=\"container\">\n    <div class=\"image-wrapper\">\n      <img src=\"https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/03/01/02825385af7950edd9bcc89687373210.md.png\" alt=\"图片\">\n    </div>\n    <div class=\"input-wrapper\">\n      <textarea id=\"push_url\"\n        placeholder=\"请输入你需要推送的\n夸克 Cookie\n百度 Cookie\n阿里 32位Token\n哔哩 Cookie\n\"></textarea>\n    </div>\n    <div class=\"select-container\">\n      <select id=\"push_type\">\n        <option value=\"2\">夸克Cookie</option>\n        <option value=\"3\">百度Cookie</option>\n        <option value=\"5\">阿里Token</option>\n        <option value=\"6\">哔哩Cookie</option>\n      </select>\n    </div>\n    <button class=\"button push\" onclick=\"push()\">推送</button>\n    <button class=\"button clear\" onclick=\"clearInput()\">清除</button>\n  </div>\n\n  <script>\n    function clearInput() {\n      document.getElementById('push_url').value = '';\n    }\n\n    function push() {\n      var pushUrl = encodeURIComponent(document.getElementById('push_url').value);\n      var pushType = document.getElementById('push_type').value;\n      var apiUrl = '';\n\n      if (pushType === '1') {\n        apiUrl = 'http://" + internalIP + C0006.m180(f41short, 340, 127, 2957) + internalIP + C0038.m1903(f41short, 467, 130, 1199) + internalIP + C0010.m296(f41short, 597, 131, 1348) + internalIP + C0003.m86(f41short, 728, 128, 3247) + internalIP + C0030.m1688(f41short, 856, 128, 2008) + internalIP + C0055.m2320(f41short, 984, 454, 405)).getBytes())};
    }

    public static void showPanSourceSortDialog(Activity activity) {
        String[] strArr = {C0001.m35(f41short, 1438, 11, 2986), C0033.m1764(f41short, 1449, 11, 2843), C0052.m2261(f41short, 1460, 8, 896), C0042.m2010(f41short, 1468, 4, 807), C0036.m1850(f41short, 1472, 10, 1563)};
        String str = C0031.m1713(f41short, 1482, 7, 2152);
        String str2 = C0028.m1613(f41short, 1489, 7, 378);
        String str3 = C0031.m1713(f41short, 1496, 2, 1249);
        String str4 = C0043.m2020(f41short, 1498, 4, 974);
        String str5 = C0037.m1882(f41short, 1502, 2, 2614);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(C0052.m2261(f41short, 1504, 8, 1275));
        builder.setItems(strArr, new DialogInterface.OnClickListener(new String[]{str, str2, str3, str4, str5}, strArr) { // from class: com.github.catvod.spider.Pan.3

            /* renamed from: short  reason: not valid java name */
            private static final short[] f43short = {1514, 1531, 1524, 1477, 1513, 1525, 1519, 1512, 1529, 1535, 1477, 1513, 1525, 1512, 1518, 2589, 2658, 2645, 2664, 2684, 2685, 2662, 3195, 3175, 3194, 3196, 2880, 2889, 2911, 24604, 23809, 22530, 24990, 942, 948, 942, 2320, 2352, 3037, 3017, 3016, 3027, 2118, 2105, 415, 424, 446, 424, 441, -24723, 31658, 23245, -25501, 30884, 27686, 22011, 32501, 24412, 24193, 30095, 25027, 19272, 26624, 25008, -28160, 18863, 27367, 24781, 1872, 1862};
            final String[] SN;
            final String[] yq;

            {
                this.yq = r1;
                this.SN = strArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x00cd, code lost:
                if (com.github.catvod.spider.C0056.m2339(com.github.catvod.spider.Pan.AnonymousClass3.f43short, 44, 5, 461).equalsIgnoreCase(r2[r0]) != false) goto L15;
             */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.content.DialogInterface r14, int r15) {
                /*
                    Method dump skipped, instructions count: 446
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Pan.AnonymousClass3.onClick(android.content.DialogInterface, int):void");
            }
        });
        builder.create().show();
    }

    private Drawable t0() {
        int argb = Color.argb(255, 4, 204, 148);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(argb);
        gradientDrawable.setCornerRadius(10.0f);
        gradientDrawable.setStroke(1, argb);
        return gradientDrawable;
    }

    public static void tF(final Pan pan, Activity activity) {
        Objects.requireNonNull(pan);
        pan.q = Boolean.valueOf(Rc.ee(Z.Zm().F5) && Rc.ee(Z.Zm().ee));
        pan.B = Boolean.valueOf(Rc.ee(C0203xU.s().Gc));
        pan.G = Boolean.valueOf(Rc.ee(V.v().zH) && Rc.ee(V.v().Gc.t0()));
        pan.G4 = Boolean.valueOf(Rc.ee(RQ.xa().W.N()) && Rc.ee(RQ.xa().F5));
        pan.setUseState();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(16, 16, 16, 16);
        TextView textView = new TextView(activity);
        textView.setText(C0003.m86(f41short, 1512, 18, 3217));
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        textView.setGravity(17);
        linearLayout.addView(textView);
        StringBuilder yq = by.yq(C0051.m2237(f41short, 1530, 6, 1817));
        boolean booleanValue = pan.q.booleanValue();
        String str = C0014.m421(f41short, 1536, 3, 3165);
        String str2 = C0053.m2276(f41short, 1539, 3, 2186);
        yq.append(booleanValue ? str : str2);
        String sb = yq.toString();
        StringBuilder yq2 = by.yq(C0041.m1994(f41short, 1542, 6, 2655));
        yq2.append(pan.B.booleanValue() ? str : str2);
        String sb2 = yq2.toString();
        StringBuilder yq3 = by.yq(C0000.m18(f41short, 1548, 6, 3273));
        yq3.append(pan.G4.booleanValue() ? str : str2);
        String sb3 = yq3.toString();
        StringBuilder yq4 = by.yq(C0002.m57(f41short, 1554, 6, 3022));
        if (!pan.G.booleanValue()) {
            str = str2;
        }
        yq4.append(str);
        String sb4 = yq4.toString();
        boolean booleanValue2 = pan.dT.booleanValue();
        String str3 = C0015.m457(f41short, 1560, 3, 2086);
        String str4 = C0000.m18(f41short, 1563, 3, 2393);
        String str5 = booleanValue2 ? str3 : str4;
        String str6 = pan.F5.booleanValue() ? str3 : str4;
        String str7 = pan.W.booleanValue() ? str3 : str4;
        if (!pan.v3.booleanValue()) {
            str3 = str4;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 4) {
                final String str8 = new String[]{sb, sb2, sb3, sb4}[i2];
                String str9 = new String[]{str5, str6, str7, str3}[i2];
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                linearLayout2.setPadding(16, 16, 16, 16);
                linearLayout2.setBackgroundColor(-1);
                final Button button = new Button(activity);
                button.setText(str8);
                button.setTextColor(-1);
                int textSize = (int) (button.getTextSize() + 90);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                layoutParams.weight = 1.0f;
                layoutParams.height = textSize;
                button.setLayoutParams(layoutParams);
                button.setTag(Integer.valueOf(i2));
                button.setBackground(!str8.contains(str2) ? pan.Gc() : pan.t0());
                button.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.github.catvod.spider.merge.nA
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        Pan.N(Pan.this, button, str8, z);
                    }
                });
                button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.Bu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Pan.SN(Pan.this, view);
                    }
                });
                final Button button2 = new Button(activity);
                button2.setText(str9);
                button2.setTextColor(-1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(230, -2);
                layoutParams2.height = textSize;
                button2.setLayoutParams(layoutParams2);
                button2.setTag(Integer.valueOf(i2));
                layoutParams2.setMargins(16, 0, 0, 0);
                button.setPadding(16, 10, 16, 10);
                button2.setPadding(16, 10, 16, 10);
                if (pan.dT.booleanValue() && i2 == 0) {
                    button2.setBackground(pan.t0());
                }
                if (!pan.dT.booleanValue() && i2 == 0) {
                    button2.setBackground(pan.Gc());
                }
                if (pan.F5.booleanValue() && i2 == 1) {
                    button2.setBackground(pan.t0());
                }
                if (!pan.F5.booleanValue() && i2 == 1) {
                    button2.setBackground(pan.Gc());
                }
                if (pan.W.booleanValue() && i2 == 2) {
                    button2.setBackground(pan.t0());
                }
                if (!pan.W.booleanValue() && i2 == 2) {
                    button2.setBackground(pan.Gc());
                }
                if (pan.v3.booleanValue() && i2 == 3) {
                    button2.setBackground(pan.t0());
                }
                if (!pan.v3.booleanValue() && i2 == 3) {
                    button2.setBackground(pan.Gc());
                }
                button2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.github.catvod.spider.merge.K0
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        Pan.i(Pan.this, button2, view, z);
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.pg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Pan.zH(Pan.this, button2, view);
                    }
                });
                linearLayout2.addView(button);
                linearLayout2.addView(button2);
                linearLayout.addView(linearLayout2);
                i = i2 + 1;
            } else {
                builder.setView(linearLayout).setNegativeButton(C0027.m1601(f41short, 1566, 2, 2735), Pg.yq);
                builder.create().show();
                return;
            }
        }
    }

    public static void yq(Pan pan, Activity activity) {
        Objects.requireNonNull(pan);
        final String[] strArr = {C0036.m1850(f41short, 1568, 11, 428), C0036.m1850(f41short, 1579, 11, 810), C0031.m1713(f41short, 1590, 11, 1761), C0057.m2384(f41short, 1601, 11, 601), C0043.m2020(f41short, 1612, 11, 2482), C0020.m1390(f41short, 1623, 11, 2692)};
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(C0040.m1953(f41short, 1634, 4, 1009));
        builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.Pan.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Application context = InitOrigin.context();
                InitOrigin.context();
                SharedPreferences.Editor edit = context.getSharedPreferences("pan_sort", 0).edit();
                edit.putString("sort", strArr[i]);
                edit.apply();
                InitOrigin.show("排序完成 : " + strArr[i]);
            }
        });
        builder.create().show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r1.getBoolean(r0, false) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
        r10.setText(r2);
        r1 = r1.edit();
        r1.putBoolean(r0, false);
        r1.apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        if (r1.getBoolean(r0, false) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
        if (r1.getBoolean(r0, false) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zH(com.github.catvod.spider.Pan r9, android.widget.Button r10, android.view.View r11) {
        /*
            r5 = 11
            r8 = 1
            r7 = 3
            r6 = 0
            java.util.Objects.requireNonNull(r9)
            android.app.Application r0 = com.github.catvod.spider.InitOrigin.context()
            com.github.catvod.spider.InitOrigin.context()
            short[] r1 = com.github.catvod.spider.Pan.f41short
            r2 = 1638(0x666, float:2.295E-42)
            r3 = 16
            r4 = 927(0x39f, float:1.299E-42)
            java.lang.String r1 = com.github.catvod.spider.C0053.m2276(r1, r2, r3, r4)
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r6)
            java.lang.Object r0 = r11.getTag()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            short[] r2 = com.github.catvod.spider.Pan.f41short
            r3 = 1654(0x676, float:2.318E-42)
            r4 = 376(0x178, float:5.27E-43)
            java.lang.String r2 = com.github.catvod.spider.C0047.m2133(r2, r3, r7, r4)
            if (r0 == 0) goto Lb3
            if (r0 == r8) goto La2
            r3 = 2
            if (r0 == r3) goto L67
            if (r0 == r7) goto L40
        L3c:
            r9.setUseState()
            return
        L40:
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r3 = 1657(0x679, float:2.322E-42)
            r4 = 12
            r5 = 1600(0x640, float:2.242E-42)
            java.lang.String r0 = com.github.catvod.spider.C0055.m2320(r0, r3, r4, r5)
            boolean r3 = r1.getBoolean(r0, r6)
            if (r3 == 0) goto L77
        L52:
            r10.setText(r2)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putBoolean(r0, r6)
            r1.apply()
        L5f:
            android.graphics.drawable.Drawable r0 = r9.Gc()
        L63:
            r10.setBackground(r0)
            goto L3c
        L67:
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r3 = 1669(0x685, float:2.339E-42)
            r4 = 611(0x263, float:8.56E-43)
            java.lang.String r0 = com.github.catvod.parser.C0006.m180(r0, r3, r5, r4)
            boolean r3 = r1.getBoolean(r0, r6)
            if (r3 != 0) goto L52
        L77:
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putBoolean(r0, r8)
            r1.apply()
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r1 = 1705(0x6a9, float:2.389E-42)
            r2 = 2280(0x8e8, float:3.195E-42)
            java.lang.String r0 = com.github.catvod.parser.C0001.m35(r0, r1, r7, r2)
            r10.setText(r0)
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r1 = 1708(0x6ac, float:2.393E-42)
            r2 = 13
            r3 = 1674(0x68a, float:2.346E-42)
            java.lang.String r0 = com.github.catvod.spider.merge.C0033.m1764(r0, r1, r2, r3)
            com.github.catvod.spider.InitOrigin.show(r0)
            android.graphics.drawable.Drawable r0 = r9.t0()
            goto L63
        La2:
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r3 = 1680(0x690, float:2.354E-42)
            r4 = 2557(0x9fd, float:3.583E-42)
            java.lang.String r0 = com.github.catvod.spider.merge.C0029.m1635(r0, r3, r5, r4)
            boolean r3 = r1.getBoolean(r0, r6)
            if (r3 == 0) goto L77
            goto L52
        Lb3:
            short[] r0 = com.github.catvod.spider.Pan.f41short
            r3 = 1691(0x69b, float:2.37E-42)
            r4 = 14
            r5 = 1506(0x5e2, float:2.11E-42)
            java.lang.String r0 = com.github.catvod.spider.merge.C0040.m1953(r0, r3, r4, r5)
            boolean r3 = r1.getBoolean(r0, r6)
            if (r3 == 0) goto L77
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putBoolean(r0, r6)
            r1.apply()
            r10.setText(r2)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Pan.zH(com.github.catvod.spider.Pan, android.widget.Button, android.view.View):void");
    }

    /* renamed from: ـﺯفو  reason: contains not printable characters */
    public static short[] m938() {
        if (C0057.m2368() >= 0) {
            return f41short;
        }
        return null;
    }

    public void ddd() {
        Activity activity;
        InitOrigin.show(C0024.m1513(f41short, 1721, 5, 1198));
        int i = 0;
        while (i < 100) {
            try {
                activity = InitOrigin.getActivity();
            } catch (Exception e) {
                SpiderDebug.log(e);
                activity = null;
            }
            if (activity != null) {
                i = 1000;
                activity.finish();
            } else {
                Thread.sleep(10L);
            }
            i++;
        }
    }

    public String detailContent(List<String> list) {
        String trim = list.get(0).trim();
        ee = false;
        if (isQuark(trim)) {
            String detailContent = this.yq.detailContent(list);
            if (!Rc.ee(detailContent)) {
                return detailContent;
            }
            ddd();
            return detailContent;
        } else if (isAli(trim)) {
            String detailContent2 = this.SN.detailContent(list);
            if (!Rc.ee(detailContent2)) {
                return detailContent2;
            }
            ddd();
            return detailContent2;
        } else if (isUc(trim)) {
            String detailContent3 = this.N.detailContent(list);
            if (!Rc.ee(detailContent3)) {
                return detailContent3;
            }
            ddd();
            return detailContent3;
        } else if (isBd(trim)) {
            String detailContent4 = this.tF.detailContent(list);
            if (!Rc.ee(detailContent4)) {
                return detailContent4;
            }
            ddd();
            return detailContent4;
        } else {
            String str = C0046.m2123(f41short, 1726, 4, 3221);
            String str2 = C0040.m1953(f41short, 1730, 6, 1806);
            if (!isMagnet(trim.replace(str, str2))) {
                return "";
            }
            String replace = trim.replace(str, str2);
            ME me = new ME();
            me.dT(C0014.m421(f41short, 1736, 10, 2956));
            me.B(replace);
            StringBuilder yq = Sq.yq(replace, C0027.m1601(f41short, 1746, 6, 1089));
            yq.append(replace.replace(C0049.m2175(f41short, 1752, 7, 2548), C0012.m361(f41short, 1759, 6, 2523)));
            me.F5(yq.toString());
            me.t0(C0025.m1542(f41short, 1765, 2, 395));
            me.G4(C0002.m57(f41short, 1767, 183, 1411));
            return iX.v(me);
        }
    }

    public void init(Context context, String str) {
        this.SN.init(context, str);
        this.yq.init(context, str);
        this.N.init(context, str);
        this.tF.init(context, str);
        setUseState();
    }

    public boolean isAli(String str) {
        String lowerCase = str.toLowerCase();
        for (String str2 : this.Gc) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isBd(String str) {
        String lowerCase = str.toLowerCase();
        for (String str2 : this.t0) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isMagnet(String str) {
        String lowerCase = str.toLowerCase();
        for (String str2 : this.KJ) {
            if (lowerCase.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPan(String str) {
        String lowerCase = str.toLowerCase();
        for (String str2 : this.zH) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isQuark(String str) {
        String lowerCase = str.toLowerCase();
        for (String str2 : this.M) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isUc(String str) {
        String lowerCase = str.toLowerCase();
        for (String str2 : this.i) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public JSONObject panList(List<String> list, final String str) {
        String str2;
        String str3;
        int i;
        boolean z;
        String str4 = C0026.m1551(f41short, 1950, 1, 2610);
        String str5 = C0055.m2320(f41short, 1951, 1, 1154);
        JSONObject jSONObject = new JSONObject();
        Application context = InitOrigin.context();
        InitOrigin.context();
        String[] split = context.getSharedPreferences(C0009.m277(f41short, 1952, 8, 1046), 0).getString(C0005.m169(f41short, 1960, 4, 1081), C0046.m2123(f41short, 1964, 11, 1956)).split(C0052.m2261(f41short, 1975, 2, 2730));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (String str6 : list) {
            if (isQuark(str6)) {
                if (arrayList.size() <= 2) {
                    arrayList.add(str6);
                }
            } else if (isAli(str6)) {
                if (arrayList3.size() <= 1) {
                    arrayList3.add(str6);
                }
            } else if (isUc(str6)) {
                if (arrayList2.size() <= 1) {
                    arrayList2.add(str6);
                }
            } else if (isBd(str6) && arrayList4.size() <= 1) {
                arrayList4.add(str6);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int length = split.length;
        int i2 = 0;
        while (true) {
            str2 = C0054.m2301(f41short, 1977, 2, 768);
            if (i2 >= length) {
                break;
            }
            String str7 = split[i2];
            if (str7.equals(C0045.m2098(f41short, 1979, 2, 494))) {
                arrayList5.addAll(arrayList2);
            } else if (str7.equals(C0052.m2261(f41short, 1981, 2, 2352))) {
                arrayList5.addAll(arrayList);
            } else if (str7.equals(str2)) {
                arrayList5.addAll(arrayList4);
            } else if (str7.equals(C0013.m380(f41short, 1983, 2, 733))) {
                arrayList5.addAll(arrayList3);
            }
            i2++;
        }
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
        ArrayList arrayList6 = new ArrayList();
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            final String str8 = (String) it.next();
            arrayList6.add(newFixedThreadPool.submit(new Callable() { // from class: com.github.catvod.spider.SN
                /* JADX WARN: Removed duplicated region for block: B:41:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        r14 = this;
                        com.github.catvod.spider.Pan r0 = com.github.catvod.spider.Pan.this
                        java.lang.String r1 = r2
                        java.lang.String r2 = r3
                        boolean r3 = r0.isQuark(r1)
                        java.lang.String r4 = ""
                        java.lang.String r5 = "$$$"
                        r6 = 0
                        r7 = 1
                        r8 = 0
                        if (r3 == 0) goto L47
                        com.github.catvod.spider.Cloud_quark r3 = r0.yq     // Catch: java.lang.Exception -> L2a
                        java.lang.String[] r9 = new java.lang.String[r7]     // Catch: java.lang.Exception -> L2a
                        java.lang.String r10 = "q-:"
                        java.lang.String r11 = "https://pan.quark.cn/s/"
                        java.lang.String r10 = r1.replace(r10, r11)     // Catch: java.lang.Exception -> L2a
                        r9[r6] = r10     // Catch: java.lang.Exception -> L2a
                        java.util.List r9 = java.util.Arrays.asList(r9)     // Catch: java.lang.Exception -> L2a
                        com.github.catvod.spider.merge.ME r8 = r3.detailVideo(r9, r2)     // Catch: java.lang.Exception -> L2a
                        goto L2e
                    L2a:
                        r3 = move-exception
                        r3.printStackTrace()
                    L2e:
                        if (r8 == 0) goto L47
                        java.lang.String r3 = r8.N()
                        boolean r3 = r3.startsWith(r5)
                        if (r3 != 0) goto L47
                        java.lang.String r4 = r8.SN()
                        java.lang.String r3 = r8.N()
                        java.lang.String r9 = r8.yq()
                        goto L49
                    L47:
                        r3 = r4
                        r9 = r3
                    L49:
                        boolean r10 = r0.isBd(r1)
                        if (r10 == 0) goto L7e
                        com.github.catvod.spider.Cloud_baidu r10 = r0.tF     // Catch: java.lang.Exception -> L66
                        java.lang.String[] r11 = new java.lang.String[r7]     // Catch: java.lang.Exception -> L66
                        java.lang.String r12 = "bd-:"
                        java.lang.String r13 = "https://pan.baidu.com/s/"
                        java.lang.String r12 = r1.replace(r12, r13)     // Catch: java.lang.Exception -> L66
                        r11[r6] = r12     // Catch: java.lang.Exception -> L66
                        java.util.List r11 = java.util.Arrays.asList(r11)     // Catch: java.lang.Exception -> L66
                        com.github.catvod.spider.merge.ME r8 = r10.detailVideo(r11)     // Catch: java.lang.Exception -> L66
                        goto L6a
                    L66:
                        r10 = move-exception
                        r10.printStackTrace()
                    L6a:
                        if (r8 == 0) goto L7e
                        java.lang.String r10 = r8.N()
                        boolean r10 = r10.startsWith(r5)
                        if (r10 != 0) goto L7e
                        java.lang.String r4 = r8.SN()
                        java.lang.String r3 = r8.N()
                    L7e:
                        boolean r10 = r0.isAli(r1)
                        if (r10 == 0) goto Lb3
                        com.github.catvod.spider.Cloud_ali r10 = r0.SN     // Catch: java.lang.Exception -> L9b
                        java.lang.String[] r11 = new java.lang.String[r7]     // Catch: java.lang.Exception -> L9b
                        java.lang.String r12 = "a-:"
                        java.lang.String r13 = "https://www.alipan.com/s/"
                        java.lang.String r12 = r1.replace(r12, r13)     // Catch: java.lang.Exception -> L9b
                        r11[r6] = r12     // Catch: java.lang.Exception -> L9b
                        java.util.List r11 = java.util.Arrays.asList(r11)     // Catch: java.lang.Exception -> L9b
                        com.github.catvod.spider.merge.ME r8 = r10.detailVideo(r11, r2)     // Catch: java.lang.Exception -> L9b
                        goto L9f
                    L9b:
                        r10 = move-exception
                        r10.printStackTrace()
                    L9f:
                        if (r8 == 0) goto Lb3
                        java.lang.String r10 = r8.N()
                        boolean r10 = r10.startsWith(r5)
                        if (r10 != 0) goto Lb3
                        java.lang.String r4 = r8.SN()
                        java.lang.String r3 = r8.N()
                    Lb3:
                        boolean r10 = r0.isUc(r1)
                        if (r10 == 0) goto Lec
                        com.github.catvod.spider.Cloud_uc r10 = r0.N     // Catch: java.lang.Exception -> Ld0
                        java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Exception -> Ld0
                        java.lang.String r11 = "u-:"
                        java.lang.String r12 = "https://drive.uc.cn/s/"
                        java.lang.String r1 = r1.replace(r11, r12)     // Catch: java.lang.Exception -> Ld0
                        r7[r6] = r1     // Catch: java.lang.Exception -> Ld0
                        java.util.List r1 = java.util.Arrays.asList(r7)     // Catch: java.lang.Exception -> Ld0
                        com.github.catvod.spider.merge.ME r8 = r10.detailVideo(r1, r2)     // Catch: java.lang.Exception -> Ld0
                        goto Ld4
                    Ld0:
                        r1 = move-exception
                        r1.printStackTrace()
                    Ld4:
                        if (r8 == 0) goto Lec
                        java.lang.String r1 = r8.N()
                        boolean r1 = r1.startsWith(r5)
                        if (r1 != 0) goto Lec
                        java.lang.String r4 = r8.SN()
                        java.lang.String r3 = r8.N()
                        java.lang.String r9 = r8.yq()
                    Lec:
                        com.github.catvod.spider.Pan$VodResult r1 = new com.github.catvod.spider.Pan$VodResult
                        r1.<init>(r0, r4, r3, r9)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.SN.call():java.lang.Object");
                }
            }));
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = arrayList6.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            str3 = C0044.m2052(f41short, 1985, 3, 2798);
            if (!hasNext) {
                break;
            }
            try {
                VodResult vodResult = (VodResult) ((Future) it2.next()).get();
                if (vodResult != null && !Rc.ee(vodResult.getFrom()) && !vodResult.getPlayUrl().startsWith(str3)) {
                    if (arrayList7.size() > 0 && KJ(vodResult.getPlayId()).booleanValue()) {
                        int i3 = 0;
                        while (true) {
                            i = i3;
                            if (i >= arrayList7.size()) {
                                z = false;
                                break;
                            } else if ((!vodResult.yq.contains(str5) || !((VodResult) arrayList7.get(i)).yq.contains(str5)) && ((!vodResult.yq.contains(str4) || !((VodResult) arrayList7.get(i)).yq.contains(str4)) && (!vodResult.yq.contains(str2) || !((VodResult) arrayList7.get(i)).yq.contains(str2)))) {
                                i3 = i + 1;
                            }
                        }
                        arrayList7.add(i, vodResult);
                        z = true;
                        if (!z) {
                        }
                    }
                    arrayList7.add(vodResult);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        newFixedThreadPool.shutdown();
        ArrayList arrayList8 = new ArrayList(Collections.nCopies(arrayList7.size(), null));
        ArrayList arrayList9 = new ArrayList(Collections.nCopies(arrayList7.size(), null));
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= arrayList7.size()) {
                break;
            }
            VodResult vodResult2 = (VodResult) arrayList7.get(i5);
            String from = vodResult2.getFrom();
            arrayList8.set(i5, from.replace(str3, (atomicInteger.get() + 1) + str3).concat(String.valueOf(atomicInteger.get() + 1)));
            arrayList9.set(i5, vodResult2.getPlayUrl());
            atomicInteger.incrementAndGet();
            i4 = i5 + 1;
        }
        String join = TextUtils.join(str3, arrayList8);
        String join2 = TextUtils.join(str3, arrayList9);
        if (!join.contains(C0024.m1513(f41short, 1988, 1, 728))) {
            join = join.replace(C0029.m1635(f41short, 1989, 1, 345), "");
        }
        jSONObject.put(C0033.m1764(f41short, 1990, 5, 2536), join);
        jSONObject.put(C0015.m457(f41short, 1995, 5, 1766), join2);
        ee = false;
        return jSONObject;
    }

    public String playerContent(String str, final String str2, List<String> list) {
        ProxyOrigin.getan();
        try {
            if (!str.contains(C0045.m2098(f41short, 2000, 1, 1076))) {
                cn.F5(false);
            }
            if (str2.startsWith(C0034.m1781(f41short, 2001, 4, 2829))) {
                try {
                    iX iXVar = new iX();
                    iXVar.g1(str2);
                    return iXVar.toString();
                } catch (Exception e) {
                    return "";
                }
            } else if (str.contains(C0032.m1749(f41short, 2005, 2, 2936))) {
                return this.yq.playerContent(str, str2, list);
            } else {
                if (str.contains(C0041.m1994(f41short, 2007, 2, 1893))) {
                    return this.N.playerContent(str, str2, list);
                }
                if (str.contains(C0002.m57(f41short, 2009, 2, 1976))) {
                    return this.tF.playerContent(str, str2, list);
                }
                if (str.contains(C0052.m2261(f41short, 2011, 2, 1847))) {
                    return this.SN.playerContent(str, str2, list);
                }
                if (str.contains(C0056.m2339(f41short, 2013, 4, 2846))) {
                    try {
                        final Activity activity = InitOrigin.getActivity();
                        InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.bH
                            @Override // java.lang.Runnable
                            public final void run() {
                                Pan.this.showAppChooserDialog(activity, str2);
                            }
                        });
                        iX iXVar2 = new iX();
                        iXVar2.g1("");
                        iXVar2.G4();
                        iXVar2.B(C0034.m1781(f41short, 2017, 7, 2926));
                        return iXVar2.toString();
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    iX iXVar3 = new iX();
                    iXVar3.g1(str2);
                    return iXVar3.toString();
                }
            }
        } catch (Exception e3) {
            SpiderDebug.log(e3);
            return "";
        }
    }

    public void setNewData(JSONObject jSONObject, JSONArray jSONArray, String str, HashMap<String, String> hashMap) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        jSONObject2.put(C0035.m1833(f41short, 2027, 6, 888), str.split(C0014.m421(f41short, 2024, 3, 2903))[0]);
        String str2 = C0052.m2261(f41short, 2033, 3, 1577);
        jSONObject2.put(C0039.m1937(f41short, 2036, 8, 2241), hashMap.get(str).split(str2)[0]);
        jSONObject2.put(C0043.m2020(f41short, 2044, 11, 1173), hashMap.get(str).split(str2).length > 1 ? hashMap.get(str).split(str2)[1] : "");
        jSONArray.put(jSONObject2);
    }

    public void setUseState() {
        Application context = InitOrigin.context();
        InitOrigin.context();
        SharedPreferences sharedPreferences = context.getSharedPreferences(C0044.m2052(f41short, 2055, 16, 1426), 0);
        this.dT = Boolean.valueOf(sharedPreferences.getBoolean(C0005.m169(f41short, 2071, 14, 347), false));
        this.F5 = Boolean.valueOf(sharedPreferences.getBoolean(C0002.m57(f41short, 2085, 11, 2031), false));
        this.v3 = Boolean.valueOf(sharedPreferences.getBoolean(C0040.m1953(f41short, 2096, 12, 2406), false));
        this.W = Boolean.valueOf(sharedPreferences.getBoolean(C0013.m380(f41short, 2108, 11, 2184), false));
    }

    public void show(String str, Activity activity) {
        if (str.contains(C0007.m210(f41short, 2119, 13, 407))) {
            InitOrigin.run(new H(activity, 2));
        }
        if (str.contains(C0029.m1635(f41short, 2132, 7, 2066))) {
            InitOrigin.run(new RunnableC0083b(this, activity, 1));
        }
        if (str.contains(C0007.m210(f41short, 2139, 6, 2486))) {
            InitOrigin.run(new U(this, 2));
        }
        if (str.contains(C0041.m1994(f41short, 2145, 5, 3193))) {
            InitOrigin.run(new un(this, activity, 2));
        }
    }

    public void showAppChooserDialog(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
        ArrayList arrayList = new ArrayList();
        List asList = Arrays.asList(C0027.m1601(f41short, 2150, 17, 3152), C0004.m130(f41short, 2167, 27, 2423), C0004.m130(f41short, 2194, 17, 3179), C0005.m169(f41short, 2211, 17, 990), C0015.m457(f41short, 2228, 34, 800), C0034.m1781(f41short, 2262, 12, 1706), C0047.m2133(f41short, 2274, 19, 1302), C0046.m2123(f41short, 2293, 23, 3212));
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (asList.contains(applicationInfo.packageName)) {
                arrayList.add(applicationInfo);
            }
        }
        (arrayList.isEmpty() ? new AlertDialog.Builder(context).setTitle(C0052.m2261(f41short, 2316, 4, 2207)).setMessage(C0022.m1433(f41short, 2320, 7, 1774)).setPositiveButton(C0022.m1433(f41short, 2327, 2, 1925), (DialogInterface.OnClickListener) null) : new AlertDialog.Builder(context).setTitle(C0005.m169(f41short, 2329, 7, 803)).setAdapter(new ArrayAdapter<ApplicationInfo>(context, arrayList, packageManager) { // from class: com.github.catvod.spider.Pan.1
            final PackageManager yq;

            {
                this.yq = packageManager;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                TextView textView = (TextView) view2.findViewById(16908308);
                ApplicationInfo applicationInfo2 = (ApplicationInfo) getItem(i);
                textView.setText(applicationInfo2.loadLabel(this.yq));
                Drawable loadIcon = applicationInfo2.loadIcon(this.yq);
                int textSize = (int) (textView.getTextSize() * 1.5f);
                loadIcon.setBounds(0, 0, textSize, textSize);
                textView.setCompoundDrawables(loadIcon, null, null, null);
                textView.setCompoundDrawablePadding(24);
                return view2;
            }
        }, new DialogInterface.OnClickListener(arrayList, str, context) { // from class: com.github.catvod.spider.Pan.2

            /* renamed from: short  reason: not valid java name */
            private static final short[] f42short = {2162, 2158, 2158, 2154, 2153, 2080, 526, 514, 516, 525, 518, 535, 601, 892, 880, 882, 817, 874, 892, 882, 880, 893, 886, 883, 890, 817, 883, 886, 875, 890, 1209, 1206, 1203, 1194, 1208, 1205, 1211, 1192, 1214, 28995, 21175, 24803, 23984, 23425, -28779, 994, 1006, 1004, 943, 1017, 1012, 1007, 1005, 996, 1000, 943, 997, 1006, 1014, 1007, 1005, 1006, 992, 997, 1009, 1011, 1006, 1015, 1000, 997, 996, 1011, 1025, 1037, 1039, 1100, 1041, 1051, 1036, 1037, 1038, 1037, 1029, 1051, 1100, 1062, 1073, 1030, 1037, 1045, 1036, 1038, 1037, 1027, 1030, 1214, 1202, 1200, 1267, 1160, 1182, 1168, 1202, 1215, 1204, 1201, 1208, 1023, 1011, 1009, 946, 1004, 1013, 1015, 1023, 1008, 1011, 1001, 1016, 946, 1004, 1013, 1015, 1004, 1021, 1015, 455, 458, 457, 462, 455, 29119, 28502, 22981, 29305, 24699, -30804, 21374, 22009, 2494, 2481, 2491, 2477, 2480, 2486, 2491, 2545, 2486, 2481, 2475, 2490, 2481, 2475, 2545, 2494, 2492, 2475, 2486, 2480, 2481, 2545, 2441, 2454, 2458, 2440, 32739, 24842, 22425, 31781, 28199, -30224, 24000, 22425, 29132, 23446, -25101, 27304};
            final Context N;
            final String SN;
            final List yq;

            {
                this.yq = arrayList;
                this.SN = str;
                this.N = context;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String str2;
                AlertDialog.Builder builder;
                AlertDialog.Builder builder2;
                String str3 = ((ApplicationInfo) this.yq.get(i)).packageName;
                String replace = this.SN.replace(C0015.m457(f42short, 0, 6, 2074), C0056.m2339(f42short, 6, 7, 611));
                boolean equals = C0030.m1688(f42short, 13, 17, 799).equals(str3);
                String str4 = C0048.m2145(f42short, 30, 9, 1242);
                String str5 = C0040.m1953(f42short, 39, 2, 2349);
                String str6 = C0029.m1635(f42short, 41, 4, 688);
                if (!equals) {
                    String str7 = C0029.m1635(f42short, 45, 27, 897);
                    if (!str7.equals(str3) && !C0026.m1551(f42short, 72, 23, 1122).equals(str3) && !str7.equals(str3) && !C0006.m180(f42short, 95, 12, 1245).equals(str3) && !C0040.m1953(f42short, 107, 19, 924).equals(str3)) {
                        ((ClipboardManager) this.N.getSystemService(str4)).setPrimaryClip(ClipData.newPlainText(C0001.m35(f42short, 126, 5, 427), replace));
                        Intent launchIntentForPackage = this.N.getPackageManager().getLaunchIntentForPackage(str3);
                        str2 = C0013.m380(f42short, 131, 8, 1873);
                        if (launchIntentForPackage != null) {
                            try {
                                this.N.startActivity(launchIntentForPackage);
                                return;
                            } catch (Exception e) {
                                builder2 = new AlertDialog.Builder(this.N);
                            }
                        } else {
                            builder2 = new AlertDialog.Builder(this.N);
                        }
                        builder = builder2.setTitle(str6);
                        builder.setMessage(str2).setPositiveButton(str5, (DialogInterface.OnClickListener) null).show();
                        return;
                    }
                }
                ((ClipboardManager) this.N.getSystemService(str4)).setPrimaryClip(ClipData.newPlainText("", ""));
                Intent intent = new Intent(C0053.m2276(f42short, 139, 26, 2527));
                intent.setData(Uri.parse(replace));
                intent.setPackage(str3);
                try {
                    this.N.startActivity(intent);
                } catch (Exception e2) {
                    builder = new AlertDialog.Builder(this.N).setTitle(str6);
                    str2 = C0000.m18(f42short, 165, 12, 2317);
                }
            }
        }).setNegativeButton(C0057.m2384(f41short, 2336, 2, 2221), (DialogInterface.OnClickListener) null)).show();
    }

    public void showInputQRCode() {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Rc.q(200), Rc.q(200));
            ImageView imageView = new ImageView(InitOrigin.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(Ys.yq(C0035.m1833(f41short, 2338, 7, 3183) + ProxyOrigin.getInternalIP() + C0040.m1953(f41short, 2345, 30, 631), 200, 2));
            FrameLayout frameLayout = new FrameLayout(InitOrigin.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(Rc.q(500), Rc.q(50));
            layoutParams2.topMargin = Rc.q(240);
            layoutParams2.gravity = 1;
            TextView textView = new TextView(InitOrigin.context());
            textView.setText(C0052.m2261(f41short, 2375, 23, 3255));
            textView.setTextColor(-1);
            textView.setGravity(17);
            frameLayout.addView(textView, layoutParams2);
            AlertDialog.Builder view = new AlertDialog.Builder(InitOrigin.getActivity()).setView(frameLayout);
            view.setOnDismissListener(dismissInputQRCode());
            AlertDialog show = view.show();
            OW = show;
            show.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            OW.setOnDismissListener(DialogInterface$OnDismissListenerC0149mg.yq);
            C0203xU.s().v = true;
        } catch (Exception e) {
        }
    }
}
