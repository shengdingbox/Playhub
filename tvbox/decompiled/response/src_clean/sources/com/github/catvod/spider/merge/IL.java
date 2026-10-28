package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class IL {
    @SerializedName("refresh_token")
    private String N;
    @SerializedName("access_token")
    private String SN;
    @SerializedName("refreshToken")
    private String i;
    @SerializedName("signature")
    private String t0;
    @SerializedName("tokenType")
    private String tF;
    @SerializedName("token_type")
    private String yq;
    @SerializedName("accessToken")
    private String zH;

    public static IL i(String str) {
        IL il = (IL) C0081aj.yq(str, IL.class);
        return il == null ? new IL() : il;
    }

    public final String N() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(TextUtils.isEmpty(this.tF) ? str : this.tF);
        sb.append(" ");
        if (!TextUtils.isEmpty(this.zH)) {
            str = this.zH;
        }
        sb.append(str);
        return sb.toString();
    }

    public final String SN() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(TextUtils.isEmpty(this.yq) ? str : this.yq);
        sb.append(" ");
        if (!TextUtils.isEmpty(this.SN)) {
            str = this.SN;
        }
        sb.append(str);
        return sb.toString();
    }

    public final IL t0() {
        M4.i(V.v().g1(), Rc.B(toString()));
        return this;
    }

    public final String tF() {
        return TextUtils.isEmpty(this.N) ? "" : this.N;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }

    public final IL yq() {
        this.N = "";
        this.SN = "";
        this.i = "";
        this.zH = "";
        return this;
    }

    public final String zH() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
    }
}
