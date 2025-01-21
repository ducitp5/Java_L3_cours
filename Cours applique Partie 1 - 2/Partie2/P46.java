package Partie2;

import java.util.Date;

public class P46 {

	
	public static void main(String[] args) {
		Date d1 = new Date( );	
		Date d2 = new Date( );
		
		System.out.print(d1.after(d2));
		System.out.print (" "+d1.before(d2));
		System.out.println(" "+ d1.equals(d2));
	}

}
