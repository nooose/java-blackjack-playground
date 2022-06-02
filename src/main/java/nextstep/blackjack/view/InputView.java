package nextstep.blackjack.view;

import nextstep.blackjack.domain.user.Player;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_NAMES = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    private static final String BETTING_MONEY_FORMAT = "%s의 배팅 금액은?";
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final Scanner SCANNER = new Scanner(System.in);


    public static String inputPlayersName() {
        System.out.println(INPUT_NAMES);
        return SCANNER.nextLine();
    }

    public static double inputBettingMoney(Player player) {
        System.out.println(String.format(NEWLINE + BETTING_MONEY_FORMAT, player.getName()));
        return SCANNER.nextDouble();
    }

    public static String inputPlayerDecision(Player player) {
        System.out.println(player.getName() + "는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
        return SCANNER.nextLine();
    }
}
