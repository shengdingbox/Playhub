package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class r2 {
    public static final zH yq = new zH();

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class N extends r2 {
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN extends N {
        public final r2[] SN;

        public SN(r2 r2Var, r2 r2Var2) {
            HashSet hashSet = new HashSet();
            if (r2Var instanceof SN) {
                hashSet.addAll(Arrays.asList(((SN) r2Var).SN));
            } else {
                hashSet.add(r2Var);
            }
            if (r2Var2 instanceof SN) {
                hashSet.addAll(Arrays.asList(((SN) r2Var2).SN));
            } else {
                hashSet.add(r2Var2);
            }
            List yq = r2.yq(hashSet);
            if (!yq.isEmpty()) {
                hashSet.add((tF) Collections.max(yq));
            }
            this.SN = (r2[]) hashSet.toArray(new r2[hashSet.size()]);
        }

        @Override // com.github.catvod.spider.merge.r2
        public final boolean N(wg<?, ?> wgVar, My my) {
            for (r2 r2Var : this.SN) {
                if (r2Var.N(wgVar, my)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SN)) {
                return false;
            }
            return Arrays.equals(this.SN, ((SN) obj).SN);
        }

        public final int hashCode() {
            r2[] r2VarArr = this.SN;
            int hashCode = SN.class.hashCode();
            for (r2 r2Var : r2VarArr) {
                hashCode = A4.M(hashCode, r2Var);
            }
            return A4.zH(hashCode, r2VarArr.length);
        }

        @Override // com.github.catvod.spider.merge.r2
        public final r2 tF(wg<?, ?> wgVar, My my) {
            ArrayList arrayList = new ArrayList();
            r2[] r2VarArr = this.SN;
            int length = r2VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i < length) {
                    r2 r2Var = r2VarArr[i];
                    r2 tF = r2Var.tF(wgVar, my);
                    if (tF == r2Var) {
                        i3 = 0;
                    }
                    i2 |= i3;
                    zH zHVar = r2.yq;
                    if (tF == zHVar) {
                        return zHVar;
                    }
                    if (tF != null) {
                        arrayList.add(tF);
                    }
                    i++;
                } else if (i2 == 0) {
                    return this;
                } else {
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    r2 r2Var2 = (r2) arrayList.get(0);
                    while (i3 < arrayList.size()) {
                        r2Var2 = r2.zH(r2Var2, (r2) arrayList.get(i3));
                        i3++;
                    }
                    return r2Var2;
                }
            }
        }

        public final String toString() {
            return eb.tF(Arrays.asList(this.SN).iterator(), "||");
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class tF extends r2 implements Comparable<tF> {
        public final int SN;

        protected tF() {
            this.SN = 0;
        }

        public tF(int i) {
            this.SN = i;
        }

        @Override // com.github.catvod.spider.merge.r2
        public final boolean N(wg<?, ?> wgVar, My my) {
            return wgVar.Gc(this.SN);
        }

        @Override // java.lang.Comparable
        public final int compareTo(tF tFVar) {
            return this.SN - tFVar.SN;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof tF)) {
                return false;
            }
            return this == obj || this.SN == ((tF) obj).SN;
        }

        public final int hashCode() {
            return 31 + this.SN;
        }

        @Override // com.github.catvod.spider.merge.r2
        public final r2 tF(wg<?, ?> wgVar, My my) {
            if (wgVar.Gc(this.SN)) {
                return r2.yq;
            }
            return null;
        }

        public final String toString() {
            StringBuilder yq = by.yq("{");
            yq.append(this.SN);
            yq.append(">=prec}?");
            return yq.toString();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq extends N {
        public final r2[] SN;

        public yq(r2 r2Var, r2 r2Var2) {
            HashSet hashSet = new HashSet();
            if (r2Var instanceof yq) {
                hashSet.addAll(Arrays.asList(((yq) r2Var).SN));
            } else {
                hashSet.add(r2Var);
            }
            if (r2Var2 instanceof yq) {
                hashSet.addAll(Arrays.asList(((yq) r2Var2).SN));
            } else {
                hashSet.add(r2Var2);
            }
            List yq = r2.yq(hashSet);
            if (!yq.isEmpty()) {
                hashSet.add((tF) Collections.min(yq));
            }
            this.SN = (r2[]) hashSet.toArray(new r2[hashSet.size()]);
        }

        @Override // com.github.catvod.spider.merge.r2
        public final boolean N(wg<?, ?> wgVar, My my) {
            for (r2 r2Var : this.SN) {
                if (!r2Var.N(wgVar, my)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof yq)) {
                return false;
            }
            return Arrays.equals(this.SN, ((yq) obj).SN);
        }

        public final int hashCode() {
            r2[] r2VarArr = this.SN;
            int hashCode = yq.class.hashCode();
            for (r2 r2Var : r2VarArr) {
                hashCode = A4.M(hashCode, r2Var);
            }
            return A4.zH(hashCode, r2VarArr.length);
        }

        @Override // com.github.catvod.spider.merge.r2
        public final r2 tF(wg<?, ?> wgVar, My my) {
            ArrayList arrayList = new ArrayList();
            r2[] r2VarArr = this.SN;
            int length = r2VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i < length) {
                    r2 r2Var = r2VarArr[i];
                    r2 tF = r2Var.tF(wgVar, my);
                    if (tF == r2Var) {
                        i3 = 0;
                    }
                    i2 |= i3;
                    if (tF == null) {
                        return null;
                    }
                    if (tF != r2.yq) {
                        arrayList.add(tF);
                    }
                    i++;
                } else if (i2 == 0) {
                    return this;
                } else {
                    if (arrayList.isEmpty()) {
                        return r2.yq;
                    }
                    r2 r2Var2 = (r2) arrayList.get(0);
                    while (i3 < arrayList.size()) {
                        r2Var2 = r2.SN(r2Var2, (r2) arrayList.get(i3));
                        i3++;
                    }
                    return r2Var2;
                }
            }
        }

        public final String toString() {
            return eb.tF(Arrays.asList(this.SN).iterator(), "&&");
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class zH extends r2 {
        public final int N;
        public final int SN;
        public final boolean tF;

        protected zH() {
            this.SN = -1;
            this.N = -1;
            this.tF = false;
        }

        public zH(int i, int i2, boolean z) {
            this.SN = i;
            this.N = i2;
            this.tF = z;
        }

        @Override // com.github.catvod.spider.merge.r2
        public final boolean N(wg<?, ?> wgVar, My my) {
            Objects.requireNonNull(wgVar);
            return true;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zH)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zH zHVar = (zH) obj;
            return this.SN == zHVar.SN && this.N == zHVar.N && this.tF == zHVar.tF;
        }

        public final int hashCode() {
            return A4.zH(A4.Gc(A4.Gc(A4.Gc(0, this.SN), this.N), this.tF ? 1 : 0), 3);
        }

        public final String toString() {
            StringBuilder yq = by.yq("{");
            yq.append(this.SN);
            yq.append(":");
            yq.append(this.N);
            yq.append("}?");
            return yq.toString();
        }
    }

    public static r2 SN(r2 r2Var, r2 r2Var2) {
        zH zHVar;
        if (r2Var == null || r2Var == (zHVar = yq)) {
            return r2Var2;
        }
        if (r2Var2 == null || r2Var2 == zHVar) {
            return r2Var;
        }
        yq yqVar = new yq(r2Var, r2Var2);
        r2[] r2VarArr = yqVar.SN;
        return r2VarArr.length == 1 ? r2VarArr[0] : yqVar;
    }

    static List yq(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            r2 r2Var = (r2) it.next();
            if (r2Var instanceof tF) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((tF) r2Var);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r2 zH(r2 r2Var, r2 r2Var2) {
        if (r2Var == null) {
            return r2Var2;
        }
        if (r2Var2 == null) {
            return r2Var;
        }
        zH zHVar = yq;
        zH zHVar2 = zHVar;
        zHVar2 = zHVar;
        if (!(r2Var == zHVar || r2Var2 == zHVar)) {
            SN sn = new SN(r2Var, r2Var2);
            r2[] r2VarArr = sn.SN;
            zHVar2 = sn;
            if (r2VarArr.length == 1) {
                return r2VarArr[0];
            }
        }
        return zHVar2;
    }

    public abstract boolean N(wg<?, ?> wgVar, My my);

    public r2 tF(wg<?, ?> wgVar, My my) {
        return this;
    }
}
