package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class H7 {
    @SerializedName("vodName")
    private String B;
    @SerializedName("category")
    private String F5;
    @SerializedName("type")
    private String G;
    @SerializedName("parent_file_id")
    private String G4;
    @SerializedName("sId")
    private String Gc;
    @SerializedName("name")
    private String KJ;
    @SerializedName("sToken")
    private String M;
    @SerializedName("sub")
    private String N;
    @SerializedName("flag")
    private String SN;
    @SerializedName("created_at")
    private String W;
    @SerializedName("file_extension")
    private String dT;
    @SerializedName("file_id")
    private String i;
    @SerializedName("drive_id")
    private String q;
    @SerializedName("saveId")
    private String t0;
    @SerializedName("next_marker")
    private String tF;
    @SerializedName("parent")
    private String v;
    @SerializedName("size")
    private long v3;
    @SerializedName("items")
    private List<H7> yq;
    @SerializedName("thumbnail")
    private String zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN {
        @SerializedName("drive_id")
        private String Gc;
        @SerializedName("parent_file_id")
        private String KJ;
        @SerializedName("sToken")
        private String M;
        @SerializedName("size")
        private long N;
        @SerializedName("file_id")
        private String SN;
        @SerializedName("sub")
        private String i;
        @SerializedName("pg")
        private String q;
        @SerializedName("sId")
        private String t0;
        @SerializedName("name")
        private String tF;
        @SerializedName("flag")
        private String yq;
        @SerializedName("vodName")
        private String zH;

        public SN(H7 h7) {
            this.yq = h7.Gc();
            this.SN = h7.t0();
            this.N = h7.g9().isEmpty() ? 0L : Long.parseLong(h7.g9());
            this.zH = h7.Nl();
            this.tF = h7.KJ();
            this.i = h7.v();
            this.t0 = h7.dT();
            this.M = h7.W();
            this.KJ = h7.G();
            this.Gc = h7.zH();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    class yq extends TypeToken<List<H7>> {
        yq() {
        }
    }

    public H7() {
    }

    public H7(String str) {
        this.i = str;
    }

    public static String SN(Object obj) {
        return new Gson().toJson(obj);
    }

    public static H7 g1(String str) {
        return (H7) C0081aj.yq(str, H7.class);
    }

    public static List<H7> yq(String str) {
        return (List) new Gson().fromJson(str, new yq().getType());
    }

    public final String B() {
        return Rc.ee(this.v) ? "" : A7.N(by.yq("["), this.v, "]");
    }

    public final void Dr(String str) {
        this.Gc = str;
    }

    public final double F5() {
        return this.v3;
    }

    public final void Fz(String str) {
        this.B = str;
    }

    public final String G() {
        return TextUtils.isEmpty(this.G4) ? "" : this.G4;
    }

    public final String G4(String str) {
        return OW() ? str : TextUtils.isEmpty(this.zH) ? "" : A7.N(new StringBuilder(), this.zH, "@Referer=https://www.aliyundrive.com/");
    }

    public final String Gc() {
        return TextUtils.isEmpty(this.SN) ? "" : this.SN;
    }

    public final ME Gd(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.v3);
        sb.append("");
        sb.append(KJ());
        return new ME(str, sb.toString().trim(), G4(str2), "", str3);
    }

    public final void H(String str) {
        this.N = str;
    }

    public final String KJ() {
        return Rc.ee(this.KJ) ? "" : this.KJ.replace("#", "").replace("@", "").replace("&", "").replace("+", "").trim();
    }

    public final List<H7> M() {
        List<H7> list = this.yq;
        return list == null ? Collections.emptyList() : list;
    }

    public final String N() {
        if (this.v3 < 500) {
            return "";
        }
        StringBuilder yq2 = by.yq("[");
        yq2.append(Rc.v3(this.v3));
        yq2.append("]");
        return yq2.toString();
    }

    public final String Nl() {
        return TextUtils.isEmpty(this.B) ? "" : this.B;
    }

    public final boolean O() {
        return tF().equals("video") || tF().equals("audio") || KJ().contains("iso") || KJ().contains(".ts");
    }

    public final boolean OW() {
        return (TextUtils.isEmpty(this.G) ? "" : this.G).equals("folder");
    }

    public final void U() {
        this.G = "folder";
    }

    public final String W() {
        return TextUtils.isEmpty(this.M) ? "" : this.M;
    }

    public final void Zm(String str) {
        this.KJ = str;
    }

    public final void b(String str) {
        this.SN = str;
    }

    public final String dT() {
        return Rc.ee(this.Gc) ? "" : this.Gc;
    }

    public final String ee() {
        return TextUtils.isEmpty(this.G) ? "" : this.G;
    }

    public final void g(String str) {
        this.M = str;
    }

    public final String g9() {
        long j = this.v3;
        return j < 500 ? "" : String.valueOf(j);
    }

    public final String i() {
        return TextUtils.isEmpty(this.dT) ? "" : this.dT;
    }

    public final void n(String str) {
        this.q = str;
    }

    public final String q() {
        return TextUtils.isEmpty(this.tF) ? "" : this.tF;
    }

    public final H7 s(String str) {
        this.v = str;
        return this;
    }

    public final String t0() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
    }

    public final String tF() {
        return TextUtils.isEmpty(this.F5) ? "" : this.F5;
    }

    public final void un(String str) {
        this.i = str;
    }

    public final String v() {
        return TextUtils.isEmpty(this.N) ? "" : this.N;
    }

    public final String v3() {
        return TextUtils.join(" ", Arrays.asList(B(), KJ())).trim();
    }

    public final ME xa(String str, String str2, String str3) {
        return new ME(str, (N() + " " + KJ()).trim(), G4(str2), str3, OW());
    }

    public final String zH() {
        return this.q;
    }
}
