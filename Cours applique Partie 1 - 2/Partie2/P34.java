package Partie2;

public class P34 {

	public static int getNbOcc(String s , char c){
		
		int cpt=0 ;
		
		for (int i = 0 ; i < s.length() ; i++) 
			
			if (s.charAt(i) == c)				cpt++;
		
		return cpt;
	}
	
	public static void main(String [] args){
		
		System.out.println(getNbOcc("méthodes d'instance",'n'));
	}
}
