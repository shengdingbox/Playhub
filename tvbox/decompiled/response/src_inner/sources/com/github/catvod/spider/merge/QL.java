package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class QL {
    private int SN = 0;
    private String yq;

    public QL(String str) {
        li.B(str);
        this.yq = str;
    }

    public static String dT(String str) {
        StringBuilder SN = P1.SN();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || c == '\\') {
                SN.append(c2);
            }
            i++;
            c = c2;
        }
        return P1.Gc(SN);
    }

    public final boolean B(String... strArr) {
        for (String str : strArr) {
            if (q(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean G() {
        return !M() && Character.isLetterOrDigit(this.yq.charAt(this.SN));
    }

    public final String G4() {
        String substring = this.yq.substring(this.SN);
        this.SN = this.yq.length();
        return substring;
    }

    public final boolean Gc() {
        boolean z = false;
        while (true) {
            if (!(!M() && P1.zH(this.yq.charAt(this.SN)))) {
                return z;
            }
            this.SN++;
            z = true;
        }
    }

    public final boolean KJ(String str) {
        if (!q(str)) {
            return false;
        }
        this.SN = str.length() + this.SN;
        return true;
    }

    public final boolean M() {
        return this.yq.length() - this.SN == 0;
    }

    public final char N() {
        String str = this.yq;
        int i = this.SN;
        this.SN = i + 1;
        return str.charAt(i);
    }

    public final String SN() {
        String str;
        int indexOf = this.yq.indexOf(")", this.SN);
        if (indexOf != -1) {
            str = this.yq.substring(this.SN, indexOf);
            this.SN = str.length() + this.SN;
        } else {
            str = G4();
        }
        KJ(")");
        return str;
    }

    public final String i() {
        int i = this.SN;
        while (!M() && (G() || B("*|", "|", "_", "-"))) {
            this.SN++;
        }
        return this.yq.substring(i, this.SN);
    }

    public final boolean q(String str) {
        return this.yq.regionMatches(true, this.SN, str, 0, str.length());
    }

    public final String t0(String... strArr) {
        int i = this.SN;
        while (!M() && !B(strArr)) {
            this.SN++;
        }
        return this.yq.substring(i, this.SN);
    }

    public final void tF(String str) {
        if (q(str)) {
            int length = str.length();
            int length2 = this.yq.length();
            int i = this.SN;
            if (length <= length2 - i) {
                this.SN = i + length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public final String toString() {
        return this.yq.substring(this.SN);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f A[LOOP:0: B:3:0x0009->B:43:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0056 A[EDGE_INSN: B:45:0x0056->B:36:0x0056 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String yq(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
        L9:
            boolean r9 = r11.M()
            if (r9 == 0) goto L10
            goto L56
        L10:
            char r9 = r11.N()
            r10 = 92
            if (r2 == r10) goto L42
            r10 = 39
            if (r9 != r10) goto L23
            if (r9 == r12) goto L23
            if (r3 != 0) goto L23
            r4 = r4 ^ 1
            goto L2d
        L23:
            r10 = 34
            if (r9 != r10) goto L2d
            if (r9 == r12) goto L2d
            if (r4 != 0) goto L2d
            r3 = r3 ^ 1
        L2d:
            if (r4 != 0) goto L54
            if (r3 != 0) goto L54
            if (r8 == 0) goto L34
            goto L54
        L34:
            if (r9 != r12) goto L3d
            int r7 = r7 + 1
            if (r5 != r0) goto L4d
            int r5 = r11.SN
            goto L4d
        L3d:
            if (r9 != r13) goto L4d
            int r7 = r7 + (-1)
            goto L4d
        L42:
            r10 = 81
            if (r9 != r10) goto L48
            r8 = 1
            goto L4d
        L48:
            r10 = 69
            if (r9 != r10) goto L4d
            r8 = 0
        L4d:
            if (r7 <= 0) goto L54
            if (r2 == 0) goto L54
            int r2 = r11.SN
            r6 = r2
        L54:
            if (r7 > 0) goto L7f
        L56:
            if (r6 < 0) goto L5f
            java.lang.String r12 = r11.yq
            java.lang.String r12 = r12.substring(r5, r6)
            goto L61
        L5f:
            java.lang.String r12 = ""
        L61:
            if (r7 > 0) goto L64
            return r12
        L64:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = "'"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.github.catvod.spider.merge.li.tF(r12)
            r12 = 0
            throw r12
        L7f:
            r2 = r9
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.QL.yq(char, char):java.lang.String");
    }

    public final String zH() {
        int i = this.SN;
        while (!M()) {
            if (!G()) {
                char[] cArr = {'-', '_'};
                boolean z = false;
                if (!M()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break;
                        }
                        if (this.yq.charAt(this.SN) == cArr[i2]) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    break;
                }
            }
            this.SN++;
        }
        return this.yq.substring(i, this.SN);
    }
}
