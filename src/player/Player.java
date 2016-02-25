/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import cards.Deck;
import cards.Card;
import java.util.*;

/**
 *
 * @author Derek
 */
public class Player {

    private int playerNum = 0;
    private boolean hasLead; //Used to determine order of play, after first hand.
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
    public Player(Card[] cards) {
        hand = cards;
        score = 0;
        for (Card hand1 : hand) {
            if (hand1.getSuit() == 3 && hand1.getValue() == 2) {
                hasTwoOfClubs = true;
            } else {
                //Left empty so the program will move on without error.
            }
        }
        if (playerNum == 0) {
            this.playerNum = 0;
            playerNum++;
        }
    }

    public Card play() {
        Random value = new Random();
        Card card = new Card(0,0);
        int i = 0;
        for (valid = false; valid == true;) {
            i = value.nextInt(hand.length);
            if (hand[i] == null) {
                throw new IllegalStateException("Card out of hand. Choose another.");
            } else {
                card = hand[i];
                valid = true;
            }
        }
        hand[i] = null;
        return card;
    }

    public Card[] getHand() {
        return hand;
    }

    public int calcScore(int difference) {
        score = score + difference;
        return score;
    }

}
