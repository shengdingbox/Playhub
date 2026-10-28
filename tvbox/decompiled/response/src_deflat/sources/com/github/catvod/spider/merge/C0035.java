package com.github.catvod.spider.merge;

import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.Window;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.JPJ;
import com.github.catvod.spider.Nmyswv;
import com.github.catvod.spider.ProxyOrigin;
import com.github.catvod.spider.T4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.ﻁﺯﻉي  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0035 {

    /* renamed from: ﻍﻁرﺏ  reason: contains not printable characters */
    public static int f93 = 90;

    /* renamed from: اخغف  reason: contains not printable characters */
    public static int m1800(Object obj) {
        if (C0030.m1683() > 0) {
            return ((Uri) obj).getPort();
        }
        return 0;
    }

    /* renamed from: اﺕﻅو  reason: contains not printable characters */
    public static Object m1801(Object obj, int i) {
        if (C0033.m1755() < 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* renamed from: اﻩثو  reason: contains not printable characters */
    public static int m1802() {
        return (-4) ^ C0029.f87;
    }

    /* renamed from: تﻝﺕو  reason: contains not printable characters */
    public static String m1803(String str) {
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

    /* renamed from: جﻩصﺎ  reason: contains not printable characters */
    public static String m1804() {
        if (C0050.m2221() <= 0) {
            return ProxyOrigin.getFileUrl();
        }
        return null;
    }

    /* renamed from: دتﻩق  reason: contains not printable characters */
    public static String m1805(Object obj) {
        if (C0026.m1561() < 0) {
            return ((H7) obj).i();
        }
        return null;
    }

    /* renamed from: ذعخﺥ  reason: contains not printable characters */
    public static String m1806() {
        if (C0036.m1838() < 0) {
            return "VIP";
        }
        return null;
    }

    /* renamed from: صغﺥخ  reason: contains not printable characters */
    public static String m1807(Object obj) {
        if (C0053.m2279() < 0) {
            return Rc.B((String) obj);
        }
        return null;
    }

    /* renamed from: ظجﻡـ  reason: contains not printable characters */
    public static Charset m1808() {
        if (C0048.m2140() < 0) {
            return StandardCharsets.UTF_8;
        }
        return null;
    }

    /* renamed from: كداﺎ  reason: contains not printable characters */
    public static Window m1809(Object obj) {
        if (C0013.m382() < 0) {
            return ((Dialog) obj).getWindow();
        }
        return null;
    }

    /* renamed from: كصغث  reason: contains not printable characters */
    public static void m1810(Object obj, Object obj2) {
        if (C0029.m1639() > 0) {
            ((H7) obj).Fz((String) obj2);
        }
    }

    /* renamed from: لاﺽﻩ  reason: contains not printable characters */
    public static String m1811() {
        if (C0043.m2042() < 0) {
            return "location";
        }
        return null;
    }

    /* renamed from: مﻉفﺱ  reason: contains not printable characters */
    public static PackageManager m1812(Object obj) {
        if (C0015.m447() > 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* renamed from: مﻩغﻁ  reason: contains not printable characters */
    public static IL m1813(Object obj) {
        if (C0029.m1639() >= 0) {
            return ((V) obj).t0;
        }
        return null;
    }

    /* renamed from: وﺎدق  reason: contains not printable characters */
    public static List m1814(Object obj, int i) {
        if (C0024.m1502() >= 0) {
            return ((PackageManager) obj).getInstalledApplications(i);
        }
        return null;
    }

    /* renamed from: ﺏطقخ  reason: contains not printable characters */
    public static OM m1815(Object obj, long j) {
        if (C0001.m25() <= 0) {
            return ((OM) obj).KJ(j);
        }
        return null;
    }

    /* renamed from: ﺙﺹثﺫ  reason: contains not printable characters */
    public static JSONObject m1816() {
        if (C0014.m418() > 0) {
            return Nmyswv.N;
        }
        return null;
    }

    /* renamed from: ﺡوثغ  reason: contains not printable characters */
    public static byte[] m1817(Object obj, Object obj2) {
        if (C0007.m214() <= 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2);
        }
        return null;
    }

    /* renamed from: ﺩﺫﺯﺽ  reason: contains not printable characters */
    public static String m1818(Object obj) {
        if (C0022.m1429() < 0) {
            return ((FA) obj).t0();
        }
        return null;
    }

    /* renamed from: ﺫعضم  reason: contains not printable characters */
    public static void m1819(Object obj) {
        if (C0057.m2368() >= 0) {
            ((Dialog) obj).show();
        }
    }

    /* renamed from: ﺱشعا  reason: contains not printable characters */
    public static String m1820(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0022.m1429() < 0) {
            return ((T4) obj).searchContentWeb((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﺱيحﺎ  reason: contains not printable characters */
    public static void m1821(Object obj) {
        if (C0034.m1793() <= 0) {
            ((RQ) obj).mG();
        }
    }

    /* renamed from: ﺵطقﺡ  reason: contains not printable characters */
    public static String m1822(Object obj) {
        if (C0026.m1561() < 0) {
            return ((tX) obj).g9();
        }
        return null;
    }

    /* renamed from: ﻁحﺽﻉ  reason: contains not printable characters */
    public static int m1823(Object obj) {
        if (C0009.m276() > 0) {
            return ((JSONArray) obj).length();
        }
        return 0;
    }

    /* renamed from: ﻁهﻭض  reason: contains not printable characters */
    public static String m1824(Object obj, Object obj2, Object obj3) {
        if (C0055.m2324() > 0) {
            return RS.i((String) obj, (Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ﻁﻱﺎح  reason: contains not printable characters */
    public static int m1825(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻉفخﺵ  reason: contains not printable characters */
    public static String m1826() {
        if (C0025.m1534() <= 0) {
            return ProxyOrigin.getUrl();
        }
        return null;
    }

    /* renamed from: ﻍحدط  reason: contains not printable characters */
    public static String m1827(Object obj, Object obj2, Object obj3) {
        if (C0004.m129() <= 0) {
            return ((JPJ) obj).searchContent((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﻕﺫكر  reason: contains not printable characters */
    public static File m1828(Object obj) {
        if (C0038.m1893() < 0) {
            return ((V) obj).O();
        }
        return null;
    }

    /* renamed from: ﻙقبد  reason: contains not printable characters */
    public static boolean m1829(Object obj) {
        if (C0036.m1838() < 0) {
            return ((LP) obj).F5();
        }
        return false;
    }

    /* renamed from: ﻝﻡﺫﺩ  reason: contains not printable characters */
    public static List m1830(Object obj) {
        if (C0048.m2140() <= 0) {
            return ((oU) obj).yq();
        }
        return null;
    }

    /* renamed from: ﻩحﺩﻅ  reason: contains not printable characters */
    public static int m1831(int i, int i2) {
        if (C0008.m250() > 0) {
            return Integer.compare(i, i2);
        }
        return 0;
    }

    /* renamed from: ﻩفظﺥ  reason: contains not printable characters */
    public static List m1832() {
        if (C0056.m2341() <= 0) {
            return Rc.zH;
        }
        return null;
    }

    /* renamed from: ﻭﺽسث  reason: contains not printable characters */
    public static String m1833(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
