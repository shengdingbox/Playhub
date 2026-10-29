package com.tvbox.web.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SpiderClassPatcherTest {

    @TempDir
    Path tempDir;

    @Test
    void rewritesOnlyMethodRefOwnerAndInvokesSuperAtRuntime() throws Exception {
        Path jar = tempDir.resolve("self-super.jar");
        writeJar(jar, "fixture/Base.class", baseClass(true),
                "fixture/Child.class", childClass(0x0001, false));
        byte[] originalChild = childClass(0x0001, false);

        SpiderClassPatcher.PatchReport report = SpiderClassPatcher.patchJar(jar, null, getClass().getClassLoader());

        assertEquals(1, report.getSelfSuperPatches());
        assertEquals(1, report.getChangedClasses());
        assertFalse(report.isProxyPatched());
        try (URLClassLoader loader = new URLClassLoader(new URL[]{jar.toUri().toURL()}, null)) {
            Class<?> child = loader.loadClass("fixture.Child");
            Object instance = child.getDeclaredConstructor().newInstance();
            assertEquals("base", child.getMethod("value").invoke(instance));
        }

        byte[] patchedChild = readClass(jar, "fixture/Child.class");
        assertEquals(originalChild.length, patchedChild.length);
        int changedBytes = 0;
        for (int i = 0; i < originalChild.length; i++) {
            if (originalChild[i] != patchedChild[i]) {
                changedBytes++;
            }
        }
        // class_index 从 #2 改为 #4：高字节相同，因此文件内容只有低字节实际变化。
        assertEquals(1, changedBytes);
    }

    @Test
    void skipsMethodRefReusedByAnotherInstruction() throws Exception {
        Path jar = tempDir.resolve("shared-ref.jar");
        writeJar(jar, "fixture/Base.class", baseClass(true),
                "fixture/Child.class", childClass(0x0001, true));
        byte[] before = Files.readAllBytes(jar);

        SpiderClassPatcher.PatchReport report = SpiderClassPatcher.patchJar(jar, null, getClass().getClassLoader());

        assertEquals(0, report.getSelfSuperPatches());
        assertEquals(0, report.getChangedClasses());
        assertArrayEquals(before, Files.readAllBytes(jar));
    }

    @Test
    void skipsPrivateRecursiveMethodEvenWhenSuperDeclaresIt() throws Exception {
        Path jar = tempDir.resolve("private-recursion.jar");
        writeJar(jar, "fixture/Base.class", baseClass(true),
                "fixture/Child.class", childClass(0x0002, false));
        byte[] before = Files.readAllBytes(jar);

        SpiderClassPatcher.PatchReport report = SpiderClassPatcher.patchJar(jar, null, getClass().getClassLoader());

        assertEquals(0, report.getSelfSuperPatches());
        assertArrayEquals(before, Files.readAllBytes(jar));
    }

    @Test
    void completesOnlyMinimalProxyWithApplicationProxyUrl() throws Exception {
        Path jar = tempDir.resolve("proxy.jar");
        String prefix = "http://127.0.0.1:18080/proxy?do=";
        writeJar(jar, "com/github/catvod/spider/Proxy.class",
                SpiderClassPatcher.buildSpiderProxyClass(prefix, false));

        SpiderClassPatcher.PatchReport report = SpiderClassPatcher.patchJar(jar, prefix, getClass().getClassLoader());

        assertTrue(report.isProxyPatched());
        assertEquals(1, report.getChangedClasses());
        try (URLClassLoader loader = new URLClassLoader(new URL[]{jar.toUri().toURL()}, null)) {
            Class<?> proxy = loader.loadClass("com.github.catvod.spider.Proxy");
            Object url = proxy.getMethod("getProxyUrlDo", String.class).invoke(null, "pan");
            assertEquals(prefix + "pan", url);
        }
    }

    private static byte[] baseClass(boolean withValue) throws IOException {
        List<byte[]> cp = new ArrayList<>();
        int thisName = utf8(cp, "fixture/Base");                         // 1
        int thisClass = clazz(cp, thisName);                            // 2
        int objectName = utf8(cp, "java/lang/Object");                  // 3
        int objectClass = clazz(cp, objectName);                        // 4
        int code = utf8(cp, "Code");                                   // 5
        int init = utf8(cp, "<init>");                                 // 6
        int voidDescriptor = utf8(cp, "()V");                          // 7
        int initType = nameAndType(cp, init, voidDescriptor);            // 8
        int objectInit = methodRef(cp, objectClass, initType);           // 9
        int value = utf8(cp, "value");                                 // 10
        int valueDescriptor = utf8(cp, "()Ljava/lang/String;");        // 11
        int baseText = utf8(cp, "base");                               // 12
        int baseString = string(cp, baseText);                          // 13

        List<byte[]> methods = new ArrayList<>();
        methods.add(method(0x0001, init, voidDescriptor, codeAttribute(code,
                concat(new byte[]{0x2a, (byte) 0xb7}, u2(objectInit), new byte[]{(byte) 0xb1}), 1, 1)));
        if (withValue) {
            methods.add(method(0x0001, value, valueDescriptor, codeAttribute(code,
                    new byte[]{0x12, (byte) baseString, (byte) 0xb0}, 1, 1)));
        }
        return classFile(cp, thisClass, objectClass, methods);
    }

    private static byte[] childClass(int valueAccess, boolean sharedRef) throws IOException {
        List<byte[]> cp = new ArrayList<>();
        int thisName = utf8(cp, "fixture/Child");                        // 1
        int thisClass = clazz(cp, thisName);                            // 2
        int baseName = utf8(cp, "fixture/Base");                        // 3
        int baseClass = clazz(cp, baseName);                            // 4
        int code = utf8(cp, "Code");                                   // 5
        int init = utf8(cp, "<init>");                                 // 6
        int voidDescriptor = utf8(cp, "()V");                          // 7
        int initType = nameAndType(cp, init, voidDescriptor);            // 8
        int baseInit = methodRef(cp, baseClass, initType);               // 9
        int value = utf8(cp, "value");                                 // 10
        int valueDescriptor = utf8(cp, "()Ljava/lang/String;");        // 11
        int valueType = nameAndType(cp, value, valueDescriptor);         // 12
        int selfValue = methodRef(cp, thisClass, valueType);             // 13

        List<byte[]> methods = new ArrayList<>();
        methods.add(method(0x0001, init, voidDescriptor, codeAttribute(code,
                concat(new byte[]{0x2a, (byte) 0xb7}, u2(baseInit), new byte[]{(byte) 0xb1}), 1, 1)));
        byte[] valueCode = sharedRef
                ? concat(new byte[]{0x2a, (byte) 0xb7}, u2(selfValue),
                        new byte[]{0x57, 0x2a, (byte) 0xb7}, u2(selfValue), new byte[]{(byte) 0xb0})
                : concat(new byte[]{0x2a, (byte) 0xb7}, u2(selfValue), new byte[]{(byte) 0xb0});
        methods.add(method(valueAccess, value, valueDescriptor, codeAttribute(code, valueCode, 1, 1)));
        return classFile(cp, thisClass, baseClass, methods);
    }

    private static byte[] classFile(List<byte[]> cp, int thisClass, int superClass, List<byte[]> methods) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.writeBytes(new byte[]{(byte) 0xca, (byte) 0xfe, (byte) 0xba, (byte) 0xbe});
        out.writeBytes(u2(0));
        out.writeBytes(u2(49));
        out.writeBytes(u2(cp.size() + 1));
        cp.forEach(out::writeBytes);
        out.writeBytes(u2(0x0021));
        out.writeBytes(u2(thisClass));
        out.writeBytes(u2(superClass));
        out.writeBytes(u2(0));
        out.writeBytes(u2(0));
        out.writeBytes(u2(methods.size()));
        methods.forEach(out::writeBytes);
        out.writeBytes(u2(0));
        return out.toByteArray();
    }

    private static byte[] method(int access, int name, int descriptor, byte[] code) {
        return concat(u2(access), u2(name), u2(descriptor), u2(1), code);
    }

    private static byte[] codeAttribute(int codeName, byte[] code, int maxStack, int maxLocals) {
        byte[] body = concat(u2(maxStack), u2(maxLocals), u4(code.length), code, u2(0), u2(0));
        return concat(u2(codeName), u4(body.length), body);
    }

    private static int utf8(List<byte[]> cp, String value) {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        return add(cp, concat(new byte[]{1}, u2(bytes.length), bytes));
    }

    private static int clazz(List<byte[]> cp, int name) {
        return add(cp, concat(new byte[]{7}, u2(name)));
    }

    private static int string(List<byte[]> cp, int text) {
        return add(cp, concat(new byte[]{8}, u2(text)));
    }

    private static int nameAndType(List<byte[]> cp, int name, int descriptor) {
        return add(cp, concat(new byte[]{12}, u2(name), u2(descriptor)));
    }

    private static int methodRef(List<byte[]> cp, int owner, int type) {
        return add(cp, concat(new byte[]{10}, u2(owner), u2(type)));
    }

    private static int add(List<byte[]> cp, byte[] entry) {
        cp.add(entry);
        return cp.size();
    }

    private static byte[] u2(int value) {
        return new byte[]{(byte) (value >>> 8), (byte) value};
    }

    private static byte[] u4(int value) {
        return new byte[]{(byte) (value >>> 24), (byte) (value >>> 16), (byte) (value >>> 8), (byte) value};
    }

    private static byte[] concat(byte[]... parts) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (byte[] part : parts) {
            out.writeBytes(part);
        }
        return out.toByteArray();
    }

    private static void writeJar(Path jar, String firstName, byte[] firstBytes,
                                 String secondName, byte[] secondBytes) throws IOException {
        try (JarOutputStream out = new JarOutputStream(Files.newOutputStream(jar))) {
            put(out, firstName, firstBytes);
            put(out, secondName, secondBytes);
        }
    }

    private static void writeJar(Path jar, String name, byte[] bytes) throws IOException {
        try (JarOutputStream out = new JarOutputStream(Files.newOutputStream(jar))) {
            put(out, name, bytes);
        }
    }

    private static void put(JarOutputStream out, String name, byte[] bytes) throws IOException {
        out.putNextEntry(new JarEntry(name));
        out.write(bytes);
        out.closeEntry();
    }

    private static byte[] readClass(Path jar, String name) throws IOException {
        try (java.util.jar.JarFile jarFile = new java.util.jar.JarFile(jar.toFile());
             java.io.InputStream in = jarFile.getInputStream(jarFile.getJarEntry(name))) {
            return in.readAllBytes();
        }
    }
}
