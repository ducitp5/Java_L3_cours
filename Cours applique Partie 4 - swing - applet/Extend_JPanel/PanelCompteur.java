package Extend_JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import TestFenetreClick.Compteur;

@SuppressWarnings("serial")
public class PanelCompteur extends JPanel {
	
	private JLabel 		label = new JLabel("Compteur : 0");
	private Compteur 	compteur;

	public PanelCompteur(Compteur compteur) {

		super(new BorderLayout());
		
		this.compteur = compteur;		
				
		JButton 	button = new JButton("ok");		button.addActionListener(new EcouteurClick());
	
		this.add(label, BorderLayout.NORTH);
		this.add(button, BorderLayout.SOUTH);
	}

	public class EcouteurClick implements ActionListener {

		public EcouteurClick() { }

		public void actionPerformed(ActionEvent event) {

			PanelCompteur.this.compteur.incrementer(1);
			
			PanelCompteur.this.label.setText("compteur=" + PanelCompteur.this.compteur.getValue());
		}
	}
}