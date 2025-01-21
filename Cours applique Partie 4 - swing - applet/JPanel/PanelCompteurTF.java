package JPanel;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ButtonGroup.CompteurPlus;
import TestFenetreClick.Compteur;

@SuppressWarnings("serial")
public class PanelCompteurTF extends JPanel{

	private Compteur 	 compteur;
	private JLabel		 label;
	private JTextField 	 textField;

	class EcouteurTF implements java.awt.event.ActionListener{

		public void actionPerformed(ActionEvent e){
		
			PanelCompteurTF.this.compteur.incrementer( Integer.parseInt(PanelCompteurTF.this.textField.getText( )));
		
			PanelCompteurTF.this.label.setText("Compteur : " +PanelCompteurTF.this.compteur.getValue( )+" ");
			
		}
	}
	
	public PanelCompteurTF(Compteur compteur) {

		super(new BorderLayout());

		this.compteur	=	compteur;

		this.label 		=   new JLabel("Compteur : "+0); this.add(this.label,BorderLayout.NORTH);

		JButton bOK = new JButton("OK"); this.add(bOK,BorderLayout.SOUTH);

		this.textField = new JTextField(10);

		JPanel panel = new JPanel( );

		panel.add(new Label("Incr\u00E9mentation : "));
		panel.add(this.textField);

		this.add(panel ,BorderLayout.EAST);
		
		// créer un gestionnaire d'événements et l'associer au bouton
		// GestionnaireTF est une classe interne
		
		bOK.addActionListener(new EcouteurTF( ));		
	}
	
	public static void main(String [ ] args){

		CompteurPlus 	compteur 	=   new CompteurPlus( );
		JFrame 			frame 		=   new JFrame("Cliquez here!");

		JPanel panel = new PanelCompteurTF(compteur);

		frame.getContentPane( ).add(panel,BorderLayout.CENTER);
		frame.pack( );
		frame.setVisible(true);
	}
	
}