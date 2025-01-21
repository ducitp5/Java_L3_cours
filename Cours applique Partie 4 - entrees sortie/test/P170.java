package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class P170 {


	public static void main(String[] args) throws IOException {
		
		// on lit le contenu du fichier de l'exemple pr�c�dent : il contient 1002 bytes
		// cr�ation du File puis du FileInputStream
		File file = new File("ko co");
		FileInputStream fis = new FileInputStream(file);
	
		// lecture du premier byte contenu dans le fichier
		int n1 = fis.read( );
		
		// lecture du second byte
		int n2 = fis.read( );
		
		System.out.println(n1 + "  et  " +n2);
		
		// on cr�e un tableau de 1000 bytes
		byte [ ] tb = new byte[1000];
		
		// on lit les 1000 bytes suivant du fichier
		System.out.println(fis.read(tb));
		
		for (int i = 0 ; i < tb.length ; i++)		System.out.println(tb[i]);
		
		// et on ferme le flux
		fis.close( );

	}

}
