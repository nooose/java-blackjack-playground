package nextstep.blackjack.domain.user;

import nextstep.blackjack.domain.card.Deck;
import nextstep.blackjack.domain.state.Bust;
import nextstep.blackjack.domain.state.Hit;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private final List<Player> players;

    public Players() {
        players = new ArrayList<>();
    }

    public Players(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void initCards(Deck deck) {
        for (Player player : players) {
            player.state = new Hit(player.cards);
            player.draw(deck, 2);
        }
    }




}
