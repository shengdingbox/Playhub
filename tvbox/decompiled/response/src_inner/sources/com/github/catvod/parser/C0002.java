package com.github.catvod.parser;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.C0065Ku;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.IL;
import com.github.catvod.spider.merge.LP;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.VQ;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.ZI;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.خﻉﺝﻍ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0002 {

    /* renamed from: صظثق  reason: contains not printable characters */
    public static int f2 = 318;

    /* renamed from: تﺥﺩذ  reason: contains not printable characters */
    public static String m54(Object obj) {
        if (C0026.m1561() <= 0) {
            return ((H7) obj).B();
        }
        return null;
    }

    /* renamed from: ثزحﻱ  reason: contains not printable characters */
    public static String m55(Object obj) {
        if (C0010.m301() > 0) {
            return ((IL) obj).N();
        }
        return null;
    }

    /* renamed from: ثﻱﺡه  reason: contains not printable characters */
    public static AlertDialog.Builder m56(Object obj, Object obj2) {
        if (C0022.m1429() <= 0) {
            return ((AlertDialog.Builder) obj).setOnCancelListener((DialogInterface.OnCancelListener) obj2);
        }
        return null;
    }

    /* renamed from: حﺭيﻕ  reason: contains not printable characters */
    public static String m58(Object obj, Object obj2) {
        if (C0020.m1371() <= 0) {
            return AppYsV2.xiaFanSign((Map) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: خﺹوﺏ  reason: contains not printable characters */
    public static long m59(Object obj) {
        if (C0049.m2194() < 0) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    /* renamed from: دبوﻉ  reason: contains not printable characters */
    public static int m60() {
        return (-732) ^ f2;
    }

    /* renamed from: دﻙﻭﺩ  reason: contains not printable characters */
    public static JSONObject m61() {
        if (C0012.m378() <= 0) {
            return FO.g9();
        }
        return null;
    }

    /* renamed from: غطرﺫ  reason: contains not printable characters */
    public static void m62(Object obj) {
        if (C0015.m447() >= 0) {
            ((RQ) obj).Hj();
        }
    }

    /* renamed from: ـﺱكﺭ  reason: contains not printable characters */
    public static String m63() {
        if (C0056.m2341() <= 0) {
            return "$$$";
        }
        return null;
    }

    /* renamed from: قبصﻍ  reason: contains not printable characters */
    public static List m64(Object obj) {
        if (C0035.m1802() >= 0) {
            return H7.yq((String) obj);
        }
        return null;
    }

    /* renamed from: قﺯلﻉ  reason: contains not printable characters */
    public static String m65(Object obj) {
        if (C0011.m344() > 0) {
            return ((URL) obj).getProtocol();
        }
        return null;
    }

    /* renamed from: لﺹﺝز  reason: contains not printable characters */
    public static byte[] m66(Object obj) {
        if (C0024.m1502() > 0) {
            return ((MessageDigest) obj).digest();
        }
        return null;
    }

    /* renamed from: نطضﻝ  reason: contains not printable characters */
    public static void m67(Object obj, Object obj2) {
        if (C0053.m2279() < 0) {
            ((C0059Dl) obj).g((String) obj2);
        }
    }

    /* renamed from: ﺙداﻙ  reason: contains not printable characters */
    public static String m68(Object obj) {
        if (C0003.m81() > 0) {
            return ((H7) obj).g9();
        }
        return null;
    }

    /* renamed from: ﺭﺏﻉﻱ  reason: contains not printable characters */
    public static String m69(Object obj) {
        if (C0021.m1415() >= 0) {
            return ((ZI) obj).t0();
        }
        return null;
    }

    /* renamed from: ﺹﺱقغ  reason: contains not printable characters */
    public static List m70(Object obj) {
        if (C0036.m1838() < 0) {
            return ((Z) obj).E1();
        }
        return null;
    }

    /* renamed from: ﻁـذو  reason: contains not printable characters */
    public static void m71(Object obj) {
        if (C0034.m1793() <= 0) {
            ((SharedPreferences.Editor) obj).apply();
        }
    }

    /* renamed from: ﻉنﺎض  reason: contains not printable characters */
    public static String m72(String str) {
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

    /* renamed from: ﻉﻩﻁق  reason: contains not printable characters */
    public static String m73(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0047.m2134() < 0) {
            return ((C0203xU) obj).XO((tX) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ﻙذسﺩ  reason: contains not printable characters */
    public static String m74() {
        if (C0021.m1415() >= 0) {
            return "share";
        }
        return null;
    }

    /* renamed from: ﻙوضز  reason: contains not printable characters */
    public static LP m75(Object obj) {
        if (C0052.m2256() >= 0) {
            return ((VQ) obj).yq();
        }
        return null;
    }

    /* renamed from: ﻝرلط  reason: contains not printable characters */
    public static int m76(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻩذفﺽ  reason: contains not printable characters */
    public static Bitmap m77(Object obj, int i, int i2) {
        if (C0003.m81() > 0) {
            return BitmapFactory.decodeByteArray((byte[]) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ﻩغﻡع  reason: contains not printable characters */
    public static void m78(Object obj, Object obj2) {
        if (C0022.m1429() <= 0) {
            C0065Ku.i((String) obj, obj2);
        }
    }

    /* renamed from: ﻭهﻍص  reason: contains not printable characters */
    public static List m79(Object obj) {
        if (C0044.m2051() < 0) {
            return ((LP) obj).SN();
        }
        return null;
    }

    /* renamed from: جﻕﺏش  reason: contains not printable characters */
    public static String m57(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
