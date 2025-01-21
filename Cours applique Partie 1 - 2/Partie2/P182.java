package Partie2;

import java.util.ArrayList;

public class P182 {

	
	public static void main(String[] args) {

		ArrayList list = new ArrayList( );
		list.add("dupond");
		list.add("durand");
		for (int i=0;i<list.size();i++){
		String s = (String) list.get(i);
		System.out.println(s.toUpperCase());
		}
		
		ArrayList<String> list1 = new ArrayList<String>( );
		
		list1.add("dupond 1");
		list1.add("durand 1");
		
		for (int i=0;i<list1.size();i++){
		String t = list1.get(i);// plus besoin de transtypage
		System.out.println(t.toUpperCase());
		}
	}

}
