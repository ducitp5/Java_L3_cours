package Partie2;

import java.util.Date;

public class P93 {
	
	public static void main(String[] args) {

		Date [] tDate 	=  new Date[10];
		
		tDate[5]	  	=  new Date();
		
		System.out.println(tDate[5].getClass());
		
		System.out.println(tDate.getClass());
	}

}
