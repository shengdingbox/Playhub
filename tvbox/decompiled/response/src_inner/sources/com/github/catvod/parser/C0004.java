package com.github.catvod.parser;

import android.content.ContentResolver;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebSettings;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.Cloud_baidu;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0136m;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.kp;
import com.github.catvod.spider.merge.l3;
import com.github.catvod.spider.merge.lm;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
/* renamed from: com.github.catvod.parser.سيﻩﻍ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0004 {

    /* renamed from: شﺎبغ  reason: contains not printable characters */
    public static int f4 = 304;

    /* renamed from: اﻱخف  reason: contains not printable characters */
    public static Va m119(Object obj) {
        if (C0022.m1429() < 0) {
            return l3.tF((String) obj);
        }
        return null;
    }

    /* renamed from: بكحﻩ  reason: contains not printable characters */
    public static int m120(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: تﻙﺹج  reason: contains not printable characters */
    public static String m121(Object obj) {
        if (C0028.m1612() <= 0) {
            return ((kp) obj).t0();
        }
        return null;
    }

    /* renamed from: ثﺹﻝك  reason: contains not printable characters */
    public static Iterator m122(Object obj) {
        if (C0020.m1371() < 0) {
            return ((AbstractCollection) obj).iterator();
        }
        return null;
    }

    /* renamed from: جﺩرﻕ  reason: contains not printable characters */
    public static ME m123(Object obj, Object obj2) {
        if (C0052.m2256() >= 0) {
            return ((lm) obj).G4((String) obj2);
        }
        return null;
    }

    /* renamed from: خﻡﺥـ  reason: contains not printable characters */
    public static String m124(Object obj) {
        if (C0052.m2256() > 0) {
            return ((tX) obj).W();
        }
        return null;
    }

    /* renamed from: سﻝلﻩ  reason: contains not printable characters */
    public static Object m125(Object obj, Object obj2, Object obj3) {
        if (C0040.m1954() <= 0) {
            return ((TreeMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: شﺽسﺫ  reason: contains not printable characters */
    public static void m126(Object obj, Object obj2) {
        if (C0040.m1954() <= 0) {
            ((C0059Dl) obj).U((String) obj2);
        }
    }

    /* renamed from: ضﺥبن  reason: contains not printable characters */
    public static String m127(Object obj) {
        if (C0032.m1750() < 0) {
            return C0136m.tF((Iterable) obj);
        }
        return null;
    }

    /* renamed from: عجﻍﺱ  reason: contains not printable characters */
    public static String m128() {
        if (C0044.m2051() <= 0) {
            return "未扫码登录无法播放";
        }
        return null;
    }

    /* renamed from: عﺏﻩﻡ  reason: contains not printable characters */
    public static int m129() {
        return (-406) ^ C0053.f111;
    }

    /* renamed from: كقظب  reason: contains not printable characters */
    public static TimeUnit m131() {
        if (C0008.m250() >= 0) {
            return TimeUnit.SECONDS;
        }
        return null;
    }

    /* renamed from: كﻝﻡت  reason: contains not printable characters */
    public static boolean m132(Object obj, Object obj2) {
        if (C0028.m1612() < 0) {
            return ((List) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: نشﺹﻙ  reason: contains not printable characters */
    public static View m133(Object obj, int i) {
        if (C0014.m418() > 0) {
            return ((View) obj).findViewById(i);
        }
        return null;
    }

    /* renamed from: يﺭﻕظ  reason: contains not printable characters */
    public static String m134() {
        if (C0020.m1371() < 0) {
            return "text/html";
        }
        return null;
    }

    /* renamed from: يﻍﻙﻉ  reason: contains not printable characters */
    public static boolean m135(Object obj, Object obj2) {
        if (C0057.m2368() >= 0) {
            return Collections.addAll((Collection) obj, (Object[]) obj2);
        }
        return false;
    }

    /* renamed from: ﺝﺩﺽﻅ  reason: contains not printable characters */
    public static String m136(Object obj, Object obj2) {
        if (C0008.m250() >= 0) {
            return Settings.Secure.getString((ContentResolver) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ﺡﻩﺏد  reason: contains not printable characters */
    public static String m137(Object obj) {
        if (C0020.m1371() < 0) {
            return ((kp) obj).SN();
        }
        return null;
    }

    /* renamed from: ﺭﺏغﺡ  reason: contains not printable characters */
    public static String m138(Object obj) {
        if (C0053.m2279() < 0) {
            return ((H7) obj).v();
        }
        return null;
    }

    /* renamed from: ﺱوﻡذ  reason: contains not printable characters */
    public static Set m139(Object obj) {
        if (C0038.m1893() <= 0) {
            return ((HashMap) obj).entrySet();
        }
        return null;
    }

    /* renamed from: ﺵزطﻙ  reason: contains not printable characters */
    public static String m140(String str) {
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

    /* renamed from: ﻁﺽرﺵ  reason: contains not printable characters */
    public static String m141(Object obj, Object obj2, Object obj3) {
        if (m129() <= 0) {
            return C0068Pe.Gd((String) obj, (Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ﻅخﺫﺱ  reason: contains not printable characters */
    public static boolean m142() {
        if (C0029.m1639() >= 0) {
            return Cloud_baidu.i;
        }
        return false;
    }

    /* renamed from: ﻅﻡﺥﻁ  reason: contains not printable characters */
    public static String m143() {
        if (C0021.m1415() >= 0) {
            return "ffc6341c056de41cf4ab95343d9c22fe";
        }
        return null;
    }

    /* renamed from: ﻍكفﺽ  reason: contains not printable characters */
    public static void m144(Object obj, boolean z) {
        if (C0015.m447() >= 0) {
            ((WebSettings) obj).setDomStorageEnabled(z);
        }
    }

    /* renamed from: ﻝﺙوﺯ  reason: contains not printable characters */
    public static gU m145(Object obj, Object obj2) {
        if (C0047.m2134() < 0) {
            return ((gU) obj).yq((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻡﻭثط  reason: contains not printable characters */
    public static void m146(Object obj, Object obj2) {
        if (C0044.m2051() < 0) {
            ((HashMap) obj).putAll((Map) obj2);
        }
    }

    /* renamed from: ﻩهﺽﺏ  reason: contains not printable characters */
    public static boolean m147(Object obj, Object obj2) {
        if (C0020.m1371() <= 0) {
            return ((Pan) obj).isAli((String) obj2);
        }
        return false;
    }

    /* renamed from: ﻭخﺹﻉ  reason: contains not printable characters */
    public static String m148() {
        if (C0040.m1954() < 0) {
            return "play";
        }
        return null;
    }

    /* renamed from: ﻭولب  reason: contains not printable characters */
    public static String m149() {
        if (C0021.m1415() >= 0) {
            return "---";
        }
        return null;
    }

    /* renamed from: ﻭﻡﻍﻝ  reason: contains not printable characters */
    public static String m150(Object obj) {
        if (C0032.m1750() < 0) {
            return Rc.dT((String) obj);
        }
        return null;
    }

    /* renamed from: قلذك  reason: contains not printable characters */
    public static String m130(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
