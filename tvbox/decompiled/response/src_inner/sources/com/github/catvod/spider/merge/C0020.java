package com.github.catvod.spider.merge;

import android.widget.TextView;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0010;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.NewCz;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: com.github.catvod.spider.merge.جهثﺙ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0020 {

    /* renamed from: يثشﺹ  reason: contains not printable characters */
    public static int f78 = 580;

    /* renamed from: تغخﺵ  reason: contains not printable characters */
    public static Object m1364(Object obj, Object obj2, Object obj3) {
        if (C0023.m1475() >= 0) {
            return ((Map) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ثﺏغع  reason: contains not printable characters */
    public static String m1365(Object obj) {
        if (C0010.m301() >= 0) {
            return Ya.i((String) obj);
        }
        return null;
    }

    /* renamed from: خﺹﻩص  reason: contains not printable characters */
    public static OM m1366(Object obj) {
        if (C0028.m1612() < 0) {
            return ((OM) obj).yq();
        }
        return null;
    }

    /* renamed from: ذﺝﻅﺕ  reason: contains not printable characters */
    public static String m1367(Object obj) {
        if (C0048.m2140() < 0) {
            return Rc.n((String) obj);
        }
        return null;
    }

    /* renamed from: رﺕﻍﺭ  reason: contains not printable characters */
    public static void m1368(Object obj, Object obj2) {
        if (C0044.m2051() <= 0) {
            ((C0203xU) obj).Gd((String) obj2);
        }
    }

    /* renamed from: زثجﻕ  reason: contains not printable characters */
    public static String m1369(Object obj) {
        if (C0037.m1870() > 0) {
            return ((lm) obj).Gc();
        }
        return null;
    }

    /* renamed from: طﻁﻉﺱ  reason: contains not printable characters */
    public static boolean m1370(Object obj) {
        if (C0025.m1534() < 0) {
            return Rc.ee((String) obj);
        }
        return false;
    }

    /* renamed from: غضشﺥ  reason: contains not printable characters */
    public static int m1371() {
        return (-824) ^ C0004.f4;
    }

    /* renamed from: غﻅحﻉ  reason: contains not printable characters */
    public static String m1372(Object obj) {
        if (C0002.m60() <= 0) {
            return ((Q6) obj).t0();
        }
        return null;
    }

    /* renamed from: كطﺝظ  reason: contains not printable characters */
    public static int m1373(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: كﺭاﺩ  reason: contains not printable characters */
    public static String m1374() {
        if (C0000.m13() > 0) {
            return "quark_ck";
        }
        return null;
    }

    /* renamed from: لاﺏت  reason: contains not printable characters */
    public static void m1375(Object obj, Object obj2) {
        if (C0041.m1981() < 0) {
            ((ME) obj).dT((String) obj2);
        }
    }

    /* renamed from: لسﻅﺫ  reason: contains not printable characters */
    public static boolean m1376(Object obj) {
        if (C0056.m2341() < 0) {
            return ((ReentrantLock) obj).tryLock();
        }
        return false;
    }

    /* renamed from: نﺡعﺽ  reason: contains not printable characters */
    public static File m1377(Object obj) {
        if (C0048.m2140() <= 0) {
            return ((V) obj).Dr();
        }
        return null;
    }

    /* renamed from: نﻅﻱﺯ  reason: contains not printable characters */
    public static Object[] m1378(Object obj, Object obj2) {
        if (C0048.m2140() < 0) {
            return ((RQ) obj).RQ((Map) obj2);
        }
        return null;
    }

    /* renamed from: وطﺵك  reason: contains not printable characters */
    public static String m1379() {
        if (C0025.m1534() < 0) {
            return Rc.SN;
        }
        return null;
    }

    /* renamed from: وﻉﺽﻁ  reason: contains not printable characters */
    public static String m1380() {
        if (C0000.m13() >= 0) {
            return NewCz.zH;
        }
        return null;
    }

    /* renamed from: وﻍﻝﺙ  reason: contains not printable characters */
    public static Long m1381(long j) {
        if (C0044.m2051() < 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* renamed from: ﺏـﺩﻉ  reason: contains not printable characters */
    public static String m1382(Object obj) {
        if (C0005.m152() < 0) {
            return C0059Dl.SN(obj);
        }
        return null;
    }

    /* renamed from: ﺙﻉﻅن  reason: contains not printable characters */
    public static String m1383(String str) {
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

    /* renamed from: ﺩﻅهف  reason: contains not printable characters */
    public static String m1384() {
        if (C0049.m2194() < 0) {
            return "->->";
        }
        return null;
    }

    /* renamed from: ﺭثﺏم  reason: contains not printable characters */
    public static String m1385() {
        if (C0023.m1475() > 0) {
            return "https://drive.uc.cn/s/";
        }
        return null;
    }

    /* renamed from: ﺯفيﻅ  reason: contains not printable characters */
    public static HashMap m1386(Object obj, Object obj2) {
        if (C0001.m25() < 0) {
            return ((RQ) obj).i3((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺽﺫيﺎ  reason: contains not printable characters */
    public static int m1387(Object obj) {
        if (C0003.m81() >= 0) {
            return ((LinkedList) obj).size();
        }
        return 0;
    }

    /* renamed from: ﻁﺫﻍل  reason: contains not printable characters */
    public static void m1388(Object obj, Object obj2) {
        if (C0050.m2221() <= 0) {
            ((H7) obj).un((String) obj2);
        }
    }

    /* renamed from: ﻁﻝحل  reason: contains not printable characters */
    public static void m1389(Object obj, Object obj2) {
        if (C0021.m1415() >= 0) {
            ((TextView) obj).setText((CharSequence) obj2);
        }
    }

    /* renamed from: ﻝقﺱﺎ  reason: contains not printable characters */
    public static Long m1391(Object obj) {
        if (C0046.m2112() >= 0) {
            return ((LP) obj).i();
        }
        return null;
    }

    /* renamed from: ﻩﻅبث  reason: contains not printable characters */
    public static boolean m1392(Object obj) {
        if (C0021.m1415() >= 0) {
            return ((File) obj).delete();
        }
        return false;
    }

    /* renamed from: ﻭلنﺱ  reason: contains not printable characters */
    public static void m1393(Object obj) {
        if (C0026.m1561() <= 0) {
            ((tX) obj).Zm();
        }
    }

    /* renamed from: ﻱﺎسﻝ  reason: contains not printable characters */
    public static void m1394(Object obj, int i) {
        if (C0005.m152() <= 0) {
            ((TextView) obj).setGravity(i);
        }
    }

    /* renamed from: ﻙﻱظث  reason: contains not printable characters */
    public static String m1390(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
