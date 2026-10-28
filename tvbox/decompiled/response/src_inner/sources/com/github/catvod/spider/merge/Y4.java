package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class Y4 {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class B extends Y4 {
        private final String yq;

        public B(String str) {
            this.yq = eb.zH(str);
        }

        public final String toString() {
            return String.format(":containsData(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return eb.zH(hNVar2.lF()).contains(this.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class Dr extends Y4 {
        public final String toString() {
            return ":only-of-type";
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            hN L = hNVar2.L();
            if (L == null || (L instanceof Va)) {
                return false;
            }
            Iterator<hN> it = L.J().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().I().equals(hNVar2.I())) {
                    i++;
                }
            }
            return i == 1;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class E1 extends Y4 {
        private final Pattern yq;

        public E1(Pattern pattern) {
            this.yq = pattern;
        }

        public final String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return this.yq.matcher(hNVar2.h()).find();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class F5 extends Y4 {
        private final String yq;

        public F5(String str) {
            this.yq = str;
        }

        public final String toString() {
            return String.format(":containsWholeText(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            StringBuilder SN = P1.SN();
            C0072So.M(new sA(SN), hNVar2);
            return P1.Gc(SN).contains(this.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class Fz extends Y4 {
        private final Pattern yq;

        public Fz(Pattern pattern) {
            this.yq = pattern;
        }

        public final String toString() {
            return String.format(":matchesOwn(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return this.yq.matcher(hNVar2.kR()).find();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class G extends Y4 {
        private final String yq;

        public G(String str) {
            StringBuilder SN = P1.SN();
            P1.yq(SN, str, false);
            this.yq = eb.zH(P1.Gc(SN));
        }

        public final String toString() {
            return String.format(":containsOwn(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return eb.zH(hNVar2.kR()).contains(this.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class G4 extends Y4 {
        private final String yq;

        public G4(String str) {
            StringBuilder SN = P1.SN();
            P1.yq(SN, str, false);
            this.yq = eb.zH(P1.Gc(SN));
        }

        public final String toString() {
            return String.format(":contains(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return eb.zH(hNVar2.Fo()).contains(this.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class Gc extends Y4 {
        Pattern SN;
        String yq;

        public Gc(String str, Pattern pattern) {
            this.yq = eb.i(str);
            this.SN = pattern;
        }

        public final String toString() {
            return String.format("[%s~=%s]", this.yq, this.SN.toString());
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.G4(this.yq) && this.SN.matcher(hNVar2.N(this.yq)).find();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class Gd extends Y4 {
        public final String toString() {
            return ":empty";
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            for (MA ma : hNVar2.Gc()) {
                if (!((ma instanceof C0062Fy) || (ma instanceof xL))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class H extends Y4 {
        public final String toString() {
            return ":matchText";
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            if (hNVar2 instanceof wZ) {
                return true;
            }
            for (MA ma : hNVar2.s0()) {
                wZ wZVar = new wZ(AF.G(hNVar2.tl(), r6.tF), hNVar2.zH(), hNVar2.tF());
                ma.un(wZVar);
                wZVar.E1(ma);
            }
            return false;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class KJ extends N {
        public KJ(String str, String str2) {
            super(str, str2, false);
        }

        public final String toString() {
            return String.format("[%s^=%s]", this.yq, this.SN);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.G4(this.yq) && eb.zH(hNVar2.N(this.yq)).startsWith(this.SN);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class M extends N {
        public M(String str, String str2) {
            super(str, str2, true);
        }

        public final String toString() {
            return String.format("[%s!=%s]", this.yq, this.SN);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return !this.SN.equalsIgnoreCase(hNVar2.N(this.yq));
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class N extends Y4 {
        String SN;
        String yq;

        public N(String str, String str2, boolean z) {
            String str3;
            li.KJ(str);
            li.KJ(str2);
            this.yq = eb.i(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            if (z) {
                str3 = eb.i(str2);
            } else {
                str3 = z2 ? eb.zH(str2) : eb.i(str2);
            }
            this.SN = str3;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class Nl extends Y4 {
        public final String toString() {
            return ":first-child";
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            hN L = hNVar2.L();
            return L != null && !(L instanceof Va) && hNVar2.C() == 0;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class O extends Y4 {
        public final String toString() {
            return ":last-child";
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            hN L = hNVar2.L();
            return L != null && !(L instanceof Va) && hNVar2.C() == L.J().size() - 1;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class OW extends C0075b {
        public OW() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        public final String toString() {
            return ":first-of-type";
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN extends Y4 {
        private final String yq;

        public SN(String str) {
            this.yq = str;
        }

        public final String toString() {
            return String.format("[%s]", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.G4(this.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class U extends Y4 {
        private final Pattern yq;

        public U(Pattern pattern) {
            this.yq = pattern;
        }

        public final String toString() {
            return String.format(":matches(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return this.yq.matcher(hNVar2.Fo()).find();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class W extends Y4 {
        private final String yq;

        public W(String str) {
            this.yq = str;
        }

        public final String toString() {
            return String.format("#%s", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return this.yq.equals(hNVar2.Hj());
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class Zm extends Y4 {
        public final String toString() {
            return ":only-child";
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            hN L = hNVar2.L();
            return L != null && !(L instanceof Va) && hNVar2.ue().isEmpty();
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Y4$b  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class C0075b extends v3 {
        public C0075b(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        protected final String N() {
            return "nth-of-type";
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        protected final int SN(hN hNVar) {
            int i = 0;
            if (hNVar.L() == null) {
                return 0;
            }
            Iterator<hN> it = hNVar.L().J().iterator();
            while (it.hasNext()) {
                hN next = it.next();
                if (next.I().equals(hNVar.I())) {
                    i++;
                    continue;
                }
                if (next == hNVar) {
                    break;
                }
            }
            return i;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class dT extends Y4 {
        private final String yq;

        public dT(String str) {
            this.yq = str;
        }

        public final String toString() {
            return String.format(":containsWholeOwnText(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.h().contains(this.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class ee extends Y4 {
        int yq;

        public ee(int i) {
            this.yq = i;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Y4$g  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class C0076g extends Y4 {
        public final String toString() {
            return ":root";
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            if (hNVar instanceof Va) {
                hNVar = hNVar.N0();
            }
            return hNVar2 == hNVar;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class g1 extends un {
        public g1() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        public final String toString() {
            return ":last-of-type";
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class g9 extends ee {
        public g9(int i) {
            super(i);
        }

        public final String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.yq));
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.C() > this.yq;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class i extends N {
        public i(String str, String str2) {
            super(str, str2, true);
        }

        public final String toString() {
            return String.format("[%s*=%s]", this.yq, this.SN);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.G4(this.yq) && eb.zH(hNVar2.N(this.yq)).contains(this.SN);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class k extends Y4 {
        private final String yq;

        public k(String str) {
            this.yq = str;
        }

        public final String toString() {
            return String.format("%s", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.nQ().endsWith(this.yq);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Y4$m  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class C0077m extends Y4 {
        private final String yq;

        public C0077m(String str) {
            this.yq = str;
        }

        public final String toString() {
            return String.format("%s", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.nQ().equals(this.yq);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Y4$n  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class C0078n extends v3 {
        public C0078n(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        protected final String N() {
            return "nth-last-child";
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        protected final int SN(hN hNVar) {
            if (hNVar.L() == null) {
                return 0;
            }
            return hNVar.L().J().size() - hNVar.C();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class q extends Y4 {
        private final String yq;

        public q(String str) {
            this.yq = str;
        }

        public final String toString() {
            return String.format(".%s", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.p(this.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class s extends v3 {
        public s(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        protected final String N() {
            return "nth-child";
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        protected final int SN(hN hNVar) {
            return hNVar.C() + 1;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class t0 extends N {
        public t0(String str, String str2) {
            super(str, str2, false);
        }

        public final String toString() {
            return String.format("[%s$=%s]", this.yq, this.SN);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.G4(this.yq) && eb.zH(hNVar2.N(this.yq)).endsWith(this.SN);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class tF extends Y4 {
        private final String yq;

        public tF(String str) {
            li.KJ(str);
            this.yq = eb.zH(str);
        }

        public final String toString() {
            return String.format("[^%s]", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            for (B5 b5 : hNVar2.tF().t0()) {
                if (eb.zH(b5.yq()).startsWith(this.yq)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class tO extends Y4 {
        private final Pattern yq;

        public tO(Pattern pattern) {
            this.yq = pattern;
        }

        public final String toString() {
            return String.format(":matchesWholeText(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            Pattern pattern = this.yq;
            StringBuilder SN = P1.SN();
            C0072So.M(new sA(SN), hNVar2);
            return pattern.matcher(P1.Gc(SN)).find();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class un extends v3 {
        public un(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        protected final String N() {
            return "nth-last-of-type";
        }

        @Override // com.github.catvod.spider.merge.Y4.v3
        protected final int SN(hN hNVar) {
            int i = 0;
            if (hNVar.L() == null) {
                return 0;
            }
            kB J = hNVar.L().J();
            for (int C = hNVar.C(); C < J.size(); C++) {
                if (J.get(C).I().equals(hNVar.I())) {
                    i++;
                }
            }
            return i;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class v extends ee {
        public v(int i) {
            super(i);
        }

        public final String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.yq));
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.C() == this.yq;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class v3 extends Y4 {
        protected final int SN;
        protected final int yq;

        public v3(int i, int i2) {
            this.yq = i;
            this.SN = i2;
        }

        protected abstract String N();

        protected abstract int SN(hN hNVar);

        public String toString() {
            return this.yq == 0 ? String.format(":%s(%d)", N(), Integer.valueOf(this.SN)) : this.SN == 0 ? String.format(":%s(%dn)", N(), Integer.valueOf(this.yq)) : String.format(":%s(%dn%+d)", N(), Integer.valueOf(this.yq), Integer.valueOf(this.SN));
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            hN L = hNVar2.L();
            if (L != null && !(L instanceof Va)) {
                int SN = SN(hNVar2);
                int i = this.yq;
                if (i == 0) {
                    return SN == this.SN;
                }
                int i2 = SN - this.SN;
                if (i2 * i >= 0 && i2 % i == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class xa extends ee {
        public xa(int i) {
            super(i);
        }

        public final String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.yq));
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar != hNVar2 && hNVar2.C() < this.yq;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class yq extends Y4 {
        public final String toString() {
            return "*";
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return true;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class zH extends N {
        public zH(String str, String str2) {
            super(str, str2, true);
        }

        public final String toString() {
            return String.format("[%s=%s]", this.yq, this.SN);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar2.G4(this.yq) && this.SN.equalsIgnoreCase(hNVar2.N(this.yq).trim());
        }
    }

    public abstract boolean yq(hN hNVar, hN hNVar2);
}
