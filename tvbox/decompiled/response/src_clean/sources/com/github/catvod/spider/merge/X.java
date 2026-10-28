package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0138mI;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class X extends Hj {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN<V> {
        private final rd<d7<? extends V>> yq;

        SN(rd rdVar) {
            this.yq = rdVar;
        }

        public final d7 yq(Callable callable) {
            return new dy(this.yq, callable);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class yq<V> implements Runnable {
        final AbstractC0115hb<? super V> SN;
        final Future<V> yq;

        yq(Future<V> future, AbstractC0115hb<? super V> hbVar) {
            this.yq = future;
            this.SN = hbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable e;
            Throwable M;
            Future<V> future = this.yq;
            if (!(future instanceof PY) || (M = eb.M((PY) future)) == null) {
                try {
                    this.SN.onSuccess(X.g(this.yq));
                } catch (Error e2) {
                    e = e2;
                    this.SN.onFailure(e);
                } catch (RuntimeException e3) {
                    e = e3;
                    this.SN.onFailure(e);
                } catch (ExecutionException e4) {
                    this.SN.onFailure(e4.getCause());
                }
            } else {
                this.SN.onFailure(M);
            }
        }

        public final String toString() {
            C0138mI.yq yq = C0138mI.yq(this);
            yq.yq(this.SN);
            return yq.toString();
        }
    }

    public static <V> void Dr(d7<V> d7Var, AbstractC0115hb<? super V> hbVar, Executor executor) {
        d7Var.yq(new yq(d7Var, hbVar), executor);
    }

    public static <V> d7<V> H(Throwable th) {
        return new C0117hy(th);
    }

    @SafeVarargs
    public static <V> SN<V> U(d7<? extends V>... d7VarArr) {
        return new SN<>(rd.i(d7VarArr));
    }

    public static <V> V g(Future<V> future) {
        if (future.isDone()) {
            return (V) A4.t0(future);
        }
        throw new IllegalStateException(Ya.zH("Future was expected to be done: %s", future));
    }
}
