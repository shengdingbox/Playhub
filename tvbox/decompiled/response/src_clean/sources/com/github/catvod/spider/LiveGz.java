package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0005;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class LiveGz extends Spider {

    private String yq = "https://api.moe3dze.com";

    public LiveGz() {
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        break;
                    
                case 204:
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x025f, code lost:
        (r4.append(r3));
        (r4.append(r11));
        (r4.append(r12));
        (r4.append(r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.github.catvod.spider.merge.ME SN(org.json.JSONObject r17, int r18) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.LiveGz.SN(org.json.JSONObject, int):com.github.catvod.spider.merge.ME");
    }

    private List<ME> yq(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = (str.split("-"));
        StringBuilder sb = C0052.m2253("{\"frame\":\"0\",\"hot\":\"");
        int i = 0;
        (sb.append(strArr[0]));
        (sb.append("\",\"tag\":\""));
        (sb.append(strArr[1]));
        (sb.append("\",\"type\":\""));
        String str2 = C0032.m1739(sb, strArr[2], "\"}");
        String str3 = "KANGEQIU@8868!~.";
        String str4 = "0200010900030207";
        String str5 = C0039.m1940(str2, str3, str4, 0);
        String str6 = C0032.m1739(new StringBuilder(), m851(this), "/gz/live/sports?parameter=key");
        HashMap hashMap = C0055.m2325("User-Agent", "okhttp/3.12.0", "client-version", "3.0.4.0");
        HashMap hashMap2 = new HashMap();
        (hashMap2.put("parameter",str5));
        JSONArray jSONArray = new JSONArray(C0031.m1720((new JSONObject((C0005.m167(str6, hashMap2, hashMap).yq())).getString("data")), str3, str4));
        while (true) {
            int i2 = (jSONArray.length());
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                    case 49:
                        i3 = i < i2 ? 1709 : 1678;
                    case 204:
                        JSONObject jSONObject = (jSONArray.getJSONObject(i));
                        int i4 = (jSONObject.getInt("m_status"));
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            switch (i5) {
                                case 17:
                                    i5 = i4 == 2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    (arrayList.add(m853(this, jSONObject, i4)));
                                    break;
                                case 500:
                                    int i6 = 1864;
                                    while (true) {
                                        i6 ^= 1881;
                                        switch (i6) {
                                            case 17:
                                                i6 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        i++;
                        int i7 = 48767;
                        while (true) {
                            i7 ^= 48784;
                            switch (i7) {
                                case 14:
                                    break;
                                case 239:
                                    i7 = 48798;
                            }
                        }
                        break;
                    case 239:
                        return arrayList;
                }
            }
        }
    }

    /* renamed from: ضغﺩف  reason: contains not printable characters */
    public static String m851(Object obj) {
        int i = 125 ^ C0037.f95;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((LiveGz) obj).yq;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: قﻩذﺯ  reason: contains not printable characters */
    public static void m852(Object obj) {
        int i = 916 ^ C0002.f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    SpiderDebug.log((Throwable) obj);
                    return;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: لـطﺥ  reason: contains not printable characters */
    public static ME m853(Object obj, Object obj2, int i) {
        int i2 = (-824) ^ C0004.f4;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((LiveGz) obj).SN((JSONObject) obj2, i);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﻭـﻍﺯ  reason: contains not printable characters */
    public static List m854(Object obj, Object obj2) {
        int i = 284 ^ C0041.f99;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((LiveGz) obj).yq((String) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        List list = null;
                // [deflattened] 控制流平坦化已还原为线性代码
        list = m854(this, str);
        str = C0022.m1435(list);
        return str;
}

    public String detailContent(List<String> list) {
        int i = 0;
        String[] strArr = ((String) (list.get(0)).split("-"));
        StringBuilder sb = C0052.m2253("{\"ball_type\":\"");
        (sb.append(strArr[2]));
        (sb.append("\",\"match_id\":\""));
        (sb.append(strArr[1]));
        (sb.append("\",\"mid\":\""));
        String str = C0032.m1739(sb, strArr[0], "\"}");
        String str2 = "KANGEQIU@8868!~.";
        String str3 = "0200010900030207";
        String str4 = C0039.m1940(str, str2, str3, 0);
        String str5 = C0032.m1739(new StringBuilder(), m851(this), "/gz/live/detail?parameter=key");
        HashMap hashMap = C0055.m2325("User-Agent", "okhttp/3.12.0", "client-version", "3.0.4.0");
        HashMap hashMap2 = new HashMap();
        (hashMap2.put("parameter",str4));
        JSONObject jSONObject = new JSONObject(C0031.m1720((new JSONObject((C0005.m167(str5, hashMap2, hashMap).yq())).getString("data")), str2, str3));
        ME me = m853(this, jSONObject, (jSONObject.getInt("m_status")));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArray = (jSONObject.optJSONArray("live_line"));
        while (true) {
            int i2 = (jSONArray.length());
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                    case 49:
                        i3 = i < i2 ? 1709 : 1678;
                    case 204:
                        JSONObject jSONObject2 = (jSONArray.optJSONObject(i));
                        (arrayList.add((jSONObject2.optString("name"))));
                        ArrayList arrayList3 = new ArrayList();
                        StringBuilder sb2 = new StringBuilder();
                        i++;
                        (sb2.append(i));
                        (sb2.append("$"));
                        (sb2.append((jSONObject2.getString("m3u8"))));
                        (arrayList3.add((sb2.toString())));
                        (arrayList2.add((TextUtils.join("#",arrayList3))));
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = 1771;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        (me.t0(""));
                        (me.KJ("请勿相信视频中任何广告"));
                        String str6 = "$$$";
                        (me.dT((TextUtils.join(str6,arrayList))));
                        (me.F5((TextUtils.join(str6,arrayList2))));
                        return C0000.m21(me);
                }
            }
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        rP rPVar = null;
        String str4 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        arrayList = new ArrayList();
        str2 = "1-0-0";
        str4 = "热播";
        rPVar = new rP(str2, str4);
        (arrayList.add(rPVar));
        str4 = "0-37-0";
        str3 = "NBA";
        rPVar = new rP(str4, str3);
        (arrayList.add(rPVar));
        str4 = "0-0-1";
        str3 = "足球";
        rPVar = new rP(str4, str3);
        (arrayList.add(rPVar));
        str4 = "0-0-2";
        str3 = "篮球";
        rPVar = new rP(str4, str3);
        (arrayList.add(rPVar));
        list = m854(this, str2);
        str4 = C0038.m1906(arrayList, list);
        return str4;
}

    public void init(Context context, String str) {
        LiveGz.super.init(context, str);
        boolean z = (TextUtils.isEmpty(str));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    this.yq = str;
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = "";
        C0056.m2351(true);
        try {
            JSONObject jSONObject = new JSONObject();
            (jSONObject.put("url",str2));
            (jSONObject.put("parse","0"));
            (jSONObject.put("playUrl",str3));
            return (jSONObject.toString());
        } catch (Exception e) {
            m852(e);
            return str3;
        }
    }

    public String searchContent(String str, boolean z) {
        return "";
    }
}
