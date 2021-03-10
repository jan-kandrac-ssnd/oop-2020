package xyz.kandrac.practice16.homework;

public class Main {

    public static void main(String[] args) {
        QuadraticEquationResult result = QuadraticEquation.computeQuadraticEquation(10, 5, 3);
        if (result != null) {
            result.printResult();
        }
    }
}
