package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class AppYsV2 extends Spider {
    protected String N;
    private List<String> i;
    private String tF;
    public String yq;
    private String zH;

    static final Pattern Gc = C0005.m166("api\\.php/.*?/vod");
    static final Pattern M = C0005.m166(".*(url|v|vid|php\\?id)=");
    static final Pattern KJ = C0005.m166("https?://[^/]*");
    protected static final Pattern[] q = {C0005.m166("player=new"), C0005.m166("<div id=\"video\""), C0005.m166("<div id=\"[^\"]*?player\""), C0005.m166("//视频链接"), C0005.m166("HlsJsPlayer\\("), C0005.m166("<iframe[\\s\\S]*?src=\"[^\"]+?\""), C0005.m166("<video[\\s\\S]*?src=\"[^\"]+?\"")};
    protected boolean SN = false;
    protected final HashMap<String, ArrayList<String>> t0 = new HashMap<>();

    static {
        C0005.m166("api\\.php/.+?\\.vod");
        C0005.m166("/.+\\?.+=");
    }

    public AppYsV2() {
        String str = "";
        this.yq = str;
        this.N = str;
        this.tF = str;
        this.zH = str;

        return;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 421
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    private java.lang.String B(java.lang.String r11, java.lang.String r12) {
        /*
        Method dump skipped, instructions count: 2010
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.B(java.lang.String, java.lang.String):java.lang.String");
    }

    private boolean G(String str) {
        boolean z = (str.equals("伦理"));

        if (!(z)) {
            boolean z2 = (str.equals("情色"));
            if (!(z2)) {
                boolean z3 = (str.equals("福利"));
                if (!z3) {
                    return false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private String G4(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = (jSONArray.length());

                if (i < i2) {
                    arrayList.add((jSONArray.getString(i)));
                    i++;
                } else {
                    return (TextUtils.join(",",arrayList));
                }
            }
        } catch (JSONException e) {
            return "";
        }
    }

    private HashMap<String, String> Gc(String str) {
        String str2;
        HashMap<String, String> hashMap = new HashMap<>();
        boolean z = (str.contains("vod.9e03.com"));

        if (!z) {
            boolean z2 = (str.contains("api.php/app"));
            if (!(z2)) {
                boolean z3 = (str.contains("xgapp"));
                if (!(z3)) {
                    boolean z4 = (str.contains("freekan"));
                    if (!z4) {
                        boolean z5 = (str.contains("zsb"));
                        if (!(z5)) {
                            boolean z6 = (str.contains("fkxs"));
                            if (!(z6)) {
                                boolean z7 = (str.contains("xays"));
                                if (!(z7)) {
                                    boolean z8 = (str.contains("xcys"));
                                    if (!(z8)) {
                                        boolean z9 = (str.contains("szys"));
                                        if (!(z9)) {
                                            boolean z10 = (str.contains("dxys"));
                                            if (!(z10)) {
                                                boolean z11 = (str.contains("ytys"));
                                                if (!(z11)) {
                                                    boolean z12 = (str.contains("qnys"));
                                                    if (!z12) {
                                                        boolean z13 = (str.contains(".vod"));
                                                        if (!z13) {
                                                            str2 = "Dalvik/2.1.0";
                                                        } else {
                                                            str2 = "okhttp/4.1.0";
                                                            str2 = "Dalvik/2.1.0";
                                                        }
                                                    } else {
                                                        boolean z13 = (str.contains(".vod"));
                                                        if (!z13) {
                                                            str2 = "Dalvik/2.1.0";
                                                        } else {
                                                            str2 = "okhttp/4.1.0";
                                                            str2 = "Dalvik/2.1.0";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        str2 = "Dart/2.15 (dart:io)";
                    } else {
                        boolean z5 = (str.contains("zsb"));
                        if (!(z5)) {
                            boolean z6 = (str.contains("fkxs"));
                            if (!(z6)) {
                                boolean z7 = (str.contains("xays"));
                                if (!(z7)) {
                                    boolean z8 = (str.contains("xcys"));
                                    if (!(z8)) {
                                        boolean z9 = (str.contains("szys"));
                                        if (!(z9)) {
                                            boolean z10 = (str.contains("dxys"));
                                            if (!(z10)) {
                                                boolean z11 = (str.contains("ytys"));
                                                if (!(z11)) {
                                                    boolean z12 = (str.contains("qnys"));
                                                    if (!z12) {
                                                        boolean z13 = (str.contains(".vod"));
                                                        if (!z13) {
                                                            str2 = "Dalvik/2.1.0";
                                                        } else {
                                                            str2 = "okhttp/4.1.0";
                                                            str2 = "Dalvik/2.1.0";
                                                        }
                                                    } else {
                                                        boolean z13 = (str.contains(".vod"));
                                                        if (!z13) {
                                                            str2 = "Dalvik/2.1.0";
                                                        } else {
                                                            str2 = "okhttp/4.1.0";
                                                            str2 = "Dalvik/2.1.0";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        str2 = "Dart/2.15 (dart:io)";
                    }
                }
            }
            str2 = "Dart/2.14 (dart:io)";
        } else {
            str2 = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36";
            boolean z2 = (str.contains("api.php/app"));
            if (!(z2)) {
                boolean z3 = (str.contains("xgapp"));
                if (!(z3)) {
                    boolean z4 = (str.contains("freekan"));
                    if (!z4) {
                        boolean z5 = (str.contains("zsb"));
                        if (!(z5)) {
                            boolean z6 = (str.contains("fkxs"));
                            if (!(z6)) {
                                boolean z7 = (str.contains("xays"));
                                if (!(z7)) {
                                    boolean z8 = (str.contains("xcys"));
                                    if (!(z8)) {
                                        boolean z9 = (str.contains("szys"));
                                        if (!(z9)) {
                                            boolean z10 = (str.contains("dxys"));
                                            if (!(z10)) {
                                                boolean z11 = (str.contains("ytys"));
                                                if (!(z11)) {
                                                    boolean z12 = (str.contains("qnys"));
                                                    if (!z12) {
                                                        boolean z13 = (str.contains(".vod"));
                                                        if (!z13) {
                                                            str2 = "Dalvik/2.1.0";
                                                        } else {
                                                            str2 = "okhttp/4.1.0";
                                                            str2 = "Dalvik/2.1.0";
                                                        }
                                                    } else {
                                                        boolean z13 = (str.contains(".vod"));
                                                        if (!z13) {
                                                            str2 = "Dalvik/2.1.0";
                                                        } else {
                                                            str2 = "okhttp/4.1.0";
                                                            str2 = "Dalvik/2.1.0";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        str2 = "Dart/2.15 (dart:io)";
                    } else {
                        boolean z5 = (str.contains("zsb"));
                        if (!(z5)) {
                            boolean z6 = (str.contains("fkxs"));
                            if (!(z6)) {
                                boolean z7 = (str.contains("xays"));
                                if (!(z7)) {
                                    boolean z8 = (str.contains("xcys"));
                                    if (!(z8)) {
                                        boolean z9 = (str.contains("szys"));
                                        if (!(z9)) {
                                            boolean z10 = (str.contains("dxys"));
                                            if (!(z10)) {
                                                boolean z11 = (str.contains("ytys"));
                                                if (!(z11)) {
                                                    boolean z12 = (str.contains("qnys"));
                                                    if (!z12) {
                                                        boolean z13 = (str.contains(".vod"));
                                                        if (!z13) {
                                                            str2 = "Dalvik/2.1.0";
                                                        } else {
                                                            str2 = "okhttp/4.1.0";
                                                            str2 = "Dalvik/2.1.0";
                                                        }
                                                    } else {
                                                        boolean z13 = (str.contains(".vod"));
                                                        if (!z13) {
                                                            str2 = "Dalvik/2.1.0";
                                                        } else {
                                                            str2 = "okhttp/4.1.0";
                                                            str2 = "Dalvik/2.1.0";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        str2 = "Dart/2.15 (dart:io)";
                    }
                }
            }
            str2 = "Dart/2.14 (dart:io)";
        }
        hashMap.put("User-Agent",str2);
        return hashMap;
    }

    private void KJ() {
        boolean z = (TextUtils.isEmpty(m617(this)));

        if (z) {
            int i2 = (C0057.m2383(this).lastIndexOf("."));
            StringBuilder sb = new StringBuilder();
            sb.append((C0057.m2383(this).substring(0,i2 + 1)));
            sb.append("Vodad");
            String str = (sb.toString());
            this.N = ((new JSONObject(C0001.m32(str, m614(this, str))).optJSONObject("data")).optString("jiexi_key"));
            return;
        } else {
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cf A[SYNTHETIC] */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    private void SN(org.json.JSONObject r8, java.lang.String r9, java.util.ArrayList<org.json.JSONArray> r10) {
        /*
        Method dump skipped, instructions count: 358
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.SN(org.json.JSONObject, java.lang.String, java.util.ArrayList):void");
    }

    public static String xiaFanSign(Map<String, String> map, String str) {
        TreeMap treeMap = new TreeMap(map);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((treeMap.entrySet()).iterator());
        while (true) {
            boolean z = (it.hasNext());

            if (z) {
                Map.Entry entry = (Map.Entry) (it.next());
                String str2 = (String) (entry.getKey());
                String str3 = (String) (entry.getValue());
                boolean z2 = (str3.isEmpty());
                if (!z2) {
                    int i3 = (sb.length());
                    if (i3 > 0) {
                        sb.append("&");
                    }
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sb);
                sb2.append(str);
                return C0023.m1463((sb2.toString()));
            }
        }
    }

    /* renamed from: اطﺹﺎ  reason: contains not printable characters */
    public static String m600(Object obj, Object obj2) {
        int i = 753 ^ C0000.f0;

        return ((AppYsV2) obj).tF((String) obj2);
    }

    /* renamed from: تفنﺫ  reason: contains not printable characters */
    public static void m601(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = (-388) ^ C0035.f93;

        ((AppYsV2) obj).N((String) obj2, (JSONObject) obj3, (JSONObject) obj4, (String) obj5);
        return;
    }

    /* renamed from: تﻙﻅس  reason: contains not printable characters */
    public static List m602(Object obj) {
        int i = 596 ^ C0009.f9;

        return ((AppYsV2) obj).i;
    }

    /* renamed from: حﻭﺭف  reason: contains not printable characters */
    public static Pattern m603() {
        int i = (-675) ^ C0038.f96;

        return Gc;
    }

    /* renamed from: ذبشﻁ  reason: contains not printable characters */
    public static String m604(Object obj) {
        int i = (-767) ^ C0037.f95;

        return ((AppYsV2) obj).zH;
    }

    /* renamed from: رﻩظد  reason: contains not printable characters */
    public static String m606(Object obj, Object obj2) {
        int i = (-556) ^ C0004.f4;

        return ((AppYsV2) obj).M((String) obj2);
    }

    /* renamed from: سبغﺥ  reason: contains not printable characters */
    public static void m607(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 812 ^ C0022.f80;

        ((AppYsV2) obj).SN((JSONObject) obj2, (String) obj3, (ArrayList) obj4);
        return;
    }

    /* renamed from: طﺙغﻡ  reason: contains not printable characters */
    public static Pattern[] m608() {
        int i = (-821) ^ C0025.f83;

        return q;
    }

    /* renamed from: غضسﺫ  reason: contains not printable characters */
    public static void m609(Object obj) {
        int i = (-821) ^ C0025.f83;

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: ـدصﻡ  reason: contains not printable characters */
    public static String m610(Object obj, Object obj2) {
        int i = (-767) ^ C0037.f95;

        return ((AppYsV2) obj).G4((JSONArray) obj2);
    }

    /* renamed from: ﺏهﻝﺹ  reason: contains not printable characters */
    public static void m611(Object obj) {
        int i = 930 ^ C0038.f96;

        SpiderDebug.log((String) obj);
        return;
    }

    /* renamed from: ﺏﻁﻙط  reason: contains not printable characters */
    public static String m612(Object obj, Object obj2, Object obj3) {
        int i = (-821) ^ C0025.f83;

        return ((AppYsV2) obj).i((String) obj2, (JSONObject) obj3);
    }

    /* renamed from: ﺥبطل  reason: contains not printable characters */
    public static Pattern m613() {
        int i = 515 ^ C0028.f86;

        return M;
    }

    /* renamed from: ﺥﺯسﺙ  reason: contains not printable characters */
    public static HashMap m614(Object obj, Object obj2) {
        int i = (-703) ^ C0036.f94;

        return ((AppYsV2) obj).Gc((String) obj2);
    }

    /* renamed from: ﺩﺭسل  reason: contains not printable characters */
    public static String m615(Object obj, Object obj2) {
        int i = 215 ^ C0038.f96;

        return ((AppYsV2) obj).q((String) obj2);
    }

    /* renamed from: ﺯظﺕح  reason: contains not printable characters */
    public static String m616(Object obj, Object obj2) {
        int i = (-422) ^ C0033.f91;

        return ((AppYsV2) obj).yq((String) obj2);
    }

    /* renamed from: ﺵحﺙخ  reason: contains not printable characters */
    public static String m617(Object obj) {
        int i = (-556) ^ C0004.f4;

        return ((AppYsV2) obj).N;
    }

    /* renamed from: ﺵعكث  reason: contains not printable characters */
    public static Pattern m618() {
        int i = 215 ^ C0038.f96;

        return KJ;
    }

    /* renamed from: ﺵنغﻱ  reason: contains not printable characters */
    public static String m619(Object obj, Object obj2) {
        int i = (-703) ^ C0036.f94;

        return ((AppYsV2) obj).zH((String) obj2);
    }

    /* renamed from: ﺹضهﻉ  reason: contains not printable characters */
    public static JSONObject m620(Object obj, Object obj2, Object obj3) {
        int i = (-422) ^ C0033.f91;

        return ((AppYsV2) obj).t0((ArrayList) obj2, (String) obj3);
    }

    /* renamed from: ﻉـنغ  reason: contains not printable characters */
    public static boolean m621(Object obj) {
        int i = 909 ^ C0002.f2;

        return ((AppYsV2) obj).SN;
    }

    /* renamed from: ﻍسﻙﺫ  reason: contains not printable characters */
    public static void m622(Object obj) {
        int i = 753 ^ C0000.f0;

        ((AppYsV2) obj).KJ();

        return;
    }

    /* renamed from: ﻡﻩﻱا  reason: contains not printable characters */
    public static HashMap m623(Object obj) {
        int i = 624 ^ C0012.f12;

        return ((AppYsV2) obj).t0;
    }

    /* renamed from: ﻩخفﺱ  reason: contains not printable characters */
    public static boolean m624(Object obj, Object obj2) {
        int i = (-31) ^ C0006.f6;

        return ((AppYsV2) obj).G((String) obj2);
    }

    /* renamed from: ﻩغقش  reason: contains not printable characters */
    public static String m625(Object obj) {
        int i = (-31) ^ C0041.f99;

        return ((AppYsV2) obj).tF;
    }

    /* renamed from: ﻭﺯﻡﺫ  reason: contains not printable characters */
    public static String m626(Object obj, Object obj2, Object obj3) {
        int i = 125 ^ C0037.f95;

        return ((AppYsV2) obj).B((String) obj2, (String) obj3);
    }

    final String M(String str) {
        StringBuilder sb;
        String str2;
        boolean z = (str.contains("api.php/app"));

        if (!(z)) {
            boolean z2 = (str.contains("xgapp"));
            if (!z2) {
                boolean z3 = (str.contains(".vod"));
                if (!z3) {
                    return "";
                } else {
                    boolean z4 = (str.contains("iopenyun"));
                    if (!z4) {
                        sb = C0052.m2253(str);
                        str2 = "/detail?vod_id=";
                    } else {
                        sb = C0052.m2253(str);
                        str2 = "/detailID?vod_id=";
                        sb = C0052.m2253(str);
                        str2 = "/detail?vod_id=";
                    }
                    return "";
                }
            } else {
                boolean z3 = (str.contains(".vod"));
                if (!z3) {
                    return "";
                } else {
                    boolean z4 = (str.contains("iopenyun"));
                    if (!z4) {
                        sb = C0052.m2253(str);
                        str2 = "/detail?vod_id=";
                    } else {
                        sb = C0052.m2253(str);
                        str2 = "/detailID?vod_id=";
                        sb = C0052.m2253(str);
                        str2 = "/detail?vod_id=";
                    }
                    return "";
                }
            }
        }
        boolean z5 = (str.contains("dijiaxia"));

        if (!z5) {
            boolean z6 = (str.contains("1010dy"));
            if (!z6) {
                sb = C0052.m2253(str);
                str2 = "video_detail?id=";
            } else {
                return "http://www.1010dy.cc/api.php/app/video_detail?id=";
            }
        } else {
            return "https://www.dijiaxia.com/api.php/app/video_detail?id=";
        }
        sb.append(str2);
        return (sb.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 612
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    protected final void N(java.lang.String r30, org.json.JSONObject r31, org.json.JSONObject r32, java.lang.String r33) {
        /*
        Method dump skipped, instructions count: 4630
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.N(java.lang.String, org.json.JSONObject, org.json.JSONObject, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 583
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String categoryContent(java.lang.String r24, java.lang.String r25, boolean r26, java.util.HashMap<java.lang.String, java.lang.String> r27) {
        /*
        Method dump skipped, instructions count: 2990
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(m606(this, C0057.m2383(this)));
            sb.append((String) (list.get(0)));
            String str = m616(this, (sb.toString()));
            m611(str);
            JSONObject jSONObject = new JSONObject(C0001.m32(str, m614(this, str)));
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            m601(this, C0057.m2383(this), jSONObject, jSONObject3, (String) (list.get(0)));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("list",jSONArray);
            return (jSONObject2.toString());
        } catch (Exception e) {
            m609(e);
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 615
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String homeContent(boolean r36) {
        /*
        Method dump skipped, instructions count: 2892
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.homeContent(boolean):java.lang.String");
    }

    public String homeVideoContent() {
        boolean z;
        int i = 1771;
        int i2 = 0;
        String str = "title";
        try {
            String str2 = m615(this, C0057.m2383(this));
            boolean z2 = (str2.isEmpty());

            if (!z2) {
                z = false;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(m600(this, C0057.m2383(this)));
                sb.append("movie&page=1&area=&type=&start=");
                str2 = (sb.toString());
                z = true;
                z = false;
            }
            String str3 = m616(this, str2);
            m611(str3);
            JSONObject jSONObject = new JSONObject(C0001.m32(str3, m614(this, str3)));
            JSONArray jSONArray = new JSONArray();
            String str4 = "vod_remarks";
            String str5 = "vod_pic";
            String str6 = "vod_id";
            String str7 = "vod_name";

            if (!z) {
                ArrayList arrayList = new ArrayList();
                m607(this, jSONObject, "vlist", arrayList);
                boolean z3 = (arrayList.isEmpty());
                if (z3) {
                    m607(this, jSONObject, "vod_list", arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = (arrayList.iterator());
                while (true) {
                    boolean z4 = (it.hasNext());
                    if (z4) {
                        JSONArray jSONArray2 = (JSONArray) (it.next());
                        int i7 = 0;
                        while (true) {
                            int i8 = (jSONArray2.length());
                            if (i7 < i8) {
                                JSONObject jSONObject2 = (jSONArray2.getJSONObject(i7));
                                boolean z5 = C0010.m289((jSONObject2.getString(str7)));
                                if (!(z5)) {
                                    String str8 = (jSONObject2.getString(str6));
                                    boolean z6 = (arrayList2.contains(str8));
                                    if (!(z6)) {
                                        arrayList2.add(str8);
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put(str6,str8);
                                        jSONObject3.put(str7,(jSONObject2.getString(str7)));
                                        jSONObject3.put(str5,(jSONObject2.getString(str5)));
                                        jSONObject3.put(str4,(jSONObject2.getString(str4)));
                                        jSONArray.put(jSONObject3);
                                    }
                                }
                                i7++;
                            }
                        }
                    }
                }
            } else {
                JSONArray jSONArray3 = (jSONObject.getJSONArray("data"));
                while (true) {
                    int i15 = (jSONArray3.length());
                    if (i2 < i15) {
                        JSONObject jSONObject4 = (jSONArray3.getJSONObject(i2));
                        boolean z7 = C0010.m289((jSONObject4.getString(str)));
                        if (!(z7)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(str6,(jSONObject4.getString("nextlink")));
                            jSONObject5.put(str7,(jSONObject4.getString(str)));
                            jSONObject5.put(str5,(jSONObject4.getString("pic")));
                            jSONObject5.put(str4,(jSONObject4.getString("state")));
                            jSONArray.put(jSONObject5);
                        }
                        i2++;
                    }
                }
                ArrayList arrayList = new ArrayList();
                m607(this, jSONObject, "vlist", arrayList);
                boolean z3 = (arrayList.isEmpty());
                if (z3) {
                    m607(this, jSONObject, "vod_list", arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = (arrayList.iterator());
                while (true) {
                    boolean z4 = (it.hasNext());
                    if (z4) {
                        JSONArray jSONArray2 = (JSONArray) (it.next());
                        int i7 = 0;
                        while (true) {
                            int i8 = (jSONArray2.length());
                            if (i7 < i8) {
                                JSONObject jSONObject2 = (jSONArray2.getJSONObject(i7));
                                boolean z5 = C0010.m289((jSONObject2.getString(str7)));
                                if (!(z5)) {
                                    String str8 = (jSONObject2.getString(str6));
                                    boolean z6 = (arrayList2.contains(str8));
                                    if (!(z6)) {
                                        arrayList2.add(str8);
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put(str6,str8);
                                        jSONObject3.put(str7,(jSONObject2.getString(str7)));
                                        jSONObject3.put(str5,(jSONObject2.getString(str5)));
                                        jSONObject3.put(str4,(jSONObject2.getString(str4)));
                                        jSONArray.put(jSONObject3);
                                    }
                                }
                                i7++;
                            }
                        }
                    }
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("list",jSONArray);
            return (jSONObject6.toString());
        } catch (Exception e) {
            m609(e);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    r2 = new java.lang.StringBuilder();
    r2.append(r1);
    r2.append("筛选");
    r2.append(r0);
    r2.append("+全部=+");
    r2.append(((r14.getString(r0)).replace(",","+")));
    r2.append("\n");
    r1 = (r2.toString());
    */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012b, code lost:
    r1 = 49790;
    */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012e, code lost:
    r1 = r1 ^ 49807;
    */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0132, code lost:
    switch(r1) {
        case 18: goto L141;
        case 241: goto L142;
        default: goto L144;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0139, code lost:
    r1 = 49821;
    */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013e, code lost:
    r0 = 49914;
    */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
    r0 = r0 ^ 49931;
    */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0145, code lost:
    switch(r0) {
        case 497: goto L146;
        case 1711: goto L96;
        default: goto L148;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0149, code lost:
    r0 = 50596;
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.String i(java.lang.String r13, org.json.JSONObject r14) {
        /*
        Method dump skipped, instructions count: 712
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.i(java.lang.String, org.json.JSONObject):java.lang.String");
    }

    public void init(Context context, String str) {
        String str2 = "adFlag";
        String str3 = "sign";
        String str4 = "apiKey";
        String str5 = "rc4";
        String str6 = "url";
        AppYsV2.super.init(context, str);
        boolean z = (str.startsWith("http"));

        if (!z) {
            try {
                JSONObject jSONObject = new JSONObject(C0049.m2191(str));
                boolean z2 = (jSONObject.has(str6));
                if (z2) {
                    this.yq = (jSONObject.getString(str6));
                }
                boolean z3 = (jSONObject.has(str5));
                if (z3) {
                    this.SN = (jSONObject.getBoolean(str5));
                }
                boolean z4 = (jSONObject.has(str4));
                if (z4) {
                    this.tF = (jSONObject.getString(str4));
                }
                boolean z5 = (jSONObject.has(str3));
                if (z5) {
                    this.zH = (jSONObject.getString(str3));
                }
                boolean z6 = (jSONObject.has(str2));
                if (z6) {
                    this.i = (Arrays.asList(((jSONObject.getString(str2)).split("\\|"))));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                break;
            }
        } else {
            this.yq = str;
            try {
                JSONObject jSONObject = new JSONObject(C0049.m2191(str));
                boolean z2 = (jSONObject.has(str6));
                if (z2) {
                    this.yq = (jSONObject.getString(str6));
                }
                boolean z3 = (jSONObject.has(str5));
                if (z3) {
                    this.SN = (jSONObject.getBoolean(str5));
                }
                boolean z4 = (jSONObject.has(str4));
                if (z4) {
                    this.tF = (jSONObject.getString(str4));
                }
                boolean z5 = (jSONObject.has(str3));
                if (z5) {
                    this.zH = (jSONObject.getString(str3));
                }
                boolean z6 = (jSONObject.has(str2));
                if (z6) {
                    this.i = (Arrays.asList(((jSONObject.getString(str2)).split("\\|"))));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                break;
            }
        }

        return;
    }

    public boolean isVideoFormat(String str) {
        return C0042.m2005(str);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        ArrayList arrayList;
        String str3 = "";
        C0029.m1662();
        C0056.m2351(true);
        try {
            ArrayList arrayList2 = (ArrayList) (m623(this).get((str.replace("免费分享",str3))));

            if (arrayList2 != null) {
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
                arrayList = arrayList2;
            }
            boolean z = (arrayList.isEmpty());

            if (!(z)) {
                JSONObject jSONObject = m620(this, arrayList, str2);
                if (!(jSONObject == null)) {
                    return (jSONObject.toString());
                }
            }
            boolean z2 = C0042.m2005(str2);
            String str4 = "danmaku";
            String str5 = "url";
            String str6 = "parse";

            if (!z2) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str6,1);
                jSONObject2.put("jx","1");
                jSONObject2.put(str5,str2);
                jSONObject2.put(str4,C0033.m1778(str2));
                return (jSONObject2.toString());
            } else {
                JSONObject jSONObject3 = new JSONObject();
                boolean z3 = (str2.contains("m3u8"));
                if (z3) {
                    str2 = C0048.m2137(str2, null);
                }
                jSONObject3.put(str6,0);
                jSONObject3.put("playUrl",str3);
                jSONObject3.put(str5,str2);
                jSONObject3.put(str4,C0033.m1778(str2));
                return (jSONObject3.toString());
            }
        } catch (Exception e) {
            m609(e);
            return str3;
        }
    }

    final String q(String str) {
        StringBuilder sb;
        String str2;
        boolean z = (str.contains("api.php/app"));

        if (!(z)) {
            boolean z2 = (str.contains("xgapp"));
            if (!z2) {
                boolean z3 = (str.contains(".vod"));
                if (!z3) {
                    return "";
                } else {
                    sb = C0052.m2253(str);
                    str2 = "/vodPhbAll";
                    return "";
                }
            } else {
                boolean z3 = (str.contains(".vod"));
                if (!z3) {
                    return "";
                } else {
                    sb = C0052.m2253(str);
                    str2 = "/vodPhbAll";
                    return "";
                }
            }
        }
        sb = C0052.m2253(str);
        str2 = "index_video?token=";
        sb.append(str2);
        return (sb.toString());
    }

    public String searchContent(String str, boolean z) {
        String str2;
        int i;
        String str3 = "vod_id";
        String str4 = "list";
        String str5 = "data";
        try {
            String str6 = m616(this, m626(this, C0057.m2383(this), C0009.m260(str, "UTF-8")));
            JSONObject jSONObject = new JSONObject(C0001.m32(str6, m614(this, str6)));
            JSONArray jSONArray = null;
            JSONArray jSONArray2 = new JSONArray();
            boolean z2 = (jSONObject.has(str4));

            if (z2) {
                boolean z3 = (jSONObject.get(str4)) instanceof JSONArray;
                if (z3) {
                    jSONArray = (jSONObject.getJSONArray(str4));
                }
            }
            boolean z4 = (jSONObject.has(str5));

            if (z4) {
                boolean z5 = (jSONObject.get(str5)) instanceof JSONObject;
                if (z5) {
                    boolean z6 = ((jSONObject.getJSONObject(str5)).has(str4));
                    if (z6) {
                        boolean z7 = ((jSONObject.getJSONObject(str5)).get(str4)) instanceof JSONArray;
                        if (z7) {
                            jSONArray = ((jSONObject.getJSONObject(str5)).getJSONArray(str4));
                        }
                    }
                }
            }
            boolean z8 = (jSONObject.has(str5));

            if (z8) {
                boolean z9 = (jSONObject.get(str5)) instanceof JSONArray;
                if (z9) {
                    jSONArray = (jSONObject.getJSONArray(str5));
                }
            }

            if (!(jSONArray == null)) {
                int i13 = 0;
                while (true) {
                    int i14 = i13;
                    int i15 = (jSONArray.length());
                    if (i14 < i15) {
                        try {
                            JSONObject jSONObject2 = (jSONArray.getJSONObject(i14));
                            JSONObject jSONObject3 = new JSONObject();
                            boolean z10 = (jSONObject2.has(str3));
                            String str7 = "vod_remarks";
                            String str8 = "vod_pic";
                            String str9 = "vod_name";
                            if (z10) {
                                String str11 = (jSONObject2.getString(str9));
                                boolean z12 = C0010.m289(str11);
                                if (!(z12)) {
                                    jSONObject3.put(str3,(jSONObject2.getString(str3)));
                                    jSONObject3.put(str9,str11);
                                    jSONObject3.put(str8,(jSONObject2.getString(str8)));
                                    str2 = (jSONObject2.getString(str7));
                                }
                            } else {
                                String str10 = (jSONObject2.getString("title"));
                                boolean z11 = C0010.m289(str10);
                                if (!(z11)) {
                                    jSONObject3.put(str3,(jSONObject2.getString("nextlink")));
                                    jSONObject3.put(str9,str10);
                                    jSONObject3.put(str8,(jSONObject2.getString("pic")));
                                    str2 = (jSONObject2.getString("state"));
                                }
                            }
                            jSONObject3.put(str7,str2);
                            jSONArray2.put(jSONObject3);
                            i = 54533;
                        } catch (Exception e) {
                            m609(e);
                        }
                        i13 = i14 + 1;
                    }
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(str4,jSONArray2);
            return (jSONObject4.toString());
        } catch (Exception e2) {
            m609(e2);
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 357
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    protected final org.json.JSONObject t0(java.util.ArrayList r21, java.lang.String r22) {
        /*
        Method dump skipped, instructions count: 1266
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.t0(java.util.ArrayList, java.lang.String):org.json.JSONObject");
    }

    final String tF(String str) {
        StringBuilder sb;
        String str2;
        boolean z = (str.contains("api.php/app"));

        if (!(z)) {
            boolean z2 = (str.contains("xgapp"));
            if (!z2) {
                boolean z3 = (str.contains(".vod"));
                if (!z3) {
                    sb = C0052.m2253(str);
                    str2 = "?ac=list&class=";
                } else {
                    boolean z4 = (str.contains("iopenyun"));
                    if (!z4) {
                        sb = C0052.m2253(str);
                        str2 = "?type=";
                    } else {
                        sb = C0052.m2253(str);
                        str2 = "/list?type=";
                        sb = C0052.m2253(str);
                        str2 = "?type=";
                    }
                    sb = C0052.m2253(str);
                    str2 = "?ac=list&class=";
                }
            } else {
                boolean z3 = (str.contains(".vod"));
                if (!z3) {
                    sb = C0052.m2253(str);
                    str2 = "?ac=list&class=";
                } else {
                    boolean z4 = (str.contains("iopenyun"));
                    if (!z4) {
                        sb = C0052.m2253(str);
                        str2 = "?type=";
                    } else {
                        sb = C0052.m2253(str);
                        str2 = "/list?type=";
                        sb = C0052.m2253(str);
                        str2 = "?type=";
                    }
                    sb = C0052.m2253(str);
                    str2 = "?ac=list&class=";
                }
            }
        }
        boolean z5 = (str.contains("dijiaxia"));

        if (!z5) {
            sb = C0052.m2253(str);
            str2 = "video?tid=";
        } else {
            return "http://www.dijiaxia.com/api.php/app/video?tid=";
        }
        sb.append(str2);
        return (sb.toString());
    }

    protected final String yq(String str) {
        String str2;
        String str3;
        String str4;
        int i;
        boolean z = (TextUtils.isEmpty(m625(this)));

        if (!z) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH");
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("mm");
            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyyMMdd");
            String str5 = (simpleDateFormat.format(date));
            String str6 = (simpleDateFormat2.format(date));
            String str7 = (simpleDateFormat3.format(date));
            boolean z2 = ("date".equals(m625(this)));
            String str8 = ":";
            if (!z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(str5);
                sb.append(str8);
                sb.append(str6);
                sb.append(str8);
                sb.append(str5);
                sb.append(str8);
                sb.append(str7);
                sb.append(str8);
                sb.append(m625(this));
                str2 = (sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str5);
                sb2.append(str8);
                sb2.append(str6);
                sb2.append(str8);
                sb2.append(str5);
                sb2.append(str8);
                sb2.append(str7);
                sb2.append(str8);
                sb2.append((simpleDateFormat4.format(date)));
                str2 = (sb2.toString());
                StringBuilder sb = new StringBuilder();
                sb.append(str5);
                sb.append(str8);
                sb.append(str6);
                sb.append(str8);
                sb.append(str5);
                sb.append(str8);
                sb.append(str7);
                sb.append(str8);
                sb.append(m625(this));
                str2 = (sb.toString());
            }
            String str9 = C0052.m2266(str2);
            String str10 = (String.valueOf(System.currentTimeMillis() / 1000));
            boolean z3 = (TextUtils.isEmpty(m604(this)));
            String str11 = "\\?";
            if (!z3) {
                String[] strArr = (str.split(str11,-1));
                String str12 = strArr[0];
                int length = strArr.length;
                String str13 = "";
                boolean z4 = true;
                if (length <= 1) {
                    str3 = str13;
                } else {
                    str3 = strArr[1];
                    str3 = str13;
                }
                HashMap hashMap = new HashMap();
                boolean z5 = (str3.isEmpty());
                String str14 = "=";
                String str15 = "&";
                if (!(z5)) {
                    String[] strArr2 = (str3.split(str15));
                    int length2 = strArr2.length;
                    int i9 = 0;
                    while (true) {
                        int i10 = i9;
                        if (i10 < length2) {
                            String[] strArr3 = (strArr2[i10].split(str14,2));
                            String str16 = strArr3[0];
                            int length3 = strArr3.length;
                            if (length3 > 1) {
                                str4 = strArr3[1];
                            } else {
                                str4 = str13;
                            }
                            try {
                                str4 = C0039.m1929(str4, "UTF-8");
                                i = 51712;
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }
                            hashMap.put(str16,str4);
                            i9 = i10 + 1;
                        }
                    }
                }
                hashMap.put("keytime",str10);
                hashMap.put("apikey",str9);
                hashMap.put("timestamp",str10);
                String str17 = C0002.m58(hashMap, m604(this));
                StringBuilder sb3 = new StringBuilder(str12);
                boolean z6 = (hashMap.isEmpty());
                if (!(z6)) {
                    sb3.append("?");
                    Iterator it = ((hashMap.entrySet()).iterator());
                    while (true) {
                        boolean z7 = (it.hasNext());
                        if (z7) {
                            Map.Entry entry = (Map.Entry) (it.next());
                            if (!z4) {
                                sb3.append(str15);
                            }
                            sb3.append((String) (entry.getKey()));
                            sb3.append(str14);
                            sb3.append((String) (entry.getValue()));
                            z4 = false;
                        }
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append("&datasign=");
                sb4.append(str17);
                return (sb4.toString());
            } else {
                boolean z8 = (str.contains(str11));
                String str18 = "&apikey=";
                if (!z8) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str);
                    sb5.append("?keytime=");
                    sb5.append(str10);
                    sb5.append(str18);
                    sb5.append(str9);
                    return (sb5.toString());
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append("&keytime=");
                    sb6.append(str10);
                    sb6.append(str18);
                    sb6.append(str9);
                    return (sb6.toString());
                }
                String[] strArr = (str.split(str11,-1));
                String str12 = strArr[0];
                int length = strArr.length;
                String str13 = "";
                boolean z4 = true;
                if (length <= 1) {
                    str3 = str13;
                } else {
                    str3 = strArr[1];
                    str3 = str13;
                }
                HashMap hashMap = new HashMap();
                boolean z5 = (str3.isEmpty());
                String str14 = "=";
                String str15 = "&";
                if (!(z5)) {
                    String[] strArr2 = (str3.split(str15));
                    int length2 = strArr2.length;
                    int i9 = 0;
                    while (true) {
                        int i10 = i9;
                        if (i10 < length2) {
                            String[] strArr3 = (strArr2[i10].split(str14,2));
                            String str16 = strArr3[0];
                            int length3 = strArr3.length;
                            if (length3 > 1) {
                                str4 = strArr3[1];
                            } else {
                                str4 = str13;
                            }
                            try {
                                str4 = C0039.m1929(str4, "UTF-8");
                                i = 51712;
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }
                            hashMap.put(str16,str4);
                            i9 = i10 + 1;
                        }
                    }
                }
                hashMap.put("keytime",str10);
                hashMap.put("apikey",str9);
                hashMap.put("timestamp",str10);
                String str17 = C0002.m58(hashMap, m604(this));
                StringBuilder sb3 = new StringBuilder(str12);
                boolean z6 = (hashMap.isEmpty());
                if (!(z6)) {
                    sb3.append("?");
                    Iterator it = ((hashMap.entrySet()).iterator());
                    while (true) {
                        boolean z7 = (it.hasNext());
                        if (z7) {
                            Map.Entry entry = (Map.Entry) (it.next());
                            if (!z4) {
                                sb3.append(str15);
                            }
                            sb3.append((String) (entry.getKey()));
                            sb3.append(str14);
                            sb3.append((String) (entry.getValue()));
                            z4 = false;
                        }
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append("&datasign=");
                sb4.append(str17);
                return (sb4.toString());
            }
        } else {
            return str;
        }
    }

    final String zH(String str) {
        StringBuilder sb;
        String str2;
        boolean z = (str.contains("api.php/app"));

        if (!(z)) {
            boolean z2 = (str.contains("xgapp"));
            if (!z2) {
                boolean z3 = (str.contains(".vod"));
                if (!z3) {
                    return "";
                } else {
                    sb = C0052.m2253(str);
                    str2 = "/types";
                    return "";
                }
            } else {
                boolean z3 = (str.contains(".vod"));
                if (!z3) {
                    return "";
                } else {
                    sb = C0052.m2253(str);
                    str2 = "/types";
                    return "";
                }
            }
        }
        sb = C0052.m2253(str);
        str2 = "nav?token=";
        sb.append(str2);
        return (sb.toString());
    }
}
