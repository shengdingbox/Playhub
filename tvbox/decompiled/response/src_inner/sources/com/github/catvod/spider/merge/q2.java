package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class q2 {
    private String B;
    private int G;
    private int N;
    private Reader SN;
    private int i;
    private boolean q;
    private int tF;
    private char[] yq;
    private int zH;
    private int t0 = -1;
    private String[] Gc = new String[512];
    private ArrayList<Integer> M = null;
    private int KJ = 1;

    public q2(Reader reader, int i) {
        li.i(reader.markSupported());
        this.SN = reader;
        this.yq = new char[Math.min(i, 32768)];
        SN();
    }

    private static String N(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        boolean z = true;
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + cArr[i + i4];
        }
        int i5 = i3 & 511;
        String str = strArr[i5];
        if (str != null) {
            if (i2 == str.length()) {
                int i6 = i;
                int i7 = i2;
                int i8 = 0;
                while (true) {
                    i7--;
                    if (i7 == 0) {
                        break;
                    }
                    i6++;
                    i8++;
                    if (cArr[i6] != str.charAt(i8)) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return str;
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i5] = str2;
        return str2;
    }

    private boolean Nl() {
        return this.zH >= this.N;
    }

    private int O(int i) {
        if (!OW()) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(this.M, Integer.valueOf(i));
        return binarySearch < -1 ? Math.abs(binarySearch) - 2 : binarySearch;
    }

    private void SN() {
        int i;
        int i2;
        boolean z;
        if (!this.q && (i = this.zH) >= this.tF) {
            int i3 = this.t0;
            if (i3 != -1) {
                i2 = i - i3;
                i = i3;
            } else {
                i2 = 0;
            }
            try {
                long j = i;
                long skip = this.SN.skip(j);
                this.SN.mark(32768);
                int i4 = 0;
                while (true) {
                    z = true;
                    if (i4 > 1024) {
                        break;
                    }
                    Reader reader = this.SN;
                    char[] cArr = this.yq;
                    int read = reader.read(cArr, i4, cArr.length - i4);
                    if (read == -1) {
                        this.q = true;
                    }
                    if (read <= 0) {
                        break;
                    }
                    i4 += read;
                }
                this.SN.reset();
                if (i4 > 0) {
                    if (skip != j) {
                        z = false;
                    }
                    li.i(z);
                    this.N = i4;
                    this.i += i;
                    this.zH = i2;
                    if (this.t0 != -1) {
                        this.t0 = 0;
                    }
                    this.tF = Math.min(i4, 24576);
                }
                m();
                this.B = null;
            } catch (IOException e) {
                throw new Wy(e);
            }
        }
    }

    private void m() {
        if (OW()) {
            if (this.M.size() > 0) {
                int O = O(this.i);
                if (O == -1) {
                    O = 0;
                }
                int intValue = this.M.get(O).intValue();
                this.KJ += O;
                this.M.clear();
                this.M.add(Integer.valueOf(intValue));
            }
            for (int i = this.zH; i < this.N; i++) {
                if (this.yq[i] == '\n') {
                    this.M.add(Integer.valueOf(this.i + 1 + i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String B() {
        char c;
        SN();
        int i = this.zH;
        while (true) {
            int i2 = this.zH;
            if (i2 >= this.N || (((c = this.yq[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.zH++;
        }
        while (!Nl()) {
            char[] cArr = this.yq;
            int i3 = this.zH;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.zH = i3 + 1;
        }
        return N(this.yq, this.Gc, i, this.zH - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Dr(char[] cArr) {
        SN();
        return !Gd() && Arrays.binarySearch(cArr, this.yq[this.zH]) >= 0;
    }

    public final int E1() {
        return this.i + this.zH;
    }

    public final String F5(char c) {
        int i;
        SN();
        int i2 = this.zH;
        while (true) {
            if (i2 >= this.N) {
                i = -1;
                break;
            } else if (c == this.yq[i2]) {
                i = i2 - this.zH;
                break;
            } else {
                i2++;
            }
        }
        if (i == -1) {
            return v();
        }
        String N = N(this.yq, this.Gc, this.zH, i);
        this.zH += i;
        return N;
    }

    final int Fz(CharSequence charSequence) {
        SN();
        char charAt = charSequence.charAt(0);
        int i = this.zH;
        while (i < this.N) {
            if (charAt != this.yq[i]) {
                do {
                    i++;
                    if (i >= this.N) {
                        break;
                    }
                } while (charAt != this.yq[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.N;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.yq[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.zH;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String G() {
        int i = this.zH;
        int i2 = this.N;
        char[] cArr = this.yq;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.zH = i3;
        return i3 > i ? N(this.yq, this.Gc, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String G4() {
        SN();
        int i = this.zH;
        int i2 = this.N;
        char[] cArr = this.yq;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.zH = i3;
        return i3 > i ? N(this.yq, this.Gc, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String Gc() {
        int i = this.zH;
        int i2 = this.N;
        char[] cArr = this.yq;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.zH = i3;
        return i3 > i ? N(this.yq, this.Gc, i, i3 - i) : "";
    }

    public final boolean Gd() {
        SN();
        return this.zH >= this.N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H() {
        char c;
        return !Gd() && (c = this.yq[this.zH]) >= '0' && c <= '9';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String KJ() {
        int i;
        char c;
        SN();
        int i2 = this.zH;
        while (true) {
            i = this.zH;
            if (i >= this.N || (((c = this.yq[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.zH = i + 1;
        }
        return N(this.yq, this.Gc, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String M() {
        int i;
        char c;
        SN();
        int i2 = this.zH;
        while (true) {
            i = this.zH;
            if (i >= this.N || (c = this.yq[i]) < '0' || c > '9') {
                break;
            }
            this.zH = i + 1;
        }
        return N(this.yq, this.Gc, i2, i - i2);
    }

    public final boolean OW() {
        return this.M != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void RQ() {
        int i = this.zH;
        if (i >= 1) {
            this.zH = i - 1;
            return;
        }
        throw new Wy(new IOException("WTF: No buffer left to unconsume."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U() {
        if (Gd()) {
            return false;
        }
        char c = this.yq[this.zH];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String W(char... cArr) {
        SN();
        int i = this.zH;
        int i2 = this.N;
        char[] cArr2 = this.yq;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.zH = i3;
        return i3 > i ? N(this.yq, this.Gc, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z() {
        this.t0 = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Zm(char... cArr) {
        if (Gd()) {
            return false;
        }
        SN();
        char c = this.yq[this.zH];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(char c) {
        return !Gd() && this.yq[this.zH] == c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String dT() {
        int Fz = Fz("]]>");
        if (Fz != -1) {
            String N = N(this.yq, this.Gc, this.zH, Fz);
            this.zH += Fz;
            return N;
        }
        int i = this.N;
        int i2 = this.zH;
        if (i - i2 < 3) {
            return v();
        }
        int i3 = (i - 3) + 1;
        String N2 = N(this.yq, this.Gc, i2, i3 - i2);
        this.zH = i3;
        return N2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ee(String str) {
        boolean z = false;
        int i = -1;
        if (str.equals(this.B)) {
            int i2 = this.G;
            if (i2 == -1) {
                return false;
            }
            if (i2 >= this.zH) {
                return true;
            }
        }
        this.B = str;
        Locale locale = Locale.ENGLISH;
        int Fz = Fz(str.toLowerCase(locale));
        if (Fz > -1) {
            this.G = this.zH + Fz;
            return true;
        }
        int Fz2 = Fz(str.toUpperCase(locale));
        if (Fz2 > -1) {
            z = true;
        }
        if (z) {
            i = this.zH + Fz2;
        }
        this.G = i;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (Gd()) {
            return false;
        }
        char c = this.yq[this.zH];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    final int g1(int i) {
        if (!OW()) {
            return 1;
        }
        int O = O(i);
        return O == -1 ? this.KJ : O + this.KJ + 1;
    }

    public final char g9() {
        SN();
        if (Nl()) {
            return (char) 65535;
        }
        return this.yq[this.zH];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char i() {
        SN();
        char c = Nl() ? (char) 65535 : this.yq[this.zH];
        this.zH++;
        return c;
    }

    public final void k(boolean z) {
        if (z && this.M == null) {
            this.M = new ArrayList<>(409);
            m();
        } else if (!z) {
            this.M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.lang.String r8) {
        /*
            r7 = this;
            r7.SN()
            r7.SN()
            int r0 = r8.length()
            int r1 = r7.N
            int r2 = r7.zH
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L14
            goto L24
        L14:
            r1 = 0
        L15:
            if (r1 >= r0) goto L29
            char r4 = r8.charAt(r1)
            char[] r5 = r7.yq
            int r6 = r7.zH
            int r6 = r6 + r1
            char r5 = r5[r6]
            if (r4 == r5) goto L26
        L24:
            r0 = 0
            goto L2a
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            r0 = 1
        L2a:
            if (r0 == 0) goto L36
            int r0 = r7.zH
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.zH = r8
            return r3
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.q2.n(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String q() {
        char c;
        SN();
        int i = this.zH;
        while (true) {
            int i2 = this.zH;
            if (i2 >= this.N || (((c = this.yq[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.zH++;
        }
        return N(this.yq, this.Gc, i, this.zH - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        if (this.N - this.zH < 1024) {
            this.tF = 0;
        }
        SN();
        this.t0 = this.zH;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String t0(boolean z) {
        int i = this.zH;
        int i2 = this.N;
        char[] cArr = this.yq;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                } else if (c == '\'') {
                    if (z) {
                        break;
                    }
                } else {
                    continue;
                    i3++;
                }
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.zH = i3;
        return i3 > i ? N(this.yq, this.Gc, i, i3 - i) : "";
    }

    public final void tF() {
        Reader reader = this.SN;
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.SN = null;
                this.yq = null;
                this.Gc = null;
                throw th;
            }
            this.SN = null;
            this.yq = null;
            this.Gc = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void tO() {
        int i = this.t0;
        if (i != -1) {
            this.zH = i;
            this.t0 = -1;
            return;
        }
        throw new Wy(new IOException("Mark invalid"));
    }

    public final String toString() {
        int i = this.N;
        int i2 = this.zH;
        return i - i2 < 0 ? "" : new String(this.yq, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean un(java.lang.String r8) {
        /*
            r7 = this;
            r7.SN()
            int r0 = r8.length()
            int r1 = r7.N
            int r2 = r7.zH
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L11
            goto L29
        L11:
            r1 = 0
        L12:
            if (r1 >= r0) goto L2e
            char r4 = r8.charAt(r1)
            char r4 = java.lang.Character.toUpperCase(r4)
            char[] r5 = r7.yq
            int r6 = r7.zH
            int r6 = r6 + r1
            char r5 = r5[r6]
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r4 == r5) goto L2b
        L29:
            r0 = 0
            goto L2f
        L2b:
            int r1 = r1 + 1
            goto L12
        L2e:
            r0 = 1
        L2f:
            if (r0 == 0) goto L3b
            int r0 = r7.zH
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.zH = r8
            return r3
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.q2.un(java.lang.String):boolean");
    }

    final String v() {
        SN();
        char[] cArr = this.yq;
        String[] strArr = this.Gc;
        int i = this.zH;
        String N = N(cArr, strArr, i, this.N - i);
        this.zH = this.N;
        return N;
    }

    public final String v3(char... cArr) {
        SN();
        int i = this.zH;
        int i2 = this.N;
        char[] cArr2 = this.yq;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.zH = i3;
        return i3 > i ? N(this.yq, this.Gc, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String xa() {
        return g1(this.i + this.zH) + ":" + zH(this.i + this.zH);
    }

    public final void yq() {
        this.zH++;
    }

    final int zH(int i) {
        int O;
        if (OW() && (O = O(i)) != -1) {
            return (i - this.M.get(O).intValue()) + 1;
        }
        return i + 1;
    }
}
