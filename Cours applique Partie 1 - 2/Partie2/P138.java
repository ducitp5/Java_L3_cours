package Partie2;

import java.util.ArrayList;
import java.util.Date;

import up5.mi.pary.jc.compte.Compte;

public class P138 {

	
	public static void main(String[] args) {
	
		ArrayList 	al	 =	 new ArrayList();
		
		al.add(new Compte("Dupond",200, 0));
		al.add("une chaîne");
		al.add(new Date(0));
		
		for (int i = 0 ; i <al.size() ; i++) {
		
			String s = al.get(i).toString();

			System.out.println(s.toUpperCase());
		}
	}

}
