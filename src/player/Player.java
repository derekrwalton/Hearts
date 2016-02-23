/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import cards.Deck;
import cards.Card;
import java.util.Random;

/**
 *
 * @author Derek
 */
public class Player {

    private final int playerNum;
    private boolean hasLead; //Used to determine order of play, after first hand.
    private boolean hasTwoOfClubs; //Used to determine order of play, for first hand.
    private int order; //Order of play.. IE: Who's turn is it?
    private int score;
    private Card[] hand; //This players cards.

    /**
     * Creates a Player that obtains the specified card set. Sets the players
     * score to 0. Checks the Player's hand for the two of clubs, and uses this
     * information to determine the order of play.
     *
     * @param cards
     */
    public Player(Card[] cards) {
        hand = cards;
        score = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getSuit() == 3 && hand[i].getValue() == 2) {
                hasTwoOfClubs = true;
            } else {    //Left empty to move on.

            }
        }
    }

    public Card play() {
        Random value = new Random();
        Card card = hand[value.nextInt(hand.length)];
        return card;
    }

    public Card[] getHand() {
        return hand;
    }

    public int calcScore() {
        return score;
    }

}
