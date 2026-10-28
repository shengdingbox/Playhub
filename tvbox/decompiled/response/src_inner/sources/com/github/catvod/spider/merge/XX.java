package com.github.catvod.spider.merge;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class XX implements T9 {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq implements aA {
        final /* synthetic */ kB SN;
        final /* synthetic */ Map yq;

        yq(Map map, kB kBVar) {
            this.yq = map;
            this.SN = kBVar;
        }

        @Override // com.github.catvod.spider.merge.aA
        public final void SN(MA ma, int i) {
            if (ma instanceof QE) {
                QE qe = (QE) ma;
                String str = i + "_" + qe.OW().hashCode();
                Integer num = (Integer) this.yq.get(str);
                Integer valueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
                this.yq.put(str, valueOf);
                hN hNVar = new hN("JX_TEXT");
                hNVar.Qz(qe.E1());
                hNVar.V("EL_DEPTH", str);
                try {
                    Method declaredMethod = MA.class.getDeclaredMethod("setParentNode", MA.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(hNVar, qe.OW());
                } catch (Exception unused) {
                }
                aq.v(hNVar, valueOf.intValue());
                this.SN.add(hNVar);
            }
        }

        @Override // com.github.catvod.spider.merge.aA
        public final void yq(MA ma, int i) {
        }
    }

    @Override // com.github.catvod.spider.merge.T9
    public final String name() {
        return "text";
    }

    @Override // com.github.catvod.spider.merge.T9
    public final C0066Le yq(L1 l1) {
        Integer num;
        kB yq2 = l1.yq();
        kB kBVar = new kB();
        HashMap hashMap = new HashMap();
        if (yq2 != null && yq2.size() > 0) {
            if (l1.i()) {
                Iterator<hN> it = yq2.iterator();
                while (it.hasNext()) {
                    C0072So.M(new yq(hashMap, kBVar), it.next());
                }
                Iterator<hN> it2 = kBVar.iterator();
                while (it2.hasNext()) {
                    hN next = it2.next();
                    String N = next.N("EL_DEPTH");
                    if (Mw.tF(N) && (num = (Integer) hashMap.get(N)) != null) {
                        aq.ee(next, num.intValue());
                    }
                }
            } else {
                Iterator<hN> it3 = yq2.iterator();
                while (it3.hasNext()) {
                    hN next2 = it3.next();
                    if ("script".equals(next2.v())) {
                        hN hNVar = new hN("JX_TEXT");
                        hNVar.Qz(next2.lF());
                        aq.v(hNVar, 1);
                        aq.ee(hNVar, 1);
                        kBVar.add(hNVar);
                    } else {
                        List<QE> s0 = next2.s0();
                        int i = 0;
                        while (i < s0.size()) {
                            hN hNVar2 = new hN("JX_TEXT");
                            hNVar2.Qz(s0.get(i).E1());
                            i++;
                            aq.v(hNVar2, i);
                            aq.ee(hNVar2, s0.size());
                            kBVar.add(hNVar2);
                        }
                    }
                }
            }
        }
        return new C0066Le(kBVar);
    }
}
