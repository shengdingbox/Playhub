package com.github.catvod.spider.merge;

import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class Vd {
    public static final Logger KJ = Logger.getLogger(Vd.class.getName());
    private volatile ServerSocket N;
    public final int SN;
    private Thread zH;
    private Ya tF = new Ya();
    protected List<AbstractC0211zh<AbstractC0198vd, pM>> t0 = new ArrayList(4);
    public final String yq = null;
    private A4 M = new A4();
    protected eN Gc = new eN();
    private AbstractC0211zh<AbstractC0198vd, pM> i = new VH(this);

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class yq extends Exception {
        private final YU yq;

        public yq(YU yu, String str) {
            super(str);
            this.yq = yu;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public yq(String str, Exception exc) {
            super(str, exc);
            YU yu = YU.INTERNAL_ERROR;
            this.yq = yu;
        }

        public final YU yq() {
            return this.yq;
        }
    }

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    }

    public Vd(int i) {
        this.SN = i;
    }

    public static String yq(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            KJ.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static final void zH(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e) {
                KJ.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public void Gc() {
        try {
            zH(this.N);
            this.Gc.yq();
            Thread thread = this.zH;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            KJ.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    public final A4 N() {
        return this.M;
    }

    public final ServerSocket SN() {
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public pM i(AbstractC0198vd vdVar) {
        return pM.t0(YU.NOT_FOUND, "Not Found");
    }

    public final void t0() {
        Objects.requireNonNull(this.tF);
        this.N = new ServerSocket();
        this.N.setReuseAddress(true);
        F1 f1 = new F1(this);
        Thread thread = new Thread(f1);
        this.zH = thread;
        thread.setDaemon(true);
        this.zH.setName("NanoHttpd Main Listener");
        this.zH.start();
        while (!f1.SN() && f1.yq() == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (f1.yq() != null) {
            throw f1.yq();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.zh<com.github.catvod.spider.merge.vd, com.github.catvod.spider.merge.pM>>, java.util.ArrayList] */
    public final pM tF(AbstractC0198vd vdVar) {
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            pM pMVar = (pM) ((AbstractC0211zh) it.next()).yq(vdVar);
            if (pMVar != null) {
                return pMVar;
            }
        }
        VH vh = (VH) this.i;
        Objects.requireNonNull(vh);
        return vh.yq.i(vdVar);
    }
}
