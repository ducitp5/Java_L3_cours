package Sort;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx1 {

    public static void main(String[] args) {
    	
        Employee e1 = new Employee("Tom A", 5000);
        Employee e2 = new Employee("Jerry A", 1000);
        Employee e3 = new Employee("Tom B", 1000);
        Employee e4 = new Employee("Jerry B", 5000);
        Employee e5 = new Employee("Donald A", 1000);
        
        SortedSet<Employee> employees = new TreeSet<Employee>();
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        for(Employee e: employees)  {
            System.out.println(e.getSalary() + " / " + e.getFullName());
        }
    }
}