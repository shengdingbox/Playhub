package com.github.catvod.spider.merge;

import java.util.NoSuchElementException;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
abstract class nQ<E> extends O9<E> {
    private int SN;
    private final int yq;

    /* JADX INFO: Access modifiers changed from: protected */
    public nQ(int i, int i2) {
        C0072So.tF(i2, i);
        this.yq = i;
        this.SN = i2;
    }

    protected abstract E SN(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.SN < this.yq;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.SN > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.SN;
            this.SN = i + 1;
            return SN(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.SN;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.SN - 1;
            this.SN = i;
            return SN(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.SN - 1;
    }
}
