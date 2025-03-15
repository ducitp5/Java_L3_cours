package Sort;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_subSet_ex1 {

    public static void main(String[] args) {  
    	
        SortedSet<String> mySet = new TreeSet<String>();
        
        mySet.add("A");
        mySet.add("B");
        mySet.add("C");
        mySet.add("D");
        mySet.add("E");

        // A Sub Set
        SortedSet<String> subSet = mySet.subSet("B", "C1");
        
        System.out.println(" -- subSet --");
        
        for(String s: subSet)  {
            System.out.println(s);
        }
        
        subSet.add("B1");
        subSet.add("B2");
        subSet.add("B3");
        
        System.out.println(" -- subSet (after adding elements to subSet) --");
        for(String s: subSet)  {
            System.out.println(s);
        }
        
        System.out.println(" -- mySet (after adding elements to subSet) --");
        for(String s: mySet)  {
            System.out.println(s);
        }
    }
}