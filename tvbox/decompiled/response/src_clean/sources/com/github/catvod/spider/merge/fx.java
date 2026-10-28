package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Va;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class fx implements Iterable<B5>, Cloneable {
    private int yq = 0;
    String[] SN = new String[3];
    Object[] N = new Object[3];

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq implements Iterator<B5> {
        int yq = 0;

        yq() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (this.yq < fx.this.yq) {
                fx fxVar = fx.this;
                if (!fxVar.ee(fxVar.SN[this.yq])) {
                    break;
                }
                this.yq++;
            }
            return this.yq < fx.this.yq;
        }

        @Override // java.util.Iterator
        public final B5 next() {
            fx fxVar = fx.this;
            String[] strArr = fxVar.SN;
            int i = this.yq;
            B5 b5 = new B5(strArr[i], (String) fxVar.N[i], fxVar);
            this.yq++;
            return b5;
        }

        @Override // java.util.Iterator
        public final void remove() {
            fx fxVar = fx.this;
            int i = this.yq - 1;
            this.yq = i;
            fxVar.OW(i);
        }
    }

    private void Gc(int i) {
        li.i(i >= this.yq);
        String[] strArr = this.SN;
        int length = strArr.length;
        if (length < i) {
            int i2 = 3;
            if (length >= 3) {
                i2 = this.yq * 2;
            }
            if (i <= i2) {
                i = i2;
            }
            this.SN = (String[]) Arrays.copyOf(strArr, i);
            this.N = Arrays.copyOf(this.N, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String M(Object obj) {
        return obj == null ? "" : (String) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OW(int i) {
        li.zH(i >= this.yq);
        int i2 = (this.yq - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.SN;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.N;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.yq - 1;
        this.yq = i4;
        this.SN[i4] = null;
        this.N[i4] = null;
    }

    private int W(String str) {
        li.B(str);
        for (int i = 0; i < this.yq; i++) {
            if (str.equalsIgnoreCase(this.SN[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ee(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    private void i(String str, Object obj) {
        Gc(this.yq + 1);
        String[] strArr = this.SN;
        int i = this.yq;
        strArr[i] = str;
        this.N[i] = obj;
        this.yq = i + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String v(String str) {
        return '/' + str;
    }

    public final String B(String str) {
        int v3 = v3(str);
        return v3 == -1 ? "" : M(this.N[v3]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F5(Appendable appendable, Va.yq yqVar) {
        String SN;
        int i = this.yq;
        for (int i2 = 0; i2 < i; i2++) {
            if (!ee(this.SN[i2]) && (SN = B5.SN(this.SN[i2], yqVar.Gc())) != null) {
                B5.tF(SN, (String) this.N[i2], appendable.append(' '), yqVar);
            }
        }
    }

    public final String G(String str) {
        int W = W(str);
        return W == -1 ? "" : M(this.N[W]);
    }

    public final boolean G4(String str) {
        return v3(str) != -1;
    }

    public final fx Gd(String str, String str2) {
        li.B(str);
        int v3 = v3(str);
        if (v3 != -1) {
            this.N[v3] = str2;
        } else {
            i(str, str2);
        }
        return this;
    }

    /* renamed from: KJ */
    public final fx clone() {
        try {
            fx fxVar = (fx) super.clone();
            fxVar.yq = this.yq;
            fxVar.SN = (String[]) Arrays.copyOf(this.SN, this.yq);
            fxVar.N = Arrays.copyOf(this.N, this.yq);
            return fxVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Nl(String str, String str2) {
        int W = W(str);
        if (W != -1) {
            this.N[W] = str2;
            if (!this.SN[W].equals(str)) {
                this.SN[W] = str;
                return;
            }
            return;
        }
        i(str, str2);
    }

    public final boolean dT(String str) {
        return W(str) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx.class != obj.getClass()) {
            return false;
        }
        fx fxVar = (fx) obj;
        if (this.yq != fxVar.yq) {
            return false;
        }
        for (int i = 0; i < this.yq; i++) {
            int v3 = fxVar.v3(this.SN[i]);
            if (v3 == -1) {
                return false;
            }
            Object obj2 = this.N[i];
            Object obj3 = fxVar.N[v3];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final void g9() {
        for (int i = 0; i < this.yq; i++) {
            String[] strArr = this.SN;
            strArr[i] = eb.zH(strArr[i]);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.N) + (((this.yq * 31) + Arrays.hashCode(this.SN)) * 31);
    }

    public final boolean isEmpty() {
        return this.yq == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<B5> iterator() {
        return new yq();
    }

    public final int q(r6 r6Var) {
        int i = 0;
        if (this.yq == 0) {
            return 0;
        }
        boolean zH = r6Var.zH();
        int i2 = 0;
        while (i < this.SN.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.SN;
                if (i4 < strArr.length && strArr[i4] != null) {
                    if (!zH || !strArr[i].equals(strArr[i4])) {
                        if (!zH) {
                            String[] strArr2 = this.SN;
                            if (!strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                            }
                        }
                        i4++;
                    }
                    i2++;
                    OW(i4);
                    i4--;
                    i4++;
                }
            }
            i = i3;
        }
        return i2;
    }

    public final int size() {
        return this.yq;
    }

    public final List<B5> t0() {
        ArrayList arrayList = new ArrayList(this.yq);
        for (int i = 0; i < this.yq; i++) {
            if (!ee(this.SN[i])) {
                arrayList.add(new B5(this.SN[i], (String) this.N[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final fx tF(String str, String str2) {
        i(str, str2);
        return this;
    }

    public final String toString() {
        StringBuilder SN = P1.SN();
        try {
            F5(SN, new Va("").D());
            return P1.Gc(SN);
        } catch (IOException e) {
            throw new sI(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int v3(String str) {
        li.B(str);
        for (int i = 0; i < this.yq; i++) {
            if (str.equals(this.SN[i])) {
                return i;
            }
        }
        return -1;
    }

    public final fx xa(B5 b5) {
        Gd(b5.yq(), b5.getValue());
        b5.N = this;
        return this;
    }

    public final void zH(fx fxVar) {
        int i = fxVar.yq;
        if (i != 0) {
            Gc(this.yq + i);
            boolean z = this.yq != 0;
            int i2 = 0;
            while (true) {
                if (i2 >= fxVar.yq || !fxVar.ee(fxVar.SN[i2])) {
                    if (i2 < fxVar.yq) {
                        B5 b5 = new B5(fxVar.SN[i2], (String) fxVar.N[i2], fxVar);
                        i2++;
                        if (z) {
                            xa(b5);
                        } else {
                            i(b5.yq(), b5.getValue());
                        }
                    } else {
                        return;
                    }
                } else {
                    i2++;
                }
            }
        }
    }
}
