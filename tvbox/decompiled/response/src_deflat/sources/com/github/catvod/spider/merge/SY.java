package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Gx;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class SY {
    private final N N;
    private final boolean SN;
    private final int tF;
    private final Gx yq;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public interface N {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class SN extends L<String> {
        final CharSequence N;
        int i = 0;
        int t0;
        final Gx tF;
        final boolean zH;

        /* JADX INFO: Access modifiers changed from: protected */
        public SN(SY sy, CharSequence charSequence) {
            this.tF = sy.yq;
            this.zH = sy.SN;
            this.t0 = sy.tF;
            this.N = charSequence;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq implements Iterable<String> {
        final /* synthetic */ CharSequence yq;

        yq(CharSequence charSequence) {
            this.yq = charSequence;
        }

        @Override // java.lang.Iterable
        public final Iterator<String> iterator() {
            return SY.yq(SY.this, this.yq);
        }

        public final String toString() {
            J6 SN = J6.SN();
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder yq = SN.yq(sb, this);
            yq.append(']');
            return yq.toString();
        }
    }

    private SY(N n, boolean z, Gx gx, int i) {
        this.N = n;
        this.SN = z;
        this.yq = gx;
        this.tF = i;
    }

    public static SY i() {
        return new SY(new u6(new Gx.SN()), false, Gx.tF.SN, Integer.MAX_VALUE);
    }

    static Iterator yq(SY sy, CharSequence charSequence) {
        u6 u6Var = (u6) sy.N;
        Objects.requireNonNull(u6Var);
        return new cq(u6Var, sy, charSequence);
    }

    public final SY Gc() {
        Gx.zH zHVar = Gx.zH.N;
        Objects.requireNonNull(zHVar);
        return new SY(this.N, this.SN, zHVar, this.tF);
    }

    public final Iterable<String> t0(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new yq(charSequence);
    }

    public final SY zH() {
        return new SY(this.N, true, this.yq, this.tF);
    }
}
