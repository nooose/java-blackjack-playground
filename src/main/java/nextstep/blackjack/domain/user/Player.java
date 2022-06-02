package nextstep.blackjack.domain.user;

import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.state.Hit;

public class Player extends User {

    public Player(String name) {
        super(name, 0);
    }

    public Player(String name, double bettingMoney) {
        super(name, bettingMoney);
    }


}
