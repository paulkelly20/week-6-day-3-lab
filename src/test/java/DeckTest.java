import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void checkNumberOfCardsInDeckFullDeck(){
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void giveCardFromDeck(){
        deck.giveCard();
        assertEquals(51, deck.getNumberOfCards());
    }
}
