package Partie1;

public class Tri_tab_insertion {
	
	public static void insererElementDansTableau(int [] tab,int i){
		
		int elementAPlacer = tab[i];
		int placeProposee= i ;
		boolean placeTrouve=false;
		
		while (! placeTrouve) {
		
			if (placeProposee==0 || tab[placeProposee-1]< elementAPlacer ) placeTrouve=true;
		
			else {	tab[placeProposee] = tab[placeProposee-1]; placeProposee--; }
		}
		
		tab[placeProposee]= elementAPlacer ;
	}
	
	
	public static void triInsertion(int [] tab){ 
		
		for (int i = 1;i< tab.length;i++) 
			
			insererElementDansTableau(tab,i);
	}

}
