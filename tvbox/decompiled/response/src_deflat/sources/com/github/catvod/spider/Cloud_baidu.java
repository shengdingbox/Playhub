package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0080aF;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.RQ;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Cloud_baidu extends Spider {
    public static boolean i = false;

    private static String zH = "";
    private final Pattern yq = C0005.m166("/s/([^/]+)\\?pwd=([^/]+)");
    private final Pattern SN = C0005.m166("提取码:([^/]+)");
    private final Pattern N = C0005.m166("pan.baidu.com/.*?\\?surl=([^/]+)&pwd=([^/]+)");
    private final Pattern tF = C0005.m166("/s/([^\\?]+)");

    public Cloud_baidu() {

        return;
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = (String) (map.get("type"));
        boolean z = (str.equals("sub"));

        if (!z) {
            boolean z2 = (str.equals("302"));
            if (!z2) {
                boolean z3 = (str.equals("input"));
                if (!z3) {
                    return null;
                } else {
                    return (RQ.xa().RQ(map));
                }
            } else {
                return (RQ.xa().lF());
            }
        } else {
            return (RQ.xa().Q4(map));
        }
    }

    public static Object[] proxys(Map<String, String> map, Map<String, String> map2, String str) {
        RQ rq = null;
        Object[] objArr = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        rq = RQ.xa();
        objArr = (rq.C(map2));
        return objArr;
    }

    /* renamed from: سخﺫﺽ  reason: contains not printable characters */
    public static String m703() {

        return zH;
    }

    /* renamed from: عﻙﺝﺏ  reason: contains not printable characters */
    public static Pattern m704(Object obj) {
        int i2 = 697 ^ C0024.f82;

        return ((Cloud_baidu) obj).tF;
    }

    /* renamed from: وﻉﻱت  reason: contains not printable characters */
    public static Pattern m705(Object obj) {
        int i2 = (-31) ^ C0041.f99;

        return ((Cloud_baidu) obj).SN;
    }

    /* renamed from: يذﻉا  reason: contains not printable characters */
    public static Pattern m706(Object obj) {
        int i2 = (-388) ^ C0035.f93;

        return ((Cloud_baidu) obj).N;
    }

    /* renamed from: ﻁﺝﻉر  reason: contains not printable characters */
    public static Pattern m707(Object obj) {
        int i2 = (-914) ^ C0004.f4;

        return ((Cloud_baidu) obj).yq;
    }

    public String detailContent(List<String> list) {
        ME me = (this.detailVideo(list));

        if (me != null) {
            return C0000.m21(me);
        } else {
            return "";
        }
    }

    public ME detailVideo(List<String> list) {
        String str;
        String str2;
        boolean z = C0020.m1370((C0015.m439(RQ.xa()).N()));
        String str3 = "";

        if (z) {
            zH = str3;
        }
        String str4 = ((String) (list.get(0)).trim());
        boolean z2 = (str4.contains("提取码"));

        if (z2) {
            Matcher matcher = (m704(this).matcher(str4));
            boolean z3 = (matcher.find());
            if (!z3) {
                str = str3;
            } else {
                str = (matcher.group(1));
                str = str3;
            }
            Matcher matcher2 = (m705(this).matcher(str4));
            boolean z4 = (matcher2.find());
            if (!z4) {
                str2 = str3;
            } else {
                str2 = (matcher2.group(1));
                str2 = str3;
            }
            boolean z5 = (str.isEmpty());
            if (!(z5)) {
                boolean z6 = (str2.isEmpty());
                if (!(z6)) {
                    return (RQ.xa().m(str,str2));
                }
            }
        }
        Matcher matcher3 = (m707(this).matcher(str4));
        boolean z7 = (matcher3.find());

        if (!z7) {
            Matcher matcher4 = (m706(this).matcher(str4));
            boolean z8 = (matcher4.find());
            if (!z8) {
                Matcher matcher5 = (m704(this).matcher(str4));
                boolean z9 = (matcher5.find());
                if (!z9) {
                    return null;
                } else {
                    return (RQ.xa().m((matcher5.group(1)),str3));
                }
            } else {
                StringBuilder sb = C0052.m2253("1");
                sb.append((matcher4.group(1)));
                return (RQ.xa().m((sb.toString()),(matcher4.group(2))));
            }
        } else {
            return (RQ.xa().m((matcher3.group(1)),(matcher3.group(2))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x020e A[SYNTHETIC] */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.content.Context r12, java.lang.String r13) {
        /*
        Method dump skipped, instructions count: 814
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Cloud_baidu.init(android.content.Context, java.lang.String):void");
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = "[智无限存]";
        String str4 = "";
        try {
            boolean z = Cloud_baidu.i;

            if (!(z)) {
                boolean z2 = C0020.m1370((C0015.m439(RQ.xa()).N()));
                if (!(z2)) {
                    boolean z3 = (RQ.xa().F5());
                    if (!z3) {
                        i = true;
                        return (C0007.m215("未扫码授权无法播放，刚已扫码的请刷新").toString());
                    } else {
                        boolean z4 = C0013.m396(RQ.xa());
                        if (!(z4)) {
                            long j = System.currentTimeMillis() / 1000;
                            long j2 = (C0030.m1673(RQ.xa()).tF());
                            if (!(j <= j2)) {
                                boolean z5 = C0020.m1370((C0015.m439(RQ.xa()).t0()));
                                if (!(z5)) {
                                    RQ.xa().w();
                                }
                            }
                            RQ.xa().ee(C0046.m2126(RQ.xa()));
                        }
                        i = true;
                        i = true;
                        return (C0007.m215("未扫码授权无法播放，刚已扫码的请刷新").toString());
                    }
                }
            }
            boolean z6 = C0020.m1370((C0015.m439(RQ.xa()).N()));

            if (z6) {
                boolean z7 = ((m703().replaceAll(str3,str4)).equals((str.replaceAll(str3,str4))));
                if (!(z7)) {
                    RQ.xa().F5();
                    zH = str;
                    i = true;
                }
            }
            C0080aF.G4 = str;
            return (RQ.xa().R(str2,str));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0050.m2227(e));
            sb.append("---");
            C0006.m194((sb.toString()));
            return str4;
        }
    }

    public void setFlag(String str) {
        zH = "";
        int i2 = 57 ^ C0032.f90;

        return;
    }
}
