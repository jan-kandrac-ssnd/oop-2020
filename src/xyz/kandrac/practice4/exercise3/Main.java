package xyz.kandrac.practice4.exercise3;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(120, 90, 20);
        System.out.println(car.getActualSpeed());
        car.accelerate();
        System.out.println(car.getActualSpeed());
        car.accelerate();
        System.out.println(car.getActualSpeed());
    }
}
