package com.github.catvod.spider;

import android.app.AlertDialog;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.spider.merge.Ab;
import com.github.catvod.spider.merge.BL;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0029;
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
        if ((-487) ^ C0053.f111 < 0) {
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
        if ((-406) ^ C0053.f111 < 0) {
            return ((Uri) obj).toString();
        }
        return null;
    }

    /* renamed from: حﺕﺹق  reason: contains not printable characters */
    public static gU m2047(Object obj) {
        if ((-824) ^ C0004.f4 < 0) {
            return ((gU) obj).tF();
        }
        return null;
    }

    /* renamed from: حﺫﻱظ  reason: contains not printable characters */
    public static String m2048(Object obj) {
        if ((-406) ^ C0053.f111 < 0) {
            return ((kp) obj).i();
        }
        return null;
    }

    /* renamed from: دنﻡﺙ  reason: contains not printable characters */
    public static String m2049(Object obj) {
        if ((-31) ^ C0006.f6 <= 0) {
            return BL.yq((List) obj);
        }
        return null;
    }

    /* renamed from: شظﺎخ  reason: contains not printable characters */
    public static Object[] m2050(Object obj, Object obj2) {
        if (596 ^ C0009.f9 <= 0) {
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
        if ((-768) ^ C0002.f2 <= 0) {
            ((ME) obj).tF((String) obj2);
        }
    }

    /* renamed from: طكﻉو  reason: contains not printable characters */
    public static int m2054(Object obj, Object obj2) {
        if (909 ^ C0002.f2 > 0) {
            return ((String) obj).compareTo((String) obj2);
        }
        return 0;
    }

    /* renamed from: طﻙﺹش  reason: contains not printable characters */
    public static String m2055(Object obj) {
        if ((-4) ^ C0029.f87 >= 0) {
            return ((Q6) obj).i();
        }
        return null;
    }

    /* renamed from: عطوظ  reason: contains not printable characters */
    public static void m2056(Object obj, Object obj2) {
        if ((-4) ^ C0029.f87 > 0) {
            ((ME) obj).KJ((String) obj2);
        }
    }

    /* renamed from: غتهﺝ  reason: contains not printable characters */
    public static String m2057(Object obj) {
        if ((-556) ^ C0004.f4 <= 0) {
            return ((H7) obj).ee();
        }
        return null;
    }

    /* renamed from: ـيزغ  reason: contains not printable characters */
    public static void m2058(Object obj, Object obj2) {
        if ((-732) ^ f2 < 0) {
            ((Q6) obj).KJ((String) obj2);
        }
    }

    /* renamed from: فـﻡﺩ  reason: contains not printable characters */
    public static Object[] m2059(Object obj) {
        if ((-314) ^ C0002.f2 < 0) {
            return ((Ab) obj).i();
        }
        return null;
    }

    /* renamed from: فﻍﺥﻙ  reason: contains not printable characters */
    public static boolean m2060() {
        if (284 ^ C0041.f99 <= 0) {
            return Cloud_quark.tF;
        }
        return false;
    }

    /* renamed from: قﻅضﺕ  reason: contains not printable characters */
    public static String m2061(Object obj) {
        if ((-540) ^ C0001.f1 >= 0) {
            return ((C0059Dl) obj).ee();
        }
        return null;
    }

    /* renamed from: محﺫﺙ  reason: contains not printable characters */
    public static String m2062(Object obj, Object obj2, boolean z) {
        if ((-985) ^ C0024.f82 < 0) {
            return ((V) obj).dT((H7) obj2, z);
        }
        return null;
    }

    /* renamed from: نﺽﻁح  reason: contains not printable characters */
    public static void m2063(Object obj, Object obj2) {
        if ((-1021) ^ C0026.f84 < 0) {
            ((H7) obj).n((String) obj2);
        }
    }

    /* renamed from: واكﺱ  reason: contains not printable characters */
    public static String m2064(Object obj) {
        if ((-487) ^ C0053.f111 < 0) {
            return ((kp) obj).tF();
        }
        return null;
    }

    /* renamed from: يطﻩص  reason: contains not printable characters */
    public static List m2065(Object obj) {
        if ((-477) ^ C0042.f100 >= 0) {
            return ((LP) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺎﻁهب  reason: contains not printable characters */
    public static int m2066() {
        if ((-4) ^ C0029.f87 > 0) {
            return Process.myPid();
        }
        return 0;
    }

    /* renamed from: ﺏﻉلﺥ  reason: contains not printable characters */
    public static Cloud_baidu m2067(Object obj) {
        if ((-604) ^ C0013.f13 >= 0) {
            return ((Pan) obj).tF;
        }
        return null;
    }

    /* renamed from: ﺝﺡثع  reason: contains not printable characters */
    public static void m2068(Object obj) {
        if (753 ^ C0000.f0 > 0) {
            TL.SN((List) obj);
        }
    }

    /* renamed from: ﺯﺭﺎـ  reason: contains not printable characters */
    public static kB m2069(Object obj, int i) {
        if ((-556) ^ C0004.f4 <= 0) {
            return ((kB) obj).N(i);
        }
        return null;
    }

    /* renamed from: ﺱﺽﺩه  reason: contains not printable characters */
    public static List m2070(Object obj) {
        if (909 ^ C0002.f2 >= 0) {
            return ((tX) obj).t0();
        }
        return null;
    }

    /* renamed from: ﺱﻩﺕع  reason: contains not printable characters */
    public static void m2071(Object obj, Object obj2) {
        if ((-768) ^ C0002.f2 < 0) {
            Nmyswv.addView((View) obj, (ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ﺹخسﺙ  reason: contains not printable characters */
    public static String m2072() {
        if ((-821) ^ C0025.f83 > 0) {
            return "Range";
        }
        return null;
    }

    /* renamed from: ﺽبتم  reason: contains not printable characters */
    public static String m2073(Object obj) {
        if (930 ^ C0038.f96 <= 0) {
            return ((C0203xU) obj).Gc;
        }
        return null;
    }

    /* renamed from: ﻅﺡثط  reason: contains not printable characters */
    public static ME m2074(Object obj, Object obj2, Object obj3) {
        if ((-487) ^ C0053.f111 < 0) {
            return ((RQ) obj).m((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﻅﺽﻩﺭ  reason: contains not printable characters */
    public static String m2075(int i) {
        if (706 ^ C0003.f3 >= 0) {
            return Rc.W(i);
        }
        return null;
    }

    /* renamed from: ﻙﺎعﻩ  reason: contains not printable characters */
    public static void m2076(Object obj, Object obj2) {
        if ((-821) ^ C0025.f83 >= 0) {
            ((tX) obj).Dr((String) obj2);
        }
    }

    /* renamed from: ﻙﺎلﻕ  reason: contains not printable characters */
    public static C0188ts m2077(Object obj) {
        if (498 ^ C0002.f2 > 0) {
            return ((C0188ts) obj).yq();
        }
        return null;
    }

    /* renamed from: ﻡﻅﺩي  reason: contains not printable characters */
    public static AlertDialog.Builder m2078(Object obj, Object obj2) {
        if (802 ^ C0052.f110 < 0) {
            return ((AlertDialog.Builder) obj).setView((View) obj2);
        }
        return null;
    }

    /* renamed from: ﻭمجه  reason: contains not printable characters */
    public static String m2079() {
        if ((-675) ^ C0038.f96 >= 0) {
            return "quarkSt";
        }
        return null;
    }

    /* renamed from: ﻱﺫﺽـ  reason: contains not printable characters */
    public static String m2080(Object obj) {
        if (706 ^ C0003.f3 > 0) {
            return ((C0104fu) obj).yq();
        }
        return null;
    }

    /* renamed from: ﻱﺱﺕب  reason: contains not printable characters */
    public static String m2081() {
        if ((-732) ^ f2 < 0) {
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
