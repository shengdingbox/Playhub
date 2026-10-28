package com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public final class oOo0oOo0Oo0oO0Oo {
    static final Class oOoOoOo0O0O0oO0o = oOo0oOo0Oo0oO0Oo.class;
    protected String oOo0oOo0Oo0oO0Oo;
    protected Hashtable oOoOoOo0oOo0o0oO = new Hashtable();
    protected Vector oOoOoOoOoOoOoO0o;

    static {
        new oOo0oOo0Oo0oO0Oo();
    }

    protected oOo0oOo0Oo0oO0Oo() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOo0oOo0Oo0oO0Oo oOoOoOoOoOoOoO0o() {
        /*
            java.lang.Class r0 = com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOo0oOo0Oo0oO0Oo.oOoOoOo0O0O0oO0o
            java.lang.String r1 = "/META-INF/services/org.xmlpull.v1.XmlPullParserFactory"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto Lad
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> Lb5
            r1.<init>()     // Catch: java.lang.Exception -> Lb5
        Lf:
            int r2 = r0.read()     // Catch: java.lang.Exception -> Lb5
            if (r2 >= 0) goto La3
            r0.close()     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Lb5
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "resource /META-INF/services/org.xmlpull.v1.XmlPullParserFactory that contained '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            java.util.Vector r3 = new java.util.Vector
            r3.<init>()
            r3 = 0
            r4 = 0
            r6 = r4
            r5 = 0
        L40:
            int r7 = r0.length()
            if (r5 < r7) goto L52
            if (r6 != 0) goto L4d
            com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOo0oOo0Oo0oO0Oo r6 = new com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOo0oOo0Oo0oO0Oo
            r6.<init>()
        L4d:
            r6.oOoOoOoOoOoOoO0o = r2
            r6.oOo0oOo0Oo0oO0Oo = r1
            return r6
        L52:
            r7 = 44
            int r7 = r0.indexOf(r7, r5)
            r8 = -1
            if (r7 != r8) goto L5f
            int r7 = r0.length()
        L5f:
            java.lang.String r5 = r0.substring(r5, r7)
            java.lang.Class r8 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = r8.newInstance()     // Catch: java.lang.Exception -> L6d
            goto L6e
        L6c:
            r8 = r4
        L6d:
            r9 = r4
        L6e:
            if (r8 == 0) goto La0
            boolean r10 = r9 instanceof org.xmlpull.v1.XmlPullParser
            r11 = 1
            if (r10 == 0) goto L7a
            r2.addElement(r8)
            r8 = 1
            goto L7b
        L7a:
            r8 = 0
        L7b:
            boolean r10 = r9 instanceof com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOo0oOo0Oo0oO0Oo
            if (r10 == 0) goto L85
            if (r6 != 0) goto L86
            r6 = r9
            com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOo0oOo0Oo0oO0Oo r6 = (com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOo0oOo0Oo0oO0Oo) r6
            goto L86
        L85:
            r11 = r8
        L86:
            if (r11 == 0) goto L89
            goto La0
        L89:
            com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOoOoOoOoOoOoO0o r0 = new com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOoOoOoOoOoOoO0o
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "incompatible class: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La0:
            int r5 = r7 + 1
            goto L40
        La3:
            r3 = 32
            if (r2 <= r3) goto Lf
            char r2 = (char) r2
            r1.append(r2)     // Catch: java.lang.Exception -> Lb5
            goto Lf
        Lad:
            com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOoOoOoOoOoOoO0o r0 = new com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOoOoOoOoOoOoO0o     // Catch: java.lang.Exception -> Lb5
            java.lang.String r1 = "resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb5
            throw r0     // Catch: java.lang.Exception -> Lb5
        Lb5:
            r0 = move-exception
            com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOoOoOoOoOoOoO0o r1 = new com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOoOoOoOoOoOoO0o
            r1.<init>(r0)
            goto Lbd
        Lbc:
            throw r1
        Lbd:
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOo0oOo0Oo0oO0Oo.oOoOoOoOoOoOoO0o():com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOo0oOo0Oo0oO0Oo");
    }

    public final XmlPullParser oOo0oOo0Oo0oO0Oo() {
        Vector vector = this.oOoOoOoOoOoOoO0o;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Factory initialization was incomplete - has not tried ");
            stringBuffer.append(this.oOo0oOo0Oo0oO0Oo);
            throw new oOoOoOoOoOoOoO0o(stringBuffer.toString());
        } else if (vector.size() != 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i = 0; i < this.oOoOoOoOoOoOoO0o.size(); i++) {
                Class cls = (Class) this.oOoOoOoOoOoOoO0o.elementAt(i);
                try {
                    XmlPullParser xmlPullParser = (XmlPullParser) cls.newInstance();
                    Enumeration keys = this.oOoOoOo0oOo0o0oO.keys();
                    while (keys.hasMoreElements()) {
                        String str = (String) keys.nextElement();
                        Boolean bool = (Boolean) this.oOoOoOo0oOo0o0oO.get(str);
                        if (bool != null && bool.booleanValue()) {
                            xmlPullParser.setFeature(str, true);
                        }
                    }
                    return xmlPullParser;
                } catch (Exception e) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(cls.getName());
                    stringBuffer3.append(": ");
                    stringBuffer3.append(e.toString());
                    stringBuffer3.append("; ");
                    stringBuffer2.append(stringBuffer3.toString());
                }
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("could not create parser: ");
            stringBuffer4.append((Object) stringBuffer2);
            throw new oOoOoOoOoOoOoO0o(stringBuffer4.toString());
        } else {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("No valid parser classes found in ");
            stringBuffer5.append(this.oOo0oOo0Oo0oO0Oo);
            throw new oOoOoOoOoOoOoO0o(stringBuffer5.toString());
        }
    }

    public final void oOoOoOo0oOo0o0oO() {
        this.oOoOoOo0oOo0o0oO.put("http://xmlpull.org/v1/doc/features.html#process-namespaces", new Boolean(true));
    }
}
