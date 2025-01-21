package JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import TestFenetreClick.Compteur;

@SuppressWarnings("serial")
public class PanelCompteurCB_FlowLayout extends JPanel{

	private JLabel label = new JLabel("Compteur : 0");

	private JCheckBox box10;
	private Compteur compteur;

	class EcouteurCB implements java.awt.event.ActionListener {

		public EcouteurCB( ){ }

		public void actionPerformed(java.awt.event.ActionEvent e) {
			
			int incrValue = PanelCompteurCB_FlowLayout.this.box10.isSelected() ? 10:3;

			PanelCompteurCB_FlowLayout.this.compteur.incrementer(incrValue); 
			
			PanelCompteurCB_FlowLayout.this.label.setText("Compteur :" +PanelCompteurCB_FlowLayout.this.compteur.getValue( )); 
			
		}
	}// fin de la classe interne EcouteurCB

	
	public PanelCompteurCB_FlowLayout() {
		
		super(new BorderLayout( )); 

		Compteur compteur = new Compteur();

		this.compteur	=	compteur;

		JButton bOk = new JButton("ok");			this.add(bOk  ,BorderLayout.SOUTH);
		
		this.box10 = new JCheckBox("dix par dix");	this.add(this.box10,BorderLayout.EAST);
		
													this.add(label,BorderLayout.NORTH); 
		
		
		// créer un écouteur d'événements
		EcouteurCB ecouteur  =  new EcouteurCB( );
	
		// ecouteur devient un écouteur d'événements pour les clicks sur le bouton bOk
		bOk.addActionListener(ecouteur);
	}
	
	
	
	
	
	public static void main(String [ ] args){

		
		JPanel panel = new PanelCompteurCB_FlowLayout();

		JFrame 		frame 		=   new JFrame("Cliquez here Flow Layout!");

		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.getContentPane( ).add(panel,BorderLayout.CENTER);
		
//		panel.setLayout(new FlowLayout( ));
//		panel.setLayout(new GridLayout(3,1));
//		panel.setLayout(new GridLayout(1,3));
//		panel.setLayout(new BorderLayout( ));
	}
	
}
