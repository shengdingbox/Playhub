package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.parser.C0000;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.g8;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.jt;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Random;
/* renamed from: com.github.catvod.spider.ﺭنﻕـ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0053 {

    /* renamed from: فظﺱﺵ  reason: contains not printable characters */
    public static int f111 = 817;

    /* renamed from: ذﺕﺡﺽ  reason: contains not printable characters */
    public static String m2272(Object obj) {
        if ((-26) ^ C0033.f91 > 0) {
            return ((Music) obj).generateSessionId();
        }
        return null;
    }

    /* renamed from: رﺫﺕﻁ  reason: contains not printable characters */
    public static String m2273(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str3.charAt(i3 % length2));
        }
        for (int i4 = 0; i4 < byteArray.length; i4 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: سكﺭا  reason: contains not printable characters */
    public static Integer m2274(int i) {
        if (57 ^ C0032.f90 >= 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: ظغخح  reason: contains not printable characters */
    public static String m2275() {
        if ((-406) ^ C0053.f111 <= 0) {
            return "https://pc-api.uc.cn/";
        }
        return null;
    }

    /* renamed from: غﺥﺙس  reason: contains not printable characters */
    public static String m2277(Object obj) {
        if (596 ^ C0009.f9 <= 0) {
            return ((tX) obj).v3();
        }
        return null;
    }

    /* renamed from: فضخغ  reason: contains not printable characters */
    public static String m2278(Object obj, Object obj2, Object obj3) {
        if (36 ^ C0033.f91 < 0) {
            return ((String) obj).replaceFirst((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: فﺽﺥﺝ  reason: contains not printable characters */
    public static int m2279() {
        return 938 ^ C0033.f91;
    }

    /* renamed from: مهذﻅ  reason: contains not printable characters */
    public static String m2280(Object obj, Object obj2) {
        if ((-767) ^ C0037.f95 >= 0) {
            return ((g8) obj).yq((LinkedHashMap) obj2);
        }
        return null;
    }

    /* renamed from: نوهك  reason: contains not printable characters */
    public static boolean m2281(Object obj) {
        if ((-1021) ^ C0026.f84 < 0) {
            return ((jt) obj).tF();
        }
        return false;
    }

    /* renamed from: هذنل  reason: contains not printable characters */
    public static void m2282(Object obj, Object obj2) {
        if ((-985) ^ C0000.f0 < 0) {
            ((Nh) obj).un((String) obj2);
        }
    }

    /* renamed from: ﺎضﺥﺽ  reason: contains not printable characters */
    public static String m2283(Object obj, Object obj2, Object obj3) {
        if ((-768) ^ C0002.f2 <= 0) {
            return ((RQ) obj).H((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﺕهحر  reason: contains not printable characters */
    public static iX m2284(Object obj) {
        if ((-1021) ^ C0026.f84 < 0) {
            return ((iX) obj).v3();
        }
        return null;
    }

    /* renamed from: ﺕﻉﺹك  reason: contains not printable characters */
    public static int m2285(Object obj, int i) {
        if (293 ^ C0009.f9 <= 0) {
            return ((Random) obj).nextInt(i);
        }
        return 0;
    }

    /* renamed from: ﺥﻱغق  reason: contains not printable characters */
    public static String m2286(Object obj) {
        if (802 ^ C0052.f110 <= 0) {
            return ((Nh) obj).F5();
        }
        return null;
    }

    /* renamed from: ﺫﻝيا  reason: contains not printable characters */
    public static int m2287(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻅشخك  reason: contains not printable characters */
    public static void m2288(Object obj) {
        if ((-185) ^ C0033.f91 >= 0) {
            cn.v3((Context) obj);
        }
    }

    /* renamed from: ﻅشﺫق  reason: contains not printable characters */
    public static void m2289(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
        if ((-404) ^ C0021.f79 < 0) {
            ((Calendar) obj).set(i, i2, i3, i4, i5, i6);
        }
    }

    /* renamed from: ﻍﻕﻁﻉ  reason: contains not printable characters */
    public static String m2290(Object obj) {
        if ((-404) ^ C0021.f79 <= 0) {
            return ((URI) obj).getPath();
        }
        return null;
    }

    /* renamed from: ﻕﻡذس  reason: contains not printable characters */
    public static String m2291(Object obj) {
        if ((-31) ^ C0041.f99 >= 0) {
            return ((ME) obj).N();
        }
        return null;
    }

    /* renamed from: ﻡاﻍع  reason: contains not printable characters */
    public static int m2292(Object obj) {
        if (284 ^ C0041.f99 < 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ظقﺙﺡ  reason: contains not printable characters */
    public static String m2276(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
