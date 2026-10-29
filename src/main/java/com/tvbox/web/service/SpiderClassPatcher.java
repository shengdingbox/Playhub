package com.tvbox.web.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;

/**
 * 对 dex2jar 的转换产物做保守的就地兼容修补，不触碰原始下载 jar。
 *
 * <p>此类只使用 JDK 解析 class 文件。自递归修补仅改 Methodref 的
 * {@code class_index} 两个字节，不重排方法体，也不重新计算栈映射帧。</p>
 */
public final class SpiderClassPatcher {

    private static final int ACC_PRIVATE = 0x0002;
    private static final int INVOKESPECIAL = 0xb7;
    private static final String SPIDER_PROXY_CLASS = "com/github/catvod/spider/Proxy";
    private static final String PROXY_DESCRIPTOR = "(Ljava/util/Map;)[Ljava/lang/Object;";
    private static final String GET_PROXY_URL_DO_DESCRIPTOR = "(Ljava/lang/String;)Ljava/lang/String;";
    private static final int MAX_HIERARCHY_DEPTH = 32;

    private SpiderClassPatcher() {
    }

    /**
     * 修补整个转换产物。只有实际修改时才重写 jar；写出失败会保留原文件。
     *
     * @param jarPath dex2jar 转换产物
     * @param proxyUrlPrefix 形如 {@code http://127.0.0.1:18080/proxy?do=}；为空时仅做 classFix
     * @param applicationClassLoader 用于只读解析应用内的 Spider 基类，不触发类初始化
     */
    public static PatchReport patchJar(Path jarPath, String proxyUrlPrefix, ClassLoader applicationClassLoader) throws IOException {
        List<EntryData> entries = readJar(jarPath);
        Map<String, EntryData> classes = new HashMap<>();
        for (EntryData entry : entries) {
            if (entry.name.endsWith(".class") && !entry.name.startsWith("META-INF/versions/")) {
                classes.putIfAbsent(entry.name.substring(0, entry.name.length() - 6), entry);
            }
        }
        HierarchyResolver hierarchy = new HierarchyResolver(classes, applicationClassLoader);
        PatchReport report = new PatchReport();

        for (EntryData entry : entries) {
            if (!entry.name.endsWith(".class")) {
                continue;
            }
            try {
                ClassPatch patch = patchSelfSuperCalls(entry.bytes, hierarchy);
                if (patch.bytes != null) {
                    entry.bytes = patch.bytes;
                    report.selfSuperPatches += patch.patched;
                    report.changedClasses++;
                    report.details.addAll(patch.details);
                }
            } catch (Exception ex) {
                // 单个畸形/未知版本 class 不应让原本可用的转换产物加载失败。
                report.skippedClasses++;
            }
        }

        EntryData proxy = classes.get(SPIDER_PROXY_CLASS);
        if (proxy != null && proxyUrlPrefix != null && !proxyUrlPrefix.isBlank()) {
            try {
                ClassFile info = ClassFile.parse(proxy.bytes, false);
                if (isMinimalSpiderProxy(info)) {
                    proxy.bytes = buildSpiderProxyClass(proxyUrlPrefix, true);
                    report.proxyPatched = true;
                    report.changedClasses++;
                    report.details.add(SPIDER_PROXY_CLASS + ".getProxyUrlDo -> " + proxyUrlPrefix);
                }
            } catch (Exception ex) {
                report.skippedClasses++;
            }
        }

        if (report.changedClasses > 0) {
            writeJar(jarPath, entries);
        }
        return report;
    }

