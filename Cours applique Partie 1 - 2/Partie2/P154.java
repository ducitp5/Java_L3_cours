package Partie2;

import java.util.ArrayList;

public class P154 {

	public static int sommeEntiere(ArrayList v) {

		int 	res	 =	 0;
		
		for (int i = 0 ; i < v.size() ; i++) {

			Integer 	n   =   (Integer) v.get(i);
		
			res		+=		n.intValue( );
		}

		return res;
		
	}
	
	public static void main(String[] args) {

		java.util.ArrayList v = new java.util. ArrayList();
		
		for (int i = 1 ; i <= 5 ; i++) {
			
			Integer gI 	 =	 new Integer(i);
			
			v.add(gI);		
		}		
		
		System.out.println(sommeEntiere(v));
		
		for (int i = 0 ; i < v.size() ; i++) {
			
			String 	 s	 =	 v.get(i).toString(); 
			
			Integer  gI  = 	 new Integer(s+s); 
			
			v.set(i,gI);			
		}
		
		System.out.println(sommeEntiere(v));

	}

}
