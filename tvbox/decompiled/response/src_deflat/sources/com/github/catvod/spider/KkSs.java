package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class KkSs extends Pan {

    private String[] O = {"http://xiaocge.fun/", "http://2xiaopan.fun/", "https://feimao666.fun/", "https://tv.yydsys.top/", "http://www.miqk.cc/", "https://mihdr.top/", "https://feimao666.fun/", "http://xiaomi666.fun/"};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class WebsiteResponse {
        private String SN;
        private String yq;

        public WebsiteResponse(String str, String str2) {
            this.yq = str2;
            this.SN = str;

            return;
        }

        /* renamed from: طﺝﻉن  reason: contains not printable characters */
        public static String m826(Object obj) {
            int i = (-821) ^ C0025.f83;

            return ((WebsiteResponse) obj).SN;
        }

        /* renamed from: هحـﺩ  reason: contains not printable characters */
        public static String m827(Object obj) {
            int i = 812 ^ C0022.f80;

            return ((WebsiteResponse) obj).yq;
        }

        public String getResponse() {
            return m827(this);
        }

        public String getUrl() {
            return m826(this);
        }
    }

    public KkSs() {

        return;
    }

    /* renamed from: ثومﻅ  reason: contains not printable characters */
    public static String m820(Object obj) {
        int i = 354 ^ C0026.f84;

        return ((WebsiteResponse) obj).getUrl();
    }

    /* renamed from: دصغن  reason: contains not printable characters */
    public static void m821(Object obj) {
        int i = (-448) ^ C0025.f83;

        SpiderDebug.log((String) obj);
        return;
    }

    /* renamed from: ظخنف  reason: contains not printable characters */
    public static void m823(Object obj) {
        int i = (-314) ^ C0002.f2;

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: مهجﻍ  reason: contains not printable characters */
    public static String[] m824(Object obj) {
        int i = (-4) ^ C0029.f87;

        return ((KkSs) obj).O;
    }

    /* renamed from: ﺽخدر  reason: contains not printable characters */
    public static String m825(Object obj) {
        int i = 515 ^ C0028.f86;

        return ((WebsiteResponse) obj).getResponse();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        int i = 3;
        int i2 = 0;
        String str = "已失效";
        String str2 = "&";
        C0056.m2351(true);
        try {
            ME me = new ME();
            StringBuilder sb = new StringBuilder();
            sb.append(((String) (list.get(0)).split(str2))[0]);
            sb.append("index.php/vod/detail/id/");
            sb.append(((String) (list.get(0)).split(str2))[1]);
            sb.append(".html");
            Va va = C0040.m1964(C0011.m353((sb.toString()), Rc.yq(), 0));
            String str3 = (((va.cS("div.video-cover div.module-item-pic img.lazyload")).tF()).N("alt"));
            me.G(str3);
            me.G4("https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://img.xxooo.cf/portrait/webp/20260518_151236_1430.webp");
            me.t0("免费分享");
            kB kBVar = (va.cS("div.module-row-info > a"));
            ArrayList arrayList = new ArrayList();
            int i3 = (kBVar.size());

            if (!(i3 <= 0)) {
                int i5 = (kBVar.size());
                if (i5 <= 3) {
                    i = (kBVar.size());
                } else {
                    i = (kBVar.size());
                }
                while (true) {
                    if (i2 < i) {
                        String str4 = ((hN) (kBVar.get(i2)).N("data-clipboard-text"));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("shareUrl--");
                        sb2.append(str4);
                        m821((sb2.toString()));
                        arrayList.add(str4);
                        i2++;
                    }
                }
            }
            JSONObject panList = super.panList(arrayList, str3);
            String str5 = (panList.getString("froms"));
            String str6 = (panList.getString("plays"));
            boolean z = (str6.startsWith("$$$"));

            if (!(z)) {
                me.F5(str6);
                me.dT(str5);
            }
            boolean z2 = (str6.isEmpty());

            if (z2) {
                me.F5(str);
                me.dT(str);
            }
            return C0000.m21(me);
        } catch (Exception e) {
            m823(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        JSONObject jSONObject = null;
        rP rPVar = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        str3 = "1";
        str2 = "🍓本源是网盘搜索源，仅支持搜索";
        rPVar = new rP(str3, str2);
        arrayList2.add(rPVar);
        jSONObject = new JSONObject();
        str3 = C0054.m2296(arrayList2, arrayList, jSONObject);
        return str3;
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {

            return;
        }
    }

    public void requestWebsites(String[] strArr, List<WebsiteResponse> list, String str) {
        int i = 0;
        ExecutorService executorService = C0040.m1962(strArr.length);
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int length = strArr.length;
        int i2 = 0;
        while (true) {

            if (i2 < length) {
                executorCompletionService.submit(new yq(this, strArr[i2], str, 0));
                i2++;
            }
        }
        while (true) {
            int length2 = strArr.length;

            if (i < length2) {
                try {
                    WebsiteResponse websiteResponse = (WebsiteResponse) ((executorCompletionService.take()).get());
                    boolean z = (m825(websiteResponse).contains("module-search-item"));
                    if (z) {
                        list.add(websiteResponse);
                        int i7 = (list.size());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i++;
            }
        }
        executorService.shutdown();

        return;
    }

    public String searchContent(String str, boolean z) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        String str2 = "[data-src]";
        ArrayList arrayList2 = new ArrayList();
        this.requestWebsites(m824(this),arrayList2,str);
        int i = 0;
        while (true) {
            int i2 = i;
            int i3 = (arrayList2.size());

            if (i2 < i3) {
                WebsiteResponse websiteResponse = (WebsiteResponse) (arrayList2.get(i2));
                try {
                    it = ((C0004.m119(m825(websiteResponse)).cS("div.module-search-item")).iterator());
                } catch (Exception e) {
                    m823(e);
                }
                while (true) {
                    boolean z2 = (it.hasNext());
                    if (z2) {
                        hN hNVar = (hN) (it.next());
                        String str3 = "(\\d+).html";
                        String str4 = "[href*=detail][title]";
                        Objects.requireNonNull(hNVar);
                        String str5 = C0007.m228(str3, (C0000.m12(str4, hNVar).N("href")), 1);
                        String str6 = (C0000.m12(str2, hNVar).N("alt"));
                        String str7 = (C0000.m12(str2, hNVar).N("data-src"));
                        StringBuilder sb = new StringBuilder();
                        sb.append(m820(websiteResponse));
                        sb.append("&");
                        sb.append(str5);
                        arrayList.add(new ME((sb.toString()), str6, str7, ""));
                    }
                    i = i2 + 1;
                }
            } else {
                return C0022.m1435(arrayList);
            }
        }
    }
}
