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

    @Override
    public String toString() {
    // 	System.out.println("{ Name: " + m.getName() + ", Salaray: " + m.getSalary() " }");
    	return "{ Name: " + this.getName() + ", Salary: " + this.getSalary() + " }";
    }
    
    @Override
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
//      if (this.getClass() != o.getClass()) return false;
      if (!(o instanceof Employee)) {
    	  System.out.println("not an instanceof");
    	  return false;
      }
      
      Employee e = (Employee) o;
//      printf("return: %d :: %d", e.getName().equals(this.name), e.getSalary() == this.salary);
      return e.getName().equals(this.name) &&
    		  e.getSalary() == this.salary;
    }
    
    @Override
    public Employee clone() {
    // 	return this(e.getName(), e.getSalary(), e.hireDate);
//       Employee e;
       
       try {
    	   Employee e;
    	   e = (Employee) super.clone();
    	   return e;
    	   
       } catch (CloneNotSupportedException e) {
    	   e.printStackTrace();
    	   return null;
       }
       
//       return e;
    }
}
