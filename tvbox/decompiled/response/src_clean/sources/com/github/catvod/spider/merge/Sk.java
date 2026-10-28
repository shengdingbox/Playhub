package com.github.catvod.spider.merge;

import java.util.Arrays;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Sk extends Bp {
    public final Bp[] N;
    public final int[] tF;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Sk(com.github.catvod.spider.merge.Bp[] r6, int[] r7) {
        /*
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            r3 = 0
        L4:
            if (r3 >= r0) goto Lf
            r4 = r6[r3]
            int r2 = com.github.catvod.spider.merge.A4.M(r2, r4)
            int r3 = r3 + 1
            goto L4
        Lf:
            int r0 = r7.length
        L10:
            if (r1 >= r0) goto L1b
            r3 = r7[r1]
            int r2 = com.github.catvod.spider.merge.A4.Gc(r2, r3)
            int r1 = r1 + 1
            goto L10
        L1b:
            int r0 = r6.length
            int r0 = r0 * 2
            int r0 = com.github.catvod.spider.merge.A4.zH(r2, r0)
            r5.<init>(r0)
            r5.N = r6
            r5.tF = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Sk.<init>(com.github.catvod.spider.merge.Bp[], int[]):void");
    }

    @Override // com.github.catvod.spider.merge.Bp
    public final int Gc() {
        return this.tF.length;
    }

    @Override // com.github.catvod.spider.merge.Bp
    public final Bp N(int i) {
        return this.N[i];
    }

    @Override // com.github.catvod.spider.merge.Bp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sk) || this.yq != obj.hashCode()) {
            return false;
        }
        Sk sk = (Sk) obj;
        return Arrays.equals(this.tF, sk.tF) && Arrays.equals(this.N, sk.N);
    }

    @Override // com.github.catvod.spider.merge.Bp
    public final boolean i() {
        return this.tF[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.Bp
    public final int tF(int i) {
        return this.tF[i];
    }

    public final String toString() {
        String str;
        if (i()) {
            return "[]";
        }
        StringBuilder yq = by.yq("[");
        for (int i = 0; i < this.tF.length; i++) {
            if (i > 0) {
                yq.append(", ");
            }
            int[] iArr = this.tF;
            if (iArr[i] == Integer.MAX_VALUE) {
                str = "$";
            } else {
                yq.append(iArr[i]);
                if (this.N[i] != null) {
                    yq.append(' ');
                    str = this.N[i].toString();
                } else {
                    str = "null";
                }
            }
            yq.append(str);
        }
        yq.append("]");
        return yq.toString();
    }
}
