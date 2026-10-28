package com.github.catvod.spider.mergeguard.oOoOoOoOoOoOoO0o;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
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
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
final class OoOoOo0O0o0oO0o0 implements Closeable {
    private final FileLock OoOoOo0O0o0oO0o0;
    private final long oOo0oOo0Oo0oO0Oo;
    private final FileChannel oOoO0o0oOo0oO0Oo;
    private final RandomAccessFile oOoOoOo0O0O0oO0o;
    private final File oOoOoOo0oOo0o0oO;
    private final File oOoOoOoOoOoOoO0o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OoOoOo0O0o0oO0o0(File file, File file2) {
        Throwable e;
        StringBuilder oOoOoOoOoOoOoO0o = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("MultiDexExtractor(");
        oOoOoOoOoOoOoO0o.append(file.getPath());
        oOoOoOoOoOoOoO0o.append(", ");
        oOoOoOoOoOoOoO0o.append(file2.getPath());
        oOoOoOoOoOoOoO0o.append(")");
        Log.i("MultiDex", oOoOoOoOoOoOoO0o.toString());
        this.oOoOoOoOoOoOoO0o = file;
        this.oOoOoOo0oOo0o0oO = file2;
        this.oOo0oOo0Oo0oO0Oo = oOoOoOo0O0O0oO0o(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.oOoOoOo0O0O0oO0o = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.oOoO0o0oOo0oO0Oo = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.OoOoOo0O0o0oO0o0 = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                oOoOoOoOoOoOoO0o(this.oOoO0o0oOo0oO0Oo);
                throw e;
            } catch (Error e3) {
                e = e3;
                oOoOoOoOoOoOoO0o(this.oOoO0o0oOo0oO0Oo);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                oOoOoOoOoOoOoO0o(this.oOoO0o0oOo0oO0Oo);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            oOoOoOoOoOoOoO0o(this.oOoOoOo0O0O0oO0o);
            throw e5;
        }
    }

