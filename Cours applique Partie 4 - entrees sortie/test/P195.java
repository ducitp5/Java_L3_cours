package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import up5.mi.pary.jc.compte.Compte;
import up5.mi.pary.term.Terminal;

public class P195 {

	/** sérialise et sauvegarde un objet dans un fichier */
	public static void saveToFile(Object object, File file) throws IOException {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(object);
		} finally {
			oos.close();
		}
	}

	/** récupère un objet qui a été sérialisé dans un fichier */
	public static Object loadFromFile(File file) throws IOException,
			ClassNotFoundException {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			return ois.readObject();
		} finally {
			ois.close();
		}
	}
	
	
	public static void main(String[ ] args) throws IOException{

		Terminal term = new Terminal("Sérialisation",400,400);
		
		String nomTit = term .readString("nom du titulaire du compte ?"); 
		
		File fichierSauvegarde=new File(nomTit);

		Compte compte; 
		
		try { 
			
			compte = (Compte) loadFromFile(fichierSauvegarde);
		}
		
		catch (Exception e) {
			
			compte = new Compte(nomTit);
			
		};
		// ICI se trouvent les instructions centrales du programme
		// par exemple un menu pour consulter le solde, ajouter des opérations
		
		try {
			saveToFile(compte, fichierSauvegarde);
		}
		
		catch (Exception e)  {term.println("Erreur : "+e);}
		}
}
