/**
 * Created by ljcusack on 8/03/2016.
 */
public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
//        return name;
    	return this.name;		// ??
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void toString(Manager m) {
    	System.out.println("{ Name: " + m.getName() + ", Salaray: " + m.getSalary() " }");
    }
    
    public boolean equals(Employee e1, Employee e2) {
    	boolean result;
    	result = true;
    	
    	if (e1.getName() != e2.getName() ||
    			e1.getSalary() != e2.getSalary()) {
    		result = false;
    	}
    	
    	return result;
    }
    
    public clone(Employee e) {
    	return this(e.getName(), e.getSalary(), e.hireDate);
    }
}
