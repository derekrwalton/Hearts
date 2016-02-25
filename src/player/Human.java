/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import cards.Card;
import cards.Deck;
import java.util.Scanner;

/**
 *
 * @author Derek
 */
public class Human extends Player {

    public Human(Deck deck) {
        super(deck);
    }

    @Override
    public Card play() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        Card card = new Card(0, 0);
        for (valid = false; valid == true;) { //Checks that card is in hand.
            i = input.nextInt(hand.length);
            if (hand[i] == null) {
                throw new IllegalStateException("Card already played. Choose another.");
            } else {
                card = hand[i];
                valid = true;
            }
        }
        hand[i] = null; // "Removes" card from hand.
        return card;
    }

}
