package Gestion_Fermeture;

import java.awt.event.WindowListener;

import javax.swing.JFrame;

import JPanel.PanelCompteur;
import TestFenetreClick.Compteur;

public class TestFenetreClickClose {

	public static void main(String [] args){

		Compteur compteur = new Compteur( );

		JFrame frame = new JFrame("Fenetre avec gestion de la case de fermeture");

		frame.getContentPane( ).add(new PanelCompteur(compteur) );

		// ne rien faire par d�faut lors du click sur la case de fermeture
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

		// cr�er et associer un �couteur d'�v�nements pour cette fen�tre
		// Cela se traduira par le fait que lors du click sur la case de fermeture,
		// la m�thode windowClosing sera appliqu�e � l'�couteur.

		WindowListener gf=new GestionnaireFermeture(frame);
		
		frame.addWindowListener(gf);
		frame.pack( );
		frame.setVisible(true);

	}
	
}