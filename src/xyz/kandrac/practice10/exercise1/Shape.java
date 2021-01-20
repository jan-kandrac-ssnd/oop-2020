package xyz.kandrac.practice10.exercise1;

public abstract class Shape {

    abstract double getPerimeter();

    abstract double getVolume();

    void debugPrint() {
        System.err.println("Perimeter is : " + getPerimeter());
        System.err.println("Volume is : " + getVolume());
    }
}