    private static void OoOoO0O0o0oOoO0O(Context context, long j, long j2, List list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            oOoO0o0oOo0oO0Oo oooo0o0ooo0oo0oo = (oOoO0o0oOo0oO0Oo) it.next();
            edit.putLong("dex.crc." + i, oooo0o0ooo0oo0oo.oOoOoOoOoOoOoO0o);
            edit.putLong("dex.time." + i, oooo0o0ooo0oo0oo.lastModified());
            i++;
        }
        edit.commit();
    }

    private List OoOoOo0O0o0oO0o0(Context context) {
        OoOoOo0O0o0oO0o0 ooOoOo0O0o0oO0o0 = this;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = ooOoOo0O0o0oO0o0.oOoOoOoOoOoOoO0o.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            oOoO0o0oOo0oO0Oo oooo0o0ooo0oo0oo = new oOoO0o0oOo0oO0Oo(ooOoOo0O0o0oO0o0.oOoOoOo0oOo0o0oO, str + i2 + ".zip");
            if (oooo0o0ooo0oo0oo.isFile()) {
                oooo0o0ooo0oo0oo.oOoOoOoOoOoOoO0o = oOoOoOo0O0O0oO0o(oooo0o0ooo0oo0oo);
                long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
                long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
                long lastModified = oooo0o0ooo0oo0oo.lastModified();
                if (j2 == lastModified) {
                    str = str;
                    if (j == oooo0o0ooo0oo0oo.oOoOoOoOoOoOoO0o) {
                        arrayList.add(oooo0o0ooo0oo0oo);
                        i2++;
                        ooOoOo0O0o0oO0o0 = this;
                    }
                }
                throw new IOException("Invalid extracted dex: " + oooo0o0ooo0oo0oo + " (key \"\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + oooo0o0ooo0oo0oo.oOoOoOoOoOoOoO0o);
            }
            StringBuilder oOoOoOoOoOoOoO0o = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Missing extracted secondary dex file '");
            oOoOoOoOoOoOoO0o.append(oooo0o0ooo0oo0oo.getPath());
            oOoOoOoOoOoOoO0o.append("'");
            throw new IOException(oOoOoOoOoOoOoO0o.toString());
        }
        return arrayList;
    }

    private static void oOo0oOo0Oo0oO0Oo(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        StringBuilder oOoOoOoOoOoOoO0o = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Extracting ");
        oOoOoOoOoOoOoO0o.append(createTempFile.getPath());
        Log.i("MultiDex", oOoOoOoOoOoOoO0o.toString());
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
            oOoOoOoOoOoOoO0o(inputStream);
            createTempFile.delete();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01bb, code lost:
        throw new java.io.IOException("Could not create zip file " + r8.getAbsolutePath() + " for secondary dex (" + r5 + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List oOoOo0O0Oo0o0OoO() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.mergeguard.oOoOoOoOoOoOoO0o.OoOoOo0O0o0oO0o0.oOoOo0O0Oo0o0OoO():java.util.List");
    }

    /* JADX WARN: Finally extract failed */
    private static long oOoOoOo0O0O0oO0o(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            oOoOo0O0Oo0o0OoO oOoOoOoOoOoOoO0o = oOo0oOo0Oo0oO0Oo.oOoOoOoOoOoOoO0o(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = oOoOoOoOoOoOoO0o.oOo0oOo0Oo0oO0Oo;
            randomAccessFile.seek(oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o);
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

    private static long oOoOoOo0oOo0o0oO(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static void oOoOoOoOoOoOoO0o(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.OoOoOo0O0o0oO0o0.release();
        this.oOoO0o0oOo0oO0Oo.close();
        this.oOoOoOo0O0O0oO0o.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List oOoO0o0oOo0oO0Oo(Context context, boolean z) {
        List list;
        StringBuilder oOoOoOoOoOoOoO0o = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("MultiDexExtractor.load(");
        oOoOoOoOoOoOoO0o.append(this.oOoOoOoOoOoOoO0o.getPath());
        oOoOoOoOoOoOoO0o.append(", ");
        oOoOoOoOoOoOoO0o.append(z);
        oOoOoOoOoOoOoO0o.append(", ");
        oOoOoOoOoOoOoO0o.append("");
        oOoOoOoOoOoOoO0o.append(")");
        Log.i("MultiDex", oOoOoOoOoOoOoO0o.toString());
        if (this.OoOoOo0O0o0oO0o0.isValid()) {
            if (!z) {
                File file = this.oOoOoOoOoOoOoO0o;
                long j = this.oOo0oOo0Oo0oO0Oo;
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                if (!((sharedPreferences.getLong("timestamp", -1L) == oOoOoOo0oOo0o0oO(file) && sharedPreferences.getLong("crc", -1L) == j) ? false : true)) {
                    try {
                        list = OoOoOo0O0o0oO0o0(context);
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    }
                    StringBuilder oOoOoOoOoOoOoO0o2 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("load found ");
                    oOoOoOoOoOoOoO0o2.append(list.size());
                    oOoOoOoOoOoOoO0o2.append(" secondary dex files");
                    Log.i("MultiDex", oOoOoOoOoOoOoO0o2.toString());
                    return list;
                }
            }
            Log.i("MultiDex", z ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
            List oOoOo0O0Oo0o0OoO = oOoOo0O0Oo0o0OoO();
            OoOoO0O0o0oOoO0O(context, oOoOoOo0oOo0o0oO(this.oOoOoOoOoOoOoO0o), this.oOo0oOo0Oo0oO0Oo, oOoOo0O0Oo0o0OoO);
            list = oOoOo0O0Oo0o0OoO;
            StringBuilder oOoOoOoOoOoOoO0o22 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("load found ");
            oOoOoOoOoOoOoO0o22.append(list.size());
            oOoOoOoOoOoOoO0o22.append(" secondary dex files");
            Log.i("MultiDex", oOoOoOoOoOoOoO0o22.toString());
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}
