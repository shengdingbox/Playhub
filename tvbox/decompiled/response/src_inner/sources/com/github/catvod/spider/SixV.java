package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.P1;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.l3;
import com.github.catvod.spider.merge.rN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class SixV extends Spider {
    private String yq;

    private String N(Pattern pattern, String str) {
        try {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(1).trim() : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String SN(Pattern pattern, String str) {
        return N(pattern, str).replaceAll("</?[^>]+>", "").replaceAll("\n", "").replaceAll("\u3000\u3000\u3000\u3000", "").replaceAll("&amp;", "").replaceAll("middot;", "・").replaceAll("ldquo;", "【").replaceAll("rdquo;", "】");
    }

    private String yq(Pattern pattern, String str) {
        return N(pattern, str).replaceAll("<br>", "").replaceAll("&nbsp;", "").replaceAll("&amp;", "").replaceAll("middot;", "・").replaceAll("\u3000\u3000\u3000\u3000\u3000", ",");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        try {
            String str3 = this.yq + "/" + str;
            if (!str2.equals("1")) {
                str3 = str3 + "/index_" + str2 + ".html";
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36");
            hashMap2.put("Referer", this.yq + "/");
            kB cS = l3.tF(V3.q(str3, hashMap2)).cS("#post_container .post_hover");
            JSONArray jSONArray = new JSONArray();
            Iterator<hN> it = cS.iterator();
            while (it.hasNext()) {
                hN next = it.next();
                hN hNVar = next.cS("[class=zoom]").get(0);
                String N = hNVar.N("href");
                String N2 = hNVar.N("title");
                if (!FO.M(N2)) {
                    jSONArray.put(new JSONObject().put("vod_id", N).put("vod_name", N2).put("vod_pic", hNVar.cS("img").yq("src")).put("vod_remarks", next.cS("[rel=category tag]").t0()));
                }
            }
            return new JSONObject().put("pagecount", 999).put("list", jSONArray).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36");
            Va tF = l3.tF(V3.q(this.yq + list.get(0), hashMap));
            kB cS = tF.cS("#post_content");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<hN> it = cS.iterator();
            int i = 0;
            while (it.hasNext()) {
                i++;
                kB cS2 = it.next().cS("table a");
                ArrayList arrayList = new ArrayList();
                Iterator<hN> it2 = cS2.iterator();
                while (it2.hasNext()) {
                    hN next = it2.next();
                    String N = next.N("href");
                    String Fo = next.Fo();
                    if (N.startsWith("magnet")) {
                        arrayList.add(Fo + "$" + N);
                    }
                }
                if (arrayList.size() > 0) {
                    linkedHashMap.put("magnet" + i, TextUtils.join("#", arrayList));
                }
            }
            kB cS3 = tF.cS(".context");
            StringBuilder SN = P1.SN();
            Iterator<hN> it3 = cS3.iterator();
            while (it3.hasNext()) {
                hN next2 = it3.next();
                if (SN.length() != 0) {
                    SN.append("\n");
                }
                SN.append(next2.mG());
            }
            String Gc = P1.Gc(SN);
            String t0 = tF.cS(".article_container > h1").t0();
            String yq = tF.cS("#post_content img").yq("src");
            String N2 = N(Pattern.compile("◎类\u3000\u3000别\u3000(.*?)<br>"), Gc);
            String N3 = N(Pattern.compile("◎年\u3000\u3000代\u3000(.*?)<br>"), Gc);
            String N4 = N(Pattern.compile("◎产\u3000\u3000地\u3000(.*?)<br>"), Gc);
            String N5 = N(Pattern.compile("◎上映日期\u3000(.*?)<br>"), Gc);
            String yq2 = yq(Pattern.compile("◎演\u3000\u3000员\u3000(.*?)</p>"), Gc);
            if (yq2.equals("")) {
                yq2 = yq(Pattern.compile("◎主\u3000\u3000演\u3000(.*?)</p>"), Gc);
            }
            JSONObject put = new JSONObject().put("vod_id", list.get(0)).put("vod_name", t0).put("vod_pic", yq).put("type_name", N2).put("vod_year", N3).put("vod_area", N4).put("vod_remarks", N5).put("vod_actor", yq2).put("vod_director", yq(Pattern.compile("◎导\u3000\u3000演\u3000(.*?)<br>"), Gc)).put("vod_content", SN(Pattern.compile("◎简\u3000\u3000介(.*?)<hr>", 34), Gc));
            if (linkedHashMap.size() > 0) {
                put.put("vod_play_from", "此磁力源是边下载边播，内存小的慎用");
                put.put("vod_play_url", TextUtils.join("$$$", linkedHashMap.values()));
            }
            return new JSONObject().put("list", new JSONArray().put(put)).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            List asList = Arrays.asList("dianshiju/guoju", "dianshiju/rihanju", "dianshiju/oumeiju", "xijupian", "dongzuopian", "aiqingpian", "kehuanpian", "kongbupian", "juqingpian", "zhanzhengpian", "jilupian", "donghuapian");
            List asList2 = Arrays.asList("国剧", "日韩剧", "欧美剧", "喜剧片", "动作片", "爱情片", "科幻片", "恐怖片", "剧情片", "战争片", "纪录片", "动画片");
            for (int i = 0; i < asList.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", asList.get(i));
                jSONObject.put("type_name", asList2.get(i));
                if (!FO.M((String) asList2.get(i))) {
                    jSONArray.put(jSONObject);
                }
            }
            return new JSONObject().put("class", jSONArray).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str) {
        SixV.super.init(context, str);
        if (str.endsWith("/")) {
            str = str.substring(0, str.lastIndexOf("/"));
        }
        this.yq = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        ProxyOrigin.getan();
        try {
            return new JSONObject().put("parse", 0).put("header", "").put("playUrl", "").put("url", str2).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            Response execute = V3.SN().newCall(new Request.Builder().url(this.yq + "/e/search/11index.php").addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36").addHeader("Origin", this.yq).addHeader("Referer", this.yq + "/").post(new FormBody.Builder().add("show", "title").add("tempid", "1").add("tbname", "article").add("mid", "1").add("dopost", "search").add("submit", "").addEncoded("keyboard", str).build()).build()).execute();
            if (execute.body() == null) {
                return "";
            }
            String string = execute.body().string();
            execute.close();
            kB cS = rN.yq(string).cS("#post_container [class=zoom]");
            JSONArray jSONArray = new JSONArray();
            Iterator<hN> it = cS.iterator();
            while (it.hasNext()) {
                hN next = it.next();
                String N = next.N("href");
                String replaceAll = next.N("title").replaceAll("</?[^>]+>", "");
                if (!FO.M(replaceAll)) {
                    jSONArray.put(new JSONObject().put("vod_id", N).put("vod_name", replaceAll).put("vod_pic", next.cS("img").yq("src")).put("vod_remarks", ""));
                }
            }
            return new JSONObject().put("list", jSONArray).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
