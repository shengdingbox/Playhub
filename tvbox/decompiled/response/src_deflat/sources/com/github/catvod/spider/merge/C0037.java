package com.github.catvod.spider.merge;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.Pan;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
/* renamed from: com.github.catvod.spider.merge.ﻕحخك  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0037 {

    /* renamed from: صﺙﻱي  reason: contains not printable characters */
    public static int f95 = -435;

    /* renamed from: اﺵذﺹ  reason: contains not printable characters */
    public static void m1857(Object obj, Object obj2) {
        if (C0045.m2093() >= 0) {
            ((C0059Dl) obj).E1((String) obj2);
        }
    }

    /* renamed from: ثعخﻱ  reason: contains not printable characters */
    public static C0188ts m1858(Object obj, Object obj2) {
        if (C0043.m2042() < 0) {
            return ((C0188ts) obj).M((String) obj2);
        }
        return null;
    }

    /* renamed from: جﻡظـ  reason: contains not printable characters */
    public static void m1859(Object obj, Object obj2) {
        if (C0046.m2112() >= 0) {
            ((kp) obj).B((String) obj2);
        }
    }

    /* renamed from: دﺹﻕن  reason: contains not printable characters */
    public static FA m1860() {
        if (C0028.m1612() < 0) {
            return Pan.Nl;
        }
        return null;
    }

    /* renamed from: زﻉﺭﺝ  reason: contains not printable characters */
    public static String m1861(Object obj) {
        if (C0042.m1998() < 0) {
            return ((C0059Dl) obj).xa();
        }
        return null;
    }

    /* renamed from: سﺕﻙﺩ  reason: contains not printable characters */
    public static String m1862() {
        if (C0022.m1429() <= 0) {
            return "Content-Type";
        }
        return null;
    }

    /* renamed from: صهشل  reason: contains not printable characters */
    public static String m1863(Object obj) {
        if (C0052.m2256() > 0) {
            return C0068Pe.zH((Map) obj);
        }
        return null;
    }

    /* renamed from: ضﻭﻉﻩ  reason: contains not printable characters */
    public static void m1864(Object obj) {
        if (C0007.m214() < 0) {
            Jb.SN((List) obj);
        }
    }

    /* renamed from: عوﻕﺥ  reason: contains not printable characters */
    public static int m1865(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: غﺯﻝف  reason: contains not printable characters */
    public static byte[] m1866(Object obj, Object obj2) {
        if (C0036.m1838() < 0) {
            return ((String) obj).getBytes((String) obj2);
        }
        return null;
    }

    /* renamed from: غﻁان  reason: contains not printable characters */
    public static String m1867(Object obj) {
        if (C0005.m152() <= 0) {
            return ((FA) obj).zH();
        }
        return null;
    }

    /* renamed from: قثبﻩ  reason: contains not printable characters */
    public static void m1868(long j) {
        if (C0008.m250() > 0) {
            SystemClock.sleep(j);
        }
    }

    /* renamed from: لصوي  reason: contains not printable characters */
    public static String m1869(Object obj) {
        if (C0036.m1838() <= 0) {
            return C0084bb.N((String) obj);
        }
        return null;
    }

    /* renamed from: هثﺙﻉ  reason: contains not printable characters */
    public static int m1870() {
        return 498 ^ C0002.f2;
    }

    /* renamed from: هﺏﻙﻉ  reason: contains not printable characters */
    public static Date m1871(Object obj) {
        if (C0050.m2221() <= 0) {
            return ((Calendar) obj).getTime();
        }
        return null;
    }

    /* renamed from: يلحﻍ  reason: contains not printable characters */
    public static void m1872(Object obj) {
        if (C0033.m1755() < 0) {
            Collections.reverse((List) obj);
        }
    }

    /* renamed from: ﺎذعﺏ  reason: contains not printable characters */
    public static String m1873(Object obj) {
        if (C0048.m2140() <= 0) {
            return ((Q6) obj).N();
        }
        return null;
    }

    /* renamed from: ﺕهحر  reason: contains not printable characters */
    public static String m1874() {
        if (C0027.m1588() >= 0) {
            return Build.BRAND;
        }
        return null;
    }

    /* renamed from: ﺙكﺱغ  reason: contains not printable characters */
    public static void m1875(Object obj, Object obj2) {
        if (C0000.m13() > 0) {
            ((Q6) obj).B((String) obj2);
        }
    }

    /* renamed from: ﺝثفز  reason: contains not printable characters */
    public static boolean m1876(Object obj, Object obj2) {
        if (C0009.m276() > 0) {
            return Bili.isAppInstalled((Context) obj, (String) obj2);
        }
        return false;
    }

    /* renamed from: ﺡﺥﺎب  reason: contains not printable characters */
    public static StringBuilder m1877(Object obj, Object obj2) {
        if (C0036.m1838() <= 0) {
            return Sq.yq((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ﺥﺏﻅﻁ  reason: contains not printable characters */
    public static String m1878(Object obj) {
        if (C0004.m129() <= 0) {
            return ((Z) obj).W;
        }
        return null;
    }

    /* renamed from: ﺩضﻅﻙ  reason: contains not printable characters */
    public static void m1879(Object obj, int i, int i2) {
        if (C0008.m250() > 0) {
            ((Calendar) obj).set(i, i2);
        }
    }

    /* renamed from: ﺫظﻡﺝ  reason: contains not printable characters */
    public static String m1880(Object obj, Object obj2) {
        if (C0045.m2093() >= 0) {
            return ((Uri) obj).getQueryParameter((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺫﻍلب  reason: contains not printable characters */
    public static AlertDialog.Builder m1881(Object obj, Object obj2) {
        if (C0014.m418() > 0) {
            return ((AlertDialog.Builder) obj).setOnDismissListener((DialogInterface.OnDismissListener) obj2);
        }
        return null;
    }

    /* renamed from: ﺱظﻉت  reason: contains not printable characters */
    public static AlertDialog.Builder m1883(Object obj, Object obj2, Object obj3) {
        if (C0011.m344() >= 0) {
            return ((AlertDialog.Builder) obj).setNeutralButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ﺱﺝتع  reason: contains not printable characters */
    public static sv m1884() {
        if (C0041.m1981() < 0) {
            return sv.yq;
        }
        return null;
    }

    /* renamed from: ﺵطكو  reason: contains not printable characters */
    public static String m1885(String str) {
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

    /* renamed from: ﺽجﺹﺙ  reason: contains not printable characters */
    public static void m1886(Object obj, Object obj2) {
        if (C0007.m214() < 0) {
            ((H7) obj).g((String) obj2);
        }
    }

    /* renamed from: ﻁﻅكز  reason: contains not printable characters */
    public static String m1887(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5) {
        if (C0036.m1838() <= 0) {
            return ((Z) obj).OW((C0059Dl) obj2, (String) obj3, z, (String) obj4, (File) obj5);
        }
        return null;
    }

    /* renamed from: ﻝجﻭق  reason: contains not printable characters */
    public static boolean m1888(Object obj, Object obj2) {
        if (C0007.m214() < 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* renamed from: ﺯﻭﻝغ  reason: contains not printable characters */
    public static String m1882(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
