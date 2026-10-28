package com.github.catvod.spider.merge;

import android.net.Uri;
import android.os.Build;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.Cloud_ali;
import com.github.catvod.spider.Pan;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.ـﺹعش  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0027 {

    /* renamed from: ﺎﻡﻅض  reason: contains not printable characters */
    public static int f85 = -639;

    /* renamed from: بنﻩﻁ  reason: contains not printable characters */
    public static String m1573(Object obj) {
        if (C0036.m1838() < 0) {
            return ((Yv) obj).Gc();
        }
        return null;
    }

    /* renamed from: جﺕﻩﻱ  reason: contains not printable characters */
    public static String m1574() {
        if (C0048.m2140() <= 0) {
            return "{\"action_type\":1,\"to_pdir_fid\":\"%s\",\"filelist\":%s,\"exclude_fids\":[]}";
        }
        return null;
    }

    /* renamed from: حفﺎﺕ  reason: contains not printable characters */
    public static int m1575(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: خﻡﻅﻉ  reason: contains not printable characters */
    public static void m1576(Object obj) {
        if (C0047.m2134() <= 0) {
            FO.W((String) obj);
        }
    }

    /* renamed from: خﻱﺕه  reason: contains not printable characters */
    public static boolean m1577(Object obj) {
        if (C0000.m13() > 0) {
            return ((List) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ذﻉﺝﻁ  reason: contains not printable characters */
    public static String m1578(String str) {
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

    /* renamed from: زلظﻉ  reason: contains not printable characters */
    public static void m1579(Object obj, Object obj2) {
        if (C0028.m1612() <= 0) {
            ((Z) obj).O((String) obj2);
        }
    }

    /* renamed from: سراي  reason: contains not printable characters */
    public static String m1580(Object obj) {
        if (C0029.m1639() >= 0) {
            return ((GW) obj).yq();
        }
        return null;
    }

    /* renamed from: شاﻡﺥ  reason: contains not printable characters */
    public static MessageDigest m1581(Object obj) {
        if (C0010.m301() > 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: شﺯﻉو  reason: contains not printable characters */
    public static boolean m1582(Object obj, Object obj2) {
        if (C0015.m447() >= 0) {
            return ((Set) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ظغخح  reason: contains not printable characters */
    public static void m1583(Object obj, Object obj2) {
        if (C0021.m1415() > 0) {
            ((Nh) obj).O((String) obj2);
        }
    }

    /* renamed from: فجﺽك  reason: contains not printable characters */
    public static String m1584(Object obj) {
        if (C0053.m2279() < 0) {
            return ((IL) obj).tF();
        }
        return null;
    }

    /* renamed from: فﺯضـ  reason: contains not printable characters */
    public static JSONObject m1585(Object obj, Object obj2) {
        if (C0038.m1893() < 0) {
            return Rc.OW((String) obj, (JSONObject) obj2);
        }
        return null;
    }

    /* renamed from: لﻭﻡص  reason: contains not printable characters */
    public static String m1586(Object obj) {
        if (m1588() >= 0) {
            return ((C0103fp) obj).yq;
        }
        return null;
    }

    /* renamed from: ﺡـحم  reason: contains not printable characters */
    public static void m1587(Object obj, Object obj2, Object obj3) {
        if (C0056.m2341() < 0) {
            ((Pan.KeyValueData) obj).put((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ﺡﺙﻅﺫ  reason: contains not printable characters */
    public static int m1588() {
        return (-448) ^ C0025.f83;
    }

    /* renamed from: ﺡﺥﺎب  reason: contains not printable characters */
    public static String m1589(Object obj) {
        if (C0024.m1502() >= 0) {
            return ((tX) obj).G4();
        }
        return null;
    }

    /* renamed from: ﺡﻁﺯد  reason: contains not printable characters */
    public static HashMap m1590(Object obj, Object obj2, int i) {
        if (m1588() >= 0) {
            return Rc.N((String) obj, (String) obj2, i);
        }
        return null;
    }

    /* renamed from: ﺫثﻱﻉ  reason: contains not printable characters */
    public static File m1591(Object obj) {
        if (C0014.m418() >= 0) {
            return M4.yq((String) obj);
        }
        return null;
    }

    /* renamed from: ﺫملﻍ  reason: contains not printable characters */
    public static int m1592(Object obj, Object obj2) {
        if (C0007.m214() <= 0) {
            return ((String) obj).indexOf((String) obj2);
        }
        return 0;
    }

    /* renamed from: ﺫﺹدﺕ  reason: contains not printable characters */
    public static String m1593(Object obj) {
        if (C0026.m1561() < 0) {
            return ((Uri) obj).getLastPathSegment();
        }
        return null;
    }

    /* renamed from: ﺱاحﺯ  reason: contains not printable characters */
    public static String m1594() {
        if (C0023.m1475() >= 0) {
            return Build.PRODUCT;
        }
        return null;
    }

    /* renamed from: ﺱثﺎل  reason: contains not printable characters */
    public static String m1595(char c) {
        if (C0001.m25() <= 0) {
            return String.valueOf(c);
        }
        return null;
    }

    /* renamed from: ﺱنﺡﺹ  reason: contains not printable characters */
    public static void m1596(Object obj, int i) {
        if (C0043.m2042() < 0) {
            ((ByteArrayOutputStream) obj).write(i);
        }
    }

    /* renamed from: ﺱﺏﺙﺡ  reason: contains not printable characters */
    public static int m1597(Object obj) {
        if (C0049.m2194() <= 0) {
            return ((N) obj).H();
        }
        return 0;
    }

    /* renamed from: ﺵهﻝـ  reason: contains not printable characters */
    public static boolean m1598() {
        if (C0057.m2368() >= 0) {
            return Cloud_ali.N;
        }
        return false;
    }

    /* renamed from: ﺽﻩﺫل  reason: contains not printable characters */
    public static String m1599(Object obj) {
        if (C0009.m276() >= 0) {
            return ((C0059Dl) obj).v();
        }
        return null;
    }

    /* renamed from: ﻅقبﺏ  reason: contains not printable characters */
    public static String m1600() {
        if (C0038.m1893() < 0) {
            return "&client_secret=";
        }
        return null;
    }

    /* renamed from: ﻡبدث  reason: contains not printable characters */
    public static iX m1602(Object obj, Object obj2) {
        if (C0054.m2295() < 0) {
            return ((iX) obj).yq((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻡعصـ  reason: contains not printable characters */
    public static JSONObject m1603() {
        if (m1588() > 0) {
            return C0080aF.G;
        }
        return null;
    }

    /* renamed from: ﻡﺱﺭك  reason: contains not printable characters */
    public static int m1604(Object obj, Object obj2, int i) {
        if (C0043.m2042() <= 0) {
            return ((String) obj).indexOf((String) obj2, i);
        }
        return 0;
    }

    /* renamed from: ﻩﺕكﺡ  reason: contains not printable characters */
    public static String m1605() {
        if (C0000.m13() > 0) {
            return "limit[{0}]";
        }
        return null;
    }

    /* renamed from: ﻕقوص  reason: contains not printable characters */
    public static String m1601(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
