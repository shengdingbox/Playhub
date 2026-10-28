package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0131l;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class I8 extends XO<yq> {
    private final char[] i;
    private Wl t0;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq extends AbstractC0190u7 {
        private final String SN;

        public yq(String str, H0 h0) {
            super(h0);
            this.SN = str;
        }
    }

    public I8(a0 a0Var, char[] cArr, Qt qt, AbstractC0131l.SN sn) {
        super(a0Var, qt, sn);
        this.i = cArr;
    }

    private c6 q(H0 h0) {
        a0 M = M();
        this.t0 = M.zH().getName().endsWith(".zip.001") ? new cl(M.zH(), M.SN().Dr()) : new pD(M.zH(), M.i(), M.SN().Dr());
        a0 M2 = M();
        NJ nj = (M2.yq() == null || M2.yq().yq() == null || M2.yq().yq().size() == 0) ? null : M2.yq().yq().get(0);
        if (nj != null) {
            this.t0.N(nj);
        }
        return new c6(this.t0, this.i, h0);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0131l
    protected final void zH(Object obj, Z2 z2) {
        yq yqVar = (yq) obj;
        try {
            c6 q = q(yqVar.yq);
            for (NJ nj : M().yq().yq()) {
                if (nj.m().startsWith("__MACOSX")) {
                    z2.t0(nj.Z());
                } else {
                    this.t0.N(nj);
                    Gc(q, nj, yqVar.SN, z2, new byte[yqVar.yq.yq()]);
                    t0();
                }
            }
            q.close();
        } finally {
            Wl wl = this.t0;
            if (wl != null) {
                wl.close();
            }
        }
    }
}
