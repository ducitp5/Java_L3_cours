package Partie2;

import java.util.Date;

public class P39 {
	
	public static void main(String[] args) {

		Date d1 = new Date( );
		System.out.println("date actuelle : "+d1);
				
		Date d2 = new Date(0);
		System.out.println("la date de référence : "+d2);
		
		Date d3 = new Date(1000000L *1000000);
		System.out.println("1 billion de milli secondes apres le 1er janvier 1970 : "+d3);

	}

}
