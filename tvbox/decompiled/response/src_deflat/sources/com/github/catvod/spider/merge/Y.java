package com.github.catvod.spider.merge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Y {
    private static final Map<Class<?>, Class<?>> N = new HashMap();
    private static final Map<Class<?>, Class<?>> SN;
    private static final Map<String, String> tF;
    private static final Map<String, Class<?>> yq;
    public static final /* synthetic */ int zH = 0;

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map<java.lang.Class<?>, java.lang.Class<?>>, java.util.HashMap] */
    static {
        String.valueOf('.');
        String.valueOf('$');
        HashMap hashMap = new HashMap();
        yq = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put("boolean", cls);
        hashMap.put("byte", Byte.TYPE);
        hashMap.put("char", Character.TYPE);
        hashMap.put("short", Short.TYPE);
        Class cls2 = Integer.TYPE;
        hashMap.put("int", cls2);
        Class cls3 = Long.TYPE;
        hashMap.put("long", cls3);
        hashMap.put("double", Double.TYPE);
        Class cls4 = Float.TYPE;
        hashMap.put("float", cls4);
        hashMap.put("void", Void.TYPE);
        HashMap hashMap2 = new HashMap();
        SN = hashMap2;
        hashMap2.put(cls, Boolean.class);
        hashMap2.put(Byte.TYPE, Byte.class);
        hashMap2.put(Character.TYPE, Character.class);
        hashMap2.put(Short.TYPE, Short.class);
        hashMap2.put(cls2, Integer.class);
        hashMap2.put(cls3, Long.class);
        hashMap2.put(Double.TYPE, Double.class);
        hashMap2.put(cls4, Float.class);
        Class cls5 = Void.TYPE;
        hashMap2.put(cls5, cls5);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Class cls6 = (Class) entry.getKey();
            Class cls7 = (Class) entry.getValue();
            if (!cls6.equals(cls7)) {
                N.put(cls7, cls6);
            }
        }
        HashMap SN2 = C0128k.SN("int", "I", "boolean", "Z");
        SN2.put("float", "F");
        SN2.put("long", "J");
        SN2.put("short", "S");
        SN2.put("byte", "B");
        SN2.put("double", "D");
        SN2.put("char", "C");
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry2 : SN2.entrySet()) {
            hashMap3.put(entry2.getValue(), entry2.getKey());
        }
        Collections.unmodifiableMap(SN2);
        tF = Collections.unmodifiableMap(hashMap3);
    }

    public static String yq(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String name = cls.getName();
        if (Mw.N(name)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (name.startsWith("[")) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                sb.append("[]");
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
            Map<String, String> map = tF;
            if (map.containsKey(name)) {
                name = map.get(name);
            }
        }
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            i = lastIndexOf + 1;
        }
        int indexOf = name.indexOf(36, i);
        String substring = name.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + ((Object) sb);
    }
}
