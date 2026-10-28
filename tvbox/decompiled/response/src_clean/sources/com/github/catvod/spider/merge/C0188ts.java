package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
/* renamed from: com.github.catvod.spider.merge.ts  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0188ts {
    @SerializedName("use_capacity")
    private long N;
    @SerializedName("total_capacity")
    private long SN;
    @SerializedName("token")
    private String tF;
    @SerializedName("member_type")
    private String yq;

    public static C0188ts Gc(String str) {
        C0188ts tsVar = (C0188ts) C0081aj.yq(str, C0188ts.class);
        return tsVar == null ? new C0188ts() : tsVar;
    }

    public final C0188ts M(String str) {
        this.tF = str;
        return this;
    }

    public final String N() {
        return TextUtils.isEmpty(this.tF) ? "" : this.tF;
    }

    public final long SN() {
        long j = this.SN;
        if (j == 0) {
            return 0L;
        }
        return j - this.N;
    }

    public final boolean i() {
        return this.yq.equals("SUPER_VIP");
    }

    public final boolean t0() {
        return this.yq.equals("Z_VIP");
    }

    public final String tF() {
        return TextUtils.isEmpty(this.yq) ? "" : this.yq;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }

    public final C0188ts yq() {
        this.yq = "";
        this.SN = 0L;
        this.tF = "";
        this.N = 0L;
        return this;
    }

    public final boolean zH() {
        return this.yq.equals("EXP_SVIP");
    }
}
