package com.github.catvod.parser;

import android.os.Build;
import android.os.Environment;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.Tingshu275;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.eb;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.kp;
import com.github.catvod.spider.merge.tX;
import com.github.catvod.spider.merge.yF;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.ﺩدوح  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0012 {

    /* renamed from: ذفﻍﻩ  reason: contains not printable characters */
    public static int f12 = -101;

    /* renamed from: اﺫﺭح  reason: contains not printable characters */
    public static String m355() {
        if (C0004.m129() < 0) {
            return Build.HARDWARE;
        }
        return null;
    }

    /* renamed from: ثصلش  reason: contains not printable characters */
    public static void m356(Object obj) {
        if (C0042.m1998() < 0) {
            ((List) obj).clear();
        }
    }

    /* renamed from: شﻡﺩغ  reason: contains not printable characters */
    public static void m357(Object obj, Object obj2) {
        if (C0054.m2295() <= 0) {
            ((H7) obj).Zm((String) obj2);
        }
    }

    /* renamed from: طﻭﺭﺽ  reason: contains not printable characters */
    public static String m358() {
        if (C0037.m1870() >= 0) {
            return "选择支持的WEBDAV服务的播放器";
        }
        return null;
    }

    /* renamed from: طﻭﺱﻁ  reason: contains not printable characters */
    public static gU m359(Object obj, Object obj2) {
        if (C0045.m2093() >= 0) {
            return ((gU) obj).N((String) obj2);
        }
        return null;
    }

    /* renamed from: ظزصﻱ  reason: contains not printable characters */
    public static void m360(Object obj, Object obj2) {
        if (C0011.m344() >= 0) {
            ((C0059Dl) obj).H((String) obj2);
        }
    }

    /* renamed from: لﺕوظ  reason: contains not printable characters */
    public static String m362(String str) {
        String str2 = "";
        String str3 = "";
        for (int i = 0; i < 15; i++) {
            str2 = new StringBuffer().append(str2).append(Integer.toHexString(i)).toString();
            str3 = new StringBuffer().append(str3).append(((int) (Math.random() * 10)) ^ i).toString();
        }
        do {
        } while (str2.length() > 0);
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
        return new String(byteArray);
    }

    /* renamed from: لﻩﺫﻕ  reason: contains not printable characters */
    public static void m363(Object obj, Object obj2) {
        if (C0041.m1981() < 0) {
            ((Nh) obj).g((String) obj2);
        }
    }

    /* renamed from: يﻝاـ  reason: contains not printable characters */
    public static void m364(Object obj, Object obj2, Object obj3) {
        if (C0047.m2134() <= 0) {
            eb.t0((JSONArray) obj, (JSONObject) obj2, (String) obj3);
        }
    }

    /* renamed from: ﺏظﻝﺫ  reason: contains not printable characters */
    public static String m365(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5) {
        if (C0054.m2295() <= 0) {
            return ((C0203xU) obj).xa((tX) obj2, (String) obj3, z, (String) obj4, (File) obj5);
        }
        return null;
    }

    /* renamed from: ﺕﺥﺹح  reason: contains not printable characters */
    public static UUID m366() {
        if (C0010.m301() >= 0) {
            return UUID.randomUUID();
        }
        return null;
    }

    /* renamed from: ﺭصبﻱ  reason: contains not printable characters */
    public static String m367(Object obj, Object obj2, Object obj3) {
        if (C0026.m1561() < 0) {
            return ((Tingshu275) obj).searchContent((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﺱﻱتﻝ  reason: contains not printable characters */
    public static String m368(Object obj, char c, char c2) {
        if (C0021.m1415() > 0) {
            return ((String) obj).replace(c, c2);
        }
        return null;
    }

    /* renamed from: ﺵخدل  reason: contains not printable characters */
    public static void m369(Object obj, Object obj2) {
        if (C0002.m60() < 0) {
            ((C0059Dl) obj).b((String) obj2);
        }
    }

    /* renamed from: ﺽمﺭو  reason: contains not printable characters */
    public static void m370(Object obj, int i, Object obj2) {
        if (C0043.m2042() < 0) {
            ((ArrayList) obj).add(i, obj2);
        }
    }

    /* renamed from: ﺽﻡﻍﺹ  reason: contains not printable characters */
    public static int m371(Object obj) {
        if (C0023.m1475() > 0) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* renamed from: ﻁزغﺙ  reason: contains not printable characters */
    public static String m372(Object obj) {
        if (C0021.m1415() >= 0) {
            return ((Nh) obj).B();
        }
        return null;
    }

    /* renamed from: ﻅﺽﺹﺵ  reason: contains not printable characters */
    public static void m373(Object obj) {
        if (C0034.m1793() < 0) {
            yF.SN((List) obj);
        }
    }

    /* renamed from: ﻉضصﺽ  reason: contains not printable characters */
    public static int m374(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻕﺎﺱع  reason: contains not printable characters */
    public static File m375() {
        if (C0001.m25() < 0) {
            return Environment.getExternalStorageDirectory();
        }
        return null;
    }

    /* renamed from: ﻙجغﻡ  reason: contains not printable characters */
    public static void m376(Object obj, Object obj2) {
        if (C0013.m382() <= 0) {
            ((kp) obj).G4((String) obj2);
        }
    }

    /* renamed from: ﻡضشز  reason: contains not printable characters */
    public static void m377(Object obj, Object obj2) {
        if (C0030.m1683() > 0) {
            ((tX) obj).Fz((String) obj2);
        }
    }

    /* renamed from: ﻡﻩﻱا  reason: contains not printable characters */
    public static int m378() {
        return (-404) ^ C0021.f79;
    }

    /* renamed from: ظﺩﺏك  reason: contains not printable characters */
    public static String m361(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
