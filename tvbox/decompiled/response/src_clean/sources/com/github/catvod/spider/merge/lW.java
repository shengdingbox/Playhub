package com.github.catvod.spider.merge;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.DexNative;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.ProxyOrigin;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URLEncoder;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class lW {
    public static String W = "";
    public static String ee = "";
    private static String g9 = "";
    public static String v = "";
    private AlertDialog G;
    private LinearLayout G4;
    private String Gc;
    private String SN;
    private LinearLayout dT;
    private static AtomicBoolean xa = new AtomicBoolean(false);
    private static AtomicBoolean Gd = new AtomicBoolean(false);
    private String[] yq = {"<", ">", "&", "\u0000", "\b"};
    private String N = "";
    private Pattern tF = Pattern.compile("(\\d+)");
    private Pattern zH = Pattern.compile("E(\\d+)");
    private volatile boolean i = false;
    private Button t0 = null;
    private final Pattern M = Pattern.compile("(特别|惊喜|纳凉)?企划|合伙人手记|超前(营业|vlog)?|速览|vlog|reaction|纯享|乐子|加更(版|篇)?|抢先(看|版|集|篇)?|抢鲜|预告|花絮(独家)?|特辑|彩蛋|专访|幕后(故事|花絮|独家)?|直播(陪看|回顾)?|未播(片段)?|衍生|番外|赏析|会员(专享|加长|尊享|专属|版)?|片花|精华|看点|速看|解读|影评|解说|吐槽|盘点|拍摄花絮|制作花絮|幕后花絮|未播花絮|独家花絮|花絮特辑|先导预告|终极预告|正式预告|官方预告|彩蛋片段|删减片段|未播片段|番外彩蛋|精彩片段|精彩看点|精彩回顾|精彩集锦|看点解析|看点预告|NG镜头|NG花絮|番外篇|番外特辑|制作特辑|拍摄特辑|幕后特辑|导演特辑|演员特辑|片尾曲|插曲|高光回顾|背景音乐|OST|音乐MV|歌曲MV|前季回顾|剧情回顾|往期回顾|内容总结|剧情盘点|精选合集|剪辑合集|混剪视频|独家专访|演员访谈|导演访谈|主创访谈|媒体采访|发布会采访|采访|陪看(记)?|试看版|短剧|精编|Plus|独家版|特别版|短片|发布会|解忧局|走心局|火锅局|巅峰时刻|坞里都知道|福持目标坞民|观察室|上班那点事儿|周top|赛段|直拍|REACTION|VLOG|全纪录|开播|先导|总宣|展演|集锦|旅行日记|精彩分享|剧情揭秘", 2);
    List<String> KJ = new ArrayList(Arrays.asList("http://127.0.0.1:10001/danmuku?act=search&name="));
    List<String> q = new ArrayList(Arrays.asList("http://127.0.0.1:10001/danmuku?url="));
    List<String> B = new ArrayList(Arrays.asList("https://dmku.hls.one/?ac=dm&url="));
    private List<w4> F5 = new ArrayList();
    private LinkedHashMap<String, List<w4>> v3 = new LinkedHashMap<>();

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class N implements View.OnFocusChangeListener {
        final /* synthetic */ String N;
        final /* synthetic */ String SN;
        final /* synthetic */ Button yq;

        N(Button button, String str, String str2) {
            lW.this = r1;
            this.yq = button;
            this.SN = str;
            this.N = str2;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            lW.this.n(this.yq, this.SN, this.N);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class SN implements View.OnKeyListener {
        final /* synthetic */ Button yq;

        SN(Button button) {
            lW.this = r1;
            this.yq = button;
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if ((i != 23 && i != 66) || keyEvent.getAction() != 1) {
                return false;
            }
            lW.this.g(this.yq);
            return true;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class tF {
        private Response yq;

        public tF(Response response) {
            this.yq = response;
        }

        public final Response yq() {
            return this.yq;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class yq implements View.OnKeyListener {
        final /* synthetic */ Activity N;
        final /* synthetic */ EditText SN;
        final /* synthetic */ LinearLayout.LayoutParams tF;
        final /* synthetic */ EditText yq;

        yq(EditText editText, EditText editText2, Activity activity, LinearLayout.LayoutParams layoutParams) {
            lW.this = r1;
            this.yq = editText;
            this.SN = editText2;
            this.N = activity;
            this.tF = layoutParams;
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if ((i != 23 && i != 66) || keyEvent.getAction() != 1) {
                return false;
            }
            lW.this.Nl(this.yq, this.SN, this.N, this.tF);
            return true;
        }
    }

    static {
        Pattern.compile("\"danum\":(\\d+)");
        Arrays.asList("16733525", "16755200", "16776960", "13434880", "65535", "327680", "10092543", "10066329", "16763904", "12632256", "15790320", "65407", "16711680", "255", "65280", "16776947");
        new Random();
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setIgnoringElementContentWhitespace(true);
        newInstance.setCoalescing(true);
    }

    public lW(String str, String str2) {
        this.SN = "";
        this.Gc = "";
        this.Gc = str;
        this.SN = str2;
    }

    public static /* synthetic */ void Gc(lW lWVar, String str, String str2, final Activity activity, final LinearLayout.LayoutParams layoutParams) {
        Objects.requireNonNull(lWVar);
        try {
            final List<w4> v3 = lWVar.v3(str, str2);
            activity.runOnUiThread(new Runnable() { // from class: com.github.catvod.spider.merge.yj
                @Override // java.lang.Runnable
                public final void run() {
                    lW.N(lW.this, v3, activity, layoutParams);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            activity.runOnUiThread(new hu(lWVar, activity, layoutParams, 1));
        }
    }

    private static String Gd(String str) {
        String str2 = cn.zH;
        if (str2.startsWith("8J+")) {
            str2 = new String(Base64.decode(str2, 0));
        }
        return str.replace("4K", "").replace("4k", "").replace("1080", "").replace("2160", "").replace("（臻彩）", "").replace("(臻彩)", "").replace("（真彩）", "").replace("粤语版", "").replace("【粤语版】", "").replace("【国语版】", "").replace("[粤语版]", "").replace("[国语版]", "").replace("粤语", "").replace("国语", "").replace("国语版", "").replaceAll("[a-zA-Z]26\\d", "").replaceAll("[a-zA-Z][a-zA-Z]4", "").replaceAll("19\\d\\d", "").replaceAll("20\\d\\d", "").replaceAll("\\d+-\\d+", "").replaceAll("第\\d+季", "").replaceAll("[\\[][^\\]]*[\\]]", "").replace(str2, "").trim();
    }

    private void H(Button button) {
        String str;
        if (Pan.Nl.tF()) {
            button.setText("弹幕服务已启用");
            str = "#2196F3";
        } else {
            button.setText("弹幕服务已禁用");
            str = "#E27C74";
        }
        n(button, str, "#1565C0");
    }

    public static /* synthetic */ void M(lW lWVar, Activity activity, EditText editText) {
        double d;
        double d2;
        if (lWVar.G.getWindow() != null) {
            Window window = lWVar.G.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int width = rect.width();
            rect.height();
            if (activity.getResources().getConfiguration().orientation == 2) {
                d2 = width;
                d = 0.6d;
            } else {
                d2 = width;
                d = 0.9d;
            }
            Double.isNaN(d2);
            attributes.width = (int) (d2 * d);
            attributes.height = -2;
            window.setAttributes(attributes);
            editText.requestFocus();
        }
    }

    public static void N(lW lWVar, List list, Activity activity, LinearLayout.LayoutParams layoutParams) {
        int i;
        lWVar.G4.removeAllViews();
        lWVar.F5 = list;
        lWVar.v3.clear();
        List<w4> list2 = lWVar.F5;
        if (list2 != null) {
            lWVar.v3.put("全部", list2);
            for (w4 w4Var : lWVar.F5) {
                if (w4Var != null) {
                    String SN2 = w4Var.SN();
                    if (SN2 == null) {
                        SN2 = "未知";
                    }
                    List<w4> list3 = lWVar.v3.get(SN2);
                    if (list3 == null) {
                        list3 = new ArrayList<>();
                        lWVar.v3.put(SN2, list3);
                    }
                    list3.add(w4Var);
                }
            }
        }
        lWVar.dT.removeAllViews();
        for (final String str : lWVar.v3.keySet()) {
            final Button button = new Button(lWVar.dT.getContext());
            StringBuilder yq2 = Sq.yq(str, "(");
            yq2.append(lWVar.v3.get(str).size());
            yq2.append(")");
            button.setText(yq2.toString());
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(12.0f);
            lWVar.un(button, "#2196F3", "#1565C0");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, Rc.q(36));
            layoutParams2.rightMargin = Rc.q(6);
            button.setLayoutParams(layoutParams2);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.Af
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lW.this.s(str, button);
                }
            });
            button.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.github.catvod.spider.merge.FM
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    lW.SN(lW.this, str, button, z);
                }
            });
            lWVar.dT.addView(button);
        }
        lWVar.Zm(lWVar.F5);
        if (list == null || list.size() <= 0) {
            i = Rc.q(100);
        } else {
            int size = list.size();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            int q = Rc.q(60) * size;
            double d = i2;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            i = Math.min(Math.max(q + Rc.q(16), Rc.q(100)), (int) (d * 0.7d));
        }
        layoutParams.height = i;
        lWVar.G4.requestLayout();
        WindowManager.LayoutParams attributes = lWVar.G.getWindow().getAttributes();
        attributes.height = Rc.q(180) + i;
        lWVar.G.getWindow().setAttributes(attributes);
    }

    public void Nl(EditText editText, EditText editText2, final Activity activity, final LinearLayout.LayoutParams layoutParams) {
        final String obj = editText.getText().toString();
        final String obj2 = editText2.getText().toString();
        if (!Rc.ee(obj)) {
            this.v3.clear();
            this.F5 = new ArrayList();
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
            this.G4.removeAllViews();
            this.G4.setVisibility(0);
            ProgressBar progressBar = new ProgressBar(activity);
            progressBar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
            this.G4.addView(progressBar);
            new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.Qp
                @Override // java.lang.Runnable
                public final void run() {
                    lW.Gc(lW.this, obj, obj2, activity, layoutParams);
                }
            }).start();
        }
    }

    public static String O(Response response) {
        if (!(response == null || response.body() == null)) {
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.body().byteStream(), "UTF-8"));
                char[] cArr = new char[1024];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (read != -1) {
                        sb.append(cArr, 0, read);
                    } else {
                        String sb2 = sb.toString();
                        bufferedReader.close();
                        return sb2;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    private void OW(String str, String str2) {
        W = str.replace("|", "-");
        StringBuilder yq2 = by.yq("http://127.0.0.1:9978/action?do=refresh&type=danmaku&path=");
        yq2.append(URLEncoder.encode(ProxyOrigin.getOwnProxyUrl() + "proxy?do=danmu&act=push&url=" + URLEncoder.encode(str2)));
        V3.tF(yq2.toString());
    }

    public static /* synthetic */ void SN(lW lWVar, String str, Button button, boolean z) {
        Objects.requireNonNull(lWVar);
        if (z) {
            lWVar.s(str, button);
        }
    }

    private String W(String str) {
        try {
            new HashMap().put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            HashMap hashMap = new HashMap();
            hashMap.put("top", "5");
            hashMap.put("right", "1");
            hashMap.put("left", "6");
            hashMap.put("bottom", "4");
            ArrayList arrayList = new ArrayList();
            String ee2 = ee(str, this.B, "data");
            if (Rc.ee(ee2)) {
                return null;
            }
            Iterator it = JsonParser.parseString(ee2).getAsJsonObject().getAsJsonArray("danmuku").iterator();
            int i = 0;
            while (it.hasNext()) {
                JsonArray asJsonArray = ((JsonElement) it.next()).getAsJsonArray();
                int asInt = asJsonArray.get(0).getAsInt();
                String asString = asJsonArray.get(4).getAsString();
                if (!asString.contains("danmuku") && !asString.contains("danum") && !asString.contains("4K动漫APP下载地址：123dm.xyz")) {
                    i++;
                    for (String str2 : this.yq) {
                        asString = asString.replace(str2, "");
                    }
                    String asString2 = asJsonArray.get(1).getAsString();
                    String asString3 = asJsonArray.get(2).getAsString();
                    String asString4 = asJsonArray.size() > 7 ? asJsonArray.get(7).getAsString() : "24px";
                    String str3 = ((String) hashMap.get(asString2)).isEmpty() ? "6" : (String) hashMap.get(asString2);
                    String replace = asString3.replace("#", "");
                    Objects.requireNonNull(replace);
                    if (replace.length() < 6) {
                        StringBuilder sb = new StringBuilder(6);
                        sb.append(replace);
                        int length = replace.length();
                        for (int i2 = 6; length < i2; i2 = 6) {
                            sb.append('F');
                            length++;
                        }
                        replace = sb.toString();
                    }
                    arrayList.add(String.format("<d p=\"%d,%s,%s,%d\">%s</d>", Integer.valueOf(asInt), str3, asString4.toLowerCase().replace("px", ""), Integer.valueOf(Integer.parseInt(replace, 16)), asString));
                }
            }
            if (i == 0) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><i><chatserver>chat.bilibili.com</chatserver><chatid>52175602</chatid><mission>0</mission><maxlimit>1000</maxlimit><state>0</state><real_name>0</real_name><source>k-v</source>");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb3.append((CharSequence) "");
                }
            }
            sb2.append(sb3.toString());
            sb2.append("</i>");
            return sb2.toString();
        } catch (Exception unused) {
            InitOrigin.show("弹幕处理异常");
            return null;
        }
    }

    private void Zm(List<w4> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        LinearLayout linearLayout = this.G4;
        if (linearLayout != null) {
            Context context = linearLayout.getContext();
            this.G4.removeAllViews();
            if (list.isEmpty()) {
                TextView textView = new TextView(context);
                textView.setText("未找到匹配的弹幕");
                textView.setTextColor(-7829368);
                textView.setGravity(17);
                this.G4.addView(textView);
                return;
            }
            for (final w4 w4Var : list) {
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, 0, 0, 0);
                linearLayout2.setLayoutParams(layoutParams);
                Button button = new Button(context);
                button.setText(w4Var.yq());
                button.setTextSize(13.0f);
                button.setAllCaps(false);
                button.setSingleLine(true);
                button.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                button.setMarqueeRepeatLimit(-1);
                button.setFocusableInTouchMode(true);
                button.setLayoutParams(new LinearLayout.LayoutParams(-1, Rc.q(45)));
                button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.SE
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        lW lWVar = lW.this;
                        w4 w4Var2 = w4Var;
                        Objects.requireNonNull(lWVar);
                        new Thread(new un(lWVar, w4Var2, 3)).start();
                    }
                });
                linearLayout2.addView(button);
                this.G4.addView(linearLayout2);
            }
        }
    }

    public void g(Button button) {
        if (Pan.Nl.tF()) {
            C0065Ku.i("goDanMuServer", "关闭");
            InitOrigin.execute(qv.yq);
            Pan.Nl.Gc(false);
            H(button);
            return;
        }
        C0065Ku.i("goDanMuServer", "默认");
        if (iX.ee != null) {
            InitOrigin.execute(A5.yq);
        }
        Pan.Nl.Gc(true);
        H(button);
        DexNative.danmuStart(true);
    }

    private Response g9(String str, boolean z) {
        try {
            Response M = C0068Pe.M(str, Rc.yq(), 15);
            if (M.code() == 200) {
                return M;
            }
            if (M.code() == 200 || !z) {
                return null;
            }
            M.close();
            Thread.sleep(2000L);
            return g9(str, false);
        } catch (Exception unused) {
            Thread.sleep(2000L);
            if (z) {
                return g9(str, false);
            }
            return null;
        }
    }

    public void n(Button button, String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Rc.q(4));
        gradientDrawable.setColor(button.hasFocus() ? Color.parseColor(str2) : Color.parseColor(str));
        button.setBackground(gradientDrawable);
        button.setOnFocusChangeListener(new N(button, str, str2));
    }

    public void s(String str, Button button) {
        Button button2 = this.t0;
        if (button2 != null) {
            un(button2, "#2196F3", "#1565C0");
        }
        un(button, "#1565C0", "#0D47A1");
        this.t0 = button;
        Zm(this.v3.get(str));
    }

    public static /* synthetic */ void t0(lW lWVar, w4 w4Var) {
        Objects.requireNonNull(lWVar);
        try {
            lWVar.OW(w4Var.yq(), w4Var.N());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0207, code lost:
        if (r26 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fa, code lost:
        if (r4 == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0130, code lost:
        if (r4 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0132, code lost:
        r4.clear();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x0181: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]), block:B:114:0x0181 */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x0188: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]), block:B:116:0x0188 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0183: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:114:0x0181 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x018a: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:116:0x0188 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017d A[Catch: Exception -> 0x0187, all -> 0x0244, TRY_LEAVE, TryCatch #15 {all -> 0x0244, blocks: (B:68:0x00f5, B:87:0x012b, B:90:0x0132, B:93:0x0139, B:96:0x0140, B:97:0x0143, B:99:0x014a, B:102:0x0152, B:104:0x0159, B:106:0x015f, B:107:0x0167, B:109:0x016e, B:111:0x0174, B:113:0x017d), top: B:253:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019c A[Catch: Exception -> 0x0241, TryCatch #26 {Exception -> 0x0241, blocks: (B:118:0x0194, B:121:0x019c, B:123:0x01b1, B:125:0x01b7, B:127:0x01bd, B:128:0x01c0, B:130:0x01cb, B:132:0x01dc, B:133:0x01e9, B:136:0x01f2, B:138:0x01f7, B:140:0x01fd, B:143:0x0209, B:144:0x020e, B:147:0x021a, B:151:0x0235, B:152:0x023c, B:164:0x026c, B:167:0x0274, B:169:0x0289, B:171:0x028f, B:173:0x0295, B:174:0x0298, B:176:0x02a3, B:178:0x02b4, B:179:0x02c1, B:182:0x02ca, B:184:0x02cf, B:186:0x02d5, B:190:0x02e3, B:193:0x02ef, B:197:0x0306), top: B:263:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f7 A[Catch: Exception -> 0x0241, TryCatch #26 {Exception -> 0x0241, blocks: (B:118:0x0194, B:121:0x019c, B:123:0x01b1, B:125:0x01b7, B:127:0x01bd, B:128:0x01c0, B:130:0x01cb, B:132:0x01dc, B:133:0x01e9, B:136:0x01f2, B:138:0x01f7, B:140:0x01fd, B:143:0x0209, B:144:0x020e, B:147:0x021a, B:151:0x0235, B:152:0x023c, B:164:0x026c, B:167:0x0274, B:169:0x0289, B:171:0x028f, B:173:0x0295, B:174:0x0298, B:176:0x02a3, B:178:0x02b4, B:179:0x02c1, B:182:0x02ca, B:184:0x02cf, B:186:0x02d5, B:190:0x02e3, B:193:0x02ef, B:197:0x0306), top: B:263:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0274 A[Catch: Exception -> 0x0241, TryCatch #26 {Exception -> 0x0241, blocks: (B:118:0x0194, B:121:0x019c, B:123:0x01b1, B:125:0x01b7, B:127:0x01bd, B:128:0x01c0, B:130:0x01cb, B:132:0x01dc, B:133:0x01e9, B:136:0x01f2, B:138:0x01f7, B:140:0x01fd, B:143:0x0209, B:144:0x020e, B:147:0x021a, B:151:0x0235, B:152:0x023c, B:164:0x026c, B:167:0x0274, B:169:0x0289, B:171:0x028f, B:173:0x0295, B:174:0x0298, B:176:0x02a3, B:178:0x02b4, B:179:0x02c1, B:182:0x02ca, B:184:0x02cf, B:186:0x02d5, B:190:0x02e3, B:193:0x02ef, B:197:0x0306), top: B:263:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02cf A[Catch: Exception -> 0x0241, TryCatch #26 {Exception -> 0x0241, blocks: (B:118:0x0194, B:121:0x019c, B:123:0x01b1, B:125:0x01b7, B:127:0x01bd, B:128:0x01c0, B:130:0x01cb, B:132:0x01dc, B:133:0x01e9, B:136:0x01f2, B:138:0x01f7, B:140:0x01fd, B:143:0x0209, B:144:0x020e, B:147:0x021a, B:151:0x0235, B:152:0x023c, B:164:0x026c, B:167:0x0274, B:169:0x0289, B:171:0x028f, B:173:0x0295, B:174:0x0298, B:176:0x02a3, B:178:0x02b4, B:179:0x02c1, B:182:0x02ca, B:184:0x02cf, B:186:0x02d5, B:190:0x02e3, B:193:0x02ef, B:197:0x0306), top: B:263:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0331 A[Catch: Exception -> 0x03d7, TryCatch #17 {Exception -> 0x03d7, blocks: (B:204:0x0329, B:207:0x0331, B:209:0x0346, B:211:0x034c, B:213:0x0352, B:214:0x0355, B:216:0x0362, B:218:0x0373, B:220:0x0382, B:224:0x038c, B:226:0x0393, B:228:0x0399, B:231:0x03a5, B:232:0x03a9, B:235:0x03b5, B:239:0x03cc), top: B:254:0x0329 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0393 A[Catch: Exception -> 0x03d7, TryCatch #17 {Exception -> 0x03d7, blocks: (B:204:0x0329, B:207:0x0331, B:209:0x0346, B:211:0x034c, B:213:0x0352, B:214:0x0355, B:216:0x0362, B:218:0x0373, B:220:0x0382, B:224:0x038c, B:226:0x0393, B:228:0x0399, B:231:0x03a5, B:232:0x03a9, B:235:0x03b5, B:239:0x03cc), top: B:254:0x0329 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01f5 A[EDGE_INSN: B:283:0x01f5->B:137:0x01f5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x02cd A[EDGE_INSN: B:288:0x02cd->B:183:0x02cd ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0391 A[EDGE_INSN: B:293:0x0391->B:225:0x0391 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0140 A[Catch: Exception -> 0x0187, all -> 0x0244, TRY_ENTER, TryCatch #15 {all -> 0x0244, blocks: (B:68:0x00f5, B:87:0x012b, B:90:0x0132, B:93:0x0139, B:96:0x0140, B:97:0x0143, B:99:0x014a, B:102:0x0152, B:104:0x0159, B:106:0x015f, B:107:0x0167, B:109:0x016e, B:111:0x0174, B:113:0x017d), top: B:253:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.nio.channels.Channel] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.nio.channels.Channel] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.nio.channels.ReadableByteChannel, java.nio.channels.Channel] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.nio.channels.WritableByteChannel, java.nio.channels.spi.AbstractInterruptibleChannel, java.nio.channels.Pipe$SinkChannel] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void tF(com.github.catvod.spider.merge.lW r28, boolean r29, java.nio.channels.Pipe.SinkChannel r30) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.lW.tF(com.github.catvod.spider.merge.lW, boolean, java.nio.channels.Pipe$SinkChannel):void");
    }

    private void un(Button button, String str, String str2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str2));
        gradientDrawable.setCornerRadius(Rc.q(4));
        stateListDrawable.addState(new int[]{16842908}, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor(str));
        gradientDrawable2.setCornerRadius(Rc.q(4));
        stateListDrawable.addState(new int[0], gradientDrawable2);
        button.setBackground(stateListDrawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r7.charAt(0) == '0') goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r7.charAt(0) == '0') goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        return r7.replace("0", "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String v(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "S0"
            boolean r0 = r7.contains(r0)
            java.lang.String r1 = "0"
            r2 = 48
            r3 = 0
            r4 = 1
            java.lang.String r5 = ""
            if (r0 != 0) goto L3c
            java.lang.String r0 = "s0"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L19
            goto L3c
        L19:
            java.util.regex.Pattern r0 = r6.tF
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.find()
            if (r0 == 0) goto L59
            java.lang.String r7 = r7.group(r4)
            int r0 = r7.length()
            if (r0 <= 0) goto L3a
            char r0 = r7.charAt(r3)
            if (r0 != r2) goto L3a
        L35:
            java.lang.String r5 = r7.replace(r1, r5)
            goto L59
        L3a:
            r5 = r7
            goto L59
        L3c:
            java.util.regex.Pattern r0 = r6.zH
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.find()
            if (r0 == 0) goto L59
            java.lang.String r7 = r7.group(r4)
            int r0 = r7.length()
            if (r0 <= 0) goto L3a
            char r0 = r7.charAt(r3)
            if (r0 != r2) goto L3a
            goto L35
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.lW.v(java.lang.String):java.lang.String");
    }

    private List<w4> v3(String str, String str2) {
        String str3;
        try {
            String ee2 = ee(URLEncoder.encode(str) + "&regSrc=" + str2, this.KJ, "search");
            if (Rc.ee(ee2)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (ee2.contains(str)) {
                JSONArray jSONArray = new JSONArray(ee2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("name");
                    String string2 = jSONObject.getString("url");
                    String str4 = "其它";
                    String[] split = string.split("\\|");
                    if (split.length > 1) {
                        str4 = split[0];
                        str3 = string.substring(str4.length() + 1);
                    } else {
                        str3 = string;
                    }
                    if (!this.M.matcher(string).find()) {
                        w4 w4Var = new w4();
                        w4Var.zH(str4);
                        w4Var.tF(str3);
                        w4Var.i(string2);
                        arrayList.add(w4Var);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    private static String xa(String str) {
        String str2 = cn.zH;
        if (str2.startsWith("8J+")) {
            str2 = new String(Base64.decode(str2, 0));
        }
        return str.replace("4K", "").replace(str2, "").replace("正在播放：", "").replace("4k", "").replace("1080", "").replace("2160", "").replace("120FPS", "").replace("60FPS", "").replace("120fps", "").replace("60fps", "").replaceAll("[a-zA-Z]26\\d", "").replaceAll("[a-zA-Z][a-zA-Z]4", "").replaceAll("19\\d\\d", "").replaceAll("20\\d\\d", "").replace("5.1", "").replace("2.0", "").replace("7.1", "").replace("10BIT", "").replace("10bit", "").replace("H.265", "").replace("h.265", "").replaceAll("\\d+-\\d+", "").replaceAll("第\\d+季", "").replaceAll("[\\[][^\\]]*[\\]]", "");
    }

    public static /* synthetic */ void yq(lW lWVar, Activity activity, LinearLayout.LayoutParams layoutParams) {
        lWVar.G4.removeAllViews();
        TextView textView = new TextView(activity);
        textView.setText("搜索失败，请重试");
        textView.setGravity(17);
        lWVar.G4.addView(textView);
        layoutParams.height = Rc.q(100);
        lWVar.G4.requestLayout();
    }

    public static /* synthetic */ tF zH(lW lWVar, String str, String str2) {
        StringBuilder sb;
        Objects.requireNonNull(lWVar);
        if (str2.startsWith("http")) {
            sb = by.yq(str);
            str2 = URLEncoder.encode(str2);
        } else {
            sb = by.yq(str);
        }
        sb.append(str2);
        Response g92 = lWVar.g9(sb.toString(), true);
        if (g92 == null || !g92.isSuccessful() || g92.code() != 200) {
            return null;
        }
        return new tF(g92);
    }

    public final Object[] Dr() {
        System.gc();
        if (this.i) {
            return null;
        }
        this.i = true;
        Pipe open = Pipe.open();
        final Pipe.SinkChannel sink = open.sink();
        Pipe.SourceChannel source = open.source();
        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.Mx
            public final /* synthetic */ boolean SN = false;

            @Override // java.lang.Runnable
            public final void run() {
                lW.tF(lW.this, this.SN, sink);
            }
        }).start();
        return new Object[]{200, "text/xml; charset=utf-8", Channels.newInputStream(source)};
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[Catch: Exception -> 0x016d, TryCatch #0 {Exception -> 0x016d, blocks: (B:5:0x0013, B:9:0x0022, B:11:0x0036, B:13:0x003e, B:16:0x0047, B:18:0x0053, B:20:0x005e, B:23:0x0069, B:24:0x0071, B:26:0x007f, B:28:0x0089, B:29:0x0094, B:30:0x0099, B:31:0x009d, B:32:0x00a1, B:35:0x00b4, B:37:0x00bc, B:41:0x00c4, B:44:0x00df, B:46:0x00e9, B:48:0x00f3, B:50:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0118, B:57:0x011e, B:59:0x0130, B:60:0x0146, B:62:0x0154, B:63:0x0158, B:65:0x015e, B:67:0x0161, B:69:0x0167), top: B:78:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e A[Catch: Exception -> 0x016d, TryCatch #0 {Exception -> 0x016d, blocks: (B:5:0x0013, B:9:0x0022, B:11:0x0036, B:13:0x003e, B:16:0x0047, B:18:0x0053, B:20:0x005e, B:23:0x0069, B:24:0x0071, B:26:0x007f, B:28:0x0089, B:29:0x0094, B:30:0x0099, B:31:0x009d, B:32:0x00a1, B:35:0x00b4, B:37:0x00bc, B:41:0x00c4, B:44:0x00df, B:46:0x00e9, B:48:0x00f3, B:50:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0118, B:57:0x011e, B:59:0x0130, B:60:0x0146, B:62:0x0154, B:63:0x0158, B:65:0x015e, B:67:0x0161, B:69:0x0167), top: B:78:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167 A[Catch: Exception -> 0x016d, TRY_LEAVE, TryCatch #0 {Exception -> 0x016d, blocks: (B:5:0x0013, B:9:0x0022, B:11:0x0036, B:13:0x003e, B:16:0x0047, B:18:0x0053, B:20:0x005e, B:23:0x0069, B:24:0x0071, B:26:0x007f, B:28:0x0089, B:29:0x0094, B:30:0x0099, B:31:0x009d, B:32:0x00a1, B:35:0x00b4, B:37:0x00bc, B:41:0x00c4, B:44:0x00df, B:46:0x00e9, B:48:0x00f3, B:50:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0118, B:57:0x011e, B:59:0x0130, B:60:0x0146, B:62:0x0154, B:63:0x0158, B:65:0x015e, B:67:0x0161, B:69:0x0167), top: B:78:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F5() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.lW.F5():java.lang.Object");
    }

    public final void b(String str, String str2) {
        final Activity activity = InitOrigin.getActivity();
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        int q = Rc.q(16);
        linearLayout.setPadding(q, q, q, q);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setWeightSum(2.0f);
        final EditText editText = new EditText(activity);
        editText.setHint("视频名称");
        editText.setText(str);
        g9 = str;
        editText.setTextSize(14.0f);
        editText.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, Rc.q(40));
        layoutParams.weight = 1.5f;
        editText.setLayoutParams(layoutParams);
        linearLayout2.addView(editText);
        final EditText editText2 = new EditText(activity);
        editText2.setHint("集数");
        editText2.setText(str2);
        editText2.setTextSize(14.0f);
        editText2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, Rc.q(40));
        layoutParams2.weight = 0.5f;
        layoutParams2.leftMargin = Rc.q(8);
        editText2.setLayoutParams(layoutParams2);
        linearLayout2.addView(editText2);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.setWeightSum(2.0f);
        Button button = new Button(activity);
        button.setText("搜索弹幕");
        button.setTextColor(-1);
        button.setFocusable(true);
        un(button, "#2196F3", "#1565C0");
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, Rc.q(40));
        layoutParams3.weight = 1.0f;
        layoutParams3.rightMargin = Rc.q(4);
        linearLayout3.addView(button, layoutParams3);
        final Button button2 = new Button(activity);
        button2.setTextColor(-1);
        button2.setFocusable(true);
        H(button2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, Rc.q(40));
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = Rc.q(4);
        linearLayout3.addView(button2, layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = Rc.q(8);
        linearLayout.addView(linearLayout3, layoutParams5);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(activity);
        LinearLayout linearLayout4 = new LinearLayout(activity);
        this.dT = linearLayout4;
        linearLayout4.setOrientation(0);
        horizontalScrollView.addView(this.dT);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = Rc.q(8);
        linearLayout.addView(horizontalScrollView, layoutParams6);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setFillViewport(true);
        LinearLayout linearLayout5 = new LinearLayout(activity);
        this.G4 = linearLayout5;
        linearLayout5.setOrientation(1);
        this.G4.setGravity(48);
        scrollView.addView(this.G4);
        final LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams7.topMargin = Rc.q(8);
        layoutParams7.weight = 1.0f;
        linearLayout.addView(scrollView, layoutParams7);
        scrollView.setFillViewport(true);
        scrollView.setPadding(0, 0, 0, Rc.q(20));
        this.G4.setPadding(0, 0, 0, Rc.q(10));
        AlertDialog create = new AlertDialog.Builder(activity).setView(linearLayout).create();
        this.G = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.github.catvod.spider.merge.kY
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                lW.M(lW.this, activity, editText);
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.PE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lW.this.Nl(editText, editText2, activity, layoutParams7);
            }
        });
        button.setOnKeyListener(new yq(editText, editText2, activity, layoutParams7));
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.Sn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lW.this.g(button2);
            }
        });
        button2.setOnKeyListener(new SN(button2));
        this.G.setOnDismissListener(vb.SN);
        this.G.show();
    }

    public final String ee(final String str, List<String> list, String str2) {
        if (list.size() == 0) {
            return null;
        }
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(list.size());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
        ArrayList arrayList = new ArrayList();
        for (final String str3 : list) {
            arrayList.add(executorCompletionService.submit(new Callable() { // from class: com.github.catvod.spider.merge.Qf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return lW.zH(lW.this, str3, str);
                }
            }));
        }
        for (int i = 0; i < list.size(); i++) {
            try {
                tF tFVar = (tF) executorCompletionService.take().get();
                if (tFVar != null) {
                    Response yq2 = tFVar.yq();
                    if (!str2.equals("data")) {
                        return O(yq2);
                    }
                    String O = O(yq2);
                    if (O.contains("<i>") && O.length() > 300) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Future future = (Future) it.next();
                            if (!future.isDone() && !future.isCancelled()) {
                                future.cancel(true);
                            }
                        }
                        return O;
                    }
                } else {
                    continue;
                }
            } catch (Exception e) {
                PrintStream printStream = System.out;
                printStream.println("Execution-Error retrieving task result-" + e);
            }
        }
        newFixedThreadPool.shutdown();
        return null;
    }

    public final void g1() {
        String str;
        String str2;
        if (!xa.get()) {
            xa.set(true);
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < 10; i++) {
                String q = V3.q("http://127.0.0.1:9978/media", null);
                if (!q.isEmpty()) {
                    jSONObject = new JSONObject(q);
                    if (jSONObject.has("title")) {
                        break;
                    }
                }
                Thread.sleep(1000L);
            }
            String optString = jSONObject.optString("artist");
            if (Rc.ee(optString)) {
                String string = jSONObject.getString("title");
                if (string.contains(" ")) {
                    String[] split = jSONObject.getString("title").split(" ");
                    optString = split[1];
                    str2 = split[0];
                } else {
                    str = Gd(string);
                    InitOrigin.getActivity().runOnUiThread(new hu(this, str, v(xa(optString)), 0));
                }
            } else {
                str2 = jSONObject.getString("title");
            }
            str = Gd(str2);
            InitOrigin.getActivity().runOnUiThread(new hu(this, str, v(xa(optString)), 0));
        }
    }
}
