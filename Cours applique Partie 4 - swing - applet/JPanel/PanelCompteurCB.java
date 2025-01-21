package JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import TestFenetreClick.Compteur;

@SuppressWarnings("serial")
public class PanelCompteurCB extends JPanel{

	private JLabel label = new JLabel("Compteur : 0");

	private JCheckBox box10;
	private Compteur compteur;

	public PanelCompteurCB ( Compteur compteur) {

		super(new BorderLayout( )); 

		this.compteur	=	compteur;

		JButton bOk = new JButton("ok");

		this.add(label,BorderLayout.NORTH); 
		this.add(bOk ,BorderLayout.SOUTH);
		
		this.box10 = new JCheckBox("dix par dix");
		
		this.add(this.box10,BorderLayout.EAST);

		// créer un écouteur d'événements
		EcouteurCB ecouteur  =  new EcouteurCB( );
	
		// ecouteur devient un écouteur d'événements pour les clicks sur le bouton bOk
		bOk.addActionListener(ecouteur);
	}
	
	class EcouteurCB implements java.awt.event.ActionListener {

		public EcouteurCB( ){ }

		public void actionPerformed(java.awt.event.ActionEvent e) {
			
			int incrValue = PanelCompteurCB.this.box10.isSelected() ? 10:3;

			PanelCompteurCB.this.compteur.incrementer(incrValue); 
			
			PanelCompteurCB.this.label.setText("Compteur :"+ PanelCompteurCB.this.compteur.getValue( )); 
			
		}
	}// fin de la classe interne EcouteurCB

	
	
	
	public static void main(String [ ] args){

		Compteur 	compteur 	=   new Compteur( );
		JFrame 		frame 		=   new JFrame("Cliquez here!");

		JPanel panel = new PanelCompteurCB(compteur);

		frame.getContentPane( ).add(panel,BorderLayout.CENTER);
		frame.pack( );
		frame.setVisible(true);
	}
	
}
