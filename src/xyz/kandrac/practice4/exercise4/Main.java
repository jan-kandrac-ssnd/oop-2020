package xyz.kandrac.practice4.exercise4;

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(10, 50);

        System.out.println(wallet.getEuros() + "." + wallet.getCents());
        wallet.pay(5.50);
        System.out.println(wallet.getEuros() + "." + wallet.getCents());
        wallet.pay(0.50);
        System.out.println(wallet.getEuros() + "." + wallet.getCents());
    }
}
