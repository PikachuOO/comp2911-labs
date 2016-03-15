
public class Employee() implements Cloneable {
	
	private String name;	// immutable object
	private int salary;		// mutable primitive type
	
	public Employee(String n, int s) {
		name = n;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportException e) {
			e.printStackTrace();
			return null;
		}
	}
}


