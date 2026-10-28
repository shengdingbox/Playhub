package com.github.catvod.spider.merge;

import android.graphics.drawable.Drawable;
import android.view.Window;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0056;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.github.catvod.spider.merge.ﻙﺙﺵك  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0039 {

    /* renamed from: هﻉقخ  reason: contains not printable characters */
    public static int f97 = 795;

    /* renamed from: اعﺹج  reason: contains not printable characters */
    public static int m1918() {
        return (-314) ^ C0002.f2;
    }

    /* renamed from: تلﺩذ  reason: contains not printable characters */
    public static String m1919(Object obj, Object obj2, Object obj3) {
        if (C0013.m382() < 0) {
            return ((Z) obj).Nl((C0059Dl) obj2, (File) obj3);
        }
        return null;
    }

    /* renamed from: تﺵﺙض  reason: contains not printable characters */
    public static String m1920() {
        if (C0028.m1612() <= 0) {
            return "#";
        }
        return null;
    }

    /* renamed from: تﻱﻡش  reason: contains not printable characters */
    public static int m1921(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: دكلخ  reason: contains not printable characters */
    public static void m1922(Object obj, Object obj2) {
        if (C0029.m1639() >= 0) {
            ((Window) obj).setBackgroundDrawable((Drawable) obj2);
        }
    }

    /* renamed from: دﺱخف  reason: contains not printable characters */
    public static String m1923(Object obj, long j) {
        if (C0013.m382() <= 0) {
            return C0136m.zH((String) obj, j);
        }
        return null;
    }

    /* renamed from: رزﺯع  reason: contains not printable characters */
    public static Runtime m1924() {
        if (C0056.m2341() < 0) {
            return Runtime.getRuntime();
        }
        return null;
    }

    /* renamed from: رغﻩظ  reason: contains not printable characters */
    public static String m1925(Object obj) {
        if (C0010.m301() > 0) {
            return C0068Pe.t0((Map) obj);
        }
        return null;
    }

    /* renamed from: صﺥسﻍ  reason: contains not printable characters */
    public static String m1926(String str) {
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

    /* renamed from: ضفﺭﺩ  reason: contains not printable characters */
    public static void m1927(Object obj) {
        if (C0036.m1838() < 0) {
            ((HashMap) obj).clear();
        }
    }

    /* renamed from: كثهﻍ  reason: contains not printable characters */
    public static String m1928(Object obj) {
        if (C0003.m81() > 0) {
            return ((Nh) obj).dT();
        }
        return null;
    }

    /* renamed from: ﺎيﻉﻙ  reason: contains not printable characters */
    public static String m1929(Object obj, Object obj2) {
        if (C0038.m1893() < 0) {
            return URLDecoder.decode((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ﺏوجﺕ  reason: contains not printable characters */
    public static Yv m1930(Object obj) {
        if (C0012.m378() <= 0) {
            return ((Yv) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺕﺩيح  reason: contains not printable characters */
    public static String m1931(Object obj, Object obj2) {
        if (C0008.m250() > 0) {
            return ((DateFormat) obj).format((Date) obj2);
        }
        return null;
    }

    /* renamed from: ﺡوثﻁ  reason: contains not printable characters */
    public static boolean m1932(Object obj) {
        if (C0007.m214() < 0) {
            return ((C0059Dl) obj).OW();
        }
        return false;
    }

    /* renamed from: ﺡﺩﺯﺽ  reason: contains not printable characters */
    public static void m1933(Object obj, Object obj2) {
        if (C0052.m2256() > 0) {
            ((ME) obj).t0((String) obj2);
        }
    }

    /* renamed from: ﺥبتﺎ  reason: contains not printable characters */
    public static Collection m1934(Object obj) {
        if (C0033.m1755() < 0) {
            return ((LinkedHashMap) obj).values();
        }
        return null;
    }

    /* renamed from: ﺽﺙﻱك  reason: contains not printable characters */
    public static Object m1935(Object obj) {
        if (C0015.m447() > 0) {
            return ((AbstractC0181tM) obj).getResult();
        }
        return null;
    }

    /* renamed from: ﻁدﻙﺕ  reason: contains not printable characters */
    public static H7 m1936(Object obj) {
        if (C0042.m1998() < 0) {
            return H7.g1((String) obj);
        }
        return null;
    }

    /* renamed from: ﻉﺵبو  reason: contains not printable characters */
    public static String m1938(Object obj, Object obj2, Object obj3) {
        if (C0046.m2112() >= 0) {
            return ((Z) obj).un((String) obj2, (List) obj3);
        }
        return null;
    }

    /* renamed from: ﻕشبﺕ  reason: contains not printable characters */
    public static void m1939(Object obj, Object obj2) {
        if (C0043.m2042() < 0) {
            ((RQ) obj).v((List) obj2);
        }
    }

    /* renamed from: ﻝكﻡﺡ  reason: contains not printable characters */
    public static String m1940(Object obj, Object obj2, Object obj3, int i) {
        if (C0015.m447() > 0) {
            return A4.tF((String) obj, (String) obj2, (String) obj3, i);
        }
        return null;
    }

    /* renamed from: ﻩكﺫﻁ  reason: contains not printable characters */
    public static String m1941(Object obj) {
        if (C0041.m1981() < 0) {
            return Yx.SN((String) obj);
        }
        return null;
    }

    /* renamed from: ﻉﺝـد  reason: contains not printable characters */
    public static String m1937(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
