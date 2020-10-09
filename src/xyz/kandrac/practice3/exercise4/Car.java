package xyz.kandrac.practice3.exercise4;

public class Car {

    double maxSpeed;
    double actualSpeed;
    double fail;

    void faster() {
        if (Math.random() < fail) {
            return;
        }
        if (actualSpeed + 10 <= maxSpeed) {
            actualSpeed += 10;
        }
    }
}
