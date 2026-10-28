package com.github.catvod.spider;

import android.app.Dialog;
import com.github.catvod.parser.C0002;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.Db;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.X0;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.tX;
import com.github.catvod.spider.merge.w2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.github.catvod.spider.خضـذ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0042 {

    /* renamed from: ﻩـﺩك  reason: contains not printable characters */
    public static int f100 = -183;

    /* renamed from: اشدﻩ  reason: contains not printable characters */
    public static X0 m1997(Object obj) {
        if (938 ^ C0033.f91 <= 0) {
            return ((C0203xU) obj).v3;
        }
        return null;
    }

    /* renamed from: اﺥشـ  reason: contains not printable characters */
    public static int m1998() {
        return (-1021) ^ C0026.f84;
    }

    /* renamed from: ثطﺎﻕ  reason: contains not printable characters */
    public static Object m1999(Object obj, Object obj2, Object obj3) {
        if ((-914) ^ C0004.f4 < 0) {
            return ((HashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: حﻍمل  reason: contains not printable characters */
    public static int m2000(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: خﺭﺝث  reason: contains not printable characters */
    public static String m2001(Object obj, Object obj2, Object obj3) {
        if (753 ^ C0000.f0 > 0) {
            return C0068Pe.B((String) obj, (Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: دﺡفﺏ  reason: contains not printable characters */
    public static String m2002(Object obj) {
        if ((-767) ^ C0037.f95 >= 0) {
            return ((tX) obj).zH();
        }
        return null;
    }

    /* renamed from: ظيﻙﻡ  reason: contains not printable characters */
    public static String m2003() {
        if (596 ^ C0009.f9 <= 0) {
            return "推送";
        }
        return null;
    }

    /* renamed from: ـثصك  reason: contains not printable characters */
    public static String m2004(Object obj, Object obj2, boolean z, Object obj3, Object obj4) {
        if (802 ^ C0052.f110 < 0) {
            return ((RQ) obj).W((Nh) obj2, z, (String) obj3, (File) obj4);
        }
        return null;
    }

    /* renamed from: قنضث  reason: contains not printable characters */
    public static boolean m2005(Object obj) {
        if (624 ^ C0012.f12 < 0) {
            return Rc.Gd((String) obj);
        }
        return false;
    }

    /* renamed from: وﺫﺩﺥ  reason: contains not printable characters */
    public static w2 m2006(Object obj, Object obj2, Object obj3) {
        if ((-185) ^ C0033.f91 >= 0) {
            return V3.i((String) obj, (String) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: يﻁﺯﻅ  reason: contains not printable characters */
    public static String m2007() {
        if ((-732) ^ f2 < 0) {
            return "{\"fids\":[\"%s\"],\"pwd_id\":\"%s\",\"stoken\":\"%s\",\"fids_token\":[\"%s\"]}";
        }
        return null;
    }

    /* renamed from: ﺥﺡﻙه  reason: contains not printable characters */
    public static iX m2008(Object obj, Object obj2) {
        if ((-540) ^ C0001.f1 >= 0) {
            return ((iX) obj).n((List) obj2);
        }
        return null;
    }

    /* renamed from: ﺥﻍـك  reason: contains not printable characters */
    public static int m2009(Object obj) {
        if (938 ^ C0033.f91 <= 0) {
            return ((HashMap) obj).size();
        }
        return 0;
    }

    /* renamed from: ﺵﺱﺭﺽ  reason: contains not printable characters */
    public static iX m2011(Object obj, int i, int i2, int i3, int i4) {
        if ((-558) ^ C0039.f97 < 0) {
            return ((iX) obj).dT(i, i2, i3, i4);
        }
        return null;
    }

    /* renamed from: ﻁغضظ  reason: contains not printable characters */
    public static void m2012(Object obj) {
        if (916 ^ C0002.f2 > 0) {
            ((Dialog) obj).dismiss();
        }
    }

    /* renamed from: ﻙجغﻡ  reason: contains not printable characters */
    public static int m2013(Object obj) {
        if (125 ^ C0037.f95 < 0) {
            return ((Db) obj).yq;
        }
        return 0;
    }

    /* renamed from: ﻝوﺝد  reason: contains not printable characters */
    public static String m2014(String str) {
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

    /* renamed from: ﻭﺵﻕف  reason: contains not printable characters */
    public static String m2015() {
        if ((-448) ^ C0025.f83 >= 0) {
            return "passcode";
        }
        return null;
    }

    /* renamed from: ﺫكﺵﺹ  reason: contains not printable characters */
    public static String m2010(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
