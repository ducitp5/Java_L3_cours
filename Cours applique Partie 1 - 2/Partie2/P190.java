package Partie2;

import java.util.ArrayList;

public class P190 {

	public static double getSomme (ArrayList list) {
	
		double res	=	0;

		for (Object e	 :	 list) {

			res	  +=	( (Number) e ).doubleValue( );
		}
		
		return res;
	}
	
	public static void main(String [] args) {
	
		ArrayList list = new ArrayList ( ); 
			
		list.add(new Double(3));
		list.add(new Double(5)); 
			
		System.out.println(getSomme(list));
	}
	
}
