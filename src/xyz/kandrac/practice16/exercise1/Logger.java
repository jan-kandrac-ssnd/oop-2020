package xyz.kandrac.practice16.exercise1;

public class Logger {

    private static final boolean isDebug = true;

    public static void log(String message) {
        if (isDebug) {
            System.err.println(message);
        }
    }
}
