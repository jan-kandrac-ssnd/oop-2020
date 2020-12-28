package xyz.kandrac.practice8.exercise6;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Set<Integer>> graph = new HashMap<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();

            Set<Integer> fromNodes = graph.get(from);
            if (fromNodes == null) {
                fromNodes = new HashSet<>();
            }
            fromNodes.add(to);
            graph.put(from, fromNodes);



            Set<Integer> toNodes = graph.get(from);
            if (toNodes == null) {
                toNodes = new HashSet<>();
            }
            toNodes.add(from);
            graph.put(to, toNodes);
        }
    }
}
