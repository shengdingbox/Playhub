package android.content;

import android.net.Uri;

import java.util.HashMap;
import java.util.Map;

public class Intent {

    public static final String ACTION_VIEW = "android.intent.action.VIEW";
    public static final String ACTION_MAIN = "android.intent.action.MAIN";

    private String action;
    private Uri data;
    private final Map<String, Object> extras = new HashMap<>();

    public Intent() {
    }

    public Intent(String action) {
        this.action = action;
    }

    public Intent(String action, Uri uri) {
        this.action = action;
        this.data = uri;
    }

    public String getAction() {
        return action;
    }

    public Intent setAction(String action) {
        this.action = action;
        return this;
    }

    public Uri getData() {
        return data;
    }

    public Intent setData(Uri data) {
        this.data = data;
        return this;
    }

    public Intent putExtra(String name, String value) {
        extras.put(name, value);
        return this;
    }

    public Intent putExtra(String name, int value) {
        extras.put(name, value);
        return this;
    }

    public Intent putExtra(String name, boolean value) {
        extras.put(name, value);
        return this;
    }

    public String getStringExtra(String name) {
        Object value = extras.get(name);
        return value == null ? null : String.valueOf(value);
    }

    public int getIntExtra(String name, int defaultValue) {
        Object value = extras.get(name);
        return value instanceof Number ? ((Number) value).intValue() : defaultValue;
    }

    public boolean getBooleanExtra(String name, boolean defaultValue) {
        Object value = extras.get(name);
        return value instanceof Boolean ? (Boolean) value : defaultValue;
    }

    public Intent addFlags(int flags) {
        return this;
    }
}