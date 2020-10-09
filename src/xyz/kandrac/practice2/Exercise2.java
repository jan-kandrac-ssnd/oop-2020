package xyz.kandrac.practice2;

import java.util.Random;

public class Exercise2 {

    public static void exercise2(String[] args) throws InterruptedException {
        Random random = new Random();
        int n = random.nextInt(10) + 1;

        for (int i = n; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Stop");
    }
}
