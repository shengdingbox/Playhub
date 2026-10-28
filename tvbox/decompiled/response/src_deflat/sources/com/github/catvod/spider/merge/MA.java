package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Va;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class MA implements Cloneable {
    static final List<MA> N = Collections.emptyList();
    int SN;
    MA yq;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq implements aA {
        private final Va.yq SN;
        private final Appendable yq;

        yq(Appendable appendable, Va.yq yqVar) {
            this.yq = appendable;
            this.SN = yqVar;
            yqVar.i();
        }

        @Override // com.github.catvod.spider.merge.aA
        public final void SN(MA ma, int i) {
            try {
                ma.xa(this.yq, i, this.SN);
            } catch (IOException e) {
                throw new sI(e);
            }
        }

        @Override // com.github.catvod.spider.merge.aA
        public final void yq(MA ma, int i) {
            if (!ma.v().equals("#text")) {
                try {
                    ma.Gd(this.yq, i, this.SN);
                } catch (IOException e) {
                    throw new sI(e);
                }
            }
        }
    }

    private void g1(int i) {
        int t0 = t0();
        if (t0 != 0) {
            List<MA> G = G();
            while (i < t0) {
                G.get(i).SN = i;
                i++;
            }
        }
    }

    public abstract MA B();

    public final int Dr() {
        return this.SN;
    }

    public final boolean F5() {
        return this.yq != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract List<MA> G();

    public final boolean G4(String str) {
        li.B(str);
        if (!dT()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (tF().dT(substring) && !yq(substring).isEmpty()) {
                return true;
            }
        }
        return tF().dT(str);
    }

    public final List<MA> Gc() {
        if (t0() == 0) {
            return N;
        }
        List<MA> G = G();
        ArrayList arrayList = new ArrayList(G.size());
        arrayList.addAll(G);
        return Collections.unmodifiableList(arrayList);
    }

    abstract void Gd(Appendable appendable, int i, Va.yq yqVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public MA KJ(MA ma) {
        Va Nl;
        try {
            MA ma2 = (MA) super.clone();
            ma2.yq = ma;
            ma2.SN = ma == null ? 0 : this.SN;
            if (ma == null && !(this instanceof Va) && (Nl = Nl()) != null) {
                Va K = Nl.K();
                ma2.yq = K;
                K.G().add(ma2);
            }
            return ma2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: M */
    public MA clone() {
        MA KJ = KJ(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(KJ);
        while (!linkedList.isEmpty()) {
            MA ma = (MA) linkedList.remove();
            int t0 = ma.t0();
            for (int i = 0; i < t0; i++) {
                List<MA> G = ma.G();
                MA KJ2 = G.get(i).KJ(ma);
                G.set(i, KJ2);
                linkedList.add(KJ2);
            }
        }
        return KJ;
    }

    public String N(String str) {
        li.B(str);
        if (!dT()) {
            return "";
        }
        String G = tF().G(str);
        return G.length() > 0 ? G : str.startsWith("abs:") ? yq(str.substring(4)) : "";
    }

    public final Va Nl() {
        MA b = b();
        if (b instanceof Va) {
            return (Va) b;
        }
        return null;
    }

    public final MA O() {
        return this.yq;
    }

    public MA OW() {
        return this.yq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void SN(int i, MA... maArr) {
        boolean z;
        boolean z2;
        li.B(maArr);
        if (maArr.length != 0) {
            List<MA> G = G();
            MA OW = maArr[0].OW();
            if (OW != null && OW.t0() == maArr.length) {
                List<MA> G2 = OW.G();
                int length = maArr.length;
                while (true) {
                    int i2 = length - 1;
                    z = true;
                    if (length <= 0) {
                        z2 = true;
                        break;
                    } else if (maArr[i2] != G2.get(i2)) {
                        z2 = false;
                        break;
                    } else {
                        length = i2;
                    }
                }
                if (z2) {
                    if (t0() != 0) {
                        z = false;
                    }
                    OW.B();
                    G.addAll(i, Arrays.asList(maArr));
                    int length2 = maArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        maArr[i3].yq = this;
                        length2 = i3;
                    }
                    if (!z || maArr[0].SN != 0) {
                        g1(i);
                        return;
                    }
                    return;
                }
            }
            for (MA ma : maArr) {
                if (ma == null) {
                    throw new ID("Array must not contain any null objects");
                }
            }
            for (MA ma2 : maArr) {
                Objects.requireNonNull(ma2);
                MA ma3 = ma2.yq;
                if (ma3 != null) {
                    ma3.n(ma2);
                }
                ma2.yq = this;
            }
            G.addAll(i, Arrays.asList(maArr));
            g1(i);
        }
    }

    public final MA W() {
        MA ma = this.yq;
        if (ma == null) {
            return null;
        }
        List<MA> G = ma.G();
        int i = this.SN + 1;
        if (G.size() > i) {
            return G.get(i);
        }
        return null;
    }

    public final void Zm(String str) {
        q(str);
    }

    public MA b() {
        MA ma = this;
        while (true) {
            MA ma2 = ma.yq;
            if (ma2 == null) {
                return ma;
            }
            ma = ma2;
        }
    }

    protected abstract boolean dT();

    public String ee() {
        StringBuilder SN = P1.SN();
        g9(SN);
        return P1.Gc(SN);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g9(Appendable appendable) {
        Va Nl = Nl();
        if (Nl == null) {
            Nl = new Va("");
        }
        C0072So.M(new yq(appendable, Nl.D()), this);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final MA i(int i) {
        return G().get(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(MA ma) {
        li.i(ma.yq == this);
        int i = ma.SN;
        G().remove(i);
        g1(i);
        ma.yq = null;
    }

    protected abstract void q(String str);

    public final void s() {
        li.B(this.yq);
        this.yq.n(this);
    }

    public abstract int t0();

    public abstract fx tF();

    public String toString() {
        return ee();
    }

    public final void un(MA ma) {
        li.B(this.yq);
        MA ma2 = this.yq;
        Objects.requireNonNull(ma2);
        li.i(this.yq == ma2);
        MA ma3 = ma.yq;
        if (ma3 != null) {
            ma3.n(ma);
        }
        int i = this.SN;
        ma2.G().set(i, ma);
        ma.yq = ma2;
        ma.SN = i;
        this.yq = null;
    }

    public abstract String v();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v3(Appendable appendable, int i, Va.yq yqVar) {
        appendable.append('\n').append(P1.t0(yqVar.tF() * i, yqVar.zH()));
    }

    abstract void xa(Appendable appendable, int i, Va.yq yqVar);

    public String yq(String str) {
        li.KJ(str);
        return (!dT() || !tF().dT(str)) ? "" : P1.M(zH(), tF().G(str));
    }

    public abstract String zH();
}
