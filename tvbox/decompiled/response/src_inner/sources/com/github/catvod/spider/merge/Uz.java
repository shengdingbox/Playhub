package com.github.catvod.spider.merge;

import java.util.Arrays;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Uz {
    private final int SN;
    private final N2[] yq;

    public Uz(N2[] n2Arr) {
        this.yq = n2Arr;
        int i = 0;
        for (N2 n2 : n2Arr) {
            i = A4.M(i, n2);
        }
        this.SN = A4.zH(i, n2Arr.length);
    }

    public static Uz yq(Uz uz, N2 n2) {
        if (uz == null) {
            return new Uz(new N2[]{n2});
        }
        N2[] n2Arr = uz.yq;
        N2[] n2Arr2 = (N2[]) Arrays.copyOf(n2Arr, n2Arr.length + 1);
        n2Arr2[n2Arr2.length - 1] = n2;
        return new Uz(n2Arr2);
    }

    public final Uz N(int i) {
        N2[] n2Arr = null;
        int i2 = 0;
        while (true) {
            N2[] n2Arr2 = this.yq;
            if (i2 >= n2Arr2.length) {
                break;
            }
            if (n2Arr2[i2].yq()) {
                N2[] n2Arr3 = this.yq;
                if (!(n2Arr3[i2] instanceof ru)) {
                    if (n2Arr == null) {
                        n2Arr = (N2[]) n2Arr3.clone();
                    }
                    n2Arr[i2] = new ru(i, this.yq[i2]);
                }
            }
            i2++;
        }
        return n2Arr == null ? this : new Uz(n2Arr);
    }

    public final void SN(zg zgVar, qk qkVar, int i) {
        Throwable th;
        N2[] n2Arr;
        int Gc = qkVar.Gc();
        boolean z = false;
        try {
            boolean z2 = false;
            for (N2 n2 : this.yq) {
                try {
                    if (n2 instanceof ru) {
                        int tF = ((ru) n2).tF() + i;
                        qkVar.zH(tF);
                        n2 = ((ru) n2).N();
                        if (tF != Gc) {
                            z2 = true;
                            n2.SN(zgVar);
                        }
                        z2 = false;
                        n2.SN(zgVar);
                    } else {
                        if (n2.yq()) {
                            qkVar.zH(Gc);
                            z2 = false;
                        }
                        n2.SN(zgVar);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = z2;
                    if (z) {
                        qkVar.zH(Gc);
                    }
                    throw th;
                }
            }
            if (z2) {
                qkVar.zH(Gc);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Uz)) {
            return false;
        }
        Uz uz = (Uz) obj;
        return this.SN == uz.SN && Arrays.equals(this.yq, uz.yq);
    }

    public final int hashCode() {
        return this.SN;
    }
}
