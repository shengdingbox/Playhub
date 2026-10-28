package com.github.catvod.spider.merge;

import android.net.Uri;
import android.util.Base64;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.merge.ME;
import java.io.ByteArrayOutputStream;
import java.nio.channels.Pipe;
import java.util.List;
/* renamed from: com.github.catvod.spider.merge.ﺹﺏمﺙ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0034 {

    /* renamed from: ـمﺱي  reason: contains not printable characters */
    public static int f92 = 518;

    /* renamed from: بذﻱﻩ  reason: contains not printable characters */
    public static void m1779(Object obj, Object obj2) {
        if (C0004.m129() < 0) {
            ((ME) obj).i((ME.yq) obj2);
        }
    }

    /* renamed from: بﻕﺹذ  reason: contains not printable characters */
    public static RunnableC0067Ly m1780() {
        if (C0015.m447() > 0) {
            return RunnableC0067Ly.yq;
        }
        return null;
    }

    /* renamed from: طﺥسض  reason: contains not printable characters */
    public static String m1782() {
        if (C0020.m1371() < 0) {
            return "优汐存";
        }
        return null;
    }

    /* renamed from: طﺹيب  reason: contains not printable characters */
    public static String m1783(Object obj) {
        if (C0056.m2341() < 0) {
            return ((C0059Dl) obj).F5();
        }
        return null;
    }

    /* renamed from: ظايﻁ  reason: contains not printable characters */
    public static String m1784(Object obj) {
        if (C0055.m2324() >= 0) {
            return ((tX) obj).ee();
        }
        return null;
    }

    /* renamed from: ـضﺵغ  reason: contains not printable characters */
    public static StringBuilder m1785(Object obj, int i) {
        if (C0035.m1802() > 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* renamed from: قﺥﺏﻭ  reason: contains not printable characters */
    public static String m1786(Object obj) {
        if (C0044.m2051() <= 0) {
            return ((Yv) obj).tF();
        }
        return null;
    }

    /* renamed from: قﺥﻉر  reason: contains not printable characters */
    public static int m1787(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: قﺽجﻅ  reason: contains not printable characters */
    public static iX m1788(Object obj, Object obj2) {
        if (C0040.m1954() <= 0) {
            return ((iX) obj).g1((String) obj2);
        }
        return null;
    }

    /* renamed from: مﺕﺩﻱ  reason: contains not printable characters */
    public static String m1789(Object obj, Object obj2) {
        if (C0028.m1612() <= 0) {
            return ((ByteArrayOutputStream) obj).toString((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺎثﺯظ  reason: contains not printable characters */
    public static String m1790(Object obj, int i) {
        if (C0005.m152() <= 0) {
            return Base64.encodeToString((byte[]) obj, i);
        }
        return null;
    }

    /* renamed from: ﺕﻕكب  reason: contains not printable characters */
    public static Uri m1791(Object obj) {
        if (C0036.m1838() <= 0) {
            return Uri.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ﺝزاس  reason: contains not printable characters */
    public static String m1792(String str) {
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

    /* renamed from: ﺝﻝقﻭ  reason: contains not printable characters */
    public static int m1793() {
        return 802 ^ C0052.f110;
    }

    /* renamed from: ﺭﺝﺎﻁ  reason: contains not printable characters */
    public static String m1794(Object obj) {
        if (C0052.m2256() > 0) {
            return ((OM) obj).i();
        }
        return null;
    }

    /* renamed from: ﻕجﻝق  reason: contains not printable characters */
    public static String m1795(Object obj) {
        if (C0051.m2229() < 0) {
            return ((C0103fp) obj).tF;
        }
        return null;
    }

    /* renamed from: ﻝغﺝﺵ  reason: contains not printable characters */
    public static void m1796(Object obj) {
        if (C0015.m447() > 0) {
            ((C0203xU) obj).u7();
        }
    }

    /* renamed from: ﻝهوي  reason: contains not printable characters */
    public static Pipe.SinkChannel m1797(Object obj) {
        if (C0049.m2194() < 0) {
            return ((Pipe) obj).sink();
        }
        return null;
    }

    /* renamed from: ﻭمﻅـ  reason: contains not printable characters */
    public static String m1798(Object obj) {
        if (C0047.m2134() < 0) {
            return ((H7) obj).W();
        }
        return null;
    }

    /* renamed from: ﻱضجش  reason: contains not printable characters */
    public static List m1799(Object obj, Object obj2) {
        if (C0047.m2134() < 0) {
            return ((Z) obj).i3((C0059Dl) obj2);
        }
        return null;
    }

    /* renamed from: حظعﺵ  reason: contains not printable characters */
    public static String m1781(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
