package Partie2;

import java.util.ArrayList;

public class P183 {

	
	public static void main(String[] args) {

		ArrayList list = new ArrayList( );
		
		list.add("dupond");
		list.add("durand");
		list.add(new Integer(3));
		
		for (int i=0;i<list.size();i++){
		String s = (String) list.get(i);// erreur à l'exécution
		System.out.println(s.toUpperCase());
		}
	}

}
