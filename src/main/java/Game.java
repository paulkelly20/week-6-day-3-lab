import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(){
        this.deck = new Deck();
        this.players = new ArrayList<>();
    }

    public Deck getDeck() {
        return deck;
    }

    public int getPlayers() {
        return players.size();
    }

    public void addPlayers(Player player) {
        this.players.add(player);
    }

    public void dealCard(int cards) {

        for (Player player : this.players) {
            for(int i = 0; i < cards ; i++) {
                player.receiveCard(deck.giveCard());
            }
        }
    }

    public void dealTwoCards() {
        for(Player player : this.players){
            player.receiveCard(deck.giveCard());
            player.receiveCard(deck.giveCard());
        }


    }

    public Player comparePlayersValueOfCard() {
        Player playerOne = this.players.get(0);
        Player playerTwo = this.players.get(1);

        if (playerOne.checkValueOfCard() == playerTwo.checkValueOfCard()){
            return null;
        }
        else if (playerOne.checkValueOfCard() > playerTwo.checkValueOfCard()){
            return playerOne;
        }

        else return playerTwo;

    }
}
