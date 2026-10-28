package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class j2 implements Go {
    protected boolean tF;
    protected Ic yq;
    protected List<YW> SN = new ArrayList(100);
    protected int N = -1;

    public j2(Ic ic) {
        this.yq = ic;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    protected final int B(int i) {
        if (this.tF) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            YW nextToken = this.yq.nextToken();
            if (nextToken instanceof B8) {
                ((B8) nextToken).tF(this.SN.size());
            }
            this.SN.add(nextToken);
            if (nextToken.getType() == -1) {
                this.tF = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G() {
        if (this.N == -1) {
            dT(0);
            this.N = q(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    public final int G4(int i) {
        dT(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (true) {
            YW yw = (YW) this.SN.get(i);
            if (yw.getChannel() == 0 || yw.getType() == -1) {
                return i;
            }
            i++;
            dT(i);
        }
    }

    @Override // com.github.catvod.spider.merge.HL
    public final int Gc() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.HL
    public final void KJ() {
        int i = this.N;
        if (!(i >= 0 && (!this.tF ? i < this.SN.size() : i < this.SN.size() - 1)) && t0(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        } else if (dT(this.N + 1)) {
            this.N = q(this.N + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.Go
    public final String M(YW yw, YW yw2) {
        if (!(yw == null || yw2 == null)) {
            C0169qt SN = C0169qt.SN(yw.N(), yw2.N());
            int i = SN.yq;
            int i2 = SN.SN;
            if (i >= 0 && i2 >= 0) {
                G();
                do {
                } while (B(1000) >= 1000);
                if (i2 >= this.SN.size()) {
                    i2 = this.SN.size() - 1;
                }
                StringBuilder sb = new StringBuilder();
                while (i <= i2) {
                    YW yw3 = (YW) this.SN.get(i);
                    if (yw3.getType() == -1) {
                        break;
                    }
                    sb.append(yw3.getText());
                    i++;
                }
                return sb.toString();
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.HL
    public final int N() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.Go
    public final Ic SN() {
        return this.yq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    public final boolean dT(int i) {
        int size = (i - this.SN.size()) + 1;
        return size <= 0 || B(size) >= size;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.Go
    public final YW get(int i) {
        if (i >= 0 && i < this.SN.size()) {
            return (YW) this.SN.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("token index ");
        sb.append(i);
        sb.append(" out of range 0..");
        sb.append(this.SN.size() - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.Go
    public YW i(int i) {
        throw null;
    }

    protected int q(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.HL
    public final int size() {
        return this.SN.size();
    }

    @Override // com.github.catvod.spider.merge.HL
    public final int t0(int i) {
        return i(i).getType();
    }

    @Override // com.github.catvod.spider.merge.HL
    public final void yq() {
    }

    @Override // com.github.catvod.spider.merge.HL
    public final void zH(int i) {
        G();
        this.N = q(i);
    }
}
