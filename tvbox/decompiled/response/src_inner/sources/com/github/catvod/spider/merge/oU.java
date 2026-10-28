package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class oU {
    @SerializedName("data")
    private List<lm> yq;

    public static oU SN(String str) {
        return (oU) C0081aj.yq(str, oU.class);
    }

    public final List<lm> yq() {
        List<lm> list = this.yq;
        return list == null ? Collections.emptyList() : list;
    }
}
