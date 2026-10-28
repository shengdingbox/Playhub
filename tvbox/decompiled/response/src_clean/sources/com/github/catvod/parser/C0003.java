package com.github.catvod.parser;

import android.content.DialogInterface;
import android.net.Uri;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.merge.A4;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0103fp;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.Yv;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.fk;
import com.github.catvod.spider.merge.w2;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.زثﻩس  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0003 {

    /* renamed from: امﺩﺥ  reason: contains not printable characters */
    public static int f3 = 698;

    /* renamed from: ثظﺫﻝ  reason: contains not printable characters */
    public static byte[] m80(Object obj, Object obj2, Object obj3) {
        if (C0044.m2051() <= 0) {
            return A4.SN((byte[]) obj, (byte[]) obj2, (byte[]) obj3);
        }
        return null;
    }

    /* renamed from: ثفصش  reason: contains not printable characters */
    public static int m81() {
        return (-477) ^ C0042.f100;
    }

    /* renamed from: خدﺎﺕ  reason: contains not printable characters */
    public static String m82(Object obj) {
        if (C0004.m129() <= 0) {
            return Nh.SN(obj);
        }
        return null;
    }

    /* renamed from: ذشﺽي  reason: contains not printable characters */
    public static List m83(Object obj) {
        if (C0045.m2093() > 0) {
            return ((H7) obj).M();
        }
        return null;
    }

    /* renamed from: ذعست  reason: contains not printable characters */
    public static int m84(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: رضﻭت  reason: contains not printable characters */
    public static List m85(Object obj) {
        if (m81() > 0) {
            return ((V) obj).s();
        }
        return null;
    }

    /* renamed from: شﻡﻱم  reason: contains not printable characters */
    public static void m87(Object obj, Object obj2) {
        if (C0057.m2368() >= 0) {
            ((MessageDigest) obj).update((byte[]) obj2);
        }
    }

    /* renamed from: شﻭﺕن  reason: contains not printable characters */
    public static URI m88(Object obj) {
        if (C0042.m1998() < 0) {
            return URI.create((String) obj);
        }
        return null;
    }

    /* renamed from: طﻩصذ  reason: contains not printable characters */
    public static InitOrigin m89() {
        if (C0045.m2093() >= 0) {
            return InitOrigin.get();
        }
        return null;
    }

    /* renamed from: طﻱﻝغ  reason: contains not printable characters */
    public static Object m90(Object obj, int i) {
        if (C0023.m1475() > 0) {
            return ((ArrayList) obj).get(i);
        }
        return null;
    }

    /* renamed from: فﺝوﻅ  reason: contains not printable characters */
    public static String m91(Object obj, Object obj2) {
        if (C0025.m1534() < 0) {
            return ((String) obj).toUpperCase((Locale) obj2);
        }
        return null;
    }

    /* renamed from: قتﺹز  reason: contains not printable characters */
    public static Iterator m92(Object obj) {
        if (C0039.m1918() < 0) {
            return ((Iterable) obj).iterator();
        }
        return null;
    }

    /* renamed from: كاغن  reason: contains not printable characters */
    public static void m93(Object obj, Object obj2) {
        if (C0015.m447() >= 0) {
            ((Yv) obj).G((String) obj2);
        }
    }

    /* renamed from: مزطﻕ  reason: contains not printable characters */
    public static void m94(Object obj, Object obj2) {
        if (C0022.m1429() < 0) {
            ((ME) obj).v((String) obj2);
        }
    }

    /* renamed from: هرفح  reason: contains not printable characters */
    public static String m95(Object obj) {
        if (C0012.m378() <= 0) {
            return ((fk) obj).yq();
        }
        return null;
    }

    /* renamed from: وﻩﺥﺙ  reason: contains not printable characters */
    public static String m96(Object obj) {
        if (C0026.m1561() < 0) {
            return ((H7) obj).KJ();
        }
        return null;
    }

    /* renamed from: يقعث  reason: contains not printable characters */
    public static DialogInterface.OnDismissListener m97() {
        if (C0056.m2341() < 0) {
            return Pan.dismissInputQRCode();
        }
        return null;
    }

    /* renamed from: يﺙﺎا  reason: contains not printable characters */
    public static Uri m98(Object obj) {
        if (C0056.m2341() < 0) {
            return ((Uri.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ﺕثﻉت  reason: contains not printable characters */
    public static void m99(Object obj) {
        if (C0048.m2140() <= 0) {
            ((RQ) obj).w();
        }
    }

    /* renamed from: ﺕظﺵﻙ  reason: contains not printable characters */
    public static void m100(Object obj) {
        if (C0034.m1793() <= 0) {
            ((DialogInterface) obj).dismiss();
        }
    }

    /* renamed from: ﺕﺫخﻭ  reason: contains not printable characters */
    public static HashMap m101(Object obj, Object obj2) {
        if (C0002.m60() <= 0) {
            return ((Z) obj).n((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺙﻉﻍغ  reason: contains not printable characters */
    public static String m102(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0008.m250() >= 0) {
            return C0068Pe.G4((String) obj, (Map) obj2, (Map) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ﺝﻡﻅت  reason: contains not printable characters */
    public static int m103(Object obj) {
        if (C0000.m13() > 0) {
            return ((w2) obj).SN();
        }
        return 0;
    }

    /* renamed from: ﺡﻅﻩج  reason: contains not printable characters */
    public static String m104(Object obj) {
        if (C0055.m2324() >= 0) {
            return ((C0103fp) obj).N;
        }
        return null;
    }

    /* renamed from: ﺥخﺩق  reason: contains not printable characters */
    public static String m105() {
        if (C0024.m1502() > 0) {
            return cn.SN;
        }
        return null;
    }

    /* renamed from: ﺫﻉتﻕ  reason: contains not printable characters */
    public static String m106(Object obj, Object obj2, Object obj3, int i) {
        if (C0008.m250() >= 0) {
            return C0068Pe.ee((String) obj, (Map) obj2, (String) obj3, i);
        }
        return null;
    }

    /* renamed from: ﺭﺱاف  reason: contains not printable characters */
    public static Object m107(Object obj) {
        if (C0033.m1755() <= 0) {
            return Objects.requireNonNull(obj);
        }
        return null;
    }

    /* renamed from: ﺵﺏصد  reason: contains not printable characters */
    public static PrintStream m108() {
        if (C0043.m2042() < 0) {
            return System.out;
        }
        return null;
    }

    /* renamed from: ﺵﻩﻭج  reason: contains not printable characters */
    public static String m109(double d) {
        if (C0029.m1639() >= 0) {
            return Rc.v3(d);
        }
        return null;
    }

    /* renamed from: ﺹﻕﺵﺽ  reason: contains not printable characters */
    public static String m110() {
        if (C0008.m250() >= 0) {
            return "cookie";
        }
        return null;
    }

    /* renamed from: ﺽـﺩﺕ  reason: contains not printable characters */
    public static String m111() {
        if (C0034.m1793() <= 0) {
            return " ";
        }
        return null;
    }

    /* renamed from: ﺽيوت  reason: contains not printable characters */
    public static String m112() {
        if (C0055.m2324() >= 0) {
            return "{\"1\":[{\"name\":\"类型\",\"key\":\"tid\",\"value\":[{\"n\":\"全部\",\"v\":\"1\"},{\"n\":\"动作片\",\"v\":\"5\"},{\"n\":\"喜剧片\",\"v\":\"6\"},{\"n\":\"爱情片\",\"v\":\"7\"},{\"n\":\"科幻片\",\"v\":\"8\"},{\"n\":\"恐怖片\",\"v\":\"9\"},{\"n\":\"剧情片\",\"v\":\"10\"},{\"n\":\"战争片\",\"v\":\"11\"},{\"n\":\"惊悚片\",\"v\":\"16\"},{\"n\":\"奇幻片\",\"v\":\"17\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"米国\",\"v\":\"米国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"马来西亚\",\"v\":\"马来西亚\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"}]},{\"name\":\"排序\",\"key\":\"by\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"2\":[{\"name\":\"类型\",\"key\":\"tid\",\"value\":[{\"n\":\"全部\",\"v\":\"2\"},{\"n\":\"国产剧\",\"v\":\"12\"},{\"n\":\"港台剧\",\"v\":\"13\"},{\"n\":\"日韩剧\",\"v\":\"14\"},{\"n\":\"欧美剧\",\"v\":\"15\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"米国\",\"v\":\"米国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"马来西亚\",\"v\":\"马来西亚\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"}]},{\"name\":\"排序\",\"key\":\"by\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"3\":[{\"name\":\"类型\",\"key\":\"tid\",\"value\":[{\"n\":\"全部\",\"v\":\"3\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"米国\",\"v\":\"米国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"马来西亚\",\"v\":\"马来西亚\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"}]},{\"name\":\"排序\",\"key\":\"by\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"4\":[{\"name\":\"类型\",\"key\":\"tid\",\"value\":[{\"n\":\"全部\",\"v\":\"4\"},{\"n\":\"动漫剧\",\"v\":\"18\"},{\"n\":\"动漫片\",\"v\":\"19\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"米国\",\"v\":\"米国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"马来西亚\",\"v\":\"马来西亚\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"}]},{\"name\":\"排序\",\"key\":\"by\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}]}";
        }
        return null;
    }

    /* renamed from: ﻁﺙﻱر  reason: contains not printable characters */
    public static String m113(String str) {
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

    /* renamed from: ﻉﺭشﺕ  reason: contains not printable characters */
    public static Object m114(Object obj, Object obj2) {
        if (C0048.m2140() <= 0) {
            return ((JSONObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻕطهﻉ  reason: contains not printable characters */
    public static Boolean m115(Object obj, Object obj2) {
        if (C0038.m1893() < 0) {
            return ((RQ) obj).Z((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻕﻩبج  reason: contains not printable characters */
    public static boolean m116(Object obj, Object obj2) {
        if (C0029.m1639() >= 0) {
            return ((ArrayList) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ﻙيقﺵ  reason: contains not printable characters */
    public static String m117() {
        if (C0045.m2093() > 0) {
            return "uc_ut";
        }
        return null;
    }

    /* renamed from: ﻙﺵسﺱ  reason: contains not printable characters */
    public static boolean m118(Object obj, long j, Object obj2) {
        if (C0053.m2279() <= 0) {
            return ((ExecutorService) obj).awaitTermination(j, (TimeUnit) obj2);
        }
        return false;
    }

    /* renamed from: زبشﻩ  reason: contains not printable characters */
    public static String m86(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
