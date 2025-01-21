package Partie2;

import java.util.ArrayList;
import java.util.Iterator;

public class P162 {

	
	public static void main(String[] args) {

		ArrayList 	al	 =	 new ArrayList( );
		
		al.add("Hello");
		al.add("World");
		
		for ( Iterator  it  =  al.iterator() ; it.hasNext() ; ) {
			
			Object s = it.next( ); 
			
			System.out.println(s);
		}
	}

}
