package nextstep.blackjack.domain.card;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private final List<Card> cards;

    public Cards() {
        this.cards = new ArrayList<>();
    }

    public Cards(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
    }

    public void add(Card card) {
        cards.add(card);
    }

    public int calculateScore() {
        return cards.stream()
                .map(card -> card.getDenomination().getScore())
                .reduce(0, Integer::sum);
    }

    public List<Card> getCards() {
        return cards;
    }
}
