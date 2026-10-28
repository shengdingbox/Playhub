package com.github.catvod.spider.merge;

import java.math.BigDecimal;
import java.util.regex.Matcher;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class IV implements T9 {
    @Override // com.github.catvod.spider.merge.T9
    public final String name() {
        return "num";
    }

    @Override // com.github.catvod.spider.merge.T9
    public final C0066Le yq(L1 l1) {
        Matcher matcher = uT.yq.matcher(Mw.zH(oy.SN("allText").yq(l1).zH(), ""));
        if (!matcher.find()) {
            return new C0066Le(null);
        }
        BigDecimal bigDecimal = new BigDecimal(matcher.group());
        if (bigDecimal.compareTo(new BigDecimal(bigDecimal.longValue())) == 0) {
            return new C0066Le(Long.valueOf(bigDecimal.longValue()));
        }
        return new C0066Le(Double.valueOf(bigDecimal.doubleValue()));
    }
}
