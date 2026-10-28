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

        return;
    }

    private static String B(Pattern pattern, String str) {

        if (pattern != null) {
            try {
                Matcher matcher = (pattern.matcher(str));
                boolean z = (matcher.find());
                if (!z) {
                    return str;
                } else {
                    return ((matcher.group(1)).trim());
                }
            } catch (Exception e) {
                m849(e);
                return str;
            }
        } else {
            return str;
        }
    }

    private String F5(String str) {
        String str2 = "";
        try {
            int i = (str.length());

            if (!(i <= 200)) {
                StringBuilder sb = new StringBuilder();
                sb.append("solvePow body snippet=");
                sb.append((str.substring(0,200)));
                m837((sb.toString()));
            }
            String str3 = m843(this, str, "TS");
            String str4 = m843(this, str, "SIG");
            String str5 = m843(this, str, "DIFF");
            boolean z = (str3.isEmpty());

            if (!(z)) {
                boolean z2 = (str4.isEmpty());
                if (!(z2)) {
                    boolean z3 = (str5.isEmpty());
                    if (!z3) {
                        MessageDigest messageDigest = C0027.m1581("SHA-256");
                        byte[] bArr = (str4.getBytes(StandardCharsets.UTF_8));
                        int i6 = 0;
                        while (true) {
                            if (i6 < 1000000) {
                                messageDigest.reset();
                                messageDigest.update(bArr);
                                messageDigest.update(((String.valueOf(i6)).getBytes(StandardCharsets.UTF_8)));
                                byte[] bArr2 = (messageDigest.digest());
                                StringBuilder sb2 = new StringBuilder();
                                int length = bArr2.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < length) {
                                        sb2.append((String.format("%02x",new Object[]{C0025.m1530(bArr2[i8])})));
                                        i8++;
                                    } else {
                                        boolean z4 = ((sb2.toString()).startsWith(str5));
                                        if (z4) {
                                            return (String.valueOf(i6));
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        MessageDigest messageDigest = C0027.m1581("SHA-256");
                        byte[] bArr = (str4.getBytes(StandardCharsets.UTF_8));
                        int i6 = 0;
                        while (true) {
                            if (i6 < 1000000) {
                                messageDigest.reset();
                                messageDigest.update(bArr);
                                messageDigest.update(((String.valueOf(i6)).getBytes(StandardCharsets.UTF_8)));
                                byte[] bArr2 = (messageDigest.digest());
                                StringBuilder sb2 = new StringBuilder();
                                int length = bArr2.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < length) {
                                        sb2.append((String.format("%02x",new Object[]{C0025.m1530(bArr2[i8])})));
                                        i8++;
                                    } else {
                                        boolean z4 = ((sb2.toString()).startsWith(str5));
                                        if (z4) {
                                            return (String.valueOf(i6));
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return str2;
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("PoW error: ");
            sb3.append(e);
            m837((sb3.toString()));
        }
        return str2;
    }

    private String G(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("var ");
        sb.append(str2);
        int i2 = (str.indexOf((sb.toString())));

        if (!(i2 >= 0)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" =");
            i2 = (str.indexOf((sb2.toString())));
        }

        if (!(i2 >= 0)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append("=");
            i2 = (str.indexOf((sb3.toString())));
        }
        String str3 = "";

        if (i2 >= 0) {
            String str4 = "\"";
            int i6 = (str.indexOf(str4,i2));
            String str5 = "'";
            if (i6 >= 0) {
                i = i6;
            } else {
                i = (str.indexOf(str5,i2));
                i = i6;
            }
            if (i >= 0) {
                int i9 = i + 1;
                int i10 = (str.indexOf(str4,i9));
                if (!(i10 >= 0)) {
                    i10 = (str.indexOf(str5,i9));
                }
                if (i10 >= 0) {
                    return (str.substring(i9,i10));
                } else {
                    return str3;
                }
            } else {
                return str3;
            }
        } else {
            return str3;
        }
    }

    private String dT(String str) {
        String str2;
        String str3 = "";
        try {
            Response response = m842(str, m848(this, str));
            String str4 = m845(m840(response));
            boolean z = (str4.contains("正在验证您的浏览器"));

            if (!(z)) {
                boolean z2 = (str4.contains("__cdn_pow"));
                if (!z2) {
                    m838(response);
                    return str4;
                } else {
                    m838(response);
                    return str4;
                }
            }
            String str5 = m833(this, str4);
            m838(response);
            boolean z3 = C0020.m1370(str5);

            if (z3) {
                return str4;
            } else {
                String str6 = m843(this, str4, "TS");
                String str7 = m843(this, str4, "SIG");
                StringBuilder sb = new StringBuilder();
                sb.append("__cdn_pow=");
                sb.append(str6);
                sb.append("_auto_");
                sb.append(str5);
                sb.append("_");
                sb.append(str7);
                String str8 = (sb.toString());
                HashMap hashMap = m848(this, str);
                hashMap.put("Cookie",str8);
                HashMap hashMap2 = new HashMap();
                m838(m830(str, hashMap, hashMap2, 0));
                Iterator it = ((List) (hashMap2.get("set-cookie")).iterator());
                while (true) {
                    boolean z4 = (it.hasNext());
                    if (z4) {
                        String str9 = (String) (it.next());
                        boolean z5 = (str9.contains("__cdn_verified"));
                        if (z5) {
                            str2 = str9;
                        }
                    } else {
                        str2 = str3;
                    }
                }
                boolean z6 = (str2.isEmpty());
                if (!z6) {
                    this.un = str2;
                    C0002.m78("libCk", str2);
                    return C0001.m32(str, m848(this, str));
                } else {
                    return str3;
                }
                return str4;
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("safeRequest error: ");
            sb2.append(e);
            m837((sb2.toString()));
            return str3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    r2.append(r3);
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

        return ((Libvio) obj).n;
    }

    /* renamed from: بﺯﺎع  reason: contains not printable characters */
    public static String m829(Object obj) {
        int i = 938 ^ C0033.f91;

        return ((Libvio) obj).O;
    }

    /* renamed from: تذعﻡ  reason: contains not printable characters */
    public static Response m830(Object obj, Object obj2, Object obj3, int i) {
        int i2 = 916 ^ C0002.f2;

        return C0068Pe.v3((String) obj, (Map) obj2, (Map) obj3, i);
    }

    /* renamed from: حﻭﺭف  reason: contains not printable characters */
    public static JSONObject m831(Object obj) {
        int i = 813 ^ C0033.f91;

        return ((Libvio) obj).g1;
    }

    /* renamed from: سكﺭا  reason: contains not printable characters */
    public static String m832(Object obj) {
        int i = 57 ^ C0032.f90;

        return ((Libvio) obj).b;
    }

    /* renamed from: سهشج  reason: contains not printable characters */
    public static String m833(Object obj, Object obj2) {
        int i = (-767) ^ C0037.f95;

        return ((Libvio) obj).F5((String) obj2);
    }

    /* renamed from: سﺡور  reason: contains not printable characters */
    public static String m834(Object obj) {
        int i = 515 ^ C0028.f86;

        return ((Libvio) obj).un;
    }

    /* renamed from: غقفﻩ  reason: contains not printable characters */
    public static String m835(Object obj) {
        int i = 753 ^ C0000.f0;

        return ((Libvio) obj).Dr;
    }

    /* renamed from: غﺥثا  reason: contains not printable characters */
    public static void m837(Object obj) {
        int i = (-824) ^ C0004.f4;

        SpiderDebug.log((String) obj);

        return;
    }

    /* renamed from: وﻩثل  reason: contains not printable characters */
    public static void m838(Object obj) {
        int i = (-448) ^ C0025.f83;

        ((Response) obj).close();
        return;
    }

    /* renamed from: ﺎﻙﻕط  reason: contains not printable characters */
    public static String m839(Object obj, Object obj2) {
        int i = 515 ^ C0028.f86;

        return ((Libvio) obj).q((String) obj2);
    }

    /* renamed from: ﺕوذﺏ  reason: contains not printable characters */
    public static ResponseBody m840(Object obj) {
        int i = 916 ^ C0002.f2;

        return ((Response) obj).body();
    }

    /* renamed from: ﺫﺵﺕﺏ  reason: contains not printable characters */
    public static String m841(Object obj, Object obj2) {
        int i = 293 ^ C0009.f9;

        return B((Pattern) obj, (String) obj2);
    }

    /* renamed from: ﺹﻭطﺥ  reason: contains not printable characters */
    public static Response m842(Object obj, Object obj2) {
        int i = 515 ^ C0028.f86;

        return C0068Pe.Gc((String) obj, (Map) obj2);
    }

    /* renamed from: ﻅﻭﺽر  reason: contains not printable characters */
    public static String m843(Object obj, Object obj2, Object obj3) {
        int i = (-703) ^ C0036.f94;

        return ((Libvio) obj).G((String) obj2, (String) obj3);
    }

    /* renamed from: ﻍظمع  reason: contains not printable characters */
    public static String m844(Object obj, Object obj2) {
        int i = 706 ^ C0003.f3;

        return ((Libvio) obj).dT((String) obj2);
    }

    /* renamed from: ﻍﺫشس  reason: contains not printable characters */
    public static String m845(Object obj) {
        int i = (-604) ^ C0013.f13;

        return ((ResponseBody) obj).string();
    }

    /* renamed from: ﻍﺱوﺡ  reason: contains not printable characters */
    public static String m846(Object obj) {
        int i = 596 ^ C0009.f9;

        return ((Libvio) obj).Zm;
    }

    /* renamed from: ﻭثﻡت  reason: contains not printable characters */
    public static Pattern m847(Object obj) {
        int i = 658 ^ C0029.f87;

        return ((Libvio) obj).s;
    }

    /* renamed from: ﻭوﺡم  reason: contains not printable characters */
    public static HashMap m848(Object obj, Object obj2) {
        int i = (-4) ^ C0029.f87;

        return ((Libvio) obj).G4((String) obj2);
    }

    /* renamed from: ﻭﻉﺥا  reason: contains not printable characters */
    public static void m849(Object obj) {
        int i = 909 ^ C0002.f2;

        SpiderDebug.log((Throwable) obj);
        return;
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

            if (i < length) {
                String str4 = strArr[i];
                if (str4 == null) {
                    str2 = "";
                } else {
                    str2 = (str4.trim());
                }
                boolean z = (str2.isEmpty());
                if (!(z)) {
                    if (str3 == null) {
                        str3 = str2;
                    } else {
                        linkedHashMap.put(str3,str2);
                        str3 = null;
                    }
                }
                i++;
            } else {
                boolean z2 = (str.isEmpty());
                if (!(z2)) {
                    linkedHashMap.put("Referer",str);
                }
                boolean z3 = C0020.m1370(m834(this));
                if (!(z3)) {
                    linkedHashMap.put("Cookie",m834(this));
                }
                return linkedHashMap;
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

                if (z2) {
                    hN hNVar = (hN) (it.next());
                    String str3 = (hNVar.Fo());
                    boolean z4 = (str3.equals("电影"));
                    if (!z4) {
                        boolean z5 = (str3.equals("剧集"));
                        if (!z5) {
                            boolean z6 = (str3.equals("番剧"));
                            if (!z6) {
                                boolean z7 = (str3.equals("日韩"));
                                if (!z7) {
                                    boolean z8 = (str3.equals("欧美"));
                                }
                            }
                        }
                    }
                    z3 = true;
                    if (z3) {
                        Matcher matcher = (m847(this).matcher((hNVar.N(str2))));
                        boolean z9 = (matcher.find());
                        if (z9) {
                            String str4 = ((matcher.group(1)).trim());
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("type_id",str4);
                            jSONObject.put("type_name",str3);
                            jSONArray2.put(jSONObject);
                        }
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    if (z) {
                        jSONObject2.put("filters",m831(this));
                    }
                    jSONObject2.put("class",jSONArray2);
                    try {
                        kBVar = ((hN) ((va.cS("ul.stui-vodlist")).get(0)).cS("div.stui-vodlist__box"));
                        jSONArray = new JSONArray();
                    } catch (Exception e) {
                        m849(e);
                    }
                    while (true) {
                        int i13 = (kBVar.size());
                        if (i < i13) {
                            hN hNVar2 = (hN) (kBVar.get(i));
                            String str5 = ((hNVar2.cS(str)).yq("title"));
                            String str6 = ((hNVar2.cS(str)).yq("data-original"));
                            String str7 = ((hNVar2.cS("a .pic-text")).t0());
                            String str8 = ((hNVar2.cS(str)).yq(str2));
                            JSONObject jSONObject3 = new JSONObject();
                            String str9 = "vod_id";
                            StringBuilder sb = new StringBuilder();
                            sb.append(m829(this));
                            sb.append(str8);
                            jSONObject3.put(str9,(sb.toString()));
                            jSONObject3.put("vod_name",str5);
                            jSONObject3.put("vod_pic",str6);
                            jSONObject3.put("vod_remarks",str7);
                            jSONArray.put(jSONObject3);
                            i++;
                        } else {
                            jSONObject2.put("list",jSONArray);
                        }
                        return (jSONObject2.toString());
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

            if (!(z)) {
                String str2 = (new JSONObject(str).optString("siteUrl"));
                boolean z2 = C0020.m1370(str2);
                if (!(z2)) {
                    this.O = str2;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m829(this));
            sb.append("vid/yd.php?url=");
            this.b = (sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m829(this));
            sb2.append("vid/plyr/vr2.php?url=");
            this.Zm = (sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m829(this));
            sb3.append("vid/ty4.php?url=");
            this.Dr = (sb3.toString());
            this.un = C0045.m2084("libCk");
            this.g1 = new JSONObject(C0011.m327());

            return;
        } catch (JSONException e) {
            System.out.println(e);
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

        if (!z) {
            try {
                long j = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(m829(this));
                sb.append("index.php/ajax/suggest?mid=1&wd=");
                sb.append(C0010.m314(str));
                sb.append("&limit=10&timestamp=");
                sb.append(j);
                JSONObject jSONObject = new JSONObject(m844(this, (sb.toString())));
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                int i3 = (jSONObject.getInt("total"));
                String str3 = "list";
                if (!(i3 <= 0)) {
                    JSONArray jSONArray2 = new JSONArray((jSONObject.getString(str3)));
                    int i5 = 0;
                    while (true) {
                        int i6 = i5;
                        int i7 = (jSONArray2.length());
                        if (i6 < i7) {
                            JSONObject jSONObject3 = (jSONArray2.getJSONObject(i6));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((m829(this).concat("/detail/")));
                            sb2.append((jSONObject3.getString("id")));
                            sb2.append(".html");
                            String str4 = (sb2.toString());
                            String str5 = (jSONObject3.getString("name"));
                            String str6 = (jSONObject3.getString("pic"));
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("vod_id",str4);
                                jSONObject4.put("vod_name",str5);
                                jSONObject4.put("vod_pic",str6);
                                jSONObject4.put("vod_remarks",str2);
                                jSONArray.put(jSONObject4);
                                i = 48767;
                            } catch (Exception e) {
                                m849(e);
                            }
                            i5 = i6 + 1;
                        }
                    }
                }
                jSONObject2.put(str3,jSONArray);
                return (jSONObject2.toString());
            } catch (Exception e2) {
                m849(e2);
                return str2;
            }
        } else {
            return str2;
        }
    }
}
