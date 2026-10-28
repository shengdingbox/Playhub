package com.github.catvod.spider.merge;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.DexNative;
import com.github.catvod.spider.InitOrigin;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.DateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.github.catvod.spider.merge.ذﻙﻩي  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0023 {

    /* renamed from: ﺥﻉقع  reason: contains not printable characters */
    public static int f81 = 313;

    /* renamed from: تﺱﺯﺩ  reason: contains not printable characters */
    public static String m1452() {
        if (C0026.m1561() < 0) {
            return Build.BOARD;
        }
        return null;
    }

    /* renamed from: جعطﺎ  reason: contains not printable characters */
    public static void m1453(Object obj, Object obj2) {
        if (C0026.m1561() < 0) {
            InitOrigin.setSpStr((String) obj, (String) obj2);
        }
    }

    /* renamed from: خﺙﺯظ  reason: contains not printable characters */
    public static String m1454(Object obj) {
        if (C0046.m2112() >= 0) {
            return ((Yv) obj).zH();
        }
        return null;
    }

    /* renamed from: دﻡﻍق  reason: contains not printable characters */
    public static String m1455(Object obj) {
        if (C0009.m276() >= 0) {
            return ((Nh) obj).ee();
        }
        return null;
    }

    /* renamed from: ذعست  reason: contains not printable characters */
    public static VQ m1456(Object obj) {
        if (C0028.m1612() <= 0) {
            return VQ.SN((String) obj);
        }
        return null;
    }

    /* renamed from: رﺏﻙـ  reason: contains not printable characters */
    public static void m1458(Object obj) {
        if (C0042.m1998() <= 0) {
            ((C0203xU) obj).Nl();
        }
    }

    /* renamed from: سﻡدع  reason: contains not printable characters */
    public static void m1459(Object obj, Object obj2, int i, int i2) {
        if (C0010.m301() >= 0) {
            ((ByteArrayOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* renamed from: صهشل  reason: contains not printable characters */
    public static String m1460(String str) {
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

    /* renamed from: ضﻕﺕه  reason: contains not printable characters */
    public static Object m1461(Object obj, int i, Object obj2) {
        if (C0007.m214() < 0) {
            return ((ArrayList) obj).set(i, obj2);
        }
        return null;
    }

    /* renamed from: ظخدق  reason: contains not printable characters */
    public static void m1462(Object obj) {
        if (C0041.m1981() < 0) {
            ((Z) obj).ue();
        }
    }

    /* renamed from: ظﺥان  reason: contains not printable characters */
    public static String m1463(Object obj) {
        if (C0049.m2194() <= 0) {
            return Rc.tF((String) obj);
        }
        return null;
    }

    /* renamed from: غﺵمﻕ  reason: contains not printable characters */
    public static T1 m1464(Object obj) {
        if (C0002.m60() <= 0) {
            return ((RQ) obj).G;
        }
        return null;
    }

    /* renamed from: غﺹﺯﺩ  reason: contains not printable characters */
    public static String m1465(Object obj) {
        if (C0008.m250() >= 0) {
            return ((tX) obj).i();
        }
        return null;
    }

    /* renamed from: ـلﺏﺫ  reason: contains not printable characters */
    public static boolean m1466(Object obj) {
        if (C0049.m2194() < 0) {
            return ((C0203xU) obj).cp();
        }
        return false;
    }

    /* renamed from: فشﻙغ  reason: contains not printable characters */
    public static int m1467(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: قهﺎس  reason: contains not printable characters */
    public static char[] m1468(Object obj) {
        if (C0054.m2295() < 0) {
            return ((String) obj).toCharArray();
        }
        return null;
    }

    /* renamed from: لاﺽﻩ  reason: contains not printable characters */
    public static HashMap m1469(Object obj) {
        if (C0024.m1502() >= 0) {
            return ((C0203xU) obj).D();
        }
        return null;
    }

    /* renamed from: لاﻕد  reason: contains not printable characters */
    public static File m1470(Object obj) {
        if (C0011.m344() >= 0) {
            return ((V) obj).g1();
        }
        return null;
    }

    /* renamed from: مطﻅﻭ  reason: contains not printable characters */
    public static void m1471(boolean z) {
        if (C0043.m2042() < 0) {
            DexNative.danmuStart(z);
        }
    }

    /* renamed from: مينﻁ  reason: contains not printable characters */
    public static String m1472(Object obj) {
        if (C0025.m1534() <= 0) {
            return H7.SN(obj);
        }
        return null;
    }

    /* renamed from: هﺵوض  reason: contains not printable characters */
    public static String m1473(Object obj) {
        if (C0043.m2042() < 0) {
            return ((LP) obj).B();
        }
        return null;
    }

    /* renamed from: ﺎفﻭز  reason: contains not printable characters */
    public static boolean m1474(Object obj, Object obj2) {
        if (C0028.m1612() <= 0) {
            return ((List) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ﺫزﺙن  reason: contains not printable characters */
    public static int m1475() {
        return (-31) ^ C0041.f99;
    }

    /* renamed from: ﺫيمه  reason: contains not printable characters */
    public static boolean m1476(Object obj) {
        if (C0011.m344() > 0) {
            return ((C0188ts) obj).zH();
        }
        return false;
    }

    /* renamed from: ﺽهتﻅ  reason: contains not printable characters */
    public static boolean m1477(Object obj) {
        if (C0053.m2279() <= 0) {
            return ((AbstractCollection) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ﺽﻍﻡﺡ  reason: contains not printable characters */
    public static Process m1478(Object obj, Object obj2) {
        if (C0034.m1793() <= 0) {
            return ((Runtime) obj).exec((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻁﺫﻝﺎ  reason: contains not printable characters */
    public static String m1479(Object obj, Object obj2) {
        if (C0054.m2295() < 0) {
            return ((kB) obj).yq((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻅنجح  reason: contains not printable characters */
    public static File m1480(Object obj) {
        if (C0006.m193() >= 0) {
            return ((File) obj).getParentFile();
        }
        return null;
    }

    /* renamed from: ﻉﺎزﻱ  reason: contains not printable characters */
    public static String m1481() {
        if (C0049.m2194() <= 0) {
            return "video/*";
        }
        return null;
    }

    /* renamed from: ﻉﺩﻩل  reason: contains not printable characters */
    public static HashMap m1482(Object obj) {
        if (m1475() > 0) {
            return Rc.SN((String) obj);
        }
        return null;
    }

    /* renamed from: ﻍـﺱﻉ  reason: contains not printable characters */
    public static Date m1483(Object obj, Object obj2) {
        if (C0008.m250() > 0) {
            return ((DateFormat) obj).parse((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻡوجﺎ  reason: contains not printable characters */
    public static String m1484(Object obj) {
        if (C0005.m152() < 0) {
            return ((C0059Dl) obj).dT();
        }
        return null;
    }

    /* renamed from: ﻭﺙﻩط  reason: contains not printable characters */
    public static AlertDialog.Builder m1485(Object obj, Object obj2, Object obj3) {
        if (C0032.m1750() <= 0) {
            return ((AlertDialog.Builder) obj).setPositiveButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ﻱﺎﻍو  reason: contains not printable characters */
    public static Intent m1486(Object obj, Object obj2) {
        if (C0000.m13() >= 0) {
            return Intent.createChooser((Intent) obj, (CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ﻱﻉﺱي  reason: contains not printable characters */
    public static boolean m1487(Object obj) {
        if (C0021.m1415() > 0) {
            return ((SharedPreferences.Editor) obj).commit();
        }
        return false;
    }

    /* renamed from: ذﻉﻁﺕ  reason: contains not printable characters */
    public static String m1457(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
