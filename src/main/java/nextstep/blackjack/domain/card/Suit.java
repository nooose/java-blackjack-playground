package nextstep.blackjack.domain.card;

public enum Suit {
    CLUBS("클로버"), DIAMONDS("다이아몬드"), HEARTS("하트"), SPADES("스페이드");

    private final String suit;
    Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
