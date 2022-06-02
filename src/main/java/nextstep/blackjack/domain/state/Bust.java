package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

import java.util.List;


/**
 * 카드 총합이 21을 넘는 경우, 배당금을 잃는다.
 */
public class Bust extends Finished {
    public Bust(Cards cards) {
        super(cards);
    }

    @Override
    double earningRate() {
        return -1;
    }
}
