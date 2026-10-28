package com.github.catvod.spider.merge;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.github.catvod.spider.merge.tW  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0183tW implements Serializable {
    private final Locale N;
    private final TimeZone SN;
    private transient List<B> i;
    private final int tF;
    private final String yq;
    private final int zH;
    static final Locale t0 = new Locale("ja", "JP", "JP");
    private static final Comparator<String> Gc = yP.yq();
    private static final ConcurrentMap<Locale, q>[] M = new ConcurrentMap[17];
    private static final yq KJ = new yq();
    private static final SN q = new SN();
    private static final M B = new M(1);
    private static final M G = new M(3);
    private static final M G4 = new M(4);
    private static final M dT = new M(6);
    private static final M F5 = new M(5);
    private static final N v3 = new N();
    private static final M W = new M(8);
    private static final M v = new M(11);
    private static final tF ee = new tF();
    private static final zH g9 = new zH();
    private static final M xa = new M(10);
    private static final M Gd = new M(12);
    private static final M Nl = new M(13);
    private static final M OW = new M(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.tW$B */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class B {
        final int SN;
        final q yq;

        B(q qVar, int i) {
            this.yq = qVar;
            this.SN = i;
        }

        public final String toString() {
            StringBuilder yq = by.yq("StrategyAndWidth [strategy=");
            yq.append(this.yq);
            yq.append(", width=");
            yq.append(this.SN);
            yq.append("]");
            return yq.toString();
        }
    }

    /* renamed from: com.github.catvod.spider.merge.tW$G */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private class G {
        private int SN;
        private final Calendar yq;

        G(Calendar calendar) {
            this.yq = calendar;
        }

        final B yq() {
            if (this.SN >= C0183tW.this.yq.length()) {
                return null;
            }
            char charAt = C0183tW.this.yq.charAt(this.SN);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i = this.SN;
                do {
                    int i2 = this.SN + 1;
                    this.SN = i2;
                    if (i2 >= C0183tW.this.yq.length()) {
                        break;
                    }
                } while (C0183tW.this.yq.charAt(this.SN) == charAt);
                int i3 = this.SN - i;
                return new B(C0183tW.SN(C0183tW.this, charAt, i3, this.yq), i3);
            }
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (this.SN < C0183tW.this.yq.length()) {
                char charAt2 = C0183tW.this.yq.charAt(this.SN);
                if (!z) {
                    if ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z')) {
                        break;
                    }
                }
                if (charAt2 == '\'') {
                    int i4 = this.SN + 1;
                    this.SN = i4;
                    if (i4 == C0183tW.this.yq.length() || C0183tW.this.yq.charAt(this.SN) != '\'') {
                        z = !z;
                    }
                }
                this.SN++;
                sb.append(charAt2);
            }
            if (!z) {
                String sb2 = sb.toString();
                return new B(new t0(sb2), sb2.length());
            }
            throw new IllegalArgumentException("Unterminated quote");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.tW$G4 */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class G4 extends KJ {
        private final Map<String, yq> N = new HashMap();
        private final Locale SN;

        /* renamed from: com.github.catvod.spider.merge.tW$G4$yq */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        private static class yq {
            final int SN;
            final TimeZone yq;

            yq(TimeZone timeZone, boolean z) {
                this.yq = timeZone;
                this.SN = z ? timeZone.getDSTSavings() : 0;
            }
        }

        /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.tW$G4$yq>, java.util.HashMap] */
        G4(Locale locale) {
            String[][] zoneStrings;
            this.SN = B7.yq(locale);
            StringBuilder yq2 = by.yq("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet treeSet = new TreeSet(C0183tW.Gc);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    yq yqVar = new yq(timeZone, false);
                    yq yqVar2 = yqVar;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            yqVar2 = new yq(timeZone, true);
                        } else if (i == 5) {
                            yqVar2 = yqVar;
                        }
                        if (strArr[i] != null) {
                            String lowerCase = strArr[i].toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.N.put(lowerCase, yqVar2);
                            }
                        }
                    }
                }
            }
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                yq2.append('|');
                C0183tW.KJ(yq2, (String) it.next());
            }
            yq2.append(")");
            this.yq = Pattern.compile(yq2.toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.tW$G4$yq>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.tW$G4$yq>, java.util.HashMap] */
        @Override // com.github.catvod.spider.merge.C0183tW.KJ
        final void N(Calendar calendar, String str) {
            TimeZone yq2 = I2.yq(str);
            if (yq2 != null) {
                calendar.setTimeZone(yq2);
                return;
            }
            String lowerCase = str.toLowerCase(this.SN);
            yq yqVar = (yq) this.N.get(lowerCase);
            if (yqVar == null) {
                ?? r0 = this.N;
                yqVar = (yq) r0.get(lowerCase + '.');
            }
            calendar.set(16, yqVar.SN);
            calendar.set(15, yqVar.yq.getRawOffset());
        }

        @Override // com.github.catvod.spider.merge.C0183tW.KJ
        public final String toString() {
            StringBuilder yq2 = by.yq("TimeZoneStrategy [locale=");
            yq2.append(this.SN);
            yq2.append(", tzNames=");
            yq2.append(this.N);
            yq2.append(", pattern=");
            yq2.append(this.yq);
            yq2.append("]");
            return yq2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.tW$Gc */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class Gc extends KJ {
        private static final Gc SN = new Gc("(Z|(?:[+-]\\d{2}))");
        private static final Gc N = new Gc("(Z|(?:[+-]\\d{2}\\d{2}))");
        private static final Gc tF = new Gc("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        Gc(String str) {
            this.yq = Pattern.compile(str);
        }

        static q zH(int i) {
            if (i == 1) {
                return SN;
            }
            if (i == 2) {
                return N;
            }
            if (i == 3) {
                return tF;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // com.github.catvod.spider.merge.C0183tW.KJ
        final void N(Calendar calendar, String str) {
            calendar.setTimeZone(I2.yq(str));
        }
    }

    /* renamed from: com.github.catvod.spider.merge.tW$KJ */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static abstract class KJ extends q {
        Pattern yq;

        KJ() {
            super(null);
        }

        abstract void N(Calendar calendar, String str);

        @Override // com.github.catvod.spider.merge.C0183tW.q
        final boolean SN(C0183tW tWVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            Matcher matcher = this.yq.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
            N(calendar, matcher.group(1));
            return true;
        }

        public String toString() {
            return getClass().getSimpleName() + " [pattern=" + this.yq + "]";
        }

        @Override // com.github.catvod.spider.merge.C0183tW.q
        final boolean yq() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.tW$M */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class M extends q {
        private final int yq;

        M(int i) {
            super(null);
            this.yq = i;
        }

        int N(C0183tW tWVar, int i) {
            return i;
        }

        @Override // com.github.catvod.spider.merge.C0183tW.q
        final boolean SN(C0183tW tWVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i2 = i + index;
                if (length > i2) {
                    length = i2;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.yq, N(tWVar, parseInt));
            return true;
        }

        public final String toString() {
            StringBuilder yq = by.yq("NumberStrategy [field=");
            yq.append(this.yq);
            yq.append("]");
            return yq.toString();
        }

        @Override // com.github.catvod.spider.merge.C0183tW.q
        final boolean yq() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.tW$N */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class N extends M {
        N() {
            super(7);
        }

        @Override // com.github.catvod.spider.merge.C0183tW.M
        final int N(C0183tW tWVar, int i) {
            if (i == 7) {
                return 1;
            }
            return 1 + i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.tW$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN extends M {
        SN() {
            super(2);
        }

        @Override // com.github.catvod.spider.merge.C0183tW.M
        final int N(C0183tW tWVar, int i) {
            return i - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.tW$i */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class i extends KJ {
        final Locale N;
        private final int SN;
        private final Map<String, Integer> tF;

        i(int i, Calendar calendar, Locale locale) {
            this.SN = i;
            this.N = B7.yq(locale);
            StringBuilder yq = by.yq("((?iu)");
            this.tF = (HashMap) C0183tW.N(calendar, locale, i, yq);
            yq.setLength(yq.length() - 1);
            yq.append(")");
            this.yq = Pattern.compile(yq.toString());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        @Override // com.github.catvod.spider.merge.C0183tW.KJ
        final void N(Calendar calendar, String str) {
            String lowerCase = str.toLowerCase(this.N);
            Integer num = (Integer) this.tF.get(lowerCase);
            if (num == null) {
                ?? r0 = this.tF;
                num = (Integer) r0.get(lowerCase + '.');
            }
            calendar.set(this.SN, num.intValue());
        }

        @Override // com.github.catvod.spider.merge.C0183tW.KJ
        public final String toString() {
            StringBuilder yq = by.yq("CaseInsensitiveTextStrategy [field=");
            yq.append(this.SN);
            yq.append(", locale=");
            yq.append(this.N);
            yq.append(", lKeyValues=");
            yq.append(this.tF);
            yq.append(", pattern=");
            yq.append(this.yq);
            yq.append("]");
            return yq.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.tW$q */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class q {
        private q() {
        }

        /* synthetic */ q(yq yqVar) {
            this();
        }

        abstract boolean SN(C0183tW tWVar, Calendar calendar, String str, ParsePosition parsePosition, int i);

        boolean yq() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.tW$t0 */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class t0 extends q {
        private final String yq;

        t0(String str) {
            super(null);
            this.yq = str;
        }

        @Override // com.github.catvod.spider.merge.C0183tW.q
        final boolean SN(C0183tW tWVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            for (int i2 = 0; i2 < this.yq.length(); i2++) {
                int index = parsePosition.getIndex() + i2;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                } else if (this.yq.charAt(i2) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(parsePosition.getIndex() + this.yq.length());
            return true;
        }

        public final String toString() {
            return A7.N(by.yq("CopyQuotedStrategy [formatField="), this.yq, "]");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.tW$tF */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class tF extends M {
        tF() {
            super(11);
        }

        @Override // com.github.catvod.spider.merge.C0183tW.M
        final int N(C0183tW tWVar, int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.tW$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq extends M {
        yq() {
            super(1);
        }

        @Override // com.github.catvod.spider.merge.C0183tW.M
        final int N(C0183tW tWVar, int i) {
            return i < 100 ? C0183tW.tF(tWVar, i) : i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.tW$zH */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class zH extends M {
        zH() {
            super(10);
        }

        @Override // com.github.catvod.spider.merge.C0183tW.M
        final int N(C0183tW tWVar, int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List<com.github.catvod.spider.merge.tW$B>, java.util.ArrayList] */
    public C0183tW(String str, TimeZone timeZone, Locale locale) {
        int i2;
        this.yq = str;
        this.SN = timeZone;
        Locale yq2 = B7.yq(locale);
        this.N = yq2;
        Calendar calendar = Calendar.getInstance(timeZone, yq2);
        if (yq2.equals(t0)) {
            i2 = 0;
        } else {
            calendar.setTime(new Date());
            i2 = calendar.get(1) - 80;
        }
        int i3 = (i2 / 100) * 100;
        this.tF = i3;
        this.zH = i2 - i3;
        this.i = new ArrayList();
        G g = new G(calendar);
        while (true) {
            B yq3 = g.yq();
            if (yq3 != null) {
                this.i.add(yq3);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StringBuilder KJ(StringBuilder sb, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (!(charAt == '$' || charAt == '.' || charAt == '?' || charAt == '^' || charAt == '[' || charAt == '\\' || charAt == '{' || charAt == '|')) {
                switch (charAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        break;
                    default:
                        sb.append(charAt);
                }
            }
            sb.append('\\');
            sb.append(charAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
        return sb;
    }

    static Map N(Calendar calendar, Locale locale, int i2, StringBuilder sb) {
        HashMap hashMap = new HashMap();
        Locale yq2 = B7.yq(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i2, 0, yq2);
        TreeSet treeSet = new TreeSet(Gc);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(yq2);
            if (treeSet.add(lowerCase)) {
                hashMap.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            KJ(sb, (String) it.next());
            sb.append('|');
        }
        return hashMap;
    }

    static q SN(C0183tW tWVar, char c, int i2, Calendar calendar) {
        int i3;
        Objects.requireNonNull(tWVar);
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case 'D':
                        return dT;
                    case 'E':
                        i3 = 7;
                        break;
                    case 'F':
                        return W;
                    case 'G':
                        i3 = 0;
                        break;
                    case 'H':
                        return v;
                    default:
                        switch (c) {
                            case 'K':
                                return xa;
                            case 'M':
                                return i2 >= 3 ? tWVar.t0(2, calendar) : q;
                            case 'S':
                                return OW;
                            case 'a':
                                i3 = 9;
                                break;
                            case 'd':
                                return F5;
                            case 'h':
                                return g9;
                            case 'k':
                                return ee;
                            case 'm':
                                return Gd;
                            case 's':
                                return Nl;
                            case 'u':
                                return v3;
                            case 'w':
                                return G;
                            default:
                                switch (c) {
                                    case 'W':
                                        return G4;
                                    case 'X':
                                        return Gc.zH(i2);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i2 == 2) {
                                            return Gc.tF;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c + "' not supported");
                                }
                        }
                }
                return tWVar.t0(i3, calendar);
            }
            i3 = 15;
            return tWVar.t0(i3, calendar);
        }
        return i2 > 2 ? B : KJ;
    }

    private q t0(int i2, Calendar calendar) {
        ConcurrentMap<Locale, q> concurrentMap;
        ConcurrentMap<Locale, q>[] concurrentMapArr = M;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i2] == null) {
                concurrentMapArr[i2] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i2];
        }
        q qVar = concurrentMap.get(this.N);
        if (qVar == null) {
            qVar = i2 == 15 ? new G4(this.N) : new i(i2, calendar, this.N);
            q putIfAbsent = concurrentMap.putIfAbsent(this.N, qVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return qVar;
    }

    static int tF(C0183tW tWVar, int i2) {
        int i3 = tWVar.tF + i2;
        return i2 >= tWVar.zH ? i3 : i3 + 100;
    }

    public final Date Gc(String str) {
        ParsePosition parsePosition = new ParsePosition(0);
        Date M2 = M(str, parsePosition);
        if (M2 != null) {
            return M2;
        }
        if (this.N.equals(t0)) {
            StringBuilder yq2 = by.yq("(The ");
            yq2.append(this.N);
            yq2.append(" locale does not support dates before 1868 AD)\nUnparseable date: \"");
            yq2.append(str);
            throw new ParseException(yq2.toString(), parsePosition.getErrorIndex());
        }
        throw new ParseException(oX.yq("Unparseable date: ", str), parsePosition.getErrorIndex());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[EDGE_INSN: B:20:0x0051->B:16:0x0051 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.tW$B>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date M(java.lang.String r10, java.text.ParsePosition r11) {
        /*
            r9 = this;
            java.util.TimeZone r0 = r9.SN
            java.util.Locale r1 = r9.N
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0, r1)
            r0.clear()
            java.util.List<com.github.catvod.spider.merge.tW$B> r1 = r9.i
            java.util.ListIterator r1 = r1.listIterator()
        L11:
            boolean r2 = r1.hasNext()
            r8 = 0
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            com.github.catvod.spider.merge.tW$B r2 = (com.github.catvod.spider.merge.C0183tW.B) r2
            com.github.catvod.spider.merge.tW$q r3 = r2.yq
            boolean r3 = r3.yq()
            if (r3 == 0) goto L42
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L2d
            goto L42
        L2d:
            java.lang.Object r3 = r1.next()
            com.github.catvod.spider.merge.tW$B r3 = (com.github.catvod.spider.merge.C0183tW.B) r3
            com.github.catvod.spider.merge.tW$q r3 = r3.yq
            r1.previous()
            boolean r3 = r3.yq()
            if (r3 == 0) goto L42
            int r3 = r2.SN
            r7 = r3
            goto L43
        L42:
            r7 = 0
        L43:
            com.github.catvod.spider.merge.tW$q r2 = r2.yq
            r3 = r9
            r4 = r0
            r5 = r10
            r6 = r11
            boolean r2 = r2.SN(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L11
            goto L51
        L50:
            r8 = 1
        L51:
            if (r8 == 0) goto L58
            java.util.Date r10 = r0.getTime()
            goto L59
        L58:
            r10 = 0
        L59:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0183tW.M(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0183tW)) {
            return false;
        }
        C0183tW tWVar = (C0183tW) obj;
        return this.yq.equals(tWVar.yq) && this.SN.equals(tWVar.SN) && this.N.equals(tWVar.N);
    }

    public final int hashCode() {
        return (((this.N.hashCode() * 13) + this.SN.hashCode()) * 13) + this.yq.hashCode();
    }

    public final String toString() {
        StringBuilder yq2 = by.yq("FastDateParser[");
        yq2.append(this.yq);
        yq2.append(", ");
        yq2.append(this.N);
        yq2.append(", ");
        yq2.append(this.SN.getID());
        yq2.append("]");
        return yq2.toString();
    }
}
