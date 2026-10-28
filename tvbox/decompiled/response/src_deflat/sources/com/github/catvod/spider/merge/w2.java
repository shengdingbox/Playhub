package com.github.catvod.spider.merge;

import android.text.TextUtils;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class w2 {
    private final String SN;
    private final int yq;

    public w2() {
        this.yq = 500;
        this.SN = "";
    }

    public w2(int i, String str) {
        this.yq = i;
        this.SN = str;
    }

    public final int SN() {
        return this.yq;
    }

    public final String yq() {
        return TextUtils.isEmpty(this.SN) ? "" : this.SN;
    }
}
