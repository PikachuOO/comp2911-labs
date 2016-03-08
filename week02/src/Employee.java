/**
 * Created by ljcusack on 8/03/2016.
 */
public class Employee implements Cloneable {
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

    public String toString(Manager m) {
    // 	System.out.println("{ Name: " + m.getName() + ", Salaray: " + m.getSalary() " }");
    	return "{ Name: " + m.getName() + ", Salaray: " + m.getSalary() " }";
    }
    
    public boolean equals(Object o) {
    // 	boolean result;
    // 	result = true;
    // 	
    // 	if (e1.getName() != e2.getName() ||
    // 			e1.getSalary() != e2.getSalary()) {
    // 		result = false;
    // 	}
    // 	
    // 	return result;
      
      if (o == null) return false;
      if (o == this) return true;
      if (this.getClass() != o.getClass()) return false;
      
    }
    
    public Employee clone() {
    // 	return this(e.getName(), e.getSalary(), e.hireDate);
       
       try {
    	   Employee e = (Employee) super.clone();
    
       } Catch (CloneNotSupportedException e) {
    	   e.printStackTrace();
    	   return null;
       }
    }
}
