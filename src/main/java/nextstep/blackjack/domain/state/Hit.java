package nextstep.blackjack.domain.state;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Cards;

import java.util.List;


/**
 * 처음 2장의 상태에서 카드를 더 뽑는 것
 */
public class Hit extends Running {

    public Hit(Cards cards) {
        super(cards);
    }

    @Override
    public State draw(Card card) {
        // 카드 뽑기
        cards.add(card);

        if (cards.calculateScore() > 21) {
            return new Bust(cards);
        }
        return this;
    }

    @Override
    public State stay() {
        return new Stay();
    }
}
