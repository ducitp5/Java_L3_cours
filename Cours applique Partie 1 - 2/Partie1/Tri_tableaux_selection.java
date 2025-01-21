package Partie1;

public class Tri_tableaux_selection {

	public static void echanger(int [] tab, int i, int j){ 
		
		int tabj = tab [j]; 
		
		tab [j] = tab [i]; 		tab [i] = tabj;
	}
	
	public static int indiceDuPlusPetit(int [ ] tab,int imin,int imax){
		
		int res = imin;

		for (int i = imin+1 ; i <= imax ; i++)		
			
			if (tab[i] < tab [res]) res=i;
		
			return res;
		}
	
	public static void trier(int [ ] tab){
		
		for (int etape=1;etape<=tab.length-1;etape++){
		
			// dep est l'indice à partir duquel le plus petit élément est cherché
			int dep = etape-1;
		
			// j est l'indice du plus petit
			int j = indiceDuPlusPetit(tab,dep,tab.length-1);
		
			// permuter les éléments d'indice dep et j
			echanger(tab,dep,j);
		}
	}
	
	public static void main(String[] args) {

		int [ ] tabInt = {34,12,23,21,5};
		
		trier(tabInt);
		
	}

}
