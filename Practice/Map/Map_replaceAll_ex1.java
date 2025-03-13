package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_replaceAll_ex1 {

    public static void main(String[] args) {

        // Create Map (Employee Number --> Salary)
        Map<String, Float> empMap = new HashMap<>();
        empMap.put("E01", 1000f);
        empMap.put("E02", 2000f);
        empMap.put("E03", 1200f);
        
        // Salary update for all employees, 50% increase.
        empMap.replaceAll(
    		(empNumber, salary) -> {
    			return salary + salary * 0.5f;
    		}
		);
        // Print out:
        empMap.forEach((empNumber, salary) -> {
            System.out.println(empNumber + " --> " + salary);
        });
    }
}