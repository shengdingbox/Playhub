package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class w4 {
    @SerializedName("url")
    private String N;
    @SerializedName("name")
    private String SN;
    private String yq = "全部";

    public final String N() {
        return this.N;
    }

    public final String SN() {
        return this.yq;
    }

    public final w4 i(String str) {
        this.N = str;
        return this;
    }

    public final w4 tF(String str) {
        this.SN = str;
        return this;
    }

    public final String yq() {
        return this.SN;
    }

    public final w4 zH(String str) {
        this.yq = str;
        return this;
    }
}
