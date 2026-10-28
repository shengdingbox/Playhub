package com.github.catvod.spider;

import android.net.Uri;
import android.os.Build;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.T1;
import com.github.catvod.spider.merge.X0;
import com.github.catvod.spider.merge.Yv;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.aq;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.util.AbstractMap;
/* renamed from: com.github.catvod.spider.ظدﺙﺎ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0050 {

    /* renamed from: غﻩﺭو  reason: contains not printable characters */
    public static int f108 = 763;

    /* renamed from: اﺭذﺽ  reason: contains not printable characters */
    public static void m2202(Object obj, Object obj2) {
        if (C0037.m1870() >= 0) {
            ((ME) obj).zH((String) obj2);
        }
    }

    /* renamed from: بﺹﺯذ  reason: contains not printable characters */
    public static String m2203(Object obj) {
        if (C0032.m1750() <= 0) {
            return cn.KJ((String) obj);
        }
        return null;
    }

    /* renamed from: خﺩﺙغ  reason: contains not printable characters */
    public static long m2204(Object obj) {
        if (C0023.m1475() >= 0) {
            return ((X0) obj).N();
        }
        return 0L;
    }

    /* renamed from: سﻱخﺹ  reason: contains not printable characters */
    public static String m2205(Object obj) {
        if (C0032.m1750() < 0) {
            return ((Yv) obj).N();
        }
        return null;
    }

    /* renamed from: صﻙبﻅ  reason: contains not printable characters */
    public static ME m2206(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0022.m1429() < 0) {
            return ((Nh) obj).xa((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ضكوش  reason: contains not printable characters */
    public static String m2207(Object obj) {
        if (C0052.m2256() > 0) {
            return ((C0059Dl) obj).t0();
        }
        return null;
    }

    /* renamed from: ظﺵقﻕ  reason: contains not printable characters */
    public static String m2208() {
        if (C0051.m2229() < 0) {
            return Build.CPU_ABI2;
        }
        return null;
    }

    /* renamed from: عﺎﺯﻙ  reason: contains not printable characters */
    public static String m2209(Object obj) {
        if (C0006.m193() > 0) {
            return ((Nh) obj).M();
        }
        return null;
    }

    /* renamed from: قظﺝض  reason: contains not printable characters */
    public static String m2210(Object obj) {
        if (C0038.m1893() <= 0) {
            return ((C0059Dl) obj).g9();
        }
        return null;
    }

    /* renamed from: قﺱيل  reason: contains not printable characters */
    public static boolean m2211(Object obj) {
        if (C0038.m1893() <= 0) {
            return aq.G4((String) obj);
        }
        return false;
    }

    /* renamed from: نرﺡل  reason: contains not printable characters */
    public static String m2212(Object obj) {
        if (C0020.m1371() < 0) {
            return ((Uri) obj).getEncodedAuthority();
        }
        return null;
    }

    /* renamed from: نﺵﺙﻍ  reason: contains not printable characters */
    public static T1 m2213(Object obj) {
        if (C0007.m214() <= 0) {
            return ((T1) obj).yq();
        }
        return null;
    }

    /* renamed from: هﺡﻱﺥ  reason: contains not printable characters */
    public static String m2214(String str) {
        String str2 = "";
        String str3 = "";
        for (int i = 0; i < 15; i++) {
            str2 = new StringBuffer().append(str2).append(Integer.toHexString(i)).toString();
            str3 = new StringBuffer().append(str3).append(((int) (Math.random() * 10)) ^ i).toString();
        }
        do {
        } while (str2.length() > 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((str2.indexOf(str.charAt(i2)) << 4) | str2.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str3.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str3.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: وﺭﺝﺎ  reason: contains not printable characters */
    public static Object m2215(Object obj, Object obj2, Object obj3) {
        if (C0049.m2194() < 0) {
            return ((AbstractMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ﺡخﻍﺫ  reason: contains not printable characters */
    public static String m2216() {
        if (C0012.m378() <= 0) {
            return "save_as_top_fids";
        }
        return null;
    }

    /* renamed from: ﺡﻕﺝﺩ  reason: contains not printable characters */
    public static void m2217(Object obj, Object obj2) {
        if (C0029.m1639() > 0) {
            ((Nh) obj).g1((String) obj2);
        }
    }

    /* renamed from: ﺥﻩﺱو  reason: contains not printable characters */
    public static boolean m2218(Object obj, Object obj2) {
        if (C0001.m25() < 0) {
            return ((String) obj).endsWith((String) obj2);
        }
        return false;
    }

    /* renamed from: ﺹنﻁﻕ  reason: contains not printable characters */
    public static String m2219(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0024.m1502() > 0) {
            return ((Z) obj).mG((String) obj2, (C0059Dl) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ﺽسﻭﻙ  reason: contains not printable characters */
    public static tX m2220(Object obj) {
        if (C0007.m214() < 0) {
            return tX.g1((String) obj);
        }
        return null;
    }

    /* renamed from: ﻁلﺝﺡ  reason: contains not printable characters */
    public static int m2221() {
        return (-558) ^ C0039.f97;
    }

    /* renamed from: ﻅﺩفخ  reason: contains not printable characters */
    public static String m2222(Object obj) {
        if (C0011.m344() > 0) {
            return ((Nh) obj).G4();
        }
        return null;
    }

    /* renamed from: ﻉضﻭي  reason: contains not printable characters */
    public static int m2223(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻕﺏﺭﺎ  reason: contains not printable characters */
    public static Thread m2225() {
        if (C0007.m214() < 0) {
            return Thread.currentThread();
        }
        return null;
    }

    /* renamed from: ﻝﻍـح  reason: contains not printable characters */
    public static String m2226() {
        if (C0028.m1612() < 0) {
            return "->->饭";
        }
        return null;
    }

    /* renamed from: ﻝﻕقﻙ  reason: contains not printable characters */
    public static String m2227(Object obj) {
        if (C0015.m447() > 0) {
            return obj.toString();
        }
        return null;
    }

    /* renamed from: ﻭﻁدﺥ  reason: contains not printable characters */
    public static String m2228() {
        if (C0036.m1838() < 0) {
            return "https://api.oplist.org/";
        }
        return null;
    }

    /* renamed from: ﻉﺝﺱﺫ  reason: contains not printable characters */
    public static String m2224(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
