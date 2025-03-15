package iterable.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_listIterator {

    public static void main(String[] args) {
        // Create a List
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Three");
        
        System.out.println("index of three... " +list.indexOf("Three"));

        // Get a ListIterator.
        ListIterator<String> listIterator = list.listIterator();
        
        String first = listIterator.next();
        System.out.println("First:" + first);// -->"One"
       
        String second = listIterator.next();
        System.out.println("Second:" + second);// -->"Two"
       
        if (listIterator.hasPrevious()) {
            System.out.println("Jump back...");
            String value = listIterator.previous();
            System.out.println("Value:" + value);// -->"Two"
        }
 
        System.out.println(" ----- ");
 
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            System.out.println("Value:" + value);
        }

        System.out.println(" --- END --- ");
    }
}