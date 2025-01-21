package TextField;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import TestFenetreClick.Compteur;

@SuppressWarnings("serial")
public class PanelCompteurTF extends JPanel{

	private Compteur 	compteur  		=   new Compteur();
	private JLabel 	 	label			=   new JLabel("Compteur : "  +0);
	private JButton 	bOK 			=   new JButton("OK");
	private JTextField 	textField   	=   new JTextField(10);;

	class EcouteurTF implements java.awt.event.ActionListener{

		public void actionPerformed(java.awt.event.ActionEvent e){

			PanelCompteurTF.this.compteur.incrementer( Integer.parseInt(PanelCompteurTF.this.textField.getText( )));

			PanelCompteurTF.this.label.setText("Compteur : " +PanelCompteurTF.this.compteur.getValue( )+" "); 
		
		}
	}


	public PanelCompteurTF(){

		super(new BorderLayout( ));			

		JPanel panel = new JPanel();   	panel.add(new JLabel("Incrementation : "));	
										panel.add(this.textField);
		
		this.add(panel 		,BorderLayout.EAST);
		
		this.add(this.label	,BorderLayout.NORTH);
		this.add(bOK		,BorderLayout.SOUTH);

		bOK.addActionListener(new EcouteurTF( ));
	}
	
	public static void main(String [ ] args){

		JPanel 		panel 		= 	new PanelCompteurTF();

		JFrame 		frame 		=   new JFrame("Cliquez here Compteur kkTF");

		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.getContentPane().add(panel,BorderLayout.EAST);
		
	}
	
}