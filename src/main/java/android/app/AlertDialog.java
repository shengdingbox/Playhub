package android.app;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class AlertDialog extends Dialog implements DialogInterface {

    private DialogInterface.OnCancelListener onCancelListener;
    private DialogInterface.OnDismissListener onDismissListener;
    private DialogInterface.OnShowListener onShowListener;
    private DialogInterface.OnClickListener onClickListener;
    private final Map<Integer, Button> buttons = new HashMap<>();
    private CharSequence title = "";
    private CharSequence message = "";

    public AlertDialog() {
        super();
    }

    public AlertDialog(Context context) {
        super(context);
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener listener) {
        this.onCancelListener = listener;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener listener) {
        this.onDismissListener = listener;
    }

    public void setOnShowListener(DialogInterface.OnShowListener listener) {
        this.onShowListener = listener;
    }

    public void setTitle(CharSequence value) {
        this.title = value;
    }

    public void setMessage(CharSequence value) {
        this.message = value;
    }

    public void setCancelable(boolean cancelable) {
    }

    public void setCanceledOnTouchOutside(boolean cancel) {
    }

    public void setIcon(int resId) {
    }

    public void setView(View view) {
    }

    public Button getButton(int whichButton) {
        return buttons.computeIfAbsent(whichButton, ignored -> new Button(context));
    }

    public void setButton(int whichButton, CharSequence text, DialogInterface.OnClickListener listener) {
        buttons.computeIfAbsent(whichButton, ignored -> new Button(context));
        this.onClickListener = listener;
    }

    @Override
    public void show() {
        if (onShowListener != null) {
            onShowListener.onShow(this);
        }
    }

    @Override
    public void dismiss() {
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
    }

    @Override
    public void cancel() {
        if (onCancelListener != null) {
            onCancelListener.onCancel(this);
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (onClickListener != null) {
            onClickListener.onClick(dialog, which);
        }
    }

    public static class Builder {

        private final AlertDialog dialog;
        private final Context builderContext;

        public Builder(Context context) {
            this.builderContext = context;
            this.dialog = new AlertDialog(context);
        }

        public Builder setTitle(CharSequence value) {
            dialog.setTitle(value);
            return this;
        }

        public Builder setTitle(int titleId) {
            return this;
        }

        public Builder setMessage(CharSequence value) {
            dialog.setMessage(value);
            return this;
        }

        public Builder setMessage(int messageId) {
            return this;
        }

        public Builder setIcon(int iconId) {
            return this;
        }

        public Builder setView(View view) {
            dialog.setView(view);
            return this;
        }

        public Builder setCancelable(boolean cancelable) {
            dialog.setCancelable(cancelable);
            return this;
        }

        public Builder setPositiveButton(CharSequence text, DialogInterface.OnClickListener listener) {
            dialog.setButton(android.content.DialogInterface.BUTTON_POSITIVE, text, listener);
            return this;
        }

        public Builder setPositiveButton(int textId, DialogInterface.OnClickListener listener) {
            return this;
        }

        public Builder setNegativeButton(CharSequence text, DialogInterface.OnClickListener listener) {
            dialog.setButton(android.content.DialogInterface.BUTTON_NEGATIVE, text, listener);
            return this;
        }

        public Builder setNegativeButton(int textId, DialogInterface.OnClickListener listener) {
            return this;
        }

        public Builder setNeutralButton(CharSequence text, DialogInterface.OnClickListener listener) {
            dialog.setButton(android.content.DialogInterface.BUTTON_NEUTRAL, text, listener);
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener listener) {
            dialog.setOnDismissListener(listener);
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener listener) {
            dialog.setOnCancelListener(listener);
            return this;
        }

        public AlertDialog create() {
            return dialog;
        }

        public AlertDialog show() {
            dialog.show();
            return dialog;
        }
    }
}