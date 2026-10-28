package com.github.catvod.spider.merge;

import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.github.catvod.spider.merge.lE  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0132lE<Key1, Key2, Value> {
    Map<Key1, Map<Key2, Value>> yq = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<Key1, java.util.Map<Key2, Value>>] */
    public final Value SN(Key1 key1, Key2 key2, Value value) {
        Value value2;
        Map<Key2, Value> map = (Map) this.yq.get(key1);
        if (map == null) {
            map = new LinkedHashMap<>();
            this.yq.put(key1, map);
            value2 = null;
        } else {
            value2 = map.get(key2);
        }
        map.put(key2, value);
        return value2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<Key1, java.util.Map<Key2, Value>>] */
    public final Value yq(Key1 key1, Key2 key2) {
        Map map = (Map) this.yq.get(key1);
        if (map == null) {
            return null;
        }
        return (Value) map.get(key2);
    }
}
