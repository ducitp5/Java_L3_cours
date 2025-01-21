package Partie2;

import up5.mi.pary.jc.rationnel.Rationnel;
import up5.mi.pary.term.Terminal;

public class P53 {

	public static double sommeReelleDeInverseDesPremiersEntiers(int n){
		
		double somme = 0;
		
		for (int i = 1 ; i <= n ; i++)	 somme = somme + 1d/i;
		
		return(somme);
		
	}
		/**@return le Rationnel somme de l'inverse des 'n' premiers entiers */
		
	public static Rationnel sommeRationnelleDeInverseDesPremiersEntiers(int n){
	
		Rationnel somme 	=	 new Rationnel(0);
		
		for (int i = 1 ; i <= n ; i++) 		somme = somme.addition(new Rationnel(1,i));
		
		return(somme);
		
	}
	
	public static void main(String [] tArg){
	
		Terminal term	 =	  new Terminal("calcul de sommes de rationnels",400,400);
		
		int n = term.readInt("donner un entier ");
		
		term.println("Somme : "+ sommeReelleDeInverseDesPremiersEntiers(n));
		
		term.println("Somme : "+ sommeRationnelleDeInverseDesPremiersEntiers(n));
		
	}
}
