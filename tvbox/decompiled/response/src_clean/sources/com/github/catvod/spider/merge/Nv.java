package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Nv extends Bp {
    public final Bp N;
    public final int tF;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Nv(com.github.catvod.spider.merge.Bp r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L11
            int r0 = com.github.catvod.spider.merge.A4.M(r0, r3)
            int r0 = com.github.catvod.spider.merge.A4.Gc(r0, r4)
            r1 = 2
            int r0 = com.github.catvod.spider.merge.A4.zH(r0, r1)
            goto L16
        L11:
            r1 = 0
            int r0 = com.github.catvod.spider.merge.A4.zH(r0, r1)
        L16:
            r2.<init>(r0)
            r2.N = r3
            r2.tF = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Nv.<init>(com.github.catvod.spider.merge.Bp, int):void");
    }

    public static Nv M(Bp bp, int i) {
        return (i == Integer.MAX_VALUE && bp == null) ? Bp.SN : new Nv(bp, i);
    }

    @Override // com.github.catvod.spider.merge.Bp
    public int Gc() {
        return 1;
    }

    @Override // com.github.catvod.spider.merge.Bp
    public Bp N(int i) {
        return this.N;
    }

    @Override // com.github.catvod.spider.merge.Bp
    public boolean equals(Object obj) {
        Bp bp;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nv) || this.yq != obj.hashCode()) {
            return false;
        }
        Nv nv = (Nv) obj;
        return this.tF == nv.tF && (bp = this.N) != null && bp.equals(nv.N);
    }

    @Override // com.github.catvod.spider.merge.Bp
    public int tF(int i) {
        return this.tF;
    }

    public String toString() {
        Bp bp = this.N;
        String obj = bp != null ? bp.toString() : "";
        if (obj.length() == 0) {
            int i = this.tF;
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(this.tF) + " " + obj;
    }
}
