package com.github.catvod.spider.merge;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class yE extends Enum<yE> implements Executor {
    private static final /* synthetic */ yE[] SN;
    public static final yE yq;

    static {
        yE yEVar = new yE();
        yq = yEVar;
        SN = new yE[]{yEVar};
    }

    private yE() {
    }

    public static yE valueOf(String str) {
        return (yE) Enum.valueOf(yE.class, str);
    }

    public static yE[] values() {
        return (yE[]) SN.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
