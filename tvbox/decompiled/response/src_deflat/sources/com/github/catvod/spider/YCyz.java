package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class YCyz extends Spider {

    private static String t0 = "";
    private JSONObject i;
    private final Random yq = new Random();
    private String SN = "https://v.xl01.eu.cc/";
    private String N = "v.xl01.eu.cc";
    private String tF = "https://vod.xl01.me/";
    private String zH = "";

    public YCyz() {

        return;
    }

    private String N(String str) {
        HashMap hashMap = new HashMap();
        Response response = m1001(str, m1004(this), hashMap, 5);
        String str2 = "";

        if (!(response == null)) {
            int i2 = m1007(response);
            if (!(i2 != 302)) {
                String str3 = C0039.m1925(hashMap);
                HashMap hashMap2 = m1004(this);
                hashMap2.put("Range","bytes=0-0");
                Response response2 = m1009(str3, hashMap2, 5);
                int i4 = m1007(response2);
                if (i4 == 200) {
                    return str3;
                } else {
                    int i6 = m1007(response2);
                    if (i6 != 206) {
                        return str2;
                    } else {
                        return str3;
                    }
                    return str3;
                }
            }
        }

        if (!(response == null)) {
            int i10 = m1007(response);
            if (!(i10 == 200)) {
                int i12 = m1007(response);
            }
            boolean z = (m1006(response, "Content-Type").contains("video/mp4"));
            if (z) {
                return str;
            }
        }
        return str2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 422
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public static java.lang.Object[] proxyM3u8(java.util.Map<java.lang.String, java.lang.String> r20) {
        /*
        Method dump skipped, instructions count: 1668
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.YCyz.proxyM3u8(java.util.Map):java.lang.Object[]");
    }

    private List tF(kB kBVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = (kBVar.iterator());
        while (true) {
            boolean z = (it.hasNext());

            if (z) {
                hN hNVar = (hN) (it.next());
                Objects.requireNonNull(hNVar);
                String str2 = ((C0000.m12("a[href*=htm]", hNVar).N("href")).substring(1));
                String str3 = (C0000.m12("img[data-src]", hNVar).N("data-src"));
                String str4 = (C0000.m12("div[class=card-info] > h4", hNVar).Fo());
                hN hNVar2 = C0000.m12("div[class=card-meta] > span", hNVar);
                if (hNVar2 != null) {
                    str = (hNVar2.Fo());
                } else {
                    str = "";
                }
                arrayList.add(new ME(str2, str4, str3, str));
            } else {
                return arrayList;
            }
        }
    }

    public static Object[] vod(Map<String, String> map) {
        boolean z = ((String) (map.get("type")).equals("m3u8"));

        if (!z) {
            return null;
        } else {
            return new Object[]{(Integer.valueOf(200)), "application/vnd.apple.mpegurl", new ByteArrayInputStream((m1012().getBytes()))};
        }
    }

    private HashMap<String, String> zH() {
        HashMap<String, String> hashMap = null;
        String str2 = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap<>();
        str3 = "User-Agent";
        str2 = "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36";
        hashMap.put(str3,str2);
        str3 = m1013(this);
        str2 = "Origin";
        hashMap.put(str2,str3);
        return hashMap;
    }

    /* renamed from: ثلصك  reason: contains not printable characters */
    public static Response m1001(Object obj, Object obj2, Object obj3, int i) {

        return C0068Pe.v3((String) obj, (Map) obj2, (Map) obj3, i);
    }

    /* renamed from: خغها  reason: contains not printable characters */
    public static String m1002(Object obj, Object obj2) {
        int i = (-985) ^ C0024.f82;

        return ((YCyz) obj).N((String) obj2);
    }

    /* renamed from: دﻙاخ  reason: contains not printable characters */
    public static void m1003(Object obj) {
        int i = 909 ^ C0002.f2;

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: سخﺫﺽ  reason: contains not printable characters */
    public static HashMap m1004(Object obj) {
        int i = 909 ^ C0002.f2;

        return ((YCyz) obj).zH();
    }

    /* renamed from: طبعﻅ  reason: contains not printable characters */
    public static Random m1005(Object obj) {
        int i = 515 ^ C0028.f86;

        return ((YCyz) obj).yq;
    }

    /* renamed from: طﻩجﺕ  reason: contains not printable characters */
    public static String m1006(Object obj, Object obj2) {
        int i = (-388) ^ C0035.f93;

        return ((Response) obj).header((String) obj2);
    }

    /* renamed from: ظﺥﻁﺏ  reason: contains not printable characters */
    public static int m1007(Object obj) {
        int i = (-26) ^ C0033.f91;

        return ((Response) obj).code();
    }

    /* renamed from: ظﻭعﻝ  reason: contains not printable characters */
    public static String m1008(Object obj) {
        int i = (-985) ^ C0024.f82;

        return ((YCyz) obj).tF;
    }

    /* renamed from: غتهﺝ  reason: contains not printable characters */
    public static Response m1009(Object obj, Object obj2, int i) {
        int i2 = (-404) ^ C0021.f79;

        return C0068Pe.M((String) obj, (Map) obj2, i);
    }

    /* renamed from: غﺕﻕف  reason: contains not printable characters */
    public static InputStream m1010(Object obj) {
        int i = 658 ^ C0029.f87;

        return ((ResponseBody) obj).byteStream();
    }

    /* renamed from: غﺹصم  reason: contains not printable characters */
    public static List m1011(Object obj, Object obj2) {
        int i = (-487) ^ C0053.f111;

        return ((YCyz) obj).tF((kB) obj2);
    }

    /* renamed from: قﺥﻉر  reason: contains not printable characters */
    public static String m1012() {
        int i = 697 ^ C0024.f82;

        return t0;
    }

    /* renamed from: قﺩيـ  reason: contains not printable characters */
    public static String m1013(Object obj) {
        int i = 753 ^ C0000.f0;

        return ((YCyz) obj).N;
    }

    /* renamed from: ﺫﺹظر  reason: contains not printable characters */
    public static JSONObject m1015(Object obj) {
        int i = (-914) ^ C0004.f4;

        return ((YCyz) obj).i;
    }

    /* renamed from: ﺭﺥﺯﻍ  reason: contains not printable characters */
    public static String m1016(Object obj) {
        int i = (-404) ^ C0021.f79;

        return ((YCyz) obj).SN();
    }

    /* renamed from: ﺹفجﺽ  reason: contains not printable characters */
    public static ResponseBody m1017(Object obj) {
        int i = (-487) ^ C0053.f111;

        return ((Response) obj).body();
    }

    /* renamed from: ﻁمﻅن  reason: contains not printable characters */
    public static Response m1018(Object obj, Object obj2) {
        int i = (-314) ^ C0002.f2;

        return C0068Pe.Gc((String) obj, (Map) obj2);
    }

    /* renamed from: ﻕقوص  reason: contains not printable characters */
    public static void m1019(Object obj) {
        int i = (-314) ^ C0002.f2;

        ((Response) obj).close();
        int i4 = (-487) ^ C0053.f111;

        return;
    }

    /* renamed from: ﻩﺕﺥﺝ  reason: contains not printable characters */
    public static String m1020(Object obj, Object obj2, Object obj3) {
        int i = (-556) ^ C0004.f4;

        return ((YCyz) obj).yq((String) obj2, (String) obj3);
    }

    /* renamed from: ﻩﻅبﻉ  reason: contains not printable characters */
    public static String m1021(Object obj) {
        int i = (-675) ^ C0038.f96;

        return ((YCyz) obj).SN;
    }

    /* renamed from: ﻭاشﺝ  reason: contains not printable characters */
    public static String m1022(Object obj) {
        int i = 909 ^ C0002.f2;

        return ((YCyz) obj).zH;
    }

    protected final String SN() {
        this.zH = "";
        String str = C0032.m1739(new StringBuilder(), m1021(this), "zzzzz");
        HashMap hashMap = new HashMap();
        C0004.m141(str, m1004(this), hashMap);
        String str2 = "set-cookie";
        boolean z = (hashMap.containsKey(str2));

        if (z) {
            this.zH = ((String) ((List) (hashMap.get(str2)).get(0)).split(";"))[0];
        }
        return m1022(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 349
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String categoryContent(java.lang.String r14, java.lang.String r15, boolean r16, java.util.HashMap<java.lang.String, java.lang.String> r17) {
        /*
        Method dump skipped, instructions count: 1416
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.YCyz.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 403
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r18) {
        /*
        Method dump skipped, instructions count: 1736
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.YCyz.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        try {
            new JSONObject();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new rP("0", "电影"));
            arrayList.add(new rP("1", "电视剧"));
            arrayList.add(new rP("1#中国大陆", "大陆剧"));
            arrayList.add(new rP("1@gangtaiju", "港台剧"));
            arrayList.add(new rP("1@hanju", "韩剧"));
            arrayList.add(new rP("1@meiju", "美剧"));
            arrayList.add(new rP("1@riju", "日剧"));
            arrayList.add(new rP("1@donghua", "动画"));
            arrayList.add(new rP("1@zongyi", "综艺"));
            m1016(this);
            iX iXVar = new iX();
            iXVar.SN(arrayList);
            iXVar.t0(m1015(this));
            return (iXVar.toString());
        } catch (Exception e) {
            m1003(e);
            return "";
        }
    }

    public void init(Context context) {
        YCyz.super.init(context);
        try {
            this.i = new JSONObject(C0041.m1977());
        } catch (JSONException e) {

        }
        int i2 = (-406) ^ C0053.f111;

        return;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 591
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    @android.annotation.TargetApi(19)
    public java.lang.String playerContent(java.lang.String r32, java.lang.String r33, java.util.List<java.lang.String> r34) {
        /*
        Method dump skipped, instructions count: 3582
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.YCyz.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            StringBuilder sb = new StringBuilder();
            sb.append("http://czzy.xn--m7r412advb92j21st65a.tk/bidisearch.php?wd=");
            sb.append(C0009.m260(str, "UTF-8"));
            String str3 = C0011.m353((sb.toString()), Rc.yq(), 0);
            boolean z2 = (str3.contains("$$$"));
            String str4 = "vod_remarks";
            String str5 = "vod_pic";
            String str6 = "vod_name";
            String str7 = "vod_id";
            String str8 = "\\|";

            if (!z2) {
                String[] strArr3 = (str3.split(str8));
                boolean z4 = C0010.m289(strArr3[1]);
                L239: while (true) {
                    if (!z4) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str7,strArr3[0]);
                        jSONObject3.put(str6,strArr3[1]);
                        jSONObject3.put(str5,strArr3[2]);
                        jSONObject3.put(str4,strArr3[3]);
                        jSONArray.put(jSONObject3);
                        continue L239;
                    } else {
                        return str2;
                    }
                }
            } else {
                String[] strArr = (str3.split("\\$\\$\\$"));
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        String[] strArr2 = (strArr[i2].split(str8));
                        boolean z3 = C0010.m289(strArr2[1]);
                        if (!(z3)) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(str7,strArr2[0]);
                            jSONObject2.put(str6,strArr2[1]);
                            jSONObject2.put(str5,strArr2[2]);
                            jSONObject2.put(str4,strArr2[3]);
                            jSONArray.put(jSONObject2);
                        }
                        i2++;
                    }
                }
                String[] strArr3 = (str3.split(str8));
                boolean z4 = C0010.m289(strArr3[1]);
                L239: while (true) {
                    if (!z4) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str7,strArr3[0]);
                        jSONObject3.put(str6,strArr3[1]);
                        jSONObject3.put(str5,strArr3[2]);
                        jSONObject3.put(str4,strArr3[3]);
                        jSONArray.put(jSONObject3);
                        continue L239;
                    } else {
                        return str2;
                    }
                }
            }
            jSONObject.put("list",jSONArray);
            return (jSONObject.toString());
        } catch (Exception e) {
            m1003(e);
            return str2;
        }
    }

    protected final String yq(String str, String str2) {
        try {
            Cipher cipher = C0029.m1636("AES/ECB/PKCS7Padding");
            cipher.init(1,new SecretKeySpec((str2.getBytes()), "AES"));
            byte[] bArr = (cipher.doFinal((str.getBytes())));
            StringBuilder sb = new StringBuilder();
            int length = bArr.length;
            int i = 0;
            while (true) {

                if (i < length) {
                    String str3 = (Integer.toHexString(bArr[i] & 255));
                    int i3 = (str3.length());
                    if (i3 == 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append('0');
                        sb2.append(str3);
                        str3 = (sb2.toString());
                    }
                    sb.append(str3);
                    i++;
                } else {
                    return ((sb.toString()).toUpperCase());
                }
            }
        } catch (Exception e) {
            m1003(e);
            return null;
        }
    }
}
