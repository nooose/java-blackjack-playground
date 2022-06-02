package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

import java.util.List;

/**
 * 카드를 더 뽑지 않고 차례를 마치는 것
 */
public class Stay extends Finished {
    @Override
    double earningRate() {
        return 1;
    }

    public Stay() {
        super(new Cards());
    }


}
