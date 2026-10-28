package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class io {
    private static volatile D5 tF = D5.v3;
    private final D5 N;
    private final Object SN;
    private final StringBuffer yq;

    public io(Object obj) {
        D5 d5 = tF;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.yq = stringBuffer;
        this.N = d5;
        this.SN = obj;
        d5.G(stringBuffer, obj);
    }

    public final io SN(String str, boolean z) {
        this.N.SN(this.yq, str, z);
        return this;
    }

    public final String toString() {
        Object obj = this.SN;
        if (obj == null) {
            this.yq.append(this.N.v());
        } else {
            this.N.Gc(this.yq, obj);
        }
        return this.yq.toString();
    }

    public final io yq(Object obj) {
        this.N.yq(this.yq, obj);
        return this;
    }
}
