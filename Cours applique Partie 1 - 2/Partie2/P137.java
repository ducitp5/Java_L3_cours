package Partie2;

import java.util.ArrayList;

public class P137 {

	public static void main(String[] args) {

		ArrayList al	 =	  new ArrayList();
		
		al.add("BoNjOUr");
		
		String 	s2	 =	(String)al.get(0);
		
		// String s2 = al.get(0); serait refusé à la compilation car get rend un Object
		
		System.out.println(s2.toUpperCase());
		// Les deux étapes en une instruction (attention au parenthèsage !)
		System.out.println(((String) al.get(0)).toUpperCase());

	}

}
