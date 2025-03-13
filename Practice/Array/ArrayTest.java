package Array;

import java.util.Arrays;

import org.o7planning.list.ex.Book;

public class ArrayTest {

    public static void main(String[] args) {

    	int[] numbers;  // Declare
    	numbers = new int[5];
    	
    	System.out.println(numbers.toString());
    	
    	int[] numbers2 = {10, 20, 30, 40, 50};

    	char[] $chars = new char[]{'a', 'b', 'C'};  // ✅ Works fine

    	
    	String[] names = new String[]{"Alice", "Bob", "Charlie"};

    	System.out.println(numbers2[0]); // Output: 10    	
    	
    	int[] original = {10, 20, 30};
    	int[] copy = Arrays.copyOf(original, 2);

    	int[] source = {1, 2, 3, 4, 5};
    	int[] destination = new int[5];

    	System.arraycopy(source, 0, destination, 0, 5);

    	int[] arr = {5, 3, 8, 1, 2};
    	Arrays.sort(arr);

    	System.out.println(Arrays.toString(arr));
    }
}
