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

        return;
    }

    private String N(String str, Map<String, String> map) {
        String str2 = "";
        try {
            MultipartBody.Builder builder = m580(new MultipartBody.Builder(), m581());
            boolean z = (str.contains("top_type"));

            if (!(z)) {
                boolean z2 = (str.contains("tj_vod"));
            }
            m583(builder, str2, str2);
            Iterator it = ((map.entrySet()).iterator());
            while (true) {
                boolean z3 = (it.hasNext());

                if (z3) {
                    Map.Entry entry = (Map.Entry) (it.next());
                    m583(builder, (String) (entry.getKey()), (String) (entry.getValue()));
                } else {
                    Response response = m596(m595(new OkHttpClient(), m592(m586(m599(m589(new Request.Builder(), str), m588(builder)), "User-Agent", m593(this)))));
                    boolean z4 = m579(response);
                    if (z4) {
                        return m594(m598(response));
                    } else {
                        return str2;
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

            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(((jSONObject.optJSONObject(str)).optString(str3)));
                sb.append(str2);
                String str5 = (sb.toString());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("User-Agent",m593(this));
                JSONObject jSONObject2 = new JSONObject(C0028.m1633(str5, linkedHashMap));
                boolean z2 = (jSONObject2.has(str4));
                if (z2) {
                    boolean z3 = (jSONObject2.get(str4)) instanceof JSONObject;
                    if (z3) {
                        jSONObject2 = (jSONObject2.getJSONObject(str4));
                    }
                }
                if (!(jSONObject2 == null)) {
                    int i5 = (jSONObject2.length());
                    if (!(i5 <= 0)) {
                        String str6 = (jSONObject2.optString(str3));
                        boolean z4 = (TextUtils.isEmpty(str6));
                        if (!(z4)) {
                            boolean z5 = (str6.equals("null"));
                            if (!(z5)) {
                                jSONObject2.put("danmaku",C0033.m1778(str6));
                                return jSONObject2;
                            }
                        }
                    }
                }
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
        sb.append(str3);
        sb.append(str);
        str3 = (sb.toString());
        str = C0023.m1463(str3);
        return str;
    }

    /* renamed from: تﻩهو  reason: contains not printable characters */
    public static boolean m579(Object obj) {

        return ((Response) obj).isSuccessful();
    }

    /* renamed from: حقوﺏ  reason: contains not printable characters */
    public static MultipartBody.Builder m580(Object obj, Object obj2) {
        int i = 697 ^ C0024.f82;

        return ((MultipartBody.Builder) obj).setType((MediaType) obj2);
    }

    /* renamed from: حﻁزف  reason: contains not printable characters */
    public static MediaType m581() {
        int i = (-404) ^ C0021.f79;

        return MultipartBody.FORM;
    }

    /* renamed from: دﺏذﻕ  reason: contains not printable characters */
    public static String m582(Object obj, Object obj2, Object obj3) {
        int i = (-477) ^ C0042.f100;

        return ((AppTT) obj).N((String) obj2, (Map) obj3);
    }

    /* renamed from: دﺭﺯح  reason: contains not printable characters */
    public static MultipartBody.Builder m583(Object obj, Object obj2, Object obj3) {
        int i = 753 ^ C0000.f0;

        return ((MultipartBody.Builder) obj).addFormDataPart((String) obj2, (String) obj3);
    }

    /* renamed from: سﺭﺡﻭ  reason: contains not printable characters */
    public static JSONObject m584(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = (-732) ^ f2;

        if (i > 0) {
            return null;
        } else {
            return ((AppTT) obj).SN((String) obj2, (String) obj3, (JSONObject) obj4);
        }
    }

    /* renamed from: سﺵﺫل  reason: contains not printable characters */
    public static String m585(Object obj) {
        int i = (-768) ^ C0002.f2;

        return ((AppTT) obj).tF;
    }

    /* renamed from: صﺯﺩي  reason: contains not printable characters */
    public static Request.Builder m586(Object obj, Object obj2, Object obj3) {
        int i = (-604) ^ C0013.f13;

        return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
    }

    /* renamed from: صﻡﻕن  reason: contains not printable characters */
    public static JSONObject m587(Object obj) {
        int i = (-448) ^ C0025.f83;

        return ((AppTT) obj).N;
    }

    /* renamed from: ظقﺙﺡ  reason: contains not printable characters */
    public static MultipartBody m588(Object obj) {
        int i = (-985) ^ C0024.f82;

        return ((MultipartBody.Builder) obj).build();
    }

    /* renamed from: غﺩمﺭ  reason: contains not printable characters */
    public static Request.Builder m589(Object obj, Object obj2) {
        int i = (-732) ^ f2;

        if (i > 0) {
            return null;
        } else {
            return ((Request.Builder) obj).url((String) obj2);
        }
    }

    /* renamed from: نثرﻭ  reason: contains not printable characters */
    public static void m590(Object obj) {
        int i = (-404) ^ C0021.f79;

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: وﺫاﺩ  reason: contains not printable characters */
    public static String m591(Object obj) {
        int i = 812 ^ C0022.f80;

        return ((AppTT) obj).yq;
    }

    /* renamed from: ﺕظجﻩ  reason: contains not printable characters */
    public static Request m592(Object obj) {
        int i = 923 ^ C0041.f99;

        return ((Request.Builder) obj).build();
    }

    /* renamed from: ﺙﺹرﻍ  reason: contains not printable characters */
    public static String m593(Object obj) {
        int i = 125 ^ C0037.f95;

        return ((AppTT) obj).SN;
    }

    /* renamed from: ﺩذحﺽ  reason: contains not printable characters */
    public static String m594(Object obj) {
        int i = (-767) ^ C0037.f95;

        return ((ResponseBody) obj).string();
    }

    /* renamed from: ﺱمـﻅ  reason: contains not printable characters */
    public static Call m595(Object obj, Object obj2) {
        int i = (-185) ^ C0033.f91;

        return ((OkHttpClient) obj).newCall((Request) obj2);
    }

    /* renamed from: ﻁزسج  reason: contains not printable characters */
    public static Response m596(Object obj) {
        int i = 930 ^ C0038.f96;

        return ((Call) obj).execute();
    }

    /* renamed from: ﻅﺽﺹﺵ  reason: contains not printable characters */
    public static String m597(Object obj, Object obj2) {
        int i = 515 ^ C0028.f86;

        return ((AppTT) obj).yq((String) obj2);
    }

    /* renamed from: ﻙذﻅب  reason: contains not printable characters */
    public static ResponseBody m598(Object obj) {
        int i = (-477) ^ C0042.f100;

        return ((Response) obj).body();
    }

    /* renamed from: ﻙمﺱﻩ  reason: contains not printable characters */
    public static Request.Builder m599(Object obj, Object obj2) {
        int i = (-185) ^ C0033.f91;

        return ((Request.Builder) obj).post((RequestBody) obj2);
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
            linkedHashMap.put("sign",str12);
            linkedHashMap.put("timestamp",str11);
            linkedHashMap.put(str9,"12");
            linkedHashMap.put("type_id",str);
            linkedHashMap.put(str8,str2);
            StringBuilder sb = new StringBuilder();
            sb.append(m591(this));
            sb.append("/v3/home/type_search");
            JSONArray jSONArray = ((new JSONObject(m582(this, (sb.toString()), linkedHashMap)).getJSONObject("data")).getJSONArray(str7));
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                int i2 = (jSONArray.length());

                if (i < i2) {
                    JSONObject jSONObject = (jSONArray.getJSONObject(i));
                    JSONObject jSONObject2 = new JSONObject();
                    boolean z2 = (TextUtils.isEmpty((jSONObject.optString(str10))));
                    if (z2) {
                        str3 = (jSONObject.optString("vod_pic_thumb"));
                    } else {
                        str3 = (jSONObject.optString(str10));
                    }
                    jSONObject2.put(str6,(String.valueOf((jSONObject.getInt(str6)))));
                    jSONObject2.put(str5,(jSONObject.getString(str5)));
                    jSONObject2.put(str10,str3);
                    jSONObject2.put(str4,(jSONObject.getString(str4)));
                    jSONArray2.put(jSONObject2);
                    i++;
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(str8,(Integer.parseInt(str2)));
                    jSONObject3.put("pagecount",999);
                    jSONObject3.put(str9,20);
                    jSONObject3.put("total",Integer.MAX_VALUE);
                    jSONObject3.put(str7,jSONArray2);
                    return (jSONObject3.toString());
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
            linkedHashMap.put("sign",str13);
            linkedHashMap.put("timestamp",str12);
            linkedHashMap.put(str9,(String) (list.get(0)));
            StringBuilder sb = new StringBuilder();
            sb.append(m591(this));
            sb.append("/v3/home/vod_details");
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

                        break;
                        case 239:
                        str = (jSONObject2.optString(str10));
                        break;
                    }
                    i = 1678;
                } catch (Exception e2) {
                    e = e2;

                    m590(e);
                    return str11;
                }
            }
            jSONObject3.put(str9,(list.get(0)));
            jSONObject3.put(str7,(jSONObject2.getString(str7)));
            jSONObject3.put(str10,str);
            jSONObject3.put(str6,(jSONObject2.getString(str6)));
            jSONObject3.put(str5,(jSONObject2.getString(str5)));
            jSONObject3.put(str4,(jSONObject2.getString(str4)));
            jSONObject3.put(str3,(jSONObject2.getString(str3)));
            jSONObject3.put(str2,(jSONObject2.getString(str2)));
            jSONObject3.put(str8,C0050.m2203(str14));
            JSONArray jSONArray2 = (jSONObject2.getJSONArray("vod_play_list"));
            int i4 = 0;
            while (true) {
                int i5 = (jSONArray2.length());

                if (i4 < i5) {
                    JSONObject jSONObject4 = (jSONArray2.getJSONObject(i4));
                    String str17 = (jSONObject4.getString("flag"));
                    JSONArray jSONArray3 = (jSONObject4.optJSONArray("parse_urls"));
                    String str18 = "url";
                    if (jSONArray3 != null) {
                        int i10 = (jSONArray3.length());
                        if (i10 > 0) {
                            int i12 = 0;
                            while (true) {
                                int i13 = (jSONArray3.length());
                                if (i12 < i13) {
                                    String str19 = ((jSONArray3.getString(i12)).trim());
                                    boolean z4 = (TextUtils.isEmpty(str19));
                                    if (!z4) {
                                        boolean z5 = (str19.equals("null"));
                                        if (!z5) {
                                            boolean z6 = (m587(this).has(str17));
                                            if (!z6) {
                                                m587(this).put(str17,(new JSONObject().put(str18,str19)));
                                            }
                                        }
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    JSONArray jSONArray4 = (jSONObject4.getJSONArray("urls"));
                    StringBuilder sb2 = new StringBuilder();
                    int i19 = 0;
                    while (true) {
                        int i20 = (jSONArray4.length());
                        if (i19 < i20) {
                            JSONObject jSONObject5 = (jSONArray4.getJSONObject(i19));
                            String str20 = (jSONObject5.getString("name"));
                            String str21 = (jSONObject5.getString(str18));
                            sb2.append(str20);
                            sb2.append("$");
                            sb2.append(str21);
                            sb2.append("#");
                            i19++;
                        } else {
                            int i22 = (sb2.length());
                            if (i22 > 0) {
                                sb2.deleteCharAt((sb2.length()) - 1);
                            }
                            arrayList2.add(str17);
                            arrayList.add((sb2.toString()));
                            i4++;
                        }
                    }
                } else {
                    boolean z2 = (arrayList2.isEmpty());
                    if (!(z2)) {
                        this.tF = (String) (arrayList2.get(0));
                        String str15 = "vod_play_from";
                        boolean z3 = cn.yq;
                        String str16 = "$$$";
                        if (!(z3)) {
                            arrayList2.set(0,cn.tF);
                        }
                        jSONObject3.put(str15,(TextUtils.join(str16,arrayList2)));
                        jSONObject3.put("vod_play_url",(TextUtils.join(str16,arrayList)));
                    }
                    jSONArray.put(jSONObject3);
                    jSONObject.put("list",jSONArray);
                    return (jSONObject.toString());
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
            linkedHashMap.put("sign",str4);
            linkedHashMap.put("timestamp",str3);
            StringBuilder sb = new StringBuilder();
            sb.append(m591(this));
            sb.append("/v3/type/top_type");
            JSONArray jSONArray2 = ((new JSONObject(m582(this, (sb.toString()), linkedHashMap)).getJSONObject("data")).getJSONArray("list"));
            int i = 0;
            while (true) {
                int i2 = (jSONArray2.length());

                if (i < i2) {
                    JSONObject jSONObject2 = (jSONArray2.getJSONObject(i));
                    String str5 = (jSONObject2.optString(str2));
                    String str6 = (String.valueOf((jSONObject2.optInt(str))));
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(str2,str5);
                    jSONObject3.put(str,str6);
                    jSONArray.put(jSONObject3);
                    i++;
                } else {
                    jSONObject.put("class",jSONArray);
                    return (jSONObject.toString());
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
            linkedHashMap.put("sign",str7);
            linkedHashMap.put("timestamp",str6);
            StringBuilder sb = new StringBuilder();
            sb.append(m591(this));
            sb.append("/v3/type/tj_vod");
            JSONArray jSONArray = ((new JSONObject(m582(this, (sb.toString()), linkedHashMap)).getJSONObject("data")).getJSONArray("type_vod"));
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                int i2 = (jSONArray.length());

                if (i < i2) {
                    JSONArray jSONArray3 = ((jSONArray.getJSONObject(i)).getJSONArray("vod"));
                    int i4 = 0;
                    while (true) {
                        int i5 = (jSONArray3.length());
                        if (i4 < i5) {
                            JSONObject jSONObject2 = (jSONArray3.getJSONObject(i4));
                            JSONObject jSONObject3 = new JSONObject();
                            boolean z = (TextUtils.isEmpty((jSONObject2.optString(str5))));
                            if (z) {
                                str = (jSONObject2.optString("vod_pic_thumb"));
                            } else {
                                str = (jSONObject2.optString(str5));
                            }
                            jSONObject3.put(str4,(String.valueOf((jSONObject2.optInt(str4)))));
                            jSONObject3.put(str3,(jSONObject2.optString(str3)));
                            jSONObject3.put(str5,str);
                            jSONObject3.put(str2,(jSONObject2.optString(str2)));
                            jSONArray2.put(jSONObject3);
                            i4++;
                        } else {
                            i++;
                        }
                    }
                } else {
                    jSONObject.put("list",jSONArray2);
                    return (jSONObject.toString());
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
        int i2 = (-26) ^ C0033.f91;
        return;
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0029.m1662();
        C0056.m2351(true);
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z = C0042.m2005(str2);

            if (!z) {
                JSONObject jSONObject2 = m587(this);
                if (!(jSONObject2 == null)) {
                    int i5 = (jSONObject2.length());
                    if (!(i5 <= 0)) {
                        boolean z3 = (m587(this).has(str));
                        if (!(z3)) {
                            str = m585(this);
                        }
                        jSONObject = m584(this, str, str2, m587(this));
                    }
                }
            } else {
                boolean z2 = (str2.contains("m3u8"));
                if (z2) {
                    str2 = C0009.m279(str2);
                }
                jSONObject.put("parse",0);
                jSONObject.put("playUrl","");
                jSONObject.put("url",str2);
                jSONObject.put("danmaku",C0033.m1778(str2));
                JSONObject jSONObject2 = m587(this);
                if (!(jSONObject2 == null)) {
                    int i5 = (jSONObject2.length());
                    if (!(i5 <= 0)) {
                        boolean z3 = (m587(this).has(str));
                        if (!(z3)) {
                            str = m585(this);
                        }
                        jSONObject = m584(this, str, str2, m587(this));
                    }
                }
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
            linkedHashMap.put("sign",str9);
            linkedHashMap.put("timestamp",str8);
            linkedHashMap.put("keyword",str);
            StringBuilder sb = new StringBuilder();
            sb.append(m591(this));
            sb.append("/v3/home/search");
            JSONArray jSONArray = ((new JSONObject(m582(this, (sb.toString()), linkedHashMap)).getJSONObject("data")).getJSONArray(str6));
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                int i2 = i;
                int i3 = (jSONArray.length());

                if (i2 < i3) {
                    JSONObject jSONObject2 = (jSONArray.getJSONObject(i2));
                    JSONObject jSONObject3 = new JSONObject();
                    String str10 = (jSONObject2.getString(str5));
                    boolean z2 = (TextUtils.isEmpty((jSONObject2.optString(str7))));
                    if (z2) {
                        str2 = (jSONObject2.optString("vod_pic_thumb"));
                    } else {
                        str2 = (jSONObject2.optString(str7));
                    }
                    boolean z3 = (str10.contains(str));
                    if (z3) {
                        jSONObject3.put(str4,(String.valueOf((jSONObject2.getInt(str4)))));
                        jSONObject3.put(str5,str10);
                        jSONObject3.put(str7,str2);
                        jSONObject3.put(str3,(jSONObject2.getString(str3)));
                        jSONArray2.put(jSONObject3);
                    }
                    i = i2 + 1;
                } else {
                    jSONObject.put(str6,jSONArray2);
                    return (jSONObject.toString());
                }
            }
        } catch (Exception e) {
            m590(e);
            return "";
        }
    }
}
