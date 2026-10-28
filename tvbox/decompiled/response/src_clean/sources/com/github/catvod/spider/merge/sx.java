package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Vd;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLException;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class sx implements AbstractC0198vd {
    private String B;
    private String G;
    private int Gc;
    private Map<String, String> KJ;
    private Map<String, List<String>> M;
    private final OutputStream N;
    private final AbstractC0155oI SN;
    private int i;
    private C0167qi q;
    private String t0;
    private final BufferedInputStream tF;
    private final Vd yq;
    private int zH;

    public sx(Vd vd, AbstractC0155oI oIVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.yq = vd;
        this.SN = oIVar;
        this.tF = new BufferedInputStream(inputStream, 8192);
        this.N = outputStream;
        this.B = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        this.KJ = new HashMap();
    }

    private int t0(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            if (bArr[i3] == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (bArr[i3] == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    private void tF(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) {
        String str;
        YU yu = YU.BAD_REQUEST;
        try {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (stringTokenizer.hasMoreTokens()) {
                    map.put("method", stringTokenizer.nextToken());
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken = stringTokenizer.nextToken();
                        int indexOf = nextToken.indexOf(63);
                        if (indexOf >= 0) {
                            zH(nextToken.substring(indexOf + 1), map2);
                            str = Vd.yq(nextToken.substring(0, indexOf));
                        } else {
                            str = Vd.yq(nextToken);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            this.G = stringTokenizer.nextToken();
                        } else {
                            this.G = "HTTP/1.1";
                            Vd.KJ.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                        }
                        while (true) {
                            String readLine2 = bufferedReader.readLine();
                            if (readLine2 == null || readLine2.trim().isEmpty()) {
                                break;
                            }
                            int indexOf2 = readLine2.indexOf(58);
                            if (indexOf2 >= 0) {
                                map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                            }
                        }
                        map.put("uri", str);
                        return;
                    }
                    throw new Vd.yq(yu, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                throw new Vd.yq(yu, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
        } catch (IOException e) {
            StringBuilder yq = by.yq("SERVER INTERNAL ERROR: IOException: ");
            yq.append(e.getMessage());
            throw new Vd.yq(yq.toString(), e);
        }
    }

    private void zH(String str, Map<String, List<String>> map) {
        String str2;
        String str3;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    str3 = Vd.yq(nextToken.substring(0, indexOf)).trim();
                    str2 = Vd.yq(nextToken.substring(indexOf + 1));
                } else {
                    str3 = Vd.yq(nextToken).trim();
                    str2 = "";
                }
                List<String> list = map.get(str3);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(str3, list);
                }
                list.add(str2);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0198vd
    public final Map<String, String> N() {
        return this.KJ;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0198vd
    public final String SN() {
        return this.t0;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0198vd
    public final Map<String, List<String>> getParameters() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    public final void i() {
        byte[] bArr;
        boolean z;
        int read;
        YU yu = YU.INTERNAL_ERROR;
        pM pMVar = null;
        try {
            try {
                try {
                    try {
                        bArr = new byte[8192];
                        z = false;
                        this.zH = 0;
                        this.i = 0;
                        this.tF.mark(8192);
                        try {
                            read = this.tF.read(bArr, 0, 8192);
                        } catch (SSLException e) {
                            throw e;
                        } catch (IOException unused) {
                            Vd.zH(this.tF);
                            Vd.zH(this.N);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (Vd.yq e2) {
                        pM.t0(e2.yq(), e2.getMessage()).KJ(this.N);
                        Vd.zH(this.N);
                        return;
                    }
                } catch (SocketException e3) {
                    throw e3;
                } catch (IOException e4) {
                    pM.t0(yu, "SERVER INTERNAL ERROR: IOException: " + e4.getMessage()).KJ(this.N);
                    Vd.zH(this.N);
                    return;
                }
            } catch (SocketTimeoutException e5) {
                throw e5;
            } catch (SSLException e6) {
                pM.t0(yu, "SSL PROTOCOL FAILURE: " + e6.getMessage()).KJ(this.N);
                Vd.zH(this.N);
                return;
            }
            if (read != -1) {
                while (read > 0) {
                    int i = this.i + read;
                    this.i = i;
                    int t0 = t0(bArr, i);
                    this.zH = t0;
                    if (t0 > 0) {
                        break;
                    }
                    BufferedInputStream bufferedInputStream = this.tF;
                    int i2 = this.i;
                    read = bufferedInputStream.read(bArr, i2, 8192 - i2);
                }
                if (this.zH < this.i) {
                    this.tF.reset();
                    this.tF.skip(this.zH);
                }
                this.M = new HashMap();
                ?? r3 = this.KJ;
                if (r3 == 0) {
                    this.KJ = new HashMap();
                } else {
                    r3.clear();
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.i)));
                HashMap hashMap = new HashMap();
                tF(bufferedReader, hashMap, this.M, this.KJ);
                String str = this.B;
                if (str != null) {
                    this.KJ.put("remote-addr", str);
                    this.KJ.put("http-client-ip", this.B);
                }
                int yq = A7.yq((String) hashMap.get("method"));
                this.Gc = yq;
                if (yq != 0) {
                    this.t0 = (String) hashMap.get("uri");
                    this.q = new C0167qi(this.KJ);
                    String str2 = (String) this.KJ.get("connection");
                    if ("HTTP/1.1".equals(this.G) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                        z = true;
                    }
                    pMVar = this.yq.tF(this);
                    if (pMVar != null) {
                        String str3 = (String) this.KJ.get("accept-encoding");
                        this.q.yq(pMVar);
                        pMVar.dT(this.Gc);
                        if (str3 == null || !str3.contains("gzip")) {
                            pMVar.F5();
                        }
                        pMVar.G4(z);
                        pMVar.KJ(this.N);
                        if (!z || pMVar.zH()) {
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                        return;
                    }
                    throw new Vd.yq(yu, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                }
                YU yu2 = YU.BAD_REQUEST;
                throw new Vd.yq(yu2, "BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap.get("method")) + " unhandled.");
            }
            Vd.zH(this.tF);
            Vd.zH(this.N);
            throw new SocketException("NanoHttpd Shutdown");
        } finally {
            Vd.zH(null);
            this.SN.clear();
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0198vd
    public final int yq() {
        return this.Gc;
    }
}
