package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.merge.A4;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.RS;
import com.github.catvod.spider.merge.Sq;
import com.github.catvod.spider.merge.Yx;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.l3;
import com.github.catvod.spider.merge.rP;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Seedhub extends Pan {

    private CacheData Dr;
    private CacheData Zm;
    private String b;
    private CacheData g;
    private String O = "https://seedhub.pro/";
    private String g1 = "";
    private String s = "";
    private String n = "";
    private String un = "";

    /* renamed from: com.github.catvod.spider.Seedhub$1  reason: invalid class name */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class CacheData {
        private String N;
        private String SN;
        private String tF;
        private String yq;
        private String zH;

        CacheData() {
            int i = (-824) ^ C0004.f4;

            return;
        }

        public String getBy() {
            return this.tF;
        }

        public String getData() {
            return this.SN;
        }

        public String getId() {
            return this.yq;
        }

        public String getPg() {
            return this.N;
        }

        public String getTypeOnly() {
            return this.zH;
        }

        public void setBy(String str) {
            this.tF = str;

            return;
        }

        public void setData(String str) {
            this.SN = str;
        }

        public void setId(String str) {
            this.yq = str;

            return;
        }

        public void setPg(String str) {
            this.N = str;
            int i = 923 ^ C0041.f99;

            return;
        }

        public void setTypeOnly(String str) {
            this.zH = str;
        }
    }

    public Seedhub() {
        int i = (-185) ^ C0033.f91;

        return;
    }

    private String B(String str, String str2, String str3) {
        boolean equals = str.equals(this.g1);

        if (equals) {
            boolean equals2 = str2.equals(this.s);
            if (equals2) {
                boolean equals3 = str3.equals(this.n);
                if (equals3) {
                    return "";
                } else {
                    this.n = str3;
                    this.un = str3;
                    return str3;
                }
            } else {
                this.s = str2;
                this.un = str2;
                return str2;
            }
        } else {
            this.g1 = str;
            this.un = str;
            return str;
        }
    }

    private String G(String str) {
        StringBuilder sb = null;
        String str3 = null;
        int i = 0;
        // [deflattened] 控制流平坦化已还原为线性代码
        str3 = "@Referer=";
        sb = Sq.yq(str, str3);
        str = this.O;
        str3 = "/";
        i = str.lastIndexOf(str3);
        str3 = str.substring(0, i);
        sb.append(str3);
        str = sb.toString();
        return str;
    }

    private HashMap<String, String> q() {
        HashMap<String, String> hashMap = null;
        String str2 = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap<>();
        str3 = A4.i();
        str2 = "User-Agent";
        hashMap.put(str2, str3);
        str2 = this.O;
        str3 = "Referer";
        hashMap.put(str3, str2);
        return hashMap;
    }

    /* renamed from: تكﻝغ  reason: contains not printable characters */
    public static String m947(Object obj) {

        return ((CacheData) obj).getData();
    }

    /* renamed from: جﻱﺥﻅ  reason: contains not printable characters */
    public static String m948(Object obj) {
        int i = 293 ^ C0009.f9;

        return ((Seedhub) obj).b;
    }

    /* renamed from: دﺎسﻅ  reason: contains not printable characters */
    public static void m949(Object obj, Object obj2) {
        int i = 215 ^ C0038.f96;

        ((CacheData) obj).setTypeOnly((String) obj2);
        return;
    }

    /* renamed from: ضﺵﻅـ  reason: contains not printable characters */
    public static String m950(Object obj) {
        int i = 658 ^ C0029.f87;

        return ((CacheData) obj).getId();
    }

    /* renamed from: ظدنﺝ  reason: contains not printable characters */
    public static HashMap m951(Object obj) {
        int i = 909 ^ C0002.f2;

        return ((Seedhub) obj).q();
    }

    /* renamed from: ظقنﻩ  reason: contains not printable characters */
    public static String m952(Object obj) {
        int i = (-193) ^ C0041.f99;

        return ((CacheData) obj).getBy();
    }

    /* renamed from: ـوطﻍ  reason: contains not printable characters */
    public static CacheData m953(Object obj) {
        int i = (-422) ^ C0033.f91;

        return ((Seedhub) obj).Zm;
    }

    /* renamed from: قﺽفﺩ  reason: contains not printable characters */
    public static void m954(Object obj, Object obj2) {
        int i = (-404) ^ C0021.f79;

        ((CacheData) obj).setId((String) obj2);
        int i4 = (-540) ^ C0001.f1;

        return;
    }

    /* renamed from: كذعﻕ  reason: contains not printable characters */
    public static CacheData m955(Object obj) {
        int i = (-824) ^ C0004.f4;

        return ((Seedhub) obj).g;
    }

    /* renamed from: نتشر  reason: contains not printable characters */
    public static void m956(Object obj, Object obj2) {
        int i = 284 ^ C0041.f99;

        ((CacheData) obj).setPg((String) obj2);
        return;
    }

    /* renamed from: ﺥاﺡج  reason: contains not printable characters */
    public static String m957(Object obj) {
        int i = 215 ^ C0038.f96;

        return ((CacheData) obj).getPg();
    }

    /* renamed from: ﺩبطﺕ  reason: contains not printable characters */
    public static CacheData m958(Object obj) {
        int i = (-314) ^ C0002.f2;

        return ((Seedhub) obj).Dr;
    }

    /* renamed from: ﺩسﻡو  reason: contains not printable characters */
    public static String m959(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 658 ^ C0029.f87;

        return ((Seedhub) obj).B((String) obj2, (String) obj3, (String) obj4);
    }

    /* renamed from: ﺫﻅﻁﻝ  reason: contains not printable characters */
    public static String m960(Object obj) {
        int i = (-487) ^ C0053.f111;

        return ((Seedhub) obj).un;
    }

    /* renamed from: ﺭﺵﺹﻝ  reason: contains not printable characters */
    public static String m961(Object obj, Object obj2) {
        int i = (-4) ^ C0029.f87;

        return ((Seedhub) obj).G((String) obj2);
    }

    /* renamed from: ﺵطعب  reason: contains not printable characters */
    public static void m962(Object obj, Object obj2) {
        int i = (-1021) ^ C0026.f84;

        ((CacheData) obj).setData((String) obj2);
        return;
    }

    /* renamed from: ﻁﻍﺏﺡ  reason: contains not printable characters */
    public static void m963(Object obj, Object obj2) {
        int i = (-985) ^ C0024.f82;

        ((CacheData) obj).setBy((String) obj2);
        int i4 = (-4) ^ C0029.f87;

        return;
    }

    /* renamed from: ﻕﺥمغ  reason: contains not printable characters */
    public static void m964(Object obj) {
        int i = (-4) ^ C0029.f87;

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: ﻙهﻭﻩ  reason: contains not printable characters */
    public static String m965(Object obj) {
        int i = 354 ^ C0026.f84;

        return ((Seedhub) obj).O;
    }

    /* renamed from: ﻙﺫﻝق  reason: contains not printable characters */
    public static String m966(Object obj) {
        int i = (-703) ^ C0036.f94;

        return ((CacheData) obj).getTypeOnly();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 800
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String categoryContent(java.lang.String r25, java.lang.String r26, boolean r27, java.util.HashMap<java.lang.String, java.lang.String> r28) {
        /*
        Method dump skipped, instructions count: 5554
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Seedhub.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String str;
        String str2;
        String str3 = "list";
        String str4 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject((String) (list.get(0)));
            JSONArray jSONArray = new JSONArray();
            String str5 = ((jSONObject2.getString("vod_id")).trim());
            boolean z = (str5.contains("link_start"));
            String str6 = "/";

            if (z) {
                boolean z2 = (str5.contains("pan_id"));
                if (!(z2)) {
                    StringBuilder sb = new StringBuilder();
                    String str7 = m965(this);
                    sb.append((str7.substring(0,(str7.lastIndexOf(str6)))));
                    sb.append(str5);
                    return super.detailContent((Arrays.asList(new String[]{new String(C0005.m179(C0007.m228("const data = \"(.*?)\"", C0028.m1633((sb.toString()), m951(this)), 1), 0))})));
                }
            }
            StringBuilder sb2 = new StringBuilder();
            String str8 = m965(this);
            sb2.append((str8.substring(0,(str8.lastIndexOf(str6)))));
            sb2.append(str5);
            JSONObject jSONObject3 = ((new JSONObject(super.detailContent(new ArrayList((Arrays.asList((C0007.m228("var panLink = \"(.*?)\"", C0028.m1633((sb2.toString()), C0027.m1590(str4, str4, 3)), 1).split(","))))))).getJSONArray(str3)).getJSONObject(0));
            String str9 = "vod_play_url";
            String str10 = "vod_play_from";

            if (jSONObject3 == null) {
                str = str4;
                str2 = str4;
            } else {
                str = (jSONObject3.getString(str10));
                str2 = (jSONObject3.getString(str9));
                str = str4;
                str2 = str4;
            }
            boolean z3 = (str2.startsWith("$$$"));

            if (!(z3)) {
                jSONObject2.put(str10,str);
                jSONObject2.put(str9,str2);
            }
            boolean z4 = (str2.isEmpty());

            if (z4) {
                String str11 = "待补链";
                String str12 = "此线路失效";
                jSONObject2.put(str10,str11);
                jSONObject2.put(str9,str12);
            }
            jSONArray.put(jSONObject2);
            jSONObject.put(str3,jSONArray);
            return (jSONObject.toString());
        } catch (Exception e) {
            m964(e);
            return str4;
        }
    }

    public String homeContent(boolean z) {
        String str = "a";
        boolean z2 = (C0049.m2191(m948(this)).contains("56We56eY55qE5ZOl5ZOl5Lus"));
        String str2 = "";

        if (z2) {
            try {
                CacheData cacheData = m955(this);
                if (cacheData == null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    JSONObject jSONObject = new JSONObject(C0056.m2359());
                    arrayList2.add(new rP("1", "电影"));
                    arrayList2.add(new rP("3", "剧集"));
                    arrayList2.add(new rP("2", "动漫"));
                    int i3 = 0;
                    kB kBVar = (C0004.m119(C0011.m353(m965(this), m951(this), 0)).cS("div.cover-container div.cover"));
                    while (true) {
                        int i4 = (kBVar.size());
                        if (i3 < i4) {
                            hN hNVar = (hN) (kBVar.get(i3));
                            Objects.requireNonNull(hNVar);
                            String str3 = (C0000.m12(str, hNVar).N("title"));
                            String str4 = m961(this, (C0000.m12("a img", hNVar).N("src")));
                            Iterator it = ((hNVar.cS("ul li")).iterator());
                            int i6 = 1;
                            String str5 = str2;
                            while (true) {
                                boolean z3 = (it.hasNext());
                                if (z3) {
                                    hN hNVar2 = (hN) (it.next());
                                    if (i6 == 2) {
                                        C0039.m1941((hNVar2.Fo()));
                                    }
                                    boolean z4 = ((hNVar2.Fo()).contains("豆瓣"));
                                    if (z4) {
                                        str5 = ((hNVar2.cS(str)).t0());
                                    }
                                    i6++;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append((C0000.m12(str, hNVar).N("href")));
                                    sb.append("@folder");
                                    arrayList.add(new ME((sb.toString()), str3, str4, str5, true));
                                    i3++;
                                }
                            }
                        } else {
                            CacheData cacheData2 = new CacheData();
                            this.g = cacheData2;
                            m962(cacheData2, C0054.m2296(arrayList2, arrayList, jSONObject));
                            return C0054.m2296(arrayList2, arrayList, jSONObject);
                        }
                    }
                } else {
                    return m947(cacheData);
                }
            } catch (Exception e) {
                System.out.println(e);
                return str2;
            }
        } else {
            return str2;
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        int i;
        try {
            this.b = str;
            i = 1616;
        } catch (Exception e) {
            InitOrigin.show("");
        }
        super.init(context, "{}");
        return;
    }

    public String searchContent(String str, boolean z) {
        String str2 = "a";
        try {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append(this.O);
            int i = 0;
            sb.append(String.format("s/%s/", URLEncoder.encode(str)));
            kB cS = l3.tF(RS.SN(sb.toString(), q(), 0)).cS("div.cover-container div.cover");
            while (true) {
                int size = cS.size();

                if (i < size) {
                    hN hNVar = cS.get(i);
                    Objects.requireNonNull(hNVar);
                    String N = PA.yq(str2, hNVar).N("title");
                    String N2 = PA.yq("a img", hNVar).N("src");
                    Iterator<hN> it = hNVar.cS("ul li").iterator();
                    String str3 = "";
                    int i3 = 1;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        if (hasNext) {
                            hN next = it.next();
                            if (i3 == 2) {
                                Yx.SN(next.Fo());
                            }
                            boolean contains = next.Fo().contains("豆瓣");
                            if (contains) {
                                str3 = next.cS(str2).t0();
                            }
                            i3++;
                        } else {
                            arrayList.add(new ME(PA.yq(str2, hNVar).N("href") + "@folder", N, N2, str3, true));
                            i++;
                        }
                    }
                } else {
                    return iX.ee(arrayList);
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
