package com.github.catvod.spider;

import android.content.SharedPreferences;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0065Ku;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.OM;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.lm;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.github.catvod.spider.رﻝشا  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0045 {

    /* renamed from: ﻕذثف  reason: contains not printable characters */
    public static int f103 = 313;

    /* renamed from: ثظﻙﺫ  reason: contains not printable characters */
    public static String m2082(Object obj) {
        if (C0051.m2229() <= 0) {
            return ((lm) obj).yq();
        }
        return null;
    }

    /* renamed from: حدﺎﺯ  reason: contains not printable characters */
    public static Object[] m2083(Object obj, Object obj2, int i, long j, int i2) {
        if (C0007.m214() <= 0) {
            return ((Z) obj).lF((HashMap) obj2, i, j, i2);
        }
        return null;
    }

    /* renamed from: شﺽﻭد  reason: contains not printable characters */
    public static String m2084(Object obj) {
        if (C0049.m2194() < 0) {
            return C0065Ku.tF((String) obj);
        }
        return null;
    }

    /* renamed from: عﻱﺙﻩ  reason: contains not printable characters */
    public static long m2085(Object obj) {
        if (C0025.m1534() < 0) {
            return ((OM) obj).tF();
        }
        return 0L;
    }

    /* renamed from: ـﺫﺽﺕ  reason: contains not printable characters */
    public static ME m2086(Object obj, Object obj2) {
        if (C0030.m1683() >= 0) {
            return ((lm) obj).G((String) obj2);
        }
        return null;
    }

    /* renamed from: فبصغ  reason: contains not printable characters */
    public static HashMap m2087(Object obj) {
        if (C0028.m1612() <= 0) {
            return Rc.M((String) obj);
        }
        return null;
    }

    /* renamed from: فغنﻕ  reason: contains not printable characters */
    public static String m2088(Object obj) {
        if (C0013.m382() < 0) {
            return ((H7) obj).N();
        }
        return null;
    }

    /* renamed from: ﺝﻁﻩش  reason: contains not printable characters */
    public static int m2089(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﺥدزﺡ  reason: contains not printable characters */
    public static SharedPreferences.Editor m2090(Object obj, Object obj2, Object obj3) {
        if (C0036.m1838() <= 0) {
            return ((SharedPreferences.Editor) obj).putString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﺥﻙخﻱ  reason: contains not printable characters */
    public static String m2091() {
        if (C0035.m1802() > 0) {
            return "\\";
        }
        return null;
    }

    /* renamed from: ﺩصﺯﻉ  reason: contains not printable characters */
    public static String m2092() {
        if (C0025.m1534() < 0) {
            return "&client_id=";
        }
        return null;
    }

    /* renamed from: ﺯهتض  reason: contains not printable characters */
    public static int m2093() {
        return (-26) ^ C0033.f91;
    }

    /* renamed from: ﺯﻉﺡن  reason: contains not printable characters */
    public static Cloud_quark m2094(Object obj) {
        if (C0028.m1612() < 0) {
            return ((Pan) obj).yq;
        }
        return null;
    }

    /* renamed from: ﺵحﺭﻩ  reason: contains not printable characters */
    public static Object m2095(Object obj) {
        if (C0053.m2279() < 0) {
            return ((Map.Entry) obj).getValue();
        }
        return null;
    }

    /* renamed from: ﺽﻁﻉو  reason: contains not printable characters */
    public static String m2096() {
        if (C0056.m2341() <= 0) {
            return "application/json";
        }
        return null;
    }

    /* renamed from: ﻡزخﻙ  reason: contains not printable characters */
    public static String m2097(String str) {
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

    /* renamed from: ﻡلﺕا  reason: contains not printable characters */
    public static String m2098(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
