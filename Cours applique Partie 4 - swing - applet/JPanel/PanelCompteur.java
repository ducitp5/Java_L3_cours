package JPanel;

import javax.swing.*; 
import TestFenetreClick.Compteur;

import java.awt.*; import java.awt.event.*;


@SuppressWarnings("serial")
public class PanelCompteur extends JPanel {

	public PanelCompteur(Compteur compteur, JFrame $frame) {

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
		
		JButton bClose = new JButton("Close");

		this.add(bClose, BorderLayout.EAST);
		
		bClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				$frame.dispose(); // Closes the frame
			}
		});
	}
}