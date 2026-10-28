package com.github.catvod.spider.mergeguard.OoOoO0O0o0oOoO0O;

import com.github.catvod.spider.Init;
import java.util.Objects;
import test.MainActivity;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public final /* synthetic */ class oOoOoOoOoOoOoO0o implements Runnable {
    public final /* synthetic */ MainActivity oOoOoOoOoOoOoO0o;

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.oOoOoOoOoOoOoO0o;
        int i = MainActivity.oOoOoOoOoOoOoO0o;
        Objects.requireNonNull(mainActivity);
        try {
            Init.init(mainActivity.getApplicationContext());
            throw null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
