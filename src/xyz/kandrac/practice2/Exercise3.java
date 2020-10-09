package xyz.kandrac.practice2;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

    public static void exercise3(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean c;
        do {
            int n = random.nextInt(10) + 1;

            for (int i = n; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Stop");
            System.out.println("prajete si program zopakovat? (y/n)");
            c = scanner.nextLine().startsWith("y");
        } while(c);
    }
}
