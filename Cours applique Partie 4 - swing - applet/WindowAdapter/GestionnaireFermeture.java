package WindowAdapter;

import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GestionnaireFermeture extends WindowAdapter{
	
	private JFrame 	  frame;
	
	public GestionnaireFermeture (JFrame frame) 	{	this.frame	=	frame;	}
	
	
	public void windowClosing(WindowEvent event){
	
		int reponse = JOptionPane.showConfirmDialog(this.frame,"Voulez-vous quitter ?" ,"Confirmation", JOptionPane.YES_NO_OPTION);
	
		if (reponse == JOptionPane.YES_OPTION)
	
			this.frame.dispose( );
	}
}
