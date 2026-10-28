package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Va;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class B5 implements Map.Entry<String, String>, Cloneable {
    fx N;
    private String SN;
    private String yq;
    private static final String[] tF = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private static final Pattern zH = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
    private static final Pattern i = Pattern.compile("[^-a-zA-Z0-9_:.]");
    private static final Pattern t0 = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    private static final Pattern Gc = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    public B5(String str, String str2, fx fxVar) {
        li.B(str);
        String trim = str.trim();
        li.KJ(trim);
        this.yq = trim;
        this.SN = str2;
        this.N = fxVar;
    }

    public static String SN(String str, int i2) {
        if (i2 == 2) {
            Pattern pattern = zH;
            if (!pattern.matcher(str).matches()) {
                String replaceAll = i.matcher(str).replaceAll("");
                if (pattern.matcher(replaceAll).matches()) {
                    return replaceAll;
                }
                return null;
            }
        }
        if (i2 == 1) {
            Pattern pattern2 = t0;
            if (!pattern2.matcher(str).matches()) {
                String replaceAll2 = Gc.matcher(str).replaceAll("");
                if (pattern2.matcher(replaceAll2).matches()) {
                    return replaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ((java.util.Arrays.binarySearch(com.github.catvod.spider.merge.B5.tF, com.github.catvod.spider.merge.eb.zH(r7)) >= 0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void tF(java.lang.String r7, java.lang.String r8, java.lang.Appendable r9, com.github.catvod.spider.merge.Va.yq r10) {
        /*
            r9.append(r7)
            int r0 = r10.Gc()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L2b
            if (r8 == 0) goto L2a
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L19
            boolean r0 = r8.equalsIgnoreCase(r7)
            if (r0 == 0) goto L2b
        L19:
            java.lang.String[] r0 = com.github.catvod.spider.merge.B5.tF
            java.lang.String r7 = com.github.catvod.spider.merge.eb.zH(r7)
            int r7 = java.util.Arrays.binarySearch(r0, r7)
            if (r7 < 0) goto L27
            r7 = 1
            goto L28
        L27:
            r7 = 0
        L28:
            if (r7 == 0) goto L2b
        L2a:
            r1 = 1
        L2b:
            if (r1 != 0) goto L44
            java.lang.String r7 = "=\""
            r9.append(r7)
            java.lang.String r1 = com.github.catvod.spider.merge.fx.M(r8)
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r2 = r10
            com.github.catvod.spider.merge.C0123il.tF(r0, r1, r2, r3, r4, r5, r6)
            r7 = 34
            r9.append(r7)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.B5.tF(java.lang.String, java.lang.String, java.lang.Appendable, com.github.catvod.spider.merge.Va$yq):void");
    }

    /* renamed from: N */
    public final String getValue() {
        return fx.M(this.SN);
    }

    public final Object clone() {
        try {
            return (B5) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B5.class != obj.getClass()) {
            return false;
        }
        B5 b5 = (B5) obj;
        String str = this.yq;
        if (str == null ? b5.yq != null : !str.equals(b5.yq)) {
            return false;
        }
        String str2 = this.SN;
        String str3 = b5.SN;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.yq;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.yq;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.SN;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        int v3;
        String str2 = str;
        String str3 = this.SN;
        fx fxVar = this.N;
        if (!(fxVar == null || (v3 = fxVar.v3(this.yq)) == -1)) {
            str3 = this.N.B(this.yq);
            this.N.N[v3] = str2;
        }
        this.SN = str2;
        return fx.M(str3);
    }

    public final String toString() {
        StringBuilder SN = P1.SN();
        try {
            Va.yq D = new Va("").D();
            String str = this.yq;
            String str2 = this.SN;
            String SN2 = SN(str, D.Gc());
            if (SN2 != null) {
                tF(SN2, str2, SN, D);
            }
            return P1.Gc(SN);
        } catch (IOException e) {
            throw new sI(e);
        }
    }

    public final String yq() {
        return this.yq;
    }
}
