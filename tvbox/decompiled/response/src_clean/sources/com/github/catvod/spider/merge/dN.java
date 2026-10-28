package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class dN implements Serializable {
    private static final i[] i = new i[0];
    private static final ConcurrentMap<M, String> t0 = new ConcurrentHashMap(7);
    private final Locale N;
    private final TimeZone SN;
    private transient i[] tF;
    private final String yq;
    private transient int zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class B implements tF {
        private final tF yq;

        B(tF tFVar) {
            this.yq = tFVar;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return this.yq.N();
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            int i = calendar.get(10);
            if (i == 0) {
                i = calendar.getLeastMaximum(10) + 1;
            }
            this.yq.yq(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            this.yq.yq(appendable, i);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class F5 implements tF {
        static final F5 yq = new F5();

        F5() {
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return 2;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            yq(appendable, calendar.get(1) % 100);
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            dN.yq(appendable, i % 100);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class G implements tF {
        private final tF yq;

        G(tF tFVar) {
            this.yq = tFVar;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return this.yq.N();
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            int i = calendar.get(11);
            if (i == 0) {
                i = calendar.getMaximum(11) + 1;
            }
            this.yq.yq(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            this.yq.yq(appendable, i);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class G4 implements tF {
        static final G4 yq = new G4();

        G4() {
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return 2;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            dN.yq(appendable, calendar.get(2) + 1);
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            dN.yq(appendable, i);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class Gc implements i {
        private final String[] SN;
        private final int yq;

        Gc(int i, String[] strArr) {
            this.yq = i;
            this.SN = strArr;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            int length = this.SN.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.SN[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append((CharSequence) this.SN[calendar.get(this.yq)]);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class KJ implements i {
        private final String N;
        private final int SN;
        private final String tF;
        private final Locale yq;

        KJ(TimeZone timeZone, Locale locale, int i) {
            this.yq = B7.yq(locale);
            this.SN = i;
            this.N = dN.Gc(timeZone, false, i, locale);
            this.tF = dN.Gc(timeZone, true, i, locale);
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return Math.max(this.N.length(), this.tF.length());
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append((CharSequence) dN.Gc(calendar.getTimeZone(), calendar.get(16) != 0, this.SN, this.yq));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class M {
        private final Locale N;
        private final int SN;
        private final TimeZone yq;

        M(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.yq = timeZone;
            if (z) {
                this.SN = Integer.MIN_VALUE | i;
            } else {
                this.SN = i;
            }
            this.N = B7.yq(locale);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof M)) {
                return false;
            }
            M m = (M) obj;
            return this.yq.equals(m.yq) && this.SN == m.SN && this.N.equals(m.N);
        }

        public final int hashCode() {
            int hashCode = this.N.hashCode();
            return this.yq.hashCode() + ((hashCode + (this.SN * 31)) * 31);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class N implements i {
        final int yq;
        static final N SN = new N(3);
        static final N N = new N(5);
        static final N tF = new N(6);

        N(int i) {
            this.yq = i;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return this.yq;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            int i = calendar.get(16) + calendar.get(15);
            if (i == 0) {
                ((StringBuilder) appendable).append((CharSequence) "Z");
                return;
            }
            if (i < 0) {
                ((StringBuilder) appendable).append('-');
                i = -i;
            } else {
                ((StringBuilder) appendable).append('+');
            }
            int i2 = i / 3600000;
            dN.yq(appendable, i2);
            int i3 = this.yq;
            if (i3 >= 5) {
                if (i3 == 6) {
                    ((StringBuilder) appendable).append(':');
                }
                dN.yq(appendable, (i / 60000) - (i2 * 60));
            }
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class SN implements tF {
        private final tF yq;

        SN(tF tFVar) {
            this.yq = tFVar;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return this.yq.N();
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            int i = 7;
            int i2 = calendar.get(7);
            tF tFVar = this.yq;
            if (i2 != 1) {
                i = i2 - 1;
            }
            tFVar.yq(appendable, i);
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            this.yq.yq(appendable, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class W implements tF {
        private final int yq;

        W(int i) {
            this.yq = i;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return 4;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            yq(appendable, calendar.get(this.yq));
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            if (i < 10) {
                ((StringBuilder) appendable).append((char) (i + 48));
            } else if (i < 100) {
                dN.yq(appendable, i);
            } else {
                dN.SN(appendable, i, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class dT implements tF {
        private final int yq;

        dT(int i) {
            this.yq = i;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return 2;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            yq(appendable, calendar.get(this.yq));
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            if (i < 100) {
                dN.yq(appendable, i);
            } else {
                dN.SN(appendable, i, 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public interface i {
        int N();

        void SN(Appendable appendable, Calendar calendar);
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class q implements i {
        final boolean yq;
        static final q SN = new q(true);
        static final q N = new q(false);

        q(boolean z) {
            this.yq = z;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return 5;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            int i = calendar.get(16) + calendar.get(15);
            if (i < 0) {
                ((StringBuilder) appendable).append('-');
                i = -i;
            } else {
                ((StringBuilder) appendable).append('+');
            }
            int i2 = i / 3600000;
            dN.yq(appendable, i2);
            if (this.yq) {
                ((StringBuilder) appendable).append(':');
            }
            dN.yq(appendable, (i / 60000) - (i2 * 60));
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class t0 implements i {
        private final String yq;

        t0(String str) {
            this.yq = str;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return this.yq.length();
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append((CharSequence) this.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private interface tF extends i {
        void yq(Appendable appendable, int i);
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class v implements tF {
        private final tF yq;

        v(tF tFVar) {
            this.yq = tFVar;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return this.yq.N();
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            this.yq.yq(appendable, calendar.getWeekYear());
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            this.yq.yq(appendable, i);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class v3 implements tF {
        static final v3 yq = new v3();

        v3() {
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return 2;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            yq(appendable, calendar.get(2) + 1);
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            if (i < 10) {
                ((StringBuilder) appendable).append((char) (i + 48));
                return;
            }
            dN.yq(appendable, i);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class yq implements i {
        private final char yq;

        yq(char c) {
            this.yq = c;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return 1;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append(this.yq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class zH implements tF {
        private final int SN;
        private final int yq;

        zH(int i, int i2) {
            if (i2 >= 3) {
                this.yq = i;
                this.SN = i2;
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final int N() {
            return this.SN;
        }

        @Override // com.github.catvod.spider.merge.dN.i
        public final void SN(Appendable appendable, Calendar calendar) {
            yq(appendable, calendar.get(this.yq));
        }

        @Override // com.github.catvod.spider.merge.dN.tF
        public final void yq(Appendable appendable, int i) {
            dN.SN(appendable, i, this.SN);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0206 A[LOOP:3: B:117:0x0202->B:119:0x0206, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dN(java.lang.String r17, java.util.TimeZone r18, java.util.Locale r19) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.dN.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.dN$M, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    static String Gc(TimeZone timeZone, boolean z, int i2, Locale locale) {
        M m = new M(timeZone, z, i2, locale);
        ?? r1 = t0;
        String str = (String) r1.get(m);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i2, locale);
        String str2 = (String) r1.putIfAbsent(m, displayName);
        return str2 != null ? str2 : displayName;
    }

    private String N(Calendar calendar) {
        StringBuilder sb = new StringBuilder(this.zH);
        try {
            for (i iVar : this.tF) {
                iVar.SN(sb, calendar);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    static void SN(Appendable appendable, int i2, int i3) {
        if (i2 < 10000) {
            int i4 = i2 < 1000 ? i2 < 100 ? i2 < 10 ? 1 : 2 : 3 : 4;
            for (int i5 = i3 - i4; i5 > 0; i5--) {
                ((StringBuilder) appendable).append('0');
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            ((StringBuilder) appendable).append((char) ((i2 / 1000) + 48));
                            i2 %= 1000;
                        } else {
                            return;
                        }
                    }
                    if (i2 >= 100) {
                        ((StringBuilder) appendable).append((char) ((i2 / 100) + 48));
                        i2 %= 100;
                    } else {
                        ((StringBuilder) appendable).append('0');
                    }
                }
                if (i2 >= 10) {
                    ((StringBuilder) appendable).append((char) ((i2 / 10) + 48));
                    i2 %= 10;
                } else {
                    ((StringBuilder) appendable).append('0');
                }
            }
            ((StringBuilder) appendable).append((char) (i2 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i6 = 0;
        while (i2 != 0) {
            i6++;
            cArr[i6] = (char) ((i2 % 10) + 48);
            i2 /= 10;
        }
        while (i6 < i3) {
            ((StringBuilder) appendable).append('0');
            i3--;
        }
        while (true) {
            i6--;
            if (i6 >= 0) {
                ((StringBuilder) appendable).append(cArr[i6]);
            } else {
                return;
            }
        }
    }

    static void yq(Appendable appendable, int i2) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
    }

    protected final tF M(int i2, int i3) {
        return i3 != 1 ? i3 != 2 ? new zH(i2, i3) : new dT(i2) : new W(i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dN)) {
            return false;
        }
        dN dNVar = (dN) obj;
        return this.yq.equals(dNVar.yq) && this.SN.equals(dNVar.SN) && this.N.equals(dNVar.N);
    }

    public final int hashCode() {
        return (((this.N.hashCode() * 13) + this.SN.hashCode()) * 13) + this.yq.hashCode();
    }

    public final String i() {
        return this.yq;
    }

    public final TimeZone t0() {
        return this.SN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String tF(Object obj) {
        if (obj instanceof Date) {
            Calendar calendar = Calendar.getInstance(this.SN, this.N);
            calendar.setTime((Date) obj);
            return N(calendar);
        } else if (obj instanceof Calendar) {
            Calendar calendar2 = (Calendar) obj;
            StringBuilder sb = new StringBuilder(this.zH);
            if (!calendar2.getTimeZone().equals(this.SN)) {
                calendar2 = (Calendar) calendar2.clone();
                calendar2.setTimeZone(this.SN);
            }
            try {
                for (i iVar : this.tF) {
                    iVar.SN(sb, calendar2);
                }
                return sb.toString();
            } catch (IOException e) {
                throw e;
            }
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            Calendar calendar3 = Calendar.getInstance(this.SN, this.N);
            calendar3.setTimeInMillis(longValue);
            return N(calendar3);
        } else {
            StringBuilder yq2 = by.yq("Unknown class: ");
            yq2.append(obj == null ? "<null>" : obj.getClass().getName());
            throw new IllegalArgumentException(yq2.toString());
        }
    }

    public final String toString() {
        StringBuilder yq2 = by.yq("FastDatePrinter[");
        yq2.append(this.yq);
        yq2.append(",");
        yq2.append(this.N);
        yq2.append(",");
        yq2.append(this.SN.getID());
        yq2.append("]");
        return yq2.toString();
    }

    public final Locale zH() {
        return this.N;
    }
}
