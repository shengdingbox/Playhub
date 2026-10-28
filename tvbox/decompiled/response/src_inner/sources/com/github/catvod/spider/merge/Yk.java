package com.github.catvod.spider.merge;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Yk implements AbstractC0101fM {
    private Double SN(String str) {
        if (uT.yq.matcher(str).matches()) {
            return Double.valueOf(Double.parseDouble(str));
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final String name() {
        return "sum";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final C0066Le yq(L1 l1, List<C0066Le> list) {
        if (list.isEmpty()) {
            return new C0066Le(0);
        }
        LinkedList linkedList = new LinkedList();
        for (C0066Le le : list) {
            if (le.v3()) {
                linkedList.add(le.N());
            }
            if (le.W()) {
                Double SN = SN(le.t0());
                if (SN == null) {
                    return null;
                }
                linkedList.add(SN);
            }
            if (le.G4()) {
                Iterator<hN> it = le.tF().iterator();
                while (it.hasNext()) {
                    Double SN2 = SN(it.next().kR());
                    if (SN2 == null) {
                        return null;
                    }
                    linkedList.add(SN2);
                }
                continue;
            }
        }
        Double d = (Double) linkedList.stream().reduce(Double.valueOf(0.0d), C0168qq.yq);
        return d.compareTo(Double.valueOf(new BigDecimal(d.longValue()).doubleValue())) == 0 ? new C0066Le(new Long(d.longValue())) : new C0066Le(d);
    }
}
