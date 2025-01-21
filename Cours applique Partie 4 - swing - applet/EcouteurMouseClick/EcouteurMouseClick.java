package EcouteurMouseClick;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import TestFenetreClick.Compteur;


class EcouteurMouseClick implements MouseListener { 
	
	private Compteur 	compteur ;// le compteur du nombre de clicks 
	private JLabel 		label ; // le label dont on veut modifier le texte
	
	public EcouteurMouseClick (Compteur compteur, JLabel label) {
		
		this.compteur 	= 	compteur ;
		this.label 		= 	label ; 
	}
	
	public void mouseEntered(MouseEvent e) {
	
		this.compteur.incrementer(1) ;
		
		this.label.setText("Compteur t : " +this.compteur.getValue( )+ " ") ; 
	}
	
	public void mouseExited		(MouseEvent e) 	{ }
	public void mouseClicked	(MouseEvent e)	{ }
	public void mousePressed	(MouseEvent e)	{ }
	public void mouseReleased	(MouseEvent e)	{ }
	
}