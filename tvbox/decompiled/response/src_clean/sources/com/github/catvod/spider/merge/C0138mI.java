package com.github.catvod.spider.merge;

import java.util.Arrays;
/* renamed from: com.github.catvod.spider.merge.mI  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0138mI {

    /* renamed from: com.github.catvod.spider.merge.mI$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class yq {
        private C0018yq N;
        private final C0018yq SN;
        private final String yq;

        /* renamed from: com.github.catvod.spider.merge.mI$yq$yq  reason: collision with other inner class name */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        private static class C0018yq {
            C0018yq SN;
            Object yq;

            C0018yq() {
            }
        }

        yq(String str) {
            C0018yq yqVar = new C0018yq();
            this.SN = yqVar;
            this.N = yqVar;
            this.yq = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.yq);
            sb.append('{');
            C0018yq yqVar = this.SN.SN;
            String str = "";
            while (yqVar != null) {
                Object obj = yqVar.yq;
                sb.append(str);
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                yqVar = yqVar.SN;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        public final yq yq(Object obj) {
            C0018yq yqVar = new C0018yq();
            this.N.SN = yqVar;
            this.N = yqVar;
            yqVar.yq = obj;
            return this;
        }
    }

    public static yq yq(Object obj) {
        return new yq(obj.getClass().getSimpleName());
    }
}
