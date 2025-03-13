package Map;

import java.util.Map;

public class Map_of_ex2 {

    public static void main(String[] args) {

        // Create an unmodifiable Map:
        Map<String, Integer> empMap = Map.of(
        		
    		"E01", 1000, 
    		"E02", 2000, 
    		"E03", 1200
		);

        // Update new value.
//        empMap.put("E02", 5000); // ==> throw UnsupportedOperationException
        
        empMap.put("E05", 3000); // ==> throw UnsupportedOperationException
        
//        empMap.remove("E01");  // ==> throw UnsupportedOperationException
        
//        empMap.clear();   // ==> throw UnsupportedOperationException
        
        System.out.println("  -- " +empMap);
    }
}