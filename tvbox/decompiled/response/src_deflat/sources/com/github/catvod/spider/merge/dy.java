package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0186tl;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class dy<V> extends AbstractC0186tl<Object, V> {
    private dy<V>.SN<?> F5;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private abstract class SN<T> extends ht<T> {
        private final Executor N;
        final /* synthetic */ dy tF;

        SN(dy dyVar) {
            yE yEVar = yE.yq;
            this.tF = dyVar;
            this.N = yEVar;
        }

        final void Gc() {
            try {
                this.N.execute(this);
            } catch (RejectedExecutionException e) {
                this.tF.g9(e);
            }
        }

        @Override // com.github.catvod.spider.merge.ht
        final void SN(T t) {
            this.tF.F5 = null;
            dy.this.ee(t);
        }

        @Override // com.github.catvod.spider.merge.ht
        final boolean tF() {
            return this.tF.isDone();
        }

        @Override // com.github.catvod.spider.merge.ht
        final void yq(Throwable th) {
            dy dyVar;
            this.tF.F5 = null;
            if (th instanceof ExecutionException) {
                dyVar = this.tF;
                th = ((ExecutionException) th).getCause();
            } else if (th instanceof CancellationException) {
                this.tF.cancel(false);
                return;
            } else {
                dyVar = this.tF;
            }
            dyVar.g9(th);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private final class yq extends dy<V>.SN<V> {
        private final Callable<V> zH;

        /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Callable<TV;>;Ljava/util/concurrent/Executor;)V */
        yq(Callable callable) {
            super(dy.this);
            this.zH = callable;
        }

        @Override // com.github.catvod.spider.merge.ht
        final String i() {
            return this.zH.toString();
        }

        @Override // com.github.catvod.spider.merge.ht
        final V zH() {
            return this.zH.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dy(E3 e3, Callable callable) {
        super(e3);
        this.F5 = new yq(callable);
        U();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.AbstractC0186tl
    public final void Fz(AbstractC0186tl.yq yqVar) {
        super.Fz(yqVar);
        if (yqVar == AbstractC0186tl.yq.OUTPUT_FUTURE_DONE) {
            this.F5 = null;
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0186tl
    final void Zm() {
    }

    @Override // com.github.catvod.spider.merge.AbstractC0186tl
    final void g() {
        dy<V>.SN<?> sn = this.F5;
        if (sn != null) {
            sn.Gc();
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0154o
    protected final void v3() {
        dy<V>.SN<?> sn = this.F5;
        if (sn != null) {
            sn.N();
        }
    }
}
