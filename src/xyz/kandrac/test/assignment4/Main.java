package xyz.kandrac.test.assignment4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DiceCounter counter = new DiceCounter();

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            counter.storeToss(input.nextInt());
        }

        System.out.println("Najviac pada " + counter.mostCommonToss());
        System.out.println("Najmenej pada " + counter.leastCommonToss());
    }
}
