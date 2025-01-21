package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class P171 {

	public static void main(String[] args) throws IOException {
		
		File 			file 	=	 new File("monFichier");
		FileInputStream fis 	=	 new FileInputStream(file);
		
		// on crée un tableau de 1200 bytes
		byte [ ] tb = new byte[1200];
		
		// on lit les 1002 bytes du fichier
		int nbLu = fis.read(tb); // nbLu doit valoir 1002 : le nombre d'octets du fichier, 		
								 // seuls les 1002 premiers éléments du tableau sont affectés
								 // et on ferme le flux
		
		System.out.println(nbLu);
		
		fis.close( );
	}
}
