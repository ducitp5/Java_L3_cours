package Partie2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import up5.mi.pary.term.Terminal;

public class P171 {

	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
/*
		Terminal term  =  new Terminal("utilisation des interfaces",400,400);
		
		String s = term.readString("Donner le nom d'une classe concrète qui implémente l'interface Collection\n");
		
		Class 		cl  =  Class.forName(s);
		Collection  c   =  (Collection) cl.newInstance();
		
		for (int i = 0 ; i < 5 ; i++) 		c.add(new Integer(i));
		
		if (c.contains (new Integer(3)) )		term.println("OK");
		
		term.println(c+"     "+cl.getName());
*/
		Scanner sc = new Scanner(System.in);
	     	     
	    System.out.println("Donner le nom d'une classe concrète qui implémente l'interface Collection\n");
		String s = sc.nextLine();
		
		Class 		cl  =  Class.forName(s);
		
//		ArrayList  	cl	=	new ArrayList() ;
		Collection  c   =  (Collection) cl.newInstance();
		
		for (int i = 0 ; i < 5 ; i++) 		c.add(new Integer(i));
		
		if (c.contains (new Integer(3)) )		System.out.println("OK");
		
		System.out.println(c+"     " +cl.getName());
	}

}
