package xyz.kandrac.practice1;

public class Exercise4 {

    /**
     * 1. V metóde main vytvorte 2 premenné dátového typu double s názvami left a right
     * 2. Premenným priraďte hodnoty 10.2 a 4.0
     * 3. Na štandardný výstup vypíšte výsledky všetkých aritmetických operácií
     *      (sčítanie, odčítanie, násobenie, delenie, modulo)
     * 4. Všimnite si, že v Jave na rozdiel od C je povolené pre desatinné čísla aj modulo
     */
    public static void exercise4(String[] args) {
        double left = 10.2;
        double right = 4.0;

        System.out.println("Addition:       " + (left + right));
        System.out.println("Substraction:   " + (left - right));
        System.out.println("Multiplication: " + (left * right));
        System.out.println("Division:       " + (left / right));
        System.out.println("Modulo:         " + (left % right));

        // Nepovinne môžeme tieto čísla aj zaokrúhliť:

        System.out.println("Addition:       " + String.format("%.2f", left + right));
        System.out.println("Substraction:   " + String.format("%.2f", left - right));
        System.out.println("Multiplication: " + String.format("%.2f", left * right));
        System.out.println("Division:       " + String.format("%.2f", left / right));
        System.out.println("Modulo:         " + String.format("%.2f", left % right));
    }
}
