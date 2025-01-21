package Partie2;

import java.util.ArrayList;
import java.util.Iterator;

public class P161 {

	
	public static void main(String[] args) {

		ArrayList   al	 =	 new ArrayList();
		
		al.add("Hello");
		al.add("World");
		
		// Impression de tous les éléments d'une arrayList 'al' :
		Iterator 	it	 = 	 al.iterator();
		
		while (it. hasNext( )) {
			
			Object 	 elt	 =	 it.next( ); 
			
			System.out.println(elt); 
		}
		System.out.println(it.getClass( ));

	}

}
