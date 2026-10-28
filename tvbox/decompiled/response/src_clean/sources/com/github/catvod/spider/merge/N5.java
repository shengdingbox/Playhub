package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
class N5 extends C0134lj {
    public static final int KJ(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? q(charSequence, str, i, charSequence.length(), z) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093 A[EDGE_INSN: B:50:0x0093->B:43:0x0093 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int q(java.lang.CharSequence r9, java.lang.CharSequence r10, int r11, int r12, boolean r13) {
        /*
            r0 = -1
            com.github.catvod.spider.merge.vD r1 = new com.github.catvod.spider.merge.vD
            r2 = 0
            if (r11 >= 0) goto L7
            r11 = 0
        L7:
            int r3 = r9.length()
            if (r12 <= r3) goto Le
            r12 = r3
        Le:
            r1.<init>(r11, r12)
            boolean r11 = r9 instanceof java.lang.String
            if (r11 == 0) goto L4c
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L4c
            int r11 = r1.yq()
            int r12 = r1.SN()
            int r1 = r1.N()
            if (r1 <= 0) goto L29
            if (r11 <= r12) goto L2d
        L29:
            if (r1 >= 0) goto L99
            if (r12 > r11) goto L99
        L2d:
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
            int r8 = r10.length()
            if (r13 != 0) goto L3e
            boolean r3 = r3.regionMatches(r2, r6, r11, r8)
            goto L45
        L3e:
            r5 = 0
            r4 = r13
            r7 = r11
            boolean r3 = r3.regionMatches(r4, r5, r6, r7, r8)
        L45:
            if (r3 == 0) goto L48
            goto L93
        L48:
            if (r11 == r12) goto L99
            int r11 = r11 + r1
            goto L2d
        L4c:
            int r11 = r1.yq()
            int r12 = r1.SN()
            int r1 = r1.N()
            if (r1 <= 0) goto L5c
            if (r11 <= r12) goto L60
        L5c:
            if (r1 >= 0) goto L99
            if (r12 > r11) goto L99
        L60:
            int r3 = r10.length()
            if (r11 < 0) goto L90
            int r4 = r10.length()
            int r4 = r4 - r3
            if (r4 < 0) goto L90
            int r4 = r9.length()
            int r4 = r4 - r3
            if (r11 <= r4) goto L75
            goto L90
        L75:
            r4 = 0
        L76:
            if (r4 >= r3) goto L8e
            int r5 = r2 + r4
            char r5 = r10.charAt(r5)
            int r6 = r11 + r4
            char r6 = r9.charAt(r6)
            boolean r5 = com.github.catvod.spider.merge.C0060Do.KJ(r5, r6, r13)
            if (r5 != 0) goto L8b
            goto L90
        L8b:
            int r4 = r4 + 1
            goto L76
        L8e:
            r3 = 1
            goto L91
        L90:
            r3 = 0
        L91:
            if (r3 == 0) goto L95
        L93:
            r0 = r11
            goto L99
        L95:
            if (r11 == r12) goto L99
            int r11 = r11 + r1
            goto L60
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N5.q(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean):int");
    }
}
