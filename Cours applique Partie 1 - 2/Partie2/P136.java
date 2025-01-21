package Partie2;

import java.util.ArrayList;

public class P136 {

	
	public static void main(String[] args) {

		 ArrayList al = new ArrayList(); 
		 al.add ("Essai "); 
		 al.add ("de la classe"); 
		 al.add ("ArrayList"); 
		 
		 System.out.println("Element d'indice 2: "+ al.get(2)); 
		 System.out.println(al.toString( )); 
		 
		 al.set(0,"Utilisation"); 
		 System.out. println(al.toString( ));		
	}
}
