package com.github.catvod.spider;

import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.HE;
import com.github.catvod.spider.merge.M4;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.Q6;
import com.github.catvod.spider.merge.RS;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.ZI;
import com.github.catvod.spider.merge.by;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kp;
import com.github.catvod.spider.merge.w2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.ﺎوخي  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0052 {

    /* renamed from: دﻙاخ  reason: contains not printable characters */
    public static int f110 = -926;

    /* renamed from: اﺕﺹـ  reason: contains not printable characters */
    public static JSONObject m2244() {
        if (C0001.m25() < 0) {
            return FO.dT();
        }
        return null;
    }

    /* renamed from: بﻩﺎﺩ  reason: contains not printable characters */
    public static JSONArray m2245(Object obj, int i) {
        if (C0051.m2229() < 0) {
            return ((JSONArray) obj).put(i);
        }
        return null;
    }

    /* renamed from: تنحه  reason: contains not printable characters */
    public static String m2246() {
        if (C0009.m276() > 0) {
            return "fid";
        }
        return null;
    }

    /* renamed from: حﻩهـ  reason: contains not printable characters */
    public static void m2247(Object obj, Object obj2) {
        if (C0053.m2279() < 0) {
            ((Nh) obj).b((String) obj2);
        }
    }

    /* renamed from: دجهي  reason: contains not printable characters */
    public static File m2248(Object obj) {
        if (C0036.m1838() < 0) {
            return M4.SN((String) obj);
        }
        return null;
    }

    /* renamed from: سخفب  reason: contains not printable characters */
    public static Boolean m2249() {
        if (C0003.m81() >= 0) {
            return HE.yq();
        }
        return null;
    }

    /* renamed from: صﻝغز  reason: contains not printable characters */
    public static kp m2250(Object obj) {
        if (C0032.m1750() < 0) {
            return ((C0203xU) obj).F5;
        }
        return null;
    }

    /* renamed from: ضﻱطﻅ  reason: contains not printable characters */
    public static String m2251() {
        if (C0034.m1793() < 0) {
            return "download_url";
        }
        return null;
    }

    /* renamed from: فﻙذﻝ  reason: contains not printable characters */
    public static void m2252(Object obj, Object obj2) {
        if (C0020.m1371() < 0) {
            ((Z) obj).s((JSONObject) obj2);
        }
    }

    /* renamed from: كﺵﻅﺽ  reason: contains not printable characters */
    public static StringBuilder m2253(Object obj) {
        if (C0057.m2368() > 0) {
            return by.yq((String) obj);
        }
        return null;
    }

    /* renamed from: مطﺝز  reason: contains not printable characters */
    public static kp m2254(Object obj) {
        if (C0014.m418() >= 0) {
            return kp.Gc((String) obj);
        }
        return null;
    }

    /* renamed from: نفجب  reason: contains not printable characters */
    public static String m2255(Object obj) {
        if (C0001.m25() <= 0) {
            return ((Q6) obj).toString();
        }
        return null;
    }

    /* renamed from: نﺵﺙﻍ  reason: contains not printable characters */
    public static int m2256() {
        return (-821) ^ C0025.f83;
    }

    /* renamed from: يكطﻍ  reason: contains not printable characters */
    public static String m2257(Object obj) {
        if (C0032.m1750() <= 0) {
            return ((w2) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺕخيز  reason: contains not printable characters */
    public static int m2258(Object obj, Object obj2) {
        if (C0026.m1561() <= 0) {
            return ((JSONObject) obj).optInt((String) obj2);
        }
        return 0;
    }

    /* renamed from: ﺩضﺵك  reason: contains not printable characters */
    public static int m2259(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﺩﺙﺽص  reason: contains not printable characters */
    public static int m2260(Object obj, Object obj2) {
        if (C0050.m2221() < 0) {
            return ((JSONObject) obj).getInt((String) obj2);
        }
        return 0;
    }

    /* renamed from: ﺵهﻩﻉ  reason: contains not printable characters */
    public static iX m2262() {
        if (C0011.m344() >= 0) {
            return iX.Gc();
        }
        return null;
    }

    /* renamed from: ﺵﻝﺥي  reason: contains not printable characters */
    public static JSONObject m2263(Object obj, Object obj2) {
        if (C0040.m1954() < 0) {
            return RS.N((String) obj, (HashMap) obj2);
        }
        return null;
    }

    /* renamed from: ﻉﺫﻕﻅ  reason: contains not printable characters */
    public static ME m2264(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0001.m25() <= 0) {
            return ((H7) obj).xa((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ﻍﺯﺽﺵ  reason: contains not printable characters */
    public static Object[] m2265(Object obj, Object obj2, int i, long j, int i2) {
        if (C0024.m1502() >= 0) {
            return ((V) obj).Zm((HashMap) obj2, i, j, i2);
        }
        return null;
    }

    /* renamed from: ﻙنكﺭ  reason: contains not printable characters */
    public static String m2266(Object obj) {
        if (C0053.m2279() <= 0) {
            return Rc.zH((String) obj);
        }
        return null;
    }

    /* renamed from: ﻝجﺱﺭ  reason: contains not printable characters */
    public static String m2267(Object obj, Object obj2, int i) {
        if (C0006.m193() >= 0) {
            return C0068Pe.v((String) obj, (Map) obj2, i);
        }
        return null;
    }

    /* renamed from: ﻡﺵﻁﻅ  reason: contains not printable characters */
    public static String m2268() {
        if (C0010.m301() > 0) {
            return "videoLength";
        }
        return null;
    }

    /* renamed from: ﻩﺫﺏـ  reason: contains not printable characters */
    public static String m2269(String str) {
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

    /* renamed from: ﻭخﺹﻉ  reason: contains not printable characters */
    public static String m2270(Object obj) {
        if (C0033.m1755() < 0) {
            return ((ZI) obj).q();
        }
        return null;
    }

    /* renamed from: ﻱﺙـﺹ  reason: contains not printable characters */
    public static String m2271() {
        if (C0041.m1981() <= 0) {
            return "android.intent.action.VIEW";
        }
        return null;
    }

    /* renamed from: ﺱقنز  reason: contains not printable characters */
    public static String m2261(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
