package xyz.kandrac.practice4.exercise2;

public class Lift {
    private int maxPersons, maxWeight, actualPersons, actualWeight;

    public Lift(int maxPersons, int maxWeight, int actualPersons, int actualWeight) {
        this.maxPersons = maxPersons;
        this.maxWeight = maxWeight;
        this.actualPersons = actualPersons;
        this.actualWeight = actualWeight;
    }

    public Lift(int maxPersons, int maxWeight) {
        this.maxPersons = maxPersons;
        this.maxWeight = maxWeight;
        this.actualPersons = 0;
        this.actualWeight = 0;
    }

    public void enter(int personWeight) {
        if (actualWeight + personWeight <= maxWeight) {
            actualPersons++;
            actualWeight += personWeight;
        }
    }

    public int getMaxPersons() {
        return maxPersons;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getActualPersons() {
        return actualPersons;
    }

    public int getActualWeight() {
        return actualWeight;
    }
}
