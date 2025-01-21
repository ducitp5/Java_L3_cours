package Partie2;

import java.util.Date;

public class P122 {

	public static void main(String[] args) {

		Date d = new Date( );
		System.out.println(d instanceof Date);//true
		System.out.println(d instanceof Object);//true car une Date est un Objet

		//		System.out.println(d instanceof String);//false car une date n'est pas une chaine
		Object r= new Object( );
		System.out.println(r instanceof Object);//true
		System.out.println(r instanceof Date);

	}

}
