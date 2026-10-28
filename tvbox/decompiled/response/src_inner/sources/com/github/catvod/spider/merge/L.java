package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX WARN: Incorrect field signature: TT; */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
abstract class L<T> implements Iterator<T> {
    private String SN;
    private int yq = 2;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r3 >= r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r0.tF.SN(r0.N.charAt(r3)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r4 <= r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        r9 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r0.tF.SN(r0.N.charAt(r9)) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r0.zH == false) goto L50;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r10 = this;
            int r0 = r10.yq
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 == r3) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.github.catvod.spider.merge.C0072So.i(r0)
            int r0 = r10.yq
            int r0 = com.github.catvod.spider.merge.kR.zH(r0)
            if (r0 == 0) goto Lbd
            r4 = 2
            if (r0 == r4) goto Lbc
            r10.yq = r3
            r0 = r10
            com.github.catvod.spider.merge.SY$SN r0 = (com.github.catvod.spider.merge.SY.SN) r0
        L1d:
            int r3 = r0.i
        L1f:
            int r4 = r0.i
            r5 = 3
            r6 = -1
            if (r4 == r6) goto Lb0
            r7 = r0
            com.github.catvod.spider.merge.cq r7 = (com.github.catvod.spider.merge.cq) r7
            com.github.catvod.spider.merge.u6 r8 = r7.Gc
            com.github.catvod.spider.merge.Gx r8 = r8.yq
            java.lang.CharSequence r7 = r7.N
            int r4 = r8.yq(r7, r4)
            if (r4 != r6) goto L3d
            java.lang.CharSequence r4 = r0.N
            int r4 = r4.length()
            r0.i = r6
            goto L41
        L3d:
            int r7 = r4 + 1
            r0.i = r7
        L41:
            int r7 = r0.i
            if (r7 != r3) goto L54
            int r7 = r7 + 1
            r0.i = r7
            java.lang.CharSequence r4 = r0.N
            int r4 = r4.length()
            if (r7 <= r4) goto L1f
            r0.i = r6
            goto L1f
        L54:
            if (r3 >= r4) goto L67
            com.github.catvod.spider.merge.Gx r7 = r0.tF
            java.lang.CharSequence r8 = r0.N
            char r8 = r8.charAt(r3)
            boolean r7 = r7.SN(r8)
            if (r7 == 0) goto L67
            int r3 = r3 + 1
            goto L54
        L67:
            if (r4 <= r3) goto L7b
            com.github.catvod.spider.merge.Gx r7 = r0.tF
            java.lang.CharSequence r8 = r0.N
            int r9 = r4 + (-1)
            char r8 = r8.charAt(r9)
            boolean r7 = r7.SN(r8)
            if (r7 == 0) goto L7b
            r4 = r9
            goto L67
        L7b:
            boolean r7 = r0.zH
            if (r7 == 0) goto L82
            if (r3 != r4) goto L82
            goto L1d
        L82:
            int r7 = r0.t0
            if (r7 != r2) goto La2
            java.lang.CharSequence r4 = r0.N
            int r4 = r4.length()
            r0.i = r6
        L8e:
            if (r4 <= r3) goto La5
            com.github.catvod.spider.merge.Gx r6 = r0.tF
            java.lang.CharSequence r7 = r0.N
            int r8 = r4 + (-1)
            char r7 = r7.charAt(r8)
            boolean r6 = r6.SN(r7)
            if (r6 == 0) goto La5
            r4 = r8
            goto L8e
        La2:
            int r7 = r7 - r2
            r0.t0 = r7
        La5:
            java.lang.CharSequence r0 = r0.N
            java.lang.CharSequence r0 = r0.subSequence(r3, r4)
            java.lang.String r0 = r0.toString()
            goto Lb3
        Lb0:
            r0.yq = r5
            r0 = 0
        Lb3:
            r10.SN = r0
            int r0 = r10.yq
            if (r0 == r5) goto Lbc
            r10.yq = r2
            r1 = 1
        Lbc:
            return r1
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.yq = 2;
            T t = (T) this.SN;
            this.SN = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
