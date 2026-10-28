package com.github.catvod.spider.merge;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
abstract class ht<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable yq = new N();
    private static final Runnable SN = new N();

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class N implements Runnable {
        N() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN extends AbstractOwnableSynchronizer implements Runnable {
        private final ht<?> yq;

        SN(ht htVar, yq yqVar) {
            this.yq = htVar;
        }

        static void yq(SN sn, Thread thread) {
            sn.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return this.yq.toString();
        }
    }

    private void t0(Thread thread) {
        Runnable runnable = get();
        SN sn = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof SN;
            if (!z2 && runnable != SN) {
                break;
            }
            if (z2) {
                sn = (SN) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = SN;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(sn);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            SN sn = new SN(this, null);
            SN.yq(sn, Thread.currentThread());
            if (compareAndSet(runnable, sn)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(yq) == SN) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract void SN(T t);

    abstract String i();

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !tF();
            if (z) {
                try {
                    t = zH();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, yq)) {
                        t0(currentThread);
                    }
                    if (z) {
                        yq(th);
                        return;
                    }
                    return;
                }
            }
            if (!compareAndSet(currentThread, yq)) {
                t0(currentThread);
            }
            if (z) {
                SN(t);
            }
        }
    }

    abstract boolean tF();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == yq) {
            str = "running=[DONE]";
        } else if (runnable instanceof SN) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String i = i();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + String.valueOf(str).length() + 2);
        sb2.append(str);
        sb2.append(", ");
        sb2.append(i);
        return sb2.toString();
    }

    abstract void yq(Throwable th);

    abstract T zH();
}
