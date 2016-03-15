
public class CloneTester {

//	public static void Employee("Alice", 100);
	Employee e = new Employee("Alice", 100);
	Employee f = (Employee) e.clone();
	
	Manager m = new Manager("Bob", 200);
	Manager n = (Manager) m.clone();
	
	if (m == n) {	// comparing memory addresses
		System.out.println("hello");
	}
	
	if (m.equals(n)) {
		System.out.println("true");
	}
}
