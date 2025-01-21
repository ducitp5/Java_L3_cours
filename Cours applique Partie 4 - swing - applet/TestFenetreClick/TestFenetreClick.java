package TestFenetreClick;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TestFenetreClick {

public static void main(String [ ] args){
		
		Compteur 	compteur 	= 	new Compteur( );
		
		JFrame 		frame 		= 	new JFrame("Cliquez TestFenetre Click !");

		Container	pane 		= 	frame.getContentPane( );
	
		JLabel 		label 		= 	new JLabel("Compteur : 10");
		
		// créer un écouteur d'événements
		ActionListener ecouteur =   new EcouteurClick (compteur,label);
		
		JButton 	bOk 		= 	new JButton("OK");
		
		pane.add( bOk , BorderLayout.SOUTH);
		pane.add( label , BorderLayout.NORTH );
		
		// 'ecouteur' devient un écouteur d'événements pour
		// les clicks sur le bouton bOK
		bOk.addActionListener(ecouteur);
		frame.pack( );
		frame.setVisible(true);
		
	}
}
