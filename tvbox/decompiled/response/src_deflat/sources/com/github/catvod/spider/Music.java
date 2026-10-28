package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.Music;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.DialogInterface$OnDismissListenerC0194v3;
import com.github.catvod.spider.merge.Gd;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nl;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.g1;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.ByteArrayInputStream;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Music extends Spider {
    private static Sjyy Gc;
    private static boolean KJ;
    private static String M;

    private String N;
    private AlertDialog i;
    private boolean tF;
    private boolean zH;
    private String yq = "http://www.4c44.com";
    private String SN = C0032.m1739(new StringBuilder(), m869(this), "/js/play.php");
    private final SecureRandom t0 = new SecureRandom();

    /* renamed from: com.github.catvod.spider.Music$1 */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class Sjyy {

        @SerializedName("title")
        private String N;
        @SerializedName("pic")
        private String SN;
        @SerializedName("lrc")
        private String tF;
        @SerializedName("url")
        private String yq;

        /* renamed from: جﺫﻱر */
        public static String m883(Object obj) {

            return ((Sjyy) obj).yq;
        }

        /* renamed from: صدﺥﻱ */
        public static String m884(Object obj) {
            int i = (-985) ^ C0024.f82;

            return ((Sjyy) obj).tF;
        }

        /* renamed from: ﻍﺥفخ */
        public static String m886(Object obj) {
            int i = 938 ^ C0033.f91;

            return ((Sjyy) obj).SN;
        }

        /* renamed from: ﻩمﻁﻱ */
        public static String m887(Object obj) {
            int i = 706 ^ C0003.f3;

            return ((Sjyy) obj).N;
        }

        public String getLrc() {
            return m884(this);
        }

        public String getPic() {
            boolean z = C0020.m1370(m886(this));

            if (z) {
                return "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://img.flmp3.pro/image/20240708/20240708222152_495.webp";
            } else {
                String str = m886(this);
                return str;
            }
        }

        public String getTitle() {
            return m887(this);
        }

        public String getUrl() {
            return m883(this);
        }
    }

    public Music() {

        return;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[FALL_THROUGH, PHI: r0
    PHI: (r0v12 java.lang.String) = (r0v6 java.lang.String), (r0v6 java.lang.String), (r0v8 java.lang.String), (r0v11 java.lang.String) binds: [B:4:0x003e, B:11:0x0060, B:25:0x008a, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
/*
Code decompiled incorrectly, please refer to instructions dump.
To view partially-correct add '--show-bad-code' argument
*/
private java.lang.String Gc(java.lang.String r6, boolean r7) {
    /*
    r5 = this;
    java.util.HashMap r0 = m862(r5)     // Catch: java.lang.Exception -> L96
    short[] r1 = m857()     // Catch: java.lang.Exception -> L96
    r2 = 31
    r3 = 7
    r4 = 3071(0xbff, float:4.303E-42)
    java.lang.String r1 = com.github.catvod.spider.merge.C0040.m1953(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L96
    java.lang.String r2 = m869(r5)     // Catch: java.lang.Exception -> L96
    (r0.put(r1,r2))     // Catch: java.lang.Exception -> L96
    java.util.HashMap r0 = m862(r5)     // Catch: java.lang.Exception -> L96
    okhttp3.Response r0 = m881(r6, r0)     // Catch: java.lang.Exception -> L96
    okhttp3.ResponseBody r0 = m872(r0)     // Catch: java.lang.Exception -> L96
    java.lang.String r0 = m879(r0)     // Catch: java.lang.Exception -> L96
    short[] r1 = m857()     // Catch: java.lang.Exception -> L96
    r2 = 38
    r3 = 10
    r4 = 1001(0x3e9, float:1.403E-42)
    java.lang.String r1 = com.github.catvod.spider.C0055.m2320(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L96
    boolean r2 = (r0.contains(r1))     // Catch: java.lang.Exception -> L96
    r1 = 1616(0x650, float:2.264E-42)
L3c:
    r1 = r1 ^ 1633(0x661, float:2.288E-42)
    switch(r1) {
        case 14: goto L42;
        case 49: goto L45;
        case 204: goto L4a;
        case 239: goto L89;
        default: goto L41;
    }     // Catch: java.lang.Exception -> L96
L41:
    goto L3c
L42:
    r1 = 1678(0x68e, float:2.351E-42)
    goto L3c
L45:
    if (r2 == 0) goto L42
    r1 = 1709(0x6ad, float:2.395E-42)
    goto L3c
L4a:
    short[] r1 = m857()     // Catch: java.lang.Exception -> L96
    r2 = 48
    r3 = 11
    r4 = 2419(0x973, float:3.39E-42)
    java.lang.String r1 = com.github.catvod.spider.merge.C0036.m1850(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L96
    boolean r2 = (r0.contains(r1))     // Catch: java.lang.Exception -> L96
    r1 = 1740(0x6cc, float:2.438E-42)
L5e:
    r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
    switch(r1) {
        case 17: goto L64;
        case 54: goto L69;
        case 471: goto L89;
        case 500: goto L6c;
        default: goto L63;
    }     // Catch: java.lang.Exception -> L96
L63:
    goto L5e
L64:
    if (r2 == 0) goto L69
    r1 = 1833(0x729, float:2.569E-42)
    goto L5e
L69:
    r1 = 1802(0x70a, float:2.525E-42)
    goto L5e
L6c:
    r1 = 1864(0x748, float:2.612E-42)
L6e:
    r1 = r1 ^ 1881(0x759, float:2.636E-42)
    switch(r1) {
        case 17: goto L74;
        case 47384: goto L8a;
        case 47417: goto L7e;
        case 47483: goto L7a;
        default: goto L73;
    }     // Catch: java.lang.Exception -> L96
L73:
    goto L6e
L74:
    if (r7 == 0) goto L7a
    r1 = 48736(0xbe60, float:6.8294E-41)
    goto L6e
L7a:
    r1 = 48705(0xbe41, float:6.825E-41)
    goto L6e
L7e:
    java.lang.String r0 = (r5.generateSessionId())     // Catch: java.lang.Exception -> L96
    r5.N = r0     // Catch: java.lang.Exception -> L96
    r0 = 0
    java.lang.String r0 = m867(r5, r6, r0)     // Catch: java.lang.Exception -> L96
L89:
    return r0
L8a:
    m855(r5, r0)     // Catch: java.lang.Exception -> L96
    java.util.HashMap r0 = m862(r5)     // Catch: java.lang.Exception -> L96
    java.lang.String r0 = com.github.catvod.parser.C0001.m32(r6, r0)     // Catch: java.lang.Exception -> L96
    goto L89
L96:
    r0 = move-exception
    java.io.PrintStream r1 = System.out
    (r1.println(r0))
    java.lang.String r0 = ""
    goto L89
    */
    throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Music.Gc(java.lang.String, boolean):java.lang.String");
}

/* JADX WARN: Code restructure failed: missing block: B:100:0x0295, code lost:
r4.add(new com.github.catvod.spider.merge.ME(r2, r1, r0));
r0 = 53510;
*/
/* JADX WARN: Code restructure failed: missing block: B:101:0x02a0, code lost:
r0 = r0 ^ 53527;
*/
/* JADX WARN: Code restructure failed: missing block: B:102:0x02a4, code lost:
switch(r0) {
    case 17: goto L256;
    case 50: goto L165;
    default: goto L258;
};
*/
/* JADX WARN: Code restructure failed: missing block: B:103:0x02a8, code lost:
r0 = 53541;
*/
/* JADX WARN: Code restructure failed: missing block: B:79:0x01df, code lost:
r2 = (r0.cS(r3));
r8 = "href";
r2 = (r2.yq(r8));
r10 = (r2.isEmpty());
r3 = 51836;
*/
/* JADX WARN: Code restructure failed: missing block: B:80:0x01fb, code lost:
r3 = r3 ^ 51853;
*/
/* JADX WARN: Code restructure failed: missing block: B:81:0x01ff, code lost:
switch(r3) {
    case 241: goto L226;
    case 1963: goto L227;
    case 1992: goto L229;
    case 2025: goto L228;
    default: goto L233;
};
*/
/* JADX WARN: Code restructure failed: missing block: B:82:0x0203, code lost:
if (r10 == false) goto L230;
*/
/* JADX WARN: Code restructure failed: missing block: B:83:0x0205, code lost:
r3 = 52580;
*/
/* JADX WARN: Code restructure failed: missing block: B:84:0x0209, code lost:
r3 = 52549;
*/
/* JADX WARN: Code restructure failed: missing block: B:85:0x020d, code lost:
r2 = ((r0.cS(r9)).yq(r8));
*/
/* JADX WARN: Code restructure failed: missing block: B:86:0x0215, code lost:
r8 = (r14.contains("mvlist"));
r3 = 52611;
*/
/* JADX WARN: Code restructure failed: missing block: B:87:0x0229, code lost:
r3 = r3 ^ 52628;
*/
/* JADX WARN: Code restructure failed: missing block: B:88:0x022d, code lost:
switch(r3) {
    case 23: goto L236;
    case 54: goto L237;
    case 85: goto L239;
    case 116: goto L238;
    default: goto L243;
};
*/
/* JADX WARN: Code restructure failed: missing block: B:89:0x0231, code lost:
if (r8 == false) goto L240;
*/
/* JADX WARN: Code restructure failed: missing block: B:90:0x0233, code lost:
r3 = 52704;
*/
/* JADX WARN: Code restructure failed: missing block: B:91:0x0237, code lost:
r3 = 52673;
*/
/* JADX WARN: Code restructure failed: missing block: B:92:0x023b, code lost:
r2 = com.github.catvod.spider.C0048.m2149(r1, "-MTV-", r2);
*/
/* JADX WARN: Code restructure failed: missing block: B:93:0x024c, code lost:
r0 = ((r0.cS("img")).yq("src"));
r8 = (r0.isEmpty());
r3 = 52735;
*/
/* JADX WARN: Code restructure failed: missing block: B:94:0x0275, code lost:
r3 = r3 ^ 52752;
*/
/* JADX WARN: Code restructure failed: missing block: B:95:0x0279, code lost:
switch(r3) {
    case 14: goto L246;
    case 45: goto L249;
    case 1007: goto L247;
    case 7927: goto L248;
    default: goto L253;
};
*/
/* JADX WARN: Code restructure failed: missing block: B:96:0x027d, code lost:
r3 = 52797;
*/
/* JADX WARN: Code restructure failed: missing block: B:97:0x0281, code lost:
if (r8 == false) goto L251;
*/
/* JADX WARN: Code restructure failed: missing block: B:98:0x0283, code lost:
r3 = 53479;
*/
/* JADX WARN: Code restructure failed: missing block: B:99:0x0287, code lost:
r0 = "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/03/01/9991fceaab9b26082b523d691e3616f5.md.jpg";
*/
/*
Code decompiled incorrectly, please refer to instructions dump.
To view partially-correct add '--show-bad-code' argument
*/
private java.util.List<com.github.catvod.spider.merge.ME> KJ(com.github.catvod.spider.merge.Va r13, java.lang.String r14, java.lang.String r15) {
    /*
    Method dump skipped, instructions count: 988
    To view this dump add '--comments-level debug' option
    */
    throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Music.KJ(com.github.catvod.spider.merge.Va, java.lang.String, java.lang.String):java.util.List");
}

private HashMap<String, String> M() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36");
    boolean z = (TextUtils.isEmpty(m861(this)));

    if (!(z)) {
        hashMap.put("Cookie",m861(this));
    }
    hashMap.put("accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    hashMap.put("Referer",m869(this));
    return hashMap;
}

public static /* synthetic */ void N(String str) {
    boolean z = C0020.m1370(str);

    if (z) {
        return;
    } else {
        M = str;
        return;
    }
}

public static /* synthetic */ void SN(Music music) {
    music.tF = false;
    int i = (-768) ^ C0002.f2;

    if (i < 0) {
        return;
    } else {
        return;
    }
}

public static void i(Music music) {
    g1 g1Var = null;
    // [deflattened] 控制流平坦化已还原为线性代码
    music.zH = true;
    m865(music);
    g1Var = new g1(music, 5);
    C0057.m2371(g1Var);
    return;
}

public static Object[] proxy() {
    List list = null;
    ByteArrayInputStream byteArrayInputStream = null;
    Object[] objArr = null;
    Sjyy sjyy = null;
    Integer num = null;
    String str2 = null;
    byte[] bArr = null;
    String str3 = null;
    // [deflattened] 控制流平坦化已还原为线性代码
    sjyy = m880();
    str3 = m875(sjyy);
    list = C0029.m1656(str3);
    str3 = C0044.m2049(list);
    objArr = new Object[3];
    num = (Integer.valueOf(200));
    objArr[0] = num;
    str2 = "application/oct-stream";
    objArr[1] = str2;
    bArr = (str3.getBytes());
    byteArrayInputStream = new ByteArrayInputStream(bArr);
    objArr[2] = byteArrayInputStream;
    return objArr;
}

public static Object[] proxyInput(Map<String, String> map) {
    String str = "type";
    boolean z = ("html".equals((map.get(str))));
    String str2 = "text/html";
    Integer num = (Integer.valueOf(200));

    if (!z) {
        boolean z2 = ("text".equals((map.get(str))));
        if (z2) {
            try {
                String str4 = (C0039.m1929((String) (map.get("kw")), "UTF-8").replace(" ","+"));
                boolean z3 = (TextUtils.isEmpty(str4));
                if (!(z3)) {
                    M = str4;
                    return new Object[]{num, str2, new ByteArrayInputStream(new byte[0])};
                }
            } catch (Exception e) {
            }
        }
        return null;
    } else {
        String str3 = ProxyOrigin.getInternalIP();
        StringBuilder sb = new StringBuilder();
        sb.append(C0032.m1740());
        sb.append(str3);
        sb.append(":9978/proxy?do=input&csp=Music&type=text&kw=' + encodeURIComponent(kw);\n      var xhr = new XMLHttpRequest();\n      xhr.open('GET', apiUrl, true);\n      xhr.send();\n    }\n  </script>\n</body>\n</html>\n");
        return new Object[]{num, str2, new ByteArrayInputStream(((sb.toString()).getBytes()))};
    }
}

private void q(String str) {
    try {
        String str2 = ((C0004.m119(str).cS("input[name=csrf_token]")).yq("value"));
        boolean z = (TextUtils.isEmpty(str2));

        if (!z) {
            HashMap hashMap = new HashMap();
            hashMap.put("csrf_token",str2);
            hashMap.put("human_check","on");
            Response response = m882(m869(this), hashMap, m862(this));
            Map map = m868(m860(response));
            boolean z2 = (map.containsKey("set-cookie"));
            if (z2) {
                String str3 = C0037.m1863(map);
                boolean z3 = (TextUtils.isEmpty(str3));
                if (!(z3)) {
                    this.N = str3;
                    C0002.m78("Y_sjyy", str3);
                }
            }
            m879(m872(response));
            return;
        } else {
            m871("passCaptcha: csrf_token not found");
            return;
        }
    } catch (Exception e) {
        m859(e);
    }
}

private void t0() {
    try {
        AlertDialog alertDialog = m873(this);

        if (alertDialog == null) {
            return;
        } else {
            alertDialog.dismiss();
            return;
        }
    } catch (Exception e) {

        return;
    }
}

public static /* synthetic */ void tF(Music music) {
    boolean z = m870(music);

    if (!(z)) {
        music.tF = false;
    }
    music.zH = false;
}

public static void yq(Music music, EditText editText) {
    Gd gd = null;
    String str2 = null;
    Editable editable = null;
    // [deflattened] 控制流平坦化已还原为线性代码
    Objects.requireNonNull(music);
    editable = (editText.getText());
    str2 = C0050.m2227(editable);
    m865(music);
    gd = new Gd(str2, 5);
    C0038.m1909(gd);
    return;
}

public static void zH(Music music) {
    Objects.requireNonNull(music);
    try {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(C0038.m1895(16),C0038.m1895(16),C0038.m1895(16),C0038.m1895(16));
        FrameLayout frameLayout = new FrameLayout(InitOrigin.context());
        final EditText editText = new EditText(InitOrigin.context());
        frameLayout.addView(editText,layoutParams);
        AlertDialog alertDialog = ((((((new AlertDialog.Builder(InitOrigin.getActivity()).setTitle("请输入搜索关键词")).setView(frameLayout)).setNeutralButton("TV端点击这，微信扫码搜索",new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.OI
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Music.i(Music.this);
                                }
                    })).setNegativeButton("取消",null)).setPositiveButton("搜索",new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.y5
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Music.yq(Music.this, editText);
                        }
            })).show());
        music.i = alertDialog;
        (alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.FY
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Music.tF(Music.this);
                    }
        }));
    } catch (Exception e) {

        return;
    }
}

