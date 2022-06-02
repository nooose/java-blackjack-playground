package nextstep.blackjack;

import nextstep.blackjack.domain.card.Deck;
import nextstep.blackjack.domain.game.BlackJackGame;
import nextstep.blackjack.domain.user.Player;
import nextstep.blackjack.domain.user.PlayerFactory;
import nextstep.blackjack.domain.user.Players;
import nextstep.blackjack.util.StringUtil;
import nextstep.blackjack.view.InputView;

import java.util.List;
import java.util.function.Consumer;

public class BlackJackMain {
    public static void main(String[] args) {
        List<String> names = StringUtil.parsingPlayerNames(InputView.inputPlayersName());
        List<Player> players = PlayerFactory.create(names);

        betting(players);
        BlackJackGame game = new BlackJackGame();
        game.joinPlayers(players);

        game.initGame();
        game.continueGame();
        game.showResult();
    }


    private static void betting(List<Player> players) {
        for (Player player : players) {
            double money = InputView.inputBettingMoney(player);
            player.bet(money);
        }
    }
}
