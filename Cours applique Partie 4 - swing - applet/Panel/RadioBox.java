package Panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import TestFenetreClick.Compteur;

@SuppressWarnings("serial")
public class RadioBox extends JPanel{

	
	
	JLabel			label	=	new JLabel("Compteur = ");
	JButton			bOk		=	new JButton("ok");
	
	JRadioButton	box1	=	new JRadioButton("1"),
					box5	=	new JRadioButton("5"),
					box10	=	new JRadioButton("10");
	ButtonGroup		bg		=	new ButtonGroup();		
	
	
	class Click implements	ActionListener{

		Compteur		c		=	new Compteur();
		@Override
		public void actionPerformed(ActionEvent e) {

			int valuedef	= 0;
			bg.add(box1);			
			bg.add(box5);
			bg.add(box10);
			JButton button = (JButton)e.getSource();
			
			if(button.getText() =="1" )				valuedef = 1;
			else if (button.getText() == "5")		valuedef = 5;
			else									valuedef = 10;
		
			if(button.getText() == "ok" ) {
				
				this.c.incrementer(valuedef);
				RadioBox.this.label.setText("Compteur = " +this.c.getValue());
			}
			
		}
		
	}
	
	public RadioBox() {
		
		super(new BorderLayout());
		
		this.add(label , BorderLayout.NORTH);
		this.add(bOk	,BorderLayout.CENTER);
	
		Click cl = new Click();
		bOk.addActionListener(cl);
		JPanel	Radio = new JPanel();
		Radio.add(box1)	;	Radio.add(box5) ; Radio.add(box10);
		
		this.add(Radio , BorderLayout.SOUTH);
		
		
		
	}
	
	
	public static void main(String[] args) {

		JFrame	frame	=	new JFrame("check radio");
		
		frame.setSize(400 , 300);	frame.setVisible(true);
		
		JPanel	panel	=	new RadioBox();
		
		frame.getContentPane().add(panel);
	}

}
