package android.view;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends View {

    public static class LayoutParams {
        public static final int MATCH_PARENT = -1;
        public static final int WRAP_CONTENT = -2;

        public int width;
        public int height;

        public LayoutParams(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    public static class MarginLayoutParams extends LayoutParams {

        public int leftMargin;
        public int topMargin;
        public int rightMargin;
        public int bottomMargin;

        public MarginLayoutParams(int width, int height) {
            super(width, height);
        }

        public MarginLayoutParams(LayoutParams source) {
            super(source == null ? -1 : source.width, source == null ? -1 : source.height);
            if (source instanceof MarginLayoutParams more) {
                this.leftMargin = more.leftMargin;
                this.topMargin = more.topMargin;
                this.rightMargin = more.rightMargin;
                this.bottomMargin = more.bottomMargin;
            }
        }

        public void setMargins(int left, int top, int right, int bottom) {
            this.leftMargin = left;
            this.topMargin = top;
            this.rightMargin = right;
            this.bottomMargin = bottom;
        }

        public int getMarginStart() {
            return leftMargin;
        }

        public int getMarginEnd() {
            return rightMargin;
        }
    }

    public static final int FOCUS_BEFORE_DESCENDANTS = 0x20000;
    public static final int FOCUS_AFTER_DESCENDANTS = 0x40000;
    public static final int FOCUS_BLOCK_DESCENDANTS = 0x60000;

    private final List<View> children = new ArrayList<>();
    private boolean clipChildren = true;
    private int descendantFocusability = FOCUS_BEFORE_DESCENDANTS;

    public ViewGroup() {
        super();
    }

    public ViewGroup(Context context) {
        super(context);
    }

    public void addView(View view) {
        children.add(view);
    }

    public void addView(View view, int index) {
        children.add(index, view);
    }

    public void addView(View view, LayoutParams params) {
        view.setLayoutParams(params);
        children.add(view);
    }

    public void addView(View view, int width, int height) {
        children.add(view);
    }

    public void removeView(View view) {
        children.remove(view);
    }

    public void removeViewAt(int index) {
        if (index >= 0 && index < children.size()) {
            children.remove(index);
        }
    }

    public void removeViews(int start, int count) {
        for (int i = 0; i < count && start < children.size(); i++) {
            children.remove(start);
        }
    }

    public void removeAllViews() {
        children.clear();
    }

    public int getChildCount() {
        return children.size();
    }

    public View getChildAt(int index) {
        return index >= 0 && index < children.size() ? children.get(index) : null;
    }

    public int indexOfChild(View child) {
        return children.indexOf(child);
    }

    public void setClipChildren(boolean clipChildren) {
        this.clipChildren = clipChildren;
    }

    public boolean getClipChildren() {
        return clipChildren;
    }

    public void setDescendantFocusability(int focusability) {
        this.descendantFocusability = focusability;
    }

    public int getDescendantFocusability() {
        return descendantFocusability;
    }

    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }

    public void bringChildToFront(View child) {
    }
}