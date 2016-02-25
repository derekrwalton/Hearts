
package hearts;

import javax.swing.JFrame;

import cardgraphics.HeartsGui;
import cards.Deck;
import player.Player;

/**
 * Description
 * @author Derek Walton, Xavier Cody
 */
public class Hearts {
	
	    
    public static void main(String[] args) {
    	HeartsGui hearts = new HeartsGui();
    	hearts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	hearts.setSize(1080, 720);
		hearts.setVisible(true);
    }
    public static void goHearts(){	
    	Deck heartsDeck = new Deck();
    	heartsDeck.shuffle();
    	Player p1 = new Player(heartsDeck);
    	Player p2 = new Player(heartsDeck);
    	Player p3 = new Player(heartsDeck);
    	Player p4 = new Player(heartsDeck);
    	System.out.println(p1.toString());
    	System.out.println(p2.toString());
    	System.out.println(p3.toString());
    	System.out.println(p4.toString());
    }
}


