package android.view;

public class KeyEvent {

    public static final int ACTION_DOWN = 0;
    public static final int ACTION_UP = 1;
    public static final int KEYCODE_BACK = 4;
    public static final int KEYCODE_ENTER = 66;

    public int getAction() {
        return ACTION_DOWN;
    }

    public int getKeyCode() {
        return 0;
    }
}