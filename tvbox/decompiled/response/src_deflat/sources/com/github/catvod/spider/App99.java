package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class App99 extends Spider {

    private String B;
    private Map<String, Object> F5;
    private int G;
    private Map<String, String> G4;
    private String Gc;
    private String KJ;
    private String M;
    private String N;
    private String SN;
    private OkHttpClient W;
    private Map<String, String> dT;
    private String i;
    private String q;
    private String t0;
    private String tF;
    private JSONArray v3;
    private String yq;
    private String zH;

    public App99() {

        return;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0139 A[SYNTHETIC] */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    private boolean B() {
        /*
        Method dump skipped, instructions count: 628
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.B():boolean");
    }

    private void F5(JSONObject jSONObject) {
        m514(this).put("player",jSONObject);
        Iterator it = (jSONObject.keys());
        while (true) {
            boolean z = (it.hasNext());

            if (z) {
                JSONObject jSONObject2 = (jSONObject.optJSONObject((String) (it.next())));
                if (jSONObject2 != null) {
                    String str = "";
                    String str2 = ((jSONObject2.optString("code",str)).trim());
                    String str3 = ((jSONObject2.optString("name",str)).trim());
                    boolean z2 = (str2.isEmpty());
                    if (!z2) {
                        HashMap hashMap = m500(this);
                        boolean z3 = (str3.isEmpty());
                        if (z3) {
                            str3 = str2;
                        }
                        hashMap.put(str2,str3);
                    }
                }
            } else {
                return;
            }
        }
    }

    private Map<String, String> G(String str, String str2, String str3) {
        String str4;
        byte[] bArr;
        StringBuilder sb;
        int length;
        int i = 0;
        try {
            bArr = (C0027.m1581("SHA-256").digest(((String.format("%s:%s:%s:%s:%s",new Object[]{str3, str2, str, m519(this), m527(this)})).getBytes(StandardCharsets.UTF_8))));
            sb = new StringBuilder();
            length = bArr.length;
        } catch (Exception e) {
            str4 = "";
        }
        while (true) {

            if (i < length) {
                String str5 = (Integer.toHexString(bArr[i] & 255));
                int i3 = (str5.length());
                if (i3 == 1) {
                    sb.append('0');
                }
                sb.append(str5);
                i++;
            } else {
                str4 = (sb.toString());
            }
            HashMap hashMap = new HashMap(m479(this));
            hashMap.put("uuid",m523(this));
            hashMap.put("timestamp",str2);
            hashMap.put("sign",str4);
            hashMap.put("nonce",str);
            hashMap.put("appkey",m527(this));
            hashMap.put("version",m521(this));
            hashMap.put("api_version","v1");
            return hashMap;
        }
    }

    private boolean G4() {
        String str = "data";
        String str2 = "categorys";
        String str3 = "parser_api";
        String str4 = "player";
        try {
            String str5 = m499(this);
            String str6 = m491(this);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v",m509(this));
            jSONObject.put("n",m492(this));
            jSONObject.put("s",m489(this));
            jSONObject.put("pl","1");
            jSONObject.put("apiVersion","v2");
            jSONObject.put("token","");
            jSONObject.put("timestamp",str6);
            jSONObject.put("nonce",str5);
            String str7 = m494(this, (jSONObject.toString()));
            Map map = m520(this, str5, str6, str7);
            StringBuilder sb = new StringBuilder();
            sb.append(m512(this));
            sb.append("/app/systemInit");
            String str8 = m517(this, m518(this, (sb.toString()), str7, map));
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IINt");
            sb2.append(str8);
            printStream.println((sb2.toString()));

            if (!(str8 == null)) {
                boolean z = (str8.isEmpty());
                if (!z) {
                    JSONObject jSONObject2 = new JSONObject(str8);
                    boolean z2 = (jSONObject2.has(str4));
                    if (z2) {
                        JSONObject jSONObject3 = (jSONObject2.optJSONObject(str4));
                        if (!(jSONObject3 == null)) {
                            m487(this, jSONObject3);
                        }
                    }
                    boolean z3 = (jSONObject2.has(str3));
                    if (z3) {
                        JSONArray jSONArray = (jSONObject2.optJSONArray(str3));
                        if (!(jSONArray == null)) {
                            m514(this).put("parses",jSONArray);
                            this.v3 = jSONArray;
                        }
                    }
                    boolean z4 = (jSONObject2.has(str2));
                    if (!z4) {
                        return true;
                    } else {
                        JSONObject jSONObject4 = (jSONObject2.optJSONObject(str2));
                        if (jSONObject4 == null) {
                            return true;
                        } else {
                            boolean z5 = (jSONObject4.has(str));
                            if (!z5) {
                                return true;
                            } else {
                                JSONArray jSONArray2 = (jSONObject4.optJSONArray(str));
                                if (jSONArray2 == null) {
                                    return true;
                                } else {
                                    m514(this).put("categories",jSONArray2);
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject(str8);
                    boolean z2 = (jSONObject2.has(str4));
                    if (z2) {
                        JSONObject jSONObject3 = (jSONObject2.optJSONObject(str4));
                        if (!(jSONObject3 == null)) {
                            m487(this, jSONObject3);
                        }
                    }
                    boolean z3 = (jSONObject2.has(str3));
                    if (z3) {
                        JSONArray jSONArray = (jSONObject2.optJSONArray(str3));
                        if (!(jSONArray == null)) {
                            m514(this).put("parses",jSONArray);
                            this.v3 = jSONArray;
                        }
                    }
                    boolean z4 = (jSONObject2.has(str2));
                    if (!z4) {
                        return true;
                    } else {
                        JSONObject jSONObject4 = (jSONObject2.optJSONObject(str2));
                        if (jSONObject4 == null) {
                            return true;
                        } else {
                            boolean z5 = (jSONObject4.has(str));
                            if (!z5) {
                                return true;
                            } else {
                                JSONArray jSONArray2 = (jSONObject4.optJSONArray(str));
                                if (jSONArray2 == null) {
                                    return true;
                                } else {
                                    m514(this).put("categories",jSONArray2);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String Gc() {
        byte[] bArr = null;
        String str2 = null;
        SecureRandom secureRandom = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        bArr = new byte[16];
        secureRandom = new SecureRandom();
        secureRandom.nextBytes(bArr);
        str2 = C0034.m1790(bArr, 2);
        return str2;
    }

    private JSONObject KJ(String str) {
        Object obj = (m514(this).get("player"));
        boolean z = obj instanceof JSONObject;

        if (z) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator it = (jSONObject.keys());
            while (true) {
                boolean z2 = (it.hasNext());
                if (z2) {
                    JSONObject jSONObject2 = (jSONObject.optJSONObject((String) (it.next())));
                    if (jSONObject2 != null) {
                        boolean z3 = (((jSONObject2.optString("code","")).trim()).equalsIgnoreCase((str.trim())));
                        if (z3) {
                            PrintStream printStream = System.out;
                            StringBuilder sb = new StringBuilder();
                            sb.append("8889code");
                            sb.append(jSONObject2);
                            printStream.println((sb.toString()));
                            return jSONObject2;
                        }
                    }
                }
            }
        }
        return new JSONObject();
    }

    private String M(JSONObject jSONObject, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            String str = "";

            if (i < length) {
                String str2 = (jSONObject.optString(strArr[i],str));
                boolean z = (str2.isEmpty());
                if (!z) {
                    boolean z2 = ("null".equalsIgnoreCase(str2));
                    if (!z2) {
                        return str2;
                    }
                }
                i++;
            } else {
                return str;
            }
        }
    }

    private String N(String str, String str2) {
        byte[] bArr = C0022.m1420(str, 2);
        int length = bArr.length;

        if (length < 16) {
            throw new Exception("Invalid ciphertext length");
        } else {
            byte[] bArr2 = (Arrays.copyOfRange(bArr,0,16));
            byte[] bArr3 = (Arrays.copyOfRange(bArr,16,bArr.length));
            SecretKeySpec secretKeySpec = new SecretKeySpec(m515(this, str2), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = C0029.m1636("AES/CBC/PKCS5Padding");
            cipher.init(2,secretKeySpec,ivParameterSpec);
            byte[] bArr4 = (cipher.doFinal(bArr3));
            try {
                return m525(this, bArr4);
            } catch (Exception e) {
                try {
                    return new String(bArr4, StandardCharsets.UTF_8);
                } catch (Exception e2) {
                    return new String(bArr4, "ISO-8859-1");
                }
            }
            throw new Exception("Invalid ciphertext length");
        }
    }

    private String SN(String str) {

        if (str != null) {
            String str2 = (str.trim());
            try {
                return m531(this, str2, m523(this));
            } catch (Exception e) {
                try {
                    return m531(this, str2, null);
                } catch (Exception e2) {
                    throw new Exception("decrypt failed", e2);
                }
            }
        } else {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0012 A[EXC_TOP_SPLITTER, LOOP_START, SYNTHETIC] */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String W(byte[] r7) {
        /*
        r6 = this;
        java.util.zip.Inflater r1 = new java.util.zip.Inflater
        r1.<init>()
        (r1.setInput(r7))
        java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
        int r0 = r7.length
        r2.<init>(r0)
        r0 = 1024(0x400, float:1.435E-42)
        byte[] r3 = new byte[r0]
    L12:
        boolean r4 = (r1.finished())     // Catch: java.lang.Throwable -> L87
        r0 = 1616(0x650, float:2.264E-42)
    L18:
        r0 = r0 ^ 1633(0x661, float:2.288E-42)
        switch(r0) {
            case 14: goto L1e;
            case 49: goto L21;
            case 204: goto L26;
            case 239: goto L5b;
            default: goto L1d;
        }     // Catch: java.lang.Throwable -> L87
    L1d:
        goto L18
    L1e:
        r0 = 1678(0x68e, float:2.351E-42)
        goto L18
    L21:
        if (r4 != 0) goto L1e
        r0 = 1709(0x6ad, float:2.395E-42)
        goto L18
    L26:
        int r4 = (r1.inflate(r3))     // Catch: java.lang.Throwable -> L87
        r0 = 1740(0x6cc, float:2.438E-42)
    L2c:
        r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
        switch(r0) {
            case 17: goto L32;
            case 54: goto L37;
            case 471: goto L74;
            case 500: goto L3a;
            default: goto L31;
        }     // Catch: java.lang.Throwable -> L87
    L31:
        goto L2c
    L32:
        if (r4 != 0) goto L37
        r0 = 1833(0x729, float:2.569E-42)
        goto L2c
    L37:
        r0 = 1802(0x70a, float:2.525E-42)
        goto L2c
    L3a:
        boolean r5 = (r1.needsInput())     // Catch: java.lang.Throwable -> L87
        r0 = 1864(0x748, float:2.612E-42)
    L40:
        r0 = r0 ^ 1881(0x759, float:2.636E-42)
        switch(r0) {
            case 17: goto L46;
            case 47384: goto L74;
            case 47417: goto L50;
            case 47483: goto L4c;
            default: goto L45;
        }
    L45:
        goto L40
    L46:
        if (r5 == 0) goto L4c
        r0 = 48736(0xbe60, float:6.8294E-41)
        goto L40
    L4c:
        r0 = 48705(0xbe41, float:6.825E-41)
        goto L40
    L50:
        r0 = 48767(0xbe7f, float:6.8337E-41)
    L53:
        r3 = 48784(0xbe90, float:6.8361E-41)
        r0 = r0 ^ r3
        switch(r0) {
            case 14: goto L5b;
            case 239: goto L70;
            default: goto L5a;
        }
    L5a:
        goto L53
    L5b:
        (r1.end())
        short[] r0 = m513()
        r1 = 380(0x17c, float:5.32E-43)
        r3 = 5
        r4 = 680(0x2a8, float:9.53E-43)
        java.lang.String r0 = com.github.catvod.parser.C0009.m277(r0, r1, r3, r4)
        java.lang.String r0 = (r2.toString(r0))
        return r0
    L70:
        r0 = 48798(0xbe9e, float:6.838E-41)
        goto L53
    L74:
        r0 = 0
        (r2.write(r3,r0,r4))     // Catch: java.lang.Throwable -> L87
        r0 = 48891(0xbefb, float:6.8511E-41)
    L7b:
        r4 = 48908(0xbf0c, float:6.8535E-41)
        r0 = r0 ^ r4
        switch(r0) {
            case 22: goto L12;
            case 503: goto L83;
            default: goto L82;
        }
    L82:
        goto L7b
    L83:
        r0 = 48922(0xbf1a, float:6.8554E-41)
        goto L7b
    L87:
        r0 = move-exception
        (r1.end())
        r1 = 49666(0xc202, float:6.9597E-41)
    L8e:
        r2 = 49683(0xc213, float:6.9621E-41)
        r1 = r1 ^ r2
        switch(r1) {
            case 17: goto L96;
            case 50: goto L9b;
            default: goto L95;
        }
    L95:
        goto L8e
    L96:
        r1 = 49697(0xc221, float:6.964E-41)
        goto L8e
    L9a:
        throw r0
    L9b:
        r1 = 49790(0xc27e, float:6.977E-41)
    L9e:
        r2 = 49807(0xc28f, float:6.9794E-41)
        r1 = r1 ^ r2
        switch(r1) {
            case 18: goto L9a;
            case 241: goto La6;
            default: goto La5;
        }
    La5:
        goto L9e
    La6:
        r1 = 49821(0xc29d, float:6.9814E-41)
        goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.W(byte[]):java.lang.String");
    }

    private String dT() {
        return (String.valueOf(System.currentTimeMillis()));
    }

    private String ee(String str, String str2, Map<String, String> map) {
        Request.Builder builder;
        Iterator it;
        try {
            builder = m528(m503(new Request.Builder(), str), m522(m483("application/json; charset=utf-8"), str2));
            it = ((map.entrySet()).iterator());
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            boolean z = (it.hasNext());

            if (z) {
                Map.Entry entry = (Map.Entry) (it.next());
                m493(builder, (String) (entry.getKey()), (String) (entry.getValue()));
            } else {
                Response response = m488(m510(m496(this), m486(builder)));
                boolean z2 = m502(response);
                if (z2) {
                    ResponseBody responseBody = m498(response);
                    if (!(responseBody == null)) {
                        String str3 = m478(m498(response));
                        m526(response);
                        return str3;
                    }
                }
                m526(response);
            }
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
    return (Integer.parseInt((r3.getString(r4))));
    */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    r0 = 49666;
    */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    r0 = r0 ^ 49683;
    */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    switch(r0) {
        case 17: goto L113;
        case 50: goto L114;
        case 76: goto L115;
        case 83: goto L111;
        default: goto L119;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    if (r1 >= 3) goto L116;
    */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    r0 = 49759;
    */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    r0 = 49728;
    */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    r4 = r5[r1];
    r6 = (r3.has(r4));
    r0 = 49790;
    */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    r0 = r0 ^ 49807;
    */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    switch(r0) {
        case 18: goto L122;
        case 51: goto L124;
        case 84: goto L62;
        case 241: goto L123;
        default: goto L128;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    r0 = 49852;
    */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    if (r6 == false) goto L126;
    */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
    r0 = 49883;
    */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
    r1 = r1 + 1;
    r0 = 49914;
    */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    r0 = r0 ^ 49931;
    */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
    switch(r0) {
        case 497: goto L132;
        case 1711: goto L131;
        default: goto L134;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f6, code lost:
    r0 = 50596;
    */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
    r0 = 50813;
    */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0111, code lost:
    r0 = r0 ^ 50830;
    */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    switch(r0) {
        case 18: goto L141;
        case 243: goto L142;
        default: goto L144;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
    r0 = 50844;
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    private int i(org.json.JSONObject r10) {
        /*
        Method dump skipped, instructions count: 434
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.i(org.json.JSONObject):int");
    }

    private String q(String str, JSONObject jSONObject) {
        String str2 = "nonce";
        String str3 = "timestamp";
        String str4 = "token";
        try {
            String str5 = m499(this);
            String str6 = m491(this);
            boolean z = (jSONObject.has(str4));

            if (!(z)) {
                jSONObject.put(str4,m519(this));
            }
            boolean z2 = (jSONObject.has(str3));

            if (!(z2)) {
                jSONObject.put(str3,str6);
            }
            boolean z3 = (jSONObject.has(str2));

            if (!(z3)) {
                jSONObject.put(str2,str5);
            }
            String str7 = m494(this, (jSONObject.toString()));
            Map map = m520(this, str5, str6, str7);
            StringBuilder sb = new StringBuilder();
            sb.append(m512(this));
            sb.append(str);
            return m517(this, m518(this, (sb.toString()), str7, map));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private byte[] t0(String str) {

        if (!(str == null)) {
            boolean z = (str.isEmpty());
        }
        str = m523(this);
        String str2 = "";

        if (!(str != null)) {
            str = str2;
        }
        byte[] bArr = ((str.replace("-",str2)).getBytes(StandardCharsets.UTF_8));
        int length = bArr.length;

        if (length == 16) {
            return bArr;
        } else {
            int length2 = bArr.length;
            if (length2 == 24) {
                return bArr;
            } else {
                int length3 = bArr.length;
                if (length3 != 32) {
                    int length4 = bArr.length;
                    if (length4 <= 32) {
                        byte[] bArr2 = new byte[32];
                        C0025.m1532(bArr, 0, bArr2, 0, bArr.length);
                        int length5 = bArr.length;
                        while (true) {
                            if (length5 < 32) {
                                bArr2[length5] = 48;
                                length5++;
                            } else {
                                return bArr2;
                            }
                        }
                    } else {
                        return (Arrays.copyOf(bArr,32));
                    }
                } else {
                    return bArr;
                }
                return bArr;
            }
            return bArr;
        }
    }

    private String tF(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(m515(this, null), "AES");
            byte[] bArr = new byte[16];
            (new SecureRandom().nextBytes(bArr));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher cipher = C0029.m1636("AES/CBC/PKCS5Padding");
            cipher.init(1,secretKeySpec,ivParameterSpec);
            byte[] bArr2 = (cipher.doFinal((str.getBytes(StandardCharsets.UTF_8))));
            byte[] bArr3 = new byte[bArr2.length + 16];
            C0025.m1532(bArr, 0, bArr3, 0, 16);
            C0025.m1532(bArr2, 0, bArr3, 16, bArr2.length);
            return C0034.m1790(bArr3, 2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String v(String str) {
        int i;
        try {
            Response response = m488(m510(m496(this), m486(m493(m503(new Request.Builder(), str), "User-Agent", m485(this)))));
            boolean z = m502(response);

            if (z) {
                ResponseBody responseBody = m498(response);
                if (!(responseBody == null)) {
                    String str2 = m478(m498(response));
                    m526(response);
                    return str2;
                }
            }
            m526(response);
            i = 1864;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private JSONArray v3(JSONArray jSONArray) {
        int i = 0;
        JSONArray jSONArray2 = new JSONArray();
        while (true) {
            int i2 = (jSONArray.length());

            if (i < i2) {
                JSONObject jSONObject = (jSONArray.optJSONObject(i));
                if (jSONObject != null) {
                    String str = "vod_remarks";
                    String str2 = "vod_pic";
                    String str3 = "vod_name";
                    String str4 = "vod_id";
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(str4,m504(this, jSONObject, new String[]{"id", str4}));
                        String str5 = m504(this, jSONObject, new String[]{"name", str3, "title"});
                        boolean z = C0010.m289(str5);
                        if (z) {
                            jSONObject2 = null;
                        } else {
                            jSONObject2.put(str3,str5);
                            jSONObject2.put(str2,m504(this, jSONObject, new String[]{"pic", str2, "cover"}));
                            jSONObject2.put(str,m504(this, jSONObject, new String[]{"remarks", str, "note"}));
                        }
                    } catch (Exception e) {
                    }
                    if (jSONObject2 != null) {
                        jSONArray2.put(jSONObject2);
                    }
                }
                i++;
            } else {
                return jSONArray2;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 376
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    private java.lang.String[] yq(org.json.JSONObject r25) {
        /*
        Method dump skipped, instructions count: 1760
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.yq(org.json.JSONObject):java.lang.String[]");
    }

    private JSONArray zH(JSONObject jSONObject) {
        String str = "data";
        String str2 = "list";
        String str3 = "items";
        String str4 = "result";
        int i = 0;
        while (true) {

            if (i < 4) {
                JSONArray jSONArray = (jSONObject.optJSONArray(new String[]{str, str2, str3, str4}[i]));
                if (jSONArray != null) {
                    return jSONArray;
                } else {
                    i++;
                }
            } else {
                JSONObject jSONObject2 = (jSONObject.optJSONObject(str));
                if (!(jSONObject2 == null)) {
                    int i6 = 0;
                    while (true) {
                        if (i6 < 3) {
                            JSONArray jSONArray2 = (jSONObject2.optJSONArray(new String[]{str2, str3, str}[i6]));
                            if (jSONArray2 != null) {
                                return jSONArray2;
                            } else {
                                i6++;
                            }
                        }
                    }
                }
                return new JSONArray();
            }
        }
    }

    /* renamed from: اﺵمﺽ  reason: contains not printable characters */
    public static String m478(Object obj) {
        int i = 36 ^ C0033.f91;

        return ((ResponseBody) obj).string();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* renamed from: بﺵشﺹ  reason: contains not printable characters */
    public static HashMap m479(Object obj) {
        int i = (-703) ^ C0036.f94;

        return ((App99) obj).G4;
    }

    /* renamed from: تكلﻉ  reason: contains not printable characters */
    public static int m480(Object obj, Object obj2) {
        int i = (-985) ^ C0024.f82;

        return ((App99) obj).i((JSONObject) obj2);
    }

    /* renamed from: ثصلر  reason: contains not printable characters */
    public static JSONArray m481(Object obj, Object obj2) {
        int i = 596 ^ C0009.f9;

        return ((App99) obj).zH((JSONObject) obj2);
    }

    /* renamed from: ثهﺝد  reason: contains not printable characters */
    public static String m482(Object obj) {
        int i = 596 ^ C0009.f9;

        return ((App99) obj).Gc;
    }

    /* renamed from: جدﺥﺱ  reason: contains not printable characters */
    public static MediaType m483(Object obj) {
        int i = (-31) ^ C0006.f6;

        return MediaType.parse((String) obj);
    }

    /* renamed from: جﻭﻅو  reason: contains not printable characters */
    public static String m484(Object obj, Object obj2) {
        int i = 515 ^ C0028.f86;

        return ((App99) obj).v((String) obj2);
    }

    /* renamed from: خذﺫﺙ  reason: contains not printable characters */
    public static String m485(Object obj) {
        int i = 813 ^ C0033.f91;

        return ((App99) obj).B;
    }

    /* renamed from: داثب  reason: contains not printable characters */
    public static Request m486(Object obj) {
        int i = 938 ^ C0033.f91;

        return ((Request.Builder) obj).build();
    }

    /* renamed from: دشطق  reason: contains not printable characters */
    public static void m487(Object obj, Object obj2) {
        int i = (-886) ^ C0021.f79;

        ((App99) obj).F5((JSONObject) obj2);
        return;
    }

    /* renamed from: ذﻁﺙص  reason: contains not printable characters */
    public static Response m488(Object obj) {
        int i = (-26) ^ C0033.f91;

        return ((Call) obj).execute();
    }

    /* renamed from: روﻭﻙ  reason: contains not printable characters */
    public static String m489(Object obj) {
        int i = 658 ^ C0029.f87;

        return ((App99) obj).M;
    }

    /* renamed from: رﺯﺎد  reason: contains not printable characters */
    public static OkHttpClient m490(Object obj) {
        int i = (-26) ^ C0033.f91;

        return ((OkHttpClient.Builder) obj).build();
    }

    /* renamed from: شقﻙص  reason: contains not printable characters */
    public static String m491(Object obj) {
        int i = (-422) ^ C0033.f91;

        return ((App99) obj).dT();
    }

    /* renamed from: شيوﻕ  reason: contains not printable characters */
    public static String m492(Object obj) {
        int i = (-487) ^ C0053.f111;

        return ((App99) obj).i;
    }

    /* renamed from: شﺫظت  reason: contains not printable characters */
    public static Request.Builder m493(Object obj, Object obj2, Object obj3) {
        int i = 706 ^ C0003.f3;

        return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
    }

    /* renamed from: صسـﻡ  reason: contains not printable characters */
    public static String m494(Object obj, Object obj2) {
        int i = 923 ^ C0041.f99;

        return ((App99) obj).tF((String) obj2);
    }

    /* renamed from: ضﺯﺡر  reason: contains not printable characters */
    public static String m495(Object obj) {
        int i = (-703) ^ C0036.f94;

        return ((App99) obj).SN;
    }

    /* renamed from: ظﺕما  reason: contains not printable characters */
    public static OkHttpClient m496(Object obj) {
        int i = 624 ^ C0012.f12;

        return ((App99) obj).W;
    }

    /* renamed from: عرﺵـ  reason: contains not printable characters */
    public static int m497(Object obj) {
        int i = (-821) ^ C0025.f83;

        return ((App99) obj).G;
    }

    /* renamed from: غﻭمت  reason: contains not printable characters */
    public static ResponseBody m498(Object obj) {
        int i = (-404) ^ C0021.f79;

        return ((Response) obj).body();
    }

    /* renamed from: ـهﻝذ  reason: contains not printable characters */
    public static String m499(Object obj) {
        int i = 57 ^ C0032.f90;

        return ((App99) obj).Gc();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* renamed from: ـﺏﺎب  reason: contains not printable characters */
    public static HashMap m500(Object obj) {
        int i = (-31) ^ C0006.f6;

        return ((App99) obj).dT;
    }

    /* renamed from: قجﻍﻅ  reason: contains not printable characters */
    public static JSONArray m501(Object obj, Object obj2) {
        int i = 515 ^ C0028.f86;

        return ((App99) obj).v3((JSONArray) obj2);
    }

    /* renamed from: كﺡﺕﺽ  reason: contains not printable characters */
    public static boolean m502(Object obj) {
        int i = 293 ^ C0009.f9;

        return ((Response) obj).isSuccessful();
    }

    /* renamed from: نخﺯﺽ  reason: contains not printable characters */
    public static Request.Builder m503(Object obj, Object obj2) {
        int i = 923 ^ C0041.f99;

        return ((Request.Builder) obj).url((String) obj2);
    }

    /* renamed from: هزحﺫ  reason: contains not printable characters */
    public static String m504(Object obj, Object obj2, Object obj3) {
        int i = (-26) ^ C0033.f91;

        return ((App99) obj).M((JSONObject) obj2, (String[]) obj3);
    }

    /* renamed from: هقيﺫ  reason: contains not printable characters */
    public static String m505(Object obj) {
        int i = (-193) ^ C0041.f99;

        return ((App99) obj).t0;
    }

    /* renamed from: وﺩغﺕ  reason: contains not printable characters */
    public static OkHttpClient.Builder m506(Object obj, long j, Object obj2) {
        int i = 498 ^ C0002.f2;

        return ((OkHttpClient.Builder) obj).connectTimeout(j, (TimeUnit) obj2);
    }

    /* renamed from: يﻭضف  reason: contains not printable characters */
    public static OkHttpClient.Builder m507(Object obj, long j, Object obj2) {
        int i = 658 ^ C0029.f87;

        return ((OkHttpClient.Builder) obj).readTimeout(j, (TimeUnit) obj2);
    }

    /* renamed from: ﺎاخﺥ  reason: contains not printable characters */
    public static JSONObject m508(Object obj, Object obj2) {
        int i = (-422) ^ C0033.f91;

        return ((App99) obj).KJ((String) obj2);
    }

    /* renamed from: ﺎلـع  reason: contains not printable characters */
    public static String m509(Object obj) {
        int i = (-193) ^ C0041.f99;

        return ((App99) obj).tF;
    }

    /* renamed from: ﺎﺭﺏص  reason: contains not printable characters */
    public static Call m510(Object obj, Object obj2) {
        int i = 36 ^ C0033.f91;

        return ((OkHttpClient) obj).newCall((Request) obj2);
    }

    /* renamed from: ﺏزﻭﻱ  reason: contains not printable characters */
    public static boolean m511(Object obj) {
        int i = (-193) ^ C0041.f99;

        return ((App99) obj).G4();
    }

    /* renamed from: ﺕﻅﻁغ  reason: contains not printable characters */
    public static String m512(Object obj) {
        int i = (-675) ^ C0038.f96;

        return ((App99) obj).yq;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* renamed from: ﺝظضﺫ  reason: contains not printable characters */
    public static HashMap m514(Object obj) {
        int i = 916 ^ C0002.f2;

        return ((App99) obj).F5;
    }

    /* renamed from: ﺡيﻍه  reason: contains not printable characters */
    public static byte[] m515(Object obj, Object obj2) {
        int i = (-732) ^ f2;

        if (i > 0) {
            return null;
        } else {
            return ((App99) obj).t0((String) obj2);
        }
    }

    /* renamed from: ﺥﺕهو  reason: contains not printable characters */
    public static String[] m516(Object obj, Object obj2) {
        int i = 658 ^ C0029.f87;

        return ((App99) obj).yq((JSONObject) obj2);
    }

    /* renamed from: ﺯحغﺩ  reason: contains not printable characters */
    public static String m517(Object obj, Object obj2) {
        int i = (-406) ^ C0053.f111;

        return ((App99) obj).SN((String) obj2);
    }

    /* renamed from: ﺯﺎزش  reason: contains not printable characters */
    public static String m518(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 36 ^ C0033.f91;

        return ((App99) obj).ee((String) obj2, (String) obj3, (Map) obj4);
    }

    /* renamed from: ﺱكنذ  reason: contains not printable characters */
    public static String m519(Object obj) {
        int i = (-767) ^ C0037.f95;

        return ((App99) obj).KJ;
    }

    /* renamed from: ﺵتوح  reason: contains not printable characters */
    public static Map m520(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 916 ^ C0002.f2;

        return ((App99) obj).G((String) obj2, (String) obj3, (String) obj4);
    }

    /* renamed from: ﺵﻡيﻅ  reason: contains not printable characters */
    public static String m521(Object obj) {
        int i = (-824) ^ C0004.f4;

        return ((App99) obj).zH;
    }

    /* renamed from: ﺽﺏفق  reason: contains not printable characters */
    public static RequestBody m522(Object obj, Object obj2) {
        int i = 938 ^ C0033.f91;

        return RequestBody.create((MediaType) obj, (String) obj2);
    }

    /* renamed from: ﺽﺝﺱﻕ  reason: contains not printable characters */
    public static String m523(Object obj) {
        int i = 938 ^ C0033.f91;

        return ((App99) obj).q;
    }

    /* renamed from: ﻁﺥﻅع  reason: contains not printable characters */
    public static boolean m524(Object obj) {
        int i = (-185) ^ C0033.f91;

        return ((App99) obj).B();
    }

    /* renamed from: ﻉﺏﻭي  reason: contains not printable characters */
    public static String m525(Object obj, Object obj2) {
        int i = (-703) ^ C0036.f94;

        return ((App99) obj).W((byte[]) obj2);
    }

    /* renamed from: ﻍحﺭك  reason: contains not printable characters */
    public static void m526(Object obj) {
        int i = 753 ^ C0000.f0;

        ((Response) obj).close();
        int i4 = 916 ^ C0002.f2;

        return;
    }

    /* renamed from: ﻍﺭﺏﺝ  reason: contains not printable characters */
    public static String m527(Object obj) {
        int i = (-767) ^ C0037.f95;

        return ((App99) obj).N;
    }

    /* renamed from: ﻝوﻩذ  reason: contains not printable characters */
    public static Request.Builder m528(Object obj, Object obj2) {
        int i = (-1021) ^ C0026.f84;

        return ((Request.Builder) obj).post((RequestBody) obj2);
    }

    /* renamed from: ﻭهظﻕ  reason: contains not printable characters */
    public static String m529(Object obj, Object obj2, Object obj3) {
        int i = (-422) ^ C0033.f91;

        return ((App99) obj).q((String) obj2, (JSONObject) obj3);
    }

    /* renamed from: ﻱبﻁث  reason: contains not printable characters */
    public static JSONArray m530(Object obj) {
        int i = (-26) ^ C0033.f91;

        return ((App99) obj).v3;
    }

    /* renamed from: ﻱفﺱﻅ  reason: contains not printable characters */
    public static String m531(Object obj, Object obj2, Object obj3) {
        int i = (-26) ^ C0033.f91;

        return ((App99) obj).N((String) obj2, (String) obj3);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3 = "limit";
        String str4 = "page";
        try {
            m524(this);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("kw","");
            jSONObject.put(str4,str2);
            jSONObject.put(str3,21);
            jSONObject.put("pid",str);
            jSONObject.put("orderBy","time");
            jSONObject.put("isCategory",1);
            String str5 = m529(this, "/vod/search", jSONObject);

            if (!(str5 == null)) {
                boolean z2 = (str5.isEmpty());
                if (!(z2)) {
                    JSONObject jSONObject2 = new JSONObject(str5);
                    int i3 = m480(this, jSONObject2);
                    int i4 = (Integer.parseInt(str2));
                    JSONArray jSONArray = m501(this, m481(this, jSONObject2));
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("list",jSONArray);
                    jSONObject3.put(str4,i4);
                    jSONObject3.put("pagecount",i3);
                    jSONObject3.put(str3,21);
                    jSONObject3.put("total",i3 * 21);
                    return (jSONObject3.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return C0048.m2149("{\"list\":[],\"page\":", str2, ",\"pagecount\":1,\"limit\":21,\"total\":0}");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03be A[FALL_THROUGH, PHI: r3
    PHI: (r3v15 java.lang.String) = (r3v12 java.lang.String), (r3v12 java.lang.String), (r3v12 java.lang.String), (r3v14 java.lang.String), (r3v12 java.lang.String) binds: [B:22:0x016d, B:29:0x0187, B:36:0x01b8, B:41:0x01c6, B:17:0x00d3] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
/*
Code decompiled incorrectly, please refer to instructions dump.
To view partially-correct add '--show-bad-code' argument
*/
public java.lang.String detailContent(java.util.List<java.lang.String> r22) {
    /*
    Method dump skipped, instructions count: 1064
    To view this dump add '--comments-level debug' option
    */
    throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.detailContent(java.util.List):java.lang.String");
}

/* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
r3 = (r0.length());
r1 = 48891;
*/
/* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
r1 = r1 ^ 48908;
*/
/* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
switch(r1) {
    case 22: goto L134;
    case 53: goto L133;
    case 503: goto L135;
    case 32495: goto L136;
    default: goto L137;
};
*/
/* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
r1 = 48953;
*/
/* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
if (r2 >= r3) goto L139;
*/
/* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
r1 = 49635;
*/
/* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
r3 = (r0.optJSONObject(r2));
r1 = 49666;
*/
/* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
r1 = r1 ^ 49683;
*/
/* JADX WARN: Code restructure failed: missing block: B:43:0x00fc, code lost:
switch(r1) {
    case 17: goto L144;
    case 50: goto L145;
    case 76: goto L146;
    case 83: goto L147;
    default: goto L149;
};
*/
/* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
if (r3 == null) goto L148;
*/
/* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
r1 = 49759;
*/
/* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
r1 = 49728;
*/
/* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
r8 = m504(r14, r3, new java.lang.String[]{"id", r7});
r3 = m504(r14, r3, new java.lang.String[]{"name", r6});
r9 = (r8.isEmpty());
r1 = 49790;
*/
/* JADX WARN: Code restructure failed: missing block: B:49:0x0145, code lost:
r1 = r1 ^ 49807;
*/
/* JADX WARN: Code restructure failed: missing block: B:50:0x0149, code lost:
switch(r1) {
    case 18: goto L155;
    case 51: goto L158;
    case 84: goto L157;
    case 241: goto L156;
    default: goto L160;
};
*/
/* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
r1 = 49852;
*/
/* JADX WARN: Code restructure failed: missing block: B:53:0x0151, code lost:
if (r9 != false) goto L161;
*/
/* JADX WARN: Code restructure failed: missing block: B:54:0x0153, code lost:
r1 = 49883;
*/
/* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
r9 = (r3.isEmpty());
r1 = 49914;
*/
/* JADX WARN: Code restructure failed: missing block: B:56:0x015e, code lost:
r1 = r1 ^ 49931;
*/
/* JADX WARN: Code restructure failed: missing block: B:57:0x0162, code lost:
switch(r1) {
    case 497: goto L166;
    case 1711: goto L167;
    case 1736: goto L169;
    case 1769: goto L168;
    default: goto L170;
};
*/
/* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
if (r9 != false) goto L171;
*/
/* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
r1 = 50658;
*/
/* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
r1 = 50627;
*/
/* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
r1 = new org.json.JSONObject();
r1.put(r7,r8);
r1.put(r6,r3);
r5.put(r1);
*/
/* JADX WARN: Code restructure failed: missing block: B:63:0x017e, code lost:
r2 = r2 + 1;
r1 = 50689;
*/
/* JADX WARN: Code restructure failed: missing block: B:64:0x0183, code lost:
r1 = r1 ^ 50706;
*/
/* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
switch(r1) {
    case 19: goto L178;
    case 50: goto L177;
    default: goto L179;
};
*/
/* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
r1 = 50720;
*/
/*
Code decompiled incorrectly, please refer to instructions dump.
To view partially-correct add '--show-bad-code' argument
*/
public java.lang.String homeContent(boolean r15) {
    /*
    Method dump skipped, instructions count: 704
    To view this dump add '--comments-level debug' option
    */
    throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.homeContent(boolean):java.lang.String");
}

public String homeVideoContent() {
    try {
        m524(this);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("kw","");
        jSONObject.put("page","1");
        jSONObject.put("limit",12);
        jSONObject.put("pid","0");
        jSONObject.put("orderBy","time");
        jSONObject.put("isCategory",1);
        String str = m529(this, "/vod/search", jSONObject);

        if (!(str == null)) {
            boolean z = (str.isEmpty());
            if (!(z)) {
                JSONArray jSONArray = m501(this, m481(this, new JSONObject(str)));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("list",jSONArray);
                return (jSONObject2.toString());
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return "{\"list\":[]}";
}

public void init(Context context, String str) {
    String str2 = "application/json";
    String str3 = "";
    App99.super.init(context, str);
    try {
        JSONObject jSONObject = new JSONObject(C0049.m2191(str));
        this.yq = ((jSONObject.optString("host",str3)).replaceAll("/+$",str3));
        this.SN = (jSONObject.optString("LoginPath","/app/userInfo"));
        this.N = (jSONObject.optString("appkey",str3));
        this.tF = (jSONObject.optString("versionName",str3));
        this.zH = (jSONObject.optString("version","0b4328287a5d953e"));
        this.i = (jSONObject.optString("name",str3));
        this.t0 = (jSONObject.optString("package",str3));
        this.Gc = (jSONObject.optString("buildNumber",str3));
        this.M = (jSONObject.optString("buildSignature",str3));
        this.KJ = (jSONObject.optString("token",str3));
        String str4 = (jSONObject.optString("uuid",str3));
        boolean z = (str4.isEmpty());

        if (z) {
            str4 = (UUID.randomUUID().toString());
        }
        this.q = str4;
        this.B = (jSONObject.optString("ua","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.6299.95 Safari/537.36"));
        this.G = (jSONObject.optInt("timeout",10));
        HashMap hashMap = new HashMap();
        this.G4 = hashMap;
        hashMap.put("User-Agent",m485(this));
        m479(this).put("Accept",str2);
        m479(this).put("Content-Type",str2);
        m479(this).put("client_type","android");
        this.dT = new HashMap();
        this.F5 = new HashMap();
        this.v3 = new JSONArray();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = m497(this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.W = m490(m507(m506(builder, j, timeUnit), m497(this), timeUnit));
        m511(this);
        m524(this);
        HashMap hashMap2 = m514(this);
        String str5 = "player";
        boolean z2 = (hashMap2.containsKey(str5));

        if (z2) {
            Object obj = (m514(this).get(str5));
            if (obj != null) {
                return;
            } else {
                return;
            }
        }
        m511(this);

        return;
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public boolean isVideoFormat(String str) {
    return false;
}

public boolean manualVideoCheck() {
    return true;
}

/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 421
at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
*/
public java.lang.String playerContent(java.lang.String r22, java.lang.String r23, java.util.List<java.lang.String> r24) {
    /*
    Method dump skipped, instructions count: 1754
    To view this dump add '--comments-level debug' option
    */
    throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App99.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
}

public String searchContent(String str, boolean z) {
    String str3 = null;
    String str4 = null;
    // [deflattened] 控制流平坦化已还原为线性代码
    str3 = "1";
    str4 = (this.searchContent(str,z,str3));
    return str4;
}

public String searchContent(String str, boolean z, String str2) {
    JSONObject jSONObject;
    JSONArray jSONArray;
    JSONObject jSONObject2;
    JSONArray jSONArray2;
    JSONArray jSONArray3;
    String str3 = "/vod/search";
    String str4 = "orderBy";
    String str5 = "page";
    try {
        m524(this);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("kw",str);
        jSONObject3.put(str5,(Integer.parseInt(str2)));
        jSONObject3.put("limit",21);
        jSONObject3.put(str4,"vod_hits_month");
        jSONObject3.put("sort","desc");
        String str6 = m529(this, str3, jSONObject3);

        if (!(str6 == null)) {
            boolean z2 = (str6.isEmpty());
            if (!(z2)) {
                jSONObject = new JSONObject(str6);
                jSONArray = m501(this, m481(this, jSONObject));
            }
        }
        jSONObject = null;
        jSONArray = null;

        if (!(jSONArray == null)) {
            int i5 = (jSONArray.length());
        }
        jSONObject3.put(str4,"vodhitsmonth");
        String str7 = m529(this, str3, jSONObject3);

        if (!(str7 == null)) {
            boolean z3 = (str7.isEmpty());
            if (!(z3)) {
                JSONObject jSONObject4 = new JSONObject(str7);
                jSONArray2 = m501(this, m481(this, jSONObject4));
                jSONObject2 = jSONObject4;
            }
        }
        jSONObject2 = jSONObject;
        jSONArray2 = jSONArray;
        JSONObject jSONObject5 = new JSONObject();
        String str8 = "list";

        if (jSONArray2 == null) {
            jSONArray3 = new JSONArray();
        } else {
            jSONArray3 = jSONArray2;
            jSONArray3 = new JSONArray();
        }
        jSONObject5.put(str8,jSONArray3);
        jSONObject5.put(str5,(Integer.parseInt(str2)));
        jSONObject5.put("pagecount",m480(this, jSONObject2));
        return (jSONObject5.toString());
    } catch (Exception e) {
        e.printStackTrace();
        StringBuilder sb = new StringBuilder();
        sb.append("{\"list\":[],\"page\":");
        sb.append(str2);
        sb.append(",\"pagecount\":1}");
        return (sb.toString());
    }
}
}
