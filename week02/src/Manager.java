/**
 * Created by ljcusack on 8/03/2016.
 */
import java.util.Calendar;

public class Manager extends Employee {
    private Calendar hireDate;

    public Manager(String name, int salary, Calendar hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }
    
    public Calendar getHireDate() {
    	return this.hireDate;
    }
    
    public void setHireDate(Calendar hireDate) {
    	this.hireDate = hireDate;
    }
    
    public String getName() {
    	return super.getName();
    }
    
    public void setName(String name) {
    	super.setName = name;
    }
    
    public int getSalary() {
    	return super.getSalary();
    }
    
    public void setSalary(int salary) {
    	super.setSalary(salary)
    }
    
    public String toString(Manager m) {
    // 	System.out.println("{ Name: " + m.getName() + ", Salaray: " + m.getSalary() ", Hire date: " + m.getHireDate() + " }");
    	return "{ Name: " + m.getName() + ", Salaray: " + m.getSalary() ", Hire date: " + m.getHireDate() + " }";
    }
    
    public boolean equals(Object o) {
//    	boolean result;
//    	result = true;
//    	
//    	if (m1.getName() != m2.getName() ||
//    			m1.getSalary() != m2.getSalary() ||
//    			m1.getHireDate() != m2.getHireDate()) {
//    		result = false;
//    	}
//    	
//    	return result;
    }
    
    public clone(Manager m) {
//    	return this(m.getName(), m.getSalary(), m.hireDate);
        try {
     	   Manager m = (Manager) super.clone();
     
        } Catch (CloneNotSupportedException e) {
     	   e.printStackTrace();
     	   return null;
        }
    }
}
