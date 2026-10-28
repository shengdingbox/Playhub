package com.github.catvod.spider.merge;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class I2 {
    public static final /* synthetic */ int N = 0;
    private static final Pattern yq = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");
    private static final TimeZone SN = new C0063Ha(false, 0, 0);

    public static TimeZone yq(String str) {
        if ("Z".equals(str) || "UTC".equals(str)) {
            return SN;
        }
        Matcher matcher = yq.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(2);
        boolean z = false;
        int parseInt = group != null ? Integer.parseInt(group) : 0;
        String group2 = matcher.group(4);
        int parseInt2 = group2 != null ? Integer.parseInt(group2) : 0;
        if (parseInt == 0 && parseInt2 == 0) {
            return SN;
        }
        String group3 = matcher.group(1);
        if (group3 != null && group3.charAt(0) == '-') {
            z = true;
        }
        return new C0063Ha(z, parseInt, parseInt2);
    }
}
