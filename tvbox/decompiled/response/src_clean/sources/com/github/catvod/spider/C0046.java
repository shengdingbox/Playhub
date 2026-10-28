package com.github.catvod.spider;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.LP;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.T1;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.X0;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.k9;
import com.github.catvod.spider.merge.kp;
import com.github.catvod.spider.merge.lm;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.zip.Inflater;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.شﺏهك  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0046 {

    /* renamed from: ـﺎظب  reason: contains not printable characters */
    public static int f104 = 744;

    /* renamed from: تﺥﺕﻍ  reason: contains not printable characters */
    public static String m2099(Object obj) {
        if ((-185) ^ C0033.f91 >= 0) {
            return ((C0203xU) obj).t0;
        }
        return null;
    }

    /* renamed from: تﻩبﻅ  reason: contains not printable characters */
    public static String m2100(String str) {
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

    /* renamed from: حمضﻭ  reason: contains not printable characters */
    public static ME m2101(Object obj, Object obj2, Object obj3) {
        if (813 ^ C0033.f91 < 0) {
            return ((C0203xU) obj).p((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: دثتز  reason: contains not printable characters */
    public static T1 m2102(Object obj) {
        if ((-1021) ^ C0026.f84 <= 0) {
            return T1.i((String) obj);
        }
        return null;
    }

    /* renamed from: زلﻙد  reason: contains not printable characters */
    public static String m2103() {
        if ((-732) ^ f2 <= 0) {
            return ProxyOrigin.getOwnProxyUrl();
        }
        return null;
    }

    /* renamed from: زهﺯر  reason: contains not printable characters */
    public static List m2104(Object obj) {
        if (215 ^ C0038.f96 <= 0) {
            return ((LP) obj).M();
        }
        return null;
    }

    /* renamed from: سكﺭا  reason: contains not printable characters */
    public static int m2105(Object obj) {
        if ((-886) ^ C0021.f79 <= 0) {
            return ((String) obj).length();
        }
        return 0;
    }

    /* renamed from: شذﻉض  reason: contains not printable characters */
    public static List m2106(Object obj) {
        if (624 ^ C0012.f12 <= 0) {
            return ((ExecutorService) obj).shutdownNow();
        }
        return null;
    }

    /* renamed from: صﻩشﻉ  reason: contains not printable characters */
    public static String m2107() {
        if ((-768) ^ C0002.f2 <= 0) {
            return "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/05/08/24442a33d46fd1aeeddda63af4833525.png";
        }
        return null;
    }

    /* renamed from: عﻙﻝل  reason: contains not printable characters */
    public static ApplicationInfo m2108(Object obj, Object obj2, int i) {
        if ((-703) ^ C0036.f94 < 0) {
            return ((PackageManager) obj).getApplicationInfo((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ـبشﻁ  reason: contains not printable characters */
    public static boolean m2109(Object obj, Object obj2) {
        if ((-703) ^ C0036.f94 < 0) {
            return ((Pan) obj).isUc((String) obj2);
        }
        return false;
    }

    /* renamed from: فشقس  reason: contains not printable characters */
    public static void m2110(Object obj, Object obj2) {
        if ((-314) ^ C0002.f2 <= 0) {
            ((Inflater) obj).setInput((byte[]) obj2);
        }
    }

    /* renamed from: فيﻍﺩ  reason: contains not printable characters */
    public static X0 m2111(Object obj) {
        if ((-31) ^ C0006.f6 <= 0) {
            return ((X0) obj).yq();
        }
        return null;
    }

    /* renamed from: كهرغ  reason: contains not printable characters */
    public static int m2112() {
        return (-604) ^ C0013.f13;
    }

    /* renamed from: متطص  reason: contains not printable characters */
    public static boolean m2113(Object obj, Object obj2) {
        if ((-1021) ^ C0026.f84 < 0) {
            return Objects.equals(obj, obj2);
        }
        return false;
    }

    /* renamed from: مـﺯص  reason: contains not printable characters */
    public static String m2114(Object obj, Object obj2, boolean z, Object obj3) {
        if (802 ^ C0052.f110 <= 0) {
            return ((T4) obj).searchContentApi((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: نﺽﺙا  reason: contains not printable characters */
    public static kp m2115(Object obj) {
        if (596 ^ C0009.f9 <= 0) {
            return ((kp) obj).yq();
        }
        return null;
    }

    /* renamed from: هقحﺱ  reason: contains not printable characters */
    public static byte[] m2116(Object obj, Object obj2) {
        if (57 ^ C0032.f90 >= 0) {
            return ((String) obj).getBytes((Charset) obj2);
        }
        return null;
    }

    /* renamed from: ﺕﻡﻕـ  reason: contains not printable characters */
    public static String m2117(Object obj, Object obj2) {
        if ((-31) ^ C0006.f6 <= 0) {
            return V3.N((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ﺙهﺯـ  reason: contains not printable characters */
    public static StringBuilder m2118(Object obj, long j) {
        if ((-768) ^ C0002.f2 <= 0) {
            return ((StringBuilder) obj).append(j);
        }
        return null;
    }

    /* renamed from: ﺝطوق  reason: contains not printable characters */
    public static String m2119(Object obj) {
        if ((-477) ^ C0042.f100 > 0) {
            return ((k9) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺝﻍسم  reason: contains not printable characters */
    public static String m2120(Object obj) {
        if ((-404) ^ C0021.f79 <= 0) {
            return ((tX) obj).v();
        }
        return null;
    }

    /* renamed from: ﺡﺩﺯﺽ  reason: contains not printable characters */
    public static HashMap m2121(Object obj) {
        if ((-388) ^ C0035.f93 < 0) {
            return ((Z) obj).U();
        }
        return null;
    }

    /* renamed from: ﺭكغن  reason: contains not printable characters */
    public static void m2122(Object obj, Object obj2) {
        if ((-556) ^ C0004.f4 < 0) {
            ((H7) obj).H((String) obj2);
        }
    }

    /* renamed from: ﺱﻕظﻍ  reason: contains not printable characters */
    public static iX m2124(Object obj) {
        if (923 ^ C0041.f99 <= 0) {
            return ((iX) obj).G4();
        }
        return null;
    }

    /* renamed from: ﺵﺫﻱم  reason: contains not printable characters */
    public static int m2125(Object obj) {
        if ((-985) ^ C0024.f82 <= 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* renamed from: ﺹزهص  reason: contains not printable characters */
    public static JSONObject m2126(Object obj) {
        if ((-985) ^ C0000.f0 <= 0) {
            return ((RQ) obj).B;
        }
        return null;
    }

    /* renamed from: ﻅريه  reason: contains not printable characters */
    public static boolean m2127(Object obj, Object obj2) {
        if ((-556) ^ C0004.f4 <= 0) {
            return ((JSONObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ﻅعهﺥ  reason: contains not printable characters */
    public static void m2128(Object obj, Object obj2) {
        if ((-824) ^ C0004.f4 < 0) {
            ((tX) obj).E1((String) obj2);
        }
    }

    /* renamed from: ﻍبﺽذ  reason: contains not printable characters */
    public static String m2129(Object obj) {
        if (813 ^ C0033.f91 < 0) {
            return ((lm) obj).q();
        }
        return null;
    }

    /* renamed from: ﻕبزع  reason: contains not printable characters */
    public static int m2130(Object obj) {
        if ((-732) ^ f2 < 0) {
            return ((Buffer) obj).limit();
        }
        return 0;
    }

    /* renamed from: ﻡتﺡض  reason: contains not printable characters */
    public static int m2131(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻡضﺽغ  reason: contains not printable characters */
    public static void m2132(Object obj, Object obj2) {
        if ((-31) ^ C0006.f6 < 0) {
            ((Cloud_baidu) obj).setFlag((String) obj2);
        }
    }

    /* renamed from: ﺯحﺹو  reason: contains not printable characters */
    public static String m2123(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
