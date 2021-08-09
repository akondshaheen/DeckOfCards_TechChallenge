package main.java;

public interface DeckInterface {

    /**
     * Shuffles the deck of cards in a random order.
     */
    void shuffle();
    /**
     * Removes a card from the deck and returns the card that was removed.
     * @return Card that was removed from the deck.  Null, if the deck is empty.
     */
    Card dealOneCard();
}