/* renamed from: بﺹﻡس */
public static void m855(Object obj, Object obj2) {
    int i = (-1021) ^ C0026.f84;

    ((Music) obj).q((String) obj2);
    return;
}

/* renamed from: تﻕوا */
public static boolean m856(Object obj) {
    int i = 125 ^ C0037.f95;

    return ((Music) obj).tF;
}

/* renamed from: ذﺕﺭح */
public static SecureRandom m858(Object obj) {
    int i = (-26) ^ C0033.f91;

    return ((Music) obj).t0;
}

/* renamed from: ذﺥـج */
public static void m859(Object obj) {
    int i = 930 ^ C0038.f96;

    SpiderDebug.log((Throwable) obj);
    int i4 = (-31) ^ C0041.f99;

    return;
}

/* renamed from: زربﺏ */
public static Headers m860(Object obj) {
    int i = (-985) ^ C0000.f0;

    return ((Response) obj).headers();
}

/* renamed from: ظنفﻁ */
public static String m861(Object obj) {
    int i = 909 ^ C0002.f2;

    return ((Music) obj).N;
}

/* renamed from: عازﻱ */
public static HashMap m862(Object obj) {
    int i = 938 ^ C0033.f91;

    return ((Music) obj).M();
}

/* renamed from: عﺽخق */
public static boolean m863() {
    int i = 938 ^ C0033.f91;

    return KJ;
}

