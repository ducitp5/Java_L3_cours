package Les_Pages;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class P06 {

	public static void main(String [ ] args) {
		
		
		JFrame frame = new JFrame(" Ma deuxi�me fen�tre ");
		
		// r�cup�rer le panel contenant les composants de la JFrame
		Container pane = frame.getContentPane( ); 
		
		// cr�er une �tiquette et l'ajouter "au nord" de la fen�tre		
		JLabel label = new JLabel("Une fen�tre qui ne r�agit pas"); 
		
		pane.add(label , BorderLayout.NORTH);
		
		// cr�er un bouton et l'ajouter "au sud" de la fen�tre 
		JButton bOk = new JButton("OK"); 
		
		pane.add(bOk , BorderLayout.SOUTH);
		
		// lui donner une taille "optimale" , un setSize "automatique"
		frame.pack( );
		
		// afficher la fen�tre
		frame.setVisible(true);
	}
}
