package com.github.catvod.spider.merge;

import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.spider.merge.Z;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.github.catvod.spider.merge.Dl  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0059Dl {
    @SerializedName("pg")
    private String B;
    @SerializedName("pdir_fid")
    private String F5;
    @SerializedName("owner_ucid")
    private String G;
    @SerializedName("file_type")
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
    @SerializedName("obj_category")
    private String W;
    @SerializedName("big_thumbnail")
    private String dT;
    @SerializedName("parent")
    private String ee;
    @SerializedName("format_type")
    private String g9;
    @SerializedName("size")
    private long i;
    @SerializedName("sToken")
    private String q;
    @SerializedName("file_name")
    private String t0;
    @SerializedName("fid")
    private String tF;
    @SerializedName("l_created_at")
    private long v;
    @SerializedName("category")
    private int v3;
    @SerializedName("list")
    private List<C0059Dl> yq;
    @SerializedName("share_fid_token")
    private String zH;

    /* renamed from: com.github.catvod.spider.merge.Dl$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN {
        @SerializedName("pg")
        private String B;
        @SerializedName("parent")
        private String G;
        @SerializedName("l_created_at")
        private long G4;
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
        @SerializedName("format_type")
        private String dT;
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

        public SN(C0059Dl dl) {
            this.yq = dl.t0();
            this.SN = dl.zH();
            this.N = dl.i();
            this.tF = dl.xa().isEmpty() ? 0L : Long.parseLong(dl.xa());
            this.zH = dl.KJ();
            this.i = dl.Nl();
            this.t0 = dl.v();
            this.Gc = dl.dT();
            this.KJ = dl.W();
            this.M = dl.ee();
            this.q = dl.B();
            this.B = dl.G();
            this.G = dl.q();
            this.G4 = dl.N();
            this.dT = dl.Gc();
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Dl$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    class yq extends TypeToken<List<C0059Dl>> {
        yq() {
        }
    }

    public static String SN(Object obj) {
        return new Gson().toJson(obj);
    }

    public static C0059Dl s(String str) {
        return (C0059Dl) C0081aj.yq(str, C0059Dl.class);
    }

    public static List<C0059Dl> yq(String str) {
        return (List) new Gson().fromJson(str, new yq().getType());
    }

    public final String B() {
        return Rc.ee(this.F5) ? "" : this.F5;
    }

    public final void Dr() {
        this.t0 = "最近保存";
    }

    public final void E1(String str) {
        this.KJ = str;
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
        this.N = str;
    }

    public final String G() {
        return Rc.ee(this.B) ? "1" : this.B;
    }

    public final String G4(String str) {
        if (OW()) {
            return str;
        }
        if (Rc.ee(this.dT)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.dT);
        sb.append("@Referer=https://pan.quark.cn/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/113.0.0.0 Safari/537.36@Cookie=");
        int i = Z.g;
        sb.append(Z.tF.yq.F5);
        return sb.toString();
    }

    public final String Gc() {
        return Rc.ee(this.g9) ? "" : this.g9;
    }

    public final ME Gd(String str, String str2, String str3) {
        return new ME(str, (F5() + " " + KJ()).trim(), G4(str2), str3, OW());
    }

    public final void H(String str) {
        this.M = str;
    }

    public final String KJ() {
        return Rc.ee(this.t0) ? "" : rN.yq(this.t0).Fo().trim().replace("#", "").replace("@", "").replace("&", "").replace("+", "");
    }

    public final List<C0059Dl> M() {
        List<C0059Dl> list = this.yq;
        return list == null ? Collections.emptyList() : list;
    }

    public final long N() {
        long j = this.v;
        if (j == 0) {
            return 0L;
        }
        return j;
    }

    public final String Nl() {
        return Rc.ee(this.t0) ? "" : this.Gc;
    }

    public final boolean O() {
        String str = "";
        if (!(Rc.ee(this.W) ? str : this.W).equals("video")) {
            if (!Rc.ee(this.W)) {
                str = this.W;
            }
            if (!str.equals("audio") && !KJ().contains("iso") && !KJ().contains(".ts")) {
                return false;
            }
        }
        return true;
    }

    public final boolean OW() {
        return this.v3 == 0;
    }

    public final void U(String str) {
        this.q = str;
    }

    public final String W() {
        return Rc.ee(this.q) ? "" : this.q;
    }

    public final void Zm(String str) {
        this.SN = str;
    }

    public final void b(String str) {
        this.zH = str;
    }

    public final String dT() {
        return Rc.ee(this.M) ? "" : this.M;
    }

    public final String ee() {
        return Rc.ee(this.KJ) ? "" : this.KJ;
    }

    public final void g(String str) {
        this.B = str;
    }

    public final boolean g1() {
        return !Rc.ee(this.g9) && this.g9.equals("image/png") && Rc.g9(this.t0);
    }

    public final String g9() {
        return Rc.ee(this.G4) ? "" : this.G4;
    }

    public final String i() {
        return Rc.ee(this.zH) ? "" : this.zH;
    }

    public final C0059Dl n(String str) {
        this.ee = str;
        return this;
    }

    public final String q() {
        if (Rc.ee(this.ee)) {
            return "";
        }
        StringBuilder yq2 = by.yq("[");
        yq2.append(this.ee.trim());
        yq2.append("]");
        return yq2.toString();
    }

    public final String t0() {
        return Rc.ee(this.SN) ? "" : this.SN;
    }

    public final String tF(String str) {
        StringBuilder yq2 = Sq.yq(str, "  ");
        yq2.append(this.t0);
        Log.e("test", yq2.toString());
        return TextUtils.join(" ", Arrays.asList(F5(), q().replaceAll("\\d+集", "").replace("🐲欧专用", "").replace(str, "").replaceAll(" ", "").replaceAll("\\[", "").replaceAll("\\]", ""), KJ().replace("🐲欧专用", ""))).trim();
    }

    public final void tO(String str) {
        this.Gc = str;
    }

    public final void un(String str) {
        this.tF = str;
    }

    public final String v() {
        return Rc.ee(this.N) ? "" : this.N;
    }

    public final String v3() {
        return TextUtils.join(" ", Arrays.asList(q(), KJ())).trim();
    }

    public final String xa() {
        long j = this.i;
        return j < 500 ? "" : String.valueOf(j);
    }

    public final String zH() {
        return Rc.ee(this.tF) ? "" : this.tF;
    }
}
