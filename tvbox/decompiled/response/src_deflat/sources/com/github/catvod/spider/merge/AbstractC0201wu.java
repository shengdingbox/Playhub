package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0154o;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.github.catvod.spider.merge.wu  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0201wu<V> extends AbstractC0120iC<V> {

    /* renamed from: com.github.catvod.spider.merge.wu$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static abstract class yq<V> extends AbstractC0201wu<V> implements AbstractC0154o.Gc<V> {
        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) {
            return (V) super.get(j, timeUnit);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, com.github.catvod.spider.merge.d7
        public final void yq(Runnable runnable, Executor executor) {
            super.yq(runnable, executor);
        }
    }

    AbstractC0201wu() {
    }
}
