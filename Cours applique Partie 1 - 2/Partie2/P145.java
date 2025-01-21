package Partie2;

import java.util.ArrayList;

public class P145 {

	public static int sommeEntiere(ArrayList v) {
		
		int res = 0;
		
		for (int i = 0; i < v.size(); i++) {
		
			Integer n = (Integer) v.get(i);
			res += n.intValue();
		}
		return res;
	}

	public static void main(String[] args) {

		java.util.ArrayList v = new java.util.ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			
			Integer gI = new Integer(i);
			v.add(gI);
		}
		for(int i = 0; i < v.size(); i++) { 	System.out.println(v.get(i));		}

		System.out.println("somme v = "+sommeEntiere(v));
		
		
		
		ArrayList<Integer> v2 =	(ArrayList<Integer>) v.clone();
		for (int i = 0; i < v2.size(); i++) {			
			
			int s = v2.get(i).intValue();
			Integer gI = new Integer(s+s); 
			v2.set(i, gI);
		}
		
		for(int i = 0; i < v2.size(); i++) { 	System.out.println(v2.get(i));		}

		System.out.println("somme v2 = "+sommeEntiere(v2));
		
		for (int i = 0; i < v.size(); i++) {
			
			String s =  v.get(i).toString();
			Integer gI = new Integer(s+s); 
			v.set(i, gI);
		}
		
		for(int i = 0; i < v.size(); i++) { 	System.out.println(v.get(i));		}

		System.out.println("somme v = "+sommeEntiere(v));
	}

}
