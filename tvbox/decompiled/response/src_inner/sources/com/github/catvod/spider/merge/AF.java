package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class AF implements Cloneable {
    private String SN;
    private String yq;
    private static final Map<String, AF> KJ = new HashMap();
    private static final String[] q = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr"};
    private static final String[] B = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
    private static final String[] G = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
    private static final String[] G4 = {"pre", "plaintext", "title", "textarea"};
    private static final String[] dT = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    private static final String[] F5 = {"input", "keygen", "object", "select", "textarea"};
    private boolean N = true;
    private boolean tF = true;
    private boolean zH = false;
    private boolean i = false;
    private boolean t0 = false;
    private boolean Gc = false;
    private boolean M = false;

    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        for (int i = 0; i < 69; i++) {
            AF af = new AF(strArr[i]);
            KJ.put(af.yq, af);
        }
        for (String str : q) {
            AF af2 = new AF(str);
            af2.N = false;
            af2.tF = false;
            KJ.put(af2.yq, af2);
        }
        for (String str2 : B) {
            AF af3 = (AF) KJ.get(str2);
            li.B(af3);
            af3.zH = true;
        }
        for (String str3 : G) {
            AF af4 = (AF) KJ.get(str3);
            li.B(af4);
            af4.tF = false;
        }
        for (String str4 : G4) {
            AF af5 = (AF) KJ.get(str4);
            li.B(af5);
            af5.t0 = true;
        }
        for (String str5 : dT) {
            AF af6 = (AF) KJ.get(str5);
            li.B(af6);
            af6.Gc = true;
        }
        for (String str6 : F5) {
            AF af7 = (AF) KJ.get(str6);
            li.B(af7);
            af7.M = true;
        }
    }

    private AF(String str) {
        this.yq = str;
        this.SN = eb.zH(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    public static AF G(String str, r6 r6Var) {
        li.B(str);
        ?? r0 = KJ;
        AF af = (AF) r0.get(str);
        if (af != null) {
            return af;
        }
        String tF = r6Var.tF(str);
        li.KJ(tF);
        String zH = eb.zH(tF);
        AF af2 = (AF) r0.get(zH);
        if (af2 == null) {
            AF af3 = new AF(tF);
            af3.N = false;
            return af3;
        } else if (!r6Var.i() || tF.equals(zH)) {
            return af2;
        } else {
            try {
                AF af4 = (AF) super.clone();
                af4.yq = tF;
                return af4;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    public static boolean Gc(String str) {
        return KJ.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final AF B() {
        this.i = true;
        return this;
    }

    public final String KJ() {
        return this.SN;
    }

    public final boolean M() {
        return this.zH || this.i;
    }

    public final boolean N() {
        return this.N;
    }

    public final String SN() {
        return this.yq;
    }

    protected final Object clone() {
        try {
            return (AF) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AF)) {
            return false;
        }
        AF af = (AF) obj;
        return this.yq.equals(af.yq) && this.zH == af.zH && this.tF == af.tF && this.N == af.N && this.t0 == af.t0 && this.i == af.i && this.Gc == af.Gc && this.M == af.M;
    }

    public final int hashCode() {
        return (((((((((((((this.yq.hashCode() * 31) + (this.N ? 1 : 0)) * 31) + (this.tF ? 1 : 0)) * 31) + (this.zH ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.Gc ? 1 : 0)) * 31) + (this.M ? 1 : 0);
    }

    public final boolean i() {
        return !this.N;
    }

    public final boolean q() {
        return this.t0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    public final boolean t0() {
        return KJ.containsKey(this.yq);
    }

    public final boolean tF() {
        return this.zH;
    }

    public final String toString() {
        return this.yq;
    }

    public final boolean yq() {
        return this.tF;
    }

    public final boolean zH() {
        return this.Gc;
    }
}
