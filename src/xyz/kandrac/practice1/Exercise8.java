package xyz.kandrac.practice1;

import java.util.Random;

public class Exercise8 {

    /**
     * 1. Vytvorte nový program s triedou Main a metódou main
     * 2. V do-while cykle generujte čísla od 1 po 10 až kým nevygenerujete číslo 5
     * 3. Všetky generované čísla vypíšte na štandardný výstup
     */
    public static void exercise8(String[] args) {
        Random random = new Random();
        int number;
        do {
            // random.nextInt(10) generuje 0-9, preto potrebujeme pričítať 1
            number = random.nextInt(10) + 1;
            System.out.println("Vygenerované číslo : " + number);
        } while (number != 5);
    }
}
