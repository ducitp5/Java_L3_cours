package iterable.Collection;

import java.util.ArrayList;
import java.util.List;

public class List_subList {

    public static void main(String[] args) {
        // Create a List
        List<String> originList = new ArrayList<String>();
        
        originList.add("A"); // 0
        originList.add("B"); // 1
        originList.add("C"); // 2
        originList.add("D"); // 3
        originList.add("E"); // 4
        
        List<String> subList = originList.subList(1, 3); // fromIndex .. toIndex
        
        System.out.println("Elements in subList: ");
        for(String s: subList)  {
            System.out.println(s); // B C
        }
        
        subList.clear(); // Remove all elements from subList.
        System.out.println("Elements in original List after removing all elements from subList: ");
        
        for(String s: originList)  {
            System.out.println(s); // B C
        }
    }
}