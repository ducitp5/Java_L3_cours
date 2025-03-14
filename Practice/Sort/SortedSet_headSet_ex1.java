package Sort;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_headSet_ex1 {

	public static void main(String[] args) {
		
		SortedSet<String> mySet = new TreeSet<String>();

		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("D");
		mySet.add("D1");
		mySet.add("E");

		// A Head Set (elements < "D1")
		SortedSet<String> headSet = mySet.headSet("D1");

		System.out.println(" -- headSet --");
		for (String s : headSet) {
			System.out.println(s);
		}
	}
}
