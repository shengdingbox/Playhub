package android.view.inputmethod;

public final class InputMethodManager {

    public static final int SHOW_IMPLICIT = 1;

    public boolean showSoftInput(android.view.View view, int flags) {
        return false;
    }

    public boolean hideSoftInputFromWindow(android.os.IBinder windowToken, int flags) {
        return false;
    }
}