package Extend_JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import TestFenetreClick.Compteur;

@SuppressWarnings("serial")
public class PanelCompteur1 extends JPanel{
	
	private JLabel 		label 	=	 new JLabel("Compteur : 0");
	private Compteur 	compteur;
	
	public PanelCompteur1 ( Compteur compteur) {
		
		super(new BorderLayout( )); 
		this.compteur=compteur;
	
		JButton button = new JButton("ok");
	
		this.add(label  , BorderLayout.NORTH); 
		this.add(button , BorderLayout.SOUTH); 
		
		button.addActionListener (
				
			new ActionListener() {

				public void actionPerformed(ActionEvent event) { 
					
					PanelCompteur1.this.compteur.incrementer(1);
					PanelCompteur1.this.label.setText( "compteur="+ PanelCompteur1.this.compteur.getValue() );
				}
			} 
		);
		
				
		ActionListener listener = new ActionListener( ){
			
			public void actionPerformed(ActionEvent event) {
				
				PanelCompteur1.this.compteur.incrementer(1);
				PanelCompteur1.this.label.setText("compteur="+ PanelCompteur1.this.compteur.getValue( ));
			}
			
		};
		
		button.addActionListener(listener);
	}
}

