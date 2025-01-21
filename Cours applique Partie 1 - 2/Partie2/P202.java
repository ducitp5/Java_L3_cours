package Partie2;

public class P202 {

	public static void main(String[] tArg) { 
		
		int[] t = {6,2,7,9,7};
	
		try {
			
			System.out.println(" début "); 
			
			int x = 10/(t[4]-t[1]);
			
			System.out.println("affectation reussie! x = :"+x); 
			
			int y = 10/(t[4]-t[2]);
			
			System.out.println("affectation reussie! y = :"+y); 
			
			int z = 10/(t[4]-t[1]);
			
			System.out.println("affectation reussie! z = :"+z); 
			
		}
	
		catch (ArithmeticException e) {
			
			System.out.println("Operation impossible "	+e);
			
		}
		
		System.out.println("FIN et finir");
	}
}
