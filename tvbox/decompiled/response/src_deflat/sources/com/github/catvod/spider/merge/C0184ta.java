package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* renamed from: com.github.catvod.spider.merge.ta  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0184ta implements qX {
    protected boolean SN;
    protected List<C0169qt> yq;

    static {
        t0(0, 1114111).M();
        new C0184ta(new int[0]).M();
    }

    public C0184ta(int... iArr) {
        this.yq = new ArrayList(iArr.length);
        for (int i : iArr) {
            yq(i);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public static C0184ta q(C0184ta taVar, C0184ta taVar2) {
        int i = 0;
        if (taVar.i()) {
            return new C0184ta(new int[0]);
        }
        C0184ta taVar3 = new C0184ta(new int[0]);
        taVar3.N(taVar);
        if (!taVar2.i()) {
            int i2 = 0;
            while (i < taVar3.yq.size() && i2 < taVar2.yq.size()) {
                C0169qt qtVar = (C0169qt) taVar3.yq.get(i);
                C0169qt qtVar2 = (C0169qt) taVar2.yq.get(i2);
                int i3 = qtVar2.SN;
                int i4 = qtVar.yq;
                if (i3 >= i4) {
                    int i5 = qtVar2.yq;
                    int i6 = qtVar.SN;
                    if (i5 <= i6) {
                        C0169qt qtVar3 = null;
                        C0169qt qtVar4 = i5 > i4 ? new C0169qt(i4, i5 - 1) : null;
                        if (i3 < i6) {
                            qtVar3 = new C0169qt(i3 + 1, i6);
                        }
                        ?? r2 = taVar3.yq;
                        if (qtVar4 != null) {
                            r2.set(i, qtVar4);
                            if (qtVar3 != null) {
                                i++;
                                taVar3.yq.add(i, qtVar3);
                            }
                        } else if (qtVar3 != null) {
                            r2.set(i, qtVar3);
                        } else {
                            r2.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return taVar3;
    }

    public static C0184ta t0(int i, int i2) {
        C0184ta taVar = new C0184ta(new int[0]);
        taVar.SN(i, i2);
        return taVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final String B(AbstractC0108gL gLVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.yq;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (KJ() > 1) {
            sb.append("{");
        }
        Iterator it = this.yq.iterator();
        while (it.hasNext()) {
            C0169qt qtVar = (C0169qt) it.next();
            int i = qtVar.yq;
            int i2 = qtVar.SN;
            String str2 = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    str2 = "<EOF>";
                } else if (i != -2) {
                    str2 = ((C0176rq) gLVar).yq(i);
                }
                sb.append(str2);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        str = "<EOF>";
                    } else {
                        str = i3 == -2 ? str2 : ((C0176rq) gLVar).yq(i3);
                    }
                    sb.append(str);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (KJ() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final void Gc() {
        if (!this.SN) {
            int size = this.yq.size();
            for (int i = 0; i < size; i++) {
                C0169qt qtVar = (C0169qt) this.yq.get(i);
                int i2 = qtVar.yq;
                int i3 = qtVar.SN;
                if (-2 < i2) {
                    return;
                }
                if (-2 == i2 && -2 == i3) {
                    this.yq.remove(i);
                    return;
                } else if (-2 == i2) {
                    qtVar.yq = i2 + 1;
                    return;
                } else if (-2 == i3) {
                    qtVar.SN = i3 - 1;
                    return;
                } else {
                    if (-2 > i2 && -2 < i3) {
                        qtVar.SN = -3;
                        SN(-1, i3);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("can't alter readonly IntervalSet");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final int KJ() {
        int size = this.yq.size();
        if (size == 1) {
            C0169qt qtVar = (C0169qt) this.yq.get(0);
            return (qtVar.SN - qtVar.yq) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0169qt qtVar2 = (C0169qt) this.yq.get(i2);
            i += (qtVar2.SN - qtVar2.yq) + 1;
        }
        return i;
    }

    public final void M() {
        boolean z = this.SN;
        this.SN = true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final C0184ta N(qX qXVar) {
        if (qXVar == null) {
            return this;
        }
        int i = 0;
        if (qXVar instanceof C0184ta) {
            C0184ta taVar = (C0184ta) qXVar;
            int size = taVar.yq.size();
            while (i < size) {
                C0169qt qtVar = (C0169qt) taVar.yq.get(i);
                SN(qtVar.yq, qtVar.SN);
                i++;
            }
        } else {
            C0184ta taVar2 = (C0184ta) qXVar;
            ArrayList arrayList = new ArrayList();
            int size2 = taVar2.yq.size();
            while (i < size2) {
                C0169qt qtVar2 = (C0169qt) taVar2.yq.get(i);
                int i2 = qtVar2.SN;
                for (int i3 = qtVar2.yq; i3 <= i2; i3++) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yq(((Integer) it.next()).intValue());
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final void SN(int i, int i2) {
        C0169qt SN = C0169qt.SN(i, i2);
        if (this.SN) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        } else if (SN.SN >= SN.yq) {
            ListIterator listIterator = this.yq.listIterator();
            while (listIterator.hasNext()) {
                C0169qt qtVar = (C0169qt) listIterator.next();
                if (!SN.equals(qtVar)) {
                    boolean z = true;
                    if ((SN.yq == qtVar.SN + 1 || SN.SN == qtVar.yq - 1) || !SN.yq(qtVar)) {
                        C0169qt N = SN.N(qtVar);
                        listIterator.set(N);
                        while (listIterator.hasNext()) {
                            C0169qt qtVar2 = (C0169qt) listIterator.next();
                            if ((N.yq == qtVar2.SN + 1 || N.SN == qtVar2.yq - 1) || !N.yq(qtVar2)) {
                                listIterator.remove();
                                listIterator.previous();
                                listIterator.set(N.N(qtVar2));
                                listIterator.next();
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    int i3 = SN.yq;
                    int i4 = qtVar.yq;
                    if (i3 >= i4 || SN.SN >= i4) {
                        z = false;
                        continue;
                    }
                    if (z) {
                        listIterator.previous();
                        listIterator.add(SN);
                        return;
                    }
                } else {
                    return;
                }
            }
            this.yq.add(SN);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0184ta)) {
            return false;
        }
        return this.yq.equals(((C0184ta) obj).yq);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final int hashCode() {
        Iterator it = this.yq.iterator();
        int i = 0;
        while (it.hasNext()) {
            C0169qt qtVar = (C0169qt) it.next();
            i = A4.Gc(A4.Gc(i, qtVar.yq), qtVar.SN);
        }
        return A4.zH(i, this.yq.size() * 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final boolean i() {
        ?? r0 = this.yq;
        return r0 == 0 || r0.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final boolean tF(int i) {
        int size = this.yq.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C0169qt qtVar = (C0169qt) this.yq.get(i3);
            int i4 = qtVar.yq;
            if (qtVar.SN < i) {
                i2 = i3 + 1;
            } else if (i4 <= i) {
                return true;
            } else {
                size = i3 - 1;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.yq;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (KJ() > 1) {
            sb.append("{");
        }
        Iterator it = this.yq.iterator();
        while (it.hasNext()) {
            C0169qt qtVar = (C0169qt) it.next();
            int i = qtVar.yq;
            int i2 = qtVar.SN;
            if (i != i2) {
                sb.append(i);
                sb.append("..");
                sb.append(i2);
            } else if (i == -1) {
                sb.append("<EOF>");
            } else {
                sb.append(i);
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (KJ() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    public final void yq(int i) {
        if (!this.SN) {
            SN(i, i);
            return;
        }
        throw new IllegalStateException("can't alter readonly IntervalSet");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.qt>, java.util.ArrayList] */
    public final int zH() {
        if (!i()) {
            return ((C0169qt) this.yq.get(0)).yq;
        }
        throw new RuntimeException("set is empty");
    }
}
