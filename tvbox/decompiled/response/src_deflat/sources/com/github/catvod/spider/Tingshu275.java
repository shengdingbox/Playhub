package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0010;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Tingshu275 extends Spider {

    private String yq = "https://app.365ting.com";

    public Tingshu275() {

        return;
    }

    private Map<String, String> yq() {
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap();
        str2 = "User-Agent";
        str3 = "TingShiJie/1.8.8 (m.i275.com)";
        hashMap.put(str2,str3);
        return hashMap;
    }

    /* renamed from: طدﺭﺵ  reason: contains not printable characters */
    public static Map m980(Object obj) {

        return ((Tingshu275) obj).yq();
    }

    /* renamed from: طشﻉﺭ  reason: contains not printable characters */
    public static String m981(Object obj) {
        int i = (-703) ^ C0036.f94;

        return ((Tingshu275) obj).yq;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int i;
        HashMap hashMap2 = new HashMap();

        if (!(hashMap == null)) {
            int i3 = (hashMap.size());
            if (!(i3 <= 0)) {
                hashMap2.putAll(hashMap);
            }
        }
        String str3 = "cateId";
        Object obj = (hashMap2.get(str3));

        if (obj != null) {
            str = (String) (hashMap2.get(str3));
        } else {
            str = (String) (hashMap2.get(str3));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m981(this));
        sb.append((String.format("categoryList?size=10&page=%s&categoryId=%s",new Object[]{str2, str})));
        String str4 = C0028.m1633((sb.toString()), m980(this));
        int i7 = (Integer.parseInt(str2));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = ((new JSONObject(str4).getJSONObject("data")).getJSONArray("list"));
        int i8 = 0;
        while (true) {
            int i9 = (jSONArray.length());

            if (i8 < i9) {
                JSONObject jSONObject = (jSONArray.getJSONObject(i8));
                arrayList.add(new ME((jSONObject.getString("id")), (jSONObject.getString("bookTitle")), (jSONObject.getString("bookImage")), (jSONObject.getString("bookAnchor"))));
                i8++;
            } else {
                int i11 = (arrayList.size());
                if (i11 >= 10) {
                    i = i7 + 1;
                } else {
                    i = i7;
                    i = i7 + 1;
                }
                iX iXVar = new iX();
                iXVar.b(arrayList);
                iXVar.dT(i7,i,10,0);
                return (iXVar.toString());
            }
        }
    }

    public String detailContent(List<String> list) {
        int i = 0;
        String str = (String) (list.get(0));
        StringBuilder sb = new StringBuilder();
        sb.append(m981(this));
        sb.append("book?bookId=");
        sb.append(str);
        JSONObject jSONObject = new JSONObject(C0028.m1633((sb.toString()), m980(this)));
        String str2 = "data";
        JSONObject jSONObject2 = ((jSONObject.getJSONObject(str2)).getJSONObject("bookData"));
        ME me = new ME();
        me.B(str);
        me.G((jSONObject2.optString("bookTitle")));
        me.G4((jSONObject2.optString("bookImage")));
        me.t0((jSONObject2.optString("categoryName")));
        me.KJ((jSONObject2.optString("bookDesc")));
        String str3 = "bookAnchor";
        me.q((jSONObject2.optString(str3)));
        me.Gc((jSONObject2.optString(str3)));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m981(this));
        sb2.append("chapter?size=9999&page=1&sort=asc&bookId=");
        sb2.append(str);
        JSONArray jSONArray = ((new JSONObject(C0028.m1633((sb2.toString()), m980(this))).getJSONObject(str2)).getJSONArray("list"));
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            int i2 = (jSONArray.length());

            if (i < i2) {
                JSONObject jSONObject3 = (jSONArray.getJSONObject(i));
                StringBuilder sb3 = new StringBuilder();
                sb3.append((jSONObject3.getString("title")));
                sb3.append("$");
                sb3.append((jSONObject3.getString("chapterId")));
                sb3.append("|||");
                sb3.append(str);
                arrayList.add((sb3.toString()));
                i++;
            } else {
                int i5 = (arrayList.size());
                if (!(i5 <= 0)) {
                    linkedHashMap.put("直链",(TextUtils.join("#",arrayList)));
                }
                int i7 = (linkedHashMap.size());
                if (!(i7 <= 0)) {
                    Set set = (linkedHashMap.keySet());
                    String str4 = "$$$";
                    me.dT((TextUtils.join(str4,set)));
                    me.F5((TextUtils.join(str4,(linkedHashMap.values()))));
                }
                return C0000.m21(me);
            }
        }
    }

    public String homeContent(boolean z) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        List list = (Arrays.asList(new String[]{"6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "49"}));
        List list2 = (Arrays.asList(new String[]{"玄幻奇幻", "都市言情", "宫斗女频", "官场商战", "武侠仙侠", "刑侦推理", "探险科幻", "重生穿越", "恐怖惊悚", "文学历史", "两性情感"}));
        while (true) {
            int i2 = i;
            int i3 = (list.size());

            if (i2 < i3) {
                arrayList.add(new rP((String) (list.get(i2)), (String) (list2.get(i2))));
                i = i2 + 1;
            } else {
                return C0000.m9(arrayList, new JSONObject("{}"));
            }
        }
    }

    public void init(Context context) {
        this.yq = C0028.m1633("http://117.72.112.234:8090/config/tingchina2025.txt", m980(this));
        int i = (-767) ^ C0037.f95;

        return;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = null;
        String str4 = null;
        String str5 = null;
        StringBuilder sb = null;
        String str6 = null;
        Map map = null;
        JSONObject jSONObject = null;
        iX iXVar = null;
        HashMap hashMap = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        str3 = "\\|\\|\\|";
        str4 = (str2.split(str3))[1];
        str2 = (str2.split(str3))[0];
        str3 = (String.valueOf(System.currentTimeMillis()));
        str5 = C0020.m1367(str3);
        sb = new StringBuilder();
        str6 = m981(this);
        sb.append(str6);
        str6 = "AppGetChapterUrl2023?timeStamp=";
        sb.append(str6);
        sb.append(str3);
        str6 = "&uid=&chapterId=";
        sb.append(str6);
        sb.append(str2);
        str3 = "&addItParapet=";
        sb.append(str3);
        sb.append(str5);
        str6 = "&bookId=";
        sb.append(str6);
        sb.append(str4);
        str2 = (sb.toString());
        map = m980(this);
        str3 = C0028.m1633(str2, map);
        jSONObject = new JSONObject(str3);
        iXVar = new iX();
        str5 = "src";
        str6 = (jSONObject.getString(str5));
        iXVar.s(str6,false);
        hashMap = new HashMap();
        str4 = "User-Agent";
        str2 = "listen/1.8.9 (Linux;Android 12) ExoPlayerLib/2.8.4";
        hashMap.put(str4,str2);
        iXVar.KJ(hashMap);
        return (iXVar.toString());
    }

    public String searchContent(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(m981(this));
        sb.append("/listen/apphaidao/appSearch?search=");
        sb.append(C0010.m314(str));
        JSONArray jSONArray = ((new JSONObject(C0028.m1633((sb.toString()), m980(this))).getJSONObject("data")).getJSONArray("bookData"));
        int i = 0;
        while (true) {
            int i2 = (jSONArray.length());

            if (i < i2) {
                JSONObject jSONObject = (jSONArray.getJSONObject(i));
                arrayList.add(new ME((jSONObject.getString("id")), (jSONObject.getString("bookTitle")), (jSONObject.getString("bookImage")), (jSONObject.getString("bookAnchor"))));
                i++;
            } else {
                return C0022.m1435(arrayList);
            }
        }
    }

    public String searchContent(String str, boolean z) {
        String str3 = null;
        String str4 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        str4 = "1";
        str3 = (this.searchContent(str,str4));
        return str3;
    }

    public String searchContent(String str, boolean z, String str2) {
        return (this.searchContent(str,str2));
    }
}
