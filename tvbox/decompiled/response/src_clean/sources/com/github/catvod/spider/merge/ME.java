package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class ME {
    @SerializedName("vod_content")
    private String B;
    @SerializedName("style")
    private yq F5;
    @SerializedName("vod_play_from")
    private String G;
    @SerializedName("vod_play_url")
    private String G4;
    @SerializedName("vod_area")
    private String Gc;
    @SerializedName("action")
    private String KJ;
    @SerializedName("vod_actor")
    private String M;
    @SerializedName("vod_name")
    private String N;
    @SerializedName("vod_id")
    private String SN;
    @SerializedName("vod_tag")
    private String dT;
    @SerializedName("vod_remarks")
    private String i;
    @SerializedName("vod_director")
    private String q;
    @SerializedName("vod_year")
    private String t0;
    @SerializedName("vod_pic")
    private String tF;
    @SerializedName("shareUser_Id")
    private String v3;
    @SerializedName("type_name")
    private String yq;
    @SerializedName("vod_class")
    private String zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        @SerializedName("ratio")
        private Float SN;
        @SerializedName("type")
        private String yq = "list";

        public static yq yq() {
            return new yq();
        }
    }

    public ME() {
    }

    public ME(String str, String str2, String str3) {
        this.SN = str;
        this.N = str2;
        this.tF = str3;
    }

    public final void B(String str) {
        this.SN = str;
    }

    public final void F5(String str) {
        this.G4 = str;
    }

    public final void G(String str) {
        this.N = str;
    }

    public final void G4(String str) {
        this.tF = str;
    }

    public final void Gc(String str) {
        this.M = str;
    }

    public final void KJ(String str) {
        this.B = str;
    }

    public final void M(String str) {
        this.Gc = str;
    }

    public final String N() {
        return this.G4;
    }

    public final String SN() {
        return this.G;
    }

    public final void W(String str) {
        this.dT = str;
    }

    public final void dT(String str) {
        this.G = str;
    }

    public final void i(yq yqVar) {
        this.F5 = yqVar;
    }

    public final void q(String str) {
        this.q = str;
    }

    public final void t0(String str) {
        this.yq = str;
    }

    public final void tF(String str) {
        this.KJ = str;
    }

    public final void v(String str) {
        this.t0 = str;
    }

    public final void v3(String str) {
        this.i = str;
    }

    public final String yq() {
        return Rc.ee(this.v3) ? "" : new String(Rc.v(this.v3));
    }

    public final void zH(String str) {
        this.v3 = str;
    }

    public ME(String str, String str2, String str3, String str4) {
        this.SN = str;
        this.N = str2;
        this.tF = str3;
        this.i = str4;
    }

    public ME(String str, String str2, String str3, String str4, String str5) {
        this.SN = str;
        this.N = str2;
        this.tF = str3;
        this.i = "";
        this.KJ = str5;
    }

    public ME(String str, String str2, String str3, String str4, boolean z) {
        this.SN = str;
        this.N = str2;
        this.tF = str3;
        this.i = str4;
        this.dT = z ? "folder" : "file";
    }
}
