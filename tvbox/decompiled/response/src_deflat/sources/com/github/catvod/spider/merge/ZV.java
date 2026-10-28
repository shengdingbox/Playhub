package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class ZV {
    public final int N;
    public volatile QY SN;
    public final V2 tF;
    public final Map<QY, QY> yq = new HashMap();
    private final boolean zH;

    public ZV(V2 v2, int i) {
        this.tF = v2;
        this.N = i;
        boolean z = true;
        if (!(v2 instanceof oE) || !((oE) v2).KJ) {
            z = false;
        } else {
            QY qy = new QY(new i3(true));
            qy.N = new QY[0];
            qy.tF = false;
            qy.t0 = false;
            this.SN = qy;
        }
        this.zH = z;
    }

    public final void N(int i, QY qy) {
        if (!this.zH) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        } else if (i >= 0) {
            synchronized (this.SN) {
                if (i >= this.SN.N.length) {
                    this.SN.N = (QY[]) Arrays.copyOf(this.SN.N, i + 1);
                }
                this.SN.N[i] = qy;
            }
        }
    }

    public final boolean SN() {
        return this.zH;
    }

    public final String toString() {
        return this.SN == null ? "" : new C0093du(this, C0176rq.zH).toString();
    }

    public final QY yq(int i) {
        if (!this.zH) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        } else if (i < 0 || i >= this.SN.N.length) {
            return null;
        } else {
            return this.SN.N[i];
        }
    }
}
