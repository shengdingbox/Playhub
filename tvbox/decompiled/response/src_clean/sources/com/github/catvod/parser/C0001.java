package com.github.catvod.parser;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.Hmys;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0065Ku;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0188ts;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.IL;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.TA;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.lm;
import com.github.catvod.spider.merge.oU;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* renamed from: com.github.catvod.parser.حتﺭﻕ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0001 {

    /* renamed from: وﺝﻩﺱ  reason: contains not printable characters */
    public static int f1 = -458;

    /* renamed from: ثﺥبع  reason: contains not printable characters */
    public static String m22(Object obj) {
        if (C0008.m250() >= 0) {
            return tX.SN(obj);
        }
        return null;
    }

    /* renamed from: حﻝﺭﺵ  reason: contains not printable characters */
    public static boolean m23(Object obj) {
        if (C0038.m1893() < 0) {
            return ((Nh) obj).Nl();
        }
        return false;
    }

    /* renamed from: سﺡور  reason: contains not printable characters */
    public static String m24() {
        if (C0039.m1918() <= 0) {
            return "{\"1\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"}]}],\"2\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"}]}],\"3\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"更早\",\"v\":\"更早\"}]}],\"4\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"},{\"n\":\"更早\",\"v\":\"更早\"}]}]}";
        }
        return null;
    }

    /* renamed from: صقﺡث  reason: contains not printable characters */
    public static int m25() {
        return (-886) ^ C0021.f79;
    }

    /* renamed from: صﺎضم  reason: contains not printable characters */
    public static StringBuilder m26(Object obj, int i) {
        if (C0039.m1918() < 0) {
            return ((StringBuilder) obj).deleteCharAt(i);
        }
        return null;
    }

    /* renamed from: طﺵذﺹ  reason: contains not printable characters */
    public static void m27(Object obj, Object obj2) {
        if (C0037.m1870() >= 0) {
            ((PrintStream) obj).println((String) obj2);
        }
    }

    /* renamed from: طﻝمﺵ  reason: contains not printable characters */
    public static String m28(String str) {
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

    /* renamed from: غﻁام  reason: contains not printable characters */
    public static Window m29(Object obj) {
        if (C0052.m2256() > 0) {
            return ((Activity) obj).getWindow();
        }
        return null;
    }

    /* renamed from: ـيﺱو  reason: contains not printable characters */
    public static void m30(Object obj) {
        if (C0029.m1639() > 0) {
            ((ExecutorService) obj).shutdown();
        }
    }

    /* renamed from: لنﺥق  reason: contains not printable characters */
    public static String m31() {
        if (C0034.m1793() <= 0) {
            return cn.tF;
        }
        return null;
    }

    /* renamed from: لﺽﻁﻍ  reason: contains not printable characters */
    public static String m32(Object obj, Object obj2) {
        if (C0021.m1415() >= 0) {
            return C0068Pe.W((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: هيﺫﺽ  reason: contains not printable characters */
    public static String m33(Object obj, Object obj2) {
        if (C0020.m1371() <= 0) {
            return ((String) obj).concat((String) obj2);
        }
        return null;
    }

    /* renamed from: يهﺯح  reason: contains not printable characters */
    public static JSONObject m34(Object obj, Object obj2) {
        if (C0056.m2341() < 0) {
            return ((RQ) obj).E1((String) obj2);
        }
        return null;
    }

    /* renamed from: يﻅذش  reason: contains not printable characters */
    public static boolean m36(Object obj) {
        if (C0035.m1802() >= 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* renamed from: ﺏﻩكص  reason: contains not printable characters */
    public static void m37(Object obj) {
        if (C0003.m81() >= 0) {
            ((Z) obj).I();
        }
    }

    /* renamed from: ﺕحتب  reason: contains not printable characters */
    public static String m38(Object obj) {
        if (C0023.m1475() > 0) {
            return Rc.g1((String) obj);
        }
        return null;
    }

    /* renamed from: ﺝﺫﻕع  reason: contains not printable characters */
    public static File m39() {
        if (C0026.m1561() <= 0) {
            return Pan.getPlayModeFilesDir();
        }
        return null;
    }

    /* renamed from: ﺝﻁﺯﻙ  reason: contains not printable characters */
    public static HashMap m40(Object obj, Object obj2) {
        if (C0025.m1534() <= 0) {
            return ((Z) obj).cp((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺡﻩﺏﺹ  reason: contains not printable characters */
    public static int m41(Object obj) {
        if (C0028.m1612() < 0) {
            return C0065Ku.SN((String) obj);
        }
        return 0;
    }

    /* renamed from: ﺫتﻕذ  reason: contains not printable characters */
    public static IL m42(Object obj) {
        if (C0022.m1429() <= 0) {
            return ((IL) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺫيدﺡ  reason: contains not printable characters */
    public static String m43(int i) {
        if (C0043.m2042() < 0) {
            return Hmys.randomDeviceId(i);
        }
        return null;
    }

    /* renamed from: ﺫﺎﺩﺯ  reason: contains not printable characters */
    public static oU m44(Object obj) {
        if (C0025.m1534() <= 0) {
            return oU.SN((String) obj);
        }
        return null;
    }

    /* renamed from: ﻅلﻡت  reason: contains not printable characters */
    public static int m45(int i) {
        if (C0051.m2229() <= 0) {
            return Math.abs(i);
        }
        return 0;
    }

    /* renamed from: ﻍجﻝﺹ  reason: contains not printable characters */
    public static Intent m46(Object obj, Object obj2) {
        if (C0051.m2229() < 0) {
            return ((Intent) obj).setPackage((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻍخفص  reason: contains not printable characters */
    public static Charset m47() {
        if (C0048.m2140() < 0) {
            return TA.SN;
        }
        return null;
    }

    /* renamed from: ﻍكفﺽ  reason: contains not printable characters */
    public static JSONObject m48() {
        if (C0038.m1893() < 0) {
            return FO.B();
        }
        return null;
    }

    /* renamed from: ﻍﺕﺹز  reason: contains not printable characters */
    public static int m49(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻝﻍذـ  reason: contains not printable characters */
    public static String m50(Object obj) {
        if (C0003.m81() > 0) {
            return ((C0188ts) obj).tF();
        }
        return null;
    }

    /* renamed from: ﻡﻍمﻁ  reason: contains not printable characters */
    public static String m51(Object obj, Object obj2, Object obj3) {
        if (C0027.m1588() >= 0) {
            return ((C0203xU) obj).g9((tX) obj2, (File) obj3);
        }
        return null;
    }

    /* renamed from: ﻭامش  reason: contains not printable characters */
    public static String m52(Object obj) {
        if (C0033.m1755() < 0) {
            return ((lm) obj).SN();
        }
        return null;
    }

    /* renamed from: ﻭﺯفب  reason: contains not printable characters */
    public static void m53(Object obj) {
        if (C0021.m1415() >= 0) {
            ((V) obj).G4();
        }
    }

    /* renamed from: يﺡﺏل  reason: contains not printable characters */
    public static String m35(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
