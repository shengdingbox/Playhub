package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0199w;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class wg<Symbol, ATNInterpreter extends AbstractC0199w> {
    protected ATNInterpreter SN;
    private List<tF> yq = new yq();
    private int N = -1;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq extends CopyOnWriteArrayList<tF> {
        yq() {
            add(C0125jC.yq);
        }
    }

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    public boolean Gc(int i) {
        return true;
    }

    public final void M(int i) {
        this.N = i;
    }

    public final ATNInterpreter i() {
        return this.SN;
    }

    public final int t0() {
        return this.N;
    }

    public abstract N0 tF();

    public final tF zH() {
        return new PJ(this.yq);
    }
}
