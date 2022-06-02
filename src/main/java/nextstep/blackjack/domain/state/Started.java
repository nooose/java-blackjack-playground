package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

import java.util.List;

public abstract class Started implements State {

    protected Cards cards;

    public Started(Cards cards) {
        this.cards = cards;
    }



    @Override
    public Cards cards() {
        return cards;
    }
}
