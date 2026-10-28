package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0009;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.by;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class S_zps extends Pan {
    private static HashMap<String, User> n;

    private String O = "https://so.252035.xyz/";
    private String g1 = "api/search?kw=@";
    private final HashMap<String, String> s = new HashMap<String, String>() { // from class: com.github.catvod.spider.S_zps.1

        /* renamed from: short  reason: not valid java name */
        

        {
            put("quark", "夸父");
            put("baidu", "嘟嘟");
            put("uc", "优汐");
            put("aliyun", "阿狸");
            int i = 802 ^ C0052.f110;
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
                        return;
                    case 239:
                        return;
                }
                i2 = 1678;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class User {
        private String N;
        private String SN;
        private String yq;

        public User(S_zps s_zps, String str, String str2) {
            this.yq = str;
            this.SN = str2;
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

        public String getKey() {
            return this.SN;
        }

        public String getName() {
            return this.yq;
        }

        public String getToken() {
            return this.N;
        }

        public void setToken(String str) {
            this.N = str;
        }
    }

    public S_zps() {
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

    private void q() {
        Object[] objArr = new Object[2];
        JSONObject jSONObject = null;
        String str2 = null;
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        StringBuilder sb2 = null;
        HashMap<String, User> hashMap = null;
        User user = null;
String str5 = null;
                // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = n;
        str3 = this.O;
        user = hashMap.get(str3);
        String name = user.getName();
        objArr[0] = name;
        str3 = name;
        hashMap = n;
        str2 = this.O;
        user = hashMap.get(str2);
        String key = user.getKey();
        objArr[1] = key;
        str2 = key;
        str5 = "{\"username\":\"%s\",\"password\":\"%s\"}";
        str4 = String.format(str5, objArr);
        sb = new StringBuilder();
        str5 = this.O;
        sb2 = sb.append(str5);
        str5 = "api/auth/login";
        sb2 = sb.append(str5);
        str5 = sb.toString();
        jSONObject = new JSONObject(V3.Gc(str5, str4));
        hashMap = n;
        str5 = this.O;
        user = hashMap.get(str5);
        str4 = "Bearer ";
        sb2 = by.yq(str4);
        str5 = jSONObject.getString("token");
        sb = sb2.append(str5);
        str4 = sb2.toString();
        user.setToken(str4);
        return;
}

    /* renamed from: بتﻭﻝ  reason: contains not printable characters */
    public static String m940(Object obj) {
        int i = 215 ^ C0038.f96;
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
                    return ((S_zps) obj).g1;
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

    /* renamed from: زدبش  reason: contains not printable characters */
    public static String m941(Object obj) {
        int i = (-31) ^ C0041.f99;
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
                    return ((S_zps) obj).O;
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

    /* renamed from: سضغم  reason: contains not printable characters */
    public static HashMap m942(Object obj) {
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
                    return ((S_zps) obj).s;
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

    /* renamed from: شكﺫﻉ  reason: contains not printable characters */
    public static HashMap m943() {
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
                    return n;
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

    /* renamed from: ﺡضﻡﻱ  reason: contains not printable characters */
    public static String m945(Object obj) {
        int i = 596 ^ C0009.f9;
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
                    return ((User) obj).getToken();
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
        String str3 = "";
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            Iterator it = (jSONObject.keys());
            while (true) {
                boolean z2 = (it.hasNext());
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                        case 49:
                            i = z2 ? 1709 : 1678;
                        case 204:
                            JSONArray jSONArray = (jSONObject.getJSONArray((String) (it.next())));
                            int i2 = 0;
                            while (true) {
                                int i3 = (jSONArray.length());
                                int i4 = 1740;
                                while (true) {
                                    i4 ^= 1757;
                                    switch (i4) {
                                        case 17:
                                            i4 = i2 < i3 ? 1833 : 1802;
                                        case 54:
                                        case 471:
                                            break;
                                        case 500:
                                            ME me = new ME();
                                            jSONObject = (jSONArray.getJSONObject(i2));
                                            String str4 = (jSONObject.getString("note"));
                                            String str5 = ((jSONObject.getString("url")).replace("\"",str3));
                                            C0056.m2351(true);
                                            (me.G4("https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://oss4liview.moji.com/thd_file/2025/07/28/a6bdb22cc4b0bfc7b333fec5d027b951.jpg"));
                                            (me.B(str5));
                                            (me.G(str4));
                                            (arrayList.add(me));
                                            i2++;
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
                            }
                            break;
                        case 239:
                            iX iXVar = new iX();
                            (iXVar.b(arrayList));
                            (iXVar.dT(1,1,(arrayList.size()),(arrayList.size())));
                            return (iXVar.toString());
                    }
                }
            }
        } catch (Exception e) {
            return str3;
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = null;
        rP rPVar = null;
        JSONObject jSONObject = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        str3 = "1";
        str2 = "🍓本源是网盘搜索源，仅支持搜索";
        rPVar = new rP(str3, str2);
        arrayList2.add(rPVar);
        jSONObject = new JSONObject();
        str3 = iX.Nl(arrayList2, arrayList, jSONObject);
        return str3;
}

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        String str2 = "-";
        try {
            boolean isEmpty = TextUtils.isEmpty(str);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (isEmpty) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString("siteUrl");
                        boolean startsWith = optString.startsWith("http");
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (!startsWith) {
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
                                    this.O = optString;
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        String optString2 = jSONObject.optString("searchApi");
                        boolean ee = Rc.ee(optString2);
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    if (ee) {
                                        break;
                                    } else {
                                        i3 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    break;
                                case 47417:
                                    this.g1 = optString2;
                                    break;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 48705;
                        }
                        String optString3 = jSONObject.optString("login");
                        boolean ee2 = Rc.ee(optString3);
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    HashMap<String, User> hashMap = n;
                                    int i5 = 48891;
                                    while (true) {
                                        i5 ^= 48908;
                                        switch (i5) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                if (hashMap == null) {
                                                    break;
                                                } else {
                                                    i5 = 49635;
                                                    continue;
                                                }
                                            case 32495:
                                                boolean containsKey = hashMap.containsKey(optString);
                                                int i6 = 49666;
                                                while (true) {
                                                    i6 ^= 49683;
                                                    switch (i6) {
                                                        case 17:
                                                            if (containsKey) {
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
                                                        default:
                                                            continue;
                                                    }
                                                    i6 = 49728;
                                                }
                                            default:
                                                continue;
                                        }
                                        i5 = 48953;
                                    }
                                    String str3 = optString3.split(str2)[0];
                                    String str4 = optString3.split(str2)[1];
                                    HashMap<String, User> hashMap2 = new HashMap<>();
                                    n = hashMap2;
                                    hashMap2.put(optString, new User(this, str3, str4));
                                    q();
                                    int i7 = 49790;
                                    while (true) {
                                        i7 ^= 49807;
                                        switch (i7) {
                                            case 18:
                                                break;
                                            case 241:
                                                i7 = 49821;
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    if (ee2) {
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
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            InitOrigin.show("");
        }
        super.init(context, str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 369
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String searchContent(java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.S_zps.searchContent(java.lang.String, boolean):java.lang.String");
    }
}
