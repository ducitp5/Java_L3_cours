package Partie2;

import java.util.Date;

import up5.mi.pary.jc.compte.Compte;

public class P132 {

	public static void afficherEnMinuscule(Object [ ] tab){

		for (int i = 0 ; i < tab.length ; i++) {

			String s = tab[i].toString();
		
			System.out.println(s.toLowerCase());
		}
		
	}
	
	public static void main(String[] args) {

		Object [ ] tab = new Object[3];

		tab[0]	=	 new Compte("Dupond",200, 0);
		tab[1]	=	 "une chaîne";
		tab[2]	=	 new Date(0);
		
		afficherEnMinuscule(tab);
		
		for (int i = 0 ; i < tab.length ; i++) {
		
			String s = tab[i].toString();

			System.out.println(s.toUpperCase());
		}
		
		
		

	}

}
