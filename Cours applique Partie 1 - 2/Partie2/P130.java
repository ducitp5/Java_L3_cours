package Partie2;

import java.util.Date;

import up5.mi.pary.jc.compte.Compte;

public class P130 {

	
	public static void main(String[] args) {
		

		int i = Saisie.lireEntier("donner un enti�re ");
		Object obj = new Date( );
		if (i==1) obj = new Compte("Dupond",400,400);
		String s = obj.toString( ); // accept� car toString est d�finie dans la classe Object // la m�thode effectivement ex�cut�e sera ici
		// celle de la classe Date ( i!=1 )
		// ou celle de la classe Compte ( i == 1 )
		System.out.println(s);

	}

}
