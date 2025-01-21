package JPanel;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import TestFenetreClick.Compteur;

public class TestPanelCompteur {

	
	public static void main(String[] args) {

		Compteur compteur = new Compteur( );
		JFrame frame = new JFrame("Cliquez here !");
		JPanel panel = new PanelCompteur(compteur);
		frame.getContentPane( ).add(panel,BorderLayout.CENTER);
		frame.pack( );
		frame.setVisible(true);
	}

}
