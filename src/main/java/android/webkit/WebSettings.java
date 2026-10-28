package android.webkit;

/**
 * 最小 desktop-JVM 桩：WebView 的设置项，全部无操作。
 */
public class WebSettings {

    public static final int LOAD_DEFAULT = -1;
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_NO_CACHE = 2;
    public static final int LOAD_CACHE_ONLY = 3;

    public void setJavaScriptEnabled(boolean flag) {
    }

    public void setDomStorageEnabled(boolean flag) {
    }

    public void setDatabaseEnabled(boolean flag) {
    }

    public void setAllowFileAccess(boolean allow) {
    }

    public void setAllowContentAccess(boolean allow) {
    }

    public void setLoadsImagesAutomatically(boolean flag) {
    }

    public void setBlockNetworkImage(boolean flag) {
    }

    public void setCacheMode(int mode) {
    }

    public void setUserAgentString(String ua) {
    }

    public String getUserAgentString() {
        return "Mozilla/5.0 (Linux; Android 11) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.91 Mobile Safari/537.36";
    }

    public void setSupportZoom(boolean support) {
    }

    public void setUseWideViewPort(boolean use) {
    }

    public void setLoadWithOverviewMode(boolean overview) {
    }

    public void setBuiltInZoomControls(boolean enabled) {
    }

    public void setDisplayZoomControls(boolean enabled) {
    }

    public void setMediaPlaybackRequiresUserGesture(boolean require) {
    }

    public void setMixedContentMode(int mode) {
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean flag) {
    }

    public void setTextZoom(int textZoom) {
    }
}
