package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.DC;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.RS;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.p9;
import com.github.catvod.spider.merge.rN;
import com.github.catvod.spider.merge.rP;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Dm84 extends Spider {
    private String yq = "http://dmbus.cc";
    private String SN = "https://hhjx.hhplayer.com/api/parse";

    private HashMap<String, String> N(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("User-Agent", "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36");
        if (!Rc.ee(str)) {
            hashMap.put("origin", str);
        }
        hashMap.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
        hashMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        return hashMap;
    }

    private HashMap<String, String> SN() {
        return N("");
    }

    private p9 yq(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            if (!str3.isEmpty()) {
                String replace = str3.replace("按", "");
                if (str2.equals("by")) {
                    str3 = str3.replace("按时间", "time").replace("按人气", "hits").replace("按评分", "score");
                }
                arrayList.add(new p9.yq(replace, str3));
            }
        }
        return new p9(str2, str, arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList();
        if (hashMap.get("type") == null) {
            hashMap.put("type", "");
        }
        if (hashMap.get("year") == null) {
            hashMap.put("year", "");
        }
        if (hashMap.get("by") == null) {
            hashMap.put("by", "time");
        }
        String encode = URLEncoder.encode(hashMap.get("type"));
        Iterator<hN> it = rN.yq(RS.SN(this.yq + String.format("/show-%s--%s-%s--%s-%s.html", str, hashMap.get("by"), encode, hashMap.get("year"), str2), SN(), 0)).cS("div.item").iterator();
        while (it.hasNext()) {
            hN next = it.next();
            String yq = next.cS("a.cover").yq("data-bg");
            String yq2 = next.cS("a.title").yq("href");
            String t0 = next.cS("a.title").t0();
            if (!FO.M(t0)) {
                arrayList.add(new ME(yq2.split("/")[2], t0, yq, next.cS("span.desc").t0()));
            }
        }
        return iX.ee(arrayList);
    }

    public String detailContent(List<String> list) {
        Va yq = rN.yq(RS.SN(this.yq.concat("/v/").concat(list.get(0)), SN(), 0));
        String t0 = yq.cS("h1.v_title").t0();
        String t02 = yq.cS("p.v_desc > span.desc").t0();
        String yq2 = yq.cS("meta[property=og:image]").yq("content");
        String yq3 = yq.cS("meta[name=og:video:area]").yq("content");
        String yq4 = yq.cS("meta[name=og:video:class]").yq("content");
        String yq5 = yq.cS("meta[name=og:video:actor]").yq("content");
        String yq6 = yq.cS("meta[property=og:description]").yq("content");
        String yq7 = yq.cS("meta[name=og:video:release_date]").yq("content");
        String yq8 = yq.cS("meta[name=og:video:director]").yq("content");
        ME me = new ME();
        me.B(list.get(0));
        me.G4(yq2);
        me.v(yq7);
        me.G(t0);
        me.M(yq3);
        me.Gc(yq5);
        me.v3(t02);
        me.KJ(yq6);
        me.q(yq8);
        me.t0(yq4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kB cS = yq.cS("ul.tab_control > li");
        kB cS2 = yq.cS("ul.play_list");
        for (int i = 0; i < cS.size(); i++) {
            String Fo = cS.get(i).Fo();
            kB cS3 = cS2.get(i).cS("a");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < cS3.size(); i2++) {
                hN hNVar = cS3.get(i2);
                arrayList.add(hNVar.Fo() + "$" + hNVar.N("href"));
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put(Fo, TextUtils.join("#", arrayList));
            }
        }
        if (linkedHashMap.size() > 0) {
            me.dT(TextUtils.join("$$$", linkedHashMap.keySet()));
            me.F5(TextUtils.join("$$$", linkedHashMap.values()));
        }
        return iX.v(me);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        Va yq = rN.yq(RS.SN(this.yq, SN(), 0));
        Iterator<hN> it = yq.cS("ul.nav_row > li > a").iterator();
        while (it.hasNext()) {
            hN next = it.next();
            if (next.N("href").startsWith("/list")) {
                arrayList2.add(new rP(next.N("href").split("-")[1].substring(0, 1), next.Fo().substring(0, 2)));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            rP rPVar = (rP) it2.next();
            Va yq2 = rN.yq(RS.SN(this.yq + "/list-" + rPVar.yq() + ".html", SN(), i));
            kB cS = yq2.cS("ul.list_filter > li > div");
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(yq("类型", "type", cS.get(i).cS("a").SN()));
            arrayList3.add(yq("时间", "year", cS.get(1).cS("a").SN()));
            arrayList3.add(yq("排序", "by", cS.get(2).cS("a").SN()));
            linkedHashMap.put(rPVar.yq(), arrayList3);
            yq = yq2;
            i = 0;
        }
        Iterator<hN> it3 = yq.cS("div.item").iterator();
        while (it3.hasNext()) {
            hN next2 = it3.next();
            String yq3 = next2.cS("a.cover").yq("data-bg");
            String yq4 = next2.cS("a.title").yq("href");
            arrayList.add(new ME(yq4.split("/")[2], next2.cS("a.title").t0(), yq3, next2.cS("span.desc").t0()));
        }
        return iX.Gd(arrayList2, arrayList, linkedHashMap);
    }

    public String playerContent(String str, String str2, List<String> list) {
        ProxyOrigin.getan();
        String yq = rN.yq(RS.SN(this.yq.concat(str2), SN(), 0)).cS("iframe").yq("src");
        if (!yq.contains("m3u8")) {
            try {
                Iterator<hN> it = rN.yq(RS.SN(this.yq.concat(str2), SN(), 0)).cS("script").iterator();
                while (it.hasNext()) {
                    String trim = it.next().mG().trim();
                    if (trim.startsWith("window.__HHJX_BOOTSTRAP__") || trim.startsWith("var player_")) {
                        int indexOf = trim.indexOf(123);
                        int lastIndexOf = trim.lastIndexOf(125) + 1;
                        if (indexOf >= 0 && lastIndexOf > indexOf) {
                            JSONObject jSONObject = new JSONObject(trim.substring(indexOf, lastIndexOf));
                            yq = new JSONObject(C0068Pe.dT(this.SN, String.format("{\"url\":\"%s\",\"t\":%s,\"key\":\"%s\",\"client_fallback\":false}", jSONObject.optString("url"), Integer.valueOf(jSONObject.optInt("t")), jSONObject.optString("key")), N("https://hhjx.hhplayer.com")).body().string()).optString("url");
                            if (!Rc.ee(yq)) {
                                iX iXVar = new iX();
                                iXVar.g1(yq.contains("m3u8") ? DC.q(yq) : yq);
                                iXVar.KJ(SN());
                                return iXVar.toString();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        iX iXVar2 = new iX();
        if (yq.contains("m3u8")) {
            yq = DC.q(yq);
        }
        iXVar2.g1(yq);
        iXVar2.F5();
        iXVar2.KJ(SN());
        return iXVar2.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<hN> it = rN.yq(RS.SN(this.yq.concat("/s----------.html?wd=").concat(str), SN(), 0)).cS("div.item").iterator();
        while (it.hasNext()) {
            hN next = it.next();
            String yq = next.cS("a.cover").yq("data-bg");
            String yq2 = next.cS("a.title").yq("href");
            String t0 = next.cS("a.title").t0();
            if (!FO.M(t0)) {
                arrayList.add(new ME(yq2.split("/")[2], t0, yq, next.cS("span.desc").t0()));
            }
        }
        return iX.ee(arrayList);
    }
}
