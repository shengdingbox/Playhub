package com.github.catvod.spider;

import android.net.Uri;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.spider.merge.AbstractC0181tM;
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
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0068Pe;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Hmys extends Spider {

    private String F5;
    private String Gd;
    private String Nl;
    private String W;
    private String dT;
    private String ee;
    private String g9;
    private String tF;
    private String v;
    private String v3;
    private String xa;
    private String yq = "aZ9$kU5%qI7=yC2=zH2#gM0@pX7^wF3a";
    private String SN = "hY2&tN3]kF7,dL7=";
    private String N = "zD9[bM4~sF4~uY2)";
    private String zH = "https://u.yyxdmn.com/api/public/init";
    private String i = "tianjishipin";
    private String t0 = "tjsp_sp01";
    private String Gc = "51000";
    private String M = "com.wfighter.zmz";
    private String KJ = "IysJHCZ2Z7HBEoPPKC8nXIibjGHkKNrc";
    private String q = "608";
    private String B = "331";
    private boolean G = true;
    private boolean G4 = true;

    public Hmys() {
        String str = "";
        this.tF = str;
        this.dT = str;
        this.F5 = str;
        this.v3 = str;
        this.W = str;
        this.v = str;
        this.ee = str;
        this.g9 = str;
        this.xa = str;
        this.Nl = str;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        break;
                    
                case 204:
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private String B(String str, HashMap<String, String> hashMap) {
        String str2;
        String str3;
        AbstractC0181tM.SN sn = new AbstractC0181tM.SN() { // from class: com.github.catvod.spider.Hmys.1
            {
                int i = (-26) ^ C0033.f91;
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                            break;
                        case 49:
                            if (i > 0) {
                                break;
                            } else {
                                i2 = 1709;
                                continue;
                            }
                        case 204:
                            return;
                        case 239:
                            return;
                    }
                    i2 = 1678;
                }
            }

            /* renamed from: فبﻅو  reason: contains not printable characters */
            public static void m786(Object obj, Object obj2) {
                int i = 802 ^ C0052.f110;
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                            break;
                        case 49:
                            if (i >= 0) {
                                break;
                            } else {
                                i2 = 1709;
                                continue;
                            }
                        case 204:
                            ((AnonymousClass1) obj).onResponse2((String) obj2);
                            break;
                        case 239:
                            int i3 = 1864;
                            while (true) {
                                i3 ^= 1881;
                                switch (i3) {
                                    case 17:
                                        i3 = 48674;
                                        break;
                                    case 47483:
                                        break;
                                }
                            }
                            break;
                    }
                    i2 = 1678;
                }
                int i4 = 515 ^ C0028.f86;
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
                            return;
                        case 500:
                            return;
                    }
                    i5 = 1802;
                }
            }

            @Override // com.github.catvod.spider.merge.AbstractC0181tM
            public void onFailure(Call call, Exception exc) {
            }

            @Override // com.github.catvod.spider.merge.AbstractC0181tM
            public /* bridge */ /* synthetic */ void onResponse(String str4) {
                m786(this, str4);
            }

            /* renamed from: onResponse  reason: avoid collision after fix types in other method */
            public void onResponse2(String str4) {
            }
        };
        OkHttpClient okHttpClient = m758(0);
        HashMap hashMap2 = new HashMap();
        String str4 = (String.valueOf(System.currentTimeMillis()));
        boolean z = (TextUtils.isEmpty(m761(this)));
        String str5 = "";
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                str2 = str5;
                                break;
                        }
                    }
                    break;
                case 239:
                    str2 = m761(this);
                    break;
            }
            i = 1678;
        }
        StringBuilder sb = new StringBuilder();
        (sb.append(m749(this)));
        (sb.append(str2));
        (sb.append(str4));
        String str6 = (m741((sb.toString())).toUpperCase());
        boolean z2 = m747(this);
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    if (!z2) {
                        break;
                    } else {
                        i3 = 48736;
                        continue;
                    }
                case 47384:
                    str3 = "okhttp/4.9.0";
                    break;
                case 47417:
                    str3 = "okhttp/4.12.0";
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 239:
                                i4 = 48798;
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
            }
            i3 = 48705;
        }
        (hashMap2.put("User-Agent",str3));
        (hashMap2.put("log-header","I am the log request header."));
        (hashMap2.put("app_id",m762(this)));
        (hashMap2.put("channel_code",m775(this)));
        (hashMap2.put("cur_time",str4));
        (hashMap2.put("device_id",str2));
        (hashMap2.put("mob_mfr",Build.BRAND));
        (hashMap2.put("mobmodel",Build.MODEL));
        (hashMap2.put("package_name",m772(this)));
        (hashMap2.put("sign",str6));
        (hashMap2.put("sys_platform","2"));
        (hashMap2.put("sysrelease","12"));
        String str7 = m774(this);
        int i5 = 48891;
        while (true) {
            i5 ^= 48908;
            switch (i5) {
                case 22:
                    break;
                case 53:
                    str5 = str7;
                    break;
                case 503:
                    if (str7 != null) {
                        break;
                    } else {
                        i5 = 49635;
                        continue;
                    }
                case 32495:
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
            }
            i5 = 48953;
        }
        (hashMap2.put("token",str5));
        (hashMap2.put("version",m751(this)));
        m771(okHttpClient, str, hashMap, hashMap2, sn);
        String str8 = (String) (sn.getResult());
        boolean z3 = (TextUtils.isEmpty(str8));
        int i7 = 49790;
        while (true) {
            i7 ^= 49807;
            switch (i7) {
                case 18:
                    break;
                case 51:
                    throw new Exception(C0022.m1434("empty response: ", str));
                case 84:
                    return str8;
                case 241:
                    if (z3) {
                        break;
                    } else {
                        i7 = 49883;
                        continue;
                    }
            }
            i7 = 49852;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        r1 = (r4.endsWith("/"));
        r0 = 1740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = r0 ^ 1757;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        switch(r0) {
            case 17: goto L31;
            case 54: goto L32;
            case 471: goto L30;
            case 500: goto L33;
            default: goto L37;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r1 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = 1833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        r0 = 1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        r4 = (r4.substring(0,(r4.length()) - 1));
        r0 = 1864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        r0 = r0 ^ 1881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        switch(r0) {
            case 17: goto L41;
            case 47483: goto L40;
            default: goto L43;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        r0 = 48674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String F5(java.lang.String r4) {
        /*
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L15;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r4 != 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            java.lang.String r4 = ""
        L14:
            return r4
        L15:
            short[] r0 = m773()
            r1 = 372(0x174, float:5.21E-43)
            r2 = 1
            r3 = 1390(0x56e, float:1.948E-42)
            java.lang.String r0 = com.github.catvod.spider.merge.C0039.m1937(r0, r1, r2, r3)
            boolean r1 = (r4.endsWith(r0))
            r0 = 1740(0x6cc, float:2.438E-42)
        L28:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2e;
                case 54: goto L33;
                case 471: goto L14;
                case 500: goto L36;
                default: goto L2d;
            }
        L2d:
            goto L28
        L2e:
            if (r1 == 0) goto L33
            r0 = 1833(0x729, float:2.569E-42)
            goto L28
        L33:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L28
        L36:
            r0 = 0
            int r1 = (r4.length())
            int r1 = r1 + (-1)
            java.lang.String r4 = (r4.substring(r0,r1))
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L15;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.F5(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
        return (r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
        (r1.append(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String G(org.json.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.G(org.json.JSONObject):java.lang.String");
    }

    private String G4(String str) {
        String str2;
        String str3;
        boolean z = (TextUtils.isEmpty(str));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z2 = (TextUtils.isEmpty(m779(this)));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (z2) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                return str;
                            case 500:
                                boolean z3 = ("0".equals(m779(this)));
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            try {
                                                Uri uri = C0034.m1791(m779(this));
                                                Uri uri2 = C0034.m1791(str);
                                                String str4 = (uri.getEncodedAuthority());
                                                boolean z4 = (TextUtils.isEmpty(str4));
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            str2 = str4;
                                                            break;
                                                        case 503:
                                                            if (!z4) {
                                                                break;
                                                            } else {
                                                                i4 = 49635;
                                                                continue;
                                                            }
                                                        case 32495:
                                                            str2 = (uri.getHost());
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i4 = 48953;
                                                }
                                                Uri.Builder builder = (uri2.buildUpon());
                                                String str5 = (uri.getScheme());
                                                int i5 = 49666;
                                                while (true) {
                                                    i5 ^= 49683;
                                                    switch (i5) {
                                                        case 17:
                                                            if (str5 != null) {
                                                                break;
                                                            } else {
                                                                i5 = 49759;
                                                                continue;
                                                            }
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            str3 = "http";
                                                            int i6 = 49790;
                                                            while (true) {
                                                                i6 ^= 49807;
                                                                switch (i6) {
                                                                    case 18:
                                                                        break;
                                                                    case 241:
                                                                        i6 = 49821;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 83:
                                                            str3 = (uri.getScheme());
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i5 = 49728;
                                                }
                                                str = ((((builder.scheme(str3)).encodedAuthority(str2)).build()).toString());
                                                return str;
                                            } catch (Exception e) {
                                                int i7 = 49914;
                                                while (true) {
                                                    i7 ^= 49931;
                                                    switch (i7) {
                                                        case 497:
                                                            i7 = 50596;
                                                            break;
                                                        case 1711:
                                                            return str;
                                                    }
                                                }
                                            }
                                            break;
                                        case 47417:
                                            int i8 = 48767;
                                            while (true) {
                                                i8 ^= 48784;
                                                switch (i8) {
                                                    case 14:
                                                        return str;
                                                    case 239:
                                                        i8 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                    i3 = 48705;
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return str;
            }
            i = 1678;
        }
    }

    private static String Gc(String str) {
        try {
            return (C0041.m1986((C0027.m1581("MD5").digest((str.getBytes(StandardCharsets.UTF_8))))).toLowerCase());
        } catch (Exception e) {
            return (C0052.m2266(str).toLowerCase());
        }
    }

    private JSONArray KJ(String str, HashMap hashMap) {
        Object jSONObject = new JSONObject(m745(this, m767(this, str, hashMap)));
        String str2 = "result";
        boolean z = (TextUtils.isEmpty(str2));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    JSONArray jSONArray = (jSONObject.optJSONArray(str2));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (jSONArray != null) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                return jSONArray;
                            case 500:
                                return new JSONArray();
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    String[] strArr = (str2.split("\\."));
                    int length = strArr.length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 1864;
                        while (true) {
                            i4 ^= 1881;
                            switch (i4) {
                                case 17:
                                    i4 = i3 < length ? 48736 : 48705;
                                case 47384:
                                    boolean z2 = jSONObject instanceof JSONArray;
                                    int i5 = 49666;
                                    while (true) {
                                        i5 ^= 49683;
                                        switch (i5) {
                                            case 17:
                                                if (!z2) {
                                                    break;
                                                } else {
                                                    i5 = 49759;
                                                    continue;
                                                }
                                            case 50:
                                                break;
                                            case 76:
                                                return (JSONArray) jSONObject;
                                            case 83:
                                                return new JSONArray();
                                        }
                                        i5 = 49728;
                                    }
                                    break;
                                case 47417:
                                    String str3 = strArr[i3];
                                    boolean z3 = jSONObject instanceof JSONObject;
                                    int i6 = 48767;
                                    while (true) {
                                        i6 ^= 48784;
                                        switch (i6) {
                                            case 14:
                                            case 45:
                                                jSONObject = ((JSONObject) jSONObject.opt(str3));
                                                i3++;
                                                int i7 = 48891;
                                                while (true) {
                                                    i7 ^= 48908;
                                                    switch (i7) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i7 = 48922;
                                                    }
                                                }
                                                break;
                                            case 76:
                                                return new JSONArray();
                                            case 239:
                                                i6 = !z3 ? 48860 : 48829;
                                        }
                                    }
                                    break;
                                case 47483:
                            }
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
        r1 = 50689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
        r1 = r1 ^ 50706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
        switch(r1) {
            case 19: goto L196;
            case 50: goto L195;
            default: goto L198;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0123, code lost:
        r1 = 50720;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String M(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.M(java.lang.String):java.lang.String");
    }

    private JSONArray N(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (jSONArray != null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return jSONArray2;
                case 239:
                    int i2 = 0;
                    while (true) {
                        int i3 = (jSONArray.length());
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = i2 < i3 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    return jSONArray2;
                                case 500:
                                    JSONObject jSONObject = (jSONArray.optJSONObject(i2));
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = jSONObject == null ? 48736 : 48705;
                                            case 47384:
                                                String str = "name";
                                                String str2 = (jSONObject.optString(str));
                                                JSONArray jSONArray3 = (jSONObject.optJSONArray("data"));
                                                boolean z = (TextUtils.isEmpty(str2));
                                                int i6 = 48891;
                                                while (true) {
                                                    i6 ^= 48908;
                                                    switch (i6) {
                                                        case 22:
                                                        case 53:
                                                            break;
                                                        case 503:
                                                            i6 = !z ? 49635 : 48953;
                                                        case 32495:
                                                            int i7 = 49666;
                                                            while (true) {
                                                                i7 ^= 49683;
                                                                switch (i7) {
                                                                    case 17:
                                                                        i7 = jSONArray3 != null ? 49759 : 49728;
                                                                    case 50:
                                                                    case 76:
                                                                        int i8 = (jSONArray3.length());
                                                                        int i9 = 49790;
                                                                        while (true) {
                                                                            i9 ^= 49807;
                                                                            switch (i9) {
                                                                                case 18:
                                                                                case 51:
                                                                                    JSONArray jSONArray4 = new JSONArray();
                                                                                    int i10 = 0;
                                                                                    while (true) {
                                                                                        int i11 = (jSONArray3.length());
                                                                                        int i12 = 50689;
                                                                                        while (true) {
                                                                                            i12 ^= 50706;
                                                                                            switch (i12) {
                                                                                                case 19:
                                                                                                    i12 = i10 < i11 ? 50782 : 50751;
                                                                                                case 45:
                                                                                                    int i13 = (jSONArray4.length());
                                                                                                    int i14 = 51836;
                                                                                                    while (true) {
                                                                                                        i14 ^= 51853;
                                                                                                        switch (i14) {
                                                                                                            case 241:
                                                                                                                i14 = i13 == 0 ? 52580 : 52549;
                                                                                                            case 1963:
                                                                                                            case 1992:
                                                                                                                JSONObject jSONObject2 = new JSONObject();
                                                                                                                (jSONObject2.put("key",str2));
                                                                                                                (jSONObject2.put(str,str2));
                                                                                                                (jSONObject2.put("value",jSONArray4));
                                                                                                                (jSONArray2.put(jSONObject2));
                                                                                                                break;
                                                                                                            case 2025:
                                                                                                                int i15 = 52611;
                                                                                                                while (true) {
                                                                                                                    i15 ^= 52628;
                                                                                                                    switch (i15) {
                                                                                                                        case 23:
                                                                                                                            i15 = 52642;
                                                                                                                        case 54:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 50:
                                                                                                case 76:
                                                                                                    String str3 = (jSONArray3.optString(i10));
                                                                                                    boolean z2 = (TextUtils.isEmpty(str3));
                                                                                                    int i16 = 50813;
                                                                                                    while (true) {
                                                                                                        i16 ^= 50830;
                                                                                                        switch (i16) {
                                                                                                            case 18:
                                                                                                            case 53:
                                                                                                                JSONObject jSONObject3 = new JSONObject();
                                                                                                                (jSONObject3.put("n",str3));
                                                                                                                (jSONObject3.put("v",str3));
                                                                                                                (jSONArray4.put(jSONObject3));
                                                                                                                break;
                                                                                                            case 243:
                                                                                                                i16 = z2 ? 51557 : 50875;
                                                                                                            case 4075:
                                                                                                                int i17 = 51588;
                                                                                                                while (true) {
                                                                                                                    i17 ^= 51605;
                                                                                                                    switch (i17) {
                                                                                                                        case 17:
                                                                                                                            i17 = 51619;
                                                                                                                        case 54:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    i10++;
                                                                                                    int i18 = 51712;
                                                                                                    while (true) {
                                                                                                        i18 ^= 51729;
                                                                                                        switch (i18) {
                                                                                                            case 17:
                                                                                                                i18 = 51743;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 84:
                                                                                    int i19 = 49914;
                                                                                    while (true) {
                                                                                        i19 ^= 49931;
                                                                                        switch (i19) {
                                                                                            case 497:
                                                                                                i19 = 50596;
                                                                                            case 1711:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 241:
                                                                                    i9 = i8 == 0 ? 49883 : 49852;
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
                                                break;
                                            case 47417:
                                                int i20 = 48767;
                                                while (true) {
                                                    i20 ^= 48784;
                                                    switch (i20) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i20 = 48798;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                        }
                                    }
                                    i2++;
                                    int i21 = 52735;
                                    while (true) {
                                        i21 ^= 52752;
                                        switch (i21) {
                                            case 14:
                                                break;
                                            case 1007:
                                                i21 = 52766;
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 365
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private void SN() {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.SN():void");
    }

    private static String dT(Object obj) {
        String str = "";
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (obj == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z = C0028.m1628(JSONObject.NULL, obj);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                String str2 = ((String.valueOf(obj)).trim());
                                boolean z2 = ("null".equals(str2));
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            return str2;
                                        case 76:
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        return str;
                                                    case 503:
                                                        i4 = 48922;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            if (!z2) {
                                                break;
                                            } else {
                                                i3 = 48860;
                                                continue;
                                            }
                                    }
                                    i3 = 48829;
                                }
                                break;
                            case 500:
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            i5 = 48674;
                                            break;
                                        case 47483:
                                            return str;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return str;
            }
            i = 1678;
        }
    }

    static Object[] i(String str, String str2, String str3) {
        String str4;
        StringBuilder sb;
        String str5;
        String str6;
        String str7 = m738(str, str2, str3);
        HashMap hashMap = new HashMap();
        (hashMap.put("User-Agent","Mozi"));
        (hashMap.put("Accept","*/*"));
        String str8 = C0001.m32(str7, hashMap);
        boolean z = (TextUtils.isEmpty(str8));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z2 = (str8.contains("#EXT"));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (z2) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                String str9 = "UTF-8";
                                String str10 = C0009.m260(str2, str9);
                                String str11 = C0009.m260(str3, str9);
                                Uri uri = C0034.m1791(str);
                                StringBuilder sb2 = new StringBuilder();
                                String[] strArr = (str8.split("\\r?\\n",-1));
                                int i3 = 0;
                                while (true) {
                                    int i4 = i3;
                                    int length = strArr.length;
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                            case 45:
                                                return new Object[]{(Integer.valueOf(200)), "application/vnd.apple.mpegurl", new ByteArrayInputStream(((sb2.toString()).getBytes(StandardCharsets.UTF_8)))};
                                            case 76:
                                                int i6 = 48891;
                                                while (true) {
                                                    i6 ^= 48908;
                                                    switch (i6) {
                                                        case 22:
                                                        case 53:
                                                            break;
                                                        case 503:
                                                            i6 = i4 > 0 ? 49635 : 48953;
                                                        case 32495:
                                                            (sb2.append('\n'));
                                                            break;
                                                    }
                                                }
                                                String str12 = strArr[i4];
                                                boolean z3 = (str12.isEmpty());
                                                int i7 = 49666;
                                                while (true) {
                                                    i7 ^= 49683;
                                                    switch (i7) {
                                                        case 17:
                                                            i7 = !z3 ? 49759 : 49728;
                                                        case 50:
                                                        case 76:
                                                            boolean z4 = (str12.startsWith("#"));
                                                            int i8 = 49790;
                                                            while (true) {
                                                                i8 ^= 49807;
                                                                switch (i8) {
                                                                    case 18:
                                                                    case 51:
                                                                        boolean z5 = (str12.contains("?"));
                                                                        int i9 = 50689;
                                                                        while (true) {
                                                                            i9 ^= 50706;
                                                                            switch (i9) {
                                                                                case 19:
                                                                                    i9 = z5 ? 50782 : 50751;
                                                                                case 45:
                                                                                    break;
                                                                                case 50:
                                                                                case 76:
                                                                                    str12 = (str12.substring(0,(str12.indexOf(63))));
                                                                                    break;
                                                                            }
                                                                        }
                                                                        String str13 = "://";
                                                                        boolean z6 = (str12.contains(str13));
                                                                        int i10 = 50813;
                                                                        while (true) {
                                                                            i10 ^= 50830;
                                                                            switch (i10) {
                                                                                case 18:
                                                                                case 53:
                                                                                    boolean z7 = (str12.startsWith("/"));
                                                                                    int i11 = 51712;
                                                                                    while (true) {
                                                                                        i11 ^= 51729;
                                                                                        switch (i11) {
                                                                                            case 14:
                                                                                            case 17:
                                                                                                i11 = z7 ? 51805 : 51774;
                                                                                            case 47:
                                                                                                String str14 = (uri.getLastPathSegment());
                                                                                                int i12 = 53510;
                                                                                                while (true) {
                                                                                                    i12 ^= 53527;
                                                                                                    switch (i12) {
                                                                                                        case 17:
                                                                                                            i12 = str14 == null ? 53603 : 53572;
                                                                                                        case 50:
                                                                                                        case 83:
                                                                                                            str4 = (str.substring(0,(str.indexOf(str14))));
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            int i13 = 53634;
                                                                                                            while (true) {
                                                                                                                i13 ^= 53651;
                                                                                                                switch (i13) {
                                                                                                                    case 17:
                                                                                                                        i13 = 53665;
                                                                                                                    case 50:
                                                                                                                        str4 = str;
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                sb = new StringBuilder();
                                                                                                break;
                                                                                            case 76:
                                                                                                sb = new StringBuilder();
                                                                                                (sb.append((uri.getScheme())));
                                                                                                (sb.append(str13));
                                                                                                (sb.append((uri.getHost())));
                                                                                                int i14 = (uri.getPort());
                                                                                                int i15 = 51836;
                                                                                                while (true) {
                                                                                                    i15 ^= 51853;
                                                                                                    switch (i15) {
                                                                                                        case 241:
                                                                                                            i15 = i14 != -1 ? 52580 : 52549;
                                                                                                        case 1963:
                                                                                                        case 1992:
                                                                                                            str4 = "";
                                                                                                            int i16 = 52735;
                                                                                                            while (true) {
                                                                                                                i16 ^= 52752;
                                                                                                                switch (i16) {
                                                                                                                    case 14:
                                                                                                                        break;
                                                                                                                    case 1007:
                                                                                                                        i16 = 52766;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2025:
                                                                                                            StringBuilder sb3 = C0052.m2253(":");
                                                                                                            (sb3.append((uri.getPort())));
                                                                                                            str4 = (sb3.toString());
                                                                                                            int i17 = 52611;
                                                                                                            while (true) {
                                                                                                                i17 ^= 52628;
                                                                                                                switch (i17) {
                                                                                                                    case 23:
                                                                                                                        i17 = 52642;
                                                                                                                    case 54:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    str5 = C0032.m1739(sb, str4, str12);
                                                                                    break;
                                                                                case 243:
                                                                                    i10 = z6 ? 51557 : 50875;
                                                                                case 4075:
                                                                                    int i18 = 51588;
                                                                                    while (true) {
                                                                                        i18 ^= 51605;
                                                                                        switch (i18) {
                                                                                            case 17:
                                                                                                i18 = 51619;
                                                                                            case 54:
                                                                                                str5 = str12;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                        (sb2.append(ProxyOrigin.getUrl()));
                                                                        (sb2.append("?do=hmys&type=ts&url="));
                                                                        (sb2.append(C0034.m1790((str5.getBytes(StandardCharsets.UTF_8)), 10)));
                                                                        (sb2.append("&ck="));
                                                                        (sb2.append(str10));
                                                                        (sb2.append("&sign="));
                                                                        (sb2.append(str11));
                                                                        int i19 = 53758;
                                                                        while (true) {
                                                                            i19 ^= 53775;
                                                                            switch (i19) {
                                                                                case 1009:
                                                                                    i19 = 54440;
                                                                                case 1703:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 84:
                                                                        int i20 = 49914;
                                                                        while (true) {
                                                                            i20 ^= 49931;
                                                                            switch (i20) {
                                                                                case 497:
                                                                                    i20 = 50596;
                                                                                case 1711:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 241:
                                                                        i8 = z4 ? 49883 : 49852;
                                                                }
                                                            }
                                                            break;
                                                        case 83:
                                                            break;
                                                    }
                                                }
                                                (sb2.append(str12));
                                                i3 = i4 + 1;
                                                int i21 = 54533;
                                                while (true) {
                                                    i21 ^= 54550;
                                                    switch (i21) {
                                                        case 19:
                                                            i21 = 54564;
                                                        case 50:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i5 = i4 < length ? 48860 : 48829;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i22 = 1864;
                                while (true) {
                                    i22 ^= 1881;
                                    switch (i22) {
                                        case 17:
                                            i22 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        StringBuilder sb4 = new StringBuilder();
        (sb4.append("m3u8 fetch fail url="));
        (sb4.append(str7));
        (sb4.append(" bodyHead="));
        int i23 = 54657;
        while (true) {
            i23 ^= 54674;
            switch (i23) {
                case 19:
                    if (str8 != null) {
                        break;
                    } else {
                        i23 = 55401;
                        continue;
                    }
                case 45:
                    str6 = (str8.substring(0,(Math.min(80,(str8.length())))));
                    break;
                case 50:
                    break;
                case 3579:
                    str6 = "null";
                    int i24 = 55432;
                    while (true) {
                        i24 ^= 55449;
                        switch (i24) {
                            case 17:
                                i24 = 55463;
                                break;
                            case 62:
                                break;
                        }
                    }
                    break;
            }
            i23 = 54719;
        }
        (sb4.append(str6));
        (sb4.toString());
        "Hmys";
        Exception exc = new Exception("m3u8 fetch fail");
        int i25 = 55556;
        while (true) {
            i25 ^= 55573;
            switch (i25) {
                case 17:
                    i25 = 55587;
                    break;
                case 54:
                    int i26 = 55680;
                    while (true) {
                        i26 ^= 55697;
                        switch (i26) {
                            case 17:
                                i26 = 56362;
                                break;
                            case 1467:
                                throw exc;
                        }
                    }
                    break;
            }
        }
    }

    private JSONObject q(String str, HashMap<String, String> hashMap, String str2) {
        JSONObject jSONObject = new JSONObject(m745(this, m767(this, str, hashMap)));
        boolean z = (TextUtils.isEmpty(str2));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    break;
                case 239:
                    String[] strArr = (str2.split("\\."));
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = i2 < length ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    jSONObject = (jSONObject.optJSONObject(strArr[i2]));
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = jSONObject != null ? 48736 : 48705;
                                            case 47384:
                                                StringBuilder sb = new StringBuilder();
                                                (sb.append("missing path "));
                                                (sb.append(str2));
                                                (sb.append(" url="));
                                                (sb.append(str));
                                                throw new Exception((sb.toString()));
                                            case 47417:
                                                i2++;
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i5 = 48798;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
            }
            i = 1678;
        }
        return jSONObject;
    }

    public static String randomDeviceId(int i) {
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int i2 = 0;
        while (true) {
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                    case 49:
                        i3 = i2 < i ? 1709 : 1678;
                    case 204:
                        (sb.append(("abcdefghijklmnopqrstuvwxyz0123456789".charAt((secureRandom.nextInt(36))))));
                        i2++;
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = 1771;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        return (m741((sb.toString())).substring(0,16));
                }
            }
        }
    }

    private JSONObject t0(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        String str = m757((jSONObject.opt("id")));
        boolean z = (TextUtils.isEmpty(str));
        String str2 = "vod_id";
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    str = m757((jSONObject.opt(str2)));
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        (jSONObject2.put(str2,str));
        String str3 = (jSONObject.optString("title"));
        String str4 = "vod_name";
        (jSONObject2.put(str4,(jSONObject.optString(str4,str3))));
        String str5 = (jSONObject.optString("pic"));
        String str6 = "vod_pic";
        (jSONObject2.put(str6,(jSONObject.optString(str6,str5))));
        (jSONObject2.put("vod_remarks",m739(this, jSONObject)));
        return jSONObject2;
    }

    private static String tF(String str, String str2, String str3) {
        String str4;
        String str5 = "?";
        boolean z = (str.contains(str5));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    str = (str.substring(0,(str.indexOf(63))));
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        String str6 = (C0034.m1791(str).getPath());
        boolean z2 = (TextUtils.isEmpty(str6));
        int i2 = 1740;
        while (true) {
            i2 ^= 1757;
            switch (i2) {
                case 17:
                    if (z2) {
                        break;
                    } else {
                        i2 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    throw new Exception(C0022.m1434("cdn path empty: ", str));
                case 500:
                    boolean z3 = (TextUtils.isEmpty(str3));
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                if (!z3) {
                                    break;
                                } else {
                                    i3 = 48736;
                                    continue;
                                }
                            case 47384:
                                break;
                            case 47417:
                                str3 = "vT1RQRz8YzlzTgN26pIXNJ7Mi65juwSP";
                                break;
                            case 47483:
                                break;
                        }
                        i3 = 48705;
                    }
                    String str7 = (Long.toHexString(System.currentTimeMillis() / 1000));
                    String str8 = m741(C0048.m2149(str3, str6, str7));
                    boolean z4 = (TextUtils.isEmpty(str2));
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                throw new Exception("empty ck");
                            case 76:
                                String str9 = (str2.trim());
                                String str10 = "Time=";
                                boolean z5 = (str9.contains(str10));
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            if (z5) {
                                                break;
                                            } else {
                                                i5 = 49635;
                                                continue;
                                            }
                                        case 32495:
                                            String str11 = "k=";
                                            boolean z6 = (str9.startsWith(str11));
                                            int i6 = 49666;
                                            while (true) {
                                                i6 ^= 49683;
                                                switch (i6) {
                                                    case 17:
                                                        if (z6) {
                                                            break;
                                                        } else {
                                                            i6 = 49759;
                                                            continue;
                                                        }
                                                    case 50:
                                                        break;
                                                    case 76:
                                                        String str12 = "az=";
                                                        boolean z7 = (str9.startsWith(str12));
                                                        int i7 = 49790;
                                                        while (true) {
                                                            i7 ^= 49807;
                                                            switch (i7) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    byte[] bArr = C0022.m1420(str9, 0);
                                                                    int i8 = 50689;
                                                                    while (true) {
                                                                        i8 ^= 50706;
                                                                        switch (i8) {
                                                                            case 19:
                                                                                if (bArr == null) {
                                                                                    break;
                                                                                } else {
                                                                                    i8 = 50782;
                                                                                    continue;
                                                                                }
                                                                            case 45:
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case 76:
                                                                                int length = bArr.length;
                                                                                int i9 = 50813;
                                                                                while (true) {
                                                                                    i9 ^= 50830;
                                                                                    switch (i9) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 53:
                                                                                            break;
                                                                                        case 243:
                                                                                            if (length != 0) {
                                                                                                break;
                                                                                            } else {
                                                                                                i9 = 51557;
                                                                                                continue;
                                                                                            }
                                                                                        case 4075:
                                                                                            break;
                                                                                    }
                                                                                    i9 = 50875;
                                                                                }
                                                                                break;
                                                                        }
                                                                        i8 = 50751;
                                                                    }
                                                                    bArr = C0022.m1420(str9, 10);
                                                                    int i10 = 51588;
                                                                    while (true) {
                                                                        i10 ^= 51605;
                                                                        switch (i10) {
                                                                            case 17:
                                                                                if (bArr == null) {
                                                                                    break;
                                                                                } else {
                                                                                    i10 = 51681;
                                                                                    continue;
                                                                                }
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                break;
                                                                            case 116:
                                                                                int length2 = bArr.length;
                                                                                int i11 = 51712;
                                                                                while (true) {
                                                                                    i11 ^= 51729;
                                                                                    switch (i11) {
                                                                                        case 14:
                                                                                            break;
                                                                                        case 17:
                                                                                            if (length2 == 0) {
                                                                                                break;
                                                                                            } else {
                                                                                                i11 = 51805;
                                                                                                continue;
                                                                                            }
                                                                                        case 47:
                                                                                            break;
                                                                                        case 76:
                                                                                            str4 = (new String(bArr, StandardCharsets.UTF_8).trim());
                                                                                            boolean z8 = (str4.contains(str10));
                                                                                            int i12 = 51836;
                                                                                            while (true) {
                                                                                                i12 ^= 51853;
                                                                                                switch (i12) {
                                                                                                    case 241:
                                                                                                        if (z8) {
                                                                                                            break;
                                                                                                        } else {
                                                                                                            i12 = 52580;
                                                                                                            continue;
                                                                                                        }
                                                                                                    case 1963:
                                                                                                        break;
                                                                                                    case 1992:
                                                                                                        break;
                                                                                                    case 2025:
                                                                                                        boolean z9 = (str4.startsWith(str11));
                                                                                                        int i13 = 52611;
                                                                                                        while (true) {
                                                                                                            i13 ^= 52628;
                                                                                                            switch (i13) {
                                                                                                                case 23:
                                                                                                                    if (z9) {
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        i13 = 52704;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                                case 85:
                                                                                                                    break;
                                                                                                                case 116:
                                                                                                                    boolean z10 = (str4.startsWith(str12));
                                                                                                                    int i14 = 52735;
                                                                                                                    while (true) {
                                                                                                                        i14 ^= 52752;
                                                                                                                        switch (i14) {
                                                                                                                            case 14:
                                                                                                                                break;
                                                                                                                            case 45:
                                                                                                                                StringBuilder sb = C0052.m2253("ck decode not query: ");
                                                                                                                                (sb.append((str4.substring(0,(Math.min(48,(str4.length())))))));
                                                                                                                                throw new Exception((sb.toString()));
                                                                                                                            case 1007:
                                                                                                                                if (!z10) {
                                                                                                                                    break;
                                                                                                                                } else {
                                                                                                                                    i14 = 53479;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                            case 7927:
                                                                                                                                int i15 = 53510;
                                                                                                                                while (true) {
                                                                                                                                    i15 ^= 53527;
                                                                                                                                    switch (i15) {
                                                                                                                                        case 17:
                                                                                                                                            i15 = 53541;
                                                                                                                                            break;
                                                                                                                                        case 50:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i14 = 52797;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            i13 = 52673;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                i12 = 52549;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    i11 = 51774;
                                                                                }
                                                                                break;
                                                                        }
                                                                        i10 = 51650;
                                                                    }
                                                                    throw new Exception("ck base64 decode fail");
                                                                case 84:
                                                                    int i16 = 49914;
                                                                    while (true) {
                                                                        i16 ^= 49931;
                                                                        switch (i16) {
                                                                            case 497:
                                                                                i16 = 50596;
                                                                                break;
                                                                            case 1711:
                                                                                str4 = str9;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    if (!z7) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 49883;
                                                                        continue;
                                                                    }
                                                            }
                                                            i7 = 49852;
                                                        }
                                                        break;
                                                    case 83:
                                                        break;
                                                }
                                                i6 = 49728;
                                            }
                                            break;
                                    }
                                    i5 = 48953;
                                }
                                str4 = str9;
                                StringBuilder sb2 = new StringBuilder();
                                (sb2.append(str));
                                (sb2.append(str5));
                                (sb2.append(str4));
                                (sb2.append("&wsSecret="));
                                (sb2.append(str8));
                                String str13 = C0032.m1739(sb2, "&wsTime=", str7);
                                StringBuilder sb3 = new StringBuilder();
                                (sb3.append("cdn sign path="));
                                (sb3.append(str6));
                                (sb3.append(" time="));
                                (sb3.append(str7));
                                (sb3.append(" secret="));
                                (sb3.append(str8));
                                (sb3.append(" signLen="));
                                (sb3.append((str3.length())));
                                (sb3.append(" deckHead="));
                                (sb3.append((str4.substring(0,(Math.min(24,(str4.length())))))));
                                (sb3.toString());
                                "Hmys";
                                return str13;
                            case 239:
                                if (z4) {
                                    break;
                                } else {
                                    i4 = 48860;
                                    continue;
                                }
                        }
                        i4 = 48829;
                    }
                    break;
            }
            i2 = 1802;
        }
    }

    public static Object[] vod(Map<String, String> map) {
        String str = (String) (map.get("type"));
        String str2 = (String) (map.get("url"));
        String str3 = (String) (map.get("ck"));
        String str4 = (String) (map.get("sign"));
        boolean z = (TextUtils.isEmpty(str4));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    str4 = "vT1RQRz8YzlzTgN26pIXNJ7Mi65juwSP";
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        String str5 = new String(C0022.m1420(str2, 10));
        try {
            boolean z2 = ("m3u8".equals(str));
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        if (!z2) {
                            break;
                        } else {
                            i2 = 1833;
                            continue;
                        }
                    case 54:
                        break;
                    case 471:
                        boolean z3 = ("ts".equals(str));
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    if (!z3) {
                                        break;
                                    } else {
                                        i3 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    return null;
                                case 47417:
                                    return m750(str5, str3, str4);
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 48705;
                        }
                    case 500:
                        return m753(str5, str3, str4);
                    default:
                        continue;
                }
                i2 = 1802;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String yq(String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z = (str.startsWith("http"));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                return str;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        return C0032.m1739(new StringBuilder(), m744(this), str);
    }

    static Object[] zH(String str, String str2, String str3) {
        int i;
        boolean z = (str.contains("?"));
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
                    str = (str.substring(0,(str.indexOf(63))));
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        String str4 = m738(str, str2, str3);
        AbstractC0181tM.yq yqVar = new AbstractC0181tM.yq() { // from class: com.github.catvod.spider.Hmys.2
            {
                int i3 = (-556) ^ C0004.f4;
                int i4 = 1616;
                while (true) {
                    i4 ^= 1633;
                    switch (i4) {
                        case 14:
                            break;
                        case 49:
                            if (i3 < 0) {
                                break;
                            } else {
                                i4 = 1709;
                                continue;
                            }
                        case 204:
                            return;
                        case 239:
                            return;
                    }
                    i4 = 1678;
                }
            }

            /* renamed from: ﺯفاﺡ  reason: contains not printable characters */
            public static void m787(Object obj, Object obj2) {
                int i3 = (-26) ^ C0033.f91;
                int i4 = 1616;
                while (true) {
                    i4 ^= 1633;
                    switch (i4) {
                        case 14:
                            break;
                        case 49:
                            if (i3 < 0) {
                                break;
                            } else {
                                i4 = 1709;
                                continue;
                            }
                        case 204:
                            ((AnonymousClass2) obj).onResponse2((Response) obj2);
                            return;
                        case 239:
                            int i5 = 1740;
                            while (true) {
                                i5 ^= 1757;
                                switch (i5) {
                                    case 17:
                                        i5 = 1771;
                                        break;
                                    case 54:
                                        return;
                                }
                            }
                            break;
                    }
                    i4 = 1678;
                }
            }

            @Override // com.github.catvod.spider.merge.AbstractC0181tM
            public void onFailure(Call call, Exception exc) {
            }

            @Override // com.github.catvod.spider.merge.AbstractC0181tM
            public /* bridge */ /* synthetic */ void onResponse(Response response) {
                m787(this, response);
            }

            /* renamed from: onResponse  reason: avoid collision after fix types in other method */
            public void onResponse2(Response response) {
                int i3 = 215 ^ C0038.f96;
                int i4 = 1616;
                while (true) {
                    i4 ^= 1633;
                    switch (i4) {
                        case 14:
                            break;
                        case 49:
                            if (i3 < 0) {
                                break;
                            } else {
                                i4 = 1709;
                                continue;
                            }
                        case 204:
                            return;
                        case 239:
                            return;
                    }
                    i4 = 1678;
                }
            }
        };
        m764(m758(0), str4, C0055.m2325("User-Agent", "Mozi", "Accept", "*/*"), yqVar);
        Response response = (Response) (yqVar.getResult());
        int i3 = 1740;
        while (true) {
            i3 ^= 1757;
            switch (i3) {
                case 17:
                    if (response == null) {
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
                    int i4 = m776(response);
                    int i5 = 1864;
                    while (true) {
                        i5 ^= 1881;
                        switch (i5) {
                            case 17:
                                if (i4 != 200) {
                                    break;
                                } else {
                                    i5 = 48736;
                                    continue;
                                }
                            case 47384:
                                break;
                            case 47417:
                                ResponseBody responseBody = m785(response);
                                int i6 = 48767;
                                while (true) {
                                    i6 ^= 48784;
                                    switch (i6) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            String str5 = m768(m763(response), "Content-Type");
                                            int i7 = 48891;
                                            while (true) {
                                                i7 ^= 48908;
                                                switch (i7) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 503:
                                                        if (str5 != null) {
                                                            break;
                                                        } else {
                                                            i7 = 49635;
                                                            continue;
                                                        }
                                                    case 32495:
                                                        str5 = "video/mp2t";
                                                        break;
                                                }
                                                i7 = 48953;
                                            }
                                            return new Object[]{(Integer.valueOf(200)), str5, m748(m785(response))};
                                        case 239:
                                            if (responseBody == null) {
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
                    break;
            }
            i3 = 1802;
        }
        StringBuilder sb = C0052.m2253("ts fetch fail code=");
        int i8 = 49666;
        while (true) {
            i8 ^= 49683;
            switch (i8) {
                case 17:
                    if (response != null) {
                        break;
                    } else {
                        i8 = 49759;
                        continue;
                    }
                case 50:
                    break;
                case 76:
                    i = -1;
                    int i9 = 49790;
                    while (true) {
                        i9 ^= 49807;
                        switch (i9) {
                            case 18:
                                break;
                            case 241:
                                i9 = 49821;
                                break;
                        }
                    }
                    break;
                case 83:
                    i = m776(response);
                    break;
            }
            i8 = 49728;
        }
        (sb.append(i));
        (sb.append(" url="));
        (sb.append(str4));
        (sb.toString());
        "Hmys";
        return null;
    }

    /* renamed from: باﺙك  reason: contains not printable characters */
    public static void m736(Object obj) {
        int i = (-824) ^ C0004.f4;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    SpiderDebug.log((Throwable) obj);
                    return;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: بغﻝض  reason: contains not printable characters */
    public static JSONArray m737(Object obj, Object obj2) {
        int i = (-477) ^ C0042.f100;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).N((JSONArray) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: بﺙﻉم  reason: contains not printable characters */
    public static String m738(Object obj, Object obj2, Object obj3) {
        int i = (-886) ^ C0021.f79;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return tF((String) obj, (String) obj2, (String) obj3);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: بﺱـﺭ  reason: contains not printable characters */
    public static String m739(Object obj, Object obj2) {
        int i = (-314) ^ C0002.f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).G((JSONObject) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: تنلﺙ  reason: contains not printable characters */
    public static String m740(Object obj) {
        int i = (-185) ^ C0033.f91;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return F5((String) obj);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: تﺕﻕز  reason: contains not printable characters */
    public static String m741(Object obj) {
        int i = 57 ^ C0032.f90;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return Gc((String) obj);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: تﺝﺙي  reason: contains not printable characters */
    public static String m742(Object obj) {
        int i = 284 ^ C0041.f99;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).KJ;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: تﺹﺥﺕ  reason: contains not printable characters */
    public static String m743(Object obj) {
        int i = (-404) ^ C0021.f79;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).W;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ثﺙﺡو  reason: contains not printable characters */
    public static String m744(Object obj) {
        int i = (-193) ^ C0041.f99;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).tF;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ثﻭذﺩ  reason: contains not printable characters */
    public static String m745(Object obj, Object obj2) {
        int i = 802 ^ C0052.f110;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).M((String) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: جشﺥﺎ  reason: contains not printable characters */
    public static JSONArray m746(Object obj, Object obj2, Object obj3) {
        int i = (-1021) ^ C0026.f84;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).KJ((String) obj2, (HashMap) obj3);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ذفصط  reason: contains not printable characters */
    public static boolean m747(Object obj) {
        int i = 284 ^ C0041.f99;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).G;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: رذﻝم  reason: contains not printable characters */
    public static InputStream m748(Object obj) {
        int i = (-767) ^ C0037.f95;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((ResponseBody) obj).byteStream();
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: زﺥﻱـ  reason: contains not printable characters */
    public static String m749(Object obj) {
        int i = (-556) ^ C0004.f4;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).N;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: سﺝبث  reason: contains not printable characters */
    public static Object[] m750(Object obj, Object obj2, Object obj3) {
        int i = (-31) ^ C0041.f99;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return zH((String) obj, (String) obj2, (String) obj3);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: طﺫوﺥ  reason: contains not printable characters */
    public static String m751(Object obj) {
        int i = 125 ^ C0037.f95;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).Gc;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ظﺏخد  reason: contains not printable characters */
    public static String m752(Object obj) {
        int i = (-26) ^ C0033.f91;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).q;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: غاﻝﺝ  reason: contains not printable characters */
    public static Object[] m753(Object obj, Object obj2, Object obj3) {
        int i = 658 ^ C0029.f87;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return i((String) obj, (String) obj2, (String) obj3);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: غﻭمت  reason: contains not printable characters */
    public static String m754(Object obj) {
        int i = 515 ^ C0028.f86;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).B;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: غﻭوﺱ  reason: contains not printable characters */
    public static String m755(Object obj) {
        int i = (-1021) ^ C0026.f84;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).xa;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ـتمﻡ  reason: contains not printable characters */
    public static String m756(Object obj) {
        int i = 293 ^ C0009.f9;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).F5;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ـﻭﺱم  reason: contains not printable characters */
    public static String m757(Object obj) {
        int i = (-886) ^ C0021.f79;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return dT(obj);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: كﺎذﺕ  reason: contains not printable characters */
    public static OkHttpClient m758(int i) {
        int i2 = (-732) ^ f2;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 > 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return C0068Pe.yq(i);
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

    /* renamed from: لكﺱﺏ  reason: contains not printable characters */
    public static JSONObject m759(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 753 ^ C0000.f0;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).q((String) obj2, (HashMap) obj3, (String) obj4);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ماﻝﺭ  reason: contains not printable characters */
    public static String m760(Object obj) {
        int i = (-448) ^ C0025.f83;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).SN;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: هصكخ  reason: contains not printable characters */
    public static String m761(Object obj) {
        int i = 658 ^ C0029.f87;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).Gd;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺏيﻙم  reason: contains not printable characters */
    public static String m762(Object obj) {
        int i = (-388) ^ C0035.f93;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).i;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺏﺵﻙر  reason: contains not printable characters */
    public static Headers m763(Object obj) {
        int i = (-404) ^ C0021.f79;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Response) obj).headers();
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺏﻍﺎا  reason: contains not printable characters */
    public static void m764(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 658 ^ C0029.f87;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    C0068Pe.tF((OkHttpClient) obj, (String) obj2, (Map) obj3, (AbstractC0181tM) obj4);
                    break;
                case 239:
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = 48674;
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
        int i4 = 923 ^ C0041.f99;
        int i5 = 1740;
        while (true) {
            i5 ^= 1757;
            switch (i5) {
                case 17:
                    
                        break;
                    
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: ﺕﺩذت  reason: contains not printable characters */
    public static String m765(Object obj) {
        int i = 658 ^ C0029.f87;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).v;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺙﺎرﻕ  reason: contains not printable characters */
    public static String m766(Object obj) {
        int i = (-31) ^ C0006.f6;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).yq;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺝﺕﺎه  reason: contains not printable characters */
    public static String m767(Object obj, Object obj2, Object obj3) {
        int i = (-422) ^ C0033.f91;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).B((String) obj2, (HashMap) obj3);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺝﺥﺙﻕ  reason: contains not printable characters */
    public static String m768(Object obj, Object obj2) {
        int i = 498 ^ C0002.f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Headers) obj).get((String) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺭنخث  reason: contains not printable characters */
    public static String m769(Object obj) {
        int i = 706 ^ C0003.f3;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).g9;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺭﻩكز  reason: contains not printable characters */
    public static boolean m770(Object obj) {
        int i = 938 ^ C0033.f91;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).G4;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺱصتك  reason: contains not printable characters */
    public static void m771(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = (-821) ^ C0025.f83;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    C0068Pe.G((OkHttpClient) obj, (String) obj2, (Map) obj3, (Map) obj4, (AbstractC0181tM) obj5);
                    return;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺱقـم  reason: contains not printable characters */
    public static String m772(Object obj) {
        int i = (-185) ^ C0033.f91;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).M;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺵﺫﻱم  reason: contains not printable characters */
    public static String m774(Object obj) {
        int i = (-406) ^ C0053.f111;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).Nl;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺽجدح  reason: contains not printable characters */
    public static String m775(Object obj) {
        int i = 57 ^ C0032.f90;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).t0;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺽﺹﻡغ  reason: contains not printable characters */
    public static int m776(Object obj) {
        int i = (-767) ^ C0037.f95;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Response) obj).code();
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺽﻍطﻝ  reason: contains not printable characters */
    public static String m777(Object obj) {
        int i = 909 ^ C0002.f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).ee;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻁﺩﺯز  reason: contains not printable characters */
    public static String m778(Object obj, Object obj2) {
        int i = (-26) ^ C0033.f91;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).G4((String) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻅاﻡﻱ  reason: contains not printable characters */
    public static String m779(Object obj) {
        int i = (-314) ^ C0002.f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).dT;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻅﻉظﻡ  reason: contains not printable characters */
    public static void m780(Object obj) {
        int i = 354 ^ C0026.f84;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    ((Hmys) obj).SN();
                    return;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻉذدﻡ  reason: contains not printable characters */
    public static JSONObject m781(Object obj, Object obj2) {
        int i = 697 ^ C0024.f82;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).t0((JSONObject) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻍﺯﺩﻡ  reason: contains not printable characters */
    public static String m782(Object obj, Object obj2) {
        int i = 284 ^ C0041.f99;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).yq((String) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻙاهخ  reason: contains not printable characters */
    public static String m783(Object obj) {
        int i = (-821) ^ C0025.f83;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).v3;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻭﺙحﺡ  reason: contains not printable characters */
    public static String m784(Object obj) {
        int i = (-422) ^ C0033.f91;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Hmys) obj).zH;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻭﺱغﺩ  reason: contains not printable characters */
    public static ResponseBody m785(Object obj) {
        int i = (-985) ^ C0024.f82;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Response) obj).body();
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int i = 1;
        String str3 = "";
        try {
            boolean z2 = ("-100".equals(str));
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
                        return (this.homeVideoContent());
                    case 239:
                        boolean z3 = (TextUtils.isEmpty(str2));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (!z3) {
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
                                    str2 = "1";
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                        int i4 = (Integer.parseInt(str2));
                        int i5 = 1864;
                        while (true) {
                            i5 ^= 1881;
                            switch (i5) {
                                case 17:
                                    if (i4 > 0) {
                                        break;
                                    } else {
                                        i5 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    i = i4;
                                    break;
                                case 47417:
                                    break;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i5 = 48705;
                        }
                        int i6 = 48767;
                        while (true) {
                            i6 ^= 48784;
                            switch (i6) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    hashMap = new HashMap<>();
                                    break;
                                case 239:
                                    if (hashMap != null) {
                                        break;
                                    } else {
                                        i6 = 48860;
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                            i6 = 48829;
                        }
                        HashMap hashMap2 = new HashMap();
                        (hashMap2.put("pn",(String.valueOf(i))));
                        (hashMap2.put("type_id",str));
                        (hashMap2.put("tag_type",str3));
                        (hashMap2.put("type",str3));
                        (hashMap2.put("area",str3));
                        (hashMap2.put("sort",str3));
                        (hashMap2.put("year",str3));
                        Iterator it = ((hashMap.entrySet()).iterator());
                        while (true) {
                            boolean z4 = (it.hasNext());
                            int i7 = 48891;
                            while (true) {
                                i7 ^= 48908;
                                switch (i7) {
                                    case 22:
                                    case 53:
                                        JSONArray jSONArray = m746(this, m782(this, m765(this)), hashMap2);
                                        JSONArray jSONArray2 = new JSONArray();
                                        int i8 = 0;
                                        while (true) {
                                            int i9 = (jSONArray.length());
                                            int i10 = 50813;
                                            while (true) {
                                                i10 ^= 50830;
                                                switch (i10) {
                                                    case 18:
                                                    case 53:
                                                        JSONObject jSONObject = new JSONObject();
                                                        (jSONObject.put("page",i));
                                                        String str4 = "pagecount";
                                                        int i11 = (jSONArray2.length());
                                                        int i12 = 51836;
                                                        while (true) {
                                                            i12 ^= 51853;
                                                            switch (i12) {
                                                                case 241:
                                                                    if (i11 != 0) {
                                                                        break;
                                                                    } else {
                                                                        i12 = 52580;
                                                                        continue;
                                                                    }
                                                                case 1963:
                                                                    break;
                                                                case 1992:
                                                                    i++;
                                                                    break;
                                                                case 2025:
                                                                    int i13 = 52611;
                                                                    while (true) {
                                                                        i13 ^= 52628;
                                                                        switch (i13) {
                                                                            case 23:
                                                                                i13 = 52642;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i12 = 52549;
                                                        }
                                                        (jSONObject.put(str4,i));
                                                        (jSONObject.put("limit",20));
                                                        (jSONObject.put("total",Integer.MAX_VALUE));
                                                        (jSONObject.put("list",jSONArray2));
                                                        return (jSONObject.toString());
                                                    case 243:
                                                        i10 = i8 < i9 ? 51557 : 50875;
                                                    case 4075:
                                                        JSONObject jSONObject2 = m781(this, (jSONArray.getJSONObject(i8)));
                                                        boolean z5 = (TextUtils.isEmpty((jSONObject2.optString("vod_id"))));
                                                        int i14 = 51588;
                                                        while (true) {
                                                            i14 ^= 51605;
                                                            switch (i14) {
                                                                case 17:
                                                                    i14 = !z5 ? 51681 : 51650;
                                                                case 54:
                                                                case 87:
                                                                    break;
                                                                case 116:
                                                                    (jSONArray2.put(jSONObject2));
                                                                    break;
                                                            }
                                                        }
                                                        i8++;
                                                        int i15 = 51712;
                                                        while (true) {
                                                            i15 ^= 51729;
                                                            switch (i15) {
                                                                case 17:
                                                                    i15 = 51743;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 503:
                                        i7 = z4 ? 49635 : 48953;
                                    case 32495:
                                        Map.Entry entry = (Map.Entry) (it.next());
                                        Object obj = (entry.getValue());
                                        int i16 = 49666;
                                        while (true) {
                                            i16 ^= 49683;
                                            switch (i16) {
                                                case 17:
                                                    i16 = obj != null ? 49759 : 49728;
                                                case 50:
                                                case 76:
                                                    boolean z6 = ((String) (entry.getValue()).isEmpty());
                                                    int i17 = 49790;
                                                    while (true) {
                                                        i17 ^= 49807;
                                                        switch (i17) {
                                                            case 18:
                                                            case 51:
                                                                break;
                                                            case 84:
                                                                boolean z7 = ("全部".equals((entry.getValue())));
                                                                int i18 = 49914;
                                                                while (true) {
                                                                    i18 ^= 49931;
                                                                    switch (i18) {
                                                                        case 497:
                                                                            i18 = !z7 ? 50658 : 50627;
                                                                        case 1711:
                                                                        case 1736:
                                                                            continue;
                                                                        case 1769:
                                                                            (hashMap2.put((String) (entry.getKey()),(String) (entry.getValue())));
                                                                            int i19 = 50689;
                                                                            while (true) {
                                                                                i19 ^= 50706;
                                                                                switch (i19) {
                                                                                    case 19:
                                                                                        i19 = 50720;
                                                                                    case 50:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 241:
                                                                i17 = !z6 ? 49883 : 49852;
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
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
        } catch (Exception e) {
            m736(e);
            return str3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0219, code lost:
        r8 = (r7.length());
        r1 = 1864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x021f, code lost:
        r1 = r1 ^ 1881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0221, code lost:
        switch(r1) {
            case 17: goto L61;
            case 47384: goto L60;
            case 47417: goto L63;
            case 47483: goto L62;
            default: goto L64;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0225, code lost:
        if (r3 >= r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0227, code lost:
        r1 = 48736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x022b, code lost:
        r1 = 48705;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x022f, code lost:
        r1 = (r7.getJSONObject(r3));
        r8 = (r1.optString("title"));
        r9 = m757((r1.opt(r11)));
        r1 = (r1.optString("vod_token"));
        r10 = new java.lang.StringBuilder();
        (r10.append(r8));
        (r10.append("$"));
        (r10.append(r9));
        (r10.append(r13));
        (r10.append(r1));
        (r10.append(r13));
        (r10.append(r6));
        (r10.append(r13));
        (r10.append(r4));
        (r5.add((r10.toString())));
        r3 = r3 + 1;
        r3 = 48767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x029b, code lost:
        r3 = r3 ^ 48784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x029f, code lost:
        switch(r3) {
            case 14: goto L71;
            case 239: goto L72;
            default: goto L73;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02a3, code lost:
        r3 = 48798;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        String str;
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = m746(this, m782(this, m783(this)), new HashMap());
            String str3 = m756(this);
            HashSet hashSet = new HashSet();
            boolean z2 = (TextUtils.isEmpty(str3));
            int i = 0;
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
                        String[] strArr = (str3.split("\\|"));
                        int length = strArr.length;
                        int i4 = 0;
                        while (true) {
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = i4 < length ? 48736 : 48705;
                                    case 47384:
                                        break;
                                    case 47417:
                                        String str4 = strArr[i4];
                                        boolean z3 = (TextUtils.isEmpty(str4));
                                        int i6 = 48767;
                                        while (true) {
                                            i6 ^= 48784;
                                            switch (i6) {
                                                case 14:
                                                case 45:
                                                    break;
                                                case 76:
                                                    (hashSet.add(str4));
                                                    break;
                                                case 239:
                                                    i6 = !z3 ? 48860 : 48829;
                                            }
                                        }
                                        i4++;
                                        int i7 = 48891;
                                        while (true) {
                                            i7 ^= 48908;
                                            switch (i7) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i7 = 48922;
                                            }
                                        }
                                        break;
                                    case 47483:
                                }
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            while (true) {
                int i8 = (jSONArray2.length());
                int i9 = 49666;
                while (true) {
                    i9 ^= 49683;
                    switch (i9) {
                        case 17:
                            i9 = i < i8 ? 49759 : 49728;
                        case 50:
                        case 76:
                            JSONObject jSONObject3 = (jSONArray2.getJSONObject(i));
                            String str5 = (jSONObject3.optString("name"));
                            boolean z4 = (TextUtils.isEmpty(str5));
                            int i10 = 49790;
                            while (true) {
                                i10 ^= 49807;
                                switch (i10) {
                                    case 18:
                                    case 51:
                                        str = ((str5.replaceAll("[\\p{So}\\p{Cn}]",str2)).trim());
                                        break;
                                    case 84:
                                        int i11 = 49914;
                                        while (true) {
                                            i11 ^= 49931;
                                            switch (i11) {
                                                case 497:
                                                    i11 = 50596;
                                                case 1711:
                                                    str = str2;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 241:
                                        i10 = z4 ? 49883 : 49852;
                                }
                            }
                            boolean z5 = ("待添加".equals(str));
                            int i12 = 50689;
                            while (true) {
                                i12 ^= 50706;
                                switch (i12) {
                                    case 19:
                                        i12 = !z5 ? 50782 : 50751;
                                    case 45:
                                        break;
                                    case 50:
                                    case 76:
                                        boolean z6 = (TextUtils.isEmpty(str));
                                        int i13 = 50813;
                                        while (true) {
                                            i13 ^= 50830;
                                            switch (i13) {
                                                case 18:
                                                case 53:
                                                    break;
                                                case 243:
                                                    i13 = !z6 ? 51557 : 50875;
                                                case 4075:
                                                    boolean z7 = (hashSet.contains(str));
                                                    int i14 = 51588;
                                                    while (true) {
                                                        i14 ^= 51605;
                                                        switch (i14) {
                                                            case 17:
                                                                i14 = z7 ? 51681 : 51650;
                                                            case 54:
                                                            case 87:
                                                                String str6 = m757((jSONObject3.opt("id")));
                                                                boolean z8 = (TextUtils.isEmpty(str6));
                                                                int i15 = 51836;
                                                                while (true) {
                                                                    i15 ^= 51853;
                                                                    switch (i15) {
                                                                        case 241:
                                                                            i15 = z8 ? 52580 : 52549;
                                                                        case 1963:
                                                                        case 1992:
                                                                            JSONObject jSONObject4 = new JSONObject();
                                                                            (jSONObject4.put("type_id",str6));
                                                                            (jSONObject4.put("type_name",str));
                                                                            (jSONArray.put(jSONObject4));
                                                                            int i16 = 52735;
                                                                            while (true) {
                                                                                i16 ^= 52752;
                                                                                switch (i16) {
                                                                                    case 14:
                                                                                    case 45:
                                                                                        break;
                                                                                    case 1007:
                                                                                        i16 = z ? 53479 : 52797;
                                                                                    case 7927:
                                                                                        JSONArray jSONArray3 = m737(this, (jSONObject3.optJSONArray("msg")));
                                                                                        int i17 = (jSONArray3.length());
                                                                                        int i18 = 53510;
                                                                                        while (true) {
                                                                                            i18 ^= 53527;
                                                                                            switch (i18) {
                                                                                                case 17:
                                                                                                    i18 = i17 > 0 ? 53603 : 53572;
                                                                                                case 50:
                                                                                                case 83:
                                                                                                    break;
                                                                                                case 116:
                                                                                                    (jSONObject2.put(str6,jSONArray3));
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 2025:
                                                                            int i19 = 52611;
                                                                            while (true) {
                                                                                i19 ^= 52628;
                                                                                switch (i19) {
                                                                                    case 23:
                                                                                        i19 = 52642;
                                                                                    case 54:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 116:
                                                                int i20 = 51712;
                                                                while (true) {
                                                                    i20 ^= 51729;
                                                                    switch (i20) {
                                                                        case 17:
                                                                            i20 = 51743;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            i++;
                            int i21 = 53634;
                            while (true) {
                                i21 ^= 53651;
                                switch (i21) {
                                    case 17:
                                        i21 = 53665;
                                    case 50:
                                        break;
                                }
                            }
                            break;
                        case 83:
                            (jSONObject.put("class",jSONArray));
                            int i22 = 53758;
                            while (true) {
                                i22 ^= 53775;
                                switch (i22) {
                                    case 1009:
                                        if (!z) {
                                            break;
                                        } else {
                                            i22 = 54502;
                                            continue;
                                        }
                                    case 1703:
                                        break;
                                    case 1736:
                                        break;
                                    case 1769:
                                        int i23 = (jSONObject2.length());
                                        int i24 = 54533;
                                        while (true) {
                                            i24 ^= 54550;
                                            switch (i24) {
                                                case 19:
                                                    if (i23 <= 0) {
                                                        break;
                                                    } else {
                                                        i24 = 54626;
                                                        continue;
                                                    }
                                                case 50:
                                                    break;
                                                case 85:
                                                    break;
                                                case 116:
                                                    (jSONObject.put("filters",jSONObject2));
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i24 = 54595;
                                        }
                                    default:
                                        continue;
                                }
                                i22 = 54471;
                            }
                            return (jSONObject.toString());
                    }
                }
            }
        } catch (Throwable th) {
            m736(th);
            return str2;
        }
    }

    public String homeVideoContent() {
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            HashMap hashMap = new HashMap();
            (hashMap.put("pn","1"));
            (hashMap.put("psize","100"));
            String str2 = "channel_id";
            boolean z = m747(this);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!z) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        str = m754(this);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        str = m752(this);
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            (hashMap.put(str2,str));
            JSONArray jSONArray2 = (m759(this, m782(this, m743(this)), hashMap, null).optJSONArray("result"));
            String str3 = "list";
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        if (jSONArray2 != null) {
                            break;
                        } else {
                            i3 = 48736;
                            continue;
                        }
                    case 47384:
                        int i4 = 0;
                        while (true) {
                            int i5 = (jSONArray2.length());
                            int i6 = 48767;
                            while (true) {
                                i6 ^= 48784;
                                switch (i6) {
                                    case 14:
                                    case 45:
                                        return ((new JSONObject().put(str3,jSONArray)).toString());
                                    case 76:
                                        JSONArray jSONArray3 = ((jSONArray2.getJSONObject(i4)).optJSONArray("block_list"));
                                        int i7 = 48891;
                                        while (true) {
                                            i7 ^= 48908;
                                            switch (i7) {
                                                case 22:
                                                case 53:
                                                    int i8 = 0;
                                                    while (true) {
                                                        int i9 = (jSONArray3.length());
                                                        int i10 = 49790;
                                                        while (true) {
                                                            i10 ^= 49807;
                                                            switch (i10) {
                                                                case 18:
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    JSONObject jSONObject = (jSONArray3.getJSONObject(i8));
                                                                    JSONObject jSONObject2 = (jSONObject.optJSONObject("vod_info"));
                                                                    String str4 = "vod_id";
                                                                    int i11 = 49914;
                                                                    while (true) {
                                                                        i11 ^= 49931;
                                                                        switch (i11) {
                                                                            case 497:
                                                                                i11 = jSONObject2 != null ? 50658 : 50627;
                                                                            case 1711:
                                                                            case 1736:
                                                                                break;
                                                                            case 1769:
                                                                                int i12 = (jSONArray.length());
                                                                                int i13 = 50689;
                                                                                while (true) {
                                                                                    i13 ^= 50706;
                                                                                    switch (i13) {
                                                                                        case 19:
                                                                                            i13 = i12 < 30 ? 50782 : 50751;
                                                                                        case 45:
                                                                                            break;
                                                                                        case 50:
                                                                                        case 76:
                                                                                            JSONObject jSONObject3 = m781(this, jSONObject2);
                                                                                            String str5 = (jSONObject.optString("banner_pic"));
                                                                                            boolean z2 = (TextUtils.isEmpty(str5));
                                                                                            int i14 = 50813;
                                                                                            while (true) {
                                                                                                i14 ^= 50830;
                                                                                                switch (i14) {
                                                                                                    case 18:
                                                                                                    case 53:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i14 = !z2 ? 51557 : 50875;
                                                                                                    case 4075:
                                                                                                        (jSONObject3.put("vod_pic",str5));
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            boolean z3 = (TextUtils.isEmpty((jSONObject3.optString(str4))));
                                                                                            int i15 = 51588;
                                                                                            while (true) {
                                                                                                i15 ^= 51605;
                                                                                                switch (i15) {
                                                                                                    case 17:
                                                                                                        i15 = !z3 ? 51681 : 51650;
                                                                                                    case 54:
                                                                                                    case 87:
                                                                                                        break;
                                                                                                    case 116:
                                                                                                        (jSONArray.put(jSONObject3));
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    JSONArray jSONArray4 = (jSONObject.optJSONArray("vod_list"));
                                                                    int i16 = 51712;
                                                                    while (true) {
                                                                        i16 ^= 51729;
                                                                        switch (i16) {
                                                                            case 14:
                                                                            case 17:
                                                                                i16 = jSONArray4 == null ? 51805 : 51774;
                                                                            case 47:
                                                                                int i17 = 0;
                                                                                while (true) {
                                                                                    int i18 = (jSONArray4.length());
                                                                                    int i19 = 52611;
                                                                                    while (true) {
                                                                                        i19 ^= 52628;
                                                                                        switch (i19) {
                                                                                            case 23:
                                                                                                i19 = i17 < i18 ? 52704 : 52673;
                                                                                            case 54:
                                                                                            case 85:
                                                                                                break;
                                                                                            case 116:
                                                                                                int i20 = (jSONArray.length());
                                                                                                int i21 = 52735;
                                                                                                while (true) {
                                                                                                    i21 ^= 52752;
                                                                                                    switch (i21) {
                                                                                                        case 14:
                                                                                                        case 45:
                                                                                                            break;
                                                                                                        case 1007:
                                                                                                            i21 = i20 < 30 ? 53479 : 52797;
                                                                                                        case 7927:
                                                                                                            JSONObject jSONObject4 = m781(this, (jSONArray4.getJSONObject(i17)));
                                                                                                            boolean z4 = (TextUtils.isEmpty((jSONObject4.optString(str4))));
                                                                                                            int i22 = 53510;
                                                                                                            while (true) {
                                                                                                                i22 ^= 53527;
                                                                                                                switch (i22) {
                                                                                                                    case 17:
                                                                                                                        i22 = !z4 ? 53603 : 53572;
                                                                                                                    case 50:
                                                                                                                    case 83:
                                                                                                                        break;
                                                                                                                    case 116:
                                                                                                                        (jSONArray.put(jSONObject4));
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            i17++;
                                                                                                            int i23 = 53634;
                                                                                                            while (true) {
                                                                                                                i23 ^= 53651;
                                                                                                                switch (i23) {
                                                                                                                    case 17:
                                                                                                                        i23 = 53665;
                                                                                                                    case 50:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 76:
                                                                                int i24 = 51836;
                                                                                while (true) {
                                                                                    i24 ^= 51853;
                                                                                    switch (i24) {
                                                                                        case 241:
                                                                                            i24 = 52518;
                                                                                        case 1963:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    i8++;
                                                                    int i25 = 53758;
                                                                    while (true) {
                                                                        i25 ^= 53775;
                                                                        switch (i25) {
                                                                            case 1009:
                                                                                i25 = 54440;
                                                                            case 1703:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i10 = i8 < i9 ? 49883 : 49852;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 503:
                                                    i7 = jSONArray3 == null ? 49635 : 48953;
                                                case 32495:
                                                    int i26 = 49666;
                                                    while (true) {
                                                        i26 ^= 49683;
                                                        switch (i26) {
                                                            case 17:
                                                                i26 = 49697;
                                                            case 50:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        i4++;
                                        int i27 = 54533;
                                        while (true) {
                                            i27 ^= 54550;
                                            switch (i27) {
                                                case 19:
                                                    i27 = 54564;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i6 = i4 < i5 ? 48860 : 48829;
                                }
                            }
                        }
                        break;
                    case 47417:
                        return ((new JSONObject().put(str3,jSONArray)).toString());
                    case 47483:
                        break;
                }
                i3 = 48705;
            }
        } catch (Exception e) {
            m736(e);
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 472
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public void init(android.content.Context r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 2318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.init(android.content.Context, java.lang.String):void");
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = "UTF-8";
        String str4 = "";
        C0029.m1662();
        C0056.m2351(true);
        JSONObject jSONObject = new JSONObject();
        try {
            String[] strArr = (str2.split("@@@",-1));
            int length = strArr.length;
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (length < 4) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        HashMap hashMap = new HashMap();
                        (hashMap.put("vod_id",strArr[3]));
                        (hashMap.put("sig",str4));
                        (hashMap.put("nc_token",str4));
                        (hashMap.put("code",str4));
                        (hashMap.put("phone",str4));
                        (hashMap.put("session_id",str4));
                        (hashMap.put("cur_time",strArr[2]));
                        (hashMap.put("vod_token",strArr[1]));
                        (hashMap.put("collection_id",strArr[0]));
                        JSONObject jSONObject2 = m759(this, m782(this, m777(this)), hashMap, "result");
                        String str5 = m778(this, (jSONObject2.optString("vod_url")));
                        String str6 = (jSONObject2.optString("ck"));
                        boolean z = (TextUtils.isEmpty((jSONObject2.optString("check_url",(jSONObject2.optString("check_page_url"))))));
                        String str7 = "url";
                        String str8 = "parse";
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (!z) {
                                        break;
                                    } else {
                                        i2 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                if (str5 == null) {
                                                    break;
                                                } else {
                                                    i3 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                break;
                                            case 47417:
                                                boolean z2 = (str5.endsWith(".mp4"));
                                                int i4 = 48767;
                                                while (true) {
                                                    i4 ^= 48784;
                                                    switch (i4) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case 76:
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
                                                            break;
                                                        case 239:
                                                            if (!z2) {
                                                                break;
                                                            } else {
                                                                i4 = 48860;
                                                                continue;
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                    i4 = 48829;
                                                }
                                                break;
                                            case 47483:
                                                break;
                                        }
                                        i3 = 48705;
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    (sb.append(ProxyOrigin.getUrl()));
                                    (sb.append("?do=hmys&type=m3u8&url="));
                                    (sb.append(C0034.m1790((str5.getBytes(StandardCharsets.UTF_8)), 10)));
                                    (sb.append("&ck="));
                                    (sb.append(C0009.m260(str6, str3)));
                                    (sb.append("&sign="));
                                    (sb.append(C0009.m260(m742(this), str3)));
                                    String str9 = (sb.toString());
                                    (jSONObject.put(str8,0));
                                    (jSONObject.put(str7,str9));
                                    (jSONObject.put("playUrl",str4));
                                    JSONObject jSONObject3 = new JSONObject();
                                    (jSONObject3.put("User-Agent","Mozi"));
                                    (jSONObject3.put("Accept","*/*"));
                                    (jSONObject.put("header",(jSONObject3.toString())));
                                    (jSONObject.put("danmaku",C0033.m1778(str9)));
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
                            }
                            i2 = 1802;
                        }
                        (jSONObject.put(str8,0));
                        (jSONObject.put(str7,str4));
                        (jSONObject.put("msg","请退出播放页面，重新验证码"));
                        return (jSONObject.toString());
                    case 239:
                        StringBuilder sb2 = new StringBuilder();
                        (sb2.append("bad play id: "));
                        (sb2.append(str2));
                        throw new Exception((sb2.toString()));
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            m736(e);
        }
        return (jSONObject.toString());
    }

    public void regLogin() {
        String str;
        String str2;
        String str3;
        int i = 0;
        String str4 = "";
        try {
            HashMap hashMap = new HashMap();
            (hashMap.put("invited_by",str4));
            String str5 = "is_install";
            boolean z = m747(this);
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
                        str = "0";
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
                        str = "1";
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            (hashMap.put(str5,str));
            String str6 = "ua";
            StringBuilder sb = new StringBuilder();
            (sb.append("Mozilla/5.0 (Linux; Android 12; ");
            (sb.append(Build.MODEL));
            (sb.append(" Build/SKQ1.211113.001; wv)) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/97.0.4692.98 Mobile Safari/537.36"));
            (hashMap.put(str6,(sb.toString())));
            JSONObject jSONObject = m759(this, m784(this), hashMap, "result");
            JSONObject jSONObject2 = (jSONObject.optJSONObject("user_info"));
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        if (jSONObject2 == null) {
                            break;
                        } else {
                            i4 = 48736;
                            continue;
                        }
                    case 47384:
                        throw new Exception("no user_info");
                    case 47417:
                        int i5 = (jSONObject2.optInt("user_id",0));
                        int i6 = 48767;
                        while (true) {
                            i6 ^= 48784;
                            switch (i6) {
                                case 14:
                                    break;
                                case 45:
                                    throw new Exception("注册失败，用流量重试一次即可");
                                case 76:
                                    this.Nl = (jSONObject2.optString("token"));
                                    boolean z2 = m770(this);
                                    int i7 = 48891;
                                    while (true) {
                                        i7 ^= 48908;
                                        switch (i7) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                if (!z2) {
                                                    break;
                                                } else {
                                                    i7 = 49635;
                                                    continue;
                                                }
                                            case 32495:
                                                JSONObject jSONObject3 = (jSONObject.optJSONObject("sys_conf"));
                                                int i8 = 49666;
                                                while (true) {
                                                    i8 ^= 49683;
                                                    switch (i8) {
                                                        case 17:
                                                            if (jSONObject3 != null) {
                                                                break;
                                                            } else {
                                                                i8 = 49759;
                                                                continue;
                                                            }
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            int i9 = 49790;
                                                            while (true) {
                                                                i9 ^= 49807;
                                                                switch (i9) {
                                                                    case 18:
                                                                        str2 = str4;
                                                                        break;
                                                                    case 241:
                                                                        i9 = 49821;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 83:
                                                            str2 = (jSONObject3.optString("api_url"));
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i8 = 49728;
                                                }
                                                boolean z3 = (TextUtils.isEmpty(str2));
                                                int i10 = 49914;
                                                while (true) {
                                                    i10 ^= 49931;
                                                    switch (i10) {
                                                        case 497:
                                                            if (z3) {
                                                                break;
                                                            } else {
                                                                i10 = 50658;
                                                                continue;
                                                            }
                                                        case 1711:
                                                            break;
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            this.tF = m740(str2);
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i10 = 50627;
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i7 = 48953;
                                    }
                                    boolean z4 = (TextUtils.isEmpty(m744(this)));
                                    int i11 = 50689;
                                    while (true) {
                                        i11 ^= 50706;
                                        switch (i11) {
                                            case 19:
                                                if (!z4) {
                                                    break;
                                                } else {
                                                    i11 = 50782;
                                                    continue;
                                                }
                                            case 45:
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                boolean z5 = (m784(this).startsWith("http"));
                                                int i12 = 50813;
                                                while (true) {
                                                    i12 ^= 50830;
                                                    switch (i12) {
                                                        case 18:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 243:
                                                            if (!z5) {
                                                                break;
                                                            } else {
                                                                i12 = 51557;
                                                                continue;
                                                            }
                                                        case 4075:
                                                            int i13 = (m784(this).indexOf("/api/"));
                                                            int i14 = 51588;
                                                            while (true) {
                                                                i14 ^= 51605;
                                                                switch (i14) {
                                                                    case 17:
                                                                        if (i13 <= 0) {
                                                                            break;
                                                                        } else {
                                                                            i14 = 51681;
                                                                            continue;
                                                                        }
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        str3 = m784(this);
                                                                        break;
                                                                    case 116:
                                                                        str3 = (m784(this).substring(0,i13));
                                                                        int i15 = 51712;
                                                                        while (true) {
                                                                            i15 ^= 51729;
                                                                            switch (i15) {
                                                                                case 17:
                                                                                    i15 = 51743;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                i14 = 51650;
                                                            }
                                                            this.tF = m740(str3);
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i12 = 50875;
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i11 = 50751;
                                    }
                                    "HideHmys";
                                    StringBuilder sb2 = new StringBuilder();
                                    (sb2.append("user init ok tokenLen="));
                                    String str7 = m774(this);
                                    int i16 = 51836;
                                    while (true) {
                                        i16 ^= 51853;
                                        switch (i16) {
                                            case 241:
                                                if (str7 != null) {
                                                    break;
                                                } else {
                                                    i16 = 52580;
                                                    continue;
                                                }
                                            case 1963:
                                                break;
                                            case 1992:
                                                i = (str7.length());
                                                break;
                                            case 2025:
                                                int i17 = 52611;
                                                while (true) {
                                                    i17 ^= 52628;
                                                    switch (i17) {
                                                        case 23:
                                                            i17 = 52642;
                                                            break;
                                                        case 54:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i16 = 52549;
                                    }
                                    (sb2.append(i));
                                    (sb2.append(" api="));
                                    (sb2.append(m744(this)));
                                    (sb2.append(" v2="));
                                    (sb2.append(m747(this)));
                                    (sb2.toString());
                                    int i18 = 52735;
                                    while (true) {
                                        i18 ^= 52752;
                                        switch (i18) {
                                            case 14:
                                                break;
                                            case 1007:
                                                i18 = 52766;
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    if (i5 == 0) {
                                        break;
                                    } else {
                                        i6 = 48860;
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                            i6 = 48829;
                        }
                        break;
                    case 47483:
                        break;
                    default:
                        continue;
                }
                i4 = 48705;
            }
        } catch (Exception e) {
            (e.printStackTrace());
            m736(e);
        }
        int i19 = 938 ^ C0033.f91;
        int i20 = 53510;
        while (true) {
            i20 ^= 53527;
            switch (i20) {
                case 17:
                    
                        break;
                    
                case 50:
                    break;
                case 83:
                    return;
                case 116:
                    return;
            }
            i20 = 53572;
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            HashMap hashMap = new HashMap();
            (hashMap.put("pn","1"));
            (hashMap.put("kw",str));
            JSONArray jSONArray = m746(this, m782(this, m769(this)), hashMap);
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                int i2 = (jSONArray.length());
                int i3 = 1616;
                while (true) {
                    i3 ^= 1633;
                    switch (i3) {
                        case 14:
                        case 49:
                            i3 = i < i2 ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject = (jSONArray.getJSONObject(i));
                            String str2 = (jSONObject.optString("vod_name"));
                            boolean z2 = (TextUtils.isEmpty(str));
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = !z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        boolean z3 = (str2.contains(str));
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = !z3 ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    int i6 = 48767;
                                                    while (true) {
                                                        i6 ^= 48784;
                                                        switch (i6) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i6 = 48798;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                            boolean z4 = C0010.m289(str2);
                            int i7 = 48891;
                            while (true) {
                                i7 ^= 48908;
                                switch (i7) {
                                    case 22:
                                    case 53:
                                        JSONObject jSONObject2 = m781(this, jSONObject);
                                        boolean z5 = (TextUtils.isEmpty((jSONObject2.optString("vod_id"))));
                                        int i8 = 49790;
                                        while (true) {
                                            i8 ^= 49807;
                                            switch (i8) {
                                                case 18:
                                                case 51:
                                                    break;
                                                case 84:
                                                    (jSONArray2.put(jSONObject2));
                                                    break;
                                                case 241:
                                                    i8 = !z5 ? 49883 : 49852;
                                            }
                                        }
                                        break;
                                    case 503:
                                        i7 = z4 ? 49635 : 48953;
                                    case 32495:
                                        int i9 = 49666;
                                        while (true) {
                                            i9 ^= 49683;
                                            switch (i9) {
                                                case 17:
                                                    i9 = 49697;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            i++;
                            int i10 = 49914;
                            while (true) {
                                i10 ^= 49931;
                                switch (i10) {
                                    case 497:
                                        i10 = 50596;
                                    case 1711:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            return ((new JSONObject().put("list",jSONArray2)).toString());
                    }
                }
            }
        } catch (Exception e) {
            m736(e);
            return "";
        }
    }
}
