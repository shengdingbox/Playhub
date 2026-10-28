package com.github.catvod.spider.merge;

import java.util.Iterator;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class vR implements Iterable<Integer> {
    private final int N;
    private final int SN;
    private final int yq;

    public vR(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.yq = i;
            if (i3 > 0) {
                if (i < i2) {
                    int i4 = i2 % i3;
                    int i5 = i % i3;
                    int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                    i2 -= i6 < 0 ? i6 + i3 : i6;
                }
            } else if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
            this.SN = i2;
            this.N = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int N() {
        return this.N;
    }

    public final int SN() {
        return this.SN;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C0086cM(this.yq, this.SN, this.N);
    }

    public final int yq() {
        return this.yq;
    }
}
