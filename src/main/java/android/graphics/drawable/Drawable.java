package android.graphics.drawable;

public abstract class Drawable {

    public interface Callback {
        void invalidateDrawable(Drawable who);
    }

    public void setBounds(int left, int top, int right, int bottom) {
    }

    public int getIntrinsicWidth() {
        return 0;
    }

    public int getIntrinsicHeight() {
        return 0;
    }

    public void setAlpha(int alpha) {
    }

    public void setVisible(boolean visible, boolean restart) {
    }

    public void setCallback(Callback cb) {
    }
}