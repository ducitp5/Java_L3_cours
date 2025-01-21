package Partie2;

import java.util.Date;

import up5.mi.pary.jc.compte.Compte;

public class P130 {

	
	public static void main(String[] args) {
		

		int i = Saisie.lireEntier("donner un entière ");
		Object obj = new Date( );
		if (i==1) obj = new Compte("Dupond",400,400);
		String s = obj.toString( ); // accepté car toString est définie dans la classe Object // la méthode effectivement exécutée sera ici
		// celle de la classe Date ( i!=1 )
		// ou celle de la classe Compte ( i == 1 )
		System.out.println(s);

	}

}
