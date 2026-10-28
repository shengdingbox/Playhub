package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Uf;
import com.github.catvod.spider.merge.Y4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class SC extends C0121iL<C0066Le> {
    private L1 SN;
    private Stack<L1> yq = new Stack<>();

    public SC(kB kBVar) {
        mu.tF(SC.class);
        this.SN = L1.N(kBVar);
        Stack<L1> stack = this.yq;
        L1 N = L1.N(kBVar);
        N.KJ(this.SN);
        stack.push(N);
    }

    private L1 Dr() {
        return this.yq.peek();
    }

    private void g(kB kBVar) {
        this.yq.peek().M(kBVar);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object B(Uf.ee eeVar) {
        wA wAVar;
        C0066Le le;
        if (eeVar.G() != null && !eeVar.G().i()) {
            wAVar = eeVar.G();
        } else if (eeVar.G4() == null || eeVar.G4().i()) {
            if (eeVar.B(39) != null) {
                le = new C0066Le(eeVar.B(39).getText());
                le.KJ();
            } else if (eeVar.B(6) != null) {
                String text = eeVar.B(6).getText();
                le = new C0066Le(text == null ? null : Double.valueOf(text));
            } else {
                StringBuilder yq = by.yq("not support variableReference:");
                yq.append(eeVar.getText());
                throw new B1(yq.toString());
            }
            return le;
        } else {
            wAVar = eeVar.G4();
        }
        return (C0066Le) wAVar.yq(this);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object F5(Uf.dT dTVar) {
        wA wAVar;
        if ("*".equals(dTVar.getText())) {
            C0066Le le = new C0066Le("*");
            le.KJ();
            return le;
        }
        if (dTVar.G4() != null && !dTVar.G4().i()) {
            wAVar = dTVar.G4();
        } else if (dTVar.G() == null || dTVar.G().i()) {
            return null;
        } else {
            wAVar = dTVar.G();
        }
        return (C0066Le) wAVar.yq(this);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object G(Uf.B b) {
        return (C0066Le) ((Uf.t0) b.KJ(Uf.t0.class)).yq(this);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object G4(Uf.N n) {
        List q = n.q(Uf.G.class);
        if (q.size() == 1) {
            return (C0066Le) ((wA) q.get(0)).yq(this);
        }
        Double N = ((C0066Le) ((wA) q.get(0)).yq(this)).N();
        String str = null;
        for (int i = 1; i < n.tF(); i++) {
            wA N2 = n.N(i);
            if (N2 instanceof Uf.G) {
                C0066Le le = (C0066Le) N2.yq(this);
                if ("+".equals(str)) {
                    N = Double.valueOf(le.N().doubleValue() + N.doubleValue());
                } else if ("-".equals(str)) {
                    N = Double.valueOf(N.doubleValue() - le.N().doubleValue());
                } else {
                    StringBuilder yq = by.yq("syntax error, ");
                    yq.append(n.getText());
                    throw new B1(yq.toString());
                }
            } else {
                str = N2.getText();
            }
        }
        return new C0066Le(N);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object Gc(Uf.M m) {
        LinkedList linkedList = new LinkedList();
        C0066Le le = (C0066Le) ((Uf.KJ) m.KJ(Uf.KJ.class)).yq(this);
        for (Uf.t0 t0Var : m.q(Uf.t0.class)) {
            this.yq.push(L1.tF(Dr()));
            linkedList.add(t0Var.yq(this));
            this.yq.pop();
        }
        return oy.yq(le.t0()).yq(Dr(), linkedList);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object Gd(Uf.zH zHVar) {
        if (zHVar.B(7) != null) {
            return oy.N(zHVar.B(7).getText()).yq(Dr().yq());
        }
        if (!"@".equals(zHVar.getText())) {
            return null;
        }
        C0066Le le = new C0066Le(null);
        le.Gc();
        return le;
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object KJ(Uf.Nl nl) {
        boolean z;
        C0066Le le;
        kB kBVar;
        C0066Le le2;
        if (!(nl.G() == null || nl.G().i())) {
            return (C0066Le) nl.G().yq(this);
        }
        boolean z2 = false;
        if (nl.G4() == null || nl.G4().i() || (le2 = (C0066Le) nl.G4().yq(this)) == null) {
            z = false;
        } else {
            if (le2.G4()) {
                g(le2.tF());
            } else if (le2.q()) {
                z = true;
                z2 = true;
            }
            z = true;
        }
        if (nl.dT() != null && !nl.dT().i()) {
            C0066Le le3 = (C0066Le) nl.dT().yq(this);
            if (z2) {
                kB yq = Dr().yq();
                String t0 = le3.t0();
                if (Dr().i()) {
                    if (yq.size() == 1) {
                        hN q = Dr().q();
                        kB cS = q.cS("[" + t0 + "]");
                        LinkedList linkedList = new LinkedList();
                        Iterator<hN> it = cS.iterator();
                        while (it.hasNext()) {
                            linkedList.add(it.next().N(t0));
                        }
                        return new C0066Le(linkedList);
                    }
                    kB kBVar2 = new kB();
                    Iterator<hN> it2 = yq.iterator();
                    while (it2.hasNext()) {
                        kBVar2.addAll(it2.next().cS("[" + t0 + "]"));
                    }
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<hN> it3 = kBVar2.iterator();
                    while (it3.hasNext()) {
                        linkedList2.add(it3.next().N(t0));
                    }
                    le = new C0066Le(linkedList2);
                } else if (yq.size() == 1) {
                    le = new C0066Le(Dr().q().N(t0));
                } else {
                    LinkedList linkedList3 = new LinkedList();
                    Iterator<hN> it4 = yq.iterator();
                    while (it4.hasNext()) {
                        linkedList3.add(it4.next().N(t0));
                    }
                    return new C0066Le(linkedList3);
                }
                return le;
            }
            if (le3.dT()) {
                String t02 = le3.t0();
                kB yq2 = Dr().yq();
                if (Dr().i()) {
                    kBVar = yq2.i(t02);
                } else {
                    kB kBVar3 = new kB();
                    Iterator<hN> it5 = Dr().yq().iterator();
                    while (it5.hasNext()) {
                        hN next = it5.next();
                        if (!z) {
                            Iterator<hN> it6 = next.J().iterator();
                            while (it6.hasNext()) {
                                hN next2 = it6.next();
                                if (next2.v().equals(t02) || "*".equals(t02)) {
                                    kBVar3.add(next2);
                                }
                            }
                        } else if (next.v().equals(t02) || "*".equals(t02)) {
                            kBVar3.add(next);
                        }
                    }
                    g(kBVar3);
                }
            } else if (!le3.G4()) {
                return le3;
            } else {
                kBVar = le3.tF();
            }
            g(kBVar);
        }
        if (nl.F5() != null && nl.F5().size() > 0) {
            for (Uf.v vVar : nl.F5()) {
                g(((C0066Le) vVar.yq(this)).tF());
            }
        }
        le = new C0066Le(Dr().yq());
        return le;
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object N(Uf.OW ow) {
        C0066Le le = (C0066Le) ((Uf.O) ow.KJ(Uf.O.class)).yq(this);
        return ow.t0 == null ? le : new C0066Le(Double.valueOf(-le.N().doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object Nl(Uf.Gc gc) {
        return (C0066Le) ((Uf.ee) gc.KJ(Uf.ee.class)).yq(this);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object O(Uf.F5 f5) {
        if (((Uf.dT) f5.KJ(Uf.dT.class)) != null) {
            return (C0066Le) ((Uf.dT) f5.KJ(Uf.dT.class)).yq(this);
        }
        if (f5.B(5) != null) {
            return oy.SN(f5.B(5).getText()).yq(Dr());
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object OW(Uf.W w) {
        wA wAVar;
        if (w.G() == null || w.G().i()) {
            YW yw = w.t0;
            if (yw == null) {
                wAVar = (Uf.Gc) w.KJ(Uf.Gc.class);
            } else {
                if ("//".equals(yw.getText())) {
                    Dr().Gc();
                }
                wAVar = (Uf.Gd) w.KJ(Uf.Gd.class);
            }
        } else {
            wAVar = w.G();
        }
        return (C0066Le) wAVar.yq(this);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object SN(Uf.O o) {
        hN hNVar;
        C0066Le le;
        if (o.G() == null && !o.G().i()) {
            return (C0066Le) ((Uf.O) o.KJ(Uf.O.class)).yq(this);
        }
        C0066Le le2 = (C0066Le) o.G().yq(this);
        if (o.t0 != null) {
            this.yq.push(L1.tF(Dr().zH()));
            C0066Le le3 = (C0066Le) ((Uf.O) o.KJ(Uf.O.class)).yq(this);
            this.yq.pop();
            if (le2.G4()) {
                if (le3.G4()) {
                    le2.tF().addAll(le3.tF());
                } else {
                    hN hNVar2 = new hN("V");
                    hNVar2.RQ(le3.t0());
                    le2.tF().add(hNVar2);
                }
            } else if (le2.W()) {
                if (le3.G4()) {
                    hNVar = new hN("V");
                    hNVar.RQ(le2.t0());
                    le3.tF().add(hNVar);
                    return le3;
                }
                le = new C0066Le(le2.t0() + le3.t0());
                return le;
            } else if (le2.B()) {
                if (le3.B()) {
                    le = new C0066Le(Boolean.valueOf(le3.yq().booleanValue() | le2.yq().booleanValue()));
                } else if (le3.G4()) {
                    hNVar = new hN("V");
                    hNVar.RQ(le2.t0());
                    le3.tF().add(hNVar);
                    return le3;
                } else if (le3.W()) {
                    le = new C0066Le(le2.yq() + le3.t0());
                } else {
                    StringBuilder yq = by.yq("can not merge val1=");
                    yq.append(le2.yq());
                    yq.append(",val2=");
                    yq.append(le3.t0());
                    throw new C0153nb(yq.toString());
                }
                return le;
            } else {
                if (!le2.v3()) {
                    LinkedList linkedList = new LinkedList();
                    if (Mw.tF(le2.t0())) {
                        linkedList.add(le2.t0());
                    }
                    if (Mw.tF(le3.t0())) {
                        linkedList.add(le3.t0());
                    }
                    le = new C0066Le(Mw.zH(linkedList, ","));
                } else if (le3.W()) {
                    le = new C0066Le(le2.N() + le3.t0());
                } else if (le3.G4()) {
                    hNVar = new hN("V");
                    hNVar.RQ(le2.t0());
                    le3.tF().add(hNVar);
                    return le3;
                } else {
                    StringBuilder yq2 = by.yq("can not merge val1=");
                    yq2.append(le2.N());
                    yq2.append(",val2=");
                    yq2.append(le3.t0());
                    throw new C0153nb(yq2.toString());
                }
                return le;
            }
        }
        return le2;
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object W(Uf.t0 t0Var) {
        return (C0066Le) ((Uf.v3) t0Var.KJ(Uf.v3.class)).yq(this);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object dT(Uf.G4 g4) {
        C0066Le le;
        if (g4.B(7) != null) {
            le = new C0066Le(g4.B(7).getText());
        } else {
            le = new C0066Le(g4.B(41).getText());
        }
        le.KJ();
        return le;
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object ee(Uf.KJ kj) {
        return (C0066Le) ((Uf.g9) kj.KJ(Uf.g9.class)).yq(this);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object g1(Uf.v3 v3Var) {
        List q = v3Var.q(Uf.tF.class);
        if (q.size() <= 1) {
            return (C0066Le) ((wA) q.get(0)).yq(this);
        }
        Boolean yq = ((C0066Le) ((wA) q.get(0)).yq(this)).yq();
        for (int i = 1; i < q.size(); i++) {
            yq = Boolean.valueOf(yq.booleanValue() | ((C0066Le) ((wA) q.get(i)).yq(this)).yq().booleanValue());
        }
        return new C0066Le(yq);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object g9(Uf.v vVar) {
        String N;
        long j;
        String N2;
        kB kBVar = new kB();
        Iterator<hN> it = Dr().yq().iterator();
        while (it.hasNext()) {
            hN next = it.next();
            Stack<L1> stack = this.yq;
            L1 SN = L1.SN(next);
            SN.KJ(Dr());
            stack.push(SN);
            C0066Le le = (C0066Le) ((Uf.t0) vVar.KJ(Uf.t0.class)).yq(this);
            this.yq.pop();
            if (le.v3()) {
                long longValue = le.i().longValue();
                if (longValue < 0) {
                    if (Objects.equals(next.tl(), "JX_TEXT")) {
                        longValue = (Mw.SN(next.N("EL_SAME_TAG_ALL_NUM")) ? -1 : Integer.parseInt(N2)) + longValue + 1;
                        j = 0;
                    } else {
                        L1 Dr = Dr();
                        kB kBVar2 = new kB();
                        hN L = next.L();
                        String tl = next.tl();
                        Objects.requireNonNull(L);
                        li.KJ(tl);
                        Iterator<hN> it2 = C0162pa.yq(new Y4.C0077m(eb.i(tl)), L).iterator();
                        while (it2.hasNext()) {
                            hN next2 = it2.next();
                            if (Dr.yq().contains(next2)) {
                                kBVar2.add(next2);
                            }
                        }
                        longValue = kBVar2.size() + longValue + 1;
                        j = 0;
                    }
                    if (longValue < j) {
                        longValue = 1;
                    }
                }
                if (Objects.equals(next.tl(), "JX_TEXT")) {
                    if (longValue == (Mw.SN(next.N("EL_SAME_TAG_INDEX")) ? -1 : Integer.parseInt(N))) {
                        kBVar.add(next);
                    }
                } else if (longValue == aq.KJ(next, Dr())) {
                    kBVar.add(next);
                }
            } else if (le.B()) {
                if (le.yq().booleanValue()) {
                    kBVar.add(next);
                }
            } else if (le.W()) {
                if (Mw.tF(le.t0())) {
                    kBVar.add(next);
                }
            } else if (le.G4()) {
                if (le.tF().size() > 0) {
                    kBVar.add(next);
                }
            } else if (!le.F5()) {
                throw new B1("unknown expr val:" + le);
            } else if (le.zH().size() > 0) {
                kBVar.add(next);
            }
        }
        return new C0066Le(kBVar);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object i(Uf.Gd gd) {
        C0066Le le = null;
        for (int i = 0; i < gd.tF(); i++) {
            wA N = gd.N(i);
            if (N instanceof Uf.Nl) {
                le = (C0066Le) N.yq(this);
                if (le.G4()) {
                    g(le.tF());
                }
            } else if ("//".equals(N.getText())) {
                Dr().Gc();
            } else {
                Dr().t0();
            }
        }
        return le;
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object n(Uf.SN sn) {
        Stack<L1> stack = this.yq;
        L1 N = L1.N(this.SN.yq());
        N.KJ(Dr());
        stack.push(N);
        if (Objects.equals(sn.t0.getText(), "//")) {
            Dr().Gc();
        }
        C0066Le le = (C0066Le) ((Uf.Gd) sn.KJ(Uf.Gd.class)).yq(this);
        this.yq.pop();
        return le;
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object q(Uf.tF tFVar) {
        List q = tFVar.q(Uf.i.class);
        if (q.size() <= 1) {
            return (C0066Le) ((wA) q.get(0)).yq(this);
        }
        Boolean yq = ((C0066Le) ((wA) q.get(0)).yq(this)).yq();
        for (int i = 1; i < q.size(); i++) {
            yq = Boolean.valueOf(yq.booleanValue() & ((C0066Le) ((wA) q.get(i)).yq(this)).yq().booleanValue());
        }
        return new C0066Le(yq);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object s(Uf.g9 g9Var) {
        List<Uf.G4> q = g9Var.q(Uf.G4.class);
        if (q == null) {
            return null;
        }
        if (q.size() <= 1) {
            return (C0066Le) ((wA) q.get(0)).yq(this);
        }
        LinkedList linkedList = new LinkedList();
        for (Uf.G4 g4 : q) {
            C0066Le le = (C0066Le) g4.yq(this);
            if (le != null) {
                linkedList.add(le.t0());
            }
        }
        return new C0066Le(Mw.zH(linkedList, ":"));
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object un(Uf.xa xaVar) {
        C0066Le le;
        List q = xaVar.q(Uf.N.class);
        boolean z = true;
        if (q.size() == 1) {
            return (C0066Le) ((wA) q.get(0)).yq(this);
        }
        if (q.size() == 2) {
            C0066Le le2 = (C0066Le) ((wA) q.get(0)).yq(this);
            C0066Le le3 = (C0066Le) ((wA) q.get(1)).yq(this);
            switch (xaVar.t0.getType()) {
                case 24:
                    if (le2.compareTo(le3) >= 0) {
                        z = false;
                    }
                    le = new C0066Le(Boolean.valueOf(z));
                    break;
                case 25:
                    if (le2.compareTo(le3) <= 0) {
                        z = false;
                    }
                    le = new C0066Le(Boolean.valueOf(z));
                    break;
                case 26:
                    if (le2.compareTo(le3) > 0) {
                        z = false;
                    }
                    le = new C0066Le(Boolean.valueOf(z));
                    break;
                case 27:
                    if (le2.compareTo(le3) < 0) {
                        z = false;
                    }
                    le = new C0066Le(Boolean.valueOf(z));
                    break;
                case 28:
                case 29:
                default:
                    StringBuilder yq = by.yq("unknown operator");
                    yq.append(xaVar.t0.getText());
                    throw new B1(yq.toString());
                case 30:
                    le = new C0066Le(Boolean.valueOf(le2.t0().startsWith(le3.t0())));
                    break;
                case 31:
                    le = new C0066Le(Boolean.valueOf(le2.t0().endsWith(le3.t0())));
                    break;
                case 32:
                    le = new C0066Le(Boolean.valueOf(le2.t0().contains(le3.t0())));
                    break;
                case 33:
                    le = new C0066Le(Boolean.valueOf(le2.t0().matches(le3.t0())));
                    break;
                case 34:
                    le = new C0066Le(Boolean.valueOf(!le2.t0().matches(le3.t0())));
                    break;
            }
            return le;
        }
        StringBuilder yq2 = by.yq("error equalityExpr near:");
        yq2.append(xaVar.getText());
        throw new B1(yq2.toString());
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object v(Uf.yq yqVar) {
        if (!"..".equals(yqVar.getText())) {
            return new C0066Le(Dr().yq());
        }
        HashSet hashSet = new HashSet();
        kB kBVar = new kB();
        Iterator<hN> it = Dr().yq().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().L());
        }
        kBVar.addAll(hashSet);
        return new C0066Le(kBVar);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object v3(Uf.G g) {
        if (g.G() == null || g.G().i()) {
            return (C0066Le) ((Uf.OW) g.KJ(Uf.OW.class)).yq(this);
        }
        C0066Le le = (C0066Le) ((Uf.OW) g.KJ(Uf.OW.class)).yq(this);
        C0066Le le2 = (C0066Le) g.G().yq(this);
        switch (g.t0.getType()) {
            case 17:
                return new C0066Le(Double.valueOf(le2.N().doubleValue() * le.N().doubleValue()));
            case 18:
                return new C0066Le(Double.valueOf(le.N().doubleValue() / le2.N().doubleValue()));
            case 19:
                return new C0066Le(Double.valueOf(le.N().doubleValue() % le2.N().doubleValue()));
            default:
                StringBuilder yq = by.yq("syntax error, ");
                yq.append(g.getText());
                throw new B1(yq.toString());
        }
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object xa(Uf.q qVar) {
        return (C0066Le) ((qVar.G() == null || qVar.G().i()) ? (Uf.SN) qVar.KJ(Uf.SN.class) : qVar.G()).yq(this);
    }

    @Override // com.github.catvod.spider.merge.pv
    public final Object zH(Uf.i iVar) {
        C0066Le le;
        List q = iVar.q(Uf.xa.class);
        if (q.size() == 1) {
            return (C0066Le) ((wA) q.get(0)).yq(this);
        }
        if (q.size() == 2) {
            C0066Le le2 = (C0066Le) ((wA) q.get(0)).yq(this);
            C0066Le le3 = (C0066Le) ((wA) q.get(1)).yq(this);
            if ("=".equals(iVar.t0.getText())) {
                if (le2.v().equals(le3.v())) {
                    le = new C0066Le(Boolean.valueOf(le2.equals(le3)));
                } else {
                    le = new C0066Le(Boolean.valueOf(Objects.equals(le2.t0(), le3.t0())));
                }
            } else if (le2.v().equals(le3.v())) {
                le = new C0066Le(Boolean.valueOf(!le2.equals(le3)));
            } else {
                le = new C0066Le(Boolean.valueOf(!Objects.equals(le2.t0(), le3.t0())));
            }
            return le;
        }
        StringBuilder yq = by.yq("error equalityExpr near:");
        yq.append(iVar.getText());
        throw new B1(yq.toString());
    }
}
