package com.github.catvod.spider.merge;

import java.io.File;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class cl extends Wl {
    public cl(File file, int i) {
        super(file, true, i);
    }

    @Override // com.github.catvod.spider.merge.Wl
    protected final File yq(int i) {
        String canonicalPath = this.SN.getCanonicalPath();
        StringBuilder yq = by.yq(canonicalPath.substring(0, canonicalPath.lastIndexOf(".")));
        StringBuilder yq2 = by.yq(".");
        yq2.append(i < 9 ? "00" : i < 99 ? "0" : "");
        yq2.append(i + 1);
        yq.append(yq2.toString());
        return new File(yq.toString());
    }
}
