package applet;

import javax.swing.JButton;
import java.awt.event.*;
@SuppressWarnings("serial")
public class UnePremiereApplet extends javax.swing.JApplet {

	public void init( ){

		final JButton button = new JButton("Cliquer pour afficher l'heure");

		this.getContentPane( ).add(button); 
		
		final String message = this.getParameter("message");

		button.addActionListener(new ActionListener() {

			@Override 
			public void actionPerformed(ActionEvent e){

				button.setText(message +new java.util.Date( ).toString( ) );

			}
		});
	}
	

}
