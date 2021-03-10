package xyz.kandrac.practice16.homework;

public final class QuadraticEquationSuccess extends QuadraticEquationResult {

    private final double x1;
    private final double x2;

    public QuadraticEquationSuccess(final double x1, final double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    void printResult() {
        if (x1 != x2) {
            System.out.println("Kvadraticka rovnica ma 2 korene:\n" +
                    "    x1 = " + x1 + "\n" +
                    "    x2 = " + x2);
        } else {
            System.out.println("Kvardaticka rovnica ma iba jeden koren:\n" +
                    "    x = " + x1);
        }
    }

}
