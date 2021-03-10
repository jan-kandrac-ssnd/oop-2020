package xyz.kandrac.practice16.exercise2;

public class MathUtils {

    public static double round(double a, int places) {
        int b = 10;
        for (int i = 1; i < places; i++) {
            b *= 10;
        }

        return (double) Math.round(a * b) / b;
    }

    public static double toRad(double degrees) {
        return degrees * Math.PI / 180.0;
    }

    public static double sin(double degrees) {
        return Math.sin(toRad(degrees));
    }

    public static double cos(double degrees) {
        return Math.cos(toRad(degrees));
    }

    public static double tan(double degrees) {
        return Math.tan(toRad(degrees));
    }
}

