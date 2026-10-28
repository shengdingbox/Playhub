package com.github.catvod.spider;

import android.app.AlertDialog;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.merge.Ab;
import com.github.catvod.spider.merge.BL;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.C0104fu;
import com.github.catvod.spider.merge.C0188ts;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.LP;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Q6;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.TL;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.kp;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.github.catvod.spider.دصﻁﻍ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0044 {

    /* renamed from: عﺏمن  reason: contains not printable characters */
    public static int f102 = -735;

    /* renamed from: تﺕﻱﺎ  reason: contains not printable characters */
    public static int m2043(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ثﻝﺹﻡ  reason: contains not printable characters */
    public static hN m2044(Object obj) {
        if (C0056.m2341() < 0) {
            return ((kB) obj).zH();
        }
        return null;
    }

    /* renamed from: جغكا  reason: contains not printable characters */
    public static String m2045(String str) {
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

    /* renamed from: حفزﺭ  reason: contains not printable characters */
    public static String m2046(Object obj) {
        if (C0004.m129() < 0) {
            return ((Uri) obj).toString();
        }
        return null;
    }

    /* renamed from: حﺕﺹق  reason: contains not printable characters */
    public static gU m2047(Object obj) {
        if (C0020.m1371() < 0) {
            return ((gU) obj).tF();
        }
        return null;
    }

    /* renamed from: حﺫﻱظ  reason: contains not printable characters */
    public static String m2048(Object obj) {
        if (C0004.m129() < 0) {
            return ((kp) obj).i();
        }
        return null;
    }

    /* renamed from: دنﻡﺙ  reason: contains not printable characters */
    public static String m2049(Object obj) {
        if (C0049.m2194() <= 0) {
            return BL.yq((List) obj);
        }
        return null;
    }

    /* renamed from: شظﺎخ  reason: contains not printable characters */
    public static Object[] m2050(Object obj, Object obj2) {
        if (C0051.m2229() <= 0) {
            return ((C0203xU) obj).z((HashMap) obj2);
        }
        return null;
    }

    /* renamed from: شهﺥغ  reason: contains not printable characters */
    public static int m2051() {
        return (-914) ^ C0004.f4;
    }

    /* renamed from: ضﺽـغ  reason: contains not printable characters */
    public static void m2053(Object obj, Object obj2) {
        if (C0033.m1755() <= 0) {
            ((ME) obj).tF((String) obj2);
        }
    }

    /* renamed from: طكﻉو  reason: contains not printable characters */
    public static int m2054(Object obj, Object obj2) {
        if (C0029.m1639() > 0) {
            return ((String) obj).compareTo((String) obj2);
        }
        return 0;
    }

    /* renamed from: طﻙﺹش  reason: contains not printable characters */
    public static String m2055(Object obj) {
        if (C0035.m1802() >= 0) {
            return ((Q6) obj).i();
        }
        return null;
    }

    /* renamed from: عطوظ  reason: contains not printable characters */
    public static void m2056(Object obj, Object obj2) {
        if (C0035.m1802() > 0) {
            ((ME) obj).KJ((String) obj2);
        }
    }

    /* renamed from: غتهﺝ  reason: contains not printable characters */
    public static String m2057(Object obj) {
        if (C0047.m2134() <= 0) {
            return ((H7) obj).ee();
        }
        return null;
    }

    /* renamed from: ـيزغ  reason: contains not printable characters */
    public static void m2058(Object obj, Object obj2) {
        if (C0002.m60() < 0) {
            ((Q6) obj).KJ((String) obj2);
        }
    }

    /* renamed from: فـﻡﺩ  reason: contains not printable characters */
    public static Object[] m2059(Object obj) {
        if (C0039.m1918() < 0) {
            return ((Ab) obj).i();
        }
        return null;
    }

    /* renamed from: فﻍﺥﻙ  reason: contains not printable characters */
    public static boolean m2060() {
        if (C0022.m1429() <= 0) {
            return Cloud_quark.tF;
        }
        return false;
    }

    /* renamed from: قﻅضﺕ  reason: contains not printable characters */
    public static String m2061(Object obj) {
        if (C0011.m344() >= 0) {
            return ((C0059Dl) obj).ee();
        }
        return null;
    }

    /* renamed from: محﺫﺙ  reason: contains not printable characters */
    public static String m2062(Object obj, Object obj2, boolean z) {
        if (C0025.m1534() < 0) {
            return ((V) obj).dT((H7) obj2, z);
        }
        return null;
    }

    /* renamed from: نﺽﻁح  reason: contains not printable characters */
    public static void m2063(Object obj, Object obj2) {
        if (C0042.m1998() < 0) {
            ((H7) obj).n((String) obj2);
        }
    }

    /* renamed from: واكﺱ  reason: contains not printable characters */
    public static String m2064(Object obj) {
        if (C0056.m2341() < 0) {
            return ((kp) obj).tF();
        }
        return null;
    }

    /* renamed from: يطﻩص  reason: contains not printable characters */
    public static List m2065(Object obj) {
        if (C0003.m81() >= 0) {
            return ((LP) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺎﻁهب  reason: contains not printable characters */
    public static int m2066() {
        if (C0035.m1802() > 0) {
            return Process.myPid();
        }
        return 0;
    }

    /* renamed from: ﺏﻉلﺥ  reason: contains not printable characters */
    public static Cloud_baidu m2067(Object obj) {
        if (C0046.m2112() >= 0) {
            return ((Pan) obj).tF;
        }
        return null;
    }

    /* renamed from: ﺝﺡثع  reason: contains not printable characters */
    public static void m2068(Object obj) {
        if (C0010.m301() > 0) {
            TL.SN((List) obj);
        }
    }

    /* renamed from: ﺯﺭﺎـ  reason: contains not printable characters */
    public static kB m2069(Object obj, int i) {
        if (C0047.m2134() <= 0) {
            return ((kB) obj).N(i);
        }
        return null;
    }

    /* renamed from: ﺱﺽﺩه  reason: contains not printable characters */
    public static List m2070(Object obj) {
        if (C0029.m1639() >= 0) {
            return ((tX) obj).t0();
        }
        return null;
    }

    /* renamed from: ﺱﻩﺕع  reason: contains not printable characters */
    public static void m2071(Object obj, Object obj2) {
        if (C0033.m1755() < 0) {
            Nmyswv.addView((View) obj, (ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ﺹخسﺙ  reason: contains not printable characters */
    public static String m2072() {
        if (C0052.m2256() > 0) {
            return "Range";
        }
        return null;
    }

    /* renamed from: ﺽبتم  reason: contains not printable characters */
    public static String m2073(Object obj) {
        if (C0026.m1561() <= 0) {
            return ((C0203xU) obj).Gc;
        }
        return null;
    }

    /* renamed from: ﻅﺡثط  reason: contains not printable characters */
    public static ME m2074(Object obj, Object obj2, Object obj3) {
        if (C0056.m2341() < 0) {
            return ((RQ) obj).m((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﻅﺽﻩﺭ  reason: contains not printable characters */
    public static String m2075(int i) {
        if (C0008.m250() >= 0) {
            return Rc.W(i);
        }
        return null;
    }

    /* renamed from: ﻙﺎعﻩ  reason: contains not printable characters */
    public static void m2076(Object obj, Object obj2) {
        if (C0052.m2256() >= 0) {
            ((tX) obj).Dr((String) obj2);
        }
    }

    /* renamed from: ﻙﺎلﻕ  reason: contains not printable characters */
    public static C0188ts m2077(Object obj) {
        if (C0037.m1870() > 0) {
            return ((C0188ts) obj).yq();
        }
        return null;
    }

    /* renamed from: ﻡﻅﺩي  reason: contains not printable characters */
    public static AlertDialog.Builder m2078(Object obj, Object obj2) {
        if (C0034.m1793() < 0) {
            return ((AlertDialog.Builder) obj).setView((View) obj2);
        }
        return null;
    }

    /* renamed from: ﻭمجه  reason: contains not printable characters */
    public static String m2079() {
        if (C0030.m1683() >= 0) {
            return "quarkSt";
        }
        return null;
    }

    /* renamed from: ﻱﺫﺽـ  reason: contains not printable characters */
    public static String m2080(Object obj) {
        if (C0008.m250() > 0) {
            return ((C0104fu) obj).yq();
        }
        return null;
    }

    /* renamed from: ﻱﺱﺕب  reason: contains not printable characters */
    public static String m2081() {
        if (C0002.m60() < 0) {
            return "me";
        }
        return null;
    }

    /* renamed from: ضﺯﺹح  reason: contains not printable characters */
    public static String m2052(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
