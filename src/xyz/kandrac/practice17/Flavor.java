package xyz.kandrac.practice17;

public enum Flavor {
    FREE(0.0), PREMIUM(10.0), FULL(12.5);
    
    public double price;

    boolean doIHaveEnoughMoney(double myMoney) {
        return myMoney >= price;
    }
    
    Flavor(double price) {
        this.price = price;
    }
}
