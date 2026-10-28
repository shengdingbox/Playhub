package com.github.catvod.spider.merge;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class rE extends Format {
    private static final Q9<rE> N = new yq();
    private final C0183tW SN;
    private final dN yq;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static class yq extends Q9<rE> {
        yq() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public rE(String str, TimeZone timeZone, Locale locale) {
        this.yq = new dN(str, timeZone, locale);
        this.SN = new C0183tW(str, timeZone, locale);
    }

    public static rE SN(String str) {
        return (rE) N.yq(str, null);
    }

    public static rE yq() {
        return (rE) N.yq("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    public final Date N(String str) {
        return this.SN.Gc(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rE)) {
            return false;
        }
        return this.yq.equals(((rE) obj).yq);
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.yq.tF(obj));
        return stringBuffer;
    }

    public final int hashCode() {
        return this.yq.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.SN.M(str, parsePosition);
    }

    public final String toString() {
        StringBuilder yq2 = by.yq("FastDateFormat[");
        yq2.append(this.yq.i());
        yq2.append(",");
        yq2.append(this.yq.zH());
        yq2.append(",");
        yq2.append(this.yq.t0().getID());
        yq2.append("]");
        return yq2.toString();
    }
}
