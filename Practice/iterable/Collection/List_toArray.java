package iterable.Collection;

import java.util.ArrayList;
import java.util.List;

public class List_toArray {

    public static void main(String[] args) {
    	
        List<String> list = new ArrayList<String>();
        
        list.add("A"); // 0
        list.add("B"); // 1
        list.add("C"); // 2
        list.add("D"); // 3
        list.add("E"); // 4
        
        String[] array = new String[list.size()];
        
        list.toArray(array);
        
        for(String s: array)  {
            System.out.println(s);
        }
    }
}