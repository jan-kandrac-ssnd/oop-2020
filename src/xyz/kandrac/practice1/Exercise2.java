package xyz.kandrac.practice1;

public class Exercise2 {

    /**
     * Upravte program z úlohy 1 tak, aby ste nepoužili príkaz println ale print a znak konca riadku.
     * Znak konca riadku je buď '\n' pre Unix based operačné systémy, “\r\n” pre Windows, alebo
     * použite platformovo nezávislý System.lineSeparator();
     */
    public static void exercise2(String[] args) {
        System.out.print("Hello World!" + System.lineSeparator());
    }
}
