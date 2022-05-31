package nextstep.blackjack.model.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static final int TOP = 0;

    private List<Card> cards;

    public Deck() {
        this.cards = refill();
    }

    private List<Card> refill() {
        List<Card> cardList = new ArrayList<>(CardRepository.cards());
        Collections.shuffle(cardList);
        return cardList;
    }

    public Card draw() {
        if (cards.isEmpty()) {
            this.cards = refill();
        }

        return cards.remove(TOP);
    }
}
