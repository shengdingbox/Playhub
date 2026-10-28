package com.github.catvod.spider;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A4;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.rP;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class BpanSo extends Pan {
    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        try {
            cn.F5(true);
            return super.detailContent(list);
        } catch (Exception unused) {
            return "";
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new rP("1", "🍓本源是网盘搜索源，仅支持搜索"));
        return iX.Nl(arrayList2, arrayList, new JSONObject());
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", A4.i());
        hashMap.put("Referer", "https://www.melost.cn/film/" + URLEncoder.encode(str));
        hashMap.put("Origin", "https://www.melost.cn");
        ArrayList arrayList = new ArrayList();
        try {
            String string = C0068Pe.dT("https://www.melost.cn/v1/search/disk", "{\"page\":" + str2 + ",\"q\":\"" + str + "\",\"user\":\"\",\"exact\":true,\"distinct\":true,\"format\":[],\"share_time\":\"\",\"order\":\"create_desc\",\"size\":15,\"type\":\"BDY\",\"exclude_user\":[],\"format\":[\".mp4\",\".mkv\",\".flv\",\".rmvb\",\".wmv\",\".mov\",\".m3u8\",\".avi\",\".mpg\",\".mpeg\"],\"adv_params\":{\"wechat_pwd\":\"\",\"platform\":\"pc\"}}", hashMap).body().string();
            StringBuilder sb = new StringBuilder();
            sb.append("datas");
            sb.append(string);
            SpiderDebug.log(sb.toString());
            JSONArray jSONArray = new JSONObject(string).getJSONObject("data").getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ME me = new ME();
                me.B(jSONObject.getString("link"));
                String trim = jSONObject.getString("disk_name").replace("<em>", "").replace("</em>", "").trim();
                if (z && (trim.contains(str) || str.contains(trim))) {
                    trim = str;
                }
                me.G(trim);
                me.v3(jSONObject.getString("shared_time"));
                me.G4("https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/05/08/e4b3624dd3b03848c6f6915d437fea36.png");
                arrayList.add(me);
            }
        } catch (Exception unused) {
        }
        return iX.ee(arrayList);
    }
}
