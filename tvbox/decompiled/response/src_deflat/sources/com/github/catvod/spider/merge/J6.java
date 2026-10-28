package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class J6 {
    private final String yq = ", ";

    private J6() {
    }

    public static J6 SN() {
        return new J6();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[Catch: IOException -> 0x0044, TryCatch #0 {IOException -> 0x0044, blocks: (B:3:0x0004, B:5:0x000a, B:9:0x001c, B:10:0x0020, B:12:0x0029, B:15:0x003c), top: B:22:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0039 -> B:15:0x003c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001c -> B:10:0x0020). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.StringBuilder yq(java.lang.StringBuilder r6, java.lang.Iterable<? extends java.lang.Object> r7) {
        /*
            r5 = this;
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()     // Catch: java.io.IOException -> L44
            if (r0 == 0) goto L43
            java.lang.Object r0 = r7.next()     // Catch: java.io.IOException -> L44
            java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> L44
            boolean r1 = r0 instanceof java.lang.CharSequence     // Catch: java.io.IOException -> L44
            r2 = r5
            if (r1 == 0) goto L19
            r1 = r7
            r7 = r6
            goto L3c
        L19:
            r1 = r0
            r0 = r7
            r7 = r6
        L1c:
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L44
        L20:
            r6.append(r1)     // Catch: java.io.IOException -> L44
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L44
            if (r1 == 0) goto L42
            java.lang.String r1 = r2.yq     // Catch: java.io.IOException -> L44
            r6.append(r1)     // Catch: java.io.IOException -> L44
            java.lang.Object r1 = r0.next()     // Catch: java.io.IOException -> L44
            java.util.Objects.requireNonNull(r1)     // Catch: java.io.IOException -> L44
            boolean r3 = r1 instanceof java.lang.CharSequence     // Catch: java.io.IOException -> L44
            if (r3 == 0) goto L1c
            r4 = r1
            r1 = r0
            r0 = r4
        L3c:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.io.IOException -> L44
            r4 = r1
            r1 = r0
            r0 = r4
            goto L20
        L42:
            r6 = r7
        L43:
            return r6
        L44:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            goto L4c
        L4b:
            throw r7
        L4c:
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.J6.yq(java.lang.StringBuilder, java.lang.Iterable):java.lang.StringBuilder");
    }
}