/* renamed from: غضﺩظ */
public static List m864(Object obj, Object obj2, Object obj3, Object obj4) {
    int i = (-31) ^ C0041.f99;

    return ((Music) obj).KJ((Va) obj2, (String) obj3, (String) obj4);
}

/* renamed from: فهﺫﻭ */
public static void m865(Object obj) {
    int i = 596 ^ C0009.f9;

    ((Music) obj).t0();
    return;
}

/* renamed from: لﻍﺩح */
public static String m866() {
    int i = (-404) ^ C0021.f79;

    return M;
}

/* renamed from: موضن */
public static String m867(Object obj, Object obj2, boolean z) {
    int i = 36 ^ C0033.f91;

    return ((Music) obj).Gc((String) obj2, z);
}

/* renamed from: نثﻱر */
public static Map m868(Object obj) {
    int i = (-703) ^ C0036.f94;

    return ((Headers) obj).toMultimap();
}

/* renamed from: نخغش */
public static String m869(Object obj) {
    int i = (-821) ^ C0025.f83;

    return ((Music) obj).yq;
}

/* renamed from: ﺎﻕﻭﺯ */
public static boolean m870(Object obj) {
    int i = (-675) ^ C0038.f96;

    return ((Music) obj).zH;
}

/* renamed from: ﺕوذﺏ */
public static void m871(Object obj) {
    int i = (-886) ^ C0021.f79;

    SpiderDebug.log((String) obj);
    int i4 = (-703) ^ C0036.f94;

    return;
}

