package Partie2;

public class P31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1	=	"chaiNe 1 ";
		String s2	=	"cHAine 2";
		
		System.out.println( s1.concat(s2) );
		
		System.out.println("%" +s1+ "%" +s1.trim( )+ "%");
		
		System.out.println( s1.trim( ).concat(s2) );
		
		System.out.println(s1);
		
		System.out.println( s1.replace(' ','*') );
		
		System.out.println( s1.charAt(2) );

	}

}
