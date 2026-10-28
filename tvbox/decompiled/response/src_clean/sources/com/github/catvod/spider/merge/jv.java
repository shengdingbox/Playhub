package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.jv;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.Response;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class jv {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        private String SN;
        private String yq;

        public yq(String str, String str2) {
            this.yq = str;
            this.SN = str2;
        }

        public final String SN() {
            return this.yq;
        }

        public final String yq() {
            return this.SN;
        }
    }

    public final String yq(List<String> list) {
        yq yqVar;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(list.size());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
        for (final String str : list) {
            executorCompletionService.submit(new Callable() { // from class: com.github.catvod.spider.merge.Co
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Response response;
                    jv jvVar = jv.this;
                    String str2 = str;
                    Objects.requireNonNull(jvVar);
                    System.currentTimeMillis();
                    try {
                        response = C0068Pe.M(str2.contains("&ajax") ? str2.split("&")[0] : str2, Rc.M("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKlt/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Safari/537.36"), 5);
                    } catch (Exception e) {
                        e.printStackTrace();
                        response = null;
                    }
                    if (response == null || !response.isSuccessful() || response.code() < 200 || response.code() > 302) {
                        System.currentTimeMillis();
                        return new jv.yq(str2, "");
                    }
                    System.currentTimeMillis();
                    return new jv.yq(str2, response.body().string());
                }
            });
        }
        for (int i = 0; i < list.size(); i++) {
            try {
                yqVar = (yq) executorCompletionService.take().get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (yqVar.yq().contains("玩偶")) {
                return yqVar.SN();
            }
            String yq2 = yqVar.yq();
            if (!yq2.isEmpty() && !yq2.contains("404 Not Found") && !yq2.contains("400 Bad Request")) {
                return yqVar.SN();
            }
        }
        newFixedThreadPool.shutdown();
        return "";
    }
}
