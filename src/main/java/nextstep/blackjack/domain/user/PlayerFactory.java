package nextstep.blackjack.domain.user;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class PlayerFactory {
    public static List<Player> create(List<String> playerNames) {
        return playerNames.stream()
                .map(Player::new)
                .collect(toList());
    }


}
