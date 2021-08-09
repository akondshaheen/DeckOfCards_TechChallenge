package main.java;


public class Card {

    /**
     * The suit of  the card.
     */
    private final Suit suit;
    /**
     * The value of the card.
     */
    private final CardValue cardValue;

    /**
     * Creates a card from a defined suit and card value.
     * @param suit - The suit of the card.
     * @param cardValue - The value of the card.
     */
    public Card(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    /**
     * Gets the suit of the card.
     * @return Suit of the card.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Gets the value of the card.
     * @return Value of the card.
     */
    public CardValue getCardValue() {
        return cardValue;
    }
}
