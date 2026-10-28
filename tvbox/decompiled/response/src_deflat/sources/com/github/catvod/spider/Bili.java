package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0025;
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
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.FO;
import com.github.catvod.spider.merge.G;
import com.github.catvod.spider.merge.G4;
import com.github.catvod.spider.merge.GW;
import com.github.catvod.spider.merge.Gc;
import com.github.catvod.spider.merge.Gd;
import com.github.catvod.spider.merge.L9;
import com.github.catvod.spider.merge.LP;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.O;
import com.github.catvod.spider.merge.RO;
import com.github.catvod.spider.merge.RunnableC0177s;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.VQ;
import com.github.catvod.spider.merge.ZI;
import com.github.catvod.spider.merge.Zc;
import com.github.catvod.spider.merge.Zm;
import com.github.catvod.spider.merge.bM;
import com.github.catvod.spider.merge.g1;
import com.github.catvod.spider.merge.g8;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.p9;
import com.github.catvod.spider.merge.rP;
import com.github.catvod.spider.merge.xW;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Bili extends Pan {
    private static boolean Dr = false;
    private static String E1 = "";
    private static g8 Fz;
    private static boolean H;
    private static LP U;
    private static String Zm;
    private static String b;
    private static boolean g;

    private JsonObject O;
    private AlertDialog g1;
    private volatile boolean n;
    private ScheduledExecutorService s;
    private boolean un = true;

    public Bili() {

        return;
    }

    public static void B(Bili bili, String str) {
        Objects.requireNonNull(bili);
        boolean z = (str.startsWith("http"));

        if (!z) {
            boolean z3 = C0057.m2377(str);
            if (z3) {
                str = C0010.m314(str);
            }
        } else {
            boolean z2 = cn.yq;
            if (z2) {
                str = C0028.m1633(str, null);
            }
            boolean z3 = C0057.m2377(str);
            if (z3) {
                str = C0010.m314(str);
            }
        }
        b = str;
        C0014.m432(m658(), m679());
        m666(bili);
    }

    private void Dr(String str, String str2) {
        boolean z = m686(this);

        if (!z) {
            this.n = true;
            b = str;
            C0014.m432(m658(), m679());
            boolean z2 = (TextUtils.isEmpty(str2));
            if (!(z2)) {
                C0014.m432(C0052.m2248("bili_refresh_token"), str2);
            }
            C0006.m194("授权成功！");
            g = true;
            m683(this);
            C0038.m1909(new bM(this, 1));
            return;
        } else {
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    com.github.catvod.parser.C0006.m194(r0);
    com.github.catvod.spider.Bili.Dr = true;
    */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    return;
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    private void Fz() {
        /*
        r4 = this;
        boolean r1 = m656()
        r0 = 1616(0x650, float:2.264E-42)
    L6:
        r0 = r0 ^ 1633(0x661, float:2.288E-42)
        switch(r0) {
            case 14: goto Lc;
            case 49: goto Lf;
            case 204: goto L14;
            case 239: goto L41;
            default: goto Lb;
        }
    Lb:
        goto L6
    Lc:
        r0 = 1678(0x68e, float:2.351E-42)
        goto L6
    Lf:
        if (r1 == 0) goto Lc
        r0 = 1709(0x6ad, float:2.395E-42)
        goto L6
    L14:
        boolean r1 = m687()
        r0 = 1740(0x6cc, float:2.438E-42)
    L1a:
        r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
        switch(r0) {
            case 17: goto L20;
            case 54: goto L25;
            case 471: goto L41;
            case 500: goto L28;
            default: goto L1f;
        }
    L1f:
        goto L1a
    L20:
        if (r1 != 0) goto L25
        r0 = 1833(0x729, float:2.569E-42)
        goto L1a
    L25:
        r0 = 1802(0x70a, float:2.525E-42)
        goto L1a
    L28:
        short[] r0 = m680()
        r1 = 27
        r2 = 6
        r3 = 1857(0x741, float:2.602E-42)
        java.lang.String r0 = com.github.catvod.spider.C0042.m2010(r0, r1, r2, r3)
        r1 = 1864(0x748, float:2.612E-42)
    L37:
        r1 = r1 ^ 1881(0x759, float:2.636E-42)
        switch(r1) {
            case 17: goto L3d;
            case 47483: goto L68;
            default: goto L3c;
        }
    L3c:
        goto L37
    L3d:
        r1 = 48674(0xbe22, float:6.8207E-41)
        goto L37
    L41:
        boolean r1 = m687()
        r0 = 48767(0xbe7f, float:6.8337E-41)
    L48:
        r2 = 48784(0xbe90, float:6.8361E-41)
        r0 = r0 ^ r2
        switch(r0) {
            case 14: goto L50;
            case 45: goto L6e;
            case 76: goto L5a;
            case 239: goto L54;
            default: goto L4f;
        }
    L4f:
        goto L48
    L50:
        r0 = 48829(0xbebd, float:6.8424E-41)
        goto L48
    L54:
        if (r1 != 0) goto L50
        r0 = 48860(0xbedc, float:6.8467E-41)
        goto L48
    L5a:
        short[] r0 = m680()
        r1 = 33
        r2 = 26
        r3 = 669(0x29d, float:9.37E-43)
        java.lang.String r0 = com.github.catvod.spider.merge.C0025.m1542(r0, r1, r2, r3)
    L68:
        com.github.catvod.parser.C0006.m194(r0)
        r0 = 1
        com.github.catvod.spider.Bili.Dr = r0
    L6e:
        return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Bili.Fz():void");
    }

    public static void G4(Bili bili) {
        String str2 = null;
        File file = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        Objects.requireNonNull(bili);
        file = m658();
        file.delete();
        str3 = "bili_refresh_token";
        file = C0052.m2248(str3);
        file.delete();
        str3 = "buvid3=7238A82F-D821-D23A-FAA5-ADC19C9796B458050infoc;bsource=search_baidu;_uuid=628F6D84-DF8D-ED5A-E4BF-66219979424B58395infoc;  buvid_fp=f7761c3c9bde36415f0299493c60b971;bp_t_offset_55423440=1203047221809905664;b_lsid=C1568F05_19E3B3AD0DE";
        b = str3;
        str2 = "已清除";
        C0006.m194(str2);
        m651(bili);
        return;
    }

    public static void Gd(Bili bili, EditText editText) {
        String str2 = null;
        Editable editable = null;
        G4 g4 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        Objects.requireNonNull(bili);
        editable = (editText.getText());
        str2 = C0050.m2227(editable);
        m651(bili);
        g4 = new G4(bili, str2, 1);
        C0038.m1909(g4);
        return;
    }

    private void H() {
        boolean z;
        Rc.yq;
        boolean z2 = ((InitOrigin.context().getPackageManager()).hasSystemFeature("android.hardware.camera.any"));
        boolean z3 = ((InitOrigin.context().getPackageManager()).hasSystemFeature("android.hardware.telephony"));
        boolean z4 = ((InitOrigin.context().getPackageManager()).hasSystemFeature("android.hardware.bluetooth"));

        if (z2) {
            if (z3) {
                if (z4) {
                    z = true;
                }
            }
        }
        z = false;

        if (!z) {
            C0038.m1909(new Gd(this, 4));
        } else {
            C0057.m2371(new g1(this, 3));
            C0038.m1909(new Gd(this, 4));
        }
        int i7 = (-732) ^ f2;

        if (i7 < 0) {
            return;
        } else {
            return;
        }
    }

    public static void Nl(Bili bili, JSONObject jSONObject) {
        ScheduledExecutorService scheduledExecutorService = null;
        Zm zm = null;
        TimeUnit timeUnit = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        Objects.requireNonNull(bili);
        scheduledExecutorService = C0028.m1615(1);
        bili.s = scheduledExecutorService;
        zm = new Zm(bili, jSONObject, 1);
        timeUnit = TimeUnit.SECONDS;
        scheduledExecutorService.scheduleWithFixedDelay(zm,1L,1L,timeUnit);
        return;
    }

    private void O() {
        String str = C0040.m1942(m679());
        boolean z = (TextUtils.isEmpty(str));

        if (!(z)) {
            b = str;
        }
        LP lp = (C0023.m1456(C0028.m1633("https://api.bilibili.com/x/web-interface/nav", m696())).yq());
        U = lp;
        g = (lp.dT());
        H = (m657().F5());
        Fz = (m657().G4());

        return;
    }

    public static void OW(Bili bili) {
        m651(bili);
        C0038.m1909(new xW(bili, 4));
        int i = (-477) ^ C0042.f100;

        return;
    }

    private void U() {
        ScheduledExecutorService scheduledExecutorService = m690(this);

        if (!(scheduledExecutorService == null)) {
            scheduledExecutorService.shutdownNow();
        }
        C0057.m2371(new bM(this, 0));
    }

    public static void W(Bili bili) {
        int i;
        Objects.requireNonNull(bili);
        try {
            bili.n = false;
            E1 = "";
            String str = "https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini";
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            hashMap.put("Referer","https://www.bilibili.com/");
            final JSONObject jSONObject = new JSONObject(C0028.m1633(str, hashMap));
            final String str2 = ((jSONObject.getJSONObject("data")).getString("url"));
            C0057.m2371(new Runnable() { // from class: com.github.catvod.spider.merge.Jx
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bili.q(Bili.this, str2, jSONObject);
                    }
            });
            i = 1616;
        } catch (Exception e) {
            m673(e);
        }
        int i2 = (-4) ^ C0029.f87;
        return;
    }

    private static String Zm(ZI zi) {
        String str;
        boolean z = ((zi.Gc()).startsWith("video"));

        if (!z) {
            boolean z2 = ((zi.Gc()).startsWith("audio"));
            if (!z2) {
                return "";
            } else {
                str = (String.format("numChannels='2' sampleRate='%s'",new Object[]{(m697().get((zi.t0())))}));
                return "";
            }
        } else {
            str = (String.format(Locale.getDefault(),"height='%s' width='%s' frameRate='%s' sar='%s'",new Object[]{(zi.i()), (zi.B()), (zi.zH()), (zi.M())}));
            boolean z2 = ((zi.Gc()).startsWith("audio"));
            if (!z2) {
                return "";
            } else {
                str = (String.format("numChannels='2' sampleRate='%s'",new Object[]{(m697().get((zi.t0())))}));
                return "";
            }
        }
        return m672(zi, str);
    }

    private static Map<String, String> b() {
        HashMap hashMap = C0055.m2325("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36", "Referer", "https://www.bilibili.com/");
        hashMap.put("Origin","https://www.bilibili.com");
        String str = m679();

        if (!(str == null)) {
            hashMap.put("cookie",str);
        }
        return hashMap;
    }

    public static boolean containsChinese(String str) {

        if (!(str == null)) {
            boolean z = (str.isEmpty());
            if (!z) {
                return ((C0005.m166("[\\u4e00-\\u9fa5]").matcher(str)).find());
            } else {
                return ((C0005.m166("[\\u4e00-\\u9fa5]").matcher(str)).find());
            }
        }
        return false;
    }

    public static void dT(Bili bili, JSONObject jSONObject) {
        String str;
        String str2;
        String str3 = "data";
        boolean z = m686(bili);

        if (!z) {
            try {
                String str4 = ((jSONObject.getJSONObject(str3)).getString("qrcode_key"));
                StringBuilder sb = new StringBuilder();
                sb.append("https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=");
                sb.append(str4);
                sb.append("&source=main-mini");
                String str5 = (sb.toString());
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
                hashMap.put("Referer","https://www.bilibili.com/");
                Response response = m676(str5, hashMap);
                ResponseBody responseBody = m682(response);
                if (responseBody == null) {
                    str = "";
                } else {
                    str = m675(m682(response));
                    str = "";
                }
                JSONObject jSONObject2 = (new JSONObject(str).getJSONObject(str3));
                int i5 = (jSONObject2.optInt("code",-1));
                if (i5 == 0) {
                    String str6 = (jSONObject2.optString("refresh_token"));
                    E1 = (jSONObject2.optString("url"));
                    String str7 = C0022.m1422(m670(m668(response)));
                    boolean z2 = (TextUtils.isEmpty(str7));
                    if (!z2) {
                        str2 = str7;
                    } else {
                        str2 = C0031.m1700(m688());
                        str2 = str7;
                    }
                    boolean z3 = (TextUtils.isEmpty(str2));
                    if (!(z3)) {
                        m661(bili, str2, str6);
                    }
                } else {
                    String str6 = (jSONObject2.optString("refresh_token"));
                    E1 = (jSONObject2.optString("url"));
                    String str7 = C0022.m1422(m670(m668(response)));
                    boolean z2 = (TextUtils.isEmpty(str7));
                    if (!z2) {
                        str2 = str7;
                    } else {
                        str2 = C0031.m1700(m688());
                        str2 = str7;
                    }
                    boolean z3 = (TextUtils.isEmpty(str2));
                    if (!(z3)) {
                        m661(bili, str2, str6);
                    }
                }
                m694(response);
                return;
            } catch (Exception e) {
                m673(e);
                return;
            }
        } else {
            return;
        }
    }

    public static /* synthetic */ void ee(Bili bili) {
        Objects.requireNonNull(bili);
        try {
            m655(bili);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void g(String str) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C0038.m1895(240), C0038.m1895(240));
            ImageView imageView = new ImageView(InitOrigin.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0032.m1731(str, 240, 2));
            FrameLayout frameLayout = new FrameLayout(InitOrigin.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView,layoutParams);
            AlertDialog alertDialog = ((((new AlertDialog.Builder(InitOrigin.getActivity()).setView(frameLayout)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.MJ
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    Bili.v3(Bili.this);
                                }
                    })).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.c
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                Bili.v(Bili.this);
                            }
                })).show());
            this.g1 = alertDialog;
            (alertDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(0));
            C0006.m194("使用哔哩官方APP扫码授权");
        } catch (Exception e) {

            return;
        }
    }

    private void g1() {
        try {
            AlertDialog alertDialog = m665(this);

            if (alertDialog == null) {
                return;
            } else {
                alertDialog.dismiss();
                return;
            }
        } catch (Exception e) {

            return;
        }
    }

    public static void g9(Bili bili) {
        Objects.requireNonNull(bili);
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(C0038.m1895(16),C0038.m1895(16),C0038.m1895(16),C0038.m1895(16));
            FrameLayout frameLayout = new FrameLayout(InitOrigin.context());
            final EditText editText = new EditText(InitOrigin.context());
            frameLayout.addView(editText,layoutParams);
            AlertDialog alertDialog = ((((((new AlertDialog.Builder(InitOrigin.getActivity()).setTitle("请输入哔哩Cookie")).setView(frameLayout)).setNeutralButton("点我，使用哔哩APP扫码授权",new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.fy
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        Bili.OW(Bili.this);
                                    }
                        })).setNegativeButton("清除CK",new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.hC
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    Bili.G4(Bili.this);
                                }
                    })).setPositiveButton(17039370,new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.TK
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Bili.Gd(Bili.this, editText);
                            }
                })).show());
            bili.g1 = alertDialog;
            alertDialog.setOnDismissListener(new Gc(bili, 1));
        } catch (Exception e) {

            return;
        }
    }

    public static boolean isAppInstalled(Context context, String str) {
        try {
            (context.getPackageManager()).getApplicationInfo(str,0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    private static HashMap<String, String> n() {
        HashMap<String, String> hashMap = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        str5 = "30280";
        str4 = "192000";
        str3 = "30232";
        str2 = "132000";
        hashMap = C0055.m2325(str5, str4, str3, str2);
        str5 = "30216";
        str4 = "64000";
        hashMap.put(str5,str4);
        return hashMap;
    }

    public static Object[] proxy(Map<String, String> map) {
        String str;
        String str2 = "type";
        boolean z = (map.containsKey(str2));
        Integer num = (Integer.valueOf(200));

        if (z) {
            boolean z2 = ((String) (map.get(str2)).equals("input"));
            if (z2) {
                String str3 = C0055.m2312((String) (map.get("推送")));
                boolean z3 = (TextUtils.isEmpty(str3));
                if (z3) {
                    return null;
                } else {
                    Pan.dismissInputQRCode();
                    boolean z4 = C0057.m2377(str3);
                    if (z4) {
                        str3 = C0010.m314(str3);
                    }
                    b = str3;
                    Object[] objArr = {num, "text/html", new ByteArrayInputStream(new byte[0])};
                    LP lp = (C0023.m1456(C0028.m1633("https://api.bilibili.com/x/web-interface/nav", m696())).yq());
                    U = lp;
                    boolean z5 = (lp.dT());
                    g = z5;
                    if (!z5) {
                        str = "哔哩游客模式，可前往【哔哔】主页扫码登录解锁高分辨率";
                    } else {
                        C0014.m432(m658(), m679());
                        str = "哔哩登陆模式";
                        str = "哔哩游客模式，可前往【哔哔】主页扫码登录解锁高分辨率";
                    }
                    C0006.m194(str);
                    H = (m657().F5());
                    Fz = (m657().G4());
                    return objArr;
                }
            }
        }
        String str4 = (String) (map.get("qn"));
        StringBuilder sb = new StringBuilder();
        sb.append("https://api.bilibili.com/x/player/playurl?avid=");
        sb.append((String) (map.get("aid")));
        sb.append("&cid=");
        sb.append((String) (map.get("cid")));
        sb.append("&qn=");
        Zc zc = ((C0023.m1456(C0028.m1633(C0032.m1739(sb, str4, "&fnval=4048&fourk=1"), m696())).yq()).tF());
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Iterator it = ((zc.yq()).iterator());
        while (true) {
            boolean z6 = (it.hasNext());

            if (z6) {
                ZI zi2 = (ZI) (it.next());
                Iterator it3 = ((m697().keySet()).iterator());
                while (true) {
                    boolean z9 = (it3.hasNext());
                    if (z9) {
                        boolean z10 = ((zi2.t0()).equals((String) (it3.next())));
                        if (z10) {
                            sb3.append(m662(zi2));
                        }
                    }
                }
            } else {
                Iterator it2 = ((zc.tF()).iterator());
                while (true) {
                    boolean z7 = (it2.hasNext());
                    if (z7) {
                        ZI zi = (ZI) (it2.next());
                        boolean z8 = ((zi.t0()).equals(str4));
                        if (z8) {
                            sb2.append(m662(zi));
                        }
                    } else {
                        return new Object[]{num, "application/dash+xml", new ByteArrayInputStream(((String.format(Locale.getDefault(),"<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>",new Object[]{(zc.SN()), (zc.N()), (zc.SN()), (sb2.toString()), (sb3.toString())})).getBytes()))};
                    }
                }
            }
        }
    }

    public static void q(Bili bili, final String str, JSONObject jSONObject) {
        Object obj;
        int i;
        Objects.requireNonNull(bili);
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                boolean z = SO.yq();

                if (!z) {
                    intent.setComponent(new ComponentName(m669(), "tv.danmaku.bili.ui.intent.IntentHandlerActivity"));
                } else {
                    intent.setPackage(m669());
                    intent.setComponent(new ComponentName(m669(), "tv.danmaku.bili.ui.intent.IntentHandlerActivity"));
                }
                intent.setData(C0034.m1791(str));
                C0057.m2371(new Runnable() { // from class: com.github.catvod.spider.merge.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Bili.xa(Bili.this, str);
                        }
                });
                InitOrigin.getActivity().startActivity(intent);
                obj = new L9(bili, jSONObject, 0);
                i = 1864;
            } catch (Exception e) {
                m692(bili, str);
                obj = new G(bili, jSONObject, 2);
            }
            C0038.m1909(obj);
            return;
        } catch (Throwable th) {

            C0038.m1909(new RunnableC0177s(bili, jSONObject, 2));
            throw th;
        }
    }

    private static String s(ZI zi, String str) {
        StringBuilder sb = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Locale locale = null;
        Object[] objArr = null;
        String str7 = null;
        GW gw = null;
        String str8 = null;
        String str9 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        sb = new StringBuilder();
        str2 = (zi.t0());
        sb.append(str2);
        str2 = "_";
        sb.append(str2);
        str2 = (zi.N());
        sb.append(str2);
        str2 = (sb.toString());
        str3 = (zi.Gc());
        str4 = "/";
        str3 = (str3.split(str4))[0];
        str4 = (zi.SN());
        str5 = "&";
        str6 = (str4.replace(str5,"&amp;"));
        locale = Locale.getDefault();
        objArr = new Object[10];
        objArr[0] = str3;
        objArr[1] = str2;
        str4 = (zi.yq());
        objArr[2] = str4;
        str5 = (zi.tF());
        objArr[3] = str5;
        objArr[4] = (zi.Gc());
        objArr[5] = str;
        str7 = (zi.q());
        objArr[6] = str7;
        objArr[7] = str6;
        gw = (zi.KJ());
        str8 = (gw.yq());
        objArr[8] = str8;
        gw = (zi.KJ());
        objArr[9] = (gw.SN());
        str9 = "<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>";
        return (String.format(locale,str9,objArr));
    }

    private static File un() {
        return C0052.m2248("bili");
    }

    public static void v(Bili bili) {
        m683(bili);
    }

    public static void v3(Bili bili) {
        String str2 = null;
        File file = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        Objects.requireNonNull(bili);
        file = m658();
        str2 = m679();
        C0014.m432(file, str2);
        m683(bili);
        return;
    }

    public static /* synthetic */ void xa(Bili bili, String str) {
        Objects.requireNonNull(bili);
        try {
            m692(bili, str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: باصف */
    public static JsonObject m650(Object obj) {

        return ((JsonElement) obj).getAsJsonObject();
    }

    /* renamed from: تشبي */
    public static void m651(Object obj) {
        int i = (-26) ^ C0033.f91;

        ((Bili) obj).g1();
        int i4 = (-556) ^ C0004.f4;

        return;
    }

    /* renamed from: توزﺎ */
    public static boolean m652(Object obj, Object obj2) {
        int i = 706 ^ C0003.f3;

        return ((JsonObject) obj).has((String) obj2);
    }

    /* renamed from: تﺫفﻙ */
    public static JsonElement m653(Object obj) {
        int i = (-886) ^ C0021.f79;

        return ((LP) obj).q();
    }

    /* renamed from: ثﺭﺎغ */
    public static boolean m654(Object obj) {
        int i = 938 ^ C0033.f91;

        return ((Bili) obj).un;
    }

    /* renamed from: جتﺩﺏ */
    public static void m655(Object obj) {
        int i = (-487) ^ C0053.f111;

        ((Bili) obj).H();
        return;
    }

    /* renamed from: جﺩﻝق */
    public static boolean m656() {
        int i = 624 ^ C0012.f12;

        return g;
    }

    /* renamed from: خنظك */
    public static LP m657() {
        int i = (-824) ^ C0004.f4;

        return U;
    }

    /* renamed from: دﺭرﺙ */
    public static File m658() {
        int i = 215 ^ C0038.f96;

        return un();
    }

    /* renamed from: ذﻁﺙص */
    public static int m659(Object obj) {
        int i = 812 ^ C0022.f80;

        return ((JsonArray) obj).size();
    }

    /* renamed from: سغﻱﻡ */
    public static JsonObject m660(Object obj) {
        int i = 938 ^ C0033.f91;

        return ((Bili) obj).O;
    }

    /* renamed from: سﻝلﻩ */
    public static void m661(Object obj, Object obj2, Object obj3) {
        int i = 923 ^ C0041.f99;

        ((Bili) obj).Dr((String) obj2, (String) obj3);
        int i4 = 813 ^ C0033.f91;

        return;
    }

    /* renamed from: شـاﺕ */
    public static String m662(Object obj) {
        int i = 909 ^ C0002.f2;

        return Zm((ZI) obj);
    }

    /* renamed from: شﺹجس */
    public static JsonElement m663(Object obj) {
        int i = 938 ^ C0033.f91;

        return JsonParser.parseString((String) obj);
    }

    /* renamed from: صطكﺕ */
    public static JsonElement m664(Object obj, int i) {
        int i2 = 57 ^ C0032.f90;

        return ((JsonArray) obj).get(i);
    }

    /* renamed from: صﺱسا */
    public static AlertDialog m665(Object obj) {
        int i = 284 ^ C0041.f99;

        return ((Bili) obj).g1;
    }

    /* renamed from: طﺡﻁث */
    public static void m666(Object obj) {
        int i = (-821) ^ C0025.f83;

        ((Bili) obj).O();
        return;
    }

    /* renamed from: طﻱصﻙ */
    public static String m667(Object obj) {
        int i = (-604) ^ C0013.f13;

        return ((JsonElement) obj).getAsString();
    }

    /* renamed from: عﺩﻭﺵ */
    public static Headers m668(Object obj) {
        int i = (-31) ^ C0006.f6;

        return ((Response) obj).headers();
    }

    /* renamed from: قفهﻡ */
    public static String m669() {
        int i = 930 ^ C0038.f96;

        return Zm;
    }

    /* renamed from: كـشف */
    public static Map m670(Object obj) {
        int i = (-388) ^ C0035.f93;

        return ((Headers) obj).toMultimap();
    }

    /* renamed from: لﺽﺏﻅ */
    public static void m671(Object obj) {
        int i = 36 ^ C0033.f91;

        ((Bili) obj).Fz();
        return;
    }

    /* renamed from: لﻍﺩح */
    public static String m672(Object obj, Object obj2) {
        int i = (-703) ^ C0036.f94;

        return s((ZI) obj, (String) obj2);
    }

    /* renamed from: مﻁﻕج */
    public static void m673(Object obj) {
        int i = 215 ^ C0038.f96;

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: نذﻍﻝ */
    public static JsonObject m674(Object obj) {
        int i = 938 ^ C0033.f91;

        return FO.v((String) obj);
    }

    /* renamed from: وسثﻁ */
    public static String m675(Object obj) {
        int i = (-487) ^ C0053.f111;

        return ((ResponseBody) obj).string();
    }

    /* renamed from: يفﺎغ */
    public static Response m676(Object obj, Object obj2) {
        int i = (-556) ^ C0004.f4;

        return V3.zH((String) obj, (Map) obj2);
    }

    /* renamed from: يﺡذﺵ */
    public static List m677(Object obj) {
        int i = (-404) ^ C0021.f79;

        return VQ.yq.yq((JsonElement) obj);
    }

    /* renamed from: يﺭﻱا */
    public static boolean m678(Object obj) {
        int i = 923 ^ C0041.f99;

        return ((JsonElement) obj).getAsBoolean();
    }

    /* renamed from: ﺎفشﺥ */
    public static String m679() {
        int i = (-732) ^ f2;

        if (i >= 0) {
            return null;
        } else {
            return b;
        }
    }

    /* renamed from: ﺕحوﻭ */
    public static JsonElement m681(Object obj, Object obj2) {
        int i = (-675) ^ C0038.f96;

        return ((JsonParser) obj).parse((String) obj2);
    }

    /* renamed from: ﺙقخﺭ */
    public static ResponseBody m682(Object obj) {
        int i = (-422) ^ C0033.f91;

        return ((Response) obj).body();
    }

    /* renamed from: ﺡيﻁج */
    public static void m683(Object obj) {
        int i = (-556) ^ C0004.f4;

        ((Bili) obj).U();
        int i4 = (-732) ^ f2;

        if (i4 < 0) {
            return;
        } else {
            return;
        }
    }

    /* renamed from: ﺥﺡﻙه */
    public static JsonArray m684(Object obj, Object obj2) {
        int i = (-487) ^ C0053.f111;

        return ((JsonObject) obj).getAsJsonArray((String) obj2);
    }

    /* renamed from: ﺩﺎﺽه */
    public static JsonElement m685(Object obj, Object obj2) {
        int i = 498 ^ C0002.f2;

        return ((JsonObject) obj).get((String) obj2);
    }

    /* renamed from: ﺭﻅزت */
    public static boolean m686(Object obj) {
        int i = 812 ^ C0022.f80;

        return ((Bili) obj).n;
    }

    /* renamed from: ﺹتﺵس */
    public static boolean m687() {
        int i = (-406) ^ C0053.f111;

        return Dr;
    }

    /* renamed from: ﺽكذﺵ */
    public static String m688() {
        int i = (-422) ^ C0033.f91;

        return E1;
    }

    /* renamed from: ﻁحﻝض */
    public static JsonElement m689(Object obj) {
        int i = 753 ^ C0000.f0;

        return ((LP) obj).t0();
    }

    /* renamed from: ﻁﺽتب */
    public static ScheduledExecutorService m690(Object obj) {
        int i = (-477) ^ C0042.f100;

        return ((Bili) obj).s;
    }

    /* renamed from: ﻍضﺝخ */
    public static boolean m691() {
        int i = (-886) ^ C0021.f79;

        return H;
    }

    /* renamed from: ﻍﺥﺹف */
    public static void m692(Object obj, Object obj2) {
        int i = (-824) ^ C0004.f4;

        ((Bili) obj).g((String) obj2);
        return;
    }

    /* renamed from: ﻕجﻝق */
    public static g8 m693() {
        int i = 930 ^ C0038.f96;

        return Fz;
    }

    /* renamed from: ﻕﺎﻍﺵ */
    public static void m694(Object obj) {
        int i = 802 ^ C0052.f110;

        ((Response) obj).close();
        return;
    }

    /* renamed from: ﻙﺏسﻝ */
    public static int m695(Object obj) {
        int i = 930 ^ C0038.f96;

        return ((JsonElement) obj).getAsInt();
    }

    /* renamed from: ﻝهغج */
    public static Map m696() {
        int i = (-1021) ^ C0026.f84;

        return b();
    }

    /* renamed from: ﻡﻉﻁﺽ */
    public static HashMap m697() {
        int i = (-31) ^ C0006.f6;

        return n();
    }

    public String action(String str) {
        try {
            boolean z = (str.equals("bili"));

            if (z) {
                C0057.m2371(new O(this, 2));
                TextUtils.isEmpty(m679());
                m683(this);
            }
            boolean z2 = (str.contains("Show"));

            if (z2) {
                this.show(str,InitOrigin.getActivity());
            }
            return "";
        } catch (Exception e) {
            return C0054.m2293((e.getMessage()));
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4;
        StringBuilder sb;
        String str5;
        ScheduledExecutorService scheduledExecutorService = m690(this);

        if (!(scheduledExecutorService == null)) {
            m683(this);
        }
        boolean z2 = (str.equals("peizhi"));

        if (!z2) {
            boolean z3 = (str.endsWith("/{pg}"));
            if (!z3) {
                String str6 = "order";
                boolean z4 = (hashMap.containsKey(str6));
                if (!z4) {
                    str3 = "totalrank";
                } else {
                    str3 = (String) (hashMap.get(str6));
                    str3 = "totalrank";
                }
                String str7 = "duration";
                boolean z5 = (hashMap.containsKey(str7));
                if (!z5) {
                    str4 = "0";
                } else {
                    str4 = (String) (hashMap.get(str7));
                    str4 = "0";
                }
                String str8 = "tid";
                boolean z6 = (hashMap.containsKey(str8));
                if (z6) {
                    StringBuilder sb2 = C0037.m1877(str, " ");
                    sb2.append((String) (hashMap.get(str8)));
                    str = (sb2.toString());
                }
                boolean z7 = (m679().equals("buvid3=7238A82F-D821-D23A-FAA5-ADC19C9796B458050infoc;bsource=search_baidu;_uuid=628F6D84-DF8D-ED5A-E4BF-66219979424B58395infoc;  buvid_fp=f7761c3c9bde36415f0299493c60b971;bp_t_offset_55423440=1203047221809905664;b_lsid=C1568F05_19E3B3AD0DE"));
                if (!z7) {
                    sb = new StringBuilder();
                    str5 = "https://api.bilibili.com/x/web-interface/wbi/search/type?search_type=video&keyword=";
                } else {
                    sb = new StringBuilder();
                    str5 = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=";
                    sb = new StringBuilder();
                    str5 = "https://api.bilibili.com/x/web-interface/wbi/search/type?search_type=video&keyword=";
                }
                sb.append(str5);
                sb.append(C0010.m314(str));
                sb.append("&order=");
                sb.append(str3);
                sb.append("&duration=");
                sb.append(str4);
                sb.append("&page=");
                sb.append(str2);
                VQ vq = C0023.m1456(C0028.m1633((sb.toString()), m696()));
                ArrayList arrayList = new ArrayList();
                Iterator it = (m677(m653((vq.yq()))).iterator());
                while (true) {
                    boolean z8 = (it.hasNext());
                    if (z8) {
                        VQ.yq yqVar = (VQ.yq) (it.next());
                        boolean z9 = C0010.m289((yqVar.N()));
                        if (!(z9)) {
                            arrayList.add((yqVar.tF()));
                        }
                    } else {
                        return C0022.m1435(arrayList);
                    }
                }
            } else {
                C0056.m2351(false);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("mid",(str.split("/"))[0]);
                linkedHashMap.put("pn",str2);
                ArrayList arrayList2 = new ArrayList();
                StringBuilder sb3 = C0052.m2253("https://api.bilibili.com/x/space/wbi/arc/search?");
                sb3.append((m693().yq(linkedHashMap)));
                Iterator it2 = (m677(m685(m650(m689((C0023.m1456(C0028.m1633((sb3.toString()), m696())).yq()))), "vlist")).iterator());
                while (true) {
                    boolean z10 = (it2.hasNext());
                    if (z10) {
                        arrayList2.add(((VQ.yq) (it2.next()).tF()));
                    } else {
                        return C0022.m1435(arrayList2);
                    }
                }
                String str6 = "order";
                boolean z4 = (hashMap.containsKey(str6));
                if (!z4) {
                    str3 = "totalrank";
                } else {
                    str3 = (String) (hashMap.get(str6));
                    str3 = "totalrank";
                }
                String str7 = "duration";
                boolean z5 = (hashMap.containsKey(str7));
                if (!z5) {
                    str4 = "0";
                } else {
                    str4 = (String) (hashMap.get(str7));
                    str4 = "0";
                }
                String str8 = "tid";
                boolean z6 = (hashMap.containsKey(str8));
                if (z6) {
                    StringBuilder sb2 = C0037.m1877(str, " ");
                    sb2.append((String) (hashMap.get(str8)));
                    str = (sb2.toString());
                }
                boolean z7 = (m679().equals("buvid3=7238A82F-D821-D23A-FAA5-ADC19C9796B458050infoc;bsource=search_baidu;_uuid=628F6D84-DF8D-ED5A-E4BF-66219979424B58395infoc;  buvid_fp=f7761c3c9bde36415f0299493c60b971;bp_t_offset_55423440=1203047221809905664;b_lsid=C1568F05_19E3B3AD0DE"));
                if (!z7) {
                    sb = new StringBuilder();
                    str5 = "https://api.bilibili.com/x/web-interface/wbi/search/type?search_type=video&keyword=";
                } else {
                    sb = new StringBuilder();
                    str5 = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=";
                    sb = new StringBuilder();
                    str5 = "https://api.bilibili.com/x/web-interface/wbi/search/type?search_type=video&keyword=";
                }
                sb.append(str5);
                sb.append(C0010.m314(str));
                sb.append("&order=");
                sb.append(str3);
                sb.append("&duration=");
                sb.append(str4);
                sb.append("&page=");
                sb.append(str2);
                VQ vq = C0023.m1456(C0028.m1633((sb.toString()), m696()));
                ArrayList arrayList = new ArrayList();
                Iterator it = (m677(m653((vq.yq()))).iterator());
                while (true) {
                    boolean z8 = (it.hasNext());
                    if (z8) {
                        VQ.yq yqVar = (VQ.yq) (it.next());
                        boolean z9 = C0010.m289((yqVar.N()));
                        if (!(z9)) {
                            arrayList.add((yqVar.tF()));
                        }
                    } else {
                        return C0022.m1435(arrayList);
                    }
                }
            }
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(FO.tF());
            jSONArray.put(FO.G4());
            jSONObject.put("page",1);
            jSONObject.put("pagecount",1);
            jSONObject.put("limit",1);
            jSONObject.put("total",1);
            jSONObject.put("list",jSONArray);
            return (jSONObject.toString());
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        JsonElement jsonElement;
        int i;
        ScheduledExecutorService scheduledExecutorService = m690(this);

        if (!(scheduledExecutorService == null)) {
            m683(this);
        }
        m671(this);
        String[] strArr = ((String) (list.get(0)).split("@"));
        String str = strArr[0];
        String str2 = strArr[1];
        LP lp = (C0023.m1456(C0028.m1633(C0022.m1434("https://api.bilibili.com/x/web-interface/view?aid=", str2), m696())).yq());
        ME me = new ME();
        me.B((String) (list.get(0)));
        me.G4((lp.KJ()));
        me.G((lp.B()));
        me.t0((lp.G()));
        me.KJ((lp.zH()));
        me.q(((lp.Gc()).yq()));
        StringBuilder sb = new StringBuilder();
        sb.append(((lp.i()).longValue()) / 60);
        sb.append("分钟");
        me.v3((sb.toString()));
        boolean z = m654(this);
        String str3 = "$";
        String str4 = "#";
        String str5 = "$$$";
        String str6 = "+";

        if (z) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://api.bilibili.com/x/player/playurl?avid=");
            sb2.append(str2);
            sb2.append("&cid=");
            sb2.append((lp.N()));
            sb2.append("&qn=127&fnval=4048&fourk=1");
            LP lp2 = (C0023.m1456(C0028.m1633((sb2.toString()), m696())).yq());
            int i4 = 0;
            while (true) {
                int i5 = i4;
                int i6 = ((lp2.SN()).size());
                if (i5 < i6) {
                    int i14 = ((Integer) ((lp2.SN()).get(i5)).intValue());
                    boolean z3 = m656();
                    boolean z4 = m691();
                    arrayList2.add((Integer) ((lp2.SN()).get(i5)));
                    arrayList.add((String) ((lp2.yq()).get(i5)));
                    i4 = i5 + 1;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = ((lp.M()).iterator());
                    while (true) {
                        boolean z2 = (it.hasNext());
                        String str7 = ":";
                        if (z2) {
                            RO ro = (RO) (it.next());
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append((ro.SN()));
                            sb4.append(str3);
                            sb4.append(str2);
                            sb4.append(str6);
                            sb4.append((ro.yq()));
                            sb4.append(str6);
                            sb4.append((TextUtils.join(str7,arrayList2)));
                            sb4.append(str6);
                            sb4.append((TextUtils.join(str7,arrayList)));
                            arrayList3.add((sb4.toString()));
                        } else {
                            linkedHashMap.put("B站",(TextUtils.join(str4,arrayList3)));
                            ArrayList arrayList4 = new ArrayList();
                            String str8 = C0028.m1633(C0022.m1434("https://api.bilibili.com/x/web-interface/archive/related?bvid=", str), m696());
                            try {
                                jsonElement = m663(str8);
                                i = 52735;
                            } catch (Throwable th) {
                                jsonElement = m681(new JsonParser(), str8);
                            }
                            JsonArray jsonArray = m684(m650(jsonElement), "data");
                            int i9 = 0;
                            while (true) {
                                int i10 = m659(jsonArray);
                                if (i9 < i10) {
                                    JsonObject jsonObject = m650(m664(jsonArray, i9));
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(m667(m685(jsonObject, "title")));
                                    sb3.append(str3);
                                    sb3.append(m695(m685(jsonObject, "aid")));
                                    sb3.append(str6);
                                    sb3.append(m695(m685(jsonObject, "cid")));
                                    sb3.append(str6);
                                    sb3.append((TextUtils.join(str7,arrayList2)));
                                    sb3.append(str6);
                                    sb3.append((TextUtils.join(str7,arrayList)));
                                    arrayList4.add((sb3.toString()));
                                    i9++;
                                } else {
                                    linkedHashMap.put("相关",(TextUtils.join(str4,arrayList4)));
                                    me.dT((TextUtils.join(str5,(linkedHashMap.keySet()))));
                                    me.F5((TextUtils.join(str5,(linkedHashMap.values()))));
                                    return C0000.m21(me);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = ((lp.M()).iterator());
            while (true) {
                boolean z5 = (it2.hasNext());
                if (z5) {
                    RO ro2 = (RO) (it2.next());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append((ro2.SN()));
                    sb5.append(str3);
                    sb5.append(str2);
                    sb5.append(str6);
                    sb5.append((ro2.yq()));
                    arrayList5.add((sb5.toString()));
                } else {
                    linkedHashMap2.put("直连",(TextUtils.join(str4,arrayList5)));
                    me.dT((TextUtils.join(str5,(linkedHashMap2.keySet()))));
                    me.F5((TextUtils.join(str5,(linkedHashMap2.values()))));
                    return C0000.m21(me);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://api.bilibili.com/x/player/playurl?avid=");
            sb2.append(str2);
            sb2.append("&cid=");
            sb2.append((lp.N()));
            sb2.append("&qn=127&fnval=4048&fourk=1");
            LP lp2 = (C0023.m1456(C0028.m1633((sb2.toString()), m696())).yq());
            int i4 = 0;
            while (true) {
                int i5 = i4;
                int i6 = ((lp2.SN()).size());
                if (i5 < i6) {
                    int i14 = ((Integer) ((lp2.SN()).get(i5)).intValue());
                    boolean z3 = m656();
                    boolean z4 = m691();
                    arrayList2.add((Integer) ((lp2.SN()).get(i5)));
                    arrayList.add((String) ((lp2.yq()).get(i5)));
                    i4 = i5 + 1;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = ((lp.M()).iterator());
                    while (true) {
                        boolean z2 = (it.hasNext());
                        String str7 = ":";
                        if (z2) {
                            RO ro = (RO) (it.next());
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append((ro.SN()));
                            sb4.append(str3);
                            sb4.append(str2);
                            sb4.append(str6);
                            sb4.append((ro.yq()));
                            sb4.append(str6);
                            sb4.append((TextUtils.join(str7,arrayList2)));
                            sb4.append(str6);
                            sb4.append((TextUtils.join(str7,arrayList)));
                            arrayList3.add((sb4.toString()));
                        } else {
                            linkedHashMap.put("B站",(TextUtils.join(str4,arrayList3)));
                            ArrayList arrayList4 = new ArrayList();
                            String str8 = C0028.m1633(C0022.m1434("https://api.bilibili.com/x/web-interface/archive/related?bvid=", str), m696());
                            try {
                                jsonElement = m663(str8);
                                i = 52735;
                            } catch (Throwable th) {
                                jsonElement = m681(new JsonParser(), str8);
                            }
                            JsonArray jsonArray = m684(m650(jsonElement), "data");
                            int i9 = 0;
                            while (true) {
                                int i10 = m659(jsonArray);
                                if (i9 < i10) {
                                    JsonObject jsonObject = m650(m664(jsonArray, i9));
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(m667(m685(jsonObject, "title")));
                                    sb3.append(str3);
                                    sb3.append(m695(m685(jsonObject, "aid")));
                                    sb3.append(str6);
                                    sb3.append(m695(m685(jsonObject, "cid")));
                                    sb3.append(str6);
                                    sb3.append((TextUtils.join(str7,arrayList2)));
                                    sb3.append(str6);
                                    sb3.append((TextUtils.join(str7,arrayList)));
                                    arrayList4.add((sb3.toString()));
                                    i9++;
                                } else {
                                    linkedHashMap.put("相关",(TextUtils.join(str4,arrayList4)));
                                    me.dT((TextUtils.join(str5,(linkedHashMap.keySet()))));
                                    me.F5((TextUtils.join(str5,(linkedHashMap.values()))));
                                    return C0000.m21(me);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String homeContent(boolean z) {
        m671(this);
        ScheduledExecutorService scheduledExecutorService = m690(this);

        if (!(scheduledExecutorService == null)) {
            m683(this);
        }
        JsonObject jsonObject = m660(this);
        String str = "json";
        boolean z2 = m652(jsonObject, str);

        if (!z2) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String[] strArr = (m667(m685(m660(this), "type")).split("#"));
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    String str2 = strArr[i3];
                    arrayList.add(new rP(str2, str2));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new p9("order", "排序", (Arrays.asList(new p9.yq[]{new p9.yq("预设", "totalrank"), new p9.yq("最多点击", "click"), new p9.yq("最新发布", "pubdate"), new p9.yq("最多弹幕", "dm"), new p9.yq("最多收藏", "stow")}))));
                    arrayList2.add(new p9("duration", "时长", (Arrays.asList(new p9.yq[]{new p9.yq("全部时长", "0"), new p9.yq("60分钟以上", "4"), new p9.yq("30~60分钟", "3"), new p9.yq("10~30分钟", "2"), new p9.yq("10分钟以下", "1")}))));
                    linkedHashMap.put(str2,arrayList2);
                    i3++;
                } else {
                    return C0049.m2178(arrayList, linkedHashMap);
                }
            }
        } else {
            return C0028.m1633(m667(m685(m660(this), str)), null);
        }
    }

    public String homeVideoContent() {
        VQ vq = C0023.m1456(C0028.m1633("https://api.bilibili.com/x/web-interface/popular?ps=20", m696()));
        ArrayList arrayList = new ArrayList();
        Iterator it = (m677(m689((vq.yq()))).iterator());
        while (true) {
            boolean z = (it.hasNext());

            if (z) {
                arrayList.add(((VQ.yq) (it.next()).tF()));
            } else {
                return C0022.m1435(arrayList);
            }
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        String str2;
        String str3 = "tv.danmaku.bili";
        boolean z = C0037.m1876(context, str3);

        if (z) {
            Zm = str3;
        }
        String str4 = "com.bilibili.app.in";
        boolean z2 = C0037.m1876(context, str4);

        if (z2) {
            Zm = str4;
        }
        JsonObject jsonObject = m674(str);
        this.O = jsonObject;
        String str5 = "dash";
        boolean z3 = m652(jsonObject, str5);

        if (z3) {
            this.un = m678(m685(m660(this), str5));
        }
        boolean z4 = cn.yq;

        if (z4) {
            JsonObject jsonObject2 = m660(this);
            String str6 = "token";
            boolean z5 = m652(jsonObject2, str6);
            String str7 = "cookie";
            if (!z5) {
                boolean z6 = m652(m660(this), str7);
                if (z6) {
                    String str8 = m667(m685(m660(this), str7));
                    b = str8;
                    boolean z7 = (str8.startsWith("http"));
                    if (z7) {
                        str2 = (C0028.m1633(m679(), null).trim());
                    }
                }
            } else {
                String str9 = m667(m685(m660(this), str6));
                String str10 = "bili_refresh_token_origin";
                String str11 = C0021.m1398(C0052.m2248(str10));
                C0014.m432(C0052.m2248(str10), str9);
                boolean z8 = (str9.equals(str11));
                if (z8) {
                    String str12 = C0021.m1398(m658());
                    b = str12;
                    boolean z9 = (TextUtils.isEmpty(str12));
                    if (z9) {
                        str2 = m667(m685(m660(this), str7));
                    }
                } else {
                    b = m667(m685(m660(this), str7));
                    C0014.m432(C0052.m2248("bili"), m679());
                    C0014.m432(C0052.m2248("bili_refresh_token"), str9);
                    String str12 = C0021.m1398(m658());
                    b = str12;
                    boolean z9 = (TextUtils.isEmpty(str12));
                    if (z9) {
                        str2 = m667(m685(m660(this), str7));
                    }
                }
                boolean z6 = m652(m660(this), str7);
                if (z6) {
                    String str8 = m667(m685(m660(this), str7));
                    b = str8;
                    boolean z7 = (str8.startsWith("http"));
                    if (z7) {
                        str2 = (C0028.m1633(m679(), null).trim());
                    }
                }
            }
            b = str2;
        }
        boolean z10 = (TextUtils.isEmpty(m679()));

        if (z10) {
            b = C0021.m1398(m658());
        }
        boolean z11 = (TextUtils.isEmpty(m679()));

        if (z11) {
            b = "buvid3=7238A82F-D821-D23A-FAA5-ADC19C9796B458050infoc;bsource=search_baidu;_uuid=628F6D84-DF8D-ED5A-E4BF-66219979424B58395infoc;  buvid_fp=f7761c3c9bde36415f0299493c60b971;bp_t_offset_55423440=1203047221809905664;b_lsid=C1568F05_19E3B3AD0DE";
        }
        m666(this);
    }

    @Override // com.github.catvod.spider.Pan
    public String playerContent(String str, String str2, List<String> list) {
        ScheduledExecutorService scheduledExecutorService = m690(this);

        if (!(scheduledExecutorService == null)) {
            m683(this);
        }
        C0056.m2351(true);
        boolean z = m654(this);
        String str3 = "&cid=";
        String str4 = "\\+";
        int i2 = 0;

        if (!(z)) {
            try {
                String[] strArr = (str2.split(str4));
                String str5 = strArr[0];
                String str6 = strArr[1];
                StringBuilder sb = new StringBuilder();
                sb.append("https://api.bilibili.com/x/player/playurl?avid=");
                sb.append(str5);
                sb.append(str3);
                sb.append(str6);
                sb.append("&qn=120&fourk=1");
                JSONArray jSONArray = ((new JSONObject(C0028.m1633((sb.toString()), m696())).getJSONObject("data")).getJSONArray("durl"));
                String str7 = "";
                int i4 = 0;
                while (true) {
                    int i5 = (jSONArray.length());
                    if (i4 < i5) {
                        str7 = ((jSONArray.getJSONObject(i4)).getString("url"));
                        boolean z2 = (TextUtils.isEmpty(str7));
                        if (z2) {
                            i4++;
                        }
                    }
                }
                iX iXVar = new iX();
                iXVar.g1(str7);
                iXVar.KJ(m696());
                return (iXVar.toString());
            } catch (JSONException e) {
                e.printStackTrace();
                break;
            }
        }
        String[] strArr2 = (str2.split(str4));
        String str8 = strArr2[0];
        String str9 = strArr2[1];
        String str10 = strArr2[3];
        String str11 = ":";
        String[] strArr3 = (str10.split(str11));
        String[] strArr4 = (strArr2[2].split(str11));
        ArrayList arrayList = new ArrayList();
        String str12 = ("https://api.bilibili.com/x/v1/dm/list.so?oid=".concat(str9));
        while (true) {
            int length = strArr3.length;

            if (i2 < length) {
                arrayList.add(strArr3[i2]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ProxyOrigin.getUrl());
                sb2.append("?do=bili&aid=");
                sb2.append(str8);
                sb2.append(str3);
                sb2.append(str9);
                sb2.append("&qn=");
                sb2.append(strArr4[i2]);
                sb2.append("&type=mpd");
                arrayList.add((sb2.toString()));
                i2++;
            } else {
                iX iXVar2 = new iX();
                iXVar2.n(arrayList);
                iXVar2.tF(str12);
                iXVar2.zH();
                iXVar2.KJ(m696());
                return (iXVar2.toString());
            }
        }
    }

    public String searchContent(String str, boolean z) {
        ScheduledExecutorService scheduledExecutorService = m690(this);

        if (!(scheduledExecutorService == null)) {
            m683(this);
        }
        return (this.categoryContent(str,"1",true,new HashMap()));
    }

    public String searchContent(String str, boolean z, String str2) {
        HashMap hashMap = null;
        String str4 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap();
        str4 = (this.categoryContent(str,str2,true,hashMap));
        return str4;
    }
}
