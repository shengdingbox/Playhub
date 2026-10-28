package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0128k;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rN;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Opnxng extends Spider {
    protected Pattern yq = Pattern.compile("/voddetail/(\\w+).html");
    protected String SN = "https://www.lgyy.vip/";

    private HashMap<String, String> yq() {
        HashMap<String, String> SN = C0128k.SN("Content-Type", "application/x-www-form-urlencoded", "Origin", "null");
        SN.put("Connection", "keep-alive");
        SN.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        SN.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 15_7 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/15.6,2 Mobile/15E148 Safari/604.1");
        return SN;
    }

    public String searchContent(String str, boolean z) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("q", str + this.SN);
            hashMap.put("category_general", "1");
            hashMap.put("language", "all");
            hashMap.put("time_range", "");
            hashMap.put("safesearch", "0");
            hashMap.put("theme", "simple");
            kB cS = rN.yq(C0068Pe.B("https://search.hbubli.cc/", hashMap, yq())).cS("article.result.result-default.category-general");
            JSONArray jSONArray = new JSONArray();
            Iterator<hN> it = cS.iterator();
            while (it.hasNext()) {
                hN next = it.next();
                Objects.requireNonNull(next);
                hN yq = PA.yq("h3 a", next);
                String N = yq.N("href");
                SpiderDebug.log(N);
                Matcher matcher = this.yq.matcher(N);
                String group = matcher.find() ? matcher.group(1) : null;
                if (!TextUtils.isEmpty(group)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("vod_id", group);
                    jSONObject.put("vod_name", yq.Fo());
                    jSONArray.put(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
