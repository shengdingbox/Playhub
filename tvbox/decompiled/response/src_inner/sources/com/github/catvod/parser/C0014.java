package com.github.catvod.parser;

import android.app.AlertDialog;
import android.os.Build;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.C0065Ku;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.M4;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.OM;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.kp;
import com.github.catvod.spider.merge.lm;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* renamed from: com.github.catvod.parser.ﺽﺭﺵﻱ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0014 {

    /* renamed from: يﻩﺱن  reason: contains not printable characters */
    public static int f14 = 574;

    /* renamed from: اﺏقﻡ  reason: contains not printable characters */
    public static String m409(Object obj) {
        if (C0012.m378() <= 0) {
            return ((kp) obj).zH();
        }
        return null;
    }

    /* renamed from: تطوظ  reason: contains not printable characters */
    public static String m410(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str3.charAt((-1) % length2));
        }
        for (int i3 = 0; i3 < byteArray.length; i3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: حﻕزﻉ  reason: contains not printable characters */
    public static List m411(Object obj) {
        if (C0009.m276() >= 0) {
            return ((RQ) obj).Dr();
        }
        return null;
    }

    /* renamed from: خغشب  reason: contains not printable characters */
    public static kp m412(Object obj) {
        if (C0057.m2368() > 0) {
            return ((kp) obj).M();
        }
        return null;
    }

    /* renamed from: ذﻙﺭﻝ  reason: contains not printable characters */
    public static Iterator m413(Object obj) {
        if (C0033.m1755() < 0) {
            return ((Set) obj).iterator();
        }
        return null;
    }

    /* renamed from: ذﻙﻅﻕ  reason: contains not printable characters */
    public static void m414(Object obj, Object obj2) {
        if (C0024.m1502() > 0) {
            ((ME) obj).v3((String) obj2);
        }
    }

    /* renamed from: زثﻩس  reason: contains not printable characters */
    public static AlertDialog.Builder m415(Object obj, Object obj2) {
        if (C0038.m1893() <= 0) {
            return ((AlertDialog.Builder) obj).setTitle((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: زﻙﺡف  reason: contains not printable characters */
    public static String m416(Object obj) {
        if (C0047.m2134() <= 0) {
            return ((lm) obj).t0();
        }
        return null;
    }

    /* renamed from: سصضﻍ  reason: contains not printable characters */
    public static void m417() {
        if (C0055.m2324() >= 0) {
            InitOrigin.stopShowingToast();
        }
    }

    /* renamed from: شﻙفﻁ  reason: contains not printable characters */
    public static int m418() {
        return 354 ^ C0026.f84;
    }

    /* renamed from: ضحرش  reason: contains not printable characters */
    public static String m419(Object obj, Object obj2) {
        if (C0008.m250() > 0) {
            return C0065Ku.zH((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ضسحﻉ  reason: contains not printable characters */
    public static String m420(Object obj) {
        if (C0007.m214() < 0) {
            return ((Nh) obj).Gc();
        }
        return null;
    }

    /* renamed from: كسيﻍ  reason: contains not printable characters */
    public static int m422(Object obj) {
        if (C0044.m2051() <= 0) {
            return ((AbstractCollection) obj).size();
        }
        return 0;
    }

    /* renamed from: لهﺏط  reason: contains not printable characters */
    public static String m423() {
        if (C0040.m1954() < 0) {
            return Build.ID;
        }
        return null;
    }

    /* renamed from: نﺝﺎﺯ  reason: contains not printable characters */
    public static void m424(Object obj) {
        if (C0020.m1371() < 0) {
            ((C0059Dl) obj).Dr();
        }
    }

    /* renamed from: وطﺽﺡ  reason: contains not printable characters */
    public static String m425() {
        if (C0039.m1918() < 0) {
            return "application/oct-stream";
        }
        return null;
    }

    /* renamed from: وﻭﺵﺫ  reason: contains not printable characters */
    public static String m426(Object obj, Object obj2, Object obj3) {
        if (C0029.m1639() > 0) {
            return ((C0203xU) obj).V((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: يطﻩص  reason: contains not printable characters */
    public static String m427() {
        if (C0020.m1371() <= 0) {
            return "设置UT成功";
        }
        return null;
    }

    /* renamed from: ﺕـظﻱ  reason: contains not printable characters */
    public static String m428(Object obj, Object obj2, Object obj3) {
        if (C0007.m214() < 0) {
            return ((C0203xU) obj).j((tX) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﺡـﺽﺵ  reason: contains not printable characters */
    public static void m429(Object obj, Object obj2) {
        if (C0039.m1918() < 0) {
            ((OM) obj).M((String) obj2);
        }
    }

    /* renamed from: ﺡﺏﺩب  reason: contains not printable characters */
    public static int m430() {
        if (C0006.m193() > 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* renamed from: ﺭﻝﺱر  reason: contains not printable characters */
    public static String m431(Object obj) {
        if (C0010.m301() >= 0) {
            return ((kp) obj).N();
        }
        return null;
    }

    /* renamed from: ﺯظﺽﺙ  reason: contains not printable characters */
    public static void m432(Object obj, Object obj2) {
        if (C0042.m1998() <= 0) {
            M4.i((File) obj, (String) obj2);
        }
    }

    /* renamed from: ﺯعﺥف  reason: contains not printable characters */
    public static void m433(Object obj, Object obj2) {
        if (C0024.m1502() > 0) {
            ((Nh) obj).n((String) obj2);
        }
    }

    /* renamed from: ﺹﺭهﻉ  reason: contains not printable characters */
    public static kB m434(Object obj, Object obj2) {
        if (C0047.m2134() <= 0) {
            return ((hN) obj).cS((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺽﻍتع  reason: contains not printable characters */
    public static Iterator m435(Object obj) {
        if (C0057.m2368() >= 0) {
            return ((List) obj).iterator();
        }
        return null;
    }

    /* renamed from: ﻍضﻡو  reason: contains not printable characters */
    public static int m436(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻕثذم  reason: contains not printable characters */
    public static File m437(Object obj) {
        if (C0034.m1793() < 0) {
            return ((RQ) obj).Nl();
        }
        return null;
    }

    /* renamed from: ﻭﺙﻩط  reason: contains not printable characters */
    public static String m438() {
        if (C0047.m2134() < 0) {
            return "{\"fid_list\":[\"%s\"],\"fid_token_list\":[\"%s\"],\"to_pdir_fid\":\"%s\",\"pwd_id\":\"%s\",\"stoken\":\"%s\",\"pdir_fid\":\"0\"}";
        }
        return null;
    }

    /* renamed from: ـجﺙا  reason: contains not printable characters */
    public static String m421(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
