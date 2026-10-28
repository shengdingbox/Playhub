package android.content;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Minimal desktop-JVM stub of android.content.ContentValues（内存 Map 容器）。
 */
public class ContentValues {

    private final HashMap<String, Object> map = new HashMap<>();

    public ContentValues() {
    }

    public ContentValues(int size) {
    }

    public void put(String key, String value) {
        map.put(key, value);
    }

    public void put(String key, Integer value) {
        map.put(key, value);
    }

    public void put(String key, Long value) {
        map.put(key, value);
    }

    public void put(String key, Short value) {
        map.put(key, value);
    }

    public void put(String key, Byte value) {
        map.put(key, value);
    }

    public void put(String key, byte[] value) {
        map.put(key, value);
    }

    public void put(String key, Boolean value) {
        map.put(key, value);
    }

    public void put(String key, Float value) {
        map.put(key, value);
    }

    public void put(String key, Double value) {
        map.put(key, value);
    }

    public Object get(String key) {
        return map.get(key);
    }

    public String getAsString(String key) {
        Object value = map.get(key);
        return value == null ? null : value.toString();
    }

    public Integer getAsInteger(String key) {
        Object value = map.get(key);
        return value instanceof Number ? ((Number) value).intValue() : null;
    }

    public Long getAsLong(String key) {
        Object value = map.get(key);
        return value instanceof Number ? ((Number) value).longValue() : null;
    }

    public int size() {
        return map.size();
    }

    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    public void remove(String key) {
        map.remove(key);
    }

    public void clear() {
        map.clear();
    }

    public Set<Map.Entry<String, Object>> valueSet() {
        return map.entrySet();
    }
}
