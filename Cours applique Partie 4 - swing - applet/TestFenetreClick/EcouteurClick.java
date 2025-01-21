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
	/** M�thode appel�e
	 * lorsqu'un �v�nement ActionEvent 'e' � �t� g�n�r� suite
	 * � une action sur un composant auquel ce gestionnaire est associ� */

	public void actionPerformed(java.awt.event.ActionEvent e){

		this.compteur.incrementer(1);
		
		this.label.setText("Compteur origine: " +this.compteur.getValue( )+ " ") ;
	}	
}