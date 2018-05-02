import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;


    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHandCount() {
        return hand.size();
    }

    public void receiveCard(Card card) {
        this.hand.add(card);
    }

    public int checkValueOfCard() {
        int valueOfCards = 0;
        for(Card card : this.hand)
        {valueOfCards += card.getValueFromEnum();
        }
        return valueOfCards;
    }
}
