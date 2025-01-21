package Partie2;

public class Test {

	void f1(int x){ f2(x);
	System.out.println("f1");}
	void f2(int x){ try { f3(x); System.out.println("f2a");} catch (Exception e){ e.printStackTrace( ); System.out.println(e);}
	System.out.println("f2b"); } void f3(int x){ try {f4(x);} finally {System.out.println("final3");} System.out.println("f3"); }
	void f4(int x){f5(x); System.out.println("f4");}
	void f5(int x){int [] t = {5};t[6]=5;}
	public static void main(String [ ] args){ Test x = new Test ( ); x.f1(4);
	System.out.println("fin du programme");
	}
}
