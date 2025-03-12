package iterable.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_sync {

    public static void main(String[] args) throws InterruptedException {
    	
        new ArrayList_sync();
    }
    
    public ArrayList_sync() throws InterruptedException {
    	
         ArrayList<String> arrayList = new ArrayList<String>();
         
         List<String> syncList = Collections.synchronizedList(arrayList);
          
         ThreadA threadA = new ThreadA(syncList);
         ThreadB threadB = new ThreadB(syncList);
         
         threadA.start();
         threadB.start();
         
//         threadA.join();
         threadB.join();
         
         for(String s: syncList)  {
             System.out.println(s);
         }
    }
    
   class ThreadA extends Thread {
	   
        private List<String> list;
       
        public ThreadA(List<String> list) {
            this.list = list;
        }
        
        @Override
        public void run() {
            for(int i= 0; i< 5; i++) {
                this.list.add("A "+ i);
            }
        }
    }
    
    class ThreadB extends Thread {
    	
        private List<String> list;
        
        public ThreadB(List<String> list) {
            this.list = list;
        }
        
        @Override
        public void run() {
            for(int i= 0; i< 5; i++) {
                this.list.add("B "+ i);
            }
        }
    }
}