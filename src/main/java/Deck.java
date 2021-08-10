import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Deck implements DeckInterface {
    private final List<Card> cards = new ArrayList<>();
    private final static Logger LOGGER = Logger.getLogger(Deck.class.getName());

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (CardValue cardValue : CardValue.values()) {
                cards.add(new Card(suit,cardValue));
            }
        }
    }



    /**
     * Shuffle all the cards randomly
     */
    @Override
    public void shuffle() {
        LOGGER.info("Started shuffling deck...");
        int size = cards.size();
        for (int i = 0; i < size; i++) {
            int swapIndex = (int) (Math.random() * size);

            if (swapIndex == i) {
                continue;
            }
            else {
                Card a = cards.get(i);
                Card b = cards.get(swapIndex);
                cards.set(i, b);
                cards.set(swapIndex, a);
            }
        }
    }

    /**
     * Card to deal
     * @return card
     */
    @Override
    public Card dealOneCard() {
        if (cards.size() <= 0 || cards.size()>52) {
            LOGGER.info("No card is dealt.");
            return null;
        }
        Card card = cards.remove(0);
        return card;
    }
}
