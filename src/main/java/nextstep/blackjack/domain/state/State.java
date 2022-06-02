package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

import java.util.List;

public interface State {
    State draw(Card card);

    State stay();

    boolean isFinished();

    Cards cards();

    double profit();
}
