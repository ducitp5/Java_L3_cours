package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_containsValue_ex1 {
    
    public static void main(String[] args)  {
        // String brand ==> String country
        Map<String, String> brandMap  = new HashMap<String, String>();
        
        brandMap.put("SamSung", "Korea");
        brandMap.put("LG", "Korea");
        brandMap.put("Alibaba", "China");
        brandMap.put("Toyota", "Japan");
        brandMap.put("Hyundai", "Korea");
        brandMap.put("Vinfast", "Vietnam"); // value = "Vietnam"!
        brandMap.put("Honda", "Japan");
        brandMap.put("Huwei", "China");
        
        boolean contain = brandMap.containsValue("Vietnam");
        System.out.println("Does the Map contain 'Vietnam' value? " + contain);
      
        contain = brandMap.containsValue("Thailand");
        System.out.println("Does the Map contain 'Thailand' value? " + contain);
    }  
}