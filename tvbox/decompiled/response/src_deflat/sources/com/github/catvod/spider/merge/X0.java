package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class X0 {
    @SerializedName("member_type")
    private String N;
    @SerializedName("use_capacity")
    private long SN;
    @SerializedName("total_capacity")
    private long yq = 0;
    @SerializedName("used")
    private String tF = "";

    public static X0 zH(String str) {
        X0 x0 = (X0) C0081aj.yq(str, X0.class);
        return x0 == null ? new X0() : x0;
    }

    public final long N() {
        long j = this.yq;
        if (j == 0) {
            return 0L;
        }
        return j - this.SN;
    }

    public final String SN() {
        return TextUtils.isEmpty(this.N) ? "" : this.N;
    }

    public final boolean tF() {
        return SN().equals("SUPER_VIP") || SN().equals("Z_VIP");
    }

    public final String toString() {
        return new Gson().toJson(this);
    }

    public final X0 yq() {
        this.N = "";
        this.yq = 0L;
        this.SN = 0L;
        return this;
    }
}
