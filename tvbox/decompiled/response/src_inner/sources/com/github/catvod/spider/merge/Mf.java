package com.github.catvod.spider.merge;

import java.util.Arrays;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Mf {
    private static int[] N = new int[0];
    private int SN;
    private int[] yq = N;

    public final int N(int i) {
        if (i >= 0 && i < this.SN) {
            return this.yq[i];
        }
        throw new IndexOutOfBoundsException();
    }

    public final void SN() {
        Arrays.fill(this.yq, 0, this.SN, 0);
        this.SN = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Mf)) {
            return false;
        }
        Mf mf = (Mf) obj;
        if (this.SN != mf.SN) {
            return false;
        }
        for (int i = 0; i < this.SN; i++) {
            if (this.yq[i] != mf.yq[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.SN; i2++) {
            i = (i * 31) + this.yq[i2];
        }
        return i;
    }

    public final int i() {
        return this.SN;
    }

    public final boolean tF() {
        return this.SN == 0;
    }

    public final String toString() {
        int i = this.SN;
        return Arrays.toString(i == 0 ? N : Arrays.copyOf(this.yq, i));
    }

    public final void yq(int i) {
        int[] iArr = this.yq;
        int length = iArr.length;
        int i2 = this.SN;
        if (length == i2) {
            int i3 = i2 + 1;
            if (i3 < 0 || i3 > 2147483639) {
                throw new OutOfMemoryError();
            }
            int length2 = iArr.length == 0 ? 4 : iArr.length;
            while (length2 < i3) {
                length2 *= 2;
                if (length2 < 0 || length2 > 2147483639) {
                    length2 = 2147483639;
                }
            }
            this.yq = Arrays.copyOf(this.yq, length2);
        }
        int[] iArr2 = this.yq;
        int i4 = this.SN;
        iArr2[i4] = i;
        this.SN = i4 + 1;
    }

    public final int zH(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.SN)) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.yq;
        int i3 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        int[] iArr2 = this.yq;
        int i4 = this.SN;
        iArr2[i4 - 1] = 0;
        this.SN = i4 - 1;
        return i3;
    }
}
