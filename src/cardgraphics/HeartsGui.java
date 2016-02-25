package cardgraphics;



import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import hearts.Hearts;


public class HeartsGui extends javax.swing.JFrame{
	private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
	
	public HeartsGui(){
		super("Hearts");
		initComponents();
		setLayout(new FlowLayout());//sets default window layout
				
		thehandler handler = new thehandler();
		jMenuItem2.addActionListener(handler);
		jMenuItem1.addActionListener(handler);		
		
	}
	private class thehandler implements ActionListener{
		
		
		public void actionPerformed(ActionEvent event){
			
			String str = "";
			if(event.getSource()==jMenuItem1)
				System.exit(ABORT);
			else if	(event.getSource()==jMenuItem2)
				Hearts.goHearts();
				str= "Console shows each players hand for testing purposes";
						
			JOptionPane.showMessageDialog(null, str);
		}
		
	}
	private void initComponents() {

		jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        
        jMenu1.setText("File");

        jMenuItem2.setText("New Game");
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Exit");
       
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Options");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

    }
		
}
