package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0131l;
import com.github.catvod.spider.merge.I8;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class N3 implements Closeable {
    private a0 SN;
    private File yq;
    private Charset tF = null;
    private List<InputStream> zH = new ArrayList();
    private Z2 N = new Z2();

    public N3(File file) {
        this.yq = file;
    }

    private RandomAccessFile N() {
        if (!this.yq.getName().endsWith(".zip.001")) {
            return new RandomAccessFile(this.yq, C0202x.i(1));
        }
        W3 w3 = new W3(this.yq, C0202x.i(1), CC.SN(this.yq));
        w3.yq();
        return w3;
    }

    private void zH() {
        if (this.SN == null) {
            if (!this.yq.exists()) {
                a0 a0Var = new a0();
                this.SN = a0Var;
                a0Var.G4(this.yq);
            } else if (this.yq.canRead()) {
                try {
                    RandomAccessFile N = N();
                    try {
                        a0 N2 = new Z8().N(N, new H0(this.tF, 4096));
                        this.SN = N2;
                        N2.G4(this.yq);
                        N.close();
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th) {
                        }
                    }
                } catch (RH e) {
                    throw e;
                } catch (IOException e2) {
                    throw new RH(e2);
                }
            } else {
                throw new RH("no read access for the input zip file");
            }
        }
    }

    public final List<File> SN() {
        int Dr;
        zH();
        a0 a0Var = this.SN;
        if (a0Var == null) {
            throw new RH("cannot get split zip files: zipmodel is null");
        } else if (a0Var.SN() == null) {
            return null;
        } else {
            if (a0Var.zH().exists()) {
                ArrayList arrayList = new ArrayList();
                File zH = a0Var.zH();
                if (a0Var.i() && (Dr = a0Var.SN().Dr()) != 0) {
                    int i = 0;
                    while (i <= Dr) {
                        if (i == Dr) {
                            arrayList.add(a0Var.zH());
                        } else {
                            StringBuilder yq = Sq.yq(zH.getName().contains(".") ? zH.getPath().substring(0, zH.getPath().lastIndexOf(".")) : zH.getPath(), i >= 9 ? ".z" : ".z0");
                            yq.append(i + 1);
                            arrayList.add(new File(yq.toString()));
                        }
                        i++;
                    }
                } else {
                    arrayList.add(zH);
                }
                return arrayList;
            }
            throw new RH("zip file does not exist");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.io.InputStream>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<java.io.InputStream>, java.util.ArrayList] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.zH.iterator();
        while (it.hasNext()) {
            ((InputStream) it.next()).close();
        }
        this.zH.clear();
    }

    public final void i(Charset charset) {
        if (charset != null) {
            this.tF = charset;
            return;
        }
        throw new IllegalArgumentException("charset cannot be null");
    }

    public final boolean tF() {
        boolean z;
        if (!this.yq.exists()) {
            return false;
        }
        try {
            zH();
            if (this.SN.i()) {
                Iterator<File> it = SN().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it.next().exists()) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final String toString() {
        return this.yq.toString();
    }

    public final void yq(String str) {
        Qt qt = new Qt();
        if (str != null && str.trim().length() > 0) {
            File file = new File(str);
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new RH("output directory is not valid");
                }
            } else if (!file.mkdirs()) {
                throw new RH("Cannot create output directories");
            }
            if (this.SN == null) {
                zH();
            }
            a0 a0Var = this.SN;
            if (a0Var != null) {
                new I8(a0Var, null, qt, new AbstractC0131l.SN(null, this.N)).tF(new I8.yq(str, new H0(this.tF, 4096)));
                return;
            }
            throw new RH("Internal error occurred when extracting zip file");
        }
        throw new RH("output path is null or invalid");
    }
}
