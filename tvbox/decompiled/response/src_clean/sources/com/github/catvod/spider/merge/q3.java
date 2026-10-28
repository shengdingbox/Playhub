package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class q3 {
    private kB yq;

    public q3(kB kBVar) {
        this.yq = kBVar;
    }

    public final List<C0104fu> yq(String str) {
        C0104fu fuVar;
        LinkedList linkedList = new LinkedList();
        try {
            Uf uf = new Uf(new Lv(new LJ(zN.yq(str))));
            uf.ee(new Rf());
            C0066Le le = (C0066Le) uf.Zm().yq(new SC(this.yq));
            if (le == null) {
                linkedList.add(new C0104fu(""));
                return linkedList;
            } else if (le.G4()) {
                Iterator<hN> it = le.tF().iterator();
                while (it.hasNext()) {
                    linkedList.add(new C0104fu(it.next()));
                }
                return linkedList;
            } else if (le.F5()) {
                for (String str2 : le.zH()) {
                    linkedList.add(new C0104fu(str2));
                }
                return linkedList;
            } else if (le.W()) {
                linkedList.add(new C0104fu(le.t0()));
                return linkedList;
            } else if (le.v3()) {
                Class v = le.v();
                if (!v.isAssignableFrom(Long.class) && !v.isAssignableFrom(Integer.class)) {
                    fuVar = new C0104fu(le.N());
                    linkedList.add(fuVar);
                    return linkedList;
                }
                fuVar = new C0104fu(le.i());
                linkedList.add(fuVar);
                return linkedList;
            } else if (le.B()) {
                linkedList.add(new C0104fu(le.yq()));
                return linkedList;
            } else if (le.G()) {
                linkedList.add(new C0104fu(le.SN()));
                return linkedList;
            } else {
                linkedList.add(new C0104fu(le.t0()));
                return linkedList;
            }
        } catch (Exception e) {
            StringBuilder yq = by.yq("Please check the syntax of your xpath expr or commit a ");
            yq.append(C0060Do.B(e));
            throw new ZD(yq.toString(), e);
        }
    }
}
