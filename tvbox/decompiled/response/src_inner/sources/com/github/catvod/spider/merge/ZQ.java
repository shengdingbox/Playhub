package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
@Deprecated
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class ZQ extends iY {
    private final EnumSet<yq> SN;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public enum yq {
        semiColonRequired,
        /* JADX INFO: Fake field, exist only in values array */
        semiColonOptional,
        errorIfNoSemiColon
    }

    public ZQ(yq... yqVarArr) {
        this.SN = EnumSet.copyOf((Collection) (yqVarArr.length > 0 ? Arrays.asList(yqVarArr) : Collections.singletonList(yq.semiColonRequired)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
        if (r8.charAt(r3) != ';') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        r0 = 1;
     */
    @Override // com.github.catvod.spider.merge.iY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int yq(java.lang.CharSequence r8, int r9, java.io.Writer r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.ZQ.yq(java.lang.CharSequence, int, java.io.Writer):int");
    }
}
