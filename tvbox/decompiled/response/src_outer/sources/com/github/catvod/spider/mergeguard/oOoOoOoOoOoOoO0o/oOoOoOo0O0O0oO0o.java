package com.github.catvod.spider.mergeguard.oOoOoOoOoOoOoO0o;

import java.io.File;
import java.io.FileFilter;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
final class oOoOoOo0O0O0oO0o implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
