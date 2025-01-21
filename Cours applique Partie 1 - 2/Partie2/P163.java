package Partie2;

import java.util.HashMap;
import java.util.Iterator;

public class P163 {
	
	public static void main(String[] args) {

		HashMap h = new HashMap( );
		
		h.put("Lucie","1.43.12.12.32");
		h.put("Loïc","1.43.36.48.91");
		h.put("Anaïs","2.34.32.64.01");
		
		Iterator itValues = h.values( ).iterator( );
		
		while (itValues.hasNext( ))			System.out.print(itValues.next( )+" ");
		
		System.out.println();

		Iterator itKeys = h.keySet( ).iterator( );
		
		while (itKeys . hasNext( ))			System.out.print(itKeys.next( )+" ");
		System.out.println();
		
		System.out.println(itKeys.getClass( ).getName( ));

	}

}
