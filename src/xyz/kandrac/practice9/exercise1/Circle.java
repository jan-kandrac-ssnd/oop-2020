package xyz.kandrac.practice9.exercise1;

public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    double getVolume() {
        return Math.PI * r * r;
    }
}
