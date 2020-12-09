package xyz.kandrac.practice8.exercise1;

import java.util.Arrays;
import java.util.HashSet;

public class CardSorter {

    private final HashSet<String> cards = new HashSet<>();

    public boolean acceptCard(String card) {
        final Character[] numbers = { '7', '8', '9', '0', 'J', 'Q', 'K', 'A' };
        final Character[] color = { 'H', 'S', 'C', 'D' };

        boolean properCard = Arrays.asList(numbers).contains(card.charAt(0)) && Arrays.asList(color).contains(card.charAt(1));
        if (!properCard) {
            return false;
        } else {
            return cards.add(card);
        }
    }
}
