package com.github.catvod.spider.merge;

import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class DS<E> extends rd<E> {
    static final rd<Object> i = new DS(new Object[0], 0);
    final transient Object[] tF;
    private final transient int zH;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DS(Object[] objArr, int i2) {
        this.tF = objArr;
        this.zH = i2;
    }

    @Override // com.github.catvod.spider.merge.E3
    final int N() {
        return this.zH;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.E3
    public final Object[] SN() {
        return this.tF;
    }

    @Override // java.util.List
    public final E get(int i2) {
        C0072So.N(i2, this.zH);
        E e = (E) this.tF[i2];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zH;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.E3
    public final int tF() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.rd, com.github.catvod.spider.merge.E3
    final int yq(Object[] objArr) {
        System.arraycopy(this.tF, 0, objArr, 0, this.zH);
        return this.zH + 0;
    }
}
