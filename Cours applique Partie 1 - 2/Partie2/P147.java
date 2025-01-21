package Partie2;

import java.util.HashMap;

public class P147 {

	
	public static void main(String[] args) {

		HashMap h 	=	 new HashMap( );
		
		h.put("Lucie","1.43.12.12.32");
		h.put("Loïc","1.43.36.48.91");
		h.put("Anaïs","2.34.32.64.01");
		
		h.put("3", "6789");
		h.put("3", "4444");		
		
		System.out.println("HashMap size = "+h.size());
		
		String s1 = Saisie.lireChaine("Nom ?");
		System.out.println(h.get(s1));
		
		String s2 = Saisie.lireChaine("Nom ?");
		System.out.println(h.get(s2));

	}

}
