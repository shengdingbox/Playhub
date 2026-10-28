package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0065Ku;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.M4;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.by;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Response;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class DexNative {
    private static volatile boolean N;
    private static volatile boolean SN;
    private static ClassLoader tF;
    private static File zH;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f25short = {2788, 2790, 1907, 1842, 2824, 2886, 2321, 2317, 2317, 2313, 2314, 2371, 2390, 2390, 2328, 2320, 2314, 2332, 2328, 2315, 2330, 2321, 2391, 2330, 2333, 2327, 2391, 2331, 2330, 2332, 2331, 2326, 2314, 2391, 2330, 2326, 2324, 2390, 2335, 2320, 2325, 2332, 2356, 2328, 2327, 2328, 2334, 2332, 2315, 2390, 2351, 2307, 2380, 2358, 2376, 2312, 2367, 2330, 2367, 2352, 2356, 2352, 2380, 2317, 2378, 2352, 2313, 2314, 2337, 2347, 2368, 2365, 2305, 2322, 2345, 2333, 2347, 2319, 2347, 2337, 2366, 2351, 2388, 2336, 2318, 2312, 2334, 2342, 2383, 2367, 2347, 2359, 2314, 2390, 2376, 2382, 2382, 2381, 2377, 2382, 2368, 2369, 2377, 2381, 2368, 2380, 2377, 2324, 2365, 2321, 2339, 2327, 2312, 2391, 2323, 2313, 2334, 577, 605, 605, 601, 602, 531, 518, 518, 584, 576, 602, 588, 584, 603, 586, 577, 519, 586, 589, 583, 519, 587, 586, 588, 587, 582, 602, 519, 586, 582, 580, 518, 591, 576, 581, 588, 612, 584, 583, 584, 590, 588, 603, 518, 593, 600, 577, 624, 618, 516, 633, 529, 537, 582, 541, 595, 577, 516, 537, 582, 638, 600, 634, 616, 586, 619, 634, 580, 601, 610, 538, 580, 627, 538, 609, 633, 614, 536, 622, 539, 578, 601, 593, 580, 516, 606, 537, 518, 536, 542, 542, 541, 537, 542, 528, 529, 541, 528, 538, 537, 541, 637, 576, 588, 537, 587, 638, 519, 579, 601, 590, 757, 752, 767, 732, 740, 758, 766, 718, 692, 738, 703, 738, 766, 597, 585, 585, 589, 2897, 2900, 2907, 2936, 2880, 2913, 2900, 2898, 2912, 2887, 2905, 23097, 23381, 25101, 22433, 22301, 23755, 22038, 23601, -30683, -1510, 25841, 21741, 910, 914, 26202, 19755, 19920, 22661, 21749, -825, 1266, 1257, 1264, 1264, 21305, 21077, 27405, 24225, 22575, 24232, 21809, -32475, 22554, 22902, 24622, 21890, 23249, 21260, 21899, 2664, 2649, 2649, 2681, 2624, 2637, -25822, -29090, 720, 728, 755, 726, 729, 762, 706, 740, 722, 709, 705, 722, 709, -28085, -30921, 2077, 2092, 2092, 2060, 2101, 2104, 1175, 1190, 1190, 1158, 1215, 1202, 2255, 2259, 2259, 2263, 963, 976, 991, 982, 980, 302, 309, 312, 297, 319, 369, 380, 353, 2867, 2879, 2878, 2852, 2869, 2878, 2852, 2941, 2876, 2869, 2878, 2871, 2852, 2872, 2430, 2339, 2367, 942, 1018, 1001, 1008, 2094, 2111, 2103, 2090, 2053, 2110, 2107, 2100, 2103, 2095, 2164, 2080, 2099, 2090, 1544, 1628, 1615, 1622, 1100, 1097, 1094, 1125, 1117, 1148, 1097, 1103, 1149, 1114, 1092, 26097, 24741, 20715, 24034, 23694, 26070, 20602, 26460, 19501, 27419, 28239, 24065, 3170, 3198, 27062, 17095, -3285, 26213, 19732, 21714, 21666, 24080, 23251, 26282, 25076, 26258, 24716, 23776, 24026, -786, 22319, 23926, 31715, -776, 21979, 21687, 28143, 22595, 24018, 23970, -25156, 2730, 2742, 2742, 2738, 22957, -32436, -2568};
    private static final Object yq = new Object();

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class LocalSoInfo {
        private LocalSoInfo() {
        }
    }

    static {
        try {
            Application context = InitOrigin.context();
            boolean contains = Build.CPU_ABI.contains(C0038.m1903(f25short, 0, 2, 2770));
            String str = C0050.m2224(f25short, 2, 2, 1797);
            String str2 = contains ? C0037.m1882(f25short, 4, 2, 2942) : str;
            String str3 = str2.equals(str) ? C0030.m1688(f25short, 6, 111, 2425) : C0047.m2133(f25short, 117, 111, 553);
            zH = new File(context.getCacheDir(), String.format(C0043.m2020(f25short, 228, 13, 657), str2));
            if (!str3.startsWith(C0023.m1457(f25short, 241, 4, 573))) {
                return;
            }
            if (!str3.equals(C0065Ku.tF(C0050.m2224(f25short, 245, 11, 2869))) || !zH.exists()) {
                try {
                    yq(context, str3);
                } catch (Exception e) {
                    N = true;
                }
            }
        } catch (Throwable th) {
            StringBuilder yq2 = by.yq(C0030.m1688(f25short, 256, 10, 1280));
            yq2.append(th.getMessage());
            InitOrigin.show(yq2.toString());
            N = true;
        }
    }

    public static native void GoWeb();

    private static void N(Response response, File file) {
        InputStream byteStream = response.body().byteStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    byteStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            if (byteStream != null) {
                try {
                    byteStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static void SN(boolean z) {
        boolean z2;
        boolean z3 = true;
        try {
            File file = zH;
            if ((file == null || !file.exists()) && !N) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0007.m210(f25short, 266, 10, 989));
                File file2 = zH;
                sb.append(file2 != null ? file2.getAbsolutePath() : C0050.m2224(f25short, 276, 4, 1180));
                throw new FileNotFoundException(sb.toString());
            }
            zH.setReadOnly();
            System.load(zH.getAbsolutePath());
            GoWeb();
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                if (System.currentTimeMillis() - currentTimeMillis >= 5000) {
                    z3 = false;
                    break;
                }
                try {
                    new ServerSocket(10001).close();
                    z2 = false;
                } catch (IOException e) {
                    z2 = true;
                }
                if (!z2) {
                    break;
                }
                Thread.sleep(200L);
            }
            if (!z3) {
                InitOrigin.show(C0009.m277(f25short, 280, 8, 3072));
                SN = false;
                return;
            }
            if (z) {
                InitOrigin.show(C0041.m1994(f25short, 288, 7, 1827));
            }
            SN = true;
            tF = Thread.currentThread().getContextClassLoader();
            C0065Ku.i(C0023.m1457(f25short, 295, 6, 2601), Integer.valueOf(Process.myPid()));
        } catch (Throwable th) {
            SN = false;
        }
    }

    public static void danmuStart() {
        C0023.m1471(false);
    }

    public static void danmuStart(boolean z) {
        boolean z2 = false;
        boolean z3 = C0022.m1448(C0009.m277(m713(), 301, 2, 1530), C0014.m419(C0043.m2020(m713(), 303, 13, 695), C0009.m277(m713(), 316, 2, 3219)));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z3) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z4 = m708();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (z4) {
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
                                boolean z5 = m712();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (!z5) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                            int i4 = C0001.m41(C0006.m180(m713(), 318, 6, 2140));
                                            int i5 = C0044.m2066();
                                            int i6 = 48891;
                                            while (true) {
                                                i6 ^= 48908;
                                                switch (i6) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 503:
                                                        if (i4 == i5) {
                                                            break;
                                                        } else {
                                                            i6 = 49635;
                                                            continue;
                                                        }
                                                    case 32495:
                                                        boolean z6 = C0031.m1715(atomicBoolean);
                                                        int i7 = 49666;
                                                        while (true) {
                                                            i7 ^= 49683;
                                                            switch (i7) {
                                                                case 17:
                                                                    if (z6) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 49759;
                                                                        continue;
                                                                    }
                                                                case 50:
                                                                    break;
                                                                case 76:
                                                                    synchronized (m711()) {
                                                                        boolean z7 = m708();
                                                                        int i8 = 49790;
                                                                        while (true) {
                                                                            i8 ^= 49807;
                                                                            switch (i8) {
                                                                                case 18:
                                                                                    break;
                                                                                case 51:
                                                                                    break;
                                                                                case 84:
                                                                                    ClassLoader classLoader = m710();
                                                                                    ClassLoader classLoader2 = C0010.m322(C0050.m2225());
                                                                                    int i9 = 49914;
                                                                                    while (true) {
                                                                                        i9 ^= 49931;
                                                                                        switch (i9) {
                                                                                            case 497:
                                                                                                if (classLoader != classLoader2) {
                                                                                                    break;
                                                                                                } else {
                                                                                                    i9 = 50658;
                                                                                                    continue;
                                                                                                }
                                                                                            case 1711:
                                                                                                break;
                                                                                            case 1736:
                                                                                                break;
                                                                                            case 1769:
                                                                                                C0002.m78(C0002.m57(m713(), 324, 6, 1238), C0053.m2274(C0044.m2066()));
                                                                                                z2 = true;
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                        i9 = 50627;
                                                                                    }
                                                                                case 241:
                                                                                    if (!z7) {
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
                                                                        int i10 = 50689;
                                                                        while (true) {
                                                                            i10 ^= 50706;
                                                                            switch (i10) {
                                                                                case 19:
                                                                                    if (z2) {
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
                                                                                    boolean z8 = m708();
                                                                                    int i11 = 50813;
                                                                                    while (true) {
                                                                                        i11 ^= 50830;
                                                                                        switch (i11) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 53:
                                                                                                break;
                                                                                            case 243:
                                                                                                if (z8) {
                                                                                                    break;
                                                                                                } else {
                                                                                                    i11 = 51557;
                                                                                                    continue;
                                                                                                }
                                                                                            case 4075:
                                                                                                m709(z);
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                        i11 = 50875;
                                                                                    }
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i10 = 50751;
                                                                        }
                                                                    }
                                                                    int i12 = 51588;
                                                                    while (true) {
                                                                        i12 ^= 51605;
                                                                        switch (i12) {
                                                                            case 17:
                                                                                i12 = 51619;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    break;
                                                            }
                                                            i7 = 49728;
                                                        }
                                                        break;
                                                }
                                                i6 = 48953;
                                            }
                                            break;
                                        case 47417:
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case 14:
                                                        break;
                                                    case 239:
                                                        i13 = 48798;
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
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        int i14 = C0021.m1415();
        int i15 = 51712;
        while (true) {
            i15 ^= 51729;
            switch (i15) {
                case 14:
                    break;
                case 17:
                    if (i14 > 0) {
                        break;
                    } else {
                        i15 = 51805;
                        continue;
                    }
                case 47:
                    return;
                case 76:
                    System.out.println(C0014.m410("CQA"));
                    return;
            }
            i15 = 51774;
        }
    }

    private static void yq(Context context, String str) {
        File file;
        synchronized (yq) {
            if (str.startsWith(C0042.m2010(f25short, 330, 4, 2215))) {
                HashMap<String, String> yq2 = Rc.yq();
                yq2.put(C0010.m296(f25short, 334, 5, 945), C0055.m2320(f25short, 339, 8, 332));
                Response Gc = C0068Pe.Gc(str, yq2);
                if (!Gc.isSuccessful() || Long.parseLong(Gc.header(C0025.m1542(f25short, 347, 14, 2896))) < 3145728) {
                    InitOrigin.show(C0013.m380(f25short, 414, 17, 994) + Gc.code());
                    Gc.close();
                    return;
                }
                zH.delete();
                if (!str.contains(C0052.m2261(f25short, 361, 3, 2384))) {
                    boolean contains = str.contains(C0020.m1390(f25short, 364, 4, 896));
                    String str2 = C0005.m169(f25short, 368, 14, 2138);
                    String lastPathSegment = contains ? Uri.parse(str).getLastPathSegment() : str2;
                    if (Rc.ee(lastPathSegment)) {
                        lastPathSegment = str2;
                    }
                    file = new File(context.getCacheDir(), lastPathSegment);
                } else {
                    file = zH;
                }
                N(Gc, file);
                if (file.getAbsolutePath().contains(C0007.m210(f25short, 382, 4, 1574))) {
                    M4.zH(file, context.getCacheDir());
                    file.delete();
                }
                if (zH.exists()) {
                    C0065Ku.i(C0037.m1882(f25short, 386, 11, 1064), str);
                    Gc.close();
                    return;
                }
                InitOrigin.show(C0013.m380(f25short, 397, 9, 731));
                N = true;
                throw new FileNotFoundException(C0056.m2339(f25short, 406, 8, 3121) + zH.getAbsolutePath());
            }
            throw new IllegalArgumentException(C0047.m2133(f25short, 431, 14, 2786) + str);
        }
    }

    /* renamed from: جقﺥﻙ  reason: contains not printable characters */
    public static boolean m708() {
        if (C0022.m1429() < 0) {
            return SN;
        }
        return false;
    }

    /* renamed from: كيتخ  reason: contains not printable characters */
    public static void m709(boolean z) {
        if (C0033.m1755() <= 0) {
            SN(z);
        }
    }

    /* renamed from: يخﺹه  reason: contains not printable characters */
    public static ClassLoader m710() {
        if (C0024.m1502() >= 0) {
            return tF;
        }
        return null;
    }

    /* renamed from: ﺡﺯﺏﺹ  reason: contains not printable characters */
    public static Object m711() {
        if (C0045.m2093() >= 0) {
            return yq;
        }
        return null;
    }

    /* renamed from: ﺡﺵخﺕ  reason: contains not printable characters */
    public static boolean m712() {
        if (C0047.m2134() <= 0) {
            return N;
        }
        return false;
    }

    /* renamed from: ﻍﻕﺹﺥ  reason: contains not printable characters */
    public static short[] m713() {
        if (C0052.m2256() >= 0) {
            return f25short;
        }
        return null;
    }
}
