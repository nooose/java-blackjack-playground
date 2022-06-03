package nextstep.blackjack.domain.user;

import nextstep.blackjack.domain.card.Deck;
import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.state.*;

public abstract class User {
    private final String name;
    private double bettingMoney;
    protected final Cards cards;
    protected State state;

    public User(String name, double bettingMoney) {
        this.name = name;
        this.bettingMoney = bettingMoney;
        this.cards = new Cards();
    }

    public String getName() {
        return name;
    }

    public Cards getCards() {
        return cards;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void bet(double money) {
        this.bettingMoney = money;
    }


    public boolean isCanDraw() {
        return !state.isFinished();
    }

    public void draw(Deck deck) {
        state = state.draw(deck.draw());
    }

    public void draw(Deck deck, int drawNumber) {
        for (int i = 0; i < drawNumber; i++) {
            draw(deck);
        }
    }

    public int calculateScore() {
        return this.cards.calculateScore();
    }

    public String getState() {
        if (state instanceof Bust) {
            return "버스트";
        }

        if (state instanceof Hit) {
            return "히트";
        }

        if (state instanceof Stay) {
            return "스테이";
        }

        return "블랙잭";
    }
}