/* renamed from: ﺝذزب */
public static ResponseBody m872(Object obj) {
    int i = 284 ^ C0041.f99;

    return ((Response) obj).body();
}

/* renamed from: ﺥخﺩق */
public static AlertDialog m873(Object obj) {
    int i = (-404) ^ C0021.f79;

    return ((Music) obj).i;
}

/* renamed from: ﺥﻩمظ */
public static Object m874(Object obj, Object obj2, Object obj3) {
    int i = (-821) ^ C0025.f83;

    return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
}

/* renamed from: ﺭﻡﺵي */
public static String m875(Object obj) {
    int i = 697 ^ C0024.f82;

    return Sjyy.m884((Sjyy) obj);
}

/* renamed from: ﺯﻉﻅﻡ */
public static String m876(Object obj) {
    int i = (-448) ^ C0025.f83;

    return Sjyy.m883((Sjyy) obj);
}

/* renamed from: ﺱتال */
public static String m877(Object obj) {
    int i = (-388) ^ C0035.f93;

    return ((Sjyy) obj).getPic();
}

/* renamed from: ﺱـشﻩ */
public static String m878(Object obj) {
    int i = 697 ^ C0024.f82;

    return ((Music) obj).SN;
}

/* renamed from: ﺱﻍﻩخ */
public static String m879(Object obj) {
    int i = (-703) ^ C0036.f94;

    return ((ResponseBody) obj).string();
}

