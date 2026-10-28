package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Libvio extends Pan {

    private String Dr;
    private String Zm;
    private String b;
    private JSONObject g1;
    private String O = "https://www.libvio.io/";
    private Pattern s = C0005.m166("/type/(\\d+).html");
    private Pattern n = C0005.m166("/show/(\\S+).html");
    private String un = "";

    public Libvio() {
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

    private static String B(Pattern pattern, String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (pattern != null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return str;
                case 239:
                    try {
                        Matcher matcher = (pattern.matcher(str));
                        boolean z = (matcher.find());
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
                                    return str;
                                case 500:
                                    return ((matcher.group(1)).trim());
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    } catch (Exception e) {
                        m849(e);
                        return str;
                    }
            }
            i = 1678;
        }
    }

    private String F5(String str) {
        String str2 = "";
        try {
            int i = (str.length());
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (i <= 200) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        StringBuilder sb = new StringBuilder();
                        (sb.append("solvePow body snippet="));
                        (sb.append((str.substring(0,200))));
                        m837((sb.toString()));
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            String str3 = m843(this, str, "TS");
            String str4 = m843(this, str, "SIG");
            String str5 = m843(this, str, "DIFF");
            boolean z = (str3.isEmpty());
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        if (z) {
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
                        boolean z2 = (str4.isEmpty());
                        int i4 = 1864;
                        while (true) {
                            i4 ^= 1881;
                            switch (i4) {
                                case 17:
                                    if (z2) {
                                        break;
                                    } else {
                                        i4 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    break;
                                case 47417:
                                    boolean z3 = (str5.isEmpty());
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                                break;
                                            case 45:
                                                MessageDigest messageDigest = C0027.m1581("SHA-256");
                                                byte[] bArr = (str4.getBytes(StandardCharsets.UTF_8));
                                                int i6 = 0;
                                                while (true) {
                                                    int i7 = 49666;
                                                    while (true) {
                                                        i7 ^= 49683;
                                                        switch (i7) {
                                                            case 17:
                                                                i7 = i6 < 1000000 ? 49759 : 49728;
                                                            case 50:
                                                            case 76:
                                                                (messageDigest.reset());
                                                                (messageDigest.update(bArr));
                                                                (messageDigest.update(((String.valueOf(i6)).getBytes(StandardCharsets.UTF_8))));
                                                                byte[] bArr2 = (messageDigest.digest());
                                                                StringBuilder sb2 = new StringBuilder();
                                                                int length = bArr2.length;
                                                                int i8 = 0;
                                                                while (true) {
                                                                    int i9 = 49790;
                                                                    while (true) {
                                                                        i9 ^= 49807;
                                                                        switch (i9) {
                                                                            case 18:
                                                                            case 51:
                                                                                boolean z4 = ((sb2.toString()).startsWith(str5));
                                                                                int i10 = 50689;
                                                                                while (true) {
                                                                                    i10 ^= 50706;
                                                                                    switch (i10) {
                                                                                        case 19:
                                                                                            i10 = z4 ? 50782 : 50751;
                                                                                        case 45:
                                                                                            i6++;
                                                                                            int i11 = 50813;
                                                                                            while (true) {
                                                                                                i11 ^= 50830;
                                                                                                switch (i11) {
                                                                                                    case 18:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i11 = 50844;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 50:
                                                                                        case 76:
                                                                                            return (String.valueOf(i6));
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 84:
                                                                                (sb2.append((String.format("%02x",new Object[]{C0025.m1530(bArr2[i8])}))));
                                                                                i8++;
                                                                                int i12 = 49914;
                                                                                while (true) {
                                                                                    i12 ^= 49931;
                                                                                    switch (i12) {
                                                                                        case 497:
                                                                                            i12 = 50596;
                                                                                        case 1711:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 241:
                                                                                i9 = i8 < length ? 49883 : 49852;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 76:
                                                int i13 = 48891;
                                                while (true) {
                                                    i13 ^= 48908;
                                                    switch (i13) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i13 = 48922;
                                                            break;
                                                    }
                                                }
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
            return str2;
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            (sb3.append("PoW error: "));
            (sb3.append(e));
            m837((sb3.toString()));
        }
        return str2;
    }

    private String G(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder();
        (sb.append("var "));
        (sb.append(str2));
        int i2 = (str.indexOf((sb.toString())));
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 >= 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    StringBuilder sb2 = new StringBuilder();
                    (sb2.append(str2));
                    (sb2.append(" ="));
                    i2 = (str.indexOf((sb2.toString())));
                    break;
                case 239:
                    break;
            }
            i3 = 1678;
        }
        int i4 = 1740;
        while (true) {
            i4 ^= 1757;
            switch (i4) {
                case 17:
                    if (i2 >= 0) {
                        break;
                    } else {
                        i4 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    break;
                case 500:
                    StringBuilder sb3 = new StringBuilder();
                    (sb3.append(str2));
                    (sb3.append("="));
                    i2 = (str.indexOf((sb3.toString())));
                    break;
            }
            i4 = 1802;
        }
        String str3 = "";
        int i5 = 1864;
        while (true) {
            i5 ^= 1881;
            switch (i5) {
                case 17:
                    if (i2 >= 0) {
                        break;
                    } else {
                        i5 = 48736;
                        continue;
                    }
                case 47384:
                    String str4 = "\"";
                    int i6 = (str.indexOf(str4,i2));
                    String str5 = "'";
                    int i7 = 48767;
                    while (true) {
                        i7 ^= 48784;
                        switch (i7) {
                            case 14:
                                break;
                            case 45:
                                i = i6;
                                break;
                            case 76:
                                i = (str.indexOf(str5,i2));
                                break;
                            case 239:
                                if (i6 >= 0) {
                                    break;
                                } else {
                                    i7 = 48860;
                                    continue;
                                }
                        }
                        i7 = 48829;
                    }
                    int i8 = 48891;
                    while (true) {
                        i8 ^= 48908;
                        switch (i8) {
                            case 22:
                                break;
                            case 53:
                                int i9 = i + 1;
                                int i10 = (str.indexOf(str4,i9));
                                int i11 = 49666;
                                while (true) {
                                    i11 ^= 49683;
                                    switch (i11) {
                                        case 17:
                                            if (i10 >= 0) {
                                                break;
                                            } else {
                                                i11 = 49759;
                                                continue;
                                            }
                                        case 50:
                                            break;
                                        case 76:
                                            i10 = (str.indexOf(str5,i9));
                                            break;
                                        case 83:
                                            break;
                                    }
                                    i11 = 49728;
                                }
                                int i12 = 49790;
                                while (true) {
                                    i12 ^= 49807;
                                    switch (i12) {
                                        case 18:
                                            break;
                                        case 51:
                                            return (str.substring(i9,i10));
                                        case 84:
                                            return str3;
                                        case 241:
                                            if (i10 >= 0) {
                                                break;
                                            } else {
                                                i12 = 49883;
                                                continue;
                                            }
                                    }
                                    i12 = 49852;
                                }
                                break;
                            case 503:
                                if (i >= 0) {
                                    break;
                                } else {
                                    i8 = 49635;
                                    continue;
                                }
                            case 32495:
                                return str3;
                        }
                        i8 = 48953;
                    }
                    break;
                case 47417:
                    return str3;
                case 47483:
                    break;
            }
            i5 = 48705;
        }
    }

    private String dT(String str) {
        String str2;
        String str3 = "";
        try {
            Response response = m842(str, m848(this, str));
            String str4 = m845(m840(response));
            boolean z = (str4.contains("正在验证您的浏览器"));
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
                        boolean z2 = (str4.contains("__cdn_pow"));
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
                                    m838(response);
                                    int i3 = 48767;
                                    while (true) {
                                        i3 ^= 48784;
                                        switch (i3) {
                                            case 14:
                                                return str4;
                                            case 239:
                                                i3 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                                case 500:
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
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            String str5 = m833(this, str4);
            m838(response);
            boolean z3 = C0020.m1370(str5);
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                        break;
                    case 53:
                        return str4;
                    case 503:
                        if (z3) {
                            break;
                        } else {
                            i5 = 49635;
                            continue;
                        }
                    case 32495:
                        String str6 = m843(this, str4, "TS");
                        String str7 = m843(this, str4, "SIG");
                        StringBuilder sb = new StringBuilder();
                        (sb.append("__cdn_pow="));
                        (sb.append(str6));
                        (sb.append("_auto_"));
                        (sb.append(str5));
                        (sb.append("_"));
                        (sb.append(str7));
                        String str8 = (sb.toString());
                        HashMap hashMap = m848(this, str);
                        (hashMap.put("Cookie",str8));
                        HashMap hashMap2 = new HashMap();
                        m838(m830(str, hashMap, hashMap2, 0));
                        Iterator it = ((List) (hashMap2.get("set-cookie")).iterator());
                        while (true) {
                            boolean z4 = (it.hasNext());
                            int i6 = 49666;
                            while (true) {
                                i6 ^= 49683;
                                switch (i6) {
                                    case 17:
                                        i6 = z4 ? 49759 : 49728;
                                    case 50:
                                    case 76:
                                        String str9 = (String) (it.next());
                                        boolean z5 = (str9.contains("__cdn_verified"));
                                        int i7 = 49790;
                                        while (true) {
                                            i7 ^= 49807;
                                            switch (i7) {
                                                case 18:
                                                case 51:
                                                    break;
                                                case 84:
                                                    int i8 = 49914;
                                                    while (true) {
                                                        i8 ^= 49931;
                                                        switch (i8) {
                                                            case 497:
                                                                i8 = 50596;
                                                                break;
                                                            case 1711:
                                                                str2 = str9;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 241:
                                                    i7 = z5 ? 49883 : 49852;
                                            }
                                        }
                                        break;
                                    case 83:
                                        str2 = str3;
                                        break;
                                }
                            }
                        }
                        boolean z6 = (str2.isEmpty());
                        int i9 = 50689;
                        while (true) {
                            i9 ^= 50706;
                            switch (i9) {
                                case 19:
                                    if (!z6) {
                                        break;
                                    } else {
                                        i9 = 50782;
                                        continue;
                                    }
                                case 45:
                                    this.un = str2;
                                    C0002.m78("libCk", str2);
                                    return C0001.m32(str, m848(this, str));
                                case 50:
                                    break;
                                case 76:
                                    return str3;
                                default:
                                    continue;
                            }
                            i9 = 50751;
                        }
                        break;
                    default:
                        continue;
                }
                i5 = 48953;
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            (sb2.append("safeRequest error: "));
            (sb2.append(e));
            m837((sb2.toString()));
            return str3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
        (r2.append(r3));
        r0 = r0 + 1;
        r1 = 49790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
        r1 = r1 ^ 49807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
        switch(r1) {
            case 18: goto L64;
            case 241: goto L105;
            default: goto L107;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
        r1 = 49821;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String q(java.lang.String r8) {
        /*
            r7 = this;
            boolean r1 = (r8.isEmpty())
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = ""
        L18:
            return r0
        L19:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = 0
        L1f:
            int r3 = (r8.length())
            r1 = 1740(0x6cc, float:2.438E-42)
        L25:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2b;
                case 54: goto L30;
                case 471: goto Lb9;
                case 500: goto L33;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            if (r0 >= r3) goto L30
            r1 = 1833(0x729, float:2.569E-42)
            goto L25
        L30:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L25
        L33:
            char r3 = (r8.charAt(r0))
            r1 = 1864(0x748, float:2.612E-42)
        L39:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L3f;
                case 47384: goto La5;
                case 47417: goto L4b;
                case 47483: goto L47;
                default: goto L3e;
            }
        L3e:
            goto L39
        L3f:
            r1 = 92
            if (r3 != r1) goto L47
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L39
        L47:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L39
        L4b:
            int r4 = r0 + 1
            int r5 = (r8.length())
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L54:
            r6 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r6
            switch(r1) {
                case 14: goto L5c;
                case 45: goto La5;
                case 76: goto L66;
                case 239: goto L60;
                default: goto L5b;
            }
        L5b:
            goto L54
        L5c:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L54
        L60:
            if (r4 >= r5) goto L5c
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L54
        L66:
            char r4 = (r8.charAt(r4))
            r1 = 48891(0xbefb, float:6.8511E-41)
        L6d:
            r5 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 22: goto L75;
                case 53: goto La5;
                case 503: goto L79;
                case 32495: goto L81;
                default: goto L74;
            }
        L74:
            goto L6d
        L75:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L6d
        L79:
            r1 = 117(0x75, float:1.64E-43)
            if (r4 != r1) goto L75
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L6d
        L81:
            int r1 = r0 + 6
            int r0 = r0 + 2
            java.lang.String r0 = (r8.substring(r0,r1))
            r3 = 16
            int r0 = (Integer.parseInt(r0,r3))
            char r0 = (char) r0
            (r2.append(r0))
            r0 = 49666(0xc202, float:6.9597E-41)
        L96:
            r3 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto L9e;
                case 50: goto La2;
                default: goto L9d;
            }
        L9d:
            goto L96
        L9e:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L96
        La2:
            r0 = r1
            goto L1f
        La5:
            (r2.append(r3))
            int r0 = r0 + 1
            r1 = 49790(0xc27e, float:6.977E-41)
        Lad:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 18: goto L1f;
                case 241: goto Lb5;
                default: goto Lb4;
            }
        Lb4:
            goto Lad
        Lb5:
            r1 = 49821(0xc29d, float:6.9814E-41)
            goto Lad
        Lb9:
            java.lang.String r0 = (r2.toString())
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Libvio.q(java.lang.String):java.lang.String");
    }

    /* renamed from: اﺹﻭو  reason: contains not printable characters */
    public static Pattern m828(Object obj) {
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
                    return ((Libvio) obj).n;
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

    /* renamed from: بﺯﺎع  reason: contains not printable characters */
    public static String m829(Object obj) {
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
                    return ((Libvio) obj).O;
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

    /* renamed from: تذعﻡ  reason: contains not printable characters */
    public static Response m830(Object obj, Object obj2, Object obj3, int i) {
        int i2 = 916 ^ C0002.f2;
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
                    return C0068Pe.v3((String) obj, (Map) obj2, (Map) obj3, i);
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

    /* renamed from: حﻭﺭف  reason: contains not printable characters */
    public static JSONObject m831(Object obj) {
        int i = 813 ^ C0033.f91;
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
                    return ((Libvio) obj).g1;
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

    /* renamed from: سكﺭا  reason: contains not printable characters */
    public static String m832(Object obj) {
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
                    return ((Libvio) obj).b;
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

    /* renamed from: سهشج  reason: contains not printable characters */
    public static String m833(Object obj, Object obj2) {
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
                    return ((Libvio) obj).F5((String) obj2);
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

    /* renamed from: سﺡور  reason: contains not printable characters */
    public static String m834(Object obj) {
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
                    return ((Libvio) obj).un;
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

    /* renamed from: غقفﻩ  reason: contains not printable characters */
    public static String m835(Object obj) {
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
                    return ((Libvio) obj).Dr;
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

    /* renamed from: غﺥثا  reason: contains not printable characters */
    public static void m837(Object obj) {
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
                    SpiderDebug.log((String) obj);
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
        int i4 = (-886) ^ C0021.f79;
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

    /* renamed from: وﻩثل  reason: contains not printable characters */
    public static void m838(Object obj) {
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
                    ((Response) obj).close();
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

    /* renamed from: ﺎﻙﻕط  reason: contains not printable characters */
    public static String m839(Object obj, Object obj2) {
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
                    return ((Libvio) obj).q((String) obj2);
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

    /* renamed from: ﺕوذﺏ  reason: contains not printable characters */
    public static ResponseBody m840(Object obj) {
        int i = 916 ^ C0002.f2;
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

    /* renamed from: ﺫﺵﺕﺏ  reason: contains not printable characters */
    public static String m841(Object obj, Object obj2) {
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
                    return B((Pattern) obj, (String) obj2);
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

    /* renamed from: ﺹﻭطﺥ  reason: contains not printable characters */
    public static Response m842(Object obj, Object obj2) {
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
                    return C0068Pe.Gc((String) obj, (Map) obj2);
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

    /* renamed from: ﻅﻭﺽر  reason: contains not printable characters */
    public static String m843(Object obj, Object obj2, Object obj3) {
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
                    return ((Libvio) obj).G((String) obj2, (String) obj3);
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

    /* renamed from: ﻍظمع  reason: contains not printable characters */
    public static String m844(Object obj, Object obj2) {
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
                    return ((Libvio) obj).dT((String) obj2);
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

    /* renamed from: ﻍﺫشس  reason: contains not printable characters */
    public static String m845(Object obj) {
        int i = (-604) ^ C0013.f13;
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
                    return ((ResponseBody) obj).string();
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

    /* renamed from: ﻍﺱوﺡ  reason: contains not printable characters */
    public static String m846(Object obj) {
        int i = 596 ^ C0009.f9;
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
                    return ((Libvio) obj).Zm;
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

    /* renamed from: ﻭثﻡت  reason: contains not printable characters */
    public static Pattern m847(Object obj) {
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
                    return ((Libvio) obj).s;
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

    /* renamed from: ﻭوﺡم  reason: contains not printable characters */
    public static HashMap m848(Object obj, Object obj2) {
        int i = (-4) ^ C0029.f87;
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
                    return ((Libvio) obj).G4((String) obj2);
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

    /* renamed from: ﻭﻉﺥا  reason: contains not printable characters */
    public static void m849(Object obj) {
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

    protected final HashMap<String, String> G4(String str) {
        String str2;
        Rc.yq;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArr = ("accept\ntext/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7\naccept-language\nzh-CN,zh;q=0.9,en;q=0.8\npriority\nu=0, i\nsec-ch-ua\n\"Not=A?Brand\";v=\"99\", \"Google Chrome\";v=\"151\", \"Chromium\";v=\"151\"\nsec-ch-ua-mobile\n?0\nsec-ch-ua-platform\n\"Windows\"\nsec-fetch-dest\ndocument\nsec-fetch-mode\nnavigate\nsec-fetch-site\nnone\nsec-fetch-user\n?1\nupgrade-insecure-requests\n1\nuser-agent\nMozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36".split("\\r?\\n"));
        int length = strArr.length;
        int i = 0;
        String str3 = null;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < length ? 1709 : 1678;
                    case 204:
                        String str4 = strArr[i];
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = str4 == null ? 1833 : 1802;
                                case 54:
                                case 471:
                                    str2 = (str4.trim());
                                    break;
                                case 500:
                                    str2 = "";
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        boolean z = (str2.isEmpty());
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                case 45:
                                    int i6 = 49666;
                                    while (true) {
                                        i6 ^= 49683;
                                        switch (i6) {
                                            case 17:
                                                i6 = str3 == null ? 49759 : 49728;
                                            case 50:
                                            case 76:
                                                int i7 = 49790;
                                                while (true) {
                                                    i7 ^= 49807;
                                                    switch (i7) {
                                                        case 18:
                                                            str3 = str2;
                                                            break;
                                                        case 241:
                                                            i7 = 49821;
                                                    }
                                                }
                                                break;
                                            case 83:
                                                (linkedHashMap.put(str3,str2));
                                                str3 = null;
                                                break;
                                        }
                                    }
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
                                    i5 = z ? 48860 : 48829;
                            }
                        }
                        i++;
                        int i9 = 49914;
                        while (true) {
                            i9 ^= 49931;
                            switch (i9) {
                                case 497:
                                    i9 = 50596;
                                case 1711:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        boolean z2 = (str.isEmpty());
                        int i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    if (z2) {
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
                                    (linkedHashMap.put("Referer",str));
                                    break;
                            }
                            i10 = 50751;
                        }
                        boolean z3 = C0020.m1370(m834(this));
                        int i11 = 50813;
                        while (true) {
                            i11 ^= 50830;
                            switch (i11) {
                                case 18:
                                    break;
                                case 53:
                                    break;
                                case 243:
                                    if (z3) {
                                        break;
                                    } else {
                                        i11 = 51557;
                                        continue;
                                    }
                                case 4075:
                                    (linkedHashMap.put("Cookie",m834(this)));
                                    break;
                            }
                            i11 = 50875;
                        }
                        return linkedHashMap;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 360
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String categoryContent(java.lang.String r19, java.lang.String r20, boolean r21, java.util.HashMap<java.lang.String, java.lang.String> r22) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Libvio.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 381
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // com.github.catvod.spider.Pan
    public java.lang.String detailContent(java.util.List<java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 2170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Libvio.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        kB kBVar;
        JSONArray jSONArray;
        String str = "a";
        try {
            Va va = C0040.m1964(m844(this, m829(this)));
            kB kBVar2 = (va.cS("ul.stui-header__menu li a"));
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = (kBVar2.iterator());
            while (true) {
                boolean z2 = (it.hasNext());
                String str2 = "href";
                int i = 0;
                boolean z3 = false;
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = z2 ? 1709 : 1678;
                        case 204:
                            hN hNVar = (hN) (it.next());
                            String str3 = (hNVar.Fo());
                            boolean z4 = (str3.equals("电影"));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = !z4 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        boolean z5 = (str3.equals("剧集"));
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = !z5 ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    boolean z6 = (str3.equals("番剧"));
                                                    int i5 = 48767;
                                                    while (true) {
                                                        i5 ^= 48784;
                                                        switch (i5) {
                                                            case 14:
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                boolean z7 = (str3.equals("日韩"));
                                                                int i6 = 48891;
                                                                while (true) {
                                                                    i6 ^= 48908;
                                                                    switch (i6) {
                                                                        case 22:
                                                                        case 53:
                                                                            break;
                                                                        case 503:
                                                                            i6 = !z7 ? 49635 : 48953;
                                                                        case 32495:
                                                                            boolean z8 = (str3.equals("欧美"));
                                                                            int i7 = 49666;
                                                                            while (true) {
                                                                                i7 ^= 49683;
                                                                                switch (i7) {
                                                                                    case 17:
                                                                                        i7 = z8 ? 49759 : 49728;
                                                                                    case 50:
                                                                                    case 76:
                                                                                        break;
                                                                                    case 83:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                i5 = !z6 ? 48860 : 48829;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                            z3 = true;
                            int i8 = 49790;
                            while (true) {
                                i8 ^= 49807;
                                switch (i8) {
                                    case 18:
                                    case 51:
                                        break;
                                    case 84:
                                        Matcher matcher = (m847(this).matcher((hNVar.N(str2))));
                                        boolean z9 = (matcher.find());
                                        int i9 = 49914;
                                        while (true) {
                                            i9 ^= 49931;
                                            switch (i9) {
                                                case 497:
                                                    i9 = !z9 ? 50658 : 50627;
                                                case 1711:
                                                case 1736:
                                                    String str4 = ((matcher.group(1)).trim());
                                                    JSONObject jSONObject = new JSONObject();
                                                    (jSONObject.put("type_id",str4));
                                                    (jSONObject.put("type_name",str3));
                                                    (jSONArray2.put(jSONObject));
                                                    int i10 = 50813;
                                                    while (true) {
                                                        i10 ^= 50830;
                                                        switch (i10) {
                                                            case 18:
                                                                continue;
                                                            case 243:
                                                                i10 = 50844;
                                                        }
                                                    }
                                                    break;
                                                case 1769:
                                                    int i11 = 50689;
                                                    while (true) {
                                                        i11 ^= 50706;
                                                        switch (i11) {
                                                            case 19:
                                                                i11 = 50720;
                                                            case 50:
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 241:
                                        i8 = z3 ? 49883 : 49852;
                                }
                            }
                            break;
                        case 239:
                            JSONObject jSONObject2 = new JSONObject();
                            int i12 = 51588;
                            while (true) {
                                i12 ^= 51605;
                                switch (i12) {
                                    case 17:
                                        if (!z) {
                                            break;
                                        } else {
                                            i12 = 51681;
                                            continue;
                                        }
                                    case 54:
                                        break;
                                    case 87:
                                        break;
                                    case 116:
                                        (jSONObject2.put("filters",m831(this)));
                                        break;
                                    default:
                                        continue;
                                }
                                i12 = 51650;
                            }
                            (jSONObject2.put("class",jSONArray2));
                            try {
                                kBVar = ((hN) ((va.cS("ul.stui-vodlist")).get(0)).cS("div.stui-vodlist__box"));
                                jSONArray = new JSONArray();
                            } catch (Exception e) {
                                m849(e);
                            }
                            while (true) {
                                int i13 = (kBVar.size());
                                int i14 = 51712;
                                while (true) {
                                    i14 ^= 51729;
                                    switch (i14) {
                                        case 14:
                                        case 17:
                                            i14 = i < i13 ? 51805 : 51774;
                                        case 47:
                                            (jSONObject2.put("list",jSONArray));
                                            int i15 = 52611;
                                            while (true) {
                                                i15 ^= 52628;
                                                switch (i15) {
                                                    case 23:
                                                        i15 = 52642;
                                                        break;
                                                    case 54:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 76:
                                            hN hNVar2 = (hN) (kBVar.get(i));
                                            String str5 = ((hNVar2.cS(str)).yq("title"));
                                            String str6 = ((hNVar2.cS(str)).yq("data-original"));
                                            String str7 = ((hNVar2.cS("a .pic-text")).t0());
                                            String str8 = ((hNVar2.cS(str)).yq(str2));
                                            JSONObject jSONObject3 = new JSONObject();
                                            String str9 = "vod_id";
                                            StringBuilder sb = new StringBuilder();
                                            (sb.append(m829(this)));
                                            (sb.append(str8));
                                            (jSONObject3.put(str9,(sb.toString())));
                                            (jSONObject3.put("vod_name",str5));
                                            (jSONObject3.put("vod_pic",str6));
                                            (jSONObject3.put("vod_remarks",str7));
                                            (jSONArray.put(jSONObject3));
                                            i++;
                                            int i16 = 51836;
                                            while (true) {
                                                i16 ^= 51853;
                                                switch (i16) {
                                                    case 241:
                                                        i16 = 52518;
                                                    case 1963:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                return (jSONObject2.toString());
                            }
                    }
                }
            }
        } catch (Exception e2) {
            m849(e2);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        super.init(context, str);
        try {
            boolean z = C0020.m1370(str);
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
                        String str2 = (new JSONObject(str).optString("siteUrl"));
                        boolean z2 = C0020.m1370(str2);
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
                                    break;
                                case 500:
                                    this.O = str2;
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            StringBuilder sb = new StringBuilder();
            (sb.append(m829(this)));
            (sb.append("vid/yd.php?url="));
            this.b = (sb.toString());
            StringBuilder sb2 = new StringBuilder();
            (sb2.append(m829(this)));
            (sb2.append("vid/plyr/vr2.php?url="));
            this.Zm = (sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            (sb3.append(m829(this)));
            (sb3.append("vid/ty4.php?url="));
            this.Dr = (sb3.toString());
            this.un = C0045.m2084("libCk");
            this.g1 = new JSONObject(C0011.m327());
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = 48674;
                        break;
                    case 47483:
                        return;
                }
            }
        } catch (JSONException e) {
            (System.out.println(e));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 475
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // com.github.catvod.spider.Pan
    public java.lang.String playerContent(java.lang.String r23, java.lang.String r24, java.util.List<java.lang.String> r25) {
        /*
            Method dump skipped, instructions count: 2688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Libvio.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        int i;
        String str2 = "";
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
                    return str2;
                case 239:
                    try {
                        long j = System.currentTimeMillis();
                        StringBuilder sb = new StringBuilder();
                        (sb.append(m829(this)));
                        (sb.append("index.php/ajax/suggest?mid=1&wd="));
                        (sb.append(C0010.m314(str)));
                        (sb.append("&limit=10&timestamp="));
                        (sb.append(j));
                        JSONObject jSONObject = new JSONObject(m844(this, (sb.toString())));
                        JSONObject jSONObject2 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        int i3 = (jSONObject.getInt("total"));
                        String str3 = "list";
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    if (i3 <= 0) {
                                        break;
                                    } else {
                                        i4 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    JSONArray jSONArray2 = new JSONArray((jSONObject.getString(str3)));
                                    int i5 = 0;
                                    while (true) {
                                        int i6 = i5;
                                        int i7 = (jSONArray2.length());
                                        int i8 = 1864;
                                        while (true) {
                                            i8 ^= 1881;
                                            switch (i8) {
                                                case 17:
                                                    i8 = i6 < i7 ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    JSONObject jSONObject3 = (jSONArray2.getJSONObject(i6));
                                                    StringBuilder sb2 = new StringBuilder();
                                                    (sb2.append((m829(this).concat("/detail/"))));
                                                    (sb2.append((jSONObject3.getString("id"))));
                                                    (sb2.append(".html"));
                                                    String str4 = (sb2.toString());
                                                    String str5 = (jSONObject3.getString("name"));
                                                    String str6 = (jSONObject3.getString("pic"));
                                                    try {
                                                        JSONObject jSONObject4 = new JSONObject();
                                                        (jSONObject4.put("vod_id",str4));
                                                        (jSONObject4.put("vod_name",str5));
                                                        (jSONObject4.put("vod_pic",str6));
                                                        (jSONObject4.put("vod_remarks",str2));
                                                        (jSONArray.put(jSONObject4));
                                                        i = 48767;
                                                    } catch (Exception e) {
                                                        m849(e);
                                                    }
                                                    while (true) {
                                                        i ^= 48784;
                                                        switch (i) {
                                                            case 14:
                                                                i5 = i6 + 1;
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
                                                                i = 48798;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                    }
                                    break;
                            }
                            i4 = 1802;
                        }
                        (jSONObject2.put(str3,jSONArray));
                        return (jSONObject2.toString());
                    } catch (Exception e2) {
                        m849(e2);
                        return str2;
                    }
            }
            i2 = 1678;
        }
    }
}
