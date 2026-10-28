package com.github.catvod.parser;

import android.net.Uri;
import android.webkit.WebSettings;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0107gJ;
import com.github.catvod.spider.merge.FA;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.ZI;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.lm;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.ـظﻍﻅ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0008 {

    /* renamed from: قحﺱغ  reason: contains not printable characters */
    public static int f8 = 768;

    /* renamed from: بـطج  reason: contains not printable characters */
    public static boolean m230(Object obj, Object obj2) {
        if (C0023.m1475() >= 0) {
            return ((V) obj).v3((String) obj2);
        }
        return false;
    }

    /* renamed from: توﺕﺝ  reason: contains not printable characters */
    public static int m231(Object obj) {
        if (C0048.m2140() <= 0) {
            return ((ArrayList) obj).size();
        }
        return 0;
    }

    /* renamed from: ثﺕهﺡ  reason: contains not printable characters */
    public static void m232(Object obj, Object obj2) {
        if (C0042.m1998() < 0) {
            ((Nh) obj).Zm((String) obj2);
        }
    }

    /* renamed from: حانث  reason: contains not printable characters */
    public static iX m233(Object obj, Object obj2) {
        if (C0042.m1998() < 0) {
            return ((iX) obj).N((String) obj2);
        }
        return null;
    }

    /* renamed from: رشﻱﺎ  reason: contains not printable characters */
    public static String m234(Object obj, Object obj2) {
        if (C0009.m276() > 0) {
            return C0107gJ.yq((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: زفﻝﻙ  reason: contains not printable characters */
    public static void m235(Object obj) {
        if (C0026.m1561() < 0) {
            ((Z) obj).g1();
        }
    }

    /* renamed from: زﺵﺭﻕ  reason: contains not printable characters */
    public static String m236(Object obj) {
        if (C0054.m2295() < 0) {
            return ((Z) obj).F5;
        }
        return null;
    }

    /* renamed from: سزﻅق  reason: contains not printable characters */
    public static JSONObject m237(Object obj, int i) {
        if (C0004.m129() <= 0) {
            return ((JSONArray) obj).optJSONObject(i);
        }
        return null;
    }

    /* renamed from: شذﻉض  reason: contains not printable characters */
    public static String m238() {
        if (C0032.m1750() < 0) {
            return "来自分享";
        }
        return null;
    }

    /* renamed from: طكﻉو  reason: contains not printable characters */
    public static iX m239(Object obj) {
        if (C0034.m1793() < 0) {
            return ((iX) obj).zH();
        }
        return null;
    }

    /* renamed from: فﺡﺵﺕ  reason: contains not printable characters */
    public static String m241(Object obj) {
        if (C0041.m1981() < 0) {
            return ((ZI) obj).i();
        }
        return null;
    }

    /* renamed from: متطص  reason: contains not printable characters */
    public static String m242(Object obj) {
        if (C0035.m1802() > 0) {
            return ((hN) obj).kR();
        }
        return null;
    }

    /* renamed from: هﺡﻕم  reason: contains not printable characters */
    public static RQ m243() {
        if (C0007.m214() <= 0) {
            return RQ.xa();
        }
        return null;
    }

    /* renamed from: هﺹﺭﺱ  reason: contains not printable characters */
    public static char m244(Object obj, int i) {
        if (C0029.m1639() > 0) {
            return ((String) obj).charAt(i);
        }
        return (char) 0;
    }

    /* renamed from: وﺕاﻭ  reason: contains not printable characters */
    public static void m245(Object obj, Object obj2) {
        if (C0023.m1475() >= 0) {
            ((tX) obj).b((String) obj2);
        }
    }

    /* renamed from: وﻅﺩﻁ  reason: contains not printable characters */
    public static String m246(Object obj) {
        if (C0057.m2368() > 0) {
            return ((Throwable) obj).getMessage();
        }
        return null;
    }

    /* renamed from: وﻕﺫﻩ  reason: contains not printable characters */
    public static String m247() {
        if (m250() > 0) {
            return "md5";
        }
        return null;
    }

    /* renamed from: يﻝﻍﺫ  reason: contains not printable characters */
    public static String m248() {
        if (C0010.m301() > 0) {
            return "__pus";
        }
        return null;
    }

    /* renamed from: ﺎفﻭز  reason: contains not printable characters */
    public static String m249(String str) {
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

    /* renamed from: ﺕثخن  reason: contains not printable characters */
    public static int m250() {
        return 706 ^ C0003.f3;
    }

    /* renamed from: ﺩﻡجﻁ  reason: contains not printable characters */
    public static ME.yq m251() {
        if (C0030.m1683() >= 0) {
            return ME.yq.yq();
        }
        return null;
    }

    /* renamed from: ﺫﺕدﻅ  reason: contains not printable characters */
    public static Future m252(Object obj, Object obj2) {
        if (C0057.m2368() >= 0) {
            return ((ExecutorCompletionService) obj).submit((Callable) obj2);
        }
        return null;
    }

    /* renamed from: ﺭﻉحﺡ  reason: contains not printable characters */
    public static List m253(Object obj) {
        if (C0001.m25() < 0) {
            return ((lm) obj).N();
        }
        return null;
    }

    /* renamed from: ﺽﺕنﺝ  reason: contains not printable characters */
    public static String m254(Object obj) {
        if (C0025.m1534() < 0) {
            return ((FA) obj).N();
        }
        return null;
    }

    /* renamed from: ﻁفسﻕ  reason: contains not printable characters */
    public static void m255(Object obj, Object obj2) {
        if (C0034.m1793() < 0) {
            ((ME) obj).G((String) obj2);
        }
    }

    /* renamed from: ﻁﻙﺭج  reason: contains not printable characters */
    public static Uri.Builder m256(Object obj, Object obj2) {
        if (C0043.m2042() < 0) {
            return ((Uri.Builder) obj).scheme((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻡقدس  reason: contains not printable characters */
    public static int m257(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻭﻙجﻅ  reason: contains not printable characters */
    public static void m258(Object obj, boolean z) {
        if (C0036.m1838() < 0) {
            ((WebSettings) obj).setJavaScriptEnabled(z);
        }
    }

    /* renamed from: فﺝﺏﻕ  reason: contains not printable characters */
    public static String m240(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
