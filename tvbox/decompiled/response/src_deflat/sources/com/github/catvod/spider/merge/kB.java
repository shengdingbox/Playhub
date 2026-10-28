package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class kB extends ArrayList<hN> {
    public kB() {
    }

    public kB(int i) {
        super(i);
    }

    public kB(List<hN> list) {
        super(list);
    }

    public kB(hN... hNVarArr) {
        super(Arrays.asList(hNVarArr));
    }

    public final kB N(int i) {
        return size() > i ? new kB(get(i)) : new kB();
    }

    public final List<String> SN() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<hN> it = iterator();
        while (it.hasNext()) {
            hN next = it.next();
            if (next.w()) {
                arrayList.add(next.Fo());
            }
        }
        return arrayList;
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        kB kBVar = new kB(size());
        Iterator<hN> it = iterator();
        while (it.hasNext()) {
            kBVar.add(it.next().clone());
        }
        return kBVar;
    }

    public final kB i(String str) {
        li.KJ(str);
        Y4 KJ = xq.KJ(str);
        kB kBVar = new kB();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<hN> it = iterator();
        while (it.hasNext()) {
            hN next = it.next();
            li.B(KJ);
            li.B(next);
            Iterator<hN> it2 = C0162pa.yq(KJ, next).iterator();
            while (it2.hasNext()) {
                hN next2 = it2.next();
                if (identityHashMap.put(next2, Boolean.TRUE) == null) {
                    kBVar.add(next2);
                }
            }
        }
        return kBVar;
    }

    public final String t0() {
        StringBuilder SN = P1.SN();
        Iterator<hN> it = iterator();
        while (it.hasNext()) {
            hN next = it.next();
            if (SN.length() != 0) {
                SN.append(" ");
            }
            SN.append(next.Fo());
        }
        return P1.Gc(SN);
    }

    public final hN tF() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder SN = P1.SN();
        Iterator<hN> it = iterator();
        while (it.hasNext()) {
            hN next = it.next();
            if (SN.length() != 0) {
                SN.append("\n");
            }
            SN.append(next.ee());
        }
        return P1.Gc(SN);
    }

    public final String yq(String str) {
        Iterator<hN> it = iterator();
        while (it.hasNext()) {
            hN next = it.next();
            if (next.G4(str)) {
                return next.N(str);
            }
        }
        return "";
    }

    public final hN zH() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }
}
