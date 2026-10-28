package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0131l;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.util.Objects;
import java.util.regex.Matcher;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class XO<T> extends AbstractC0131l<T> {
    private final a0 tF;
    private final Qt zH;

    public XO(a0 a0Var, Qt qt, AbstractC0131l.SN sn) {
        super(sn);
        this.tF = a0Var;
        this.zH = qt;
    }

    private boolean KJ(NJ nj) {
        byte[] u7 = nj.u7();
        if (u7 == null || u7.length < 4) {
            return false;
        }
        return Ya.tF(u7[3], 5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Gc(c6 c6Var, NJ nj, String str, Z2 z2, byte[] bArr) {
        if (KJ(nj)) {
            Objects.requireNonNull(this.zH);
        }
        String str2 = TA.yq;
        if (!str.endsWith(str2)) {
            str = oX.yq(str, str2);
        }
        File file = new File(zH.SN(str, str2, nj.m().replaceAll("[/\\\\]", Matcher.quoteReplacement(str2))));
        file.getAbsolutePath();
        Objects.requireNonNull(z2);
        if (!file.getCanonicalPath().startsWith(new File(str).getCanonicalPath() + File.separator)) {
            StringBuilder yq = by.yq("illegal file name that breaks out of the target directory: ");
            yq.append(nj.m());
            throw new RH(yq.toString());
        } else if (!Ya.tF(nj.k()[0], 6)) {
            Ki SN = c6Var.SN(nj);
            if (SN == null) {
                StringBuilder yq2 = by.yq("Could not read corresponding local file header for file header: ");
                yq2.append(nj.m());
                throw new RH(yq2.toString());
            } else if (nj.m().equals(SN.m())) {
                if (nj.N0()) {
                    if (!file.exists() && !file.mkdirs()) {
                        throw new RH("Could not create directory: " + file);
                    }
                } else if (KJ(nj)) {
                    int Z = (int) nj.Z();
                    byte[] bArr2 = new byte[Z];
                    if (c6Var.read(bArr2, 0, Z) == Z) {
                        z2.t0(Z);
                        String str3 = new String(bArr2);
                        if (file.getParentFile().exists() || file.getParentFile().mkdirs()) {
                            try {
                                Files.createSymbolicLink(file.toPath(), Paths.get(str3, new String[0]), new FileAttribute[0]);
                            } catch (NoSuchMethodError unused) {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    fileOutputStream.write(str3.getBytes());
                                    fileOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                }
                            }
                        } else {
                            throw new RH("Could not create parent directories");
                        }
                    } else {
                        throw new RH("Could not read complete entry");
                    }
                } else if (file.getParentFile().exists() || file.getParentFile().mkdirs()) {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        while (true) {
                            int read = c6Var.read(bArr, 0, bArr.length);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                            z2.t0(read);
                            t0();
                        }
                        fileOutputStream2.close();
                    } catch (Exception e) {
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                } else {
                    StringBuilder yq3 = by.yq("Unable to create parent directories: ");
                    yq3.append(file.getParentFile());
                    throw new RH(yq3.toString());
                }
                try {
                    Path path = file.toPath();
                    CC.N(path, nj.u7());
                    long RQ = nj.RQ();
                    if (RQ > 0 && Files.exists(path, new LinkOption[0])) {
                        try {
                            Files.setLastModifiedTime(path, FileTime.fromMillis(FO.t0(RQ)));
                        } catch (Exception unused2) {
                        }
                    }
                } catch (NoSuchMethodError unused3) {
                    file.setLastModified(FO.t0(nj.RQ()));
                }
            } else {
                throw new RH("File header and local file header mismatch");
            }
        } else {
            StringBuilder yq4 = by.yq("Entry with name ");
            yq4.append(nj.m());
            yq4.append(" is encrypted with Strong Encryption. Zip4j does not support Strong Encryption, as this is patented.");
            throw new RH(yq4.toString());
        }
    }

    public final a0 M() {
        return this.tF;
    }
}
