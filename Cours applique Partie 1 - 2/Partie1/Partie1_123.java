package Partie1;

import up5.mi.pary.term.Terminal;

public class Partie1_123 {

	
	public static void main(String [] tArg) {
		
		Terminal term = new Terminal("calcul du carré de la somme",300,300);
		
		int tab[ ]=new int[5];
		int i;
		
		tab[2]=456;/* tab[2] est l'élément d'indice 2 du tableau tab */
		tab[2-2]=3;
		tab[3]=term.readInt("");
		tab[1] = tab[tab[0]];
		i= term.readInt(""); tab[i] = term.readInt("");
		term.println(""+ tab[0]+ tab[1]+ tab[2]+ tab[3]+ tab[4]);
	}
}
