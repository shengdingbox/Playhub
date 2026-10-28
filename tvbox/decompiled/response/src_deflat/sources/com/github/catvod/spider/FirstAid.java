package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.Bj;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rN;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class FirstAid extends Spider {
    private String yq = "https://m.youlai.cn";

    private String yq(String str) {
        Response execute = new OkHttpClient().newBuilder().sslSocketFactory(new Bj(), Bj.SN).build().newCall(new Request.Builder().url(str).get().addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").build()).execute();
        String string = execute.body().string();
        execute.close();
        return string;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        try {
            HashMap hashMap2 = new HashMap();
            if (hashMap != null && hashMap.size() > 0) {
                hashMap2.putAll(hashMap);
            }
            String[] split = str.split("\\|");
            String str3 = split[0];
            int parseInt = Integer.parseInt(split[1]);
            if (hashMap2.get("cateId") != null) {
                str3 = (String) hashMap2.get("cateId");
            }
            String yq = yq(this.yq + String.format("/%s", str3));
            String yq2 = rN.yq(yq).cS(".block100").N(parseInt).yq("src");
            kB i = rN.yq(yq).cS(".jj-title-li").N(parseInt).i(".list-br3");
            JSONArray jSONArray = new JSONArray();
            Iterator<hN> it = i.iterator();
            while (it.hasNext()) {
                hN next = it.next();
                jSONArray.put(new JSONObject().put("vod_id", this.yq + next.cS("a").yq("href")).put("vod_name", next.cS("a").t0()).put("vod_pic", yq2));
            }
            return new JSONObject().put("page", Integer.parseInt(str2)).put("pagecount", 1).put("limit", i.size()).put("total", i.size()).put("list", jSONArray).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            Va yq = rN.yq(yq(list.get(0)));
            String t0 = yq.cS(".video-title.h1-title").t0();
            String yq2 = yq.cS(".video-cover.list-flex-in img").yq("src");
            String t02 = yq.cS("span.doc-name").t0();
            String t03 = yq.cS(".img-text-con").t0();
            String yq3 = yq.cS("#video source").yq("src");
            return new JSONObject().put("list", new JSONArray().put(new JSONObject().put("vod_id", list.get(0)).put("vod_name", t0).put("vod_pic", yq2).put("vod_area", "中国").put("vod_actor", t02).put("vod_content", t03).put("vod_play_from", "Qile").put("vod_play_url", (t0 + "$" + yq3).toString()))).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONObject put = new JSONObject().put("type_id", "jijiu|0").put("type_name", "急救技能");
            JSONObject put2 = new JSONObject().put("type_id", "jijiu|1").put("type_name", "家庭生活");
            JSONObject put3 = new JSONObject().put("type_id", "jijiu|2").put("type_name", "急危重症");
            JSONObject put4 = new JSONObject().put("type_id", "jijiu|3").put("type_name", "常见损伤");
            JSONObject put5 = new JSONObject().put("type_id", "jijiu|4").put("type_name", "动物致伤");
            JSONObject put6 = new JSONObject().put("type_id", "jijiu|5").put("type_name", "海洋急救");
            JSONObject put7 = new JSONObject().put("type_id", "jijiu|6").put("type_name", "中毒急救");
            return new JSONObject().put("class", new JSONArray().put(put).put(put2).put(put3).put(put4).put(put5).put(put6).put(put7).put(new JSONObject().put("type_id", "jijiu|7").put("type_name", "意外事故"))).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str) {
        FirstAid.super.init(context, str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            return new JSONObject().put("parse", 0).put("url", str2).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            kB cS = rN.yq(yq(this.yq + "/cse/search?q=" + URLEncoder.encode(str))).cS(".search-video-li.list-br2");
            JSONArray jSONArray = new JSONArray();
            Iterator<hN> it = cS.iterator();
            while (it.hasNext()) {
                hN next = it.next();
                String str2 = this.yq + next.cS("a").yq("href");
                String t0 = next.cS("h5.line-clamp1").t0();
                String yq = next.cS("dt.logo-bg img").yq("src");
                if (!yq.startsWith("https")) {
                    yq = "https:" + yq;
                }
                jSONArray.put(new JSONObject().put("vod_id", str2).put("vod_name", t0).put("vod_pic", yq));
            }
            return new JSONObject().put("list", jSONArray).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
