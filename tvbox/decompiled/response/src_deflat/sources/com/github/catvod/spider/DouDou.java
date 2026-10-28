package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0032;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class DouDou extends Spider {

    public DouDou() {

        return;
    }

    private String SN(HashMap<String, String> hashMap) {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = ((hashMap.keySet()).iterator());
            while (true) {
                boolean z = (it.hasNext());
                String str = ",";

                if (z) {
                    String str2 = (String) (it.next());
                    boolean z2 = (str2.equals("sort"));
                    if (!(z2)) {
                        sb.append((String) (hashMap.get(str2)));
                        sb.append(str);
                    }
                } else {
                    return (sb.substring(0,(sb.lastIndexOf(str))));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private Map<String, String> yq() {
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        str4 = "Host";
        str5 = "frodo.douban.com";
        str2 = "Connection";
        str3 = "Keep-Alive";
        hashMap = C0055.m2325(str4, str5, str2, str3);
        str4 = "Referer";
        str5 = "https://servicewechat.com/wx2f9b06c1de1ccfca/84/page-frame.html";
        hashMap.put(str4,str5);
        str2 = "User-Agent";
        str3 = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat";
        hashMap.put(str2,str3);
        return hashMap;
    }

    /* renamed from: قخﺭﺙ  reason: contains not printable characters */
    public static Map m715(Object obj) {

        return ((DouDou) obj).yq();
    }

    /* renamed from: ﻱﻍﻙﻭ  reason: contains not printable characters */
    public static String m716(Object obj, Object obj2) {
        int i = 57 ^ C0032.f90;

        return ((DouDou) obj).SN((HashMap) obj2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 543
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String categoryContent(java.lang.String r22, java.lang.String r23, boolean r24, java.util.HashMap<java.lang.String, java.lang.String> r25) {
        /*
        Method dump skipped, instructions count: 2896
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.DouDou.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String homeContent(boolean z) {
        String str = "type_name";
        String str2 = "type_id";
        try {
            JSONObject jSONObject = ((new JSONObject().put(str2,"hot_gaia")).put(str,"热播电影"));
            JSONObject jSONObject2 = ((new JSONObject().put(str2,"tv_hot")).put(str,"热播剧集"));
            JSONObject jSONObject3 = ((new JSONObject().put(str2,"show_hot")).put(str,"热播综艺"));
            JSONObject jSONObject4 = ((new JSONObject().put(str2,"movie")).put(str,"电影筛选"));
            JSONObject jSONObject5 = ((new JSONObject().put(str2,"tv")).put(str,"电视筛选"));
            JSONArray jSONArray = (((((((new JSONArray().put(jSONObject)).put(jSONObject2)).put(jSONObject3)).put(jSONObject4)).put(jSONObject5)).put(((new JSONObject().put(str2,"rank_list_movie")).put(str,"电影榜单")))).put(((new JSONObject().put(str2,"rank_list_tv")).put(str,"电视剧榜单"))));
            JSONObject jSONObject6 = new JSONObject(C0022.m1443());
            JSONArray jSONArray2 = (new JSONObject(C0001.m32("https://frodo.douban.com/api/v2/subject_collection/subject_real_time_hotest/items?apikey=0ac44ae016490db2204ce0a042db2916", m715(this))).getJSONArray("subject_collection_items"));
            JSONArray jSONArray3 = new JSONArray();
            int i = 0;
            while (true) {
                int i2 = (jSONArray2.length());

                if (i < i2) {
                    JSONObject jSONObject7 = (jSONArray2.getJSONObject(i));
                    String str3 = (jSONObject7.optString("type"));
                    String str4 = (jSONObject7.getString("title"));
                    boolean z2 = ("playlist".equals(str3));
                    if (!z2) {
                        boolean z3 = ("ad".equals(str3));
                        if (!z3) {
                            boolean z4 = (TextUtils.isEmpty(str4));
                            if (!z4) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(((jSONObject7.getJSONObject("pic")).getString("normal")));
                                sb.append("@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
                                String str5 = (sb.toString());
                                String str6 = ((jSONObject7.getJSONObject("rating")).getString("value"));
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("vod_name",str4);
                                jSONObject8.put("vod_pic",str5);
                                jSONObject8.put("vod_remarks",str6);
                                jSONArray3.put(jSONObject8);
                            }
                        }
                    }
                    i++;
                } else {
                    return ((((new JSONObject().put("class",jSONArray)).put("filters",jSONObject6)).put("list",jSONArray3)).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
