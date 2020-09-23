package xyz.kandrac.practice1;

import java.util.Random;

public class Exercise7 {

    /**
     * 1. Vytvorte nový program s triedou Main a metódou main
     * 2. Vytvorte 3 premenné typu int s náhodnými hodnotami (pre získanie random čísel - check Google)
     * 3. Na štandardný výstup vypíšte hodnoty týchto premenných
     * 4. Na štandardný výstup vypíšte najväčšie z troch čísel pomocou príkazov if-else
     */
    public static void exercise7(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);

        System.out.println("Hodnoty premenných a=" + a + "; b=" + b + "; c=" + c);

        if (a > b && a > c) { System.out.println("Hodnota a je najväčšia"); }
        else if (b > a && b > c) { System.out.println("Hodnota b je najväčšia"); }
        else if (c > a && c > b) { System.out.println("Hodnota c je najväčšia"); }
        else { System.out.println("2 čísla sú najväčšie"); }
    }
}
