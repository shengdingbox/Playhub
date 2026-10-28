package com.github.catvod.spider.merge;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.github.catvod.spider.merge.Kt;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class eY implements Closeable {
    private final File N;
    private final long SN;
    private final FileLock i;
    private final RandomAccessFile tF;
    private final File yq;
    private final FileChannel zH;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq extends File {
        public long yq = -1;

        public yq(File file, String str) {
            super(file, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public eY(File file, File file2) {
        Throwable e;
        StringBuilder yq2 = by.yq("MultiDexExtractor(");
        yq2.append(file.getPath());
        yq2.append(", ");
        yq2.append(file2.getPath());
        yq2.append(")");
        Log.i("MultiDex", yq2.toString());
        this.yq = file;
        this.N = file2;
        this.SN = tF(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.tF = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.zH = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.i = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                yq(this.zH);
                throw e;
            } catch (Error e3) {
                e = e3;
                yq(this.zH);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                yq(this.zH);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            yq(this.tF);
            throw e5;
        }
    }

    private static void Gc(Context context, long j, long j2, List list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            yq yqVar = (yq) it.next();
            edit.putLong("dex.crc." + i, yqVar.yq);
            edit.putLong("dex.time." + i, yqVar.lastModified());
            i++;
        }
        edit.commit();
    }

    private static long N(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static void SN(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(oX.yq("tmp-", str), ".zip", file.getParentFile());
        StringBuilder yq2 = by.yq("Extracting ");
        yq2.append(createTempFile.getPath());
        Log.i("MultiDex", yq2.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (!createTempFile.renameTo(file)) {
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                }
                return;
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } finally {
            yq(inputStream);
            createTempFile.delete();
        }
    }

    private List i(Context context) {
        eY eYVar = this;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = eYVar.yq.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            yq yqVar = new yq(eYVar.N, str + i2 + ".zip");
            if (yqVar.isFile()) {
                yqVar.yq = tF(yqVar);
                long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
                long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
                long lastModified = yqVar.lastModified();
                if (j2 == lastModified) {
                    str = str;
                    if (j == yqVar.yq) {
                        arrayList.add(yqVar);
                        i2++;
                        eYVar = this;
                    }
                }
                throw new IOException("Invalid extracted dex: " + yqVar + " (key \"\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + yqVar.yq);
            }
            StringBuilder yq2 = by.yq("Missing extracted secondary dex file '");
            yq2.append(yqVar.getPath());
            yq2.append("'");
            throw new IOException(yq2.toString());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01bb, code lost:
        throw new java.io.IOException("Could not create zip file " + r8.getAbsolutePath() + " for secondary dex (" + r5 + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.github.catvod.spider.merge.eY.yq> t0() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.eY.t0():java.util.List");
    }

    /* JADX WARN: Finally extract failed */
    private static long tF(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            Kt.yq yq2 = Kt.yq(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = yq2.SN;
            randomAccessFile.seek(yq2.yq);
            int min = (int) Math.min(16384L, j);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = randomAccessFile.read(bArr, 0, min);
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j -= read;
                if (j == 0) {
                    break;
                }
                min = (int) Math.min(16384L, j);
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    private static void yq(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.release();
        this.zH.close();
        this.tF.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zH(Context context, boolean z) {
        List<yq> list;
        StringBuilder yq2 = by.yq("MultiDexExtractor.load(");
        yq2.append(this.yq.getPath());
        yq2.append(", ");
        yq2.append(z);
        yq2.append(", ");
        yq2.append("");
        yq2.append(")");
        Log.i("MultiDex", yq2.toString());
        if (this.i.isValid()) {
            if (!z) {
                File file = this.yq;
                long j = this.SN;
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                if (!((sharedPreferences.getLong("timestamp", -1L) == N(file) && sharedPreferences.getLong("crc", -1L) == j) ? false : true)) {
                    try {
                        list = i(context);
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    }
                    StringBuilder yq3 = by.yq("load found ");
                    yq3.append(list.size());
                    yq3.append(" secondary dex files");
                    Log.i("MultiDex", yq3.toString());
                    return list;
                }
            }
            Log.i("MultiDex", z ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
            List<yq> t0 = t0();
            Gc(context, N(this.yq), this.SN, t0);
            list = t0;
            StringBuilder yq32 = by.yq("load found ");
            yq32.append(list.size());
            yq32.append(" secondary dex files");
            Log.i("MultiDex", yq32.toString());
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}
