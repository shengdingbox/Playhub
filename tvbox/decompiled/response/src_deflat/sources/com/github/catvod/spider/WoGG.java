package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.A7;
import com.github.catvod.spider.merge.C0065Ku;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.eb;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.jv;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class WoGG extends Pan {
    private static boolean n;

    private String O = "https://wogg.xxooo.cf/";
    private Pattern g1 = Pattern.compile("/voddetail/(\\d+).html");
    private String s = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKlt/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Safari/537.36";

    /* renamed from: طنـم  reason: contains not printable characters */
    public static String m998(Object obj) {
        if ((-604) ^ C0013.f13 > 0) {
            return ((WoGG) obj).s;
        }
        return null;
    }

    /* renamed from: ﺽسوﺫ  reason: contains not printable characters */
    public static void m999(Object obj) {
        if (596 ^ C0009.f9 < 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ﻉـﺡق  reason: contains not printable characters */
    public static String m1000(Object obj) {
        if ((-31) ^ C0041.f99 > 0) {
            return ((WoGG) obj).O;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3 = ".html";
        String str4 = "-";
        String str5 = "vodshow/";
        try {
            String[] strArr = {"", "", "", "", "", "", "", "", "", "", "", ""};
            strArr[0] = str;
            strArr[8] = str2;
            if (hashMap != null && hashMap.size() > 0) {
                for (String str6 : hashMap.keySet()) {
                    strArr[Integer.parseInt(str6)] = URLEncoder.encode(hashMap.get(str6));
                }
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String v = C0068Pe.v(this.O + str5 + TextUtils.join(str4, strArr) + str3, Rc.M(this.s), 5);
            if (Rc.ee(v)) {
                v = refTry(str5 + TextUtils.join(str4, strArr) + str3);
            }
            kB cS = rN.yq(v).cS("div.module-item");
            for (int i = 0; i < cS.size(); i++) {
                hN hNVar = cS.get(i);
                hN tF = hNVar.cS("div.module-item-pic>a").tF();
                String N = tF.N("title");
                String pic = getPic(PA.yq("img.lazyloaded", hNVar).N("data-src"));
                String Fo = PA.yq("div.module-item-text", hNVar).Fo();
                String Fo2 = PA.yq("div.module-item-caption span", hNVar).Fo();
                Matcher matcher = this.g1.matcher(tF.N("href"));
                if (matcher.find()) {
                    String group = matcher.group(1);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", group);
                    jSONObject2.put("vod_name", N);
                    jSONObject2.put("vod_pic", pic);
                    jSONObject2.put("vod_remarks", Fo);
                    jSONObject2.put("vod_year", Fo2);
                    jSONArray.put(jSONObject2);
                }
            }
            eb.t0(jSONArray, jSONObject, str2);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 366
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // com.github.catvod.spider.Pan
    public java.lang.String detailContent(java.util.List<java.lang.String> r24) {
        /*
            Method dump skipped, instructions count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.WoGG.detailContent(java.util.List):java.lang.String");
    }

    public void getKey() {
        String yq = new jv().yq(new ArrayList(Arrays.asList("http://woggpan.888484.xyz/", "http://wogg.xxooo.cf/", "http://edgeong.wogg.333232.xyz/", "http://www.wogg.live/", "http://woggpan.333232.xyz/", "http://www.wogg.net/")));
        this.O = yq;
        if (yq.length() > 4) {
            C0065Ku.i("wogg_site", this.O);
        }
    }

    public String getPic(String str) {
        if (!str.contains("douban")) {
            return str;
        }
        return str.replace("/db.php?url=", "") + "@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36";
    }

    public void getSite() {
        String tF = C0065Ku.tF("wogg_site");
        if (tF.contains("http")) {
            this.O = tF;
        } else {
            getKey();
        }
    }

    public String homeContent(boolean z) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        kB cS;
        int i;
        String str = "list";
        try {
            jSONArray = new JSONArray();
            jSONObject = new JSONObject();
            eb.Gc("1", "电影", jSONArray);
            eb.Gc("2", "剧集", jSONArray);
            eb.Gc("44", "臻彩", jSONArray);
            eb.Gc("6", "短漫剧", jSONArray);
            eb.Gc("3", "动漫", jSONArray);
            eb.Gc("4", "综艺", jSONArray);
            eb.Gc("46", "纪录片", jSONArray);
            eb.Gc("5", "音乐", jSONArray);
            String v = C0068Pe.v(this.O, Rc.M(this.s), 3);
            if (Rc.ee(v)) {
                v = refTry(this.O);
            }
            Va yq = rN.yq(v);
            if (z) {
                jSONObject.put("filters", new JSONObject("{\"1\":[{\"key\":\"3\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"}]},{\"key\":\"11\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"}]},{\"key\":\"1\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]}],\"44\":[{\"key\":\"3\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"}]},{\"key\":\"11\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"}]},{\"key\":\"1\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]}],\"2\":[{\"key\":\"3\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"}]},{\"key\":\"11\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"}]},{\"key\":\"1\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]}],\"6\":[{\"key\":\"3\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"男频\",\"v\":\"男频\"},{\"n\":\"女频\",\"v\":\"女频\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"甜宠\",\"v\":\"甜宠\"},{\"n\":\"年代\",\"v\":\"年代\"},{\"n\":\"穿越\",\"v\":\"穿越\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"亲情\",\"v\":\"亲情\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"萌宝\",\"v\":\"萌宝\"},{\"n\":\"重生\",\"v\":\"重生\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"逆袭\",\"v\":\"逆袭\"},{\"n\":\"虐恋\",\"v\":\"虐恋\"},{\"n\":\"复仇\",\"v\":\"复仇\"},{\"n\":\"修仙\",\"v\":\"修仙\"},{\"n\":\"鉴宝\",\"v\":\"鉴宝\"}]},{\"key\":\"11\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"}]}],\"5\":[{\"key\":\"5\",\"name\":\"字母\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0-9\",\"v\":\"0-9\"}]}],\"4\":[{\"key\":\"11\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"}]},{\"key\":\"1\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"其他\",\"v\":\"其他\"}]}],\"46\":[{\"key\":\"11\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}],\"3\":[{\"key\":\"11\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"}]},{\"key\":\"1\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"中国大陆\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"其他\",\"v\":\"其他\"}]}]}"));
            }
            jSONArray2 = new JSONArray();
            cS = yq.cS("div.module-lines-list");
            i = 0;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
        while (true) {
            int i2 = i;
            if (i2 < cS.size()) {
                kB cS2 = cS.get(i2).cS("div.module-item");
                for (int i3 = 0; i3 < cS2.size(); i3++) {
                    hN hNVar = cS2.get(i3);
                    hN tF = hNVar.cS("div.module-item-pic>a").tF();
                    String N = tF.N("title");
                    String pic = getPic(PA.yq("img.lazyloaded", hNVar).N("data-src"));
                    String Fo = PA.yq("div.module-item-caption span", hNVar).Fo();
                    String Fo2 = PA.yq("div.module-item-text", hNVar).Fo();
                    Matcher matcher = this.g1.matcher(tF.N("href"));
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("vod_id", group);
                            jSONObject2.put("vod_name", N);
                            jSONObject2.put("vod_pic", pic);
                            jSONObject2.put("vod_remarks", Fo2);
                            jSONObject2.put("vod_year", Fo);
                            jSONArray2.put(jSONObject2);
                        } catch (Exception e2) {
                            SpiderDebug.log(e2);
                        }
                    }
                }
                i = i2 + 1;
            } else {
                try {
                    break;
                } catch (Exception e3) {
                    SpiderDebug.log(e3);
                }
            }
            SpiderDebug.log(e);
            return "";
        }
        jSONObject.put("class", jSONArray);
        jSONObject.put(str, jSONArray2);
        jSONObject.put(str, jSONArray2);
        return jSONObject.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        String str2 = "siteUrl";
        try {
            JSONObject jSONObject = new JSONObject(str);
            super.init(context, str);
            if (jSONObject.has(str2)) {
                this.O = jSONObject.getString(str2);
            } else {
                getSite();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObject = new JSONObject();
        if (!this.O.contains("wogg") && !this.O.contains("tvfan")) {
            return jSONObject.toString();
        }
        try {
            return super.playerContent(str, str2, list);
        } catch (Exception e) {
            return "";
        }
    }

    public String refTry(String str) {
        if (n) {
            return "";
        }
        getKey();
        n = true;
        return C0068Pe.v(str.startsWith("http") ? this.O : A7.N(new StringBuilder(), this.O, str), Rc.M(this.s), 3);
    }

    public String searchContent(String str, boolean z) {
        String str2 = "vodsearch/-------------.html?wd=";
        try {
            String v = C0068Pe.v(this.O + str2 + URLEncoder.encode(str), Rc.M(this.s), 3);
            if (Rc.ee(v)) {
                v = refTry(str2 + URLEncoder.encode(str));
            }
            Va yq = rN.yq(v);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            kB cS = yq.cS("div.module-search-item");
            for (int i = 0; i < cS.size(); i++) {
                hN hNVar = cS.get(i);
                hN tF = hNVar.cS("div.video-info-header  h3  a").tF();
                String Fo = tF.Fo();
                if (Fo.contains(str)) {
                    String Fo2 = hNVar.cS("div.video-info-header a.video-serial").tF().Fo();
                    String pic = getPic(hNVar.cS("div.module-item-pic img").yq("data-src"));
                    Matcher matcher = this.g1.matcher(tF.N("href"));
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("vod_id", group);
                        jSONObject2.put("vod_name", Fo);
                        jSONObject2.put("vod_pic", pic);
                        jSONObject2.put("vod_remarks", Fo2);
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
