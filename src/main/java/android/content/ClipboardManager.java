package android.content;

public class ClipboardManager {

    private CharSequence text = "";

    public void setText(CharSequence text) {
        this.text = text;
    }

    public CharSequence getText() {
        return text;
    }

    public boolean hasText() {
        return text != null && text.length() > 0;
    }

    public ClipData getPrimaryClip() {
        return ClipData.newPlainText("", text);
    }
}