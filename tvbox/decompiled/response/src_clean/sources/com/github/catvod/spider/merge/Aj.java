package com.github.catvod.spider.merge;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class Aj<V> extends an<V> implements d7<V> {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class yq<V> extends Aj<V> {
        private final d7<V> yq;

        /* JADX INFO: Access modifiers changed from: protected */
        public yq(d7<V> d7Var) {
            this.yq = d7Var;
        }

        @Override // com.github.catvod.spider.merge.an
        protected final Future N() {
            return this.yq;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0130kb
        protected final Object SN() {
            return this.yq;
        }

        @Override // com.github.catvod.spider.merge.Aj
        protected final d7<V> tF() {
            return this.yq;
        }
    }

    protected Aj() {
    }

    protected abstract d7<? extends V> tF();

    @Override // com.github.catvod.spider.merge.d7
    public final void yq(Runnable runnable, Executor executor) {
        tF().yq(runnable, executor);
    }
}
