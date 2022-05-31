package nextstep.blackjack.model.card;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hand {
    private final List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public int calculateScore() {
        return cards.stream()
                .map(card -> card.getDenomination().getScore())
                .reduce(0, Integer::sum);
    }
}
