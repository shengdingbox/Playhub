package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* renamed from: com.github.catvod.spider.merge.qi  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0167qi implements Iterable<String> {
    private final HashMap<String, String> yq = new HashMap<>();
    private final ArrayList<gP> SN = new ArrayList<>();

    public C0167qi(Map<String, String> map) {
        String str = map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.yq.put(split[0], split[1]);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.yq.keySet().iterator();
    }

    public final void yq(pM pMVar) {
        Iterator<gP> it = this.SN.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            pMVar.SN(String.format("%s=%s; expires=%s", null, null, null));
        }
    }
}
