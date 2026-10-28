package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.C0080aF;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.iX;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Cloud_uc extends Spider {
    private static String N = "";
    public static boolean tF;
    private final Pattern yq = Pattern.compile("/s/([^/]+)#(/list/share/([^/]+))?");
    private final Pattern SN = Pattern.compile("/s/([^/]+)");

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get("type");
        if (str.equals("sub")) {
            return C0203xU.s().Cu(map);
        }
        if (str.equals("302")) {
            return C0203xU.s().kR();
        }
        if (str.equals("input")) {
            return C0203xU.s().w(map);
        }
        return null;
    }

    public static Object[] proxys(Map<String, String> map, Map<String, String> map2, String str) {
        return C0203xU.s().L(map, map2);
    }

    public String detailContent(List<String> list) {
        ME detailVideo = detailVideo(list, "");
        return detailVideo == null ? "" : iX.v(detailVideo);
    }

    public ME detailVideo(List<String> list, String str) {
        if (Rc.ee(C0203xU.s().Gc) || (Rc.ee(C0203xU.s().F5.SN()) && N.contains("智"))) {
            N = "";
        }
        String replace = list.get(0).trim().replace("?public=1", "");
        Matcher matcher = this.yq.matcher(replace);
        if (!matcher.find()) {
            matcher = this.SN.matcher(replace);
            if (!matcher.find()) {
                return null;
            }
        }
        String group = matcher.group(1);
        if (matcher.groupCount() == 3) {
            matcher.group(3);
        }
        return C0203xU.s().p(group, str);
    }

    public void init(Context context, String str) {
        String str2;
        Objects.requireNonNull(C0203xU.s());
        try {
            if (!Rc.ee(str)) {
                str2 = new JSONObject(str).optString("Cloud-drive");
                if (str2.startsWith("./")) {
                    JSONObject jSONObject = new JSONObject(V3.q(ProxyOrigin.getFileUrl() + str2.replace(".", ""), null));
                    str2 = jSONObject.optString("ucCookie");
                    C0203xU.s().F5.KJ(jSONObject.optString("ucToken"));
                }
                if (str2.startsWith("http")) {
                    JSONObject jSONObject2 = new JSONObject(C0068Pe.v(str2, null, 3));
                    str2 = jSONObject2.optString("ucCookie");
                    if (!Rc.ee(jSONObject2.optString("ucToken"))) {
                        C0203xU.s().F5.KJ(jSONObject2.optString("ucToken"));
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
                        if (!(split.length == 3 && i == 0) && (split.length != 2 || !split[1].equals("uc"))) {
                            arrayList.add("优汐无限");
                        } else {
                            arrayList.add("优汐智");
                        }
                    }
                    if ("AUTO".equalsIgnoreCase(split[i])) {
                        if (split.length == 3 && i == 1) {
                            arrayList.add("优汐无限");
                        } else {
                            arrayList.add("优汐智");
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add("优汐智");
                arrayList.add("优汐无限");
            }
            C0203xU.s().Fo(str2, arrayList);
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            if (!tF && !Rc.ee(C0203xU.s().Gc)) {
                if (C0203xU.s().ee()) {
                    boolean z = C0203xU.s().ee;
                    tF = true;
                } else {
                    tF = true;
                    return Pan.msg("未扫码授权无法播放，刚已扫码的请刷新").toString();
                }
            }
            if (!Rc.ee(C0203xU.s().Gc) && !Rc.ee(C0203xU.s().OW)) {
                if (!Rc.ee(C0203xU.s().F5.SN()) || !str.contains("智")) {
                    if (!C0203xU.s().yq) {
                        C0203xU.s().cS();
                    }
                } else if (!N.replaceAll("[智存]", "").equals(str.replaceAll("[智存]", ""))) {
                    C0203xU.s().cp();
                    N = str;
                }
                C0080aF.G4 = str;
                return C0203xU.s().o(str2, str);
            }
            if (!N.replaceAll("[智无限存]", "").equals(str.replaceAll("[智无限存]", ""))) {
                C0203xU.s().ee();
            }
            if (Rc.ee(C0203xU.s().F5.SN()) && str.contains("智") && !Rc.ee(C0203xU.s().Gc) && !N.replaceAll("[智无限存]", "").equals(str.replaceAll("[智无限存]", ""))) {
                Thread.sleep(1000L);
                C0203xU.s().cp();
            }
            N = str;
            tF = true;
            C0080aF.G4 = str;
            return C0203xU.s().o(str2, str);
        } catch (Exception e) {
            InitOrigin.show(e.toString() + "---");
            return "";
        }
    }

    public void setFlag(String str) {
        N = "";
    }
}
