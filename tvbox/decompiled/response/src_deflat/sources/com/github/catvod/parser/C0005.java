package com.github.catvod.parser;

import android.webkit.WebView;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.C0080aF;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.FA;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.OM;
import com.github.catvod.spider.merge.Q;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.ZI;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.n6;
import com.github.catvod.spider.merge.w2;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.شحطﺵ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0005 {

    /* renamed from: بﺕﻱﻕ  reason: contains not printable characters */
    public static int f5 = 827;

    /* renamed from: اكحﺫ  reason: contains not printable characters */
    public static void m151(Object obj) {
        if (C0000.m13() > 0) {
            ((ArrayList) obj).clear();
        }
    }

    /* renamed from: تﻱﻡب  reason: contains not printable characters */
    public static int m152() {
        return (-985) ^ C0000.f0;
    }

    /* renamed from: جﺱسﺏ  reason: contains not printable characters */
    public static String m153(Object obj) {
        if (C0041.m1981() < 0) {
            return ((C0203xU) obj).OW;
        }
        return null;
    }

    /* renamed from: دﻙجﺹ  reason: contains not printable characters */
    public static String m154(Object obj) {
        if (C0021.m1415() >= 0) {
            return ((C0059Dl) obj).B();
        }
        return null;
    }

    /* renamed from: زحﺫـ  reason: contains not printable characters */
    public static boolean m155(Object obj) {
        if (C0043.m2042() < 0) {
            return ((C0203xU) obj).ee;
        }
        return false;
    }

    /* renamed from: زﻝﺩﺯ  reason: contains not printable characters */
    public static iX m156(Object obj) {
        if (C0039.m1918() < 0) {
            return ((iX) obj).F5();
        }
        return null;
    }

    /* renamed from: غلفر  reason: contains not printable characters */
    public static void m157() {
        if (C0004.m129() < 0) {
            C0080aF.KJ();
        }
    }

    /* renamed from: غﺹﺯﺩ  reason: contains not printable characters */
    public static String m158(Object obj) {
        if (C0007.m214() < 0) {
            return ((ZI) obj).zH();
        }
        return null;
    }

    /* renamed from: قﺭﺏا  reason: contains not printable characters */
    public static JSONObject m159(Object obj, Object obj2, Object obj3) {
        if (C0053.m2279() <= 0) {
            return ((JSONObject) obj).put((String) obj2, obj3);
        }
        return null;
    }

    /* renamed from: نوبﻭ  reason: contains not printable characters */
    public static void m160(Object obj, Object obj2) {
        if (C0010.m301() > 0) {
            ((ME) obj).F5((String) obj2);
        }
    }

    /* renamed from: نﻙشﻭ  reason: contains not printable characters */
    public static String m161(String str) {
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

    /* renamed from: نﻡلﺭ  reason: contains not printable characters */
    public static void m162(Object obj, Object obj2) {
        if (C0047.m2134() < 0) {
            ((C0059Dl) obj).Fz((String) obj2);
        }
    }

    /* renamed from: هوﻅش  reason: contains not printable characters */
    public static HashMap m163(Object obj, Object obj2) {
        if (C0043.m2042() <= 0) {
            return ((Z) obj).Fz((String) obj2);
        }
        return null;
    }

    /* renamed from: وتطﺝ  reason: contains not printable characters */
    public static int m164(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: وﻱﻕﺕ  reason: contains not printable characters */
    public static void m165(Object obj, Object obj2) {
        if (C0041.m1981() <= 0) {
            ((WebView) obj).loadUrl((String) obj2);
        }
    }

    /* renamed from: ﺎﻙﺭق  reason: contains not printable characters */
    public static Pattern m166(Object obj) {
        if (C0040.m1954() < 0) {
            return Pattern.compile((String) obj);
        }
        return null;
    }

    /* renamed from: ﺏظﻁل  reason: contains not printable characters */
    public static w2 m167(Object obj, Object obj2, Object obj3) {
        if (C0011.m344() >= 0) {
            return V3.t0((String) obj, (Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ﺙﺫﻅﻉ  reason: contains not printable characters */
    public static String m168(Object obj) {
        if (C0020.m1371() < 0) {
            return ((n6) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺭعﻱت  reason: contains not printable characters */
    public static String m170(Object obj, Object obj2, Object obj3) {
        if (C0055.m2324() > 0) {
            return ((V) obj).W((String) obj2, (List) obj3);
        }
        return null;
    }

    /* renamed from: ﺱمـﻅ  reason: contains not printable characters */
    public static String m171(Object obj) {
        if (C0015.m447() >= 0) {
            return ((FA) obj).SN();
        }
        return null;
    }

    /* renamed from: ﺵعﻅت  reason: contains not printable characters */
    public static String m172(Object obj) {
        if (C0000.m13() >= 0) {
            return ((URL) obj).getHost();
        }
        return null;
    }

    /* renamed from: ﻅﻉظﻡ  reason: contains not printable characters */
    public static String m173(Object obj) {
        if (C0045.m2093() > 0) {
            return ((OM) obj).N();
        }
        return null;
    }

    /* renamed from: ﻉـسط  reason: contains not printable characters */
    public static void m174(Object obj) {
        if (C0001.m25() < 0) {
            ((Thread) obj).start();
        }
    }

    /* renamed from: ﻙخحز  reason: contains not printable characters */
    public static boolean m175(Object obj) {
        if (C0007.m214() <= 0) {
            return ((ArrayList) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ﻙظـﻭ  reason: contains not printable characters */
    public static void m176(Object obj, Object obj2) {
        if (C0053.m2279() <= 0) {
            ((H7) obj).b((String) obj2);
        }
    }

    /* renamed from: ﻙﺕزخ  reason: contains not printable characters */
    public static boolean m177(Object obj, Object obj2) {
        if (C0051.m2229() < 0) {
            return ((HashSet) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ﻝﻡوص  reason: contains not printable characters */
    public static String m178(Object obj) {
        if (C0056.m2341() < 0) {
            return ((C0059Dl) obj).i();
        }
        return null;
    }

    /* renamed from: ﻡفﺡج  reason: contains not printable characters */
    public static byte[] m179(Object obj, int i) {
        if (C0040.m1954() <= 0) {
            return Q.yq((String) obj, i);
        }
        return null;
    }

    /* renamed from: ﺡخلج  reason: contains not printable characters */
    public static String m169(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
