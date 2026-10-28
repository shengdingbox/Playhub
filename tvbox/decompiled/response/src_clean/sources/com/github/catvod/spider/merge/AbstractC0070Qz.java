package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0154o;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.github.catvod.spider.merge.Qz  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
abstract class AbstractC0070Qz<OutputT> extends AbstractC0154o.M<OutputT> {
    private static final yq KJ;
    private static final Logger q = Logger.getLogger(AbstractC0070Qz.class.getName());
    private volatile Set<Throwable> Gc = null;
    private volatile int M;

    /* renamed from: com.github.catvod.spider.merge.Qz$N */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class N extends yq {
        N() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0070Qz.yq
        final int SN(AbstractC0070Qz<?> qz) {
            int OW;
            synchronized (qz) {
                OW = AbstractC0070Qz.OW(qz);
            }
            return OW;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0070Qz.yq
        final void yq(AbstractC0070Qz qz, Set set) {
            synchronized (qz) {
                if (qz.Gc == null) {
                    qz.Gc = set;
                }
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Qz$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class SN extends yq {
        final AtomicIntegerFieldUpdater<AbstractC0070Qz<?>> SN;
        final AtomicReferenceFieldUpdater<AbstractC0070Qz<?>, Set<Throwable>> yq;

        SN(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            this.yq = atomicReferenceFieldUpdater;
            this.SN = atomicIntegerFieldUpdater;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0070Qz.yq
        final int SN(AbstractC0070Qz<?> qz) {
            return this.SN.decrementAndGet(qz);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0070Qz.yq
        final void yq(AbstractC0070Qz qz, Set set) {
            AtomicReferenceFieldUpdater<AbstractC0070Qz<?>, Set<Throwable>> atomicReferenceFieldUpdater = this.yq;
            while (!atomicReferenceFieldUpdater.compareAndSet(qz, null, set) && atomicReferenceFieldUpdater.get(qz) == null) {
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Qz$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static abstract class yq {
        yq() {
        }

        abstract int SN(AbstractC0070Qz<?> qz);

        abstract void yq(AbstractC0070Qz qz, Set set);
    }

    static {
        Throwable th;
        yq yqVar;
        try {
            yqVar = new SN(AtomicReferenceFieldUpdater.newUpdater(AbstractC0070Qz.class, Set.class, "Gc"), AtomicIntegerFieldUpdater.newUpdater(AbstractC0070Qz.class, "M"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            yqVar = new N();
        }
        KJ = yqVar;
        if (th != null) {
            q.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0070Qz(int i) {
        this.M = i;
    }

    static /* synthetic */ int OW(AbstractC0070Qz qz) {
        int i = qz.M - 1;
        qz.M = i;
        return i;
    }

    abstract void O(Set<Throwable> set);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g1() {
        this.Gc = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Throwable> n() {
        Set<Throwable> set = this.Gc;
        if (set != null) {
            return set;
        }
        Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        O(newSetFromMap);
        KJ.yq(this, newSetFromMap);
        Set<Throwable> set2 = this.Gc;
        Objects.requireNonNull(set2);
        return set2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int s() {
        return KJ.SN(this);
    }
}
