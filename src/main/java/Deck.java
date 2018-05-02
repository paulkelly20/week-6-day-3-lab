import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        populateDeck();
        shuffleDeck();
    }

    private void shuffleDeck(){
        Collections.shuffle(this.cards);

    }

    public int getNumberOfCards() {
        return cards.size();
    }

    private void populateDeck(){
        for(Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                Card card = new Card(suit,rank);
                this.cards.add(card);
            }
        }

    }

    public Card giveCard() {
        return this.cards.remove(0);
    }
}
