package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class rP {
    @SerializedName("type_flag")
    private String N;
    @SerializedName("type_name")
    private String SN;
    @SerializedName("type_id")
    private String yq;

    public rP(String str, String str2) {
        this(str, str2, "");
    }

    public rP(String str, String str2, String str3) {
        this.yq = str;
        this.SN = str2;
        this.N = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rP)) {
            return false;
        }
        return this.yq.equals(((rP) obj).yq);
    }

    public final String yq() {
        return this.yq;
    }
}
