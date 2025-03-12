package iterable.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
    public static void main(String[] args) {
    	
    	List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.add(1, "Charlie2");

        System.out.println("First name: " + names.get(0));
        System.out.println("remove 3name: " + names.remove(3));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
