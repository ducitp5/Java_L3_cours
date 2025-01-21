package Partie2;

import java.util.Arrays;
import java.util.List;

public class P194 {

	public static Object getPremierEltDiff(List list,Object elt) {
		
		boolean 	trouve	=	false;
		
		int 		i		=	0; 
		
		while (!trouve && i<list.size())
		
			if (! list.get(i).equals(elt))			trouve  =  true; 
			
			else 									i++; 
		
		return 	 (trouve)  ?  list.get(i) : null;
	}
	
	public static void main(String [] args) { 

		List<String> 	l1	 =	 Arrays.asList ( new String[] {"ert","ert","yui","abs"} );

		String 			s	 =	 (String) getPremierEltDiff(l1, "ert");
		
		System.out.println(s);
	}
	

}
