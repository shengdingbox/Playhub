package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0056;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Mac;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.ﻉﺵخغ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0036 {

    /* renamed from: ﻁﺽكف  reason: contains not printable characters */
    public static int f94 = 716;

    /* renamed from: ترﻕﺥ  reason: contains not printable characters */
    public static String m1834() {
        if (C0051.m2229() <= 0) {
            return "{\"action_type\":2,\"filelist\":%s,\"exclude_fids\":[]}";
        }
        return null;
    }

    /* renamed from: تﺽسل  reason: contains not printable characters */
    public static String m1835(Object obj) {
        if (C0005.m152() <= 0) {
            return ((Nh) obj).i();
        }
        return null;
    }

    /* renamed from: دـﺩظ  reason: contains not printable characters */
    public static String m1836(Object obj) {
        if (C0037.m1870() >= 0) {
            return ((JSONArray) obj).toString();
        }
        return null;
    }

    /* renamed from: ذغﻭخ  reason: contains not printable characters */
    public static String m1837(Object obj) {
        if (C0023.m1475() >= 0) {
            return ((Z) obj).ee;
        }
        return null;
    }

    /* renamed from: زغرذ  reason: contains not printable characters */
    public static int m1838() {
        return 215 ^ C0038.f96;
    }

    /* renamed from: زﺭﺎﺽ  reason: contains not printable characters */
    public static boolean m1839(Object obj) {
        if (C0042.m1998() < 0) {
            return Rc.xa((String) obj);
        }
        return false;
    }

    /* renamed from: سظصﻭ  reason: contains not printable characters */
    public static String m1840(Object obj) {
        if (C0009.m276() >= 0) {
            return ((Mac) obj).getAlgorithm();
        }
        return null;
    }

    /* renamed from: سـجط  reason: contains not printable characters */
    public static JSONObject m1841(Object obj, int i) {
        if (C0032.m1750() < 0) {
            return ((JSONArray) obj).getJSONObject(i);
        }
        return null;
    }

    /* renamed from: صظﻱش  reason: contains not printable characters */
    public static Object[] m1842(Object obj, Object obj2) {
        if (C0021.m1415() > 0) {
            return ((RQ) obj).Q4((Map) obj2);
        }
        return null;
    }

    /* renamed from: طيﺏﺯ  reason: contains not printable characters */
    public static String m1843(Object obj) {
        if (C0044.m2051() < 0) {
            return ((tX) obj).Gc();
        }
        return null;
    }

    /* renamed from: غﻁﻉل  reason: contains not printable characters */
    public static int m1844(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: نﺫﻕﺡ  reason: contains not printable characters */
    public static boolean m1845(Object obj, Object obj2) {
        if (C0024.m1502() >= 0) {
            return ((ArrayList) obj).remove(obj2);
        }
        return false;
    }

    /* renamed from: هقجر  reason: contains not printable characters */
    public static JSONObject m1846(Object obj) {
        if (C0050.m2221() <= 0) {
            return ((Z) obj).G4;
        }
        return null;
    }

    /* renamed from: ﺎسﻁك  reason: contains not printable characters */
    public static void m1847(Object obj, Object obj2) {
        if (C0027.m1588() >= 0) {
            ((OM) obj).q((String) obj2);
        }
    }

    /* renamed from: ﺎﺙنم  reason: contains not printable characters */
    public static String m1848(Object obj) {
        if (C0034.m1793() < 0) {
            return ((Z) obj).zH;
        }
        return null;
    }

    /* renamed from: ﺥبﺽي  reason: contains not printable characters */
    public static String m1849(Object obj) {
        if (C0056.m2341() < 0) {
            return ((tX) obj).tF();
        }
        return null;
    }

    /* renamed from: ﺭﻁﻩد  reason: contains not printable characters */
    public static String m1851(String str) {
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

    /* renamed from: ﺱقﺥﻉ  reason: contains not printable characters */
    public static JSONObject m1852(Object obj, Object obj2, int i) {
        if (C0002.m60() <= 0) {
            return ((JSONObject) obj).put((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ﻙقﺥﺯ  reason: contains not printable characters */
    public static String m1853(Object obj, Object obj2, Object obj3) {
        if (C0051.m2229() < 0) {
            return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* renamed from: ﻙﻉﻁس  reason: contains not printable characters */
    public static hN m1854(Object obj) {
        if (C0035.m1802() > 0) {
            return ((hN) obj).o();
        }
        return null;
    }

    /* renamed from: ﻝﺡﺎش  reason: contains not printable characters */
    public static boolean m1855(Object obj) {
        if (C0053.m2279() <= 0) {
            return ((HashMap) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ﻩﻍﺡﺱ  reason: contains not printable characters */
    public static Calendar m1856() {
        if (C0015.m447() >= 0) {
            return Calendar.getInstance();
        }
        return null;
    }

    /* renamed from: ﺥجﺵص  reason: contains not printable characters */
    public static String m1850(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
