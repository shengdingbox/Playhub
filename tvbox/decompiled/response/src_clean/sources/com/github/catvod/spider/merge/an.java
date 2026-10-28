package com.github.catvod.spider.merge;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class an<V> extends AbstractC0130kb implements Future<V> {
    protected abstract Future<? extends V> N();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return N().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return N().get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return N().get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return N().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return N().isDone();
    }
}
