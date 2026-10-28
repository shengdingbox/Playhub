package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class i3 implements Set<J> {
    public final boolean Gc;
    private int M;
    public final ArrayList<J> N;
    public yq SN;
    public boolean i;
    public boolean t0;
    public int tF;
    protected boolean yq;
    protected BitSet zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class N extends yq {
        public N() {
            super(SN.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN extends Hj {
        public static final SN yq = new SN();

        private SN() {
        }

        @Override // com.github.catvod.spider.merge.Hj
        public final int Zm(Object obj) {
            J j = (J) obj;
            return j.zH.hashCode() + ((((j.yq.SN + 217) * 31) + j.SN) * 31);
        }

        @Override // com.github.catvod.spider.merge.Hj
        public final boolean b(Object obj, Object obj2) {
            J j = (J) obj;
            J j2 = (J) obj2;
            if (j == j2) {
                return true;
            }
            return j != null && j2 != null && j.yq.SN == j2.yq.SN && j.SN == j2.SN && j.zH.equals(j2.zH);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class yq extends wD<J> {
        public yq(Hj hj) {
            super(hj, 2);
        }

        @Override // com.github.catvod.spider.merge.wD
        protected final J[] N(int i) {
            return new J[i];
        }

        @Override // com.github.catvod.spider.merge.wD
        protected final J[][] tF(int i) {
            return new J[i];
        }

        @Override // com.github.catvod.spider.merge.wD
        protected final J yq(Object obj) {
            if (!(obj instanceof J)) {
                return null;
            }
            return (J) obj;
        }
    }

    public i3() {
        this(true);
    }

    public i3(boolean z) {
        this.yq = false;
        this.N = new ArrayList<>(7);
        this.M = -1;
        this.SN = new N();
        this.Gc = z;
    }

    public final void SN(AbstractC0199w wVar) {
        if (this.yq) {
            throw new IllegalStateException("This set is readonly");
        } else if (!this.SN.isEmpty()) {
            Iterator<J> it = this.N.iterator();
            while (it.hasNext()) {
                J next = it.next();
                Bp bp = next.N;
                C0172rS rSVar = wVar.SN;
                if (rSVar != null) {
                    synchronized (rSVar) {
                        bp = Bp.SN(bp, wVar.SN, new IdentityHashMap());
                    }
                }
                next.N = bp;
            }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        yq((J) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends J> collection) {
        for (J j : collection) {
            yq(j, null);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (!this.yq) {
            this.N.clear();
            this.M = -1;
            this.SN.clear();
            return;
        }
        throw new IllegalStateException("This set is readonly");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        yq yqVar = this.SN;
        if (yqVar != null) {
            return yqVar.contains(obj);
        }
        throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        ArrayList<J> arrayList = this.N;
        return arrayList != null && arrayList.equals(i3Var.N) && this.Gc == i3Var.Gc && this.tF == i3Var.tF && this.zH == i3Var.zH && this.i == i3Var.i && this.t0 == i3Var.t0;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        if (!this.yq) {
            return this.N.hashCode();
        }
        if (this.M == -1) {
            this.M = this.N.hashCode();
        }
        return this.M;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.N.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<J> iterator() {
        return this.N.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.N.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.SN.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.SN.toArray(tArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.N.toString());
        if (this.i) {
            sb.append(",hasSemanticContext=");
            sb.append(this.i);
        }
        if (this.tF != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.tF);
        }
        if (this.zH != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.zH);
        }
        if (this.t0) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/J;Lcom/github/catvod/spider/merge/lE<Lcom/github/catvod/spider/merge/Bp;Lcom/github/catvod/spider/merge/Bp;Lcom/github/catvod/spider/merge/Bp;>;)Z */
    public final void yq(J j, C0132lE lEVar) {
        if (!this.yq) {
            if (j.zH != r2.yq) {
                this.i = true;
            }
            if (j.SN() > 0) {
                this.t0 = true;
            }
            J i = this.SN.i(j);
            if (i == j) {
                this.M = -1;
                this.N.add(j);
                return;
            }
            Bp t0 = Bp.t0(i.N, j.N, !this.Gc, lEVar);
            i.tF = Math.max(i.tF, j.tF);
            if (j.N()) {
                i.tF |= 1073741824;
            }
            i.N = t0;
            return;
        }
        throw new IllegalStateException("This set is readonly");
    }
}
