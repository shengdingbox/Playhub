package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.zT;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class dU<K, V> extends C0208z2<K, V> implements Map<K, V> {
    zT<K, V> Gc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class yq extends zT<K, V> {
        yq() {
        }

        @Override // com.github.catvod.spider.merge.zT
        protected final int N(Object obj) {
            return dU.this.i(obj);
        }

        @Override // com.github.catvod.spider.merge.zT
        protected final Object SN(int i, int i2) {
            return dU.this.SN[(i << 1) + i2];
        }

        @Override // com.github.catvod.spider.merge.zT
        protected final void tF(int i) {
            dU.this.KJ(i);
        }

        @Override // com.github.catvod.spider.merge.zT
        protected final void yq() {
            dU.this.clear();
        }
    }

    private zT<K, V> B() {
        if (this.Gc == null) {
            this.Gc = new yq();
        }
        return this.Gc;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        zT<K, V> B = B();
        if (B.yq == null) {
            B.yq = new zT.SN();
        }
        return B.yq;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        zT<K, V> B = B();
        if (B.SN == null) {
            B.SN = new zT.N();
        }
        return B.SN;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        N(map.size() + this.N);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        zT<K, V> B = B();
        if (B.N == null) {
            B.N = new zT.zH();
        }
        return B.N;
    }
}
