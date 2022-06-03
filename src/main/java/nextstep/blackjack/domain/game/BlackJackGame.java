package nextstep.blackjack.domain.game;

import nextstep.blackjack.domain.card.Card;
import nextstep.blackjack.domain.card.Deck;
import nextstep.blackjack.domain.state.Stay;
import nextstep.blackjack.domain.user.Dealer;
import nextstep.blackjack.domain.user.Player;
import nextstep.blackjack.domain.user.Players;
import nextstep.blackjack.view.InputView;

import java.util.List;

public class BlackJackGame {

    private Dealer dealer;
    private Players players;
    private final Deck deck;

    public BlackJackGame() {
        dealer = new Dealer();
        players = new Players();
        deck = new Deck();
    }

    public void joinPlayers(List<Player> players) {
        for (Player player : players) {
            joinPlayer(player);
        }
    }
    private void joinPlayer(Player player) {
        players.addPlayer(player);
    }

    public void initGame() {
        dealer.draw(deck);
        players.initCards(deck);
    }


    public void continueGame() {
        List<Player> joinedPlayers = players.getPlayers();

        for (Player player : joinedPlayers) {
            String decision = InputView.inputPlayerDecision(player);


            if (decision.equals("n")) {
                player.setState(new Stay());
                continue;
            }

            player.draw(deck);
            showCards(player);
        }
    }

    private void showCards(Player player) {
        List<Card> cards = player.getCards().getCards();
        StringBuilder cardList = new StringBuilder();
        for (Card card : cards) {
            cardList.append(card.getSuit().getSuit()).append("_").append(card.getDenomination().getScore()).append(" ");
        }
        System.out.print(String.format("%s의 카드: %s", player.getName(), cardList.toString()));
        System.out.println();
    }

    public void showResult() {
        List<Player> joinedPlayers = players.getPlayers();
        for (Player joinedPlayer : joinedPlayers) {
            showCards(joinedPlayer);
            System.out.println(String.format(" - 결과: %d", joinedPlayer.calculateScore()));
        }
    }
}
