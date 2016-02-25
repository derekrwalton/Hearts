
package player;

import cards.Deck;
import cards.Card;
import java.util.*;

/**
 *
 * @author Derek
 */
public class Player {

    private final int HANDSIZE = 13;
    private boolean hasLead; //Used to determine order of play, after first hand.
    @SuppressWarnings("unused")
    private boolean hasTwoOfClubs; //Used to determine order of play, for first hand.
    private int score;
    private Card[] hand; //This players cards.
    private boolean valid;

    /**
     * Creates a Player that obtains the specified card set. Sets the players
     * score to 0. Checks the Player's hand for the two of clubs, and uses this
     * information to determine the order of play.
     *
     * @param cards
     */
    public Player(Deck deck) {
        hand = new Card[HANDSIZE];
        for (int i = 0; i < HANDSIZE; i++) {
            hand[i] = deck.dealCard();
        }
        score = 0;
        hasTwoOfClubs();
    }

    public Card play() {
        Random value = new Random();
        Card card = new Card(0, 0);
        int i = 0;
        for (valid = false; valid == true;) { //Checks that card is in hand.
            i = value.nextInt(hand.length);
            if (hand[i] == null) {
                throw new IllegalStateException("Card out of hand. Choose another.");
            } else {
                card = hand[i];
                valid = true;
            }
        }
        hand[i] = null; // "Removes" card from hand.
        return card;
    }

    public void hasTwoOfClubs() {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getSuit() == 3 && hand[i].getValue() == 2) {
                hasTwoOfClubs = true;
            } else {    //Left empty so the program will move on without error.

            }
        }
    }

    public Card[] getHand() {
        return hand;
    }

    public int calcScore(int difference) {
        score = score + difference;
        return score;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Player [hand=" + Arrays.toString(hand) + "]";
    }

}
