package com.github.catvod.spider.merge;

import java.io.Writer;
@Deprecated
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class eV extends ho {
    private final int N;
    private final int SN;

    private eV(int i, int i2) {
        this.SN = i;
        this.N = i2;
    }

    public static eV N(int i, int i2) {
        return new eV(i, i2);
    }

    @Override // com.github.catvod.spider.merge.ho
    public final boolean SN(int i, Writer writer) {
        if (i < this.SN || i > this.N) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
