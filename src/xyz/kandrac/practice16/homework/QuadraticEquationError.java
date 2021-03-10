package xyz.kandrac.practice16.homework;

public final class QuadraticEquationError extends QuadraticEquationResult {

    public static final int ERROR_NEGATIVE_DISCRIMINANT = 1;
    public static final int ERROR_DIVISION_BY_ZERO = 2;

    private final int type;

    public QuadraticEquationError(final int type) {
        this.type = type;
    }

    @Override
    void printResult() {
        System.out.println("Kvadraticku rovnicu nie je mozne vypocitat, dovod:");
        switch (type) {
            case ERROR_NEGATIVE_DISCRIMINANT -> System.out.println("Negativny diskriminant");
            case ERROR_DIVISION_BY_ZERO -> System.out.println("Delenie nulou (pozri parameter a)");
        }
    }

}
