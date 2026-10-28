package com.github.catvod.spider.merge;

import java.io.File;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class pD extends Wl {
    private int i;

    public pD(File file, boolean z, int i) {
        super(file, z, i);
        this.i = i;
    }

    @Override // com.github.catvod.spider.merge.Wl
    protected final File yq(int i) {
        if (i == this.i) {
            return this.SN;
        }
        String canonicalPath = this.SN.getCanonicalPath();
        String str = i >= 9 ? ".z" : ".z0";
        return new File(canonicalPath.substring(0, canonicalPath.lastIndexOf(".")) + str + (i + 1));
    }
}
