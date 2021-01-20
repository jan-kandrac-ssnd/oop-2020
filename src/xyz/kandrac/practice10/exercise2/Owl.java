package xyz.kandrac.practice10.exercise2;

public class Owl extends Animal {
    @Override
    void doNoise() {
        System.out.println("Hoot hoot");
    }

    @Override
    void doMove() {
        System.out.println("Swash Swash");
    }
}
