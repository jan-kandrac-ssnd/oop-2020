package xyz.kandrac.practice5.exercise2;

public class RaceCar extends Car {

    public boolean needCallCrew() {
        return damage > 100;
    }
}
