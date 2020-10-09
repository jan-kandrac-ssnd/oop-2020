package xyz.kandrac.practice3.exercise4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.maxSpeed = 100;
        car1.actualSpeed = 0;
        car1.fail = 0.7;

        Car car2 = new Car();
        car2.maxSpeed = 50;
        car2.actualSpeed = 0;
        car2.fail = 0;

        for (int i = 0; i < 15; i++) {
            car1.faster();
            car2.faster();
        }

        System.out.println(car1.actualSpeed);
        System.out.println(car2.actualSpeed);
    }
}
