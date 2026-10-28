package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
/* renamed from: com.github.catvod.spider.merge.du  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0093du {
    private final AbstractC0108gL SN;
    private final ZV yq;

    public C0093du(ZV zv, AbstractC0108gL gLVar) {
        this.yq = zv;
        this.SN = gLVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<com.github.catvod.spider.merge.QY, com.github.catvod.spider.merge.QY>, java.util.HashMap] */
    public final String toString() {
        if (this.yq.SN == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ZV zv = this.yq;
        Objects.requireNonNull(zv);
        ArrayList arrayList = new ArrayList(zv.yq.keySet());
        Collections.sort(arrayList, new wf());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            QY qy = (QY) it.next();
            QY[] qyArr = qy.N;
            int length = qyArr != null ? qyArr.length : 0;
            for (int i = 0; i < length; i++) {
                QY qy2 = qy.N[i];
                if (!(qy2 == null || qy2.yq == Integer.MAX_VALUE)) {
                    sb.append(yq(qy));
                    String yq = ((C0176rq) this.SN).yq(i - 1);
                    sb.append("-");
                    sb.append(yq);
                    sb.append("->");
                    sb.append(yq(qy2));
                    sb.append('\n');
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    protected final String yq(QY qy) {
        StringBuilder sb;
        int i = qy.yq;
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        sb2.append(qy.tF ? ":" : str);
        sb2.append("s");
        sb2.append(i);
        if (qy.t0) {
            str = "^";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (!qy.tF) {
            return sb3;
        }
        if (qy.Gc != null) {
            sb = Sq.yq(sb3, "=>");
            sb.append(Arrays.toString(qy.Gc));
        } else {
            sb = Sq.yq(sb3, "=>");
            sb.append(qy.zH);
        }
        return sb.toString();
    }
}
