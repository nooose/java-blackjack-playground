package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

import java.util.List;

public abstract class Finished extends Started {

    public Finished(Cards cards) {
        super(cards);
    }

    abstract double earningRate();

    @Override
    public State draw(Card card) {
        throw new IllegalArgumentException();
    }

    @Override
    public State stay() {
        throw new IllegalArgumentException();
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public double profit() {
        return 1 * earningRate();
    }
}
