package EcouteurMouseClick;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import TestFenetreClick.Compteur;

public class EcouteurMouseClickextend extends MouseAdapter { 
	
	private Compteur 	compteur ;// le compteur du nombre de clicks 
	private JLabel 		label ;   // le label dont on veut modifier le texte

	public EcouteurMouseClickextend (Compteur compteur, JLabel label) { 
		
		this.compteur 	= 	compteur ;
		this.label 		= 	label ; 		
	}

	public void mouseEntered(MouseEvent e) {

		this.compteur.incrementer(1) ; 
		this.label.setText ("Compteur  Ecouteurmouse: " +this.compteur.getValue( )+ " ") ; 
	}
	
	
	public static void main(String [ ] args) {

		Compteur 		compteur 	=   new Compteur( );
	
		JFrame 			frame 		=   new JFrame("Cliquez ici !");
	
		Container 		pane 		=   frame.getContentPane( );
	
		JLabel 			label 		=   new JLabel("Compteur 2 : 10"); 
		
	
		JButton 		bOk 		=   new JButton("OK");
	
		MouseListener 	ecouteur 	=	new EcouteurMouseClickextend (compteur,label);
	
		// 'ecouteur' devient un écouteur d'événements pour
		// les passage sur le bouton bOK
		pane.add(bOk,BorderLayout.SOUTH);		
		pane.add(label,BorderLayout.NORTH);
		bOk.addMouseListener(ecouteur);
		frame.pack( );
		frame.setVisible(true);
	}
}
