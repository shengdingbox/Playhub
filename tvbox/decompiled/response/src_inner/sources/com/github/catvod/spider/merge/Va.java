package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0123il;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Va extends hN {
    private yq KJ = new yq();
    private int B = 1;
    private l3 q = new l3(new C0197vV());

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq implements Cloneable {
        int tF;
        private C0123il.yq yq = C0123il.yq.base;
        private Charset SN = C0073Ta.yq;
        private final ThreadLocal<CharsetEncoder> N = new ThreadLocal<>();
        private boolean zH = true;
        private int i = 1;
        private int t0 = 30;
        private int Gc = 1;

        public final int Gc() {
            return this.Gc;
        }

        public final C0123il.yq N() {
            return this.yq;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final CharsetEncoder SN() {
            CharsetEncoder charsetEncoder = this.N.get();
            return charsetEncoder != null ? charsetEncoder : i();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final CharsetEncoder i() {
            CharsetEncoder newEncoder = this.SN.newEncoder();
            this.N.set(newEncoder);
            String name = newEncoder.charset().name();
            this.tF = name.equals("US-ASCII") ? 1 : name.startsWith("UTF-") ? 2 : 3;
            return newEncoder;
        }

        public final boolean t0() {
            return this.zH;
        }

        public final int tF() {
            return this.i;
        }

        /* renamed from: yq */
        public final yq clone() {
            try {
                yq yqVar = (yq) super.clone();
                String name = this.SN.name();
                Objects.requireNonNull(yqVar);
                yqVar.SN = Charset.forName(name);
                yqVar.yq = C0123il.yq.valueOf(this.yq.name());
                return yqVar;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public final int zH() {
            return this.t0;
        }
    }

    public Va(String str) {
        super(AF.G("#root", r6.N), str, null);
    }

    public final Va C7(l3 l3Var) {
        this.q = l3Var;
        return this;
    }

    public final yq D() {
        return this.KJ;
    }

    public final int GL() {
        return this.B;
    }

    public final l3 HE() {
        return this.q;
    }

    public final Va K() {
        Va va = new Va(zH());
        fx fxVar = this.t0;
        if (fxVar != null) {
            va.t0 = fxVar.clone();
        }
        va.KJ = this.KJ.clone();
        return va;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.github.catvod.spider.merge.hN OT() {
        /*
            r5 = this;
            java.util.List r0 = r5.R()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "html"
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.github.catvod.spider.merge.hN r1 = (com.github.catvod.spider.merge.hN) r1
            java.lang.String r3 = r1.nQ()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8
            goto L25
        L21:
            com.github.catvod.spider.merge.hN r1 = r5.m(r2)
        L25:
            java.util.List r0 = r1.R()
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "body"
            if (r2 == 0) goto L52
            java.lang.Object r2 = r0.next()
            com.github.catvod.spider.merge.hN r2 = (com.github.catvod.spider.merge.hN) r2
            java.lang.String r4 = r2.nQ()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L51
            java.lang.String r3 = r2.nQ()
            java.lang.String r4 = "frameset"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L2d
        L51:
            return r2
        L52:
            com.github.catvod.spider.merge.hN r0 = r1.m(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Va.OT():com.github.catvod.spider.merge.hN");
    }

    @Override // com.github.catvod.spider.merge.hN
    public final hN Qz(String str) {
        OT().Qz(str);
        return this;
    }

    @Override // com.github.catvod.spider.merge.MA
    public final String ee() {
        return mG();
    }

    public final Va gt() {
        this.B = 2;
        return this;
    }

    @Override // com.github.catvod.spider.merge.hN, com.github.catvod.spider.merge.MA
    public final String v() {
        return "#document";
    }

    /* renamed from: z */
    public final Va i3() {
        Va va = (Va) super.clone();
        va.KJ = this.KJ.clone();
        return va;
    }
}
