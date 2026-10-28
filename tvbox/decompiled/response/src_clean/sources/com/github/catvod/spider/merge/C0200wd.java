package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.ZQ;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Objects;
@Deprecated
/* renamed from: com.github.catvod.spider.merge.wd  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0200wd {
    public static final C0061Fo yq = new C0061Fo(new iQ(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new iQ(UH.M()), new Pk());
    public static final C0061Fo SN = new C0061Fo(new yb(), new fh(), new iQ(UH.KJ()), new iQ(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""}));

    /* renamed from: com.github.catvod.spider.merge.wd$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static class SN extends iY {
        private static final String SN = String.valueOf('\"');
        private static final char[] N = {',', '\"', '\r', '\n'};

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
            r1 = new java.lang.StringBuilder();
            r2 = com.github.catvod.spider.merge.C0200wd.SN.SN;
            r1.append(r2);
            r1.append(r2);
            r0 = com.github.catvod.spider.merge.Mw.Gc(r0, r1.toString(), r2);
         */
        @Override // com.github.catvod.spider.merge.iY
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int yq(java.lang.CharSequence r13, int r14, java.io.Writer r15) {
            /*
                r12 = this;
                if (r14 != 0) goto L9c
                r14 = 0
                char r0 = r13.charAt(r14)
                r1 = 34
                if (r0 != r1) goto L8c
                int r0 = r13.length()
                r2 = 1
                int r0 = r0 - r2
                char r0 = r13.charAt(r0)
                if (r0 == r1) goto L19
                goto L8c
            L19:
                int r0 = r13.length()
                int r0 = r0 - r2
                java.lang.CharSequence r0 = r13.subSequence(r2, r0)
                java.lang.String r0 = r0.toString()
                char[] r1 = com.github.catvod.spider.merge.C0200wd.SN.N
                boolean r3 = com.github.catvod.spider.merge.Mw.N(r0)
                if (r3 != 0) goto L73
                if (r1 != 0) goto L32
                r3 = 0
                goto L36
            L32:
                int r3 = java.lang.reflect.Array.getLength(r1)
            L36:
                if (r3 != 0) goto L3a
                r3 = 1
                goto L3b
            L3a:
                r3 = 0
            L3b:
                if (r3 == 0) goto L3e
                goto L73
            L3e:
                int r3 = r0.length()
                int r4 = r1.length
                int r5 = r3 + (-1)
                int r6 = r4 + (-1)
                r7 = 0
            L48:
                if (r7 >= r3) goto L73
                char r8 = r0.charAt(r7)
                r9 = 0
            L4f:
                if (r9 >= r4) goto L70
                char r10 = r1[r9]
                if (r10 != r8) goto L6d
                boolean r10 = java.lang.Character.isHighSurrogate(r8)
                if (r10 == 0) goto L74
                if (r9 != r6) goto L5e
                goto L74
            L5e:
                if (r7 >= r5) goto L6d
                int r10 = r9 + 1
                char r10 = r1[r10]
                int r11 = r7 + 1
                char r11 = r0.charAt(r11)
                if (r10 != r11) goto L6d
                goto L74
            L6d:
                int r9 = r9 + 1
                goto L4f
            L70:
                int r7 = r7 + 1
                goto L48
            L73:
                r2 = 0
            L74:
                if (r2 == 0) goto L8c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = com.github.catvod.spider.merge.C0200wd.SN.SN
                r1.append(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r0 = com.github.catvod.spider.merge.Mw.Gc(r0, r1, r2)
                goto L90
            L8c:
                java.lang.String r0 = r13.toString()
            L90:
                r15.write(r0)
                int r15 = r13.length()
                int r13 = java.lang.Character.codePointCount(r13, r14, r15)
                return r13
            L9c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "CsvUnescaper should never reach the [1] index"
                r13.<init>(r14)
                goto La5
            La4:
                throw r13
            La5:
                goto La4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0200wd.SN.yq(java.lang.CharSequence, int, java.io.Writer):int");
        }
    }

    /* renamed from: com.github.catvod.spider.merge.wd$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static class yq extends iY {
        private static final String SN = String.valueOf('\"');
        private static final char[] N = {',', '\"', '\r', '\n'};

        @Override // com.github.catvod.spider.merge.iY
        public final int yq(CharSequence charSequence, int i, Writer writer) {
            boolean z;
            if (i == 0) {
                String charSequence2 = charSequence.toString();
                char[] cArr = N;
                int i2 = Mw.yq;
                if (!(charSequence2 == null || cArr == null)) {
                    int length = charSequence2.length();
                    int i3 = length - 1;
                    int length2 = cArr.length;
                    int i4 = length2 - 1;
                    loop0: for (int i5 = 0; i5 < length; i5++) {
                        char charAt = charSequence2.charAt(i5);
                        for (int i6 = 0; i6 < length2; i6++) {
                            if (cArr[i6] == charAt && (!Character.isHighSurrogate(charAt) || i6 == i4 || (i5 < i3 && cArr[i6 + 1] == charSequence2.charAt(i5 + 1)))) {
                                z = false;
                                break loop0;
                            }
                        }
                    }
                }
                z = true;
                if (z) {
                    writer.write(charSequence.toString());
                } else {
                    writer.write(34);
                    String charSequence3 = charSequence.toString();
                    String str = SN;
                    writer.write(Mw.Gc(charSequence3, str, str + str));
                    writer.write(34);
                }
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
    }

    static {
        iQ iQVar = new iQ(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        iY[] iYVarArr = {new iQ(UH.M())};
        iY[] iYVarArr2 = new iY[2];
        iYVarArr2[0] = iQVar;
        System.arraycopy(iYVarArr, 0, iYVarArr2, 1, 1);
        C0061Fo fo = new C0061Fo(iYVarArr2);
        iY[] iYVarArr3 = {new Pk()};
        iY[] iYVarArr4 = new iY[2];
        iYVarArr4[0] = fo;
        System.arraycopy(iYVarArr3, 0, iYVarArr4, 1, 1);
        new C0061Fo(iYVarArr4);
        new C0061Fo(new iQ(new String[]{"'", "\\'"}, new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new iQ(UH.M()), new Pk());
        new C0061Fo(new iQ(UH.N()), new iQ(UH.yq()));
        new C0061Fo(new iQ(UH.N()), new iQ(UH.yq()), new iQ(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), eV.N(127, 132), eV.N(134, 159), new lC());
        new C0061Fo(new iQ(UH.N()), new iQ(UH.yq()), new iQ(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), eV.N(1, 8), eV.N(14, 31), eV.N(127, 132), eV.N(134, 159), new lC());
        new C0061Fo(new iQ(UH.N()), new iQ(UH.t0()));
        new C0061Fo(new iQ(UH.N()), new iQ(UH.t0()), new iQ(UH.zH()));
        new C0061Fo(new iQ(UH.tF()), new iQ(UH.Gc()), new ZQ(new ZQ.yq[0]));
        new C0061Fo(new iQ(UH.tF()), new iQ(UH.Gc()), new iQ(UH.i()), new ZQ(new ZQ.yq[0]));
        new C0061Fo(new iQ(UH.tF()), new iQ(UH.SN()), new ZQ(new ZQ.yq[0]));
    }

    public static final String yq(String str) {
        C0061Fo fo = yq;
        Objects.requireNonNull(fo);
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int i = 0;
            while (i < length) {
                int yq2 = fo.yq(str, i, stringWriter);
                if (yq2 == 0) {
                    char charAt = str.charAt(i);
                    stringWriter.write(charAt);
                    i++;
                    if (Character.isHighSurrogate(charAt) && i < length) {
                        char charAt2 = str.charAt(i);
                        if (Character.isLowSurrogate(charAt2)) {
                            stringWriter.write(charAt2);
                            i++;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < yq2; i2++) {
                        i += Character.charCount(Character.codePointAt(str, i));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
