package xyz.kandrac.practice4.exercise4;

public class Wallet {

    private int cents, euros;

    public Wallet(int euros, int cents) {
        this.cents = cents;
        this.euros = euros;
    }

    public void pay(double price) {
        int payCents = (int) (price * 100) % 100;
        int payEuros = (int) price;

        if (this.cents >= payCents && this.euros >= payEuros) {
            this.cents -= payCents;
            this.euros -= payEuros;
        }
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public int getEuros() {
        return euros;
    }

    public void setEuros(int euros) {
        this.euros = euros;
    }
}
