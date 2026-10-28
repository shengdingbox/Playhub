package com.github.catvod.spider;

import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0103fp;
import com.github.catvod.spider.merge.C0188ts;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.kp;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.channels.Pipe;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.خلـﺭ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0043 {

    /* renamed from: ذغﻭخ  reason: contains not printable characters */
    public static int f101 = 168;

    /* renamed from: جﺡوﺹ  reason: contains not printable characters */
    public static void m2016(Object obj, Object obj2) {
        if (C0042.m1998() <= 0) {
            ((kp) obj).G((String) obj2);
        }
    }

    /* renamed from: حﻝﺯض  reason: contains not printable characters */
    public static Set m2017(Object obj) {
        if (C0056.m2341() < 0) {
            return ((HashMap) obj).keySet();
        }
        return null;
    }

    /* renamed from: سثﺝو  reason: contains not printable characters */
    public static String m2018(Object obj) {
        if (C0026.m1561() <= 0) {
            return ((C0188ts) obj).N();
        }
        return null;
    }

    /* renamed from: سقﺎص  reason: contains not printable characters */
    public static Iterator m2019(Object obj) {
        if (C0020.m1371() < 0) {
            return ((JSONObject) obj).keys();
        }
        return null;
    }

    /* renamed from: ضنﻅﺕ  reason: contains not printable characters */
    public static int m2021(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ظﺭﻩز  reason: contains not printable characters */
    public static long m2022() {
        if (C0047.m2134() <= 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* renamed from: غﻅﺫﻙ  reason: contains not printable characters */
    public static String m2023(Object obj) {
        if (C0045.m2093() >= 0) {
            return ((C0103fp) obj).zH;
        }
        return null;
    }

    /* renamed from: نهﺡح  reason: contains not printable characters */
    public static String m2024(String str) {
        String str2 = "";
        String str3 = "";
        for (int i = 0; i < 15; i++) {
            str2 = new StringBuffer().append(str2).append(Integer.toHexString(i)).toString();
            str3 = new StringBuffer().append(str3).append(((int) (Math.random() * 10)) ^ i).toString();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((str2.indexOf(str.charAt(i2)) << 4) | str2.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str3.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str3.charAt((-1) % length2));
        }
        for (int i3 = 0; i3 < byteArray.length; i3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: هضﺱﻕ  reason: contains not printable characters */
    public static V m2025() {
        if (C0036.m1838() < 0) {
            return V.v();
        }
        return null;
    }

    /* renamed from: هﻩﺹﺩ  reason: contains not printable characters */
    public static HashMap m2026(Object obj) {
        if (C0000.m13() >= 0) {
            return ((C0203xU) obj).g();
        }
        return null;
    }

    /* renamed from: يﺡﺏل  reason: contains not printable characters */
    public static JSONObject m2027(Object obj, Object obj2, long j) {
        if (C0055.m2324() >= 0) {
            return ((JSONObject) obj).put((String) obj2, j);
        }
        return null;
    }

    /* renamed from: ﺎغـﺕ  reason: contains not printable characters */
    public static StringBuilder m2028(Object obj, boolean z) {
        if (C0004.m129() <= 0) {
            return ((StringBuilder) obj).append(z);
        }
        return null;
    }

    /* renamed from: ﺕﺥﻙﻭ  reason: contains not printable characters */
    public static int m2029(int i, int i2) {
        if (C0027.m1588() > 0) {
            return Math.min(i, i2);
        }
        return 0;
    }

    /* renamed from: ﺕﻝاق  reason: contains not printable characters */
    public static Pipe m2030() {
        if (C0013.m382() <= 0) {
            return Pipe.open();
        }
        return null;
    }

    /* renamed from: ﺕﻭﺫﻡ  reason: contains not printable characters */
    public static boolean m2031(Object obj, Object obj2) {
        if (C0022.m1429() < 0) {
            return ((JSONObject) obj).getBoolean((String) obj2);
        }
        return false;
    }

    /* renamed from: ﺝنﻍﻁ  reason: contains not printable characters */
    public static String m2032() {
        if (C0036.m1838() <= 0) {
            return "webDavPlay";
        }
        return null;
    }

    /* renamed from: ﺡسجذ  reason: contains not printable characters */
    public static Pipe.SourceChannel m2033(Object obj) {
        if (C0015.m447() >= 0) {
            return ((Pipe) obj).source();
        }
        return null;
    }

    /* renamed from: ﺯغجﻡ  reason: contains not printable characters */
    public static JSONObject m2034() {
        if (C0042.m1998() <= 0) {
            return FO.G();
        }
        return null;
    }

    /* renamed from: ﺯﺵتﻝ  reason: contains not printable characters */
    public static void m2035(Object obj, Object obj2) {
        if (C0022.m1429() <= 0) {
            ((ME) obj).q((String) obj2);
        }
    }

    /* renamed from: ﺱبﻙﻅ  reason: contains not printable characters */
    public static StringBuilder m2036(Object obj, Object obj2) {
        if (C0010.m301() > 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ﺵقكﺎ  reason: contains not printable characters */
    public static void m2037(Object obj, Object obj2) {
        if (C0024.m1502() > 0) {
            ((PrintStream) obj).println(obj2);
        }
    }

    /* renamed from: ﻕﺭلﺝ  reason: contains not printable characters */
    public static String m2038() {
        if (C0034.m1793() <= 0) {
            return "设置CK成功";
        }
        return null;
    }

    /* renamed from: ﻡتﺡض  reason: contains not printable characters */
    public static String m2039(Object obj) {
        if (C0044.m2051() < 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* renamed from: ﻩﺱﻱﺯ  reason: contains not printable characters */
    public static void m2040(Object obj, Object obj2) {
        if (C0032.m1750() <= 0) {
            ((Mac) obj).init((Key) obj2);
        }
    }

    /* renamed from: ﻭﻅﺭﺕ  reason: contains not printable characters */
    public static void m2041(Object obj, int i, Object obj2, Object obj3) {
        if (C0002.m60() <= 0) {
            ((Cipher) obj).init(i, (Key) obj2, (AlgorithmParameterSpec) obj3);
        }
    }

    /* renamed from: ﻱﺯﺭﺵ  reason: contains not printable characters */
    public static int m2042() {
        return 813 ^ C0033.f91;
    }

    /* renamed from: صﺱﺩي  reason: contains not printable characters */
    public static String m2020(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
