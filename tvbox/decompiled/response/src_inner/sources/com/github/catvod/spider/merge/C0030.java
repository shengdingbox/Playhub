package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0056;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.ﺏخﺵم  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0030 {

    /* renamed from: عذاض  reason: contains not printable characters */
    public static int f88 = 155;

    /* renamed from: احﻝﺹ  reason: contains not printable characters */
    public static String m1663(String str) {
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

    /* renamed from: اﺎعث  reason: contains not printable characters */
    public static Object[] m1664(Object obj, Object obj2) {
        if (C0038.m1893() <= 0) {
            return ((V) obj).Hj((HashMap) obj2);
        }
        return null;
    }

    /* renamed from: ثغتﺵ  reason: contains not printable characters */
    public static void m1665(Object obj) {
        if (C0028.m1612() <= 0) {
            ((RQ) obj).p();
        }
    }

    /* renamed from: دﺎﻁغ  reason: contains not printable characters */
    public static List m1666(Object obj, Object obj2) {
        if (C0029.m1639() >= 0) {
            return ((RQ) obj).U((Nh) obj2);
        }
        return null;
    }

    /* renamed from: دﻕسز  reason: contains not printable characters */
    public static int m1667(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ذخﺵﻝ  reason: contains not printable characters */
    public static String m1668() {
        if (C0008.m250() > 0) {
            return "data";
        }
        return null;
    }

    /* renamed from: زﻝﺩﺯ  reason: contains not printable characters */
    public static JSONObject m1669(Object obj) {
        if (C0025.m1534() <= 0) {
            return ((C0203xU) obj).G;
        }
        return null;
    }

    /* renamed from: زﻱﺕر  reason: contains not printable characters */
    public static Object[] m1670(Object obj, Object obj2) {
        if (C0056.m2341() < 0) {
            return ((Z) obj).z((HashMap) obj2);
        }
        return null;
    }

    /* renamed from: عاﺝﻙ  reason: contains not printable characters */
    public static String m1671(long j) {
        if (C0027.m1588() >= 0) {
            return Long.toString(j);
        }
        return null;
    }

    /* renamed from: كﺽسغ  reason: contains not printable characters */
    public static String m1672(Object obj) {
        if (C0039.m1918() <= 0) {
            return ((Q6) obj).Gc();
        }
        return null;
    }

    /* renamed from: لوﺝا  reason: contains not printable characters */
    public static OM m1673(Object obj) {
        if (C0003.m81() > 0) {
            return ((RQ) obj).v;
        }
        return null;
    }

    /* renamed from: وﺫاﺩ  reason: contains not printable characters */
    public static boolean m1674(Object obj) {
        if (C0036.m1838() < 0) {
            return ((C0059Dl) obj).g1();
        }
        return false;
    }

    /* renamed from: وﻕﺎخ  reason: contains not printable characters */
    public static String m1675(Object obj) {
        if (C0010.m301() >= 0) {
            return ((Nh) obj).Gd();
        }
        return null;
    }

    /* renamed from: يفﻡﺥ  reason: contains not printable characters */
    public static String m1676(Object obj, Object obj2) {
        if (C0023.m1475() >= 0) {
            return C0060Do.tF((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: يﻍﻙﻉ  reason: contains not printable characters */
    public static String m1677(int i) {
        if (C0052.m2256() >= 0) {
            return Integer.toHexString(i);
        }
        return null;
    }

    /* renamed from: ﺏﻍﻱﺝ  reason: contains not printable characters */
    public static String m1678(Object obj, int i) {
        if (C0041.m1981() <= 0) {
            return ((Matcher) obj).group(i);
        }
        return null;
    }

    /* renamed from: ﺥﻩﺱو  reason: contains not printable characters */
    public static void m1679(Object obj) {
        if (C0037.m1870() >= 0) {
            ((MessageDigest) obj).reset();
        }
    }

    /* renamed from: ﺫثلﻩ  reason: contains not printable characters */
    public static String m1680() {
        if (C0038.m1893() <= 0) {
            return "***";
        }
        return null;
    }

    /* renamed from: ﺫصظط  reason: contains not printable characters */
    public static boolean m1681(Object obj, Object obj2) {
        if (C0023.m1475() > 0) {
            return ((String) obj).startsWith((String) obj2);
        }
        return false;
    }

    /* renamed from: ﺫمﻙج  reason: contains not printable characters */
    public static Object m1682(Object obj, Object obj2) {
        if (C0049.m2194() < 0) {
            return C0081aj.yq((String) obj, (Class) obj2);
        }
        return null;
    }

    /* renamed from: ﺭخﺝﻉ  reason: contains not printable characters */
    public static int m1683() {
        return (-675) ^ C0038.f96;
    }

    /* renamed from: ﺭﺩجق  reason: contains not printable characters */
    public static String m1684() {
        if (C0043.m2042() <= 0) {
            return A4.i();
        }
        return null;
    }

    /* renamed from: ﺱزهﺕ  reason: contains not printable characters */
    public static Q6 m1685(Object obj) {
        if (C0039.m1918() < 0) {
            return Q6.M((String) obj);
        }
        return null;
    }

    /* renamed from: ﻝﻡوص  reason: contains not printable characters */
    public static C0188ts m1686(Object obj) {
        if (C0039.m1918() < 0) {
            return C0188ts.Gc((String) obj);
        }
        return null;
    }

    /* renamed from: ﻩجﻱﻕ  reason: contains not printable characters */
    public static String m1687() {
        if (C0015.m447() > 0) {
            return "UC盘容量不足,请购买会员扩容或清理空间";
        }
        return null;
    }

    /* renamed from: ﻭوﺥي  reason: contains not printable characters */
    public static iX m1689(Object obj, Object obj2) {
        if (C0001.m25() <= 0) {
            return ((iX) obj).O((List) obj2);
        }
        return null;
    }

    /* renamed from: ﻭوﺕﺫ  reason: contains not printable characters */
    public static String m1688(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
