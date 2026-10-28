package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* renamed from: com.github.catvod.spider.merge.mG  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0137mG {
    public int N;
    public C0184ta i;
    public N0 yq = null;
    public int SN = -1;
    public boolean tF = false;
    protected final List<xc> zH = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));
    }

    public abstract int N();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.xc>, java.util.ArrayList] */
    public final int SN() {
        return this.zH.size();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0137mG) && this.SN == ((AbstractC0137mG) obj).SN;
    }

    public final int hashCode() {
        return this.SN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.xc>, java.util.ArrayList] */
    public final xc tF(int i) {
        return (xc) this.zH.get(i);
    }

    public final String toString() {
        return String.valueOf(this.SN);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.github.catvod.spider.merge.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.github.catvod.spider.merge.xc>, java.util.ArrayList] */
    public final void yq(xc xcVar) {
        int size = this.zH.size();
        boolean z = false;
        if (this.zH.isEmpty()) {
            this.tF = xcVar.SN();
        } else if (this.tF != xcVar.SN()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.SN));
            this.tF = false;
        }
        Iterator it = this.zH.iterator();
        while (it.hasNext()) {
            xc xcVar2 = (xc) it.next();
            if (xcVar2.yq.SN == xcVar.yq.SN && ((xcVar2.N() != null && xcVar.N() != null && xcVar2.N().equals(xcVar.N())) || (xcVar2.SN() && xcVar.SN()))) {
                z = true;
                break;
            }
        }
        if (!z) {
            this.zH.add(size, xcVar);
        }
    }
}
