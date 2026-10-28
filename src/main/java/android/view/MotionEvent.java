package android.view;

public class MotionEvent {

    public static final int ACTION_DOWN = 0;
    public static final int ACTION_UP = 1;
    public static final int ACTION_MOVE = 2;

    public int getAction() {
        return ACTION_DOWN;
    }

    public float getX() {
        return 0f;
    }

    public float getY() {
        return 0f;
    }
}