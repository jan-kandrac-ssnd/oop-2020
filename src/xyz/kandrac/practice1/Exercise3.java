package xyz.kandrac.practice1;

public class Exercise3 {

    /**
     * 1. V metóde main vytvorte 2 premenné dátového typu int s názvami left a right
     * 2. Premenným priraďte hodnoty 9 a 4
     * 3. Na štandardný výstup vypíšte výsledky všetkých aritmetických operácií
     *      (sčítanie, odčítanie, násobenie, delenie, modulo)
     */
    public static void exercise3(String[] args) {
        int left = 9;
        int right = 4;

        System.out.println("Addition:       " + (left + right));
        System.out.println("Substraction:   " + (left - right));
        System.out.println("Multiplication: " + (left * right));
        System.out.println("Division:       " + (left / right));
        System.out.println("Modulo:         " + (left % right));
    }
}
