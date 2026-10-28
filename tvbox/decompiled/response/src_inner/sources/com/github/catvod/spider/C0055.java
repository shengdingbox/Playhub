package com.github.catvod.spider;

import android.text.Editable;
import android.widget.EditText;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0128k;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.OM;
import com.github.catvod.spider.merge.Q6;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.Yv;
import com.github.catvod.spider.merge.jt;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.ﺽوﻙﺎ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0055 {

    /* renamed from: ﻕجﻝق  reason: contains not printable characters */
    public static int f113 = -324;

    /* renamed from: اﻍـﻕ  reason: contains not printable characters */
    public static C0203xU m2311() {
        if (C0044.m2051() < 0) {
            return C0203xU.s();
        }
        return null;
    }

    /* renamed from: جﻍثﻙ  reason: contains not printable characters */
    public static String m2312(Object obj) {
        if (C0011.m344() > 0) {
            return URLDecoder.decode((String) obj);
        }
        return null;
    }

    /* renamed from: خجﻝﺕ  reason: contains not printable characters */
    public static String m2313(String str) {
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

    /* renamed from: ذقكغ  reason: contains not printable characters */
    public static String m2314(Object obj) {
        if (C0006.m193() >= 0) {
            return ((RQ) obj).F5;
        }
        return null;
    }

    /* renamed from: رـﺎﻁ  reason: contains not printable characters */
    public static HashMap m2315(Object obj, Object obj2) {
        if (C0001.m25() <= 0) {
            return ((C0203xU) obj).nQ((String) obj2);
        }
        return null;
    }

    /* renamed from: ضﺥبن  reason: contains not printable characters */
    public static String m2316(Object obj) {
        if (C0023.m1475() > 0) {
            return ((Yv) obj).t0();
        }
        return null;
    }

    /* renamed from: طﻝمﺵ  reason: contains not printable characters */
    public static int m2317(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ظﻱجط  reason: contains not printable characters */
    public static String m2318(Object obj) {
        if (C0045.m2093() > 0) {
            return ((OM) obj).SN();
        }
        return null;
    }

    /* renamed from: عتسﻱ  reason: contains not printable characters */
    public static String m2319(Object obj) {
        if (C0002.m60() < 0) {
            return ((tX) obj).xa();
        }
        return null;
    }

    /* renamed from: ﺕظجﻩ  reason: contains not printable characters */
    public static List m2321(Object obj, Object obj2) {
        if (C0033.m1755() < 0) {
            return ((V) obj).b((H7) obj2);
        }
        return null;
    }

    /* renamed from: ﺡﻭﺕس  reason: contains not printable characters */
    public static jt m2322(Object obj) {
        if (C0021.m1415() > 0) {
            return ((jt) obj).i();
        }
        return null;
    }

    /* renamed from: ﺩﻡجﻁ  reason: contains not printable characters */
    public static String m2323() {
        if (C0013.m382() < 0) {
            return "{";
        }
        return null;
    }

    /* renamed from: ﺵبزﻱ  reason: contains not printable characters */
    public static int m2324() {
        return (-185) ^ C0033.f91;
    }

    /* renamed from: ﺵﻩﺡس  reason: contains not printable characters */
    public static HashMap m2325(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0050.m2221() <= 0) {
            return C0128k.SN((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ﺹكﺭش  reason: contains not printable characters */
    public static Editable m2326(Object obj) {
        if (C0035.m1802() > 0) {
            return ((EditText) obj).getText();
        }
        return null;
    }

    /* renamed from: ﺹﺙﻉﺡ  reason: contains not printable characters */
    public static JSONObject m2327() {
        if (C0023.m1475() > 0) {
            return FO.G4();
        }
        return null;
    }

    /* renamed from: ﻁيﻙج  reason: contains not printable characters */
    public static String m2328(Object obj) {
        if (C0053.m2279() <= 0) {
            return ((V) obj).zH;
        }
        return null;
    }

    /* renamed from: ﻙخدذ  reason: contains not printable characters */
    public static kB m2329(Object obj, Object obj2) {
        if (C0052.m2256() >= 0) {
            return ((kB) obj).i((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻡظيﺝ  reason: contains not printable characters */
    public static void m2330(Object obj, Object obj2) {
        if (C0054.m2295() < 0) {
            ((ME) obj).Gc((String) obj2);
        }
    }

    /* renamed from: ﻭخﺭم  reason: contains not printable characters */
    public static String m2331(Object obj) {
        if (m2324() >= 0) {
            return ((Q6) obj).tF();
        }
        return null;
    }

    /* renamed from: ﺕرشت  reason: contains not printable characters */
    public static String m2320(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
