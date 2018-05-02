import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player1;
    Player player2;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("Victor");
        player2 = new Player("Paul");
        deck = new Deck();

    }

    @Test
    public void checkPlayerName() {
        assertEquals("Victor", player1.getName());
    }

    @Test
    public void checkPlayerReceiveCard(){
        player1.receiveCard(deck.giveCard());
        assertEquals(1, player1.getHandCount());

    }

    @Test
    public void checkValueOfPlayersHand(){
        player1.receiveCard(deck.giveCard());
        assertEquals(1, player1.checkValueOfCard());
    }
}
