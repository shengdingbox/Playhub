package android.webkit;

import java.io.InputStream;
import java.util.Map;

/**
 * 最小 desktop-JVM 桩：WebResourceResponse。
 */
public class WebResourceResponse {

    private String mimeType;
    private String encoding;
    private int statusCode = 200;
    private String reasonPhrase = "OK";
    private InputStream data;

    public WebResourceResponse() {
    }

    public WebResourceResponse(String mimeType, String encoding, InputStream data) {
        this.mimeType = mimeType;
        this.encoding = encoding;
        this.data = data;
    }

    public WebResourceResponse(String mimeType, String encoding, int statusCode, String reasonPhrase, Map<String, String> responseHeaders, InputStream data) {
        this.mimeType = mimeType;
        this.encoding = encoding;
        this.statusCode = statusCode;
        this.reasonPhrase = reasonPhrase;
        this.data = data;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setStatusCode(int code) {
        this.statusCode = code;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setReasonPhrase(String phrase) {
        this.reasonPhrase = phrase;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public void setData(InputStream data) {
        this.data = data;
    }

    public InputStream getData() {
        return data;
    }
}
