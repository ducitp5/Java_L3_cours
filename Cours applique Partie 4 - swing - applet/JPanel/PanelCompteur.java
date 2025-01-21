package JPanel;

import javax.swing.*; 
import TestFenetreClick.Compteur;

import java.awt.*; import java.awt.event.*;


@SuppressWarnings("serial")
public class PanelCompteur extends JPanel {

	public PanelCompteur(Compteur compteur) {

		super(new BorderLayout( ));

		JLabel label = new JLabel("Compteur PanelCompteur: " +0);

		this.add(label,BorderLayout.NORTH);

		JButton bOk = new JButton("OK hehe");

		this.add(bOk,BorderLayout.SOUTH);

		// créer un écouteur d'événements
		ActionListener ecouteur =new EcouteurClick (compteur,label);
		
		// 'ecouteur' devient un écouteur d'événements pour
		// les clicks sur le bouton bOK
		bOk.addActionListener(ecouteur);

	}
}