package com.github.catvod.spider.merge;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class mu {
    private static String i;
    static boolean tF;
    static volatile int yq;
    private static final String[] zH;
    static final C0171rQ SN = new C0171rQ();
    static final FO N = new FO();

    static {
        String str = null;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
        }
        tF = str == null ? false : str.equalsIgnoreCase("true");
        zH = new String[]{"1.6", "1.7"};
        i = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    private mu() {
    }

    private static void Gc(Set<URL> set) {
        if (set != null) {
            boolean z = true;
            if (set.size() <= 1) {
                z = false;
            }
            if (z) {
                StringBuilder yq2 = by.yq("Actual binding is of type [");
                yq2.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                yq2.append("]");
                Og.SN(yq2.toString());
            }
        }
    }

    private static final void KJ() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : zH) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (!z) {
                Og.SN("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(zH).toString());
                Og.SN("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            Og.N("Unexpected problem occured during version sanity check", th);
        }
    }

    private static void M(Set<URL> set) {
        boolean z = true;
        if (set.size() <= 1) {
            z = false;
        }
        if (z) {
            Og.SN("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                Og.SN("Found binding in [" + it.next() + "]");
            }
            Og.SN("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static Pu N() {
        if (yq == 0) {
            synchronized (mu.class) {
                if (yq == 0) {
                    yq = 1;
                    yq();
                    if (yq == 3) {
                        KJ();
                    }
                }
            }
        }
        int i2 = yq;
        if (i2 == 1) {
            return SN;
        }
        if (i2 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i2 == 4) {
                return N;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    static Set<URL> SN() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = mu.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(i) : classLoader.getResources(i);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            Og.N("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    private static boolean i() {
        String str = null;
        try {
            str = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains("android");
    }

    private static void t0() {
        C0171rQ rQVar = SN;
        synchronized (rQVar) {
            rQVar.zH();
            Iterator it = ((ArrayList) rQVar.tF()).iterator();
            while (it.hasNext()) {
                GR gr = (GR) it.next();
                gr.i(zH(gr.getName()));
            }
        }
        LinkedBlockingQueue<zF> N2 = SN.N();
        int size = N2.size();
        ArrayList arrayList = new ArrayList(128);
        int i2 = 0;
        while (N2.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                zF zFVar = (zF) it2.next();
                if (zFVar != null) {
                    GR yq2 = zFVar.yq();
                    String name = yq2.getName();
                    if (yq2.tF()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    } else if (!yq2.N()) {
                        if (yq2.SN()) {
                            yq2.zH(zFVar);
                        } else {
                            Og.SN(name);
                        }
                    }
                }
                i2++;
                if (i2 == 0) {
                    if (zFVar.yq().SN()) {
                        Og.SN("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        Og.SN("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        Og.SN("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!zFVar.yq().N()) {
                        Og.SN("The following set of substitute loggers may have been accessed");
                        Og.SN("during the initialization phase. Logging calls during this");
                        Og.SN("phase were not honored. However, subsequent logging calls to these");
                        Og.SN("loggers will work as normally expected.");
                        Og.SN("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
            }
            arrayList.clear();
        }
        SN.SN();
    }

    public static a9 tF(Class<?> cls) {
        Class<?> yq2;
        a9 yq3 = N().yq(cls.getName());
        if (tF && (yq2 = Og.yq()) != null && (!yq2.isAssignableFrom(cls))) {
            Og.SN(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", yq3.getName(), yq2.getName()));
            Og.SN("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return yq3;
    }

    private static final void yq() {
        Set<URL> set = null;
        try {
            try {
                if (!i()) {
                    set = SN();
                    M(set);
                }
                StaticLoggerBinder.getSingleton();
                yq = 3;
                Gc(set);
            } catch (Exception e) {
                yq = 2;
                Og.N("Failed to instantiate SLF4J LoggerFactory", e);
                throw new IllegalStateException("Unexpected initialization failure", e);
            } catch (NoClassDefFoundError e2) {
                String message = e2.getMessage();
                boolean z = false;
                if (message != null) {
                    if (!message.contains("org/slf4j/impl/StaticLoggerBinder")) {
                        if (message.contains("org.slf4j.impl.StaticLoggerBinder")) {
                        }
                    }
                    z = true;
                }
                if (z) {
                    yq = 4;
                    Og.SN("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    Og.SN("Defaulting to no-operation (NOP) logger implementation");
                    Og.SN("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                } else {
                    yq = 2;
                    Og.N("Failed to instantiate SLF4J LoggerFactory", e2);
                    throw e2;
                }
            } catch (NoSuchMethodError e3) {
                String message2 = e3.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    yq = 2;
                    Og.SN("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    Og.SN("Your binding is version 1.5.5 or earlier.");
                    Og.SN("Upgrade your binding to version 1.6.x.");
                }
                throw e3;
            }
        } finally {
            t0();
        }
    }

    public static a9 zH(String str) {
        return N().yq(str);
    }
}
