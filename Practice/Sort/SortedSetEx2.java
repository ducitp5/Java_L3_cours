package Sort;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx2 {

    public static void main(String[] args) {   
    	
        SortedSet<String> flowers = new TreeSet<String>();
        
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Orchid");
        flowers.add("Carnation");
        flowers.add("Hyacinth");
        flowers.add("Peruvian");

        for(String flower: flowers)  {
            System.out.println(flower);
        }
    }  
}