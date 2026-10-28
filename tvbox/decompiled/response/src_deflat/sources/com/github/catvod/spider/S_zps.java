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

            if (i < 0) {
                return;
            } else {
                return;
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

            return;
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

        return;
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

        return ((S_zps) obj).g1;
    }

    /* renamed from: زدبش  reason: contains not printable characters */
    public static String m941(Object obj) {
        int i = (-31) ^ C0041.f99;

        return ((S_zps) obj).O;
    }

    /* renamed from: سضغم  reason: contains not printable characters */
    public static HashMap m942(Object obj) {
        int i = (-732) ^ f2;

        if (i > 0) {
            return null;
        } else {
            return ((S_zps) obj).s;
        }
    }

    /* renamed from: شكﺫﻉ  reason: contains not printable characters */
    public static HashMap m943() {
        int i = (-404) ^ C0021.f79;

        return n;
    }

    /* renamed from: ﺡضﻡﻱ  reason: contains not printable characters */
    public static String m945(Object obj) {
        int i = 596 ^ C0009.f9;

        return ((User) obj).getToken();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3 = "";
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            Iterator it = (jSONObject.keys());
            while (true) {
                boolean z2 = (it.hasNext());

                if (z2) {
                    JSONArray jSONArray = (jSONObject.getJSONArray((String) (it.next())));
                    int i2 = 0;
                    while (true) {
                        int i3 = (jSONArray.length());
                        if (i2 < i3) {
                            ME me = new ME();
                            jSONObject = (jSONArray.getJSONObject(i2));
                            String str4 = (jSONObject.getString("note"));
                            String str5 = ((jSONObject.getString("url")).replace("\"",str3));
                            C0056.m2351(true);
                            me.G4("https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://oss4liview.moji.com/thd_file/2025/07/28/a6bdb22cc4b0bfc7b333fec5d027b951.jpg");
                            me.B(str5);
                            me.G(str4);
                            arrayList.add(me);
                            i2++;
                        }
                    }
                } else {
                    iX iXVar = new iX();
                    iXVar.b(arrayList);
                    iXVar.dT(1,1,(arrayList.size()),(arrayList.size()));
                    return (iXVar.toString());
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

            if (!(isEmpty)) {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("siteUrl");
                boolean startsWith = optString.startsWith("http");
                if (startsWith) {
                    this.O = optString;
                }
                String optString2 = jSONObject.optString("searchApi");
                boolean ee = Rc.ee(optString2);
                if (!(ee)) {
                    this.g1 = optString2;
                }
                String optString3 = jSONObject.optString("login");
                boolean ee2 = Rc.ee(optString3);
                if (!(ee2)) {
                    HashMap<String, User> hashMap = n;
                    if (!(hashMap == null)) {
                        boolean containsKey = hashMap.containsKey(optString);
                    }
                    String str3 = optString3.split(str2)[0];
                    String str4 = optString3.split(str2)[1];
                    HashMap<String, User> hashMap2 = new HashMap<>();
                    n = hashMap2;
                    hashMap2.put(optString, new User(this, str3, str4));
                    q();
                }
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
