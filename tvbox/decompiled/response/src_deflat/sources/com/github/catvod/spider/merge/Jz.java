package com.github.catvod.spider.merge;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.logging.Level;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Jz implements Runnable {
    private final Socket N;
    private final InputStream SN;
    private final Vd yq;

    public Jz(Vd vd, InputStream inputStream, Socket socket) {
        this.yq = vd;
        this.SN = inputStream;
        this.N = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = this.N.getOutputStream();
                Objects.requireNonNull(this.yq.N());
                sx sxVar = new sx(this.yq, new UC(), this.SN, outputStream, this.N.getInetAddress());
                while (!this.N.isClosed()) {
                    sxVar.i();
                }
            } catch (Exception e) {
                if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                    Vd.KJ.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                }
            }
        } finally {
            Vd.zH(outputStream);
            Vd.zH(this.SN);
            Vd.zH(this.N);
            this.yq.Gc.SN(this);
        }
    }

    public final void yq() {
        Vd.zH(this.SN);
        Vd.zH(this.N);
    }
}
