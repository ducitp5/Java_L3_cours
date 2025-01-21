package test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class P175 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		// on consid�re notre fichier "monFichier" avec ses 1000 octets
		// cr�ation du File puis du FileInputStream

		File file = new File("monFichier");
		FileInputStream fis = new FileInputStream(file);
		
		// cr�ation du BufferedInputStream li� � ce FileInputStream
		
		BufferedInputStream bis = new BufferedInputStream(fis,512);
		
		// l'instruction suivante lit 1000 octets � partir du BufferedInputStream
		// Seuls deux acc�s disques seront effectu�s : le premier lors du premier appel � read (le buffer sera alors rempli avec 512 octets), et le second au 513 �me appel (le buffer sera alors rempli avec les 488 octets restants)
		
		for (int i=0;i < 1000 ; i++ ) System.out.print(bis.read( ) + " - ");
		
		// fermeture du flux
		bis.close( );
	}

}
