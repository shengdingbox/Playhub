package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.github.catvod.spider.merge.C0203xU;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class tX {
    @SerializedName("pg")
    private String B;
    @SerializedName("obj_category")
    private String F5;
    @SerializedName("file_type")
    private String G;
    @SerializedName("big_thumbnail")
    private String G4;
    @SerializedName("vodName")
    private String Gc;
    @SerializedName("shareUser")
    private String KJ;
    @SerializedName("sId")
    private String M;
    @SerializedName("sub")
    private String N;
    @SerializedName("flag")
    private String SN;
    @SerializedName("parent")
    private String W;
    @SerializedName("category")
    private int dT;
    @SerializedName("size")
    private long i;
    @SerializedName("sToken")
    private String q;
    @SerializedName("file_name")
    private String t0;
    @SerializedName("fid")
    private String tF;
    @SerializedName("pdir_fid")
    private String v3;
    @SerializedName("list")
    private List<tX> yq;
    @SerializedName("share_fid_token")
    private String zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN {
        @SerializedName("pg")
        private String B;
        @SerializedName("parent")
        private String G;
        @SerializedName("sId")
        private String Gc;
        @SerializedName("sToken")
        private String KJ;
        @SerializedName("shareUser")
        private String M;
        @SerializedName("share_fid_token")
        private String N;
        @SerializedName("fid")
        private String SN;
        @SerializedName("vodName")
        private String i;
        @SerializedName("pdir_fid")
        private String q;
        @SerializedName("sub")
        private String t0;
        @SerializedName("size")
        private long tF;
        @SerializedName("flag")
        private String yq;
        @SerializedName("file_name")
        private String zH;

        public SN(tX tXVar) {
            this.yq = tXVar.i();
            this.SN = tXVar.tF();
            this.N = tXVar.zH();
            this.tF = tXVar.xa().isEmpty() ? 0L : Long.parseLong(tXVar.xa());
            this.zH = tXVar.Gc();
            this.i = tXVar.Nl();
            this.t0 = tXVar.v();
            this.Gc = tXVar.dT();
            this.KJ = tXVar.W();
            this.M = tXVar.ee();
            this.q = tXVar.q();
            this.B = tXVar.B();
            this.G = tXVar.KJ();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    class yq extends TypeToken<List<tX>> {
        yq() {
        }
    }

    public static String SN(Object obj) {
        return new Gson().toJson(obj);
    }

    public static tX g1(String str) {
        return (tX) C0081aj.yq(str, tX.class);
    }

    public static List<tX> yq(String str) {
        return (List) new Gson().fromJson(str, new yq().getType());
    }

    public final String B() {
        return TextUtils.isEmpty(this.B) ? "" : this.B;
    }

    public final void Dr(String str) {
        this.B = str;
    }

    public final void E1(String str) {
        this.Gc = str;
    }

    public final String F5() {
        if (this.i < 500) {
            return "";
        }
        StringBuilder yq2 = by.yq("[");
        yq2.append(Rc.v3(this.i));
        yq2.append("]");
        return yq2.toString();
    }

    public final void Fz(String str) {
        this.KJ = str;
    }

    public final String G(String str) {
        if (OW()) {
            return str;
        }
        if (TextUtils.isEmpty(this.G4)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.G4);
        sb.append("@Referer=https://drive.uc.cn/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/113.0.0.0 Safari/537.36@Cookie=");
        int i = C0203xU.H;
        sb.append(C0203xU.tF.yq.Gc);
        return sb.toString();
    }

    public final String G4() {
        return TextUtils.isEmpty(this.zH) ? "" : this.zH;
    }

    public final String Gc() {
        return Rc.ee(this.t0) ? "" : rN.yq(this.t0).Fo().replace("#", "").replace("@", "").replace("&", "").replace("+", "").trim();
    }

    public final ME Gd(String str, String str2, String str3) {
        return new ME(str, (F5() + "" + Gc()).trim(), G(str2), str3, OW());
    }

    public final void H(String str) {
        this.q = str;
    }

    public final String KJ() {
        return Rc.ee(this.W) ? "" : A7.N(by.yq("["), this.W, "]");
    }

    public final String M() {
        return TextUtils.isEmpty(this.F5) ? "" : this.F5;
    }

    public final String N(String str) {
        return TextUtils.join(" ", Arrays.asList(F5(), KJ().replaceAll("\\d+集", "").replace(str, "").replaceAll(" ", "").replaceAll("\\[", "").replaceAll("\\]", ""), Gc())).trim();
    }

    public final String Nl() {
        return Rc.ee(this.t0) ? "" : this.Gc;
    }

    public final boolean O() {
        return M().equals("video") || M().equals("audio") || Gc().contains(".iso") || Gc().contains(".ts");
    }

    public final boolean OW() {
        return this.dT == 0;
    }

    public final void U(String str) {
        this.N = str;
    }

    public final String W() {
        return TextUtils.isEmpty(this.q) ? "" : this.q;
    }

    public final void Zm() {
        this.t0 = "最近保存";
    }

    public final void b(String str) {
        this.SN = str;
    }

    public final String dT() {
        return Rc.ee(this.M) ? "" : this.M;
    }

    public final String ee() {
        return Rc.ee(this.KJ) ? "" : this.KJ;
    }

    public final void g(String str) {
        this.M = str;
    }

    public final String g9() {
        return TextUtils.isEmpty(this.G) ? "" : this.G;
    }

    public final String i() {
        return TextUtils.isEmpty(this.SN) ? "" : this.SN;
    }

    public final void n(String str) {
        this.tF = str;
    }

    public final String q() {
        return TextUtils.isEmpty(this.v3) ? "" : this.v3;
    }

    public final tX s(String str) {
        this.W = str;
        return this;
    }

    public final List<tX> t0() {
        List<tX> list = this.yq;
        return list == null ? Collections.emptyList() : list;
    }

    public final String tF() {
        return TextUtils.isEmpty(this.tF) ? "" : this.tF;
    }

    public final void un(String str) {
        this.zH = str;
    }

    public final String v() {
        return TextUtils.isEmpty(this.N) ? "" : this.N;
    }

    public final String v3() {
        return TextUtils.join(" ", Arrays.asList(KJ(), Gc())).trim();
    }

    public final String xa() {
        long j = this.i;
        return j < 500 ? "" : String.valueOf(j);
    }

    public final String zH() {
        return TextUtils.isEmpty(this.zH) ? "" : this.zH;
    }
}
