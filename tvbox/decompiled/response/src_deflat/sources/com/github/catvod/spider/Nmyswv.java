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

        return;
    }

    private HashMap<String, String> SN() {
        String str2 = null;
        HashMap<String, String> hashMap = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap<>();
        str3 = Rc.SN;
        str2 = "User-Agent";
        hashMap.put(str2,str3);
        return hashMap;
    }

    public static void addView(View view, ViewGroup.LayoutParams layoutParams) {
        int i;
        try {
            (ViewGroup) (((InitOrigin.getActivity().getWindow()).getDecorView()).findViewById(16908290)).addView(view,layoutParams);
            i = 1616;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    public static void loadWebView(String str, WebViewClient webViewClient) {
        C0057.m2371(new L9(webViewClient, str, 1));
    }

    public static void removeView(View view) {
        try {
            (ViewGroup) (((InitOrigin.getActivity().getWindow()).getDecorView()).findViewById(16908290)).removeView(view);

            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void yq(WebViewClient webViewClient, String str) {
        WebView webView = new WebView(InitOrigin.context());
        (webView.getSettings()).setDatabaseEnabled(true);
        (webView.getSettings()).setDomStorageEnabled(true);
        (webView.getSettings()).setJavaScriptEnabled(true);
        int i = Build.VERSION.SDK_INT;

        if (!(i < 21)) {
            (webView.getSettings()).setMixedContentMode(0);
        }
        (webView.getSettings()).setUserAgentString(Rc.SN);
        C0044.m2071(webView, new ViewGroup.LayoutParams(0, 0));
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(str);
        int i3 = 909 ^ C0002.f2;

        if (i3 > 0) {
            return;
        } else {
            return;
        }
    }

    /* renamed from: سجيك */
    public static void m934(Object obj) {
        int i = (-886) ^ C0021.f79;

        SpiderDebug.log((String) obj);
        return;
    }

    /* renamed from: صﻡﺫز */
    public static String m935() {
        int i = (-1021) ^ C0026.f84;

        return SN;
    }

    /* renamed from: ﺽﻉﻡﺎ */
    public static HashMap m937(Object obj) {
        int i = (-604) ^ C0013.f13;

        return ((Nmyswv) obj).SN();
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

        if (!(obj != null)) {
            hashMap.put(str3,str4);
        }
        String str5 = "year";
        Object obj2 = (hashMap.get(str5));

        if (!(obj2 != null)) {
            hashMap.put(str5,str4);
        }
        String str6 = "area";
        Object obj3 = (hashMap.get(str6));

        if (!(obj3 != null)) {
            hashMap.put(str6,str4);
        }
        String str7 = "by";
        Object obj4 = (hashMap.get(str7));

        if (!(obj4 != null)) {
            hashMap.put(str7,str4);
        }
        String str8 = (String) (hashMap.get(str7));
        String str9 = (String) (hashMap.get(str5));
        String str10 = C0010.m314((String) (hashMap.get(str6)));
        StringBuilder sb = new StringBuilder();
        sb.append(m935());
        String str11 = "tid";
        boolean z2 = (hashMap.containsKey(str11));

        if (z2) {
            str = (hashMap.get(str11));
        }
        sb.append((String.format("/index.php?m=vod-list-id-%s-pg-%s-order--by-%s-class--year-%s-letter--area-%s-lang-.html",new Object[]{str, str2, str8, str9, str10})));
        Iterator it = ((C0004.m119(C0028.m1633((sb.toString()), m937(this))).cS("ul.resize_list > li")).iterator());
        while (true) {
            boolean z3 = (it.hasNext());

            if (z3) {
                hN hNVar = (hN) (it.next());
                String str12 = ((hNVar.cS("a > div > img")).yq("src"));
                String str13 = "a";
                String str14 = ((hNVar.cS(str13)).yq("href"));
                String str15 = ((hNVar.cS(str13)).yq("title"));
                boolean z4 = C0010.m289(str15);
                if (!(z4)) {
                    String str16 = (((hNVar.cS("a > div > span.sBottom > span")).tF()).kR());
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("vod_id",str14);
                        jSONObject.put("vod_name",str15);
                        jSONObject.put("vod_pic",str12);
                        jSONObject.put("vod_remarks",str16);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                C0012.m364(jSONArray, jSONObject2, str2);
                return (jSONObject2.toString());
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

        if (!(str5 == null)) {
            String str6 = "：";
            boolean z = (str5.contains(str6));
            if (z) {
                int length = (str5.split(str6)).length;
                if (!(length <= 1)) {
                    str = (str5.split(str6))[1];
                }
            }
        }
        str = "";
        String str7 = ((va.cS("section.page-bd > div.desc_item:nth-child(3) > a")).t0());
        String str8 = C0009.m275(((va.cS("section.page-bd > div.desc_item:nth-child(5) > a")).t0()), "(\\d{4})");
        String str9 = ((va.cS("section.page-bd > div.desc_item:nth-child(4) > a")).t0());
        String str10 = ((va.cS("section.page-bd > div.desc_item:nth-child(2) > font")).t0());
        ME me = new ME();
        me.B((String) (list.get(0)));
        me.G4(str4);
        me.G(str3);
        me.Gc(str7);
        me.Gc(str9);
        me.Gc(str8);
        me.v3(str10);
        me.KJ(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str11 = "div.numList";
        kB kBVar = (va.cS(str11));
        StringBuilder sb = C0052.m2253("sources-");
        sb.append((kBVar.size()));
        m934((sb.toString()));
        kB kBVar2 = (va.cS(str11));
        int i5 = 0;
        while (true) {
            int i6 = i5;
            int i7 = (kBVar.size());

            if (i6 < i7) {
                String str13 = ((hN) (kBVar.get(i6)).N("div.id"));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("sourceName-");
                sb2.append(str13);
                m934((sb2.toString()));
                kB kBVar3 = ((hN) (kBVar2.get(i6)).cS("ul > li > a"));
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    int i12 = i11;
                    int i13 = (kBVar3.size());
                    if (i12 < i13) {
                        hN hNVar = (hN) (kBVar3.get(i12));
                        StringBuilder sb3 = new StringBuilder();
                        String str14 = (hNVar.Fo());
                        GG.yq;
                        sb3.append(str14);
                        sb3.append("$");
                        sb3.append((hNVar.N("href")));
                        arrayList.add((sb3.toString()));
                        i11 = i12 + 1;
                    } else {
                        int i16 = (arrayList.size());
                        if (i16 > 0) {
                            Collections.reverse(arrayList);
                            boolean z2 = (str13.contains("m3u8"));
                            if (!z2) {
                                StringBuilder sb4 = C0052.m2253("线路");
                                sb4.append(i6 + 1);
                                str2 = (sb4.toString());
                            } else {
                                str2 = str13;
                            }
                            linkedHashMap.put(str2,(TextUtils.join("#",arrayList)));
                        }
                        i5 = i6 + 1;
                    }
                }
            } else {
                int i9 = (linkedHashMap.size());
                if (!(i9 <= 0)) {
                    Set set = (linkedHashMap.keySet());
                    String str12 = "$$$";
                    me.dT((TextUtils.join(str12,set)));
                    me.F5((TextUtils.join(str12,(linkedHashMap.values()))));
                }
                return C0000.m21(me);
            }
        }
    }

    public String homeContent(boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        Va va = C0004.m119(C0028.m1633(m935(), m937(this)));
        arrayList2.add(new rP("1", "电影"));
        arrayList2.add(new rP("2", "电视剧"));
        arrayList2.add(new rP("3", "综艺"));
        arrayList2.add(new rP("4", "动漫"));
        arrayList2.add(new rP("26", "短剧"));
        try {
            N = new JSONObject(C0003.m112());
            i = 1616;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Iterator it = (((hN) ((va.cS("div.globalPicList")).get(0)).cS("ul > li")).iterator());
        while (true) {
            boolean z2 = (it.hasNext());
            if (z2) {
                hN hNVar = (hN) (it.next());
                String str = ((hNVar.cS("a > div > img")).yq("data-src"));
                String str2 = "a";
                String str3 = ((hNVar.cS(str2)).yq("href"));
                String str4 = ((hNVar.cS(str2)).yq("title"));
                boolean z3 = C0010.m289(str4);
                if (!(z3)) {
                    arrayList.add(new ME(str3, str4, str, (((hNVar.cS("a > div > span.sBottom > span")).t0()).replace("0.0",""))));
                }
            } else {
                return C0054.m2296(arrayList2, arrayList, Nmyswv.N);
            }
        }
    }

    public void init(Context context, String str) {
        Nmyswv.super.init(context, str);
        boolean z = (TextUtils.isEmpty(str));

        if (z) {
            return;
        } else {
            SN = str;
            return;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0029.m1662();
        C0056.m2351(true);
        String str3 = (((C0009.m275(C0028.m1633((m935().concat(str2)), m937(this)), "mac_url='(.*?)';").split("\\$\\$\\$"))[(Integer.parseInt(C0009.m275(str2, "vod-play-id-\\d+-src-(\\d+)-num-\\d+"))) - 1].split("#"))[(Integer.parseInt(C0009.m275(str2, "vod-play-id-\\d+-src-\\d+-num-(\\d+)"))) - 1].split("\\$"))[1];
        String str4 = ".m3u8";
        boolean z = (str3.contains(str4));

        if (!z) {
            boolean z2 = (str3.startsWith("aF"));
            if (!z2) {
                iX iXVar2 = new iX();
                iXVar2.g1((m935().concat(str2)));
                iXVar2.v3();
                iXVar2.KJ(m937(this));
                return (iXVar2.toString());
            } else {
                String str5 = "";
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 < 34) {
                        StringBuilder sb2 = C0052.m2253(str5);
                        sb2.append((str3.substring(i3 + 0,i3 + 1)));
                        str5 = (sb2.toString());
                        i3 += 2;
                        i4++;
                    } else {
                        StringBuilder sb = C0052.m2253(str5);
                        sb.append(((((str3.substring(67)).replace("oo00o","/")).replace("o000o","+")).replace("O0O0O","=")));
                        String str6 = new String(C0022.m1420((sb.toString()), 0));
                        iX iXVar3 = new iX();
                        boolean z3 = (str6.contains(str4));
                        if (z3) {
                            str6 = C0048.m2137(str6, null);
                        }
                        iXVar3.g1(str6);
                        iXVar3.KJ(m937(this));
                        return (iXVar3.toString());
                    }
                }
                iX iXVar2 = new iX();
                iXVar2.g1((m935().concat(str2)));
                iXVar2.v3();
                iXVar2.KJ(m937(this));
                return (iXVar2.toString());
            }
        } else {
            iX iXVar = new iX();
            iXVar.g1(C0048.m2137(str3, null));
            iXVar.KJ(m937(this));
            return (iXVar.toString());
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C0004.m119(C0028.m1633(((m935().concat("/index.php?m=vod-search&wd=")).concat(str)), m937(this))).cS("ul[id=data_list] > li")).iterator());
        while (true) {
            boolean z2 = (it.hasNext());

            if (z2) {
                hN hNVar = (hN) (it.next());
                Objects.requireNonNull(hNVar);
                String str2 = (C0000.m12("img", hNVar).N("data-src"));
                String str3 = (C0000.m12("a", hNVar).N("href"));
                String str4 = (C0000.m12("span.sTit", hNVar).Fo());
                boolean z3 = C0010.m289(str4);
                if (!(z3)) {
                    arrayList.add(new ME(str3, str4, str2, ((hNVar.cS("a > div > span.vod_remarks")).t0())));
                }
            } else {
                return C0022.m1435(arrayList);
            }
        }
    }
}
