package com.github.catvod.spider.merge;

import java.io.File;
import java.util.Comparator;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class m7 implements Comparator {
    public static final /* synthetic */ m7 yq = new m7();

    private /* synthetic */ m7() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }
}
