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

    private Map<String, String> yq() {
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap();
        str2 = "User-Agent";
        str3 = "TingShiJie/1.8.8 (m.i275.com)";
        (hashMap.put(str2,str3));
        return hashMap;
}

    /* renamed from: طدﺭﺵ  reason: contains not printable characters */
    public static Map m980(Object obj) {
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
                    return ((Tingshu275) obj).yq();
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

    /* renamed from: طشﻉﺭ  reason: contains not printable characters */
    public static String m981(Object obj) {
        int i = (-703) ^ C0036.f94;
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
                    return ((Tingshu275) obj).yq;
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
        int i;
        HashMap hashMap2 = new HashMap();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (hashMap == null) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    int i3 = (hashMap.size());
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                if (i3 <= 0) {
                                    break;
                                } else {
                                    i4 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                (hashMap2.putAll(hashMap));
                                break;
                        }
                        i4 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        String str3 = "cateId";
        Object obj = (hashMap2.get(str3));
        int i5 = 1864;
        while (true) {
            i5 ^= 1881;
            switch (i5) {
                case 17:
                    if (obj != null) {
                        break;
                    } else {
                        i5 = 48736;
                        continue;
                    }
                case 47384:
                    str = (String) (hashMap2.get(str3));
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
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
            }
            i5 = 48705;
        }
        StringBuilder sb = new StringBuilder();
        (sb.append(m981(this)));
        (sb.append((String.format("categoryList?size=10&page=%s&categoryId=%s",new Object[]{str2, str}))));
        String str4 = C0028.m1633((sb.toString()), m980(this));
        int i7 = (Integer.parseInt(str2));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = ((new JSONObject(str4).getJSONObject("data")).getJSONArray("list"));
        int i8 = 0;
        while (true) {
            int i9 = (jSONArray.length());
            int i10 = 48891;
            while (true) {
                i10 ^= 48908;
                switch (i10) {
                    case 22:
                    case 53:
                        int i11 = (arrayList.size());
                        int i12 = 49790;
                        while (true) {
                            i12 ^= 49807;
                            switch (i12) {
                                case 18:
                                    break;
                                case 51:
                                    i = i7 + 1;
                                    break;
                                case 84:
                                    int i13 = 49914;
                                    while (true) {
                                        i13 ^= 49931;
                                        switch (i13) {
                                            case 497:
                                                i13 = 50596;
                                                break;
                                            case 1711:
                                                i = i7;
                                                break;
                                        }
                                    }
                                    break;
                                case 241:
                                    if (i11 >= 10) {
                                        break;
                                    } else {
                                        i12 = 49883;
                                        continue;
                                    }
                            }
                            i12 = 49852;
                        }
                        iX iXVar = new iX();
                        (iXVar.b(arrayList));
                        (iXVar.dT(i7,i,10,0));
                        return (iXVar.toString());
                    case 503:
                        i10 = i8 < i9 ? 49635 : 48953;
                    case 32495:
                        JSONObject jSONObject = (jSONArray.getJSONObject(i8));
                        (arrayList.add(new ME((jSONObject.getString("id")), (jSONObject.getString("bookTitle")), (jSONObject.getString("bookImage")), (jSONObject.getString("bookAnchor")))));
                        i8++;
                        int i14 = 49666;
                        while (true) {
                            i14 ^= 49683;
                            switch (i14) {
                                case 17:
                                    i14 = 49697;
                                case 50:
                                    break;
                            }
                        }
                        break;
                }
            }
        }
    }

    public String detailContent(List<String> list) {
        int i = 0;
        String str = (String) (list.get(0));
        StringBuilder sb = new StringBuilder();
        (sb.append(m981(this)));
        (sb.append("book?bookId="));
        (sb.append(str));
        JSONObject jSONObject = new JSONObject(C0028.m1633((sb.toString()), m980(this)));
        String str2 = "data";
        JSONObject jSONObject2 = ((jSONObject.getJSONObject(str2)).getJSONObject("bookData"));
        ME me = new ME();
        (me.B(str));
        (me.G((jSONObject2.optString("bookTitle"))));
        (me.G4((jSONObject2.optString("bookImage"))));
        (me.t0((jSONObject2.optString("categoryName"))));
        (me.KJ((jSONObject2.optString("bookDesc"))));
        String str3 = "bookAnchor";
        (me.q((jSONObject2.optString(str3))));
        (me.Gc((jSONObject2.optString(str3))));
        StringBuilder sb2 = new StringBuilder();
        (sb2.append(m981(this)));
        (sb2.append("chapter?size=9999&page=1&sort=asc&bookId="));
        (sb2.append(str));
        JSONArray jSONArray = ((new JSONObject(C0028.m1633((sb2.toString()), m980(this))).getJSONObject(str2)).getJSONArray("list"));
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
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
                        JSONObject jSONObject3 = (jSONArray.getJSONObject(i));
                        StringBuilder sb3 = new StringBuilder();
                        (sb3.append((jSONObject3.getString("title"))));
                        (sb3.append("$"));
                        (sb3.append((jSONObject3.getString("chapterId"))));
                        (sb3.append("|||"));
                        (sb3.append(str));
                        (arrayList.add((sb3.toString())));
                        i++;
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
                        int i5 = (arrayList.size());
                        int i6 = 1864;
                        while (true) {
                            i6 ^= 1881;
                            switch (i6) {
                                case 17:
                                    if (i5 <= 0) {
                                        break;
                                    } else {
                                        i6 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    break;
                                case 47417:
                                    (linkedHashMap.put("直链",(TextUtils.join("#",arrayList))));
                                    break;
                                case 47483:
                                    break;
                            }
                            i6 = 48705;
                        }
                        int i7 = (linkedHashMap.size());
                        int i8 = 48767;
                        while (true) {
                            i8 ^= 48784;
                            switch (i8) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    Set set = (linkedHashMap.keySet());
                                    String str4 = "$$$";
                                    (me.dT((TextUtils.join(str4,set))));
                                    (me.F5((TextUtils.join(str4,(linkedHashMap.values())))));
                                    break;
                                case 239:
                                    if (i7 <= 0) {
                                        break;
                                    } else {
                                        i8 = 48860;
                                        continue;
                                    }
                            }
                            i8 = 48829;
                        }
                        return C0000.m21(me);
                }
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
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                    case 49:
                        i4 = i2 < i3 ? 1709 : 1678;
                    case 204:
                        (arrayList.add(new rP((String) (list.get(i2)), (String) (list2.get(i2)))));
                        i = i2 + 1;
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            switch (i5) {
                                case 17:
                                    i5 = 1771;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        return C0000.m9(arrayList, new JSONObject("{}"));
                }
            }
        }
    }

    public void init(Context context) {
        this.yq = C0028.m1633("http://117.72.112.234:8090/config/tingchina2025.txt", m980(this));
        int i = (-767) ^ C0037.f95;
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
        (sb.append(str6));
        str6 = "AppGetChapterUrl2023?timeStamp=";
        (sb.append(str6));
        (sb.append(str3));
        str6 = "&uid=&chapterId=";
        (sb.append(str6));
        (sb.append(str2));
        str3 = "&addItParapet=";
        (sb.append(str3));
        (sb.append(str5));
        str6 = "&bookId=";
        (sb.append(str6));
        (sb.append(str4));
        str2 = (sb.toString());
        map = m980(this);
        str3 = C0028.m1633(str2, map);
        jSONObject = new JSONObject(str3);
        iXVar = new iX();
        str5 = "src";
        str6 = (jSONObject.getString(str5));
        (iXVar.s(str6,false));
        hashMap = new HashMap();
        str4 = "User-Agent";
        str2 = "listen/1.8.9 (Linux;Android 12) ExoPlayerLib/2.8.4";
        (hashMap.put(str4,str2));
        (iXVar.KJ(hashMap));
        return (iXVar.toString());
}

    public String searchContent(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        (sb.append(m981(this)));
        (sb.append("/listen/apphaidao/appSearch?search="));
        (sb.append(C0010.m314(str)));
        JSONArray jSONArray = ((new JSONObject(C0028.m1633((sb.toString()), m980(this))).getJSONObject("data")).getJSONArray("bookData"));
        int i = 0;
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
                        (arrayList.add(new ME((jSONObject.getString("id")), (jSONObject.getString("bookTitle")), (jSONObject.getString("bookImage")), (jSONObject.getString("bookAnchor")))));
                        i++;
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
                        return C0022.m1435(arrayList);
                }
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
