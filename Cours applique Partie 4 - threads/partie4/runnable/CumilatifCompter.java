package partie4.runnable;

public class CumilatifCompter extends Thread{

	public static int compter = 0;
	public int limit;
	public String name;
	
	public CumilatifCompter(String name, int limit) {
		this.limit = limit;
		this.name = name;
	}
	
	public void run() {
		
		this.run1();
//		this.run2();
	}
	
	public void run1() {

		while(CumilatifCompter.compter < this.limit) {
			
            System.out.println(this.name + " - " + this.limit +" - " + CumilatifCompter.compter + " = CumilatifCompter.run - " + Thread.currentThread().getId());
            ++CumilatifCompter.compter;
            System.out.println(this.name + " incremented compter to: " + CumilatifCompter.compter);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void run2() {
	    while (true) {
	        synchronized (CumilatifCompter.class) { // Synchronize on the class object
	        	
	            if (CumilatifCompter.compter >= this.limit) {
	                break;
	            }
	            
	            System.out.println(this.name + " -- " + this.limit +" - " + CumilatifCompter.compter + " = CumilatifCompter.run - " + Thread.currentThread().getId());
	            ++CumilatifCompter.compter;
	            System.out.println(this.name + " -- incremented compter to: " + CumilatifCompter.compter);
	        }

	        try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	public static void main(String[] args) throws Exception {

		CumilatifCompter t1 	= new CumilatifCompter("t1" , 5);		t1.start();
		
		CumilatifCompter t2 	= new CumilatifCompter("t2" , 7);		t2.start();
		
	}
}
