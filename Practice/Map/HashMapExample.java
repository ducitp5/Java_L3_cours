package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        System.out.println("Apple có giá trị: " + map.get("Apple"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Có chứa 'Banana' không? " + map.containsKey("Banana"));
        System.out.println("Có giá trị 20 không? " + map.containsValue(20));

        map.remove("Banana");

        System.out.println("Số phần tử còn lại: " + map.size());
    }
}
