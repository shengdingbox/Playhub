package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.github.catvod.spider.merge.C0203xU;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class kp {
    @SerializedName("refresh_token")
    private String SN;
    @SerializedName("access_token")
    private String yq;
    private String N = "";
    private String tF = "";
    private String zH = "";
    private String i = "";

    public static kp Gc(String str) {
        kp kpVar = (kp) C0081aj.yq(str, kp.class);
        return kpVar == null ? new kp() : kpVar;
    }

    public final void B(String str) {
        this.zH = str;
    }

    public final void G(String str) {
        this.tF = str;
    }

    public final void G4(String str) {
        this.i = str;
    }

    public final void KJ(String str) {
        this.yq = str;
    }

    public final kp M() {
        int i = C0203xU.H;
        M4.i(C0203xU.tF.yq.J(), toString());
        return this;
    }

    public final String N() {
        return TextUtils.isEmpty(this.N) ? "" : this.N;
    }

    public final String SN() {
        return Rc.ee(this.yq) ? "" : this.yq;
    }

    public final String i() {
        return TextUtils.isEmpty(this.tF) ? "" : this.tF;
    }

    public final kp q(String str) {
        this.N = str;
        return this;
    }

    public final String t0() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
    }

    public final String tF() {
        return Rc.ee(this.SN) ? "" : this.SN;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }

    public final kp yq() {
        this.SN = "";
        this.yq = "";
        this.N = "";
        int i = C0203xU.H;
        C0203xU.tF.yq.J().delete();
        return this;
    }

    public final String zH() {
        return TextUtils.isEmpty(this.zH) ? "" : this.zH;
    }
}