/* renamed from: ﻙﻉشﺥ */
public static Sjyy m880() {
    int i = (-185) ^ C0033.f91;

    return Gc;
}

/* renamed from: ﻩطﻡر */
public static Response m881(Object obj, Object obj2) {
    int i = 57 ^ C0032.f90;

    return C0068Pe.Gc((String) obj, (Map) obj2);
}

/* renamed from: ﻩفﺎي */
public static Response m882(Object obj, Object obj2, Object obj3) {
    int i = 812 ^ C0022.f80;

    return C0068Pe.F5((String) obj, (Map) obj2, (Map) obj3);
}

public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
    boolean z2 = ("sou".equals(str));

    if (!z2) {
        boolean z3 = (str.startsWith("sou9*9"));
        String str3 = ".html";
        if (!z3) {
            StringBuilder sb = new StringBuilder();
            sb.append(m869(this));
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            sb.append(str3);
            return C0022.m1435(m864(this, C0040.m1964(m867(this, (sb.toString()), true)), str, str2));
        } else {
            int i3 = (Integer.parseInt(str2));
            if (i3 <= 1) {
                this.tF = true;
                String str4 = "";
                M = str4;
                C0057.m2371(new Nl(this, 4));
                while (true) {
                    boolean z4 = (TextUtils.isEmpty(m866()));
                    if (z4) {
                        boolean z5 = m856(this);
                        if (z5) {
                            C0037.m1868(500L);
                        }
                    }
                }
                boolean z6 = (TextUtils.isEmpty(m866()));
                if (!z6) {
                    m865(this);
                    String str5 = m866();
                    M = str4;
                    String str6 = C0048.m2149("/so/", str5, str3);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new ME(str6, str5, "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/06/21/8d84d1714d596b4af0d629b728640e6d.md.jpeg"));
                    return C0022.m1435(arrayList2);
                } else {
                    C0006.m194("没有输入搜索词");
                    return C0022.m1435(new ArrayList());
                }
            } else {
                return C0022.m1435(new ArrayList());
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m869(this));
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            sb.append(str3);
            return C0022.m1435(m864(this, C0040.m1964(m867(this, (sb.toString()), true)), str, str2));
        }
    } else {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ME("sou9*9", "可搜索 歌星/歌名", "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/03/01/9991fceaab9b26082b523d691e3616f5.md.jpg", "", true));
        iX iXVar = new iX();
        iXVar.b(arrayList);
        iXVar.dT(1,1,1,1);
        return (iXVar.toString());
    }
}

