package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.Editable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0012;
import com.github.catvod.spider.Alllive;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.DialogInterface$OnClickListenerC0112h;
import com.github.catvod.spider.merge.DialogInterface$OnDismissListenerC0194v3;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.Fz;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Nl;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.p9;
import com.github.catvod.spider.merge.rP;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Alllive extends Spider {

    private static String t0;
    private String N;
    private String SN;
    private AlertDialog i;
    private boolean tF;
    private String yq;
    private boolean zH;

    public Alllive() {
        String str = "";
        this.yq = str;
        this.N = str;

        return;
    }

    private String Gc(String str) {
        boolean z = (Objects.equals(str,"huya"));

        if (!z) {
            boolean z2 = (Objects.equals(str,"douyu"));
            if (!z2) {
                boolean z3 = (Objects.equals(str,"douyin"));
                if (!z3) {
                    boolean z4 = (Objects.equals(str,"bilibili"));
                    if (!z4) {
                        boolean z5 = (Objects.equals(str,"cc"));
                        if (!z5) {
                            return "";
                        } else {
                            String str3 = "网易CC";
                            return str3;
                        }
                    } else {
                        String str4 = "哔哩哔哩";
                        return str4;
                    }
                } else {
                    String str5 = "抖音";
                    return str5;
                }
            } else {
                String str6 = "斗鱼";
                return str6;
            }
        } else {
            String str2 = "虎牙";
            return str2;
        }
    }

    private JSONObject M(String str) {
        HashMap hashMap = null;
        JSONObject jSONObject = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap();
        str5 = "sec-fetch-site";
        str4 = "same-origin";
        hashMap.put(str5,str4);
        str5 = C0028.m1633(str, hashMap);
        str4 = " ";
        str = "";
        str3 = (str5.replaceAll(str4,str));
        str5 = C0037.m1869(str3);
        jSONObject = new JSONObject(str5);
        return jSONObject;
    }

    public static /* synthetic */ void N(Alllive alllive) {
        boolean z = m474(alllive);

        if (!(z)) {
            alllive.tF = false;
        }
        alllive.zH = false;
    }

    public static void SN(Alllive alllive) {
        Nl nl = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        alllive.zH = true;
        m463(alllive);
        nl = new Nl(alllive, 3);
        C0057.m2371(nl);
        return;
    }

    public static Object[] proxyInput(Map<String, String> map) {
        String str = "type";
        boolean z = ((String) (map.get(str)).equals("html"));
        String str2 = "text/html";
        Integer num = (Integer.valueOf(200));

        if (!z) {
            boolean z2 = ((String) (map.get(str)).equals("text"));
            if (z2) {
                String str4 = (C0055.m2312((String) (map.get("推送"))).replace(" ","+"));
                boolean z3 = (TextUtils.isEmpty(str4));
                if (!(z3)) {
                    t0 = str4;
                    return new Object[]{num, str2, new ByteArrayInputStream(new byte[0])};
                }
            }
            return null;
        } else {
            String str3 = ProxyOrigin.getInternalIP();
            StringBuilder sb = new StringBuilder();
            sb.append((Math.random()));
            sb.append(str3);
            sb.append(":9978/proxy?do=input&csp=Alllive&type=text&推送=' + encodeURIComponent(pushUrl);\n\n      var xhr = new XMLHttpRequest();\n      xhr.open('GET', apiUrl, true);\n      xhr.onreadystatechange = function () {\n        if (xhr.readyState === XMLHttpRequest.DONE) {\n          if (xhr.status === 200) {\n            console.log('请求成功');\n          } else {\n            console.log('请求失败');\n          }\n        }\n      };\n      xhr.send();\n    }\n  </script>\n</body>\n\n</html>\n");
            return new Object[]{num, str2, new ByteArrayInputStream(((sb.toString()).getBytes()))};
        }
    }

    private void t0() {
        try {
            AlertDialog alertDialog = m472(this);

            if (!(alertDialog == null)) {
                alertDialog.dismiss();
            }
        } catch (Exception e) {

        }
        int i3 = 812 ^ C0022.f80;

        return;
    }

    public static void tF(Alllive alllive) {
        Objects.requireNonNull(alllive);
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(C0038.m1895(16),C0038.m1895(16),C0038.m1895(16),C0038.m1895(16));
            FrameLayout frameLayout = new FrameLayout(InitOrigin.context());
            final EditText editText = new EditText(InitOrigin.context());
            frameLayout.addView(editText,layoutParams);
            AlertDialog alertDialog = ((((((new AlertDialog.Builder(InitOrigin.getActivity()).setTitle("请输入搜索关键词")).setView(frameLayout)).setNeutralButton("TV端点击这，微信扫码搜索",new DialogInterface$OnClickListenerC0112h(alllive, 0))).setNegativeButton("取消",null)).setPositiveButton("搜索",new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.OT
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Alllive.yq(Alllive.this, editText);
                            }
                })).show());
            alllive.i = alertDialog;
            alertDialog.setOnDismissListener(new DialogInterface$OnDismissListenerC0194v3(alllive, 1));
        } catch (Exception e) {

        }

        return;
    }

    public static void yq(Alllive alllive, EditText editText) {
        Editable editable = null;
        String str2 = null;
        Fz fz = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        Objects.requireNonNull(alllive);
        editable = (editText.getText());
        str2 = C0050.m2227(editable);
        m463(alllive);
        fz = new Fz(str2, 1);
        C0038.m1909(fz);
        return;
    }

    public static /* synthetic */ void zH(String str) {
        boolean z = C0020.m1370(str);

        if (z) {
            return;
        } else {
            t0 = str;
            return;
        }
    }

    /* renamed from: بمحت */
    public static void m463(Object obj) {
        int i = 658 ^ C0029.f87;

        ((Alllive) obj).t0();
        int i4 = (-556) ^ C0004.f4;

        return;
    }

    /* renamed from: دﺎﻁغ */
    public static JsonObject m464(Object obj) {
        int i = 658 ^ C0029.f87;

        return FO.v((String) obj);
    }

    /* renamed from: زﺙﺏط */
    public static String m465(Object obj) {
        int i = (-185) ^ C0033.f91;

        return ((Alllive) obj).N;
    }

    /* renamed from: سلعخ */
    public static boolean m466(Object obj) {
        int i = (-1021) ^ C0026.f84;

        return ((Alllive) obj).tF;
    }

    /* renamed from: شظذﺵ */
    public static JSONObject m467(Object obj, Object obj2) {
        int i = 923 ^ C0041.f99;

        return ((Alllive) obj).M((String) obj2);
    }

    /* renamed from: لﻍﻡط */
    public static JsonElement m468(Object obj, Object obj2) {
        int i = (-767) ^ C0037.f95;

        return ((JsonObject) obj).get((String) obj2);
    }

    /* renamed from: يﺡﺏل */
    public static String m469(Object obj) {
        int i = 125 ^ C0037.f95;

        return ((JsonElement) obj).getAsString();
    }

    /* renamed from: ﺕﺯرﺫ */
    public static String m471() {
        int i = 938 ^ C0033.f91;

        return t0;
    }

    /* renamed from: ﺙلﻕﺽ */
    public static AlertDialog m472(Object obj) {
        int i = (-422) ^ C0033.f91;

        return ((Alllive) obj).i;
    }

    /* renamed from: ﺡظحج */
    public static String m473(Object obj) {
        int i = 923 ^ C0041.f99;

        return ((Alllive) obj).SN;
    }

    /* renamed from: ﺯجﻁﻉ */
    public static boolean m474(Object obj) {
        int i = (-31) ^ C0006.f6;

        return ((Alllive) obj).zH;
    }

    /* renamed from: ﺯسصو */
    public static String m475(Object obj, Object obj2) {
        int i = 57 ^ C0032.f90;

        return ((Alllive) obj).Gc((String) obj2);
    }

    /* renamed from: ﺵذيﺡ */
    public static String m476(Object obj) {
        int i = 624 ^ C0012.f12;

        return ((Alllive) obj).yq;
    }

    /* renamed from: ﻭﺎﺱﺭ */
    public static JsonObject m477(Object obj, Object obj2) {
        int i = 753 ^ C0000.f0;

        return ((JsonObject) obj).getAsJsonObject((String) obj2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 396
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public java.lang.String categoryContent(java.lang.String r27, java.lang.String r28, boolean r29, java.util.HashMap<java.lang.String, java.lang.String> r30) {
        /*
        Method dump skipped, instructions count: 2454
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Alllive.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        String str;
        String str2 = "_";
        String[] strArr = ((String) (list.get(0)).split(str2));
        StringBuilder sb = new StringBuilder();
        sb.append(m476(this));
        sb.append("/api/");
        sb.append(strArr[0]);
        sb.append("/getRoomDetail?id=");
        sb.append(strArr[1]);
        JSONObject jSONObject = (m467(this, (sb.toString())).optJSONObject("data"));
        ME me = new ME();
        me.B((jSONObject.optString("roomId")));
        me.G((jSONObject.optString("title")));
        me.M((jSONObject.optString("online")));
        me.q((jSONObject.optString("siteId")));
        me.Gc((jSONObject.optString("nickname")));
        me.G4((jSONObject.optString("cover")));
        String str3 = "url";
        me.KJ((jSONObject.optString(str3)));
        me.t0((jSONObject.optString("category")));
        JSONObject jSONObject2 = (jSONObject.optJSONObject("info"));
        String str4 = "name";

        if (jSONObject2 == null) {
            str = "";
        } else {
            StringBuilder sb2 = C0052.m2253("&");
            String str5 = (jSONObject2.optString(str4));
            String str6 = (jSONObject2.optString("code"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://www.huya.com?");
            sb3.append(str6);
            Uri uri = C0034.m1791((sb3.toString()));
            long j = System.currentTimeMillis();
            String str7 = (Long.toHexString((j / 1000) + 21600));
            String str8 = (String.valueOf((j * 1000) + (Long.parseLong(m465(this)))));
            String str9 = (new String(C0022.m1420((uri.getQueryParameter("fm")), 0)).split(str2))[0];
            String str10 = (uri.getQueryParameter("ctype"));
            String str11 = "huya_live";
            boolean z = (str11.equals(str10));
            if (z) {
                str11 = str10;
            } else {
                str11 = str10;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str8);
            String str12 = "|";
            sb4.append(str12);
            sb4.append(str11);
            sb4.append(str12);
            sb4.append(str11);
            String str13 = C0023.m1463((sb4.toString()));
            StringBuilder sb5 = C0037.m1877(str9, str2);
            sb5.append(m465(this));
            sb5.append(str2);
            sb5.append(str5);
            sb5.append(str2);
            sb5.append(str13);
            sb5.append(str2);
            sb5.append(str7);
            sb2.append((String.format("wsSecret=%s&wsTime=%s&seqid=%s&ctype=%s&ver=1&fs=%s&t=%s&u=%s",new Object[]{C0023.m1463((sb5.toString())), str7, str8, str11, (uri.getQueryParameter("fs")), str11, m465(this)})));
            str = (sb2.toString());
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            String str14 = "stream";
            int i6 = ((jSONObject.optJSONArray(str14)).length());

            if (i5 < i6) {
                JSONObject jSONObject3 = ((jSONObject.optJSONArray(str14)).optJSONObject(i5));
                arrayList.add((jSONObject3.optString(str4)));
                ArrayList arrayList3 = new ArrayList();
                int i8 = 0;
                while (true) {
                    String str16 = "lines";
                    int i9 = ((jSONObject3.optJSONArray(str16)).length());
                    if (i8 < i9) {
                        JSONObject jSONObject4 = ((jSONObject3.optJSONArray(str16)).optJSONObject(i8));
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append((jSONObject4.optString(str3)));
                        sb6.append(str);
                        String str17 = (sb6.toString());
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append((jSONObject4.optString(str4)));
                        sb7.append("$");
                        sb7.append(str17);
                        arrayList3.add((sb7.toString()));
                        i8++;
                    } else {
                        arrayList2.add((TextUtils.join("#",arrayList3)));
                        i4 = i5 + 1;
                    }
                }
            } else {
                String str15 = "$$$";
                me.dT((TextUtils.join(str15,arrayList)));
                me.F5((TextUtils.join(str15,arrayList2)));
                return C0000.m21(me);
            }
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = null;
        LinkedHashMap linkedHashMap = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        p9.yq yqVar = null;
        p9 p9Var = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        arrayList = new ArrayList();
        linkedHashMap = new LinkedHashMap();
        str = "huya";
        str2 = "虎牙";
        arrayList.add(new rP(str, str2));
        str2 = "douyu";
        str3 = "斗鱼";
        arrayList.add(new rP(str2, str3));
        str3 = "bilibili";
        str4 = "哔哩";
        arrayList.add(new rP(str3, str4));
        str3 = "sou";
        str4 = "🔍搜索";
        arrayList.add(new rP(str3, str4));
        arrayList2 = new ArrayList();
        arrayList3 = new ArrayList();
        str3 = "网游";
        str4 = "1";
        yqVar = new p9.yq(str3, str4);
        arrayList3.add(yqVar);
        str3 = "手游";
        str4 = "3";
        yqVar = new p9.yq(str3, str4);
        arrayList3.add(yqVar);
        str3 = "娱乐";
        str4 = "8";
        yqVar = new p9.yq(str3, str4);
        arrayList3.add(yqVar);
        str3 = "单机";
        str4 = "2";
        yqVar = new p9.yq(str3, str4);
        arrayList3.add(yqVar);
        str3 = "type";
        str4 = "分类";
        p9Var = new p9(str3, str4, arrayList3);
        arrayList2.add(p9Var);
        linkedHashMap.put(str,arrayList2);
        arrayList3 = new ArrayList();
        arrayList2 = new ArrayList();
        str = "网游竞技";
        yqVar = new p9.yq(str, "PCgame");
        arrayList2.add(yqVar);
        str = "单机热游";
        yqVar = new p9.yq(str, "djry");
        arrayList2.add(yqVar);
        str = "手游休闲";
        yqVar = new p9.yq(str, "syxx");
        arrayList2.add(yqVar);
        str = "娱乐天地";
        yqVar = new p9.yq(str, "yl");
        arrayList2.add(yqVar);
        str = "颜值";
        yqVar = new p9.yq(str, "yz");
        arrayList2.add(yqVar);
        str = "科技文化";
        yqVar = new p9.yq(str, "kjwh");
        arrayList2.add(yqVar);
        str = "语言互动";
        yqVar = new p9.yq(str, "yp");
        arrayList2.add(yqVar);
        p9Var = new p9(str3, str4, arrayList2);
        arrayList3.add(p9Var);
        linkedHashMap.put(str2,arrayList3);
        return C0049.m2178(arrayList, linkedHashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:2|(5:3|4|5|27|25)|18|9|10|(3:11|12|31)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    r0 = "";
    */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.content.Context r7, java.lang.String r8) {
        /*
        r6 = this;
        boolean r1 = (TextUtils.isEmpty(r8))
        r0 = 1616(0x650, float:2.264E-42)
    L6:
        r0 = r0 ^ 1633(0x661, float:2.288E-42)
        switch(r0) {
            case 14: goto Lc;
            case 49: goto Lf;
            case 204: goto L14;
            case 239: goto L1a;
            default: goto Lb;
        }
    Lb:
        goto L6
    Lc:
        r0 = 1678(0x68e, float:2.351E-42)
        goto L6
    Lf:
        if (r1 != 0) goto Lc
        r0 = 1709(0x6ad, float:2.395E-42)
        goto L6
    L14:
        java.lang.String r0 = com.github.catvod.spider.C0049.m2191(r8)
        r6.yq = r0
    L1a:
        short[] r0 = m470()     // Catch: java.lang.Exception -> L78
        r1 = 1486(0x5ce, float:2.082E-42)
        r2 = 42
        r3 = 1220(0x4c4, float:1.71E-42)
        java.lang.String r0 = com.github.catvod.parser.C0012.m361(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L78
        java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L78
        r1.<init>()     // Catch: java.lang.Exception -> L78
        short[] r2 = m470()     // Catch: java.lang.Exception -> L78
        r3 = 1528(0x5f8, float:2.141E-42)
        r4 = 64
        r5 = 1548(0x60c, float:2.169E-42)
        java.lang.String r2 = com.github.catvod.parser.C0009.m277(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L78
        com.github.catvod.spider.merge.w2 r0 = com.github.catvod.spider.C0042.m2006(r0, r2, r1)     // Catch: java.lang.Exception -> L78
        java.lang.String r0 = (r0.yq())     // Catch: java.lang.Exception -> L78
        com.google.gson.JsonObject r0 = m464(r0)     // Catch: java.lang.Exception -> L78
        short[] r1 = m470()     // Catch: java.lang.Exception -> L78
        r2 = 1592(0x638, float:2.231E-42)
        r3 = 4
        r4 = 2775(0xad7, float:3.889E-42)
        java.lang.String r1 = com.github.catvod.spider.merge.C0035.m1833(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L78
        com.google.gson.JsonObject r0 = m477(r0, r1)     // Catch: java.lang.Exception -> L78
        short[] r1 = m470()     // Catch: java.lang.Exception -> L78
        r2 = 1596(0x63c, float:2.236E-42)
        r3 = 3
        r4 = 574(0x23e, float:8.04E-43)
        java.lang.String r1 = com.github.catvod.spider.C0044.m2052(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L78
        com.google.gson.JsonElement r0 = m468(r0, r1)     // Catch: java.lang.Exception -> L78
        java.lang.String r0 = m469(r0)     // Catch: java.lang.Exception -> L78
        r1 = 1740(0x6cc, float:2.438E-42)
    L6f:
        r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
        switch(r1) {
            case 17: goto L75;
            case 54: goto L7d;
            default: goto L74;
        }
    L74:
        goto L6f
    L75:
        r1 = 1771(0x6eb, float:2.482E-42)
        goto L6f
    L78:
        r0 = move-exception
        java.lang.String r0 = ""
    L7d:
        r6.N = r0
        return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Alllive.init(android.content.Context, java.lang.String):void");
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0056.m2351(true);
        boolean z = (str2.startsWith("http"));

        if (!(z)) {
            str2 = C0022.m1434("https:", str2);
        }
        iX iXVar = new iX();
        iXVar.s(str2,false);
        return (iXVar.toString());
    }

    public void showInputQRCode() {
        int i = 1616;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(ProxyOrigin.getInternalIP());
            sb.append(":9978/proxy?do=input&csp=Alllive&type=html");
            String str = (sb.toString());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C0038.m1895(200), C0038.m1895(200));
            ImageView imageView = new ImageView(InitOrigin.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0032.m1731(str, 200, 2));
            FrameLayout frameLayout = new FrameLayout(InitOrigin.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView,layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C0038.m1895(500), C0038.m1895(50));
            layoutParams2.topMargin = C0038.m1895(240);
            layoutParams2.gravity = 1;
            TextView textView = new TextView(InitOrigin.context());
            textView.setText("使用微信扫码推送到TV端搜索");
            textView.setTextColor(-1);
            textView.setGravity(17);
            frameLayout.addView(textView,layoutParams2);
            AlertDialog alertDialog = ((new AlertDialog.Builder(InitOrigin.getActivity()).setView(frameLayout)).show());
            this.i = alertDialog;
            (alertDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(0));
            (m472(this).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.z
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            Alllive.this.tF = false;
                        }
            }));
        } catch (Exception e) {

        }
        int i3 = (-314) ^ C0002.f2;
        return;
    }
}
