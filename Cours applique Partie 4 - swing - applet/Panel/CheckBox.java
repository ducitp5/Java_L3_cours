package Panel;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import TestFenetreClick.Compteur;

@SuppressWarnings("serial")
public class CheckBox extends JPanel {

	Compteur   	c		=	new Compteur();
	
	JLabel		label	=	new JLabel("Compteur = " +0);
	
	JButton		bOk		=	new JButton("ok");
	
	JCheckBox	box10	=	new JCheckBox("10");
	
	
	class Click implements ActionListener {	
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int	val	=	box10.isSelected() ? 10 : 1;
			
			CheckBox.this.c.incrementer(val);
			
			CheckBox.this.label.setText("Compteur = " +CheckBox.this.c.getValue());
			
		}
	}

	
	public CheckBox() {
		
		super(new BorderLayout());
		
		this.add(label , BorderLayout.NORTH);
		this.add(box10 , BorderLayout.CENTER);		
		this.add(bOk   , BorderLayout.SOUTH);
		
		Click	cl	=	new Click();
		bOk.addActionListener(cl);
		
		
	}
	
	
	public static void main(String[] args) {

		JFrame frame	=	new JFrame("check box");
		
		frame.setSize(400, 300);		frame.setVisible(true);
		
		CheckBox	JC	=	new CheckBox();
		
		frame.getContentPane().add(JC);
	}

	

}
