package com.github.catvod.spider.merge;

import android.net.Uri;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.App99;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
/* renamed from: com.github.catvod.spider.merge.خﺯﻁك  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0021 {

    /* renamed from: هقﺯت  reason: contains not printable characters */
    public static int f79 = 518;

    /* renamed from: تﻕزس  reason: contains not printable characters */
    public static String m1395(String str) {
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

    /* renamed from: ثﻉﺽﺱ  reason: contains not printable characters */
    public static long m1396(Object obj) {
        if (C0014.m418() > 0) {
            return ((C0188ts) obj).SN();
        }
        return 0L;
    }

    /* renamed from: رﻙﻭﻩ  reason: contains not printable characters */
    public static String m1397() {
        if (C0043.m2042() < 0) {
            return "+";
        }
        return null;
    }

    /* renamed from: سجحﺹ  reason: contains not printable characters */
    public static String m1398(Object obj) {
        if (C0003.m81() >= 0) {
            return M4.tF((File) obj);
        }
        return null;
    }

    /* renamed from: شﻡﻱم  reason: contains not printable characters */
    public static int m1399(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: صحﻅﻉ  reason: contains not printable characters */
    public static String m1400(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0015.m447() >= 0) {
            return ((App99) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: صذضﺯ  reason: contains not printable characters */
    public static PublicKey m1401(Object obj, Object obj2) {
        if (C0053.m2279() <= 0) {
            return ((KeyFactory) obj).generatePublic((KeySpec) obj2);
        }
        return null;
    }

    /* renamed from: ضﺽﺱﻁ  reason: contains not printable characters */
    public static String m1402() {
        if (C0023.m1475() > 0) {
            return "nick_name";
        }
        return null;
    }

    /* renamed from: طﺝذق  reason: contains not printable characters */
    public static boolean m1403() {
        if (C0042.m1998() < 0) {
            return InitOrigin.zH;
        }
        return false;
    }

    /* renamed from: عجﻍﺱ  reason: contains not printable characters */
    public static X0 m1404(Object obj) {
        if (C0057.m2368() >= 0) {
            return X0.zH((String) obj);
        }
        return null;
    }

    /* renamed from: عﺱﺭﺏ  reason: contains not printable characters */
    public static void m1405(Object obj, Object obj2) {
        if (C0042.m1998() <= 0) {
            ((C0059Dl) obj).Zm((String) obj2);
        }
    }

    /* renamed from: وهعذ  reason: contains not printable characters */
    public static void m1406(Object obj, Object obj2) {
        if (C0055.m2324() >= 0) {
            ((Throwable) obj).addSuppressed((Throwable) obj2);
        }
    }

    /* renamed from: ﺎلرﺝ  reason: contains not printable characters */
    public static String m1407(Object obj) {
        if (C0000.m13() >= 0) {
            return ((GW) obj).SN();
        }
        return null;
    }

    /* renamed from: ﺎﻙﻕط  reason: contains not printable characters */
    public static Object m1408(Object obj) {
        if (C0010.m301() >= 0) {
            return ((Future) obj).get();
        }
        return null;
    }

    /* renamed from: ﺡضظص  reason: contains not printable characters */
    public static void m1409(Object obj, Object obj2) {
        if (C0054.m2295() < 0) {
            ((ME) obj).G4((String) obj2);
        }
    }

    /* renamed from: ﺥﻉقع  reason: contains not printable characters */
    public static boolean m1410(Object obj, Object obj2) {
        if (C0028.m1612() <= 0) {
            return ((Map) obj).containsKey(obj2);
        }
        return false;
    }

    /* renamed from: ﺫﻉﺏﻅ  reason: contains not printable characters */
    public static String m1411(Object obj, Object obj2, Object obj3) {
        if (C0043.m2042() <= 0) {
            return ((C0203xU) obj).O((String) obj2, (List) obj3);
        }
        return null;
    }

    /* renamed from: ﺹذﻙو  reason: contains not printable characters */
    public static String m1412(Object obj) {
        if (C0055.m2324() > 0) {
            return ((Uri) obj).getPath();
        }
        return null;
    }

    /* renamed from: ﻁيﻝم  reason: contains not printable characters */
    public static boolean m1413(Object obj) {
        if (C0009.m276() > 0) {
            return ((Z) obj).v;
        }
        return false;
    }

    /* renamed from: ﻉﻩصت  reason: contains not printable characters */
    public static String m1414(Object obj) {
        if (C0055.m2324() >= 0) {
            return ((RO) obj).SN();
        }
        return null;
    }

    /* renamed from: ﻙذسﺩ  reason: contains not printable characters */
    public static int m1415() {
        return (-422) ^ C0033.f91;
    }

    /* renamed from: ﻝيزث  reason: contains not printable characters */
    public static String m1416() {
        if (C0005.m152() < 0) {
            return ProxyOrigin.getInternalIP();
        }
        return null;
    }

    /* renamed from: ﻱﺱكﻍ  reason: contains not printable characters */
    public static Boolean m1418() {
        if (C0012.m378() < 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: ﻭحطف  reason: contains not printable characters */
    public static String m1417(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
