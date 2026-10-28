package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class fk {
    @SerializedName("name")
    private String SN;
    @SerializedName("mid")
    private String yq;

    public final String yq() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = A7.N(new StringBuilder(), TextUtils.isEmpty(this.yq) ? str : this.yq, "/{pg}");
        objArr[1] = TextUtils.isEmpty(this.SN) ? str : this.SN;
        if (!TextUtils.isEmpty(this.SN)) {
            str = this.SN;
        }
        objArr[2] = str;
        return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", objArr);
    }
}
