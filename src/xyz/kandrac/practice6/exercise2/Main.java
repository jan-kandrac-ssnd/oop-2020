package xyz.kandrac.practice6.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        do {
            String value = input.nextLine();
            if (value.equals("quit")) { break; }
            list.add(0, value);
        } while (true);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
