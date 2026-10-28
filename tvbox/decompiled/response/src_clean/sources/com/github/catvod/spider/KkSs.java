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

        /* renamed from: طﺝﻉن  reason: contains not printable characters */
        public static String m826(Object obj) {
            int i = (-821) ^ C0025.f83;
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
                        return ((WebsiteResponse) obj).SN;
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

        /* renamed from: هحـﺩ  reason: contains not printable characters */
        public static String m827(Object obj) {
            int i = 812 ^ C0022.f80;
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
                        return ((WebsiteResponse) obj).yq;
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

        public String getResponse() {
            return m827(this);
        }

        public String getUrl() {
            return m826(this);
        }
    }

    public KkSs() {
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

    /* renamed from: ثومﻅ  reason: contains not printable characters */
    public static String m820(Object obj) {
        int i = 354 ^ C0026.f84;
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
                    return ((WebsiteResponse) obj).getUrl();
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

    /* renamed from: دصغن  reason: contains not printable characters */
    public static void m821(Object obj) {
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
                    SpiderDebug.log((String) obj);
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

    /* renamed from: ظخنف  reason: contains not printable characters */
    public static void m823(Object obj) {
        int i = (-314) ^ C0002.f2;
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

    /* renamed from: مهجﻍ  reason: contains not printable characters */
    public static String[] m824(Object obj) {
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
                    return ((KkSs) obj).O;
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

    /* renamed from: ﺽخدر  reason: contains not printable characters */
    public static String m825(Object obj) {
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
                    return ((WebsiteResponse) obj).getResponse();
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
            (sb.append(((String) (list.get(0)).split(str2))[0]));
            (sb.append("index.php/vod/detail/id/"));
            (sb.append(((String) (list.get(0)).split(str2))[1]));
            (sb.append(".html"));
            Va va = C0040.m1964(C0011.m353((sb.toString()), Rc.yq(), 0));
            String str3 = (((va.cS("div.video-cover div.module-item-pic img.lazyload")).tF()).N("alt"));
            (me.G(str3));
            (me.G4("https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://img.xxooo.cf/portrait/webp/20260518_151236_1430.webp"));
            (me.t0("免费分享"));
            kB kBVar = (va.cS("div.module-row-info > a"));
            ArrayList arrayList = new ArrayList();
            int i3 = (kBVar.size());
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                        break;
                    case 49:
                        if (i3 <= 0) {
                            break;
                        } else {
                            i4 = 1709;
                            continue;
                        }
                    case 204:
                        int i5 = (kBVar.size());
                        int i6 = 1740;
                        while (true) {
                            i6 ^= 1757;
                            switch (i6) {
                                case 17:
                                    if (i5 <= 3) {
                                        break;
                                    } else {
                                        i6 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    i = (kBVar.size());
                                    break;
                                case 500:
                                    int i7 = 1864;
                                    while (true) {
                                        i7 ^= 1881;
                                        switch (i7) {
                                            case 17:
                                                i7 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i6 = 1802;
                        }
                        while (true) {
                            int i8 = 48767;
                            while (true) {
                                i8 ^= 48784;
                                switch (i8) {
                                    case 14:
                                    case 45:
                                        break;
                                    case 76:
                                        String str4 = ((hN) (kBVar.get(i2)).N("data-clipboard-text"));
                                        StringBuilder sb2 = new StringBuilder();
                                        (sb2.append("shareUrl--"));
                                        (sb2.append(str4));
                                        m821((sb2.toString()));
                                        (arrayList.add(str4));
                                        i2++;
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
                                        i8 = i2 < i ? 48860 : 48829;
                                }
                            }
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i4 = 1678;
            }
            JSONObject panList = super.panList(arrayList, str3);
            String str5 = (panList.getString("froms"));
            String str6 = (panList.getString("plays"));
            boolean z = (str6.startsWith("$$$"));
            int i10 = 49666;
            while (true) {
                i10 ^= 49683;
                switch (i10) {
                    case 17:
                        if (z) {
                            break;
                        } else {
                            i10 = 49759;
                            continue;
                        }
                    case 50:
                        break;
                    case 76:
                        (me.F5(str6));
                        (me.dT(str5));
                        break;
                    case 83:
                        break;
                    default:
                        continue;
                }
                i10 = 49728;
            }
            boolean z2 = (str6.isEmpty());
            int i11 = 49790;
            while (true) {
                i11 ^= 49807;
                switch (i11) {
                    case 18:
                        break;
                    case 51:
                        break;
                    case 84:
                        (me.F5(str));
                        (me.dT(str));
                        break;
                    case 241:
                        if (!z2) {
                            break;
                        } else {
                            i11 = 49883;
                            continue;
                        }
                    default:
                        continue;
                }
                i11 = 49852;
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
        (arrayList2.add(rPVar));
        jSONObject = new JSONObject();
        str3 = C0054.m2296(arrayList2, arrayList, jSONObject);
        return str3;
}

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        return;
                    case 49:
                        i = 1647;
                        break;
                }
            }
        }
    }

    public void requestWebsites(String[] strArr, List<WebsiteResponse> list, String str) {
        int i = 0;
        ExecutorService executorService = C0040.m1962(strArr.length);
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                    case 49:
                        i3 = i2 < length ? 1709 : 1678;
                    case 204:
                        (executorCompletionService.submit(new yq(this, strArr[i2], str, 0)));
                        i2++;
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = 1771;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
        }
        while (true) {
            int length2 = strArr.length;
            int i5 = 1864;
            while (true) {
                i5 ^= 1881;
                switch (i5) {
                    case 17:
                        i5 = i < length2 ? 48736 : 48705;
                    case 47384:
                        break;
                    case 47417:
                        try {
                            WebsiteResponse websiteResponse = (WebsiteResponse) ((executorCompletionService.take()).get());
                            boolean z = (m825(websiteResponse).contains("module-search-item"));
                            int i6 = 48767;
                            while (true) {
                                i6 ^= 48784;
                                switch (i6) {
                                    case 14:
                                    case 45:
                                        break;
                                    case 76:
                                        (list.add(websiteResponse));
                                        int i7 = (list.size());
                                        int i8 = 48891;
                                        while (true) {
                                            i8 ^= 48908;
                                            switch (i8) {
                                                case 22:
                                                case 53:
                                                    break;
                                                case 503:
                                                    i8 = i7 == 3 ? 49635 : 48953;
                                                case 32495:
                                                    int i9 = 49666;
                                                    while (true) {
                                                        i9 ^= 49683;
                                                        switch (i9) {
                                                            case 17:
                                                                i9 = 49697;
                                                                break;
                                                            case 50:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i6 = z ? 48860 : 48829;
                                }
                            }
                        } catch (Exception e) {
                            (e.printStackTrace());
                        }
                        i++;
                        int i10 = 49790;
                        while (true) {
                            i10 ^= 49807;
                            switch (i10) {
                                case 18:
                                    break;
                                case 241:
                                    i10 = 49821;
                            }
                        }
                        break;
                    case 47483:
                }
            }
        }
        (executorService.shutdown());
        int i11 = 909 ^ C0002.f2;
        int i12 = 49914;
        while (true) {
            i12 ^= 49931;
            switch (i12) {
                case 497:
                    
                        break;
                    
                case 1711:
                    break;
                case 1736:
                    return;
                case 1769:
                    return;
            }
            i12 = 50627;
        }
    }

    public String searchContent(String str, boolean z) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        String str2 = "[data-src]";
        ArrayList arrayList2 = new ArrayList();
        (this.requestWebsites(m824(this),arrayList2,str));
        int i = 0;
        while (true) {
            int i2 = i;
            int i3 = (arrayList2.size());
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                    case 49:
                        i4 = i2 < i3 ? 1709 : 1678;
                    case 204:
                        WebsiteResponse websiteResponse = (WebsiteResponse) (arrayList2.get(i2));
                        try {
                            it = ((C0004.m119(m825(websiteResponse)).cS("div.module-search-item")).iterator());
                        } catch (Exception e) {
                            m823(e);
                        }
                        while (true) {
                            boolean z2 = (it.hasNext());
                            int i5 = 1740;
                            while (true) {
                                i5 ^= 1757;
                                switch (i5) {
                                    case 17:
                                        i5 = z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        hN hNVar = (hN) (it.next());
                                        String str3 = "(\\d+).html";
                                        String str4 = "[href*=detail][title]";
                                        (Objects.requireNonNull(hNVar));
                                        String str5 = C0007.m228(str3, (C0000.m12(str4, hNVar).N("href")), 1);
                                        String str6 = (C0000.m12(str2, hNVar).N("alt"));
                                        String str7 = (C0000.m12(str2, hNVar).N("data-src"));
                                        StringBuilder sb = new StringBuilder();
                                        (sb.append(m820(websiteResponse)));
                                        (sb.append("&"));
                                        (sb.append(str5));
                                        (arrayList.add(new ME((sb.toString()), str6, str7, "")));
                                        int i6 = 1864;
                                        while (true) {
                                            i6 ^= 1881;
                                            switch (i6) {
                                                case 17:
                                                    i6 = 48674;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            i = i2 + 1;
                            int i7 = 48767;
                            while (true) {
                                i7 ^= 48784;
                                switch (i7) {
                                    case 14:
                                        break;
                                    case 239:
                                        i7 = 48798;
                                }
                            }
                        }
                        break;
                    case 239:
                        return C0022.m1435(arrayList);
                }
            }
        }
    }
}
