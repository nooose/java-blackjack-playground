package nextstep.blackjack.domain.card;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardRepository {
    private static final List<Card> CARDS;

    static {
        CARDS = create();
    }

    private static List<Card> create() {
        return Arrays.stream(Denomination.values())
                .flatMap(CardRepository::createBySuit)
                .collect(Collectors.toList());
    }

    private static Stream<Card> createBySuit(Denomination denomination) {
        return Arrays.stream(Suit.values())
                .map(suit -> new Card(suit, denomination));
    }

    public static List<Card> cards() {
        return CARDS;
    }
}
