package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

import java.util.List;

public abstract class Running extends Started {

    public Running(Cards cards) {
        super(cards);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public double profit() {
        return 0;
    }
}
