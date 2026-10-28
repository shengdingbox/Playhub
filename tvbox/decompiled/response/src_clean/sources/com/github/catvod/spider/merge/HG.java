package com.github.catvod.spider.merge;

import java.util.Arrays;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class HG implements Cloneable {
    private final int N;
    private final int SN;
    private final int[] tF;
    private final int yq;

    public HG(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.yq = i;
        this.SN = i2;
        int i3 = (i + 31) / 32;
        this.N = i3;
        this.tF = new int[i3 * i2];
    }

    private HG(int i, int i2, int i3, int[] iArr) {
        this.yq = i;
        this.SN = i2;
        this.N = i3;
        this.tF = iArr;
    }

    public final int N() {
        return this.yq;
    }

    public final int SN() {
        return this.SN;
    }

    public final Object clone() {
        return new HG(this.yq, this.SN, this.N, (int[]) this.tF.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HG)) {
            return false;
        }
        HG hg = (HG) obj;
        return this.yq == hg.yq && this.SN == hg.SN && this.N == hg.N && Arrays.equals(this.tF, hg.tF);
    }

    public final int hashCode() {
        int i = this.yq;
        return Arrays.hashCode(this.tF) + (((((((i * 31) + i) * 31) + this.SN) * 31) + this.N) * 31);
    }

    public final void tF(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.SN || i5 > this.yq) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.N * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.tF;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.yq + 1) * this.SN);
        for (int i = 0; i < this.SN; i++) {
            for (int i2 = 0; i2 < this.yq; i2++) {
                sb.append(yq(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public final boolean yq(int i, int i2) {
        return ((this.tF[(i / 32) + (i2 * this.N)] >>> (i & 31)) & 1) != 0;
    }
}
