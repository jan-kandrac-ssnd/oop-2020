package xyz.kandrac.practice15;

public class Util {

    private static final double gravity = 9.81;

    public static int getManhattanDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }

    public static double computeGravityBlah(double oppositeAcceleration) {
        return gravity + oppositeAcceleration;
    }

}
