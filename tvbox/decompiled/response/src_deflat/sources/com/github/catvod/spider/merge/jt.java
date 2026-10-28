package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class jt {
    @SerializedName("totalTraffic")
    private String SN;
    @SerializedName("hasVip")
    private String yq;

    public static jt zH(String str) {
        jt jtVar = (jt) C0081aj.yq(str, jt.class);
        return jtVar == null ? new jt() : jtVar;
    }

    public final boolean N() {
        return SN().equals("true");
    }

    public final String SN() {
        return TextUtils.isEmpty(this.yq) ? "" : this.yq;
    }

    public final jt i() {
        M4.i(V.v().O(), toString());
        return this;
    }

    public final boolean tF() {
        return (TextUtils.isEmpty(this.SN) ? 0L : Long.valueOf(this.SN).longValue()) > 10737418240L;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }

    public final jt yq() {
        this.yq = "";
        this.SN = "";
        return this;
    }
}
