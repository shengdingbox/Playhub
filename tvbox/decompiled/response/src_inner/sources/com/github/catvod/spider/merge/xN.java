package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0154o;
import com.github.catvod.spider.merge.Aj;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class xN {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class yq extends Cu {
        private final ExecutorService yq;

        yq(ExecutorService executorService) {
            Objects.requireNonNull(executorService);
            this.yq = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.yq.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.yq.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.yq.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.yq.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.yq.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.yq.shutdownNow();
        }

        public final String toString() {
            String obj = super.toString();
            String valueOf = String.valueOf(this.yq);
            StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(obj).length() + 2);
            sb.append(obj);
            sb.append("[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
    }

    public static AbstractExecutorServiceC0114hE SN(ExecutorService executorService) {
        if (executorService instanceof AbstractExecutorServiceC0114hE) {
            return (AbstractExecutorServiceC0114hE) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new SN((ScheduledExecutorService) executorService) : new yq(executorService);
    }

    public static Executor yq() {
        return yE.yq;
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class SN extends yq implements ScheduledExecutorService {
        final ScheduledExecutorService SN;

        /* renamed from: com.github.catvod.spider.merge.xN$SN$SN  reason: collision with other inner class name */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        private static final class RunnableC0019SN extends AbstractC0154o.M<Void> implements Runnable {
            private final Runnable Gc;

            public RunnableC0019SN(Runnable runnable) {
                Objects.requireNonNull(runnable);
                this.Gc = runnable;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.github.catvod.spider.merge.AbstractC0154o
            public final String W() {
                String valueOf = String.valueOf(this.Gc);
                StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                sb.append("task=[");
                sb.append(valueOf);
                sb.append("]");
                return sb.toString();
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.Gc.run();
                } catch (Throwable th) {
                    g9(th);
                    int i = C0116hj.SN;
                    if (th instanceof RuntimeException) {
                        throw ((RuntimeException) th);
                    } else if (!(th instanceof Error)) {
                        throw new RuntimeException(th);
                    } else {
                        throw th;
                    }
                }
            }
        }

        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        private static final class yq<V> extends Aj.yq<V> implements ScheduledFuture {
            private final ScheduledFuture<?> SN;

            public yq(d7<V> d7Var, ScheduledFuture<?> scheduledFuture) {
                super(d7Var);
                this.SN = scheduledFuture;
            }

            @Override // com.github.catvod.spider.merge.an, java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.SN.cancel(z);
                }
                return cancel;
            }

            @Override // java.lang.Comparable
            public final int compareTo(Delayed delayed) {
                return this.SN.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(TimeUnit timeUnit) {
                return this.SN.getDelay(timeUnit);
            }
        }

        SN(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.SN = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            Is is = new Is(Executors.callable(runnable, null));
            return new yq(is, this.SN.schedule(is, j, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC0019SN sn = new RunnableC0019SN(runnable);
            return new yq(sn, this.SN.scheduleAtFixedRate(sn, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC0019SN sn = new RunnableC0019SN(runnable);
            return new yq(sn, this.SN.scheduleWithFixedDelay(sn, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            Is is = new Is(callable);
            return new yq(is, this.SN.schedule(is, j, timeUnit));
        }
    }
}
