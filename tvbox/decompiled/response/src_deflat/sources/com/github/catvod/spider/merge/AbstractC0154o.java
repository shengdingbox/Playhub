package com.github.catvod.spider.merge;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* renamed from: com.github.catvod.spider.merge.o  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0154o<V> extends PY implements d7<V> {
    private static final yq i;
    private static final Object t0;
    static final boolean tF;
    private static final Logger zH;
    private volatile q N;
    private volatile tF SN;
    private volatile Object yq;

    /* renamed from: com.github.catvod.spider.merge.o$Gc */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    interface Gc<V> extends d7<V> {
    }

    /* renamed from: com.github.catvod.spider.merge.o$KJ */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class KJ extends yq {
        static final long N;
        static final long SN;
        static final long i;
        static final long tF;
        static final Unsafe yq;
        static final long zH;

        /* renamed from: com.github.catvod.spider.merge.o$KJ$yq */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        final class yq implements PrivilegedExceptionAction<Unsafe> {
            yq() {
            }

            /* renamed from: yq */
            public final Unsafe run() {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new yq());
            }
            try {
                N = unsafe.objectFieldOffset(AbstractC0154o.class.getDeclaredField("N"));
                SN = unsafe.objectFieldOffset(AbstractC0154o.class.getDeclaredField("SN"));
                tF = unsafe.objectFieldOffset(AbstractC0154o.class.getDeclaredField("yq"));
                zH = unsafe.objectFieldOffset(q.class.getDeclaredField("yq"));
                i = unsafe.objectFieldOffset(q.class.getDeclaredField("SN"));
                yq = unsafe;
            } catch (Exception e2) {
                int i2 = C0116hj.SN;
                if (e2 instanceof RuntimeException) {
                    throw ((RuntimeException) e2);
                } else if (!(e2 instanceof Error)) {
                    throw new RuntimeException(e2);
                } else {
                    throw ((Error) e2);
                }
            }
        }

        KJ() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final boolean N(AbstractC0154o<?> oVar, q qVar, q qVar2) {
            return LY.yq(yq, oVar, N, qVar, qVar2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final boolean SN(AbstractC0154o<?> oVar, Object obj, Object obj2) {
            return LY.yq(yq, oVar, tF, obj, obj2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final void i(q qVar, q qVar2) {
            yq.putObject(qVar, i, qVar2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final void t0(q qVar, Thread thread) {
            yq.putObject(qVar, zH, thread);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final tF tF(AbstractC0154o oVar) {
            tF tFVar;
            tF tFVar2 = tF.tF;
            do {
                tFVar = oVar.SN;
                if (tFVar2 == tFVar) {
                    return tFVar;
                }
            } while (!LY.yq(yq, oVar, SN, tFVar, tFVar2));
            return tFVar;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final boolean yq(AbstractC0154o<?> oVar, tF tFVar, tF tFVar2) {
            return LY.yq(yq, oVar, SN, tFVar, tFVar2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final q zH(AbstractC0154o oVar) {
            q qVar;
            q qVar2 = q.N;
            do {
                qVar = oVar.N;
                if (qVar2 == qVar) {
                    return qVar;
                }
            } while (!N(oVar, qVar, qVar2));
            return qVar;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.o$M */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static abstract class M<V> extends AbstractC0154o<V> implements Gc<V> {
        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return AbstractC0154o.super.cancel(z);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final V get() {
            return (V) AbstractC0154o.super.get();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) {
            return (V) AbstractC0154o.super.get(j, timeUnit);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final boolean isCancelled() {
            return AbstractC0154o.super.isCancelled();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, java.util.concurrent.Future
        public final boolean isDone() {
            return AbstractC0154o.super.isDone();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o, com.github.catvod.spider.merge.d7
        public final void yq(Runnable runnable, Executor executor) {
            AbstractC0154o.super.yq(runnable, executor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.o$N */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class N {
        final Throwable yq;

        /* renamed from: com.github.catvod.spider.merge.o$N$yq */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        final class yq extends Throwable {
            yq() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new N(new yq());
        }

        N(Throwable th) {
            Objects.requireNonNull(th);
            this.yq = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.o$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN {
        static final SN N;
        static final SN tF;
        final Throwable SN;
        final boolean yq;

        static {
            if (AbstractC0154o.tF) {
                tF = null;
                N = null;
                return;
            }
            tF = new SN(false, null);
            N = new SN(true, null);
        }

        SN(boolean z, Throwable th) {
            this.yq = z;
            this.SN = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.o$i */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class i<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Object unused = null.yq;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.o$q */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class q {
        static final q N = new q(false);
        volatile q SN;
        volatile Thread yq;

        q() {
            AbstractC0154o.i.t0(this, Thread.currentThread());
        }

        q(boolean z) {
        }
    }

    /* renamed from: com.github.catvod.spider.merge.o$t0 */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class t0 extends yq {
        t0() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final boolean N(AbstractC0154o<?> oVar, q qVar, q qVar2) {
            synchronized (oVar) {
                if (((AbstractC0154o) oVar).N != qVar) {
                    return false;
                }
                ((AbstractC0154o) oVar).N = qVar2;
                return true;
            }
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final boolean SN(AbstractC0154o<?> oVar, Object obj, Object obj2) {
            synchronized (oVar) {
                if (((AbstractC0154o) oVar).yq != obj) {
                    return false;
                }
                ((AbstractC0154o) oVar).yq = obj2;
                return true;
            }
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final void i(q qVar, q qVar2) {
            qVar.SN = qVar2;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final void t0(q qVar, Thread thread) {
            qVar.yq = thread;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final tF tF(AbstractC0154o oVar) {
            tF tFVar;
            tF tFVar2 = tF.tF;
            synchronized (oVar) {
                tFVar = oVar.SN;
                if (tFVar != tFVar2) {
                    oVar.SN = tFVar2;
                }
            }
            return tFVar;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final boolean yq(AbstractC0154o<?> oVar, tF tFVar, tF tFVar2) {
            synchronized (oVar) {
                if (((AbstractC0154o) oVar).SN != tFVar) {
                    return false;
                }
                ((AbstractC0154o) oVar).SN = tFVar2;
                return true;
            }
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final q zH(AbstractC0154o oVar) {
            q qVar;
            q qVar2 = q.N;
            synchronized (oVar) {
                qVar = oVar.N;
                if (qVar != qVar2) {
                    oVar.N = qVar2;
                }
            }
            return qVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.o$tF */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class tF {
        static final tF tF = new tF();
        tF N;
        final Executor SN;
        final Runnable yq;

        tF() {
            this.yq = null;
            this.SN = null;
        }

        tF(Runnable runnable, Executor executor) {
            this.yq = runnable;
            this.SN = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.o$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class yq {
        yq() {
        }

        abstract boolean N(AbstractC0154o<?> oVar, q qVar, q qVar2);

        abstract boolean SN(AbstractC0154o<?> oVar, Object obj, Object obj2);

        abstract void i(q qVar, q qVar2);

        abstract void t0(q qVar, Thread thread);

        abstract tF tF(AbstractC0154o oVar);

        abstract boolean yq(AbstractC0154o<?> oVar, tF tFVar, tF tFVar2);

        abstract q zH(AbstractC0154o oVar);
    }

    /* renamed from: com.github.catvod.spider.merge.o$zH */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class zH extends yq {
        final AtomicReferenceFieldUpdater<AbstractC0154o, q> N;
        final AtomicReferenceFieldUpdater<q, q> SN;
        final AtomicReferenceFieldUpdater<AbstractC0154o, tF> tF;
        final AtomicReferenceFieldUpdater<q, Thread> yq;
        final AtomicReferenceFieldUpdater<AbstractC0154o, Object> zH;

        zH(AtomicReferenceFieldUpdater<q, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<q, q> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0154o, q> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0154o, tF> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0154o, Object> atomicReferenceFieldUpdater5) {
            this.yq = atomicReferenceFieldUpdater;
            this.SN = atomicReferenceFieldUpdater2;
            this.N = atomicReferenceFieldUpdater3;
            this.tF = atomicReferenceFieldUpdater4;
            this.zH = atomicReferenceFieldUpdater5;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final boolean N(AbstractC0154o<?> oVar, q qVar, q qVar2) {
            AtomicReferenceFieldUpdater<AbstractC0154o, q> atomicReferenceFieldUpdater = this.N;
            while (!atomicReferenceFieldUpdater.compareAndSet(oVar, qVar, qVar2)) {
                if (atomicReferenceFieldUpdater.get(oVar) != qVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final boolean SN(AbstractC0154o<?> oVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractC0154o, Object> atomicReferenceFieldUpdater = this.zH;
            while (!atomicReferenceFieldUpdater.compareAndSet(oVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(oVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final void i(q qVar, q qVar2) {
            this.SN.lazySet(qVar, qVar2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final void t0(q qVar, Thread thread) {
            this.yq.lazySet(qVar, thread);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final tF tF(AbstractC0154o oVar) {
            return this.tF.getAndSet(oVar, tF.tF);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final boolean yq(AbstractC0154o<?> oVar, tF tFVar, tF tFVar2) {
            AtomicReferenceFieldUpdater<AbstractC0154o, tF> atomicReferenceFieldUpdater = this.tF;
            while (!atomicReferenceFieldUpdater.compareAndSet(oVar, tFVar, tFVar2)) {
                if (atomicReferenceFieldUpdater.get(oVar) != tFVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154o.yq
        final q zH(AbstractC0154o oVar) {
            return this.N.getAndSet(oVar, q.N);
        }
    }

    static {
        boolean z;
        Throwable th;
        yq yqVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        tF = z;
        zH = Logger.getLogger(AbstractC0154o.class.getName());
        Throwable th2 = null;
        try {
            yqVar = new KJ();
            th = null;
        } catch (Throwable th3) {
            th = th3;
            try {
                yqVar = new zH(AtomicReferenceFieldUpdater.newUpdater(q.class, Thread.class, "yq"), AtomicReferenceFieldUpdater.newUpdater(q.class, q.class, "SN"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0154o.class, q.class, "N"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0154o.class, tF.class, "SN"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0154o.class, Object.class, "yq"));
            } catch (Throwable th4) {
                th2 = th4;
                yqVar = new t0();
            }
        }
        i = yqVar;
        if (th2 != null) {
            Logger logger = zH;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        t0 = new Object();
    }

    private void B(StringBuilder sb, Object obj) {
        String str;
        if (obj == null) {
            str = "null";
        } else if (obj == this) {
            str = "this future";
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            str = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(str);
    }

    private static <V> V F5(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private static void G(AbstractC0154o<?> oVar) {
        Objects.requireNonNull(oVar);
        for (q zH2 = i.zH(oVar); zH2 != null; zH2 = zH2.SN) {
            Thread thread = zH2.yq;
            if (thread != null) {
                zH2.yq = null;
                LockSupport.unpark(thread);
            }
        }
        oVar.q();
        tF tF2 = i.tF(oVar);
        tF tFVar = null;
        while (tF2 != null) {
            tF2 = tF2.N;
            tF2.N = tFVar;
            tFVar = tF2;
        }
        while (tFVar != null) {
            tF tFVar2 = tFVar.N;
            Runnable runnable = tFVar.yq;
            Objects.requireNonNull(runnable);
            if (!(runnable instanceof i)) {
                Executor executor = tFVar.SN;
                Objects.requireNonNull(executor);
                G4(runnable, executor);
                tFVar = tFVar2;
            } else {
                i iVar = (i) runnable;
                throw null;
            }
        }
    }

    private static void G4(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zH;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    private void KJ(StringBuilder sb) {
        String str = "]";
        try {
            Object F5 = F5(this);
            sb.append("SUCCESS, result=[");
            B(sb, F5);
            sb.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V dT(Object obj) {
        if (obj instanceof SN) {
            Throwable th = ((SN) obj).SN;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof N) {
            throw new ExecutionException(((N) obj).yq);
        } else if (obj == t0) {
            return null;
        } else {
            return obj;
        }
    }

    private void v(q qVar) {
        qVar.yq = null;
        while (true) {
            q qVar2 = this.N;
            if (qVar2 != q.N) {
                q qVar3 = null;
                while (qVar2 != null) {
                    q qVar4 = qVar2.SN;
                    if (qVar2.yq != null) {
                        qVar3 = qVar2;
                    } else if (qVar3 != null) {
                        qVar3.SN = qVar4;
                        if (qVar3.yq == null) {
                            break;
                        }
                    } else if (!i.N(this, qVar2, qVar4)) {
                        break;
                    }
                    qVar2 = qVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.PY
    public final Throwable SN() {
        if (!(this instanceof Gc)) {
            return null;
        }
        Object obj = this.yq;
        if (obj instanceof N) {
            return ((N) obj).yq;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String W() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        SN sn;
        Object obj = this.yq;
        if (!(obj == null) && !(obj instanceof i)) {
            return false;
        }
        if (tF) {
            sn = new SN(z, new CancellationException("Future.cancel() was called."));
        } else {
            sn = z ? SN.N : SN.tF;
            Objects.requireNonNull(sn);
        }
        while (!i.SN(this, obj, sn)) {
            obj = this.yq;
            if (!(obj instanceof i)) {
                return false;
            }
        }
        if (z) {
            v3();
        }
        G(this);
        if (!(obj instanceof i)) {
            return true;
        }
        Objects.requireNonNull((i) obj);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ee(V v) {
        if (v == null) {
            v = (V) t0;
        }
        if (!i.SN(this, null, v)) {
            return false;
        }
        G(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean g9(Throwable th) {
        Objects.requireNonNull(th);
        if (!i.SN(this, null, new N(th))) {
            return false;
        }
        G(this);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (java.lang.Thread.interrupted() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        r0 = r6.yq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if ((r4 & (!(r0 instanceof com.github.catvod.spider.merge.AbstractC0154o.i))) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        return dT(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        v(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get() {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L68
            java.lang.Object r0 = r6.yq
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof com.github.catvod.spider.merge.AbstractC0154o.i
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.dT(r0)
            return r0
        L1a:
            com.github.catvod.spider.merge.o$q r0 = r6.N
            com.github.catvod.spider.merge.o$q r3 = com.github.catvod.spider.merge.AbstractC0154o.q.N
            if (r0 == r3) goto L5e
            com.github.catvod.spider.merge.o$q r3 = new com.github.catvod.spider.merge.o$q
            r3.<init>()
        L25:
            com.github.catvod.spider.merge.o$yq r4 = N()
            r4.i(r3, r0)
            com.github.catvod.spider.merge.o$yq r4 = com.github.catvod.spider.merge.AbstractC0154o.i
            boolean r0 = r4.N(r6, r0, r3)
            if (r0 == 0) goto L58
        L34:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4f
            java.lang.Object r0 = r6.yq
            if (r0 == 0) goto L43
            r4 = 1
            goto L44
        L43:
            r4 = 0
        L44:
            boolean r5 = r0 instanceof com.github.catvod.spider.merge.AbstractC0154o.i
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L34
            java.lang.Object r0 = r6.dT(r0)
            return r0
        L4f:
            r6.v(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L58:
            com.github.catvod.spider.merge.o$q r0 = r6.N
            com.github.catvod.spider.merge.o$q r4 = com.github.catvod.spider.merge.AbstractC0154o.q.N
            if (r0 != r4) goto L25
        L5e:
            java.lang.Object r0 = r6.yq
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = r6.dT(r0)
            return r0
        L68:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            goto L6f
        L6e:
            throw r0
        L6f:
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AbstractC0154o.get():java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.yq instanceof SN;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.yq;
        return (!(obj instanceof i)) & (obj != null);
    }

    protected void q() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L1e
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L26
        L1e:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
        L26:
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r7)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r7.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4d
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lcc
        L4d:
            boolean r1 = r7.isDone()
            if (r1 == 0) goto L58
            r7.KJ(r0)
            goto Lcc
        L58:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r7.yq
            boolean r4 = r3 instanceof com.github.catvod.spider.merge.AbstractC0154o.i
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L86
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.github.catvod.spider.merge.o$i r3 = (com.github.catvod.spider.merge.AbstractC0154o.i) r3
            java.util.Objects.requireNonNull(r3)
            r3 = 0
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L78 java.lang.RuntimeException -> L7a
            goto Lb9
        L78:
            r3 = move-exception
            goto L7b
        L7a:
            r3 = move-exception
        L7b:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            goto Lb9
        L86:
            java.lang.String r3 = r7.W()     // Catch: java.lang.StackOverflowError -> L8f java.lang.RuntimeException -> L91
            java.lang.String r3 = com.github.catvod.spider.merge.Ya.SN(r3)     // Catch: java.lang.StackOverflowError -> L8f java.lang.RuntimeException -> L91
            goto Laf
        L8f:
            r3 = move-exception
            goto L92
        L91:
            r3 = move-exception
        L92:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 38
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        Laf:
            if (r3 == 0) goto Lbc
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
        Lb9:
            r0.append(r2)
        Lbc:
            boolean r3 = r7.isDone()
            if (r3 == 0) goto Lcc
            int r3 = r0.length()
            r0.delete(r1, r3)
            r7.KJ(r0)
        Lcc:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AbstractC0154o.toString():java.lang.String");
    }

    protected void v3() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean xa() {
        Object obj = this.yq;
        return (obj instanceof SN) && ((SN) obj).yq;
    }

    @Override // com.github.catvod.spider.merge.d7
    public void yq(Runnable runnable, Executor executor) {
        tF tFVar;
        Objects.requireNonNull(executor, "Executor was null.");
        if (isDone() || (tFVar = this.SN) == tF.tF) {
            G4(runnable, executor);
        }
        tF tFVar2 = new tF(runnable, executor);
        do {
            tFVar2.N = tFVar;
            if (!i.yq(this, tFVar, tFVar2)) {
                tFVar = this.SN;
            } else {
                return;
            }
        } while (tFVar != tF.tF);
        G4(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r19, java.lang.Math.min(r4, 2147483647999999999L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (java.lang.Thread.interrupted() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        r4 = r19.yq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        if ((r5 & (!(r4 instanceof com.github.catvod.spider.merge.AbstractC0154o.i))) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        return dT(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r4 >= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        v(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        v(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AbstractC0154o.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
