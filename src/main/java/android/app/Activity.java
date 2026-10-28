package android.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;

public class Activity extends Context {

    private final Window window = new Window();
    private int contentViewId;

    public Activity() {
        ActivityThread.registerActivity(this);
    }

    public ComponentName getComponentName() {
        return new ComponentName(getPackageName(), getClass().getName());
    }

    public Application getApplication() {
        return AppGlobals.getInitialApplication();
    }

    public Window getWindow() {
        return window;
    }

    public void setContentView(View view) {
        window.setContentView(view);
    }

    public void setContentView(int layoutResId) {
        this.contentViewId = layoutResId;
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams params) {
        window.addContentView(view, params);
    }

    public View findViewById(int id) {
        return new View();
    }

    public void runOnUiThread(Runnable action) {
        if (action != null) {
            action.run();
        }
    }

    public void finish() {
    }

    public boolean isFinishing() {
        return false;
    }

    public PackageManager getPackageManager() {
        return new PackageManager() {
        };
    }

    public int checkSelfPermission(String permission) {
        return 0;
    }

    public void requestPermissions(String[] permissions, int requestCode) {
    }

    public void setTitle(CharSequence title) {
    }

    public void setTitle(int titleId) {
    }
}