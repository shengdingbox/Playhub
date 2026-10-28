package com.github.catvod.spider.merge;

import java.io.Writer;
@Deprecated
/* renamed from: com.github.catvod.spider.merge.Fo  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0061Fo extends iY {
    private final iY[] SN;

    public C0061Fo(iY... iYVarArr) {
        this.SN = (iY[]) ((Object[]) iYVarArr.clone());
    }

    @Override // com.github.catvod.spider.merge.iY
    public final int yq(CharSequence charSequence, int i, Writer writer) {
        for (iY iYVar : this.SN) {
            int yq = iYVar.yq(charSequence, i, writer);
            if (yq != 0) {
                return yq;
            }
        }
        return 0;
    }
}
