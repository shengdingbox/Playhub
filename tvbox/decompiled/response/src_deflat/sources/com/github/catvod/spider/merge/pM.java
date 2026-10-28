package com.github.catvod.spider.merge;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class pM implements Closeable {
    private boolean Gc;
    private List<String> KJ;
    private boolean M;
    private InputStream N;
    private String SN;
    private int t0;
    private long tF;
    private gs yq;
    private final Map<String, String> zH = new yq();
    private final Map<String, String> i = new HashMap();
    private int q = 1;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq extends HashMap<String, String> {
        yq() {
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            ((HashMap) pM.this.i).put(str == null ? str : str.toLowerCase(), str2);
            return (String) super.put(str, str2);
        }
    }

    protected pM(gs gsVar, String str, InputStream inputStream, long j) {
        this.yq = gsVar;
        this.SN = str;
        boolean z = false;
        if (inputStream == null) {
            this.N = new ByteArrayInputStream(new byte[0]);
            this.tF = 0L;
        } else {
            this.N = inputStream;
            this.tF = j;
        }
        this.Gc = this.tF < 0 ? true : z;
        this.M = true;
        this.KJ = new ArrayList(10);
    }

    private void B(OutputStream outputStream, long j) {
        if (v3()) {
            GZIPOutputStream gZIPOutputStream = null;
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
            } catch (Exception unused) {
                InputStream inputStream = this.N;
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (gZIPOutputStream != null) {
                q(gZIPOutputStream, -1L);
                gZIPOutputStream.finish();
                return;
            }
            return;
        }
        q(outputStream, j);
    }

    public static pM Gc(gs gsVar, String str, InputStream inputStream, long j) {
        return new pM(gsVar, str, inputStream, j);
    }

    public static pM i(gs gsVar, String str, InputStream inputStream) {
        return new pM(gsVar, str, inputStream, -1L);
    }

    private void q(OutputStream outputStream, long j) {
        byte[] bArr = new byte[(int) 16384];
        boolean z = j == -1;
        while (true) {
            if (j > 0 || z) {
                int read = this.N.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
                if (read > 0) {
                    try {
                        outputStream.write(bArr, 0, read);
                    } catch (Exception unused) {
                        if (this.N != null) {
                            this.N.close();
                        }
                    }
                    if (!z) {
                        j -= read;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static pM t0(gs gsVar, String str) {
        byte[] bArr;
        C0166qb qbVar = new C0166qb("text/plain");
        if (str == null) {
            return Gc(gsVar, "text/plain", new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(qbVar.N()).newEncoder().canEncode(str)) {
                qbVar = qbVar.tF();
            }
            bArr = str.getBytes(qbVar.N());
        } catch (UnsupportedEncodingException e) {
            Vd.KJ.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bArr = new byte[0];
        }
        return Gc(gsVar, qbVar.yq(), new ByteArrayInputStream(bArr), bArr.length);
    }

    public final pM F5() {
        this.q = 3;
        return this;
    }

    protected final long G(PrintWriter printWriter, long j) {
        String tF = tF("content-length");
        if (tF != null) {
            try {
                return Long.parseLong(tF);
            } catch (NumberFormatException unused) {
                Logger logger = Vd.KJ;
                logger.severe("content-length was no number " + tF);
                return j;
            }
        } else {
            printWriter.print("Content-Length: " + j + "\r\n");
            return j;
        }
    }

    public final void G4(boolean z) {
        this.M = z;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void KJ(OutputStream outputStream) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            if (this.yq != null) {
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new C0166qb(this.SN).N())), false);
                printWriter.append("HTTP/1.1 ").append(((YU) this.yq).yq()).append(" \r\n");
                String str = this.SN;
                if (str != null) {
                    M(printWriter, "Content-Type", str);
                }
                if (tF("date") == null) {
                    M(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : ((HashMap) this.zH).entrySet()) {
                    M(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                Iterator it = this.KJ.iterator();
                while (it.hasNext()) {
                    M(printWriter, "Set-Cookie", (String) it.next());
                }
                if (tF("connection") == null) {
                    M(printWriter, "Connection", this.M ? "keep-alive" : "close");
                }
                if (tF("content-length") != null) {
                    this.q = 3;
                }
                if (v3()) {
                    M(printWriter, "Content-Encoding", "gzip");
                    this.Gc = true;
                }
                long j = this.N != null ? this.tF : 0L;
                if (this.t0 != 5 && this.Gc) {
                    M(printWriter, "Transfer-Encoding", "chunked");
                } else if (!v3()) {
                    j = G(printWriter, j);
                }
                printWriter.append("\r\n");
                printWriter.flush();
                if (this.t0 == 5 || !this.Gc) {
                    B(outputStream, j);
                } else {
                    Tw tw = new Tw(outputStream);
                    B(tw, -1L);
                    try {
                        tw.yq();
                    } catch (Exception unused) {
                        if (this.N != null) {
                            this.N.close();
                        }
                    }
                }
                outputStream.flush();
                Vd.zH(this.N);
                return;
            }
            throw new Error("sendResponse(): Status can't be null.");
        } catch (IOException e) {
            Vd.KJ.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    protected final void M(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final void N(String str, String str2) {
        ((yq) this.zH).put(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void SN(String str) {
        this.KJ.add(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.N;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void dT(int i) {
        this.t0 = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    public final String tF(String str) {
        return (String) this.i.get(str.toLowerCase());
    }

    public final boolean v3() {
        int i = this.q;
        if (i != 1) {
            return i == 2;
        }
        String str = this.SN;
        if (str != null) {
            return str.toLowerCase().contains("text/") || this.SN.toLowerCase().contains("/json");
        }
        return false;
    }

    public final boolean zH() {
        return "close".equals(tF("connection"));
    }
}
