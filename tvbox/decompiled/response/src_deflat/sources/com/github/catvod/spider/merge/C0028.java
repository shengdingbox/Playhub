package com.github.catvod.spider.merge;

import android.content.SharedPreferences;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import com.github.catvod.spider.Pan;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.قفﺯﺡ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0028 {

    /* renamed from: ﺡدرﺥ  reason: contains not printable characters */
    public static int f86 = 893;

    /* renamed from: اﺭذﺽ  reason: contains not printable characters */
    public static String m1606() {
        if (C0010.m301() >= 0) {
            return "&sid=";
        }
        return null;
    }

    /* renamed from: بﻩﻡج  reason: contains not printable characters */
    public static void m1607(Object obj, Object obj2) {
        if (C0015.m447() > 0) {
            Collections.sort((List) obj, (Comparator) obj2);
        }
    }

    /* renamed from: ثهﺫﺭ  reason: contains not printable characters */
    public static void m1608(Object obj) {
        if (C0007.m214() < 0) {
            ((ReentrantLock) obj).unlock();
        }
    }

    /* renamed from: جرﺯﺎ  reason: contains not printable characters */
    public static OM m1609(Object obj) {
        if (C0056.m2341() < 0) {
            return OM.t0((String) obj);
        }
        return null;
    }

    /* renamed from: طﺫوﺥ  reason: contains not printable characters */
    public static ME m1610(Object obj, Object obj2, Object obj3) {
        if (C0026.m1561() <= 0) {
            return ((Z) obj).XO((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ظﺎاش  reason: contains not printable characters */
    public static int m1611(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ظﺥهد  reason: contains not printable characters */
    public static int m1612() {
        return 293 ^ C0009.f9;
    }

    /* renamed from: قذﺎح  reason: contains not printable characters */
    public static Set m1614(Object obj) {
        if (C0052.m2256() > 0) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    /* renamed from: كﻍجر  reason: contains not printable characters */
    public static ScheduledExecutorService m1615(int i) {
        if (C0000.m13() >= 0) {
            return Executors.newScheduledThreadPool(i);
        }
        return null;
    }

    /* renamed from: نيسج  reason: contains not printable characters */
    public static boolean m1616(Object obj, Object obj2) {
        if (C0042.m1998() < 0) {
            return ((ArrayList) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: هﺱيص  reason: contains not printable characters */
    public static String m1617(Object obj, Object obj2, Object obj3) {
        if (C0025.m1534() <= 0) {
            return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ﺕﻕﺎص  reason: contains not printable characters */
    public static String m1618() {
        if (C0048.m2140() < 0) {
            return "播优汐智需再扫码一次,没看到码的重启试试";
        }
        return null;
    }

    /* renamed from: ﺕﻱﺝﺽ  reason: contains not printable characters */
    public static String m1619() {
        if (C0021.m1415() >= 0) {
            return "1";
        }
        return null;
    }

    /* renamed from: ﺙضشﺵ  reason: contains not printable characters */
    public static String m1620(Object obj, int i, int i2) {
        if (C0027.m1588() >= 0) {
            return ((String) obj).substring(i, i2);
        }
        return null;
    }

    /* renamed from: ﺝطوق  reason: contains not printable characters */
    public static String m1621(Object obj, int i) {
        if (C0029.m1639() >= 0) {
            return ((String) obj).substring(i);
        }
        return null;
    }

    /* renamed from: ﺫقوض  reason: contains not printable characters */
    public static String m1622() {
        if (C0057.m2368() > 0) {
            return "<!DOCTYPE html>\n<html lang=\"zh-cmn-Hans\">\n<head>\n  <meta charset=\"UTF-8\">\n  <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=0,viewport-fit=cover\">\n  <style>\n    body { display:flex; flex-direction:column; align-items:center; justify-content:center; min-height:100vh; margin:0; font-family:Arial,sans-serif; }\n    .container { width:90%; max-width:500px; display:flex; flex-direction:column; align-items:center; }\n    .title { font-size:1.2em; margin-bottom:30px; text-align:center; }\n    .title span { color:red; font-weight:bold; }\n    .input-wrapper { width:100%; margin-bottom:15px; }\n    .input-wrapper textarea { width:100%; height:100px; box-sizing:border-box; padding:10px; font-size:1em; resize:none; }\n    .button { width:100%; height:42px; box-sizing:border-box; font-size:1em; margin-bottom:10px; cursor:pointer; }\n    .button.push { background-color:#4CAF50; color:white; border:none; }\n    .button.clear { background-color:#f44336; color:white; border:none; }\n    .image-wrapper { width:100%; display:flex; justify-content:center; margin-bottom:15px; }\n    .image-wrapper img { width:20%; }\n  </style>\n</head>\n<body>\n  <div class=\"container\">\n    <div class=\"image-wrapper\">\n      <img src=\"https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/03/01/02825385af7950edd9bcc89687373210.md.png\" alt=\"图片\">\n    </div>\n    <div class=\"input-wrapper\">\n      <textarea id=\"push_url\"\n        placeholder=\"请输入搜索关键词\"></textarea>\n    </div>\n    <button class=\"button push\" onclick=\"push()\">搜索</button>\n    <button class=\"button clear\" onclick=\"clearInput()\">清除</button>\n  </div>\n\n  <script>\n    function clearInput() {\n      document.getElementById('push_url').value = '';\n    }\n\n    function push() {\n      var pushUrl = encodeURIComponent(document.getElementById('push_url').value);\n      var apiUrl = 'http://";
        }
        return null;
    }

    /* renamed from: ﺵعﺡض  reason: contains not printable characters */
    public static void m1623(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0045.m2093() >= 0) {
            ((Pan) obj).setNewData((JSONObject) obj2, (JSONArray) obj3, (String) obj4, (HashMap) obj5);
        }
    }

    /* renamed from: ﺹﺵﻁي  reason: contains not printable characters */
    public static String m1624(Object obj) {
        if (C0002.m60() <= 0) {
            return ((ZI) obj).N();
        }
        return null;
    }

    /* renamed from: ﺽثﺥض  reason: contains not printable characters */
    public static void m1625(Object obj) {
        if (C0006.m193() > 0) {
            ((ReentrantLock) obj).lock();
        }
    }

    /* renamed from: ﺽيوت  reason: contains not printable characters */
    public static String m1626(Object obj) {
        if (C0000.m13() >= 0) {
            return ((String) obj).toUpperCase();
        }
        return null;
    }

    /* renamed from: ﻁرسﻉ  reason: contains not printable characters */
    public static String m1627(String str) {
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

    /* renamed from: ﻍتﺹف  reason: contains not printable characters */
    public static boolean m1628(Object obj, Object obj2) {
        if (C0024.m1502() > 0) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* renamed from: ﻍضﺝخ  reason: contains not printable characters */
    public static int m1629() {
        if (C0027.m1588() > 0) {
            return GG.yq;
        }
        return 0;
    }

    /* renamed from: ﻡﺥﺩع  reason: contains not printable characters */
    public static String m1630(Object obj) {
        if (C0041.m1981() <= 0) {
            return ((Q6) obj).SN();
        }
        return null;
    }

    /* renamed from: ﻩهﺎق  reason: contains not printable characters */
    public static String m1631(Object obj, int i) {
        if (C0006.m193() > 0) {
            return ((JSONArray) obj).getString(i);
        }
        return null;
    }

    /* renamed from: ﻩﻡاﺯ  reason: contains not printable characters */
    public static String m1632(Object obj, Object obj2) {
        if (C0047.m2134() < 0) {
            return ((JSONObject) obj).optString((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻭﺫﻅﺝ  reason: contains not printable characters */
    public static String m1633(Object obj, Object obj2) {
        if (C0054.m2295() < 0) {
            return V3.q((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ﻱﺹصخ  reason: contains not printable characters */
    public static String m1634(Object obj) {
        if (C0023.m1475() >= 0) {
            return ((n6) obj).t0();
        }
        return null;
    }

    /* renamed from: فﺝذﻭ  reason: contains not printable characters */
    public static String m1613(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
