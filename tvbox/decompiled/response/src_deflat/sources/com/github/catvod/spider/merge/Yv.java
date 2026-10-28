package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Yv {
    @SerializedName("resource_drive_id")
    private String Gc;
    @SerializedName("backup_drive_id")
    private String M;
    @SerializedName("my-driveId")
    private String N;
    @SerializedName("default_drive_id")
    private String SN;
    @SerializedName("access_token")
    private String i;
    @SerializedName("refresh_token")
    private String t0;
    @SerializedName("user_id")
    private String tF;
    @SerializedName("device_id")
    private String yq;
    @SerializedName("token_type")
    private String zH;

    public static Yv q(String str) {
        Yv yv = (Yv) C0081aj.yq(str, Yv.class);
        return yv == null ? new Yv() : yv;
    }

    public final Yv B() {
        M4.i(V.v().Dr(), Rc.B(toString()));
        return this;
    }

    public final void G(String str) {
        this.M = str;
    }

    public final void G4(String str) {
        this.t0 = str;
    }

    public final String Gc() {
        return this.Gc;
    }

    public final boolean KJ() {
        return (TextUtils.isEmpty(this.zH) ? "" : this.zH).length() > 0 && SN().length() > 0;
    }

    public final String M() {
        String str;
        return ("NO_ID".equals(this.Gc) || (str = this.Gc) == null) ? this.SN : str;
    }

    public final String N() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.zH) ? "" : this.zH);
        sb.append(" ");
        sb.append(SN());
        return sb.toString();
    }

    public final String SN() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
    }

    public final Yv dT(String str) {
        this.Gc = str;
        return this;
    }

    public final String i() {
        return TextUtils.isEmpty(this.yq) ? "" : this.yq;
    }

    public final String t0() {
        return TextUtils.isEmpty(this.t0) ? "" : this.t0;
    }

    public final String tF() {
        String str;
        return ("NO_ID".equals(this.M) || (str = this.M) == null) ? "" : str;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }

    public final Yv yq() {
        this.t0 = "";
        this.i = "";
        this.Gc = null;
        return this;
    }

    public final String zH() {
        return TextUtils.isEmpty(this.SN) ? "" : this.SN;
    }
}
