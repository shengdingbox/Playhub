package com.github.catvod.spider.merge;

import android.text.TextUtils;
import android.webkit.WebSettings;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.ProxyOrigin;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
/* renamed from: com.github.catvod.spider.merge.لﻩﺱد  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0029 {

    /* renamed from: وصﺩﺏ  reason: contains not printable characters */
    public static int f87 = -860;

    /* renamed from: جيﻉﻝ  reason: contains not printable characters */
    public static Cipher m1636(Object obj) {
        if (C0032.m1750() <= 0) {
            return Cipher.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: حذكﺫ  reason: contains not printable characters */
    public static Set m1637(Object obj) {
        if (C0049.m2194() < 0) {
            return ((TreeMap) obj).entrySet();
        }
        return null;
    }

    /* renamed from: ديذﺡ  reason: contains not printable characters */
    public static String m1638(Object obj) {
        if (C0051.m2229() < 0) {
            return ((lm) obj).B();
        }
        return null;
    }

    /* renamed from: ذﻍﺫﻩ  reason: contains not printable characters */
    public static int m1639() {
        return 909 ^ C0002.f2;
    }

    /* renamed from: طﻝحﺡ  reason: contains not printable characters */
    public static void m1640(long j) {
        if (C0057.m2368() > 0) {
            Thread.sleep(j);
        }
    }

    /* renamed from: عﺝﻱظ  reason: contains not printable characters */
    public static String m1641(Object obj, Object obj2) {
        if (C0036.m1838() <= 0) {
            return ((Os) obj).yq((String) obj2);
        }
        return null;
    }

    /* renamed from: فحظم  reason: contains not printable characters */
    public static String m1642() {
        if (C0046.m2112() >= 0) {
            return "https://pc-api.uc.cn/1/clouddrive/file/move?pr=UCBrowser&fr=pc&uc_param_str=";
        }
        return null;
    }

    /* renamed from: فمسز  reason: contains not printable characters */
    public static String m1643(Object obj) {
        if (C0036.m1838() <= 0) {
            return ((ZI) obj).yq();
        }
        return null;
    }

    /* renamed from: قتعظ  reason: contains not printable characters */
    public static Object m1644(Object obj, Object obj2) {
        if (C0047.m2134() < 0) {
            return ((HashMap) obj).remove(obj2);
        }
        return null;
    }

    /* renamed from: يجكﻕ  reason: contains not printable characters */
    public static String m1645(String str) {
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

    /* renamed from: يﺡذﺵ  reason: contains not printable characters */
    public static String m1646() {
        if (C0054.m2295() <= 0) {
            return "请转存您需要的数据";
        }
        return null;
    }

    /* renamed from: ﺕﺎﻙس  reason: contains not printable characters */
    public static boolean m1647(Object obj) {
        if (C0006.m193() > 0) {
            return ((Inflater) obj).finished();
        }
        return false;
    }

    /* renamed from: ﺙﺥﻅﺯ  reason: contains not printable characters */
    public static void m1648(Object obj, Object obj2, Object obj3) {
        if (C0057.m2368() > 0) {
            ((RQ) obj).o((String) obj2, (List) obj3);
        }
    }

    /* renamed from: ﺝظزد  reason: contains not printable characters */
    public static int m1649(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﺫلﻩـ  reason: contains not printable characters */
    public static String m1650(Object obj, int i) {
        if (C0007.m214() < 0) {
            return Q.SN((byte[]) obj, i);
        }
        return null;
    }

    /* renamed from: ﺫنﺥو  reason: contains not printable characters */
    public static iX m1651(Object obj, Object obj2) {
        if (C0026.m1561() < 0) {
            return ((iX) obj).SN((List) obj2);
        }
        return null;
    }

    /* renamed from: ﺫﺕبر  reason: contains not printable characters */
    public static String m1652(Object obj) {
        if (C0033.m1755() <= 0) {
            return ((WN) obj).tF();
        }
        return null;
    }

    /* renamed from: ﺭﺩجق  reason: contains not printable characters */
    public static String m1653() {
        if (C0044.m2051() < 0) {
            return "1080p";
        }
        return null;
    }

    /* renamed from: ﺯﻉﻁظ  reason: contains not printable characters */
    public static List m1654(Object obj) {
        if (C0056.m2341() < 0) {
            return ((gE) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺱﺽرﻕ  reason: contains not printable characters */
    public static String m1655() {
        if (C0038.m1893() <= 0) {
            return "无效";
        }
        return null;
    }

    /* renamed from: ﺵطكو  reason: contains not printable characters */
    public static List m1656(Object obj) {
        if (C0026.m1561() < 0) {
            return BL.N((String) obj);
        }
        return null;
    }

    /* renamed from: ﻝﺏﺕش  reason: contains not printable characters */
    public static String m1657() {
        if (C0001.m25() < 0) {
            return "http";
        }
        return null;
    }

    /* renamed from: ﻝﺽاض  reason: contains not printable characters */
    public static boolean m1658(Object obj) {
        if (C0047.m2134() < 0) {
            return TextUtils.isEmpty((CharSequence) obj);
        }
        return false;
    }

    /* renamed from: ﻡطﺱب  reason: contains not printable characters */
    public static String m1659(Object obj) {
        if (C0027.m1588() >= 0) {
            return ((tX) obj).dT();
        }
        return null;
    }

    /* renamed from: ﻩﺫﺏـ  reason: contains not printable characters */
    public static void m1660(Object obj, boolean z) {
        if (C0044.m2051() <= 0) {
            ((WebSettings) obj).setDatabaseEnabled(z);
        }
    }

    /* renamed from: ﻭذﺥش  reason: contains not printable characters */
    public static Yv m1661(Object obj) {
        if (C0006.m193() > 0) {
            return ((Yv) obj).B();
        }
        return null;
    }

    /* renamed from: ﻱكعز  reason: contains not printable characters */
    public static void m1662() {
        if (C0038.m1893() <= 0) {
            ProxyOrigin.getan();
        }
    }

    /* renamed from: بﺏعي  reason: contains not printable characters */
    public static String m1635(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
