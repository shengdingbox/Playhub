package com.github.catvod.spider.merge;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* renamed from: com.github.catvod.spider.merge.hE  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public interface AbstractExecutorServiceC0114hE extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService, com.github.catvod.spider.merge.AbstractExecutorServiceC0114hE
    /* renamed from: submit */
    <T> d7<T> mo1029submit(Callable<T> callable);
}
