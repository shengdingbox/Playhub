package com.github.catvod.spider.merge;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.ﺙثدف  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0031 {

    /* renamed from: اﻁفج  reason: contains not printable characters */
    public static int f89 = -368;

    /* renamed from: اﺭـع  reason: contains not printable characters */
    public static Set m1690(Object obj) {
        if (C0053.m2279() < 0) {
            return ((Map) obj).entrySet();
        }
        return null;
    }

    /* renamed from: ثكحﻙ  reason: contains not printable characters */
    public static IL m1691(Object obj) {
        if (C0041.m1981() < 0) {
            return ((IL) obj).t0();
        }
        return null;
    }

    /* renamed from: جﻙﻉه  reason: contains not printable characters */
    public static List m1692(Object obj) {
        if (C0028.m1612() <= 0) {
            return tX.yq((String) obj);
        }
        return null;
    }

    /* renamed from: دﻅﺥﺵ  reason: contains not printable characters */
    public static void m1693(Object obj, int i, Object obj2) {
        if (C0021.m1415() >= 0) {
            ((List) obj).add(i, obj2);
        }
    }

    /* renamed from: سقكث  reason: contains not printable characters */
    public static boolean m1694(Object obj, Object obj2, Object obj3) {
        if (C0055.m2324() >= 0) {
            return Rc.G((JSONObject) obj, (String) obj2, (String) obj3);
        }
        return false;
    }

    /* renamed from: ظسﺫﻙ  reason: contains not printable characters */
    public static C0104fu m1695(Object obj, Object obj2) {
        if (C0030.m1683() >= 0) {
            return ((C0104fu) obj).SN((String) obj2);
        }
        return null;
    }

    /* renamed from: غﻅﺫﻙ  reason: contains not printable characters */
    public static String m1696() {
        if (C0027.m1588() >= 0) {
            return "用户禁止转存自己";
        }
        return null;
    }

    /* renamed from: قسخﻕ  reason: contains not printable characters */
    public static void m1697(Object obj, Object obj2) {
        if (C0009.m276() >= 0) {
            ((ImageView) obj).setScaleType((ImageView.ScaleType) obj2);
        }
    }

    /* renamed from: مسﻉﺫ  reason: contains not printable characters */
    public static String m1698() {
        if (C0015.m447() >= 0) {
            return "\n";
        }
        return null;
    }

    /* renamed from: منطق  reason: contains not printable characters */
    public static int m1699() {
        return 895 ^ C0024.f82;
    }

    /* renamed from: هﻭﺭض  reason: contains not printable characters */
    public static String m1700(Object obj) {
        if (C0033.m1755() < 0) {
            return zr.yq((String) obj);
        }
        return null;
    }

    /* renamed from: ﺎﺵحﻱ  reason: contains not printable characters */
    public static String m1701(Object obj) {
        if (C0011.m344() >= 0) {
            return Pattern.quote((String) obj);
        }
        return null;
    }

    /* renamed from: ﺏﻍﻱﺝ  reason: contains not printable characters */
    public static String m1702(Object obj) {
        if (C0054.m2295() < 0) {
            return ((n6) obj).i();
        }
        return null;
    }

    /* renamed from: ﺏﻕﺥه  reason: contains not printable characters */
    public static HashMap m1703(Object obj, Object obj2) {
        if (C0025.m1534() <= 0) {
            return ((RQ) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺕﻕظﺯ  reason: contains not printable characters */
    public static byte[] m1704(Object obj) {
        if (C0035.m1802() >= 0) {
            return Rc.v((String) obj);
        }
        return null;
    }

    /* renamed from: ﺝيهﺡ  reason: contains not printable characters */
    public static String m1705() {
        if (C0037.m1870() >= 0) {
            return "";
        }
        return null;
    }

    /* renamed from: ﺝﺡثغ  reason: contains not printable characters */
    public static long m1706(Object obj) {
        if (C0026.m1561() < 0) {
            return ((Date) obj).getTime();
        }
        return 0L;
    }

    /* renamed from: ﺩﺵاز  reason: contains not printable characters */
    public static int m1707() {
        if (C0027.m1588() > 0) {
            return C0080aF.B;
        }
        return 0;
    }

    /* renamed from: ﺫتـﻉ  reason: contains not printable characters */
    public static Yv m1708(Object obj, Object obj2) {
        if (C0048.m2140() <= 0) {
            return ((Yv) obj).dT((String) obj2);
        }
        return null;
    }

    /* renamed from: ﺫنكﺙ  reason: contains not printable characters */
    public static String m1709(Object obj) {
        if (C0034.m1793() < 0) {
            return ((Yv) obj).i();
        }
        return null;
    }

    /* renamed from: ﺭزثﻩ  reason: contains not printable characters */
    public static String m1710(Object obj) {
        if (C0040.m1954() <= 0) {
            return ((C0203xU) obj).M;
        }
        return null;
    }

    /* renamed from: ﺭﺙطف  reason: contains not printable characters */
    public static String m1711(Object obj) {
        if (C0026.m1561() < 0) {
            return ((Nh) obj).G();
        }
        return null;
    }

    /* renamed from: ﺭﻱدي  reason: contains not printable characters */
    public static int m1712(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ﺱاحﺯ  reason: contains not printable characters */
    public static String m1714(String str) {
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

    /* renamed from: ﺵجطﻙ  reason: contains not printable characters */
    public static boolean m1715(Object obj) {
        if (C0029.m1639() > 0) {
            return ((AtomicBoolean) obj).get();
        }
        return false;
    }

    /* renamed from: ﺵﻡيﻅ  reason: contains not printable characters */
    public static AlertDialog.Builder m1716(Object obj, int i, Object obj2) {
        if (C0045.m2093() > 0) {
            return ((AlertDialog.Builder) obj).setPositiveButton(i, (DialogInterface.OnClickListener) obj2);
        }
        return null;
    }

    /* renamed from: ﻁﺯﻭض  reason: contains not printable characters */
    public static String m1717() {
        if (C0012.m378() <= 0) {
            return "save_as";
        }
        return null;
    }

    /* renamed from: ﻁﺵﺯﺹ  reason: contains not printable characters */
    public static boolean m1718(Object obj) {
        if (C0013.m382() <= 0) {
            return ((Z) obj).H();
        }
        return false;
    }

    /* renamed from: ﻉصﺝﺙ  reason: contains not printable characters */
    public static kp m1719(Object obj, Object obj2) {
        if (C0049.m2194() < 0) {
            return ((kp) obj).q((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻉﻍصﺙ  reason: contains not printable characters */
    public static String m1720(Object obj, Object obj2, Object obj3) {
        if (C0015.m447() > 0) {
            return A4.yq((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﻍجﻝﺹ  reason: contains not printable characters */
    public static List m1721(Object obj) {
        if (C0056.m2341() <= 0) {
            return Arrays.asList((Object[]) obj);
        }
        return null;
    }

    /* renamed from: ﻍحدط  reason: contains not printable characters */
    public static void m1722(Object obj, Object obj2) {
        if (C0020.m1371() < 0) {
            ((ViewGroup) obj).removeView((View) obj2);
        }
    }

    /* renamed from: ﻕﻉﺡﻍ  reason: contains not printable characters */
    public static byte[] m1723(Object obj, Object obj2) {
        if (C0002.m60() < 0) {
            return ((Mac) obj).doFinal((byte[]) obj2);
        }
        return null;
    }

    /* renamed from: ﻝﻉفﻭ  reason: contains not printable characters */
    public static String m1724() {
        if (C0044.m2051() < 0) {
            return Build.MODEL;
        }
        return null;
    }

    /* renamed from: ﺯﻅﺭب  reason: contains not printable characters */
    public static String m1713(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
