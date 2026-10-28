package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0080aF;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.Z;
import com.github.catvod.spider.merge.iX;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Cloud_quark extends Spider {
    private static String N = "";
    public static boolean tF;
    private final Pattern yq = Pattern.compile("/s/([^/]+)#(/list/share/([^/]+))?");
    private final Pattern SN = Pattern.compile("/s/([^/]+)");

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get("type");
        if (str.equals("sub")) {
            return Z.Zm().OB(map);
        }
        if (str.equals("302")) {
            return Z.Zm().u7();
        }
        str.equals("play");
        if (str.equals("input")) {
            return Z.Zm().o(map);
        }
        return null;
    }

    public static Object[] proxys(Map<String, String> map, Map<String, String> map2, String str) {
        return Z.Zm().cS(map, map2);
    }

    public String detailContent(List<String> list) {
        ME detailVideo = detailVideo(list, "");
        return detailVideo == null ? "" : iX.v(detailVideo);
    }

    public ME detailVideo(List<String> list, String str) {
        if (Rc.ee(Z.Zm().F5)) {
            N = "";
        }
        String replace = list.get(0).trim().replace("?entry=funletu", "");
        Matcher matcher = this.yq.matcher(replace);
        if (!matcher.find()) {
            matcher = this.SN.matcher(replace);
            if (!matcher.find()) {
                return null;
            }
        }
        return Z.Zm().XO(matcher.group(1), str);
    }

    public void init(Context context, String str) {
        String str2;
        Objects.requireNonNull(Z.Zm());
        try {
            if (!Rc.ee(str)) {
                str2 = new JSONObject(str).optString("Cloud-drive");
                if (str2.startsWith("./")) {
                    str2 = new JSONObject(V3.q(ProxyOrigin.getFileUrl() + str2.replace(".", ""), null)).getString("quarkCookie");
                }
                if (str2.startsWith("http")) {
                    str2 = C0068Pe.v(str2, null, 3);
                    if (str2.contains("quarkCookie")) {
                        str2 = new JSONObject(str2).optString("quarkCookie");
                    }
                }
            } else {
                str2 = "";
            }
            if (!str2.contains("pus")) {
                str2 = "";
            }
            ArrayList arrayList = new ArrayList();
            Application context2 = InitOrigin.context();
            InitOrigin.context();
            String string = context2.getSharedPreferences("pan_source_sort", 0).getString("sort", "");
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split("\\|");
                int min = Math.min(split.length, 2);
                for (int i = 0; i < min; i++) {
                    if ("4K".equalsIgnoreCase(split[i])) {
                        arrayList.add("夸父原");
                    }
                    if ("AUTO".equalsIgnoreCase(split[i])) {
                        arrayList.add("夸父智");
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add("夸父原");
                arrayList.add("夸父智");
            }
            Z.Zm().s0(str2, arrayList);
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            if (!tF && !Rc.ee(Z.Zm().F5)) {
                if (Z.Zm().Gd()) {
                    boolean z = Z.Zm().g9;
                    tF = true;
                } else {
                    tF = true;
                    return Pan.msg("未扫码授权无法播放，刚已扫码的请刷新").toString();
                }
            }
            if ((Rc.ee(Z.Zm().F5) || Rc.ee(Z.Zm().W)) && !N.replaceAll("[智原存]", "").equals(str.replaceAll("[智原存]", ""))) {
                Z.Zm().Gd();
                N = str;
                tF = true;
            }
            C0080aF.G4 = str;
            return Z.Zm().Cu(str2, str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void setFlag(String str) {
        N = "";
    }
}
