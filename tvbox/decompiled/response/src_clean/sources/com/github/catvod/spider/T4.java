package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class T4 extends Spider {

    private List<String> N;
    private String SN;
    private String t0;
    private List<String> tF;
    private String yq;
    private String zH;
    private String i = "index.php/vod/search/page/%s/wd/%s.html";
    private int Gc = 4;

    public T4() {
        String str = "";
        this.yq = str;
        this.SN = str;
        this.zH = str;
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

    private String N(String str, Boolean bool, HashMap hashMap) {
        String str2;
        String str3 = "search";
        String str4 = "验证码错误";
        String str5 = "code";
        String str6 = "";
        try {
            StringBuilder sb = new StringBuilder();
            (sb.append(m971(this)));
            (sb.append("index.php/verify"));
            JSONObject jSONObject = C0052.m2263((sb.toString()), hashMap);
            String str7 = (jSONObject.getString("cookie"));
            int i = ((jSONObject.getString(str5)).length());
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (i >= 4) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        boolean z = (bool.booleanValue());
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (!z) {
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
                                    m978(this, str, Boolean.FALSE, hashMap);
                                    break;
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
            String str8 = (jSONObject.getString(str5));
            HashMap hashMap2 = new HashMap();
            (hashMap2.put("verify",str8));
            (hashMap2.put("type",str3));
            HashMap hashMap3 = m976(this, str7);
            (hashMap3.put("x-requested-with","XMLHttpRequest"));
            (hashMap3.put("Referer",str));
            StringBuilder sb2 = new StringBuilder();
            (sb2.append(m971(this)));
            (sb2.append("index.php/ajax/verify_check?type=search&verify="));
            (sb2.append(str8));
            String str9 = C0035.m1824((sb2.toString()), hashMap2, hashMap3);
            boolean z2 = (str9.contains(str4));
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
                        break;
                    case 47417:
                        boolean z3 = (bool.booleanValue());
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    C0029.m1640(4000L);
                                    m978(this, str, Boolean.FALSE, hashMap);
                                    break;
                                case 239:
                                    if (!z3) {
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
            boolean z4 = (str9.contains(str4));
            int i6 = 48891;
            while (true) {
                i6 ^= 48908;
                switch (i6) {
                    case 22:
                        break;
                    case 53:
                        String str10 = C0011.m353(str, m976(this, str7), 0);
                        boolean z5 = (str10.contains("系统安全验证"));
                        int i7 = 49666;
                        while (true) {
                            i7 ^= 49683;
                            switch (i7) {
                                case 17:
                                    if (!z5) {
                                        break;
                                    } else {
                                        i7 = 49759;
                                        continue;
                                    }
                                case 50:
                                    break;
                                case 76:
                                    return str6;
                                case 83:
                                    boolean z6 = C0020.m1370(str7);
                                    int i8 = 49790;
                                    while (true) {
                                        i8 ^= 49807;
                                        switch (i8) {
                                            case 18:
                                                break;
                                            case 51:
                                                str2 = str7;
                                                break;
                                            case 84:
                                                str2 = m975(this);
                                                int i9 = 49914;
                                                while (true) {
                                                    i9 ^= 49931;
                                                    switch (i9) {
                                                        case 497:
                                                            i9 = 50596;
                                                            break;
                                                        case 1711:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 241:
                                                if (!z6) {
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
                                    this.zH = str2;
                                    String str11 = m971(this);
                                    boolean z7 = C0020.m1370(str7);
                                    int i10 = 50689;
                                    while (true) {
                                        i10 ^= 50706;
                                        switch (i10) {
                                            case 19:
                                                if (!z7) {
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
                                                str7 = m975(this);
                                                break;
                                            default:
                                                continue;
                                        }
                                        i10 = 50751;
                                    }
                                    C0002.m78(str11, str7);
                                    return str10;
                                default:
                                    continue;
                            }
                            i7 = 49728;
                        }
                        break;
                    case 503:
                        if (!z4) {
                            break;
                        } else {
                            i6 = 49635;
                            continue;
                        }
                    case 32495:
                        return str6;
                    default:
                        continue;
                }
                i6 = 48953;
            }
        } catch (Exception e) {
            (System.out.println(e));
            return str6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        r0 = r0 ^ 1757;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
        switch(r0) {
            case 17: goto L34;
            case 54: goto L35;
            default: goto L37;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
        r0 = 1771;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        (r1.put(r3,r7));
        r0 = 1740;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashMap<java.lang.String, java.lang.String> SN(java.lang.String r7) {
        /*
            r6 = this;
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = A4.i()
            short[] r2 = m970()
            r3 = 176(0xb0, float:2.47E-43)
            r4 = 10
            r5 = 1659(0x67b, float:2.325E-42)
            java.lang.String r2 = com.github.catvod.parser.C0004.m130(r2, r3, r4, r5)
            (r1.put(r2,r0))
            java.lang.String r0 = m975(r6)
            boolean r2 = com.github.catvod.spider.merge.C0020.m1370(r0)
            short[] r0 = m970()
            r3 = 186(0xba, float:2.6E-43)
            r4 = 6
            r5 = 3019(0xbcb, float:4.23E-42)
            java.lang.String r3 = com.github.catvod.spider.C0048.m2145(r0, r3, r4, r5)
            r0 = 1616(0x650, float:2.264E-42)
        L31:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L37;
                case 49: goto L3a;
                case 204: goto L3f;
                case 239: goto L51;
                default: goto L36;
            }
        L36:
            goto L31
        L37:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L31
        L3a:
            if (r2 != 0) goto L37
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L31
        L3f:
            java.lang.String r7 = m975(r6)
        L43:
            (r1.put(r3,r7))
            r0 = 1740(0x6cc, float:2.438E-42)
        L48:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L4e;
                case 54: goto L76;
                default: goto L4d;
            }
        L4d:
            goto L48
        L4e:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L48
        L51:
            boolean r2 = com.github.catvod.spider.merge.C0020.m1370(r7)
            r0 = 1864(0x748, float:2.612E-42)
        L57:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L5d;
                case 47384: goto L76;
                case 47417: goto L67;
                case 47483: goto L63;
                default: goto L5c;
            }
        L5c:
            goto L57
        L5d:
            if (r2 != 0) goto L63
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L57
        L63:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L57
        L67:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L6a:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L43;
                case 239: goto L72;
                default: goto L71;
            }
        L71:
            goto L6a
        L72:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L6a
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.T4.SN(java.lang.String):java.util.HashMap");
    }

    private HashMap<String, String> yq() {
        return m976(this, "");
    }

    /* renamed from: زﻉسﺥ  reason: contains not printable characters */
    public static String m967(Object obj) {
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
                    return ((T4) obj).t0;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: سﻁﻅخ  reason: contains not printable characters */
    public static ArrayList m968(Object obj) {
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
                    return ((T4) obj).N;
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

    /* renamed from: كوﻙﺥ  reason: contains not printable characters */
    public static String m969(Object obj) {
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
                    return ((T4) obj).yq;
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

    /* renamed from: يﻉغﻭ  reason: contains not printable characters */
    public static String m971(Object obj) {
        int i = (-703) ^ C0036.f94;
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
                    return ((T4) obj).SN;
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

    /* renamed from: ﺥﻕﻁﺝ  reason: contains not printable characters */
    public static String m972(Object obj) {
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
                    return ((T4) obj).i;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: ﺭنيو  reason: contains not printable characters */
    public static ArrayList m973(Object obj) {
        int i = (-703) ^ C0036.f94;
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
                    return ((T4) obj).tF;
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

    /* renamed from: ﺭﺱﺡﺏ  reason: contains not printable characters */
    public static void m974(Object obj) {
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

    /* renamed from: ﺱحطع  reason: contains not printable characters */
    public static String m975(Object obj) {
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
                    return ((T4) obj).zH;
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

    /* renamed from: ﺵﺡحﻉ  reason: contains not printable characters */
    public static HashMap m976(Object obj, Object obj2) {
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
                    return ((T4) obj).SN((String) obj2);
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

    /* renamed from: ﻕذﺹص  reason: contains not printable characters */
    public static int m977(Object obj) {
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
                    return ((T4) obj).Gc;
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

    /* renamed from: ﻝقﺱﺎ  reason: contains not printable characters */
    public static String m978(Object obj, Object obj2, Object obj3, Object obj4) {
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
                    return ((T4) obj).N((String) obj2, (Boolean) obj3, (HashMap) obj4);
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

    /* renamed from: ﻩﻅقل  reason: contains not printable characters */
    public static HashMap m979(Object obj) {
        int i = 812 ^ C0022.f80;
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
                    return ((T4) obj).yq();
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
        String str3 = "list";
        try {
            HashMap hashMap2 = new HashMap();
            (hashMap2.put("ac","detail"));
            (hashMap2.put("t",str));
            (hashMap2.put("pg",str2));
            JSONArray jSONArray = (new JSONObject(C0010.m310(m969(this), hashMap2, m979(this))).getJSONArray(str3));
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
                            String str4 = (jSONObject.getString("vod_name"));
                            boolean z2 = C0031.m1694(jSONObject, "vod_class", "伦理&三级&福利&色情&午夜&两性");
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
                                        boolean z3 = C0010.m289(str4);
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = z3 ? 48736 : 48705;
                                                case 47384:
                                                    (jSONArray2.put(jSONObject));
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
                            i++;
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
                        case 239:
                            JSONObject jSONObject2 = new JSONObject();
                            (jSONObject2.put("page",str2));
                            (jSONObject2.put("pagecount",Integer.MAX_VALUE));
                            (jSONObject2.put("limit",90));
                            (jSONObject2.put("total",Integer.MAX_VALUE));
                            (jSONObject2.put(str3,jSONArray2));
                            return (jSONObject2.toString());
                    }
                }
            }
        } catch (Exception e) {
            m974(e);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
        r6 = (r4.length());
        r0 = 1864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
        r0 = r0 ^ 1881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
        switch(r0) {
            case 17: goto L60;
            case 47384: goto L59;
            case 47417: goto L62;
            case 47483: goto L61;
            default: goto L64;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
        if (r2 >= r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
        r0 = 48736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
        r0 = 48705;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
        r0 = (r4.optJSONObject(r2));
        r6 = ((r0.optString(r3)).trim());
        r7 = ((r0.optString("vod_blurb")).trim());
        r8 = new java.lang.StringBuilder();
        (r8.append(r7));
        (r8.append(r6));
        (r0.put(r3,(r8.toString())));
        r2 = r2 + 1;
        r2 = 48767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
        r2 = r2 ^ 48784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e8, code lost:
        switch(r2) {
            case 14: goto L70;
            case 239: goto L71;
            default: goto L72;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ec, code lost:
        r2 = 48798;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.T4.detailContent(java.util.List):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 372
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String homeContent(boolean r15) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.T4.homeContent(boolean):java.lang.String");
    }

    public void init(Context context, String str) {
        String str2;
        int i;
        String str3 = "searchMode";
        String str4 = "rmCategories";
        String str5 = "categories";
        String str6 = "playUrl";
        String str7 = "type";
        try {
            boolean z = C0020.m1370(str);
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
                        String str8 = C0049.m2191(str);
                        boolean z2 = (str8.startsWith("{"));
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
                                    this.yq = str8;
                                    break;
                                case 500:
                                    JSONObject jSONObject = new JSONObject(str8);
                                    boolean z3 = (jSONObject.has(str7));
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
                                                break;
                                            case 47417:
                                                this.Gc = (jSONObject.getInt(str7));
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i4 = 48705;
                                    }
                                    boolean z4 = (jSONObject.has(str6));
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                this.t0 = (jSONObject.getString(str6));
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
                                    boolean z5 = (jSONObject.has(str5));
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
                                                JSONArray jSONArray = (jSONObject.getJSONArray(str5));
                                                this.N = new ArrayList();
                                                int i7 = 0;
                                                while (true) {
                                                    int i8 = (jSONArray.length());
                                                    int i9 = 49666;
                                                    while (true) {
                                                        i9 ^= 49683;
                                                        switch (i9) {
                                                            case 17:
                                                                i9 = i7 < i8 ? 49759 : 49728;
                                                            case 50:
                                                            case 76:
                                                                (m968(this).add((jSONArray.getString(i7))));
                                                                i7++;
                                                                int i10 = 49790;
                                                                while (true) {
                                                                    i10 ^= 49807;
                                                                    switch (i10) {
                                                                        case 18:
                                                                            break;
                                                                        case 241:
                                                                            i10 = 49821;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i6 = 48953;
                                    }
                                    boolean z6 = (jSONObject.has(str4));
                                    int i11 = 49914;
                                    while (true) {
                                        i11 ^= 49931;
                                        switch (i11) {
                                            case 497:
                                                if (!z6) {
                                                    break;
                                                } else {
                                                    i11 = 50658;
                                                    continue;
                                                }
                                            case 1711:
                                                break;
                                            case 1736:
                                                break;
                                            case 1769:
                                                JSONArray jSONArray2 = (jSONObject.getJSONArray(str4));
                                                this.tF = new ArrayList();
                                                int i12 = 0;
                                                while (true) {
                                                    int i13 = (jSONArray2.length());
                                                    int i14 = 50689;
                                                    while (true) {
                                                        i14 ^= 50706;
                                                        switch (i14) {
                                                            case 19:
                                                                i14 = i12 < i13 ? 50782 : 50751;
                                                            case 45:
                                                                break;
                                                            case 50:
                                                            case 76:
                                                                (m973(this).add((jSONArray2.getString(i12))));
                                                                i12++;
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
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i11 = 50627;
                                    }
                                    boolean z7 = (jSONObject.has(str3));
                                    int i16 = 51588;
                                    while (true) {
                                        i16 ^= 51605;
                                        switch (i16) {
                                            case 17:
                                                if (!z7) {
                                                    break;
                                                } else {
                                                    i16 = 51681;
                                                    continue;
                                                }
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                String str9 = (jSONObject.optString(str3));
                                                boolean z8 = C0020.m1370(str9);
                                                int i17 = 51712;
                                                while (true) {
                                                    i17 ^= 51729;
                                                    switch (i17) {
                                                        case 14:
                                                            break;
                                                        case 17:
                                                            if (z8) {
                                                                break;
                                                            } else {
                                                                i17 = 51805;
                                                                continue;
                                                            }
                                                        case 47:
                                                            break;
                                                        case 76:
                                                            StringBuilder sb = new StringBuilder();
                                                            (sb.append((str9.split("&"))[1]));
                                                            (sb.append(m972(this)));
                                                            this.i = (sb.toString());
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i17 = 51774;
                                                }
                                            default:
                                                continue;
                                        }
                                        i16 = 51650;
                                    }
                                    this.yq = (jSONObject.getString("siteUrl"));
                                    int i18 = 51836;
                                    while (true) {
                                        i18 ^= 51853;
                                        switch (i18) {
                                            case 241:
                                                i18 = 52518;
                                                break;
                                            case 1963:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                        try {
                            URL url = new URL(m972(this));
                            StringBuilder sb2 = new StringBuilder();
                            (sb2.append((url.getProtocol())));
                            (sb2.append("://"));
                            (sb2.append((url.getHost())));
                            (sb2.append("/"));
                            str2 = (sb2.toString());
                            i = 52611;
                        } catch (Exception e) {
                            str2 = null;
                        }
                        while (true) {
                            i ^= 52628;
                            switch (i) {
                                case 23:
                                    i = 52642;
                                    break;
                                case 54:
                                    this.SN = str2;
                                    this.zH = C0045.m2084(str2);
                                    int i19 = 52735;
                                    while (true) {
                                        i19 ^= 52752;
                                        switch (i19) {
                                            case 14:
                                                break;
                                            case 1007:
                                                i19 = 52766;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
        } catch (Exception e2) {
            m974(e2);
        }
        int i21 = 53510;
        while (true) {
            i21 ^= 53527;
            switch (i21) {
                case 17:
                    
                        break;
                    
                case 50:
                    break;
                case 83:
                    return;
                case 116:
                    return;
            }
            i21 = 53572;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        C0029.m1662();
        C0056.m2351(true);
        try {
            int i = m977(this);
            String str4 = ".m3u8";
            String str5 = "danmaku";
            String str6 = "url";
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (i != 4) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        HashMap hashMap = new HashMap();
                        (hashMap.put("play",str2));
                        (hashMap.put("flag",str));
                        str3 = C0010.m310(m969(this), hashMap, m979(this));
                        JSONObject jSONObject = new JSONObject(str3);
                        String str7 = (jSONObject.getString(str6));
                        boolean z = (str7.contains(str4));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (!z) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 500:
                                    (jSONObject.put(str6,C0009.m279(str7)));
                                    (jSONObject.put(str5,C0033.m1778(str7)));
                                    str3 = (jSONObject.toString());
                                case 471:
                                    return str3;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                    case 239:
                        String str8 = m967(this);
                        String str9 = "parse";
                        int i4 = 1864;
                        while (true) {
                            i4 ^= 1881;
                            switch (i4) {
                                case 17:
                                    if (str8 == null) {
                                        break;
                                    } else {
                                        i4 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    JSONObject jSONObject2 = new JSONObject();
                                    (jSONObject2.put(str9,0));
                                    boolean z2 = (str2.contains(str4));
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                                break;
                                            case 45:
                                                (jSONObject2.put(str6,str2));
                                                (jSONObject2.put(str5,C0033.m1778(str2)));
                                                str3 = (jSONObject2.toString());
                                            case 76:
                                                (jSONObject2.put(str6,C0009.m279(str2)));
                                                (jSONObject2.put(str5,C0033.m1778(str2)));
                                                str3 = (jSONObject2.toString());
                                            case 239:
                                                if (!z2) {
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
                                case 47417:
                                    StringBuilder sb = new StringBuilder();
                                    (sb.append(m967(this)));
                                    (sb.append(str2));
                                    String str10 = (new JSONObject(C0011.m353((sb.toString()), m979(this), 0)).getString(str6));
                                    JSONObject jSONObject3 = new JSONObject();
                                    (jSONObject3.put(str9,0));
                                    (jSONObject3.put(str6,str10));
                                    (jSONObject3.put(str5,C0033.m1778(str10)));
                                    str3 = (jSONObject3.toString());
                                case 47483:
                                    break;
                            }
                            i4 = 48705;
                        }
                        break;
                }
                i2 = 1678;
            }
            return str3;
        } catch (Exception e) {
            m974(e);
            return "";
        }
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
        boolean z2 = (m972(this).startsWith("http"));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z2) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return (this.searchContentApi(str,z,str2));
                case 239:
                    return (this.searchContentWeb(str,z,str2));
            }
            i = 1678;
        }
    }

    public String searchContentApi(String str, boolean z, String str2) {
        String str3 = "vod_name";
        String str4 = "list";
        try {
            HashMap hashMap = new HashMap();
            (hashMap.put("ac","detail"));
            (hashMap.put("wd",str));
            (hashMap.put("pg",str2));
            JSONArray jSONArray = (new JSONObject(C0010.m310(m969(this), hashMap, m979(this))).getJSONArray(str4));
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
                            boolean z2 = ((jSONObject.getString(str3)).contains(str));
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = !z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        String str5 = (jSONObject.getString(str3));
                                        boolean z3 = C0031.m1694(jSONObject, "vod_class", "伦理&三级&福利&色情&午夜&两性");
                                        int i5 = 48767;
                                        while (true) {
                                            i5 ^= 48784;
                                            switch (i5) {
                                                case 14:
                                                case 45:
                                                    break;
                                                case 76:
                                                    boolean z4 = C0010.m289(str5);
                                                    int i6 = 48891;
                                                    while (true) {
                                                        i6 ^= 48908;
                                                        switch (i6) {
                                                            case 22:
                                                            case 53:
                                                                (jSONArray2.put(jSONObject));
                                                                break;
                                                            case 503:
                                                                i6 = z4 ? 49635 : 48953;
                                                            case 32495:
                                                                int i7 = 49666;
                                                                while (true) {
                                                                    i7 ^= 49683;
                                                                    switch (i7) {
                                                                        case 17:
                                                                            i7 = 49697;
                                                                        case 50:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 239:
                                                    i5 = !z3 ? 48860 : 48829;
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
                            i++;
                            int i9 = 49790;
                            while (true) {
                                i9 ^= 49807;
                                switch (i9) {
                                    case 18:
                                        break;
                                    case 241:
                                        i9 = 49821;
                                }
                            }
                            break;
                        case 239:
                            JSONObject jSONObject2 = new JSONObject();
                            (jSONObject2.put(str4,jSONArray2));
                            return (jSONObject2.toString());
                    }
                }
            }
        } catch (Exception e) {
            m974(e);
            return "";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(5:3|4|5|123|121)|9|(5:10|11|14|133|130)|113|36|(5:37|38|40|173|171)|112|265) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d1, code lost:
        (System.out.println(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ac, code lost:
        (r8.append((java.lang.CharSequence) (r5.next())));
        r9 = (r5.hasNext());
        r0 = 50689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bc, code lost:
        r0 = r0 ^ 50706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c0, code lost:
        switch(r0) {
            case 19: goto L187;
            case 45: goto L186;
            case 50: goto L188;
            case 76: goto L189;
            default: goto L190;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c4, code lost:
        if (r9 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c6, code lost:
        r0 = 50782;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ca, code lost:
        r0 = 50751;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ce, code lost:
        (r8.append(r7));
        r0 = 50813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d4, code lost:
        r0 = r0 ^ 50830;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d8, code lost:
        switch(r0) {
            case 18: goto L197;
            case 243: goto L198;
            default: goto L199;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01dc, code lost:
        r0 = 50844;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0143 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String searchContentWeb(java.lang.String r13, boolean r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.T4.searchContentWeb(java.lang.String, boolean, java.lang.String):java.lang.String");
    }
}
