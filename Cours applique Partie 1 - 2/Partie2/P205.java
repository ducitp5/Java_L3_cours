package Partie2;

import up5.mi.pary.term.Terminal;

public class P205 {

	public static void affecter(Terminal term,int i,int[] tab) {
		
		try { 
			
			int x = 1/(tab[i+2]-tab[i]); 
			int y = tab[i+4];
			
		} 
		
		catch (ArithmeticException e) {
			
			term.println("Operation impossible " +e);
			
		} 
		
		term.println("Fin de affecter"); 
		
	} 
	
	public static void main(String[] tArg) { 
		
		int [] t = {6,2,7,9,7}; 
		
		Terminal term = new Terminal("Capture d'erreur 1" , 400 ,400); 
		
		Terminal term2 = new Terminal("Capture d'erreur 2" , 300 ,300); 
		
		try {
			
			term.println(" debut "); 
			
			int i = term.readInt("Donner un entier "); 
			
			affecter(term2 ,i,t);
			
			term.println("affectations terminees!"); 
			
		} 
		
		catch (IndexOutOfBoundsException e) { 
			
			term.println("indice incorrect " +e);
			
		} 
		
		term.println("FIN et finir"); term.end();
		
	}
}
