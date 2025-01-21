package Partie2;

import java.util.ArrayList;

public class P152 {

	public static double somme(ArrayList al) {

		double 	 res	 =	  0;

		for (int i = 0 ; i < al.size( ) ; i++) {

			Number 	n	 =	 (Number) al.get(i);
		
			res		+=	 n.doubleValue( );
		}

		return res;
		
	}
	public static void main(String[] args) {

		ArrayList al = new ArrayList( );
		al.add(new Integer(5));
		al.add(new Double(5.3));
		al.add(new Short((short) 35));
		
		System.out.println(somme(al));
		/** rend la somme des éléments du vecteur de Number 'v' */
		

	}

}
