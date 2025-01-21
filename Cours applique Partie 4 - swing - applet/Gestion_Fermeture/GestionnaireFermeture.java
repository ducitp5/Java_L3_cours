package Gestion_Fermeture;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class GestionnaireFermeture implements WindowListener {

	private  JFrame 	frame;

	public GestionnaireFermeture(JFrame frame) 		{	this.frame 	 =	frame;		}

	public void windowClosing(WindowEvent event){

		int reponse = JOptionPane.showConfirmDialog( this.frame,"Voulez-vous quitter ?" , "Confirmation" , JOptionPane.YES_NO_OPTION);

		if (reponse == JOptionPane.YES_OPTION)			this.frame.dispose( );

	}

	public void windowActivated		(WindowEvent event){}

	public void windowClosed 		(WindowEvent event){}

	public void windowDeactivated 	(WindowEvent event){}

	public void windowDeiconified 	(WindowEvent event){}

	public void windowIconified 	(WindowEvent event){}

	public void windowOpened 		(WindowEvent event){}
	
}