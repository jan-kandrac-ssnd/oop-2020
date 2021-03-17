package xyz.kandrac.practice17.exercise2;

public enum GameType {
    DEMO(3), FULL(20);

    public final int maxLevel;

    GameType(int maxLevel) {
        this.maxLevel = maxLevel;
    }
}