    private static ClassPatch patchSelfSuperCalls(byte[] input, HierarchyResolver hierarchy) throws IOException {
        ClassFile info = ClassFile.parse(input, true);
        if (info.methods.isEmpty()) {
            return ClassPatch.NONE;
        }

        Map<Integer, Integer> usage = new HashMap<>();
        for (MethodInfo method : info.methods) {
            for (Invoke invoke : method.invokes) {
                usage.merge(invoke.ref, 1, Integer::sum);
            }
        }

        byte[] output = null;
        int patched = 0;
        List<String> details = new ArrayList<>();
        for (MethodInfo method : info.methods) {
            if ("<init>".equals(method.name) || "<clinit>".equals(method.name)
                    || (method.access & ACC_PRIVATE) != 0 || method.invokes.isEmpty()) {
                continue;
            }
            Set<Integer> candidates = new LinkedHashSet<>();
            for (Invoke invoke : method.invokes) {
                if (invoke.op != INVOKESPECIAL) {
                    continue;
                }
                CpEntry ref = info.cp(invoke.ref);
                if (ref == null || ref.tag != 10 || ref.a != info.thisClass) {
                    continue;
                }
                CpEntry nameAndType = info.cp(ref.b);
                if (nameAndType == null || nameAndType.tag != 12
                        || !method.name.equals(info.utf8(nameAndType.a))
                        || !method.descriptor.equals(info.utf8(nameAndType.b))) {
                    continue;
                }
                candidates.add(invoke.ref);
            }
            if (candidates.isEmpty() || info.superClass == 0) {
                continue;
            }

            Boolean declared = hierarchy.declares(info.superName, method.name, method.descriptor);
            if (!Boolean.TRUE.equals(declared)) {
                continue;
            }
            int methodPatches = 0;
            for (Integer ref : candidates) {
                // 严格限定全类只有这一处指令引用。即使同一方法复用，也宁可漏修。
                if (usage.getOrDefault(ref, 0) != 1) {
                    continue;
                }
                if (output == null) {
                    output = input.clone();
                }
                writeU2(output, info.cpOffsets[ref] + 1, info.superClass);
                methodPatches++;
            }
            if (methodPatches > 0) {
                patched += methodPatches;
                details.add(info.name + "." + method.name + method.descriptor + " -> " + info.superName);
            }
        }
        return new ClassPatch(output, patched, details);
    }

    /** 超类链只读解析：true=声明，false=链已完整解析但未声明，null=未知（保守跳过）。 */
    private static final class HierarchyResolver {
        private final Map<String, EntryData> jarClasses;
        private final ClassLoader applicationClassLoader;
        private final Map<String, Optional<ClassFile>> cache = new HashMap<>();

        private HierarchyResolver(Map<String, EntryData> jarClasses, ClassLoader applicationClassLoader) {
            this.jarClasses = jarClasses;
            this.applicationClassLoader = applicationClassLoader;
        }

        private Boolean declares(String superName, String methodName, String descriptor) {
            String current = superName;
            Set<String> visited = new LinkedHashSet<>();
            for (int depth = 0; depth < MAX_HIERARCHY_DEPTH && current != null && !current.isEmpty(); depth++) {
                if (!visited.add(current)) {
                    return null;
                }
                Optional<ClassFile> resolved = infoOf(current);
                if (resolved.isEmpty()) {
                    return null;
                }
                ClassFile info = resolved.get();
                for (MethodInfo method : info.methods) {
                    if (method.name.equals(methodName) && method.descriptor.equals(descriptor)) {
                        return true;
                    }
                }
                current = info.superName;
            }
            return visited.size() >= MAX_HIERARCHY_DEPTH ? null : false;
        }

        private Optional<ClassFile> infoOf(String className) {
            Optional<ClassFile> cached = cache.get(className);
            if (cached != null) {
                return cached;
            }
            Optional<ClassFile> result = Optional.empty();
            try {
                byte[] bytes = null;
                EntryData entry = jarClasses.get(className);
                if (entry != null) {
                    bytes = entry.bytes;
                } else if (applicationClassLoader != null) {
                    String resource = className + ".class";
                    try (InputStream in = applicationClassLoader.getResourceAsStream(resource)) {
                        if (in != null) {
                            bytes = in.readAllBytes();
                        }
                    }
                    if (bytes == null) {
                        try (InputStream in = ClassLoader.getSystemResourceAsStream(resource)) {
                            if (in != null) {
                                bytes = in.readAllBytes();
                            }
                        }
                    }
                }
                if (bytes != null) {
                    result = Optional.of(ClassFile.parse(bytes, false));
                }
            } catch (Exception ex) {
                result = Optional.empty();
            }
            cache.put(className, result);
            return result;
        }
    }

