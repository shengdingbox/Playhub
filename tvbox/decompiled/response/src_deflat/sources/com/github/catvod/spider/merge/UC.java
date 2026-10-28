package com.github.catvod.spider.merge;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class UC implements AbstractC0155oI {
    private final List<b9> yq;

    public UC() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.yq = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.b9>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.b9>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.AbstractC0155oI
    public final void clear() {
        Iterator it = this.yq.iterator();
        while (it.hasNext()) {
            try {
                ((b9) it.next()).yq();
            } catch (Exception e) {
                Vd.KJ.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        this.yq.clear();
    }
}
