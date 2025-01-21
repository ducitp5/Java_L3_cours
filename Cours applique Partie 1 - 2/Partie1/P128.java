package Partie1;

import up5.mi.pary.term.Terminal;

public class P128 {

	public static void afficher(Terminal term,int [] tab){
		
		for (int i = 0; i < tab.length ; i++) { 
			
			term.print(tab[i]);
		
			if (i!=tab.length-1) term.print(" ");
		}
		
		term.println();
	}
	
	public static void main (String[] args){
	
		int [ ] tabInt = {32,12,23,21,5};
		
		Terminal term = new Terminal("affichage de tableaux",400,400);
		
		afficher(term , tabInt);
	}

}
