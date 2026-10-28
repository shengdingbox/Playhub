package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class gE {
    @SerializedName(alternate = {"path"}, value = "thumbnail")
    private String N;
    @SerializedName("id")
    private String SN;
    @SerializedName("title")
    private String tF;
    @SerializedName("data")
    private List<gE> yq;
    @SerializedName("mask")
    private String zH;

    public final ME N(String str) {
        String str2;
        String str3 = "";
        String str4 = TextUtils.isEmpty(this.SN) ? str3 : this.SN;
        String str5 = TextUtils.isEmpty(this.tF) ? str3 : this.tF;
        if (TextUtils.isEmpty(this.N)) {
            str2 = str3;
        } else {
            StringBuilder yq = Sq.yq("http://", str);
            yq.append(this.N);
            str2 = yq.toString();
        }
        if (!TextUtils.isEmpty(this.zH)) {
            str3 = this.zH;
        }
        return new ME(str4, str5, str2, str3);
    }

    public final String SN() {
        return TextUtils.isEmpty(this.tF) ? "" : this.tF;
    }

    public final List<gE> yq() {
        List<gE> list = this.yq;
        return list == null ? Collections.emptyList() : list;
    }
}
