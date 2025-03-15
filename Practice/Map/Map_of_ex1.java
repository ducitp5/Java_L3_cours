package Map;

import java.util.Map;

public class Map_of_ex1 {

    public static void main(String[] args) {

        // Create an unmodifiable Map:
        Map<String, Integer> empMap = Map.of(
    		"E01", 1000, 
    		"E02", 2000, 
    		"E03", 1200
		);

        empMap.forEach((empNumber, salary) -> {
            System.out.println("Emp Number: " + empNumber + ", Salary: " + salary);
        });
    }
}