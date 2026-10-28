package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.LP;
import com.github.catvod.spider.merge.SO;
import com.github.catvod.spider.merge.T1;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.Yv;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: com.github.catvod.spider.ﻭغهﺎ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0057 {

    /* renamed from: رخﺹﺵ  reason: contains not printable characters */
    public static int f115 = 346;

    /* renamed from: اقمﻡ  reason: contains not printable characters */
    public static String m2361(Object obj, Object obj2, Object obj3, boolean z, Object obj4) {
        if ((-558) ^ C0039.f97 < 0) {
            return ((Bili) obj).categoryContent((String) obj2, (String) obj3, z, (HashMap) obj4);
        }
        return null;
    }

    /* renamed from: بظﺽﺭ  reason: contains not printable characters */
    public static Yv m2362(Object obj) {
        if (36 ^ C0033.f91 < 0) {
            return ((V) obj).Gc;
        }
        return null;
    }

    /* renamed from: حﻉثج  reason: contains not printable characters */
    public static boolean m2363() {
        if (938 ^ C0033.f91 < 0) {
            return SO.yq();
        }
        return false;
    }

    /* renamed from: روعظ  reason: contains not printable characters */
    public static long m2364() {
        if (916 ^ C0002.f2 > 0) {
            return Pan.xa;
        }
        return 0L;
    }

    /* renamed from: ضﺵبخ  reason: contains not printable characters */
    public static String m2365(String str) {
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

    /* renamed from: ـجحش  reason: contains not printable characters */
    public static File m2366(Object obj) {
        if ((-540) ^ C0001.f1 > 0) {
            return ((C0203xU) obj).R();
        }
        return null;
    }

    /* renamed from: فﺝزﺥ  reason: contains not printable characters */
    public static void m2367(Object obj, Object obj2) {
        if ((-558) ^ C0039.f97 < 0) {
            ((Cloud_uc) obj).setFlag((String) obj2);
        }
    }

    /* renamed from: كلذﻡ  reason: contains not printable characters */
    public static int m2368() {
        return (-767) ^ C0037.f95;
    }

    /* renamed from: مظرل  reason: contains not printable characters */
    public static String m2369(Object obj) {
        if (930 ^ C0038.f96 < 0) {
            return ((Yv) obj).M();
        }
        return null;
    }

    /* renamed from: نشﺭـ  reason: contains not printable characters */
    public static int m2370(Object obj) {
        if (354 ^ C0026.f84 >= 0) {
            return ((Random) obj).nextInt();
        }
        return 0;
    }

    /* renamed from: هرعذ  reason: contains not printable characters */
    public static void m2371(Object obj) {
        if (813 ^ C0033.f91 <= 0) {
            InitOrigin.run((Runnable) obj);
        }
    }

    /* renamed from: ﺏافع  reason: contains not printable characters */
    public static long m2372(Object obj) {
        if ((-388) ^ C0035.f93 < 0) {
            return ((T1) obj).SN();
        }
        return 0L;
    }

    /* renamed from: ﺝﻡﺫﺎ  reason: contains not printable characters */
    public static AlertDialog.Builder m2373(Object obj, Object obj2, Object obj3) {
        if ((-487) ^ C0053.f111 <= 0) {
            return ((AlertDialog.Builder) obj).setNegativeButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ﺡيمﻩ  reason: contains not printable characters */
    public static String m2374() {
        if (36 ^ C0033.f91 < 0) {
            return "2160p";
        }
        return null;
    }

    /* renamed from: ﺥﺕنﺭ  reason: contains not printable characters */
    public static String m2375(Object obj) {
        if ((-824) ^ C0004.f4 < 0) {
            return ((LP) obj).zH();
        }
        return null;
    }

    /* renamed from: ﺫكمﻡ  reason: contains not printable characters */
    public static String m2376() {
        if ((-31) ^ C0041.f99 > 0) {
            return "2";
        }
        return null;
    }

    /* renamed from: ﺱذظش  reason: contains not printable characters */
    public static boolean m2377(Object obj) {
        if (284 ^ C0041.f99 < 0) {
            return Bili.containsChinese((String) obj);
        }
        return false;
    }

    /* renamed from: ﺹﺕزﻱ  reason: contains not printable characters */
    public static kB m2378(Object obj) {
        if (812 ^ C0022.f80 <= 0) {
            return ((hN) obj).J();
        }
        return null;
    }

    /* renamed from: ﺽﻉﻡﺎ  reason: contains not printable characters */
    public static int m2379(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﺽﻍزل  reason: contains not printable characters */
    public static ScheduledFuture m2380(Object obj, Object obj2, long j, long j2, Object obj3) {
        if ((-31) ^ C0041.f99 > 0) {
            return ((ScheduledExecutorService) obj).scheduleAtFixedRate((Runnable) obj2, j, j2, (TimeUnit) obj3);
        }
        return null;
    }

    /* renamed from: ﻁحته  reason: contains not printable characters */
    public static void m2381(Object obj, Object obj2) {
        if ((-422) ^ C0033.f91 > 0) {
            ((SecureRandom) obj).nextBytes((byte[]) obj2);
        }
    }

    /* renamed from: ﻕبزع  reason: contains not printable characters */
    public static String m2382() {
        if (938 ^ C0033.f91 <= 0) {
            return "lastUcDownUrl";
        }
        return null;
    }

    /* renamed from: ﻙﺝسـ  reason: contains not printable characters */
    public static String m2383(Object obj) {
        if (57 ^ C0032.f90 > 0) {
            return ((AppYsV2) obj).yq;
        }
        return null;
    }

    /* renamed from: ﻡنﻱﺽ  reason: contains not printable characters */
    public static boolean m2385(Object obj, Object obj2) {
        if ((-985) ^ C0024.f82 < 0) {
            return ((PackageManager) obj).hasSystemFeature((String) obj2);
        }
        return false;
    }

    /* renamed from: ﻱوحﺯ  reason: contains not printable characters */
    public static String m2386() {
        if ((-185) ^ C0033.f91 > 0) {
            return "fids";
        }
        return null;
    }

    /* renamed from: ﻝﺽكد  reason: contains not printable characters */
    public static String m2384(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
