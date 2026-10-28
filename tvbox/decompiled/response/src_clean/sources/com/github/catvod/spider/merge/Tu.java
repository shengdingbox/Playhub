package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Tu extends My {
    public YW i;
    public List<wA> tF;
    public YW zH;

    public Tu() {
    }

    public Tu(Tu tu, int i) {
        super(tu, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    public final em B(int i) {
        ?? r0 = this.tF;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        Iterator it = this.tF.iterator();
        while (it.hasNext()) {
            wA wAVar = (wA) it.next();
            if (wAVar instanceof em) {
                em emVar = (em) wAVar;
                if (emVar.SN().getType() == i) {
                    return emVar;
                }
            }
        }
        return null;
    }

    public void Gc(Js js) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    public final Tu KJ(Class cls) {
        wA wAVar;
        ?? r0 = this.tF;
        if (r0 != 0 && r0.size() > 0) {
            Iterator it = this.tF.iterator();
            while (it.hasNext()) {
                wA wAVar2 = (wA) it.next();
                if (cls.isInstance(wAVar2)) {
                    wAVar = (wA) cls.cast(wAVar2);
                    break;
                }
            }
        }
        wAVar = null;
        return (Tu) wAVar;
    }

    public void M(Js js) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.My, com.github.catvod.spider.merge.wA
    public final wA N(int i) {
        ?? r0 = this.tF;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (wA) this.tF.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    public final <T extends Tu> List<T> q(Class<? extends T> cls) {
        ?? r0 = this.tF;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            wA wAVar = (wA) it.next();
            if (cls.isInstance(wAVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(wAVar));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    public final <T extends wA> T t0(T t) {
        if (this.tF == null) {
            this.tF = new ArrayList();
        }
        this.tF.add(t);
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.My, com.github.catvod.spider.merge.wA
    public final int tF() {
        ?? r0 = this.tF;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }
}
