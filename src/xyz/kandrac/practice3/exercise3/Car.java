package xyz.kandrac.practice3.exercise3;

public class Car {

    double maxSpeed;
    double actualSpeed;

    void faster() {
        if (actualSpeed + 10 <= maxSpeed) {
            actualSpeed += 10;
        }
    }
}
