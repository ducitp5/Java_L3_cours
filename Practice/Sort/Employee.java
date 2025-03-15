package Sort;

public class Employee implements Comparable<Employee> {

    private String fullName;
    private float salary;

    public Employee(String name, float salary) {
        this.fullName = name;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public float getSalary() {
        return salary;
    }
    
    // Implements method of Comparable<Employee>
    @Override
    public int compareTo(Employee o) {
    	
        float delta = this.salary - o.salary;
        
        if (delta > 0) {
            return 1;
        } else if (delta < 0) {
            return -1;
        }
        return this.fullName.compareTo(o.fullName);
    }
}