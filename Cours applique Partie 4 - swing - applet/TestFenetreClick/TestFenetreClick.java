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
		
		// cr�er un �couteur d'�v�nements
		ActionListener ecouteur =   new EcouteurClick (compteur,label);
		
		JButton 	bOk 		= 	new JButton("OK");
		
		pane.add( bOk , BorderLayout.SOUTH);
		pane.add( label , BorderLayout.NORTH );
		
		// 'ecouteur' devient un �couteur d'�v�nements pour
		// les clicks sur le bouton bOK
		bOk.addActionListener(ecouteur);
		frame.pack( );
		frame.setVisible(true);
		
	}
}
