package EcouteurMouseClick;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import TestFenetreClick.Compteur;

public class TestFenetreCompteurMouseOver {

	public static void main(String [ ] args) {

		Compteur 		compteur 	=   new Compteur( );
	
		JFrame 			frame 		=   new JFrame("Cliquez !");
	
		Container 		pane 		=   frame.getContentPane( );
	
		JLabel 			label 		=   new JLabel("Compteur 1 : 10"); 
		
	
		JButton 		bOk 		=   new JButton("OK");
	
		MouseListener 	ecouteur 	=	new EcouteurMouseClick (compteur,label);
	
		// 'ecouteur' devient un écouteur d'événements pour
		// les passage sur le bouton bOK
		pane.add(bOk,BorderLayout.SOUTH);		
		pane.add(label,BorderLayout.NORTH);
		bOk.addMouseListener(ecouteur);
		frame.pack( );
		frame.setVisible(true);
	}
}
