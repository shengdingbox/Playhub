package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class LP {
    @SerializedName("duration")
    private Long B;
    @SerializedName("pages")
    private List<RO> F5;
    @SerializedName("desc")
    private String G;
    @SerializedName("accept_description")
    private List<String> G4;
    @SerializedName("cid")
    private String Gc;
    @SerializedName("tname")
    private String KJ;
    @SerializedName("title")
    private String M;
    @SerializedName("isLogin")
    private Boolean N;
    @SerializedName("list")
    private JsonElement SN;
    @SerializedName("owner")
    private fk W;
    @SerializedName("accept_quality")
    private List<Integer> dT;
    @SerializedName("url")
    private String i;
    @SerializedName("pic")
    private String q;
    @SerializedName("aid")
    private String t0;
    @SerializedName("vipStatus")
    private Integer tF;
    @SerializedName("wbi_img")
    private g8 v;
    @SerializedName("dash")
    private Zc v3;
    @SerializedName("result")
    private JsonElement yq;
    @SerializedName("qrcode_key")
    private String zH;

    public final String B() {
        return TextUtils.isEmpty(this.M) ? "" : this.M;
    }

    public final boolean F5() {
        Integer num = this.tF;
        return (num == null || num.intValue() == 0) ? false : true;
    }

    public final String G() {
        return TextUtils.isEmpty(this.KJ) ? "" : this.KJ;
    }

    public final g8 G4() {
        g8 g8Var = this.v;
        return g8Var == null ? new g8() : g8Var;
    }

    public final fk Gc() {
        fk fkVar = this.W;
        return fkVar == null ? new fk() : fkVar;
    }

    public final String KJ() {
        return TextUtils.isEmpty(this.q) ? "" : this.q;
    }

    public final List<RO> M() {
        List<RO> list = this.F5;
        return list == null ? Collections.emptyList() : list;
    }

    public final String N() {
        return TextUtils.isEmpty(this.Gc) ? "" : this.Gc;
    }

    public final List<Integer> SN() {
        List<Integer> list = this.dT;
        return list == null ? Collections.emptyList() : list;
    }

    public final boolean dT() {
        Boolean bool = this.N;
        return bool != null && bool.booleanValue();
    }

    public final Long i() {
        Long l = this.B;
        return Long.valueOf(l == null ? 0L : l.longValue());
    }

    public final JsonElement q() {
        return this.yq;
    }

    public final JsonElement t0() {
        return this.SN;
    }

    public final Zc tF() {
        Zc zc = this.v3;
        return zc == null ? new Zc() : zc;
    }

    public final List<String> yq() {
        List<String> list = this.G4;
        return list == null ? Collections.emptyList() : list;
    }

    public final String zH() {
        return TextUtils.isEmpty(this.G) ? "" : this.G;
    }
}
