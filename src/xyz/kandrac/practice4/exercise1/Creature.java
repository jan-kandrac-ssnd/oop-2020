package xyz.kandrac.practice4.exercise1;

public class Creature {

    private int hitpoints, maxHitpoints, strength, armor;

    public Creature(int hitpoints, int strength, int armor) {
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.armor = armor;

        this.maxHitpoints = hitpoints;
    }

    public Creature(int hitpoints, int maxHitpoints, int strength, int armor) {
        this.hitpoints = hitpoints;
        this.maxHitpoints = maxHitpoints;
        this.strength = strength;
        this.armor = armor;
    }

    public void levelUp() {
        hitpoints *= 1.1;
        maxHitpoints *= 1.1;
        strength *= 1.1;
        armor *= 1.1;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getMaxHitpoints() {
        return maxHitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }
}
