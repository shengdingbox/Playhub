package com.github.catvod.spider.merge;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.ProxyOrigin;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class iX {
    public static String ee;
    @SerializedName("parse")
    private int B;
    @SerializedName("limit")
    private Integer F5;
    @SerializedName("jx")
    private int G;
    @SerializedName("page")
    private Integer G4;
    @SerializedName("msg")
    private String Gc;
    @SerializedName("url")
    private Object KJ;
    @SerializedName("errMsg")
    private String M;
    @SerializedName("filters")
    private LinkedHashMap<String, List<p9>> N;
    @SerializedName("list")
    private List<ME> SN;
    @SerializedName("cover")
    private String W;
    @SerializedName("pagecount")
    private Integer dT;
    @SerializedName("danmaku")
    private String i;
    @SerializedName("subs")
    private List<gU> q;
    @SerializedName("click")
    private String t0;
    @SerializedName("header")
    private String tF;
    @SerializedName("artwork")
    private String v;
    @SerializedName("total")
    private Integer v3;
    @SerializedName("class")
    private List<rP> yq;
    @SerializedName("format")
    private String zH;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class yq extends TypeToken<LinkedHashMap<String, List<p9>>> {
        yq() {
        }
    }

    public static String G(String str) {
        iX iXVar = new iX();
        iXVar.Gc = str;
        iXVar.M = str;
        return iXVar.toString();
    }

    public static iX Gc() {
        return new iX();
    }

    public static String Gd(List<rP> list, List<ME> list2, LinkedHashMap<String, List<p9>> linkedHashMap) {
        iX iXVar = new iX();
        iXVar.yq = list;
        iXVar.SN = list2;
        iXVar.N = linkedHashMap;
        return iXVar.toString();
    }

    public static String M(String str) {
        ee = str;
        FA fa = Pan.Nl;
        if (fa == null) {
            return ProxyOrigin.getUrl() + "?do=danmu&act=&url=" + URLEncoder.encode(str);
        } else if (fa.tF() && !InitOrigin.context().getPackageName().contains("okys")) {
            return ProxyOrigin.getUrl() + "?do=danmu&act=&url=" + URLEncoder.encode(str);
        } else if (!Pan.Nl.yq()) {
            return "";
        } else {
            return ProxyOrigin.getUrl() + "proxy?do=noDanmu";
        }
    }

    public static String Nl(List<rP> list, List<ME> list2, JSONObject jSONObject) {
        iX iXVar = new iX();
        iXVar.yq = list;
        iXVar.SN = list2;
        iXVar.t0(jSONObject);
        return iXVar.toString();
    }

    public static String OW(List<rP> list, JSONObject jSONObject) {
        iX iXVar = new iX();
        iXVar.yq = list;
        iXVar.t0(jSONObject);
        return iXVar.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String ee(List<?> list) {
        iX iXVar;
        if (list.isEmpty()) {
            return "";
        }
        if (list.get(0) instanceof ME) {
            iXVar = new iX();
            iXVar.SN = list;
        } else if (!(list.get(0) instanceof rP)) {
            return "";
        } else {
            iXVar = new iX();
            iXVar.yq = list;
        }
        return iXVar.toString();
    }

    public static String g9(List<rP> list, LinkedHashMap<String, List<p9>> linkedHashMap) {
        iX iXVar = new iX();
        iXVar.yq = list;
        iXVar.N = linkedHashMap;
        return iXVar.toString();
    }

    public static String i() {
        iX iXVar = new iX();
        iXVar.SN = Collections.emptyList();
        iXVar.Gc = "比赛尚未开始";
        iXVar.M = "比赛尚未开始";
        return iXVar.toString();
    }

    public static String v(ME me) {
        iX iXVar = new iX();
        iXVar.un(me);
        return iXVar.toString();
    }

    public static String xa(List<rP> list, List<ME> list2) {
        iX iXVar = new iX();
        iXVar.yq = list;
        iXVar.SN = list2;
        return iXVar.toString();
    }

    public final iX B(String str) {
        this.Gc = str;
        this.M = str;
        return this;
    }

    public final iX F5() {
        this.B = 1;
        return this;
    }

    public final iX G4() {
        this.zH = "application/octet-stream";
        return this;
    }

    public final iX KJ(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.tF = new Gson().toJson(map);
        return this;
    }

    public final iX N(String str) {
        this.W = str;
        return this;
    }

    public final iX O(List<gU> list) {
        this.q = list;
        return this;
    }

    public final iX SN(List<rP> list) {
        this.yq = list;
        return this;
    }

    public final String W() {
        return toString();
    }

    public final iX b(List<ME> list) {
        this.SN = list;
        return this;
    }

    public final iX dT(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.G4 = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.F5 = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.v3 = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.dT = Integer.valueOf(i2);
        return this;
    }

    public final iX g1(String str) {
        this.KJ = str;
        if (!str.isEmpty()) {
            this.i = M(str);
        }
        return this;
    }

    public final iX n(List<String> list) {
        this.KJ = list;
        return this;
    }

    public final iX q() {
        this.G = 1;
        return this;
    }

    public final iX s(String str, boolean z) {
        this.KJ = str;
        if (!str.isEmpty() && z) {
            this.i = M(str);
        }
        return this;
    }

    public final iX t0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        this.N = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new yq().getType());
        return this;
    }

    public final iX tF(String str) {
        this.i = str;
        return this;
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    public final iX un(ME me) {
        this.SN = Arrays.asList(me);
        return this;
    }

    public final iX v3() {
        this.B = 1;
        return this;
    }

    public final iX yq(String str) {
        this.v = str;
        return this;
    }

    public final iX zH() {
        this.zH = "application/dash+xml";
        return this;
    }
}
