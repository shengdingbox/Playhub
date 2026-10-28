package com.github.catvod.spider.merge;
/* renamed from: com.github.catvod.spider.merge.rq  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0176rq implements AbstractC0108gL {
    private static final String[] tF;
    public static final C0176rq zH;
    private final String[] N;
    private final String[] SN;
    private final String[] yq;

    static {
        String[] strArr = new String[0];
        tF = strArr;
        zH = new C0176rq(strArr, strArr, strArr);
    }

    public C0176rq(String[] strArr, String[] strArr2, String[] strArr3) {
        this.yq = strArr;
        this.SN = strArr2;
        strArr3 = strArr3 == null ? tF : strArr3;
        this.N = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    public final String N(int i) {
        if (i >= 0) {
            String[] strArr = this.SN;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }

    public final String SN(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.yq;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public final String yq(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.N;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String SN = SN(i);
        if (SN != null) {
            return SN;
        }
        String N = N(i);
        return N != null ? N : Integer.toString(i);
    }
}
