package Partie1;

import up5.mi.pary.term.Terminal;

public class P132 {
	
	public static int [ ] saisieTabInt(Terminal term,int n){
		
		int[] tab =new int[n];/* le r�sultat est un tableau de n �l�ments*/
		
		for (int i = 0; i < n ; i++)		tab [i] = term.readInt("");/* saisie de l'�l�ment d'indice i*/
		
		return tab;
	}

	public static boolean appartient(int [ ] tab , int elt){
		
		boolean trouve=false;
		int i=0;
		
		while ((i<tab.length)&&(!trouve)){
		
			if (tab [i] == elt) trouve=true;
			
			else i++;
		}
		
		return trouve;
	}
	
	public static void main(String [ ] args){
	
		Terminal term = new Terminal("test de l'appartenance � un tableau",400,400);
		
		int [ ] tab= saisieTabInt(term , 5);
		int x=term.readInt("quel nombre dois-je chercher ?");
		
		if (appartient(tab,x))		term.println( x+" appartient au tableau ");
	}
}
