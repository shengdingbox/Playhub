package com.github.catvod.spider.merge;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.uC  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0191uC {
    private int N = -1;
    private int SN;
    int yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.uC$Gc */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class Gc extends AbstractC0191uC {
        fx G4;
        private String KJ;
        private String t0;
        protected String tF;
        protected String zH;
        private final StringBuilder i = new StringBuilder();
        private boolean Gc = false;
        private final StringBuilder M = new StringBuilder();
        private boolean q = false;
        private boolean B = false;
        boolean G = false;

        Gc() {
        }

        private void W() {
            this.q = true;
            String str = this.KJ;
            if (str != null) {
                this.M.append(str);
                this.KJ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void B(String str) {
            String replace = str.replace((char) 0, (char) 65533);
            this.Gc = true;
            String str2 = this.t0;
            if (str2 != null) {
                this.i.append(str2);
                this.t0 = null;
            }
            if (this.i.length() == 0) {
                this.t0 = replace;
            } else {
                this.i.append(replace);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void F5(char c) {
            v3(String.valueOf(c));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void G(char c) {
            W();
            this.M.append(c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void G4(String str) {
            W();
            if (this.M.length() == 0) {
                this.KJ = str;
            } else {
                this.M.append(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String Gd() {
            String str = this.tF;
            li.zH(str == null || str.length() == 0);
            return this.tF;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void Nl() {
            if (this.G4 == null) {
                this.G4 = new fx();
            }
            if (this.Gc && this.G4.size() < 512) {
                String trim = (this.i.length() > 0 ? this.i.toString() : this.t0).trim();
                if (trim.length() > 0) {
                    this.G4.tF(trim, this.q ? this.M.length() > 0 ? this.M.toString() : this.KJ : this.B ? "" : null);
                }
            }
            AbstractC0191uC.M(this.i);
            this.t0 = null;
            this.Gc = false;
            AbstractC0191uC.M(this.M);
            this.KJ = null;
            this.q = false;
            this.B = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void O() {
            this.B = true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: OW */
        public Gc Gc() {
            AbstractC0191uC.super.Gc();
            this.tF = null;
            this.zH = null;
            AbstractC0191uC.M(this.i);
            this.t0 = null;
            this.Gc = false;
            AbstractC0191uC.M(this.M);
            this.KJ = null;
            this.B = false;
            this.q = false;
            this.G = false;
            this.G4 = null;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void dT(int[] iArr) {
            W();
            for (int i : iArr) {
                this.M.appendCodePoint(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean ee(String str) {
            fx fxVar = this.G4;
            return fxVar != null && fxVar.G4(str);
        }

        final String g1() {
            String str = this.tF;
            return str != null ? str : "[unset]";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean g9() {
            return this.G4 != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void q(char c) {
            this.Gc = true;
            String str = this.t0;
            if (str != null) {
                this.i.append(str);
                this.t0 = null;
            }
            this.i.append(c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void v() {
            if (this.Gc) {
                Nl();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void v3(String str) {
            String replace = str.replace((char) 0, (char) 65533);
            String str2 = this.tF;
            if (str2 != null) {
                replace = str2.concat(replace);
            }
            this.tF = replace;
            this.zH = r6.yq(replace);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final Gc xa(String str) {
            this.tF = str;
            this.zH = r6.yq(str);
            return this;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.uC$N */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static final class N extends AbstractC0191uC {
        private final StringBuilder tF = new StringBuilder();
        private String zH;

        /* JADX INFO: Access modifiers changed from: package-private */
        public N() {
            this.yq = 4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final N B(String str) {
            String str2 = this.zH;
            if (str2 != null) {
                this.tF.append(str2);
                this.zH = null;
            }
            if (this.tF.length() == 0) {
                this.zH = str;
            } else {
                this.tF.append(str);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String G() {
            String str = this.zH;
            return str != null ? str : this.tF.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.AbstractC0191uC
        public final AbstractC0191uC Gc() {
            AbstractC0191uC.super.Gc();
            AbstractC0191uC.M(this.tF);
            this.zH = null;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final N q(char c) {
            String str = this.zH;
            if (str != null) {
                this.tF.append(str);
                this.zH = null;
            }
            this.tF.append(c);
            return this;
        }

        public final String toString() {
            StringBuilder yq = by.yq("<!--");
            String str = this.zH;
            if (str == null) {
                str = this.tF.toString();
            }
            return A7.N(yq, str, "-->");
        }
    }

    /* renamed from: com.github.catvod.spider.merge.uC$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static class SN extends AbstractC0191uC {
        private String tF;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SN() {
            this.yq = 5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String B() {
            return this.tF;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0191uC
        final AbstractC0191uC Gc() {
            AbstractC0191uC.super.Gc();
            this.tF = null;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final SN q(String str) {
            this.tF = str;
            return this;
        }

        public String toString() {
            return this.tF;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.uC$i */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static final class i extends Gc {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i() {
            this.yq = 3;
        }

        public final String toString() {
            return A7.N(by.yq("</"), g1(), ">");
        }
    }

    /* renamed from: com.github.catvod.spider.merge.uC$t0 */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static final class t0 extends Gc {
        /* JADX INFO: Access modifiers changed from: package-private */
        public t0() {
            this.yq = 2;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0191uC.Gc, com.github.catvod.spider.merge.AbstractC0191uC
        final /* bridge */ /* synthetic */ AbstractC0191uC Gc() {
            OW();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.AbstractC0191uC.Gc
        public final Gc OW() {
            super.Gc();
            this.G4 = null;
            return this;
        }

        public final String toString() {
            String str;
            StringBuilder sb;
            if (!g9() || this.G4.size() <= 0) {
                sb = by.yq("<");
                str = g1();
            } else {
                sb = by.yq("<");
                sb.append(g1());
                sb.append(" ");
                str = this.G4.toString();
            }
            return A7.N(sb, str, ">");
        }
    }

    /* renamed from: com.github.catvod.spider.merge.uC$tF */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static final class tF extends AbstractC0191uC {
        final StringBuilder tF = new StringBuilder();
        String zH = null;
        final StringBuilder i = new StringBuilder();
        final StringBuilder t0 = new StringBuilder();
        boolean Gc = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public tF() {
            this.yq = 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.AbstractC0191uC
        public final AbstractC0191uC Gc() {
            AbstractC0191uC.super.Gc();
            AbstractC0191uC.M(this.tF);
            this.zH = null;
            AbstractC0191uC.M(this.i);
            AbstractC0191uC.M(this.t0);
            this.Gc = false;
            return this;
        }

        public final String toString() {
            StringBuilder yq = by.yq("<!doctype ");
            yq.append(this.tF.toString());
            yq.append(">");
            return yq.toString();
        }
    }

    /* renamed from: com.github.catvod.spider.merge.uC$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static final class yq extends SN {
        /* JADX INFO: Access modifiers changed from: package-private */
        public yq(String str) {
            q(str);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0191uC.SN
        public final String toString() {
            return A7.N(by.yq("<![CDATA["), B(), "]]>");
        }
    }

    /* renamed from: com.github.catvod.spider.merge.uC$zH */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static final class zH extends AbstractC0191uC {
        /* JADX INFO: Access modifiers changed from: package-private */
        public zH() {
            this.yq = 6;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0191uC
        final AbstractC0191uC Gc() {
            AbstractC0191uC.super.Gc();
            return this;
        }

        public final String toString() {
            return "";
        }
    }

    AbstractC0191uC() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void M(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0191uC Gc() {
        this.SN = -1;
        this.N = -1;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void KJ(int i2) {
        this.SN = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N() {
        return this.yq == 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean SN() {
        return this.yq == 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return this.yq == 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t0() {
        return this.yq == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tF() {
        return this.yq == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void yq(int i2) {
        this.N = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zH() {
        return this.yq == 6;
    }
}
