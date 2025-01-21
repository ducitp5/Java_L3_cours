package Partie2;

public class P141 {

	
	public static void main(String[] args) {

		Integer x = new Integer(6);			System.out.println(x);
		
		// pour passer de l'Integer à l'int correspondant
		
		int ix = x.intValue( );				System.out.println(ix*3);
		
		// un autre constructeur de la classe Integer
		
		Integer y = new Integer("2"+"45");		System.out.println(y);
	}

}
