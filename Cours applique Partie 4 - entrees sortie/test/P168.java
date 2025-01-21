package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class P168 {

	public static void main(String[] args) throws IOException {

		// création du File puis du FileOutputStream
		File 				file 	=	 new File("monFichier");
		FileOutputStream 	fos 	=	 new FileOutputStream(file);

		// ecriture d'un byte dans le fichier
		fos.write(56); 		// attention : un byte doit être un entier compris en 0 et 255
		
		// ecriture d'un autre byte dans le fichier
		fos.write(125);
		
		// ecriture d'un autre byte dans le fichier
		fos.write(85);
		fos.write(95);
		
		// on crée un tableau de byte et on le rempli
		byte [ ] tb = new byte[1000];
		
		for (int i = 0 ; i < tb.length ; i++) 		tb[i] 	=	(byte) (i % 100);
	
		// on écrit les 1000 bytes dans le fichier
		fos.write(tb);
		
		// et on ferme le flux de sortie
		fos.close( );
		
		// le fichier "monFichier" contient donc maintenant 1002 bytes.
	}

}
