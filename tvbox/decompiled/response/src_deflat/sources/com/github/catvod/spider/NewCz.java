package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.Os;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class NewCz extends Spider {
    private static String i = "";

    public static String zH = "";
    private String yq = "https://www.4kcz.com/";
    private String SN = "https://t02.cz01.org";
    private String N = "";
    private Boolean tF = Boolean.TRUE;

    public NewCz() {

        return;
    }

    private JSONObject N(String str, String str2) {
        JSONObject jSONObject = null;
        String str4 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        jSONObject = new JSONObject();
        str4 = "type_id";
        jSONObject.put(str4,str2);
        str4 = "type_name";
        jSONObject.put(str4,str);
        return jSONObject;
    }

    private void SN(Va va) {
        boolean z = (m915(this).equals(""));

        if (!z) {
            return;
        } else {
            if (!(va != null)) {
                try {
                    va = C0040.m1964(m916(this, m927(this), true));
                } catch (IOException e) {
                    m921(e);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(((va.cS("div [id=sosuobox] > form")).yq("action")));
            sb.append("?");
            sb.append(((va.cS("div [id=sosuobox] > form > input")).yq("name")));
            sb.append("=");
            this.N = (sb.toString());
            return;
        }
    }

    private void tF() {
        String str = "";
        boolean z = C0020.m1370(NewCz.zH);

        if (z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("username","oiiocn");
                jSONObject.put("password","qwwsxedc");
                jSONObject.put("email",str);
                jSONObject.put("url",m927(this));
                jSONObject.put("invitecode",str);
                jSONObject.put("linuser",str);
                HashMap hashMap = C0027.m1590("https://www.4kcz.com/", null, 1);
                hashMap.put("Origin","https://www.4kcz.com");
                hashMap.put("content-type","application/x-www-form-urlencoded");
                hashMap.put("accept","application/json, text/plain, */*");
                hashMap.put("sec-ch-ua-arch","u=1, i");
                hashMap.put("pragma","no-cache");
                hashMap.put("sec-fetch-dest","empty");
                hashMap.put("sec-ch-ua-mobile","?0");
                hashMap.put("sec-ch-ua-model",str);
                hashMap.put("sec-fetch-site","same-origin");
                hashMap.put("sec-fetch-mode","cors");
                hashMap.put("priority","\"x86\"");
                hashMap.put("sec-ch-ua-bitness","\"64\"");
                hashMap.put("sec-ch-ua-full-version-list","\"Google Chrome\";v=\"131.0.6778.205\", \"Chromium\";v=\"131.0.6778.205\", \"Not_A Brand\";v=\"24.0.0.0\"");
                hashMap.put("sec-ch-ua-platform","Windows");
                hashMap.put("sec-ch-ua-full-version","\"131.0.6778.205\"");
                hashMap.put("sec-ch-ua","\"Google Chrome\";v=\"131\", \"Chromium\";v=\"131\", \"Not_A Brand\";v=\"24\"");
                boolean z2 = C0020.m1370(NewCz.zH);
                if (!(z2)) {
                    hashMap.put("Cookie",NewCz.zH);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(m927(this));
                sb.append("api/vs/session");
                Iterator it = (m908(m910((sb.toString()), (jSONObject.toString()), hashMap), "set-cookie").iterator());
                while (true) {
                    boolean z3 = (it.hasNext());
                    if (z3) {
                        String str2 = (String) (it.next());
                        boolean z4 = (str2.contains("wordpress_logged_in"));
                        if (z4) {
                            zH = str2;
                        }
                    }
                }
            } catch (Exception e) {
            }
        }

        return;
    }

    private String zH(String str, boolean z) {
        String str2;
        boolean z2 = false;
        boolean z3 = (str.startsWith("http"));

        if (!z3) {
            str2 = C0032.m1739(new StringBuilder(), m927(this), str);
        } else {
            str2 = str;
            str2 = C0032.m1739(new StringBuilder(), m927(this), str);
        }
        Response response = m909(m907(m906(), m920(m931(m919(new Request.Builder(), str2), m926(m913(this))))));
        int i4 = m933(response);

        if (i4 != 403) {
            String str3 = m923(m917(response));
            m918(response);
            if (!(str3 == null)) {
                boolean z4 = (str3.contains("SafeLineChallenge"));
                if (z4) {
                    z2 = true;
                }
            }
            if (!z2) {
                return str3;
            } else {
                String str4 = "";
                if (z) {
                    try {
                        i = str4;
                        i = (new Os(str2).yq(str3));
                        StringBuilder sb = new StringBuilder();
                        sb.append("JWT: ");
                        sb.append(m914());
                        m928((sb.toString()));
                        C0014.m432(C0052.m2248("czSlJwt"), m914());
                        return m916(this, str, false);
                    } catch (Exception e) {
                        m921(e);
                        return str4;
                    }
                } else {
                    m928("过盾失败2");
                    return str4;
                }
                return str3;
            }
        } else {
            zH = C0037.m1863(m930(m924(response)));
            C0014.m432(C0052.m2248("czCookie"), NewCz.zH);
            return m916(this, str, z);
        }
    }

    /* renamed from: اﻡلن  reason: contains not printable characters */
    public static OkHttpClient m906() {
        int i2 = (-675) ^ C0038.f96;

        return C0068Pe.N();
    }

    /* renamed from: بضـﻱ  reason: contains not printable characters */
    public static Call m907(Object obj, Object obj2) {
        int i2 = (-185) ^ C0033.f91;

        return ((OkHttpClient) obj).newCall((Request) obj2);
    }

    /* renamed from: تذطر  reason: contains not printable characters */
    public static List m908(Object obj, Object obj2) {
        int i2 = 57 ^ C0032.f90;

        return ((Response) obj).headers((String) obj2);
    }

    /* renamed from: خذزﺩ  reason: contains not printable characters */
    public static Response m909(Object obj) {
        int i2 = (-540) ^ C0001.f1;

        return ((Call) obj).execute();
    }

    /* renamed from: خضﺹﺙ  reason: contains not printable characters */
    public static Response m910(Object obj, Object obj2, Object obj3) {
        int i2 = 293 ^ C0009.f9;

        return C0068Pe.dT((String) obj, (String) obj2, (Map) obj3);
    }

    /* renamed from: خﺎكﻉ  reason: contains not printable characters */
    public static void m911(Object obj) {
        int i2 = 498 ^ C0002.f2;

        ((NewCz) obj).tF();
        return;
    }

    /* renamed from: دﺏنث  reason: contains not printable characters */
    public static Boolean m912(Object obj) {
        int i2 = 812 ^ C0022.f80;

        return ((NewCz) obj).tF;
    }

    /* renamed from: ذﻁﺩﺥ  reason: contains not printable characters */
    public static HashMap m913(Object obj) {
        int i2 = 812 ^ C0022.f80;

        return ((NewCz) obj).yq();
    }

    /* renamed from: زصثﻙ  reason: contains not printable characters */
    public static String m914() {
        int i2 = 812 ^ C0022.f80;

        return i;
    }

    /* renamed from: صعنﻅ  reason: contains not printable characters */
    public static String m915(Object obj) {
        int i2 = (-824) ^ C0004.f4;

        return ((NewCz) obj).N;
    }

    /* renamed from: طكﺏس  reason: contains not printable characters */
    public static String m916(Object obj, Object obj2, boolean z) {
        int i2 = (-4) ^ C0029.f87;

        return ((NewCz) obj).zH((String) obj2, z);
    }

    /* renamed from: فﻩﻉق  reason: contains not printable characters */
    public static ResponseBody m917(Object obj) {
        int i2 = (-448) ^ C0025.f83;

        return ((Response) obj).body();
    }

    /* renamed from: قكﻉﻅ  reason: contains not printable characters */
    public static void m918(Object obj) {
        int i2 = (-406) ^ C0053.f111;

        ((Response) obj).close();
        return;
    }

    /* renamed from: كﺡﺏـ  reason: contains not printable characters */
    public static Request.Builder m919(Object obj, Object obj2) {
        int i2 = 909 ^ C0002.f2;

        return ((Request.Builder) obj).url((String) obj2);
    }

    /* renamed from: وﻭﺵﺫ  reason: contains not printable characters */
    public static Request m920(Object obj) {
        int i2 = (-314) ^ C0002.f2;

        return ((Request.Builder) obj).build();
    }

    /* renamed from: ﺏشﺱب  reason: contains not printable characters */
    public static void m921(Object obj) {
        int i2 = (-477) ^ C0042.f100;

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: ﺏﻱﻝط  reason: contains not printable characters */
    public static void m922(Object obj, Object obj2) {
        int i2 = (-675) ^ C0038.f96;

        ((NewCz) obj).SN((Va) obj2);
        int i5 = (-422) ^ C0033.f91;

        return;
    }

    /* renamed from: ﺙغرت  reason: contains not printable characters */
    public static String m923(Object obj) {
        int i2 = 753 ^ C0000.f0;

        return ((ResponseBody) obj).string();
    }

    /* renamed from: ﺙوﺩج  reason: contains not printable characters */
    public static Headers m924(Object obj) {
        int i2 = 624 ^ C0012.f12;

        return ((Response) obj).headers();
    }

    /* renamed from: ﺙﺏتﻩ  reason: contains not printable characters */
    public static JSONObject m925(Object obj, Object obj2, Object obj3) {
        int i2 = (-1021) ^ C0026.f84;

        return ((NewCz) obj).N((String) obj2, (String) obj3);
    }

    /* renamed from: ﺡـحم  reason: contains not printable characters */
    public static Headers m926(Object obj) {
        int i2 = 916 ^ C0002.f2;

        return Headers.of((Map) obj);
    }

    /* renamed from: ﺥﺫفز  reason: contains not printable characters */
    public static String m927(Object obj) {
        int i2 = 753 ^ C0000.f0;

        return ((NewCz) obj).yq;
    }

    /* renamed from: ﺥﻉﺕﻍ  reason: contains not printable characters */
    public static void m928(Object obj) {
        int i2 = (-448) ^ C0025.f83;

        SpiderDebug.log((String) obj);
        int i5 = 215 ^ C0038.f96;

        return;
    }

    /* renamed from: ﺥﻩكﻍ  reason: contains not printable characters */
    public static String m929(Object obj) {
        int i2 = (-26) ^ C0033.f91;

        return ((NewCz) obj).SN;
    }

    /* renamed from: ﺫﺽﺭذ  reason: contains not printable characters */
    public static Map m930(Object obj) {
        int i2 = 802 ^ C0052.f110;

        return ((Headers) obj).toMultimap();
    }

    /* renamed from: ﺵﻅيع  reason: contains not printable characters */
    public static Request.Builder m931(Object obj, Object obj2) {
        int i2 = 916 ^ C0002.f2;

        return ((Request.Builder) obj).headers((Headers) obj2);
    }

    /* renamed from: ﻁﺽجﺱ  reason: contains not printable characters */
    public static int m933(Object obj) {
        int i2 = (-540) ^ C0001.f1;

        return ((Response) obj).code();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4 = "img";
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(m927(this));
            sb.append(str);
            sb.append("/page/");
            sb.append(str2);
            kB kBVar = (C0040.m1964(m916(this, (sb.toString()), true)).cS("div.mi_ne_kd > ul > li"));
            JSONArray jSONArray = new JSONArray();
            Iterator it = (kBVar.iterator());
            while (true) {
                boolean z2 = (it.hasNext());

                if (z2) {
                    hN hNVar = (hN) (it.next());
                    String str5 = "a";
                    Objects.requireNonNull(hNVar);
                    String str6 = (C0000.m12(str5, hNVar).N("href"));
                    boolean z3 = (str6.startsWith("http"));
                    if (z3) {
                        str3 = str6;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m927(this));
                        sb2.append(str6);
                        str3 = (sb2.toString());
                    }
                    String str7 = (((hNVar.cS(str4)).yq("alt")).trim());
                    boolean z4 = C0010.m289(str7);
                    if (!(z4)) {
                        String str8 = (((hNVar.cS(str4)).yq("data-original")).trim());
                        String str9 = (((hNVar.cS("div.hdinfo > span")).t0()).trim());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("vod_id",str3);
                        jSONObject2.put("vod_name",str7);
                        jSONObject2.put("vod_pic",str8);
                        jSONObject2.put("vod_remarks",str9);
                        jSONArray.put(jSONObject2);
                    }
                } else {
                    C0012.m364(jSONArray, jSONObject, str2);
                    return (jSONObject.toString());
                }
            }
        } catch (Exception e) {
            m921(e);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x04e0, code lost:
    r7.append((java.lang.CharSequence) (r6.next()));
    r8 = (r6.hasNext());
    r3 = 54533;
    */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04f0, code lost:
    r3 = r3 ^ 54550;
    */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04f4, code lost:
    switch(r3) {
        case 19: goto L308;
        case 50: goto L309;
        case 85: goto L307;
        case 116: goto L310;
        default: goto L311;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04f8, code lost:
    if (r8 == false) goto L312;
    */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04fa, code lost:
    r3 = 54626;
    */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04fe, code lost:
    r3 = 54595;
    */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0502, code lost:
    r7.append(r5);
    r3 = 54657;
    */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0508, code lost:
    r3 = r3 ^ 54674;
    */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x050c, code lost:
    switch(r3) {
        case 19: goto L319;
        case 50: goto L318;
        default: goto L320;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0510, code lost:
    r3 = 54688;
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r24) {
        /*
        Method dump skipped, instructions count: 1634
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.NewCz.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        String str;
        String str2 = "img";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Va va = C0040.m1964(m916(this, m927(this), true));
            m922(this, va);
            jSONArray.put(m925(this, "全部", "movie_bt"));
            jSONArray.put(m925(this, "豆瓣电影Top250", "dbtop250"));
            jSONArray.put(m925(this, "电影", "movie_bt_series/dyy"));
            jSONArray.put(m925(this, "国产剧", "movie_bt_series/guochanju"));
            jSONArray.put(m925(this, "美剧", "movie_bt_series/mj"));
            jSONArray.put(m925(this, "韩剧", "movie_bt_series/hj"));
            jSONArray.put(m925(this, "日剧", "movie_bt_series/rj"));
            jSONArray.put(m925(this, "华语电影", "movie_bt_series/huayudianying"));
            jSONArray.put(m925(this, "欧美电影", "movie_bt_series/meiguodianying"));
            jSONArray.put(m925(this, "韩国电影", "movie_bt_series/hanguodianying"));
            jSONArray.put(m925(this, "日本电影", "movie_bt_series/ribendianying"));
            jSONObject.put("class",jSONArray);
            kB kBVar = (va.cS("div.mi_ne_kd > ul > li"));
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = (kBVar.iterator());
            while (true) {
                boolean z2 = (it.hasNext());

                if (z2) {
                    hN hNVar = (hN) (it.next());
                    String str3 = "a";
                    Objects.requireNonNull(hNVar);
                    String str4 = (C0000.m12(str3, hNVar).N("href"));
                    boolean z3 = (str4.startsWith("http"));
                    if (z3) {
                        str = str4;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(m927(this));
                        sb.append(str4);
                        str = (sb.toString());
                    }
                    String str5 = (((hNVar.cS(str2)).yq("alt")).trim());
                    boolean z4 = C0010.m289(str5);
                    if (!(z4)) {
                        String str6 = (((hNVar.cS(str2)).yq("data-original")).trim());
                        String str7 = (((hNVar.cS("div.hdinfo > span")).t0()).trim());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("vod_id",str);
                        jSONObject2.put("vod_name",str5);
                        jSONObject2.put("vod_pic",str6);
                        jSONObject2.put("vod_remarks",str7);
                        jSONArray2.put(jSONObject2);
                    }
                } else {
                    jSONObject.put("list",jSONArray2);
                    return (jSONObject.toString());
                }
            }
        } catch (Exception e) {
            m921(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        try {
            boolean z = C0020.m1370(str);

            if (!(z)) {
                String[] strArr = ((new JSONObject(str).getString("login")).split("-"));
                String str2 = strArr[0];
                String str3 = strArr[1];
            }
            boolean z2 = C0020.m1370(NewCz.zH);

            if (z2) {
                zH = C0021.m1398(C0052.m2248("czCookie"));
            }
            boolean z3 = C0020.m1370(m914());

            if (!z3) {
                return;
            } else {
                i = C0021.m1398(C0052.m2248("czSlJwt"));
                return;
            }
        } catch (Exception e) {
            m921(e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 446
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0896 -> B:25:0x00ba). Please submit an issue!!! */
    public java.lang.String playerContent(java.lang.String r24, java.lang.String r25, java.util.List<java.lang.String> r26) {
        /*
        Method dump skipped, instructions count: 2754
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.NewCz.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            StringBuilder sb = new StringBuilder();
            sb.append("http://czzy.xn--m7r412advb92j21st65a.tk/czzysearch.php?wd=");
            sb.append(C0009.m260(str, "UTF-8"));
            String str3 = C0011.m353((sb.toString()), Rc.yq(), 0);
            boolean z2 = (str3.contains("$$$"));
            String str4 = "vod_remarks";
            String str5 = "vod_pic";
            String str6 = "vod_name";
            String str7 = ".html";
            String str8 = "movie/";
            String str9 = "vod_id";
            String str10 = "\\|";

            if (!z2) {
                String[] strArr3 = (str3.split(str10));
                boolean z4 = C0010.m289(strArr3[1]);
                L239: while (true) {
                    if (!z4) {
                        JSONObject jSONObject3 = new JSONObject();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str8);
                        sb3.append(strArr3[0]);
                        sb3.append(str7);
                        jSONObject3.put(str9,(sb3.toString()));
                        jSONObject3.put(str6,strArr3[1]);
                        jSONObject3.put(str5,strArr3[2]);
                        jSONObject3.put(str4,strArr3[3]);
                        jSONArray.put(jSONObject3);
                        continue L239;
                    } else {
                        return str2;
                    }
                }
            } else {
                String[] strArr = (str3.split("\\$\\$\\$"));
                int length = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        String[] strArr2 = (strArr[i3].split(str10));
                        boolean z3 = C0010.m289(strArr2[1]);
                        if (!(z3)) {
                            JSONObject jSONObject2 = new JSONObject();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str8);
                            sb2.append(strArr2[0]);
                            sb2.append(str7);
                            jSONObject2.put(str9,(sb2.toString()));
                            jSONObject2.put(str6,strArr2[1]);
                            jSONObject2.put(str5,strArr2[2]);
                            jSONObject2.put(str4,strArr2[3]);
                            jSONArray.put(jSONObject2);
                        }
                        i3++;
                    }
                }
                String[] strArr3 = (str3.split(str10));
                boolean z4 = C0010.m289(strArr3[1]);
                L239: while (true) {
                    if (!z4) {
                        JSONObject jSONObject3 = new JSONObject();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str8);
                        sb3.append(strArr3[0]);
                        sb3.append(str7);
                        jSONObject3.put(str9,(sb3.toString()));
                        jSONObject3.put(str6,strArr3[1]);
                        jSONObject3.put(str5,strArr3[2]);
                        jSONObject3.put(str4,strArr3[3]);
                        jSONArray.put(jSONObject3);
                        continue L239;
                    } else {
                        return str2;
                    }
                }
            }
            jSONObject.put("list",jSONArray);
            return (jSONObject.toString());
        } catch (Exception e) {
            m921(e);
            return str2;
        }
    }

    protected final HashMap<String, String> yq() {
        HashMap<String, String> hashMap = C0055.m2325("User-Agent", "Mozilla/5.0 (Linux; Android) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36 CrKey/1.54.248666", "Accept-language", "zh-CN,zh;q=0.9");
        hashMap.put("accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        hashMap.put("upgrade-insecure-requests","1");
        hashMap.put("sec-fetch-dest","document");
        hashMap.put("sec-fetch-mode","navigate");
        String str = "cache-control";
        String str2 = "no-cache";
        hashMap.put(str,str2);
        hashMap.put("pragma",str2);
        hashMap.put("content-type","text/html; charset=utf-8");
        hashMap.put("X-Requested-With","XMLHttpRequset");
        hashMap.put("Accept-Encoding","deflate");
        StringBuilder sb = new StringBuilder();
        boolean z = C0020.m1370(NewCz.zH);

        if (!(z)) {
            sb.append(NewCz.zH);
        }
        boolean z2 = C0020.m1370(m914());

        if (!(z2)) {
            int i4 = (sb.length());
            if (!(i4 <= 0)) {
                sb.append("; ");
            }
            sb.append("sl-challenge-jwt=");
            sb.append(m914());
        }
        int i6 = (sb.length());

        if (!(i6 <= 0)) {
            hashMap.put("Cookie",(sb.toString()));
        }
        hashMap.put("referer",m927(this));
        return hashMap;
    }
}
