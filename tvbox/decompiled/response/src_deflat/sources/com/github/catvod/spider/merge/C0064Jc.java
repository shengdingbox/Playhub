package com.github.catvod.spider.merge;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.github.catvod.spider.merge.Jc  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0064Jc {
    private static final boolean SN;
    private static final Set<File> yq = new HashSet();

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder yq2 = Sq.yq("VM with version ", property);
        yq2.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", yq2.toString());
        SN = z;
    }

    private static void N(Context context, File file, File file2) {
        Set<File> set = yq;
        synchronized (set) {
            if (!set.contains(file)) {
                set.add(file);
                int i = Build.VERSION.SDK_INT;
                if (i > 20) {
                    Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + i + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                }
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (classLoader == null) {
                        Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                        return;
                    }
                    SN(context);
                    File file3 = new File(file2, "code_cache");
                    try {
                        t0(file3);
                    } catch (IOException unused) {
                        file3 = new File(context.getFilesDir(), "code_cache");
                        t0(file3);
                    }
                    File file4 = new File(file3, "secondary-dexes");
                    t0(file4);
                    eY eYVar = new eY(file, file4);
                    IOException e = null;
                    try {
                        i(classLoader, file4, eYVar.zH(context, false));
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e2);
                        i(classLoader, file4, eYVar.zH(context, true));
                    }
                    try {
                        eYVar.close();
                    } catch (IOException e3) {
                        e = e3;
                    }
                    if (e != null) {
                        throw e;
                    }
                } catch (RuntimeException e4) {
                    Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e4);
                }
            }
        }
    }

    private static void SN(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder yq2 = by.yq("Clearing old secondary dex dir (");
            yq2.append(file.getPath());
            yq2.append(").");
            Log.i("MultiDex", yq2.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder yq3 = by.yq("Failed to list secondary dex dir content (");
                yq3.append(file.getPath());
                yq3.append(").");
                Log.w("MultiDex", yq3.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder yq4 = by.yq("Trying to delete old file ");
                yq4.append(file2.getPath());
                yq4.append(" of size ");
                yq4.append(file2.length());
                Log.i("MultiDex", yq4.toString());
                if (!file2.delete()) {
                    StringBuilder yq5 = by.yq("Failed to delete old file ");
                    yq5.append(file2.getPath());
                    Log.w("MultiDex", yq5.toString());
                } else {
                    StringBuilder yq6 = by.yq("Deleted old file ");
                    yq6.append(file2.getPath());
                    Log.i("MultiDex", yq6.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder yq7 = by.yq("Failed to delete secondary dex dir ");
                yq7.append(file.getPath());
                Log.w("MultiDex", yq7.toString());
                return;
            }
            StringBuilder yq8 = by.yq("Deleted old secondary dex dir ");
            yq8.append(file.getPath());
            Log.i("MultiDex", yq8.toString());
        }
    }

    private static void i(ClassLoader classLoader, File file, List<? extends File> list) {
        IOException[] iOExceptionArr;
        if (!list.isEmpty()) {
            Object obj = tF(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    yq(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field tF = tF(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) tF.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                            arrayList.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        tF.set(obj, iOExceptionArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
        }
    }

    private static void t0(File file) {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder yq2 = by.yq("Failed to create dir ");
                yq2.append(file.getPath());
                yq2.append(". Parent file is null.");
                str = yq2.toString();
            } else {
                StringBuilder yq3 = by.yq("Failed to create dir ");
                yq3.append(file.getPath());
                yq3.append(". parent file is a dir ");
                yq3.append(parentFile.isDirectory());
                yq3.append(", a file ");
                yq3.append(parentFile.isFile());
                yq3.append(", exists ");
                yq3.append(parentFile.exists());
                yq3.append(", readable ");
                yq3.append(parentFile.canRead());
                yq3.append(", writable ");
                yq3.append(parentFile.canWrite());
                str = yq3.toString();
            }
            Log.e("MultiDex", str);
            StringBuilder yq4 = by.yq("Failed to create directory ");
            yq4.append(file.getPath());
            throw new IOException(yq4.toString());
        }
    }

    private static Field tF(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    static void yq(Object obj, String str, Object[] objArr) {
        Field tF = tF(obj, str);
        Object[] objArr2 = (Object[]) tF.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        tF.set(obj, objArr3);
    }

    public static void zH(Context context) {
        ApplicationInfo applicationInfo;
        String str;
        Log.i("MultiDex", "Installing application");
        if (SN) {
            str = "VM has multidex support, MultiDex support library is disabled.";
        } else {
            try {
                try {
                    applicationInfo = context.getApplicationInfo();
                } catch (RuntimeException e) {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                    applicationInfo = null;
                }
                if (applicationInfo == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                } else {
                    N(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                    str = "install done";
                }
            } catch (Exception e2) {
                Log.e("MultiDex", "MultiDex installation failure", e2);
                StringBuilder yq2 = by.yq("MultiDex installation failed (");
                yq2.append(e2.getMessage());
                yq2.append(").");
                throw new RuntimeException(yq2.toString());
            }
        }
        Log.i("MultiDex", str);
    }
}
