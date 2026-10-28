package com.github.catvod.spider.merge;

import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
abstract class Q9<F extends Format> {
    private final ConcurrentMap<yq, F> yq = new ConcurrentHashMap(7);

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class yq {
        private final int SN;
        private final Object[] yq;

        yq(Object... objArr) {
            this.yq = objArr;
            this.SN = Arrays.hashCode(objArr) + 31;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && yq.class == obj.getClass()) {
                return Arrays.deepEquals(this.yq, ((yq) obj).yq);
            }
            return false;
        }

        public final int hashCode() {
            return this.SN;
        }
    }

    static {
        new ConcurrentHashMap(7);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.Q9$yq, F extends java.text.Format>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.Q9$yq, F extends java.text.Format>, java.util.concurrent.ConcurrentHashMap] */
    public final Format yq(String str, Locale locale) {
        hm.yq(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale yq2 = B7.yq(locale);
        yq yqVar = new yq(str, timeZone, yq2);
        Format format = (Format) this.yq.get(yqVar);
        if (format != null) {
            return format;
        }
        rE rEVar = new rE(str, timeZone, yq2);
        Format format2 = (Format) this.yq.putIfAbsent(yqVar, rEVar);
        return format2 != null ? format2 : rEVar;
    }
}
