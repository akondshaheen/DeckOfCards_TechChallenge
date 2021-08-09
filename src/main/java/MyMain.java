package main.java;

import java.util.logging.Logger;

public class MyMain {
    private final static Logger LOGGER = Logger.getLogger(Deck.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Executing the Deck of Cards...");
        DeckInterface deck = new Deck();
        deck.shuffle();

        int num = 1;
        while (true) {
            Card card = deck.dealOneCard();
            if (card == null) {
                break;
            } else {
                LOGGER.info(num + ") " + card);
            }
            num++;
        }
    }
}