    private static boolean isMinimalSpiderProxy(ClassFile info) {
        if (!SPIDER_PROXY_CLASS.equals(info.name)) {
            return false;
        }
        boolean hasProxy = false;
        for (MethodInfo method : info.methods) {
            if ("getProxyUrlDo".equals(method.name)) {
                return false;
            }
            if ("proxy".equals(method.name) && PROXY_DESCRIPTOR.equals(method.descriptor)) {
                hasProxy = true;
            } else if (!"<init>".equals(method.name)) {
                return false;
            }
        }
        return hasProxy;
    }

    /** 与 Win-box 相同，生成 v49 直线字节码，避免引入 StackMapTable。 */
    static byte[] buildSpiderProxyClass(String proxyUrlPrefix, boolean withGetProxyUrlDo) throws IOException {
        List<byte[]> cp = new ArrayList<>();
        int thisName = addUtf8(cp, SPIDER_PROXY_CLASS);
        int thisClass = addClass(cp, thisName);
        int objectName = addUtf8(cp, "java/lang/Object");
        int objectClass = addClass(cp, objectName);
        int codeName = addUtf8(cp, "Code");
        int proxyName = addUtf8(cp, "proxy");
        int proxyDescriptor = addUtf8(cp, PROXY_DESCRIPTOR);
        int initName = addUtf8(cp, "com/github/catvod/spider/Init");
        int initClass = addClass(cp, initName);
        int proxyInvokeName = addUtf8(cp, "proxyInvoke");
        int proxyInvokeType = addNameAndType(cp, proxyInvokeName, proxyDescriptor);
        int proxyInvokeRef = addMethodRef(cp, initClass, proxyInvokeType);
        int getName = addUtf8(cp, "getProxyUrlDo");
        int getDescriptor = addUtf8(cp, GET_PROXY_URL_DO_DESCRIPTOR);
        int base = addUtf8(cp, proxyUrlPrefix);
        int baseString = addString(cp, base);
        int stringName = addUtf8(cp, "java/lang/String");
        int stringClass = addClass(cp, stringName);
        int concatName = addUtf8(cp, "concat");
        int concatType = addNameAndType(cp, concatName, getDescriptor);
        int concatRef = addMethodRef(cp, stringClass, concatType);

        byte[] proxyCode = concat(
                new byte[]{0x2a},                         // aload_0
                new byte[]{(byte) 0xb8}, u2(proxyInvokeRef),
                new byte[]{(byte) 0xb0});                 // areturn
        byte[] getCode = concat(
                new byte[]{0x12, (byte) baseString},       // ldc
                new byte[]{0x2a},                         // aload_0
                new byte[]{(byte) 0xb6}, u2(concatRef),
                new byte[]{(byte) 0xb0});                 // areturn

        List<byte[]> methods = new ArrayList<>();
        methods.add(method(0x0009, proxyName, proxyDescriptor,
                codeAttribute(codeName, proxyCode, 1, 1)));
        if (withGetProxyUrlDo) {
            methods.add(method(0x0009, getName, getDescriptor,
                    codeAttribute(codeName, getCode, 2, 1)));
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.writeBytes(new byte[]{(byte) 0xca, (byte) 0xfe, (byte) 0xba, (byte) 0xbe});
        out.writeBytes(u2(0));
        out.writeBytes(u2(49));
        out.writeBytes(u2(cp.size() + 1));
        for (byte[] entry : cp) {
            out.writeBytes(entry);
        }
        out.writeBytes(u2(0x0031));                       // public final super
        out.writeBytes(u2(thisClass));
        out.writeBytes(u2(objectClass));
        out.writeBytes(u2(0));                            // interfaces
        out.writeBytes(u2(0));                            // fields
        out.writeBytes(u2(methods.size()));
        for (byte[] method : methods) {
            out.writeBytes(method);
        }
        out.writeBytes(u2(0));                            // class attributes
        return out.toByteArray();
    }

    private static byte[] method(int access, int name, int descriptor, byte[] code) {
        return concat(u2(access), u2(name), u2(descriptor), u2(1), code);
    }

    private static byte[] codeAttribute(int codeName, byte[] code, int maxStack, int maxLocals) {
        byte[] body = concat(u2(maxStack), u2(maxLocals), u4(code.length), code, u2(0), u2(0));
        return concat(u2(codeName), u4(body.length), body);
    }

    private static int addUtf8(List<byte[]> cp, String value) {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        return add(cp, concat(new byte[]{1}, u2(bytes.length), bytes));
    }

    private static int addClass(List<byte[]> cp, int name) {
        return add(cp, concat(new byte[]{7}, u2(name)));
    }

    private static int addString(List<byte[]> cp, int utf8) {
        return add(cp, concat(new byte[]{8}, u2(utf8)));
    }

    private static int addNameAndType(List<byte[]> cp, int name, int descriptor) {
        return add(cp, concat(new byte[]{12}, u2(name), u2(descriptor)));
    }

    private static int addMethodRef(List<byte[]> cp, int owner, int nameAndType) {
        return add(cp, concat(new byte[]{10}, u2(owner), u2(nameAndType)));
    }

    private static int add(List<byte[]> cp, byte[] entry) {
        cp.add(entry);
        return cp.size();
    }

    private static List<EntryData> readJar(Path jarPath) throws IOException {
        List<EntryData> entries = new ArrayList<>();
        try (JarFile jar = new JarFile(jarPath.toFile())) {
            Enumeration<JarEntry> enumeration = jar.entries();
            while (enumeration.hasMoreElements()) {
                JarEntry entry = enumeration.nextElement();
                byte[] bytes;
                try (InputStream in = jar.getInputStream(entry)) {
                    bytes = in.readAllBytes();
                }
                entries.add(new EntryData(entry, bytes));
            }
        }
        return entries;
    }

    private static void writeJar(Path jarPath, List<EntryData> entries) throws IOException {
        Path target = jarPath.toAbsolutePath();
        Path parent = target.getParent();
        if (parent == null) {
            throw new IOException("jar 没有父目录: " + jarPath);
        }
        Files.createDirectories(parent);
        Path temp = Files.createTempFile(parent, "class-patch-", ".jar");
        boolean moved = false;
        try {
            try (JarOutputStream out = new JarOutputStream(Files.newOutputStream(temp))) {
                for (EntryData entry : entries) {
                    // 类变化后原签名必然失效；dex2jar 产物通常无签名，这里兼容带签名输入。
                    if (isSignatureEntry(entry.name)) {
                        continue;
                    }
                    JarEntry outputEntry = new JarEntry(entry.name);
                    if (entry.time >= 0) {
                        outputEntry.setTime(entry.time);
                    }
                    if (entry.comment != null) {
                        outputEntry.setComment(entry.comment);
                    }
                    if (entry.extra != null) {
                        outputEntry.setExtra(entry.extra);
                    }
                    out.putNextEntry(outputEntry);
                    if (!entry.directory) {
                        out.write(entry.bytes);
                    }
                    out.closeEntry();
                }
            }
            Files.move(temp, target, StandardCopyOption.REPLACE_EXISTING);
            moved = true;
        } finally {
            if (!moved) {
                Files.deleteIfExists(temp);
            }
        }
    }

    private static boolean isSignatureEntry(String name) {
        String upper = name.toUpperCase(Locale.ROOT);
        if (!upper.startsWith("META-INF/")) {
            return false;
        }
        String fileName = upper.substring("META-INF/".length());
        return fileName.endsWith(".SF") || fileName.endsWith(".RSA")
                || fileName.endsWith(".DSA") || fileName.startsWith("SIG-");
    }

    private static final class EntryData {
        private final String name;
        private final long time;
        private final String comment;
        private final byte[] extra;
        private final boolean directory;
        private byte[] bytes;

        private EntryData(JarEntry entry, byte[] bytes) {
            this.name = entry.getName();
            this.time = entry.getTime();
            this.comment = entry.getComment();
            this.extra = entry.getExtra();
            this.directory = entry.isDirectory();
            this.bytes = bytes;
        }
    }

    public static final class PatchReport {
        private int selfSuperPatches;
        private int changedClasses;
        private int skippedClasses;
        private boolean proxyPatched;
        private final List<String> details = new ArrayList<>();

        public int getSelfSuperPatches() {
            return selfSuperPatches;
        }

        public int getChangedClasses() {
            return changedClasses;
        }

        public int getSkippedClasses() {
            return skippedClasses;
        }

        public boolean isProxyPatched() {
            return proxyPatched;
        }

        public List<String> getDetails() {
            return List.copyOf(details);
        }
    }

    private static final class ClassPatch {
        private static final ClassPatch NONE = new ClassPatch(null, 0, List.of());
        private final byte[] bytes;
        private final int patched;
        private final List<String> details;

        private ClassPatch(byte[] bytes, int patched, List<String> details) {
            this.bytes = bytes;
            this.patched = patched;
            this.details = details;
        }
    }

    private static final class CpEntry {
        private final int tag;
        private String text;
        private int a;
        private int b;

        private CpEntry(int tag) {
            this.tag = tag;
        }
    }

    private static final class MethodInfo {
        private final int access;
        private final String name;
        private final String descriptor;
        private final List<Invoke> invokes = new ArrayList<>();

        private MethodInfo(int access, String name, String descriptor) {
            this.access = access;
            this.name = name;
            this.descriptor = descriptor;
        }
    }

    private static final class Invoke {
        private final int op;
        private final int ref;

        private Invoke(int op, int ref) {
            this.op = op;
            this.ref = ref;
        }
    }

    private static final class ClassFile {
        private final CpEntry[] cp;
        private final int[] cpOffsets;
        private final int thisClass;
        private final int superClass;
        private final String name;
        private final String superName;
        private final List<MethodInfo> methods;

        private ClassFile(CpEntry[] cp, int[] cpOffsets, int thisClass, int superClass,
                          String name, String superName, List<MethodInfo> methods) {
            this.cp = cp;
            this.cpOffsets = cpOffsets;
            this.thisClass = thisClass;
            this.superClass = superClass;
            this.name = name;
            this.superName = superName;
            this.methods = methods;
        }

        private static ClassFile parse(byte[] bytes, boolean scanCode) throws IOException {
            Cursor cursor = new Cursor(bytes);
            if (cursor.u4() != 0xCAFEBABEL) {
                throw new IOException("不是 class 文件");
            }
            cursor.u2(); // minor
            cursor.u2(); // major
            int cpCount = cursor.u2();
            if (cpCount == 0) {
                throw new IOException("非法常量池大小");
            }
            CpEntry[] cp = new CpEntry[cpCount];
            int[] cpOffsets = new int[cpCount];
            for (int i = 1; i < cpCount; i++) {
                cpOffsets[i] = cursor.position();
                int tag = cursor.u1();
                CpEntry entry = new CpEntry(tag);
                cp[i] = entry;
                switch (tag) {
                    case 1 -> {
                        int length = cursor.u2();
                        entry.text = new String(cursor.bytes(length), StandardCharsets.UTF_8);
                    }
                    case 3, 4 -> cursor.skip(4);
                    case 5, 6 -> {
                        cursor.skip(8);
                        i++;
                    }
                    case 7, 8, 16, 19, 20 -> entry.a = cursor.u2();
                    case 9, 10, 11, 12, 17, 18 -> {
                        entry.a = cursor.u2();
                        entry.b = cursor.u2();
                    }
                    case 15 -> cursor.skip(3);
                    default -> throw new IOException("未知常量池 tag " + tag);
                }
            }

            cursor.u2(); // access_flags
            int thisClass = cursor.u2();
            int superClass = cursor.u2();
            int interfaceCount = cursor.u2();
            cursor.skip((long) interfaceCount * 2);
            skipFields(cursor);

            int methodCount = cursor.u2();
            List<MethodInfo> methods = new ArrayList<>(methodCount);
            ClassFile partial = new ClassFile(cp, cpOffsets, thisClass, superClass, "", "", methods);
            String thisName = partial.className(thisClass);
            String superName = partial.className(superClass);
            for (int i = 0; i < methodCount; i++) {
                int access = cursor.u2();
                String name = partial.utf8(cursor.u2());
                String descriptor = partial.utf8(cursor.u2());
                MethodInfo method = new MethodInfo(access, name, descriptor);
                methods.add(method);
                int attributeCount = cursor.u2();
                for (int a = 0; a < attributeCount; a++) {
                    String attributeName = partial.utf8(cursor.u2());
                    long attributeLength = cursor.u4();
                    int dataOffset = cursor.position();
                    if (scanCode && "Code".equals(attributeName)) {
                        Cursor codeCursor = new Cursor(bytes, dataOffset, checkedEnd(dataOffset, attributeLength, bytes.length));
                        codeCursor.u2(); // max_stack
                        codeCursor.u2(); // max_locals
                        long codeLength = codeCursor.u4();
                        byte[] code = codeCursor.bytes(checkedLength(codeLength));
                        method.invokes.addAll(scanInvokes(code));
                    }
                    cursor.position(checkedEnd(dataOffset, attributeLength, bytes.length));
                }
            }
            return new ClassFile(cp, cpOffsets, thisClass, superClass, thisName, superName, methods);
        }

        private static void skipFields(Cursor cursor) throws IOException {
            int fields = cursor.u2();
            for (int i = 0; i < fields; i++) {
                cursor.skip(6);
                int attributes = cursor.u2();
                for (int a = 0; a < attributes; a++) {
                    cursor.u2();
                    long length = cursor.u4();
                    cursor.skip(length);
                }
            }
        }

        private CpEntry cp(int index) {
            return index > 0 && index < cp.length ? cp[index] : null;
        }

        private String utf8(int index) {
            CpEntry entry = cp(index);
            return entry != null && entry.tag == 1 && entry.text != null ? entry.text : "";
        }

        private String className(int index) {
            if (index == 0) {
                return "";
            }
            CpEntry entry = cp(index);
            return entry != null && entry.tag == 7 ? utf8(entry.a) : "";
        }
    }

    private static List<Invoke> scanInvokes(byte[] code) throws IOException {
        List<Invoke> invokes = new ArrayList<>();
        for (int i = 0; i < code.length; ) {
            int op = code[i] & 0xff;
            int length = instructionLength(code, i);
            if (length < 1 || i + length > code.length) {
                throw new IOException("非法或截断的字节码指令");
            }
            if (op == 0xb6 || op == INVOKESPECIAL || op == 0xb8 || op == 0xb9) {
                invokes.add(new Invoke(op, readU2(code, i + 1)));
            }
            i += length;
        }
        return invokes;
    }

    /** JVM 规范指令长度；switch/wide 特判。畸形输入直接失败，绝不零步循环或误改。 */
    private static int instructionLength(byte[] code, int offset) throws IOException {
        int op = code[offset] & 0xff;
        if (op == 0xaa || op == 0xab) {
            int aligned = (offset + 4) & ~3;
            int headerLength = op == 0xaa ? 12 : 8;
            if (aligned < 0 || aligned + headerLength > code.length) {
                throw new IOException("截断的 switch 指令");
            }
            long length;
            if (op == 0xaa) {
                int low = (int) readU4(code, aligned + 4);
                int high = (int) readU4(code, aligned + 8);
                long count = (long) high - low + 1;
                if (count < 0) {
                    throw new IOException("非法 tableswitch 范围");
                }
                length = (long) aligned - offset + 12 + count * 4;
            } else {
                long count = readU4(code, aligned + 4);
                if (count > Integer.MAX_VALUE) {
                    throw new IOException("非法 lookupswitch 数量");
                }
                length = (long) aligned - offset + 8 + count * 8;
            }
            if (length < 1 || length > code.length - offset) {
                throw new IOException("非法 switch 指令长度");
            }
            return (int) length;
        }
        if (op == 0xc4) {
            if (offset + 1 >= code.length) {
                throw new IOException("截断的 wide 指令");
            }
            return (code[offset + 1] & 0xff) == 0x84 ? 6 : 4;
        }
        int length = fixedInstructionLength(op);
        if (offset + length > code.length) {
            throw new IOException("截断的字节码指令");
        }
        return length;
    }

    private static int fixedInstructionLength(int op) {
        if (op == 0x10 || op == 0x12 || (op >= 0x15 && op <= 0x19)
                || (op >= 0x36 && op <= 0x3a) || op == 0xa9 || op == 0xbc) {
            return 2;
        }
        if (op == 0x11 || op == 0x13 || op == 0x14 || op == 0x84
                || (op >= 0x99 && op <= 0xa8) || (op >= 0xb2 && op <= 0xb8)
                || op == 0xbb || op == 0xbd || op == 0xc0 || op == 0xc1
                || op == 0xc6 || op == 0xc7) {
            return 3;
        }
        if (op == 0xb9 || op == 0xba || op == 0xc8 || op == 0xc9) {
            return 5;
        }
        if (op == 0xc5) {
            return 4;
        }
        return 1;
    }

    private static int checkedLength(long value) throws IOException {
        if (value < 0 || value > Integer.MAX_VALUE) {
            throw new IOException("class 属性过大");
        }
        return (int) value;
    }

    private static int checkedEnd(int offset, long length, int limit) throws IOException {
        long end = offset + length;
        if (length < 0 || end < offset || end > limit) {
            throw new IOException("class 属性越界");
        }
        return (int) end;
    }

    private static int readU2(byte[] bytes, int offset) {
        return ((bytes[offset] & 0xff) << 8) | (bytes[offset + 1] & 0xff);
    }

    private static long readU4(byte[] bytes, int offset) {
        return ((long) (bytes[offset] & 0xff) << 24)
                | ((long) (bytes[offset + 1] & 0xff) << 16)
                | ((long) (bytes[offset + 2] & 0xff) << 8)
                | (long) (bytes[offset + 3] & 0xff);
    }

    private static void writeU2(byte[] bytes, int offset, int value) {
        bytes[offset] = (byte) (value >>> 8);
        bytes[offset + 1] = (byte) value;
    }

    private static byte[] u2(int value) {
        return new byte[]{(byte) (value >>> 8), (byte) value};
    }

    private static byte[] u4(long value) {
        return new byte[]{(byte) (value >>> 24), (byte) (value >>> 16),
                (byte) (value >>> 8), (byte) value};
    }

    private static byte[] concat(byte[]... parts) {
        int length = Arrays.stream(parts).mapToInt(part -> part.length).sum();
        byte[] result = new byte[length];
        int offset = 0;
        for (byte[] part : parts) {
            System.arraycopy(part, 0, result, offset, part.length);
            offset += part.length;
        }
        return result;
    }

    private static final class Cursor {
        private final byte[] bytes;
        private final int limit;
        private int position;

        private Cursor(byte[] bytes) {
            this(bytes, 0, bytes.length);
        }

        private Cursor(byte[] bytes, int position, int limit) {
            this.bytes = bytes;
            this.position = position;
            this.limit = limit;
        }

        private int position() {
            return position;
        }

        private void position(int value) throws IOException {
            if (value < 0 || value > limit) {
                throw new IOException("class 读取越界");
            }
            position = value;
        }

        private int u1() throws IOException {
            require(1);
            return bytes[position++] & 0xff;
        }

        private int u2() throws IOException {
            require(2);
            int value = readU2(bytes, position);
            position += 2;
            return value;
        }

        private long u4() throws IOException {
            require(4);
            long value = readU4(bytes, position);
            position += 4;
            return value;
        }

        private byte[] bytes(int length) throws IOException {
            require(length);
            byte[] result = Arrays.copyOfRange(bytes, position, position + length);
            position += length;
            return result;
        }

        private void skip(long length) throws IOException {
            int checked = checkedLength(length);
            require(checked);
            position += checked;
        }

        private void require(int length) throws IOException {
            if (length < 0 || position < 0 || position + length < position || position + length > limit) {
                throw new IOException("截断的 class 文件");
            }
        }
    }
}
