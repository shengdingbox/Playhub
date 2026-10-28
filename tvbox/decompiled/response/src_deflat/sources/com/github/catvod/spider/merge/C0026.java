package com.github.catvod.spider.merge;

import android.app.AlertDialog;
import android.content.pm.ApplicationInfo;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0056;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
/* renamed from: com.github.catvod.spider.merge.طﻉشﺵ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0026 {

    /* renamed from: طضتﻝ  reason: contains not printable characters */
    public static int f84 = 955;

    /* renamed from: ابعق  reason: contains not printable characters */
    public static String m1546() {
        if (C0006.m193() >= 0) {
            return "https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc&uc_param_str=";
        }
        return null;
    }

    /* renamed from: ثخبﻱ  reason: contains not printable characters */
    public static int m1547(Object obj, int i) {
        if (C0013.m382() <= 0) {
            return ((String) obj).indexOf(i);
        }
        return 0;
    }

    /* renamed from: حﺱتﻍ  reason: contains not printable characters */
    public static String m1548(Object obj, Object obj2) {
        if (C0041.m1981() <= 0) {
            return ((C0098ew) obj).i((String) obj2);
        }
        return null;
    }

    /* renamed from: حﻕزﻉ  reason: contains not printable characters */
    public static int m1549(Object obj) {
        if (C0056.m2341() < 0) {
            return ((Db) obj).SN;
        }
        return 0;
    }

    /* renamed from: طﺯﻙﻭ  reason: contains not printable characters */
    public static Object[] m1550(Object obj) {
        if (C0051.m2229() < 0) {
            return ((RQ) obj).lF();
        }
        return null;
    }

    /* renamed from: قتيـ  reason: contains not printable characters */
    public static int m1552(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: كخﻡﺎ  reason: contains not printable characters */
    public static boolean m1553(Object obj) {
        if (C0020.m1371() < 0) {
            return ((Z) obj).g9;
        }
        return false;
    }

    /* renamed from: كـزظ  reason: contains not printable characters */
    public static void m1554(Object obj, Object obj2) {
        if (C0051.m2229() < 0) {
            ((WebSettings) obj).setUserAgentString((String) obj2);
        }
    }

    /* renamed from: لﺹﻡﺫ  reason: contains not printable characters */
    public static boolean m1555(Object obj) {
        if (C0006.m193() > 0) {
            return ((RQ) obj).F5();
        }
        return false;
    }

    /* renamed from: واذﻍ  reason: contains not printable characters */
    public static Object m1556(Object obj) {
        if (C0046.m2112() >= 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* renamed from: ﺎزكش  reason: contains not printable characters */
    public static String m1557(Object obj) {
        if (C0009.m276() >= 0) {
            return ((ApplicationInfo) obj).packageName;
        }
        return null;
    }

    /* renamed from: ﺎغﻕف  reason: contains not printable characters */
    public static int m1558(Object obj, int i) {
        if (C0054.m2295() < 0) {
            return ((JSONArray) obj).getInt(i);
        }
        return 0;
    }

    /* renamed from: ﺙـجﺯ  reason: contains not printable characters */
    public static Boolean m1559(boolean z) {
        if (C0032.m1750() <= 0) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* renamed from: ﺡﺙبﺎ  reason: contains not printable characters */
    public static GW m1560(Object obj) {
        if (C0021.m1415() >= 0) {
            return ((ZI) obj).KJ();
        }
        return null;
    }

    /* renamed from: ﺡﺝﺱم  reason: contains not printable characters */
    public static int m1561() {
        return 930 ^ C0038.f96;
    }

    /* renamed from: ﺩـدغ  reason: contains not printable characters */
    public static WebSettings m1562(Object obj) {
        if (C0029.m1639() >= 0) {
            return ((WebView) obj).getSettings();
        }
        return null;
    }

    /* renamed from: ﺫملﻍ  reason: contains not printable characters */
    public static Locale m1563() {
        if (C0037.m1870() >= 0) {
            return Locale.US;
        }
        return null;
    }

    /* renamed from: ﺫﺵزظ  reason: contains not printable characters */
    public static String m1564() {
        if (C0039.m1918() < 0) {
            return "1/clouddrive/share/sharepage/save?pr=UCBrowser&fr=pc&uc_param_str=&__dt=";
        }
        return null;
    }

    /* renamed from: ﺭﺫﺙه  reason: contains not printable characters */
    public static String m1565(Object obj) {
        if (C0041.m1981() < 0) {
            return ((H7) obj).Gc();
        }
        return null;
    }

    /* renamed from: ﺯهﻭﻙ  reason: contains not printable characters */
    public static void m1566(Object obj, Object obj2) {
        if (C0040.m1954() <= 0) {
            ((T1) obj).t0((String) obj2);
        }
    }

    /* renamed from: ﺱرﺙﺽ  reason: contains not printable characters */
    public static String m1567(Object obj) {
        if (C0040.m1954() <= 0) {
            return ((RQ) obj).zH;
        }
        return null;
    }

    /* renamed from: ﺽاﺙع  reason: contains not printable characters */
    public static int m1568(Object obj, Object obj2, int i, int i2) {
        if (C0035.m1802() >= 0) {
            return ((InputStream) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* renamed from: ﻉﻕﺵﺙ  reason: contains not printable characters */
    public static boolean m1569(Object obj) {
        if (C0015.m447() >= 0) {
            return ((C0188ts) obj).t0();
        }
        return false;
    }

    /* renamed from: ﻍسﺏج  reason: contains not printable characters */
    public static AlertDialog m1570(Object obj) {
        if (C0027.m1588() >= 0) {
            return ((AlertDialog.Builder) obj).show();
        }
        return null;
    }

    /* renamed from: ﻝرﺩﻅ  reason: contains not printable characters */
    public static String m1571(Object obj) {
        if (C0049.m2194() <= 0) {
            return ((Nh) obj).g9();
        }
        return null;
    }

    /* renamed from: ﻭولب  reason: contains not printable characters */
    public static String m1572(String str) {
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

    /* renamed from: ـاخﻉ  reason: contains not printable characters */
    public static String m1551(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
