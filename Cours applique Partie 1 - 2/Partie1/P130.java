package Partie1;

public class P130 {

	public static int somme (int [ ] tab){
		
		int res=0;
		
		for (int i = 0; i < tab.length ; i++)		res = res + tab[i] ;
		
		return res;
		}
	
	public static void main (String [ ] args){
	
		int [ ] tabInt = {34,12,23,21,5};
		
		System.out.println(somme (tabInt) );
	}
}
