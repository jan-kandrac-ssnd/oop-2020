package xyz.kandrac.practice9.exercise1;

public class Rectangle extends Shape {

    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    double getVolume() {
        return a * b;
    }
}
