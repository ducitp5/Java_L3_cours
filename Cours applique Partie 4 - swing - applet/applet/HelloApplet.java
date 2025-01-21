package applet;
import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.event.*;
@SuppressWarnings("serial")

public class HelloApplet extends JApplet {

	public void init() {

		final JButton button = new JButton("Cliquer pour afficher l'heure");

/*		this.getContentPane( ).add(button);

		button.addActionListener(
				
			new ActionListener() {

				@Override 
				public void actionPerformed(ActionEvent e){

					button.setText( new java.util.Date().toString() );
				}
			}
		);
*/	
		class Click implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				button.setText( new java.util.Date().toString() );
				
			}
			
		}
		
		ActionListener ac = new Click();
		
		button.addActionListener(ac);
	
		this.getContentPane().add(button);	
	
	
	
	}
}