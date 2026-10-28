package com.github.catvod.spider.merge;

import com.thegrizzlylabs.sardineandroid.DavResource;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Oh implements Comparator<DavResource> {
    private final String SN;
    private final String yq;

    public Oh(String str, String str2) {
        this.yq = str;
        this.SN = str2;
    }

    public static void yq(String str, String str2, List<DavResource> list) {
        Collections.sort(list, new Oh(str, str2));
    }

    @Override // java.util.Comparator
    public final int compare(DavResource davResource, DavResource davResource2) {
        char c;
        int compareTo;
        Long l;
        long j;
        DavResource davResource3 = davResource;
        DavResource davResource4 = davResource2;
        boolean equals = this.SN.equals("asc");
        String str = this.yq;
        Objects.requireNonNull(str);
        int hashCode = str.hashCode();
        if (hashCode == 3076014) {
            if (str.equals("date")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3373707) {
            if (hashCode == 3530753 && str.equals("size")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("name")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            compareTo = equals ? davResource3.getModified().compareTo(davResource4.getModified()) : davResource4.getModified().compareTo(davResource3.getModified());
        } else if (c == 1) {
            compareTo = equals ? davResource3.getName().compareTo(davResource4.getName()) : davResource4.getName().compareTo(davResource3.getName());
        } else if (c != 2) {
            return -1;
        } else {
            if (equals) {
                j = davResource3.getContentLength().longValue();
                l = davResource4.getContentLength();
            } else {
                j = davResource4.getContentLength().longValue();
                l = davResource3.getContentLength();
            }
            return Long.compare(j, l.longValue());
        }
        return compareTo;
    }
}
