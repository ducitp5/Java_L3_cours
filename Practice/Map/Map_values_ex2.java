package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_values_ex2 {
    
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
        
        Iterator<String> countryIte = countries.iterator();
        
        String country;
        
        while(countryIte.hasNext()) {
           
        	country = countryIte.next();
            
            if("China".equals(country)) {
            	
                countryIte.remove();
            }
        }
        // After remove
        for(String brand: brandMap.keySet()) {
            System.out.println(brand +" : " + brandMap.get(brand));
        }
        
        System.out.println("----");
    }  
}