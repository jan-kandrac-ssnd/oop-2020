package xyz.kandrac.practice4.exercise1;

public class Main {

    public static void main(String[] args) {
        Creature creature = new Creature(5, 50, 50, 30);
        creature.levelUp();
        System.out.println(creature.getMaxHitpoints());
    }
}
