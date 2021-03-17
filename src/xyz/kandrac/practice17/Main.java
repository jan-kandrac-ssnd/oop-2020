package xyz.kandrac.practice17;

public class Main {

    public static void main(String[] args) {
        System.out.println("I heave enough = " + Flavor.PREMIUM.doIHaveEnoughMoney(0.5));
        System.out.println(Environment.DEV.getFullUrl("images"));
    }
}
