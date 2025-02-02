package partie4.runnable;

public class MyTask implements Runnable {
	
    @Override
    public void run() {
    	
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task running: -- " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        
    	MyTask task = new MyTask();
        
        Thread thread = new Thread(task);
        thread.start(); 
    }
}


class Main {
	
    public static void main(String[] args) {
    
    	Runnable task = () -> {
        
    		for (int i = 1; i <= 5; i++) {
                System.out.println("Task running: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}

class Main2 {

	public static void main(String[] args) {
    
		Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
            	
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Task running: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
    }
}

class MyTask2 implements Runnable {
	
    private String name;

    MyTask2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        
    	for (int i = 1; i <= 3; i++) {
            System.out.println(name + " running: " + i);
            try {
				System.out.println(this.name +" - MyTask2.run - "  +Thread.currentThread().getId());

                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {

		System.out.println("MyTask2.main - "  +Thread.currentThread().getId());

    	Thread t1 = new Thread(new MyTask2("Thread 1"));
        Thread t2 = new Thread(new MyTask2("Thread 2"));

        t1.start();
        t2.start();
    }
}

class MyTask3{
	
    private String name;

    MyTask3(String name) {
        this.name = name;
    }

    public void run() {
        
    	for (int i = 1; i <= 3; i++) {
            System.out.println(name + " running: " + i);
            try {
				System.out.println(this.name +" - MyTask3.run - "  +Thread.currentThread().getId());

                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {

		System.out.println("MyTask3.main - "  +Thread.currentThread().getId());

    	MyTask3 t1 = new MyTask3("Thread 1");
    	MyTask3 t2 = new MyTask3("Thread 2");

        t1.run();
        t2.run();
    }
}