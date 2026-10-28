package com.github.catvod.spider.merge;

import java.io.Writer;
@Deprecated
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class ho extends iY {
    public abstract boolean SN(int i, Writer writer);

    @Override // com.github.catvod.spider.merge.iY
    public final int yq(CharSequence charSequence, int i, Writer writer) {
        return SN(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }
}
