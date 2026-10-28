package com.github.catvod.spider.merge;

import android.app.ProgressDialog;
import com.github.catvod.spider.InitOrigin;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Objects;
/* renamed from: com.github.catvod.spider.merge.ew */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0098ew {
    private boolean N;
    private volatile boolean SN = false;
    private ProgressDialog yq;

    private void Gc(File file, InputStream inputStream, double d) {
        boolean z;
        this.SN = false;
        if (inputStream != null) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[4096];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1 || this.SN) {
                        break;
                    }
                    j += read;
                    fileOutputStream.write(bArr, 0, read);
                    double d2 = j;
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    final int max = Math.max(0, Math.min(100, (int) ((d2 * 100.0d) / d)));
                    InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.xT
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0098ew.N(C0098ew.this, max);
                        }
                    });
                }
                fileOutputStream.close();
                bufferedInputStream.close();
                if (!z) {
                    return;
                }
            } finally {
                if (this.SN && file.exists()) {
                    file.delete();
                }
            }
        } else {
            throw new Exception("下载流为空");
        }
    }

    public static /* synthetic */ void N(C0098ew ewVar, int i) {
        Objects.requireNonNull(ewVar);
        try {
            ProgressDialog progressDialog = ewVar.yq;
            if (progressDialog != null && progressDialog.isShowing()) {
                ewVar.yq.setProgress(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void SN(C0098ew ewVar) {
        ewVar.SN = true;
        ProgressDialog progressDialog = ewVar.yq;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    private void t0() {
        InitOrigin.run(new g1(this, 7));
    }

    public static void tF(C0098ew ewVar) {
        Objects.requireNonNull(ewVar);
        try {
            ewVar.N = false;
            ProgressDialog progressDialog = ewVar.yq;
            if (progressDialog != null && progressDialog.isShowing()) {
                ewVar.yq.dismiss();
            }
            ewVar.yq = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void yq(C0098ew ewVar) {
        Objects.requireNonNull(ewVar);
        try {
            ProgressDialog progressDialog = ewVar.yq;
            if (progressDialog == null || !progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = new ProgressDialog(InitOrigin.getActivity());
                ewVar.yq = progressDialog2;
                progressDialog2.setProgressStyle(1);
                ewVar.yq.setCancelable(false);
                ewVar.yq.setMax(100);
                ewVar.yq.setButton(-2, "取消", new DialogInterface$OnClickListenerC0112h(ewVar, 1));
                if (ewVar.N) {
                    ewVar.yq.show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
        r10 = "网络请求失败，返回空响应";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014f, code lost:
        if (com.github.catvod.spider.merge.Rc.ee("") == false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zH(com.github.catvod.spider.merge.C0098ew r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0098ew.zH(com.github.catvod.spider.merge.ew, java.lang.String):void");
    }

    public final String i(String str) {
        if (!C0195vA.i()) {
            return "";
        }
        try {
            if (this.N) {
                return "";
            }
            this.N = true;
            try {
                InitOrigin.execute(new G4(this, str, 2));
                return "";
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception unused) {
            t0();
            return iX.G("");
        }
    }
}
