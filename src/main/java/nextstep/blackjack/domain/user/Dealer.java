package nextstep.blackjack.domain.user;

import nextstep.blackjack.domain.state.Hit;

public class Dealer extends User {

    public static final String DEFAULT_NAME = "딜러";
    public static final int DEALER_DRAWABLE_MAX_SCORE = 16;

    public Dealer() {
        super(DEFAULT_NAME, 0);
        setState(new Hit(cards));
    }

}
