package android.os;

public class Process {

    public static final int SYSTEM_UID = 1000;
    public static final int MY_PID = 12345;

    public static int myPid() {
        return MY_PID;
    }

    public static int myTid() {
        return MY_PID;
    }

    public static int myUid() {
        return 10123;
    }

    public static void killProcess(int pid) {
    }

    public static void setThreadPriority(int priority) {
    }
}