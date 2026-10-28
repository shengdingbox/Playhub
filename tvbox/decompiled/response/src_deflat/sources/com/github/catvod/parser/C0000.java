package com.github.catvod.parser;

import android.widget.TextView;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.Hmys;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.بجﻕف  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0000 {

    /* renamed from: تزسﺕ  reason: contains not printable characters */
    public static int f0 = 454;

    /* renamed from: اجﺩن  reason: contains not printable characters */
    public static String m0(Object obj) {
        if (C0038.m1893() <= 0) {
            return ((Hmys) obj).homeVideoContent();
        }
        return null;
    }

    /* renamed from: اﻅﺩص  reason: contains not printable characters */
    public static void m1(Object obj, Object obj2) {
        if (C0025.m1534() <= 0) {
            ((tX) obj).g((String) obj2);
        }
    }

    /* renamed from: تﻁقﻭ  reason: contains not printable characters */
    public static Integer m2(Object obj) {
        if (C0014.m418() >= 0) {
            return Integer.valueOf((String) obj);
        }
        return null;
    }

    /* renamed from: دسﻍﻭ  reason: contains not printable characters */
    public static String m3() {
        if (m13() > 0) {
            return "author";
        }
        return null;
    }

    /* renamed from: زﺎمﻙ  reason: contains not printable characters */
    public static String m4(Object obj) {
        if (C0046.m2112() > 0) {
            return ((H7) obj).tF();
        }
        return null;
    }

    /* renamed from: سضغم  reason: contains not printable characters */
    public static boolean m5(Object obj) {
        if (C0048.m2140() < 0) {
            return ((File) obj).createNewFile();
        }
        return false;
    }

    /* renamed from: سﻍﻡـ  reason: contains not printable characters */
    public static void m6(Object obj, Object obj2) {
        if (C0057.m2368() > 0) {
            ((tX) obj).H((String) obj2);
        }
    }

    /* renamed from: طاعه  reason: contains not printable characters */
    public static String m7(String str) {
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

    /* renamed from: لاﺏت  reason: contains not printable characters */
    public static String m8() {
        if (C0008.m250() > 0) {
            return "null";
        }
        return null;
    }

    /* renamed from: مﻉجذ  reason: contains not printable characters */
    public static String m9(Object obj, Object obj2) {
        if (C0054.m2295() < 0) {
            return iX.OW((List) obj, (JSONObject) obj2);
        }
        return null;
    }

    /* renamed from: يحﺡو  reason: contains not printable characters */
    public static String m10(Object obj, Object obj2) {
        if (C0011.m344() >= 0) {
            return ((tX) obj).G((String) obj2);
        }
        return null;
    }

    /* renamed from: يﺯضز  reason: contains not printable characters */
    public static boolean m11(Object obj) {
        if (C0050.m2221() <= 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* renamed from: ﺙﻭسﺏ  reason: contains not printable characters */
    public static hN m12(Object obj, Object obj2) {
        if (C0007.m214() <= 0) {
            return PA.yq((String) obj, (hN) obj2);
        }
        return null;
    }

    /* renamed from: ﺝﻙرل  reason: contains not printable characters */
    public static int m13() {
        return 57 ^ C0032.f90;
    }

    /* renamed from: ﺡسنا  reason: contains not printable characters */
    public static String m14() {
        if (C0026.m1561() < 0) {
            return "模式1";
        }
        return null;
    }

    /* renamed from: ﺡﺽغذ  reason: contains not printable characters */
    public static Object m15(Object obj, Object obj2) {
        if (C0047.m2134() <= 0) {
            return ((Map) obj).get(obj2);
        }
        return null;
    }

    /* renamed from: ﺥﻭهﻉ  reason: contains not printable characters */
    public static int m16(Object obj) {
        if (C0057.m2368() > 0) {
            return ((Map) obj).size();
        }
        return 0;
    }

    /* renamed from: ﺯذدﺥ  reason: contains not printable characters */
    public static void m17(Object obj, int i) {
        if (C0024.m1502() >= 0) {
            ((TextView) obj).setTextColor(i);
        }
    }

    /* renamed from: ﻡفﺡج  reason: contains not printable characters */
    public static int m19(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻩجﺏد  reason: contains not printable characters */
    public static int m20(Object obj, Object obj2) {
        if (C0054.m2295() <= 0) {
            return ((Inflater) obj).inflate((byte[]) obj2);
        }
        return 0;
    }

    /* renamed from: ﻩﻭﺏﻍ  reason: contains not printable characters */
    public static String m21(Object obj) {
        if (C0011.m344() > 0) {
            return iX.v((ME) obj);
        }
        return null;
    }

    /* renamed from: ﺹيﺩﺙ  reason: contains not printable characters */
    public static String m18(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
