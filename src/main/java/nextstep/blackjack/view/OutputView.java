package nextstep.blackjack.view;

import nextstep.blackjack.domain.user.Dealer;

public class OutputView {

    private static final String DEALER_DRAW_FORMAT = "%s는 %d이하라 한장의 카드를 더 받았습니다.";

    public static void printDealerDraw() {
        System.out.println(String.format(DEALER_DRAW_FORMAT, Dealer.DEFAULT_NAME, Dealer.DEALER_DRAWABLE_MAX_SCORE));
    }
}
