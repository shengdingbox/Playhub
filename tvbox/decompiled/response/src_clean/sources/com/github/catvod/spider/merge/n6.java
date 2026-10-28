package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class n6 {
    @SerializedName("path")
    private String B;
    @SerializedName("pg")
    private String G;
    @SerializedName("drive_id")
    private String G4;
    @SerializedName("vodName")
    private String Gc;
    @SerializedName("pdir_fid")
    private String KJ;
    @SerializedName("sub")
    private String M;
    @SerializedName("fs_id")
    private String N;
    @SerializedName("fid")
    private String SN;
    @SerializedName("file_name")
    private String i;
    @SerializedName("parent_file_id")
    private String q;
    @SerializedName("name")
    private String t0;
    @SerializedName("file_id")
    private String tF;
    @SerializedName("flag")
    private String yq;
    @SerializedName("size")
    private long zH;

    public final String N() {
        return TextUtils.isEmpty(this.yq) ? "" : this.yq;
    }

    public final String SN() {
        return !TextUtils.isEmpty(this.SN) ? this.SN : !TextUtils.isEmpty(this.tF) ? this.tF : "";
    }

    public final String i() {
        return !TextUtils.isEmpty(this.KJ) ? this.KJ : !TextUtils.isEmpty(this.q) ? this.q : "";
    }

    public final String t0() {
        return TextUtils.isEmpty(this.Gc) ? "" : this.Gc;
    }

    public final String tF() {
        String str;
        if (!TextUtils.isEmpty(this.i)) {
            str = this.i;
        } else if (TextUtils.isEmpty(this.t0)) {
            return "";
        } else {
            str = this.t0;
        }
        return rN.yq(str).Fo().replace(" ", ".").replace("+", "").replaceAll("[/@]", "-").replace("@@@", "").trim();
    }

    public final String yq() {
        return this.G4;
    }

    public final String zH() {
        return TextUtils.isEmpty(this.B) ? "" : this.B;
    }
}
