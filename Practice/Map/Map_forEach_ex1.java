package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_forEach_ex1 {
    
    public static void main(String[] args)  {
        // Data in 2021.
        // String  country ==> Integer population (Million)
        Map<String, Integer> populationMap  = new HashMap<String, Integer>();
        
        populationMap.put("Vietnam", 98);  
        populationMap.put("Phillipine", 109);
        populationMap.put("United States", 330);
        populationMap.put("Indonesia", 273);
        populationMap.put("Russia", 145);
        
        // forEach(BiConsumer):
        populationMap.forEach((country, population) -> System.out.println(country + " --> " + population));
    }  
}