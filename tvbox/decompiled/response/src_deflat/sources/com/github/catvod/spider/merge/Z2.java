package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Z2 {
    private long N;
    private long SN;
    private int yq = 1;

    public final void N() {
        this.yq = 1;
        this.SN = 0L;
        this.N = 0L;
    }

    public final void SN() {
        this.yq = 1;
    }

    public final void i(long j) {
        this.SN = j;
    }

    public final void t0(long j) {
        long j2 = this.N + j;
        this.N = j2;
        long j3 = this.SN;
        if (j3 > 0) {
            long j4 = (j2 * 100) / j3;
        }
    }

    public final int tF() {
        return this.yq;
    }

    public final void yq() {
        this.yq = 1;
    }

    public final void zH() {
        this.yq = 2;
    }
}
