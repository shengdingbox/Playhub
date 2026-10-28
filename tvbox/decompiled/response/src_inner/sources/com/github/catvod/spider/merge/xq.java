package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0097ev;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.WU;
import com.github.catvod.spider.merge.Y4;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class xq {
    private final List<Y4> N = new ArrayList();
    private final String SN;
    private final QL yq;
    private static final String[] tF = {",", ">", "+", "~", " "};
    private static final String[] zH = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern i = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern t0 = Pattern.compile("([+-])?(\\d+)");

    private xq(String str) {
        li.KJ(str);
        String trim = str.trim();
        this.SN = trim;
        this.yq = new QL(trim);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    private void Gc(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        this.yq.tF(str);
        String yq = this.yq.yq('(', ')');
        li.q(yq, str + "(regex) query must not be empty");
        this.N.add(z ? new Y4.E1(Pattern.compile(yq)) : new Y4.tO(Pattern.compile(yq)));
    }

    public static Y4 KJ(String str) {
        try {
            return new xq(str).M();
        } catch (IllegalArgumentException e) {
            throw new PA.yq(e.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    private void N(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        this.yq.tF(str);
        String dT = QL.dT(this.yq.yq('(', ')'));
        li.q(dT, str + "(text) query must not be empty");
        this.N.add(z ? new Y4.G(dT) : new Y4.G4(dT));
    }

    private int SN() {
        String trim = this.yq.SN().trim();
        int i2 = P1.i;
        boolean z = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                } else if (!Character.isDigit(trim.codePointAt(i3))) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        li.t0(z, "Index must be numeric");
        return Integer.parseInt(trim);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    private void i() {
        Object obj;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        Object obj3;
        ArrayList arrayList3;
        if (this.yq.KJ("#")) {
            String zH2 = this.yq.zH();
            li.KJ(zH2);
            this.N.add(new Y4.W(zH2));
        } else if (this.yq.KJ(".")) {
            String zH3 = this.yq.zH();
            li.KJ(zH3);
            this.N.add(new Y4.q(zH3.trim()));
        } else if (this.yq.G() || this.yq.q("*|")) {
            String i2 = eb.i(this.yq.i());
            li.KJ(i2);
            if (i2.startsWith("*|")) {
                this.N.add(new WU.SN(new Y4.C0077m(i2.substring(2)), new Y4.k(i2.replace("*|", ":"))));
                return;
            }
            if (i2.contains("|")) {
                i2 = i2.replace("|", ":");
            }
            this.N.add(new Y4.C0077m(i2));
        } else if (this.yq.q("[")) {
            QL ql = new QL(this.yq.yq('[', ']'));
            String t02 = ql.t0(zH);
            li.KJ(t02);
            ql.Gc();
            if (ql.M()) {
                if (t02.startsWith("^")) {
                    ?? r0 = this.N;
                    obj3 = new Y4.tF(t02.substring(1));
                    arrayList3 = r0;
                } else {
                    ?? r02 = this.N;
                    obj3 = new Y4.SN(t02);
                    arrayList3 = r02;
                }
                arrayList3.add(obj3);
                return;
            }
            if (ql.KJ("=")) {
                ?? r2 = this.N;
                obj2 = new Y4.zH(t02, ql.G4());
                arrayList2 = r2;
            } else if (ql.KJ("!=")) {
                ?? r22 = this.N;
                obj2 = new Y4.M(t02, ql.G4());
                arrayList2 = r22;
            } else if (ql.KJ("^=")) {
                ?? r23 = this.N;
                obj2 = new Y4.KJ(t02, ql.G4());
                arrayList2 = r23;
            } else if (ql.KJ("$=")) {
                ?? r24 = this.N;
                obj2 = new Y4.t0(t02, ql.G4());
                arrayList2 = r24;
            } else if (ql.KJ("*=")) {
                ?? r25 = this.N;
                obj2 = new Y4.i(t02, ql.G4());
                arrayList2 = r25;
            } else if (ql.KJ("~=")) {
                ?? r26 = this.N;
                obj2 = new Y4.Gc(t02, Pattern.compile(ql.G4()));
                arrayList2 = r26;
            } else {
                throw new PA.yq("Could not parse attribute query '%s': unexpected token at '%s'", this.SN, ql.G4());
            }
            arrayList2.add(obj2);
        } else if (this.yq.KJ("*")) {
            this.N.add(new Y4.yq());
        } else if (this.yq.KJ(":lt(")) {
            this.N.add(new Y4.xa(SN()));
        } else if (this.yq.KJ(":gt(")) {
            this.N.add(new Y4.g9(SN()));
        } else if (this.yq.KJ(":eq(")) {
            this.N.add(new Y4.v(SN()));
        } else if (this.yq.q(":has(")) {
            this.yq.tF(":has");
            String yq = this.yq.yq('(', ')');
            li.q(yq, ":has(selector) sub-select must not be empty");
            this.N.add(new AbstractC0097ev.yq(KJ(yq)));
        } else if (this.yq.q(":contains(")) {
            N(false);
        } else if (this.yq.q(":containsOwn(")) {
            N(true);
        } else if (this.yq.q(":containsWholeText(")) {
            tF(false);
        } else if (this.yq.q(":containsWholeOwnText(")) {
            tF(true);
        } else if (this.yq.q(":containsData(")) {
            this.yq.tF(":containsData");
            String dT = QL.dT(this.yq.yq('(', ')'));
            li.q(dT, ":containsData(text) query must not be empty");
            this.N.add(new Y4.B(dT));
        } else if (this.yq.q(":matches(")) {
            t0(false);
        } else if (this.yq.q(":matchesOwn(")) {
            t0(true);
        } else if (this.yq.q(":matchesWholeText(")) {
            Gc(false);
        } else if (this.yq.q(":matchesWholeOwnText(")) {
            Gc(true);
        } else if (this.yq.q(":not(")) {
            this.yq.tF(":not");
            String yq2 = this.yq.yq('(', ')');
            li.q(yq2, ":not(selector) subselect must not be empty");
            this.N.add(new AbstractC0097ev.tF(KJ(yq2)));
        } else if (this.yq.KJ(":nth-child(")) {
            zH(false, false);
        } else if (this.yq.KJ(":nth-last-child(")) {
            zH(true, false);
        } else if (this.yq.KJ(":nth-of-type(")) {
            zH(false, true);
        } else if (this.yq.KJ(":nth-last-of-type(")) {
            zH(true, true);
        } else {
            if (this.yq.KJ(":first-child")) {
                ?? r03 = this.N;
                obj = new Y4.Nl();
                arrayList = r03;
            } else if (this.yq.KJ(":last-child")) {
                ?? r04 = this.N;
                obj = new Y4.O();
                arrayList = r04;
            } else if (this.yq.KJ(":first-of-type")) {
                ?? r05 = this.N;
                obj = new Y4.OW();
                arrayList = r05;
            } else if (this.yq.KJ(":last-of-type")) {
                ?? r06 = this.N;
                obj = new Y4.g1();
                arrayList = r06;
            } else if (this.yq.KJ(":only-child")) {
                ?? r07 = this.N;
                obj = new Y4.Zm();
                arrayList = r07;
            } else if (this.yq.KJ(":only-of-type")) {
                ?? r08 = this.N;
                obj = new Y4.Dr();
                arrayList = r08;
            } else if (this.yq.KJ(":empty")) {
                ?? r09 = this.N;
                obj = new Y4.Gd();
                arrayList = r09;
            } else if (this.yq.KJ(":root")) {
                ?? r010 = this.N;
                obj = new Y4.C0076g();
                arrayList = r010;
            } else if (this.yq.KJ(":matchText")) {
                ?? r011 = this.N;
                obj = new Y4.H();
                arrayList = r011;
            } else {
                throw new PA.yq("Could not parse query '%s': unexpected token at '%s'", this.SN, this.yq.G4());
            }
            arrayList.add(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    private void t0(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        this.yq.tF(str);
        String yq = this.yq.yq('(', ')');
        li.q(yq, str + "(regex) query must not be empty");
        this.N.add(z ? new Y4.Fz(Pattern.compile(yq)) : new Y4.U(Pattern.compile(yq)));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    private void tF(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        this.yq.tF(str);
        String dT = QL.dT(this.yq.yq('(', ')'));
        li.q(dT, str + "(text) query must not be empty");
        this.N.add(z ? new Y4.dT(dT) : new Y4.F5(dT));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void yq(char r10) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.xq.yq(char):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List<com.github.catvod.spider.merge.Y4>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void zH(boolean r9, boolean r10) {
        /*
            r8 = this;
            com.github.catvod.spider.merge.QL r0 = r8.yq
            java.lang.String r0 = r0.SN()
            java.lang.String r0 = com.github.catvod.spider.merge.eb.i(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.xq.i
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.xq.t0
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "odd"
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L24
            r0 = 1
        L22:
            r4 = 2
            goto L74
        L24:
            java.lang.String r3 = "even"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2e
            r0 = 0
            goto L22
        L2e:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "^\\+"
            if (r3 == 0) goto L62
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r1.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r5 = java.lang.Integer.parseInt(r0)
        L4b:
            r0 = 4
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L5f
            java.lang.String r0 = r1.group(r0)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4 = r0
        L5f:
            r0 = r4
            r4 = r5
            goto L74
        L62:
            boolean r1 = r2.matches()
            if (r1 == 0) goto L9d
            java.lang.String r0 = r2.group()
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
        L74:
            if (r10 == 0) goto L88
            if (r9 == 0) goto L80
            java.util.List<com.github.catvod.spider.merge.Y4> r9 = r8.N
            com.github.catvod.spider.merge.Y4$un r10 = new com.github.catvod.spider.merge.Y4$un
            r10.<init>(r4, r0)
            goto L99
        L80:
            java.util.List<com.github.catvod.spider.merge.Y4> r9 = r8.N
            com.github.catvod.spider.merge.Y4$b r10 = new com.github.catvod.spider.merge.Y4$b
            r10.<init>(r4, r0)
            goto L99
        L88:
            if (r9 == 0) goto L92
            java.util.List<com.github.catvod.spider.merge.Y4> r9 = r8.N
            com.github.catvod.spider.merge.Y4$n r10 = new com.github.catvod.spider.merge.Y4$n
            r10.<init>(r4, r0)
            goto L99
        L92:
            java.util.List<com.github.catvod.spider.merge.Y4> r9 = r8.N
            com.github.catvod.spider.merge.Y4$s r10 = new com.github.catvod.spider.merge.Y4$s
            r10.<init>(r4, r0)
        L99:
            r9.add(r10)
            return
        L9d:
            com.github.catvod.spider.merge.PA$yq r9 = new com.github.catvod.spider.merge.PA$yq
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "Could not parse nth-index '%s': unexpected format"
            r9.<init>(r0, r10)
            goto Laa
        La9:
            throw r9
        Laa:
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.xq.zH(boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<com.github.catvod.spider.merge.Y4>, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:11:0x0037). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0042). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x001c -> B:7:0x001f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.github.catvod.spider.merge.Y4 M() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.QL r0 = r4.yq
            r0.Gc()
            com.github.catvod.spider.merge.QL r0 = r4.yq
            java.lang.String[] r1 = com.github.catvod.spider.merge.xq.tF
            boolean r0 = r0.B(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.Y4> r0 = r4.N
            com.github.catvod.spider.merge.ev$t0 r1 = new com.github.catvod.spider.merge.ev$t0
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.i()
        L1f:
            com.github.catvod.spider.merge.QL r1 = r0.yq
            boolean r1 = r1.M()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.QL r1 = r0.yq
            boolean r1 = r1.Gc()
            com.github.catvod.spider.merge.QL r2 = r0.yq
            java.lang.String[] r3 = com.github.catvod.spider.merge.xq.tF
            boolean r2 = r2.B(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.QL r1 = r0.yq
            char r1 = r1.N()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.yq(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.Y4> r1 = r0.N
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.Y4> r0 = r0.N
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.Y4 r0 = (com.github.catvod.spider.merge.Y4) r0
            return r0
        L59:
            com.github.catvod.spider.merge.WU$yq r1 = new com.github.catvod.spider.merge.WU$yq
            java.util.List<com.github.catvod.spider.merge.Y4> r0 = r0.N
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.xq.M():com.github.catvod.spider.merge.Y4");
    }

    public final String toString() {
        return this.SN;
    }
}
