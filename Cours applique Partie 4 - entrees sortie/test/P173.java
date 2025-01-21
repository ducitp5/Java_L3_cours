package test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class P173 {

	public static void main(String[] args) throws IOException {
		
		// création du File puis du FileOutputStream
		
		File 				file 	= new File("new fiche");
		FileOutputStream 	fos 	= new FileOutputStream(file);

		// création du BufferedOutputStream lié à ce FileOutputStream
		BufferedOutputStream 	bos = new BufferedOutputStream(fos , 3);
		
		// l'instruction suivante écrit 1000 octets dans le BufferedOutputStream
		// Le buffer étant de taille 512, au moment de l'écriture du 512 ème,
		// les 512 premiers éléments vont être transmis en bloc au FileOutputStream
		// qui va les écrire dans le fichier. Les 488 vont être bufferisés
		
		for (int i = 65 ; i < 75 ; i++) 		bos.write(i % 100);
		
		// L'appel à close se traduit par le vidage du buffer
		bos.close( );
		
		// maintenant le fichier contient 1000 octets
	}
}
