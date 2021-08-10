package main.java;


public class Card {

    private final Suit suit;
    private final CardValue cardValue;

    public Card(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }
}
