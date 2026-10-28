package com.github.catvod.spider.merge;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class CC {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static class yq implements FilenameFilter {
        final /* synthetic */ String yq;

        yq(String str) {
            this.yq = str;
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(this.yq + ".");
        }
    }

    public static void N(Path path, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                if (System.getProperty("os.name").toLowerCase().contains("win")) {
                    if (bArr[0] != 0) {
                        DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
                        dosFileAttributeView.setReadOnly(Ya.tF(bArr[0], 0));
                        dosFileAttributeView.setHidden(Ya.tF(bArr[0], 1));
                        dosFileAttributeView.setSystem(Ya.tF(bArr[0], 2));
                        dosFileAttributeView.setArchive(Ya.tF(bArr[0], 5));
                    }
                } else if (!System.getProperty("os.name").toLowerCase().contains("mac") && !System.getProperty("os.name").toLowerCase().contains("nux")) {
                } else {
                    if (bArr[2] != 0 || bArr[3] != 0) {
                        HashSet hashSet = new HashSet();
                        yq(bArr[3], 0, hashSet, PosixFilePermission.OWNER_READ);
                        yq(bArr[2], 7, hashSet, PosixFilePermission.OWNER_WRITE);
                        yq(bArr[2], 6, hashSet, PosixFilePermission.OWNER_EXECUTE);
                        yq(bArr[2], 5, hashSet, PosixFilePermission.GROUP_READ);
                        yq(bArr[2], 4, hashSet, PosixFilePermission.GROUP_WRITE);
                        yq(bArr[2], 3, hashSet, PosixFilePermission.GROUP_EXECUTE);
                        yq(bArr[2], 2, hashSet, PosixFilePermission.OTHERS_READ);
                        yq(bArr[2], 1, hashSet, PosixFilePermission.OTHERS_WRITE);
                        yq(bArr[2], 0, hashSet, PosixFilePermission.OTHERS_EXECUTE);
                        Files.setPosixFilePermissions(path, hashSet);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public static File[] SN(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf != -1) {
            name = name.substring(0, lastIndexOf);
        }
        File[] listFiles = file.getParentFile().listFiles(new yq(name));
        if (listFiles == null) {
            return new File[0];
        }
        Arrays.sort(listFiles);
        return listFiles;
    }

    private static void yq(byte b, int i, Set<PosixFilePermission> set, PosixFilePermission posixFilePermission) {
        if (Ya.tF(b, i)) {
            set.add(posixFilePermission);
        }
    }
}
