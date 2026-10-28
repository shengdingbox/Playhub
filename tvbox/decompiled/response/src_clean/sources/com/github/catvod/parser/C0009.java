package com.github.catvod.parser;

import android.os.Handler;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.KkSs;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0059Dl;
import com.github.catvod.spider.merge.C0080aF;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.DC;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.OM;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Zc;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.n6;
import com.github.catvod.spider.merge.tX;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
/* renamed from: com.github.catvod.parser.فﺵﺱﻡ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0009 {

    /* renamed from: ﻁثاﺱ  reason: contains not printable characters */
    public static int f9 = -378;

    /* renamed from: اﺎﻱﻅ  reason: contains not printable characters */
    public static gU m259(Object obj, Object obj2) {
        if (C0050.m2221() <= 0) {
            return ((gU) obj).zH((String) obj2);
        }
        return null;
    }

    /* renamed from: بذﻱﻩ  reason: contains not printable characters */
    public static String m260(Object obj, Object obj2) {
        if (C0050.m2221() < 0) {
            return URLEncoder.encode((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ثمﺯﺭ  reason: contains not printable characters */
    public static File m261(Object obj) {
        if (C0052.m2256() >= 0) {
            return ((C0203xU) obj).un();
        }
        return null;
    }

    /* renamed from: ثيﻍق  reason: contains not printable characters */
    public static String m262(Object obj) {
        if (C0040.m1954() < 0) {
            return ((Nh) obj).W();
        }
        return null;
    }

    /* renamed from: جغكا  reason: contains not printable characters */
    public static String m263(Object obj) {
        if (C0012.m378() <= 0) {
            return ((n6) obj).tF();
        }
        return null;
    }

    /* renamed from: ذﺏﻉط  reason: contains not printable characters */
    public static void m264(Object obj, Object obj2) {
        if (C0010.m301() >= 0) {
            ((tX) obj).U((String) obj2);
        }
    }

    /* renamed from: صﺥيق  reason: contains not printable characters */
    public static String m265() {
        if (C0037.m1870() >= 0) {
            return "已启动外置播放器播放";
        }
        return null;
    }

    /* renamed from: غدنج  reason: contains not printable characters */
    public static HashMap m266(Object obj, Object obj2) {
        if (C0012.m378() <= 0) {
            return ((C0203xU) obj).H((String) obj2);
        }
        return null;
    }

    /* renamed from: مﺕﺩﻱ  reason: contains not printable characters */
    public static String m267() {
        if (C0034.m1793() <= 0) {
            return C0080aF.G4;
        }
        return null;
    }

    /* renamed from: وﺹسد  reason: contains not printable characters */
    public static void m268(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0034.m1793() <= 0) {
            ((KkSs) obj).requestWebsites((String[]) obj2, (List) obj3, (String) obj4);
        }
    }

    /* renamed from: ﺏهثﻡ  reason: contains not printable characters */
    public static String m269(Object obj) {
        if (C0056.m2341() <= 0) {
            return ((Nh) obj).tF();
        }
        return null;
    }

    /* renamed from: ﺕظجﻩ  reason: contains not printable characters */
    public static Locale m270() {
        if (C0013.m382() <= 0) {
            return Locale.getDefault();
        }
        return null;
    }

    /* renamed from: ﺙثﺹظ  reason: contains not printable characters */
    public static String m271(Object obj) {
        if (C0053.m2279() <= 0) {
            return ((C0059Dl) obj).W();
        }
        return null;
    }

    /* renamed from: ﺝاذس  reason: contains not printable characters */
    public static List m272(Object obj) {
        if (C0012.m378() <= 0) {
            return ((Zc) obj).yq();
        }
        return null;
    }

    /* renamed from: ﺡﺯسﻅ  reason: contains not printable characters */
    public static String m273(String str) {
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

    /* renamed from: ﺡﻡﺙﺝ  reason: contains not printable characters */
    public static boolean m274(Object obj, Object obj2) {
        if (C0036.m1838() <= 0) {
            return ((HashSet) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ﺥشثﻍ  reason: contains not printable characters */
    public static String m275(Object obj, Object obj2) {
        if (C0052.m2256() > 0) {
            return Rc.F5((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ﺥضتش  reason: contains not printable characters */
    public static int m276() {
        return 697 ^ C0024.f82;
    }

    /* renamed from: ﺱـﻅف  reason: contains not printable characters */
    public static Object m278(Object obj, int i) {
        if (C0013.m382() <= 0) {
            return ((ArrayList) obj).remove(i);
        }
        return null;
    }

    /* renamed from: ﺵبﺝﻝ  reason: contains not printable characters */
    public static String m279(Object obj) {
        if (C0057.m2368() >= 0) {
            return DC.q((String) obj);
        }
        return null;
    }

    /* renamed from: ﺹرﻙﻕ  reason: contains not printable characters */
    public static String m280() {
        if (C0048.m2140() <= 0) {
            return "请选择下载工具";
        }
        return null;
    }

    /* renamed from: ﺽنﻉﻱ  reason: contains not printable characters */
    public static int m281(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﻅﻉظﻡ  reason: contains not printable characters */
    public static String m282(Object obj) {
        if (C0045.m2093() >= 0) {
            return ((Nh) obj).zH();
        }
        return null;
    }

    /* renamed from: ﻍخفص  reason: contains not printable characters */
    public static HashMap m283(Object obj) {
        if (C0056.m2341() <= 0) {
            return Rc.O((String) obj);
        }
        return null;
    }

    /* renamed from: ﻕاﺥﺹ  reason: contains not printable characters */
    public static void m284(Object obj, Object obj2) {
        if (C0001.m25() <= 0) {
            ((ME) obj).B((String) obj2);
        }
    }

    /* renamed from: ﻕدذص  reason: contains not printable characters */
    public static String m285(Object obj) {
        if (C0035.m1802() >= 0) {
            return ((OM) obj).zH();
        }
        return null;
    }

    /* renamed from: ﻕضيﺫ  reason: contains not printable characters */
    public static boolean m286(Object obj, Object obj2) {
        if (C0035.m1802() >= 0) {
            return ((Handler) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* renamed from: ﻕﺙخﻅ  reason: contains not printable characters */
    public static String m287() {
        if (C0013.m382() < 0) {
            return "1/clouddrive/file/delete?pr=ucpro&fr=pc&uc_param_str=";
        }
        return null;
    }

    /* renamed from: ﺯﻝوه  reason: contains not printable characters */
    public static String m277(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
