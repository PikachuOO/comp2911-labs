/**
 * Created by ljcusack on 8/03/2016.
 */
import java.util.GregorianCalendar;

public class Manager extends Employee {
    private GregorianCalendar hireDate;

    public Manager(String name, int salary, GregorianCalendar hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }
    
    public GregorianCalendar getHireDate() {
    	return this.hireDate;
    }
    
    public void setHireDate(GregorianCalendar hireDate) {
    	this.hireDate = hireDate;
    }
    
    public String getName() {
    	return super.getName();
    }
    
    public void setName(String name) {
    	super.setName(name);
    }
    
    public int getSalary() {
    	return super.getSalary();
    }
    
    public void setSalary(int salary) {
    	super.setSalary(salary);
    }
    
    @Override
    public String toString() {
    // 	System.out.println("{ Name: " + m.getName() + ", Salaray: " + m.getSalary() ", Hire date: " + m.getHireDate() + " }");
    	return "{ Name: " + this.getName() + ", Salary: " + this.getSalary() + ", Hire date: " + this.getHireDate().getTime() + " }";

    }
    
    @Override
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

//    	if (o == null) return false;
//    	if (o == this) return true;
//    	if (o.getClass() != this.getClass()) return false;
    	if (!super.equals(o)) return false;
    	
    	Manager m = (Manager) o;
    	return this.getHireDate().equals(m.getHireDate());
    }
    
    @Override
    public Manager clone() {
//    	return this(m.getName(), m.getSalary(), m.hireDate);
    	
    	Manager m;
    	m = (Manager) super.clone();
    	if (m != null) {
    		m.hireDate = this.getHireDate();
    	}
    	return m;
    	
//        try {
//     	   Manager m;
//     	   m = (Manager) super.clone();
//     	   return m;
//     	   
//        } catch (CloneNotSupportedException e) {
//     	   e.printStackTrace();
//     	   return null;
//        }
    }
}
