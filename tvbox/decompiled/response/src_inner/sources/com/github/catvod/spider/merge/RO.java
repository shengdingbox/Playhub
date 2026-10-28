package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class RO {
    @SerializedName("part")
    private String SN;
    @SerializedName("cid")
    private String yq;

    public final String SN() {
        return TextUtils.isEmpty(this.SN) ? "" : this.SN.replace("#", "");
    }

    public final String yq() {
        return TextUtils.isEmpty(this.yq) ? "" : this.yq;
    }
}
