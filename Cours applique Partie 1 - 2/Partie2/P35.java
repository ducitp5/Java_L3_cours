package Partie2;

public class P35 {

	public static int getNbOcc(String s,String sch){

		int cpt		=	0 ; // compte le nombre de fois que l’on trouve la sous chaine
		int from	=	0 ; // recherche à partir de l’indice zéro
		int ind; 			// indice de la sous-chaine suivante trouvée
		
		do {
			ind = s.indexOf(sch,from);
		
			if (ind != -1) 	{
				
				cpt++; 
				
				from=ind+1;
			}
		}
		while (ind != -1);
		
		return cpt;
	}
	
	public static void main(String [] args){
	
		System.out.println(getNbOcc("fgerterheryu","er"));
	}
}
