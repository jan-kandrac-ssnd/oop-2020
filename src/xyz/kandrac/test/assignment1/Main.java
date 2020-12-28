package xyz.kandrac.test.assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Collection collection = new Collection();

        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            String bug = input.nextLine();
            boolean wasAdded = collection.addBug(bug);
            if (wasAdded) {
                System.out.println(bug + " bol pridany do zbierky");
            } else {
                System.out.println(bug + " sa uz v zbierke nachadza");
            }
        }

        System.out.println("V zbierke je " + collection.getSize() + " chrobakov");
    }
}
