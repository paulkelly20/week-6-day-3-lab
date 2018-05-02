import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player1;
    Player player2;

    @Before
    public void before(){
        player1 = new Player("Victor");
        player2 = new Player("Paul");

    }

    @Test
    public void checkPlayerName() {
        assertEquals("Victor", player1.getName());
    }
}
