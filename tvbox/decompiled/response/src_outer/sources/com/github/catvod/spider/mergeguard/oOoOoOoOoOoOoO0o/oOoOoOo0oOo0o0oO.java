package com.github.catvod.spider.mergeguard.oOoOoOoOoOoOoO0o;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public final class oOoOoOo0oOo0o0oO {
    private static final boolean oOo0oOo0Oo0oO0Oo;
    private static final HashSet oOoOoOoOoOoOoO0o = new HashSet();

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
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(property);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        oOo0oOo0Oo0oO0Oo = z;
    }

    private static void OoOoOo0O0o0oO0o0(ClassLoader classLoader, File file, List list) {
        IOException[] iOExceptionArr;
        if (!list.isEmpty()) {
            Object obj = oOoOoOo0O0O0oO0o(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    oOoOoOoOoOoOoO0o(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field oOoOoOo0O0O0oO0o = oOoOoOo0O0O0oO0o(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) oOoOoOo0O0O0oO0o.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                            arrayList.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        oOoOoOo0O0O0oO0o.set(obj, iOExceptionArr);
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

    private static void oOo0oOo0Oo0oO0Oo(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder oOoOoOoOoOoOoO0o2 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Clearing old secondary dex dir (");
            oOoOoOoOoOoOoO0o2.append(file.getPath());
            oOoOoOoOoOoOoO0o2.append(").");
            Log.i("MultiDex", oOoOoOoOoOoOoO0o2.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder oOoOoOoOoOoOoO0o3 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Failed to list secondary dex dir content (");
                oOoOoOoOoOoOoO0o3.append(file.getPath());
                oOoOoOoOoOoOoO0o3.append(").");
                Log.w("MultiDex", oOoOoOoOoOoOoO0o3.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder oOoOoOoOoOoOoO0o4 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Trying to delete old file ");
                oOoOoOoOoOoOoO0o4.append(file2.getPath());
                oOoOoOoOoOoOoO0o4.append(" of size ");
                oOoOoOoOoOoOoO0o4.append(file2.length());
                Log.i("MultiDex", oOoOoOoOoOoOoO0o4.toString());
                if (!file2.delete()) {
                    StringBuilder oOoOoOoOoOoOoO0o5 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Failed to delete old file ");
                    oOoOoOoOoOoOoO0o5.append(file2.getPath());
                    Log.w("MultiDex", oOoOoOoOoOoOoO0o5.toString());
                } else {
                    StringBuilder oOoOoOoOoOoOoO0o6 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Deleted old file ");
                    oOoOoOoOoOoOoO0o6.append(file2.getPath());
                    Log.i("MultiDex", oOoOoOoOoOoOoO0o6.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder oOoOoOoOoOoOoO0o7 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Failed to delete secondary dex dir ");
                oOoOoOoOoOoOoO0o7.append(file.getPath());
                Log.w("MultiDex", oOoOoOoOoOoOoO0o7.toString());
                return;
            }
            StringBuilder oOoOoOoOoOoOoO0o8 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Deleted old secondary dex dir ");
            oOoOoOoOoOoOoO0o8.append(file.getPath());
            Log.i("MultiDex", oOoOoOoOoOoOoO0o8.toString());
        }
    }

    public static void oOoO0o0oOo0oO0Oo(Context context) {
        ApplicationInfo applicationInfo;
        String str;
        Log.i("MultiDex", "Installing application");
        if (oOo0oOo0Oo0oO0Oo) {
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
                    oOoOoOo0oOo0o0oO(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                    str = "install done";
                }
            } catch (Exception e2) {
                Log.e("MultiDex", "MultiDex installation failure", e2);
                StringBuilder oOoOoOoOoOoOoO0o2 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("MultiDex installation failed (");
                oOoOoOoOoOoOoO0o2.append(e2.getMessage());
                oOoOoOoOoOoOoO0o2.append(").");
                throw new RuntimeException(oOoOoOoOoOoOoO0o2.toString());
            }
        }
        Log.i("MultiDex", str);
    }

    private static void oOoOo0O0Oo0o0OoO(File file) {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder oOoOoOoOoOoOoO0o2 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Failed to create dir ");
                oOoOoOoOoOoOoO0o2.append(file.getPath());
                oOoOoOoOoOoOoO0o2.append(". Parent file is null.");
                str = oOoOoOoOoOoOoO0o2.toString();
            } else {
                StringBuilder oOoOoOoOoOoOoO0o3 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Failed to create dir ");
                oOoOoOoOoOoOoO0o3.append(file.getPath());
                oOoOoOoOoOoOoO0o3.append(". parent file is a dir ");
                oOoOoOoOoOoOoO0o3.append(parentFile.isDirectory());
                oOoOoOoOoOoOoO0o3.append(", a file ");
                oOoOoOoOoOoOoO0o3.append(parentFile.isFile());
                oOoOoOoOoOoOoO0o3.append(", exists ");
                oOoOoOoOoOoOoO0o3.append(parentFile.exists());
                oOoOoOoOoOoOoO0o3.append(", readable ");
                oOoOoOoOoOoOoO0o3.append(parentFile.canRead());
                oOoOoOoOoOoOoO0o3.append(", writable ");
                oOoOoOoOoOoOoO0o3.append(parentFile.canWrite());
                str = oOoOoOoOoOoOoO0o3.toString();
            }
            Log.e("MultiDex", str);
            StringBuilder oOoOoOoOoOoOoO0o4 = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("Failed to create directory ");
            oOoOoOoOoOoOoO0o4.append(file.getPath());
            throw new IOException(oOoOoOoOoOoOoO0o4.toString());
        }
    }

    private static Field oOoOoOo0O0O0oO0o(Object obj, String str) {
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

    private static void oOoOoOo0oOo0o0oO(Context context, File file, File file2) {
        HashSet hashSet = oOoOoOoOoOoOoO0o;
        synchronized (hashSet) {
            if (!hashSet.contains(file)) {
                hashSet.add(file);
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
                    oOo0oOo0Oo0oO0Oo(context);
                    File file3 = new File(file2, "code_cache");
                    try {
                        oOoOo0O0Oo0o0OoO(file3);
                    } catch (IOException unused) {
                        file3 = new File(context.getFilesDir(), "code_cache");
                        oOoOo0O0Oo0o0OoO(file3);
                    }
                    File file4 = new File(file3, "secondary-dexes");
                    oOoOo0O0Oo0o0OoO(file4);
                    OoOoOo0O0o0oO0o0 ooOoOo0O0o0oO0o0 = new OoOoOo0O0o0oO0o0(file, file4);
                    IOException e = null;
                    try {
                        OoOoOo0O0o0oO0o0(classLoader, file4, ooOoOo0O0o0oO0o0.oOoO0o0oOo0oO0Oo(context, false));
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e2);
                        OoOoOo0O0o0oO0o0(classLoader, file4, ooOoOo0O0o0oO0o0.oOoO0o0oOo0oO0Oo(context, true));
                    }
                    try {
                        ooOoOo0O0o0oO0o0.close();
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

    static void oOoOoOoOoOoOoO0o(Object obj, String str, Object[] objArr) {
        Field oOoOoOo0O0O0oO0o = oOoOoOo0O0O0oO0o(obj, str);
        Object[] objArr2 = (Object[]) oOoOoOo0O0O0oO0o.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        oOoOoOo0O0O0oO0o.set(obj, objArr3);
    }
}
