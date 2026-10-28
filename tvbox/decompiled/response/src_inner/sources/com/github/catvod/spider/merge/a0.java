package com.github.catvod.spider.merge;

import java.io.File;
import java.util.ArrayList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class a0 implements Cloneable {
    private File i;
    private boolean zH;
    private C0180t yq = new C0180t();
    private vt SN = new vt();
    private jo N = new jo();
    private NB tF = new NB();
    private boolean t0 = false;

    public a0() {
        new ArrayList();
        new ArrayList();
    }

    public final void B(NB nb) {
        this.tF = nb;
    }

    public final void G(boolean z) {
        this.t0 = z;
    }

    public final void G4(File file) {
        this.i = file;
    }

    public final void Gc(C0180t tVar) {
        this.yq = tVar;
    }

    public final void KJ(boolean z) {
        this.zH = z;
    }

    public final void M(vt vtVar) {
        this.SN = vtVar;
    }

    public final jo N() {
        return this.N;
    }

    public final vt SN() {
        return this.SN;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean i() {
        return this.zH;
    }

    public final void q(jo joVar) {
        this.N = joVar;
    }

    public final boolean t0() {
        return this.t0;
    }

    public final NB tF() {
        return this.tF;
    }

    public final C0180t yq() {
        return this.yq;
    }

    public final File zH() {
        return this.i;
    }
}
