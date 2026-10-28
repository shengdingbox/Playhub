package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.rP;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Doubao extends Spider {

    private String yq = "https://www.doubaozhibo.com";
    private String SN = "https://www.doubaozhibo.com/api/v1/schedules/public/local";
    private String N = "https://www.doubaozhibo.com/api/v1/playbacks";
    private String tF = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36";
    private String zH = null;
    private long i = 0;
    private final Map<String, String> t0 = new HashMap();
    private final Map<String, Long> Gc = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class VodWithStatus {
        String N;
        int SN;
        ME yq;

        VodWithStatus(ME me, int i, String str) {
            this.yq = me;
            this.SN = i;
            this.N = str;

            return;
        }
    }

    public Doubao() {

        return;
    }

    private List<ME> N() {
        boolean z;
        String str;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = (new JSONObject(m724(this)).optJSONObject("data"));

        if (jSONObject != null) {
            JSONArray jSONArray = (jSONObject.optJSONArray("days"));
            if (jSONArray != null) {
                int i3 = 0;
                while (true) {
                    int i4 = (jSONArray.length());
                    if (i3 < i4) {
                        JSONArray jSONArray2 = ((jSONArray.getJSONObject(i3)).optJSONArray("live"));
                        if (!(jSONArray2 == null)) {
                            int i9 = 0;
                            while (true) {
                                int i10 = (jSONArray2.length());
                                if (i9 < i10) {
                                    JSONObject jSONObject2 = (jSONArray2.getJSONObject(i9));
                                    String str2 = "playbackId";
                                    boolean z3 = (jSONObject2.isNull(str2));
                                    if (!z3) {
                                        int i13 = (jSONObject2.optInt(str2,0));
                                        if (i13 > 0) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                    if (!(z)) {
                                        String str3 = "status";
                                        int i17 = (jSONObject2.optInt(str3,0));
                                        String str4 = "matchTime";
                                        String str5 = (jSONObject2.optString(str4));
                                        String str6 = (jSONObject2.optString("id"));
                                        String str7 = (jSONObject2.optString("league"));
                                        String str8 = (jSONObject2.optString("teamA"));
                                        String str9 = (jSONObject2.optString("teamB"));
                                        String str10 = (jSONObject2.optString(str4));
                                        int i18 = (jSONObject2.optInt(str3,0));
                                        int i19 = (jSONObject2.optInt("teamAscore",0));
                                        int i20 = (jSONObject2.optInt("teamBscore",0));
                                        String str11 = m720(this, str10);
                                        if (i18 != 1) {
                                            if (i18 != 2) {
                                                str = "⏰";
                                            } else {
                                                str = "⚫";
                                            }
                                        } else {
                                            str = "🔴";
                                        }
                                        String str12 = C0048.m2149(str8, " vs ", str9);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str);
                                        String str13 = " ";
                                        sb.append(str13);
                                        sb.append(str11);
                                        String str14 = " | ";
                                        sb.append(str14);
                                        sb.append(str7);
                                        String str15 = (sb.toString());
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str8);
                                        sb2.append(str13);
                                        sb2.append(i19);
                                        String str16 = "-";
                                        sb2.append(str16);
                                        sb2.append(i20);
                                        str12 = C0032.m1739(sb2, str13, str9);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str);
                                        sb3.append(str13);
                                        sb3.append(str11);
                                        sb3.append(str14);
                                        sb3.append(str7);
                                        sb3.append(str14);
                                        sb3.append(i19);
                                        sb3.append(str16);
                                        sb3.append(i20);
                                        str15 = (sb3.toString());
                                        ME me = new ME();
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("live###");
                                        sb4.append(str6);
                                        me.B((sb4.toString()));
                                        me.G(str12);
                                        me.G4((jSONObject2.optString("teamAImage")));
                                        me.v3(str15);
                                        arrayList.add(new VodWithStatus(me, i17, str5));
                                    }
                                    i9++;
                                }
                            }
                        }
                        i3++;
                    } else {
                        (Collections.sort(arrayList,new Comparator<VodWithStatus>(this) { // from class: com.github.catvod.spider.Doubao.1
                                    final Doubao yq;
                                    {
                                        this.yq = this;
                                        int i6 = (-406) ^ C0053.f111;
                                        if (i6 < 0) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    /* renamed from: اهسﺕ  reason: contains not printable characters */
                                    public static String m732(Object obj) {
                                        int i6 = 284 ^ C0041.f99;
                                        if (i6 > 0) {
                                            return null;
                                        } else {
                                            return ((VodWithStatus) obj).N;
                                        }
                                    }
                                    /* renamed from: ﺵعﺡض  reason: contains not printable characters */
                                    public static int m733(Object obj) {
                                        int i6 = (-404) ^ C0021.f79;
                                        if (i6 > 0) {
                                            return 0;
                                        } else {
                                            return ((VodWithStatus) obj).SN;
                                        }
                                    }
                                    /* renamed from: ﻍغنﻅ  reason: contains not printable characters */
                                    public static int m734(Object obj, Object obj2, Object obj3) {
                                        int i6 = 293 ^ C0009.f9;
                                        if (i6 > 0) {
                                            return 0;
                                        } else {
                                            return ((AnonymousClass1) obj).compare2((VodWithStatus) obj2, (VodWithStatus) obj3);
                                        }
                                    }
                                    /* renamed from: ﻱحﺙد  reason: contains not printable characters */
                                    public static Doubao m735(Object obj) {
                                        int i6 = (-703) ^ C0036.f94;
                                        if (i6 >= 0) {
                                            return null;
                                        } else {
                                            return ((AnonymousClass1) obj).yq;
                                        }
                                    }
                                    /* renamed from: compare  reason: avoid collision after fix types in other method */
                                    public int compare2(VodWithStatus vodWithStatus, VodWithStatus vodWithStatus2) {
                                        int i6;
                                        int i7 = 3;
                                        Doubao doubao = m735(this);
                                        int i8 = m733(vodWithStatus);
                                        Objects.requireNonNull(doubao);
                                        if (i8 == 0) {
                                            i6 = 1;
                                        } else {
                                            if (i8 == 1) {
                                                i6 = 0;
                                            } else {
                                                if (i8 == 2) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 3;
                                                    i6 = 2;
                                                }
                                                i6 = 0;
                                            }
                                            i6 = 1;
                                        }
                                        Doubao doubao2 = m735(this);
                                        int i15 = m733(vodWithStatus2);
                                        Objects.requireNonNull(doubao2);
                                        if (i15 == 0) {
                                            i7 = 1;
                                        } else {
                                            if (i15 == 1) {
                                                i7 = 0;
                                            } else {
                                                if (i15 == 2) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 2;
                                                }
                                                i7 = 0;
                                            }
                                            i7 = 1;
                                        }
                                        if (i6 == i7) {
                                            String str2 = m732(vodWithStatus);
                                            if (str2 == null) {
                                                return 0;
                                            } else {
                                                String str3 = m732(vodWithStatus2);
                                                if (str3 == null) {
                                                    return 0;
                                                } else {
                                                    return (str2.compareTo(str3));
                                                }
                                                return 0;
                                            }
                                        } else {
                                            return (Integer.compare(i6,i7));
                                        }
                                    }
                                    @Override // java.util.Comparator
                                    public /* bridge */ /* synthetic */ int compare(VodWithStatus vodWithStatus, VodWithStatus vodWithStatus2) {
                                        int i6 = 0;
                                        VodWithStatus vodWithStatus3 = null;
                                        VodWithStatus vodWithStatus4 = null;
                                        // [deflattened] 控制流平坦化已还原为线性代码
                                        vodWithStatus4 = vodWithStatus;
                                        vodWithStatus3 = vodWithStatus2;
                                        i6 = m734(this, vodWithStatus4, vodWithStatus3);
                                        return i6;
                                    }
                        }));
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = (arrayList.iterator());
                        while (true) {
                            boolean z2 = (it.hasNext());
                            if (z2) {
                                arrayList2.add(m730((VodWithStatus) (it.next())));
                            } else {
                                return arrayList2;
                            }
                        }
                    }
                }
            } else {
                return new ArrayList();
            }
        } else {
            return new ArrayList();
        }
    }

    private String SN() {
        long j = System.currentTimeMillis();
        String str = m731(this);

        if (!(str == null)) {
            long j2 = m719(this);
        }
        this.zH = C0011.m353(m728(this), m718(this), 0);
        this.i = j;
        return m731(this);
    }

    private String tF(String str, String str2) {
        String str3 = C0048.m2149(str, "_", str2);
        long j = System.currentTimeMillis();
        Long l = (Long) (m717(this).get(str3));
        boolean z = (m722(this).containsKey(str3));

        if (z) {
            if (!(l == null)) {
                long j2 = (l.longValue());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m725(this));
        sb.append("?page=");
        sb.append(str);
        sb.append("&pageSize=20&dataType=");
        sb.append(str2);
        m722(this).put(str3,C0011.m353((sb.toString()), m718(this), 0));
        m717(this).put(str3,(Long.valueOf(j)));
        return (String) (m722(this).get(str3));
    }

    private Map<String, String> yq() {
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap();
        str2 = m721(this);
        str3 = "User-Agent";
        hashMap.put(str3,str2);
        str3 = "Accept";
        str2 = "application/json";
        hashMap.put(str3,str2);
        str3 = "Accept-Language";
        str2 = "zh-CN";
        hashMap.put(str3,str2);
        return hashMap;
    }

    private String zH(String str) {
        boolean z = (TextUtils.isEmpty(str));

        if (!z) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
                simpleDateFormat.setTimeZone(C0049.m2188("UTC"));
                Date date = (simpleDateFormat.parse(str));
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault());
                simpleDateFormat2.setTimeZone(C0049.m2188("Asia/Shanghai"));
                return (simpleDateFormat2.format(date));
            } catch (Exception e) {
                return str;
            }
        } else {
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.HashMap] */
    /* renamed from: زﻍعﺭ  reason: contains not printable characters */
    public static HashMap m717(Object obj) {
        int i = 215 ^ C0038.f96;

        return ((Doubao) obj).Gc;
    }

    /* renamed from: شﻕجو  reason: contains not printable characters */
    public static Map m718(Object obj) {
        int i = (-4) ^ C0029.f87;

        return ((Doubao) obj).yq();
    }

    /* renamed from: ـصﻡﺱ  reason: contains not printable characters */
    public static long m719(Object obj) {
        int i = (-31) ^ C0041.f99;

        return ((Doubao) obj).i;
    }

    /* renamed from: فﻩصﺝ  reason: contains not printable characters */
    public static String m720(Object obj, Object obj2) {
        int i = 813 ^ C0033.f91;

        return ((Doubao) obj).zH((String) obj2);
    }

    /* renamed from: كتﺱق  reason: contains not printable characters */
    public static String m721(Object obj) {
        int i = (-31) ^ C0041.f99;

        return ((Doubao) obj).tF;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* renamed from: وﺫاﺩ  reason: contains not printable characters */
    public static HashMap m722(Object obj) {
        int i = 515 ^ C0028.f86;

        return ((Doubao) obj).t0;
    }

    /* renamed from: ﺎﻅصﺽ  reason: contains not printable characters */
    public static String m724(Object obj) {
        int i = 354 ^ C0026.f84;

        return ((Doubao) obj).SN();
    }

    /* renamed from: ﺝشـص  reason: contains not printable characters */
    public static String m725(Object obj) {
        int i = 909 ^ C0002.f2;

        return ((Doubao) obj).N;
    }

    /* renamed from: ﺡبﺥﺭ  reason: contains not printable characters */
    public static String m726(Object obj, Object obj2, Object obj3) {
        int i = (-768) ^ C0002.f2;

        return ((Doubao) obj).tF((String) obj2, (String) obj3);
    }

    /* renamed from: ﺫﺹﻅﺽ  reason: contains not printable characters */
    public static String m727(Object obj) {
        int i = (-768) ^ C0002.f2;

        return ((Doubao) obj).yq;
    }

    /* renamed from: ﺯلعا  reason: contains not printable characters */
    public static String m728(Object obj) {
        int i = (-604) ^ C0013.f13;

        return ((Doubao) obj).SN;
    }

    /* renamed from: ﺱﺡﺹط  reason: contains not printable characters */
    public static List m729(Object obj) {
        int i = (-185) ^ C0033.f91;

        return ((Doubao) obj).N();
    }

    /* renamed from: ﺽﺫظﻱ  reason: contains not printable characters */
    public static ME m730(Object obj) {
        int i = (-1021) ^ C0026.f84;

        return ((VodWithStatus) obj).yq;
    }

    /* renamed from: ﻙخدذ  reason: contains not printable characters */
    public static String m731(Object obj) {
        int i = 813 ^ C0033.f91;

        return ((Doubao) obj).zH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
    r5.b(r4);
    r4 = 50813;
    */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
    r4 = r4 ^ 50830;
    */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017d, code lost:
    switch(r4) {
        case 18: goto L177;
        case 243: goto L178;
        default: goto L180;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
    r4 = 50844;
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String categoryContent(java.lang.String r23, java.lang.String r24, boolean r25, java.util.HashMap<java.lang.String, java.lang.String> r26) {
        /*
        Method dump skipped, instructions count: 1340
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Doubao.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 522
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r31) {
        /*
        Method dump skipped, instructions count: 3178
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Doubao.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        List list = null;
        ArrayList arrayList = null;
        String str2 = null;
        rP rPVar = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        arrayList = new ArrayList();
        str3 = "live_tab";
        str2 = "📡 赛事直播";
        rPVar = new rP(str3, str2);
        arrayList.add(rPVar);
        str3 = "replay_all";
        str2 = "🎬 全部回放";
        rPVar = new rP(str3, str2);
        arrayList.add(rPVar);
        str3 = "replay_football";
        str2 = "⚽ 足球回放";
        rPVar = new rP(str3, str2);
        arrayList.add(rPVar);
        str3 = "replay_basketball";
        str2 = "🏀 篮球回放";
        rPVar = new rP(str3, str2);
        arrayList.add(rPVar);
        list = m729(this);
        str3 = C0038.m1906(arrayList, list);
        return str3;
    }

    public boolean isVideoFormat(String str) {
        boolean z = (str.contains(".m3u8"));

        if (!(z)) {
            boolean z2 = (str.contains(".mp4"));
            if (!z2) {
                return false;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean manualVideoCheck() {
        return false;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        C0056.m2351(true);
        boolean z = (str2.startsWith("http"));

        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(m727(this));
            sb.append("/play/");
            sb.append(str2);
            String str4 = (sb.toString());
            String str5 = C0011.m353(str4, m718(this), 0);
            String str6 = "";
            try {
                Matcher matcher = (C0005.m166("(https?://[\\w.\\-/:?=&]+\\.m3u8[^,\"\\s]*)").matcher((str5.replace("\\u002F","/"))));
                str3 = str6;
                while (true) {
                    boolean z2 = (matcher.find());
                    if (z2) {
                        str3 = ((matcher.group(1)).replaceAll("[,\"]+$",str6));
                        boolean z3 = (str3.contains("rtmpcdn"));
                        if (!z3) {
                            boolean z4 = (str3.contains("live."));
                            if (!z4) {
                                boolean z5 = (str3.contains("pul-"));
                                if (!z5) {
                                    boolean z6 = (str3.contains("gkykp"));
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                str3 = str6;
            }
            boolean z7 = (TextUtils.isEmpty(str3));
            if (z7) {
                iX iXVar2 = new iX();
                iXVar2.g1(str4);
                iXVar2.F5();
                iXVar2.KJ(m718(this));
                return (iXVar2.toString());
            } else {
                iX iXVar3 = new iX();
                iXVar3.g1(str3);
                iXVar3.KJ(m718(this));
                return (iXVar3.toString());
            }
        } else {
            iX iXVar = new iX();
            iXVar.g1(str2);
            iXVar.KJ(m718(this));
            return (iXVar.toString());
        }
    }
}
