package Sort;

import java.util.TreeSet;

public class SortedSet_null_element_ex1 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(9);
		Circle c4 = new Circle(7);

		// Create a SortedSet with provided Comparator.
		TreeSet<Circle> set = new TreeSet<Circle>(new CircleComparator());

		set.add(null); // Add null Element
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);

		for (Circle c : set) {
			System.out.println("Circle: " + (c == null ? null : c.getRadius()));
		}
	}
}