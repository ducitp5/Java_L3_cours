package JPanel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestLayout {

	public static void main(String [ ] args){
	
		JFrame 		frame 	=	 new JFrame("JPanel");
		Container 	pane 	=	 frame.getContentPane( );

		JPanel 		pNorth	=	 new JPanel( );
		JLabel 		labN1 	=	 new JLabel("label 1 ");
		JLabel 		labN2 	=	 new JLabel("label 2 ");
		JLabel 		labN3 	=	 new JLabel("label 3 ");
		
		pNorth.add(labN1);
		pNorth.add(labN2);
		pNorth.add(labN3);
		
		
		JPanel 		pEast 	=	 new JPanel(new GridLayout(2,1));
		JLabel 		labE4 	=	 new JLabel("label 4 ");
		JLabel 		labE5 	=	 new JLabel("label 5 ");
		JPanel 		pWest 	=	 new JPanel(new GridLayout(1,2));
		JLabel 		labW6 	=	 new JLabel("label 6 ");
		JLabel 		labW7 	=	 new JLabel("label 7 ");
		JButton 	bOK 	=	 new JButton("OK");
	
		
		pane.add(pNorth,BorderLayout.NORTH);
		pane.add(pEast, BorderLayout. EAST);
		pane.add(pWest, BorderLayout.WEST);		
		pane.add(bOK,BorderLayout.SOUTH);
		
		pEast.add(labE4);
		pEast.add(labE5);
		pWest.add(labW6);
		pWest.add(labW7);
		
		frame.pack( );
		frame.setVisible(true);
		
	}
}
