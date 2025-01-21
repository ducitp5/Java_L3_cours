package Partie2;

import up5.mi.pary.term.Terminal;

public class P203 {

	
	public static void main(String[] args) {

		int[] t = {6,2,7,9,7};

		Terminal term = new Terminal("Capture d'erreur" , 400 ,400); 
		
		try { 
			
			term.println(" debut "); 
			
			int i = term.readInt("Donner un entier "); 
			
			int x = 1/(t[i+2]-t[i]); 
			int y = t[i+4]; 
			
			term.println("affectations reussies!	x = " +x); 
			term.println("affectations reussies!	y = " +y); 
			
		}

		catch (IndexOutOfBoundsException e) {term.println("indice incorrect " +e);}
		
		catch (ArithmeticException 		 e) {term.println("Operation impossible" +e);}
		
		term.println("FIN et finir"); term.end( );

	}

}
