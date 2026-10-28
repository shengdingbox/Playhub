package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0103fp;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class AppSx extends Spider {

    private String N;
    private String SN;
    private String ee;
    private String t0;
    private String tF;
    private String v;
    private JSONObject v3;
    private String yq;
    private String zH;
    private String i = "113";
    private int Gc = 119;
    private String M = "/api.php/getappapi.";
    private String KJ = "index/";
    private String q = "initV119";
    private String B = "vodDetail";
    private String G = "typeFilterVodList";
    private String G4 = "searchList";
    private String dT = "vodParse";
    private C0103fp F5 = new C0103fp();
    private boolean W = false;
    private long g9 = 0;

    public AppSx() {
        String str = "";
        this.yq = str;
        this.SN = str;
        this.N = str;
        this.tF = str;
        this.zH = str;
        this.t0 = str;
        this.v = str;
        this.ee = str;
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 459
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private java.lang.String Gc(java.lang.String r22, int r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.Gc(java.lang.String, int, java.lang.String, java.lang.String):java.lang.String");
    }

    private boolean M() {
        String str = "slider_id";
        String str2 = "data";
        try {
            m565(this);
            StringBuilder sb = new StringBuilder();
            (sb.append(m537(this)));
            (sb.append(m571(this)));
            (sb.append(m568(this)));
            (sb.append("getSlider"));
            JSONObject jSONObject = new JSONObject(m555(this, (new JSONObject(C0028.m1633((sb.toString()), m557(this))).getString(str2))));
            String str3 = (jSONObject.getString(str));
            int i = (jSONObject.getInt("target_x"));
            long j = (new Date().getTime());
            C0029.m1640(12000L);
            StringBuilder sb2 = new StringBuilder();
            (sb2.append(m537(this)));
            (sb2.append(m571(this)));
            (sb2.append(m568(this)));
            (sb2.append("verifySlider"));
            String str4 = (sb2.toString());
            HashMap hashMap = new HashMap();
            (hashMap.put("pos_x",(String.valueOf(i))));
            (hashMap.put(str,str3));
            (hashMap.put("timestamp",(String.valueOf(j))));
            return (new JSONObject(m555(this, (new JSONObject((C0005.m167(str4, hashMap, m557(this)).yq())).getString(str2)))).getBoolean("verified"));
        } catch (Exception e) {
            (e.printStackTrace());
            return false;
        }
    }

    private String N(String str) {
        String str2;
        String str3;
        boolean z = (str.startsWith("{"));
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
                    boolean z2 = (str.startsWith("["));
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
                                String str4 = (str.replace("\\",""));
                                boolean z3 = m566(this);
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            boolean z4 = (TextUtils.isEmpty(m541(this)));
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 503:
                                                        if (z4) {
                                                            break;
                                                        } else {
                                                            i4 = 49635;
                                                            continue;
                                                        }
                                                    case 32495:
                                                        str2 = m541(this);
                                                        int i5 = 49666;
                                                        while (true) {
                                                            i5 ^= 49683;
                                                            switch (i5) {
                                                                case 17:
                                                                    i5 = 49697;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                                i4 = 48953;
                                            }
                                            break;
                                        case 239:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i3 = 48860;
                                                continue;
                                            }
                                    }
                                    i3 = 48829;
                                }
                                str2 = m561(this);
                                boolean z5 = m566(this);
                                int i6 = 49790;
                                while (true) {
                                    i6 ^= 49807;
                                    switch (i6) {
                                        case 18:
                                            break;
                                        case 51:
                                            break;
                                        case 84:
                                            boolean z6 = (TextUtils.isEmpty(m541(this)));
                                            int i7 = 49914;
                                            while (true) {
                                                i7 ^= 49931;
                                                switch (i7) {
                                                    case 497:
                                                        if (z6) {
                                                            break;
                                                        } else {
                                                            i7 = 50658;
                                                            continue;
                                                        }
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        str3 = m541(this);
                                                        int i8 = 50689;
                                                        while (true) {
                                                            i8 ^= 50706;
                                                            switch (i8) {
                                                                case 19:
                                                                    i8 = 50720;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                                i7 = 50627;
                                            }
                                            break;
                                        case 241:
                                            if (!z5) {
                                                break;
                                            } else {
                                                i6 = 49883;
                                                continue;
                                            }
                                    }
                                    i6 = 49852;
                                }
                                str3 = m570(this);
                                return C0031.m1720(str4, str2, str3);
                            case 500:
                                int i9 = 1864;
                                while (true) {
                                    i9 ^= 1881;
                                    switch (i9) {
                                        case 17:
                                            i9 = 48674;
                                            break;
                                        case 47483:
                                            return str;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return str;
            }
            i = 1678;
        }
    }

    private boolean SN(String str) {
        boolean z = true;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            (sb2.append(m537(this)));
            (sb2.append(m571(this)));
            (sb.append((sb2.toString())));
            (sb.append("completeRewardOrder"));
            String str2 = (sb.toString());
            HashMap hashMap = new HashMap();
            (hashMap.put("order_no",str));
            JSONObject jSONObject = new JSONObject((C0005.m167(str2, hashMap, m557(this)).yq()));
            int i = (jSONObject.optInt("code",-1));
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (i == 0) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        return false;
                    case 239:
                        int i3 = (new JSONObject(m555(this, (jSONObject.getString("data")))).optInt("status",0));
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    if (i3 != 1) {
                                        break;
                                    } else {
                                        i4 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    z = false;
                                    break;
                                case 500:
                                    break;
                            }
                            i4 = 1802;
                        }
                        return z;
                    default:
                        continue;
                }
                i2 = 1678;
            }
        } catch (Exception e) {
            (e.printStackTrace());
            return false;
        }
    }

    private HashMap<String, String> i() {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        int i = m534(this);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 119) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    str = "okhttp/3.10.0";
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    str = "okhttp/3.14.9";
                    break;
            }
            i2 = 1678;
        }
        (hashMap.put("User-Agent",str));
        boolean z = m566(this);
        String str2 = "android";
        String str3 = "app-version-code";
        int i4 = 1864;
        while (true) {
            i4 ^= 1881;
            switch (i4) {
                case 17:
                    if (!z) {
                        break;
                    } else {
                        i4 = 48736;
                        continue;
                    }
                case 47384:
                    int i5 = m534(this);
                    int i6 = 48891;
                    while (true) {
                        i6 ^= 48908;
                        switch (i6) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                if (i5 == 118) {
                                    break;
                                } else {
                                    i6 = 49635;
                                    continue;
                                }
                            case 32495:
                                int i7 = 49666;
                                while (true) {
                                    i7 ^= 49683;
                                    switch (i7) {
                                        case 17:
                                            if (i5 != 119) {
                                                break;
                                            } else {
                                                i7 = 49759;
                                                continue;
                                            }
                                        case 50:
                                            break;
                                        case 76:
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
                                        case 83:
                                            int i9 = 49914;
                                            while (true) {
                                                i9 ^= 49931;
                                                switch (i9) {
                                                    case 497:
                                                        if (i5 != 117) {
                                                            break;
                                                        } else {
                                                            i9 = 50658;
                                                            continue;
                                                        }
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        boolean z2 = (TextUtils.isEmpty(m564(this)));
                                                        int i10 = 50689;
                                                        while (true) {
                                                            i10 ^= 50706;
                                                            switch (i10) {
                                                                case 19:
                                                                    if (z2) {
                                                                        break;
                                                                    } else {
                                                                        i10 = 50782;
                                                                        continue;
                                                                    }
                                                                case 45:
                                                                    break;
                                                                case 50:
                                                                    break;
                                                                case 76:
                                                                    (hashMap.put("App-Device-Id",m564(this)));
                                                                    break;
                                                            }
                                                            i10 = 50751;
                                                        }
                                                        (hashMap.put("App-Os-Type",str2));
                                                        (hashMap.put("App-Ui-Mode","dark"));
                                                        (hashMap.put("App-Version-Code",m558(this)));
                                                        int i11 = 50813;
                                                        while (true) {
                                                            i11 ^= 50830;
                                                            switch (i11) {
                                                                case 18:
                                                                    break;
                                                                case 243:
                                                                    i11 = 50844;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                                i9 = 50627;
                                            }
                                            break;
                                    }
                                    i7 = 49728;
                                }
                                break;
                        }
                        i6 = 48953;
                    }
                    boolean z3 = (TextUtils.isEmpty(m564(this)));
                    int i12 = 51588;
                    while (true) {
                        i12 ^= 51605;
                        switch (i12) {
                            case 17:
                                if (z3) {
                                    break;
                                } else {
                                    i12 = 51681;
                                    continue;
                                }
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                (hashMap.put("app-user-device-id",m564(this)));
                                break;
                        }
                        i12 = 51650;
                    }
                    boolean z4 = (TextUtils.isEmpty(m532(this)));
                    int i13 = 51712;
                    while (true) {
                        i13 ^= 51729;
                        switch (i13) {
                            case 14:
                                break;
                            case 17:
                                if (z4) {
                                    break;
                                } else {
                                    i13 = 51805;
                                    continue;
                                }
                            case 47:
                                break;
                            case 76:
                                (hashMap.put("app-user-token",m532(this)));
                                break;
                        }
                        i13 = 51774;
                    }
                    String str4 = (String.valueOf(System.currentTimeMillis() / 1000));
                    String str5 = C0039.m1940(str4, m561(this), m570(this), 2);
                    (hashMap.put("app-ui-mode","light"));
                    (hashMap.put("app-api-verify-time",str4));
                    (hashMap.put("app-api-verify-sign",str5));
                    (hashMap.put(str3,m558(this)));
                    return hashMap;
                case 47417:
                    (hashMap.put(str3,m558(this)));
                    (hashMap.put("app-platform",str2));
                    boolean z5 = (TextUtils.isEmpty(m551(this)));
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                (hashMap.put("app-session-id",m551(this)));
                                break;
                            case 239:
                                if (z5) {
                                    break;
                                } else {
                                    i14 = 48860;
                                    continue;
                                }
                        }
                        i14 = 48829;
                    }
                    return hashMap;
                case 47483:
                    break;
            }
            i4 = 48705;
        }
    }

    private JSONObject t0() {
        String str;
        m565(this);
        StringBuilder sb = new StringBuilder();
        (sb.append(m537(this)));
        (sb.append(m571(this)));
        (sb.append(m568(this)));
        (sb.append(m548(this)));
        String str2 = (sb.toString());
        int i = m534(this);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 119) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    str = C0028.m1633(str2, m557(this));
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    str = (C0042.m2006(str2, "", m557(this)).yq());
                    break;
            }
            i2 = 1678;
        }
        JSONObject jSONObject = new JSONObject(m555(this, (new JSONObject(str).getString("data"))));
        int i4 = m534(this);
        int i5 = 1864;
        while (true) {
            i5 ^= 1881;
            switch (i5) {
                case 17:
                    if (i4 <= 119) {
                        break;
                    } else {
                        i5 = 48736;
                        continue;
                    }
                case 47384:
                    break;
                case 47417:
                    String str3 = "box_config";
                    boolean z = (jSONObject.has(str3));
                    int i6 = 48767;
                    while (true) {
                        i6 ^= 48784;
                        switch (i6) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                String str4 = (jSONObject.getString(str3));
                                String str5 = ((new StringBuilder(m561(this)).reverse()).toString());
                                JSONObject jSONObject2 = new JSONObject(C0031.m1720(str4, str5, (C0052.m2266(str5).substring(0,16))));
                                m536(this).yq = (jSONObject2.getString("search_name"));
                                m536(this).SN = (jSONObject2.getString("signature_name"));
                                m536(this).N = (jSONObject2.getString("signature_value"));
                                JSONObject jSONObject3 = (jSONObject2.getJSONObject("api_header"));
                                m536(this).tF = (jSONObject3.getString("key"));
                                m536(this).zH = (jSONObject3.getString("value"));
                                break;
                            case 239:
                                if (!z) {
                                    break;
                                } else {
                                    i6 = 48860;
                                    continue;
                                }
                        }
                        i6 = 48829;
                    }
                    break;
                case 47483:
                    break;
            }
            i5 = 48705;
        }
        m536(this).i = true;
        return jSONObject;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 357
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private void tF() {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.tF():void");
    }

    private JSONObject yq(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
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
                    try {
                        JSONObject jSONObject2 = new JSONObject(new String(C0022.m1420(str, 2)));
                        Iterator it = (jSONObject2.keys());
                        while (true) {
                            boolean z2 = (it.hasNext());
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        String str3 = (String) (it.next());
                                        (jSONObject.put(str3,(jSONObject2.get(str3))));
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    i3 = 48674;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        (e.printStackTrace());
                        break;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        (jSONObject.put("User-Agent",str2));
        return jSONObject;
    }

    private String zH(JSONObject jSONObject) {
        String str = "data";
        boolean z = (jSONObject.has(str));
        String str2 = "";
        String str3 = "url";
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
                    boolean z2 = (jSONObject.get(str)) instanceof JSONObject;
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
                                JSONObject jSONObject2 = (jSONObject.getJSONObject(str));
                                boolean z3 = (jSONObject2.has(str3));
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
                                            String str4 = (jSONObject2.optString(str3,str2));
                                            boolean z4 = (TextUtils.isEmpty(str4));
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        return str4;
                                                    case 239:
                                                        if (z4) {
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
        boolean z5 = (jSONObject.has(str3));
        int i5 = 48891;
        while (true) {
            i5 ^= 48908;
            switch (i5) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    if (!z5) {
                        break;
                    } else {
                        i5 = 49635;
                        continue;
                    }
                case 32495:
                    String str5 = (jSONObject.optString(str3,str2));
                    boolean z6 = (TextUtils.isEmpty(str5));
                    int i6 = 49666;
                    while (true) {
                        i6 ^= 49683;
                        switch (i6) {
                            case 17:
                                if (z6) {
                                    break;
                                } else {
                                    i6 = 49759;
                                    continue;
                                }
                            case 50:
                                break;
                            case 76:
                                return str5;
                            case 83:
                                break;
                        }
                        i6 = 49728;
                    }
                    break;
            }
            i5 = 48953;
        }
        String str6 = "json";
        boolean z7 = (jSONObject.has(str6));
        int i7 = 49790;
        while (true) {
            i7 ^= 49807;
            switch (i7) {
                case 18:
                    break;
                case 51:
                    break;
                case 84:
                    String str7 = (jSONObject.optString(str6,str2));
                    boolean z8 = (TextUtils.isEmpty(str7));
                    int i8 = 49914;
                    while (true) {
                        i8 ^= 49931;
                        switch (i8) {
                            case 497:
                                if (z8) {
                                    break;
                                } else {
                                    i8 = 50658;
                                    continue;
                                }
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                return m560(this, new JSONObject(str7));
                        }
                        i8 = 50627;
                    }
                    break;
                case 241:
                    if (!z7) {
                        break;
                    } else {
                        i7 = 49883;
                        continue;
                    }
            }
            i7 = 49852;
        }
        return str2;
    }

    /* renamed from: بحـﺎ  reason: contains not printable characters */
    public static String m532(Object obj) {
        int i = (-914) ^ C0004.f4;
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
                    return ((AppSx) obj).zH;
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

    /* renamed from: بطﻱش  reason: contains not printable characters */
    public static Request.Builder m533(Object obj, Object obj2) {
        int i = (-540) ^ C0001.f1;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
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

    /* renamed from: بﺏﻅل  reason: contains not printable characters */
    public static int m534(Object obj) {
        int i = 930 ^ C0038.f96;
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
                    return ((AppSx) obj).Gc;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: تفﺩﻙ  reason: contains not printable characters */
    public static void m535(Object obj) {
        int i = (-540) ^ C0001.f1;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    SpiderDebug.log((String) obj);
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

    /* renamed from: ثﺵﻱه  reason: contains not printable characters */
    public static C0103fp m536(Object obj) {
        int i = (-388) ^ C0035.f93;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).F5;
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

    /* renamed from: حاﺵذ  reason: contains not printable characters */
    public static String m537(Object obj) {
        int i = (-914) ^ C0004.f4;
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
                    return ((AppSx) obj).yq;
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

    /* renamed from: خﺡشح  reason: contains not printable characters */
    public static String m538(Object obj, Object obj2, int i, Object obj3, Object obj4) {
        int i2 = (-768) ^ C0002.f2;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 > 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).Gc((String) obj2, i, (String) obj3, (String) obj4);
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

    /* renamed from: درمث  reason: contains not printable characters */
    public static String m539(Object obj) {
        int i = (-540) ^ C0001.f1;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).G;
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

    /* renamed from: دزيق  reason: contains not printable characters */
    public static String m540(Object obj) {
        int i = 753 ^ C0000.f0;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).G4;
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

    /* renamed from: دﻙكر  reason: contains not printable characters */
    public static String m541(Object obj) {
        int i = 57 ^ C0032.f90;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).ee;
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

    /* renamed from: ذحـﻁ  reason: contains not printable characters */
    public static MediaType m542(Object obj) {
        int i = 812 ^ C0022.f80;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return MediaType.parse((String) obj);
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

    /* renamed from: ذدظﻍ  reason: contains not printable characters */
    public static Response m543(Object obj) {
        int i = (-703) ^ C0036.f94;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
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

    /* renamed from: ذشﺽي  reason: contains not printable characters */
    public static Headers m544(Object obj) {
        int i = (-388) ^ C0035.f93;
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
                    return Headers.of((Map) obj);
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

    /* renamed from: ربدي  reason: contains not printable characters */
    public static JSONObject m545(Object obj, Object obj2, Object obj3) {
        int i = 923 ^ C0041.f99;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).yq((String) obj2, (String) obj3);
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

    /* renamed from: زرﺝل  reason: contains not printable characters */
    public static String m546(Object obj) {
        int i = (-1021) ^ C0026.f84;
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

    /* renamed from: سنﺥب  reason: contains not printable characters */
    public static OkHttpClient m547(int i) {
        int i2 = (-985) ^ C0000.f0;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 >= 0) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    return C0068Pe.yq(i);
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

    /* renamed from: شﻡﺏب  reason: contains not printable characters */
    public static String m548(Object obj) {
        int i = (-31) ^ C0006.f6;
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
                    return ((AppSx) obj).q;
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

    /* renamed from: صكﺝﺥ  reason: contains not printable characters */
    public static Request.Builder m549(Object obj, Object obj2) {
        int i = (-675) ^ C0038.f96;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((Request.Builder) obj).headers((Headers) obj2);
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

    /* renamed from: ضبﺥق  reason: contains not printable characters */
    public static InputStream m550(Object obj) {
        int i = (-768) ^ C0002.f2;
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
                    return ((ResponseBody) obj).byteStream();
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

    /* renamed from: عصدخ  reason: contains not printable characters */
    public static String m551(Object obj) {
        int i = (-604) ^ C0013.f13;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).v;
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

    /* renamed from: عقﺙر  reason: contains not printable characters */
    public static Call m552(Object obj, Object obj2) {
        int i = 753 ^ C0000.f0;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
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

    /* renamed from: عﺎفل  reason: contains not printable characters */
    public static String m553(Object obj) {
        int i = 697 ^ C0024.f82;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).dT;
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

    /* renamed from: عﺎيو  reason: contains not printable characters */
    public static String m554(Object obj) {
        int i = (-824) ^ C0004.f4;
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
                    return ((AppSx) obj).B;
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

    /* renamed from: ـصعﺹ  reason: contains not printable characters */
    public static String m555(Object obj, Object obj2) {
        int i = (-732) ^ f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).N((String) obj2);
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

    /* renamed from: فكرﺏ  reason: contains not printable characters */
    public static void m556(Object obj) {
        int i = 916 ^ C0002.f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
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

    /* renamed from: ليﻕح  reason: contains not printable characters */
    public static HashMap m557(Object obj) {
        int i = (-487) ^ C0053.f111;
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
                    return ((AppSx) obj).i();
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

    /* renamed from: معﻡﺱ  reason: contains not printable characters */
    public static String m558(Object obj) {
        int i = (-767) ^ C0037.f95;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).i;
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

    /* renamed from: هﺫﻭخ  reason: contains not printable characters */
    public static boolean m559(Object obj, Object obj2) {
        int i = (-487) ^ C0053.f111;
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
                    return ((AppSx) obj).SN((String) obj2);
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

    /* renamed from: هﻉﺫﺱ  reason: contains not printable characters */
    public static String m560(Object obj, Object obj2) {
        int i = 916 ^ C0002.f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).zH((JSONObject) obj2);
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

    /* renamed from: وﺏغﻝ  reason: contains not printable characters */
    public static String m561(Object obj) {
        int i = 515 ^ C0028.f86;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).SN;
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

    /* renamed from: وﻉﻱت  reason: contains not printable characters */
    public static RequestBody m562(Object obj, Object obj2) {
        int i = (-388) ^ C0035.f93;
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
                    return RequestBody.create((MediaType) obj, (String) obj2);
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

    /* renamed from: ﺎمﺱغ  reason: contains not printable characters */
    public static boolean m563(Object obj) {
        int i = (-675) ^ C0038.f96;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).M();
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

    /* renamed from: ﺙﺱاﺵ  reason: contains not printable characters */
    public static String m564(Object obj) {
        int i = (-767) ^ C0037.f95;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).tF;
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

    /* renamed from: ﺙﻩرﻍ  reason: contains not printable characters */
    public static void m565(Object obj) {
        int i = 36 ^ C0033.f91;
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
                    ((AppSx) obj).tF();
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

    /* renamed from: ﺥﺩدﺏ  reason: contains not printable characters */
    public static boolean m566(Object obj) {
        int i = 802 ^ C0052.f110;
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
                    return ((AppSx) obj).W;
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

    /* renamed from: ﺥﻩﻁف  reason: contains not printable characters */
    public static Request m567(Object obj) {
        int i = (-1021) ^ C0026.f84;
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

    /* renamed from: ﺩﻙﻭظ  reason: contains not printable characters */
    public static String m568(Object obj) {
        int i = 916 ^ C0002.f2;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).KJ;
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

    /* renamed from: ﺵزقظ  reason: contains not printable characters */
    public static long m569(Object obj) {
        int i = (-477) ^ C0042.f100;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).g9;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0L;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺵضحﺝ  reason: contains not printable characters */
    public static String m570(Object obj) {
        int i = 753 ^ C0000.f0;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).N;
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

    /* renamed from: ﺽقتا  reason: contains not printable characters */
    public static String m571(Object obj) {
        int i = (-914) ^ C0004.f4;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).M;
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

    /* renamed from: ﻍخفص  reason: contains not printable characters */
    public static JSONObject m572(Object obj) {
        int i = (-406) ^ C0053.f111;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).t0();
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

    /* renamed from: ﻙعﺹب  reason: contains not printable characters */
    public static ResponseBody m573(Object obj) {
        int i = (-314) ^ C0002.f2;
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

    /* renamed from: ﻝغشﺫ  reason: contains not printable characters */
    public static JSONObject m574(Object obj) {
        int i = (-558) ^ C0039.f97;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).v3;
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

    /* renamed from: ﻝﻁاﺵ  reason: contains not printable characters */
    public static String m576(Object obj) {
        int i = 812 ^ C0022.f80;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((AppSx) obj).t0;
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

    /* renamed from: ﻩاغط  reason: contains not printable characters */
    public static Request.Builder m577(Object obj, Object obj2) {
        int i = (-675) ^ C0038.f96;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
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

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        int i2;
        String str8 = "vod_remarks";
        String str9 = "vod_pic";
        String str10 = "vod_id";
        String str11 = "page";
        String str12 = "vod_name";
        String str13 = "lang";
        String str14 = "sort";
        String str15 = "class";
        String str16 = "year";
        String str17 = "area";
        try {
            m565(this);
            Object obj = (hashMap.get(str17));
            String str18 = "全部";
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        if (obj != null) {
                            break;
                        } else {
                            i3 = 1709;
                            continue;
                        }
                    case 204:
                        (hashMap.put(str17,str18));
                        break;
                    case 239:
                        break;
                }
                i3 = 1678;
            }
            Object obj2 = (hashMap.get(str16));
            int i4 = 1740;
            while (true) {
                i4 ^= 1757;
                switch (i4) {
                    case 17:
                        if (obj2 != null) {
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
                        (hashMap.put(str16,str18));
                        break;
                    default:
                        continue;
                }
                i4 = 1802;
            }
            boolean z2 = (hashMap.containsKey(str17));
            int i5 = 1864;
            while (true) {
                i5 ^= 1881;
                switch (i5) {
                    case 17:
                        if (!z2) {
                            break;
                        } else {
                            i5 = 48736;
                            continue;
                        }
                    case 47384:
                        str3 = str18;
                        break;
                    case 47417:
                        str3 = (String) (hashMap.get(str17));
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
                    default:
                        continue;
                }
                i5 = 48705;
            }
            boolean z3 = (hashMap.containsKey(str16));
            int i7 = 48891;
            while (true) {
                i7 ^= 48908;
                switch (i7) {
                    case 22:
                        break;
                    case 53:
                        str4 = str18;
                        break;
                    case 503:
                        if (!z3) {
                            break;
                        } else {
                            i7 = 49635;
                            continue;
                        }
                    case 32495:
                        str4 = (String) (hashMap.get(str16));
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
                    default:
                        continue;
                }
                i7 = 48953;
            }
            boolean z4 = (hashMap.containsKey(str15));
            int i9 = 49790;
            while (true) {
                i9 ^= 49807;
                switch (i9) {
                    case 18:
                        break;
                    case 51:
                        str5 = str18;
                        break;
                    case 84:
                        str5 = (String) (hashMap.get(str15));
                        int i10 = 49914;
                        while (true) {
                            i10 ^= 49931;
                            switch (i10) {
                                case 497:
                                    i10 = 50596;
                                    break;
                                case 1711:
                                    break;
                            }
                        }
                        break;
                    case 241:
                        if (!z4) {
                            break;
                        } else {
                            i9 = 49883;
                            continue;
                        }
                    default:
                        continue;
                }
                i9 = 49852;
            }
            boolean z5 = (hashMap.containsKey(str14));
            int i11 = 50689;
            while (true) {
                i11 ^= 50706;
                switch (i11) {
                    case 19:
                        if (!z5) {
                            break;
                        } else {
                            i11 = 50782;
                            continue;
                        }
                    case 45:
                        str6 = str18;
                        break;
                    case 50:
                        break;
                    case 76:
                        str6 = (String) (hashMap.get(str14));
                        int i12 = 50813;
                        while (true) {
                            i12 ^= 50830;
                            switch (i12) {
                                case 18:
                                    break;
                                case 243:
                                    i12 = 50844;
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i11 = 50751;
            }
            boolean z6 = (hashMap.containsKey(str13));
            int i13 = 51588;
            while (true) {
                i13 ^= 51605;
                switch (i13) {
                    case 17:
                        if (!z6) {
                            break;
                        } else {
                            i13 = 51681;
                            continue;
                        }
                    case 54:
                        break;
                    case 87:
                        str7 = str18;
                        break;
                    case 116:
                        str7 = (String) (hashMap.get(str13));
                        int i14 = 51712;
                        while (true) {
                            i14 ^= 51729;
                            switch (i14) {
                                case 17:
                                    i14 = 51743;
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i13 = 51650;
            }
            StringBuilder sb = new StringBuilder();
            (sb.append(m537(this)));
            (sb.append(m571(this)));
            (sb.append(m568(this)));
            (sb.append(m539(this)));
            String str19 = (sb.toString());
            HashMap hashMap2 = new HashMap();
            (hashMap2.put(str17,str3));
            (hashMap2.put(str16,str4));
            (hashMap2.put("type_id",str));
            (hashMap2.put(str11,str2));
            (hashMap2.put(str14,str6));
            (hashMap2.put(str13,str7));
            (hashMap2.put(str15,str5));
            JSONArray jSONArray = (new JSONObject(m555(this, (new JSONObject((C0005.m167(str19, hashMap2, m557(this)).yq())).getString("data")))).getJSONArray("recommend_list"));
            JSONArray jSONArray2 = new JSONArray();
            int i15 = 0;
            while (true) {
                int i16 = i15;
                int i17 = (jSONArray.length());
                int i18 = 51836;
                while (true) {
                    i18 ^= 51853;
                    switch (i18) {
                        case 241:
                            i18 = i16 < i17 ? 52580 : 52549;
                        case 1963:
                        case 1992:
                            JSONObject jSONObject = new JSONObject();
                            int i19 = (Integer.parseInt(str2));
                            int i20 = (jSONArray.length());
                            int i21 = 53758;
                            while (true) {
                                i21 ^= 53775;
                                switch (i21) {
                                    case 1009:
                                        if (i20 != 30) {
                                            break;
                                        } else {
                                            i21 = 54502;
                                            continue;
                                        }
                                    case 1703:
                                        break;
                                    case 1736:
                                        i = i19;
                                        break;
                                    case 1769:
                                        i = i19 + 1;
                                        int i22 = 54533;
                                        while (true) {
                                            i22 ^= 54550;
                                            switch (i22) {
                                                case 19:
                                                    i22 = 54564;
                                                    break;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i21 = 54471;
                            }
                            (jSONObject.put(str11,i19));
                            (jSONObject.put("pagecount",i));
                            (jSONObject.put("limit",30));
                            String str20 = "total";
                            int i23 = 54657;
                            while (true) {
                                i23 ^= 54674;
                                switch (i23) {
                                    case 19:
                                        if (i > 1) {
                                            break;
                                        } else {
                                            i23 = 55401;
                                            continue;
                                        }
                                    case 45:
                                        i2 = i * 30;
                                        break;
                                    case 50:
                                        break;
                                    case 3579:
                                        i2 = (jSONArray2.length());
                                        int i24 = 55432;
                                        while (true) {
                                            i24 ^= 55449;
                                            switch (i24) {
                                                case 17:
                                                    i24 = 55463;
                                                    break;
                                                case 62:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i23 = 54719;
                            }
                            (jSONObject.put(str20,i2));
                            (jSONObject.put("list",jSONArray2));
                            return (jSONObject.toString());
                        case 2025:
                            JSONObject jSONObject2 = (jSONArray.getJSONObject(i16));
                            boolean z7 = C0010.m289((jSONObject2.getString(str12)));
                            int i25 = 52611;
                            while (true) {
                                i25 ^= 52628;
                                switch (i25) {
                                    case 23:
                                        i25 = z7 ? 52704 : 52673;
                                    case 54:
                                    case 85:
                                        JSONObject jSONObject3 = new JSONObject();
                                        (jSONObject3.put(str10,(jSONObject2.getString(str10))));
                                        (jSONObject3.put(str12,(jSONObject2.getString(str12))));
                                        String str21 = (jSONObject2.getString(str9));
                                        boolean z8 = (str21.startsWith("http"));
                                        int i26 = 53510;
                                        while (true) {
                                            i26 ^= 53527;
                                            switch (i26) {
                                                case 17:
                                                    i26 = !z8 ? 53603 : 53572;
                                                case 50:
                                                case 83:
                                                    break;
                                                case 116:
                                                    StringBuilder sb2 = new StringBuilder();
                                                    (sb2.append(m537(this)));
                                                    (sb2.append("/"));
                                                    (sb2.append(str21));
                                                    str21 = (sb2.toString());
                                                    break;
                                            }
                                        }
                                        (jSONObject3.put(str9,str21));
                                        (jSONObject3.put(str8,(jSONObject2.getString(str8))));
                                        (jSONArray2.put(jSONObject3));
                                        break;
                                    case 116:
                                        int i27 = 52735;
                                        while (true) {
                                            i27 ^= 52752;
                                            switch (i27) {
                                                case 14:
                                                    break;
                                                case 1007:
                                                    i27 = 52766;
                                            }
                                        }
                                        break;
                                }
                            }
                            i15 = i16 + 1;
                            int i28 = 53634;
                            while (true) {
                                i28 ^= 53651;
                                switch (i28) {
                                    case 17:
                                        i28 = 53665;
                                    case 50:
                                        break;
                                }
                            }
                            break;
                    }
                }
            }
        } catch (Exception e) {
            (e.printStackTrace());
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 521
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String detailContent(java.util.List<java.lang.String> r42) {
        /*
            Method dump skipped, instructions count: 3488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.detailContent(java.util.List):java.lang.String");
    }

    public String getOcrCode(String str) {
        try {
            String str2 = "https://api.nn.ci/ocr/b64/text";
            Request.Builder builder = new Request.Builder();
            StringBuilder sb = new StringBuilder();
            (sb.append(m537(this)));
            (sb.append(m571(this)));
            (sb.append("verify/create?key="));
            (sb.append(str));
            Response response = m543(m552(m547(0), m567(m549(m577(builder, (sb.toString())), m544(m557(this))))));
            boolean z = (TextUtils.isEmpty(m576(this)));
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
                        return m576(this);
                    case 239:
                        InputStream inputStream = m550(m573(response));
                        byte[] bArr = new byte[1024];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i2 = (inputStream.read(bArr));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = i2 != -1 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        return m546(m573(m543(m552(m547(0), m567(m533(m577(new Request.Builder(), str2), m562(m542("text/plain; charset=utf-8"), C0034.m1790((byteArrayOutputStream.toByteArray()), 0))))))));
                                    case 500:
                                        (byteArrayOutputStream.write(bArr,0,i2));
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = 48674;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            (e.printStackTrace());
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 584
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String homeContent(boolean r40) {
        /*
            Method dump skipped, instructions count: 3632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.homeContent(boolean):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 654
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public void init(android.content.Context r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 3296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.init(android.content.Context, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 643
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x028d -> B:79:0x0216). Please submit an issue!!! */
    public java.lang.String playerContent(java.lang.String r29, java.lang.String r30, java.util.List<java.lang.String> r31) {
        /*
            Method dump skipped, instructions count: 3522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppSx.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        boolean z2 = C0049.m2174(m536(this));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z2) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    try {
                        m572(this);
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
                    } catch (Exception e) {
                        (e.printStackTrace());
                        break;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        return m538(this, str, 1, null, null);
    }
}
