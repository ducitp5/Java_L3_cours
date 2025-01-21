package Partie2;

import java.util.TimeZone;

public class P112 {

	
	public static void main(String[] args) {

		TimeZone tGMT = TimeZone.getDefault();
		
		System.out.println("Zone horaire par defaut :"+tGMT.getID());
	}

}
