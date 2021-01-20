package xyz.kandrac.practice9.exercise3;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getEuclideanDistance(Point that) {
        double dx = that.x - this.x;
        double dy = that.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getManhattanDistance(Point that) {
        double dx = that.x - this.x;
        double dy = that.y - this.y;
        return Math.abs(dx) + Math.abs(dy);
    }
}
