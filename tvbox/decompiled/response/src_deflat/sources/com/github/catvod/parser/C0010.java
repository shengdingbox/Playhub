package com.github.catvod.parser;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Jpys;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.C0107gJ;
import com.github.catvod.spider.merge.C0156oS;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.Db;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.RS;
import com.github.catvod.spider.merge.X0;
import com.github.catvod.spider.merge.Zc;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.هرفح  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0010 {

    /* renamed from: ـوﺱق  reason: contains not printable characters */
    public static int f10 = -522;

    /* renamed from: ازﺏع  reason: contains not printable characters */
    public static long m288(Object obj) {
        if (C0056.m2341() < 0) {
            return Long.parseLong((String) obj);
        }
        return 0L;
    }

    /* renamed from: اﻩكﺯ  reason: contains not printable characters */
    public static boolean m289(Object obj) {
        if (C0030.m1683() > 0) {
            return FO.M((String) obj);
        }
        return false;
    }

    /* renamed from: ثصـد  reason: contains not printable characters */
    public static String m290(Object obj, int i) {
        if (C0035.m1802() >= 0) {
            return ((JSONArray) obj).optString(i);
        }
        return null;
    }

    /* renamed from: ذﻙزا  reason: contains not printable characters */
    public static String m291(Object obj) {
        if (C0057.m2368() > 0) {
            return ((Db) obj).N;
        }
        return null;
    }

    /* renamed from: رﻁﺹن  reason: contains not printable characters */
    public static Intent m292(Object obj, Object obj2, Object obj3) {
        if (C0036.m1838() < 0) {
            return ((Intent) obj).setDataAndType((Uri) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: شﺭﺫج  reason: contains not printable characters */
    public static boolean m293(Object obj, Object obj2) {
        if (C0027.m1588() >= 0) {
            return ((hN) obj).p((String) obj2);
        }
        return false;
    }

    /* renamed from: ظثﻁﻉ  reason: contains not printable characters */
    public static String m294() {
        if (C0054.m2295() <= 0) {
            return "ucdrive_cookie";
        }
        return null;
    }

    /* renamed from: غﺽﻅث  reason: contains not printable characters */
    public static String m295(Object obj) {
        if (C0021.m1415() >= 0) {
            return ((Zc) obj).N();
        }
        return null;
    }

    /* renamed from: كقﺏﻝ  reason: contains not printable characters */
    public static String m297(Object obj, Object obj2) {
        if (C0014.m418() >= 0) {
            return ((tX) obj).N((String) obj2);
        }
        return null;
    }

    /* renamed from: كﻉتذ  reason: contains not printable characters */
    public static boolean m298(Object obj) {
        if (C0046.m2112() > 0) {
            return ((X0) obj).tF();
        }
        return false;
    }

    /* renamed from: لﺝحم  reason: contains not printable characters */
    public static String m299() {
        if (C0041.m1981() < 0) {
            return "模式";
        }
        return null;
    }

    /* renamed from: لﺵطخ  reason: contains not printable characters */
    public static String m300() {
        if (C0051.m2229() <= 0) {
            return C0156oS.yq();
        }
        return null;
    }

    /* renamed from: مغلذ  reason: contains not printable characters */
    public static int m301() {
        return 753 ^ C0000.f0;
    }

    /* renamed from: مﻱحﻩ  reason: contains not printable characters */
    public static String m302() {
        if (C0026.m1561() < 0) {
            return "lastQuarkDownUrl";
        }
        return null;
    }

    /* renamed from: نمغﻡ  reason: contains not printable characters */
    public static H7 m303(Object obj, Object obj2) {
        if (C0043.m2042() < 0) {
            return ((H7) obj).s((String) obj2);
        }
        return null;
    }

    /* renamed from: نﺝيب  reason: contains not printable characters */
    public static Object[] m304(Object obj, Object obj2, int i, long j, int i2) {
        if (C0027.m1588() >= 0) {
            return ((C0203xU) obj).N0((HashMap) obj2, i, j, i2);
        }
        return null;
    }

    /* renamed from: يﺥﺵﻙ  reason: contains not printable characters */
    public static Object m305(Object obj, Object obj2) {
        if (C0020.m1371() < 0) {
            return ((JSONObject) obj).opt((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺕقﻩﺝ  reason: contains not printable characters */
    public static String m306() {
        if (C0024.m1502() > 0) {
            return Jpys.getUUID();
        }
        return null;
    }

    /* renamed from: ﺱﻕعﻅ  reason: contains not printable characters */
    public static String m307() {
        if (C0053.m2279() < 0) {
            return "stoken";
        }
        return null;
    }

    /* renamed from: ﺵحسه  reason: contains not printable characters */
    public static void m308(Object obj, Object obj2) {
        if (C0013.m382() <= 0) {
            ((DateFormat) obj).setTimeZone((TimeZone) obj2);
        }
    }

    /* renamed from: ﺽﺎﻝﻡ  reason: contains not printable characters */
    public static void m309(Object obj) {
        if (C0011.m344() >= 0) {
            ((H7) obj).U();
        }
    }

    /* renamed from: ﻁجﺩـ  reason: contains not printable characters */
    public static String m310(Object obj, Object obj2, Object obj3) {
        if (C0032.m1750() < 0) {
            return RS.t0((String) obj, (Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ﻅعﺯﺩ  reason: contains not printable characters */
    public static String m311(Object obj, Object obj2) {
        if (C0045.m2093() >= 0) {
            return C0107gJ.SN((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ﻍﻱﻁظ  reason: contains not printable characters */
    public static Application m312() {
        if (C0052.m2256() > 0) {
            return InitOrigin.context();
        }
        return null;
    }

    /* renamed from: ﻕﺎتذ  reason: contains not printable characters */
    public static int m313(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻙدﻕق  reason: contains not printable characters */
    public static String m314(Object obj) {
        if (C0001.m25() <= 0) {
            return URLEncoder.encode((String) obj);
        }
        return null;
    }

    /* renamed from: ﻙيقﺵ  reason: contains not printable characters */
    public static String m315(String str) {
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

    /* renamed from: ﻝهاﻁ  reason: contains not printable characters */
    public static JSONArray m316(Object obj, Object obj2) {
        if (C0052.m2256() >= 0) {
            return ((JSONObject) obj).getJSONArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻝﺡﻱل  reason: contains not printable characters */
    public static List m317(Object obj) {
        if (C0014.m418() >= 0) {
            return Nh.yq((String) obj);
        }
        return null;
    }

    /* renamed from: ﻝﺭﻅﺏ  reason: contains not printable characters */
    public static String m318(Object obj, Object obj2) {
        if (C0025.m1534() < 0) {
            return ((C0203xU) obj).b((tX) obj2);
        }
        return null;
    }

    /* renamed from: ﻩخفﺱ  reason: contains not printable characters */
    public static C0059Dl m319(Object obj) {
        if (C0008.m250() > 0) {
            return C0059Dl.s((String) obj);
        }
        return null;
    }

    /* renamed from: ﻭخﺹﻉ  reason: contains not printable characters */
    public static String m320() {
        if (C0055.m2324() > 0) {
            return "ut-";
        }
        return null;
    }

    /* renamed from: ﻱـﻭﺩ  reason: contains not printable characters */
    public static ByteBuffer m321(Object obj, Object obj2) {
        if (C0034.m1793() < 0) {
            return ((Charset) obj).encode((CharBuffer) obj2);
        }
        return null;
    }

    /* renamed from: ﻱﻙﻩد  reason: contains not printable characters */
    public static ClassLoader m322(Object obj) {
        if (C0009.m276() >= 0) {
            return ((Thread) obj).getContextClassLoader();
        }
        return null;
    }

    /* renamed from: قتيـ  reason: contains not printable characters */
    public static String m296(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
