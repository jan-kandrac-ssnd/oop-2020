package xyz.kandrac.practice4.exercise3;

public class Car {

    private int maxSpeed, actualSpeed, acceleration;

    public Car(int maxSpeed, int actualSpeed, int acceleration) {
        this.maxSpeed = maxSpeed;
        this.actualSpeed = actualSpeed;
        this.acceleration = acceleration;
    }

    public void accelerate() {
        if (actualSpeed + acceleration <= maxSpeed) {
            actualSpeed += acceleration;
        } else {
            actualSpeed = maxSpeed;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        if (actualSpeed <= this.maxSpeed) {
            this.actualSpeed = actualSpeed;
        }
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }
}
