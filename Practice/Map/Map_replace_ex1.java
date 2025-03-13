package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_replace_ex1 {

    public static void main(String[] args) {
    	
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("A", 1200);
        map.put("B", 1300);
        map.put("C", 1500);

        // key does not exists, no replace, return null
        Integer oldValue1 = map.replace("A1", 3000);

        // key exists!, replace!, return 1300 (old value).
        Integer oldValue2 = map.replace("B", 5000);

        // key exists!, replace!, return 1500 (old value).
        Integer oldValue3 = map.replace("C", 2000);

        System.out.println("oldValue1: " + oldValue1); // null
        System.out.println("oldValue2: " + oldValue2); // null (old value).
        System.out.println("oldValue3: " + oldValue3); // 1500 (old value).
        System.out.println("----");

        for (String key : map.keySet()) {
            System.out.println(key + " ==> " + map.get(key));
        }
        
        System.out.println("-- END --");

    }
}