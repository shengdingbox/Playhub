package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class eN {
    private final List<Jz> SN = Collections.synchronizedList(new ArrayList());
    protected long yq;

    public final void N(Jz jz) {
        this.yq++;
        this.SN.add(jz);
        Thread thread = new Thread(jz);
        thread.setDaemon(true);
        StringBuilder yq = by.yq("NanoHttpd Request Processor (#");
        yq.append(this.yq);
        yq.append(")");
        thread.setName(yq.toString());
        thread.start();
    }

    public final void SN(Jz jz) {
        this.SN.remove(jz);
    }

    public final void yq() {
        Iterator it = new ArrayList(this.SN).iterator();
        while (it.hasNext()) {
            ((Jz) it.next()).yq();
        }
    }
}
