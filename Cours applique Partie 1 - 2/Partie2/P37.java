package Partie2;

public class P37 {

	public static String inverseMajMin(String s){
		
		String res="";
		
		for (int i = 0 ; i < s.length() ; i++) {

			char c = s.charAt(i);
		
			if (Character.isLowerCase(c)) 		c = Character.toUpperCase(c);
		
			else if (Character.isUpperCase(c))  c = Character.toLowerCase(c);
		
			res+=c;
		}
		
		return res;
	}
	
	public static void main(String [] args){
		
		String s = "HeLlo EM yeu";
				
		System.out.println(inverseMajMin(s));
	}
}
