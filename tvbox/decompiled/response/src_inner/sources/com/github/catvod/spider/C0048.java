package com.github.catvod.spider;

import android.app.Activity;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.DC;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.ZI;
import com.github.catvod.spider.merge.aq;
import com.github.catvod.spider.merge.jt;
import com.github.catvod.spider.merge.tX;
import com.github.catvod.spider.merge.zH;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
/* renamed from: com.github.catvod.spider.صﺙزظ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0048 {

    /* renamed from: بﺙﻭي  reason: contains not printable characters */
    public static int f106 = 114;

    /* renamed from: تبرﺥ  reason: contains not printable characters */
    public static String m2137(Object obj, Object obj2) {
        if (C0009.m276() >= 0) {
            return DC.B((String) obj, (HashMap) obj2);
        }
        return null;
    }

    /* renamed from: جسدذ  reason: contains not printable characters */
    public static void m2138(Object obj, Object obj2) {
        if (C0027.m1588() > 0) {
            aq.zH(obj, (String) obj2);
        }
    }

    /* renamed from: جسﺝك  reason: contains not printable characters */
    public static jt m2139(Object obj) {
        if (C0054.m2295() <= 0) {
            return jt.zH((String) obj);
        }
        return null;
    }

    /* renamed from: دقطي  reason: contains not printable characters */
    public static int m2140() {
        return 812 ^ C0022.f80;
    }

    /* renamed from: شﺙﺵﺹ  reason: contains not printable characters */
    public static String m2141(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5) {
        if (C0021.m1415() > 0) {
            return ((RQ) obj).v3((Nh) obj2, (String) obj3, z, (String) obj4, (File) obj5);
        }
        return null;
    }

    /* renamed from: شﺱﻍو  reason: contains not printable characters */
    public static String m2142(int i) {
        if (C0010.m301() > 0) {
            return Rc.G4(i);
        }
        return null;
    }

    /* renamed from: غظﺫﻡ  reason: contains not printable characters */
    public static String m2143() {
        if (C0053.m2279() <= 0) {
            return "&__t=";
        }
        return null;
    }

    /* renamed from: فحﻝخ  reason: contains not printable characters */
    public static String m2144() {
        if (C0040.m1954() <= 0) {
            return "uc_fid";
        }
        return null;
    }

    /* renamed from: فهيﺹ  reason: contains not printable characters */
    public static String m2146(Object obj) {
        if (C0012.m378() < 0) {
            return ((ZI) obj).SN();
        }
        return null;
    }

    /* renamed from: فﺎظض  reason: contains not printable characters */
    public static void m2147(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0005.m152() <= 0) {
            ((UuSs) obj).requestWebsites((String[]) obj2, (List) obj3, (String) obj4);
        }
    }

    /* renamed from: قنﺥﺽ  reason: contains not printable characters */
    public static C0059Dl m2148(Object obj, Object obj2) {
        if (C0030.m1683() > 0) {
            return ((C0059Dl) obj).n((String) obj2);
        }
        return null;
    }

    /* renamed from: كﻭﻝق  reason: contains not printable characters */
    public static String m2149(Object obj, Object obj2, Object obj3) {
        if (C0045.m2093() > 0) {
            return zH.SN((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: لﺡتﺝ  reason: contains not printable characters */
    public static int m2150(Object obj) {
        if (C0001.m25() < 0) {
            return ((StringBuilder) obj).length();
        }
        return 0;
    }

    /* renamed from: وﻉقﺹ  reason: contains not printable characters */
    public static String m2151(long j) {
        if (C0030.m1683() >= 0) {
            return Long.toHexString(j);
        }
        return null;
    }

    /* renamed from: ﺎدرﺵ  reason: contains not printable characters */
    public static void m2152(Object obj, Object obj2) {
        if (C0057.m2368() >= 0) {
            ((H7) obj).Dr((String) obj2);
        }
    }

    /* renamed from: ﺏدتﺎ  reason: contains not printable characters */
    public static String m2153() {
        if (C0045.m2093() >= 0) {
            return "&sToken=";
        }
        return null;
    }

    /* renamed from: ﺕاجز  reason: contains not printable characters */
    public static boolean m2154(Object obj, Object obj2) {
        if (C0055.m2324() > 0) {
            return ((Pan.KeyValueData) obj).containsKey((String) obj2);
        }
        return false;
    }

    /* renamed from: ﺙﻕذﺭ  reason: contains not printable characters */
    public static String m2155(Object obj) {
        if (C0049.m2194() < 0) {
            return ((UUID) obj).toString();
        }
        return null;
    }

    /* renamed from: ﺝﺙﺎك  reason: contains not printable characters */
    public static void m2156(Object obj, Object obj2, Object obj3) {
        if (C0056.m2341() < 0) {
            ((Pan) obj).show((String) obj2, (Activity) obj3);
        }
    }

    /* renamed from: ﺫشﻭﺵ  reason: contains not printable characters */
    public static String m2157(String str) {
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

    /* renamed from: ﺭﻝﻙق  reason: contains not printable characters */
    public static StringBuilder m2158(Object obj, char c) {
        if (C0035.m1802() > 0) {
            return ((StringBuilder) obj).append(c);
        }
        return null;
    }

    /* renamed from: ﺯﻭﺹﺝ  reason: contains not printable characters */
    public static String m2159() {
        if (C0013.m382() < 0) {
            return "https://openapi.baidu.com/oauth/2.0/token?grant_type=refresh_token&refresh_token=";
        }
        return null;
    }

    /* renamed from: ﺱﺏﺙﺡ  reason: contains not printable characters */
    public static String m2160(Object obj, Object obj2) {
        if (C0021.m1415() > 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ﺵثطﺯ  reason: contains not printable characters */
    public static String m2161(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0027.m1588() > 0) {
            return ((NewCz) obj).playerContent((String) obj2, (String) obj3, (List) obj4);
        }
        return null;
    }

    /* renamed from: ﻉبﺹﺥ  reason: contains not printable characters */
    public static String m2162() {
        if (C0004.m129() <= 0) {
            return "client_key=NqOMXF6XGhGRIGemsQ9nG0Na; secret_key=SVT6xpMdLcx6v4aCR4wT8BBOTbzFO8LM; driver_txt=baiduyun_ob; server_use=false";
        }
        return null;
    }

    /* renamed from: ﻉﻍصﺙ  reason: contains not printable characters */
    public static int m2163(Object obj) {
        if (C0041.m1981() < 0) {
            return ((Process) obj).waitFor();
        }
        return 0;
    }

    /* renamed from: ﻕعطﺝ  reason: contains not printable characters */
    public static int m2164(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻕﺝﺫﻭ  reason: contains not printable characters */
    public static String m2165(Object obj) {
        if (C0044.m2051() <= 0) {
            return ((ZI) obj).tF();
        }
        return null;
    }

    /* renamed from: ﻝﺫظﻅ  reason: contains not printable characters */
    public static void m2166(Object obj, Object obj2) {
        if (C0049.m2194() <= 0) {
            ((tX) obj).n((String) obj2);
        }
    }

    /* renamed from: ﻭﺭﻡل  reason: contains not printable characters */
    public static String m2167(Object obj, Object obj2) {
        if (C0006.m193() > 0) {
            return ((WoGG) obj).refTry((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻱاصث  reason: contains not printable characters */
    public static boolean m2168(Object obj) {
        if (C0012.m378() < 0) {
            return ((Z) obj).Gd();
        }
        return false;
    }

    /* renamed from: فكرﺏ  reason: contains not printable characters */
    public static String m2145(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
