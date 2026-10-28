package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0012;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.utils.Crypto;
import com.github.catvod.utils.Filter;
import com.github.catvod.utils.Http;
import com.github.catvod.utils.Proxy;
import com.github.catvod.utils.Store;
import com.github.catvod.utils.Strings;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.URI;
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

    private static final Pattern tF = Pattern.compile("[^0-9a-zA-Z=/+]+");
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

        return;
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
        hashMap = Strings.map(str5, str3, str2, str4);
        str5 = "PackageName";
        str3 = "com.r3ac892153.q1ed27199a.wf930fc6bf20260401";
        hashMap.put(str5,str3);
        str2 = "Ver";
        str4 = "3.0.4.0";
        hashMap.put(str2,str4);
        str5 = "api-ver";
        hashMap.put(str5,str4);
        str3 = "code";
        str2 = "GZ0001";
        hashMap.put(str3,str2);
        str5 = "Referer";
        str4 = "https://api.gjjwgp3n.com";
        hashMap.put(str5,str4);
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
        str2 = Http.post(str2, hashMap, hashMap2);
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
        Store.put(str5, str3);
        str4 = "hide_appgz_token";
        Store.put(str4, str2);
        str5 = "hide_appgz_new_key";
        Store.put(str5, str2);
        str3 = "hide_appgz_utdid";
        Store.put(str3, str2);
        str4 = "hide_appgz_user_id";
        Store.put(str4, str2);
        str5 = "hide_appgz_device_id";
        Store.put(str5, str2);
        this.yq = str2;
        return;
    }

    private String Gc() {
        String str = "";
        try {
            String str2 = Build.SERIAL;

            if (str2 != null) {
                return str2;
            } else {
                return str;
            }
        } catch (Exception e) {

            return str;
        }
    }

    private boolean KJ(String str) {
        boolean z = (TextUtils.isEmpty(str));

        if (!z) {
            try {
                String str2 = (URI.create((str.trim())).getPath());
                if (str2 == null) {
                    return false;
                } else {
                    boolean z2 = (str2.isEmpty());
                    if (!z2) {
                        String str3 = str2;
                        while (true) {
                            boolean z3 = (str3.endsWith("/"));
                            if (z3) {
                                int i6 = (str3.length());
                                if (i6 > 1) {
                                    str3 = (str3.substring(0,(str3.length()) - 1));
                                }
                            }
                        }
                        return ((str3.toLowerCase(Locale.US)).endsWith("/hls/index.m3u8"));
                    } else {
                        return false;
                    }
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
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
        String str3 = (String.valueOf(System.currentTimeMillis() / 1000));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("iv",m645());
        jSONObject2.put("key",m637());
        String str4 = Crypto.rsaEncrypt((jSONObject2.toString()), m641(this));
        String str5 = (jSONObject.toString());
        String str6 = m637();
        String str7 = m645();
        String str8 = "UTF-8";
        boolean z = (TextUtils.isEmpty(str5));

        if (!z) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec((str6.getBytes(str8)), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1,secretKeySpec,new IvParameterSpec((str7.getBytes())));
                str5 = Crypto.hex((cipher.doFinal((str5.getBytes(str8)))));
            } catch (Exception e) {
                e.printStackTrace();
                str5 = null;
                break;
            }
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec((str6.getBytes(str8)), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1,secretKeySpec,new IvParameterSpec((str7.getBytes())));
                str5 = Crypto.hex((cipher.doFinal((str5.getBytes(str8)))));
            } catch (Exception e) {
                e.printStackTrace();
                str5 = null;
                break;
            }
        }
        String str9 = (str5.toUpperCase());
        StringBuilder sb = new StringBuilder();
        sb.append("token_id=,token=");
        sb.append(str);
        sb.append(",phone_type=1,request_key=");
        sb.append(str9);
        sb.append(",app_id=1,time=");
        sb.append(str3);
        sb.append(",keys=");
        sb.append(str4);
        sb.append("*&zvdvdvddbfikkkumtmdwqppp?|4Y!s!2br");
        String str10 = (Crypto.md5((sb.toString())).toUpperCase());
        String str11 = "token";
        String str12 = "";
        HashMap<String, String> hashMap = Strings.map(str11, str, "token_id", str12);
        String str13 = "1";
        hashMap.put("phone_type",str13);
        hashMap.put("time",str3);
        String str14 = "_";
        String str15 = " ";
        try {
            StringBuilder sb2 = new StringBuilder();
            String str16 = ((Build.MANUFACTURER.replaceAll(str15,str12)).replace(str14,str12));
            Locale locale = Locale.US;
            sb2.append((str16.toLowerCase(locale)));
            sb2.append("-");
            sb2.append((((Build.MODEL.replaceAll(str15,str12)).replace(str14,str12)).toLowerCase(locale)));
            str2 = (sb2.toString());
        } catch (Exception e2) {
            str2 = "oneplus-hd1900";
        }
        hashMap.put("phone_model",str2);
        hashMap.put("keys",str4);
        hashMap.put("request_key",str9);
        hashMap.put("signature",str10);
        hashMap.put("app_id",str13);
        hashMap.put("ad_version",str13);
        return hashMap;
    }

    private String SN(boolean z, String str, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("old_key",str);
        jSONObject.put("new_key",str2);
        String str4 = "";

        if (!z) {
            str3 = "https://api.gjjwgp3n.com/App/Authentication/Device/signIn";
        } else {
            jSONObject.put("phone_type",1);
            jSONObject.put("code",str4);
            str3 = "https://api.gjjwgp3n.com/App/Authentication/Device/signUp";
            str3 = "https://api.gjjwgp3n.com/App/Authentication/Device/signIn";
        }
        return (m647(this, (Http.post(str3, m648(this, str4, jSONObject), m649(this)))).optString("token",str4));
    }

    private static int dT(String str) {
        int i2 = 0;

        if (!(str == null)) {
            int i4 = (str.length());
            if (i4 > 0) {
                char[] cArr = (str.toCharArray());
                int length = cArr.length;
                int i6 = 0;
                while (true) {
                    int i7 = i2;
                    if (i6 < length) {
                        i2 = (i7 * 31) + cArr[i6];
                        i6++;
                    } else {
                        return i7;
                    }
                }
            } else {
                char[] cArr = (str.toCharArray());
                int length = cArr.length;
                int i6 = 0;
                while (true) {
                    int i7 = i2;
                    if (i6 < length) {
                        i2 = (i7 * 31) + cArr[i6];
                        i6++;
                    } else {
                        return i7;
                    }
                }
            }
        }
        return 0;
    }

    public static String generateRandomString(int i2) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int i3 = 0;
        while (true) {

            if (i3 < i2) {
                sb.append(("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt((random.nextInt(62)))));
                i3++;
            } else {
                return (sb.toString());
            }
        }
    }

    private String i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = (new Random().nextInt());
        byteArrayOutputStream.write(m644((int) (System.currentTimeMillis() / 1000)),0,4);
        byteArrayOutputStream.write(m644(i2),0,4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        String str = m643(this);
        boolean z = (TextUtils.isEmpty(str));

        if (z) {
            str = (String.valueOf((new Random().nextInt())));
        }
        byteArrayOutputStream.write(m644(m636(str)),0,4);
        byte[] bArr = (byteArrayOutputStream.toByteArray());
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(("d6fc3a4a06adbde89223bvefedc24fecde188aaa9161".getBytes("UTF-8")), (mac.getAlgorithm())));
        byteArrayOutputStream.write(m644(m636(Base64.encodeToString((mac.doFinal(bArr)), 2))),0,4);
        String str2 = Base64.encodeToString((byteArrayOutputStream.toByteArray()), 2);
        boolean z2 = (str2.endsWith("\n"));

        if (!z2) {
            return str2;
        } else {
            return (str2.substring(0,(str2.length()) - 1));
        }
    }

    private boolean q(String str) {
        boolean z = true;

        if (str != null) {
            boolean z2 = (str.endsWith("\n"));
            if (z2) {
                str = (str.substring(0,(str.length()) - 1));
            }
            int i4 = (str.length());
            if (!(i4 != 24)) {
                boolean z3 = ((m628().matcher(str)).find());
            }
            z = false;
            return z;
        } else {
            return false;
        }
    }

    private String t0() {
        String str = "hide_appgz_android_id";
        String str2 = "";
        String str3 = Store.get(str, str2);
        boolean z = (TextUtils.isEmpty(str3));

        if (z) {
            try {
                Application application = InitOrigin.context();
                if (!(application == null)) {
                    str3 = Settings.Secure.getString((application.getContentResolver()), "android_id");
                }
            } catch (Exception e) {
            }
            str3 = str2;
            boolean z2 = (TextUtils.isEmpty(str3));
            if (z2) {
                str3 = (((UUID.randomUUID().toString()).replace("-",str2)).substring(0,16));
            }
            Store.put(str, str3);
        } else {
            try {
                Application application = InitOrigin.context();
                if (!(application == null)) {
                    str3 = Settings.Secure.getString((application.getContentResolver()), "android_id");
                }
            } catch (Exception e) {
            }
            str3 = str2;
            boolean z2 = (TextUtils.isEmpty(str3));
            if (z2) {
                str3 = (((UUID.randomUUID().toString()).replace("-",str2)).substring(0,16));
            }
            Store.put(str, str3);
        }
        return str3;
    }

    private JSONObject tF(String str) {
        String str2;
        JSONObject jSONObject = (new JSONObject(str).getJSONObject("data"));
        JSONObject jSONObject2 = new JSONObject(Crypto.rsaDecrypt((jSONObject.getString("keys")), m630(this)));
        try {
            str2 = new String(Crypto.aesDecrypt(Crypto.unhex(((jSONObject.getString("response_key")).replace("\\",""))), ((jSONObject2.getString("key")).getBytes()), ((jSONObject2.getString("iv")).getBytes())));
        } catch (Exception e) {
            m642(e);
            str2 = null;
        }
        return new JSONObject(str2);
    }

    private String yq() {
        String str = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parse",0);
            jSONObject.put("url",str);
            jSONObject.put("msg","防盗链账号");
            return (jSONObject.toString());
        } catch (Exception e) {

            return str;
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

        return ((Appgz) obj).G((JSONObject) obj2);
    }

    /* renamed from: جﻉﻙو  reason: contains not printable characters */
    public static Pattern m628() {

        return tF;
    }

    /* renamed from: سزﻅق  reason: contains not printable characters */
    public static String m629(Object obj) {

        return ((Appgz) obj).yq();
    }

    /* renamed from: ضﺭجذ  reason: contains not printable characters */
    public static String m630(Object obj) {

        return ((Appgz) obj).SN;
    }

    /* renamed from: غكدي  reason: contains not printable characters */
    public static String m631(Object obj) {

        return ((Appgz) obj).i();
    }

    /* renamed from: كرشﺎ  reason: contains not printable characters */
    public static String m632(Object obj, boolean z, Object obj2, Object obj3) {

        return ((Appgz) obj).SN(z, (String) obj2, (String) obj3);
    }

    /* renamed from: كفﻭت  reason: contains not printable characters */
    public static void m633(Object obj) {

        ((Appgz) obj).G4();
        return;
    }

    /* renamed from: لواـ  reason: contains not printable characters */
    public static String m634(Object obj) {

        return ((Appgz) obj).Gc();
    }

    /* renamed from: لﺏبت  reason: contains not printable characters */
    public static boolean m635(Object obj, Object obj2) {

        return ((Appgz) obj).q((String) obj2);
    }

    /* renamed from: لﺕوظ  reason: contains not printable characters */
    public static int m636(Object obj) {

        return dT((String) obj);
    }

    /* renamed from: هﻝﺡﺱ  reason: contains not printable characters */
    public static String m637() {

        return zH;
    }

    /* renamed from: ﺏرﻍﺭ  reason: contains not printable characters */
    public static String m638(Object obj) {

        return ((Appgz) obj).yq;
    }

    /* renamed from: ﺕﻝاق  reason: contains not printable characters */
    public static void m640(Object obj) {

        ((Appgz) obj).zH();
        return;
    }

    /* renamed from: ﺙجنو  reason: contains not printable characters */
    public static String m641(Object obj) {

        return ((Appgz) obj).N;
    }

    /* renamed from: ﺡﻅﻩج  reason: contains not printable characters */
    public static void m642(Object obj) {

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: ﺫﺹﻅﺽ  reason: contains not printable characters */
    public static String m643(Object obj) {

        return ((Appgz) obj).t0();
    }

    /* renamed from: ﻁشﻍك  reason: contains not printable characters */
    public static byte[] m644(int i2) {

        return M(i2);
    }

    /* renamed from: ﻍمصذ  reason: contains not printable characters */
    public static String m645() {

        return i;
    }

    /* renamed from: ﻙﺡﻉب  reason: contains not printable characters */
    public static boolean m646(Object obj, Object obj2) {

        return ((Appgz) obj).KJ((String) obj2);
    }

    /* renamed from: ﻡﺵﻁﻅ  reason: contains not printable characters */
    public static JSONObject m647(Object obj, Object obj2) {

        return ((Appgz) obj).tF((String) obj2);
    }

    /* renamed from: ﻡﻝعﺹ  reason: contains not printable characters */
    public static HashMap m648(Object obj, Object obj2, Object obj3) {

        return ((Appgz) obj).N((String) obj2, (JSONObject) obj3);
    }

    /* renamed from: ﻱﻍﻙﻭ  reason: contains not printable characters */
    public static HashMap m649(Object obj) {

        return ((Appgz) obj).B();
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
            sb.append("tidd");
            sb.append(str);
            printStream.println((sb.toString()));
            boolean z2 = ("1".equals(str));
            String str11 = "30";

            if (!z2) {
                boolean z3 = ("2".equals(str));
                if (!z3) {
                    boolean z4 = ("3".equals(str));
                    if (!z4) {
                        str3 = str11;
                    } else {
                        str3 = "22";
                        str3 = str11;
                    }
                } else {
                    str3 = "12";
                    boolean z4 = ("3".equals(str));
                    if (!z4) {
                        str3 = str11;
                    } else {
                        str3 = "22";
                        str3 = str11;
                    }
                }
            } else {
                str3 = "5";
                boolean z3 = ("2".equals(str));
                if (!z3) {
                    boolean z4 = ("3".equals(str));
                    if (!z4) {
                        str3 = str11;
                    } else {
                        str3 = "22";
                        str3 = str11;
                    }
                } else {
                    str3 = "12";
                    boolean z4 = ("3".equals(str));
                    if (!z4) {
                        str3 = str11;
                    } else {
                        str3 = "22";
                        str3 = str11;
                    }
                }
            }
            Object obj = (hashMap.get(str10));

            if (!(obj != null)) {
                hashMap.put(str10,str8);
            }
            Object obj2 = (hashMap.get(str9));

            if (!(obj2 != null)) {
                hashMap.put(str9,str8);
            }
            String str12 = (String) (hashMap.get(str10));
            String str13 = (String) (hashMap.get(str9));
            JSONObject jSONObject = new JSONObject();
            boolean z5 = (TextUtils.isEmpty(str12));
            String str14 = "0";

            if (z5) {
                str12 = str14;
            }
            jSONObject.put(str10,str12);
            jSONObject.put("sub",str3);
            boolean z6 = (TextUtils.isEmpty(str13));

            if (z6) {
                str13 = str14;
            }
            jSONObject.put(str9,str13);
            jSONObject.put("pageSize",str11);
            jSONObject.put("sort","d_id");
            jSONObject.put("page",str2);
            jSONObject.put("tid",str);
            JSONArray jSONArray = (m647(this, (Http.post("https://api.gjjwgp3n.com/App/IndexList/indexList", m648(this, m638(this), jSONObject), m649(this)))).getJSONArray(str6));
            new ArrayList();
            JSONArray jSONArray2 = new JSONArray();
            int i12 = 0;
            while (true) {
                int i13 = (jSONArray.length());

                if (i12 < i13) {
                    JSONObject jSONObject3 = (jSONArray.getJSONObject(i12));
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(str5,(jSONObject3.getString(str5)));
                    jSONObject4.put(str7,(jSONObject3.getString(str7)));
                    boolean z7 = Filter.blocked((jSONObject3.getString(str7)));
                    if (!(z7)) {
                        jSONObject4.put(str4,(jSONObject3.getString(str4)));
                        jSONObject4.put("vod_remarks",(jSONObject3.getString("vod_scroe")));
                        jSONArray2.put(jSONObject4);
                    }
                    i12++;
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    Integer.parseInt(str2);
                    int i15 = (jSONArray2.length());
                    jSONObject2.put("limit",30);
                    jSONObject2.put("total",i15);
                    jSONObject2.put(str6,jSONArray2);
                    return (jSONObject2.toString());
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
            jSONObject.put("token_id",str13);
            try {
                jSONObject.put(str12,(list.get(0)));
                jSONObject.put("mobile_time",(String.valueOf(System.currentTimeMillis() / 1000)));
                jSONObject.put("token",m638(this));
                JSONObject jSONObject2 = (m647(this, (Http.post("https://api.gjjwgp3n.com/App/IndexPlay/playInfo", m648(this, m638(this), jSONObject), m649(this)))).getJSONObject("vodInfo"));
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append("822");
                sb.append(jSONObject2);
                printStream.println((sb.toString()));
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(str12,(jSONObject2.getString(str12)));
                jSONObject4.put(str8,(jSONObject2.getString(str8)));
                jSONObject4.put(str7,(jSONObject2.getString(str7)));
                jSONObject4.put("vod_class","未知");
                jSONObject4.put(str6,(jSONObject2.getString(str6)));
                jSONObject4.put(str5,(jSONObject2.getString(str5)));
                jSONObject4.put("vod_remarks",(jSONObject2.getString("vod_title")));
                jSONObject4.put(str4,(jSONObject2.getString(str4)));
                jSONObject4.put(str11,(jSONObject2.getString(str11)));
                jSONObject4.put("vod_content","内详");
                PrintStream printStream2 = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("wbuz");
                sb2.append((jSONObject2.getString(str11)));
                printStream2.println((sb2.toString()));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("vurl_cloud_id","2");
                int i2 = 0;
                jSONObject5.put("vod_d_id",(list.get(0)));
                JSONObject jSONObject6 = m647(this, (Http.post("https://api.gjjwgp3n.com/App/Resource/Vurl/show", m648(this, m638(this), jSONObject5), m649(this))));
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray2 = (jSONObject6.getJSONArray(str3));
                while (true) {
                    int i3 = (jSONArray2.length());

                    if (i2 < i3) {
                        JSONObject jSONObject7 = (jSONArray2.getJSONObject(i2));
                        String str14 = (jSONObject7.getString("title"));
                        String str15 = (((jSONObject7.getJSONObject(str10)).getJSONObject("1080")).getString(str9));
                        String str16 = (((jSONObject7.getJSONObject(str10)).getJSONObject("720")).getString(str9));
                        String str17 = (((jSONObject7.getJSONObject(str10)).getJSONObject("480")).getString(str9));
                        PrintStream printStream3 = System.out;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("ff618");
                        sb3.append(str17);
                        printStream3.println((sb3.toString()));
                        boolean z = (str15.isEmpty());
                        if (z) {
                            boolean z2 = (str16.isEmpty());
                            if (!z2) {
                                str15 = str16;
                            } else {
                                str15 = str17;
                            }
                        }
                        PrintStream printStream4 = System.out;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Title: ");
                        sb4.append(str14);
                        printStream4.println((sb4.toString()));
                        PrintStream printStream5 = System.out;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("1080p Param: ");
                        sb5.append(str15);
                        printStream5.println((sb5.toString()));
                        String str18 = "专线播放";
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str14);
                        sb6.append("$");
                        sb6.append(str15);
                        arrayList.add((sb6.toString()));
                        int i9 = (arrayList.size());
                        if (i9 > 0) {
                            str = (TextUtils.join("#",arrayList));
                        } else {
                            str = str13;
                        }
                        int i12 = (str.length());
                        if (!(i12 == 0)) {
                            linkedHashMap.put(str18,str);
                        }
                        i2++;
                    } else {
                        int i16 = (linkedHashMap.size());
                        if (!(i16 <= 0)) {
                            String str19 = (TextUtils.join(str2,(linkedHashMap.keySet())));
                            String str20 = (TextUtils.join(str2,(linkedHashMap.values())));
                            jSONObject4.put("vod_play_from",str19);
                            jSONObject4.put("vod_play_url",str20);
                        }
                        jSONArray.put(jSONObject4);
                        jSONObject3.put(str3,jSONArray);
                        return (jSONObject3.toString());
                    }
                }
            } catch (Throwable th) {

                return str13;
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

                if (z2) {
                    JSONObject jSONObject2 = new JSONObject();
                    String str = (String) (it.next());
                    jSONObject2.put("type_name",str);
                    jSONObject2.put("type_id",(jSONObject.getString(str)));
                    jSONArray.put(jSONObject2);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    if (z) {
                        jSONObject3.put("filters",new JSONObject("{\"1\":[{\"name\":\"按地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"}]}],\"2\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"}]}],\"3\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"更早\",\"v\":\"更早\"}]}],\"4\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"},{\"n\":\"更早\",\"v\":\"更早\"}]}]}"));
                    }
                    jSONObject3.put("class",jSONArray);
                    return (jSONObject3.toString());
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
                jSONObject.put("pid","1");
                jSONArray = (m647(this, (Http.post("https://api.gjjwgp3n.com/App/IndexList/index", m648(this, m638(this), jSONObject), m649(this)))).getJSONArray(str2));
                i2 = 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
            while (true) {
                int i3 = (jSONArray.length());

                if (i2 < i3) {
                    JSONObject jSONObject2 = (jSONArray.getJSONObject(i2));
                    boolean z = ((jSONObject2.getString("type")).contains("热门推荐"));
                    if (z) {
                        JSONArray jSONArray3 = (jSONObject2.getJSONArray(str2));
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder();
                        sb.append("jmm112");
                        sb.append(jSONArray3);
                        printStream.println((sb.toString()));
                        int i6 = 0;
                        while (true) {
                            int i7 = (jSONArray3.length());
                            if (i6 < i7) {
                                JSONObject jSONObject3 = (jSONArray3.getJSONObject(i6));
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put(str,(jSONObject3.getString(str)));
                                jSONObject4.put("vod_name",(jSONObject3.getString("c_name")));
                                jSONObject4.put("vod_pic",(jSONObject3.getString("c_pic")));
                                jSONObject4.put("vod_remarks",(jSONObject3.getString("new_continue")));
                                jSONArray2.put(jSONObject4);
                                i6++;
                            }
                        }
                    }
                    i2++;
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(str2,jSONArray2);
                return (jSONObject5.toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public void init(Context context) {
        Appgz.super.init(context);
        try {
            zH = (generateRandomString(16).toUpperCase());
            i = (generateRandomString(16).toUpperCase());
            this.yq = Store.get("hide_appgz_token", "");
            m640(this);

            return;
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
        ProxyOrigin.getan();
        cn.F5(true);
        try {
            String str8 = ((str2.split("vod_d_id="))[1].split(str6))[0];
            String str9 = ((str2.split("vurl_id="))[1].split(str6))[0];
            String str10 = ((str2.split("domain_type="))[1].split(str6))[0];
            String str11 = ((str2.split("resolution="))[1].split(str6))[0];
            String str12 = (str2.split("type="))[1];
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str4,str3);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("domain_type",str10);
            jSONObject3.put("vod_id",str8);
            jSONObject3.put("type",str12);
            jSONObject3.put("resolution",str11);
            jSONObject3.put("vurl_id",str9);
            String str13 = (m627(this, jSONObject3).optString(str5,str7));
            boolean z = m646(this, str13);

            if (z) {
                m633(this);
                m640(this);
                boolean z2 = (TextUtils.isEmpty(m638(this)));
                if (!z2) {
                    str13 = (m627(this, jSONObject3).optString(str5,str7));
                    boolean z3 = m646(this, str13);
                    if (!(z3)) {
                        boolean z4 = (TextUtils.isEmpty(str13));
                    }
                    return m629(this);
                } else {
                    return m629(this);
                }
            }
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("ffdsd");
            sb.append(str13);
            printStream.println((sb.toString()));
            jSONObject.put("parse",0);
            jSONObject.put("playUrl",str7);
            jSONObject.put("header",jSONObject2);
            HashMap hashMap = new HashMap();
            hashMap.put(str4,str3);
            boolean z5 = (str13.contains("m3u8"));

            if (z5) {
                str13 = Proxy.m3u8(str13, hashMap);
            }
            jSONObject.put(str5,str13);
            jSONObject.put("danmaku",iX.M(str13));
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
            jSONObject.put("keywords",str);
            jSONObject.put("order_val","1");
            JSONArray jSONArray = (m647(this, (Http.post("https://api.gjjwgp3n.com/App/Index/findMoreVod", m648(this, m638(this), jSONObject), m649(this)))).getJSONArray(str6));
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("suud2");
            sb.append(jSONArray);
            printStream.println((sb.toString()));
            JSONArray jSONArray2 = new JSONArray();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                int i4 = (jSONArray.length());

                if (i3 < i4) {
                    JSONObject jSONObject2 = (jSONArray.getJSONObject(i3));
                    boolean z2 = ((jSONObject2.getString(str7)).contains(str));
                    if (z2) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str5,(jSONObject2.getString(str5)));
                        jSONObject3.put(str7,(jSONObject2.getString(str7)));
                        boolean z3 = Filter.blocked((jSONObject2.getString(str7)));
                        if (!(z3)) {
                            jSONObject3.put(str4,(jSONObject2.getString(str4)));
                            jSONObject3.put("vod_remarks",(jSONObject2.getString("vod_scroe")));
                            jSONObject3.put(str3,(jSONObject2.getString(str3)));
                            jSONObject3.put(str2,(jSONObject2.getString(str2)));
                            jSONObject3.put("vod_content","内详");
                            jSONArray2.put(jSONObject3);
                        }
                    }
                    i2 = i3 + 1;
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(str6,jSONArray2);
                    return (jSONObject4.toString());
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
