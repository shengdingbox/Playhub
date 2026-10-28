package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0201wu;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class Is<V> extends AbstractC0201wu.yq<V> implements RunnableFuture<V> {
    private volatile ht<?> Gc;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private final class yq extends ht<V> {
        private final Callable<V> N;

        yq(Callable<V> callable) {
            Objects.requireNonNull(callable);
            this.N = callable;
        }

        @Override // com.github.catvod.spider.merge.ht
        final void SN(V v) {
            Is.this.ee(v);
        }

        @Override // com.github.catvod.spider.merge.ht
        final String i() {
            return this.N.toString();
        }

        @Override // com.github.catvod.spider.merge.ht
        final boolean tF() {
            return Is.this.isDone();
        }

        @Override // com.github.catvod.spider.merge.ht
        final void yq(Throwable th) {
            Is.this.g9(th);
        }

        @Override // com.github.catvod.spider.merge.ht
        final V zH() {
            return this.N.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Is(Callable<V> callable) {
        this.Gc = new yq(callable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.AbstractC0154o
    public final String W() {
        ht<?> htVar = this.Gc;
        if (htVar == null) {
            return super.W();
        }
        String valueOf = String.valueOf(htVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0154o
    protected final void q() {
        ht<?> htVar;
        if (xa() && (htVar = this.Gc) != null) {
            htVar.N();
        }
        this.Gc = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        ht<?> htVar = this.Gc;
        if (htVar != null) {
            htVar.run();
        }
        this.Gc = null;
    }
}
