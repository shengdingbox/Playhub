package com.github.catvod.spider.merge;

import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Ah {
    public static void yq(StringBuffer stringBuffer, Object obj) {
        Objects.requireNonNull(obj, new C0126jY("object", new Object[0]));
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        int length = stringBuffer.length();
        stringBuffer.ensureCapacity(hexString.length() + name.length() + length + 1);
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }
}
