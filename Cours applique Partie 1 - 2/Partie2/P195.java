package Partie2;

import java.util.Arrays;
import java.util.List;

public class P195 {
	
	public static String getPremierEltDiff(List<String> list,String elt) {

		boolean 	trouve	=	false;
		
		int 		i		=	0; 
		
		while (!trouve && i<list.size())
		
			if (! list.get(i).equals(elt))
		
				trouve=true; else i++; 
		
		return 	 (trouve)  ?  list.get(i) : null;
		
	}

	public static <F> F getPremierEltDiff(List<F> list,F elt){

		boolean 	trouve	=	false;
		
		int 		i		=	0; 
		
		while (!trouve && i<list.size())
		
			if (! list.get(i).equals(elt))
		
				trouve=true; else i++; 
		
		return 	 (trouve)  ?  list.get(i) : null;
	}
	
		
	public static void main(String[] args) {

		List<String> 	l1	=	Arrays.asList ( new String[] {"ert","ert","yui","abs"} );

		String s1 = getPremierEltDiff(l1, "ert");
		
		String s2 = getPremierEltDiff(l1, "abs");
		
		System.out.println(s1 +"     " +s2);
	}

}
