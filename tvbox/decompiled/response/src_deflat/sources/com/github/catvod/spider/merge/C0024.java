package com.github.catvod.spider.merge;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.Cloud_ali;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import javax.crypto.Cipher;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.رﻁيﺥ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0024 {

    /* renamed from: عصثو  reason: contains not printable characters */
    public static int f82 = 367;

    /* renamed from: اﻝﻕز  reason: contains not printable characters */
    public static String m1488() {
        if (C0032.m1750() < 0) {
            return cn.zH;
        }
        return null;
    }

    /* renamed from: بنزع  reason: contains not printable characters */
    public static String m1489() {
        if (C0055.m2324() > 0) {
            return "lastQuarkPlayUrl";
        }
        return null;
    }

    /* renamed from: بﻭنﺱ  reason: contains not printable characters */
    public static String m1490(Object obj) {
        if (C0056.m2341() <= 0) {
            return ((Uri) obj).getHost();
        }
        return null;
    }

    /* renamed from: ثخﻍص  reason: contains not printable characters */
    public static String m1491(Object obj, Object obj2, Object obj3) {
        if (C0000.m13() > 0) {
            return ((Z) obj).J((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ثﺡصش  reason: contains not printable characters */
    public static String m1492() {
        if (C0006.m193() >= 0) {
            return "\"status\":500";
        }
        return null;
    }

    /* renamed from: جكثﺙ  reason: contains not printable characters */
    public static boolean m1493(Object obj) {
        if (C0007.m214() < 0) {
            return ((C0059Dl) obj).O();
        }
        return false;
    }

    /* renamed from: جﺹطل  reason: contains not printable characters */
    public static String m1494(Object obj) {
        if (C0015.m447() > 0) {
            return ((LP) obj).N();
        }
        return null;
    }

    /* renamed from: رﺏﺽج  reason: contains not printable characters */
    public static String m1495(Object obj, Object obj2, Object obj3) {
        if (C0022.m1429() <= 0) {
            return ((String) obj).replaceAll((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: زفﻝﻙ  reason: contains not printable characters */
    public static String m1496(Object obj) {
        if (m1502() >= 0) {
            return ((jt) obj).SN();
        }
        return null;
    }

    /* renamed from: سثﺙه  reason: contains not printable characters */
    public static ME m1497(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0054.m2295() < 0) {
            return ((tX) obj).Gd((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: سﻁصﺩ  reason: contains not printable characters */
    public static String m1498(Object obj) {
        if (C0022.m1429() <= 0) {
            return C0128k.yq((Iterable) obj);
        }
        return null;
    }

    /* renamed from: شسثط  reason: contains not printable characters */
    public static String m1499(Object obj) {
        if (C0051.m2229() < 0) {
            return ((Matcher) obj).group();
        }
        return null;
    }

    /* renamed from: شﻅﺱب  reason: contains not printable characters */
    public static byte[] m1500(Object obj, Object obj2) {
        if (C0036.m1838() <= 0) {
            return ((Cipher) obj).doFinal((byte[]) obj2);
        }
        return null;
    }

    /* renamed from: ضﺡمﺯ  reason: contains not printable characters */
    public static int m1501(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: طشﺡـ  reason: contains not printable characters */
    public static int m1502() {
        return 916 ^ C0002.f2;
    }

    /* renamed from: طﺎﻡﺽ  reason: contains not printable characters */
    public static boolean m1503(Object obj) {
        if (C0015.m447() >= 0) {
            return ((File) obj).mkdirs();
        }
        return false;
    }

    /* renamed from: ظﻁﺩﻍ  reason: contains not printable characters */
    public static ScheduledFuture m1504(Object obj, Object obj2, long j, long j2, Object obj3) {
        if (C0056.m2341() < 0) {
            return ((ScheduledExecutorService) obj).scheduleWithFixedDelay((Runnable) obj2, j, j2, (TimeUnit) obj3);
        }
        return null;
    }

    /* renamed from: لﺵاش  reason: contains not printable characters */
    public static String m1505() {
        if (C0037.m1870() >= 0) {
            return "Referer";
        }
        return null;
    }

    /* renamed from: وتﺕه  reason: contains not printable characters */
    public static SharedPreferences.Editor m1506(Object obj) {
        if (C0053.m2279() <= 0) {
            return ((SharedPreferences) obj).edit();
        }
        return null;
    }

    /* renamed from: يذاق  reason: contains not printable characters */
    public static String m1507() {
        if (C0051.m2229() <= 0) {
            return "默认";
        }
        return null;
    }

    /* renamed from: ﺙخـف  reason: contains not printable characters */
    public static double m1508(Object obj) {
        if (C0027.m1588() >= 0) {
            return ((H7) obj).F5();
        }
        return 0.0d;
    }

    /* renamed from: ﺝﺥشﺯ  reason: contains not printable characters */
    public static String m1509(Object obj, Object obj2) {
        if (C0056.m2341() <= 0) {
            return RS.yq((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ﺡقفﻉ  reason: contains not printable characters */
    public static String m1510(Object obj, Object obj2) {
        if (C0054.m2295() <= 0) {
            return V3.M((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ﺥلﺱﺏ  reason: contains not printable characters */
    public static iX m1511(Object obj, Object obj2) {
        if (C0039.m1918() <= 0) {
            return ((iX) obj).tF((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺩﺵثﻕ  reason: contains not printable characters */
    public static String m1512(Object obj) {
        if (C0055.m2324() >= 0) {
            return ((String) obj).trim();
        }
        return null;
    }

    /* renamed from: ﺫﺡﻕع  reason: contains not printable characters */
    public static String m1514(Object obj) {
        if (C0014.m418() >= 0) {
            return ((C0103fp) obj).SN;
        }
        return null;
    }

    /* renamed from: ﺭﺝﻅﻉ  reason: contains not printable characters */
    public static List m1515(Object obj) {
        if (C0041.m1981() < 0) {
            return ((C0203xU) obj).Fz();
        }
        return null;
    }

    /* renamed from: ﺱﺝﻅع  reason: contains not printable characters */
    public static String m1516(String str) {
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

    /* renamed from: ﺵﺭﺙش  reason: contains not printable characters */
    public static String m1517() {
        if (C0033.m1755() < 0) {
            return "ucSt";
        }
        return null;
    }

    /* renamed from: ﻁﺙﻱر  reason: contains not printable characters */
    public static Intent m1518(Object obj, Object obj2) {
        if (C0038.m1893() <= 0) {
            return ((Intent) obj).setComponent((ComponentName) obj2);
        }
        return null;
    }

    /* renamed from: ﻉﺵبو  reason: contains not printable characters */
    public static boolean m1519(Object obj) {
        if (C0048.m2140() < 0) {
            return Rc.g9((String) obj);
        }
        return false;
    }

    /* renamed from: ﻍدﺝه  reason: contains not printable characters */
    public static HashMap m1520() {
        if (C0007.m214() <= 0) {
            return Rc.yq();
        }
        return null;
    }

    /* renamed from: ﻍذﻙش  reason: contains not printable characters */
    public static String m1521() {
        if (C0012.m378() <= 0) {
            return "?do=UC&type=sub&subFile_id=";
        }
        return null;
    }

    /* renamed from: ﻙﻭﺕب  reason: contains not printable characters */
    public static SharedPreferences.Editor m1522(Object obj, Object obj2, long j) {
        if (C0030.m1683() > 0) {
            return ((SharedPreferences.Editor) obj).putLong((String) obj2, j);
        }
        return null;
    }

    /* renamed from: ﻝﻡﺫﺩ  reason: contains not printable characters */
    public static Object m1523() {
        if (C0011.m344() >= 0) {
            return JSONObject.NULL;
        }
        return null;
    }

    /* renamed from: ﻡرﺝﻩ  reason: contains not printable characters */
    public static boolean m1524(Object obj) {
        if (C0022.m1429() <= 0) {
            return ((File) obj).canWrite();
        }
        return false;
    }

    /* renamed from: ﻩسقت  reason: contains not printable characters */
    public static boolean m1525(Object obj) {
        if (C0025.m1534() <= 0) {
            return ((C0203xU) obj).ee();
        }
        return false;
    }

    /* renamed from: ﻭﺎﺵح  reason: contains not printable characters */
    public static void m1526(Object obj, Object obj2) {
        if (C0057.m2368() >= 0) {
            ((Cloud_ali) obj).setFlag((String) obj2);
        }
    }

    /* renamed from: ﻱﻕرﺩ  reason: contains not printable characters */
    public static void m1527(Object obj, Object obj2) {
        if (C0033.m1755() <= 0) {
            ((Nh) obj).s((String) obj2);
        }
    }

    /* renamed from: ﺩﻉﺽز  reason: contains not printable characters */
    public static String m1513(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
