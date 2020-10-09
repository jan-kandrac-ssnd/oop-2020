package xyz.kandrac.practice3.exercise3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.actualSpeed = 10.0;
        car.maxSpeed = 25.0;

        System.out.println(car.actualSpeed);
        car.faster();
        System.out.println(car.actualSpeed);
        car.faster();
        System.out.println(car.actualSpeed);
    }
}
