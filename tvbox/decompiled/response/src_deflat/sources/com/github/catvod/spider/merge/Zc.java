package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Zc {
    @SerializedName("video")
    private List<ZI> N;
    @SerializedName("minBufferTime")
    private String SN;
    @SerializedName("audio")
    private List<ZI> tF;
    @SerializedName("duration")
    private String yq;

    public final String N() {
        String str = this.SN;
        return str == null ? "0" : str;
    }

    public final String SN() {
        String str = this.yq;
        return str == null ? "0" : str;
    }

    public final List<ZI> tF() {
        List<ZI> list = this.N;
        return list == null ? Collections.emptyList() : list;
    }

    public final List<ZI> yq() {
        List<ZI> list = this.tF;
        return list == null ? Collections.emptyList() : list;
    }
}