public String detailContent(List<String> list) {
    StringBuilder sb = new StringBuilder();
    sb.append(m869(this));
    sb.append((String) (list.get(0)));
    Va va = C0004.m119(m867(this, (sb.toString()), true));
    String str = (((va.cS(".play_list h1")).t0()).split("\\,"))[0];
    ArrayList arrayList = new ArrayList();
    kB kBVar = (va.cS(".play_list > ul > li"));
    String str2 = "";
    int i = 0;
    while (true) {
        int i2 = (kBVar.size());

        if (i < i2) {
            hN hNVar = (hN) (kBVar.get(i));
            String str3 = ".name a";
            kB kBVar2 = (hNVar.cS(str3));
            String str4 = "href";
            String str5 = (kBVar2.yq(str4));
            if (i == 0) {
                Va va2 = C0004.m119(C0028.m1633(C0032.m1739(new StringBuilder(), m869(this), str5), m862(this)));
                Objects.requireNonNull(va2);
                hN hNVar2 = C0000.m12("div.play_left", va2);
                if (hNVar2 != null) {
                    hN hNVar3 = C0000.m12("img", hNVar2);
                    if (hNVar3 != null) {
                        str2 = (hNVar3.N("src"));
                    }
                }
                if (str2 != null) {
                    boolean z = (str2.isEmpty());
                }
                str2 = "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/03/01/9991fceaab9b26082b523d691e3616f5.md.jpg";
            }
            String str6 = ((hNVar.cS(str3)).t0());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str6);
            sb2.append("$");
            sb2.append(str5);
            arrayList.add((sb2.toString()));
            int i9 = ((hNVar.cS(".mv")).size());
            if (i9 > 0) {
                String str7 = ((hNVar.cS(".mv a")).yq(str4));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str6);
                sb3.append("-MTV$");
                sb3.append(str7);
                arrayList.add((sb3.toString()));
            }
            i++;
        } else {
            String str8 = (TextUtils.join("$$$",(Collections.singletonList((TextUtils.join("#",arrayList))))));
            ME me = new ME();
            me.B((String) (list.get(0)));
            me.G(str);
            me.G4(str2);
            String str9 = "易听";
            me.q(str9);
            me.Gc(str9);
            me.dT(str9);
            me.F5(str8);
            return C0000.m21(me);
        }
    }
}

