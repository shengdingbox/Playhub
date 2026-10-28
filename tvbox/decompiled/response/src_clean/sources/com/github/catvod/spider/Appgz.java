package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.w2;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Appgz extends Spider {
    private static String i;

    private static final Pattern tF = C0005.m166("[^0-9a-zA-Z=/+]+");
    private static String zH;
    private String yq = "";
    private String SN = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGAe6hKrWLi1zQmjTT1ozbE4QdFeJGNxubxld6GrFGximxfMsMB6BpJhpcTouAqywAFppiKetUBBbXwYsYU1wNr648XVmPmCMCy4rY8vdliFnbMUj086DU6Z+/oXBdWU3/b1G0DN3E9wULRSwcKZT3wj/cCI1vsCm3gj2R5SqkA9Y0CAwEAAQKBgAJH+4CxV0/zBVcLiBCHvSANm0l7HetybTh/j2p0Y1sTXro4ALwAaCTUeqdBjWiLSo9lNwDHFyq8zX90+gNxa7c5EqcWV9FmlVXr8VhfBzcZo1nXeNdXFT7tQ2yah/odtdcx+vRMSGJd1t/5k5bDd9wAvYdIDblMAg+wiKKZ5KcdAkEA1cCakEN4NexkF5tHPRrR6XOY/XHfkqXxEhMqmNbB9U34saTJnLWIHC8IXys6Qmzz30TtzCjuOqKRRy+FMM4TdwJBAJQZFPjsGC+RqcG5UvVMiMPhnwe/bXEehShK86yJK/g/UiKrO87h3aEu5gcJqBygTq3BBBoH2md3pr/W+hUMWBsCQQChfhTIrdDinKi6lRxrdBnn0Ohjg2cwuqK5zzU9p/N+S9x7Ck8wUI53DKm8jUJE8WAG7WLj/oCOWEh+ic6NIwTdAkEAj0X8nhx6AXsgCYRql1klbqtVmL8+95KZK7PnLWG/IfjQUy3pPGoSaZ7fdquG8bq8oyf5+dzjE/oTXcByS+6XRQJAP/5ciy1bL3NhUhsaOVy55MHXnPjdcTX0FaLi+ybXZIfIQ2P4rb19mVq1feMbCXhz+L1rG8oat5lYKfpe8k83ZA==";
    private String N = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDUM5+/y8sPsWkd1/RQS64X259EUwxFXFE5HlA65MqrxnPs0JqoSRojSDy5QhwvROlaD6TwRQHKMY2OAZ6SnQeUJsChTEFIR9qUkwrs3/MVUMxjsv6JS6Oe/juclyJGTgVmDhB55EafXsD0SQYVj/QXXsxR6ewR5E2kL52yAAD4yQIDAQAB";

    static {
        String str = "";
        zH = str;
        i = str;
    }

    public Appgz() {
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        break;
                    
                case 204:
                    return;
                case 239:
                    return;
            }
            i3 = 1678;
        }
    }

    private HashMap<String, String> B() {
        HashMap<String, String> hashMap = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        str5 = "User-Agent";
        str3 = "okhttp/3.12.0";
        str2 = "Version";
        str4 = "2603002";
        hashMap = C0055.m2325(str5, str3, str2, str4);
        str5 = "PackageName";
        str3 = "com.r3ac892153.q1ed27199a.wf930fc6bf20260401";
        (hashMap.put(str5,str3));
        str2 = "Ver";
        str4 = "3.0.4.0";
        (hashMap.put(str2,str4));
        str5 = "api-ver";
        (hashMap.put(str5,str4));
        str3 = "code";
        str2 = "GZ0001";
        (hashMap.put(str3,str2));
        str5 = "Referer";
        str4 = "https://api.gjjwgp3n.com";
        (hashMap.put(str5,str4));
        return hashMap;
}

    private JSONObject G(JSONObject jSONObject) {
        HashMap hashMap = null;
HashMap hashMap2 = null;
        w2 w2Var = null;
        String str2 = null;
                // [deflattened] 控制流平坦化已还原为线性代码
        str2 = m638(this);
        hashMap = m648(this, str2, jSONObject);
        hashMap2 = m649(this);
        str2 = "https://api.gjjwgp3n.com/App/Resource/VurlDetail/showOne";
        w2Var = C0005.m167(str2, hashMap, hashMap2);
        str2 = (w2Var.yq());
        jSONObject = m647(this, str2);
        return jSONObject;
}

    private void G4() {
        String str2 = null;
        UUID uuid = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        uuid = UUID.randomUUID();
        str3 = (uuid.toString());
        str5 = "-";
        str2 = "";
        str4 = (str3.replace(str5,str2));
        str3 = (str4.substring(0,16));
        str5 = "hide_appgz_android_id";
        C0002.m78(str5, str3);
        str4 = "hide_appgz_token";
        C0002.m78(str4, str2);
        str5 = "hide_appgz_new_key";
        C0002.m78(str5, str2);
        str3 = "hide_appgz_utdid";
        C0002.m78(str3, str2);
        str4 = "hide_appgz_user_id";
        C0002.m78(str4, str2);
        str5 = "hide_appgz_device_id";
        C0002.m78(str5, str2);
        this.yq = str2;
        return;
}

    private String Gc() {
        String str = "";
        try {
            String str2 = Build.SERIAL;
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (str2 != null) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    return str;
                            }
                        }
                        break;
                    case 239:
                        return str2;
                }
                i2 = 1678;
            }
        } catch (Exception e) {
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        i4 = 48674;
                        break;
                    case 47483:
                        return str;
                }
            }
        }
    }

    private boolean KJ(String str) {
        boolean z = (TextUtils.isEmpty(str));
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return false;
                case 239:
                    try {
                        String str2 = (C0003.m88((str.trim())).getPath());
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (str2 == null) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    return false;
                                case 500:
                                    boolean z2 = (str2.isEmpty());
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                if (!z2) {
                                                    break;
                                                } else {
                                                    i4 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                String str3 = str2;
                                                while (true) {
                                                    boolean z3 = (str3.endsWith("/"));
                                                    int i5 = 48891;
                                                    while (true) {
                                                        i5 ^= 48908;
                                                        switch (i5) {
                                                            case 22:
                                                            case 53:
                                                                break;
                                                            case 503:
                                                                i5 = z3 ? 49635 : 48953;
                                                            case 32495:
                                                                int i6 = (str3.length());
                                                                int i7 = 49666;
                                                                while (true) {
                                                                    i7 ^= 49683;
                                                                    switch (i7) {
                                                                        case 17:
                                                                            i7 = i6 > 1 ? 49759 : 49728;
                                                                        case 50:
                                                                        case 76:
                                                                            str3 = (str3.substring(0,(str3.length()) - 1));
                                                                            int i8 = 49790;
                                                                            while (true) {
                                                                                i8 ^= 49807;
                                                                                switch (i8) {
                                                                                    case 18:
                                                                                        break;
                                                                                    case 241:
                                                                                        i8 = 49821;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                return ((str3.toLowerCase(Locale.US)).endsWith("/hls/index.m3u8"));
                                            case 47417:
                                                int i9 = 48767;
                                                while (true) {
                                                    i9 ^= 48784;
                                                    switch (i9) {
                                                        case 14:
                                                            return false;
                                                        case 239:
                                                            i9 = 48798;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i4 = 48705;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                    } catch (Exception e) {
                        int i10 = 49914;
                        while (true) {
                            i10 ^= 49931;
                            switch (i10) {
                                case 497:
                                    i10 = 50596;
                                    break;
                                case 1711:
                                    return false;
                            }
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    private static byte[] M(int i2) {
        byte[] bArr = null;
        int i3 = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
                // [deflattened] 控制流平坦化已还原为线性代码
        bArr = new byte[4];
        i3 = i2 % 256;
        b3 = (byte) i3;
        bArr[3] = b3;
        i3 = i2 >> 8;
        i2 = i3 % 256;
        b2 = (byte) i2;
        bArr[2] = b2;
        i2 = i3 >> 8;
        i3 = i2 % 256;
        b = (byte) i3;
        bArr[1] = b;
        i3 = i2 >> 8;
        i2 = i3 % 256;
        b4 = (byte) i2;
        bArr[0] = b4;
        return bArr;
}

    private HashMap<String, String> N(String str, JSONObject jSONObject) {
        String str2;
        int i2;
        String str3 = (String.valueOf(System.currentTimeMillis() / 1000));
        JSONObject jSONObject2 = new JSONObject();
        (jSONObject2.put("iv",m645()));
        (jSONObject2.put("key",m637()));
        String str4 = C0010.m311((jSONObject2.toString()), m641(this));
        String str5 = (jSONObject.toString());
        String str6 = m637();
        String str7 = m645();
        String str8 = "UTF-8";
        boolean z = (TextUtils.isEmpty(str5));
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    try {
                        SecretKeySpec secretKeySpec = new SecretKeySpec((str6.getBytes(str8)), "AES");
                        Cipher cipher = C0029.m1636("AES/CBC/PKCS7Padding");
                        (cipher.init(1,secretKeySpec,new IvParameterSpec((str7.getBytes()))));
                        str5 = C0041.m1986((cipher.doFinal((str5.getBytes(str8)))));
                        int i5 = 1864;
                        while (true) {
                            i5 ^= 1881;
                            switch (i5) {
                                case 17:
                                    i5 = 48674;
                                    break;
                                case 47483:
                                    break;
                            }
                        }
                    } catch (Exception e) {
                        (e.printStackTrace());
                        str5 = null;
                        break;
                    }
                    break;
            }
            i3 = 1678;
        }
        String str9 = (str5.toUpperCase());
        StringBuilder sb = new StringBuilder();
        (sb.append("token_id=,token="));
        (sb.append(str));
        (sb.append(",phone_type=1,request_key="));
        (sb.append(str9));
        (sb.append(",app_id=1,time="));
        (sb.append(str3));
        (sb.append(",keys="));
        (sb.append(str4));
        (sb.append("*&zvdvdvddbfikkkumtmdwqppp?|4Y!s!2br"));
        String str10 = (C0052.m2266((sb.toString())).toUpperCase());
        String str11 = "token";
        String str12 = "";
        HashMap<String, String> hashMap = C0055.m2325(str11, str, "token_id", str12);
        String str13 = "1";
        (hashMap.put("phone_type",str13));
        (hashMap.put("time",str3));
        String str14 = "_";
        String str15 = " ";
        try {
            StringBuilder sb2 = new StringBuilder();
            String str16 = ((Build.MANUFACTURER.replaceAll(str15,str12)).replace(str14,str12));
            Locale locale = Locale.US;
            (sb2.append((str16.toLowerCase(locale))));
            (sb2.append("-"));
            (sb2.append((((Build.MODEL.replaceAll(str15,str12)).replace(str14,str12)).toLowerCase(locale))));
            str2 = (sb2.toString());
            i2 = 48767;
        } catch (Exception e2) {
            str2 = "oneplus-hd1900";
        }
        while (true) {
            i2 ^= 48784;
            switch (i2) {
                case 14:
                    (hashMap.put("phone_model",str2));
                    (hashMap.put("keys",str4));
                    (hashMap.put("request_key",str9));
                    (hashMap.put("signature",str10));
                    (hashMap.put("app_id",str13));
                    (hashMap.put("ad_version",str13));
                    return hashMap;
                case 239:
                    i2 = 48798;
                    break;
            }
        }
    }

    private String SN(boolean z, String str, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        (jSONObject.put("old_key",str));
        (jSONObject.put("new_key",str2));
        String str4 = "";
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    (jSONObject.put("phone_type",1));
                    (jSONObject.put("code",str4));
                    str3 = "https://api.gjjwgp3n.com/App/Authentication/Device/signUp";
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    str3 = "https://api.gjjwgp3n.com/App/Authentication/Device/signIn";
                    break;
            }
            i2 = 1678;
        }
        return (m647(this, (C0005.m167(str3, m648(this, str4, jSONObject), m649(this)).yq())).optString("token",str4));
    }

    private static int dT(String str) {
        int i2 = 0;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (str == null) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    int i4 = (str.length());
                    int i5 = 1740;
                    while (true) {
                        i5 ^= 1757;
                        switch (i5) {
                            case 17:
                                if (i4 > 0) {
                                    break;
                                } else {
                                    i5 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                char[] cArr = (str.toCharArray());
                                int length = cArr.length;
                                int i6 = 0;
                                while (true) {
                                    int i7 = i2;
                                    int i8 = 48767;
                                    while (true) {
                                        i8 ^= 48784;
                                        switch (i8) {
                                            case 14:
                                            case 45:
                                                return i7;
                                            case 76:
                                                i2 = (i7 * 31) + cArr[i6];
                                                i6++;
                                                int i9 = 48891;
                                                while (true) {
                                                    i9 ^= 48908;
                                                    switch (i9) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i9 = 48922;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i8 = i6 < length ? 48860 : 48829;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i10 = 1864;
                                while (true) {
                                    i10 ^= 1881;
                                    switch (i10) {
                                        case 17:
                                            i10 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                        i5 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i3 = 1678;
        }
        return 0;
    }

    public static String generateRandomString(int i2) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int i3 = 0;
        while (true) {
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                    case 49:
                        i4 = i3 < i2 ? 1709 : 1678;
                    case 204:
                        (sb.append(("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt((random.nextInt(62))))));
                        i3++;
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            switch (i5) {
                                case 17:
                                    i5 = 1771;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        return (sb.toString());
                }
            }
        }
    }

    private String i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = (new Random().nextInt());
        (byteArrayOutputStream.write(m644((int) (System.currentTimeMillis() / 1000)),0,4));
        (byteArrayOutputStream.write(m644(i2),0,4));
        (byteArrayOutputStream.write(3));
        (byteArrayOutputStream.write(0));
        String str = m643(this);
        boolean z = (TextUtils.isEmpty(str));
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    str = (String.valueOf((new Random().nextInt())));
                    break;
                case 239:
                    break;
            }
            i3 = 1678;
        }
        (byteArrayOutputStream.write(m644(m636(str)),0,4));
        byte[] bArr = (byteArrayOutputStream.toByteArray());
        Mac mac = C0013.m400("HmacSHA1");
        (mac.init(new SecretKeySpec(("d6fc3a4a06adbde89223bvefedc24fecde188aaa9161".getBytes("UTF-8")), (mac.getAlgorithm()))));
        (byteArrayOutputStream.write(m644(m636(C0034.m1790((mac.doFinal(bArr)), 2))),0,4));
        String str2 = C0034.m1790((byteArrayOutputStream.toByteArray()), 2);
        boolean z2 = (str2.endsWith("\n"));
        int i4 = 1740;
        while (true) {
            i4 ^= 1757;
            switch (i4) {
                case 17:
                    if (!z2) {
                        break;
                    } else {
                        i4 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    return str2;
                case 500:
                    return (str2.substring(0,(str2.length()) - 1));
            }
            i4 = 1802;
        }
    }

    private boolean q(String str) {
        boolean z = true;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (str != null) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return false;
                case 239:
                    boolean z2 = (str.endsWith("\n"));
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (!z2) {
                                    break;
                                } else {
                                    i3 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                str = (str.substring(0,(str.length()) - 1));
                                break;
                        }
                        i3 = 1802;
                    }
                    int i4 = (str.length());
                    int i5 = 1864;
                    while (true) {
                        i5 ^= 1881;
                        switch (i5) {
                            case 17:
                                if (i4 != 24) {
                                    break;
                                } else {
                                    i5 = 48736;
                                    continue;
                                }
                            case 47384:
                                break;
                            case 47417:
                                boolean z3 = ((m628().matcher(str)).find());
                                int i6 = 48767;
                                while (true) {
                                    i6 ^= 48784;
                                    switch (i6) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            break;
                                        case 239:
                                            if (z3) {
                                                break;
                                            } else {
                                                i6 = 48860;
                                                continue;
                                            }
                                    }
                                    i6 = 48829;
                                }
                                break;
                            case 47483:
                                break;
                        }
                        i5 = 48705;
                    }
                    z = false;
                    return z;
            }
            i2 = 1678;
        }
    }

    private String t0() {
        String str = "hide_appgz_android_id";
        String str2 = "";
        String str3 = C0014.m419(str, str2);
        boolean z = (TextUtils.isEmpty(str3));
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    break;
                case 239:
                    try {
                        Application application = InitOrigin.context();
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (application == null) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    str3 = C0004.m136((application.getContentResolver()), "android_id");
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                    } catch (Exception e) {
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 503:
                                    i5 = 48922;
                                    break;
                            }
                        }
                    }
                    str3 = str2;
                    boolean z2 = (TextUtils.isEmpty(str3));
                    int i6 = 48767;
                    while (true) {
                        i6 ^= 48784;
                        switch (i6) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                str3 = (((UUID.randomUUID().toString()).replace("-",str2)).substring(0,16));
                                break;
                            case 239:
                                if (!z2) {
                                    break;
                                } else {
                                    i6 = 48860;
                                    continue;
                                }
                        }
                        i6 = 48829;
                    }
                    C0002.m78(str, str3);
                    break;
            }
            i2 = 1678;
        }
        return str3;
    }

    private JSONObject tF(String str) {
        String str2;
        int i2;
        JSONObject jSONObject = (new JSONObject(str).getJSONObject("data"));
        JSONObject jSONObject2 = new JSONObject(C0008.m234((jSONObject.getString("keys")), m630(this)));
        try {
            str2 = new String(C0003.m80(C0031.m1704(((jSONObject.getString("response_key")).replace("\\",""))), ((jSONObject2.getString("key")).getBytes()), ((jSONObject2.getString("iv")).getBytes())));
            i2 = 1616;
        } catch (Exception e) {
            m642(e);
            str2 = null;
        }
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    return new JSONObject(str2);
                case 49:
                    i2 = 1647;
                    break;
            }
        }
    }

    private String yq() {
        String str = "";
        try {
            JSONObject jSONObject = new JSONObject();
            (jSONObject.put("parse",0));
            (jSONObject.put("url",str));
            (jSONObject.put("msg","防盗链账号"));
            return (jSONObject.toString());
        } catch (Exception e) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        return str;
                    case 49:
                        i2 = 1647;
                        break;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 389
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private void zH() {
        /*
            Method dump skipped, instructions count: 1598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Appgz.zH():void");
    }

    /* renamed from: تذعﻡ  reason: contains not printable characters */
    public static JSONObject m627(Object obj, Object obj2) {
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).G((JSONObject) obj2);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: جﻉﻙو  reason: contains not printable characters */
    public static Pattern m628() {
        int i2 = (-31) ^ C0006.f6;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return tF;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: سزﻅق  reason: contains not printable characters */
    public static String m629(Object obj) {
        int i2 = (-914) ^ C0004.f4;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).yq();
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ضﺭجذ  reason: contains not printable characters */
    public static String m630(Object obj) {
        int i2 = 293 ^ C0009.f9;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).SN;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: غكدي  reason: contains not printable characters */
    public static String m631(Object obj) {
        int i2 = 596 ^ C0009.f9;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).i();
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: كرشﺎ  reason: contains not printable characters */
    public static String m632(Object obj, boolean z, Object obj2, Object obj3) {
        int i2 = 812 ^ C0022.f80;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).SN(z, (String) obj2, (String) obj3);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: كفﻭت  reason: contains not printable characters */
    public static void m633(Object obj) {
        int i2 = (-487) ^ C0053.f111;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    ((Appgz) obj).G4();
                    return;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: لواـ  reason: contains not printable characters */
    public static String m634(Object obj) {
        int i2 = (-703) ^ C0036.f94;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).Gc();
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: لﺏبت  reason: contains not printable characters */
    public static boolean m635(Object obj, Object obj2) {
        int i2 = (-185) ^ C0033.f91;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).q((String) obj2);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: لﺕوظ  reason: contains not printable characters */
    public static int m636(Object obj) {
        int i2 = (-703) ^ C0036.f94;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return dT((String) obj);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: هﻝﺡﺱ  reason: contains not printable characters */
    public static String m637() {
        int i2 = 813 ^ C0033.f91;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return zH;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﺏرﻍﺭ  reason: contains not printable characters */
    public static String m638(Object obj) {
        int i2 = (-821) ^ C0025.f83;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).yq;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﺕﻝاق  reason: contains not printable characters */
    public static void m640(Object obj) {
        int i2 = (-821) ^ C0025.f83;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    ((Appgz) obj).zH();
                    return;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﺙجنو  reason: contains not printable characters */
    public static String m641(Object obj) {
        int i2 = 813 ^ C0033.f91;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).N;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﺡﻅﻩج  reason: contains not printable characters */
    public static void m642(Object obj) {
        int i2 = 624 ^ C0012.f12;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    SpiderDebug.log((Throwable) obj);
                    return;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﺫﺹﻅﺽ  reason: contains not printable characters */
    public static String m643(Object obj) {
        int i2 = 624 ^ C0012.f12;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).t0();
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﻁشﻍك  reason: contains not printable characters */
    public static byte[] m644(int i2) {
        int i3 = 916 ^ C0002.f2;
        int i4 = 1616;
        while (true) {
            i4 ^= 1633;
            switch (i4) {
                case 14:
                    break;
                case 49:
                    
                        i4 = 1709;
                        continue;
                    
                case 204:
                    return M(i2);
                case 239:
                    int i5 = 1740;
                    while (true) {
                        i5 ^= 1757;
                        switch (i5) {
                            case 17:
                                i5 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i4 = 1678;
        }
    }

    /* renamed from: ﻍمصذ  reason: contains not printable characters */
    public static String m645() {
        int i2 = 812 ^ C0022.f80;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return i;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﻙﺡﻉب  reason: contains not printable characters */
    public static boolean m646(Object obj, Object obj2) {
        int i2 = 515 ^ C0028.f86;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).KJ((String) obj2);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﻡﺵﻁﻅ  reason: contains not printable characters */
    public static JSONObject m647(Object obj, Object obj2) {
        int i2 = (-477) ^ C0042.f100;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).tF((String) obj2);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﻡﻝعﺹ  reason: contains not printable characters */
    public static HashMap m648(Object obj, Object obj2, Object obj3) {
        int i2 = 753 ^ C0000.f0;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).N((String) obj2, (JSONObject) obj3);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﻱﻍﻙﻭ  reason: contains not printable characters */
    public static HashMap m649(Object obj) {
        int i2 = (-914) ^ C0004.f4;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Appgz) obj).B();
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4 = "vod_pic";
        String str5 = "vod_id";
        String str6 = "list";
        String str7 = "vod_name";
        String str8 = "";
        String str9 = "year";
        String str10 = "area";
        try {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            (sb.append("tidd"));
            (sb.append(str));
            (printStream.println((sb.toString())));
            boolean z2 = ("1".equals(str));
            String str11 = "30";
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (!z2) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        str3 = "5";
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        boolean z3 = ("2".equals(str));
                        int i4 = 1864;
                        while (true) {
                            i4 ^= 1881;
                            switch (i4) {
                                case 17:
                                    if (!z3) {
                                        break;
                                    } else {
                                        i4 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    boolean z4 = ("3".equals(str));
                                    int i5 = 48891;
                                    while (true) {
                                        i5 ^= 48908;
                                        switch (i5) {
                                            case 22:
                                                break;
                                            case 53:
                                                str3 = str11;
                                                break;
                                            case 503:
                                                if (!z4) {
                                                    break;
                                                } else {
                                                    i5 = 49635;
                                                    continue;
                                                }
                                            case 32495:
                                                str3 = "22";
                                                int i6 = 49666;
                                                while (true) {
                                                    i6 ^= 49683;
                                                    switch (i6) {
                                                        case 17:
                                                            i6 = 49697;
                                                            break;
                                                        case 50:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i5 = 48953;
                                    }
                                    break;
                                case 47417:
                                    str3 = "12";
                                    int i7 = 48767;
                                    while (true) {
                                        i7 ^= 48784;
                                        switch (i7) {
                                            case 14:
                                                break;
                                            case 239:
                                                i7 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i4 = 48705;
                        }
                        break;
                }
                i2 = 1678;
            }
            Object obj = (hashMap.get(str10));
            int i8 = 49790;
            while (true) {
                i8 ^= 49807;
                switch (i8) {
                    case 18:
                        break;
                    case 51:
                        break;
                    case 84:
                        (hashMap.put(str10,str8));
                        break;
                    case 241:
                        if (obj != null) {
                            break;
                        } else {
                            i8 = 49883;
                            continue;
                        }
                    default:
                        continue;
                }
                i8 = 49852;
            }
            Object obj2 = (hashMap.get(str9));
            int i9 = 49914;
            while (true) {
                i9 ^= 49931;
                switch (i9) {
                    case 497:
                        if (obj2 != null) {
                            break;
                        } else {
                            i9 = 50658;
                            continue;
                        }
                    case 1711:
                        break;
                    case 1736:
                        break;
                    case 1769:
                        (hashMap.put(str9,str8));
                        break;
                    default:
                        continue;
                }
                i9 = 50627;
            }
            String str12 = (String) (hashMap.get(str10));
            String str13 = (String) (hashMap.get(str9));
            JSONObject jSONObject = new JSONObject();
            boolean z5 = (TextUtils.isEmpty(str12));
            String str14 = "0";
            int i10 = 50689;
            while (true) {
                i10 ^= 50706;
                switch (i10) {
                    case 19:
                        if (!z5) {
                            break;
                        } else {
                            i10 = 50782;
                            continue;
                        }
                    case 45:
                        break;
                    case 50:
                        break;
                    case 76:
                        str12 = str14;
                        break;
                }
                i10 = 50751;
            }
            (jSONObject.put(str10,str12));
            (jSONObject.put("sub",str3));
            boolean z6 = (TextUtils.isEmpty(str13));
            int i11 = 50813;
            while (true) {
                i11 ^= 50830;
                switch (i11) {
                    case 18:
                        break;
                    case 53:
                        break;
                    case 243:
                        if (!z6) {
                            break;
                        } else {
                            i11 = 51557;
                            continue;
                        }
                    case 4075:
                        str13 = str14;
                        break;
                    default:
                        continue;
                }
                i11 = 50875;
            }
            (jSONObject.put(str9,str13));
            (jSONObject.put("pageSize",str11));
            (jSONObject.put("sort","d_id"));
            (jSONObject.put("page",str2));
            (jSONObject.put("tid",str));
            JSONArray jSONArray = (m647(this, (C0005.m167("https://api.gjjwgp3n.com/App/IndexList/indexList", m648(this, m638(this), jSONObject), m649(this)).yq())).getJSONArray(str6));
            new ArrayList();
            JSONArray jSONArray2 = new JSONArray();
            int i12 = 0;
            while (true) {
                int i13 = (jSONArray.length());
                int i14 = 51588;
                while (true) {
                    i14 ^= 51605;
                    switch (i14) {
                        case 17:
                            i14 = i12 < i13 ? 51681 : 51650;
                        case 54:
                        case 87:
                            JSONObject jSONObject2 = new JSONObject();
                            (Integer.parseInt(str2));
                            int i15 = (jSONArray2.length());
                            (jSONObject2.put("limit",30));
                            (jSONObject2.put("total",i15));
                            (jSONObject2.put(str6,jSONArray2));
                            return (jSONObject2.toString());
                        case 116:
                            JSONObject jSONObject3 = (jSONArray.getJSONObject(i12));
                            JSONObject jSONObject4 = new JSONObject();
                            (jSONObject4.put(str5,(jSONObject3.getString(str5))));
                            (jSONObject4.put(str7,(jSONObject3.getString(str7))));
                            boolean z7 = C0010.m289((jSONObject3.getString(str7)));
                            int i16 = 51712;
                            while (true) {
                                i16 ^= 51729;
                                switch (i16) {
                                    case 14:
                                    case 17:
                                        i16 = z7 ? 51805 : 51774;
                                    case 47:
                                        (jSONObject4.put(str4,(jSONObject3.getString(str4))));
                                        (jSONObject4.put("vod_remarks",(jSONObject3.getString("vod_scroe"))));
                                        (jSONArray2.put(jSONObject4));
                                        break;
                                    case 76:
                                        int i17 = 51836;
                                        while (true) {
                                            i17 ^= 51853;
                                            switch (i17) {
                                                case 241:
                                                    i17 = 52518;
                                                case 1963:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            i12++;
                            int i18 = 52611;
                            while (true) {
                                i18 ^= 52628;
                                switch (i18) {
                                    case 23:
                                        i18 = 52642;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            return str8;
        }
    }

    public String detailContent(List<String> list) {
        String str;
        String str2 = "$$$";
        String str3 = "list";
        String str4 = "vod_actor";
        String str5 = "vod_area";
        String str6 = "vod_year";
        String str7 = "vod_pic";
        String str8 = "vod_name";
        String str9 = "param";
        String str10 = "play";
        String str11 = "vod_director";
        String str12 = "vod_id";
        String str13 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            (jSONObject.put("token_id",str13));
            try {
                (jSONObject.put(str12,(list.get(0))));
                (jSONObject.put("mobile_time",(String.valueOf(System.currentTimeMillis() / 1000))));
                (jSONObject.put("token",m638(this)));
                JSONObject jSONObject2 = (m647(this, (C0005.m167("https://api.gjjwgp3n.com/App/IndexPlay/playInfo", m648(this, m638(this), jSONObject), m649(this)).yq())).getJSONObject("vodInfo"));
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                (sb.append("822"));
                (sb.append(jSONObject2));
                (printStream.println((sb.toString())));
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                (jSONObject4.put(str12,(jSONObject2.getString(str12))));
                (jSONObject4.put(str8,(jSONObject2.getString(str8))));
                (jSONObject4.put(str7,(jSONObject2.getString(str7))));
                (jSONObject4.put("vod_class","未知"));
                (jSONObject4.put(str6,(jSONObject2.getString(str6))));
                (jSONObject4.put(str5,(jSONObject2.getString(str5))));
                (jSONObject4.put("vod_remarks",(jSONObject2.getString("vod_title"))));
                (jSONObject4.put(str4,(jSONObject2.getString(str4))));
                (jSONObject4.put(str11,(jSONObject2.getString(str11))));
                (jSONObject4.put("vod_content","内详"));
                PrintStream printStream2 = System.out;
                StringBuilder sb2 = new StringBuilder();
                (sb2.append("wbuz"));
                (sb2.append((jSONObject2.getString(str11))));
                (printStream2.println((sb2.toString())));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject jSONObject5 = new JSONObject();
                (jSONObject5.put("vurl_cloud_id","2"));
                int i2 = 0;
                (jSONObject5.put("vod_d_id",(list.get(0))));
                JSONObject jSONObject6 = m647(this, (C0005.m167("https://api.gjjwgp3n.com/App/Resource/Vurl/show", m648(this, m638(this), jSONObject5), m649(this)).yq()));
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray2 = (jSONObject6.getJSONArray(str3));
                while (true) {
                    int i3 = (jSONArray2.length());
                    int i4 = 1616;
                    while (true) {
                        i4 ^= 1633;
                        switch (i4) {
                            case 14:
                            case 49:
                                i4 = i2 < i3 ? 1709 : 1678;
                            case 204:
                                JSONObject jSONObject7 = (jSONArray2.getJSONObject(i2));
                                String str14 = (jSONObject7.getString("title"));
                                String str15 = (((jSONObject7.getJSONObject(str10)).getJSONObject("1080")).getString(str9));
                                String str16 = (((jSONObject7.getJSONObject(str10)).getJSONObject("720")).getString(str9));
                                String str17 = (((jSONObject7.getJSONObject(str10)).getJSONObject("480")).getString(str9));
                                PrintStream printStream3 = System.out;
                                StringBuilder sb3 = new StringBuilder();
                                (sb3.append("ff618"));
                                (sb3.append(str17));
                                (printStream3.println((sb3.toString())));
                                boolean z = (str15.isEmpty());
                                int i5 = 1740;
                                while (true) {
                                    i5 ^= 1757;
                                    switch (i5) {
                                        case 17:
                                            i5 = !z ? 1833 : 1802;
                                        case 54:
                                        case 471:
                                            boolean z2 = (str16.isEmpty());
                                            int i6 = 48767;
                                            while (true) {
                                                i6 ^= 48784;
                                                switch (i6) {
                                                    case 14:
                                                    case 45:
                                                        str15 = str17;
                                                        break;
                                                    case 76:
                                                        int i7 = 48891;
                                                        while (true) {
                                                            i7 ^= 48908;
                                                            switch (i7) {
                                                                case 22:
                                                                    str15 = str16;
                                                                    break;
                                                                case 503:
                                                                    i7 = 48922;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i6 = !z2 ? 48860 : 48829;
                                                }
                                            }
                                            break;
                                        case 500:
                                            int i8 = 1864;
                                            while (true) {
                                                i8 ^= 1881;
                                                switch (i8) {
                                                    case 17:
                                                        i8 = 48674;
                                                    case 47483:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                PrintStream printStream4 = System.out;
                                StringBuilder sb4 = new StringBuilder();
                                (sb4.append("Title: "));
                                (sb4.append(str14));
                                (printStream4.println((sb4.toString())));
                                PrintStream printStream5 = System.out;
                                StringBuilder sb5 = new StringBuilder();
                                (sb5.append("1080p Param: "));
                                (sb5.append(str15));
                                (printStream5.println((sb5.toString())));
                                String str18 = "专线播放";
                                StringBuilder sb6 = new StringBuilder();
                                (sb6.append(str14));
                                (sb6.append("$"));
                                (sb6.append(str15));
                                (arrayList.add((sb6.toString())));
                                int i9 = (arrayList.size());
                                int i10 = 49666;
                                while (true) {
                                    i10 ^= 49683;
                                    switch (i10) {
                                        case 17:
                                            i10 = i9 > 0 ? 49759 : 49728;
                                        case 50:
                                        case 76:
                                            str = (TextUtils.join("#",arrayList));
                                            int i11 = 49790;
                                            while (true) {
                                                i11 ^= 49807;
                                                switch (i11) {
                                                    case 18:
                                                        break;
                                                    case 241:
                                                        i11 = 49821;
                                                }
                                            }
                                            break;
                                        case 83:
                                            str = str13;
                                            break;
                                    }
                                }
                                int i12 = (str.length());
                                int i13 = 49914;
                                while (true) {
                                    i13 ^= 49931;
                                    switch (i13) {
                                        case 497:
                                            i13 = i12 == 0 ? 50658 : 50627;
                                        case 1711:
                                        case 1736:
                                            (linkedHashMap.put(str18,str));
                                            break;
                                        case 1769:
                                            int i14 = 50689;
                                            while (true) {
                                                i14 ^= 50706;
                                                switch (i14) {
                                                    case 19:
                                                        i14 = 50720;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                i2++;
                                int i15 = 50813;
                                while (true) {
                                    i15 ^= 50830;
                                    switch (i15) {
                                        case 18:
                                            break;
                                        case 243:
                                            i15 = 50844;
                                    }
                                }
                                break;
                            case 239:
                                int i16 = (linkedHashMap.size());
                                int i17 = 51588;
                                while (true) {
                                    i17 ^= 51605;
                                    switch (i17) {
                                        case 17:
                                            if (i16 <= 0) {
                                                break;
                                            } else {
                                                i17 = 51681;
                                                continue;
                                            }
                                        case 54:
                                            break;
                                        case 87:
                                            break;
                                        case 116:
                                            String str19 = (TextUtils.join(str2,(linkedHashMap.keySet())));
                                            String str20 = (TextUtils.join(str2,(linkedHashMap.values())));
                                            (jSONObject4.put("vod_play_from",str19));
                                            (jSONObject4.put("vod_play_url",str20));
                                            break;
                                        default:
                                            continue;
                                    }
                                    i17 = 51650;
                                }
                                (jSONArray.put(jSONObject4));
                                (jSONObject3.put(str3,jSONArray));
                                return (jSONObject3.toString());
                        }
                    }
                }
            } catch (Throwable th) {
                int i18 = 51712;
                while (true) {
                    i18 ^= 51729;
                    switch (i18) {
                        case 14:
                            return str13;
                        case 17:
                            i18 = 51743;
                            break;
                    }
                }
            }
        } catch (Throwable th2) {
            return str13;
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject("{\"电影\":\"1\",\"电视剧\":\"2\",\"动漫\":\"4\",\"综艺\":\"3\"}");
            Iterator it = (jSONObject.keys());
            while (true) {
                boolean z2 = (it.hasNext());
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = z2 ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject2 = new JSONObject();
                            String str = (String) (it.next());
                            (jSONObject2.put("type_name",str));
                            (jSONObject2.put("type_id",(jSONObject.getString(str))));
                            (jSONArray.put(jSONObject2));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = 1771;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            JSONObject jSONObject3 = new JSONObject();
                            int i4 = 1864;
                            while (true) {
                                i4 ^= 1881;
                                switch (i4) {
                                    case 17:
                                        if (!z) {
                                            break;
                                        } else {
                                            i4 = 48736;
                                            continue;
                                        }
                                    case 47384:
                                        break;
                                    case 47417:
                                        (jSONObject3.put("filters",new JSONObject(C0033.m1777())));
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        continue;
                                }
                                i4 = 48705;
                            }
                            (jSONObject3.put("class",jSONArray));
                            return (jSONObject3.toString());
                    }
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public String homeVideoContent() {
        JSONArray jSONArray;
        int i2;
        String str = "vod_id";
        String str2 = "list";
        try {
            JSONArray jSONArray2 = new JSONArray();
            try {
                JSONObject jSONObject = new JSONObject();
                (jSONObject.put("pid","1"));
                jSONArray = (m647(this, (C0005.m167("https://api.gjjwgp3n.com/App/IndexList/index", m648(this, m638(this), jSONObject), m649(this)).yq())).getJSONArray(str2));
                i2 = 0;
            } catch (Exception e) {
                (e.printStackTrace());
            }
            while (true) {
                int i3 = (jSONArray.length());
                int i4 = 1616;
                while (true) {
                    i4 ^= 1633;
                    switch (i4) {
                        case 14:
                        case 49:
                            i4 = i2 < i3 ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject2 = (jSONArray.getJSONObject(i2));
                            boolean z = ((jSONObject2.getString("type")).contains("热门推荐"));
                            int i5 = 1740;
                            while (true) {
                                i5 ^= 1757;
                                switch (i5) {
                                    case 17:
                                        i5 = z ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        JSONArray jSONArray3 = (jSONObject2.getJSONArray(str2));
                                        PrintStream printStream = System.out;
                                        StringBuilder sb = new StringBuilder();
                                        (sb.append("jmm112"));
                                        (sb.append(jSONArray3));
                                        (printStream.println((sb.toString())));
                                        int i6 = 0;
                                        while (true) {
                                            int i7 = (jSONArray3.length());
                                            int i8 = 1864;
                                            while (true) {
                                                i8 ^= 1881;
                                                switch (i8) {
                                                    case 17:
                                                        i8 = i6 < i7 ? 48736 : 48705;
                                                    case 47384:
                                                        break;
                                                    case 47417:
                                                        JSONObject jSONObject3 = (jSONArray3.getJSONObject(i6));
                                                        JSONObject jSONObject4 = new JSONObject();
                                                        (jSONObject4.put(str,(jSONObject3.getString(str))));
                                                        (jSONObject4.put("vod_name",(jSONObject3.getString("c_name"))));
                                                        (jSONObject4.put("vod_pic",(jSONObject3.getString("c_pic"))));
                                                        (jSONObject4.put("vod_remarks",(jSONObject3.getString("new_continue"))));
                                                        (jSONArray2.put(jSONObject4));
                                                        i6++;
                                                        int i9 = 48767;
                                                        while (true) {
                                                            i9 ^= 48784;
                                                            switch (i9) {
                                                                case 14:
                                                                    break;
                                                                case 239:
                                                                    i9 = 48798;
                                                            }
                                                        }
                                                        break;
                                                    case 47483:
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                            i2++;
                            int i10 = 48891;
                            while (true) {
                                i10 ^= 48908;
                                switch (i10) {
                                    case 22:
                                        break;
                                    case 503:
                                        i10 = 48922;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                }
                JSONObject jSONObject5 = new JSONObject();
                (jSONObject5.put(str2,jSONArray2));
                return (jSONObject5.toString());
            }
        } catch (Throwable th) {
            (th.printStackTrace());
            return "";
        }
    }

    public void init(Context context) {
        Appgz.super.init(context);
        try {
            zH = (C0041.m1976(16).toUpperCase());
            i = (C0041.m1976(16).toUpperCase());
            this.yq = C0014.m419("hide_appgz_token", "");
            m640(this);
            int i2 = (-675) ^ C0038.f96;
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        
                            break;
                        
                    case 204:
                        return;
                    case 239:
                        return;
                }
                i3 = 1678;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = "Lavf/57.83.100";
        String str4 = "User-Agent";
        String str5 = "url";
        String str6 = "&";
        String str7 = "";
        C0029.m1662();
        C0056.m2351(true);
        try {
            String str8 = ((str2.split("vod_d_id="))[1].split(str6))[0];
            String str9 = ((str2.split("vurl_id="))[1].split(str6))[0];
            String str10 = ((str2.split("domain_type="))[1].split(str6))[0];
            String str11 = ((str2.split("resolution="))[1].split(str6))[0];
            String str12 = (str2.split("type="))[1];
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            (jSONObject2.put(str4,str3));
            JSONObject jSONObject3 = new JSONObject();
            (jSONObject3.put("domain_type",str10));
            (jSONObject3.put("vod_id",str8));
            (jSONObject3.put("type",str12));
            (jSONObject3.put("resolution",str11));
            (jSONObject3.put("vurl_id",str9));
            String str13 = (m627(this, jSONObject3).optString(str5,str7));
            boolean z = m646(this, str13);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (!z) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        m633(this);
                        m640(this);
                        boolean z2 = (TextUtils.isEmpty(m638(this)));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (!z2) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    str13 = (m627(this, jSONObject3).optString(str5,str7));
                                    boolean z3 = m646(this, str13);
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                if (z3) {
                                                    break;
                                                } else {
                                                    i4 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                break;
                                            case 47417:
                                                boolean z4 = (TextUtils.isEmpty(str13));
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case 76:
                                                            break;
                                                        case 239:
                                                            if (!z4) {
                                                                break;
                                                            } else {
                                                                i5 = 48860;
                                                                continue;
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                    i5 = 48829;
                                                }
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i4 = 48705;
                                    }
                                    return m629(this);
                                case 500:
                                    return m629(this);
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            (sb.append("ffdsd"));
            (sb.append(str13));
            (printStream.println((sb.toString())));
            (jSONObject.put("parse",0));
            (jSONObject.put("playUrl",str7));
            (jSONObject.put("header",jSONObject2));
            HashMap hashMap = new HashMap();
            (hashMap.put(str4,str3));
            boolean z5 = (str13.contains("m3u8"));
            int i6 = 48891;
            while (true) {
                i6 ^= 48908;
                switch (i6) {
                    case 22:
                        break;
                    case 53:
                        break;
                    case 503:
                        if (!z5) {
                            break;
                        } else {
                            i6 = 49635;
                            continue;
                        }
                    case 32495:
                        str13 = C0048.m2137(str13, hashMap);
                        break;
                    default:
                        continue;
                }
                i6 = 48953;
            }
            (jSONObject.put(str5,str13));
            (jSONObject.put("danmaku",C0033.m1778(str13)));
            return (jSONObject.toString());
        } catch (Throwable th) {
            return str7;
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = "vod_director";
        String str3 = "vod_actor";
        String str4 = "vod_pic";
        String str5 = "vod_id";
        String str6 = "list";
        String str7 = "vod_name";
        try {
            JSONObject jSONObject = new JSONObject();
            (jSONObject.put("keywords",str));
            (jSONObject.put("order_val","1"));
            JSONArray jSONArray = (m647(this, (C0005.m167("https://api.gjjwgp3n.com/App/Index/findMoreVod", m648(this, m638(this), jSONObject), m649(this)).yq())).getJSONArray(str6));
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            (sb.append("suud2"));
            (sb.append(jSONArray));
            (printStream.println((sb.toString())));
            JSONArray jSONArray2 = new JSONArray();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                int i4 = (jSONArray.length());
                int i5 = 1616;
                while (true) {
                    i5 ^= 1633;
                    switch (i5) {
                        case 14:
                        case 49:
                            i5 = i3 < i4 ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject2 = (jSONArray.getJSONObject(i3));
                            boolean z2 = ((jSONObject2.getString(str7)).contains(str));
                            int i6 = 1740;
                            while (true) {
                                i6 ^= 1757;
                                switch (i6) {
                                    case 17:
                                        i6 = !z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        JSONObject jSONObject3 = new JSONObject();
                                        (jSONObject3.put(str5,(jSONObject2.getString(str5))));
                                        (jSONObject3.put(str7,(jSONObject2.getString(str7))));
                                        boolean z3 = C0010.m289((jSONObject2.getString(str7)));
                                        int i7 = 48767;
                                        while (true) {
                                            i7 ^= 48784;
                                            switch (i7) {
                                                case 14:
                                                case 45:
                                                    (jSONObject3.put(str4,(jSONObject2.getString(str4))));
                                                    (jSONObject3.put("vod_remarks",(jSONObject2.getString("vod_scroe"))));
                                                    (jSONObject3.put(str3,(jSONObject2.getString(str3))));
                                                    (jSONObject3.put(str2,(jSONObject2.getString(str2))));
                                                    (jSONObject3.put("vod_content","内详"));
                                                    (jSONArray2.put(jSONObject3));
                                                    break;
                                                case 76:
                                                    int i8 = 48891;
                                                    while (true) {
                                                        i8 ^= 48908;
                                                        switch (i8) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i8 = 48922;
                                                        }
                                                    }
                                                    break;
                                                case 239:
                                                    i7 = z3 ? 48860 : 48829;
                                            }
                                        }
                                        break;
                                    case 500:
                                        int i9 = 1864;
                                        while (true) {
                                            i9 ^= 1881;
                                            switch (i9) {
                                                case 17:
                                                    i9 = 48674;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            i2 = i3 + 1;
                            int i10 = 49666;
                            while (true) {
                                i10 ^= 49683;
                                switch (i10) {
                                    case 17:
                                        i10 = 49697;
                                    case 50:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            JSONObject jSONObject4 = new JSONObject();
                            (jSONObject4.put(str6,jSONArray2));
                            return (jSONObject4.toString());
                    }
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
