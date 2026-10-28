package com.github.catvod.spider;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.A4;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0103fp;
import com.github.catvod.spider.merge.C0170rC;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.LP;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.lm;
import com.github.catvod.spider.merge.tX;
import com.github.catvod.spider.merge.xa;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.security.Key;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import javax.crypto.Cipher;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.صﺫثل  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0049 {

    /* renamed from: ﺕظﻙﻕ  reason: contains not printable characters */
    public static int f107 = 344;

    /* renamed from: الﺥﺱ  reason: contains not printable characters */
    public static String m2169() {
        if ((-767) ^ C0037.f95 > 0) {
            return Pan.Gd;
        }
        return null;
    }

    /* renamed from: تغكز  reason: contains not printable characters */
    public static String m2170(Object obj) {
        if ((-703) ^ C0036.f94 <= 0) {
            return ((tX) obj).q();
        }
        return null;
    }

    /* renamed from: تﺭلق  reason: contains not printable characters */
    public static String m2171(String str) {
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

    /* renamed from: حﺫمع  reason: contains not printable characters */
    public static String m2172(Object obj, Object obj2, boolean z, int i) {
        if (916 ^ C0002.f2 >= 0) {
            return ((V) obj).F5((H7) obj2, z, i);
        }
        return null;
    }

    /* renamed from: دﻕسز  reason: contains not printable characters */
    public static Nh m2173(Object obj) {
        if ((-886) ^ C0021.f79 <= 0) {
            return Nh.OW((String) obj);
        }
        return null;
    }

    /* renamed from: دﻙﻁﺹ  reason: contains not printable characters */
    public static boolean m2174(Object obj) {
        if ((-185) ^ C0033.f91 >= 0) {
            return ((C0103fp) obj).i;
        }
        return false;
    }

    /* renamed from: شﺏﻍﺱ  reason: contains not printable characters */
    public static int m2176(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: غشﻕﺥ  reason: contains not printable characters */
    public static String m2177(Object obj) {
        if ((-540) ^ C0001.f1 >= 0) {
            return ((Nh) obj).KJ();
        }
        return null;
    }

    /* renamed from: غضسﺫ  reason: contains not printable characters */
    public static String m2178(Object obj, Object obj2) {
        if (36 ^ C0033.f91 <= 0) {
            return iX.g9((List) obj, (LinkedHashMap) obj2);
        }
        return null;
    }

    /* renamed from: غﻡاﺎ  reason: contains not printable characters */
    public static File m2179(Object obj) {
        if (m2194() <= 0) {
            return ((RQ) obj).O();
        }
        return null;
    }

    /* renamed from: ـسحﺱ  reason: contains not printable characters */
    public static Object m2180(Object obj, Object obj2) {
        if ((-448) ^ C0025.f83 > 0) {
            return ((JSONObject) obj).remove((String) obj2);
        }
        return null;
    }

    /* renamed from: فﺎمر  reason: contains not printable characters */
    public static String m2181() {
        if (515 ^ C0028.f86 > 0) {
            return "callPlayMode";
        }
        return null;
    }

    /* renamed from: قﺯﺹر  reason: contains not printable characters */
    public static int m2182(Object obj, Object obj2) {
        if ((-1021) ^ C0026.f84 < 0) {
            return ((InputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* renamed from: نﺽﺙـ  reason: contains not printable characters */
    public static String m2183(Object obj) {
        if ((-985) ^ C0024.f82 <= 0) {
            return A4.N((byte[]) obj);
        }
        return null;
    }

    /* renamed from: وﺵﺎن  reason: contains not printable characters */
    public static xa m2184() {
        if ((-558) ^ C0039.f97 <= 0) {
            return xa.yq;
        }
        return null;
    }

    /* renamed from: يﺝﺩﺱ  reason: contains not printable characters */
    public static int m2185(Object obj, Object obj2) {
        if ((-703) ^ C0036.f94 <= 0) {
            return ((String) obj).lastIndexOf((String) obj2);
        }
        return 0;
    }

    /* renamed from: ﺎﻙﻭه  reason: contains not printable characters */
    public static String m2186() {
        if ((-767) ^ C0037.f95 >= 0) {
            return iX.i();
        }
        return null;
    }

    /* renamed from: ﺏﻙضﻅ  reason: contains not printable characters */
    public static long m2187(Object obj, Object obj2, long j) {
        if (923 ^ C0041.f99 <= 0) {
            return ((JSONObject) obj).optLong((String) obj2, j);
        }
        return 0L;
    }

    /* renamed from: ﺙثلﺭ  reason: contains not printable characters */
    public static TimeZone m2188(Object obj) {
        if ((-448) ^ C0025.f83 >= 0) {
            return TimeZone.getTimeZone((String) obj);
        }
        return null;
    }

    /* renamed from: ﺝﺥسﺫ  reason: contains not printable characters */
    public static Intent m2189(Object obj, Object obj2) {
        if ((-1021) ^ C0026.f84 < 0) {
            return ((Intent) obj).setData((Uri) obj2);
        }
        return null;
    }

    /* renamed from: ﺥﻙصﺡ  reason: contains not printable characters */
    public static boolean m2190() {
        if ((-26) ^ C0033.f91 >= 0) {
            return cn.yq;
        }
        return false;
    }

    /* renamed from: ﺯذﺫو  reason: contains not printable characters */
    public static String m2191(Object obj) {
        if (916 ^ C0002.f2 > 0) {
            return Rc.KJ((String) obj);
        }
        return null;
    }

    /* renamed from: ﺱقـم  reason: contains not printable characters */
    public static String m2192(long j) {
        if (930 ^ C0038.f96 < 0) {
            return String.valueOf(j);
        }
        return null;
    }

    /* renamed from: ﺹﺭفك  reason: contains not printable characters */
    public static InputStream m2193(Object obj) {
        if ((-185) ^ C0033.f91 > 0) {
            return Channels.newInputStream((ReadableByteChannel) obj);
        }
        return null;
    }

    /* renamed from: ﻁﺽكف  reason: contains not printable characters */
    public static int m2194() {
        return (-31) ^ C0006.f6;
    }

    /* renamed from: ﻅﺏصل  reason: contains not printable characters */
    public static String m2195(Object obj, Object obj2, boolean z, Object obj3) {
        if ((-604) ^ C0013.f13 >= 0) {
            return ((T4) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﻍـجﺽ  reason: contains not printable characters */
    public static void m2196(Object obj, int i, Object obj2) {
        if (515 ^ C0028.f86 >= 0) {
            ((Cipher) obj).init(i, (Key) obj2);
        }
    }

    /* renamed from: ﻩقظﺥ  reason: contains not printable characters */
    public static String m2197() {
        if (658 ^ C0029.f87 <= 0) {
            return Build.DEVICE;
        }
        return null;
    }

    /* renamed from: ﻭـثه  reason: contains not printable characters */
    public static String m2198(Object obj) {
        if ((-448) ^ C0025.f83 >= 0) {
            return ((LP) obj).KJ();
        }
        return null;
    }

    /* renamed from: ﻱحتﻅ  reason: contains not printable characters */
    public static lm m2199(Object obj) {
        if ((-477) ^ C0042.f100 >= 0) {
            return ((C0170rC) obj).yq();
        }
        return null;
    }

    /* renamed from: ﻱﺎمص  reason: contains not printable characters */
    public static String m2200(Object obj, Object obj2, Object obj3) {
        if ((-26) ^ C0033.f91 > 0) {
            return ((Kanqiu) obj).xxteaDecrypt((byte[]) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﻱﺩبس  reason: contains not printable characters */
    public static void m2201(Object obj) {
        if ((-703) ^ C0036.f94 <= 0) {
            ((InputStream) obj).close();
        }
    }

    /* renamed from: زحشﺵ  reason: contains not printable characters */
    public static String m2175(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
