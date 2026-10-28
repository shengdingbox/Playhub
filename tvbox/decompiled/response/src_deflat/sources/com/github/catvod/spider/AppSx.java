package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0103fp;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class AppSx extends Spider {

    private String N;
    private String SN;
    private String ee;
    private String t0;
    private String tF;
    private String v;
    private JSONObject v3;
    private String yq;
    private String zH;
    private String i = "113";
    private int Gc = 119;
    private String M = "/api.php/getappapi.";
    private String KJ = "index/";
    private String q = "initV119";
    private String B = "vodDetail";
    private String G = "typeFilterVodList";
    private String G4 = "searchList";
    private String dT = "vodParse";
    private C0103fp F5 = new C0103fp();
    private boolean W = false;
    private long g9 = 0;

    public AppSx() {
        String str = "";
        this.yq = str;
        this.SN = str;
        this.N = str;
        this.tF = str;
        this.zH = str;
        this.t0 = str;
        this.v = str;
        this.ee = str;

        return;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 459
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    private java.lang.String Gc(java.lang.String r22, int r23, java.lang.String r24, java.lang.String r25) {
        /*
        Method dump skipped, instructions count: 2076
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.Gc(java.lang.String, int, java.lang.String, java.lang.String):java.lang.String");
    }

    private boolean M() {
        String str = "slider_id";
        String str2 = "data";
        try {
            m565(this);
            StringBuilder sb = new StringBuilder();
            sb.append(m537(this));
            sb.append(m571(this));
            sb.append(m568(this));
            sb.append("getSlider");
            JSONObject jSONObject = new JSONObject(m555(this, (new JSONObject(C0028.m1633((sb.toString()), m557(this))).getString(str2))));
            String str3 = (jSONObject.getString(str));
            int i = (jSONObject.getInt("target_x"));
            long j = (new Date().getTime());
            C0029.m1640(12000L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m537(this));
            sb2.append(m571(this));
            sb2.append(m568(this));
            sb2.append("verifySlider");
            String str4 = (sb2.toString());
            HashMap hashMap = new HashMap();
            hashMap.put("pos_x",(String.valueOf(i)));
            hashMap.put(str,str3);
            hashMap.put("timestamp",(String.valueOf(j)));
            return (new JSONObject(m555(this, (new JSONObject((C0005.m167(str4, hashMap, m557(this)).yq())).getString(str2)))).getBoolean("verified"));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String N(String str) {
        String str2;
        String str3;
        boolean z = (str.startsWith("{"));

        if (z) {
            return str;
        } else {
            boolean z2 = (str.startsWith("["));
            if (!z2) {
                String str4 = (str.replace("\\",""));
                boolean z3 = m566(this);
                if (z3) {
                    boolean z4 = (TextUtils.isEmpty(m541(this)));
                    if (!(z4)) {
                        str2 = m541(this);
                    }
                }
                str2 = m561(this);
                boolean z5 = m566(this);
                if (z5) {
                    boolean z6 = (TextUtils.isEmpty(m541(this)));
                    if (!(z6)) {
                        str3 = m541(this);
                    }
                }
                str3 = m570(this);
                return C0031.m1720(str4, str2, str3);
            } else {
                return str;
            }
            return str;
        }
    }

    private boolean SN(String str) {
        boolean z = true;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m537(this));
            sb2.append(m571(this));
            sb.append((sb2.toString()));
            sb.append("completeRewardOrder");
            String str2 = (sb.toString());
            HashMap hashMap = new HashMap();
            hashMap.put("order_no",str);
            JSONObject jSONObject = new JSONObject((C0005.m167(str2, hashMap, m557(this)).yq()));
            int i = (jSONObject.optInt("code",-1));

            if (i == 0) {
                int i3 = (new JSONObject(m555(this, (jSONObject.getString("data")))).optInt("status",0));
                if (i3 != 1) {
                    z = false;
                } else {
                    z = false;
                }
                return z;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private HashMap<String, String> i() {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        int i = m534(this);

        if (i <= 119) {
            str = "okhttp/3.14.9";
        } else {
            str = "okhttp/3.10.0";
            str = "okhttp/3.14.9";
        }
        hashMap.put("User-Agent",str);
        boolean z = m566(this);
        String str2 = "android";
        String str3 = "app-version-code";

        if (!z) {
            int i5 = m534(this);
            if (!(i5 == 118)) {
                if (i5 != 119) {
                    if (!(i5 != 117)) {
                        boolean z2 = (TextUtils.isEmpty(m564(this)));
                        if (!(z2)) {
                            hashMap.put("App-Device-Id",m564(this));
                        }
                        hashMap.put("App-Os-Type",str2);
                        hashMap.put("App-Ui-Mode","dark");
                        hashMap.put("App-Version-Code",m558(this));
                    }
                } else {
                    if (!(i5 != 117)) {
                        boolean z2 = (TextUtils.isEmpty(m564(this)));
                        if (!(z2)) {
                            hashMap.put("App-Device-Id",m564(this));
                        }
                        hashMap.put("App-Os-Type",str2);
                        hashMap.put("App-Ui-Mode","dark");
                        hashMap.put("App-Version-Code",m558(this));
                    }
                }
            }
            boolean z3 = (TextUtils.isEmpty(m564(this)));
            if (!(z3)) {
                hashMap.put("app-user-device-id",m564(this));
            }
            boolean z4 = (TextUtils.isEmpty(m532(this)));
            if (!(z4)) {
                hashMap.put("app-user-token",m532(this));
            }
            String str4 = (String.valueOf(System.currentTimeMillis() / 1000));
            String str5 = C0039.m1940(str4, m561(this), m570(this), 2);
            hashMap.put("app-ui-mode","light");
            hashMap.put("app-api-verify-time",str4);
            hashMap.put("app-api-verify-sign",str5);
            hashMap.put(str3,m558(this));
            return hashMap;
        } else {
            hashMap.put(str3,m558(this));
            hashMap.put("app-platform",str2);
            boolean z5 = (TextUtils.isEmpty(m551(this)));
            if (!(z5)) {
                hashMap.put("app-session-id",m551(this));
            }
            return hashMap;
        }
    }

    private JSONObject t0() {
        String str;
        m565(this);
        StringBuilder sb = new StringBuilder();
        sb.append(m537(this));
        sb.append(m571(this));
        sb.append(m568(this));
        sb.append(m548(this));
        String str2 = (sb.toString());
        int i = m534(this);

        if (i <= 119) {
            str = (C0042.m2006(str2, "", m557(this)).yq());
        } else {
            str = C0028.m1633(str2, m557(this));
            str = (C0042.m2006(str2, "", m557(this)).yq());
        }
        JSONObject jSONObject = new JSONObject(m555(this, (new JSONObject(str).getString("data"))));
        int i4 = m534(this);

        if (!(i4 <= 119)) {
            String str3 = "box_config";
            boolean z = (jSONObject.has(str3));
            if (z) {
                String str4 = (jSONObject.getString(str3));
                String str5 = ((new StringBuilder(m561(this)).reverse()).toString());
                JSONObject jSONObject2 = new JSONObject(C0031.m1720(str4, str5, (C0052.m2266(str5).substring(0,16))));
                m536(this).yq = (jSONObject2.getString("search_name"));
                m536(this).SN = (jSONObject2.getString("signature_name"));
                m536(this).N = (jSONObject2.getString("signature_value"));
                JSONObject jSONObject3 = (jSONObject2.getJSONObject("api_header"));
                m536(this).tF = (jSONObject3.getString("key"));
                m536(this).zH = (jSONObject3.getString("value"));
            }
        }
        m536(this).i = true;
        return jSONObject;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 357
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    private void tF() {
        /*
        Method dump skipped, instructions count: 1566
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.tF():void");
    }

    private JSONObject yq(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        boolean z = (TextUtils.isEmpty(str));

        if (!(z)) {
            try {
                JSONObject jSONObject2 = new JSONObject(new String(C0022.m1420(str, 2)));
                Iterator it = (jSONObject2.keys());
                while (true) {
                    boolean z2 = (it.hasNext());
                    if (z2) {
                        String str3 = (String) (it.next());
                        jSONObject.put(str3,(jSONObject2.get(str3)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
        jSONObject.put("User-Agent",str2);
        return jSONObject;
    }

    private String zH(JSONObject jSONObject) {
        String str = "data";
        boolean z = (jSONObject.has(str));
        String str2 = "";
        String str3 = "url";

        if (z) {
            boolean z2 = (jSONObject.get(str)) instanceof JSONObject;
            if (z2) {
                JSONObject jSONObject2 = (jSONObject.getJSONObject(str));
                boolean z3 = (jSONObject2.has(str3));
                if (z3) {
                    String str4 = (jSONObject2.optString(str3,str2));
                    boolean z4 = (TextUtils.isEmpty(str4));
                    if (!(z4)) {
                        return str4;
                    }
                }
            }
        }
        boolean z5 = (jSONObject.has(str3));

        if (z5) {
            String str5 = (jSONObject.optString(str3,str2));
            boolean z6 = (TextUtils.isEmpty(str5));
            if (!(z6)) {
                return str5;
            }
        }
        String str6 = "json";
        boolean z7 = (jSONObject.has(str6));

        if (z7) {
            String str7 = (jSONObject.optString(str6,str2));
            boolean z8 = (TextUtils.isEmpty(str7));
            if (!(z8)) {
                return m560(this, new JSONObject(str7));
            }
        }
        return str2;
    }

    /* renamed from: بحـﺎ  reason: contains not printable characters */
    public static String m532(Object obj) {
        int i = (-914) ^ C0004.f4;

        if (i > 0) {
            return null;
        } else {
            return ((AppSx) obj).zH;
        }
    }

    /* renamed from: بطﻱش  reason: contains not printable characters */
    public static Request.Builder m533(Object obj, Object obj2) {
        int i = (-540) ^ C0001.f1;

        if (i < 0) {
            return null;
        } else {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
    }

    /* renamed from: بﺏﻅل  reason: contains not printable characters */
    public static int m534(Object obj) {
        int i = 930 ^ C0038.f96;

        if (i > 0) {
            return 0;
        } else {
            return ((AppSx) obj).Gc;
        }
    }

    /* renamed from: تفﺩﻙ  reason: contains not printable characters */
    public static void m535(Object obj) {
        int i = (-540) ^ C0001.f1;

        if (i < 0) {
            return;
        } else {
            SpiderDebug.log((String) obj);
            return;
        }
    }

    /* renamed from: ثﺵﻱه  reason: contains not printable characters */
    public static C0103fp m536(Object obj) {
        int i = (-388) ^ C0035.f93;

        if (i >= 0) {
            return null;
        } else {
            return ((AppSx) obj).F5;
        }
    }

    /* renamed from: حاﺵذ  reason: contains not printable characters */
    public static String m537(Object obj) {
        int i = (-914) ^ C0004.f4;

        if (i > 0) {
            return null;
        } else {
            return ((AppSx) obj).yq;
        }
    }

    /* renamed from: خﺡشح  reason: contains not printable characters */
    public static String m538(Object obj, Object obj2, int i, Object obj3, Object obj4) {
        int i2 = (-768) ^ C0002.f2;

        if (i2 > 0) {
            return null;
        } else {
            return ((AppSx) obj).Gc((String) obj2, i, (String) obj3, (String) obj4);
        }
    }

    /* renamed from: درمث  reason: contains not printable characters */
    public static String m539(Object obj) {
        int i = (-540) ^ C0001.f1;

        if (i <= 0) {
            return null;
        } else {
            return ((AppSx) obj).G;
        }
    }

    /* renamed from: دزيق  reason: contains not printable characters */
    public static String m540(Object obj) {
        int i = 753 ^ C0000.f0;

        if (i <= 0) {
            return null;
        } else {
            return ((AppSx) obj).G4;
        }
    }

    /* renamed from: دﻙكر  reason: contains not printable characters */
    public static String m541(Object obj) {
        int i = 57 ^ C0032.f90;

        if (i < 0) {
            return null;
        } else {
            return ((AppSx) obj).ee;
        }
    }

    /* renamed from: ذحـﻁ  reason: contains not printable characters */
    public static MediaType m542(Object obj) {
        int i = 812 ^ C0022.f80;

        if (i >= 0) {
            return null;
        } else {
            return MediaType.parse((String) obj);
        }
    }

    /* renamed from: ذدظﻍ  reason: contains not printable characters */
    public static Response m543(Object obj) {
        int i = (-703) ^ C0036.f94;

        if (i >= 0) {
            return null;
        } else {
            return ((Call) obj).execute();
        }
    }

    /* renamed from: ذشﺽي  reason: contains not printable characters */
    public static Headers m544(Object obj) {
        int i = (-388) ^ C0035.f93;

        if (i > 0) {
            return null;
        } else {
            return Headers.of((Map) obj);
        }
    }

    /* renamed from: ربدي  reason: contains not printable characters */
    public static JSONObject m545(Object obj, Object obj2, Object obj3) {
        int i = 923 ^ C0041.f99;

        if (i >= 0) {
            return null;
        } else {
            return ((AppSx) obj).yq((String) obj2, (String) obj3);
        }
    }

    /* renamed from: زرﺝل  reason: contains not printable characters */
    public static String m546(Object obj) {
        int i = (-1021) ^ C0026.f84;

        if (i > 0) {
            return null;
        } else {
            return ((ResponseBody) obj).string();
        }
    }

    /* renamed from: سنﺥب  reason: contains not printable characters */
    public static OkHttpClient m547(int i) {
        int i2 = (-985) ^ C0000.f0;

        if (i2 >= 0) {
            return null;
        } else {
            return C0068Pe.yq(i);
        }
    }

    /* renamed from: شﻡﺏب  reason: contains not printable characters */
    public static String m548(Object obj) {
        int i = (-31) ^ C0006.f6;

        if (i > 0) {
            return null;
        } else {
            return ((AppSx) obj).q;
        }
    }

    /* renamed from: صكﺝﺥ  reason: contains not printable characters */
    public static Request.Builder m549(Object obj, Object obj2) {
        int i = (-675) ^ C0038.f96;

        if (i < 0) {
            return null;
        } else {
            return ((Request.Builder) obj).headers((Headers) obj2);
        }
    }

    /* renamed from: ضبﺥق  reason: contains not printable characters */
    public static InputStream m550(Object obj) {
        int i = (-768) ^ C0002.f2;

        if (i > 0) {
            return null;
        } else {
            return ((ResponseBody) obj).byteStream();
        }
    }

    /* renamed from: عصدخ  reason: contains not printable characters */
    public static String m551(Object obj) {
        int i = (-604) ^ C0013.f13;

        if (i < 0) {
            return null;
        } else {
            return ((AppSx) obj).v;
        }
    }

    /* renamed from: عقﺙر  reason: contains not printable characters */
    public static Call m552(Object obj, Object obj2) {
        int i = 753 ^ C0000.f0;

        if (i <= 0) {
            return null;
        } else {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
    }

    /* renamed from: عﺎفل  reason: contains not printable characters */
    public static String m553(Object obj) {
        int i = 697 ^ C0024.f82;

        if (i <= 0) {
            return null;
        } else {
            return ((AppSx) obj).dT;
        }
    }

    /* renamed from: عﺎيو  reason: contains not printable characters */
    public static String m554(Object obj) {
        int i = (-824) ^ C0004.f4;

        if (i > 0) {
            return null;
        } else {
            return ((AppSx) obj).B;
        }
    }

    /* renamed from: ـصعﺹ  reason: contains not printable characters */
    public static String m555(Object obj, Object obj2) {
        int i = (-732) ^ f2;

        if (i >= 0) {
            return null;
        } else {
            return ((AppSx) obj).N((String) obj2);
        }
    }

    /* renamed from: فكرﺏ  reason: contains not printable characters */
    public static void m556(Object obj) {
        int i = 916 ^ C0002.f2;

        if (i < 0) {
            return;
        } else {
            SpiderDebug.log((Throwable) obj);
            return;
        }
    }

    /* renamed from: ليﻕح  reason: contains not printable characters */
    public static HashMap m557(Object obj) {
        int i = (-487) ^ C0053.f111;

        if (i > 0) {
            return null;
        } else {
            return ((AppSx) obj).i();
        }
    }

    /* renamed from: معﻡﺱ  reason: contains not printable characters */
    public static String m558(Object obj) {
        int i = (-767) ^ C0037.f95;

        if (i <= 0) {
            return null;
        } else {
            return ((AppSx) obj).i;
        }
    }

    /* renamed from: هﺫﻭخ  reason: contains not printable characters */
    public static boolean m559(Object obj, Object obj2) {
        int i = (-487) ^ C0053.f111;

        if (i > 0) {
            return false;
        } else {
            return ((AppSx) obj).SN((String) obj2);
        }
    }

    /* renamed from: هﻉﺫﺱ  reason: contains not printable characters */
    public static String m560(Object obj, Object obj2) {
        int i = 916 ^ C0002.f2;

        if (i < 0) {
            return null;
        } else {
            return ((AppSx) obj).zH((JSONObject) obj2);
        }
    }

    /* renamed from: وﺏغﻝ  reason: contains not printable characters */
    public static String m561(Object obj) {
        int i = 515 ^ C0028.f86;

        if (i <= 0) {
            return null;
        } else {
            return ((AppSx) obj).SN;
        }
    }

    /* renamed from: وﻉﻱت  reason: contains not printable characters */
    public static RequestBody m562(Object obj, Object obj2) {
        int i = (-388) ^ C0035.f93;

        if (i > 0) {
            return null;
        } else {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
    }

    /* renamed from: ﺎمﺱغ  reason: contains not printable characters */
    public static boolean m563(Object obj) {
        int i = (-675) ^ C0038.f96;

        if (i < 0) {
            return false;
        } else {
            return ((AppSx) obj).M();
        }
    }

    /* renamed from: ﺙﺱاﺵ  reason: contains not printable characters */
    public static String m564(Object obj) {
        int i = (-767) ^ C0037.f95;

        if (i <= 0) {
            return null;
        } else {
            return ((AppSx) obj).tF;
        }
    }

    /* renamed from: ﺙﻩرﻍ  reason: contains not printable characters */
    public static void m565(Object obj) {
        int i = 36 ^ C0033.f91;

        if (i > 0) {
            return;
        } else {
            ((AppSx) obj).tF();
            return;
        }
    }

    /* renamed from: ﺥﺩدﺏ  reason: contains not printable characters */
    public static boolean m566(Object obj) {
        int i = 802 ^ C0052.f110;

        if (i > 0) {
            return false;
        } else {
            return ((AppSx) obj).W;
        }
    }

    /* renamed from: ﺥﻩﻁف  reason: contains not printable characters */
    public static Request m567(Object obj) {
        int i = (-1021) ^ C0026.f84;

        if (i > 0) {
            return null;
        } else {
            return ((Request.Builder) obj).build();
        }
    }

    /* renamed from: ﺩﻙﻭظ  reason: contains not printable characters */
    public static String m568(Object obj) {
        int i = 916 ^ C0002.f2;

        if (i < 0) {
            return null;
        } else {
            return ((AppSx) obj).KJ;
        }
    }

    /* renamed from: ﺵزقظ  reason: contains not printable characters */
    public static long m569(Object obj) {
        int i = (-477) ^ C0042.f100;

        if (i <= 0) {
            return 0L;
        } else {
            return ((AppSx) obj).g9;
        }
    }

    /* renamed from: ﺵضحﺝ  reason: contains not printable characters */
    public static String m570(Object obj) {
        int i = 753 ^ C0000.f0;

        if (i < 0) {
            return null;
        } else {
            return ((AppSx) obj).N;
        }
    }

    /* renamed from: ﺽقتا  reason: contains not printable characters */
    public static String m571(Object obj) {
        int i = (-914) ^ C0004.f4;

        if (i >= 0) {
            return null;
        } else {
            return ((AppSx) obj).M;
        }
    }

    /* renamed from: ﻍخفص  reason: contains not printable characters */
    public static JSONObject m572(Object obj) {
        int i = (-406) ^ C0053.f111;

        if (i >= 0) {
            return null;
        } else {
            return ((AppSx) obj).t0();
        }
    }

    /* renamed from: ﻙعﺹب  reason: contains not printable characters */
    public static ResponseBody m573(Object obj) {
        int i = (-314) ^ C0002.f2;

        if (i > 0) {
            return null;
        } else {
            return ((Response) obj).body();
        }
    }

    /* renamed from: ﻝغشﺫ  reason: contains not printable characters */
    public static JSONObject m574(Object obj) {
        int i = (-558) ^ C0039.f97;

        if (i >= 0) {
            return null;
        } else {
            return ((AppSx) obj).v3;
        }
    }

    /* renamed from: ﻝﻁاﺵ  reason: contains not printable characters */
    public static String m576(Object obj) {
        int i = 812 ^ C0022.f80;

        if (i >= 0) {
            return null;
        } else {
            return ((AppSx) obj).t0;
        }
    }

    /* renamed from: ﻩاغط  reason: contains not printable characters */
    public static Request.Builder m577(Object obj, Object obj2) {
        int i = (-675) ^ C0038.f96;

        if (i < 0) {
            return null;
        } else {
            return ((Request.Builder) obj).url((String) obj2);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        int i2;
        String str8 = "vod_remarks";
        String str9 = "vod_pic";
        String str10 = "vod_id";
        String str11 = "page";
        String str12 = "vod_name";
        String str13 = "lang";
        String str14 = "sort";
        String str15 = "class";
        String str16 = "year";
        String str17 = "area";
        try {
            m565(this);
            Object obj = (hashMap.get(str17));
            String str18 = "全部";

            if (!(obj != null)) {
                hashMap.put(str17,str18);
            }
            Object obj2 = (hashMap.get(str16));

            if (!(obj2 != null)) {
                hashMap.put(str16,str18);
            }
            boolean z2 = (hashMap.containsKey(str17));

            if (!z2) {
                str3 = str18;
            } else {
                str3 = (String) (hashMap.get(str17));
                str3 = str18;
            }
            boolean z3 = (hashMap.containsKey(str16));

            if (!z3) {
                str4 = str18;
            } else {
                str4 = (String) (hashMap.get(str16));
                str4 = str18;
            }
            boolean z4 = (hashMap.containsKey(str15));

            if (!z4) {
                str5 = str18;
            } else {
                str5 = (String) (hashMap.get(str15));
                str5 = str18;
            }
            boolean z5 = (hashMap.containsKey(str14));

            if (!z5) {
                str6 = str18;
            } else {
                str6 = (String) (hashMap.get(str14));
                str6 = str18;
            }
            boolean z6 = (hashMap.containsKey(str13));

            if (!z6) {
                str7 = str18;
            } else {
                str7 = (String) (hashMap.get(str13));
                str7 = str18;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m537(this));
            sb.append(m571(this));
            sb.append(m568(this));
            sb.append(m539(this));
            String str19 = (sb.toString());
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str17,str3);
            hashMap2.put(str16,str4);
            hashMap2.put("type_id",str);
            hashMap2.put(str11,str2);
            hashMap2.put(str14,str6);
            hashMap2.put(str13,str7);
            hashMap2.put(str15,str5);
            JSONArray jSONArray = (new JSONObject(m555(this, (new JSONObject((C0005.m167(str19, hashMap2, m557(this)).yq())).getString("data")))).getJSONArray("recommend_list"));
            JSONArray jSONArray2 = new JSONArray();
            int i15 = 0;
            while (true) {
                int i16 = i15;
                int i17 = (jSONArray.length());

                if (i16 < i17) {
                    JSONObject jSONObject2 = (jSONArray.getJSONObject(i16));
                    boolean z7 = C0010.m289((jSONObject2.getString(str12)));
                    if (!(z7)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str10,(jSONObject2.getString(str10)));
                        jSONObject3.put(str12,(jSONObject2.getString(str12)));
                        String str21 = (jSONObject2.getString(str9));
                        boolean z8 = (str21.startsWith("http"));
                        if (!z8) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m537(this));
                            sb2.append("/");
                            sb2.append(str21);
                            str21 = (sb2.toString());
                        }
                        jSONObject3.put(str9,str21);
                        jSONObject3.put(str8,(jSONObject2.getString(str8)));
                        jSONArray2.put(jSONObject3);
                    }
                    i15 = i16 + 1;
                } else {
                    JSONObject jSONObject = new JSONObject();
                    int i19 = (Integer.parseInt(str2));
                    int i20 = (jSONArray.length());
                    if (i20 != 30) {
                        i = i19;
                    } else {
                        i = i19 + 1;
                        i = i19;
                    }
                    jSONObject.put(str11,i19);
                    jSONObject.put("pagecount",i);
                    jSONObject.put("limit",30);
                    String str20 = "total";
                    if (i > 1) {
                        i2 = i * 30;
                    } else {
                        i2 = (jSONArray2.length());
                        i2 = i * 30;
                    }
                    jSONObject.put(str20,i2);
                    jSONObject.put("list",jSONArray2);
                    return (jSONObject.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 521
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r42) {
        /*
        Method dump skipped, instructions count: 3488
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.detailContent(java.util.List):java.lang.String");
    }

    public String getOcrCode(String str) {
        try {
            String str2 = "https://api.nn.ci/ocr/b64/text";
            Request.Builder builder = new Request.Builder();
            StringBuilder sb = new StringBuilder();
            sb.append(m537(this));
            sb.append(m571(this));
            sb.append("verify/create?key=");
            sb.append(str);
            Response response = m543(m552(m547(0), m567(m549(m577(builder, (sb.toString())), m544(m557(this))))));
            boolean z = (TextUtils.isEmpty(m576(this)));

            if (z) {
                InputStream inputStream = m550(m573(response));
                byte[] bArr = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i2 = (inputStream.read(bArr));
                    if (i2 != -1) {
                        byteArrayOutputStream.write(bArr,0,i2);
                    } else {
                        return m546(m573(m543(m552(m547(0), m567(m533(m577(new Request.Builder(), str2), m562(m542("text/plain; charset=utf-8"), C0034.m1790((byteArrayOutputStream.toByteArray()), 0))))))));
                    }
                }
            } else {
                return m576(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 584
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String homeContent(boolean r40) {
        /*
        Method dump skipped, instructions count: 3632
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.homeContent(boolean):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 654
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public void init(android.content.Context r27, java.lang.String r28) {
        /*
        Method dump skipped, instructions count: 3296
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.init(android.content.Context, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 643
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x028d -> B:79:0x0216). Please submit an issue!!! */
    public java.lang.String playerContent(java.lang.String r29, java.lang.String r30, java.util.List<java.lang.String> r31) {
        /*
        Method dump skipped, instructions count: 3522
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        boolean z2 = C0049.m2174(m536(this));

        if (!(z2)) {
            try {
                m572(this);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
        return m538(this, str, 1, null, null);
    }
}
