package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0128k;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rN;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Auete extends Spider {
    private JSONObject N;
    private JSONObject SN;
    private String yq = "https://auete.cc/";
    private Pattern tF = Pattern.compile("/(\\w+)/index.html");
    private Pattern zH = Pattern.compile("/(\\w+/\\w+/\\w+)/");
    private Pattern i = Pattern.compile("(/\\w+/\\w+/\\w+/play-\\d+-\\d+.html)");
    private Pattern t0 = Pattern.compile("/index(\\d+).html");

    public Auete() {
        new ArrayList();
    }

    protected final HashMap<String, String> SN(String str) {
        HashMap<String, String> SN = C0128k.SN("method", "GET", "Upgrade-Insecure-Requests", "1");
        SN.put("DNT", "1");
        SN.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36");
        SN.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        SN.put("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        return SN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0153, code lost:
        r2 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[Catch: Exception -> 0x0216, TryCatch #0 {Exception -> 0x0216, blocks: (B:4:0x000e, B:6:0x0014, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:15:0x003b, B:16:0x0056, B:17:0x006b, B:18:0x007f, B:20:0x0087, B:21:0x0094, B:22:0x0099, B:23:0x00af, B:26:0x00d3, B:28:0x00dd, B:30:0x00e3, B:33:0x00f3, B:35:0x00f9, B:37:0x0101, B:39:0x0111, B:40:0x011a, B:45:0x0129, B:47:0x0131, B:49:0x0141, B:52:0x014f, B:54:0x0154, B:56:0x0161, B:57:0x0166, B:59:0x016c, B:62:0x017e, B:65:0x018b, B:68:0x0195, B:69:0x019b, B:72:0x01a5, B:73:0x01a9, B:76:0x01be, B:79:0x01cb, B:80:0x01e7, B:81:0x01ec, B:83:0x0202, B:84:0x0207, B:85:0x0209), top: B:90:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[Catch: Exception -> 0x0216, TryCatch #0 {Exception -> 0x0216, blocks: (B:4:0x000e, B:6:0x0014, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:15:0x003b, B:16:0x0056, B:17:0x006b, B:18:0x007f, B:20:0x0087, B:21:0x0094, B:22:0x0099, B:23:0x00af, B:26:0x00d3, B:28:0x00dd, B:30:0x00e3, B:33:0x00f3, B:35:0x00f9, B:37:0x0101, B:39:0x0111, B:40:0x011a, B:45:0x0129, B:47:0x0131, B:49:0x0141, B:52:0x014f, B:54:0x0154, B:56:0x0161, B:57:0x0166, B:59:0x016c, B:62:0x017e, B:65:0x018b, B:68:0x0195, B:69:0x019b, B:72:0x01a5, B:73:0x01a9, B:76:0x01be, B:79:0x01cb, B:80:0x01e7, B:81:0x01ec, B:83:0x0202, B:84:0x0207, B:85:0x0209), top: B:90:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3 A[Catch: Exception -> 0x0216, TRY_ENTER, TryCatch #0 {Exception -> 0x0216, blocks: (B:4:0x000e, B:6:0x0014, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:15:0x003b, B:16:0x0056, B:17:0x006b, B:18:0x007f, B:20:0x0087, B:21:0x0094, B:22:0x0099, B:23:0x00af, B:26:0x00d3, B:28:0x00dd, B:30:0x00e3, B:33:0x00f3, B:35:0x00f9, B:37:0x0101, B:39:0x0111, B:40:0x011a, B:45:0x0129, B:47:0x0131, B:49:0x0141, B:52:0x014f, B:54:0x0154, B:56:0x0161, B:57:0x0166, B:59:0x016c, B:62:0x017e, B:65:0x018b, B:68:0x0195, B:69:0x019b, B:72:0x01a5, B:73:0x01a9, B:76:0x01be, B:79:0x01cb, B:80:0x01e7, B:81:0x01ec, B:83:0x0202, B:84:0x0207, B:85:0x0209), top: B:90:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161 A[Catch: Exception -> 0x0216, TryCatch #0 {Exception -> 0x0216, blocks: (B:4:0x000e, B:6:0x0014, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:15:0x003b, B:16:0x0056, B:17:0x006b, B:18:0x007f, B:20:0x0087, B:21:0x0094, B:22:0x0099, B:23:0x00af, B:26:0x00d3, B:28:0x00dd, B:30:0x00e3, B:33:0x00f3, B:35:0x00f9, B:37:0x0101, B:39:0x0111, B:40:0x011a, B:45:0x0129, B:47:0x0131, B:49:0x0141, B:52:0x014f, B:54:0x0154, B:56:0x0161, B:57:0x0166, B:59:0x016c, B:62:0x017e, B:65:0x018b, B:68:0x0195, B:69:0x019b, B:72:0x01a5, B:73:0x01a9, B:76:0x01be, B:79:0x01cb, B:80:0x01e7, B:81:0x01ec, B:83:0x0202, B:84:0x0207, B:85:0x0209), top: B:90:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0202 A[Catch: Exception -> 0x0216, TryCatch #0 {Exception -> 0x0216, blocks: (B:4:0x000e, B:6:0x0014, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:15:0x003b, B:16:0x0056, B:17:0x006b, B:18:0x007f, B:20:0x0087, B:21:0x0094, B:22:0x0099, B:23:0x00af, B:26:0x00d3, B:28:0x00dd, B:30:0x00e3, B:33:0x00f3, B:35:0x00f9, B:37:0x0101, B:39:0x0111, B:40:0x011a, B:45:0x0129, B:47:0x0131, B:49:0x0141, B:52:0x014f, B:54:0x0154, B:56:0x0161, B:57:0x0166, B:59:0x016c, B:62:0x017e, B:65:0x018b, B:68:0x0195, B:69:0x019b, B:72:0x01a5, B:73:0x01a9, B:76:0x01be, B:79:0x01cb, B:80:0x01e7, B:81:0x01ec, B:83:0x0202, B:84:0x0207, B:85:0x0209), top: B:90:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0207 A[Catch: Exception -> 0x0216, TryCatch #0 {Exception -> 0x0216, blocks: (B:4:0x000e, B:6:0x0014, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:15:0x003b, B:16:0x0056, B:17:0x006b, B:18:0x007f, B:20:0x0087, B:21:0x0094, B:22:0x0099, B:23:0x00af, B:26:0x00d3, B:28:0x00dd, B:30:0x00e3, B:33:0x00f3, B:35:0x00f9, B:37:0x0101, B:39:0x0111, B:40:0x011a, B:45:0x0129, B:47:0x0131, B:49:0x0141, B:52:0x014f, B:54:0x0154, B:56:0x0161, B:57:0x0166, B:59:0x016c, B:62:0x017e, B:65:0x018b, B:68:0x0195, B:69:0x019b, B:72:0x01a5, B:73:0x01a9, B:76:0x01be, B:79:0x01cb, B:80:0x01e7, B:81:0x01ec, B:83:0x0202, B:84:0x0207, B:85:0x0209), top: B:90:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String categoryContent(java.lang.String r17, java.lang.String r18, boolean r19, java.util.HashMap<java.lang.String, java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Auete.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        String str;
        Exception e;
        boolean z;
        hN hNVar;
        String str2;
        String str3 = "";
        try {
            String str4 = this.yq + "/" + list.get(0) + "/";
            Va yq = rN.yq(C0068Pe.W(str4, SN(str4)));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Objects.requireNonNull(yq);
            hN yq2 = PA.yq("div.detail-main-card", yq);
            hN yq3 = PA.yq("div.detail-poster img", yq);
            hN yq4 = PA.yq("h1.detail-title", yq);
            String replace = yq4 == null ? str3 : yq4.Fo().replace("《", str3).replace("》", str3);
            String N = yq3 == null ? str3 : yq3.N("src");
            if (yq2 != null) {
                if (replace.isEmpty()) {
                    replace = yq2.N("data-pname");
                }
                if (N.isEmpty()) {
                    N = yq2.N("data-ppic");
                }
            }
            kB cS = yq.cS("div.message p");
            String str5 = str3;
            String str6 = str5;
            String str7 = str6;
            String str8 = str7;
            String str9 = str8;
            String str10 = str9;
            String str11 = str10;
            int i = 0;
            while (i < cS.size()) {
                hN hNVar2 = cS.get(i);
                cS = cS;
                if (!hNVar2.p("detail-section-title")) {
                    if (hNVar2.p("detail-des")) {
                        str5 = hNVar2.Fo();
                    } else {
                        hN yq5 = PA.yq("span.detail-label", hNVar2);
                        if (yq5 == null) {
                            str2 = str3;
                            str = str2;
                        } else {
                            str2 = yq5.Fo();
                            str = str3;
                        }
                        try {
                            hN yq6 = PA.yq("b", hNVar2);
                            String Fo = yq6 == null ? str : yq6.Fo();
                            if (Fo.isEmpty()) {
                                Fo = hNVar2.Fo();
                            }
                            if (str2.contains("分类")) {
                                str6 = Fo;
                            } else if (str2.contains("导演")) {
                                str11 = Fo;
                            } else if (str2.contains("主演")) {
                                str10 = Fo;
                            } else if (str2.contains("地区")) {
                                str8 = Fo;
                            } else if (str2.contains("年份")) {
                                str7 = Fo;
                            } else if (str2.contains("备注")) {
                                str9 = Fo;
                            }
                            i++;
                            str3 = str;
                        } catch (Exception e2) {
                            e = e2;
                            System.out.println(e);
                            return str;
                        }
                    }
                }
                str = str3;
                i++;
                str3 = str;
            }
            str = str3;
            if (str5.isEmpty()) {
                hN yq7 = PA.yq("div.message p.detail-des", yq);
                str5 = yq7 == null ? str : yq7.Fo();
            }
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", replace);
            jSONObject2.put("vod_pic", N);
            jSONObject2.put("type_name", str6);
            jSONObject2.put("vod_year", str7);
            jSONObject2.put("vod_area", str8);
            jSONObject2.put("vod_remarks", str9);
            jSONObject2.put("vod_actor", str10);
            jSONObject2.put("vod_director", str11);
            jSONObject2.put("vod_content", str5);
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.github.catvod.spider.Auete.1
                public int compare(String str12, String str13) {
                    try {
                        int i2 = Auete.this.SN.getJSONObject(str12).getInt("or");
                        int i3 = Auete.this.SN.getJSONObject(str13).getInt("or");
                        return (i2 != i3 && i2 - i3 <= 0) ? -1 : 1;
                    } catch (JSONException e3) {
                        System.out.println(e3);
                        return 1;
                    }
                }
            });
            kB cS2 = yq.cS("div.play-card#player_list");
            for (int i2 = 0; i2 < cS2.size(); i2++) {
                hN hNVar3 = cS2.get(i2);
                Objects.requireNonNull(hNVar3);
                hN yq8 = PA.yq("div.card-header span b", hNVar3);
                if (yq8 != null) {
                    String Fo2 = yq8.Fo();
                    int lastIndexOf = Fo2.lastIndexOf("』");
                    if (lastIndexOf >= 0) {
                        Fo2 = Fo2.substring(lastIndexOf + 1);
                    }
                    Iterator<String> keys = this.SN.keys();
                    while (true) {
                        if (!keys.hasNext()) {
                            z = false;
                            break;
                        }
                        String next = keys.next();
                        if (this.SN.getJSONObject(next).getString("sh").equals(Fo2)) {
                            Fo2 = next;
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        kB cS3 = hNVar3.cS("ul.episode-list li > a");
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < cS3.size(); i3++) {
                            Matcher matcher = this.i.matcher(cS3.get(i3).N("href"));
                            if (matcher.find()) {
                                arrayList.add(hNVar.Fo() + "$" + matcher.group(1));
                            }
                        }
                        String join = arrayList.size() > 0 ? TextUtils.join("#", arrayList) : str;
                        if (join.length() != 0) {
                            treeMap.put(Fo2, join);
                        }
                    }
                }
            }
            if (treeMap.size() > 0) {
                String join2 = TextUtils.join("$$$", treeMap.keySet());
                String join3 = TextUtils.join("$$$", treeMap.values());
                jSONObject2.put("vod_play_from", join2);
                jSONObject2.put("vod_play_url", join3);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e3) {
            e = e3;
            str = str3;
        }
    }

    public String homeContent(boolean z) {
        int i;
        String str;
        String str2;
        try {
            String str3 = this.yq;
            Va yq = rN.yq(C0068Pe.W(str3, SN(str3)));
            PrintStream printStream = System.out;
            printStream.println("doc--" + yq);
            kB cS = yq.cS("ul[class='navbar-nav mr-auto']> li a");
            JSONArray jSONArray = new JSONArray();
            Iterator<hN> it = cS.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                hN next = it.next();
                String Fo = next.Fo();
                if (Fo.equals("电影") || Fo.equals("电视剧") || Fo.equals("综艺") || Fo.equals("动漫") || Fo.equals("其他")) {
                    i = 1;
                }
                if (i != 0) {
                    Matcher matcher = this.tF.matcher(next.N("href"));
                    if (matcher.find()) {
                        String trim = matcher.group(1).trim();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type_id", trim);
                        jSONObject.put("type_name", Fo);
                        jSONArray.put(jSONObject);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                jSONObject2.put("filters", this.N);
            }
            jSONObject2.put("class", jSONArray);
            try {
                kB cS2 = yq.cS("ul.threadlist").get(0).cS("li");
                JSONArray jSONArray2 = new JSONArray();
                while (i < cS2.size()) {
                    hN hNVar = cS2.get(i);
                    Objects.requireNonNull(hNVar);
                    hN yq2 = PA.yq("h2 a", hNVar);
                    if (yq2 != null) {
                        String N = yq2.N("title");
                        if (!FO.M(N)) {
                            hN yq3 = PA.yq("a.pic img", hNVar);
                            if (yq3 == null) {
                                str = "";
                            } else {
                                str = yq3.N("src");
                            }
                            hN yq4 = PA.yq("span.hdtag", hNVar);
                            if (yq4 == null) {
                                str2 = "";
                            } else {
                                str2 = yq4.Fo();
                            }
                            Matcher matcher2 = this.zH.matcher(PA.yq("a", hNVar).N("href"));
                            if (matcher2.find()) {
                                String group = matcher2.group(1);
                                if (!group.contains("/jqp/")) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("vod_id", group);
                                    jSONObject3.put("vod_name", N);
                                    jSONObject3.put("vod_pic", str);
                                    jSONObject3.put("vod_remarks", str2);
                                    jSONArray2.put(jSONObject3);
                                }
                            }
                        }
                    }
                    i++;
                }
                jSONObject2.put("list", jSONArray2);
            } catch (Exception e) {
                System.out.println(e);
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            System.out.println(e2);
            return "";
        }
    }

    public void init(Context context) {
        Auete.super.init(context);
        try {
            this.SN = new JSONObject("{\"byun\":{\"sh\":\"云播B线\",\"pu\":\"\",\"sn\":0,\"or\":999},\"yyun\":{\"sh\":\"云播Y线\",\"pu\":\"\",\"sn\":0,\"or\":999},\"cyun\":{\"sh\":\"云播C线\",\"pu\":\"\",\"sn\":0,\"or\":999},\"dbm3u8\":{\"sh\":\"云播D线\",\"pu\":\"\",\"sn\":0,\"or\":999},\"i8i\":{\"sh\":\"云播E线\",\"pu\":\"\",\"sn\":0,\"or\":999},\"m3u8hd\":{\"sh\":\"云播F线\",\"pu\":\"https://haozhansou.com/api/mp.php?url=\",\"sn\":1,\"or\":999},\"oyun\":{\"sh\":\"云播O线\",\"pu\":\"https://haozhansou.com/api/mp.php?url=\",\"sn\":1,\"or\":999},\"languang\":{\"sh\":\"云播G线\",\"pu\":\"https://haozhansou.com/api/mp.php?url=\",\"sn\":1,\"or\":999},\"hyun\":{\"sh\":\"云播H线\",\"pu\":\"https://haozhansou.com/api/mp.php?url=\",\"sn\":1,\"or\":999},\"kyun\":{\"sh\":\"云播K线\",\"pu\":\"https://haozhansou.com/api/mp.php?url=\",\"sn\":1,\"or\":999},\"xun\":{\"sh\":\"云播X线\",\"pu\":\"\",\"sn\":0,\"or\":999},\"bpyueyu\":{\"sh\":\"云播粤语\",\"pu\":\"\",\"sn\":0,\"or\":999},\"bpguoyu\":{\"sh\":\"云播国语\",\"pu\":\"\",\"sn\":0,\"or\":999},\"lyun\":{\"sh\":\"云播L线\",\"pu\":\"https://haozhansou.com/api/mp.php?url=\",\"sn\":1,\"or\":999},\"myun\":{\"sh\":\"云播M线\",\"pu\":\"\",\"sn\":0,\"or\":999},\"dp\":{\"sh\":\"Dplayer\",\"pu\":\"\",\"sn\":0,\"or\":999}}");
            this.N = new JSONObject("{\"Movie\":[{\"key\":0,\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧片\",\"v\":\"xjp\"},{\"n\":\"动作片\",\"v\":\"dzp\"},{\"n\":\"爱情片\",\"v\":\"aqp\"},{\"n\":\"科幻片\",\"v\":\"khp\"},{\"n\":\"恐怖片\",\"v\":\"kbp\"},{\"n\":\"惊悚片\",\"v\":\"jsp\"},{\"n\":\"战争片\",\"v\":\"zzp\"},{\"n\":\"剧情片\",\"v\":\"jqp\"}]}],\"Tv\":[{\"key\":0,\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"美剧\",\"v\":\"oumei\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"泰剧\",\"v\":\"yataiju\"},{\"n\":\"网剧\",\"v\":\"wangju\"},{\"n\":\"台剧\",\"v\":\"taiju\"},{\"n\":\"国产\",\"v\":\"neidi\"},{\"n\":\"港剧\",\"v\":\"tvbgj\"}]}],\"Zy\":[{\"key\":0,\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国综\",\"v\":\"guozong\"},{\"n\":\"韩综\",\"v\":\"hanzong\"},{\"n\":\"美综\",\"v\":\"meizong\"}]}],\"Dm\":[{\"key\":0,\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"日漫\",\"v\":\"riman\"},{\"n\":\"国漫\",\"v\":\"guoman\"},{\"n\":\"美漫\",\"v\":\"meiman\"}]}],\"qita\":[{\"key\":0,\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"纪录片\",\"v\":\"Jlp\"},{\"n\":\"经典片\",\"v\":\"Jdp\"},{\"n\":\"经典剧\",\"v\":\"Jdj\"},{\"n\":\"网大电影\",\"v\":\"wlp\"},{\"n\":\"国产老电影\",\"v\":\"laodianying\"}]}]}");
        } catch (JSONException e) {
            System.out.println(e);
        }
    }

    public void init(Context context, String str) {
        Auete.super.init(context, str);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("siteUrl");
                if (optString.startsWith("http")) {
                    this.yq = optString;
                }
                Arrays.asList(jSONObject.optString("filterSpeedUp").split(","));
            }
        } catch (Exception e) {
            InitOrigin.show(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x015b A[Catch: Exception -> 0x0195, TryCatch #0 {Exception -> 0x0195, blocks: (B:3:0x0004, B:5:0x000c, B:6:0x000f, B:7:0x003d, B:9:0x0043, B:11:0x005b, B:13:0x0065, B:16:0x0076, B:19:0x008c, B:21:0x00a4, B:24:0x00b0, B:26:0x00c6, B:27:0x00db, B:28:0x00e9, B:32:0x0100, B:34:0x010c, B:36:0x0112, B:37:0x0120, B:39:0x0126, B:42:0x014f, B:44:0x015b, B:46:0x016f, B:48:0x0183, B:50:0x0190), top: B:55:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String playerContent(java.lang.String r17, java.lang.String r18, java.util.List<java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Auete.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        String str3;
        String str4;
        try {
            String str5 = this.yq + "auete4so.php?searchword=" + Rc.b(str);
            if (!str2.equals("1")) {
                str5 = str5 + "&page=" + str2;
            }
            Va yq = rN.yq(C0068Pe.W(str5, SN(str5)));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            kB cS = yq.cS("ul.threadlist li");
            for (int i = 0; i < cS.size(); i++) {
                hN hNVar = cS.get(i);
                Objects.requireNonNull(hNVar);
                hN yq2 = PA.yq("h2 a", hNVar);
                if (yq2 != null) {
                    String N = yq2.N("title");
                    if (!FO.M(N)) {
                        hN yq3 = PA.yq("a.pic img", hNVar);
                        if (yq3 == null) {
                            str3 = "";
                        } else {
                            str3 = yq3.N("src");
                        }
                        hN yq4 = PA.yq("span.hdtag", hNVar);
                        if (yq4 == null) {
                            str4 = "";
                        } else {
                            str4 = yq4.Fo();
                        }
                        Matcher matcher = this.zH.matcher(PA.yq("a", hNVar).N("href"));
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            if (!group.contains("/jqp/")) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("vod_id", group);
                                jSONObject2.put("vod_name", N);
                                jSONObject2.put("vod_pic", str3);
                                jSONObject2.put("vod_remarks", str4);
                                jSONArray.put(jSONObject2);
                            }
                        }
                    }
                }
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            System.out.println(e);
            return "";
        }
    }
}
