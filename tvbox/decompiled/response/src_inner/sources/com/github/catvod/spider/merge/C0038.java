package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.Bttwoo;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.InitOrigin;
import java.io.ByteArrayOutputStream;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.ﻕﺹﺙﺥ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0038 {

    /* renamed from: ذوخظ  reason: contains not printable characters */
    public static int f96 = -749;

    /* renamed from: انﻱش  reason: contains not printable characters */
    public static String m1889(String str) {
        String str2 = "";
        String str3 = "";
        for (int i = 0; i < 15; i++) {
            str2 = new StringBuffer().append(str2).append(Integer.toHexString(i)).toString();
            str3 = new StringBuffer().append(str3).append(((int) (Math.random() * 10)) ^ i).toString();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        while (str.length() > 0) {
            byteArrayOutputStream.write((str2.indexOf(str.charAt(-2)) << 4) | str2.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str3.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str3.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ثﺽﻭﺹ  reason: contains not printable characters */
    public static Collection m1890(Object obj) {
        if (C0024.m1502() > 0) {
            return ((HashMap) obj).values();
        }
        return null;
    }

    /* renamed from: ثﻱﺡه  reason: contains not printable characters */
    public static String m1891(Object obj) {
        if (C0029.m1639() > 0) {
            return ((C0059Dl) obj).zH();
        }
        return null;
    }

    /* renamed from: خﺙزﺹ  reason: contains not printable characters */
    public static boolean m1892(Object obj) {
        if (C0046.m2112() > 0) {
            return ((LP) obj).dT();
        }
        return false;
    }

    /* renamed from: دﻅفر  reason: contains not printable characters */
    public static int m1893() {
        return 36 ^ C0033.f91;
    }

    /* renamed from: ذعﺽز  reason: contains not printable characters */
    public static JSONObject m1894(Object obj, Object obj2) {
        if (C0046.m2112() > 0) {
            return Rc.Nl((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: صظﻙت  reason: contains not printable characters */
    public static int m1895(int i) {
        if (C0039.m1918() <= 0) {
            return Rc.q(i);
        }
        return 0;
    }

    /* renamed from: طﻁكس  reason: contains not printable characters */
    public static String m1896() {
        if (C0007.m214() <= 0) {
            return "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36";
        }
        return null;
    }

    /* renamed from: ظﺎتف  reason: contains not printable characters */
    public static String m1897(Object obj, Object obj2, Object obj3) {
        if (C0008.m250() > 0) {
            return ((RQ) obj).Gd((String) obj2, (HashMap) obj3);
        }
        return null;
    }

    /* renamed from: فثجﺩ  reason: contains not printable characters */
    public static String m1898(Object obj, Object obj2, Object obj3) {
        if (C0005.m152() < 0) {
            return ((JSONObject) obj).optString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: فهند  reason: contains not printable characters */
    public static String m1899(Object obj) {
        if (C0020.m1371() < 0) {
            return Bttwoo.encodePlayKey((String) obj);
        }
        return null;
    }

    /* renamed from: فﺹذب  reason: contains not printable characters */
    public static String m1900(int i) {
        if (C0000.m13() > 0) {
            return String.valueOf(i);
        }
        return null;
    }

    /* renamed from: كﺭقﺵ  reason: contains not printable characters */
    public static boolean m1901(Object obj) {
        if (C0013.m382() <= 0) {
            return ((RQ) obj).n();
        }
        return false;
    }

    /* renamed from: ﺕصحع  reason: contains not printable characters */
    public static String m1902(Object obj, Object obj2) {
        if (C0037.m1870() >= 0) {
            return TextUtils.join((CharSequence) obj, (Iterable) obj2);
        }
        return null;
    }

    /* renamed from: ﺝﺥﻭﻕ  reason: contains not printable characters */
    public static String m1904(Object obj) {
        if (C0034.m1793() < 0) {
            return ((IL) obj).SN();
        }
        return null;
    }

    /* renamed from: ﺥنﻅﻙ  reason: contains not printable characters */
    public static List m1905(Object obj) {
        if (C0056.m2341() <= 0) {
            return ((Nh) obj).t0();
        }
        return null;
    }

    /* renamed from: ﺩﺵزذ  reason: contains not printable characters */
    public static String m1906(Object obj, Object obj2) {
        if (C0055.m2324() >= 0) {
            return iX.xa((List) obj, (List) obj2);
        }
        return null;
    }

    /* renamed from: ﺭماط  reason: contains not printable characters */
    public static int m1907(Object obj) {
        if (C0004.m129() < 0) {
            return ((AbstractC0124j) obj).H();
        }
        return 0;
    }

    /* renamed from: ﺯذير  reason: contains not printable characters */
    public static String m1908() {
        if (C0033.m1755() <= 0) {
            return "\\*\\*\\*";
        }
        return null;
    }

    /* renamed from: ﺱلبع  reason: contains not printable characters */
    public static void m1909(Object obj) {
        if (C0011.m344() > 0) {
            InitOrigin.execute((Runnable) obj);
        }
    }

    /* renamed from: ﺱﺝﻕغ  reason: contains not printable characters */
    public static List m1910(Object obj) {
        if (C0007.m214() < 0) {
            return Collections.singletonList(obj);
        }
        return null;
    }

    /* renamed from: ﻙغظز  reason: contains not printable characters */
    public static String m1911(Object obj) {
        if (C0028.m1612() <= 0) {
            return ((iX) obj).W();
        }
        return null;
    }

    /* renamed from: ﻙﺫتك  reason: contains not printable characters */
    public static boolean m1912(Object obj, Object obj2, boolean z) {
        if (C0032.m1750() < 0) {
            return ((JSONObject) obj).optBoolean((String) obj2, z);
        }
        return false;
    }

    /* renamed from: ﻝﻅﻁث  reason: contains not printable characters */
    public static Object m1913(Object obj, int i) {
        if (C0035.m1802() >= 0) {
            return ((AbstractList) obj).get(i);
        }
        return null;
    }

    /* renamed from: ﻩﻡﻍﻝ  reason: contains not printable characters */
    public static Object[] m1914(Object obj, Object obj2) {
        if (C0050.m2221() < 0) {
            return ((RQ) obj).C((Map) obj2);
        }
        return null;
    }

    /* renamed from: ﻭحﺕﻱ  reason: contains not printable characters */
    public static int m1915(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻭﺙﺝن  reason: contains not printable characters */
    public static String m1916() {
        if (C0045.m2093() > 0) {
            return Rc.yq;
        }
        return null;
    }

    /* renamed from: ﻱﺩﻁﻍ  reason: contains not printable characters */
    public static String m1917() {
        if (C0046.m2112() >= 0) {
            return "flag";
        }
        return null;
    }

    /* renamed from: ﺕـﻙﺙ  reason: contains not printable characters */
    public static String m1903(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
