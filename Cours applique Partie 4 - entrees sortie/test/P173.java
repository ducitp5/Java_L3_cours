package test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class P173 {

	public static void main(String[] args) throws IOException {
		
		// cr�ation du File puis du FileOutputStream
		
		File 				file 	= new File("new fiche");
		FileOutputStream 	fos 	= new FileOutputStream(file);

		// cr�ation du BufferedOutputStream li� � ce FileOutputStream
		BufferedOutputStream 	bos = new BufferedOutputStream(fos , 3);
		
		// l'instruction suivante �crit 1000 octets dans le BufferedOutputStream
		// Le buffer �tant de taille 512, au moment de l'�criture du 512 �me,
		// les 512 premiers �l�ments vont �tre transmis en bloc au FileOutputStream
		// qui va les �crire dans le fichier. Les 488 vont �tre bufferis�s
		
		for (int i = 65 ; i < 75 ; i++) 		bos.write(i % 100);
		
		// L'appel � close se traduit par le vidage du buffer
		bos.close( );
		
		// maintenant le fichier contient 1000 octets
	}
}
