package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_copyOf_ex1 {

    public static void main(String[] args) {
    	
        Map<String, Integer> map = new HashMap<>();
        
        map.put("E01", 1000);
        map.put("E02", 2000);
        map.put("E03", 1200);

        // Unmodifiable Map
        Map<String, Integer> unmodifiableMap = Map.copyOf(map);
        
        unmodifiableMap.forEach(
        		
    		(empNumber, salary) -> {
        	
    			System.out.println("Emp Number: " + empNumber + ", Salary: " + salary);
    		}
		);
    }
}