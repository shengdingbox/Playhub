package com.github.catvod.parser;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.FA;
import com.github.catvod.spider.merge.LP;
import com.github.catvod.spider.merge.RO;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.X0;
import com.github.catvod.spider.merge.Yv;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.Zc;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.lm;
import com.github.catvod.spider.merge.n6;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.ضفﺭﺩ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0006 {

    /* renamed from: ﺫﺯﺩﺭ  reason: contains not printable characters */
    public static int f6 = 717;

    /* renamed from: صبزﻙ  reason: contains not printable characters */
    public static String m181() {
        if (C0042.m1998() < 0) {
            return ".";
        }
        return null;
    }

    /* renamed from: ضظـغ  reason: contains not printable characters */
    public static String m182(Object obj) {
        if (C0030.m1683() > 0) {
            return ((Yv) obj).SN();
        }
        return null;
    }

    /* renamed from: ضوﺥﺫ  reason: contains not printable characters */
    public static List m183() {
        if (C0015.m447() >= 0) {
            return Collections.emptyList();
        }
        return null;
    }

    /* renamed from: ظﺥهد  reason: contains not printable characters */
    public static String m184(String str) {
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

    /* renamed from: عﺱﺝﻱ  reason: contains not printable characters */
    public static long m185(Object obj, Object obj2, long j) {
        if (C0034.m1793() <= 0) {
            return ((SharedPreferences) obj).getLong((String) obj2, j);
        }
        return 0L;
    }

    /* renamed from: قﺹﻕﻡ  reason: contains not printable characters */
    public static gU m186(Object obj, Object obj2) {
        if (C0005.m152() < 0) {
            return ((gU) obj).SN((String) obj2);
        }
        return null;
    }

    /* renamed from: كﺎﺱﻙ  reason: contains not printable characters */
    public static boolean m187(Object obj) {
        if (C0028.m1612() < 0) {
            return ((Yv) obj).KJ();
        }
        return false;
    }

    /* renamed from: مفضع  reason: contains not printable characters */
    public static JSONObject m188(Object obj, Object obj2) {
        if (C0048.m2140() < 0) {
            return ((JSONObject) obj).getJSONObject((String) obj2);
        }
        return null;
    }

    /* renamed from: نغصﺩ  reason: contains not printable characters */
    public static String m189(Object obj) {
        if (C0032.m1750() < 0) {
            return ((FA) obj).i();
        }
        return null;
    }

    /* renamed from: هـﻙك  reason: contains not printable characters */
    public static String m190(Object obj) {
        if (C0013.m382() < 0) {
            return ((tX) obj).Nl();
        }
        return null;
    }

    /* renamed from: ﺕجﻡﻭ  reason: contains not printable characters */
    public static String m191(Object obj) {
        if (C0038.m1893() < 0) {
            return ((RO) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺥﺱمﺽ  reason: contains not printable characters */
    public static int m192(Object obj, Object obj2, int i) {
        if (C0012.m378() <= 0) {
            return ((JSONObject) obj).optInt((String) obj2, i);
        }
        return 0;
    }

    /* renamed from: ﺩﺯبت  reason: contains not printable characters */
    public static int m193() {
        return (-193) ^ C0041.f99;
    }

    /* renamed from: ﺫﺥفﻩ  reason: contains not printable characters */
    public static void m194(Object obj) {
        if (C0021.m1415() > 0) {
            InitOrigin.show((String) obj);
        }
    }

    /* renamed from: ﺯغﻕم  reason: contains not printable characters */
    public static String m195(Object obj, Object obj2) {
        if (C0000.m13() >= 0) {
            return ((Pan.KeyValueData) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺱﻅنت  reason: contains not printable characters */
    public static String m196(Object obj) {
        if (C0005.m152() <= 0) {
            return ((n6) obj).N();
        }
        return null;
    }

    /* renamed from: ﺵثطﺯ  reason: contains not printable characters */
    public static String m197(Object obj) {
        if (C0045.m2093() >= 0) {
            return ((lm) obj).KJ();
        }
        return null;
    }

    /* renamed from: ﺹرﺭل  reason: contains not printable characters */
    public static void m198(Object obj, Object obj2) {
        if (C0012.m378() <= 0) {
            ((WebView) obj).setWebViewClient((WebViewClient) obj2);
        }
    }

    /* renamed from: ﺽﺏفق  reason: contains not printable characters */
    public static String m199(Object obj) {
        if (C0000.m13() > 0) {
            return ((X0) obj).SN();
        }
        return null;
    }

    /* renamed from: ﻅطﻭت  reason: contains not printable characters */
    public static Set m200(Object obj) {
        if (C0028.m1612() < 0) {
            return ((LinkedHashMap) obj).keySet();
        }
        return null;
    }

    /* renamed from: ﻍظمع  reason: contains not printable characters */
    public static String m201() {
        if (m193() >= 0) {
            return "/#";
        }
        return null;
    }

    /* renamed from: ﻕثين  reason: contains not printable characters */
    public static void m202(Object obj, Object obj2) {
        if (C0036.m1838() < 0) {
            ((RQ) obj).ee((JSONObject) obj2);
        }
    }

    /* renamed from: ﻝضزﻡ  reason: contains not printable characters */
    public static void m203(Object obj) {
        if (C0038.m1893() < 0) {
            ((Z) obj).x();
        }
    }

    /* renamed from: ﻩعيق  reason: contains not printable characters */
    public static Zc m204(Object obj) {
        if (C0024.m1502() >= 0) {
            return ((LP) obj).tF();
        }
        return null;
    }

    /* renamed from: ﻩهغﺹ  reason: contains not printable characters */
    public static SharedPreferences m205(Object obj, Object obj2, int i) {
        if (C0054.m2295() <= 0) {
            return ((Context) obj).getSharedPreferences((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ﻱظﺹو  reason: contains not printable characters */
    public static int m206(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: شعﺙق  reason: contains not printable characters */
    public static String m180(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
