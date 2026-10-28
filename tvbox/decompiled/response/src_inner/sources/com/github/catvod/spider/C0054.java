package com.github.catvod.spider;

import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.IL;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.ﺹﻁرع  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0054 {

    /* renamed from: ﺡجرﺕ  reason: contains not printable characters */
    public static int f112 = -671;

    /* renamed from: بﻉعث  reason: contains not printable characters */
    public static String m2293(Object obj) {
        if (C0047.m2134() <= 0) {
            return iX.G((String) obj);
        }
        return null;
    }

    /* renamed from: ذﻩﻉﺹ  reason: contains not printable characters */
    public static String m2294(Object obj) {
        if (C0039.m1918() < 0) {
            return ((IL) obj).zH();
        }
        return null;
    }

    /* renamed from: سكﻩﺫ  reason: contains not printable characters */
    public static int m2295() {
        return (-703) ^ C0036.f94;
    }

    /* renamed from: مـﺝن  reason: contains not printable characters */
    public static String m2296(Object obj, Object obj2, Object obj3) {
        if (C0027.m1588() >= 0) {
            return iX.Nl((List) obj, (List) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: نصﺙق  reason: contains not printable characters */
    public static byte[] m2297(Object obj) {
        if (C0014.m418() >= 0) {
            return Rc.un((byte[]) obj);
        }
        return null;
    }

    /* renamed from: نوتم  reason: contains not printable characters */
    public static String m2298(Object obj) {
        if (C0044.m2051() < 0) {
            return ((H7) obj).t0();
        }
        return null;
    }

    /* renamed from: نﻅضي  reason: contains not printable characters */
    public static String m2299(Object obj) {
        if (C0033.m1755() < 0) {
            return Rc.b((String) obj);
        }
        return null;
    }

    /* renamed from: يتﺱﺙ  reason: contains not printable characters */
    public static String m2300() {
        if (C0055.m2324() > 0) {
            return "优汐无限";
        }
        return null;
    }

    /* renamed from: ﺕﺱﻡﻝ  reason: contains not printable characters */
    public static boolean m2302(Object obj) {
        if (C0041.m1981() <= 0) {
            return ((tX) obj).O();
        }
        return false;
    }

    /* renamed from: ﺝتﺏج  reason: contains not printable characters */
    public static boolean m2303(Object obj) {
        if (C0012.m378() < 0) {
            return ((Matcher) obj).find();
        }
        return false;
    }

    /* renamed from: ﺝذخﺱ  reason: contains not printable characters */
    public static String m2304() {
        if (C0014.m418() >= 0) {
            return "video";
        }
        return null;
    }

    /* renamed from: ﺱفﻭﻁ  reason: contains not printable characters */
    public static String m2305(String str) {
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

    /* renamed from: ﻁقضﺩ  reason: contains not printable characters */
    public static void m2306(Object obj) {
        if (C0042.m1998() <= 0) {
            ((Hmys) obj).regLogin();
        }
    }

    /* renamed from: ﻉتﻡظ  reason: contains not printable characters */
    public static boolean m2307(Object obj) {
        if (C0006.m193() >= 0) {
            return ((String) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ﻍﻙهب  reason: contains not printable characters */
    public static int m2308(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻕﺽوض  reason: contains not printable characters */
    public static File m2309(Object obj) {
        if (C0007.m214() <= 0) {
            return ((RQ) obj).Zm();
        }
        return null;
    }

    /* renamed from: ﻝنسﺡ  reason: contains not printable characters */
    public static long m2310(Object obj, Object obj2) {
        if (C0025.m1534() <= 0) {
            return ((JSONObject) obj).optLong((String) obj2);
        }
        return 0L;
    }

    /* renamed from: ﺏعﻱش  reason: contains not printable characters */
    public static String m2301(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
