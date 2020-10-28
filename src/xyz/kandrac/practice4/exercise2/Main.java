package xyz.kandrac.practice4.exercise2;

public class Main {

    public static void main(String[] args) {
        Lift vytah = new Lift(5, 200, 3, 150);
        System.out.println(vytah.getActualPersons());
        vytah.enter(45);
        System.out.println(vytah.getActualPersons());
        vytah.enter(45);
        System.out.println(vytah.getActualPersons());
    }
}
