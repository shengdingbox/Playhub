package android.database.sqlite;

/**
 * Minimal desktop-JVM stub of android.database.sqlite.SQLiteClosable.
 */
public abstract class SQLiteClosable {

    public void close() {
        onAllReferencesReleased();
    }

    protected void onAllReferencesReleased() {
    }
}
