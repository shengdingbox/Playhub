package com.github.catvod.parser;

import android.app.Activity;
import android.content.Intent;
import com.github.catvod.spider.AppSx;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.merge.AbstractC0124j;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0095eF;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.HE;
import com.github.catvod.spider.merge.LP;
import com.github.catvod.spider.merge.MA;
import com.github.catvod.spider.merge.N;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.VQ;
import com.github.catvod.spider.merge.ZI;
import com.github.catvod.spider.merge.fk;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.jA;
import com.github.catvod.spider.merge.jt;
import com.github.catvod.spider.merge.tX;
import com.github.catvod.spider.merge.zH;
import java.io.ByteArrayOutputStream;
import java.nio.CharBuffer;
import java.util.zip.Inflater;
import javax.crypto.Mac;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.ﺯﻉفع  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0013 {

    /* renamed from: مﻡﻭﺫ  reason: contains not printable characters */
    public static int f13 = -203;

    /* renamed from: جﺩرﻕ  reason: contains not printable characters */
    public static String m379(Object obj) {
        if (C0049.m2194() <= 0) {
            return ((ZI) obj).Gc();
        }
        return null;
    }

    /* renamed from: ذطﺡد  reason: contains not printable characters */
    public static String m381(Object obj, Object obj2) {
        if (C0023.m1475() >= 0) {
            return ((MA) obj).N((String) obj2);
        }
        return null;
    }

    /* renamed from: شثﻉﺵ  reason: contains not printable characters */
    public static int m382() {
        return 923 ^ C0041.f99;
    }

    /* renamed from: شرسز  reason: contains not printable characters */
    public static CharBuffer m383(Object obj) {
        if (C0033.m1755() < 0) {
            return CharBuffer.wrap((char[]) obj);
        }
        return null;
    }

    /* renamed from: ضوﺫﻕ  reason: contains not printable characters */
    public static String m384() {
        if (C0047.m2134() <= 0) {
            return "@@@";
        }
        return null;
    }

    /* renamed from: ضﺽـغ  reason: contains not printable characters */
    public static Object[] m385(Object obj) {
        if (C0050.m2221() < 0) {
            return ((C0095eF) obj).tF();
        }
        return null;
    }

    /* renamed from: طﻁذي  reason: contains not printable characters */
    public static jA m386() {
        if (C0032.m1750() < 0) {
            return jA.SN;
        }
        return null;
    }

    /* renamed from: ظمﺽو  reason: contains not printable characters */
    public static N m387(Object obj) {
        if (C0053.m2279() <= 0) {
            return ((AbstractC0124j) obj).Dr();
        }
        return null;
    }

    /* renamed from: غﻅﺯص  reason: contains not printable characters */
    public static String m388(Object obj) {
        if (C0005.m152() <= 0) {
            return ((H7) obj).Nl();
        }
        return null;
    }

    /* renamed from: ـثوﺥ  reason: contains not printable characters */
    public static String m389(Object obj, Object obj2) {
        if (C0009.m276() >= 0) {
            return ((AppSx) obj).getOcrCode((String) obj2);
        }
        return null;
    }

    /* renamed from: ـهاﺝ  reason: contains not printable characters */
    public static int m390(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ـﻍرا  reason: contains not printable characters */
    public static Character m391(char c) {
        if (C0030.m1683() >= 0) {
            return Character.valueOf(c);
        }
        return null;
    }

    /* renamed from: قسﻍﻕ  reason: contains not printable characters */
    public static JSONObject m392() {
        if (C0015.m447() > 0) {
            return FO.q();
        }
        return null;
    }

    /* renamed from: مذﺩص  reason: contains not printable characters */
    public static fk m393(Object obj) {
        if (C0043.m2042() <= 0) {
            return ((LP) obj).Gc();
        }
        return null;
    }

    /* renamed from: هضﺱﻕ  reason: contains not printable characters */
    public static iX m394(Object obj, Object obj2, boolean z) {
        if (C0022.m1429() < 0) {
            return ((iX) obj).s((String) obj2, z);
        }
        return null;
    }

    /* renamed from: يتﺱﺙ  reason: contains not printable characters */
    public static String m395(String str) {
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

    /* renamed from: ﺙطصﺏ  reason: contains not printable characters */
    public static boolean m396(Object obj) {
        if (C0054.m2295() < 0) {
            return ((RQ) obj).v3;
        }
        return false;
    }

    /* renamed from: ﺡﻍشت  reason: contains not printable characters */
    public static void m397(Object obj) {
        if (C0029.m1639() >= 0) {
            ((Inflater) obj).end();
        }
    }

    /* renamed from: ﺩضزه  reason: contains not printable characters */
    public static boolean m398(Object obj, boolean z, boolean z2) {
        if (C0052.m2256() >= 0) {
            return ((V) obj).i3(z, z2);
        }
        return false;
    }

    /* renamed from: ﺫﺕطي  reason: contains not printable characters */
    public static void m399(Object obj, Object obj2) {
        if (C0021.m1415() > 0) {
            ((Activity) obj).startActivity((Intent) obj2);
        }
    }

    /* renamed from: ﺯﺏﺽث  reason: contains not printable characters */
    public static Mac m400(Object obj) {
        if (C0038.m1893() <= 0) {
            return Mac.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ﺱرﺵق  reason: contains not printable characters */
    public static boolean m401(Object obj) {
        if (C0039.m1918() <= 0) {
            return ((Inflater) obj).needsInput();
        }
        return false;
    }

    /* renamed from: ﺵﺽقص  reason: contains not printable characters */
    public static String m402(Object obj) {
        if (C0029.m1639() >= 0) {
            return ((VQ.yq) obj).N();
        }
        return null;
    }

    /* renamed from: ﺽتنث  reason: contains not printable characters */
    public static String m403(Object obj) {
        if (C0046.m2112() >= 0) {
            return ((H7) obj).zH();
        }
        return null;
    }

    /* renamed from: ﻅحﺭظ  reason: contains not printable characters */
    public static String m404(Object obj) {
        if (C0022.m1429() < 0) {
            return zH.yq((Iterable) obj);
        }
        return null;
    }

    /* renamed from: ﻉعﺵﺎ  reason: contains not printable characters */
    public static String m405() {
        if (C0005.m152() <= 0) {
            return "webdav.mkv";
        }
        return null;
    }

    /* renamed from: ﻍﺹمن  reason: contains not printable characters */
    public static void m406() {
        if (C0011.m344() >= 0) {
            HE.tF();
        }
    }

    /* renamed from: ﻭروﺥ  reason: contains not printable characters */
    public static void m407(Object obj, Object obj2) {
        if (C0043.m2042() <= 0) {
            ((tX) obj).un((String) obj2);
        }
    }

    /* renamed from: ﻱﺎـﺙ  reason: contains not printable characters */
    public static jt m408(Object obj) {
        if (C0014.m418() > 0) {
            return ((jt) obj).yq();
        }
        return null;
    }

    /* renamed from: دﺱخف  reason: contains not printable characters */
    public static String m380(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
