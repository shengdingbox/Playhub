package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class AppTT extends Spider {

    private JSONObject N;
    private String SN = "okhttp-okgo/jeasonlzy";
    private String tF = "";
    private String yq;

    public AppTT() {
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

    private String N(String str, Map<String, String> map) {
        String str2 = "";
        try {
            MultipartBody.Builder builder = m580(new MultipartBody.Builder(), m581());
            boolean z = (str.contains("top_type"));
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
                        boolean z2 = (str.contains("tj_vod"));
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
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            m583(builder, str2, str2);
            Iterator it = ((map.entrySet()).iterator());
            while (true) {
                boolean z3 = (it.hasNext());
                int i3 = 1864;
                while (true) {
                    i3 ^= 1881;
                    switch (i3) {
                        case 17:
                            i3 = z3 ? 48736 : 48705;
                        case 47384:
                            Response response = m596(m595(new OkHttpClient(), m592(m586(m599(m589(new Request.Builder(), str), m588(builder)), "User-Agent", m593(this)))));
                            boolean z4 = m579(response);
                            int i4 = 48891;
                            while (true) {
                                i4 ^= 48908;
                                switch (i4) {
                                    case 22:
                                        break;
                                    case 53:
                                        return m594(m598(response));
                                    case 503:
                                        if (z4) {
                                            break;
                                        } else {
                                            i4 = 49635;
                                            continue;
                                        }
                                    case 32495:
                                        return str2;
                                    default:
                                        continue;
                                }
                                i4 = 48953;
                            }
                        case 47417:
                            Map.Entry entry = (Map.Entry) (it.next());
                            m583(builder, (String) (entry.getKey()), (String) (entry.getValue()));
                            int i5 = 48767;
                            while (true) {
                                i5 ^= 48784;
                                switch (i5) {
                                    case 14:
                                        break;
                                    case 239:
                                        i5 = 48798;
                                }
                            }
                            break;
                        case 47483:
                    }
                }
            }
        } catch (Exception e) {
            m590(e);
            return str2;
        }
    }

    private JSONObject SN(String str, String str2, JSONObject jSONObject) {
        String str3 = "url";
        String str4 = "data";
        try {
            boolean z = (jSONObject.has(str));
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
                        StringBuilder sb = new StringBuilder();
                        (sb.append(((jSONObject.optJSONObject(str)).optString(str3))));
                        (sb.append(str2));
                        String str5 = (sb.toString());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        (linkedHashMap.put("User-Agent",m593(this)));
                        JSONObject jSONObject2 = new JSONObject(C0028.m1633(str5, linkedHashMap));
                        boolean z2 = (jSONObject2.has(str4));
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
                                    boolean z3 = (jSONObject2.get(str4)) instanceof JSONObject;
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                if (!z3) {
                                                    break;
                                                } else {
                                                    i3 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                break;
                                            case 47417:
                                                jSONObject2 = (jSONObject2.getJSONObject(str4));
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i3 = 48705;
                                    }
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    int i5 = (jSONObject2.length());
                                    int i6 = 48891;
                                    while (true) {
                                        i6 ^= 48908;
                                        switch (i6) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                if (i5 <= 0) {
                                                    break;
                                                } else {
                                                    i6 = 49635;
                                                    continue;
                                                }
                                            case 32495:
                                                String str6 = (jSONObject2.optString(str3));
                                                boolean z4 = (TextUtils.isEmpty(str6));
                                                int i7 = 49666;
                                                while (true) {
                                                    i7 ^= 49683;
                                                    switch (i7) {
                                                        case 17:
                                                            if (z4) {
                                                                break;
                                                            } else {
                                                                i7 = 49759;
                                                                continue;
                                                            }
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            boolean z5 = (str6.equals("null"));
                                                            int i8 = 49790;
                                                            while (true) {
                                                                i8 ^= 49807;
                                                                switch (i8) {
                                                                    case 18:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 84:
                                                                        (jSONObject2.put("danmaku",C0033.m1778(str6)));
                                                                        return jSONObject2;
                                                                    case 241:
                                                                        if (z5) {
                                                                            break;
                                                                        } else {
                                                                            i8 = 49883;
                                                                            continue;
                                                                        }
                                                                    default:
                                                                        continue;
                                                                }
                                                                i8 = 49852;
                                                            }
                                                        case 83:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i7 = 49728;
                                                }
                                            default:
                                                continue;
                                        }
                                        i6 = 48953;
                                    }
                                case 239:
                                    if (jSONObject2 == null) {
                                        break;
                                    } else {
                                        i4 = 48860;
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                            i4 = 48829;
                        }
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            m590(e);
        }
        return new JSONObject();
    }

    private String yq(String str) {
        StringBuilder sb = null;
String str3 = null;
                // [deflattened] 控制流平坦化已还原为线性代码
        sb = new StringBuilder();
        str3 = "7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl";
        (sb.append(str3));
        (sb.append(str));
        str3 = (sb.toString());
        str = C0023.m1463(str3);
        return str;
}

    /* renamed from: تﻩهو  reason: contains not printable characters */
    public static boolean m579(Object obj) {
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
                    return ((Response) obj).isSuccessful();
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: حقوﺏ  reason: contains not printable characters */
    public static MultipartBody.Builder m580(Object obj, Object obj2) {
        int i = 697 ^ C0024.f82;
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
                    return ((MultipartBody.Builder) obj).setType((MediaType) obj2);
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

    /* renamed from: حﻁزف  reason: contains not printable characters */
    public static MediaType m581() {
        int i = (-404) ^ C0021.f79;
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
                    return MultipartBody.FORM;
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

    /* renamed from: دﺏذﻕ  reason: contains not printable characters */
    public static String m582(Object obj, Object obj2, Object obj3) {
        int i = (-477) ^ C0042.f100;
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
                    return ((AppTT) obj).N((String) obj2, (Map) obj3);
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

    /* renamed from: دﺭﺯح  reason: contains not printable characters */
    public static MultipartBody.Builder m583(Object obj, Object obj2, Object obj3) {
        int i = 753 ^ C0000.f0;
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
                    return ((MultipartBody.Builder) obj).addFormDataPart((String) obj2, (String) obj3);
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

    /* renamed from: سﺭﺡﻭ  reason: contains not printable characters */
    public static JSONObject m584(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = (-732) ^ f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i > 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppTT) obj).SN((String) obj2, (String) obj3, (JSONObject) obj4);
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

    /* renamed from: سﺵﺫل  reason: contains not printable characters */
    public static String m585(Object obj) {
        int i = (-768) ^ C0002.f2;
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
                    return ((AppTT) obj).tF;
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

    /* renamed from: صﺯﺩي  reason: contains not printable characters */
    public static Request.Builder m586(Object obj, Object obj2, Object obj3) {
        int i = (-604) ^ C0013.f13;
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
                    return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
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

    /* renamed from: صﻡﻕن  reason: contains not printable characters */
    public static JSONObject m587(Object obj) {
        int i = (-448) ^ C0025.f83;
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
                    return ((AppTT) obj).N;
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

    /* renamed from: ظقﺙﺡ  reason: contains not printable characters */
    public static MultipartBody m588(Object obj) {
        int i = (-985) ^ C0024.f82;
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
                    return ((MultipartBody.Builder) obj).build();
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

    /* renamed from: غﺩمﺭ  reason: contains not printable characters */
    public static Request.Builder m589(Object obj, Object obj2) {
        int i = (-732) ^ f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i > 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((Request.Builder) obj).url((String) obj2);
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

    /* renamed from: نثرﻭ  reason: contains not printable characters */
    public static void m590(Object obj) {
        int i = (-404) ^ C0021.f79;
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

    /* renamed from: وﺫاﺩ  reason: contains not printable characters */
    public static String m591(Object obj) {
        int i = 812 ^ C0022.f80;
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
                    return ((AppTT) obj).yq;
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

    /* renamed from: ﺕظجﻩ  reason: contains not printable characters */
    public static Request m592(Object obj) {
        int i = 923 ^ C0041.f99;
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
                    return ((Request.Builder) obj).build();
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

    /* renamed from: ﺙﺹرﻍ  reason: contains not printable characters */
    public static String m593(Object obj) {
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
                    return ((AppTT) obj).SN;
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

    /* renamed from: ﺩذحﺽ  reason: contains not printable characters */
    public static String m594(Object obj) {
        int i = (-767) ^ C0037.f95;
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
                    return ((ResponseBody) obj).string();
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

    /* renamed from: ﺱمـﻅ  reason: contains not printable characters */
    public static Call m595(Object obj, Object obj2) {
        int i = (-185) ^ C0033.f91;
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
                    return ((OkHttpClient) obj).newCall((Request) obj2);
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

    /* renamed from: ﻁزسج  reason: contains not printable characters */
    public static Response m596(Object obj) {
        int i = 930 ^ C0038.f96;
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
                    return ((Call) obj).execute();
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

    /* renamed from: ﻅﺽﺹﺵ  reason: contains not printable characters */
    public static String m597(Object obj, Object obj2) {
        int i = 515 ^ C0028.f86;
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
                    return ((AppTT) obj).yq((String) obj2);
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

    /* renamed from: ﻙذﻅب  reason: contains not printable characters */
    public static ResponseBody m598(Object obj) {
        int i = (-477) ^ C0042.f100;
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
                    return ((Response) obj).body();
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

    /* renamed from: ﻙمﺱﻩ  reason: contains not printable characters */
    public static Request.Builder m599(Object obj, Object obj2) {
        int i = (-185) ^ C0033.f91;
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
                    return ((Request.Builder) obj).post((RequestBody) obj2);
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
        String str3;
        String str4 = "vod_remarks";
        String str5 = "vod_name";
        String str6 = "vod_id";
        String str7 = "list";
        String str8 = "page";
        String str9 = "limit";
        String str10 = "vod_pic";
        try {
            String str11 = (String.valueOf(System.currentTimeMillis() / 1000));
            String str12 = m597(this, str11);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            (linkedHashMap.put("sign",str12));
            (linkedHashMap.put("timestamp",str11));
            (linkedHashMap.put(str9,"12"));
            (linkedHashMap.put("type_id",str));
            (linkedHashMap.put(str8,str2));
            StringBuilder sb = new StringBuilder();
            (sb.append(m591(this)));
            (sb.append("/v3/home/type_search"));
            JSONArray jSONArray = ((new JSONObject(m582(this, (sb.toString()), linkedHashMap)).getJSONObject("data")).getJSONArray(str7));
            JSONArray jSONArray2 = new JSONArray();
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
                            JSONObject jSONObject2 = new JSONObject();
                            boolean z2 = (TextUtils.isEmpty((jSONObject.optString(str10))));
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        str3 = (jSONObject.optString(str10));
                                        break;
                                    case 500:
                                        str3 = (jSONObject.optString("vod_pic_thumb"));
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
                            (jSONObject2.put(str6,(String.valueOf((jSONObject.getInt(str6))))));
                            (jSONObject2.put(str5,(jSONObject.getString(str5))));
                            (jSONObject2.put(str10,str3));
                            (jSONObject2.put(str4,(jSONObject.getString(str4))));
                            (jSONArray2.put(jSONObject2));
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
                            JSONObject jSONObject3 = new JSONObject();
                            (jSONObject3.put(str8,(Integer.parseInt(str2))));
                            (jSONObject3.put("pagecount",999));
                            (jSONObject3.put(str9,20));
                            (jSONObject3.put("total",Integer.MAX_VALUE));
                            (jSONObject3.put(str7,jSONArray2));
                            return (jSONObject3.toString());
                    }
                }
            }
        } catch (Exception e) {
            m590(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        Exception e;
        String str;
        String str2 = "vod_director";
        String str3 = "vod_actor";
        String str4 = "vod_remarks";
        String str5 = "vod_area";
        String str6 = "vod_year";
        String str7 = "vod_name";
        String str8 = "vod_content";
        String str9 = "vod_id";
        String str10 = "vod_pic";
        String str11 = "";
        try {
            this.N = new JSONObject();
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str12 = (String.valueOf(System.currentTimeMillis() / 1000));
            String str13 = m597(this, str12);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            (linkedHashMap.put("sign",str13));
            (linkedHashMap.put("timestamp",str12));
            (linkedHashMap.put(str9,(String) (list.get(0))));
            StringBuilder sb = new StringBuilder();
            (sb.append(m591(this)));
            (sb.append("/v3/home/vod_details"));
            JSONObject jSONObject2 = (new JSONObject(m582(this, (sb.toString()), linkedHashMap)).getJSONObject("data"));
            String str14 = (((((((jSONObject2.getString(str8)).replace("&lt;","<")).replace("&gt;",">")).replace("&quot;","\"")).replaceAll("<[^>]+>",str11)).replaceAll("\\n",str11)).trim());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            boolean z = (TextUtils.isEmpty((jSONObject2.optString(str10))));
            int i = 1616;
            while (true) {
                i ^= 1633;
                try {
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
                            str = (jSONObject2.optString("vod_pic_thumb"));
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            str = (jSONObject2.optString(str10));
                            break;
                    }
                    i = 1678;
                } catch (Exception e2) {
                    e = e2;
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = 48674;
                                break;
                            case 47483:
                                m590(e);
                                return str11;
                        }
                    }
                }
            }
            (jSONObject3.put(str9,(list.get(0))));
            (jSONObject3.put(str7,(jSONObject2.getString(str7))));
            (jSONObject3.put(str10,str));
            (jSONObject3.put(str6,(jSONObject2.getString(str6))));
            (jSONObject3.put(str5,(jSONObject2.getString(str5))));
            (jSONObject3.put(str4,(jSONObject2.getString(str4))));
            (jSONObject3.put(str3,(jSONObject2.getString(str3))));
            (jSONObject3.put(str2,(jSONObject2.getString(str2))));
            (jSONObject3.put(str8,C0050.m2203(str14)));
            JSONArray jSONArray2 = (jSONObject2.getJSONArray("vod_play_list"));
            int i4 = 0;
            while (true) {
                int i5 = (jSONArray2.length());
                int i6 = 48767;
                while (true) {
                    i6 ^= 48784;
                    switch (i6) {
                        case 14:
                        case 45:
                            boolean z2 = (arrayList2.isEmpty());
                            int i7 = 53510;
                            while (true) {
                                i7 ^= 53527;
                                switch (i7) {
                                    case 17:
                                        if (z2) {
                                            break;
                                        } else {
                                            i7 = 53603;
                                            continue;
                                        }
                                    case 50:
                                        break;
                                    case 83:
                                        break;
                                    case 116:
                                        this.tF = (String) (arrayList2.get(0));
                                        String str15 = "vod_play_from";
                                        boolean z3 = cn.yq;
                                        String str16 = "$$$";
                                        int i8 = 53634;
                                        while (true) {
                                            i8 ^= 53651;
                                            switch (i8) {
                                                case 17:
                                                    if (z3) {
                                                        break;
                                                    } else {
                                                        i8 = 53727;
                                                        continue;
                                                    }
                                                case 50:
                                                    break;
                                                case 76:
                                                    (arrayList2.set(0,cn.tF));
                                                    break;
                                                case 83:
                                                    break;
                                            }
                                            i8 = 53696;
                                        }
                                        (jSONObject3.put(str15,(TextUtils.join(str16,arrayList2))));
                                        (jSONObject3.put("vod_play_url",(TextUtils.join(str16,arrayList))));
                                        break;
                                    default:
                                        continue;
                                }
                                i7 = 53572;
                            }
                            (jSONArray.put(jSONObject3));
                            (jSONObject.put("list",jSONArray));
                            return (jSONObject.toString());
                        case 76:
                            JSONObject jSONObject4 = (jSONArray2.getJSONObject(i4));
                            String str17 = (jSONObject4.getString("flag"));
                            JSONArray jSONArray3 = (jSONObject4.optJSONArray("parse_urls"));
                            String str18 = "url";
                            int i9 = 48891;
                            while (true) {
                                i9 ^= 48908;
                                switch (i9) {
                                    case 22:
                                    case 53:
                                        break;
                                    case 503:
                                        i9 = jSONArray3 != null ? 49635 : 48953;
                                    case 32495:
                                        int i10 = (jSONArray3.length());
                                        int i11 = 49666;
                                        while (true) {
                                            i11 ^= 49683;
                                            switch (i11) {
                                                case 17:
                                                    i11 = i10 > 0 ? 49759 : 49728;
                                                case 50:
                                                case 76:
                                                    int i12 = 0;
                                                    while (true) {
                                                        int i13 = (jSONArray3.length());
                                                        int i14 = 49790;
                                                        while (true) {
                                                            i14 ^= 49807;
                                                            switch (i14) {
                                                                case 18:
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    String str19 = ((jSONArray3.getString(i12)).trim());
                                                                    boolean z4 = (TextUtils.isEmpty(str19));
                                                                    int i15 = 49914;
                                                                    while (true) {
                                                                        i15 ^= 49931;
                                                                        switch (i15) {
                                                                            case 497:
                                                                                i15 = !z4 ? 50658 : 50627;
                                                                            case 1711:
                                                                            case 1736:
                                                                                break;
                                                                            case 1769:
                                                                                boolean z5 = (str19.equals("null"));
                                                                                int i16 = 50689;
                                                                                while (true) {
                                                                                    i16 ^= 50706;
                                                                                    switch (i16) {
                                                                                        case 19:
                                                                                            i16 = !z5 ? 50782 : 50751;
                                                                                        case 45:
                                                                                            break;
                                                                                        case 50:
                                                                                        case 76:
                                                                                            boolean z6 = (m587(this).has(str17));
                                                                                            int i17 = 50813;
                                                                                            while (true) {
                                                                                                i17 ^= 50830;
                                                                                                switch (i17) {
                                                                                                    case 18:
                                                                                                    case 53:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i17 = !z6 ? 51557 : 50875;
                                                                                                    case 4075:
                                                                                                        (m587(this).put(str17,(new JSONObject().put(str18,str19))));
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    i12++;
                                                                    int i18 = 51588;
                                                                    while (true) {
                                                                        i18 ^= 51605;
                                                                        switch (i18) {
                                                                            case 17:
                                                                                i18 = 51619;
                                                                            case 54:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i14 = i12 < i13 ? 49883 : 49852;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 83:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            JSONArray jSONArray4 = (jSONObject4.getJSONArray("urls"));
                            StringBuilder sb2 = new StringBuilder();
                            int i19 = 0;
                            while (true) {
                                int i20 = (jSONArray4.length());
                                int i21 = 51712;
                                while (true) {
                                    i21 ^= 51729;
                                    switch (i21) {
                                        case 14:
                                        case 17:
                                            i21 = i19 < i20 ? 51805 : 51774;
                                        case 47:
                                            int i22 = (sb2.length());
                                            int i23 = 52611;
                                            while (true) {
                                                i23 ^= 52628;
                                                switch (i23) {
                                                    case 23:
                                                        i23 = i22 > 0 ? 52704 : 52673;
                                                    case 54:
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        (sb2.deleteCharAt((sb2.length()) - 1));
                                                        break;
                                                }
                                            }
                                            (arrayList2.add(str17));
                                            (arrayList.add((sb2.toString())));
                                            i4++;
                                            int i24 = 52735;
                                            while (true) {
                                                i24 ^= 52752;
                                                switch (i24) {
                                                    case 14:
                                                        break;
                                                    case 1007:
                                                        i24 = 52766;
                                                }
                                            }
                                            break;
                                        case 76:
                                            JSONObject jSONObject5 = (jSONArray4.getJSONObject(i19));
                                            String str20 = (jSONObject5.getString("name"));
                                            String str21 = (jSONObject5.getString(str18));
                                            (sb2.append(str20));
                                            (sb2.append("$"));
                                            (sb2.append(str21));
                                            (sb2.append("#"));
                                            i19++;
                                            int i25 = 51836;
                                            while (true) {
                                                i25 ^= 51853;
                                                switch (i25) {
                                                    case 241:
                                                        i25 = 52518;
                                                    case 1963:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                            break;
                        case 239:
                            i6 = i4 < i5 ? 48860 : 48829;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public String homeContent(boolean z) {
        String str = "type_id";
        String str2 = "type_name";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String str3 = (String.valueOf(System.currentTimeMillis() / 1000));
            String str4 = m597(this, str3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            (linkedHashMap.put("sign",str4));
            (linkedHashMap.put("timestamp",str3));
            StringBuilder sb = new StringBuilder();
            (sb.append(m591(this)));
            (sb.append("/v3/type/top_type"));
            JSONArray jSONArray2 = ((new JSONObject(m582(this, (sb.toString()), linkedHashMap)).getJSONObject("data")).getJSONArray("list"));
            int i = 0;
            while (true) {
                int i2 = (jSONArray2.length());
                int i3 = 1616;
                while (true) {
                    i3 ^= 1633;
                    switch (i3) {
                        case 14:
                        case 49:
                            i3 = i < i2 ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject2 = (jSONArray2.getJSONObject(i));
                            String str5 = (jSONObject2.optString(str2));
                            String str6 = (String.valueOf((jSONObject2.optInt(str))));
                            JSONObject jSONObject3 = new JSONObject();
                            (jSONObject3.put(str2,str5));
                            (jSONObject3.put(str,str6));
                            (jSONArray.put(jSONObject3));
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
                            (jSONObject.put("class",jSONArray));
                            return (jSONObject.toString());
                    }
                }
            }
        } catch (Exception e) {
            m590(e);
            return "";
        }
    }

    public String homeVideoContent() {
        String str;
        String str2 = "vod_remarks";
        String str3 = "vod_name";
        String str4 = "vod_id";
        String str5 = "vod_pic";
        try {
            JSONObject jSONObject = new JSONObject();
            String str6 = (String.valueOf(System.currentTimeMillis() / 1000));
            String str7 = m597(this, str6);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            (linkedHashMap.put("sign",str7));
            (linkedHashMap.put("timestamp",str6));
            StringBuilder sb = new StringBuilder();
            (sb.append(m591(this)));
            (sb.append("/v3/type/tj_vod"));
            JSONArray jSONArray = ((new JSONObject(m582(this, (sb.toString()), linkedHashMap)).getJSONObject("data")).getJSONArray("type_vod"));
            JSONArray jSONArray2 = new JSONArray();
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
                            JSONArray jSONArray3 = ((jSONArray.getJSONObject(i)).getJSONArray("vod"));
                            int i4 = 0;
                            while (true) {
                                int i5 = (jSONArray3.length());
                                int i6 = 1740;
                                while (true) {
                                    i6 ^= 1757;
                                    switch (i6) {
                                        case 17:
                                            i6 = i4 < i5 ? 1833 : 1802;
                                        case 54:
                                        case 471:
                                            i++;
                                            int i7 = 49666;
                                            while (true) {
                                                i7 ^= 49683;
                                                switch (i7) {
                                                    case 17:
                                                        i7 = 49697;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 500:
                                            JSONObject jSONObject2 = (jSONArray3.getJSONObject(i4));
                                            JSONObject jSONObject3 = new JSONObject();
                                            boolean z = (TextUtils.isEmpty((jSONObject2.optString(str5))));
                                            int i8 = 1864;
                                            while (true) {
                                                i8 ^= 1881;
                                                switch (i8) {
                                                    case 17:
                                                        i8 = z ? 48736 : 48705;
                                                    case 47384:
                                                        str = (jSONObject2.optString(str5));
                                                        break;
                                                    case 47417:
                                                        str = (jSONObject2.optString("vod_pic_thumb"));
                                                        int i9 = 48767;
                                                        while (true) {
                                                            i9 ^= 48784;
                                                            switch (i9) {
                                                                case 14:
                                                                    break;
                                                                case 239:
                                                                    i9 = 48798;
                                                            }
                                                        }
                                                        break;
                                                    case 47483:
                                                }
                                            }
                                            (jSONObject3.put(str4,(String.valueOf((jSONObject2.optInt(str4))))));
                                            (jSONObject3.put(str3,(jSONObject2.optString(str3))));
                                            (jSONObject3.put(str5,str));
                                            (jSONObject3.put(str2,(jSONObject2.optString(str2))));
                                            (jSONArray2.put(jSONObject3));
                                            i4++;
                                            int i10 = 48891;
                                            while (true) {
                                                i10 ^= 48908;
                                                switch (i10) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i10 = 48922;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                            break;
                        case 239:
                            (jSONObject.put("list",jSONArray2));
                            return (jSONObject.toString());
                    }
                }
            }
        } catch (Exception e) {
            m590(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        int i;
        AppTT.super.init(context, str);
        try {
            this.yq = C0049.m2191(str);
            i = 1616;
        } catch (Exception e) {
            m590(e);
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    int i2 = (-26) ^ C0033.f91;
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                
                                    break;
                                
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                return;
                        }
                        i3 = 1802;
                    }
                    break;
                case 49:
                    i = 1647;
                    break;
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0029.m1662();
        C0056.m2351(true);
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z = C0042.m2005(str2);
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
                        boolean z2 = (str2.contains("m3u8"));
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
                                    str2 = C0009.m279(str2);
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        (jSONObject.put("parse",0));
                        (jSONObject.put("playUrl",""));
                        (jSONObject.put("url",str2));
                        (jSONObject.put("danmaku",C0033.m1778(str2)));
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
                    case 239:
                        JSONObject jSONObject2 = m587(this);
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    int i5 = (jSONObject2.length());
                                    int i6 = 48891;
                                    while (true) {
                                        i6 ^= 48908;
                                        switch (i6) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                if (i5 <= 0) {
                                                    break;
                                                } else {
                                                    i6 = 49635;
                                                    continue;
                                                }
                                            case 32495:
                                                boolean z3 = (m587(this).has(str));
                                                int i7 = 49666;
                                                while (true) {
                                                    i7 ^= 49683;
                                                    switch (i7) {
                                                        case 17:
                                                            if (z3) {
                                                                break;
                                                            } else {
                                                                i7 = 49759;
                                                                continue;
                                                            }
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            str = m585(this);
                                                            break;
                                                        case 83:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i7 = 49728;
                                                }
                                                jSONObject = m584(this, str, str2, m587(this));
                                                int i8 = 49790;
                                                while (true) {
                                                    i8 ^= 49807;
                                                    switch (i8) {
                                                        case 18:
                                                            break;
                                                        case 241:
                                                            i8 = 49821;
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i6 = 48953;
                                    }
                                    break;
                                case 239:
                                    if (jSONObject2 == null) {
                                        break;
                                    } else {
                                        i4 = 48860;
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                            i4 = 48829;
                        }
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            m590(e);
        }
        return (jSONObject.toString());
    }

    public String searchContent(String str, boolean z) {
        String str2;
        String str3 = "vod_remarks";
        String str4 = "vod_id";
        String str5 = "vod_name";
        String str6 = "list";
        String str7 = "vod_pic";
        try {
            JSONObject jSONObject = new JSONObject();
            String str8 = (String.valueOf(System.currentTimeMillis() / 1000));
            String str9 = m597(this, str8);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            (linkedHashMap.put("sign",str9));
            (linkedHashMap.put("timestamp",str8));
            (linkedHashMap.put("keyword",str));
            StringBuilder sb = new StringBuilder();
            (sb.append(m591(this)));
            (sb.append("/v3/home/search"));
            JSONArray jSONArray = ((new JSONObject(m582(this, (sb.toString()), linkedHashMap)).getJSONObject("data")).getJSONArray(str6));
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                int i2 = i;
                int i3 = (jSONArray.length());
                int i4 = 1616;
                while (true) {
                    i4 ^= 1633;
                    switch (i4) {
                        case 14:
                        case 49:
                            i4 = i2 < i3 ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject2 = (jSONArray.getJSONObject(i2));
                            JSONObject jSONObject3 = new JSONObject();
                            String str10 = (jSONObject2.getString(str5));
                            boolean z2 = (TextUtils.isEmpty((jSONObject2.optString(str7))));
                            int i5 = 1740;
                            while (true) {
                                i5 ^= 1757;
                                switch (i5) {
                                    case 17:
                                        i5 = z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        str2 = (jSONObject2.optString(str7));
                                        break;
                                    case 500:
                                        str2 = (jSONObject2.optString("vod_pic_thumb"));
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
                            boolean z3 = (str10.contains(str));
                            int i7 = 48767;
                            while (true) {
                                i7 ^= 48784;
                                switch (i7) {
                                    case 14:
                                    case 45:
                                        (jSONObject3.put(str4,(String.valueOf((jSONObject2.getInt(str4))))));
                                        (jSONObject3.put(str5,str10));
                                        (jSONObject3.put(str7,str2));
                                        (jSONObject3.put(str3,(jSONObject2.getString(str3))));
                                        (jSONArray2.put(jSONObject3));
                                        break;
                                    case 76:
                                        int i8 = 48891;
                                        while (true) {
                                            i8 ^= 48908;
                                            switch (i8) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i8 = 48922;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i7 = !z3 ? 48860 : 48829;
                                }
                            }
                            i = i2 + 1;
                            int i9 = 49666;
                            while (true) {
                                i9 ^= 49683;
                                switch (i9) {
                                    case 17:
                                        i9 = 49697;
                                    case 50:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            (jSONObject.put(str6,jSONArray2));
                            return (jSONObject.toString());
                    }
                }
            }
        } catch (Exception e) {
            m590(e);
            return "";
        }
    }
}
