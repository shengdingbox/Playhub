package com.github.catvod.spider.merge;

import java.util.NoSuchElementException;
/* renamed from: com.github.catvod.spider.merge.cM  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0086cM extends EL {
    private boolean N;
    private final int SN;
    private int tF;
    private final int yq;

    public C0086cM(int i, int i2, int i3) {
        this.yq = i3;
        this.SN = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.N = z;
        this.tF = !z ? i2 : i;
    }

    @Override // com.github.catvod.spider.merge.EL
    public final int SN() {
        int i = this.tF;
        if (i != this.SN) {
            this.tF = this.yq + i;
        } else if (this.N) {
            this.N = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.N;
    }
}
