package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;
import java.util.logging.Level;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class F1 implements Runnable {
    private IOException N;
    private Vd yq;
    private boolean tF = false;
    private final int SN = 15;

    public F1(Vd vd) {
        this.yq = vd;
    }

    public final boolean SN() {
        return this.tF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InetSocketAddress inetSocketAddress;
        try {
            ServerSocket SN = this.yq.SN();
            if (this.yq.yq != null) {
                Vd vd = this.yq;
                inetSocketAddress = new InetSocketAddress(vd.yq, vd.SN);
            } else {
                inetSocketAddress = new InetSocketAddress(this.yq.SN);
            }
            SN.bind(inetSocketAddress);
            this.tF = true;
            do {
                try {
                    Socket accept = this.yq.SN().accept();
                    int i = this.SN;
                    if (i > 0) {
                        accept.setSoTimeout(i);
                    }
                    InputStream inputStream = accept.getInputStream();
                    Vd vd2 = this.yq;
                    eN eNVar = vd2.Gc;
                    Objects.requireNonNull(vd2);
                    eNVar.N(new Jz(vd2, inputStream, accept));
                } catch (IOException e) {
                    Vd.KJ.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } while (!this.yq.SN().isClosed());
        } catch (IOException e2) {
            this.N = e2;
        }
    }

    public final IOException yq() {
        return this.N;
    }
}
