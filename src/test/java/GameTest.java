import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Player player1;
    Player player2;
    Card card1;
    Card card2;

    @Before
    public void before() {
        game = new Game();
        player1 = new Player("Victor");
        player2 = new Player("Paul");
        card1 = new Card(Suit.SPADES, Rank.ACE);
        card2 = new Card(Suit.SPADES, Rank.FIVE);
    }


    @Test
    public void checkPlayersInGameNoPlayers() {
        assertEquals(0, game.getPlayers());
    }

    @Test
    public void checkPlayersInGameAfterAdding() {
        game.addPlayers(player1);
        game.addPlayers(player2);
        assertEquals(2, game.getPlayers());
    }

    @Test
    public void checkPlayerHasCard() {
        game.addPlayers(player1);
        game.addPlayers(player2);
        game.dealCard();
        assertEquals(2, player1.getHandCount());
        assertEquals(2, player2.getHandCount());
    }

    @Test
    public void comparePlayersCardValuePlayerWins(){
        game.addPlayers(player1);
        game.addPlayers(player2);
        player1.receiveCard(card1);
        player1.receiveCard(card1);
        player2.receiveCard(card2);
        player2.receiveCard(card2);
        assertEquals(player2, game.comparePlayersValueOfCard());

    }

    @Test
    public void comparePlayersCardValueDraw(){
        game.addPlayers(player1);
        game.addPlayers(player2);
        player1.receiveCard(card1);
        player1.receiveCard(card1);
        player2.receiveCard(card1);
        player2.receiveCard(card1);
        assertEquals(null, game.comparePlayersValueOfCard());

    }

}
