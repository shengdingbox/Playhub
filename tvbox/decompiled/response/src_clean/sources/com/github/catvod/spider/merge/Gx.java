package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class Gx {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static abstract class N extends yq {
        private final String yq;

        N(String str) {
            this.yq = str;
        }

        public final String toString() {
            return this.yq;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN extends yq {
        private final char yq = ',';

        @Override // com.github.catvod.spider.merge.Gx
        public final boolean SN(char c) {
            return c == this.yq;
        }

        public final String toString() {
            char c = this.yq;
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            for (int i = 0; i < 4; i++) {
                cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
                c = (char) (c >> 4);
            }
            String copyValueOf = String.copyValueOf(cArr);
            StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(copyValueOf);
            sb.append("')");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class tF extends N {
        static final tF SN = new tF();

        private tF() {
            super("CharMatcher.none()");
        }

        @Override // com.github.catvod.spider.merge.Gx
        public final boolean SN(char c) {
            return false;
        }

        @Override // com.github.catvod.spider.merge.Gx
        public final int yq(CharSequence charSequence, int i) {
            C0072So.tF(i, charSequence.length());
            return -1;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static abstract class yq extends Gx {
        yq() {
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static final class zH extends N {
        static final int SN = Integer.numberOfLeadingZeros(31);
        static final zH N = new zH();

        zH() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.github.catvod.spider.merge.Gx
        public final boolean SN(char c) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> SN) == c;
        }
    }

    protected Gx() {
    }

    public abstract boolean SN(char c);

    public int yq(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C0072So.tF(i, length);
        while (i < length) {
            if (SN(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
