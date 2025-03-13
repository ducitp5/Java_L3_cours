package Map;

import java.util.Map;

public class Map_ofEntry_ex1 {

    public static void main(String[] args) {

        Map.Entry<String, Integer> entry1 = Map.entry("E01", 1000);
        Map.Entry<String, Integer> entry2 = Map.entry("E02", 2000);
        Map.Entry<String, Integer> entry3 = Map.entry("E03", 1200);

        Map<String, Integer> unmodifiableMap = Map.ofEntries(entry1, entry2, entry3);
        
        unmodifiableMap.forEach((empNumber, salary) -> {
            System.out.println("Emp Number: " + empNumber + ", Salary: " + salary);
        });
    }
}