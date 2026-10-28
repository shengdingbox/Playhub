package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.Os;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.kB;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class NewCz extends Spider {
    private static String i = "";

    public static String zH = "";
    private String yq = "https://www.4kcz.com/";
    private String SN = "https://t02.cz01.org";
    private String N = "";
    private Boolean tF = Boolean.TRUE;

    public NewCz() {
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        break;
                    
                case 204:
                    return;
                case 239:
                    return;
            }
            i3 = 1678;
        }
    }

    private JSONObject N(String str, String str2) {
        JSONObject jSONObject = null;
String str4 = null;
                // [deflattened] 控制流平坦化已还原为线性代码
        jSONObject = new JSONObject();
        str4 = "type_id";
        (jSONObject.put(str4,str2));
        str4 = "type_name";
        (jSONObject.put(str4,str));
        return jSONObject;
}

    private void SN(Va va) {
        boolean z = (m915(this).equals(""));
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (va != null) {
                                    break;
                                } else {
                                    i3 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                try {
                                    va = C0040.m1964(m916(this, m927(this), true));
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                } catch (IOException e) {
                                    m921(e);
                                    return;
                                }
                                break;
                        }
                        i3 = 1802;
                    }
                    StringBuilder sb = new StringBuilder();
                    (sb.append(((va.cS("div [id=sosuobox] > form")).yq("action"))));
                    (sb.append("?"));
                    (sb.append(((va.cS("div [id=sosuobox] > form > input")).yq("name"))));
                    (sb.append("="));
                    this.N = (sb.toString());
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    private void tF() {
        String str = "";
        boolean z = C0020.m1370(NewCz.zH);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    try {
                        JSONObject jSONObject = new JSONObject();
                        (jSONObject.put("username","oiiocn"));
                        (jSONObject.put("password","qwwsxedc"));
                        (jSONObject.put("email",str));
                        (jSONObject.put("url",m927(this)));
                        (jSONObject.put("invitecode",str));
                        (jSONObject.put("linuser",str));
                        HashMap hashMap = C0027.m1590("https://www.4kcz.com/", null, 1);
                        (hashMap.put("Origin","https://www.4kcz.com"));
                        (hashMap.put("content-type","application/x-www-form-urlencoded"));
                        (hashMap.put("accept","application/json, text/plain, */*"));
                        (hashMap.put("sec-ch-ua-arch","u=1, i"));
                        (hashMap.put("pragma","no-cache"));
                        (hashMap.put("sec-fetch-dest","empty"));
                        (hashMap.put("sec-ch-ua-mobile","?0"));
                        (hashMap.put("sec-ch-ua-model",str));
                        (hashMap.put("sec-fetch-site","same-origin"));
                        (hashMap.put("sec-fetch-mode","cors"));
                        (hashMap.put("priority","\"x86\""));
                        (hashMap.put("sec-ch-ua-bitness","\"64\""));
                        (hashMap.put("sec-ch-ua-full-version-list","\"Google Chrome\";v=\"131.0.6778.205\", \"Chromium\";v=\"131.0.6778.205\", \"Not_A Brand\";v=\"24.0.0.0\""));
                        (hashMap.put("sec-ch-ua-platform","Windows"));
                        (hashMap.put("sec-ch-ua-full-version","\"131.0.6778.205\""));
                        (hashMap.put("sec-ch-ua","\"Google Chrome\";v=\"131\", \"Chromium\";v=\"131\", \"Not_A Brand\";v=\"24\""));
                        boolean z2 = C0020.m1370(NewCz.zH);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (z2) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    (hashMap.put("Cookie",NewCz.zH));
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                        StringBuilder sb = new StringBuilder();
                        (sb.append(m927(this)));
                        (sb.append("api/vs/session"));
                        Iterator it = (m908(m910((sb.toString()), (jSONObject.toString()), hashMap), "set-cookie").iterator());
                        while (true) {
                            boolean z3 = (it.hasNext());
                            int i4 = 1864;
                            while (true) {
                                i4 ^= 1881;
                                switch (i4) {
                                    case 17:
                                        i4 = z3 ? 48736 : 48705;
                                    case 47384:
                                        break;
                                    case 47417:
                                        String str2 = (String) (it.next());
                                        boolean z4 = (str2.contains("wordpress_logged_in"));
                                        int i5 = 48767;
                                        while (true) {
                                            i5 ^= 48784;
                                            switch (i5) {
                                                case 14:
                                                case 45:
                                                    break;
                                                case 76:
                                                    zH = str2;
                                                    break;
                                                case 239:
                                                    i5 = z4 ? 48860 : 48829;
                                            }
                                        }
                                        break;
                                    case 47483:
                                }
                            }
                        }
                    } catch (Exception e) {
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    i6 = 49697;
                                    break;
                                case 50:
                                    break;
                            }
                        }
                    }
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        int i7 = 916 ^ C0002.f2;
        int i8 = 48891;
        while (true) {
            i8 ^= 48908;
            switch (i8) {
                case 22:
                    break;
                case 53:
                    return;
                case 503:
                    
                        break;
                    
                case 32495:
                    return;
            }
            i8 = 48953;
        }
    }

    private String zH(String str, boolean z) {
        String str2;
        boolean z2 = false;
        boolean z3 = (str.startsWith("http"));
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!z3) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                str2 = str;
                                break;
                        }
                    }
                    break;
                case 239:
                    str2 = C0032.m1739(new StringBuilder(), m927(this), str);
                    break;
            }
            i2 = 1678;
        }
        Response response = m909(m907(m906(), m920(m931(m919(new Request.Builder(), str2), m926(m913(this))))));
        int i4 = m933(response);
        int i5 = 1864;
        while (true) {
            i5 ^= 1881;
            switch (i5) {
                case 17:
                    if (i4 != 403) {
                        break;
                    } else {
                        i5 = 48736;
                        continue;
                    }
                case 47384:
                    String str3 = m923(m917(response));
                    m918(response);
                    int i6 = 48767;
                    while (true) {
                        i6 ^= 48784;
                        switch (i6) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                boolean z4 = (str3.contains("SafeLineChallenge"));
                                int i7 = 48891;
                                while (true) {
                                    i7 ^= 48908;
                                    switch (i7) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            if (!z4) {
                                                break;
                                            } else {
                                                i7 = 49635;
                                                continue;
                                            }
                                        case 32495:
                                            z2 = true;
                                            int i8 = 49666;
                                            while (true) {
                                                i8 ^= 49683;
                                                switch (i8) {
                                                    case 17:
                                                        i8 = 49697;
                                                        break;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                    i7 = 48953;
                                }
                                break;
                            case 239:
                                if (str3 == null) {
                                    break;
                                } else {
                                    i6 = 48860;
                                    continue;
                                }
                        }
                        i6 = 48829;
                    }
                    int i9 = 49790;
                    while (true) {
                        i9 ^= 49807;
                        switch (i9) {
                            case 18:
                                break;
                            case 51:
                                return str3;
                            case 84:
                                String str4 = "";
                                int i10 = 49914;
                                while (true) {
                                    i10 ^= 49931;
                                    switch (i10) {
                                        case 497:
                                            if (z) {
                                                break;
                                            } else {
                                                i10 = 50658;
                                                continue;
                                            }
                                        case 1711:
                                            break;
                                        case 1736:
                                            try {
                                                i = str4;
                                                i = (new Os(str2).yq(str3));
                                                StringBuilder sb = new StringBuilder();
                                                (sb.append("JWT: "));
                                                (sb.append(m914()));
                                                m928((sb.toString()));
                                                C0014.m432(C0052.m2248("czSlJwt"), m914());
                                                return m916(this, str, false);
                                            } catch (Exception e) {
                                                m921(e);
                                                return str4;
                                            }
                                        case 1769:
                                            m928("过盾失败2");
                                            return str4;
                                    }
                                    i10 = 50627;
                                }
                                break;
                            case 241:
                                if (!z2) {
                                    break;
                                } else {
                                    i9 = 49883;
                                    continue;
                                }
                        }
                        i9 = 49852;
                    }
                    break;
                case 47417:
                    zH = C0037.m1863(m930(m924(response)));
                    C0014.m432(C0052.m2248("czCookie"), NewCz.zH);
                    return m916(this, str, z);
                case 47483:
                    break;
            }
            i5 = 48705;
        }
    }

    /* renamed from: اﻡلن  reason: contains not printable characters */
    public static OkHttpClient m906() {
        int i2 = (-675) ^ C0038.f96;
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
                    return C0068Pe.N();
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

    /* renamed from: بضـﻱ  reason: contains not printable characters */
    public static Call m907(Object obj, Object obj2) {
        int i2 = (-185) ^ C0033.f91;
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
                    return ((OkHttpClient) obj).newCall((Request) obj2);
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

    /* renamed from: تذطر  reason: contains not printable characters */
    public static List m908(Object obj, Object obj2) {
        int i2 = 57 ^ C0032.f90;
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
                    return ((Response) obj).headers((String) obj2);
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

    /* renamed from: خذزﺩ  reason: contains not printable characters */
    public static Response m909(Object obj) {
        int i2 = (-540) ^ C0001.f1;
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
                    return ((Call) obj).execute();
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

    /* renamed from: خضﺹﺙ  reason: contains not printable characters */
    public static Response m910(Object obj, Object obj2, Object obj3) {
        int i2 = 293 ^ C0009.f9;
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
                    return C0068Pe.dT((String) obj, (String) obj2, (Map) obj3);
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

    /* renamed from: خﺎكﻉ  reason: contains not printable characters */
    public static void m911(Object obj) {
        int i2 = 498 ^ C0002.f2;
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
                    ((NewCz) obj).tF();
                    return;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: دﺏنث  reason: contains not printable characters */
    public static Boolean m912(Object obj) {
        int i2 = 812 ^ C0022.f80;
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
                    return ((NewCz) obj).tF;
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

    /* renamed from: ذﻁﺩﺥ  reason: contains not printable characters */
    public static HashMap m913(Object obj) {
        int i2 = 812 ^ C0022.f80;
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
                    return ((NewCz) obj).yq();
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

    /* renamed from: زصثﻙ  reason: contains not printable characters */
    public static String m914() {
        int i2 = 812 ^ C0022.f80;
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
                    return i;
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

    /* renamed from: صعنﻅ  reason: contains not printable characters */
    public static String m915(Object obj) {
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
                    return ((NewCz) obj).N;
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

    /* renamed from: طكﺏس  reason: contains not printable characters */
    public static String m916(Object obj, Object obj2, boolean z) {
        int i2 = (-4) ^ C0029.f87;
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
                    return ((NewCz) obj).zH((String) obj2, z);
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

    /* renamed from: فﻩﻉق  reason: contains not printable characters */
    public static ResponseBody m917(Object obj) {
        int i2 = (-448) ^ C0025.f83;
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
                    return ((Response) obj).body();
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

    /* renamed from: قكﻉﻅ  reason: contains not printable characters */
    public static void m918(Object obj) {
        int i2 = (-406) ^ C0053.f111;
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
                    ((Response) obj).close();
                    return;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: كﺡﺏـ  reason: contains not printable characters */
    public static Request.Builder m919(Object obj, Object obj2) {
        int i2 = 909 ^ C0002.f2;
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
                    return ((Request.Builder) obj).url((String) obj2);
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

    /* renamed from: وﻭﺵﺫ  reason: contains not printable characters */
    public static Request m920(Object obj) {
        int i2 = (-314) ^ C0002.f2;
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
                    return ((Request.Builder) obj).build();
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

    /* renamed from: ﺏشﺱب  reason: contains not printable characters */
    public static void m921(Object obj) {
        int i2 = (-477) ^ C0042.f100;
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
                    SpiderDebug.log((Throwable) obj);
                    return;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﺏﻱﻝط  reason: contains not printable characters */
    public static void m922(Object obj, Object obj2) {
        int i2 = (-675) ^ C0038.f96;
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
                    ((NewCz) obj).SN((Va) obj2);
                    break;
                case 239:
                    int i4 = 1864;
                    while (true) {
                        i4 ^= 1881;
                        switch (i4) {
                            case 17:
                                i4 = 48674;
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
        int i5 = (-422) ^ C0033.f91;
        int i6 = 1740;
        while (true) {
            i6 ^= 1757;
            switch (i6) {
                case 17:
                    
                        break;
                    
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    return;
            }
            i6 = 1802;
        }
    }

    /* renamed from: ﺙغرت  reason: contains not printable characters */
    public static String m923(Object obj) {
        int i2 = 753 ^ C0000.f0;
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
                    return ((ResponseBody) obj).string();
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

    /* renamed from: ﺙوﺩج  reason: contains not printable characters */
    public static Headers m924(Object obj) {
        int i2 = 624 ^ C0012.f12;
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
                    return ((Response) obj).headers();
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

    /* renamed from: ﺙﺏتﻩ  reason: contains not printable characters */
    public static JSONObject m925(Object obj, Object obj2, Object obj3) {
        int i2 = (-1021) ^ C0026.f84;
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
                    return ((NewCz) obj).N((String) obj2, (String) obj3);
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

    /* renamed from: ﺡـحم  reason: contains not printable characters */
    public static Headers m926(Object obj) {
        int i2 = 916 ^ C0002.f2;
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
                    return Headers.of((Map) obj);
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

    /* renamed from: ﺥﺫفز  reason: contains not printable characters */
    public static String m927(Object obj) {
        int i2 = 753 ^ C0000.f0;
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
                    return ((NewCz) obj).yq;
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

    /* renamed from: ﺥﻉﺕﻍ  reason: contains not printable characters */
    public static void m928(Object obj) {
        int i2 = (-448) ^ C0025.f83;
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
                    SpiderDebug.log((String) obj);
                    break;
                case 239:
                    int i4 = 1864;
                    while (true) {
                        i4 ^= 1881;
                        switch (i4) {
                            case 17:
                                i4 = 48674;
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
        int i5 = 215 ^ C0038.f96;
        int i6 = 1740;
        while (true) {
            i6 ^= 1757;
            switch (i6) {
                case 17:
                    
                        break;
                    
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    return;
            }
            i6 = 1802;
        }
    }

    /* renamed from: ﺥﻩكﻍ  reason: contains not printable characters */
    public static String m929(Object obj) {
        int i2 = (-26) ^ C0033.f91;
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
                    return ((NewCz) obj).SN;
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

    /* renamed from: ﺫﺽﺭذ  reason: contains not printable characters */
    public static Map m930(Object obj) {
        int i2 = 802 ^ C0052.f110;
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
                    return ((Headers) obj).toMultimap();
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

    /* renamed from: ﺵﻅيع  reason: contains not printable characters */
    public static Request.Builder m931(Object obj, Object obj2) {
        int i2 = 916 ^ C0002.f2;
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
                    return ((Request.Builder) obj).headers((Headers) obj2);
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

    /* renamed from: ﻁﺽجﺱ  reason: contains not printable characters */
    public static int m933(Object obj) {
        int i2 = (-540) ^ C0001.f1;
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
                    return ((Response) obj).code();
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4 = "img";
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            (sb.append(m927(this)));
            (sb.append(str));
            (sb.append("/page/"));
            (sb.append(str2));
            kB kBVar = (C0040.m1964(m916(this, (sb.toString()), true)).cS("div.mi_ne_kd > ul > li"));
            JSONArray jSONArray = new JSONArray();
            Iterator it = (kBVar.iterator());
            while (true) {
                boolean z2 = (it.hasNext());
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = z2 ? 1709 : 1678;
                        case 204:
                            hN hNVar = (hN) (it.next());
                            String str5 = "a";
                            (Objects.requireNonNull(hNVar));
                            String str6 = (C0000.m12(str5, hNVar).N("href"));
                            boolean z3 = (str6.startsWith("http"));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = z3 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        StringBuilder sb2 = new StringBuilder();
                                        (sb2.append(m927(this)));
                                        (sb2.append(str6));
                                        str3 = (sb2.toString());
                                        break;
                                    case 500:
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = 48674;
                                                case 47483:
                                                    str3 = str6;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            String str7 = (((hNVar.cS(str4)).yq("alt")).trim());
                            boolean z4 = C0010.m289(str7);
                            int i5 = 48767;
                            while (true) {
                                i5 ^= 48784;
                                switch (i5) {
                                    case 14:
                                    case 45:
                                        String str8 = (((hNVar.cS(str4)).yq("data-original")).trim());
                                        String str9 = (((hNVar.cS("div.hdinfo > span")).t0()).trim());
                                        JSONObject jSONObject2 = new JSONObject();
                                        (jSONObject2.put("vod_id",str3));
                                        (jSONObject2.put("vod_name",str7));
                                        (jSONObject2.put("vod_pic",str8));
                                        (jSONObject2.put("vod_remarks",str9));
                                        (jSONArray.put(jSONObject2));
                                        int i6 = 49666;
                                        while (true) {
                                            i6 ^= 49683;
                                            switch (i6) {
                                                case 17:
                                                    i6 = 49697;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 76:
                                        int i7 = 48891;
                                        while (true) {
                                            i7 ^= 48908;
                                            switch (i7) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i7 = 48922;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i5 = z4 ? 48860 : 48829;
                                }
                            }
                            break;
                        case 239:
                            C0012.m364(jSONArray, jSONObject, str2);
                            return (jSONObject.toString());
                    }
                }
            }
        } catch (Exception e) {
            m921(e);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x04e0, code lost:
        (r7.append((java.lang.CharSequence) (r6.next())));
        r8 = (r6.hasNext());
        r3 = 54533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04f0, code lost:
        r3 = r3 ^ 54550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04f4, code lost:
        switch(r3) {
            case 19: goto L308;
            case 50: goto L309;
            case 85: goto L307;
            case 116: goto L310;
            default: goto L311;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04f8, code lost:
        if (r8 == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04fa, code lost:
        r3 = 54626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04fe, code lost:
        r3 = 54595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0502, code lost:
        (r7.append(r5));
        r3 = 54657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0508, code lost:
        r3 = r3 ^ 54674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x050c, code lost:
        switch(r3) {
            case 19: goto L319;
            case 50: goto L318;
            default: goto L320;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0510, code lost:
        r3 = 54688;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r24) {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.NewCz.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        String str;
        String str2 = "img";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Va va = C0040.m1964(m916(this, m927(this), true));
            m922(this, va);
            (jSONArray.put(m925(this, "全部", "movie_bt")));
            (jSONArray.put(m925(this, "豆瓣电影Top250", "dbtop250")));
            (jSONArray.put(m925(this, "电影", "movie_bt_series/dyy")));
            (jSONArray.put(m925(this, "国产剧", "movie_bt_series/guochanju")));
            (jSONArray.put(m925(this, "美剧", "movie_bt_series/mj")));
            (jSONArray.put(m925(this, "韩剧", "movie_bt_series/hj")));
            (jSONArray.put(m925(this, "日剧", "movie_bt_series/rj")));
            (jSONArray.put(m925(this, "华语电影", "movie_bt_series/huayudianying")));
            (jSONArray.put(m925(this, "欧美电影", "movie_bt_series/meiguodianying")));
            (jSONArray.put(m925(this, "韩国电影", "movie_bt_series/hanguodianying")));
            (jSONArray.put(m925(this, "日本电影", "movie_bt_series/ribendianying")));
            (jSONObject.put("class",jSONArray));
            kB kBVar = (va.cS("div.mi_ne_kd > ul > li"));
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = (kBVar.iterator());
            while (true) {
                boolean z2 = (it.hasNext());
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = z2 ? 1709 : 1678;
                        case 204:
                            hN hNVar = (hN) (it.next());
                            String str3 = "a";
                            (Objects.requireNonNull(hNVar));
                            String str4 = (C0000.m12(str3, hNVar).N("href"));
                            boolean z3 = (str4.startsWith("http"));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = z3 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        StringBuilder sb = new StringBuilder();
                                        (sb.append(m927(this)));
                                        (sb.append(str4));
                                        str = (sb.toString());
                                        break;
                                    case 500:
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = 48674;
                                                case 47483:
                                                    str = str4;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            String str5 = (((hNVar.cS(str2)).yq("alt")).trim());
                            boolean z4 = C0010.m289(str5);
                            int i5 = 48767;
                            while (true) {
                                i5 ^= 48784;
                                switch (i5) {
                                    case 14:
                                    case 45:
                                        String str6 = (((hNVar.cS(str2)).yq("data-original")).trim());
                                        String str7 = (((hNVar.cS("div.hdinfo > span")).t0()).trim());
                                        JSONObject jSONObject2 = new JSONObject();
                                        (jSONObject2.put("vod_id",str));
                                        (jSONObject2.put("vod_name",str5));
                                        (jSONObject2.put("vod_pic",str6));
                                        (jSONObject2.put("vod_remarks",str7));
                                        (jSONArray2.put(jSONObject2));
                                        int i6 = 49666;
                                        while (true) {
                                            i6 ^= 49683;
                                            switch (i6) {
                                                case 17:
                                                    i6 = 49697;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 76:
                                        int i7 = 48891;
                                        while (true) {
                                            i7 ^= 48908;
                                            switch (i7) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i7 = 48922;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i5 = z4 ? 48860 : 48829;
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
            m921(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        try {
            boolean z = C0020.m1370(str);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (z) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        String[] strArr = ((new JSONObject(str).getString("login")).split("-"));
                        String str2 = strArr[0];
                        String str3 = strArr[1];
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            boolean z2 = C0020.m1370(NewCz.zH);
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        if (!z2) {
                            break;
                        } else {
                            i3 = 1833;
                            continue;
                        }
                    case 54:
                        break;
                    case 471:
                        break;
                    case 500:
                        zH = C0021.m1398(C0052.m2248("czCookie"));
                        break;
                    default:
                        continue;
                }
                i3 = 1802;
            }
            boolean z3 = C0020.m1370(m914());
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        if (!z3) {
                            break;
                        } else {
                            i4 = 48736;
                            continue;
                        }
                    case 47384:
                        return;
                    case 47417:
                        i = C0021.m1398(C0052.m2248("czSlJwt"));
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                    return;
                                case 239:
                                    i5 = 48798;
                                    break;
                            }
                        }
                        break;
                    case 47483:
                        break;
                    default:
                        continue;
                }
                i4 = 48705;
            }
        } catch (Exception e) {
            m921(e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 446
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0896 -> B:25:0x00ba). Please submit an issue!!! */
    public java.lang.String playerContent(java.lang.String r24, java.lang.String r25, java.util.List<java.lang.String> r26) {
        /*
            Method dump skipped, instructions count: 2754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.NewCz.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            StringBuilder sb = new StringBuilder();
            (sb.append("http://czzy.xn--m7r412advb92j21st65a.tk/czzysearch.php?wd="));
            (sb.append(C0009.m260(str, "UTF-8")));
            String str3 = C0011.m353((sb.toString()), Rc.yq(), 0);
            boolean z2 = (str3.contains("$$$"));
            String str4 = "vod_remarks";
            String str5 = "vod_pic";
            String str6 = "vod_name";
            String str7 = ".html";
            String str8 = "movie/";
            String str9 = "vod_id";
            String str10 = "\\|";
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (!z2) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        String[] strArr = (str3.split("\\$\\$\\$"));
                        int length = strArr.length;
                        int i3 = 0;
                        while (true) {
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = i3 < length ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        String[] strArr2 = (strArr[i3].split(str10));
                                        boolean z3 = C0010.m289(strArr2[1]);
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = z3 ? 48736 : 48705;
                                                case 47384:
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    StringBuilder sb2 = new StringBuilder();
                                                    (sb2.append(str8));
                                                    (sb2.append(strArr2[0]));
                                                    (sb2.append(str7));
                                                    (jSONObject2.put(str9,(sb2.toString())));
                                                    (jSONObject2.put(str6,strArr2[1]));
                                                    (jSONObject2.put(str5,strArr2[2]));
                                                    (jSONObject2.put(str4,strArr2[3]));
                                                    (jSONArray.put(jSONObject2));
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
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        i3++;
                                        int i7 = 48891;
                                        while (true) {
                                            i7 ^= 48908;
                                            switch (i7) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i7 = 48922;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                    case 239:
                        String[] strArr3 = (str3.split(str10));
                        boolean z4 = C0010.m289(strArr3[1]);
                        int i8 = 49666;
                        while (true) {
                            i8 ^= 49683;
                            switch (i8) {
                                case 17:
                                    if (!z4) {
                                        break;
                                    } else {
                                        i8 = 49759;
                                        continue;
                                    }
                                case 50:
                                    break;
                                case 76:
                                    return str2;
                                case 83:
                                    JSONObject jSONObject3 = new JSONObject();
                                    StringBuilder sb3 = new StringBuilder();
                                    (sb3.append(str8));
                                    (sb3.append(strArr3[0]));
                                    (sb3.append(str7));
                                    (jSONObject3.put(str9,(sb3.toString())));
                                    (jSONObject3.put(str6,strArr3[1]));
                                    (jSONObject3.put(str5,strArr3[2]));
                                    (jSONObject3.put(str4,strArr3[3]));
                                    (jSONArray.put(jSONObject3));
                                    break;
                                default:
                                    continue;
                            }
                            i8 = 49728;
                        }
                }
                i2 = 1678;
            }
            (jSONObject.put("list",jSONArray));
            return (jSONObject.toString());
        } catch (Exception e) {
            m921(e);
            return str2;
        }
    }

    protected final HashMap<String, String> yq() {
        HashMap<String, String> hashMap = C0055.m2325("User-Agent", "Mozilla/5.0 (Linux; Android) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36 CrKey/1.54.248666", "Accept-language", "zh-CN,zh;q=0.9");
        (hashMap.put("accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"));
        (hashMap.put("upgrade-insecure-requests","1"));
        (hashMap.put("sec-fetch-dest","document"));
        (hashMap.put("sec-fetch-mode","navigate"));
        String str = "cache-control";
        String str2 = "no-cache";
        (hashMap.put(str,str2));
        (hashMap.put("pragma",str2));
        (hashMap.put("content-type","text/html; charset=utf-8"));
        (hashMap.put("X-Requested-With","XMLHttpRequset"));
        (hashMap.put("Accept-Encoding","deflate"));
        StringBuilder sb = new StringBuilder();
        boolean z = C0020.m1370(NewCz.zH);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    (sb.append(NewCz.zH));
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        boolean z2 = C0020.m1370(m914());
        int i3 = 1740;
        while (true) {
            i3 ^= 1757;
            switch (i3) {
                case 17:
                    if (z2) {
                        break;
                    } else {
                        i3 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    break;
                case 500:
                    int i4 = (sb.length());
                    int i5 = 1864;
                    while (true) {
                        i5 ^= 1881;
                        switch (i5) {
                            case 17:
                                if (i4 <= 0) {
                                    break;
                                } else {
                                    i5 = 48736;
                                    continue;
                                }
                            case 47384:
                                break;
                            case 47417:
                                (sb.append("; "));
                                break;
                            case 47483:
                                break;
                        }
                        i5 = 48705;
                    }
                    (sb.append("sl-challenge-jwt="));
                    (sb.append(m914()));
                    break;
            }
            i3 = 1802;
        }
        int i6 = (sb.length());
        int i7 = 48767;
        while (true) {
            i7 ^= 48784;
            switch (i7) {
                case 14:
                    break;
                case 45:
                    break;
                case 76:
                    (hashMap.put("Cookie",(sb.toString())));
                    break;
                case 239:
                    if (i6 <= 0) {
                        break;
                    } else {
                        i7 = 48860;
                        continue;
                    }
            }
            i7 = 48829;
        }
        (hashMap.put("referer",m927(this)));
        return hashMap;
    }
}
