package com.github.catvod.spider.merge;

import java.util.Date;
import java.util.TimeZone;
/* renamed from: com.github.catvod.spider.merge.Ha  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class C0063Ha extends TimeZone {
    private final String SN;
    private final int yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0063Ha(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + " hours out of range");
        } else if (i2 < 60) {
            int i3 = ((i * 60) + i2) * 60000;
            this.yq = z ? -i3 : i3;
            StringBuilder sb = new StringBuilder(9);
            sb.append("GMT");
            sb.append(z ? '-' : '+');
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
            sb.append(':');
            sb.append((char) ((i2 / 10) + 48));
            sb.append((char) ((i2 % 10) + 48));
            this.SN = sb.toString();
        } else {
            throw new IllegalArgumentException(i2 + " minutes out of range");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0063Ha) && this.SN == ((C0063Ha) obj).SN;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return this.SN;
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.yq;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.yq;
    }

    public final int hashCode() {
        return this.yq;
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder yq = by.yq("[GmtTimeZone id=\"");
        yq.append(this.SN);
        yq.append("\",offset=");
        yq.append(this.yq);
        yq.append(']');
        return yq.toString();
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
