package com.github.catvod.spider.merge;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.cR  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0087cR {
    private final int[] SN;
    private final Ei yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0087cR(Ei ei, int[] iArr) {
        if (iArr.length != 0) {
            this.yq = ei;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.SN = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.SN = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.SN = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        throw new IllegalArgumentException();
    }

    final int N(int i) {
        int[] iArr = this.SN;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0087cR[] SN(C0087cR cRVar) {
        if (!this.yq.equals(cRVar.yq)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!cRVar.zH()) {
            C0087cR tF = this.yq.tF();
            int zH = this.yq.zH(cRVar.N(cRVar.SN.length - 1));
            C0087cR cRVar2 = this;
            while (cRVar2.SN.length - 1 >= cRVar.SN.length - 1 && !cRVar2.zH()) {
                int[] iArr = cRVar2.SN;
                int length = (iArr.length - 1) - (cRVar.SN.length - 1);
                int t0 = this.yq.t0(cRVar2.N(iArr.length - 1), zH);
                C0087cR t02 = cRVar.t0(length, t0);
                tF = tF.yq(this.yq.yq(length, t0));
                cRVar2 = cRVar2.yq(t02);
            }
            return new C0087cR[]{tF, cRVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0087cR i(C0087cR cRVar) {
        if (!this.yq.equals(cRVar.yq)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (zH() || cRVar.zH()) {
            return this.yq.tF();
        } else {
            int[] iArr = this.SN;
            int length = iArr.length;
            int[] iArr2 = cRVar.SN;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2) - 1];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = iArr3[i4] ^ this.yq.t0(i2, iArr2[i3]);
                }
            }
            return new C0087cR(this.yq, iArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0087cR t0(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.yq.tF();
        } else {
            int length = this.SN.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.yq.t0(this.SN[i3], i2);
            }
            return new C0087cR(this.yq, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] tF() {
        return this.SN;
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder((this.SN.length - 1) * 8);
        int length = this.SN.length;
        while (true) {
            length--;
            if (length < 0) {
                return sb.toString();
            }
            int N = N(length);
            if (N != 0) {
                if (N < 0) {
                    sb.append(" - ");
                    N = -N;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || N != 1) {
                    int i = this.yq.i(N);
                    if (i == 0) {
                        c = '1';
                    } else if (i == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                    sb.append(c);
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
    }

    final C0087cR yq(C0087cR cRVar) {
        if (!this.yq.equals(cRVar.yq)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (zH()) {
            return cRVar;
        } else {
            if (cRVar.zH()) {
                return this;
            }
            int[] iArr = this.SN;
            int[] iArr2 = cRVar.SN;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = iArr2[i - length] ^ iArr[i];
            }
            return new C0087cR(this.yq, iArr3);
        }
    }

    final boolean zH() {
        return this.SN[0] == 0;
    }
}
