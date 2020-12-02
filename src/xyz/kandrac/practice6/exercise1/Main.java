package xyz.kandrac.practice6.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Character> mojZoznam = new ArrayList<>();

        do {
            String value = input.nextLine();
            if (value.charAt(0) == 'Q') { break; }
            mojZoznam.add(value.charAt(0));
        } while (true);

        for (int i = 0; i < mojZoznam.size(); i++) {
            System.out.println(mojZoznam.get(i));
        }
    }

}
