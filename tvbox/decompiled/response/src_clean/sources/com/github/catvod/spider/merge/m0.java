package com.github.catvod.spider.merge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class m0 implements AbstractC0101fM {
    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final String name() {
        return "format-date";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final C0066Le yq(L1 l1, List<C0066Le> list) {
        LinkedList linkedList = (LinkedList) list;
        String t0 = ((C0066Le) linkedList.get(0)).t0();
        String t02 = ((C0066Le) linkedList.get(1)).t0();
        try {
            if (linkedList.size() <= 2 || linkedList.get(2) == null) {
                return new C0066Le(rE.SN(t02).N(t0));
            }
            return new C0066Le(new SimpleDateFormat(t02, Locale.forLanguageTag(((C0066Le) linkedList.get(2)).t0())).parse(t0));
        } catch (ParseException e) {
            throw new B1(e);
        }
    }
}
