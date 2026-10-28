package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0080aF;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.iX;
import java.io.ByteArrayInputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Cloud_ali extends Spider {
    public static final Pattern yq = Pattern.compile("(www.aliyundrive.com|www.alipan.com)/s/([^/]+)(/folder/([^/]+))?");
    private static String SN = "";
    public static boolean N = false;

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get("type");
        String str2 = map.get("flag");
        if (str.equals("sub")) {
            return V.v().J(map);
        }
        if (str.equals("token")) {
            V v = V.v();
            Objects.requireNonNull(v);
            return new Object[]{200, "text/plain", new ByteArrayInputStream(v.Gc.t0().getBytes())};
        } else if (str.equals("m3u8")) {
            return V.v().R(map, str2);
        } else {
            if (str.equals("302")) {
                return V.v().xU();
            }
            if (!str.equals("input")) {
                return null;
            }
            V v2 = V.v();
            Objects.requireNonNull(v2);
            String replace = URLDecoder.decode(map.get("推送")).replace(" ", "+");
            if (TextUtils.isEmpty(replace)) {
                return null;
            }
            Pan.dismissInputQRCode();
            v2.zH = replace;
            InitOrigin.show("恭喜！Token设置成功！");
            return new Object[]{200, "text/html", new ByteArrayInputStream(new byte[0])};
        }
    }

    public static Object[] proxys(Map<String, String> map, Map<String, String> map2, String str) {
        return V.v().N0(map, map2);
    }

    public String detailContent(List<String> list) {
        ME detailVideo = detailVideo(list, "");
        return detailVideo == null ? "" : iX.v(detailVideo);
    }

    public ME detailVideo(List<String> list, String str) {
        String str2 = "";
        if (Rc.ee(V.v().Gc.SN())) {
            SN = str2;
        }
        String trim = list.get(0).trim();
        Matcher matcher = yq.matcher(trim);
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(2);
        if (matcher.groupCount() == 4) {
            str2 = matcher.group(4);
        }
        return V.v().H(trim, group, str2, str);
    }

    public void init(Context context, String str) {
        String str2;
        String str3 = "";
        Objects.requireNonNull(V.v());
        try {
            if (!Rc.ee(str)) {
                str2 = new JSONObject(str).optString("Cloud-drive");
                try {
                    if (str2.startsWith("./")) {
                        str2 = new JSONObject(V3.q(ProxyOrigin.getFileUrl() + str2.replace(".", str3), null)).optString("token");
                    }
                    if (str2.startsWith("http")) {
                        str2 = C0068Pe.v(str2, null, 3);
                        if (str2.contains("token")) {
                            str2 = new JSONObject(str2).optString("token");
                        }
                    }
                } catch (Exception unused) {
                    str3 = str2;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("阿狸原");
                    arrayList.add("阿狸智");
                    V.v().Q4(str3, arrayList);
                    return;
                }
            } else {
                str2 = str3;
            }
            if (str2.length() != 32) {
                str2 = str3;
            }
            ArrayList arrayList2 = new ArrayList();
            Application context2 = InitOrigin.context();
            InitOrigin.context();
            String string = context2.getSharedPreferences("pan_source_sort", 0).getString("sort", str3);
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split("\\|");
                int min = Math.min(split.length, 2);
                for (int i = 0; i < min; i++) {
                    if ("4K".equalsIgnoreCase(split[i])) {
                        arrayList2.add("阿狸原");
                    }
                    if ("AUTO".equalsIgnoreCase(split[i])) {
                        arrayList2.add("阿狸智");
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add("阿狸原");
                arrayList2.add("阿狸智");
            }
            V.v().Q4(str2, arrayList2);
        } catch (Exception unused2) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        if (!N && (!Rc.ee(V.v().Gc.t0()) || !Rc.ee(V.v().zH))) {
            V.v().G4();
            N = true;
        }
        if (Rc.ee(V.v().Gc.SN()) && !SN.replaceAll("[智原存]", "").equals(str.replaceAll("[智原存]", ""))) {
            V.v().G4();
            SN = str;
            N = true;
        }
        C0080aF.G4 = str;
        return V.v().Z(str2, str);
    }

    public void setFlag(String str) {
        SN = "";
    }
}
