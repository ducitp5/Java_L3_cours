package ClickColor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import TestFenetreClick.Compteur;

@SuppressWarnings("serial")
public class PanelClickColor extends JPanel {

	private static 	JLabel 		 label	   		=   new JLabel("Compteur : " + 0);	;				// pas PanelClickColor.this.label.setText
	
	private     	JButton		 bOk			=   new JButton("OK");
	private			JButton  	 bChoixCouleur  =   new JButton("thay doi couleur");	
				
				
	class GestionnaireClickColor implements ActionListener {	// Label Compteur et Color


		private 	Compteur 	 compteur  =  new Compteur();
		
		private 	JComponent 	 component;	
		
		public GestionnaireClickColor(JComponent component) {   this.component = component ;}
		
		public void actionPerformed(ActionEvent event) {

			JButton 	button 	  =   (JButton) event.getSource();
			
			if (button.getText().equals("OK")) {

				this.compteur.incrementer(3);
				
				PanelClickColor.label.setText("Compteur new : " + this.compteur.getValue() );
			}
			
			else {
			
				Color   c   =   JColorChooser.showDialog(this.component , "Chon 1 couleur", Color.blue);
				
				PanelClickColor.label.setForeground(c);
			}
		}
	}

	public PanelClickColor() {
	
		super(new BorderLayout());
		
		this.add(label, BorderLayout.NORTH);
		
		GestionnaireClickColor ecouteur = new GestionnaireClickColor(this);
		
		this.add(bChoixCouleur, BorderLayout.EAST);		bChoixCouleur.addActionListener(ecouteur);

		this.add(bOk		  , BorderLayout.SOUTH);	bOk			 .addActionListener(ecouteur);

			
	}
	
	public static void main(String [ ] args){

		JFrame frame = new JFrame("Cliquez PanelClickColor !");

		JPanel panel = new PanelClickColor();

		frame.getContentPane( ).add(panel,BorderLayout.CENTER);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
}
