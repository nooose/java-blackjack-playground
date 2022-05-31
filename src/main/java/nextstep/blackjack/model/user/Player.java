package nextstep.blackjack.model.user;

import nextstep.blackjack.model.card.Card;
import nextstep.blackjack.model.card.Deck;
import nextstep.blackjack.model.card.Hand;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void draw(Deck deck, int drawNumber) {
        for (int i = 0; i < drawNumber; i++) {
            draw(deck);
        }
    }
}
