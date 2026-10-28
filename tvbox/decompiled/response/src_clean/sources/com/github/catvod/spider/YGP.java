package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0004;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0128k;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class YGP extends Spider {

    private JSONObject yq;

    private static String SN(Pattern pattern, String str) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(1).trim() : str;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: دحوق  reason: contains not printable characters */
    public static JSONObject m1023(Object obj) {
        if (125 ^ C0037.f95 <= 0) {
            return ((YGP) obj).yq;
        }
        return null;
    }

    /* renamed from: غﺥﺙس  reason: contains not printable characters */
    public static HashMap m1024(Object obj) {
        if ((-556) ^ C0004.f4 < 0) {
            return ((YGP) obj).yq();
        }
        return null;
    }

    /* renamed from: هسﺩظ  reason: contains not printable characters */
    public static void m1025(Object obj) {
        if ((-388) ^ C0035.f93 < 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int i;
        int parseInt;
        String str3 = "span";
        String str4 = "https://www.6huo.com/";
        try {
            String[] strArr = {"", "", "", "", ""};
            String str5 = str4 + str;
            strArr[4] = str2;
            if (hashMap != null && hashMap.size() > 0) {
                for (String str6 : hashMap.keySet()) {
                    strArr[Integer.parseInt(str6)] = URLEncoder.encode(hashMap.get(str6));
                }
            }
            String W = C0068Pe.W(str5 + TextUtils.join("_", strArr), yq());
            Va yq = rN.yq(W);
            JSONObject jSONObject = new JSONObject();
            kB cS = yq.cS("p.page-nav a");
            if (cS.size() == 0) {
                int parseInt2 = Integer.parseInt(str2);
                i = parseInt2;
                parseInt = parseInt2;
            } else {
                int i2 = 0;
                int i3 = 0;
                while (i3 < cS.size()) {
                    hN hNVar = cS.get(i3);
                    i3++;
                    i2 = !isNumeric(hNVar.Fo()) ? i2 : i2 < Integer.parseInt(hNVar.Fo()) ? Integer.parseInt(hNVar.Fo()) : i2;
                }
                parseInt = Integer.parseInt(yq.cS("p.page-nav a.current").t0());
                i = i2;
            }
            JSONArray jSONArray = new JSONArray();
            if (!W.contains("没有找到您想要的结果哦")) {
                kB cS2 = yq.cS("div.inner-2col-main div.movlist > ul li > a");
                for (int i4 = 0; i4 < cS2.size(); i4++) {
                    hN hNVar2 = cS2.get(i4);
                    String N = hNVar2.N("href");
                    String N2 = PA.yq(str3, hNVar2).N("title");
                    String N3 = PA.yq("img", hNVar2).N("src");
                    if (!N3.contains("http")) {
                        N3 = str4 + N3;
                    }
                    String Fo = hNVar2.cS(str3).zH().Fo();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", N);
                    jSONObject2.put("vod_name", N2);
                    jSONObject2.put("vod_pic", N3);
                    jSONObject2.put("vod_remarks", Fo);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("page", parseInt);
            jSONObject.put("pagecount", i);
            jSONObject.put("limit", 30);
            jSONObject.put("total", i <= 1 ? jSONArray.length() : i * 30);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "$$$";
        String str9 = "btn-big btn-green tlist-btn";
        String str10 = "https://www.6huo.com/";
        String str11 = "暂无预告";
        String str12 = "div.movie-title-detail p";
        try {
            Va yq = rN.yq(C0068Pe.W(str10 + list.get(0).substring(1), yq()));
            yq.ee().contains(str11);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            yq.cS("div.inner-wrapper").get(0);
            String yq2 = yq.cS("div.movie-title-mpic > a >img").yq("src");
            String str13 = yq2.contains("http") ? yq2 : str10 + yq2;
            String t0 = yq.cS("h1.movie-name").t0();
            kB cS = yq.cS("div.movie-title-detail a");
            String str14 = "";
            String str15 = "";
            int i = 0;
            while (true) {
                int size = cS.size();
                str = "href";
                if (i >= size) {
                    break;
                }
                String Fo = cS.get(i).N(str).contains("country") ? cS.get(i).Fo() : str15;
                String str16 = cS.get(i).N(str).contains("movietype") ? str14 + cS.get(i).Fo() + "/" : str14;
                i++;
                str15 = Fo;
                str14 = str16;
            }
            String SN = SN(Pattern.compile("导演：(.+)主演"), yq.cS(str12).t0());
            String SN2 = SN(Pattern.compile("上映：(\\w+)"), yq.cS(str12).t0());
            String SN3 = SN(Pattern.compile("主演：(.+)剧情"), yq.cS(str12).t0());
            String SN4 = SN(Pattern.compile("剧情：(.+)\\(详细\\)"), yq.cS(str12).t0());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            kB cS2 = yq.cS("div.inner-wrapper a.current");
            if (!yq.ee().contains(str11)) {
                String str17 = "";
                int i2 = 0;
                String str18 = "";
                String str19 = "";
                while (i2 < cS2.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    if (cS2.get(i2).Fo().contains("预告")) {
                        arrayList.add(cS2.get(i2).Fo());
                        kB cS3 = yq.cS("div#tabwrapper-all tr td a");
                        for (int i3 = 0; i3 < cS3.size(); i3++) {
                            if (!cS3.get(i3).p(str9) && cS3.get(i3).p("tlist-bbs-tdtitle")) {
                                str18 = cS3.get(i3).Fo();
                            }
                            if (cS3.get(i3).p(str9)) {
                                String N = cS3.get(i3).N(str);
                                StringBuilder sb = new StringBuilder();
                                sb.append(str18);
                                sb.append("$");
                                sb.append(N);
                                arrayList3.add(sb.toString());
                            }
                        }
                        String join = arrayList3.size() > 1 ? TextUtils.join("#", arrayList3) : (String) arrayList3.get(0);
                        arrayList2.add(join);
                        if (arrayList2.size() > 1) {
                            str19 = TextUtils.join(str8, arrayList2);
                            str7 = TextUtils.join(str8, arrayList);
                        } else {
                            str7 = (String) arrayList.get(0);
                            str19 = join;
                        }
                    } else {
                        str7 = str17;
                    }
                    i2++;
                    str17 = str7;
                }
                str3 = str19;
                str4 = SN2;
                str5 = str14;
                str2 = str17;
            } else {
                str2 = "";
                str3 = "";
                str4 = SN2;
                str5 = str14;
            }
            if (str2.equals("")) {
                str6 = "暂无预告$www";
                str2 = str11;
            } else {
                str6 = str3;
            }
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", t0);
            jSONObject2.put("vod_pic", str13);
            jSONObject2.put("type_name", str5);
            jSONObject2.put("vod_year", str4);
            jSONObject2.put("vod_area", str15);
            jSONObject2.put("vod_remarks", "");
            jSONObject2.put("vod_actor", SN3);
            jSONObject2.put("vod_director", SN);
            jSONObject2.put("vod_content", SN4);
            jSONObject2.put("vod_play_from", str2);
            jSONObject2.put("vod_play_url", str6);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        String str = "span";
        String str2 = "https://www.6huo.com/";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            (jSONObject2.put("type_id","movlist/"));
            (jSONObject2.put("type_name","新片预告"));
            (jSONArray.put(jSONObject2));
            (jSONObject.put("class",jSONArray));
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
                        (jSONObject.put("filters",m1023(this)));
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            kB kBVar = (C0040.m1964(C0001.m32(str2, m1024(this))).cS("div.movlist > ul li > a"));
            JSONArray jSONArray2 = new JSONArray();
            int i2 = 0;
            while (true) {
                int i3 = (kBVar.size());
                int i4 = 1740;
                while (true) {
                    i4 ^= 1757;
                    switch (i4) {
                        case 17:
                            i4 = i2 < i3 ? 1833 : 1802;
                        case 54:
                        case 471:
                            (jSONObject.put("list",jSONArray2));
                            return (jSONObject.toString());
                        case 500:
                            hN hNVar = (hN) (kBVar.get(i2));
                            String str3 = (hNVar.N("href"));
                            String str4 = (C0000.m12(str, hNVar).N("title"));
                            String str5 = (C0000.m12("img", hNVar).N("src"));
                            boolean z2 = (str5.contains("http"));
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = z2 ? 48736 : 48705;
                                    case 47384:
                                        StringBuilder sb = new StringBuilder();
                                        (sb.append(str2));
                                        (sb.append(str5));
                                        str5 = (sb.toString());
                                        break;
                                    case 47417:
                                        int i6 = 48767;
                                        while (true) {
                                            i6 ^= 48784;
                                            switch (i6) {
                                                case 14:
                                                    break;
                                                case 239:
                                                    i6 = 48798;
                                            }
                                        }
                                        break;
                                    case 47483:
                                }
                            }
                            String str6 = (((hNVar.cS(str)).zH()).Fo());
                            JSONObject jSONObject3 = new JSONObject();
                            (jSONObject3.put("vod_id",str3));
                            (jSONObject3.put("vod_name",str4));
                            (jSONObject3.put("vod_pic",str5));
                            (jSONObject3.put("vod_remarks",str6));
                            (jSONArray2.put(jSONObject3));
                            i2++;
                            int i7 = 48891;
                            while (true) {
                                i7 ^= 48908;
                                switch (i7) {
                                    case 22:
                                        break;
                                    case 503:
                                        i7 = 48922;
                                }
                            }
                            break;
                    }
                }
            }
        } catch (Exception e) {
            m1025(e);
            return "";
        }
    }

    public void init(Context context) {
        YGP.super.init(context);
        try {
            this.yq = new JSONObject("{\"movlist/\":[{\"key\":\"1\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"灾难\",\"v\":\"灾难\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"冒险\",\"v\":\"冒险\"}]},{\"key\":\"0\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"2\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"},{\"n\":\"1999\",\"v\":\"1999\"},{\"n\":\"1998\",\"v\":\"1998\"},{\"n\":\"1980\",\"v\":\"1980\"}]},{\"key\":\"3\",\"name\":\"排序\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"最近更新\",\"v\":\"\"},{\"n\":\"上映时间\",\"v\":\"pubtime\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        cn.F5(false);
        try {
            JSONObject jSONObject = new JSONArray(C0068Pe.W("https://www.6huo.com/" + "?view=api&mode=download-data&rand=" + Math.random() + "&ttid=" + str2.split("/")[2], yq())).getJSONObject(0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("parse", 0);
            jSONObject2.put("playUrl", "");
            jSONObject2.put("url", jSONObject.getString("movurl"));
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = "span";
        String str3 = "https://www.6huo.com/";
        try {
            JSONObject jSONObject = new JSONObject();
            kB cS = rN.yq(C0068Pe.W(str3 + "?keyword=" + URLEncoder.encode(str) + "&view=search", yq())).cS("div.movlist > ul li > a");
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < cS.size(); i++) {
                hN hNVar = cS.get(i);
                String N = hNVar.N("href");
                String N2 = PA.yq(str2, hNVar).N("title");
                String N3 = PA.yq("img", hNVar).N("src");
                if (!N3.contains("http")) {
                    N3 = str3 + N3;
                }
                String Fo = hNVar.cS(str2).zH().Fo();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", N);
                jSONObject2.put("vod_name", N2);
                jSONObject2.put("vod_pic", N3);
                jSONObject2.put("vod_remarks", Fo);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    protected final HashMap<String, String> yq() {
        HashMap<String, String> SN = C0128k.SN("method", "GET", "User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36");
        SN.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        SN.put("Accept-Language", "zh-CN,zh;q=0.9");
        return SN;
    }
}
