package com.github.catvod.parser;

import android.app.AlertDialog;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.Jpys;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.VQ;
import com.github.catvod.spider.merge.Yx;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.lm;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.غﻁثﺝ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0007 {

    /* renamed from: لزﻡﺝ  reason: contains not printable characters */
    public static int f7 = -883;

    /* renamed from: سظخﺽ  reason: contains not printable characters */
    public static String m207(Object obj, Object obj2) {
        if (C0042.m1998() < 0) {
            return TextUtils.join((CharSequence) obj, (Object[]) obj2);
        }
        return null;
    }

    /* renamed from: سﺵخﺏ  reason: contains not printable characters */
    public static void m208(Object obj) {
        if (C0043.m2042() < 0) {
            ((OutputStream) obj).flush();
        }
    }

    /* renamed from: ضﺏﻙع  reason: contains not printable characters */
    public static String m209(Object obj) {
        if (C0035.m1802() >= 0) {
            return ((lm) obj).tF();
        }
        return null;
    }

    /* renamed from: غظعﺩ  reason: contains not printable characters */
    public static List m211(Object obj) {
        if (C0033.m1755() < 0) {
            return C0068Pe.i((Map) obj);
        }
        return null;
    }

    /* renamed from: ـدصﻡ  reason: contains not printable characters */
    public static iX m212(Object obj, Object obj2) {
        if (C0052.m2256() > 0) {
            return ((iX) obj).KJ((Map) obj2);
        }
        return null;
    }

    /* renamed from: ـهاﺝ  reason: contains not printable characters */
    public static Future m213(Object obj, Object obj2) {
        if (C0021.m1415() >= 0) {
            return ((ExecutorService) obj).submit((Runnable) obj2);
        }
        return null;
    }

    /* renamed from: ﺎقﻁﻕ  reason: contains not printable characters */
    public static int m214() {
        return 624 ^ C0012.f12;
    }

    /* renamed from: ﺏﻁﻙط  reason: contains not printable characters */
    public static JSONObject m215(Object obj) {
        if (C0051.m2229() < 0) {
            return Pan.msg((String) obj);
        }
        return null;
    }

    /* renamed from: ﺕﻉﺙظ  reason: contains not printable characters */
    public static String m216(Object obj) {
        if (C0055.m2324() > 0) {
            return Jpys.sha1((String) obj);
        }
        return null;
    }

    /* renamed from: ﺭرغﺽ  reason: contains not printable characters */
    public static HashMap m217() {
        if (C0015.m447() >= 0) {
            return RQ.Zm;
        }
        return null;
    }

    /* renamed from: ﺭﺫذت  reason: contains not printable characters */
    public static JSONObject m218() {
        if (C0033.m1755() <= 0) {
            return FO.N();
        }
        return null;
    }

    /* renamed from: ﺵكﻅﻉ  reason: contains not printable characters */
    public static Z m219() {
        if (C0030.m1683() >= 0) {
            return Z.Zm();
        }
        return null;
    }

    /* renamed from: ﺹدمﺏ  reason: contains not printable characters */
    public static Object m220(Object obj, Object obj2) {
        if (C0015.m447() > 0) {
            return ((HashMap) obj).get(obj2);
        }
        return null;
    }

    /* renamed from: ﺽمﺭو  reason: contains not printable characters */
    public static ME m221(Object obj) {
        if (C0010.m301() > 0) {
            return ((VQ.yq) obj).tF();
        }
        return null;
    }

    /* renamed from: ﻉبﺹﺥ  reason: contains not printable characters */
    public static String m222(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str3.charAt(i3 % length2));
        }
        for (int i4 = 0; i4 < byteArray.length; i4 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ﻉﺏﺹﻱ  reason: contains not printable characters */
    public static int m223(Object obj) {
        if (C0044.m2051() <= 0) {
            return Integer.parseInt((String) obj);
        }
        return 0;
    }

    /* renamed from: ﻍخﻱﻉ  reason: contains not printable characters */
    public static void m224(Object obj, int i, int i2, int i3, int i4) {
        if (C0048.m2140() <= 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMargins(i, i2, i3, i4);
        }
    }

    /* renamed from: ﻍﺥطص  reason: contains not printable characters */
    public static AlertDialog m225(Object obj) {
        if (C0023.m1475() >= 0) {
            return ((AlertDialog.Builder) obj).create();
        }
        return null;
    }

    /* renamed from: ﻍﺯﺩذ  reason: contains not printable characters */
    public static String m226() {
        if (C0049.m2194() < 0) {
            return "task_id";
        }
        return null;
    }

    /* renamed from: ﻍﺱﻡع  reason: contains not printable characters */
    public static iX m227(Object obj, Object obj2) {
        if (C0035.m1802() >= 0) {
            return ((iX) obj).t0((JSONObject) obj2);
        }
        return null;
    }

    /* renamed from: ﻕفﺝﺹ  reason: contains not printable characters */
    public static String m228(Object obj, Object obj2, int i) {
        if (C0011.m344() > 0) {
            return Yx.N((String) obj, (String) obj2, i);
        }
        return null;
    }

    /* renamed from: ﻭوﺥي  reason: contains not printable characters */
    public static int m229(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: عﻱرق  reason: contains not printable characters */
    public static String m210(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
