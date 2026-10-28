package android.webkit;

import android.content.Context;
import android.view.View;

/**
 * 最小 desktop-JVM 桩：部分加固爬虫的 Init 会引用 WebView（用于 UI 线程/网页加载）。
 * 桌面上不加载真实网页，全部为无操作。
 */
public class WebView extends View {

    private final WebSettings settings = new WebSettings();

    public WebView(Context context) {
        super(context);
    }

    public WebSettings getSettings() {
        return settings;
    }

    public void setWebViewClient(WebViewClient client) {
    }

    public void setWebChromeClient(Object client) {
    }

    public void loadUrl(String url) {
    }

    public void loadUrl(String url, java.util.Map<String, String> additionalHttpHeaders) {
    }

    public void loadData(String data, String mimeType, String encoding) {
    }

    public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
    }

    public void postUrl(String url, byte[] postData) {
    }

    public void stopLoading() {
    }

    public void reload() {
    }

    public void destroy() {
    }

    public String getUrl() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public void addJavascriptInterface(Object obj, String name) {
    }

    public void evaluateJavascript(String script, Object callback) {
    }

    public static void setWebContentsDebuggingEnabled(boolean enabled) {
    }
}
