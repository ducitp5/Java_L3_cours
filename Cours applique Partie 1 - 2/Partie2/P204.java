package Partie2;

import up5.mi.pary.term.Terminal;

public class P204 {

	public static void affecter(int i,int[] tab) { 
		
		int x = 1/(tab[i+2]-tab[i]); 
		
		int y = tab[i+4]; 
		
	}
	
	public static void main(String[] tArg) { 
		
		int [ ] t = {6,2,7,9,7}; 
		
		Terminal term = new Terminal("Capture d'erreur" , 300 , 300); 
		
		try { 
			term .println(" debut "); 
			
			int i = term .readInt("Donner un entier "); 
			
			affecter(i,t); 
			
			term .println("affectations reussies! "); 
			
		}

		catch (IndexOutOfBoundsException e) {
			
			term .println("indice incorrect " +e);
			
		} 
		
		catch (ArithmeticException e) {
			
			term .println("Operation impossible " +e);
			
		} 
		
		term.println("FIN et finir"); term.end();}
}
