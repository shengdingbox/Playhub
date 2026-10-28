package android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class View {

    public static final int VISIBLE = 0;
    public static final int INVISIBLE = 4;
    public static final int GONE = 8;
    public static final int NO_ID = -1;

    public interface OnClickListener {
        void onClick(View v);
    }

    public interface OnLongClickListener {
        boolean onLongClick(View v);
    }

    public interface OnTouchListener {
        boolean onTouch(View v, MotionEvent event);
    }

    public interface OnKeyListener {
        boolean onKey(View v, int keyCode, KeyEvent event);
    }

    public interface OnFocusChangeListener {
        void onFocusChange(View v, boolean hasFocus);
    }

    public interface OnScrollChangeListener {
        void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY);
    }

    protected Context context;
    private OnClickListener onClickListener;
    private OnLongClickListener onLongClickListener;
    private OnTouchListener onTouchListener;
    private OnKeyListener onKeyListener;
    private OnFocusChangeListener onFocusChangeListener;
    private int visibility = VISIBLE;
    private ViewGroup.LayoutParams layoutParams;
    private Object tag;
    private int id = NO_ID;
    private boolean enabled = true;
    private boolean focusable;
    private boolean clickable;
    private boolean selected;
    private float alpha = 1f;

    public View() {
    }

    public View(Context context) {
        this.context = context;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.onClickListener = listener;
    }

    public void setOnLongClickListener(OnLongClickListener listener) {
        this.onLongClickListener = listener;
    }

    public void setOnTouchListener(OnTouchListener listener) {
        this.onTouchListener = listener;
    }

    public void setOnKeyListener(OnKeyListener listener) {
        this.onKeyListener = listener;
    }

    public void setOnFocusChangeListener(OnFocusChangeListener listener) {
        this.onFocusChangeListener = listener;
    }

    public boolean performClick() {
        if (onClickListener != null) {
            onClickListener.onClick(this);
            return true;
        }
        return false;
    }

    public boolean performLongClick() {
        return onLongClickListener != null && onLongClickListener.onLongClick(this);
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.layoutParams = layoutParams;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        return layoutParams;
    }

    public void requestFocus() {
    }

    public boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) {
        return true;
    }

    public void setPadding(int left, int top, int right, int bottom) {
    }

    public void setPaddingRelative(int start, int top, int end, int bottom) {
    }

    public void setBackgroundColor(int color) {
    }

    public void setBackground(Drawable background) {
    }

    public void setBackgroundResource(int resid) {
    }

    public void setBackgroundDrawable(Drawable background) {
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }

    public Object getTag() {
        return tag;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setFocusable(boolean focusable) {
        this.focusable = focusable;
    }

    public void setFocusableInTouchMode(boolean focusableInTouchMode) {
    }

    public boolean isFocused() {
        return false;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

    public boolean isClickable() {
        return clickable;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public float getAlpha() {
        return alpha;
    }

    public void invalidate() {
    }

    public void postInvalidate() {
    }

    public boolean post(Runnable action) {
        if (action != null) {
            action.run();
        }
        return true;
    }

    public boolean postDelayed(Runnable action, long delayMillis) {
        if (action != null) {
            action.run();
        }
        return true;
    }

    public void setMinimumWidth(int minWidth) {
    }

    public void setMinimumHeight(int minHeight) {
    }

    public void measure(int widthMeasureSpec, int heightMeasureSpec) {
    }

    public void layout(int l, int t, int r, int b) {
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public int getMeasuredWidth() {
        return 0;
    }

    public int getMeasuredHeight() {
        return 0;
    }

    public void setTranslationX(float translationX) {
    }

    public void setTranslationY(float translationY) {
    }

    public void setRotation(float rotation) {
    }

    public void setScaleX(float scaleX) {
    }

    public void setScaleY(float scaleY) {
    }

    public void setKeepScreenOn(boolean keepScreenOn) {
    }

    public void setSystemUiVisibility(int visibility) {
    }

    public void setLayerType(int layerType, Object paint) {
    }

    public void bringToFront() {
    }

    public void setOverScrollMode(int overScrollMode) {
    }

    public Context getContext() {
        return context == null ? new Context() : context;
    }
}