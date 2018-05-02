import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void before(){
        card = new Card(Suit.SPADES, Rank.ACE);
    }


    @Test
    public void canGetSuit(){
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public void canGetRanks(){
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void canGetRankValue(){
        assertEquals(1, card.getValueFromEnum());
    }

}
