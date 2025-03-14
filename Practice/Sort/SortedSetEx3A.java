package Sort;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx3A {

    public static void main(String[] args) {
    	
        Staff e1 = new Staff("Tom A", 5000);
        Staff e2 = new Staff("Tom A", 2000);
        Staff e3 = new Staff("Jerry A", 1000);
        Staff e4 = new Staff("Tom B", 1000);
        Staff e5 = new Staff("Jerry B", 5000);
        Staff e6 = new Staff("Donald A", 1000);

        // Custom Comparator.
        Comparator<Staff> comparator = (s1, s2) -> {
            float delta = s1.getSalary() - s2.getSalary();
            if (delta > 0) {
                return 1;
            } else if (delta < 0) {
                return -1;
            }
            return s1.getFullName().compareTo(s2.getFullName());
        };
        // A SortedSet with specified Comparator.
        TreeSet<Staff> employees = new TreeSet<Staff>(comparator);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        for (Staff e : employees) {
            System.out.println(e.getSalary() + "/" + e.getFullName());
        }
    }
}