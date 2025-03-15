package Map;

import java.util.HashMap;
import java.util.Map;
 
public class MapEx3 {
 
    public static void main(String[] args) {
        // String employeeNumber, int salary
        Map<String, Integer> mapSalary = new HashMap<String, Integer>();
 
        mapSalary.put("E001", 1200);
        mapSalary.put("E002", 2000);
        mapSalary.put("E002", 2200);
        
        mapSalary.put(null, 1000); // Base salary
        mapSalary.put(null, 1100); // Base salary

        int value = mapSalary.get(null);
        System.out.println(value); // 1000
        
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("AA", null);
        
        Integer value1 = map.get("AA");
        System.out.println("AA ==> " + value1);
        
        boolean test = map.containsKey("AA");
        System.out.println("Contains AA? " + test); // true
        
        test = map.containsKey("BB");
        System.out.println("Contains BB? " + test); // false
    }
}