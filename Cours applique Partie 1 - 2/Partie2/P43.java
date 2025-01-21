package Partie2;

import java.util.Date;

public class P43 {

	public static void main(String[] args) { 
			
		Date date 	=	 new Date();		System.out.println("date de l'exécution :" +date); 
		
		long nbmi = date.getTime( );		System.out.println("Depuis le 1/1/70 OH GMT: "+ nbmi +" ms"); 
	
		date.setTime(nbmi + 86400 * 1000); // 86400 sec par jour 
		System.out.println("24h plus tard:" +date); 
		System.out.println("Depuis le 1/1/70 OH GMT: " +date.getTime()+ " ms");
		

	}

}
