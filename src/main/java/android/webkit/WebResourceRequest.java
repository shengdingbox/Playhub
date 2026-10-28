package android.webkit;

import android.net.Uri;

/**
 * 最小 desktop-JVM 桩：WebResourceRequest。
 */
public class WebResourceRequest {

    private final Uri url;
    private final String method;

    public WebResourceRequest() {
        this(Uri.parse(""), "GET");
    }

    public WebResourceRequest(Uri url, String method) {
        this.url = url;
        this.method = method;
    }

    public Uri getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public boolean isForMainFrame() {
        return true;
    }

    public boolean hasGesture() {
        return false;
    }

    public boolean isRedirect() {
        return false;
    }

    public java.util.Map<String, String> getRequestHeaders() {
        return new java.util.HashMap<>();
    }
}
