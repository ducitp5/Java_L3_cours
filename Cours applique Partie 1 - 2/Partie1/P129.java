package Partie1;

import up5.mi.pary.term.Terminal;
//import up5.mi.pary.jt.term.support.Partie1.P128;

public class P129 {

/*	public static void afficher(Terminal term,int [] tab){
		
		for (int i = 0; i < tab.length ; i++) { 
			
			term.print(tab[i]);
		
			if (i!=tab.length-1) term.print(" ");
		}
		
		term.println();
	}
*/	
	public static int [ ] saisieTabInt(Terminal term,int n){
		
		int[] tab =new int[n];/* le résultat est un tableau de n éléments*/
		
		for (int i = 0; i < n ; i++)		tab [i] = term.readInt("");/* saisie de l'élément d'indice i*/
		
		return tab;
	}
	
	public static void main (String [ ] args){
	
		Terminal term = new Terminal("Saisie et affichage d'un tableau" , 500 , 500); 
		
		int [ ] tabInt=saisieTabInt(term,5);
		
		P128.afficher(term , tabInt);
		
	}

}
