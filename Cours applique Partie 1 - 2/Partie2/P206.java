package Partie2;

import up5.mi.pary.term.Terminal;

public class P206 {

	public static void affecter(Terminal term,int i,int[] tab) {
		
		try { 
			
			int x = 1/(tab[i+2]-tab[i]); 
			int y = tab[i+4];
			
		} 
		
		catch (ArithmeticException e) {
				
				term.println("Operation impossible " +e);
				
		} 
		finally { term.println("Fin de affecter"); } 
		
	} 
	
	public static void main(String[] tArg) {
		
		int [ ] t = {6,2,7,9,7}; 
		
		Terminal term2 = new Terminal("Capture d'erreur 2" , 300 ,300); 
		
		
		try {
			
			System.out.println(" debut "); 
			
			int i = Saisie.lireEntier("Donner un entier ");
			
			affecter(term2,i,t); 
			
			term2.println("affectations terminees!");
			
		}

		catch (IndexOutOfBoundsException e) {
			
			term2.println("indice incorrect " +e);
			
		} 
		
		term2.println("FIN et finir"); term2.end();
		
	}
	
}

