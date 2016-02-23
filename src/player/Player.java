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
    private boolean hasLead; //Used to determine order of play, after first hand.
    private boolean hasTwoOfClubs; //Used to determine order of play, for first hand.
    private int order; //Order of play.. IE: Who's turn is it?
    private int score;
    private Card[] hand; //This players cards.
    
    public Player(Card[] cards) {
        hand = 
    }    
    
    public Card play(){
        Random value = new Random();
        Card card = hand[value.nextInt(hand.length)];
        return card;
    }
    
    public Card[] getHand(){
        return hand;
    }
    
    public int calcScore(){
        return score;
    }
    
}
