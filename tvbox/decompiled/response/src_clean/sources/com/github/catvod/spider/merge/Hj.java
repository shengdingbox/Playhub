package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class Hj implements l4 {
    @Override // com.github.catvod.spider.merge.l4
    public void M() {
    }

    public abstract int Zm(Object obj);

    public abstract boolean b(Object obj, Object obj2);

    @Override // com.github.catvod.spider.merge.l4
    public Object tF(e2 e2Var) {
        int tF = e2Var.tF();
        Object obj = null;
        for (int i = 0; i < tF; i++) {
            obj = e2Var.N(i).yq(this);
        }
        return obj;
    }

    @Override // com.github.catvod.spider.merge.l4
    public void yq() {
    }
}
