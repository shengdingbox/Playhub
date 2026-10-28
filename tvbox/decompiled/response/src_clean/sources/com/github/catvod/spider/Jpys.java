package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0010;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.rP;
import java.io.PrintStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Jpys extends Spider {

    private String yq = "https://www.ghw9zwp5.com";
    private String SN = "";

    public Jpys() {
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

    public static String getUUID() {
        return (UUID.randomUUID().toString());
    }

    public static String sha1(String str) {
        try {
            byte[] bArr = (C0027.m1581("SHA-1").digest((str.getBytes())));
            StringBuilder sb = new StringBuilder();
            int length = bArr.length;
            int i = 0;
            while (true) {
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            String str2 = (Integer.toHexString(bArr[i] & 255));
                            int i3 = (str2.length());
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = i3 == 1 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        (sb.append('0'));
                                        break;
                                }
                            }
                            (sb.append(str2));
                            i++;
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = 48674;
                                    case 47483:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            return (sb.toString());
                    }
                }
            }
        } catch (NoSuchAlgorithmException e) {
            (e.printStackTrace());
            return null;
        }
    }

    /* renamed from: تﺹيد  reason: contains not printable characters */
    public static void m811(Object obj) {
        int i = (-540) ^ C0001.f1;
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
                    break;
                case 239:
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = 48674;
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
        int i4 = (-675) ^ C0038.f96;
        int i5 = 1740;
        while (true) {
            i5 ^= 1757;
            switch (i5) {
                case 17:
                    
                        break;
                    
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: خجﻝﺕ  reason: contains not printable characters */
    public static String m812(Object obj) {
        int i = (-556) ^ C0004.f4;
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
                    return ((Jpys) obj).yq;
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

    /* renamed from: فﺙﺡد  reason: contains not printable characters */
    public static String m813(Object obj) {
        int i = (-558) ^ C0039.f97;
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
                    return ((Jpys) obj).SN;
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
        ArrayList arrayList = new ArrayList();
        String str3 = "by";
        Object obj = (hashMap.get(str3));
        String str4 = "全部";
        String str5 = "";
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (obj == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z2 = ((String) (hashMap.get(str3)).equals(str4));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z2) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        (hashMap.put(str3,str5));
        String str6 = "year";
        Object obj2 = (hashMap.get(str6));
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    if (obj2 == null) {
                        break;
                    } else {
                        i3 = 48736;
                        continue;
                    }
                case 47384:
                    break;
                case 47417:
                    boolean z3 = ((String) (hashMap.get(str6)).equals(str4));
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                break;
                            case 239:
                                if (!z3) {
                                    break;
                                } else {
                                    i4 = 48860;
                                    continue;
                                }
                        }
                        i4 = 48829;
                    }
                    break;
                case 47483:
                    break;
            }
            i3 = 48705;
        }
        (hashMap.put(str6,str5));
        String str7 = "area";
        Object obj3 = (hashMap.get(str7));
        int i5 = 48891;
        while (true) {
            i5 ^= 48908;
            switch (i5) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    if (obj3 == null) {
                        break;
                    } else {
                        i5 = 49635;
                        continue;
                    }
                case 32495:
                    boolean z4 = ((String) (hashMap.get(str7)).equals(str4));
                    int i6 = 49666;
                    while (true) {
                        i6 ^= 49683;
                        switch (i6) {
                            case 17:
                                if (!z4) {
                                    break;
                                } else {
                                    i6 = 49759;
                                    continue;
                                }
                            case 50:
                                break;
                            case 76:
                                break;
                            case 83:
                                break;
                        }
                        i6 = 49728;
                    }
                    break;
            }
            i5 = 48953;
        }
        (hashMap.put(str7,str5));
        String str8 = (String) (hashMap.get(str3));
        String str9 = (String) (hashMap.get(str6));
        String str10 = (String) (hashMap.get(str7));
        String str11 = (String.valueOf(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        (sb.append("area="));
        (sb.append(str10));
        (sb.append("&pageNum="));
        (sb.append(str2));
        (sb.append("&type1="));
        (sb.append(str));
        (sb.append("&year="));
        (sb.append(str9));
        (sb.append("&key=cb808529bae6b6be45ecfab29a4889bc&t="));
        (sb.append(str11));
        HashMap hashMap2 = C0055.m2325("sign", C0007.m216(C0052.m2266((sb.toString()))), "T", str11);
        (hashMap2.put("deviceid",m813(this)));
        int i7 = 0;
        String str12 = C0028.m1633((String.format(C0032.m1739(new StringBuilder(), m812(this), "/api/mw-movie/anonymous/video/list?type1=%s&pageNum=%s&area=%s&year=%s"),new Object[]{str, str2, str10, str9})), hashMap2);
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        (sb2.append("ddyy"));
        (sb2.append(str12));
        (printStream.println((sb2.toString())));
        JSONArray jSONArray = ((new JSONObject(str12).getJSONObject("data")).getJSONArray("list"));
        while (true) {
            int i8 = (jSONArray.length());
            int i9 = 49790;
            while (true) {
                i9 ^= 49807;
                switch (i9) {
                    case 18:
                    case 51:
                        return C0022.m1435(arrayList);
                    case 84:
                        JSONObject jSONObject = (jSONArray.getJSONObject(i7));
                        boolean z5 = C0031.m1694(jSONObject, "vodClass", "其它&伦理&情色&剧情,爱情");
                        int i10 = 49914;
                        while (true) {
                            i10 ^= 49931;
                            switch (i10) {
                                case 497:
                                    i10 = z5 ? 50658 : 50627;
                                case 1711:
                                case 1736:
                                    (arrayList.add(new ME((jSONObject.getString("vodId")), (jSONObject.getString("vodName")), (jSONObject.getString("vodPic")), (jSONObject.getString("vodVersion")))));
                                    break;
                                case 1769:
                                    int i11 = 50689;
                                    while (true) {
                                        i11 ^= 50706;
                                        switch (i11) {
                                            case 19:
                                                i11 = 50720;
                                            case 50:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        i7++;
                        int i12 = 50813;
                        while (true) {
                            i12 ^= 50830;
                            switch (i12) {
                                case 18:
                                    break;
                                case 243:
                                    i12 = 50844;
                            }
                        }
                        break;
                    case 241:
                        i9 = i7 < i8 ? 49883 : 49852;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0265, code lost:
        r1 = (r2.getString(r0));
        r1 = 48767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x026c, code lost:
        r1 = r1 ^ 48784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0270, code lost:
        switch(r1) {
            case 14: goto L77;
            case 239: goto L78;
            default: goto L80;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02e4, code lost:
        r1 = 48798;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Jpys.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        (arrayList2.add(new rP("1", "电影")));
        (arrayList2.add(new rP("2", "电视剧")));
        (arrayList2.add(new rP("4", "动漫")));
        (arrayList2.add(new rP("3", "综艺")));
        JSONObject jSONObject = new JSONObject(C0001.m24());
        String str = (String.valueOf(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        (sb.append("key=cb808529bae6b6be45ecfab29a4889bc&t="));
        (sb.append(str));
        HashMap hashMap = C0055.m2325("sign", C0007.m216(C0052.m2266((sb.toString()))), "T", str);
        (hashMap.put("deviceid",m813(this)));
        StringBuilder sb2 = new StringBuilder();
        (sb2.append(m812(this)));
        (sb2.append("/api/mw-movie/anonymous/home/hotSearch"));
        JSONArray jSONArray = (new JSONObject(C0028.m1633((sb2.toString()), hashMap)).getJSONArray("data"));
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
                        JSONObject jSONObject2 = (jSONArray.getJSONObject(i));
                        boolean z2 = C0031.m1694(jSONObject2, "vodClass", "其它&伦理&情色&剧情,爱情");
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = z2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    (arrayList.add(new ME((jSONObject2.getString("vodId")), (jSONObject2.getString("vodName")), (jSONObject2.getString("vodPic")), (jSONObject2.getString("vodVersion")))));
                                    break;
                                case 500:
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        i++;
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
                    case 239:
                        return C0054.m2296(arrayList2, arrayList, jSONObject);
                }
            }
        }
    }

    public void init(Context context, String str) {
        Jpys.super.init(context, str);
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
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        String str2 = "jpDeviceId";
        String str3 = C0041.m1978(str2, "");
        this.SN = str3;
        boolean z2 = (TextUtils.isEmpty(str3));
        int i2 = 1740;
        while (true) {
            i2 ^= 1757;
            switch (i2) {
                case 17:
                    if (!z2) {
                        break;
                    } else {
                        i2 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    String str4 = Jpys.getUUID();
                    this.SN = str4;
                    C0023.m1453(str2, str4);
                    return;
            }
            i2 = 1802;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = "https://www.ghw9zwp5.com";
        String str4 = "url";
        String str5 = "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36";
        String str6 = "User-Agent";
        String str7 = "&nid=";
        String str8 = "";
        C0029.m1662();
        C0056.m2351(true);
        try {
            String[] strArr = (str2.split("@"));
            String str9 = strArr[0];
            String str10 = strArr[1];
            StringBuilder sb = new StringBuilder();
            (sb.append(m812(this)));
            (sb.append("/api/mw-movie/anonymous/v2/video/episode/url?clientType=3&id="));
            (sb.append(str9));
            (sb.append(str7));
            (sb.append(str10));
            String str11 = (sb.toString());
            String str12 = (String.valueOf(System.currentTimeMillis()));
            StringBuilder sb2 = new StringBuilder();
            (sb2.append("clientType=3&id="));
            (sb2.append(str9));
            (sb2.append(str7));
            (sb2.append(str10));
            (sb2.append("&key=cb808529bae6b6be45ecfab29a4889bc&t="));
            (sb2.append(str12));
            String str13 = C0007.m216(C0052.m2266((sb2.toString())));
            HashMap hashMap = new HashMap();
            (hashMap.put(str6,str5));
            (hashMap.put("sign",str13));
            (hashMap.put("T",str12));
            (hashMap.put("deviceid",m813(this)));
            String str14 = C0028.m1633(str11, hashMap);
            PrintStream printStream = System.out;
            StringBuilder sb3 = new StringBuilder();
            (sb3.append("ddyy"));
            (sb3.append(str14));
            (printStream.println((sb3.toString())));
            JSONObject jSONObject = new JSONObject(str14);
            JSONObject jSONObject2 = new JSONObject();
            String str15 = ((((jSONObject.getJSONObject("data")).getJSONArray("list")).getJSONObject(0)).getString(str4));
            PrintStream printStream2 = System.out;
            StringBuilder sb4 = new StringBuilder();
            (sb4.append("ssss"));
            (sb4.append(str15));
            (printStream2.println((sb4.toString())));
            JSONObject jSONObject3 = new JSONObject();
            (jSONObject3.put(str6,str5));
            (jSONObject3.put("Origin",str3));
            (jSONObject3.put("Referer",str3));
            (jSONObject2.put(str4,str15));
            (jSONObject2.put("parse","0"));
            (jSONObject2.put("playUrl",str8));
            (jSONObject2.put("header",(jSONObject3.toString())));
            (jSONObject2.put("danmaku",C0033.m1778(str15)));
            return (jSONObject2.toString());
        } catch (Exception e) {
            m811(e);
            return str8;
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        (sb.append(m812(this)));
        (sb.append("/api/mw-movie/anonymous/video/searchByWord?keyword="));
        (sb.append(C0010.m314(str)));
        (sb.append("&pageNum=1&pageSize=8"));
        String str2 = (sb.toString());
        String str3 = (String.valueOf(System.currentTimeMillis()));
        StringBuilder sb2 = new StringBuilder();
        (sb2.append("keyword="));
        (sb2.append(str));
        (sb2.append("&pageNum=1&pageSize=8&key=cb808529bae6b6be45ecfab29a4889bc&t="));
        (sb2.append(str3));
        HashMap hashMap = C0055.m2325("sign", C0007.m216(C0052.m2266((sb2.toString()))), "T", str3);
        (hashMap.put("deviceid",m813(this)));
        JSONArray jSONArray = (((new JSONObject(C0028.m1633(str2, hashMap)).getJSONObject("data")).getJSONObject("result")).getJSONArray("list"));
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
                        String str4 = "vodName";
                        boolean z2 = ((jSONObject.getString(str4)).contains(str));
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = !z2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    boolean z3 = C0031.m1694(jSONObject, "vodClass", "其它&伦理&情色&剧情,爱情");
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                            case 45:
                                                (arrayList.add(new ME((jSONObject.getString("vodId")), (jSONObject.getString(str4)), (jSONObject.getString("vodPic")), (jSONObject.getString("vodRemarks")))));
                                                break;
                                            case 76:
                                                int i6 = 48891;
                                                while (true) {
                                                    i6 ^= 48908;
                                                    switch (i6) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i6 = 48922;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i5 = z3 ? 48860 : 48829;
                                        }
                                    }
                                    break;
                                case 500:
                                    int i7 = 1864;
                                    while (true) {
                                        i7 ^= 1881;
                                        switch (i7) {
                                            case 17:
                                                i7 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        i++;
                        int i8 = 49666;
                        while (true) {
                            i8 ^= 49683;
                            switch (i8) {
                                case 17:
                                    i8 = 49697;
                                case 50:
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
}
