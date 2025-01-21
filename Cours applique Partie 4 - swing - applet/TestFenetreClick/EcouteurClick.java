package TestFenetreClick;

import javax.swing.JLabel;

import TestFenetreClick.Compteur;


class EcouteurClick implements java.awt.event.ActionListener {

	private Compteur  compteur ;// le compteur du nombre de clicks
	private JLabel 	  label ; // le label dont on veut modifier le texte

	public EcouteurClick (Compteur compteur , JLabel label) {

		this.compteur 	=	compteur ;
		this.label 		= 	label ;
	}
	/** Méthode appelée
	 * lorsqu'un événement ActionEvent 'e' à été généré suite
	 * à une action sur un composant auquel ce gestionnaire est associé */

	public void actionPerformed(java.awt.event.ActionEvent e){

		this.compteur.incrementer(1);
		
		this.label.setText("Compteur origine: " +this.compteur.getValue( )+ " ") ;
	}	
}