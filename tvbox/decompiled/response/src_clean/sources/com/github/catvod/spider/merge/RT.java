package com.github.catvod.spider.merge;

import java.lang.reflect.Array;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class RT {
    private final int N;
    private final int SN;
    private final byte[][] yq;

    public RT(int i, int i2) {
        this.yq = (byte[][]) Array.newInstance(byte.class, i2, i);
        this.SN = i;
        this.N = i2;
    }

    public final byte[][] N() {
        return this.yq;
    }

    public final byte SN(int i, int i2) {
        return this.yq[i2][i];
    }

    public final void i(int i, int i2, int i3) {
        this.yq[i2][i] = (byte) i3;
    }

    public final void t0(int i, int i2, boolean z) {
        this.yq[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public final int tF() {
        return this.N;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.SN * 2 * this.N) + 2);
        for (int i = 0; i < this.N; i++) {
            for (int i2 = 0; i2 < this.SN; i2++) {
                byte b = this.yq[i][i2];
                sb.append(b != 0 ? b != 1 ? "  " : " 1" : " 0");
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public final void yq() {
        for (int i = 0; i < this.N; i++) {
            for (int i2 = 0; i2 < this.SN; i2++) {
                this.yq[i][i2] = -1;
            }
        }
    }

    public final int zH() {
        return this.SN;
    }
}
