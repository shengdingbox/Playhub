package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
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
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Oh;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Sq;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.WN;
import com.github.catvod.spider.merge.aq;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.p9;
import com.github.catvod.spider.merge.rP;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class WebDAV extends Spider {
    private static String N;
    private static List<String> SN;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f53short = {2811, 2811, 2811, 2733, 2733, 2733, 1269, 1269, 1269, 1271, 835, 1956, 1971, 1968, 1971, 1956, 1971, 1956, 1336, 1330, 1320, 1404, 1340, 1332, 1317, 1328, 1333, 1328, 1317, 1328, 2631, 2644, 2651, 2642, 2640, 1857, 1859, 1859, 1861, 1872, 1876, 1805, 1861, 1870, 1859, 1871, 1860, 1865, 1870, 1863, 2776, 2782, 2760, 2783, 2688, 2764, 2762, 2760, 2755, 2777, 1544, 1540, 1541, 1541, 1550, 1544, 1567, 1538, 1540, 1541, 2551, 2552, 2555, 2535, 2545, 2008, 2043, 2025, 2035, 2041, 1978, 715, 803, 791, 790, 778, 781, 784, 779, 792, 771, 790, 779, 781, 780, 2785, 2810, 2807, 2790, 2800, 2750, 2731, 2783, 2791, 2728, 2730, 1489, 1309, 1286, 1291, 1306, 1292, 1375, 3327, 3283, 3282, 3272, 3289, 3282, 3272, 3217, 3310, 3293, 3282, 3291, 3289, 1813, 1849, 1848, 1826, 1843, 1848, 1826, 1915, 1818, 1843, 1848, 1841, 1826, 1854, 3005, 2988, 2988, 2992, 2997, 3007, 3005, 2984, 2997, 2995, 2994, 3059, 2995, 3007, 2984, 3057, 2991, 2984, 2990, 3001, 3005, 2993, 1308, 1293, 1310, 1289, 1282, 1304, 910, 589, 579, 607, 593, 585, 596, 578, 597, 1996, 2012, 2000, 1999, 2010, 2756, 2773, 2771, 2769, 3004, 2985, 3006, 2963, 3004, 2989, 2987, 2985, 1214, 1199, 1213, 1213, 1209, 1185, 1212, 1194, 2683, 2639, 2638, 2642, 2645, 2632, 2643, 2624, 2651, 2638, 2643, 2645, 2644, 553, 615, 630, 623, 553, 608, 629, 553, 629, 611, 615, 628, 613, 622, 594, 576, 583, 577, 580, 595, 3223, 3268, 3289, 3279, 3278, 3289, 2686, 2675, 2682, 2671, 2367, 2339, 2339, 2343, 2340, 2413, 2424, 2424, 2366, 2362, 2352, 2407, 2400, 2425, 2340, 2360, 2352, 2360, 2338, 2356, 2355, 2361, 2425, 2356, 2360, 2362, 2424, 2337, 2405, 2424, 2339, 2367, 2338, 2362, 2357, 2424, 2341, 2354, 2339, 2350, 2343, 2354, 2312, 2354, 2351, 2356, 2363, 2338, 2355, 2354, 2312, 2352, 2366, 2353, 2424, 2354, 2351, 2339, 2424, 2358, 2338, 2339, 2360, 2424, 2342, 2424, 2414, 2402, 2424, 2356, 2341, 2360, 2343, 2424, 2351, 2350, 2424, 2358, 2366, 2424, 2339, 2424, 2407, 2424, 2408, 2358, 2343, 2343, 2366, 2355, 2410, 2406, 2405, 2405, 2417, 2338, 2341, 2363, 2410, 2367, 2339, 2339, 2343, 2340, 2413, 2424, 2424, 2360, 2340, 2340, 2403, 2363, 2366, 2337, 2366, 2354, 2336, 2425, 2362, 2360, 2365, 2366, 2425, 2356, 2360, 2362, 2424, 2339, 2367, 2355, 2312, 2353, 2366, 2363, 2354, 2424, 2405, 2407, 2405, 2402, 2424, 2407, 2400, 2424, 2405, 2415, 2424, 2354, 2355, 2355, 2406, 2355, 2353, 2357, 2406, 2406, 2358, 2353, 2355, 2400, 2400, 2357, 2407, 2407, 2404, 2406, 2407, 2402, 2400, 2403, 2406, 2407, 2414, 2353, 2406, 2355, 2404, 2402, 2357, 2425, 2365, 2343, 2352, 792, 863, 837, 857, 2672, 2668, 2668, 2664, 2667, 2594, 2615, 2615, 2673, 2677, 2687, 2600, 2607, 2614, 2667, 2679, 2687, 2679, 2669, 2683, 2684, 2678, 2614, 2683, 2679, 2677, 2615, 2670, 2602, 2615, 2668, 2672, 2669, 2677, 2682, 2615, 2666, 2685, 2668, 2657, 2664, 2685, 2631, 2685, 2656, 2683, 2676, 2669, 2684, 2685, 2631, 2687, 2673, 2686, 2615, 2685, 2656, 2668, 2615, 2681, 2669, 2668, 2679, 2615, 2665, 2615, 2593, 2605, 2615, 2683, 2666, 2679, 2664, 2615, 2656, 2657, 2615, 2681, 2673, 2615, 2668, 2615, 2600, 2615, 2599, 2681, 2664, 2664, 2673, 2684, 2597, 2601, 2602, 2602, 2622, 2669, 2666, 2676, 2597, 2672, 2668, 2668, 2664, 2667, 2594, 2615, 2615, 2667, 2601, 2614, 2673, 2677, 2681, 2687, 2685, 2672, 2669, 2682, 2614, 2683, 2683, 2615, 2673, 2677, 2681, 2687, 2685, 2667, 2615, 2602, 2600, 2602, 2606, 2615, 2600, 2603, 2615, 2600, 2601, 2615, 2685, 2603, 2683, 2601, 2601, 2685, 2683, 2593, 2605, 2593, 2685, 2604, 2681, 2593, 2601, 2681, 2684, 2593, 2683, 2607, 2593, 2681, 2601, 2601, 2607, 2602, 2682, 2604, 2684, 2603, 2602, 2607, 1770, 1782, 1782, 1778, 1777, 1720, 1709, 1709, 1771, 1775, 1765, 1714, 1717, 1708, 1777, 1773, 1765, 1773, 1783, 1761, 1766, 1772, 1708, 1761, 1773, 1775, 1709, 1780, 1712, 1709, 1782, 1770, 1783, 1775, 1760, 1709, 1776, 1767, 1782, 1787, 1778, 1767, 1757, 1767, 1786, 1761, 1774, 1783, 1766, 1767, 1757, 1765, 1771, 1764, 1709, 1767, 1786, 1782, 1709, 1763, 1783, 1782, 1773, 1709, 1779, 1709, 1723, 1719, 1709, 1761, 1776, 1773, 1778, 1709, 1786, 1787, 1709, 1763, 1771, 1709, 1782, 1709, 1714, 1709, 1725, 1763, 1778, 1778, 1771, 1766, 1727, 1715, 1712, 1712, 1700, 1783, 1776, 1774, 1727, 1770, 1782, 1782, 1778, 1777, 1720, 1709, 1709, 1773, 1777, 1777, 1718, 1774, 1771, 1780, 1771, 1767, 1781, 1708, 1775, 1773, 1768, 1771, 1708, 1761, 1773, 1775, 1709, 1782, 1770, 1766, 1757, 1764, 1771, 1774, 1767, 1709, 1712, 1714, 1712, 1719, 1709, 1714, 1717, 1709, 1712, 1722, 1709, 1763, 1716, 1760, 1766, 1760, 1712, 1712, 1761, 1761, 1718, 1760, 1714, 1760, 1764, 1761, 1717, 1760, 1713, 1713, 1713, 1764, 1767, 1761, 1719, 1766, 1714, 1712, 1717, 1760, 1723, 1719, 1715, 1708, 1768, 1778, 1765, 1589, 2531, 2540, 2528, 2536, 2276, 2294, 2278, 3008, 903, 1440, 1025, 911, 978, 981, 979, 972, 1507, 1484, 1520, 1484, 728, -28494, -32113, 22064, 30732, 2338, 2349, 2337, 2345, 23271, 24527, 3012, 3038, 3021, 3026, 18557, 25258, 25041, -28160, 2889, 2892, 2905, 2888, 868, 873, 864, 885, 25118, 24323, -26158, 22023, 10512, 966, 980, 964, 11978, 2342, 2343, 2353, 2337, 1923, 1950, 1928, 1929, 1950, 25627, 22790, 25136, 22662, 2775, 2757, 2757, 1208, 1208, 1194, 3112, 3113, 3119, 1019, 999, 999, 995, 1215, 1214, 2542, 504, 504, 504, 1836, 1840, 1808, 1836, 1990, 1947, 1948, 1946, 1925, 909, 355};
    private static long tF;
    private static List<WN> yq;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    class Job implements Callable<List<ME>> {

        /* renamed from: short  reason: not valid java name */
        private static final short[] f54short = {1235, 1238, 1219, 1238, 797, 856, 836, 836, 832, 835, 778, 799, 799, 855, 857, 836, 856, 837, 850, 798, 851, 863, 861, 799, 849, 860, 857, 835, 836, 797, 863, 834, 855, 799, 849, 860, 857, 835, 836, 830, 880, 865, 888, 830, 880, 868, 869, 889, 830, 893, 894, 886, 888, 895, 830, 889, 880, 866, 889, 1752, 1758, 1736, 1759, 1731, 1740, 1728, 1736, 1986, 2003, 1985, 1985, 1989, 2013, 1984, 2006, 2415, 2420, 2416, 2399, 2403, 2415, 2404, 2405, 425, 434, 438, 440, 435, 2955, 3007, 3006, 2978, 2981, 3000, 2979, 2992, 2987, 3006, 2979, 2981, 2980, 2758, 2696, 2713, 2688, 2758, 2692, 2700, 3095, 3092, 3078, 3088, 3114, 3077, 3092, 3073, 3101, 1873, 1876, 1857, 1876, 3152, 3164, 3165, 3143, 3158, 3165, 3143, 1735, 1757, 1777, 1738, 1735, 1756, 2229, 2234, 2230, 2238, 2856, 2873, 2858, 2877, 2870, 2860, 908, 3148, 3152, 3152, 3156, 3159, 3102, 3083, 3083, 3149, 3145, 3139, 3092, 3091, 3082, 3159, 3147, 3139, 3147, 3153, 3143, 3136, 3146, 3082, 3143, 3147, 3145, 3083, 3154, 3094, 3083, 3152, 3148, 3153, 3145, 3142, 3083, 3158, 3137, 3152, 3165, 3156, 3137, 3195, 3137, 3164, 3143, 3144, 3153, 3136, 3137, 3195, 3139, 3149, 3138, 3083, 3137, 3164, 3152, 3083, 3141, 3153, 3152, 3147, 3083, 3157, 3083, 3101, 3089, 3083, 3143, 3158, 3147, 3156, 3083, 3164, 3165, 3083, 3141, 3149, 3083, 3152, 3083, 3092, 3083, 3099, 3141, 3156, 3156, 3149, 3136, 3097, 3093, 3094, 3094, 3074, 3153, 3158, 3144, 3097, 3148, 3152, 3152, 3156, 3159, 3102, 3083, 3083, 3147, 3159, 3159, 3088, 3144, 3149, 3154, 3149, 3137, 3155, 3082, 3145, 3147, 3150, 3149, 3082, 3143, 3147, 3145, 3083, 3152, 3148, 3136, 3195, 3138, 3149, 3144, 3137, 3083, 3094, 3092, 3094, 3089, 3083, 3092, 3091, 3083, 3094, 3100, 3083, 3137, 3136, 3136, 3093, 3136, 3138, 3142, 3093, 3093, 3141, 3138, 3136, 3091, 3091, 3142, 3092, 3092, 3095, 3093, 3092, 3089, 3091, 3088, 3093, 3092, 3101, 3138, 3093, 3136, 3095, 3089, 3142, 3082, 3150, 3156, 3139, 637, 609, 609, 613, 614, 559, 570, 570, 636, 632, 626, 549, 546, 571, 614, 634, 626, 634, 608, 630, 625, 635, 571, 630, 634, 632, 570, 611, 551, 570, 609, 637, 608, 632, 631, 570, 615, 624, 609, 620, 613, 624, 586, 624, 621, 630, 633, 608, 625, 624, 586, 626, 636, 627, 570, 624, 621, 609, 570, 628, 608, 609, 634, 570, 612, 570, 556, 544, 570, 630, 615, 634, 613, 570, 621, 620, 570, 628, 636, 570, 609, 570, 549, 570, 554, 628, 613, 613, 636, 625, 552, 548, 551, 551, 563, 608, 615, 633, 552, 637, 609, 609, 613, 614, 559, 570, 570, 634, 614, 614, 545, 633, 636, 611, 636, 624, 610, 571, 632, 634, 639, 636, 571, 630, 634, 632, 570, 609, 637, 625, 586, 627, 636, 633, 624, 570, 551, 549, 551, 544, 570, 549, 546, 570, 551, 557, 570, 628, 547, 631, 625, 631, 551, 551, 630, 630, 545, 631, 549, 631, 627, 630, 546, 631, 550, 550, 550, 627, 624, 630, 544, 625, 549, 551, 546, 631, 556, 544, 548, 571, 639, 613, 626};
        final WebDAV N;
        private final String SN;
        private final WN yq;

        public Job(WebDAV webDAV, WN wn, String str) {
            this.N = webDAV;
            this.yq = wn;
            this.SN = str;
        }

        private boolean yq() {
            String str = C0020.m1390(f54short, 0, 4, 1207);
            try {
                String q = aq.q(this.yq.i() + C0005.m169(f54short, 4, 35, 816));
                String M = this.yq.M();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0042.m2010(f54short, 59, 8, 1709), M);
                jSONObject.put(C0006.m180(f54short, 67, 8, 1970), q);
                jSONObject.put(C0043.m2020(f54short, 75, 8, 2304), "");
                this.yq.G4(new JSONObject(C0068Pe.dT(this.yq.tF() + C0007.m210(f54short, 39, 20, 785), jSONObject.toString(), Rc.yq()).body().string()).getJSONObject(str).getString(C0031.m1713(f54short, 83, 5, 477)));
                HashMap<String, String> yq = Rc.yq();
                yq.put(C0000.m18(f54short, 88, 13, 3018), this.yq.KJ());
                this.yq.G(new JSONObject(C0068Pe.W(this.yq.tF() + C0000.m18(f54short, 101, 7, 2793), yq)).getJSONObject(str).getString(C0003.m86(f54short, 108, 9, 3189)));
                return true;
            } catch (Exception e) {
                SpiderDebug.log(e);
                return false;
            }
        }

        @Override // java.util.concurrent.Callable
        public List<ME> call() {
            ArrayList arrayList = new ArrayList();
            try {
                if (!Rc.ee(this.yq.KJ()) || yq()) {
                    JSONArray jSONArray = new JSONObject(WebDAV.yq(this.N, this.yq, this.SN)).getJSONObject(C0045.m2098(f54short, 117, 4, 1845)).getJSONArray(C0009.m277(f54short, 121, 7, 3123));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        boolean z = jSONObject.getBoolean(C0020.m1390(f54short, 128, 6, 1710));
                        String string = jSONObject.getString(C0043.m2020(f54short, 134, 4, 2267));
                        String string2 = jSONObject.getString(C0042.m2010(f54short, 138, 6, 2904));
                        String str = C0038.m1903(f54short, 144, 1, 931);
                        if (z) {
                            arrayList.add(new ME(URLEncoder.encode(this.yq.zH() + string2.replaceFirst(this.yq.N(), "") + str + string), string, C0041.m1994(f54short, 145, 183, 3108), this.yq.zH(), z));
                        } else if (Rc.g9(string)) {
                            arrayList2.add(new ME(URLEncoder.encode(this.yq.zH() + string2.replaceFirst(this.yq.N(), "") + str), string, C0037.m1882(f54short, 328, 183, 533), this.yq.zH(), z));
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            return arrayList;
        }
    }

    private static WN N(String str) {
        List<WN> list = yq;
        return list.get(list.indexOf(new WN(str)));
    }

    private String SN(WN wn, DavResource davResource, List<DavResource> list) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator<DavResource> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = C0051.m2237(f53short, 0, 3, 2693);
            str2 = C0039.m1937(f53short, 3, 3, 2797);
            if (!hasNext) {
                break;
            }
            DavResource next = it.next();
            if (Rc.g1(next.getName()).equals(Rc.g1(davResource.getName()))) {
                sb.append(str);
                sb.append(next.getName());
                sb.append(str2);
                sb.append(Rc.dT(next.getName()));
                sb.append(str2);
                sb.append(wn.zH() + next.getPath());
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        for (DavResource davResource2 : list) {
            sb2.append(str);
            sb2.append(davResource2.getName());
            sb2.append(str2);
            sb2.append(Rc.dT(davResource2.getName()));
            sb2.append(str2);
            sb2.append(wn.zH() + davResource2.getPath());
        }
        return sb2.toString();
    }

    private List<gU> i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String str2 = C0037.m1882(f53short, 6, 3, 1205);
            if (str.contains(str2)) {
                String[] split = str.split(str2);
                String str3 = split[0];
                String str4 = split[1];
                String zH = zH(split[2]);
                gU gUVar = new gU();
                gUVar.N(str3);
                gU SN2 = gUVar.SN(str4);
                SN2.zH(zH);
                arrayList.add(SN2);
            }
        }
        return arrayList;
    }

    private List<DavResource> tF(WN wn, String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(wn.tF());
        if (!str.startsWith(wn.t0())) {
            str = wn.t0() + str;
        }
        sb.append(str);
        List<DavResource> list2 = wn.q().list(sb.toString());
        list2.remove(0);
        Iterator<DavResource> it = list2.iterator();
        while (it.hasNext()) {
            DavResource next = it.next();
            if ((!next.isDirectory() && !next.getName().contains(C0003.m86(f53short, 9, 1, 1241))) || (!next.isDirectory() && !list.contains(Rc.dT(next.getName())))) {
                it.remove();
            }
        }
        return list2;
    }

    public static Object[] vod(Map<String, String> map, String str, Map<String, String> map2) {
        String str2;
        String str3;
        String str4 = C0050.m2224(m991(), 10, 1, 876);
        boolean z = C0037.m1888(str, str4);
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
                    str2 = C0028.m1620(str, 0, C0027.m1592(str, str4));
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
                    str2 = str;
                    break;
            }
            i = 1678;
        }
        WN wn = m995(str2);
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, C0029.m1652(wn));
        C0032.m1746(sb, C0028.m1621(str, C0046.m2105(str2)));
        String str5 = C0043.m2039(sb);
        TreeMap treeMap = new TreeMap(C0041.m1983());
        List list = C0031.m1721(new String[]{C0011.m328(m991(), 11, 7, 2006), C0043.m2020(m991(), 18, 12, 1361), C0046.m2123(m991(), 30, 5, 2613), C0054.m2301(m991(), 35, 15, 1824), C0035.m1833(m991(), 50, 10, 2733)});
        Iterator it = C0014.m413(C0028.m1614(map2));
        while (true) {
            boolean z2 = C0000.m11(it);
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = z2 ? 48736 : 48705;
                    case 47384:
                        C0004.m125(treeMap, C0045.m2098(m991(), 60, 10, 1643), C0012.m361(m991(), 70, 5, 2452));
                        boolean z3 = C0020.m1370(C0025.m1539(wn));
                        int i4 = 49666;
                        while (true) {
                            i4 ^= 49683;
                            switch (i4) {
                                case 17:
                                    if (z3) {
                                        break;
                                    } else {
                                        i4 = 49759;
                                        continue;
                                    }
                                case 50:
                                    break;
                                case 76:
                                    StringBuilder sb2 = C0052.m2253(C0036.m1850(m991(), 75, 6, 1946));
                                    StringBuilder sb3 = new StringBuilder();
                                    C0032.m1746(sb3, C0025.m1539(wn));
                                    C0032.m1746(sb3, C0013.m380(m991(), 81, 1, 753));
                                    C0032.m1746(sb3, C0022.m1440(wn));
                                    C0032.m1746(sb2, C0029.m1650(C0051.m2233(C0043.m2039(sb3)), 0));
                                    str3 = C0043.m2039(sb2);
                                    int i5 = 49790;
                                    while (true) {
                                        i5 ^= 49807;
                                        switch (i5) {
                                            case 18:
                                                break;
                                            case 241:
                                                i5 = 49821;
                                                break;
                                        }
                                    }
                                    break;
                                case 83:
                                    str3 = C0031.m1705();
                                    break;
                            }
                            i4 = 49728;
                        }
                        C0004.m125(treeMap, C0034.m1781(m991(), 82, 13, 866), str3);
                        long j = 0;
                        Matcher matcher = C0022.m1425(C0005.m166(C0014.m421(m991(), 95, 11, 2691)), C0050.m2227(treeMap));
                        HashMap hashMap = new HashMap();
                        boolean z4 = C0054.m2303(matcher);
                        int i6 = 49914;
                        while (true) {
                            i6 ^= 49931;
                            switch (i6) {
                                case 497:
                                    if (!z4) {
                                        break;
                                    } else {
                                        i6 = 50658;
                                        continue;
                                    }
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    j = C0010.m288(C0030.m1678(matcher, 1));
                                    break;
                            }
                            i6 = 50627;
                        }
                        StringBuilder sb4 = new StringBuilder();
                        C0046.m2118(sb4, j);
                        C0032.m1746(sb4, C0042.m2010(m991(), 106, 1, 1532));
                        C0046.m2118(sb4, m993() - 1);
                        C0032.m1746(sb4, str4);
                        C0046.m2118(sb4, m993());
                        String str6 = C0043.m2039(sb4);
                        StringBuilder sb5 = new StringBuilder();
                        C0032.m1746(sb5, C0053.m2276(m991(), 107, 6, 1407));
                        C0032.m1746(sb5, str6);
                        C0042.m1999(hashMap, C0027.m1601(m991(), 113, 13, 3260), C0043.m2039(sb5));
                        C0042.m1999(hashMap, C0044.m2052(m991(), 126, 14, 1878), C0049.m2192(m993() - j));
                        return new Object[]{C0053.m2274(206), C0024.m1513(m991(), 140, 22, 3036), m994(m992(m996(str5, treeMap))), hashMap};
                    case 47417:
                        String str7 = (String) C0026.m1556(it);
                        boolean z5 = C0040.m1944(list, str7);
                        int i7 = 48767;
                        while (true) {
                            i7 ^= 48784;
                            switch (i7) {
                                case 14:
                                case 45:
                                    break;
                                case 76:
                                    C0004.m125(treeMap, str7, (String) C0000.m15(map2, str7));
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
                                case 239:
                                    i7 = z5 ? 48860 : 48829;
                            }
                        }
                        break;
                    case 47483:
                }
            }
        }
    }

    static String yq(WebDAV webDAV, WN wn, String str) {
        Objects.requireNonNull(webDAV);
        Response response = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0012.m361(f53short, 162, 6, 1388), C0041.m1994(f53short, 168, 1, 929));
            jSONObject.put(C0052.m2261(f53short, 169, 8, 550), str);
            jSONObject.put(C0041.m1994(f53short, 177, 5, 1983), 0);
            jSONObject.put(C0047.m2133(f53short, 182, 4, 2740), 1);
            jSONObject.put(C0025.m1542(f53short, 186, 8, 3020), 100);
            jSONObject.put(C0048.m2145(f53short, 194, 8, 1230), "");
            HashMap<String, String> yq2 = Rc.yq();
            yq2.put(C0056.m2339(f53short, 202, 13, 2618), wn.KJ());
            response = C0068Pe.dT(wn.tF() + C0036.m1850(f53short, 215, 14, 518), jSONObject.toString(), yq2);
            if (response.code() == 200) {
                return response.body().string();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        if (response == null) {
            return "";
        }
        response.close();
        return "";
    }

    private String zH(String str) {
        return ProxyOrigin.getOwnProxyUrl(C0003.m86(f53short, 229, 6, 549)) + str;
    }

    /* renamed from: سفعل  reason: contains not printable characters */
    public static short[] m991() {
        if (C0005.m152() <= 0) {
            return f53short;
        }
        return null;
    }

    /* renamed from: ضﻝﺽﺥ  reason: contains not printable characters */
    public static ResponseBody m992(Object obj) {
        if (C0052.m2256() > 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ﺵﺥﻭك  reason: contains not printable characters */
    public static long m993() {
        if (C0044.m2051() <= 0) {
            return tF;
        }
        return 0L;
    }

    /* renamed from: ﺵﻭيﺩ  reason: contains not printable characters */
    public static InputStream m994(Object obj) {
        if (C0041.m1981() < 0) {
            return ((ResponseBody) obj).byteStream();
        }
        return null;
    }

    /* renamed from: ﺵﻱغﺽ  reason: contains not printable characters */
    public static WN m995(Object obj) {
        if (C0024.m1502() >= 0) {
            return N((String) obj);
        }
        return null;
    }

    /* renamed from: ﻱﻝﻅﺡ  reason: contains not printable characters */
    public static Response m996(Object obj, Object obj2) {
        if (C0005.m152() <= 0) {
            return V3.zH((String) obj, (Map) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String decode = URLDecoder.decode(str);
        String str3 = C0003.m86(f53short, 235, 1, 3256);
        String substring = decode.contains(str3) ? decode.substring(0, decode.indexOf(str3)) : decode;
        String str4 = "";
        String substring2 = decode.contains(str3) ? decode.substring(decode.indexOf(str3)) : "";
        String str5 = C0051.m2237(f53short, 236, 5, 3243);
        String str6 = hashMap.containsKey(str5) ? hashMap.get(str5) : "";
        String str7 = C0031.m1713(f53short, 241, 4, 2570);
        if (hashMap.containsKey(str7)) {
            str4 = hashMap.get(str7);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WN N2 = N(substring);
        for (DavResource davResource : tF(N2, substring2, Rc.N)) {
            if (davResource.isDirectory()) {
                arrayList.add(davResource);
            } else {
                arrayList2.add(davResource);
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str6)) {
            Oh.yq(str4, str6, arrayList);
            Oh.yq(str4, str6, arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(N2.dT((DavResource) it.next(), C0014.m421(f53short, 245, 183, 2391)));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            DavResource davResource2 = (DavResource) it2.next();
            arrayList3.add(N2.dT(davResource2, davResource2.getName().contains(C0004.m130(f53short, 428, 4, 822)) ? C0039.m1937(f53short, 432, 172, 2584) : C0011.m328(f53short, 604, 183, 1666)));
        }
        iX iXVar = new iX();
        iXVar.b(arrayList3);
        iXVar.dT(1, 1, 0, 1);
        return iXVar.toString();
    }

    public String detailContent(List<String> list) {
        StringBuilder yq2;
        StringBuilder sb;
        String decode = URLDecoder.decode(list.get(0));
        String str = C0041.m1994(f53short, 787, 1, 1562);
        String substring = decode.contains(str) ? decode.substring(0, decode.indexOf(str)) : decode;
        String substring2 = decode.substring(0, decode.lastIndexOf(str));
        String str2 = substring2.contains(str) ? substring2.substring(substring2.indexOf(str)) + str : "";
        String substring3 = substring2.substring(substring2.lastIndexOf(str) + 1);
        WN N2 = N(substring);
        List<DavResource> tF2 = tF(N2, str2, SN);
        ArrayList arrayList = new ArrayList();
        for (DavResource davResource : tF2) {
            if (Rc.xa(davResource.getName())) {
                arrayList.add(davResource);
            }
        }
        Oh.yq(C0001.m35(f53short, 788, 4, 2445), C0010.m296(f53short, 792, 3, 2181), tF2);
        ArrayList arrayList2 = new ArrayList();
        Iterator<DavResource> it = tF2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str3 = C0015.m457(f53short, 795, 1, 3043);
            if (hasNext) {
                DavResource next = it.next();
                String replace = next.getName().replace(str3, "").replace(C0038.m1903(f53short, 796, 1, 967), "").replace(C0015.m457(f53short, 797, 1, 1414), "").replace(C0037.m1882(f53short, 798, 1, 1066), "");
                if (Rc.g9(next.getName())) {
                    boolean contains = next.getName().contains(C0000.m18(f53short, 799, 5, 929));
                    String str4 = C0009.m277(f53short, 804, 1, 1479);
                    if (contains) {
                        yq2 = Sq.yq(replace, str4);
                        sb = new StringBuilder();
                        sb.append(N2.zH());
                        sb.append(next.getPath());
                    } else {
                        yq2 = Sq.yq(replace, str4);
                        sb = new StringBuilder();
                        sb.append(N2.zH());
                        sb.append(next.getPath());
                        sb.append(C0043.m2020(f53short, 805, 3, 1420));
                        sb.append(next.getContentLength());
                    }
                    yq2.append(URLEncoder.encode(sb.toString()));
                    yq2.append(SN(N2, next, arrayList));
                    arrayList2.add(yq2.toString());
                }
            } else {
                ME me = new ME();
                me.B(substring3);
                me.G(substring3);
                me.dT(substring);
                me.F5(TextUtils.join(str3, arrayList2));
                return iX.v(me);
            }
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (WN wn : yq) {
            arrayList.add(new rP(wn.zH(), wn.zH(), C0057.m2384(f53short, 808, 1, 745)));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String yq2 = ((rP) it.next()).yq();
            ArrayList arrayList2 = new ArrayList();
            String str = C0051.m2237(f53short, 809, 2, 2210);
            arrayList2.add(new p9(C0046.m2123(f53short, 831, 4, 784), C0025.m1542(f53short, 835, 4, 396), Arrays.asList(new p9.yq(str, ""), new p9.yq(C0049.m2175(f53short, 811, 2, 573), C0045.m2098(f53short, 813, 4, 2380)), new p9.yq(C0051.m2237(f53short, 817, 2, 960), C0004.m130(f53short, 819, 4, 2999)), new p9.yq(C0012.m361(f53short, 823, 4, 1939), C0036.m1850(f53short, 827, 4, 2861)))));
            arrayList2.add(new p9(C0050.m2224(f53short, 848, 5, 2028), C0003.m86(f53short, 853, 4, 1929), Arrays.asList(new p9.yq(str, ""), new p9.yq(C0044.m2052(f53short, 839, 1, 534), C0043.m2020(f53short, 840, 3, 935)), new p9.yq(C0002.m57(f53short, 843, 1, 1485), C0015.m457(f53short, 844, 4, 2370)))));
            linkedHashMap.put(yq2, arrayList2);
        }
        return iX.g9(arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        ArrayList arrayList = new ArrayList(Arrays.asList(C0038.m1903(f53short, 857, 3, 2742), C0026.m1551(f53short, 860, 3, 1227), C0020.m1390(f53short, 863, 3, 3163)));
        SN = arrayList;
        arrayList.addAll(Rc.N);
        N = str;
        List<WN> list = yq;
        if (list == null || list.isEmpty()) {
            if (N.startsWith(C0004.m130(f53short, 866, 4, 915))) {
                N = V3.q(N, null);
            }
            if (N.startsWith(C0037.m1882(f53short, 870, 2, 1169))) {
                N = V3.q(ProxyOrigin.getFileUrl() + N.replace(C0026.m1551(f53short, 872, 1, 2496), ""), null);
            }
            yq = WN.yq(N);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        cn.F5(false);
        String[] split = str2.split(C0011.m328(f53short, 873, 3, 390));
        String[] split2 = URLDecoder.decode(split[0]).split(C0013.m380(f53short, 876, 4, 1900));
        if (split2.length > 1) {
            tF = Long.parseLong(split2[1]);
        }
        if (split2[0].contains(C0048.m2145(f53short, 880, 5, 2024))) {
            String str3 = split2[0];
            String str4 = C0055.m2320(f53short, 885, 1, 930);
            String substring = str3.contains(str4) ? split2[0].substring(0, split2[0].indexOf(str4)) : split2[0];
            WN N2 = N(substring);
            StringBuilder sb = new StringBuilder();
            Sardine q = N2.q();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(q.get(N2.tF() + split2[0].substring(substring.length()))));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append(C0012.m361(f53short, 886, 1, 361));
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            bufferedReader.close();
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            iX iXVar = new iX();
            iXVar.g1(V3.N(sb.toString(), Rc.yq()));
            iXVar.O(i(split));
            return iXVar.toString();
        }
        iX iXVar2 = new iX();
        iXVar2.g1(zH(URLEncoder.encode(split2[0])));
        iXVar2.O(i(split));
        return iXVar2.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        for (WN wn : yq) {
            if (wn.B().booleanValue()) {
                wn.SN();
                arrayList2.add(new Job(this, wn, str));
            }
        }
        for (Future future : newCachedThreadPool.invokeAll(arrayList2, 6L, TimeUnit.SECONDS)) {
            arrayList.addAll((Collection) future.get());
        }
        return iX.ee(arrayList);
    }
}
