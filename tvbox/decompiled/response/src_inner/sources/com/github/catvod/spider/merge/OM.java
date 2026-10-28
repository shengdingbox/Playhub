package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.github.catvod.spider.merge.RQ;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class OM {
    @SerializedName("refresh_token")
    private String N;
    @SerializedName("access_token")
    private String SN;
    @SerializedName("secret_key")
    private String tF;
    @SerializedName("client_key")
    private String yq;
    @SerializedName("expiry")
    private long zH;

    public static OM t0(String str) {
        OM om = (OM) C0081aj.yq(str, OM.class);
        return om == null ? new OM() : om;
    }

    public final OM Gc() {
        HashMap<String, Object[]> hashMap = RQ.Zm;
        M4.i(RQ.tF.yq.Zm(), Rc.B(toString()));
        return this;
    }

    public final OM KJ(long j) {
        this.zH = j;
        return this;
    }

    public final void M(String str) {
        this.yq = str;
    }

    public final String N() {
        return this.yq;
    }

    public final String SN() {
        return TextUtils.isEmpty(this.SN) ? "" : this.SN;
    }

    public final String i() {
        return this.tF;
    }

    public final void q(String str) {
        this.tF = str;
    }

    public final long tF() {
        return this.zH;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }

    public final OM yq() {
        this.N = "";
        this.SN = "";
        this.yq = "";
        this.tF = "";
        this.zH = 0L;
        return this;
    }

    public final String zH() {
        return TextUtils.isEmpty(this.N) ? "" : this.N;
    }
}
