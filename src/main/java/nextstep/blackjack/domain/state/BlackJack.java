package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

import java.util.List;

/**
 * 처음 두 장의 카드 합이 21인 경우, 베팅 금액의 1.5배
 */
public class BlackJack extends Finished {

    public BlackJack(Cards cards) {
        super(cards);
    }

    @Override
    double earningRate() {
        return 1.5;
    }
}
