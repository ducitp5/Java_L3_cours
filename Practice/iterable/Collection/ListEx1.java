package iterable.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {
        // Create a List
        List<String> list = new ArrayList<String>();
        
        list.add("One");
        list.add("Three");
        list.add("Four");
        
        // Insert an element at index 1
        list.add(1, "Two");
        
        for(String s: list)  {
            System.out.println(s);
        }
        
        System.out.println(" ----- ");
        // Remove an element at index 2
        list.remove(2);
        
        for(String s: list)  {
            System.out.println(s);
        }
    }
}