package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Map_values_ex1 {
    
    public static void main(String[] args)  {
        // String brand ==> String country
        Map<String, String> brandMap  = new HashMap<String, String>();
        
        brandMap.put("SamSung", "Korea");
        brandMap.put("LG", "Korea");
        brandMap.put("Alibaba", "China");
        brandMap.put("Toyota", "Japan");
        brandMap.put("Hyundai", "Korea");
        brandMap.put("Vinfast", "Vietnam");
        brandMap.put("Honda", "Japan");
        brandMap.put("Huwei", "China");
        
        Collection<String> countries = brandMap.values();
        
        for(String country: countries)  {
            System.out.println(country);
        }
        
        System.out.println("---END---");
    }  
}