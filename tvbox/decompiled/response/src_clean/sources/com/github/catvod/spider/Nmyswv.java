package com.github.catvod.spider;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.L9;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Nmyswv extends Spider {
    public static JSONObject N;
    private String yq = "";

    private static String SN = "https://vip.wwgz.cn:5200/";

    /* renamed from: com.github.catvod.spider.Nmyswv$1 */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    class AnonymousClass1 extends WebViewClient {

        /* renamed from: com.github.catvod.spider.Nmyswv$1$1 */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        class RunnableC00161 implements Runnable {
            final /* synthetic */ Map N;
            final /* synthetic */ String SN;
            final /* synthetic */ WebView yq;

            @Override // java.lang.Runnable
            @TargetApi(19)
            public void run() {
                this.yq.loadUrl(this.SN, this.N);
            }
        }

        /* renamed from: com.github.catvod.spider.Nmyswv$1$2 */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        class AnonymousClass2 implements Runnable {
            final /* synthetic */ WebView yq;

            @Override // java.lang.Runnable
            @TargetApi(19)
            public void run() {
                this.yq.destroy();
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(19)
        public void onPageFinished(WebView webView, String str) {
            throw null;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            int i = Build.VERSION.SDK_INT;
            String uri = i >= 21 ? webResourceRequest.getUrl().toString() : null;
            PrintStream printStream = System.out;
            printStream.println("SIRequest URL: " + uri);
            (i >= 21 ? webResourceRequest.getRequestHeaders() : null).get("Referer");
            throw null;
        }
    }

    public Nmyswv() {
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

    private HashMap<String, String> SN() {
        String str2 = null;
        HashMap<String, String> hashMap = null;
String str3 = null;
                // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap<>();
        str3 = Rc.SN;
        str2 = "User-Agent";
        (hashMap.put(str2,str3));
        return hashMap;
}

    public static void addView(View view, ViewGroup.LayoutParams layoutParams) {
        int i;
        try {
            ((ViewGroup) (((InitOrigin.getActivity().getWindow()).getDecorView()).findViewById(16908290)).addView(view,layoutParams));
            i = 1616;
        } catch (Exception e) {
            (e.printStackTrace());
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                
                                    break;
                                
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                return;
                        }
                        i3 = 1802;
                    }
                    break;
                case 49:
                    i = 1647;
                    break;
            }
        }
    }

    public static void loadWebView(String str, WebViewClient webViewClient) {
        C0057.m2371(new L9(webViewClient, str, 1));
    }

    public static void removeView(View view) {
        try {
            ((ViewGroup) (((InitOrigin.getActivity().getWindow()).getDecorView()).findViewById(16908290)).removeView(view));
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
        } catch (Exception e) {
            (e.printStackTrace());
        }
    }

    public static /* synthetic */ void yq(WebViewClient webViewClient, String str) {
        WebView webView = new WebView(InitOrigin.context());
        ((webView.getSettings()).setDatabaseEnabled(true));
        ((webView.getSettings()).setDomStorageEnabled(true));
        ((webView.getSettings()).setJavaScriptEnabled(true));
        int i = Build.VERSION.SDK_INT;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 21) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    ((webView.getSettings()).setMixedContentMode(0));
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        ((webView.getSettings()).setUserAgentString(Rc.SN));
        C0044.m2071(webView, new ViewGroup.LayoutParams(0, 0));
        (webView.setWebViewClient(webViewClient));
        (webView.loadUrl(str));
        int i3 = 909 ^ C0002.f2;
        int i4 = 1740;
        while (true) {
            i4 ^= 1757;
            switch (i4) {
                case 17:
                    if (i3 > 0) {
                        break;
                    } else {
                        i4 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    return;
            }
            i4 = 1802;
        }
    }

    /* renamed from: سجيك */
    public static void m934(Object obj) {
        int i = (-886) ^ C0021.f79;
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

    /* renamed from: صﻡﺫز */
    public static String m935() {
        int i = (-1021) ^ C0026.f84;
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
                    return SN;
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

    /* renamed from: ﺽﻉﻡﺎ */
    public static HashMap m937(Object obj) {
        int i = (-604) ^ C0013.f13;
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
                    return ((Nmyswv) obj).SN();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object[], java.lang.Object] */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        JSONArray jSONArray = new JSONArray();
        String str3 = "class";
        Object obj = (hashMap.get(str3));
        String str4 = "";
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (obj != null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    (hashMap.put(str3,str4));
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        String str5 = "year";
        Object obj2 = (hashMap.get(str5));
        int i2 = 1740;
        while (true) {
            i2 ^= 1757;
            switch (i2) {
                case 17:
                    if (obj2 != null) {
                        break;
                    } else {
                        i2 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    break;
                case 500:
                    (hashMap.put(str5,str4));
                    break;
            }
            i2 = 1802;
        }
        String str6 = "area";
        Object obj3 = (hashMap.get(str6));
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    if (obj3 != null) {
                        break;
                    } else {
                        i3 = 48736;
                        continue;
                    }
                case 47384:
                    break;
                case 47417:
                    (hashMap.put(str6,str4));
                    break;
                case 47483:
                    break;
            }
            i3 = 48705;
        }
        String str7 = "by";
        Object obj4 = (hashMap.get(str7));
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                    break;
                case 45:
                    break;
                case 76:
                    (hashMap.put(str7,str4));
                    break;
                case 239:
                    if (obj4 != null) {
                        break;
                    } else {
                        i4 = 48860;
                        continue;
                    }
            }
            i4 = 48829;
        }
        String str8 = (String) (hashMap.get(str7));
        String str9 = (String) (hashMap.get(str5));
        String str10 = C0010.m314((String) (hashMap.get(str6)));
        StringBuilder sb = new StringBuilder();
        (sb.append(m935()));
        String str11 = "tid";
        boolean z2 = (hashMap.containsKey(str11));
        int i5 = 48891;
        while (true) {
            i5 ^= 48908;
            switch (i5) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    if (!z2) {
                        break;
                    } else {
                        i5 = 49635;
                        continue;
                    }
                case 32495:
                    str = (hashMap.get(str11));
                    break;
            }
            i5 = 48953;
        }
        (sb.append((String.format("/index.php?m=vod-list-id-%s-pg-%s-order--by-%s-class--year-%s-letter--area-%s-lang-.html",new Object[]{str, str2, str8, str9, str10}))));
        Iterator it = ((C0004.m119(C0028.m1633((sb.toString()), m937(this))).cS("ul.resize_list > li")).iterator());
        while (true) {
            boolean z3 = (it.hasNext());
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        i6 = z3 ? 49759 : 49728;
                    case 50:
                    case 76:
                        hN hNVar = (hN) (it.next());
                        String str12 = ((hNVar.cS("a > div > img")).yq("src"));
                        String str13 = "a";
                        String str14 = ((hNVar.cS(str13)).yq("href"));
                        String str15 = ((hNVar.cS(str13)).yq("title"));
                        boolean z4 = C0010.m289(str15);
                        int i7 = 49790;
                        while (true) {
                            i7 ^= 49807;
                            switch (i7) {
                                case 18:
                                case 51:
                                    String str16 = (((hNVar.cS("a > div > span.sBottom > span")).tF()).kR());
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        (jSONObject.put("vod_id",str14));
                                        (jSONObject.put("vod_name",str15));
                                        (jSONObject.put("vod_pic",str12));
                                        (jSONObject.put("vod_remarks",str16));
                                        (jSONArray.put(jSONObject));
                                        int i8 = 50689;
                                        while (true) {
                                            i8 ^= 50706;
                                            switch (i8) {
                                                case 19:
                                                    i8 = 50720;
                                                case 50:
                                                    break;
                                            }
                                        }
                                    } catch (JSONException e) {
                                        throw new RuntimeException(e);
                                    }
                                    break;
                                case 84:
                                    int i9 = 49914;
                                    while (true) {
                                        i9 ^= 49931;
                                        switch (i9) {
                                            case 497:
                                                i9 = 50596;
                                            case 1711:
                                                break;
                                        }
                                    }
                                    break;
                                case 241:
                                    i7 = z4 ? 49883 : 49852;
                            }
                        }
                        break;
                    case 83:
                        JSONObject jSONObject2 = new JSONObject();
                        C0012.m364(jSONArray, jSONObject2, str2);
                        return (jSONObject2.toString());
                }
            }
        }
    }

    public String detailContent(List<String> list) {
        String str;
        String str2;
        m934((m935().concat((String) (list.get(0)))));
        Va va = C0004.m119(C0028.m1633((m935().concat((String) (list.get(0)))), m937(this)));
        String str3 = ((va.cS("h1.title > a")).t0());
        String str4 = ((va.cS("section.page-hd > a > img")).yq("src"));
        String str5 = ((va.cS("article.detail-con > p")).t0());
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str5 == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    String str6 = "：";
                    boolean z = (str5.contains(str6));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int length = (str5.split(str6)).length;
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (length <= 1) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            break;
                                        case 47417:
                                            str = (str5.split(str6))[1];
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 239:
                                                        i4 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                    }
                                    i3 = 48705;
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        str = "";
        String str7 = ((va.cS("section.page-bd > div.desc_item:nth-child(3) > a")).t0());
        String str8 = C0009.m275(((va.cS("section.page-bd > div.desc_item:nth-child(5) > a")).t0()), "(\\d{4})");
        String str9 = ((va.cS("section.page-bd > div.desc_item:nth-child(4) > a")).t0());
        String str10 = ((va.cS("section.page-bd > div.desc_item:nth-child(2) > font")).t0());
        ME me = new ME();
        (me.B((String) (list.get(0))));
        (me.G4(str4));
        (me.G(str3));
        (me.Gc(str7));
        (me.Gc(str9));
        (me.Gc(str8));
        (me.v3(str10));
        (me.KJ(str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str11 = "div.numList";
        kB kBVar = (va.cS(str11));
        StringBuilder sb = C0052.m2253("sources-");
        (sb.append((kBVar.size())));
        m934((sb.toString()));
        kB kBVar2 = (va.cS(str11));
        int i5 = 0;
        while (true) {
            int i6 = i5;
            int i7 = (kBVar.size());
            int i8 = 48891;
            while (true) {
                i8 ^= 48908;
                switch (i8) {
                    case 22:
                    case 53:
                        int i9 = (linkedHashMap.size());
                        int i10 = 51588;
                        while (true) {
                            i10 ^= 51605;
                            switch (i10) {
                                case 17:
                                    if (i9 <= 0) {
                                        break;
                                    } else {
                                        i10 = 51681;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 87:
                                    break;
                                case 116:
                                    Set set = (linkedHashMap.keySet());
                                    String str12 = "$$$";
                                    (me.dT((TextUtils.join(str12,set))));
                                    (me.F5((TextUtils.join(str12,(linkedHashMap.values())))));
                                    break;
                            }
                            i10 = 51650;
                        }
                        return C0000.m21(me);
                    case 503:
                        i8 = i6 < i7 ? 49635 : 48953;
                    case 32495:
                        String str13 = ((hN) (kBVar.get(i6)).N("div.id"));
                        StringBuilder sb2 = new StringBuilder();
                        (sb2.append("sourceName-"));
                        (sb2.append(str13));
                        m934((sb2.toString()));
                        kB kBVar3 = ((hN) (kBVar2.get(i6)).cS("ul > li > a"));
                        ArrayList arrayList = new ArrayList();
                        int i11 = 0;
                        while (true) {
                            int i12 = i11;
                            int i13 = (kBVar3.size());
                            int i14 = 49666;
                            while (true) {
                                i14 ^= 49683;
                                switch (i14) {
                                    case 17:
                                        i14 = i12 < i13 ? 49759 : 49728;
                                    case 50:
                                    case 76:
                                        hN hNVar = (hN) (kBVar3.get(i12));
                                        StringBuilder sb3 = new StringBuilder();
                                        String str14 = (hNVar.Fo());
                                        GG.yq;
                                        (sb3.append(str14));
                                        (sb3.append("$"));
                                        (sb3.append((hNVar.N("href"))));
                                        (arrayList.add((sb3.toString())));
                                        i11 = i12 + 1;
                                        int i15 = 49790;
                                        while (true) {
                                            i15 ^= 49807;
                                            switch (i15) {
                                                case 18:
                                                    break;
                                                case 241:
                                                    i15 = 49821;
                                            }
                                        }
                                        break;
                                    case 83:
                                        int i16 = (arrayList.size());
                                        int i17 = 49914;
                                        while (true) {
                                            i17 ^= 49931;
                                            switch (i17) {
                                                case 497:
                                                    i17 = i16 > 0 ? 50658 : 50627;
                                                case 1711:
                                                case 1736:
                                                    break;
                                                case 1769:
                                                    (Collections.reverse(arrayList));
                                                    boolean z2 = (str13.contains("m3u8"));
                                                    int i18 = 50689;
                                                    while (true) {
                                                        i18 ^= 50706;
                                                        switch (i18) {
                                                            case 19:
                                                                i18 = !z2 ? 50782 : 50751;
                                                            case 45:
                                                                str2 = str13;
                                                                break;
                                                            case 50:
                                                            case 76:
                                                                StringBuilder sb4 = C0052.m2253("线路");
                                                                (sb4.append(i6 + 1));
                                                                str2 = (sb4.toString());
                                                                break;
                                                        }
                                                    }
                                                    (linkedHashMap.put(str2,(TextUtils.join("#",arrayList))));
                                                    break;
                                            }
                                        }
                                        i5 = i6 + 1;
                                        int i19 = 50813;
                                        while (true) {
                                            i19 ^= 50830;
                                            switch (i19) {
                                                case 18:
                                                    break;
                                                case 243:
                                                    i19 = 50844;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public String homeContent(boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        Va va = C0004.m119(C0028.m1633(m935(), m937(this)));
        (arrayList2.add(new rP("1", "电影")));
        (arrayList2.add(new rP("2", "电视剧")));
        (arrayList2.add(new rP("3", "综艺")));
        (arrayList2.add(new rP("4", "动漫")));
        (arrayList2.add(new rP("26", "短剧")));
        try {
            N = new JSONObject(C0003.m112());
            i = 1616;
        } catch (JSONException e) {
            (e.printStackTrace());
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    Iterator it = (((hN) ((va.cS("div.globalPicList")).get(0)).cS("ul > li")).iterator());
                    while (true) {
                        boolean z2 = (it.hasNext());
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = z2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    return C0054.m2296(arrayList2, arrayList, Nmyswv.N);
                                case 500:
                                    hN hNVar = (hN) (it.next());
                                    String str = ((hNVar.cS("a > div > img")).yq("data-src"));
                                    String str2 = "a";
                                    String str3 = ((hNVar.cS(str2)).yq("href"));
                                    String str4 = ((hNVar.cS(str2)).yq("title"));
                                    boolean z3 = C0010.m289(str4);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = z3 ? 48736 : 48705;
                                            case 47384:
                                                (arrayList.add(new ME(str3, str4, str, (((hNVar.cS("a > div > span.sBottom > span")).t0()).replace("0.0","")))));
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i4 = 48922;
                                                    }
                                                }
                                                break;
                                            case 47417:
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i5 = 48798;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case 49:
                    i = 1647;
                    break;
            }
        }
    }

    public void init(Context context, String str) {
        Nmyswv.super.init(context, str);
        boolean z = (TextUtils.isEmpty(str));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    SN = str;
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0029.m1662();
        C0056.m2351(true);
        String str3 = (((C0009.m275(C0028.m1633((m935().concat(str2)), m937(this)), "mac_url='(.*?)';").split("\\$\\$\\$"))[(Integer.parseInt(C0009.m275(str2, "vod-play-id-\\d+-src-(\\d+)-num-\\d+"))) - 1].split("#"))[(Integer.parseInt(C0009.m275(str2, "vod-play-id-\\d+-src-\\d+-num-(\\d+)"))) - 1].split("\\$"))[1];
        String str4 = ".m3u8";
        boolean z = (str3.contains(str4));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    iX iXVar = new iX();
                    (iXVar.g1(C0048.m2137(str3, null)));
                    (iXVar.KJ(m937(this)));
                    return (iXVar.toString());
                case 239:
                    boolean z2 = (str3.startsWith("aF"));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z2) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                iX iXVar2 = new iX();
                                (iXVar2.g1((m935().concat(str2))));
                                (iXVar2.v3());
                                (iXVar2.KJ(m937(this)));
                                return (iXVar2.toString());
                            case 500:
                                String str5 = "";
                                int i3 = 0;
                                int i4 = 0;
                                while (true) {
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = i4 < 34 ? 48736 : 48705;
                                            case 47384:
                                                StringBuilder sb = C0052.m2253(str5);
                                                (sb.append(((((str3.substring(67)).replace("oo00o","/")).replace("o000o","+")).replace("O0O0O","="))));
                                                String str6 = new String(C0022.m1420((sb.toString()), 0));
                                                iX iXVar3 = new iX();
                                                boolean z3 = (str6.contains(str4));
                                                int i6 = 48891;
                                                while (true) {
                                                    i6 ^= 48908;
                                                    switch (i6) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 503:
                                                            if (!z3) {
                                                                break;
                                                            } else {
                                                                i6 = 49635;
                                                                continue;
                                                            }
                                                        case 32495:
                                                            str6 = C0048.m2137(str6, null);
                                                            break;
                                                    }
                                                    i6 = 48953;
                                                }
                                                (iXVar3.g1(str6));
                                                (iXVar3.KJ(m937(this)));
                                                return (iXVar3.toString());
                                            case 47417:
                                                StringBuilder sb2 = C0052.m2253(str5);
                                                (sb2.append((str3.substring(i3 + 0,i3 + 1))));
                                                str5 = (sb2.toString());
                                                i3 += 2;
                                                i4++;
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
                                                break;
                                            case 47483:
                                        }
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
            }
            i = 1678;
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C0004.m119(C0028.m1633(((m935().concat("/index.php?m=vod-search&wd=")).concat(str)), m937(this))).cS("ul[id=data_list] > li")).iterator());
        while (true) {
            boolean z2 = (it.hasNext());
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = z2 ? 1709 : 1678;
                    case 204:
                        hN hNVar = (hN) (it.next());
                        (Objects.requireNonNull(hNVar));
                        String str2 = (C0000.m12("img", hNVar).N("data-src"));
                        String str3 = (C0000.m12("a", hNVar).N("href"));
                        String str4 = (C0000.m12("span.sTit", hNVar).Fo());
                        boolean z3 = C0010.m289(str4);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = z3 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    (arrayList.add(new ME(str3, str4, str2, ((hNVar.cS("a > div > span.vod_remarks")).t0()))));
                                    int i3 = 48767;
                                    while (true) {
                                        i3 ^= 48784;
                                        switch (i3) {
                                            case 14:
                                                break;
                                            case 239:
                                                i3 = 48798;
                                        }
                                    }
                                    break;
                                case 500:
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
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
