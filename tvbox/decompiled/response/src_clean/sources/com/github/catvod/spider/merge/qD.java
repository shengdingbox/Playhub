package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class qD extends Hj {
    public static final qD yq = new qD();

    @Override // com.github.catvod.spider.merge.Hj
    public final int Zm(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // com.github.catvod.spider.merge.Hj
    public final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
