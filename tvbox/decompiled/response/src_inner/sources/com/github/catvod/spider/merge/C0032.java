package com.github.catvod.spider.merge;

import android.graphics.Bitmap;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.Cloud_baidu;
import com.github.catvod.spider.Cloud_uc;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.ProxyOrigin;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.ﺩخضث  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0032 {

    /* renamed from: ﻕﺵﻉج  reason: contains not printable characters */
    public static int f90 = 119;

    /* renamed from: اﺽﻁﺭ  reason: contains not printable characters */
    public static ME m1725(Object obj, Object obj2) {
        if (C0049.m2194() <= 0) {
            return ((Cloud_baidu) obj).detailVideo((List) obj2);
        }
        return null;
    }

    /* renamed from: تعﻁﺭ  reason: contains not printable characters */
    public static C0188ts m1726(Object obj) {
        if (C0046.m2112() > 0) {
            return ((Z) obj).dT;
        }
        return null;
    }

    /* renamed from: حغضج  reason: contains not printable characters */
    public static String m1727() {
        if (C0028.m1612() <= 0) {
            return ProxyOrigin.getInternalUrl();
        }
        return null;
    }

    /* renamed from: خصزن  reason: contains not printable characters */
    public static byte[] m1728(Object obj, int i) {
        if (C0001.m25() < 0) {
            return Arrays.copyOf((byte[]) obj, i);
        }
        return null;
    }

    /* renamed from: ذخﻭﻝ  reason: contains not printable characters */
    public static String m1729(String str) {
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

    /* renamed from: سﻱخﺹ  reason: contains not printable characters */
    public static int m1730(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: صﺥبه  reason: contains not printable characters */
    public static Bitmap m1731(Object obj, int i, int i2) {
        if (C0044.m2051() <= 0) {
            return Ys.yq((String) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ضﻭﺝﺙ  reason: contains not printable characters */
    public static ByteBuffer m1732(Object obj, Object obj2) {
        if (C0033.m1755() <= 0) {
            return ((ByteBuffer) obj).get((byte[]) obj2);
        }
        return null;
    }

    /* renamed from: ـﺡﻩق  reason: contains not printable characters */
    public static Object m1733(Object obj) {
        if (m1750() <= 0) {
            return ((Map.Entry) obj).getKey();
        }
        return null;
    }

    /* renamed from: نغحﻙ  reason: contains not printable characters */
    public static g8 m1734(Object obj) {
        if (C0041.m1981() < 0) {
            return ((LP) obj).G4();
        }
        return null;
    }

    /* renamed from: وﻱﺵﺱ  reason: contains not printable characters */
    public static Object m1735(Object obj, int i, Object obj2) {
        if (C0004.m129() < 0) {
            return ((List) obj).set(i, obj2);
        }
        return null;
    }

    /* renamed from: يﺩﺽﻁ  reason: contains not printable characters */
    public static String m1736(Object obj) {
        if (C0057.m2368() > 0) {
            return ((Zc) obj).SN();
        }
        return null;
    }

    /* renamed from: ﺏﻝﺫﻍ  reason: contains not printable characters */
    public static String m1737(Object obj) {
        if (C0050.m2221() < 0) {
            return ((kB) obj).t0();
        }
        return null;
    }

    /* renamed from: ﺕاﺡه  reason: contains not printable characters */
    public static boolean m1738(Object obj, Object obj2) {
        if (C0046.m2112() >= 0) {
            return ((Pan) obj).isBd((String) obj2);
        }
        return false;
    }

    /* renamed from: ﺕزـﺽ  reason: contains not printable characters */
    public static String m1739(Object obj, Object obj2, Object obj3) {
        if (C0027.m1588() > 0) {
            return A7.N((StringBuilder) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﺥضتش  reason: contains not printable characters */
    public static String m1740() {
        if (C0014.m418() >= 0) {
            return "<!DOCTYPE html>\n<html lang=\"zh-cmn-Hans\">\n<head>\n  <meta charset=\"UTF-8\">\n  <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=0,viewport-fit=cover\">\n  <style>\n    body { display:flex; flex-direction:column; align-items:center; justify-content:center; min-height:100vh; margin:0; font-family:Arial,sans-serif; }\n    .container { width:90%; max-width:500px; display:flex; flex-direction:column; align-items:center; }\n    .title { font-size:1.2em; margin-bottom:30px; text-align:center; }\n    .title span { color:red; font-weight:bold; }\n    .input-wrapper { width:100%; margin-bottom:15px; }\n    .input-wrapper textarea { width:100%; height:100px; box-sizing:border-box; padding:10px; font-size:1em; resize:none; }\n    .button { width:100%; height:42px; box-sizing:border-box; font-size:1em; margin-bottom:10px; cursor:pointer; }\n    .button.push { background-color:#4CAF50; color:white; border:none; }\n    .button.clear { background-color:#f44336; color:white; border:none; }\n    .image-wrapper { width:100%; display:flex; justify-content:center; margin-bottom:15px; }\n    .image-wrapper img { width:20%; }\n  </style>\n</head>\n<body>\n  <div class=\"container\">\n    <div class=\"image-wrapper\">\n      <img src=\"https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/03/01/02825385af7950edd9bcc89687373210.md.png\" alt=\"图片\">\n    <div class=\"input-wrapper\">\n      <textarea id=\"push_url\" placeholder=\"请输入搜索关键词\"></textarea>\n    </div>\n    <button class=\"button push\" onclick=\"push()\">搜索</button>\n    <button class=\"button clear\" onclick=\"clearInput()\">清除</button>\n  </div>\n  <script>\n    function clearInput() { document.getElementById('push_url').value = ''; }\n    function push() {\n      var kw = document.getElementById('push_url').value;\n      var apiUrl = 'http://";
        }
        return null;
    }

    /* renamed from: ﺭثﻉش  reason: contains not printable characters */
    public static byte[] m1741(Object obj, int i, int i2) {
        if (C0008.m250() > 0) {
            return Arrays.copyOfRange((byte[]) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ﺯخﻙف  reason: contains not printable characters */
    public static boolean m1742() {
        if (C0051.m2229() < 0) {
            return Cloud_uc.tF;
        }
        return false;
    }

    /* renamed from: ﺯفاﺡ  reason: contains not printable characters */
    public static String m1743() {
        if (m1750() < 0) {
            return "&subFid_token=";
        }
        return null;
    }

    /* renamed from: ﺱظقض  reason: contains not printable characters */
    public static String m1744() {
        if (C0010.m301() >= 0) {
            return "获取到无效链接";
        }
        return null;
    }

    /* renamed from: ﺹﺫشس  reason: contains not printable characters */
    public static Map m1745(Object obj) {
        if (C0020.m1371() < 0) {
            return ((k9) obj).tF();
        }
        return null;
    }

    /* renamed from: ﺽﻉﻡﺎ  reason: contains not printable characters */
    public static StringBuilder m1746(Object obj, Object obj2) {
        if (C0033.m1755() <= 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻁلﻅﻡ  reason: contains not printable characters */
    public static void m1747(Object obj) {
        if (C0026.m1561() <= 0) {
            ((C0203xU) obj).ue();
        }
    }

    /* renamed from: ﻁﺩفد  reason: contains not printable characters */
    public static void m1748(Object obj, Object obj2) {
        if (C0047.m2134() < 0) {
            ((C0059Dl) obj).un((String) obj2);
        }
    }

    /* renamed from: ﻙذـع  reason: contains not printable characters */
    public static int m1750() {
        return 658 ^ C0029.f87;
    }

    /* renamed from: ﻝـﻱظ  reason: contains not printable characters */
    public static boolean m1751(Object obj, Object obj2) {
        if (C0004.m129() < 0) {
            return ((JSONObject) obj).isNull((String) obj2);
        }
        return false;
    }

    /* renamed from: ﻙازﻭ  reason: contains not printable characters */
    public static String m1749(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
