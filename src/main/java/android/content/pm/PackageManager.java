package android.content.pm;

import java.util.Collections;
import java.util.List;

public abstract class PackageManager {

    public static class NameNotFoundException extends Exception {
        public NameNotFoundException() {
        }

        public NameNotFoundException(String name) {
            super(name);
        }
    }

    public PackageInfo getPackageInfo(String packageName, int flags) throws NameNotFoundException {
        PackageInfo info = new PackageInfo();
        info.packageName = packageName == null ? "" : packageName;
        info.versionName = "3.0.4.0";
        info.versionCode = 2603002;
        // 给一个固定签名，避免爬虫因 signatures 为 null 而空指针
        byte[] fake = new byte[32];
        for (int i = 0; i < fake.length; i++) {
            fake[i] = (byte) (i * 7 + 13);
        }
        info.signatures = new Signature[]{new Signature(fake)};
        return info;
    }

    public List<PackageInfo> getInstalledPackages(int flags) {
        return Collections.emptyList();
    }

    public List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags) {
        return Collections.emptyList();
    }

    public android.content.pm.ApplicationInfo getApplicationInfo(String packageName, int flags) throws NameNotFoundException {
        return new android.content.pm.ApplicationInfo();
    }

    public CharSequence getApplicationLabel(android.content.pm.ApplicationInfo info) {
        return "";
    }
}