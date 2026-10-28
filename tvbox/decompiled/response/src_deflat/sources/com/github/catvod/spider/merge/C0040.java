package com.github.catvod.spider.merge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.ProxyOrigin;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.ﻱﺱصف  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0040 {

    /* renamed from: ﺱﺩفش  reason: contains not printable characters */
    public static int f98 = 36;

    /* renamed from: ايطﻡ  reason: contains not printable characters */
    public static String m1942(Object obj) {
        if (C0042.m1998() < 0) {
            return zr.tF((String) obj);
        }
        return null;
    }

    /* renamed from: ثتجض  reason: contains not printable characters */
    public static String m1943(String str) {
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

    /* renamed from: رتﻝﻱ  reason: contains not printable characters */
    public static boolean m1944(Object obj, Object obj2) {
        if (C0046.m2112() > 0) {
            return ((List) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: شﺎﺱم  reason: contains not printable characters */
    public static byte[] m1945(Object obj, int i) {
        if (C0012.m378() <= 0) {
            return Base64.decode((byte[]) obj, i);
        }
        return null;
    }

    /* renamed from: طﺫﺝغ  reason: contains not printable characters */
    public static String m1946() {
        if (C0043.m2042() <= 0) {
            return "User-Agent";
        }
        return null;
    }

    /* renamed from: طﻉرﺹ  reason: contains not printable characters */
    public static String m1947() {
        if (C0001.m25() <= 0) {
            return "https://drive.uc.cn/";
        }
        return null;
    }

    /* renamed from: عحﺙق  reason: contains not printable characters */
    public static boolean m1948(Object obj) {
        if (C0049.m2194() < 0) {
            return ((C0203xU) obj).v;
        }
        return false;
    }

    /* renamed from: ـﺯصﻅ  reason: contains not printable characters */
    public static iX m1949(Object obj, Object obj2) {
        if (C0029.m1639() > 0) {
            return ((iX) obj).b((List) obj2);
        }
        return null;
    }

    /* renamed from: فجهﺝ  reason: contains not printable characters */
    public static char m1950(Object obj) {
        if (C0001.m25() < 0) {
            return ((Character) obj).charValue();
        }
        return (char) 0;
    }

    /* renamed from: قﻍﺯﻉ  reason: contains not printable characters */
    public static IL m1951(Object obj) {
        if (C0055.m2324() >= 0) {
            return IL.i((String) obj);
        }
        return null;
    }

    /* renamed from: كهﺥﻩ  reason: contains not printable characters */
    public static String m1952(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        if (C0002.m60() < 0) {
            return ((C0203xU) obj).Q4((String) obj2, (tX) obj3, (String) obj4, z);
        }
        return null;
    }

    /* renamed from: يفسﺥ  reason: contains not printable characters */
    public static int m1954() {
        return (-388) ^ C0035.f93;
    }

    /* renamed from: ﺙﻡﻩﻍ  reason: contains not printable characters */
    public static String m1955(Object obj) {
        if (C0029.m1639() > 0) {
            return ((T1) obj).tF();
        }
        return null;
    }

    /* renamed from: ﺡسﺎا  reason: contains not printable characters */
    public static void m1956(Object obj, Object obj2) {
        if (C0011.m344() > 0) {
            ((Context) obj).startActivity((Intent) obj2);
        }
    }

    /* renamed from: ﺥحاﺩ  reason: contains not printable characters */
    public static void m1957(Object obj, Object obj2, Object obj3) {
        if (C0000.m13() >= 0) {
            ((RQ) obj).tO((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ﺭﺽطغ  reason: contains not printable characters */
    public static boolean m1958() {
        if (C0021.m1415() > 0) {
            return Pan.ee;
        }
        return false;
    }

    /* renamed from: ﺯمﺱﺩ  reason: contains not printable characters */
    public static String m1959(Object obj) {
        if (C0055.m2324() >= 0) {
            return ProxyOrigin.getOwnProxyUrl((String) obj);
        }
        return null;
    }

    /* renamed from: ﺵكﻍﺯ  reason: contains not printable characters */
    public static String m1960() {
        if (C0027.m1588() > 0) {
            return "&&&";
        }
        return null;
    }

    /* renamed from: ﻍضلﺵ  reason: contains not printable characters */
    public static String m1961() {
        if (C0024.m1502() > 0) {
            return "http://192.168.111.200:10148/data";
        }
        return null;
    }

    /* renamed from: ﻕﺭلﺝ  reason: contains not printable characters */
    public static ExecutorService m1962(int i) {
        if (C0035.m1802() > 0) {
            return Executors.newFixedThreadPool(i);
        }
        return null;
    }

    /* renamed from: ﻝمقﺽ  reason: contains not printable characters */
    public static JSONObject m1963() {
        if (C0015.m447() > 0) {
            return FO.SN();
        }
        return null;
    }

    /* renamed from: ﻡرﺝﻩ  reason: contains not printable characters */
    public static Va m1964(Object obj) {
        if (C0002.m60() < 0) {
            return rN.yq((String) obj);
        }
        return null;
    }

    /* renamed from: ﻡعﻕﺭ  reason: contains not printable characters */
    public static int m1965(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻩﺕخو  reason: contains not printable characters */
    public static iX m1966(Object obj, Object obj2) {
        if (C0042.m1998() < 0) {
            return ((iX) obj).B((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻱبقﺎ  reason: contains not printable characters */
    public static Uri.Builder m1967(Object obj) {
        if (C0007.m214() <= 0) {
            return ((Uri) obj).buildUpon();
        }
        return null;
    }

    /* renamed from: نﻙشﻭ  reason: contains not printable characters */
    public static String m1953(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