public String generateSessionId() {
    StringBuilder sb = new StringBuilder(26);
    int i = 0;
    while (true) {

        if (i < 26) {
            sb.append(("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt((m858(this).nextInt(62)))));
            i++;
        } else {
            StringBuilder sb2 = C0052.m2253("PHPSESSID=");
            sb2.append((sb.toString()));
            return (sb2.toString());
        }
    }
}

public String homeContent(boolean z) {
    ArrayList arrayList = new ArrayList();
    Va va = C0040.m1964(m867(this, m869(this), true));
    int i = 0;
    Iterator it = ((va.cS("div.pull-right > div > ul > li > a")).iterator());
    while (true) {
        boolean z2 = (it.hasNext());
        String str = "";

        if (z2) {
            hN hNVar = (hN) (it.next());
            if (i == 0) {
                i++;
            } else {
                arrayList.add(new rP(((hNVar.N("href")).replace(".html",str)), (hNVar.N("title"))));
            }
        } else {
            arrayList.add(new rP("sou", "🔍搜索"));
            return C0038.m1906(arrayList, m864(this, va, str, "1"));
        }
    }
}

public void init(Context context, String str) {

    if (!(str == null)) {
        boolean z = (str.isEmpty());
    }
    str = m869(this);
    this.yq = str;
    this.N = C0014.m419("Y_sjyy", "");
}

public String playerContent(String str, String str2, List<String> list) {
    String str3 = "mp4";
    String str4 = "";
    C0056.m2351(true);
    try {
        String str5 = (str2.substring((str2.lastIndexOf("/")) + 1,(str2.length()) - 5));
        boolean z = (str2.contains(str3));

        if (z) {
            boolean z5 = (str2.contains(str3));
            L239: while (true) {
                if (z5) {
                    iX iXVar3 = new iX();
                    iXVar3.s((String.format("http://www.4c44.com/data/down.php?ac=vplay&id=%s&q=1080",new Object[]{str5})),false);
                    return (iXVar3.toString());
                } else {
                    continue L239;
                }
            }
        } else {
            HashMap hashMap = new HashMap();
            boolean z2 = (str2.contains("radio"));
            if (z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(m869(this));
                sb.append(str2);
                str5 = C0007.m228("\"music\",\"(.*?)\"", C0001.m32((sb.toString()), m862(this)), 1);
            }
            boolean z3 = C0020.m1370(str5);
            if (!z3) {
                String str6 = (new SimpleDateFormat("yyyyMMddHHmm").format(new Date()));
                hashMap.put("id",str5);
                hashMap.put("type","music");
                String str7 = "key";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str6);
                sb2.append("4c44");
                hashMap.put(str7,(sb2.toString()));
                Gc = (Sjyy) m874(new Gson(), C0042.m2001(m878(this), hashMap, m862(this)), Sjyy.class);
                ArrayList arrayList = new ArrayList();
                boolean z4 = C0020.m1370(m875(m880()));
                if (z4) {
                    iX iXVar = new iX();
                    iXVar.s(m876(m880()),false);
                    iXVar.N(m877(m880()));
                    iXVar.yq(m877(m880()));
                    return (iXVar.toString());
                } else {
                    String str8 = C0044.m2049(C0029.m1656(m875(m880())));
                    gU gUVar = new gU();
                    gUVar.N("歌词");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(ProxyOrigin.getUrl());
                    sb3.append("?do=musicLrc&csp=sjyy");
                    gUVar.zH((sb3.toString()));
                    gUVar.tF();
                    gU gUVar2 = (gUVar.SN("ass"));
                    gUVar2.yq(str8);
                    arrayList.add(gUVar2);
                    iX iXVar2 = new iX();
                    iXVar2.s(m876(m880()),false);
                    iXVar2.N(m877(m880()));
                    iXVar2.yq(m877(m880()));
                    iXVar2.O(arrayList);
                    return (iXVar2.toString());
                }
            } else {
                return str4;
            }
        }
    } catch (Exception e) {
        m859(e);
    }
    return str4;
}

public void showInputQRCode() {
    try {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(ProxyOrigin.getInternalIP());
        sb.append(":9978/proxy?do=input&csp=Music&type=html");
        String str = (sb.toString());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C0038.m1895(200), C0038.m1895(200));
        ImageView imageView = new ImageView(InitOrigin.context());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(C0032.m1731(str, 200, 2));
        FrameLayout frameLayout = new FrameLayout(InitOrigin.context());
        layoutParams.gravity = 17;
        frameLayout.addView(imageView,layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C0038.m1895(500), C0038.m1895(50));
        layoutParams2.topMargin = C0038.m1895(240);
        layoutParams2.gravity = 1;
        TextView textView = new TextView(InitOrigin.context());
        textView.setText("使用微信扫码推送到TV端搜索");
        textView.setTextColor(-1);
        textView.setGravity(17);
        frameLayout.addView(textView,layoutParams2);
        AlertDialog alertDialog = ((new AlertDialog.Builder(InitOrigin.getActivity()).setView(frameLayout)).show());
        this.i = alertDialog;
        (alertDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(0));
        m873(this).setOnDismissListener(new DialogInterface$OnDismissListenerC0194v3(this, 2));
    } catch (Exception e) {

        return;
    }
}
}
