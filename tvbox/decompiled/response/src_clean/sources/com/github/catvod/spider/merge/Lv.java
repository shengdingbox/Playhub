package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Lv extends j2 {
    public Lv(Ic ic) {
        super(ic);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    protected final YW F5(int i) {
        if (i != 0) {
            int i2 = this.N;
            if (i2 - i >= 0) {
                for (int i3 = 1; i3 <= i && i2 > 0; i3++) {
                    i2--;
                    dT(i2);
                    if (i2 >= size()) {
                        i2 = size() - 1;
                    } else {
                        while (i2 >= 0) {
                            YW yw = (YW) this.SN.get(i2);
                            if (!(yw.getType() == -1 || yw.getChannel() == 0)) {
                                i2--;
                            }
                        }
                    }
                }
                if (i2 < 0) {
                    return null;
                }
                return (YW) this.SN.get(i2);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<com.github.catvod.spider.merge.YW>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.j2, com.github.catvod.spider.merge.Go
    public final YW i(int i) {
        G();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return F5(-i);
        }
        int i2 = this.N;
        for (int i3 = 1; i3 < i; i3++) {
            int i4 = i2 + 1;
            if (dT(i4)) {
                i2 = G4(i4);
            }
        }
        return (YW) this.SN.get(i2);
    }

    @Override // com.github.catvod.spider.merge.j2
    protected final int q(int i) {
        return G4(i);
    }
}
