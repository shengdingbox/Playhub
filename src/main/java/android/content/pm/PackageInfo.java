package android.content.pm;

public class PackageInfo {
    public String packageName = "";
    public String versionName = "";
    public int versionCode = 0;
    /** 部分加固爬虫通过它做签名校验。 */
    public Signature[] signatures;
}