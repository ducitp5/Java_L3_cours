package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import up5.mi.pary.term.Terminal;

public class P187 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Terminal term = new Terminal("Lecture et écriture sur fichier",400,400);

		try {
		
			File f = new File(term.readString("donner un nom"));
		
			if (f.exists( )) {		 // affichage du contenu du fichier
			
				DataInputStream dis = new DataInputStream(new FileInputStream(f));
		
				term.println("1:"+dis.readUTF( ));
				term.println("2:"+dis.readUTF( ));
				
				dis.close( );
			}
		
			else			{ 		// remplissage du fichier
		
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
			
				dos.writeUTF(term .readString("chaine 1?"));
				dos.writeUTF(term .readString("chaine 2?"));
				dos.writeUTF(term .readString("chaine 3?"));
				dos.close( );
			}
		}
		catch (IOException e)	{	term .println("Erreur:"+e);	}

	}

}
