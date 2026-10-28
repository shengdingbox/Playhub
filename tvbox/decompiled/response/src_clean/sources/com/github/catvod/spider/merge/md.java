package com.github.catvod.spider.merge;

import java.lang.reflect.Method;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class md {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class yq {
        public static final Method yq;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
            if (com.github.catvod.spider.merge.aq.yq(r5, java.lang.Throwable.class) != false) goto L13;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                com.github.catvod.spider.merge.aq.tF(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Le:
                r5 = 0
                if (r4 >= r2) goto L3d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = com.github.catvod.spider.merge.aq.yq(r7, r8)
                r8 = 1
                if (r7 == 0) goto L35
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                com.github.catvod.spider.merge.aq.tF(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L2e
                r5 = r7[r3]
            L2e:
                boolean r5 = com.github.catvod.spider.merge.aq.yq(r5, r0)
                if (r5 == 0) goto L35
                goto L36
            L35:
                r8 = 0
            L36:
                if (r8 == 0) goto L3a
                r5 = r6
                goto L3d
            L3a:
                int r4 = r4 + 1
                goto Le
            L3d:
                com.github.catvod.spider.merge.md.yq.yq = r5
                int r0 = r1.length
            L40:
                if (r3 >= r0) goto L54
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = com.github.catvod.spider.merge.aq.yq(r2, r4)
                if (r2 == 0) goto L51
                goto L54
            L51:
                int r3 = r3 + 1
                goto L40
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.md.yq.<clinit>():void");
        }
    }

    public final void yq(Throwable th, Throwable th2) {
        Method method = yq.yq;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
