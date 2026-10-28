package android.content.pm;

public class Signature {
    private final String value;

    public Signature(byte[] signature) {
        this.value = signature == null ? "" : java.util.Arrays.toString(signature);
    }

    public Signature(String signature) {
        this.value = signature == null ? "" : signature;
    }

    public byte[] toByteArray() {
        return value.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Signature && value.equals(((Signature) other).value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}