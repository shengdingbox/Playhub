package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class p9 {
    @SerializedName("value")
    private List<yq> N;
    @SerializedName("name")
    private String SN;
    @SerializedName("key")
    private String yq;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        @SerializedName("v")
        private String SN;
        @SerializedName("n")
        private String yq;

        public yq(String str, String str2) {
            this.yq = str;
            this.SN = str2;
        }
    }

    public p9(String str, String str2, List<yq> list) {
        this.yq = str;
        this.SN = str2;
        this.N = list;
    }
}
