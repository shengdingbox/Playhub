package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0053;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.github.catvod.spider.merge.طﻉرﺹ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0025 {

    /* renamed from: ﺙمﺏص  reason: contains not printable characters */
    public static int f83 = -254;

    /* renamed from: تﺹاﻝ  reason: contains not printable characters */
    public static String m1528(Object obj) {
        if (C0040.m1954() <= 0) {
            return ((ZI) obj).B();
        }
        return null;
    }

    /* renamed from: ثﻅخﻉ  reason: contains not printable characters */
    public static String m1529(Object obj) {
        if (C0003.m81() >= 0) {
            return ((LP) obj).G();
        }
        return null;
    }

    /* renamed from: حاﻭﺹ  reason: contains not printable characters */
    public static Byte m1530(byte b) {
        if (C0053.m2279() <= 0) {
            return Byte.valueOf(b);
        }
        return null;
    }

    /* renamed from: خغشب  reason: contains not printable characters */
    public static String m1531(String str) {
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
        String str4 = "a";
        while (str4.length() > 0) {
            str4 = "";
            if (str4.length() == 0) {
                str4 = "a";
            }
        }
        int length = str4.length();
        int length2 = str3.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str3.charAt(i3 % length2));
        }
        for (int i4 = 0; i4 < byteArray.length; i4 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ذزﺱﻍ  reason: contains not printable characters */
    public static void m1532(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0011.m344() >= 0) {
            System.arraycopy(obj, i, obj2, i2, i3);
        }
    }

    /* renamed from: ذﺕﺡﺽ  reason: contains not printable characters */
    public static StringBuilder m1533(Object obj, Object obj2) {
        if (C0005.m152() < 0) {
            return ((StringBuilder) obj).append(obj2);
        }
        return null;
    }

    /* renamed from: سكﺭا  reason: contains not printable characters */
    public static int m1534() {
        return (-985) ^ C0024.f82;
    }

    /* renamed from: عﺽغح  reason: contains not printable characters */
    public static long m1535(Object obj) {
        if (C0020.m1371() <= 0) {
            return ((T1) obj).N();
        }
        return 0L;
    }

    /* renamed from: كﺯﻁﺱ  reason: contains not printable characters */
    public static int m1536(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: وﺩزش  reason: contains not printable characters */
    public static String m1537(Object obj) {
        if (C0027.m1588() >= 0) {
            return ((Nh) obj).N();
        }
        return null;
    }

    /* renamed from: ينلك  reason: contains not printable characters */
    public static File m1538(Object obj) {
        if (C0051.m2229() < 0) {
            return ((C0203xU) obj).i3();
        }
        return null;
    }

    /* renamed from: ﺎﻙﻕط  reason: contains not printable characters */
    public static String m1539(Object obj) {
        if (C0035.m1802() > 0) {
            return ((WN) obj).M();
        }
        return null;
    }

    /* renamed from: ﺏﻅﻭـ  reason: contains not printable characters */
    public static String m1540() {
        if (C0022.m1429() < 0) {
            return "\"status\":401";
        }
        return null;
    }

    /* renamed from: ﺭصﻡو  reason: contains not printable characters */
    public static Yv m1541(Object obj) {
        if (C0053.m2279() <= 0) {
            return Yv.q((String) obj);
        }
        return null;
    }

    /* renamed from: ﺵﺏﺽك  reason: contains not printable characters */
    public static ME m1543(Object obj, Object obj2) {
        if (C0026.m1561() < 0) {
            return ((gE) obj).N((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻁدفﺝ  reason: contains not printable characters */
    public static Iterator m1544(Object obj) {
        if (C0041.m1981() < 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* renamed from: ﻩزشب  reason: contains not printable characters */
    public static String m1545(Object obj) {
        if (C0011.m344() > 0) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* renamed from: ﺯﺡﻕز  reason: contains not printable characters */
    public static String m1542(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
