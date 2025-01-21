package Les_Pages;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class P06 {

	public static void main(String [ ] args) {
		
		
		JFrame frame = new JFrame(" Ma deuxième fenêtre ");
		
		// récupérer le panel contenant les composants de la JFrame
		Container pane = frame.getContentPane( ); 
		
		// créer une étiquette et l'ajouter "au nord" de la fenêtre		
		JLabel label = new JLabel("Une fenêtre qui ne réagit pas"); 
		
		pane.add(label , BorderLayout.NORTH);
		
		// créer un bouton et l'ajouter "au sud" de la fenêtre 
		JButton bOk = new JButton("OK"); 
		
		pane.add(bOk , BorderLayout.SOUTH);
		
		// lui donner une taille "optimale" , un setSize "automatique"
		frame.pack( );
		
		// afficher la fenêtre
		frame.setVisible(true);
	}
}
