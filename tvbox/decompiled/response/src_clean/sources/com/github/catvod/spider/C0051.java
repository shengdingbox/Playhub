package com.github.catvod.spider;

import android.net.Uri;
import android.view.View;
import android.view.Window;
import com.github.catvod.parser.C0009;
import com.github.catvod.spider.merge.C0188ts;
import com.github.catvod.spider.merge.MA;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.ZI;
import com.github.catvod.spider.merge.aq;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
/* renamed from: com.github.catvod.spider.يﻙطﺝ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0051 {

    /* renamed from: ﻅكﻭﺯ  reason: contains not printable characters */
    public static int f109 = -51;

    /* renamed from: بخﻁﺭ  reason: contains not printable characters */
    public static int m2229() {
        return 596 ^ C0009.f9;
    }

    /* renamed from: جكﺵﺥ  reason: contains not printable characters */
    public static String m2230(Object obj) {
        if ((-314) ^ C0002.f2 < 0) {
            return ((ZI) obj).M();
        }
        return null;
    }

    /* renamed from: فﻙذﻝ  reason: contains not printable characters */
    public static View m2231(Object obj) {
        if ((-767) ^ C0037.f95 >= 0) {
            return ((Window) obj).getDecorView();
        }
        return null;
    }

    /* renamed from: قتﺹز  reason: contains not printable characters */
    public static String m2232(Object obj, Object obj2) {
        if ((-886) ^ C0021.f79 <= 0) {
            return aq.B((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: مﺎﺙث  reason: contains not printable characters */
    public static byte[] m2233(Object obj) {
        if ((-193) ^ C0041.f99 >= 0) {
            return ((String) obj).getBytes();
        }
        return null;
    }

    /* renamed from: وظﻙغ  reason: contains not printable characters */
    public static int m2234(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﺏلدض  reason: contains not printable characters */
    public static String m2235(Object obj, Object obj2) {
        if ((-604) ^ C0013.f13 > 0) {
            return ((String) obj).toLowerCase((Locale) obj2);
        }
        return null;
    }

    /* renamed from: ﺭصبﻱ  reason: contains not printable characters */
    public static String m2236(Object obj) {
        if ((-824) ^ C0004.f4 <= 0) {
            return ((MA) obj).ee();
        }
        return null;
    }

    /* renamed from: ﻁاﻝﺱ  reason: contains not printable characters */
    public static Uri.Builder m2238(Object obj, Object obj2) {
        if (930 ^ C0038.f96 < 0) {
            return ((Uri.Builder) obj).encodedAuthority((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻁﺯدﺩ  reason: contains not printable characters */
    public static boolean m2239(Object obj) {
        if (909 ^ C0002.f2 >= 0) {
            return ((C0188ts) obj).i();
        }
        return false;
    }

    /* renamed from: ﻅﻡضذ  reason: contains not printable characters */
    public static File m2240(Object obj) {
        if (284 ^ C0041.f99 < 0) {
            return ((Z) obj).V();
        }
        return null;
    }

    /* renamed from: ﻉضصﺽ  reason: contains not printable characters */
    public static Object[] m2241(Object obj, Object obj2) {
        if ((-886) ^ C0021.f79 <= 0) {
            return ((V) obj).un((HashMap) obj2);
        }
        return null;
    }

    /* renamed from: ﻙﺙرـ  reason: contains not printable characters */
    public static String m2242() {
        if (m2229() < 0) {
            return "蒲团";
        }
        return null;
    }

    /* renamed from: ﻱﻡﻝخ  reason: contains not printable characters */
    public static String m2243(String str) {
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

    /* renamed from: ﺽيﻕﺏ  reason: contains not printable characters */
    public static String m2237(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
