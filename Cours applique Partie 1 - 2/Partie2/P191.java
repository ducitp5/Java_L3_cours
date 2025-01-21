package Partie2;

import java.util.ArrayList;

public class P191 {

	public static double getSomme (ArrayList<Number> list) {

		double res	=	0;

		for (Number e : list) 		res	   +=	e.doubleValue();
		
		return res;
		
	}
	
	public static void main(String [] args) { 
		
		ArrayList<Number> list = new ArrayList(); 
		
		list.add(new Double(3));
		list.add(new Double(5)); 
		
		System.out.println(getSomme(list));
		
	}
}