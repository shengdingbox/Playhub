package com.github.catvod.spider.merge;

import java.util.Arrays;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class E implements Cloneable {
    private int SN;
    private int[] yq;

    public E() {
        this.SN = 0;
        this.yq = new int[1];
    }

    E(int[] iArr, int i) {
        this.yq = iArr;
        this.SN = i;
    }

    private void tF(int i) {
        int[] iArr = this.yq;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.yq = iArr2;
        }
    }

    public final void Gc(E e) {
        if (this.SN == e.SN) {
            int i = 0;
            while (true) {
                int[] iArr = this.yq;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ e.yq[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public final void N(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        tF(this.SN + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            yq(z);
            i2--;
        }
    }

    public final void SN(E e) {
        int i = e.SN;
        tF(this.SN + i);
        for (int i2 = 0; i2 < i; i2++) {
            yq(e.zH(i2));
        }
    }

    public final Object clone() {
        return new E((int[]) this.yq.clone(), this.SN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e = (E) obj;
        return this.SN == e.SN && Arrays.equals(this.yq, e.yq);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.yq) + (this.SN * 31);
    }

    public final int i() {
        return this.SN;
    }

    public final int t0() {
        return (this.SN + 7) / 8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.SN);
        for (int i = 0; i < this.SN; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(zH(i) ? 'X' : '.');
        }
        return sb.toString();
    }

    public final void yq(boolean z) {
        tF(this.SN + 1);
        if (z) {
            int[] iArr = this.yq;
            int i = this.SN;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.SN++;
    }

    public final boolean zH(int i) {
        return ((1 << (i & 31)) & this.yq[i / 32]) != 0;
    }
}
