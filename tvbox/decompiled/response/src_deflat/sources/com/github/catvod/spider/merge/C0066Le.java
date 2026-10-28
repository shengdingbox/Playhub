package com.github.catvod.spider.merge;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* renamed from: com.github.catvod.spider.merge.Le  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0066Le implements Comparable<C0066Le> {
    private Object yq;
    private boolean SN = false;
    private boolean N = false;

    public C0066Le(Object obj) {
        this.yq = obj;
    }

    public final boolean B() {
        return this.yq instanceof Boolean;
    }

    public final boolean F5() {
        return this.yq instanceof List;
    }

    public final boolean G() {
        return this.yq instanceof Date;
    }

    public final boolean G4() {
        return this.yq instanceof kB;
    }

    public final C0066Le Gc() {
        this.SN = true;
        return this;
    }

    public final C0066Le KJ() {
        this.N = true;
        this.yq = Mw.i(Mw.i(Mw.t0(Mw.t0(String.valueOf(this.yq), "'"), "\""), "'"), "\"");
        return this;
    }

    /* renamed from: M */
    public final int compareTo(C0066Le le) {
        if (equals(le)) {
            return 0;
        }
        if (le == null || le.yq == null) {
            return 1;
        }
        Object obj = this.yq;
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            return t0().compareTo(le.t0());
        }
        if (obj instanceof Number) {
            return N().compareTo(le.N());
        }
        StringBuilder yq = by.yq("Unsupported comparable XValue = ");
        yq.append(toString());
        throw new B1(yq.toString());
    }

    public final Double N() {
        double d;
        Object obj = this.yq;
        if (obj instanceof String) {
            d = new BigDecimal((String) this.yq).doubleValue();
        } else if (obj instanceof Number) {
            d = ((Number) obj).doubleValue();
        } else {
            StringBuilder yq = by.yq("cast to number fail. vale = ");
            yq.append(this.yq);
            throw new B1(yq.toString());
        }
        return Double.valueOf(d);
    }

    public final Date SN() {
        Object obj = this.yq;
        if (obj instanceof String) {
            try {
                return LE.yq.N((String) obj);
            } catch (ParseException unused) {
                StringBuilder yq = by.yq("cast to date fail. vale = ");
                yq.append(this.yq);
                throw new B1(yq.toString());
            }
        } else if (obj instanceof Date) {
            return (Date) obj;
        } else {
            StringBuilder yq2 = by.yq("cast to date fail. vale = ");
            yq2.append(this.yq);
            throw new B1(yq2.toString());
        }
    }

    public final boolean W() {
        return this.yq instanceof String;
    }

    public final boolean dT() {
        return this.N;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0066Le.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.yq, ((C0066Le) obj).yq);
    }

    public final int hashCode() {
        return Objects.hashCode(this.yq);
    }

    public final Long i() {
        long j;
        Object obj = this.yq;
        if (obj instanceof String) {
            j = new BigDecimal((String) this.yq).setScale(0, 4).longValue();
        } else if (obj instanceof Number) {
            j = ((Number) obj).longValue();
        } else {
            StringBuilder yq = by.yq("cast to number fail. vale = ");
            yq.append(this.yq);
            throw new B1(yq.toString());
        }
        return Long.valueOf(j);
    }

    public final boolean q() {
        return this.SN;
    }

    public final String t0() {
        Object obj = this.yq;
        if (obj instanceof kB) {
            StringBuilder sb = new StringBuilder();
            Iterator<hN> it = ((kB) this.yq).iterator();
            while (it.hasNext()) {
                sb.append(it.next().kR());
            }
            return sb.toString();
        } else if ((obj instanceof hN) && Objects.equals(((hN) obj).tl(), "JX_TEXT")) {
            return ((hN) this.yq).kR();
        } else {
            Object obj2 = this.yq;
            return obj2 instanceof List ? Mw.zH((List) obj2, ",") : String.valueOf(obj2).trim();
        }
    }

    public final kB tF() {
        return (kB) this.yq;
    }

    public final String toString() {
        io ioVar = new io(this);
        ioVar.yq(this.yq);
        ioVar.SN("isAttr", this.SN);
        ioVar.SN("isExprStr", this.N);
        return ioVar.toString();
    }

    public final Class v() {
        Object obj = this.yq;
        return obj == null ? Object.class : obj.getClass();
    }

    public final boolean v3() {
        return this.yq instanceof Number;
    }

    public final Boolean yq() {
        Object obj = this.yq;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf(obj != null && !Mw.SN(t0()));
    }

    public final List<String> zH() {
        return (List) this.yq;
    }
}
