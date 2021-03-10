package xyz.kandrac.practice16.homework;

public abstract class QuadraticEquation {

    private QuadraticEquation() { }

    public static QuadraticEquationResult computeQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) return new QuadraticEquationError(QuadraticEquationError.ERROR_NEGATIVE_DISCRIMINANT);

        return null;
    }
}
